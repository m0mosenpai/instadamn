package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.FBj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34315FBj {
    public static C104024mO parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C104024mO c104024mO = new C104024mO();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("creation_time".equals(A0s)) {
                    c104024mO.A00 = c16l.A0y();
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s)) {
                    c104024mO.A03 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(3019).equals(A0s)) {
                    c104024mO.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("radio_type".equals(A0s)) {
                    c104024mO.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c104024mO;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
