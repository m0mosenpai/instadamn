package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I17 {
    /* JADX WARN: Type inference failed for: r0v6, types: [X.ICJ, java.lang.Object] */
    public static ICJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C41132IIx c41132IIx = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("feedback".equals(AbstractC166997dE.A0s(c16l))) {
                    c41132IIx = I19.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (c41132IIx != null) {
                obj.A00 = c41132IIx;
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
