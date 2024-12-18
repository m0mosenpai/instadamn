package X;

import java.io.IOException;

/* renamed from: X.HvD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40367HvD {
    public static H6Q parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            String str2 = null;
            Boolean bool2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_exclusive".equals(A0q)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("next_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("single_choice_answer".equals(A0q)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC37300Gc1.A1D(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new H6Q(bool, bool2, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
