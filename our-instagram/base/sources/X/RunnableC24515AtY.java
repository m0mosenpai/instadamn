package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;

/* renamed from: X.AtY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24515AtY implements Runnable {
    public final /* synthetic */ AbstractServiceC201348vN A00;

    public RunnableC24515AtY(AbstractServiceC201348vN abstractServiceC201348vN) {
        this.A00 = abstractServiceC201348vN;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractServiceC201348vN abstractServiceC201348vN = this.A00;
        AREngineController aREngineController = abstractServiceC201348vN.A0C;
        if (aREngineController != null) {
            aREngineController.releaseGl();
        }
        AbstractServiceC201348vN.A00(abstractServiceC201348vN);
        abstractServiceC201348vN.A0C = null;
        EffectServiceHost effectServiceHost = abstractServiceC201348vN.A0a;
        if (effectServiceHost != null) {
            effectServiceHost.destroy();
        }
        abstractServiceC201348vN.A0a = null;
        C23336AWf c23336AWf = abstractServiceC201348vN.A0D;
        if (c23336AWf != null) {
            c23336AWf.A00();
        }
        C23336AWf c23336AWf2 = abstractServiceC201348vN.A0D;
        if (c23336AWf2 != null) {
            c23336AWf2.A00 = null;
        }
        C23341AWl c23341AWl = abstractServiceC201348vN.A0E;
        if (c23341AWl != null) {
            c23341AWl.A00 = null;
            c23341AWl.A01.clear();
        }
        C63967Swt c63967Swt = abstractServiceC201348vN.A0F;
        if (c63967Swt != null) {
            c63967Swt.A00 = null;
        }
        abstractServiceC201348vN.A0I = null;
        abstractServiceC201348vN.A0B = null;
        abstractServiceC201348vN.A0F = null;
        abstractServiceC201348vN.A0D = null;
        abstractServiceC201348vN.A0E = null;
        abstractServiceC201348vN.A0K = C05F.A00;
    }
}
