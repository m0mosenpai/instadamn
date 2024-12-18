package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F0Q {
    public static C32188ECj parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C32188ECj c32188ECj = new C32188ECj();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31171DnF.A1Y(A0s)) {
                    c32188ECj.A01 = AbstractC166997dE.A0h(c16l);
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c32188ECj.A02 = A1P;
                } else if ("is_selected".equals(A0s)) {
                    c32188ECj.A00 = AbstractC166997dE.A0d(c16l);
                } else {
                    C55702hA.A01(c16l, c32188ECj, A0s);
                }
                c16l.A0z();
            }
            return c32188ECj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
