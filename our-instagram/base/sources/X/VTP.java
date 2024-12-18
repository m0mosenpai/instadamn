package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VTP {
    public static C68765Vbi parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68765Vbi c68765Vbi = new C68765Vbi();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("node".equals(AbstractC166997dE.A0s(c16l))) {
                    c68765Vbi.A00 = VTO.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68765Vbi;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
