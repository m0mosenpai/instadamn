package X;

import com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.jni.HybridData;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class AXF implements InterfaceC179337xj {
    public final /* synthetic */ AudioServiceConfigurationHybrid A00;

    public AXF(AudioServiceConfigurationHybrid audioServiceConfigurationHybrid) {
        this.A00 = audioServiceConfigurationHybrid;
    }

    @Override // X.InterfaceC179337xj
    public final /* bridge */ /* synthetic */ void DeY(AXC axc, Object obj) {
        Object obj2;
        AudioPlatformComponentHost audioPlatformComponentHost = (AudioPlatformComponentHost) obj;
        AnonymousClass906 anonymousClass906 = this.A00.mConfiguration;
        WeakReference weakReference = anonymousClass906.A04;
        if (weakReference != null) {
            obj2 = weakReference.get();
        } else {
            obj2 = null;
        }
        if (obj2 == audioPlatformComponentHost) {
            anonymousClass906.A04 = null;
        }
        HybridData hybridData = audioPlatformComponentHost.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
        }
    }
}
