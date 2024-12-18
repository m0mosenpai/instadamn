package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class UFL extends AbstractC52922bZ {
    public int A00;
    public boolean A01;
    public boolean A02;
    public final C2GT A03;
    public final W56 A04;
    public final XDK A05;
    public final UserSession A06;
    public final InterfaceC24731Iq A07;
    public final InterfaceC19390xP A08;
    public final C05A A09;
    public final C05A A0A;
    public final V28 A0B;
    public final V29 A0C;
    public final XDK A0D;

    public UFL(W56 w56, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A06 = userSession;
        this.A04 = w56;
        C008002u A00 = C10E.A00(C16930sl.A00);
        this.A0A = A00;
        C008002u c008002u = new C008002u(true);
        this.A09 = c008002u;
        this.A03 = AbstractC58232lf.A00(AnonymousClass191.A00, C10Q.A03(new C57176PZz(0, null), c008002u, A00));
        C24721Ip A0q = MSX.A0q();
        this.A07 = A0q;
        this.A08 = AbstractC07080Za.A03(A0q);
        V29 v29 = new V29();
        v29.A00 = 2131966082;
        this.A0C = v29;
        this.A0B = new V28();
        this.A0D = new C70782Wgv(this, 4);
        this.A05 = new C70782Wgv(this, 5);
    }

    public final void A00() {
        if (!this.A02 && !this.A01) {
            this.A02 = true;
            W56 w56 = this.A04;
            V29 v29 = this.A0C;
            String str = (String) AbstractC166997dE.A0m(v29.A01, v29.A00);
            if (str == null) {
                str = "";
            }
            V28 v28 = this.A0B;
            String str2 = (String) AbstractC166997dE.A0m(v28.A01, v28.A00);
            if (str2 == null) {
                str2 = "";
            }
            w56.A01(this.A0D, str, str2, null, String.valueOf(this.A00));
        }
    }
}
