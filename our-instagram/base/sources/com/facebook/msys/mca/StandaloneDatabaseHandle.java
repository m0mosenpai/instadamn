package com.facebook.msys.mca;

import X.C124935ky;
import X.InterfaceC124945kz;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public class StandaloneDatabaseHandle {
    public final NativeHolder mNativeHolder;
    public InterfaceC124945kz mNotificationCenterCallbackManager;

    private native SessionedNotificationCenter getSessionedNotificationCenterNative();

    public synchronized InterfaceC124945kz getNotificationCenterCallbackManager() {
        InterfaceC124945kz interfaceC124945kz;
        interfaceC124945kz = this.mNotificationCenterCallbackManager;
        if (interfaceC124945kz == null) {
            interfaceC124945kz = new C124935ky(getSessionedNotificationCenterNative());
            this.mNotificationCenterCallbackManager = interfaceC124945kz;
        }
        return interfaceC124945kz;
    }

    public StandaloneDatabaseHandle(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public C124935ky getSessionedNotificationCenterCallbackManager() {
        return (C124935ky) getNotificationCenterCallbackManager();
    }
}
