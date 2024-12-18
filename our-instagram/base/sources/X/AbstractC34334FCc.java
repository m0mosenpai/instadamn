package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.FCc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34334FCc {
    public static C36071mR parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C36071mR c36071mR = new C36071mR();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s)) {
                    c36071mR.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("full_name".equals(A0s)) {
                    c36071mR.A02 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31186DnV.A00().equals(A0s)) {
                    c36071mR.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("block_operation_type".equals(A0s)) {
                    c36071mR.A00 = c16l.A1D();
                } else if ("analytics_params".equals(A0s)) {
                    c36071mR.A01 = FYG.parseFromJson(c16l);
                } else {
                    AbstractC43669JTd.A01(c16l, c36071mR, A0s);
                }
                c16l.A0z();
            }
            return c36071mR;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
