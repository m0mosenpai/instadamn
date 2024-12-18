package X;

import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.mediapipeline.services.persistence.config.LocalLocationPersistenceServiceDelegateHybrid;
import com.facebook.cameracore.mediapipeline.services.persistence.interfaces.PersistenceServiceDelegateHybrid;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;

/* renamed from: X.90S, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C90S implements InterfaceC1814783a {
    public final ARDFileCache A00;
    public final ARDFileCache A01;
    public final AndroidAsyncExecutorFactory A02;
    public final String A03;

    @Override // X.InterfaceC1814783a
    public final PersistenceServiceDelegateHybrid AML() {
        return new LocalLocationPersistenceServiceDelegateHybrid(this.A03, this.A00, this.A01, this.A02);
    }

    public C90S(String str, ARDFileCache aRDFileCache, ARDFileCache aRDFileCache2, AndroidAsyncExecutorFactory androidAsyncExecutorFactory) {
        this.A03 = str;
        this.A00 = aRDFileCache;
        this.A01 = aRDFileCache2;
        this.A02 = androidAsyncExecutorFactory;
    }
}
