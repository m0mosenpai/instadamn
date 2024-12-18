package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MUh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50576MUh extends C4A7 implements InterfaceC13000lm {
    public boolean A00;
    public final C1DV A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;
    public final C05A A04;
    public final C0UO A05;

    public final void A00(C19L c19l) {
        if (!AbstractC167007dF.A1Z(this.A03)) {
            C05A c05a = this.A04;
            do {
            } while (!c05a.AIi(c05a.getValue(), new MU9(C16930sl.A00, 1)));
        } else {
            AbstractC37302Gc3.A1W(this, c19l, 47);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C05A c05a = this.A04;
        do {
        } while (!c05a.AIi(c05a.getValue(), MUq.A00));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50576MUh(C1DV c1dv, UserSession userSession) {
        super("ActivityFeed", C4A8.A00(79542307));
        AbstractC167017dG.A1P(userSession, c1dv);
        this.A02 = userSession;
        this.A01 = c1dv;
        C008002u A00 = C10E.A00(MUq.A00);
        this.A04 = A00;
        this.A05 = AbstractC208910l.A02(A00);
        this.A03 = AbstractC09440dt.A01(new C57245PbT(this, 38));
    }
}
