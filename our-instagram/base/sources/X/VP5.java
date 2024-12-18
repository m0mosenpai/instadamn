package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ElectionAddYoursInfoDictIntf;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.api.schemas.StoryTemplateDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VP5 {
    public static Map A00(StoryPromptTappableDataIntf storyPromptTappableDataIntf) {
        String str;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (storyPromptTappableDataIntf.getBackgroundColor() != null) {
            linkedHashMap.put("background_color", storyPromptTappableDataIntf.getBackgroundColor());
        }
        if (storyPromptTappableDataIntf.Ay6() != null) {
            StoryPromptDisablementState Ay6 = storyPromptTappableDataIntf.Ay6();
            C14360o3.A0B(Ay6, 0);
            linkedHashMap.put("disablement_state", Ay6.A00);
        }
        TreeUpdaterJNI treeUpdaterJNI5 = null;
        if (storyPromptTappableDataIntf.B0n() != null) {
            ElectionAddYoursInfoDictIntf B0n = storyPromptTappableDataIntf.B0n();
            if (B0n != null) {
                treeUpdaterJNI4 = B0n.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            linkedHashMap.put("election_add_yours_info", treeUpdaterJNI4);
        }
        if (storyPromptTappableDataIntf.B48() != null) {
            List B48 = storyPromptTappableDataIntf.B48();
            ArrayList A0q = AbstractC167017dG.A0q(B48);
            Iterator it = B48.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            linkedHashMap.put("facepile_top_participants", A0q);
        }
        if (storyPromptTappableDataIntf.B9Z() != null) {
            GenAIToolInfoDictIntf B9Z = storyPromptTappableDataIntf.B9Z();
            if (B9Z != null) {
                treeUpdaterJNI3 = B9Z.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            linkedHashMap.put(AbstractC111324zv.A00(960), treeUpdaterJNI3);
        }
        if (storyPromptTappableDataIntf.BCK() != null) {
            linkedHashMap.put("has_participated", storyPromptTappableDataIntf.BCK());
        }
        if (storyPromptTappableDataIntf.getId() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, storyPromptTappableDataIntf.getId());
        }
        if (storyPromptTappableDataIntf.CQY() != null) {
            linkedHashMap.put("is_before_and_after", storyPromptTappableDataIntf.CQY());
        }
        if (storyPromptTappableDataIntf.CRP() != null) {
            linkedHashMap.put("is_clips_v2_media", storyPromptTappableDataIntf.CRP());
        }
        if (storyPromptTappableDataIntf.CRs() != null) {
            linkedHashMap.put("is_created_from_add_yours_browsing", storyPromptTappableDataIntf.CRs());
        }
        if (storyPromptTappableDataIntf.CV8() != null) {
            linkedHashMap.put("is_from_add_yours_camera_tool", storyPromptTappableDataIntf.CV8());
        }
        if (storyPromptTappableDataIntf.CW3() != null) {
            linkedHashMap.put("is_icon_disabled", storyPromptTappableDataIntf.CW3());
        }
        if (storyPromptTappableDataIntf.CZt() != null) {
            linkedHashMap.put("is_original_prompt_media", storyPromptTappableDataIntf.CZt());
        }
        if (storyPromptTappableDataIntf.CaL() != null) {
            linkedHashMap.put("is_pinned_by_creator", storyPromptTappableDataIntf.CaL());
        }
        if (storyPromptTappableDataIntf.CdT() != null) {
            linkedHashMap.put("is_speakeasy", storyPromptTappableDataIntf.CdT());
        }
        if (storyPromptTappableDataIntf.Cds() != null) {
            linkedHashMap.put("is_story_trending_prompt", storyPromptTappableDataIntf.Cds());
        }
        if (storyPromptTappableDataIntf.Ces() != null) {
            linkedHashMap.put("is_trending_prompt", storyPromptTappableDataIntf.Ces());
        }
        if (storyPromptTappableDataIntf.Cfw() != null) {
            linkedHashMap.put("is_viewer_original_author", storyPromptTappableDataIntf.Cfw());
        }
        if (storyPromptTappableDataIntf.getMediaId() != null) {
            linkedHashMap.put("media_id", storyPromptTappableDataIntf.getMediaId());
        }
        User BZk = storyPromptTappableDataIntf.BZk();
        if (BZk != null) {
            linkedHashMap.put("original_author", BZk.A07());
        }
        storyPromptTappableDataIntf.BbW();
        linkedHashMap.put("participant_count", Integer.valueOf(storyPromptTappableDataIntf.BbW()));
        if (storyPromptTappableDataIntf.BbZ() != null) {
            StoryPromptParticipationFrictionInfoDict BbZ = storyPromptTappableDataIntf.BbZ();
            if (BbZ != null) {
                treeUpdaterJNI2 = BbZ.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put(AbstractC111324zv.A00(2856), treeUpdaterJNI2);
        }
        if (storyPromptTappableDataIntf.Bif() != null) {
            StoryPromptFailureTooltipDictIntf Bif = storyPromptTappableDataIntf.Bif();
            if (Bif != null) {
                treeUpdaterJNI = Bif.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("prompt_failure_tooltip", treeUpdaterJNI);
        }
        if (storyPromptTappableDataIntf.Bik() != null) {
            linkedHashMap.put("prompt_style", storyPromptTappableDataIntf.Bik());
        }
        if (storyPromptTappableDataIntf.Bio() != null) {
            StoryPromptType Bio = storyPromptTappableDataIntf.Bio();
            if (Bio != null) {
                str = Bio.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("prompt_type", str);
        }
        if (storyPromptTappableDataIntf.C0j() != null) {
            linkedHashMap.put("sticker_style_str", storyPromptTappableDataIntf.C0j());
        }
        if (storyPromptTappableDataIntf.C2N() != null) {
            StoryTemplateDictIntf C2N = storyPromptTappableDataIntf.C2N();
            if (C2N != null) {
                treeUpdaterJNI5 = C2N.F7o();
            }
            linkedHashMap.put("story_template", treeUpdaterJNI5);
        }
        if (storyPromptTappableDataIntf.getText() != null) {
            linkedHashMap.put("text", storyPromptTappableDataIntf.getText());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
