package X;

import java.io.IOException;

/* renamed from: X.4cq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC99244cq {
    public static UQu parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Integer num = null;
            Boolean bool3 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC43591JPw.A00(326);
                if (A1J == c16r) {
                    break;
                }
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("can_hush".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("can_unhush".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if (A00.equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("is_post_covered".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("can_hush", "HushInfoImpl");
            } else if (bool2 != null || !(c16l instanceof C07950bF)) {
                if (num == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(A00, "HushInfoImpl");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_post_covered", "HushInfoImpl");
                } else {
                    return new UQu(num.intValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("can_unhush", "HushInfoImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
