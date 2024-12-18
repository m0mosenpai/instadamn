package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class JSI implements MRP {
    public final UserSession A00;
    public final C43632JRq A01;
    public final C42221xC A02;
    public final C41761wQ A03;
    public final C43631JRo A04;

    @Override // X.MRP
    public final boolean CLW() {
        return AbstractC25230BEn.A1Q(this.A04.CLW() ? 1 : 0);
    }

    @Override // X.MRP
    public final boolean CUG() {
        return AbstractC25230BEn.A1Q(this.A04.CUG() ? 1 : 0);
    }

    @Override // X.MRP
    public final boolean Cnw() {
        return AbstractC25230BEn.A1Q(this.A04.Cnw() ? 1 : 0);
    }

    @Override // X.MRP
    public final void EKd() {
        this.A01.EKd();
    }

    @Override // X.MRP
    public final void EdV(AbstractC46972Dl abstractC46972Dl) {
        this.A01.EdV(abstractC46972Dl);
    }

    @Override // X.MRP
    public final boolean Eia() {
        return AbstractC25230BEn.A1Q(this.A04.Eia() ? 1 : 0);
    }

    @Override // X.MRP
    public final boolean isLoading() {
        if (!this.A04.CLW() && !this.A01.isLoading()) {
            return false;
        }
        return true;
    }

    @Override // X.MRP
    public final void pause() {
        this.A01.A02 = false;
    }

    @Override // X.MRP
    public final void start() {
        this.A01.start();
        boolean A07 = AbstractC47132Ef.A00(this.A00).A07();
        C42221xC c42221xC = this.A02;
        if (!A07) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            AbstractC42051wv abstractC42051wv = c42221xC.A00;
            AbstractC150996r0 abstractC150996r0 = AbstractC142866cm.A00;
            AbstractC42141x4.A01(abstractC150996r0, "scheduler is null");
            c42221xC = new C42221xC(new XO0(abstractC42051wv, abstractC150996r0, timeUnit));
        }
        JQn.A00(c42221xC, this.A03, this, 29);
    }

    @Override // X.MRP
    public final void stop() {
        this.A01.stop();
        this.A03.A01();
    }

    public JSI(C42221xC c42221xC, UserSession userSession, C43631JRo c43631JRo, C43632JRq c43632JRq) {
        AbstractC167017dG.A1R(c43631JRo, c43632JRq);
        this.A00 = userSession;
        this.A04 = c43631JRo;
        this.A01 = c43632JRq;
        this.A02 = c42221xC;
        this.A03 = AbstractC31174DnI.A0S();
    }

    @Override // X.MRP
    public final boolean AFj(AbstractC46972Dl abstractC46972Dl, C4I3 c4i3) {
        AbstractC167017dG.A1N(abstractC46972Dl, c4i3);
        if (!this.A04.AFj(abstractC46972Dl, c4i3) && !this.A01.AFj(abstractC46972Dl, c4i3)) {
            return false;
        }
        return true;
    }

    @Override // X.MRP
    public final void AV5(AbstractC46972Dl abstractC46972Dl, C4I3 c4i3, String str) {
        AbstractC167017dG.A1P(abstractC46972Dl, c4i3);
        this.A04.AV5(abstractC46972Dl, c4i3, str);
    }

    @Override // X.MRP
    public final void Che(AbstractC46972Dl abstractC46972Dl, C4I3 c4i3) {
        AbstractC167017dG.A1N(abstractC46972Dl, c4i3);
        C43631JRo c43631JRo = this.A04;
        if (c43631JRo.AFj(abstractC46972Dl, c4i3)) {
            c43631JRo.Che(abstractC46972Dl, c4i3);
        } else {
            this.A01.Che(abstractC46972Dl, c4i3);
        }
    }
}
