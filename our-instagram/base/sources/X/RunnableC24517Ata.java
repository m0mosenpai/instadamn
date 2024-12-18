package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;

/* renamed from: X.Ata, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24517Ata implements Runnable {
    public final /* synthetic */ AbstractServiceC201348vN A00;

    public RunnableC24517Ata(AbstractServiceC201348vN abstractServiceC201348vN) {
        this.A00 = abstractServiceC201348vN;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractServiceC201348vN abstractServiceC201348vN = this.A00;
        EffectServiceHost effectServiceHost = abstractServiceC201348vN.A0a;
        if (effectServiceHost != null) {
            effectServiceHost.stopEffect();
        }
        EffectServiceHost effectServiceHost2 = abstractServiceC201348vN.A0a;
        if (effectServiceHost2 != null) {
            effectServiceHost2.cleanupServices();
        }
        AREngineController aREngineController = abstractServiceC201348vN.A0C;
        if (aREngineController != null) {
            aREngineController.onEffectStopped();
        }
        abstractServiceC201348vN.A0S.clear();
        abstractServiceC201348vN.A0K = C05F.A01;
    }
}
