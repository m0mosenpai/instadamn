package X;

import java.io.IOException;

/* renamed from: X.VTk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68505VTk {
    public static C68772Vbp parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68772Vbp c68772Vbp = new C68772Vbp();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("organic".equals(AbstractC166997dE.A0s(c16l))) {
                    c68772Vbp.A00 = AbstractC68504VTj.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c68772Vbp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
