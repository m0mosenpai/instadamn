package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.api.schemas.Challenge;
import com.instagram.api.schemas.ChallengeButtonInfoImpl;
import com.instagram.api.schemas.ChallengeName;
import com.instagram.api.schemas.ChallengeState;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VO7 {
    public static Challenge parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            Long l = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            String str2 = null;
            ChallengeButtonInfoImpl challengeButtonInfoImpl = null;
            String str3 = null;
            String str4 = null;
            ChallengeButtonInfoImpl challengeButtonInfoImpl2 = null;
            ChallengeButtonInfoImpl challengeButtonInfoImpl3 = null;
            String str5 = null;
            String str6 = null;
            ChallengeButtonInfoImpl challengeButtonInfoImpl4 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            Integer num = null;
            ChallengeName challengeName = null;
            Integer num2 = null;
            String str11 = null;
            ChallengeState challengeState = null;
            String str12 = null;
            Integer num3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("about_challenges".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("bottomsheet_progress_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("bottomsheet_progress_description_button".equals(A0s)) {
                    challengeButtonInfoImpl = VO5.parseFromJson(c16l);
                } else if ("bottomsheet_progress_label_left".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("challenge_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("challenge_id".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("challenge_primary_button".equals(A0s)) {
                    challengeButtonInfoImpl2 = VO5.parseFromJson(c16l);
                } else if ("challenge_secondary_button".equals(A0s)) {
                    challengeButtonInfoImpl3 = VO5.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(794).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("has_actioned_on_challenge_per_time_unit".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("hub_challenge_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("hub_challenge_primary_button".equals(A0s)) {
                    challengeButtonInfoImpl4 = VO5.parseFromJson(c16l);
                } else if ("hub_challenge_sub_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("hub_challenge_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("hub_progress_label_left".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("image_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(1073).equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
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
                } else if (ReactProgressBarViewManager.PROP_PROGRESS.equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("progress_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
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
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                } else {
                    num3 = AbstractC31178DnM.A0V(c16l, num3, A0s, "total");
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("challenge_id", c16l, "Challenge");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (str8 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("hub_challenge_title", c16l, "Challenge");
                } else if (str10 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("image_url", c16l, "Challenge");
                } else if (challengeName == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c16l, "Challenge");
                } else if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(ReactProgressBarViewManager.PROP_PROGRESS, c16l, "Challenge");
                } else if (challengeState == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, c16l, "Challenge");
                } else if (str12 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "Challenge");
                } else if (num3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("total", c16l, "Challenge");
                } else {
                    return new Challenge(challengeButtonInfoImpl, challengeButtonInfoImpl2, challengeButtonInfoImpl3, challengeButtonInfoImpl4, challengeName, challengeState, num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, num2.intValue(), num3.intValue(), l.longValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("has_actioned_on_challenge_per_time_unit", c16l, "Challenge");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
