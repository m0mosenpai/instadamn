package X;

import java.io.IOException;

/* renamed from: X.VTm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68507VTm {
    public static C68774Vbr parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68774Vbr c68774Vbr = new C68774Vbr();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("organic".equals(AbstractC166997dE.A0s(c16l))) {
                    c68774Vbr.A00 = AbstractC68506VTl.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68774Vbr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
