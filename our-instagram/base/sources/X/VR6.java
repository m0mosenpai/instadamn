package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VR6 {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.VIx, java.lang.Object] */
    public static VIx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68235VIv c68235VIv = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("ig.data.InAppUrlConfig".equals(AbstractC166997dE.A0s(c16l))) {
                    c68235VIv = VR4.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            obj.A00 = c68235VIv;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
