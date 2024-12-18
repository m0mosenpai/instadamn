package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.GuidanceTipIconAsset;
import com.instagram.api.schemas.GuidanceTipResponseImpl;
import java.io.IOException;

/* renamed from: X.Hnh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39952Hnh {
    public static GuidanceTipResponseImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            GuidanceTipIconAsset guidanceTipIconAsset = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("content".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("deeplink_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    guidanceTipIconAsset = (GuidanceTipIconAsset) GuidanceTipIconAsset.A01.get(A1P);
                    if (guidanceTipIconAsset == null) {
                        guidanceTipIconAsset = GuidanceTipIconAsset.A04;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("content", c16l, "GuidanceTipResponseImpl");
            } else if (guidanceTipIconAsset == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, c16l, "GuidanceTipResponseImpl");
            } else {
                return new GuidanceTipResponseImpl(guidanceTipIconAsset, str, str2);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
