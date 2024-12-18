package com.facebook.messenger.notification.engine;

import X.AbstractC167027dH;
import X.C47960LGy;
import X.K36;
import X.LDB;
import com.facebook.msys.mca.Mailbox;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes8.dex */
public final class MSGNotificationEngineInstagramSyncPathIntegrator {
    public static final C47960LGy Companion = new Object();
    public NativeHolder mNativeHolder;

    /* loaded from: classes8.dex */
    public class MSGNotificationEngineInstagramSyncPathIntegratorAsyncCallback {
        public void onIntegratorCreate(NativeHolder nativeHolder) {
        }
    }

    /* loaded from: classes8.dex */
    public class MSGNotificationEngineOpenPathIntegratorCallback {
        public void onNotification(MSGOpenPathRenderedNotification mSGOpenPathRenderedNotification) {
        }
    }

    public static final native NativeHolder initNativeHolder(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, Mailbox mailbox, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback, boolean z);

    public static final native void initNativeHolderAsync(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, Mailbox mailbox, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback, MSGNotificationEngineInstagramSyncPathIntegratorAsyncCallback mSGNotificationEngineInstagramSyncPathIntegratorAsyncCallback, boolean z);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.LGy, java.lang.Object] */
    static {
        LDB.A00();
    }

    public MSGNotificationEngineInstagramSyncPathIntegrator(MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, Mailbox mailbox, MSGNotificationEngineOpenPathIntegratorCallback mSGNotificationEngineOpenPathIntegratorCallback, boolean z, boolean z2) {
        AbstractC167027dH.A13(mSGNotificationEngineValueProvider, mailbox, mSGNotificationEngineOpenPathIntegratorCallback);
        if (z2) {
            initNativeHolderAsync(mSGNotificationEngineValueProvider, mailbox, mSGNotificationEngineOpenPathIntegratorCallback, new K36(this), z);
        } else {
            this.mNativeHolder = initNativeHolder(mSGNotificationEngineValueProvider, mailbox, mSGNotificationEngineOpenPathIntegratorCallback, z);
        }
    }

    public MSGNotificationEngineInstagramSyncPathIntegrator(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
