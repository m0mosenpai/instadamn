package X;

import com.instagram.api.schemas.ChallengeButtonAction;
import com.instagram.api.schemas.ChallengeButtonInfoImpl;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VO5 {
    public static ChallengeButtonInfoImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ChallengeButtonAction challengeButtonAction = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("button_action".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    challengeButtonAction = (ChallengeButtonAction) ChallengeButtonAction.A01.get(A1P);
                    if (challengeButtonAction == null) {
                        challengeButtonAction = ChallengeButtonAction.A0A;
                    }
                } else if ("button_text".equals(A0s)) {
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
                }
                c16l.A0z();
            }
            if (challengeButtonAction == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("button_action", c16l, "ChallengeButtonInfoImpl");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("deeplink_url", c16l, "ChallengeButtonInfoImpl");
                } else {
                    return new ChallengeButtonInfoImpl(challengeButtonAction, str, str2);
                }
            } else {
                AbstractC166997dE.A1V("button_text", c16l, "ChallengeButtonInfoImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
