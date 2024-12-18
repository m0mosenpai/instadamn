package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.arclass.common.ARClass;
import com.facebook.cameracore.mediapipeline.arengineservices.igsandboxeffectservicehost.IgSandboxEffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces.FrameBrightnessDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerSlamFactoryProviderModule;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.WorldTrackerDataProviderConfig;

/* loaded from: classes4.dex */
public final class AWM implements InterfaceC201328vH {
    public final Context A00;
    public final C201338vK A01 = new Object();
    public final C83U A02;
    public final InterfaceC150566q9 A03;
    public final InterfaceC150596qC A04;
    public final BBY A05;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.cameracore.mediapipeline.dataproviders.slam.interfaces.SlamLibraryProvider, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.WorldTrackerDataProviderConfigWithSlam] */
    @Override // X.InterfaceC201328vH
    public final EffectServiceHost AMP(Context context) {
        C14360o3.A0B(context, 0);
        ARClass aRClass = new ARClass(0);
        WorldTrackerDataProviderConfig worldTrackerDataProviderConfig = new WorldTrackerDataProviderConfig();
        WorldTrackerSlamFactoryProviderModule worldTrackerSlamFactoryProviderModule = new WorldTrackerSlamFactoryProviderModule();
        ?? obj = new Object();
        obj.config = worldTrackerDataProviderConfig;
        obj.isARCoreEnabled = false;
        obj.useFirstframe = false;
        obj.slamFactoryProvider = worldTrackerSlamFactoryProviderModule;
        C201338vK c201338vK = this.A01;
        c201338vK.A01 = new FaceTrackerDataProviderConfig();
        c201338vK.A00 = obj;
        c201338vK.A02 = new FrameBrightnessDataProviderConfig(0, 0, 0, 7, null);
        c201338vK.A03 = new Object();
        return new IgSandboxEffectServiceHost(context, new EffectServiceHostConfig(c201338vK), this.A04, aRClass, this.A03, this.A02, this.A05);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.8vK] */
    public AWM(Context context, C83U c83u, InterfaceC150566q9 interfaceC150566q9, InterfaceC150596qC interfaceC150596qC, BBY bby) {
        this.A00 = context;
        this.A02 = c83u;
        this.A03 = interfaceC150566q9;
        this.A04 = interfaceC150596qC;
        this.A05 = bby;
    }
}
