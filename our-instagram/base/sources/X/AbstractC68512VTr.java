package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* renamed from: X.VTr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68512VTr {
    public static C68778Vbv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68778Vbv c68778Vbv = new C68778Vbv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(AbstractC166997dE.A0s(c16l))) {
                    c68778Vbv.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c68778Vbv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
