package X;

import com.instagram.api.schemas.FBBioLinkSocialContextType;
import java.io.IOException;

/* renamed from: X.4xx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC110274xx {
    public static C110284xz parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            FBBioLinkSocialContextType fBBioLinkSocialContextType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("display_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("magnitude".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("social_context_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    fBBioLinkSocialContextType = (FBBioLinkSocialContextType) FBBioLinkSocialContextType.A01.get(A1P);
                    if (fBBioLinkSocialContextType == null) {
                        fBBioLinkSocialContextType = FBBioLinkSocialContextType.A09;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("display_text", "FBBioLinkSocialContextImpl");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (fBBioLinkSocialContextType == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("social_context_type", "FBBioLinkSocialContextImpl");
                } else {
                    return new C110284xz(fBBioLinkSocialContextType, str, num.intValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("magnitude", "FBBioLinkSocialContextImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
