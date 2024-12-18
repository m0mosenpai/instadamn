package X;

import java.io.IOException;

/* renamed from: X.5rN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC128545rN {
    public static C128555rO parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC58317Pt9.A00(282);
                if (A1J == c16r) {
                    break;
                }
                String A0q = c16l.A0q();
                c16l.A1J();
                if (A00.equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("school_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC58317Pt9.A00(958).equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(A00, "SchoolsBadgeMetadataDictImpl");
            } else if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("school_name", "SchoolsBadgeMetadataDictImpl");
            } else {
                return new C128555rO(num.intValue(), str, str2);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
