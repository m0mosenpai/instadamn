package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* renamed from: X.VTh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68502VTh {
    public static C68769Vbm parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68769Vbm c68769Vbm = new C68769Vbm();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(AbstractC166997dE.A0s(c16l))) {
                    c68769Vbm.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c68769Vbm;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
