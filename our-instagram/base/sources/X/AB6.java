package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AB6 {
    public final UserSession A00;

    public AB6(UserSession userSession) {
        this.A00 = userSession;
    }

    public final C9BR A00(C38321qM c38321qM, C75113Zb c75113Zb) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        C38321qM A1e = c38321qM.A1e(c75113Zb.A03);
        if (A1e == null) {
            A1e = c38321qM;
        }
        boolean A5n = A1e.A5n();
        ME4 me4 = new ME4(30, c38321qM, this, c75113Zb);
        ME4 me42 = new ME4(31, c38321qM, this, c75113Zb);
        C50364MLq c50364MLq = new C50364MLq(25, c75113Zb, c38321qM, this);
        return new C9BR(3, new C26082BgB(4, new ME4(32, c38321qM, this, c75113Zb), new C30487DbW(23, c38321qM, this, c75113Zb), c50364MLq, me4, me42), A5n);
    }
}
