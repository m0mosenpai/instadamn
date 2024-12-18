package com.facebook.cameracore.mediapipeline.engine;

import X.AbstractC167027dH;
import X.C09170dP;
import X.C224809w5;
import X.EnumC201298vD;
import android.content.res.AssetManager;
import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.AsyncAssetFetcher;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider;
import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.componentsynclistener.interfaces.ComponentSyncListener;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.gputimer.GPUTimerImpl;
import com.facebook.hybridlogsink.HybridLogSink;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: classes4.dex */
public final class AREngineController {
    public static final C224809w5 Companion = new Object();
    public static volatile boolean isLibraryLoaded;
    public static volatile boolean isLibraryStartLoading;
    public final HybridData mHybridData;

    public static final native HybridData initHybrid(AssetManager assetManager, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, AndroidAsyncExecutorFactory androidAsyncExecutorFactory2, PluginConfigProvider pluginConfigProvider);

    private final native boolean renderSessionInit(boolean z, int i, int i2, GPUTimerImpl gPUTimerImpl, HybridLogSink hybridLogSink, boolean z2);

    public final native void cycleDebugOverlaySetup(boolean z);

    public final native boolean doFrame(int i, int i2, int i3, int i4, float[] fArr, float[] fArr2, float[] fArr3, long j, long j2, int i5, int i6, boolean z, int i7);

    public final native float getFPS();

    public final native int getFacesCount();

    public final native void onEffectStopped();

    public final native void preloadServices(List list);

    public final native void releaseGl();

    public final boolean renderSessionInit(boolean z, EnumC201298vD enumC201298vD, int i, GPUTimerImpl gPUTimerImpl, HybridLogSink hybridLogSink, boolean z2) {
        GPUTimerImpl gPUTimerImpl2 = null;
        if (gPUTimerImpl != null) {
            gPUTimerImpl2 = gPUTimerImpl;
        }
        return renderSessionInit(z, enumC201298vD.A00, i, gPUTimerImpl2, (HybridLogSink) null, z2);
    }

    public final native void resetCurrentEffect();

    public final native void resize(int i, int i2);

    public final native void setCameraFacing(int i);

    public final native void setCameraSensorRotation(int i);

    public final native void setEffect(String str, String str2, String str3, String str4, String str5, int i, String str6, boolean z, List list, List list2, ProductFeatureConfig productFeatureConfig, AsyncAssetFetcher asyncAssetFetcher, ComponentSyncListener componentSyncListener, int i2);

    public final native void setFieldOfViewRadians(float f);

    public final native void setupImageSourceFacet(int i, int i2, int i3, int i4, boolean z);

    public final native void setupServiceHost(EffectServiceHost effectServiceHost);

    public final native void updatePerEffectDebugConfiguration(boolean z, boolean z2, boolean z3, boolean z4);

    public final native void updatePerSessionDebugConfiguration(int i, boolean z, boolean z2, boolean z3);

    public AREngineController(AssetManager assetManager, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, AndroidAsyncExecutorFactory androidAsyncExecutorFactory2, PluginConfigProvider pluginConfigProvider) {
        AbstractC167027dH.A13(assetManager, androidAsyncExecutorFactory, androidAsyncExecutorFactory2);
        synchronized (Companion) {
            if (!isLibraryLoaded) {
                isLibraryStartLoading = true;
                C09170dP.A0C("filters-native-android");
                isLibraryLoaded = true;
            }
        }
        this.mHybridData = initHybrid(assetManager, androidAsyncExecutorFactory, androidAsyncExecutorFactory2, pluginConfigProvider);
    }
}
