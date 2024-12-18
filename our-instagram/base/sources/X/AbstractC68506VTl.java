package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* renamed from: X.VTl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68506VTl {
    public static C68773Vbq parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68773Vbq c68773Vbq = new C68773Vbq();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(AbstractC166997dE.A0s(c16l))) {
                    c68773Vbq.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c68773Vbq;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
