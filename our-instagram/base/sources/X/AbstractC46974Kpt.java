package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;

/* renamed from: X.Kpt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46974Kpt {
    public static C33061hU parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33061hU c33061hU = new C33061hU();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A0s)) {
                    c33061hU.A00 = AbstractC83623o5.parseFromJson(c16l);
                } else {
                    AbstractC43669JTd.A01(c16l, c33061hU, A0s);
                }
                c16l.A0z();
            }
            return c33061hU;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
