package X;

import java.io.IOException;

/* renamed from: X.VWo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68587VWo {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.6Rv, java.lang.Object] */
    public static C139146Rv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("action_x".equals(A0s)) {
                    obj.A00 = (float) c16l.A0U();
                } else if ("action_y".equals(A0s)) {
                    obj.A01 = (float) c16l.A0U();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
