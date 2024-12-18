package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.CreatorViewerContextCTAImpl;
import com.instagram.api.schemas.CreatorViewerContextCTATarget;
import com.instagram.api.schemas.CreatorViewerContextCTAType;
import com.instagram.api.schemas.FormattedStringImpl;
import java.io.IOException;

/* renamed from: X.HmI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39869HmI {
    public static CreatorViewerContextCTAImpl parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            CreatorViewerContextCTAType creatorViewerContextCTAType = null;
            CreatorViewerContextCTATarget creatorViewerContextCTATarget = null;
            FormattedStringImpl formattedStringImpl = null;
            FormattedStringImpl formattedStringImpl2 = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("context_cta_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    creatorViewerContextCTAType = (CreatorViewerContextCTAType) CreatorViewerContextCTAType.A01.get(A1P2);
                    if (creatorViewerContextCTAType == null) {
                        creatorViewerContextCTAType = CreatorViewerContextCTAType.A09;
                    }
                } else if ("cta_target".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    creatorViewerContextCTATarget = (CreatorViewerContextCTATarget) CreatorViewerContextCTATarget.A01.get(A1P);
                    if (creatorViewerContextCTATarget == null) {
                        creatorViewerContextCTATarget = CreatorViewerContextCTATarget.A04;
                    }
                } else if ("extended_text".equals(A0s)) {
                    formattedStringImpl = IO9.parseFromJson(c16l);
                } else if ("formatted_text".equals(A0s)) {
                    formattedStringImpl2 = IO9.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (creatorViewerContextCTAType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("context_cta_type", c16l, "CreatorViewerContextCTAImpl");
            } else if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("text", c16l, "CreatorViewerContextCTAImpl");
            } else {
                return new CreatorViewerContextCTAImpl(creatorViewerContextCTATarget, creatorViewerContextCTAType, formattedStringImpl, formattedStringImpl2, str, str2);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
