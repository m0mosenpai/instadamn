package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VVC {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.VJ0, java.lang.Object] */
    public static VJ0 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69134ViP c69134ViP = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("button".equals(AbstractC166997dE.A0s(c16l))) {
                    c69134ViP = VVD.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            obj.A00 = c69134ViP;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
