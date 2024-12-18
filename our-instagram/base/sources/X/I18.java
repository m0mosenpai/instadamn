package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I18 {
    /* JADX WARN: Type inference failed for: r0v6, types: [X.ICK, java.lang.Object] */
    public static ICK parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ICJ icj = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("feedback_like_event".equals(AbstractC166997dE.A0s(c16l))) {
                    icj = I17.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (icj != null) {
                obj.A00 = icj;
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
