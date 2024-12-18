package X;

import com.instagram.api.schemas.FanClubNextStepsCompletionState;
import com.instagram.api.schemas.FanClubNextStepsRecommendationsType;
import java.io.IOException;

/* renamed from: X.Eud, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33689Eud {
    public static C51783Mun parseFromJson(C16L c16l) {
        String A00;
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            FanClubNextStepsCompletionState fanClubNextStepsCompletionState = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC43591JPw.A00(93);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("completion_state".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    fanClubNextStepsCompletionState = (FanClubNextStepsCompletionState) FanClubNextStepsCompletionState.A01.get(A1P2);
                    if (fanClubNextStepsCompletionState == null) {
                        fanClubNextStepsCompletionState = FanClubNextStepsCompletionState.A06;
                    }
                } else if ("contextual_recommendation_creator_username".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("contextual_recommendation_full_screen_cta".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("contextual_recommendation_full_screen_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("contextual_recommendation_full_screen_learn_more_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("contextual_recommendation_full_screen_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("contextual_recommendation_full_screen_video_fbid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("contextual_recommendation_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("contextual_recommendation_thumbnail".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("main_recommendation_cta".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("main_recommendation_dark_mode_icon".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("main_recommendation_icon".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("main_recommendation_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                } else if ("recommendation_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str13 = null;
                    } else {
                        str13 = c16l.A1P();
                    }
                } else if ("recommendation_extra".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str14 = null;
                    } else {
                        str14 = c16l.A1P();
                    }
                } else if ("recommendation_icon".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str15 = null;
                    } else {
                        str15 = c16l.A1P();
                    }
                } else if ("recommendation_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str16 = null;
                    } else {
                        str16 = c16l.A1P();
                    }
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    fanClubNextStepsRecommendationsType = (FanClubNextStepsRecommendationsType) FanClubNextStepsRecommendationsType.A01.get(A1P);
                    if (fanClubNextStepsRecommendationsType == null) {
                        fanClubNextStepsRecommendationsType = FanClubNextStepsRecommendationsType.A0J;
                    }
                }
                c16l.A0z();
            }
            if (fanClubNextStepsCompletionState == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("completion_state", c16l, "FanClubNextStepsRecommendation");
            } else if (str13 != null || !(c16l instanceof C07950bF)) {
                if (str15 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("recommendation_icon", c16l, "FanClubNextStepsRecommendation");
                } else if (str16 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("recommendation_name", c16l, "FanClubNextStepsRecommendation");
                } else if (fanClubNextStepsRecommendationsType == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "FanClubNextStepsRecommendation");
                } else {
                    return new C51783Mun(fanClubNextStepsCompletionState, fanClubNextStepsRecommendationsType, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
                }
            } else {
                AbstractC166997dE.A1V("recommendation_description", c16l, "FanClubNextStepsRecommendation");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
