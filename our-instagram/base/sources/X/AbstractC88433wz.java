package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;

/* renamed from: X.3wz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88433wz {
    public static C4CV parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C4CR c4cr = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            H2H h2h = null;
            C4CO c4co = null;
            C116725Qb c116725Qb = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT.equals(A0q)) {
                    c4cr = C4CQ.parseFromJson(c16l);
                } else if ("overflow".equals(A0q)) {
                    h2h = C4CT.parseFromJson(c16l);
                } else if ("pill".equals(A0q)) {
                    c4co = C4CL.parseFromJson(c16l);
                } else if ("ufi".equals(A0q)) {
                    c116725Qb = C4CU.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C4CV(c4cr, h2h, c4co, c116725Qb);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
