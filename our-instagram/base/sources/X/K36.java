package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineInstagramSyncPathIntegrator;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes8.dex */
public final class K36 extends MSGNotificationEngineInstagramSyncPathIntegrator.MSGNotificationEngineInstagramSyncPathIntegratorAsyncCallback {
    public final /* synthetic */ MSGNotificationEngineInstagramSyncPathIntegrator A00;

    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineInstagramSyncPathIntegrator.MSGNotificationEngineInstagramSyncPathIntegratorAsyncCallback
    public final void onIntegratorCreate(NativeHolder nativeHolder) {
        C14360o3.A0B(nativeHolder, 0);
        MSGNotificationEngineInstagramSyncPathIntegrator mSGNotificationEngineInstagramSyncPathIntegrator = this.A00;
        C47960LGy c47960LGy = MSGNotificationEngineInstagramSyncPathIntegrator.Companion;
        mSGNotificationEngineInstagramSyncPathIntegrator.mNativeHolder = nativeHolder;
    }

    public K36(MSGNotificationEngineInstagramSyncPathIntegrator mSGNotificationEngineInstagramSyncPathIntegrator) {
        this.A00 = mSGNotificationEngineInstagramSyncPathIntegrator;
    }
}
