package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F95 {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.FbT] */
    public static C34996FbT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("inapp_notification_event".equals(AbstractC166997dE.A0s(c16l))) {
                    obj.A00 = F93.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
