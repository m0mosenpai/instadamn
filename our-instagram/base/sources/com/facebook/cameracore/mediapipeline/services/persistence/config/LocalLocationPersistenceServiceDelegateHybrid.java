package com.facebook.cameracore.mediapipeline.services.persistence.config;

import X.C09170dP;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.mediapipeline.services.persistence.interfaces.PersistenceServiceDelegateHybrid;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class LocalLocationPersistenceServiceDelegateHybrid extends PersistenceServiceDelegateHybrid {
    private native HybridData initHybrid(String str, ARDFileCache aRDFileCache, ARDFileCache aRDFileCache2, AndroidAsyncExecutorFactory androidAsyncExecutorFactory);

    static {
        C09170dP.A0C("arpersistenceserviceconfig");
    }

    public LocalLocationPersistenceServiceDelegateHybrid(String str, ARDFileCache aRDFileCache, ARDFileCache aRDFileCache2, AndroidAsyncExecutorFactory androidAsyncExecutorFactory) {
        this.mHybridData = initHybrid(str, aRDFileCache, aRDFileCache2, androidAsyncExecutorFactory);
    }
}
