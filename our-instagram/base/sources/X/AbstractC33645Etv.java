package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* renamed from: X.Etv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33645Etv {
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.Est] */
    public static C33581Est parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, c16l, "AuthorizationHeader");
                throw C00O.createAndThrow();
            }
            ?? obj = new Object();
            obj.A00 = str;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
