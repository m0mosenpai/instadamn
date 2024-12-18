package com.facebook.msys.mci;

import X.C53882dS;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes.dex */
public abstract class AuthSession {
    public final NativeHolder mNativeHolder;

    /* loaded from: classes6.dex */
    public interface CompletionListener {
        void onAuthComplete(AuthData authData, RedactedString redactedString, Throwable th);
    }

    private native void exchangeTokenNative(AuthData authData, CompletionListener completionListener);

    private native void facebookLoginNative(String str, String str2, String str3, AuthData authData, CompletionListener completionListener);

    private native void facebookWorkAccountLoginNative(String str, String str2, String str3, AuthData authData, CompletionListener completionListener);

    public static native NativeHolder initNativeHolder(NetworkSession networkSession, AppInfo appInfo);

    private native void loadUserNative(AuthData authData, CompletionListener completionListener);

    private native void logOutNative(NetworkSession networkSession, AuthData authData, CompletionListener completionListener);

    private native void personalToWorkSwitchNative(String str, AuthData authData, CompletionListener completionListener);

    static {
        C53882dS.A00();
    }
}
