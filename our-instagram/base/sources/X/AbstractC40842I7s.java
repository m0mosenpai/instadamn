package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.I7s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40842I7s {
    public static IDG parseFromJson(C16L c16l) {
        Object A0c;
        C14360o3.A0B(c16l, 0);
        try {
            IDG idg = new IDG();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1J(A0s)) {
                    A0c = AbstractC37304Gc5.A0c(c16l);
                } else {
                    if ("pinned_content_token".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("pinned_content".equals(A0s)) {
                        idg.A00 = I83.parseFromJson(c16l);
                    } else if ("channel_type".equals(A0s)) {
                        A0c = AbstractC37304Gc5.A0c(c16l);
                    } else if (TraceFieldType.ContentType.equals(A0s)) {
                        A0c = AbstractC37304Gc5.A0c(c16l);
                    } else if ("pagination_token".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    }
                    c16l.A0z();
                }
                C14360o3.A0B(A0c, 0);
                c16l.A0z();
            }
            return idg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
