package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.AbstractC166987dD;
import X.AnonymousClass904;
import X.BBV;
import X.EnumC222509rr;
import X.InterfaceC150596qC;
import X.ThreadFactoryC24937B1l;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.util.Reference;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public abstract class EffectServiceHost {
    public final InterfaceC150596qC mArExperimentUtil;
    public EffectAttribution mAttribution;
    public final Context mContext;
    public final EffectServiceHostConfig mEffectServiceHostConfig;
    public HybridData mHybridData;
    public final BBV mServiceConfigurationHybridBuilder;
    public final List mServiceModules;
    public AnonymousClass904 mServicesHostConfiguration;
    public List mServiceConfigurations = AbstractC166987dD.A1E();
    public EffectManifest mEffectManifest = new EffectManifest();
    public boolean mDestroyed = false;
    public String mProductSessionId = null;

    public EffectServiceHost(Context context, EffectServiceHostConfig effectServiceHostConfig, BBV bbv, Collection collection, String str, InterfaceC150596qC interfaceC150596qC) {
        this.mContext = context;
        this.mEffectServiceHostConfig = effectServiceHostConfig;
        this.mServiceConfigurationHybridBuilder = bbv;
        this.mServiceModules = AbstractC166987dD.A1F(collection);
        this.mArExperimentUtil = interfaceC150596qC;
    }

    private native void nativeSetCameraSensorRotation(int i);

    private native void nativeSetCurrentOptimizationMode(int i);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, long j, boolean z2, float[] fArr, float[] fArr2, float f, double d, double d2, Reference reference);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, byte[] bArr, long j, boolean z2, float[] fArr, float[] fArr2, float f, double d, double d2, Reference reference);

    public static ScheduledExecutorService newSingleBackgroundThreadScheduledExecutor(String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC24937B1l(str, 0));
    }

    public native void cleanupServices();

    public synchronized void destroy() {
        if (!this.mDestroyed) {
            this.mHybridData.resetNative();
            Iterator it = this.mServiceConfigurations.iterator();
            while (it.hasNext()) {
                ((ServiceConfiguration) it.next()).destroy();
            }
            this.mServiceConfigurations.clear();
            Iterator it2 = this.mServiceModules.iterator();
            while (it2.hasNext()) {
                ((ServiceModule) it2.next()).mHybridData.resetNative();
            }
            this.mServiceModules.clear();
            this.mDestroyed = true;
        }
    }

    public abstract AnalyticsLogger getAnalyticsLogger();

    public abstract PluginConfigProvider getEnginePluginConfigProvider();

    public native void resetServices();

    public native void stopEffect();

    public void setCurrentOptimizationMode(EnumC222509rr enumC222509rr) {
        nativeSetCurrentOptimizationMode(enumC222509rr.A00);
    }

    public void setAttribution(EffectAttribution effectAttribution) {
        this.mAttribution = effectAttribution;
    }

    public void setCameraSensorRotation(int i) {
        nativeSetCameraSensorRotation(i);
    }

    public void setManifest(EffectManifest effectManifest) {
        this.mEffectManifest = effectManifest;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateFrame(X.AXC r43, int r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost.updateFrame(X.AXC, int, boolean):void");
    }
}
