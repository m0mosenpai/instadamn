package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.I9h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40883I9h {
    public static IHP parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            IHP ihp = new IHP();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (TraceFieldType.RequestID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    ihp.A02 = A1P;
                } else if ("seen_state".equals(A0s)) {
                    ihp.A01 = AbstractC41369ISw.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return ihp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
