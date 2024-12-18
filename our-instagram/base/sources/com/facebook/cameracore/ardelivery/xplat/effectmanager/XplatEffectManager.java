package com.facebook.cameracore.ardelivery.xplat.effectmanager;

import X.C09170dP;
import X.C14360o3;
import X.C150146pK;
import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener.OnAsyncAssetFetchCompletedListener;
import com.facebook.cameracore.ardelivery.listener.xplatimpl.CancelableTokenJNI;
import com.facebook.cameracore.ardelivery.xplat.assetmanager.XplatAssetManagerCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataFetcher;
import com.facebook.cameracore.ardelivery.xplat.cacheprovider.XplatFileCacheCreator;
import com.facebook.cameracore.ardelivery.xplat.connectioninfo.XplatDataConnectionManager;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.XplatModelMetadataFetcher;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatRemoteModelVersionFetcher;
import com.facebook.cameracore.ardelivery.xplat.models.XplatAssetIdentifier;
import com.facebook.cameracore.ardelivery.xplat.models.XplatCapabilitySupportCheckCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.models.XplatEffectLoggingInfo;
import com.facebook.cameracore.ardelivery.xplat.models.XplatEffectManagerCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.models.XplatEffectModel;
import com.facebook.cameracore.ardelivery.xplat.models.XplatModelManagerCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.models.XplatRemoteAsset;
import com.facebook.cameracore.ardelivery.xplat.models.XplatScriptingManagerCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.scripting.XplatScriptingMetadataFetcher;
import com.facebook.cameracore.ardelivery.xplat.sparkvision.SparkVisionMetadataDownloader;
import com.facebook.cameracore.logging.crashmetadatalogger.implementation.CameraARCrashMetadataLogger;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.tigon.TigonXplatService;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class XplatEffectManager {
    public static final C150146pK Companion = new Object();
    public HybridData mHybridData;
    public CameraARCrashMetadataLogger modelCrashMetadataLogger;

    public XplatEffectManager(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, String str, XplatModelMetadataFetcher xplatModelMetadataFetcher, XplatRemoteModelVersionFetcher xplatRemoteModelVersionFetcher, XplatAsyncMetadataFetcher xplatAsyncMetadataFetcher, XplatScriptingMetadataFetcher xplatScriptingMetadataFetcher, SparkVisionMetadataDownloader sparkVisionMetadataDownloader, XplatDataConnectionManager xplatDataConnectionManager, int i, XplatFeaturesConfig xplatFeaturesConfig, TigonXplatService tigonXplatService, List list, XplatFileCacheCreator xplatFileCacheCreator, long j, Map map, boolean z, boolean z2) {
        C14360o3.A0B(androidAsyncExecutorFactory, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(xplatModelMetadataFetcher, 3);
        C14360o3.A0B(xplatRemoteModelVersionFetcher, 4);
        C14360o3.A0B(xplatAsyncMetadataFetcher, 5);
        C14360o3.A0B(xplatScriptingMetadataFetcher, 6);
        C14360o3.A0B(sparkVisionMetadataDownloader, 7);
        C14360o3.A0B(xplatDataConnectionManager, 8);
        C14360o3.A0B(xplatFeaturesConfig, 10);
        C14360o3.A0B(tigonXplatService, 11);
        C14360o3.A0B(list, 12);
        C14360o3.A0B(map, 15);
        CameraARCrashMetadataLogger cameraARCrashMetadataLogger = new CameraARCrashMetadataLogger();
        this.modelCrashMetadataLogger = cameraARCrashMetadataLogger;
        this.mHybridData = initHybrid(androidAsyncExecutorFactory, str, xplatModelMetadataFetcher, xplatRemoteModelVersionFetcher, xplatAsyncMetadataFetcher, xplatScriptingMetadataFetcher, sparkVisionMetadataDownloader, xplatDataConnectionManager, i, xplatFeaturesConfig, tigonXplatService, list, xplatFileCacheCreator, j, map, z, z2, cameraARCrashMetadataLogger);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, String str, XplatModelMetadataFetcher xplatModelMetadataFetcher, XplatRemoteModelVersionFetcher xplatRemoteModelVersionFetcher, XplatAsyncMetadataFetcher xplatAsyncMetadataFetcher, XplatScriptingMetadataFetcher xplatScriptingMetadataFetcher, SparkVisionMetadataDownloader sparkVisionMetadataDownloader, XplatDataConnectionManager xplatDataConnectionManager, int i, XplatFeaturesConfig xplatFeaturesConfig, TigonXplatService tigonXplatService, List list, XplatFileCacheCreator xplatFileCacheCreator, long j, Map map, boolean z, boolean z2, CameraARCrashMetadataLogger cameraARCrashMetadataLogger);

    public final native void clearAllCaches();

    public final native CancelableTokenJNI fetchAsyncAsset(XplatRemoteAsset xplatRemoteAsset, XplatAssetManagerCompletionCallback xplatAssetManagerCompletionCallback);

    public final native CancelableTokenJNI fetchAsyncAssetByFBID(String str, String str2, XplatAssetManagerCompletionCallback xplatAssetManagerCompletionCallback);

    public final native CancelableTokenJNI fetchAsyncAssetMetadata(String str, String str2, OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener);

    public final native CancelableTokenJNI fetchLatestModels(List list, XplatEffectLoggingInfo xplatEffectLoggingInfo, boolean z, XplatModelManagerCompletionCallback xplatModelManagerCompletionCallback);

    public final native CancelableTokenJNI fetchScriptingPackage(XplatEffectLoggingInfo xplatEffectLoggingInfo, XplatScriptingManagerCompletionCallback xplatScriptingManagerCompletionCallback);

    public final native long getCurrentSizeBytes(List list);

    public final native String getLocalAssetIfCached(XplatAssetIdentifier xplatAssetIdentifier, int i);

    public final native long getMaxSizeBytes(List list, long j);

    public final native long getUnusedSizeBytes(List list, long j);

    public final native void isCapabilitySupported(int i, XplatCapabilitySupportCheckCompletionCallback xplatCapabilitySupportCheckCompletionCallback);

    public final native boolean isEffectCached(XplatRemoteAsset xplatRemoteAsset, boolean z);

    public final native boolean isEffectModelCached(int i, int i2);

    public final CancelableTokenJNI loadEffect(XplatEffectModel xplatEffectModel, XplatEffectLoggingInfo xplatEffectLoggingInfo, XplatEffectManagerCompletionCallback xplatEffectManagerCompletionCallback) {
        C14360o3.A0B(xplatEffectModel, 0);
        C14360o3.A0B(xplatEffectLoggingInfo, 1);
        C14360o3.A0B(xplatEffectManagerCompletionCallback, 2);
        this.modelCrashMetadataLogger.cleanupBreakpadData();
        return loadEffectXplat(xplatEffectModel, xplatEffectLoggingInfo, xplatEffectManagerCompletionCallback);
    }

    public final native CancelableTokenJNI loadEffectXplat(XplatEffectModel xplatEffectModel, XplatEffectLoggingInfo xplatEffectLoggingInfo, XplatEffectManagerCompletionCallback xplatEffectManagerCompletionCallback);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6pK, java.lang.Object] */
    static {
        C09170dP.A0C("ard-android-effect-manager");
    }
}
