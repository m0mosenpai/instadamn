package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.AchievementButtonInfoImpl;
import com.instagram.api.schemas.AchievementCategory;
import com.instagram.api.schemas.AchievementName;
import com.instagram.api.schemas.CloseToEarningAchievementMedia;
import com.instagram.api.schemas.EarnedOnMediaState;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NqL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53769NqL {
    public static Achievement parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        try {
            Long l = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            AchievementCategory achievementCategory = null;
            ArrayList arrayList = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            EarnedOnMediaState earnedOnMediaState = null;
            String str8 = null;
            AchievementButtonInfoImpl achievementButtonInfoImpl = null;
            String str9 = null;
            String str10 = null;
            AchievementName achievementName = null;
            AchievementButtonInfoImpl achievementButtonInfoImpl2 = null;
            Integer num2 = null;
            AchievementButtonInfoImpl achievementButtonInfoImpl3 = null;
            String str11 = null;
            Integer num3 = null;
            String str12 = null;
            String str13 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("about_achievement".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("achievement_id".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("animation_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("category".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    achievementCategory = (AchievementCategory) AchievementCategory.A01.get(A1P3);
                    if (achievementCategory == null) {
                        achievementCategory = AchievementCategory.A0L;
                    }
                } else if ("close_to_earning_achievement_medias".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            CloseToEarningAchievementMedia parseFromJson = AbstractC53771NqN.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("cta_footer_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("earned_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("earned_on_media_display_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("earned_on_media_error_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("earned_on_media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("earned_on_media_state".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    EarnedOnMediaState earnedOnMediaState2 = (EarnedOnMediaState) EarnedOnMediaState.A01.get(A1P2);
                    earnedOnMediaState = earnedOnMediaState2;
                    if (earnedOnMediaState2 == null) {
                        earnedOnMediaState = EarnedOnMediaState.A06;
                    }
                } else if ("earned_on_story_reel_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("hub_primary_button".equals(A0s)) {
                    achievementButtonInfoImpl = AbstractC53768NqK.parseFromJson(c16l);
                } else if ("hub_title".equals(A0s)) {
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
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    achievementName = (AchievementName) AchievementName.A01.get(A1P);
                    if (achievementName == null) {
                        achievementName = AchievementName.A4V;
                    }
                } else if ("primary_button".equals(A0s)) {
                    achievementButtonInfoImpl2 = AbstractC53768NqK.parseFromJson(c16l);
                } else if (ReactProgressBarViewManager.PROP_PROGRESS.equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("secondary_button".equals(A0s)) {
                    achievementButtonInfoImpl3 = AbstractC53768NqK.parseFromJson(c16l);
                } else if (AbstractC58317Pt9.A00(365).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("time_achieved".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                } else if ("unearned_image_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str13 = null;
                    } else {
                        str13 = c16l.A1P();
                    }
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("about_achievement", c16l, "Achievement");
            } else if (l != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("animation_url", c16l, "Achievement");
                } else if (achievementCategory == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("category", c16l, "Achievement");
                } else if (str9 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("hub_title", c16l, "Achievement");
                } else if (str10 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("image_url", c16l, "Achievement");
                } else if (achievementName == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c16l, "Achievement");
                } else if (str12 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "Achievement");
                } else if (str13 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("unearned_image_url", c16l, "Achievement");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, c16l, "Achievement");
                } else {
                    return new Achievement(achievementButtonInfoImpl, achievementButtonInfoImpl2, achievementButtonInfoImpl3, achievementCategory, achievementName, earnedOnMediaState, num2, num3, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, arrayList, num.intValue(), l.longValue());
                }
            } else {
                AbstractC166997dE.A1V("achievement_id", c16l, "Achievement");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
