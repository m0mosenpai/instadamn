package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.FYf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34870FYf {
    public static EDC parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            EDC edc = new EDC();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("flow_render_type".equals(A0s)) {
                    c16l.A1D();
                } else if ("step_name".equals(A0s)) {
                    C14360o3.A0B(AbstractC167017dG.A0m(c16l), 0);
                } else if ("nonce".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    edc.A03 = A0m;
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    edc.A04 = A0m2;
                } else if ("cni".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    edc.A02 = A0m3;
                } else if ("bloks_action".equals(A0s)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    edc.A00 = A0m4;
                } else if ("challenge_context".equals(A0s)) {
                    String A0m5 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m5, 0);
                    edc.A01 = A0m5;
                } else {
                    C55702hA.A01(c16l, edc, A0s);
                }
                c16l.A0z();
            }
            return edc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
