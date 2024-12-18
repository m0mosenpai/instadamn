package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public final class ITA {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1um, X.HAp, X.1ul] */
    public static C38893HAp parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("fundraiser_id".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("fundraiser_title".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("has_active_fundraiser".equals(A0s)) {
                    c40791um.A03 = c16l.A0d();
                } else if (!"beneficiary_username".equals(A0s) && !"formatted_goal_amount".equals(A0s)) {
                    if ("formatted_fundraiser_progress_info_text".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("percent_raised".equals(A0s)) {
                        c40791um.A00 = c16l.A1D();
                    } else if ("thumbnail_display_url".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                } else {
                    c16l.A0d();
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
