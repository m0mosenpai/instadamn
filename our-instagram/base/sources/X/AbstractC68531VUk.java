package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* renamed from: X.VUk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68531VUk {
    public static C68998Vfa parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68998Vfa c68998Vfa = new C68998Vfa();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("customized_token".equals(A0s)) {
                    c68998Vfa.A00 = AbstractC167017dG.A0m(c16l);
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0s)) {
                    c68998Vfa.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c68998Vfa;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
