package X;

import android.os.Parcelable;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AiAgentMetadataDict;
import com.instagram.api.schemas.AiAgentMetadataDictImpl;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vyv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69978Vyv {
    public static C66645URj parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            AiAgentMetadataDictImpl aiAgentMetadataDictImpl = null;
            String str = null;
            Integer num2 = null;
            ChatStickerChannelType chatStickerChannelType = null;
            Integer num3 = null;
            String str2 = null;
            Long l = null;
            String str3 = null;
            String str4 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str5 = null;
            Integer num4 = null;
            StoryJoinChatStatus storyJoinChatStatus = null;
            URK urk = null;
            User user = null;
            String str6 = null;
            ArrayList arrayList = null;
            ChatStickerStickerType chatStickerStickerType = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("active_member_count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("ai_agent_metadata".equals(A0s)) {
                    aiAgentMetadataDictImpl = VO0.parseFromJson(c16l);
                } else if ("ai_agent_toast_msg".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("audience_type".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("chat_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    chatStickerChannelType = VW2.A00(A1P3);
                } else if ("connected_member_count".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("deeplink_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("duration_s".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if (ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("group_image_uri".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("is_creation".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("is_editing_enabled".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("item_info".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("member_count".equals(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if ("member_status".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    storyJoinChatStatus = (StoryJoinChatStatus) StoryJoinChatStatus.A01.get(A1P2);
                    if (storyJoinChatStatus == null) {
                        storyJoinChatStatus = StoryJoinChatStatus.A09;
                    }
                } else if ("partial_render_info".equals(A0s)) {
                    urk = AbstractC69878Vx3.parseFromJson(c16l);
                } else if ("sender_info".equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("share_source".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("social_context_users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            URI parseFromJson = AbstractC68391VOz.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("sticker_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    chatStickerStickerType = (ChatStickerStickerType) ChatStickerStickerType.A01.get(A1P);
                    if (chatStickerStickerType == null) {
                        chatStickerStickerType = ChatStickerStickerType.A0A;
                    }
                } else if ("story_chat_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("thread_id_v2".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C66645URj(aiAgentMetadataDictImpl, urk, storyJoinChatStatus, chatStickerChannelType, chatStickerStickerType, user, bool, bool2, num, num2, num3, num4, l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C66645URj c66645URj, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        Integer num = c66645URj.A08;
        if (num != null) {
            anonymousClass182.A0Q("active_member_count", num.intValue());
        }
        AiAgentMetadataDict aiAgentMetadataDict = c66645URj.A00;
        if (aiAgentMetadataDict != null) {
            anonymousClass182.A0r("ai_agent_metadata");
            AiAgentMetadataDictImpl Eqp = aiAgentMetadataDict.Eqp();
            anonymousClass182.A0d();
            String str = Eqp.A01;
            if (str != null) {
                anonymousClass182.A0S("ai_agent_ent_fbid", str);
            }
            String str2 = Eqp.A02;
            if (str2 != null) {
                anonymousClass182.A0S("ai_agent_persona_fbid", str2);
            }
            IGAIAgentType iGAIAgentType = Eqp.A00;
            if (iGAIAgentType != null) {
                anonymousClass182.A0S("ai_agent_type", iGAIAgentType.A00);
            }
            anonymousClass182.A0a();
        }
        String str3 = c66645URj.A0D;
        if (str3 != null) {
            anonymousClass182.A0S("ai_agent_toast_msg", str3);
        }
        Integer num2 = c66645URj.A09;
        if (num2 != null) {
            anonymousClass182.A0Q("audience_type", num2.intValue());
        }
        ChatStickerChannelType chatStickerChannelType = c66645URj.A03;
        if (chatStickerChannelType != null) {
            anonymousClass182.A0S("chat_type", chatStickerChannelType.A00);
        }
        Integer num3 = c66645URj.A0A;
        if (num3 != null) {
            anonymousClass182.A0Q("connected_member_count", num3.intValue());
        }
        String str4 = c66645URj.A0E;
        if (str4 != null) {
            anonymousClass182.A0S("deeplink_url", str4);
        }
        Long l = c66645URj.A0C;
        if (l != null) {
            anonymousClass182.A0R("duration_s", l.longValue());
        }
        String str5 = c66645URj.A0F;
        if (str5 != null) {
            anonymousClass182.A0S(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str5);
        }
        String str6 = c66645URj.A0G;
        if (str6 != null) {
            anonymousClass182.A0S("group_image_uri", str6);
        }
        Boolean bool = c66645URj.A06;
        if (bool != null) {
            anonymousClass182.A0T("is_creation", bool.booleanValue());
        }
        Boolean bool2 = c66645URj.A07;
        if (bool2 != null) {
            anonymousClass182.A0T("is_editing_enabled", bool2.booleanValue());
        }
        String str7 = c66645URj.A0H;
        if (str7 != null) {
            anonymousClass182.A0S("item_info", str7);
        }
        Integer num4 = c66645URj.A0B;
        if (num4 != null) {
            anonymousClass182.A0Q("member_count", num4.intValue());
        }
        StoryJoinChatStatus storyJoinChatStatus = c66645URj.A02;
        if (storyJoinChatStatus != null) {
            anonymousClass182.A0S("member_status", storyJoinChatStatus.A00);
        }
        XGG xgg = c66645URj.A01;
        if (xgg != null) {
            anonymousClass182.A0r("partial_render_info");
            AbstractC69878Vx3.A00(anonymousClass182, xgg.F0B(), true);
        }
        User user = c66645URj.A05;
        if (user != null) {
            anonymousClass182.A0r("sender_info");
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        String str8 = c66645URj.A0I;
        if (str8 != null) {
            anonymousClass182.A0S("share_source", str8);
        }
        List list = c66645URj.A0N;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "social_context_users", list);
            while (A0q.hasNext()) {
                URI uri = (URI) A0q.next();
                if (uri != null) {
                    anonymousClass182.A0d();
                    String str9 = uri.A00;
                    if (str9 != null) {
                        anonymousClass182.A0S("profile_pic_url", str9);
                    }
                    String str10 = uri.A01;
                    if (str10 != null) {
                        anonymousClass182.A0S("user_igid", str10);
                    }
                    String str11 = uri.A02;
                    if (str11 != null) {
                        anonymousClass182.A0S(AbstractC31198Dnh.A01(), str11);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        ChatStickerStickerType chatStickerStickerType = c66645URj.A04;
        if (chatStickerStickerType != null) {
            anonymousClass182.A0S("sticker_type", chatStickerStickerType.A00);
        }
        String str12 = c66645URj.A0J;
        if (str12 != null) {
            anonymousClass182.A0S("story_chat_id", str12);
        }
        String str13 = c66645URj.A0K;
        if (str13 != null) {
            anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str13);
        }
        String str14 = c66645URj.A0L;
        if (str14 != null) {
            anonymousClass182.A0S("thread_id_v2", str14);
        }
        AbstractC37301Gc2.A1F(anonymousClass182, c66645URj.A0M);
        if (z) {
            anonymousClass182.A0a();
        }
    }
}
