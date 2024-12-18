package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;

/* renamed from: X.Kpe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46959Kpe {
    public static C30311cm parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30311cm c30311cm = new C30311cm();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT.equals(A0s)) {
                    L3X parseFromJson = LC8.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c30311cm.A00 = parseFromJson;
                } else {
                    AbstractC47856LCb.A01(c16l, c30311cm, A0s);
                }
                c16l.A0z();
            }
            return c30311cm;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
