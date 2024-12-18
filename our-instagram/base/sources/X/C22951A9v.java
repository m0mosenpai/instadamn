package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.A9v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22951A9v {
    public final InterfaceC73623Ro A00;
    public final Double A01;
    public final Double A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final C94M A05;
    public final C4QF A06;

    public C22951A9v(C73673Rt c73673Rt, UserSession userSession, Double d, Double d2) {
        this.A02 = d;
        this.A01 = d2;
        C4QF c4qf = C94H.A00(userSession).A00;
        this.A06 = c4qf;
        this.A04 = AbstractC09440dt.A01(B6L.A00);
        C94M c94m = new C94M(c4qf);
        this.A05 = c94m;
        this.A00 = new C23380AYe((C0JM) AbstractC166987dD.A17(this.A04), new C23379AYd(new C50627MWo(C16930sl.A00, A3J.A00, 4), c4qf), c94m, AbstractC166997dE.A0b(), "IG_SCROLLING_SPEED");
        this.A03 = AbstractC09440dt.A01(new C57254Pbc(23, c73673Rt, this));
    }
}
