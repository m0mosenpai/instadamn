package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FUQ {
    public static UQL parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            UQL uql = new UQL();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("duration_s".equals(A0s)) {
                    uql.A00 = c16l.A1D();
                } else if (AbstractC58317Pt9.A00(48).equals(A0s)) {
                    uql.A01 = c16l.A1D();
                } else if ("customized_prize_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    uql.A03 = A1P;
                }
                c16l.A0z();
            }
            return uql;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(UQL uql, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("duration_s", uql.A00);
        anonymousClass182.A0Q(AbstractC58317Pt9.A00(48), uql.A01);
        String str = uql.A03;
        if (str != null) {
            anonymousClass182.A0S("customized_prize_description", str);
        }
        anonymousClass182.A0a();
    }
}
