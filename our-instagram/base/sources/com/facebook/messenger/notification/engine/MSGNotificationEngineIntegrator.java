package com.facebook.messenger.notification.engine;

import X.LAX;
import X.LDB;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.DatabaseConnection;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes8.dex */
public final class MSGNotificationEngineIntegrator {
    public static final LAX Companion = new Object();
    public NativeHolder mNativeHolder;

    /* loaded from: classes8.dex */
    public class MSGNotificationEngineIntegratorCallback {
        public void onNotification(MSGRenderedNotification mSGRenderedNotification) {
        }
    }

    public static final native NativeHolder initNativeHolder(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, NotificationCenter notificationCenter, DatabaseConnection databaseConnection, Mailbox mailbox, MSGNotificationEngineIntegratorCallback mSGNotificationEngineIntegratorCallback);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.LAX, java.lang.Object] */
    static {
        LDB.A00();
    }

    public MSGNotificationEngineIntegrator(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
