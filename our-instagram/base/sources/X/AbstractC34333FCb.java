package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.FCb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34333FCb {
    public static C35951mF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C35951mF c35951mF = new C35951mF();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_block_op".equals(A0s)) {
                    c35951mF.A03 = c16l.A0d();
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s)) {
                    c35951mF.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("analytics_params".equals(A0s)) {
                    c35951mF.A00 = FYG.parseFromJson(c16l);
                } else if ("full_name".equals(A0s)) {
                    c35951mF.A01 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC43669JTd.A01(c16l, c35951mF, A0s);
                }
                c16l.A0z();
            }
            return c35951mF;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
