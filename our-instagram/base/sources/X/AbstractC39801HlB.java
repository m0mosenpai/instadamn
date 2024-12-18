package X;

import java.io.IOException;

/* renamed from: X.HlB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39801HlB {
    public static H2Z parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Boolean bool = null;
            String str = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC43591JPw.A00(241);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("carousel_child_index".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("is_child_deleted".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("mentioned_child_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("carousel_child_index", c16l, A00);
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("mentioned_child_id", c16l, A00);
                } else {
                    return new H2Z(str, num.intValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("is_child_deleted", c16l, A00);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
