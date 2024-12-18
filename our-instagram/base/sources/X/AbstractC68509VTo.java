package X;

import java.io.IOException;

/* renamed from: X.VTo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68509VTo {
    public static C68775Vbs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68775Vbs c68775Vbs = new C68775Vbs();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("node".equals(AbstractC166997dE.A0s(c16l))) {
                    c68775Vbs.A00 = AbstractC68508VTn.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68775Vbs;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
