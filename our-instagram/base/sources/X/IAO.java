package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IAO {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.OB7, java.lang.Object] */
    public static OB7 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("formatted_amount_raised".equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("num_supporters".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("num_badges".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("formatted_incentive_match".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("maxed_out_match_limit".equals(A0s)) {
                    c16l.A0d();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
