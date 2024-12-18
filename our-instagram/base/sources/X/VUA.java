package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VUA {
    public static C68792Vc9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68792Vc9 c68792Vc9 = new C68792Vc9();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(AbstractC166997dE.A0s(c16l))) {
                    c68792Vc9.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c68792Vc9;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
