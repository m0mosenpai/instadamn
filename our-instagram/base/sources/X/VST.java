package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VST {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.6RO, X.9kD, java.lang.Object] */
    public static C217809kD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("timestamp_ms".equals(A0s)) {
                    obj.A00 = c16l.A0y();
                } else {
                    ADU.A01(c16l, obj, A0s);
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
