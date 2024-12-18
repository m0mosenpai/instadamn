package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.GuideTypeStr;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I09 {
    public static H7N parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            H7P h7p = null;
            String str3 = null;
            GuideTypeStr guideTypeStr = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1Q(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("mixed_cover_media".equals(A0s)) {
                    h7p = IQS.parseFromJson(c16l);
                } else if ("num_items".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    guideTypeStr = (GuideTypeStr) GuideTypeStr.A01.get(A1P);
                    if (guideTypeStr == null) {
                        guideTypeStr = GuideTypeStr.A08;
                    }
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "GuideFeedMetadata");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (guideTypeStr == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c16l, "GuideFeedMetadata");
                } else {
                    return new H7N(guideTypeStr, h7p, str, str2, str3, num.intValue());
                }
            } else {
                AbstractC166997dE.A1V("num_items", c16l, "GuideFeedMetadata");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
