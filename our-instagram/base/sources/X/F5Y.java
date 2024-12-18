package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F5Y {
    public static C32821h6 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32821h6 c32821h6 = new C32821h6();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31180DnO.A1W(c16l, A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c32821h6.A00 = A0m;
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c32821h6.A01 = A0m2;
                } else {
                    AbstractC43669JTd.A01(c16l, c32821h6, A0q);
                }
                c16l.A0z();
            }
            return c32821h6;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
