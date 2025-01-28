import { initializeApp } from "firebase/app";
import {
    createUserWithEmailAndPassword,
    getAuth,
    signInWithEmailAndPassword,sendPasswordResetEmail
} from "firebase/auth";

const firebaseConfig = {
    apiKey: "AIzaSyB-yfvjTEkSJL3eWl9eZJoRweBYeqWkChU",
    authDomain: "healthify-4ca71.firebaseapp.com",
    projectId: "healthify-4ca71",
    storageBucket: "healthify-4ca71.firebasestorage.app",
    messagingSenderId: "99785722988",
    appId: "1:99785722988:web:e73577642f73da9b80dc49",
    measurementId: "G-FSCGXNJ0Q3"
};

const app = initializeApp(firebaseConfig);
const auth = getAuth(app);

export function addNewUser(email, password, callback) {
    createUserWithEmailAndPassword(auth, email, password)
        .then((user) => {
            callback(null,user.user.uid);
        })
        .catch((error) => {
            callback(error,null);
        });
}

export function signIn(email, password, callback) {
    signInWithEmailAndPassword(auth, email, password)
        .then((user) => {
            storeInCache(email,user.user.uid);
            callback(null);
        })
        .catch((error) => {
            callback(error);
        });
}

export function forgotPassword(email, callback) {
    sendPasswordResetEmail(auth, email)
        .then(() => {
            callback(null); // Email sent successfully
        })
        .catch((error) => {
            callback(error); // Error sending reset email
        });
}

export function signOut() {
    removeFromCache();
    auth.signOut();
}

export function getCurrentUser() {
    return auth.currentUser;
}

export function isUserSignedIn() {
    return auth.currentUser !== null;
}

function storeInCache(email,userId){
    localStorage.setItem("user", userId);
    localStorage.setItem("type", email.includes('doctor') ? 'doctor' : 'user');
}

function removeFromCache(){
    localStorage.removeItem("user");
    localStorage.removeItem("type");
}

export function getUserId(){
    return localStorage.getItem("user");
}

export function getUserType(){
    return localStorage.getItem("type");
}

