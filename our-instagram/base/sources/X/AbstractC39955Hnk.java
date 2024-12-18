package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Hnk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39955Hnk {
    public static H3U parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Long l = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l2 = null;
            String str = null;
            String str2 = null;
            Float f = null;
            User user = null;
            Float f2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("category".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (ServerW3CShippingAddressConstants.CITY.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("facebook_places_id".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    l2 = AbstractC31173DnH.A0h(c16l);
                } else if ("lat".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if ("linked_account".equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("lng".equals(A0s)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("category", c16l, "GuideItemAttachmentPlaceImpl");
            } else if (l != null || !(c16l instanceof C07950bF)) {
                if (l2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "GuideItemAttachmentPlaceImpl");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c16l, "GuideItemAttachmentPlaceImpl");
                } else {
                    return new H3U(user, f, f2, str, str2, str3, l.longValue(), l2.longValue());
                }
            } else {
                AbstractC166997dE.A1V("facebook_places_id", c16l, "GuideItemAttachmentPlaceImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
