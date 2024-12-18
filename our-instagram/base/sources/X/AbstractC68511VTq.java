package X;

import java.io.IOException;

/* renamed from: X.VTq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68511VTq {
    public static C68777Vbu parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68777Vbu c68777Vbu = new C68777Vbu();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("actions".equals(AbstractC166997dE.A0s(c16l))) {
                    c68777Vbu.A00 = AbstractC68510VTp.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68777Vbu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
