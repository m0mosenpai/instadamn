package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class LIV {
    public static LGW A00;
    public static LGN A01;
    public static String A02;
    public static AnonymousClass195 A03;
    public static boolean A04;
    public static final LIV A05 = new Object();
    public static final AtomicInteger A06;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.LIV] */
    static {
        LGN lgn = LGN.A01;
        A01 = lgn;
        A00 = new LGW(lgn);
        A06 = new AtomicInteger(0);
    }

    public static final void A00(String str) {
        AbstractC195978lm.A02.A01("sup:EventRepository", AnonymousClass001.A1D("Maybe Post Model Engagement Status Event -- is posting enabled: ", A04));
        if (A04) {
            A01.A01(AbstractC46576KjF.A00(new C50361MLn(str, 6)));
        }
    }

    public final void A01(MPW mpw) {
        AnonymousClass195 anonymousClass195;
        C195988ln c195988ln = AbstractC195978lm.A02;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Maybe Post Event: ");
        A1C.append(mpw);
        A1C.append(" -- is posting enabled: ");
        A1C.append(A04);
        c195988ln.A01("sup:EventRepository", A1C.toString());
        if (A04) {
            InterfaceC50385MMn CBN = mpw.CBN();
            if (CBN == EnumC46307Ked.A04) {
                InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(A03);
                C12T c12t = C12P.A00;
                A03 = AbstractC25226BEj.A1L(new PZA(mpw, A0s, 38), AnonymousClass194.A02(AnonymousClass131.A00));
            } else if (CBN == EnumC46307Ked.A03 && (anonymousClass195 = A03) != null && anonymousClass195.isActive()) {
                AbstractC25229BEm.A1R(A03);
            } else {
                A01.A01(mpw);
            }
        }
    }
}
