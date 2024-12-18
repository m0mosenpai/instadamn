package com.facebook.messenger.notification.engine;

import X.AbstractC167017dG;
import X.C14360o3;
import X.LAY;
import X.LDB;
import com.facebook.msys.mca.Mailbox;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes8.dex */
public final class MSGNotificationEngineSyncPathIntegrator {
    public static final LAY Companion = new Object();
    public NativeHolder mNativeHolder;

    /* loaded from: classes8.dex */
    public class MSGNotificationEngineOpenPathIntegratorCallback {
        public void onNotification(MSGOpenPathRenderedNotification mSGOpenPathRenderedNotification) {
        }
    }

    public static final native NativeHolder initNativeHolder(boolean z, boolean z2, boolean z3, MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, Mailbox mailbox, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.LAY, java.lang.Object] */
    static {
        LDB.A00();
    }

    public MSGNotificationEngineSyncPathIntegrator(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public MSGNotificationEngineSyncPathIntegrator(boolean z, boolean z2, boolean z3, MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, Mailbox mailbox, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback) {
        C14360o3.A0B(mSGNotificationEngineValueProvider, 4);
        AbstractC167017dG.A1T(mailbox, mSGNotificationEngineOpenPathIntegratorCallback);
        this.mNativeHolder = initNativeHolder(z, z2, z3, mSGNotificationEngineValueProvider, mailbox, mSGNotificationEngineOpenPathIntegratorCallback);
    }
}
