package X;

import java.io.IOException;

/* renamed from: X.VTi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68503VTi {
    public static C68770Vbn parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68770Vbn c68770Vbn = new C68770Vbn();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("organic".equals(AbstractC166997dE.A0s(c16l))) {
                    c68770Vbn.A00 = AbstractC68502VTh.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68770Vbn;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
