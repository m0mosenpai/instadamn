package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;

/* renamed from: X.AtW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24513AtW implements Runnable {
    public final /* synthetic */ AbstractServiceC201348vN A00;

    public RunnableC24513AtW(AbstractServiceC201348vN abstractServiceC201348vN) {
        this.A00 = abstractServiceC201348vN;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EffectServiceHost effectServiceHost;
        AbstractServiceC201348vN abstractServiceC201348vN = this.A00;
        if (abstractServiceC201348vN.A0a != null && (effectServiceHost = abstractServiceC201348vN.A0a) != null) {
            effectServiceHost.cleanupServices();
        }
    }
}
