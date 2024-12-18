package X;

import java.io.IOException;

/* renamed from: X.S4j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62264S4j {
    public static C45127Jxw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Long l = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ch".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("ttl".equals(A0s)) {
                    l = Long.valueOf(c16l.A0y());
                }
                c16l.A0z();
            }
            return new C45127Jxw(str, l, 22);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
