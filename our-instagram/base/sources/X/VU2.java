package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VU2 {
    public static C68785Vc2 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68785Vc2 c68785Vc2 = new C68785Vc2();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(AbstractC166997dE.A0s(c16l))) {
                    c68785Vc2.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c68785Vc2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
