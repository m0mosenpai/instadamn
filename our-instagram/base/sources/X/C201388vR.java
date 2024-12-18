package X;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.AsyncAssetFetcher;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.componentsynclistener.interfaces.ComponentSyncListener;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.gputimer.GPUTimerImpl;
import com.facebook.hybridlogsink.HybridLogSink;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.8vR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201388vR implements InterfaceC201368vP {
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public InterfaceC201328vH A06;
    public AREngineController A07;
    public final Context A08;
    public final AssetManager A09;
    public final AndroidAsyncExecutorFactory A0A;
    public final AndroidAsyncExecutorFactory A0B;
    public final C201308vE A0C;
    public volatile EffectServiceHost A0D;
    public GPUTimerImpl A01 = null;
    public int A00 = -1;

    public static synchronized AREngineController A00(C201388vR c201388vR) {
        AREngineController aREngineController;
        synchronized (c201388vR) {
            aREngineController = c201388vR.A07;
            if (aREngineController == null) {
                aREngineController = new AREngineController(c201388vR.A09, c201388vR.A0A, c201388vR.A0B, c201388vR.B0d().getEnginePluginConfigProvider());
                c201388vR.A07 = aREngineController;
            }
        }
        return aREngineController;
    }

    public static synchronized void A01(C201388vR c201388vR) {
        synchronized (c201388vR) {
            if (c201388vR.A0D != null) {
                c201388vR.A0D.destroy();
                c201388vR.A0D = null;
            }
        }
    }

    @Override // X.InterfaceC201368vP
    public final synchronized void AHT() {
        if (this.A0D != null) {
            this.A0D.cleanupServices();
        }
    }

    @Override // X.InterfaceC201368vP
    public final synchronized void EGq() {
        A00(this).setupServiceHost(B0d());
        AREngineController A00 = A00(this);
        C201308vE c201308vE = this.A0C;
        if (A00.renderSessionInit(c201308vE.A04, c201308vE.A01, 0, this.A01, (HybridLogSink) null, false)) {
            A00.updatePerSessionDebugConfiguration(c201308vE.A00, false, c201308vE.A02, c201308vE.A03);
        }
    }

    @Override // X.InterfaceC201368vP
    public final synchronized void EGs() {
        A00(this).releaseGl();
        A01(this);
    }

    @Override // X.InterfaceC201368vP
    public final void ETd(AsyncAssetFetcher asyncAssetFetcher, ProductFeatureConfig productFeatureConfig, EnumC150616qF enumC150616qF, ComponentSyncListener componentSyncListener, C201528vh c201528vh, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z) {
        A00(this).setEffect(str, str2, str3, str4, str5, enumC150616qF.A00, str6, true, asyncAssetFetcher.getAsyncAssets(), list, productFeatureConfig, asyncAssetFetcher, null, c201528vh.A00.A00);
        A00(this).updatePerEffectDebugConfiguration(false, false, false, false);
    }

    @Override // X.InterfaceC201368vP
    public final synchronized void EoW() {
        if (this.A0D != null) {
            this.A0D.stopEffect();
            this.A0D.cleanupServices();
        }
        AREngineController aREngineController = this.A07;
        if (aREngineController != null) {
            aREngineController.onEffectStopped();
        }
    }

    @Override // X.InterfaceC201368vP
    public final synchronized boolean AQ2(C201528vh c201528vh, Integer num, float[] fArr, float[] fArr2, float[] fArr3, long j, long j2, boolean z) {
        int i;
        boolean doFrame;
        GPUTimerImpl gPUTimerImpl = this.A01;
        if (gPUTimerImpl != null) {
            gPUTimerImpl.beginMarker(this.A00);
        }
        AREngineController A00 = A00(this);
        int i2 = this.A02;
        int i3 = this.A04;
        int i4 = this.A05;
        int i5 = this.A03;
        long j3 = j * 1000;
        int i6 = c201528vh.A00.A00;
        int A002 = ADA.A00(c201528vh.A01);
        if (num.intValue() != 0) {
            i = 1;
        } else {
            i = 0;
        }
        doFrame = A00.doFrame(i2, i3, i4, i5, fArr, fArr2, fArr3, j3, j2, i6, A002, z, i);
        GPUTimerImpl gPUTimerImpl2 = this.A01;
        if (gPUTimerImpl2 != null) {
            gPUTimerImpl2.endMarker();
        }
        return doFrame;
    }

    @Override // X.InterfaceC201368vP
    public final EffectServiceHost B0d() {
        if (this.A0D == null) {
            synchronized (this) {
                if (this.A0D == null) {
                    this.A0D = this.A06.AMP(this.A08.getApplicationContext());
                }
            }
        }
        return this.A0D;
    }

    @Override // X.InterfaceC201368vP
    public final boolean CKs() {
        if (this.A0D == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC201368vP
    public final void EQx(int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A03 = i4;
    }

    public C201388vR(Context context, InterfaceC201328vH interfaceC201328vH, C201308vE c201308vE, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        this.A0C = c201308vE;
        this.A08 = context;
        this.A09 = context.getResources().getAssets();
        this.A0A = new AndroidAsyncExecutorFactory(scheduledExecutorService);
        this.A0B = new AndroidAsyncExecutorFactory(scheduledExecutorService2);
        this.A06 = interfaceC201328vH;
    }

    @Override // X.InterfaceC201368vP
    public final List ANB(AnonymousClass904 anonymousClass904) {
        EffectServiceHost B0d = B0d();
        Iterator it = B0d.mServiceConfigurations.iterator();
        while (it.hasNext()) {
            ((ServiceConfiguration) it.next()).destroy();
        }
        B0d.mServiceConfigurations.clear();
        B0d.mServicesHostConfiguration = anonymousClass904;
        B0d.mServiceConfigurations = B0d.mServiceConfigurationHybridBuilder.AEi(anonymousClass904);
        Iterator it2 = B0d.mServiceModules.iterator();
        while (it2.hasNext()) {
            ServiceConfiguration createConfiguration = ((ServiceModule) it2.next()).createConfiguration(anonymousClass904);
            if (createConfiguration != null) {
                B0d.mServiceConfigurations.add(createConfiguration);
            }
        }
        return B0d.mServiceConfigurations;
    }

    @Override // X.InterfaceC201368vP
    public final AnalyticsLogger Abc() {
        return B0d().getAnalyticsLogger();
    }

    @Override // X.InterfaceC201368vP
    public final int B4A() {
        return A00(this).getFacesCount();
    }

    @Override // X.InterfaceC201368vP
    public final EffectManifest BPZ() {
        return B0d().mEffectManifest;
    }

    @Override // X.InterfaceC201368vP
    public final void EGt(int i, int i2) {
        A00(this).resize(i, i2);
    }

    @Override // X.InterfaceC201368vP
    public final void EKQ() {
        A00(this).resetCurrentEffect();
    }

    @Override // X.InterfaceC201368vP
    public final void EQq(int i) {
        A00(this).setCameraFacing(i);
    }

    @Override // X.InterfaceC201368vP
    public final void Eho(int i, int i2, int i3, int i4, boolean z) {
        A00(this).setupImageSourceFacet(i, i2, i3, i4, z);
    }

    @Override // X.InterfaceC201368vP
    public final void FB3(AXC axc, int i, boolean z) {
        B0d().updateFrame(axc, i, z);
    }

    public final void finalize() {
        A01(this);
    }
}
