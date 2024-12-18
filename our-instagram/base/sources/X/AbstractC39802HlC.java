package X;

import java.io.IOException;

/* renamed from: X.HlC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39802HlC {
    public static C9ZB parseFromJson(C16L c16l) {
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
                A00 = AbstractC111324zv.A00(1543);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("carousel_child_index".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("thumbnail_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("carousel_child_index", c16l, A00);
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("thumbnail_url", c16l, A00);
                } else {
                    return new C9ZB(num.intValue(), str, str2);
                }
            } else {
                AbstractC166997dE.A1V("media_id", c16l, A00);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
