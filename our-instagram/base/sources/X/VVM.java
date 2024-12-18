package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VVM {
    public static C68825Vcg parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C68825Vcg c68825Vcg = new C68825Vcg();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (CacheBehaviorLogger.SOURCE.equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c68825Vcg.A00 = A1P;
                }
                c16l.A0z();
            }
            return c68825Vcg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
