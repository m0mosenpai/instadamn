package X;

import java.io.IOException;

/* renamed from: X.VSg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68475VSg {
    public static C67642Utx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("start_position".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("length".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("image_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C67642Utx(num, num2, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
