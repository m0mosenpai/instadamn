package X;

import java.io.IOException;

/* renamed from: X.VTs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68513VTs {
    public static C68779Vbw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68779Vbw c68779Vbw = new C68779Vbw();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("tray".equals(AbstractC166997dE.A0s(c16l))) {
                    c68779Vbw.A00 = AbstractC68512VTr.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68779Vbw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
