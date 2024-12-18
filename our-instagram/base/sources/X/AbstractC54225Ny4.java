package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;

/* renamed from: X.Ny4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54225Ny4 {
    public static OW1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            OW1 ow1 = new OW1();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC43591JPw.A00(73).equals(A0s)) {
                    ow1.A03 = c16l.A0y();
                } else if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT.equals(A0s)) {
                    ow1.A04 = AbstractC38841rG.parseFromJson(c16l);
                } else if ("container_module".equals(A0s)) {
                    ow1.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("radio_type".equals(A0s)) {
                    ow1.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("is_carousel_bumped_post".equals(A0s)) {
                    ow1.A07 = c16l.A0d();
                } else if ("feed_position".equals(A0s)) {
                    ow1.A01 = c16l.A1D();
                } else if ("carousel_index".equals(A0s)) {
                    ow1.A00 = c16l.A1D();
                } else if ("recs_position".equals(A0s)) {
                    ow1.A02 = c16l.A1D();
                } else if ("is_from_carousel_child_thread".equals(A0s)) {
                    ow1.A09 = c16l.A0d();
                } else if ("is_from_direct_channel".equals(A0s)) {
                    ow1.A0A = c16l.A0d();
                }
                c16l.A0z();
            }
            return ow1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
