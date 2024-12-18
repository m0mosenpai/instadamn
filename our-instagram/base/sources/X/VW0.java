package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VW0 {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Vib, java.lang.Object] */
    public static C69146Vib parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("reel".equals(A0s)) {
                    obj.A01 = AbstractC38741r6.parseFromJson(c16l);
                } else if ("viewer_count".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if ("is_hidden".equals(A0s)) {
                    obj.A02 = c16l.A0d();
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
