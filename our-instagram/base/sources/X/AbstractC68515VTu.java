package X;

import java.io.IOException;

/* renamed from: X.VTu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68515VTu {
    public static C68780Vbx parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C68780Vbx c68780Vbx = new C68780Vbx();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("uri".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c68780Vbx.A00 = A1P;
                }
                c16l.A0z();
            }
            return c68780Vbx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
