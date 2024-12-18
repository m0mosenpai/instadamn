package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Hbu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39468Hbu extends AbstractC37623GhI implements JIH {
    public final C37546Gg2 A00;
    public final C37560GgG A01;
    public final UserSession A02;
    public final InterfaceC31137Dmc A03;
    public final C19L A04;

    public C39468Hbu(UserSession userSession, C37546Gg2 c37546Gg2, InterfaceC31137Dmc interfaceC31137Dmc, C37560GgG c37560GgG, C19L c19l) {
        AbstractC167027dH.A0a(1, userSession, c37546Gg2, c37560GgG, interfaceC31137Dmc);
        this.A02 = userSession;
        this.A00 = c37546Gg2;
        this.A01 = c37560GgG;
        this.A03 = interfaceC31137Dmc;
        this.A04 = c19l;
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
        String str;
        int A03;
        C120985dq A0F;
        C38321qM c38321qM;
        JIM A05;
        C37560GgG c37560GgG = this.A01;
        C9C1 A0E = c37560GgG.A0E();
        if (A0E != null && (str = (String) AbstractC001800i.A0J(AbstractC001800i.A0X((Iterable) A0E.A01))) != null) {
            C25370BKn A04 = C37560GgG.A04(c37560GgG);
            if (A04 != null && (A05 = C37560GgG.A05(c37560GgG, A04)) != null) {
                A05.EbH(str);
            }
            C37556GgC c37556GgC = super.A02;
            if (c37556GgC != null && (A03 = c37556GgC.A03()) >= 0) {
                AbstractC37552Gg8 abstractC37552Gg8 = this.A00.A0A;
                if (A03 < abstractC37552Gg8.A0B() && (A0F = abstractC37552Gg8.A0F(A03)) != null && (c38321qM = A0F.A02) != null && AbstractC75373a4.A09(this.A02, c38321qM)) {
                    this.A03.ElR(c38321qM, str);
                    AbstractC23641Du.A05(C12L.A00.A04, new C57153PYx(this, this, (InterfaceC23621Ds) null, 20), this.A04);
                }
            }
        }
    }

    @Override // X.JIH
    public final void E1V() {
    }

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }
}
