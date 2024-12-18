package com.facebook.cameracore.mediapipeline.arengineservices.igeffectservicehost;

import X.C14360o3;
import X.C224819w6;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arclass.benchmark.interfaces.IARClassBenchmark;
import com.facebook.cameracore.mediapipeline.arclass.common.ARClass;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider;
import com.facebook.cameracore.mediapipeline.engine.provider.ig4a.IgPluginConfigProvider;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.jni.HybridData;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes4.dex */
public class IgEffectServiceHost extends EffectServiceHost {
    public static volatile boolean sIsLibraryLoaded;
    public IARClassBenchmark mARClassBenchmark;
    public ARExperimentConfig mARExperimentConfig;
    public AnalyticsLogger mAnalyticsLogger;
    public NetworkClient mNetworkClient;
    public final UserSession mUserSession;

    private native HybridData initHybrid(EffectServiceHostConfig effectServiceHostConfig, AnalyticsLogger analyticsLogger, NetworkClient networkClient, ARExperimentConfig aRExperimentConfig, ARClass aRClass, List list, IARClassBenchmark iARClassBenchmark);

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, X.BBV] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, X.BBY] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IgEffectServiceHost(android.content.Context r22, com.instagram.common.session.UserSession r23, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig r24, X.C150586qB r25, com.facebook.cameracore.mediapipeline.arclass.common.ARClass r26, X.InterfaceC150566q9 r27, X.C83U r28) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.arengineservices.igeffectservicehost.IgEffectServiceHost.<init>(android.content.Context, com.instagram.common.session.UserSession, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig, X.6qB, com.facebook.cameracore.mediapipeline.arclass.common.ARClass, X.6q9, X.83U):void");
    }

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost
    public AnalyticsLogger getAnalyticsLogger() {
        return this.mAnalyticsLogger;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider, java.lang.Object] */
    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost
    public PluginConfigProvider getEnginePluginConfigProvider() {
        Context context = this.mContext;
        C224819w6 c224819w6 = IgPluginConfigProvider.Companion;
        C14360o3.A0B(context, 1);
        ?? obj = new Object();
        obj.mHybridData = IgPluginConfigProvider.initHybrid(context);
        return obj;
    }

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost
    public void destroy() {
        HybridData hybridData;
        super.destroy();
        HybridData hybridData2 = this.mARExperimentConfig.mHybridData;
        if (hybridData2 != null) {
            hybridData2.resetNative();
        }
        AnalyticsLogger analyticsLogger = this.mAnalyticsLogger;
        if (analyticsLogger != null) {
            AnalyticsLoggerImpl analyticsLoggerImpl = (AnalyticsLoggerImpl) analyticsLogger;
            analyticsLoggerImpl.mHybridData.resetNative();
            analyticsLoggerImpl.mCameraARAnalyticsLogger = null;
        }
        this.mAnalyticsLogger = null;
        NetworkClient networkClient = this.mNetworkClient;
        if (networkClient != null && (hybridData = networkClient.mHybridData) != null) {
            hybridData.resetNative();
        }
        this.mNetworkClient = null;
    }
}
