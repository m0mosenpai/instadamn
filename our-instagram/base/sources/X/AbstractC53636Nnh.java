package X;

import java.util.List;

/* renamed from: X.Nnh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53636Nnh {
    public final int A00() {
        if (this instanceof C53070Ndj) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0sl] */
    public final void A01(C50602MVn c50602MVn, C53619NnQ c53619NnQ) {
        C203278yk c203278yk;
        C203298ym c203298ym;
        ?? A1E;
        C5NL A00;
        XLW A01;
        if (this instanceof C53070Ndj) {
            MXq mXq = MXq.A00;
            MXZ A002 = MXZ.A00(EnumC50657MXx.A05);
            List list = c50602MVn.A0m;
            C14360o3.A0B(list, 0);
            MXZ A003 = MXZ.A00(list);
            C203248yh c203248yh = c50602MVn.A0C;
            C8r2 c8r2 = null;
            if (c203248yh != null) {
                c8r2 = c203248yh.A01;
            }
            MXZ A004 = MXZ.A00(c8r2);
            List list2 = c50602MVn.A0j;
            C14360o3.A0B(list2, 0);
            MXZ A005 = MXZ.A00(list2);
            Object obj = c50602MVn.A0J.A02;
            if (obj == null) {
                obj = C16930sl.A00;
            }
            MXZ A006 = MXZ.A00(obj);
            String A0n = AbstractC166997dE.A0n();
            C14360o3.A0B(A0n, 0);
            c53619NnQ.A03 = AbstractC166987dD.A1J(AbstractC50640MXb.A00(new JUM(A0n), A002, A005, mXq, A006, A004, A003));
            EnumC50656MXw enumC50656MXw = EnumC50656MXw.A05;
            C14360o3.A0B(enumC50656MXw, 0);
            c53619NnQ.A01 = enumC50656MXw;
            return;
        }
        C203248yh c203248yh2 = c50602MVn.A0C;
        if (c203248yh2 == null || (c203278yk = c203248yh2.A02) == null || (c203298ym = c203278yk.A04) == null) {
            return;
        }
        List<C203318yo> list3 = c203298ym.A03;
        if (list3 == null) {
            A1E = C16930sl.A00;
        } else {
            A1E = AbstractC166987dD.A1E();
            for (C203318yo c203318yo : list3) {
                C8FC c8fc = c203318yo.A01;
                C202278x7 c202278x7 = c203318yo.A02;
                C5NM c5nm = c203318yo.A00;
                if (c5nm != null && (A00 = c5nm.A00()) != null && (A01 = AbstractC70137W6p.A01(A00, c8fc, c202278x7)) != null) {
                    A1E.add(A01);
                }
            }
        }
        c53619NnQ.A02 = A1E;
    }
}
