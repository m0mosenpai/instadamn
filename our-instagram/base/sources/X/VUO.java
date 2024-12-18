package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VUO {
    public static C68800VcH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68800VcH c68800VcH = new C68800VcH();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("image".equals(AbstractC166997dE.A0s(c16l))) {
                    c68800VcH.A00 = VUN.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68800VcH;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
