package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;

/* renamed from: X.KpB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46930KpB {
    public static C34531jr parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34531jr c34531jr = new C34531jr();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c34531jr.A02 = A0m;
                } else if ("last_sent_message_timestamp_ms".equals(A0s)) {
                    c34531jr.A00 = c16l.A0y();
                } else if ("item_id".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c34531jr.A01 = A0m2;
                } else if ("is_message_deletion".equals(A0s)) {
                    c34531jr.A03 = c16l.A0d();
                } else if ("is_message_reaction".equals(A0s)) {
                    c34531jr.A04 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c34531jr, A0s);
                }
                c16l.A0z();
            }
            return c34531jr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
