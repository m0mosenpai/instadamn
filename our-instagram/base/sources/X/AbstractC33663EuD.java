package X;

import com.instagram.api.schemas.AudienceValidationActionImpl;
import com.instagram.api.schemas.AudienceValidationActionType;
import java.io.IOException;

/* renamed from: X.EuD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33663EuD {
    public static AudienceValidationActionImpl parseFromJson(C16L c16l) {
        String A00;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            AudienceValidationActionType audienceValidationActionType = null;
            String str = null;
            String str2 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = MSV.A00(427);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("action_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    audienceValidationActionType = (AudienceValidationActionType) AudienceValidationActionType.A01.get(A1P);
                    if (audienceValidationActionType == null) {
                        audienceValidationActionType = AudienceValidationActionType.A04;
                    }
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (audienceValidationActionType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("action_type", c16l, "AudienceValidationActionImpl");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "AudienceValidationActionImpl");
            } else {
                return new AudienceValidationActionImpl(audienceValidationActionType, str, str2);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
