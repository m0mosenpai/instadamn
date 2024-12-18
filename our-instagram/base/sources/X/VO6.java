package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.api.schemas.ChallengeButtonInfoImpl;
import com.instagram.api.schemas.ChallengeDetails;
import com.instagram.api.schemas.ChallengeName;
import com.instagram.api.schemas.ChallengeState;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VO6 {
    public static ChallengeDetails parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ChallengeName challengeName = null;
            ChallengeButtonInfoImpl challengeButtonInfoImpl = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            ChallengeButtonInfoImpl challengeButtonInfoImpl2 = null;
            ChallengeButtonInfoImpl challengeButtonInfoImpl3 = null;
            ChallengeState challengeState = null;
            String str7 = null;
            String str8 = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("challenge_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("has_actioned_today".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("image_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    challengeName = (ChallengeName) ChallengeName.A01.get(A1P2);
                    if (challengeName == null) {
                        challengeName = ChallengeName.A08;
                    }
                } else if ("primary_button".equals(A0s)) {
                    challengeButtonInfoImpl = VO5.parseFromJson(c16l);
                } else if (ReactProgressBarViewManager.PROP_PROGRESS.equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("progress_bar_left".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("progress_bar_right".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("progress_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("progress_description_button".equals(A0s)) {
                    challengeButtonInfoImpl2 = VO5.parseFromJson(c16l);
                } else if ("secondary_button".equals(A0s)) {
                    challengeButtonInfoImpl3 = VO5.parseFromJson(c16l);
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    challengeState = (ChallengeState) ChallengeState.A01.get(A1P);
                    if (challengeState == null) {
                        challengeState = ChallengeState.A08;
                    }
                } else if ("subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, "total");
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("challenge_id", c16l, "ChallengeDetails");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("image_url", c16l, "ChallengeDetails");
                } else if (challengeName == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c16l, "ChallengeDetails");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(ReactProgressBarViewManager.PROP_PROGRESS, c16l, "ChallengeDetails");
                } else if (challengeState == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, c16l, "ChallengeDetails");
                } else if (str8 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "ChallengeDetails");
                } else if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("total", c16l, "ChallengeDetails");
                } else {
                    return new ChallengeDetails(challengeButtonInfoImpl, challengeButtonInfoImpl2, challengeButtonInfoImpl3, challengeName, challengeState, str, str2, str3, str4, str5, str6, str7, str8, num.intValue(), num2.intValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("has_actioned_today", c16l, "ChallengeDetails");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
