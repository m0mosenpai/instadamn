package X;

import java.io.IOException;

/* renamed from: X.5Eb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC114355Eb {
    public static C114365Ec parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C114365Ec c114365Ec = new C114365Ec();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("seq_id".equals(A0q)) {
                    c114365Ec.A02 = c16l.A0y();
                } else if ("succeeded".equals(A0q)) {
                    c114365Ec.A05 = c16l.A0d();
                } else if ("error_type".equals(A0q)) {
                    c114365Ec.A00 = c16l.A1D();
                } else if ("error_message".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c114365Ec.A04 = A1P;
                } else if ("subscribed_at_ms".equals(A0q)) {
                    c114365Ec.A03 = c16l.A0y();
                } else if ("latest_seq_id".equals(A0q)) {
                    c114365Ec.A01 = c16l.A0y();
                }
                c16l.A0z();
            }
            return c114365Ec;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
