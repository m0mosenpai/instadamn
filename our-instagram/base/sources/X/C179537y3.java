package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import java.lang.ref.WeakReference;

/* renamed from: X.7y3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179537y3 {
    public final /* synthetic */ C179527y2 A00;

    public C179537y3(C179527y2 c179527y2) {
        this.A00 = c179527y2;
    }

    public final AudioPlatformComponentHost A00() {
        EffectServiceHost A0D;
        AnonymousClass904 anonymousClass904;
        AnonymousClass906 anonymousClass906;
        WeakReference weakReference;
        AnonymousClass818 anonymousClass818 = this.A00.A03;
        if (anonymousClass818 != null && (A0D = anonymousClass818.A0D()) != null && (anonymousClass904 = A0D.mServicesHostConfiguration) != null && (anonymousClass906 = anonymousClass904.A06) != null && (weakReference = anonymousClass906.A04) != null) {
            return (AudioPlatformComponentHost) weakReference.get();
        }
        return null;
    }
}
