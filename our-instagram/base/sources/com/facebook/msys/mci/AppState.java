package com.facebook.msys.mci;

import X.C53882dS;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes.dex */
public class AppState {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder();

    private native void notifyAppEnterBackgroundNative(NotificationCenter notificationCenter);

    private native void notifyAppEnterForegroundNative(NotificationCenter notificationCenter);

    private native void setDisableAppStatePersistenceNative(boolean z);

    private native void setRegularAppStateUpdateNative(boolean z);

    public void setDisableAppStatePersistence(boolean z) {
        setDisableAppStatePersistenceNative(false);
    }

    public void setRegularAppStateUpdate(boolean z) {
        setRegularAppStateUpdateNative(false);
    }

    static {
        C53882dS.A00();
    }

    public AppState(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public void notifyAppEnterBackground(NotificationCenter notificationCenter) {
        notifyAppEnterBackgroundNative(notificationCenter);
    }

    public void notifyAppEnterForeground(NotificationCenter notificationCenter) {
        notifyAppEnterForegroundNative(notificationCenter);
    }

    public AppState() {
        this.mNativeHolder = initNativeHolder();
    }
}
