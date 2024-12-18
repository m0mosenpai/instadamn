package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;

/* renamed from: X.F2g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34078F2g {
    public static C34191jJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34191jJ c34191jJ = new C34191jJ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("token_ent_id_string".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c34191jJ.A02 = A0m;
                } else if ("thread_key_string".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c34191jJ.A01 = A0m2;
                } else if ("user_action_type".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c34191jJ.A03 = A0m3;
                } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A0s)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    c34191jJ.A00 = A0m4;
                } else {
                    AbstractC43669JTd.A01(c16l, c34191jJ, A0s);
                }
                c16l.A0z();
            }
            return c34191jJ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
