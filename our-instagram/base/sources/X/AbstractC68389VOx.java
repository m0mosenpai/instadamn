package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* renamed from: X.VOx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68389VOx {
    public static C38754H4u parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("count", c16l, "ReactionMetadata");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, c16l, "ReactionMetadata");
                } else {
                    return new C38754H4u(num.intValue(), str, str2);
                }
            } else {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c16l, "ReactionMetadata");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
