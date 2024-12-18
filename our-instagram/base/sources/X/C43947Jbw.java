package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Jbw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43947Jbw implements MSI {
    public final Context A00;
    public final C42201xA A01;
    public final UserSession A02;
    public final C42201xA A03;
    public final C42201xA A04;
    public final C42201xA A05;
    public final C42201xA A06;
    public final C42201xA A07;
    public final C42221xC A08;
    public final C5Fn A09;
    public final C41761wQ A0A;

    public C43947Jbw(Context context, C42221xC c42221xC, C5Fn c5Fn, UserSession userSession, AbstractC46972Dl abstractC46972Dl) {
        C14360o3.A0B(c42221xC, 4);
        this.A00 = context;
        this.A02 = userSession;
        this.A09 = c5Fn;
        this.A08 = c42221xC;
        this.A01 = AbstractC42021ws.A00();
        this.A07 = AbstractC42021ws.A01(C0eB.A00);
        this.A06 = AbstractC42021ws.A01(abstractC46972Dl);
        this.A04 = AbstractC42021ws.A01(0);
        this.A05 = AbstractC42021ws.A01(false);
        this.A03 = AbstractC42021ws.A01(true);
        this.A0A = AbstractC31174DnI.A0S();
    }

    @Override // X.MR3
    public final void AX3() {
        this.A07.accept(C0eB.A00);
    }

    @Override // X.MSI
    public final void Ecm(int i, boolean z) {
        this.A04.accept(Integer.valueOf(i));
        this.A05.accept(Boolean.valueOf(z));
    }

    @Override // X.MR3
    public final void EdV(AbstractC46972Dl abstractC46972Dl) {
        this.A06.accept(abstractC46972Dl);
    }

    @Override // X.MR3
    public final C42221xC FDh() {
        return this.A01;
    }

    @Override // X.MR3
    public final void cancel() {
        this.A0A.A01();
    }

    @Override // X.MSI
    public final void setEnabled(boolean z) {
        this.A03.accept(Boolean.valueOf(z));
    }

    @Override // X.MR3
    public final void start() {
        C42201xA c42201xA = this.A07;
        C42221xC c42221xC = this.A08;
        C42221xC A0C = this.A04.A0C();
        C42221xC A0C2 = this.A05.A0C();
        C42221xC A0C3 = this.A03.A0C();
        C42221xC A0C4 = this.A06.A0C();
        KwE kwE = new KwE(this);
        AbstractC42051wv abstractC42051wv = ((C42221xC) c42201xA).A00;
        AbstractC42051wv abstractC42051wv2 = c42221xC.A00;
        AbstractC42051wv abstractC42051wv3 = A0C.A00;
        AbstractC42051wv abstractC42051wv4 = A0C2.A00;
        AbstractC42051wv abstractC42051wv5 = A0C3.A00;
        AbstractC42051wv abstractC42051wv6 = A0C4.A00;
        C47281Kus c47281Kus = new C47281Kus(kwE);
        AbstractC42141x4.A01(abstractC42051wv, "source1 is null");
        AbstractC42141x4.A01(abstractC42051wv2, "source2 is null");
        AbstractC42141x4.A01(abstractC42051wv3, "source3 is null");
        AbstractC42141x4.A01(abstractC42051wv4, "source4 is null");
        AbstractC42141x4.A01(abstractC42051wv5, "source5 is null");
        AbstractC42141x4.A01(abstractC42051wv6, "source6 is null");
        this.A0A.A02(new C42221xC(AbstractC42051wv.A00(new C49804LzB(c47281Kus), new InterfaceC42061ww[]{abstractC42051wv, abstractC42051wv2, abstractC42051wv3, abstractC42051wv4, abstractC42051wv5, abstractC42051wv6}, AbstractC137366Kh.A00)).A0Q(this.A09, TimeUnit.MILLISECONDS, 500L), this.A01);
    }
}
