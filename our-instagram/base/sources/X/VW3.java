package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AiAgentMetadataDict;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VW3 {
    public static Map A00(XGL xgl) {
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI;
        String str;
        String str2;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xgl.AYq() != null) {
            linkedHashMap.put("active_member_count", xgl.AYq());
        }
        String str3 = null;
        if (xgl.AaZ() != null) {
            AiAgentMetadataDict AaZ = xgl.AaZ();
            if (AaZ != null) {
                treeUpdaterJNI2 = AaZ.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("ai_agent_metadata", treeUpdaterJNI2);
        }
        if (xgl.Aag() != null) {
            linkedHashMap.put("ai_agent_toast_msg", xgl.Aag());
        }
        if (xgl.Ada() != null) {
            linkedHashMap.put("audience_type", xgl.Ada());
        }
        if (xgl.AnL() != null) {
            ChatStickerChannelType AnL = xgl.AnL();
            if (AnL != null) {
                str2 = AnL.A00;
            } else {
                str2 = null;
            }
            linkedHashMap.put("chat_type", str2);
        }
        if (xgl.AqM() != null) {
            linkedHashMap.put("connected_member_count", xgl.AqM());
        }
        if (xgl.Aw9() != null) {
            linkedHashMap.put("deeplink_url", xgl.Aw9());
        }
        if (xgl.Azr() != null) {
            linkedHashMap.put("duration_s", xgl.Azr());
        }
        if (xgl.B2R() != null) {
            linkedHashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, xgl.B2R());
        }
        if (xgl.BAX() != null) {
            linkedHashMap.put("group_image_uri", xgl.BAX());
        }
        if (xgl.CRu() != null) {
            linkedHashMap.put("is_creation", xgl.CRu());
        }
        if (xgl.CSu() != null) {
            linkedHashMap.put("is_editing_enabled", xgl.CSu());
        }
        if (xgl.BK5() != null) {
            linkedHashMap.put("item_info", xgl.BK5());
        }
        if (xgl.BSC() != null) {
            linkedHashMap.put("member_count", xgl.BSC());
        }
        if (xgl.BSG() != null) {
            StoryJoinChatStatus BSG = xgl.BSG();
            if (BSG != null) {
                str = BSG.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("member_status", str);
        }
        if (xgl.BbV() != null) {
            XGG BbV = xgl.BbV();
            if (BbV != null) {
                treeUpdaterJNI = BbV.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("partial_render_info", treeUpdaterJNI);
        }
        User BtH = xgl.BtH();
        if (BtH != null) {
            linkedHashMap.put("sender_info", BtH.A07());
        }
        if (xgl.BuE() != null) {
            linkedHashMap.put("share_source", xgl.BuE());
        }
        if (xgl.ByV() != null) {
            List<InterfaceC72037XFz> ByV = xgl.ByV();
            if (ByV != null) {
                arrayList = new ArrayList();
                for (InterfaceC72037XFz interfaceC72037XFz : ByV) {
                    if (interfaceC72037XFz != null) {
                        arrayList.add(interfaceC72037XFz.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("social_context_users", arrayList);
        }
        if (xgl.C0m() != null) {
            ChatStickerStickerType C0m = xgl.C0m();
            if (C0m != null) {
                str3 = C0m.A00;
            }
            linkedHashMap.put("sticker_type", str3);
        }
        if (xgl.C1J() != null) {
            linkedHashMap.put("story_chat_id", xgl.C1J());
        }
        if (xgl.C7I() != null) {
            linkedHashMap.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, xgl.C7I());
        }
        if (xgl.C7J() != null) {
            linkedHashMap.put("thread_id_v2", xgl.C7J());
        }
        if (xgl.getTitle() != null) {
            linkedHashMap.put(DialogModule.KEY_TITLE, xgl.getTitle());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
