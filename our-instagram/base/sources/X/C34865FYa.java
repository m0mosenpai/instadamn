package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.FYa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34865FYa {
    public static EDF parseFromJson(C16L c16l) {
        String A0m;
        C14360o3.A0B(c16l, 0);
        try {
            EDF edf = new EDF();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("flow_render_type".equals(A0s)) {
                    c16l.A1D();
                } else {
                    if ("step_name".equals(A0s)) {
                        A0m = AbstractC167017dG.A0m(c16l);
                    } else if ("uri".equals(A0s)) {
                        A0m = AbstractC167017dG.A0m(c16l);
                    } else if ("nonce".equals(A0s)) {
                        String A0m2 = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m2, 0);
                        edf.A04 = A0m2;
                    } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s)) {
                        String A0m3 = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m3, 0);
                        edf.A06 = A0m3;
                    } else if ("cni".equals(A0s)) {
                        String A0m4 = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m4, 0);
                        edf.A02 = A0m4;
                    } else if ("bloks_action".equals(A0s)) {
                        String A0m5 = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m5, 0);
                        edf.A00 = A0m5;
                    } else if ("challenge_context".equals(A0s)) {
                        String A0m6 = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m6, 0);
                        edf.A01 = A0m6;
                    } else if ("autoconf_eligible".equals(A0s)) {
                        edf.A07 = c16l.A0d();
                    } else if (AbstractC43591JPw.A00(1235).equals(A0s)) {
                        String A0m7 = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m7, 0);
                        edf.A05 = A0m7;
                    } else if (AbstractC43591JPw.A00(872).equals(A0s)) {
                        String A0m8 = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m8, 0);
                        edf.A03 = A0m8;
                    } else {
                        C55702hA.A01(c16l, edf, A0s);
                    }
                    C14360o3.A0B(A0m, 0);
                }
                c16l.A0z();
            }
            return edf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
