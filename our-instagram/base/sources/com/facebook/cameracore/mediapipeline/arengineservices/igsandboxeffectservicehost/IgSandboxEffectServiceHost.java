package com.facebook.cameracore.mediapipeline.arengineservices.igsandboxeffectservicehost;

import X.C14360o3;
import X.C224819w6;
import X.C22960AAe;
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
import java.util.List;

/* loaded from: classes4.dex */
public final class IgSandboxEffectServiceHost extends EffectServiceHost {
    public static final C22960AAe Companion = new Object();
    public static volatile boolean isLibraryLoaded;
    public final AnalyticsLogger analyticsLogger;
    public final ARExperimentConfig arExperimentConfig;
    public final NetworkClient networkClient;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, X.BBV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IgSandboxEffectServiceHost(android.content.Context r18, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig r19, X.InterfaceC150596qC r20, com.facebook.cameracore.mediapipeline.arclass.common.ARClass r21, X.InterfaceC150566q9 r22, X.C83U r23, X.BBY r24) {
        /*
            r17 = this;
            r0 = 3
            r3 = r20
            r5 = r22
            X.AbstractC167007dF.A1G(r3, r0, r5)
            r4 = r23
            r2 = r24
            X.AbstractC167017dG.A1U(r4, r2)
            X.AWO r13 = new X.AWO
            r13.<init>()
            X.AAe r0 = com.facebook.cameracore.mediapipeline.arengineservices.igsandboxeffectservicehost.IgSandboxEffectServiceHost.Companion
            X.0w9 r8 = X.C0w9.A01
            r11 = r18
            r0.A00(r11)
            java.util.ArrayList r7 = X.AbstractC166987dD.A1E()
            com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerV2DataProviderModule r0 = new com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerV2DataProviderModule
            r0.<init>()
            r7.add(r0)
            com.facebook.cameracore.mediapipeline.services.graphql.implementation.GraphQLServiceModule r0 = new com.facebook.cameracore.mediapipeline.services.graphql.implementation.GraphQLServiceModule
            r0.<init>()
            r7.add(r0)
            X.AWP r1 = X.A4G.A05
            X.1Ti r0 = X.EnumC27091Ti.A0G
            X.AXI.A00(r1, r8, r0, r7)
            X.AWP r1 = X.A4G.A07
            X.1Ti r0 = X.EnumC27091Ti.A0F
            X.AXI.A00(r1, r8, r0, r7)
            X.AWP r1 = X.A4G.A03
            X.1Ti r0 = X.EnumC27091Ti.A08
            X.AXI.A00(r1, r8, r0, r7)
            X.AWP r1 = X.A4G.A01
            X.1Ti r0 = X.EnumC27091Ti.A06
            X.AXI.A00(r1, r8, r0, r7)
            X.AWP r1 = X.A4G.A04
            X.1Ti r0 = X.EnumC27091Ti.A0A
            X.AXI.A00(r1, r8, r0, r7)
            X.8zt r6 = X.C9Y4.A03
            X.1Ti r1 = X.EnumC27091Ti.A09
            X.AXI r0 = new X.AXI
            r0.<init>(r1)
            X.AWQ.A00(r6, r0, r8, r7)
            X.8zt r6 = X.C9Y4.A04
            X.1Ti r1 = X.EnumC27091Ti.A0C
            X.AXI r0 = new X.AXI
            r0.<init>(r1)
            X.AWQ.A00(r6, r0, r8, r7)
            X.AWP r1 = X.A4G.A00
            X.1Ti r0 = X.EnumC27091Ti.A05
            X.AXI.A00(r1, r8, r0, r7)
            r15 = 0
            r8 = r17
            r9 = r19
            r10 = r8
            r12 = r9
            r14 = r7
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.1XY r7 = X.C1XZ.A00
            java.lang.Integer r6 = X.C05F.A0A
            r0 = 0
            long r0 = r3.BP5(r6, r0)
            int r6 = (int) r0
            r0 = 1
            if (r6 == r0) goto Lbd
            r0 = 2
            if (r6 == r0) goto Lba
            X.6qD r0 = X.EnumC150606qD.USE_DEFAULT
        L93:
            com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl r10 = new com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl
            r10.<init>(r5, r7, r0)
            r8.analyticsLogger = r10
            X.6q9 r0 = r10.mCameraARAnalyticsLogger
            if (r0 == 0) goto La1
            r0.Edm(r4)
        La1:
            com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl r12 = new com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl
            r12.<init>(r3)
            r8.arExperimentConfig = r12
            com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl r11 = new com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl
            r11.<init>(r2)
            r8.networkClient = r11
            java.util.List r14 = r8.mServiceModules
            r13 = r21
            com.facebook.jni.HybridData r0 = r8.initHybrid(r9, r10, r11, r12, r13, r14, r15)
            r8.mHybridData = r0
            return
        Lba:
            X.6qD r0 = X.EnumC150606qD.OVERRIDE_DISABLE_OPTIMIZED
            goto L93
        Lbd:
            X.6qD r0 = X.EnumC150606qD.OVERRIDE_ENABLE_OPTIMIZED
            goto L93
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.arengineservices.igsandboxeffectservicehost.IgSandboxEffectServiceHost.<init>(android.content.Context, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig, X.6qC, com.facebook.cameracore.mediapipeline.arclass.common.ARClass, X.6q9, X.83U, X.BBY):void");
    }

    private final native HybridData initHybrid(EffectServiceHostConfig effectServiceHostConfig, AnalyticsLogger analyticsLogger, NetworkClient networkClient, ARExperimentConfig aRExperimentConfig, ARClass aRClass, List list, IARClassBenchmark iARClassBenchmark);

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost
    public void destroy() {
        HybridData hybridData = this.arExperimentConfig.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
        }
        AnalyticsLoggerImpl analyticsLoggerImpl = (AnalyticsLoggerImpl) this.analyticsLogger;
        analyticsLoggerImpl.mHybridData.resetNative();
        analyticsLoggerImpl.mCameraARAnalyticsLogger = null;
        HybridData hybridData2 = this.networkClient.mHybridData;
        if (hybridData2 != null) {
            hybridData2.resetNative();
        }
        super.destroy();
    }

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost
    public AnalyticsLogger getAnalyticsLogger() {
        return this.analyticsLogger;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider, java.lang.Object] */
    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost
    public PluginConfigProvider getEnginePluginConfigProvider() {
        C224819w6 c224819w6 = IgPluginConfigProvider.Companion;
        Context context = this.mContext;
        C14360o3.A06(context);
        ?? obj = new Object();
        obj.mHybridData = IgPluginConfigProvider.initHybrid(context);
        return obj;
    }
}
