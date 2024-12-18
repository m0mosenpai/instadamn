package X;

import java.io.IOException;

/* renamed from: X.VTx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68518VTx {
    public static C68782Vbz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68782Vbz c68782Vbz = new C68782Vbz();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("__typename".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else {
                    if ("cursor".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("node".equals(A0s)) {
                        c68782Vbz.A00 = AbstractC68517VTw.parseFromJson(c16l);
                    }
                    c16l.A0z();
                }
            }
            return c68782Vbz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
