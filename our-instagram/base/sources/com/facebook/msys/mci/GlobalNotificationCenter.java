package com.facebook.msys.mci;

import X.InterfaceC49122Nj;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes.dex */
public class GlobalNotificationCenter extends NotificationCenterInternal {
    public static GlobalNotificationCenter sInstance;

    public GlobalNotificationCenter() {
        super(false);
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public native void addObserverNative(String str, int i);

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public AccountSession getAccountSession() {
        return null;
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public native NativeHolder initNativeHolder();

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public native void postStrictNotificationNative(String str, int i);

    @Override // com.facebook.msys.mci.NotificationCenterInternal
    public native void removeObserverNative(String str);

    public synchronized void postStrictNotification(String str, int i, InterfaceC49122Nj interfaceC49122Nj) {
        try {
            postStrictNotificationNative("GMEMContextSendPingNotification", 1);
        } catch (Throwable th) {
            throw th;
        }
    }
}
