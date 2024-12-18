package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VX7 {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.WiT, java.lang.Object] */
    public static C70863WiT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("text_size_px".equals(AbstractC166997dE.A0s(c16l))) {
                    obj.A00 = (float) c16l.A0U();
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
