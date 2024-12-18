package com.facebook.msys.mci;

import X.AnonymousClass001;
import X.C02R;
import X.C124935ky;
import X.C2NJ;
import X.InterfaceC124945kz;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes.dex */
public class AccountSession {
    public String mInjectedMailboxType;
    public final NativeHolder mNativeHolder;
    public InterfaceC124945kz mNotificationCenterCallbackManager;
    public SessionedNotificationCenter mSessionedNotificationCenter;

    public static native AccountSession createWithAuthData(AuthData authData, int i);

    private native long getSessionedExecutionKeyNative();

    private native SessionedNotificationCenter getSessionedNotificationCenterNative();

    private native boolean nativeEquals(Object obj);

    public native AuthData getAuthData();

    public synchronized InterfaceC124945kz getNotificationCenterCallbackManager() {
        InterfaceC124945kz interfaceC124945kz;
        interfaceC124945kz = this.mNotificationCenterCallbackManager;
        if (interfaceC124945kz == null) {
            interfaceC124945kz = new C124935ky(getSessionedNotificationCenter());
            this.mNotificationCenterCallbackManager = interfaceC124945kz;
        }
        return interfaceC124945kz;
    }

    public synchronized SessionedNotificationCenter getSessionedNotificationCenter() {
        SessionedNotificationCenter sessionedNotificationCenter;
        sessionedNotificationCenter = this.mSessionedNotificationCenter;
        if (sessionedNotificationCenter == null) {
            sessionedNotificationCenter = getSessionedNotificationCenterNative();
            this.mSessionedNotificationCenter = sessionedNotificationCenter;
        }
        return sessionedNotificationCenter;
    }

    public native int getState();

    public native int hashCode();

    public native void injectNetworkSession(NetworkSession networkSession);

    public native void invalidate();

    public native boolean isValid();

    public synchronized void setInjectedMailboxType_DO_NOT_USE(String str) {
        String str2 = this.mInjectedMailboxType;
        boolean z = false;
        if (str2 == null) {
            z = true;
        }
        C02R.A07(z, AnonymousClass001.A0u("Mailbox ", str2, " is already injected into account session while injecting ", str));
        this.mInjectedMailboxType = str;
    }

    public native void setState(int i);

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AccountSession)) {
            return nativeEquals(obj);
        }
        return false;
    }

    static {
        C2NJ.A00();
    }

    public AccountSession(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public C124935ky getSessionedNotificationCenterCallbackManager() {
        return (C124935ky) getNotificationCenterCallbackManager();
    }
}
