package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.GuideTypeStr;
import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I0F {
    public static C1124055s parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Long l = null;
            Boolean bool3 = null;
            Integer num = null;
            Long l2 = null;
            String str = null;
            H7P h7p = null;
            User user = null;
            String str2 = null;
            GuideTypeStr guideTypeStr = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("can_viewer_reshare".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC37300Gc1.A1Q(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("feedback_enabled".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("is_draft".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("mixed_cover_media".equals(A0s)) {
                    h7p = IQS.parseFromJson(c16l);
                } else if ("num_items".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("owner".equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
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
                } else {
                    l2 = AbstractC37303Gc4.A0O(c16l, l2, A0s, "updated_timestamp");
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("can_viewer_reshare", c16l, "GuideSummary");
            } else if (bool2 != null || !(c16l instanceof C07950bF)) {
                if (l == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "GuideSummary");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_draft", c16l, "GuideSummary");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("num_items", c16l, "GuideSummary");
                } else if (user == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("owner", c16l, "GuideSummary");
                } else if (guideTypeStr == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c16l, "GuideSummary");
                } else if (l2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("updated_timestamp", c16l, "GuideSummary");
                } else {
                    return new C1124055s(guideTypeStr, h7p, user, str, str2, num.intValue(), l.longValue(), l2.longValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("feedback_enabled", c16l, "GuideSummary");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
