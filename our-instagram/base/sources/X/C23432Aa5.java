package X;

import android.view.View;
import java.io.File;
import java.util.List;

/* renamed from: X.Aa5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23432Aa5 implements InterfaceC25218BDs {
    public final InterfaceC25218BDs A00;

    public final void A07(BD8 bd8, File file) {
        ACs("LiteCameraController must be initialized before taking video.");
        C180007yq c180007yq = (C180007yq) ((InterfaceC180017yr) this.A00.Aq0(InterfaceC180017yr.A00));
        if (!AbstractC166987dD.A1a(c180007yq.A09(BE1.A03, false)) && c180007yq.A00.Cav()) {
            APL.A04(bd8, AbstractC166987dD.A14("Cannot start video recording while camera is paused."));
            return;
        }
        synchronized (c180007yq.A03) {
            Integer num = c180007yq.A05;
            Integer num2 = C05F.A01;
            if (num == num2) {
                APL.A04(bd8, AbstractC166987dD.A14("Cannot start video recording. Another recording already in progress"));
            } else {
                C178307w4 c178307w4 = InterfaceC178407wE.A00;
                InterfaceC178207vu interfaceC178207vu = ((AbstractC178807ws) c180007yq).A00;
                interfaceC178207vu.getClass();
                AbstractC225239wm.A00((InterfaceC178407wE) interfaceC178207vu.Aq1(c178307w4), "OpticVideoCaptureCoordinator", AbstractC166987dD.A0M(c180007yq));
                C212659bY c212659bY = new C212659bY(c180007yq, 0);
                c180007yq.A05 = num2;
                c180007yq.A04 = bd8;
                List list = c180007yq.A02.A00;
                if (0 < list.size()) {
                    list.get(0);
                    throw AbstractC166987dD.A15("onVideoCaptureStarted");
                }
                c180007yq.A00.EoD(c212659bY, file, null);
            }
        }
    }

    public static InterfaceC179927yi A00(C23432Aa5 c23432Aa5) {
        return (InterfaceC179927yi) c23432Aa5.A00.Aq0(InterfaceC179927yi.A00);
    }

    public final View A01() {
        return ((InterfaceC179867yc) this.A00.Aq0(InterfaceC179867yc.A00)).Aqk();
    }

    public final void A02() {
        ACs("LiteCameraController must be initialized when stop recording.");
        ((InterfaceC180017yr) this.A00.Aq0(InterfaceC180017yr.A00)).Eon(false);
    }

    public final void A06(C22936A9g c22936A9g, BCQ bcq) {
        ACs("LiteCameraController must be initialized before taking photo.");
        ((InterfaceC179997yp) this.A00.Aq0(InterfaceC179997yp.A00)).Eps(c22936A9g, bcq, null);
    }

    @Override // X.InterfaceC25218BDs
    public final void ACs(String str) {
        this.A00.ACs(str);
    }

    @Override // X.InterfaceC25218BDs
    public final InterfaceC178067vf Aq0(C178087vh c178087vh) {
        return this.A00.Aq0(c178087vh);
    }

    @Override // X.InterfaceC25218BDs
    public final InterfaceC178287w2 Aq1(C178307w4 c178307w4) {
        return this.A00.Aq1(c178307w4);
    }

    @Override // X.InterfaceC25218BDs
    public final boolean CRY(C178087vh c178087vh) {
        return this.A00.CRY(c178087vh);
    }

    @Override // X.InterfaceC25218BDs
    public final boolean CRZ(C178307w4 c178307w4) {
        return this.A00.CRZ(c178307w4);
    }

    @Override // X.InterfaceC25218BDs
    public final void EKd() {
        this.A00.EKd();
    }

    @Override // X.InterfaceC25218BDs
    public final void ERx(C177257uL c177257uL, Object obj) {
        this.A00.ERx(c177257uL, obj);
    }

    @Override // X.InterfaceC25218BDs
    public final void destroy() {
        this.A00.destroy();
    }

    @Override // X.InterfaceC25218BDs
    public final void pause() {
        this.A00.pause();
    }

    public C23432Aa5(InterfaceC25218BDs interfaceC25218BDs) {
        this.A00 = interfaceC25218BDs;
        C178307w4 c178307w4 = InterfaceC178407wE.A00;
        if (interfaceC25218BDs.CRZ(c178307w4)) {
            ((InterfaceC178407wE) this.A00.Aq1(c178307w4)).EQy(3);
        }
    }

    public final void A03(int i) {
        A00(this).setInitialCameraFacing(i);
    }

    public final void A04(BDZ bdz) {
        AbstractC179917yh abstractC179917yh = (AbstractC179917yh) A00(this);
        if (bdz != null) {
            abstractC179917yh.A01.A01(bdz);
        }
    }

    public final void A05(BDZ bdz) {
        AbstractC179917yh abstractC179917yh = (AbstractC179917yh) A00(this);
        if (bdz != null) {
            abstractC179917yh.A01.A02(bdz);
        }
    }
}
