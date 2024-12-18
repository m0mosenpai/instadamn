package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A1X {
    public static C22991ABq parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C22991ABq c22991ABq = new C22991ABq();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c22991ABq.A07 = A0m;
                } else if ("capabilities".equals(A0s)) {
                    c22991ABq.A01 = c16l.A0y();
                } else if ("is_in_reels_together".equals(A0s)) {
                    c22991ABq.A08 = c16l.A0d();
                } else if ("surface_id".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c22991ABq.A06 = A0m2;
                } else if ("surface_type".equals(A0s)) {
                    c22991ABq.A00 = c16l.A1D();
                } else if ("clip_id".equals(A0s)) {
                    c22991ABq.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("mutation_id".equals(A0s)) {
                    c22991ABq.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("real_time_update_id".equals(A0s)) {
                    c22991ABq.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("publish_timestamp".equals(A0s)) {
                    c22991ABq.A04 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c22991ABq;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
