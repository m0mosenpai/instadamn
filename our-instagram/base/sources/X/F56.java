package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F56 {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.FIx, java.lang.Object] */
    public static C34511FIx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("matched_message_info".equals(A0s)) {
                    obj.A00 = F55.parseFromJson(c16l);
                } else if ("thread".equals(A0s)) {
                    obj.A01 = JV4.parseFromJson(c16l);
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
