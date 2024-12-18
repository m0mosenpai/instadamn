package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.reels.netego.BloksStoryNetegoCTAStyle;
import java.io.IOException;

/* renamed from: X.I2v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40715I2v {
    public static C37921pZ parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            BloksStoryNetegoCTAStyle bloksStoryNetegoCTAStyle = null;
            String str3 = null;
            C38687GzS c38687GzS = null;
            String str4 = null;
            String str5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("bloks_app_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("cta_button_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("cta_style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    bloksStoryNetegoCTAStyle = (BloksStoryNetegoCTAStyle) BloksStoryNetegoCTAStyle.A01.get(A1P);
                    if (bloksStoryNetegoCTAStyle == null) {
                        bloksStoryNetegoCTAStyle = BloksStoryNetegoCTAStyle.A05;
                    }
                } else if ("duration".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("force_isolate_cta_button".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("is_cta_button_enabled".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("payload".equals(A0s)) {
                    c38687GzS = AbstractC40713I2t.parseFromJson(c16l);
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("tracking_token".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("bloks_app_id", c16l, "BloksStoryNetegoDict");
            } else if (bloksStoryNetegoCTAStyle != null || !(c16l instanceof C07950bF)) {
                if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("duration", c16l, "BloksStoryNetegoDict");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("force_isolate_cta_button", c16l, "BloksStoryNetegoDict");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "BloksStoryNetegoDict");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_cta_button_enabled", c16l, "BloksStoryNetegoDict");
                } else if (c38687GzS == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("payload", c16l, "BloksStoryNetegoDict");
                } else if (str5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("tracking_token", c16l, "BloksStoryNetegoDict");
                } else {
                    return new C37921pZ(c38687GzS, bloksStoryNetegoCTAStyle, str, str2, str3, str4, str5, num.intValue(), bool.booleanValue(), bool2.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("cta_style", c16l, "BloksStoryNetegoDict");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
