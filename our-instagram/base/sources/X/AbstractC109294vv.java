package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ElectionAddYoursInfoDict;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.StoryLinkInfoDict;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryPromptFailureTooltipDict;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDictImpl;
import com.instagram.api.schemas.StoryPromptParticipationFrictionType;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.api.schemas.StoryTemplateDict;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109294vv {
    public static void A00(AnonymousClass182 anonymousClass182, StoryPromptTappableData storyPromptTappableData, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        String str = storyPromptTappableData.A0L;
        if (str != null) {
            anonymousClass182.A0S("background_color", str);
        }
        StoryPromptDisablementState storyPromptDisablementState = storyPromptTappableData.A03;
        if (storyPromptDisablementState != null) {
            anonymousClass182.A0S("disablement_state", storyPromptDisablementState.A00);
        }
        ElectionAddYoursInfoDict electionAddYoursInfoDict = storyPromptTappableData.A01;
        if (electionAddYoursInfoDict != null) {
            anonymousClass182.A0r("election_add_yours_info");
            anonymousClass182.A0d();
            Boolean bool = electionAddYoursInfoDict.A00;
            if (bool != null) {
                anonymousClass182.A0T(AbstractC111324zv.A00(4319), bool.booleanValue());
            }
            List<String> list = electionAddYoursInfoDict.A02;
            if (list != null) {
                C16V.A03(anonymousClass182, AbstractC111324zv.A00(5500));
                for (String str2 : list) {
                    if (str2 != null) {
                        anonymousClass182.A0u(str2);
                    }
                }
                anonymousClass182.A0Z();
            }
            String str3 = electionAddYoursInfoDict.A01;
            if (str3 != null) {
                anonymousClass182.A0S("tray_title", str3);
            }
            anonymousClass182.A0a();
        }
        List<User> list2 = storyPromptTappableData.A0R;
        if (list2 != null) {
            C16V.A03(anonymousClass182, "facepile_top_participants");
            for (User user : list2) {
                if (user != null) {
                    Parcelable.Creator creator = User.CREATOR;
                    AbstractC38851rI.A08(anonymousClass182, user);
                }
            }
            anonymousClass182.A0Z();
        }
        GenAIToolInfoDict genAIToolInfoDict = storyPromptTappableData.A02;
        if (genAIToolInfoDict != null) {
            anonymousClass182.A0r("gen_ai_tool_info");
            ONS.A00(anonymousClass182, genAIToolInfoDict);
        }
        Boolean bool2 = storyPromptTappableData.A09;
        if (bool2 != null) {
            anonymousClass182.A0T("has_participated", bool2.booleanValue());
        }
        String str4 = storyPromptTappableData.A0M;
        if (str4 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str4);
        }
        Boolean bool3 = storyPromptTappableData.A0A;
        if (bool3 != null) {
            anonymousClass182.A0T("is_before_and_after", bool3.booleanValue());
        }
        Boolean bool4 = storyPromptTappableData.A0B;
        if (bool4 != null) {
            anonymousClass182.A0T("is_clips_v2_media", bool4.booleanValue());
        }
        Boolean bool5 = storyPromptTappableData.A0C;
        if (bool5 != null) {
            anonymousClass182.A0T("is_created_from_add_yours_browsing", bool5.booleanValue());
        }
        Boolean bool6 = storyPromptTappableData.A0D;
        if (bool6 != null) {
            anonymousClass182.A0T("is_from_add_yours_camera_tool", bool6.booleanValue());
        }
        Boolean bool7 = storyPromptTappableData.A0E;
        if (bool7 != null) {
            anonymousClass182.A0T("is_icon_disabled", bool7.booleanValue());
        }
        Boolean bool8 = storyPromptTappableData.A0F;
        if (bool8 != null) {
            anonymousClass182.A0T("is_original_prompt_media", bool8.booleanValue());
        }
        Boolean bool9 = storyPromptTappableData.A0G;
        if (bool9 != null) {
            anonymousClass182.A0T("is_pinned_by_creator", bool9.booleanValue());
        }
        Boolean bool10 = storyPromptTappableData.A0H;
        if (bool10 != null) {
            anonymousClass182.A0T("is_speakeasy", bool10.booleanValue());
        }
        Boolean bool11 = storyPromptTappableData.A0I;
        if (bool11 != null) {
            anonymousClass182.A0T("is_story_trending_prompt", bool11.booleanValue());
        }
        Boolean bool12 = storyPromptTappableData.A0J;
        if (bool12 != null) {
            anonymousClass182.A0T("is_trending_prompt", bool12.booleanValue());
        }
        Boolean bool13 = storyPromptTappableData.A0K;
        if (bool13 != null) {
            anonymousClass182.A0T("is_viewer_original_author", bool13.booleanValue());
        }
        String str5 = storyPromptTappableData.A0N;
        if (str5 != null) {
            anonymousClass182.A0S("media_id", str5);
        }
        User user2 = storyPromptTappableData.A08;
        if (user2 != null) {
            anonymousClass182.A0r("original_author");
            Parcelable.Creator creator2 = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user2);
        }
        anonymousClass182.A0Q("participant_count", storyPromptTappableData.A00);
        StoryPromptParticipationFrictionInfoDict storyPromptParticipationFrictionInfoDict = storyPromptTappableData.A05;
        if (storyPromptParticipationFrictionInfoDict != null) {
            anonymousClass182.A0r("participation_friction_info");
            StoryPromptParticipationFrictionInfoDictImpl F1K = storyPromptParticipationFrictionInfoDict.F1K();
            anonymousClass182.A0d();
            String str6 = F1K.A02;
            if (str6 != null) {
                anonymousClass182.A0S("body_1", str6);
            }
            String str7 = F1K.A03;
            if (str7 != null) {
                anonymousClass182.A0S("body_2", str7);
            }
            StoryLinkInfoDict storyLinkInfoDict = F1K.A00;
            if (storyLinkInfoDict != null) {
                anonymousClass182.A0r(AbstractC111324zv.A00(763));
                AbstractC108134tw.A00(anonymousClass182, storyLinkInfoDict, true);
            }
            StoryPromptParticipationFrictionType storyPromptParticipationFrictionType = F1K.A01;
            if (storyPromptParticipationFrictionType != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(948), storyPromptParticipationFrictionType.A00);
            }
            String str8 = F1K.A04;
            if (str8 != null) {
                anonymousClass182.A0S(DialogModule.KEY_TITLE, str8);
            }
            anonymousClass182.A0a();
        }
        StoryPromptFailureTooltipDict storyPromptFailureTooltipDict = storyPromptTappableData.A04;
        if (storyPromptFailureTooltipDict != null) {
            anonymousClass182.A0r("prompt_failure_tooltip");
            anonymousClass182.A0d();
            String str9 = storyPromptFailureTooltipDict.A00;
            if (str9 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(2319), str9);
            }
            String str10 = storyPromptFailureTooltipDict.A01;
            if (str10 != null) {
                anonymousClass182.A0S(AbstractC58317Pt9.A00(5), str10);
            }
            anonymousClass182.A0a();
        }
        String str11 = storyPromptTappableData.A0O;
        if (str11 != null) {
            anonymousClass182.A0S("prompt_style", str11);
        }
        StoryPromptType storyPromptType = storyPromptTappableData.A06;
        if (storyPromptType != null) {
            anonymousClass182.A0S("prompt_type", storyPromptType.A00);
        }
        String str12 = storyPromptTappableData.A0P;
        if (str12 != null) {
            anonymousClass182.A0S("sticker_style_str", str12);
        }
        StoryTemplateDict storyTemplateDict = storyPromptTappableData.A07;
        if (storyTemplateDict != null) {
            anonymousClass182.A0r("story_template");
            AbstractC109314vy.A00(anonymousClass182, storyTemplateDict);
        }
        String str13 = storyPromptTappableData.A0Q;
        if (str13 != null) {
            anonymousClass182.A0S("text", str13);
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }

    public static StoryPromptTappableData parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            StoryPromptDisablementState storyPromptDisablementState = null;
            ElectionAddYoursInfoDict electionAddYoursInfoDict = null;
            ArrayList arrayList = null;
            GenAIToolInfoDict genAIToolInfoDict = null;
            Boolean bool = null;
            String str2 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            String str3 = null;
            User user = null;
            StoryPromptParticipationFrictionInfoDictImpl storyPromptParticipationFrictionInfoDictImpl = null;
            StoryPromptFailureTooltipDict storyPromptFailureTooltipDict = null;
            String str4 = null;
            StoryPromptType storyPromptType = null;
            String str5 = null;
            StoryTemplateDict storyTemplateDict = null;
            String str6 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("background_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("disablement_state".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    storyPromptDisablementState = AbstractC109304vw.A00(A1P2);
                } else if ("election_add_yours_info".equals(A0q)) {
                    electionAddYoursInfoDict = VOF.parseFromJson(c16l);
                } else if ("facepile_top_participants".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = AbstractC38851rI.A00(c16l, false);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("gen_ai_tool_info".equals(A0q)) {
                    genAIToolInfoDict = ONS.parseFromJson(c16l);
                } else if ("has_participated".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("is_before_and_after".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_clips_v2_media".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("is_created_from_add_yours_browsing".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("is_from_add_yours_camera_tool".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("is_icon_disabled".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("is_original_prompt_media".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("is_pinned_by_creator".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("is_speakeasy".equals(A0q)) {
                    bool9 = Boolean.valueOf(c16l.A0d());
                } else if ("is_story_trending_prompt".equals(A0q)) {
                    bool10 = Boolean.valueOf(c16l.A0d());
                } else if ("is_trending_prompt".equals(A0q)) {
                    bool11 = Boolean.valueOf(c16l.A0d());
                } else if ("is_viewer_original_author".equals(A0q)) {
                    bool12 = Boolean.valueOf(c16l.A0d());
                } else if ("media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("original_author".equals(A0q)) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("participant_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("participation_friction_info".equals(A0q)) {
                    storyPromptParticipationFrictionInfoDictImpl = AbstractC40309HuD.parseFromJson(c16l);
                } else if ("prompt_failure_tooltip".equals(A0q)) {
                    storyPromptFailureTooltipDict = VP4.parseFromJson(c16l);
                } else if ("prompt_style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("prompt_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    storyPromptType = (StoryPromptType) StoryPromptType.A01.get(A1P);
                    if (storyPromptType == null) {
                        storyPromptType = StoryPromptType.A0I;
                    }
                } else if ("sticker_style_str".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("story_template".equals(A0q)) {
                    storyTemplateDict = AbstractC109314vy.parseFromJson(c16l);
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (storyPromptDisablementState == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("disablement_state", "StoryPromptTappableData");
            } else if (arrayList != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "StoryPromptTappableData");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("participant_count", "StoryPromptTappableData");
                } else if (str6 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("text", "StoryPromptTappableData");
                } else {
                    return new StoryPromptTappableData(electionAddYoursInfoDict, genAIToolInfoDict, storyPromptDisablementState, storyPromptFailureTooltipDict, storyPromptParticipationFrictionInfoDictImpl, storyPromptType, storyTemplateDict, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, str, str2, str3, str4, str5, str6, arrayList, num.intValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("facepile_top_participants", "StoryPromptTappableData");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
