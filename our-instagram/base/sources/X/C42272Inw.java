package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Inw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42272Inw implements InterfaceC41501vz {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        String str;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(1864379993);
            C211849aB c211849aB = (C211849aB) obj;
            int A0N = AbstractC167017dG.A0N(c211849aB, -234716575);
            C42090Ikx c42090Ikx = (C42090Ikx) this.A03;
            UserSession userSession = c42090Ikx.A0A;
            if (C18U.A06(C06090Tz.A05, userSession, 36329629413556685L)) {
                C196068lw.A00(userSession).A01(c42090Ikx.A08, new C42407Iq8((C82G) this.A01, c42090Ikx, c211849aB, (Integer) this.A02, this.A04), MSV.A00(380));
            } else {
                C42090Ikx.A01((C82G) this.A01, c42090Ikx, c211849aB, (Integer) this.A02);
            }
            C0f9.A0A(1534380603, A0N);
            i = 620373194;
        } else {
            A03 = C0f9.A03(-1374338546);
            C70711Wfa c70711Wfa = (C70711Wfa) obj;
            int A032 = C0f9.A03(-208800021);
            C14360o3.A0B(c70711Wfa, 0);
            AbstractC25651Mw.A00((AbstractC12990ll) this.A03).A02(this, C70711Wfa.class);
            C6FQ c6fq = (C6FQ) this.A02;
            InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A01;
            C6FX c6fx = new C6FX();
            c6fx.A03(this.A04, 0);
            switch (c70711Wfa.A01.intValue()) {
                case 1:
                    str = "complete";
                    break;
                case 2:
                    str = "fallback";
                    break;
                default:
                    str = "closed";
                    break;
            }
            c6fx.A02(str);
            AbstractC25227BEk.A1M(c6fq, c6fx, interfaceC103384lE);
            C0f9.A0A(-1097157859, A032);
            i = -152873477;
        }
        C0f9.A0A(i, A03);
    }

    public C42272Inw(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
        this.A04 = str;
    }
}
