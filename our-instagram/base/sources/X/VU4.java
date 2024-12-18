package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VU4 {
    public static C68787Vc4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68787Vc4 c68787Vc4 = new C68787Vc4();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(AbstractC166997dE.A0s(c16l))) {
                    c68787Vc4.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c68787Vc4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
