package X;

import java.io.IOException;

/* renamed from: X.3x3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88463x3 {
    public static C26160Bhl parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(1012);
                if (A1J == c16r) {
                    break;
                }
                String A0q = c16l.A0q();
                c16l.A1J();
                if (A00.equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("qp_id".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(A00, "ClipsNuxInfoImpl");
            } else if (l == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("qp_id", "ClipsNuxInfoImpl");
            } else {
                return new C26160Bhl(num.intValue(), l.longValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
