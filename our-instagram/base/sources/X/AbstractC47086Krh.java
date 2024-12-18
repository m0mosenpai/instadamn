package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.Krh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47086Krh {
    public static C120505cv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C120505cv c120505cv = new C120505cv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s)) {
                    c120505cv.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("pending_media_key".equals(A0s)) {
                    c120505cv.A00 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c120505cv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
