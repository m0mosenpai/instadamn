package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;

/* renamed from: X.F5a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34150F5a {
    public static C35451lR parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C35451lR c35451lR = new C35451lR();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("prompt_type".equals(A0s)) {
                    c35451lR.A00 = c16l.A1D();
                } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c35451lR.A03 = A0m;
                } else if ("prompt_id".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c35451lR.A02 = A0m2;
                } else if ("new_prompt_text".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c35451lR.A01 = A0m3;
                } else if ("trending_prompt_id".equals(A0s)) {
                    c35451lR.A04 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC43669JTd.A01(c16l, c35451lR, A0s);
                }
                c16l.A0z();
            }
            return c35451lR;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
