package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.GenAIMessagingDataImpl;
import com.instagram.api.schemas.GenAIPersonaBannerDictImpl;
import java.io.IOException;

/* renamed from: X.HnT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39938HnT {
    public static GenAIPersonaBannerDictImpl parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            GenAIMessagingDataImpl genAIMessagingDataImpl = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC58317Pt9.A00(27);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if (A00.equals(A0s)) {
                    genAIMessagingDataImpl = AbstractC39936HnR.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("persona_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("profile_image_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (genAIMessagingDataImpl == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "GenAIPersonaBannerDictImpl");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("persona_id", c16l, "GenAIPersonaBannerDictImpl");
                } else {
                    return new GenAIPersonaBannerDictImpl(genAIMessagingDataImpl, str, str2, str3);
                }
            } else {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c16l, "GenAIPersonaBannerDictImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
