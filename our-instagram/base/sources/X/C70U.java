package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.70U, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C70U extends AbstractC52922bZ {
    public final C2GT A00;
    public final C70V A01;
    public final C25671My A02;

    public C70U(UserSession userSession) {
        C70V c70v = new C70V(userSession);
        final C40701ud A01 = AbstractC40691uc.A01(userSession);
        final C70W c70w = C70W.A00;
        C2GT c2gt = new C2GT(A01, c70w) { // from class: X.70X
            public C1Df A00;
            public final C40701ud A01;
            public final InterfaceC16820sZ A02;

            {
                C14360o3.A0B(A01, 1);
                C14360o3.A0B(c70w, 2);
                this.A01 = A01;
                this.A02 = c70w;
            }

            @Override // X.C2GT
            public final void A03() {
                C40701ud c40701ud = this.A01;
                C1Dk c1Dk = (C1Dk) this.A02.invoke();
                this.A00 = c40701ud.A01(new C48136LSl(this), new LT0(this), c1Dk);
            }

            @Override // X.C2GT
            public final void A04() {
                C1Df c1Df = this.A00;
                if (c1Df != null) {
                    c1Df.cancel();
                }
            }
        };
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        C14360o3.A0B(A00, 3);
        this.A01 = c70v;
        this.A00 = c2gt;
        this.A02 = A00;
    }
}
