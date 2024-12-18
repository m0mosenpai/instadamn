package X;

import com.facebook.location.platform.api.Location;
import java.io.IOException;

/* renamed from: X.VOm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68378VOm {
    public static UR9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (Location.SPEED.equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, "startLagMs");
                }
                c16l.A0z();
            }
            return new UR9(num, num2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
