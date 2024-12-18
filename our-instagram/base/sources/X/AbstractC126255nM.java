package X;

import android.os.Parcelable;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.direct.model.DirectMessageEditHistory;
import com.instagram.direct.model.comments.DirectMessageComments;
import com.instagram.direct.model.mentions.MentionedEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5nM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC126255nM {
    public static void A00(AnonymousClass182 anonymousClass182, C83403nh c83403nh) {
        int i;
        anonymousClass182.A0d();
        anonymousClass182.A0S(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, C4GU.A00(c83403nh.A1F));
        C2EY c2ey = c83403nh.A10;
        if (c2ey != null) {
            anonymousClass182.A0S("item_type", c2ey.toString());
        }
        String str = c83403nh.A1c;
        if (str != null) {
            anonymousClass182.A0S("item_id", str);
        }
        String str2 = c83403nh.A1W;
        if (str2 != null) {
            anonymousClass182.A0S("client_context", str2);
        }
        String str3 = c83403nh.A1r;
        if (str3 != null) {
            anonymousClass182.A0S("timestamp", str3);
        }
        Long l = c83403nh.A1S;
        if (l != null) {
            anonymousClass182.A0R("timestamp_in_micro", l.longValue());
        }
        String str4 = c83403nh.A1u;
        if (str4 != null) {
            anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str4);
        }
        String str5 = c83403nh.A1V;
        if (str5 != null) {
            anonymousClass182.A0S("auxiliary_text", str5);
        }
        anonymousClass182.A0Q("auxiliary_text_source_type", c83403nh.A00);
        if (c83403nh.A0n != null) {
            anonymousClass182.A0r("placeholder");
            AnonymousClass570 anonymousClass570 = c83403nh.A0n;
            anonymousClass182.A0d();
            String str6 = anonymousClass570.A02;
            if (str6 != null) {
                anonymousClass182.A0S("message_static", str6);
            }
            String str7 = anonymousClass570.A00;
            if (str7 != null) {
                anonymousClass182.A0S("details", str7);
            }
            String str8 = anonymousClass570.A03;
            if (str8 != null) {
                anonymousClass182.A0S(DialogModule.KEY_TITLE, str8);
            }
            String str9 = anonymousClass570.A01;
            if (str9 != null) {
                anonymousClass182.A0S(DialogModule.KEY_MESSAGE, str9);
            }
            anonymousClass182.A0T("is_linked", anonymousClass570.A04);
            anonymousClass182.A0a();
        }
        if (c83403nh.A08 != null) {
            anonymousClass182.A0r("expired_placeholder");
            C9C9 c9c9 = c83403nh.A08;
            anonymousClass182.A0d();
            String str10 = c9c9.A01;
            if (str10 != null) {
                anonymousClass182.A0S(DialogModule.KEY_TITLE, str10);
            }
            String str11 = c9c9.A00;
            if (str11 != null) {
                anonymousClass182.A0S(DialogModule.KEY_MESSAGE, str11);
            }
            anonymousClass182.A0a();
        }
        String str12 = c83403nh.A1q;
        if (str12 != null) {
            anonymousClass182.A0S("text", str12);
        }
        String str13 = c83403nh.A1g;
        if (str13 != null) {
            anonymousClass182.A0S("message_dialect", str13);
        }
        String str14 = c83403nh.A1t;
        if (str14 != null) {
            anonymousClass182.A0S("translated_message", str14);
        }
        String str15 = c83403nh.A1s;
        if (str15 != null) {
            anonymousClass182.A0S("translated_locale", str15);
        }
        if (c83403nh.A07 != null) {
            anonymousClass182.A0r("link");
            AbstractC1122154p.A00(c83403nh.A07, anonymousClass182);
        }
        if (c83403nh.A0N != null) {
            anonymousClass182.A0r("action_log");
            AbstractC83533nu.A00(anonymousClass182, c83403nh.A0N);
        }
        if (c83403nh.A0C != null) {
            anonymousClass182.A0r("instamadillo_action_log");
            C51753Mtc c51753Mtc = c83403nh.A0C;
            anonymousClass182.A0d();
            anonymousClass182.A0Q("action_log_type", c51753Mtc.A01);
            C50679MYx c50679MYx = (C50679MYx) c51753Mtc.A02;
            if (c50679MYx != null) {
                anonymousClass182.A0r("context");
                anonymousClass182.A0d();
                String str16 = c50679MYx.A01;
                if (str16 != null) {
                    anonymousClass182.A0S("theme_title", str16);
                }
                String str17 = c50679MYx.A00;
                if (str17 != null) {
                    anonymousClass182.A0S("screenshot_subtype", str17);
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        if (c83403nh.A0c != null) {
            anonymousClass182.A0r("video_call_event");
            AbstractC101854hw.A00(anonymousClass182, c83403nh.A0c);
        }
        if (c83403nh.A17 != null) {
            anonymousClass182.A0r("profile");
            User user = c83403nh.A17;
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        if (c83403nh.A0B != null) {
            anonymousClass182.A0r("product_share");
            C51755Mte c51755Mte = c83403nh.A0B;
            anonymousClass182.A0d();
            ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) c51755Mte.A00;
            if (productDetailsProductItemDict != null) {
                anonymousClass182.A0r("product");
                AbstractC111134zU.A00(anonymousClass182, productDetailsProductItemDict);
            }
            anonymousClass182.A0a();
        }
        if (c83403nh.A2A != null) {
            C16V.A03(anonymousClass182, "preview_medias");
            for (C38231qD c38231qD : c83403nh.A2A) {
                if (c38231qD != null) {
                    IOX.A00(anonymousClass182, c38231qD);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c83403nh.A0s != null) {
            anonymousClass182.A0r("media");
            C38321qM c38321qM = c83403nh.A0s;
            C38801rC c38801rC = C38321qM.A0h;
            C38801rC.A07(anonymousClass182, c38321qM);
        }
        if (c83403nh.A0t != null) {
            anonymousClass182.A0r("media_share");
            C38321qM c38321qM2 = c83403nh.A0t;
            C38801rC c38801rC2 = C38321qM.A0h;
            C38801rC.A07(anonymousClass182, c38321qM2);
        }
        if (c83403nh.A0A != null) {
            anonymousClass182.A0r("direct_media_share");
            FUV.A00(c83403nh.A0A, anonymousClass182);
        }
        if (c83403nh.A0u != null) {
            anonymousClass182.A0r("raven_media");
            C38321qM c38321qM3 = c83403nh.A0u;
            C38801rC c38801rC3 = C38321qM.A0h;
            C38801rC.A07(anonymousClass182, c38321qM3);
        }
        if (c83403nh.A0e != null) {
            anonymousClass182.A0r("visual_media");
            AbstractC101574hS.A00(anonymousClass182, c83403nh.A0e);
        }
        if (c83403nh.A0d != null) {
            anonymousClass182.A0r("message_item_dict");
            AbstractC101574hS.A00(anonymousClass182, c83403nh.A0d);
        }
        if (c83403nh.A0g != null) {
            anonymousClass182.A0r("voice_media");
            C4G1.A00(anonymousClass182, c83403nh.A0g);
        }
        if (c83403nh.A23 != null) {
            C16V.A03(anonymousClass182, "seen_user_ids");
            for (String str18 : c83403nh.A23) {
                if (str18 != null) {
                    anonymousClass182.A0u(str18);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c83403nh.A0Z != null) {
            anonymousClass182.A0r("reel_share");
            LCB.A00(anonymousClass182, c83403nh.A0Z);
        }
        if (c83403nh.A0b != null) {
            anonymousClass182.A0r("story_share");
            LCC.A00(anonymousClass182, c83403nh.A0b);
        }
        if (c83403nh.A0F != null) {
            anonymousClass182.A0r("live_video_share");
            FUW.A00(c83403nh.A0F, anonymousClass182);
        }
        if (c83403nh.A0U != null) {
            anonymousClass182.A0r(AbstractC43591JPw.A00(1143));
            IQH.A00(anonymousClass182, c83403nh.A0U);
        }
        if (c83403nh.A0T != null) {
            anonymousClass182.A0r(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
            LC8.A00(anonymousClass182, c83403nh.A0T);
        }
        if (c83403nh.A06 != null) {
            anonymousClass182.A0r("felix_share");
            FUU.A00(c83403nh.A06, anonymousClass182);
        }
        if (c83403nh.A0S != null) {
            anonymousClass182.A0r("clip");
            IQG.A00(anonymousClass182, c83403nh.A0S);
        }
        if (c83403nh.A0h != null) {
            anonymousClass182.A0r("voting_info_center");
            anonymousClass182.A0d();
            anonymousClass182.A0a();
        }
        if (c83403nh.A0P != null) {
            anonymousClass182.A0r("ar_effect");
            LC6.A00(anonymousClass182, c83403nh.A0P);
        }
        String str19 = c83403nh.A1d;
        if (str19 != null) {
            anonymousClass182.A0S("like", str19);
        }
        if (c83403nh.A0j != null) {
            anonymousClass182.A0r("xma");
            AbstractC910043s.A00(anonymousClass182, c83403nh.A0j);
        }
        if (c83403nh.A20 != null) {
            C16V.A03(anonymousClass182, "clip_watched_action_logs");
            for (C34501FIn c34501FIn : c83403nh.A20) {
                if (c34501FIn != null) {
                    anonymousClass182.A0d();
                    anonymousClass182.A0S("user_igid", c34501FIn.A01);
                    anonymousClass182.A0R("watched_at_ms", c34501FIn.A00);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        if (c83403nh.A0i != null) {
            anonymousClass182.A0r("avatar_note_reply");
            AbstractC910043s.A00(anonymousClass182, c83403nh.A0i);
        }
        if (c83403nh.A26 != null) {
            C16V.A03(anonymousClass182, "hscroll_share");
            for (C910143t c910143t : c83403nh.A26) {
                if (c910143t != null) {
                    AbstractC910043s.A00(anonymousClass182, c910143t);
                }
            }
            anonymousClass182.A0Z();
        }
        C2EY c2ey2 = c83403nh.A0z;
        if (c2ey2 != null) {
            anonymousClass182.A0S("message_item_type", c2ey2.toString());
        }
        if (c83403nh.A0X != null) {
            anonymousClass182.A0r("reactions");
            C910443z c910443z = c83403nh.A0X;
            anonymousClass182.A0d();
            if (c910443z.A01 != null) {
                C16V.A03(anonymousClass182, "likes");
                for (AnonymousClass441 anonymousClass441 : c910443z.A01) {
                    if (anonymousClass441 != null) {
                        AnonymousClass440.A00(anonymousClass182, anonymousClass441);
                    }
                }
                anonymousClass182.A0Z();
            }
            if (c910443z.A00 != null) {
                C16V.A03(anonymousClass182, "emojis");
                for (AnonymousClass441 anonymousClass4412 : c910443z.A00) {
                    if (anonymousClass4412 != null) {
                        AnonymousClass440.A00(anonymousClass182, anonymousClass4412);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        if (c83403nh.A1y != null) {
            anonymousClass182.A0r("user_based_emoji_reactions");
            anonymousClass182.A0d();
            for (Map.Entry entry : c83403nh.A1y.entrySet()) {
                if (!C16V.A04(anonymousClass182, entry)) {
                    AnonymousClass444 anonymousClass444 = (AnonymousClass444) entry.getValue();
                    C14360o3.A0B(anonymousClass444, 1);
                    anonymousClass182.A0c();
                    Iterator it = anonymousClass444.A00.iterator();
                    while (it.hasNext()) {
                        AnonymousClass440.A00(anonymousClass182, (AnonymousClass441) it.next());
                    }
                    anonymousClass182.A0Z();
                }
            }
            anonymousClass182.A0a();
        }
        if (c83403nh.A1z != null) {
            anonymousClass182.A0r("media_interventions");
            anonymousClass182.A0d();
            for (Map.Entry entry2 : c83403nh.A1z.entrySet()) {
                if (!C16V.A04(anonymousClass182, entry2)) {
                    anonymousClass182.A0h(((Number) entry2.getValue()).intValue());
                }
            }
            anonymousClass182.A0a();
        }
        if (c83403nh.A22 != null) {
            C16V.A03(anonymousClass182, "count_based_emoji_reactions");
            for (DirectCountBasedReaction directCountBasedReaction : c83403nh.A22) {
                if (directCountBasedReaction != null) {
                    anonymousClass182.A0d();
                    anonymousClass182.A0S("emoji", directCountBasedReaction.A01);
                    anonymousClass182.A0Q("count", directCountBasedReaction.A00);
                    anonymousClass182.A0T("is_viewer_reacted", directCountBasedReaction.A02);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        if (c83403nh.A24 != null) {
            C16V.A03(anonymousClass182, "edit_history");
            for (DirectMessageEditHistory directMessageEditHistory : c83403nh.A24) {
                if (directMessageEditHistory != null) {
                    anonymousClass182.A0d();
                    String str20 = directMessageEditHistory.A01;
                    if (str20 != null) {
                        anonymousClass182.A0S("body", str20);
                    }
                    anonymousClass182.A0R("timestamp", directMessageEditHistory.A00);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0T("hide_in_thread", c83403nh.A2D);
        if (c83403nh.A0y != null) {
            anonymousClass182.A0r("thread_key");
            AbstractC83623o5.A00(anonymousClass182, c83403nh.A0y);
        }
        if (c83403nh.A0x != null) {
            anonymousClass182.A0r("direct_thread_id");
            C83693oE c83693oE = c83403nh.A0x;
            anonymousClass182.A0d();
            String str21 = c83693oE.A00;
            if (str21 != null) {
                anonymousClass182.A0S("threadId", str21);
            }
            anonymousClass182.A0a();
        }
        Integer num = c83403nh.A1I;
        if (num != null) {
            anonymousClass182.A0Q("expiring_media_client_seen_count", num.intValue());
        }
        anonymousClass182.A0Q("seen_count", c83403nh.A02);
        if (c83403nh.A0f != null) {
            anonymousClass182.A0r("expiring_media_action_summary");
            AbstractC101654ha.A00(anonymousClass182, c83403nh.A0f);
        }
        String str22 = c83403nh.A1x;
        if (str22 != null) {
            anonymousClass182.A0S("reply_type", str22);
        }
        String str23 = c83403nh.A1v;
        if (str23 != null) {
            anonymousClass182.A0S("view_mode", str23);
        }
        anonymousClass182.A0R("replay_expiring_at_us", c83403nh.A03);
        if (c83403nh.A0R != null) {
            anonymousClass182.A0r("cta_link");
            IEQ ieq = c83403nh.A0R;
            anonymousClass182.A0d();
            String str24 = ieq.A01;
            if (str24 != null) {
                anonymousClass182.A0S("cta_link_type", str24);
            }
            String str25 = ieq.A00;
            if (str25 != null) {
                anonymousClass182.A0S("direct_app_status", str25);
            }
            anonymousClass182.A0a();
        }
        if (c83403nh.A12 != null) {
            anonymousClass182.A0r("animated_media");
            C54V.A00(anonymousClass182, c83403nh.A12);
        }
        if (c83403nh.A15 != null) {
            anonymousClass182.A0r("store_sticker");
            AbstractC47869LCp.A00(anonymousClass182, c83403nh.A15);
        }
        if (c83403nh.A0I != null) {
            anonymousClass182.A0r("static_sticker");
            AbstractC201078up.A00(anonymousClass182, c83403nh.A0I);
        }
        if (c83403nh.A0p != null) {
            anonymousClass182.A0r(AbstractC43591JPw.A00(1339));
            LCE.A00(anonymousClass182, c83403nh.A0p);
        }
        if (c83403nh.A0J != null) {
            anonymousClass182.A0r("note_text_reply");
            AbstractC47852LBv.A00(anonymousClass182, c83403nh.A0J);
        }
        if (c83403nh.A0a != null) {
            anonymousClass182.A0r("replied_to_message");
            AbstractC43642JSa.A01(anonymousClass182, c83403nh.A0a);
        }
        anonymousClass182.A0T("show_forward_attribution", c83403nh.A2F);
        Integer num2 = c83403nh.A1E;
        if (num2 != null) {
            anonymousClass182.A0Q("forward_score", num2.intValue());
        }
        String str26 = c83403nh.A1Z;
        if (str26 != null) {
            anonymousClass182.A0S("forward_source_invite_link", str26);
        }
        String str27 = c83403nh.A1a;
        if (str27 != null) {
            anonymousClass182.A0S("forward_source_item_id", str27);
        }
        String str28 = c83403nh.A1b;
        if (str28 != null) {
            anonymousClass182.A0S("forward_source_name", str28);
        }
        anonymousClass182.A0T("highly_forwarded_message", c83403nh.A2S);
        anonymousClass182.A0T("send_silently", c83403nh.A2O);
        if (c83403nh.A0W != null) {
            anonymousClass182.A0r("policy_violation");
            AbstractC31321Dpj.A00(anonymousClass182, c83403nh.A0W);
        }
        anonymousClass182.A0T("is_shh_mode", c83403nh.A2P);
        if (c83403nh.A0K != null) {
            anonymousClass182.A0r("instant_reply_info");
            FG7 fg7 = c83403nh.A0K;
            anonymousClass182.A0d();
            if (fg7.A00 != null) {
                C16V.A03(anonymousClass182, "instant_replies");
                for (C105954q9 c105954q9 : fg7.A00) {
                    if (c105954q9 != null) {
                        C4q8.A00(anonymousClass182, c105954q9);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        Boolean bool = c83403nh.A1B;
        if (bool != null) {
            anonymousClass182.A0T("is_visual_item_seen", bool.booleanValue());
        }
        if (c83403nh.A0V != null) {
            anonymousClass182.A0r("message_power_up");
            AnonymousClass544 anonymousClass544 = c83403nh.A0V;
            anonymousClass182.A0d();
            AnonymousClass541 anonymousClass541 = anonymousClass544.A00;
            if (anonymousClass541 != null) {
                anonymousClass182.A0Q("style", anonymousClass541.A00);
            }
            String str29 = anonymousClass544.A01;
            if (str29 != null) {
                anonymousClass182.A0S("attachment_url", str29);
            }
            anonymousClass182.A0a();
        }
        if (c83403nh.A28 != null) {
            C16V.A03(anonymousClass182, "mentioned_entities");
            for (MentionedEntity mentionedEntity : c83403nh.A28) {
                if (mentionedEntity != null) {
                    AnonymousClass545.A00(anonymousClass182, mentionedEntity);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c83403nh.A16 != null) {
            anonymousClass182.A0r("reaction_image_url_info");
            C17Y.A00(anonymousClass182, c83403nh.A16);
        }
        Integer num3 = c83403nh.A1G;
        if (num3 != null) {
            anonymousClass182.A0Q("save_icon_state", num3.intValue());
        }
        anonymousClass182.A0T("processed_business_suggestion", c83403nh.A2I);
        if (c83403nh.A21 != null) {
            C16V.A03(anonymousClass182, "commands");
            for (C206179Ba c206179Ba : c83403nh.A21) {
                if (c206179Ba != null) {
                    LCF.A00(c206179Ba, anonymousClass182);
                }
            }
            anonymousClass182.A0Z();
        }
        String str30 = c83403nh.A1o;
        if (str30 != null) {
            anonymousClass182.A0S("serialized_receiver_fetch_params", str30);
        }
        anonymousClass182.A0T("is_sent_by_viewer", c83403nh.A2N);
        Long l2 = c83403nh.A1R;
        if (l2 != null) {
            anonymousClass182.A0R("tq_seq_id", l2.longValue());
        }
        Boolean bool2 = c83403nh.A18;
        if (bool2 != null) {
            anonymousClass182.A0T("is_ae", bool2.booleanValue());
        }
        if (c83403nh.A0D != null) {
            anonymousClass182.A0r("armadillo_express_data");
            C45120Jxp c45120Jxp = c83403nh.A0D;
            anonymousClass182.A0d();
            anonymousClass182.A0T("is_from_xplat_reverb", c45120Jxp.A05);
            anonymousClass182.A0T("is_open_eb", c45120Jxp.A06);
            anonymousClass182.A0T("is_from_eb_server", c45120Jxp.A04);
            Boolean bool3 = (Boolean) c45120Jxp.A03;
            if (bool3 != null) {
                anonymousClass182.A0T("is_e2ee_attributed", bool3.booleanValue());
            }
            Boolean bool4 = (Boolean) c45120Jxp.A02;
            if (bool4 != null) {
                anonymousClass182.A0T("is_created_directly_from_server_response", bool4.booleanValue());
            }
            anonymousClass182.A0a();
        }
        Boolean bool5 = c83403nh.A19;
        if (bool5 != null) {
            anonymousClass182.A0T("is_ae_dual_send", bool5.booleanValue());
        }
        if (c83403nh.A0q != null) {
            anonymousClass182.A0r("comments_info");
            DirectMessageComments directMessageComments = c83403nh.A0q;
            anonymousClass182.A0d();
            anonymousClass182.A0Q("comment_count", directMessageComments.A00);
            String str31 = directMessageComments.A01;
            if (str31 != null) {
                anonymousClass182.A0S("facade_media_id", str31);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("is_replyable_in_bc", c83403nh.A2L);
        Integer num4 = c83403nh.A1D;
        if (num4 != null) {
            anonymousClass182.A0Q("channel_message_seen_count", num4.intValue());
        }
        String str32 = c83403nh.A1p;
        if (str32 != null) {
            anonymousClass182.A0S("send_attribution", str32);
        }
        anonymousClass182.A0T("is_saved_sticker", c83403nh.A2M);
        anonymousClass182.A0T("is_from_msys", c83403nh.A2G);
        Long l3 = c83403nh.A1L;
        if (l3 != null) {
            anonymousClass182.A0R("message_expiration_timestamp_ms", l3.longValue());
        }
        Long l4 = c83403nh.A1K;
        if (l4 != null) {
            anonymousClass182.A0R("message_ephemeral_lifetime_ms", l4.longValue());
        }
        Long l5 = c83403nh.A1J;
        if (l5 != null) {
            anonymousClass182.A0R(AbstractC43591JPw.A00(959), l5.longValue());
        }
        Long l6 = c83403nh.A1O;
        if (l6 != null) {
            anonymousClass182.A0R("ephemeral_view_timestamp_ms", l6.longValue());
        }
        Long l7 = c83403nh.A1M;
        if (l7 != null) {
            anonymousClass182.A0R(AbstractC43591JPw.A00(964), l7.longValue());
        }
        Long l8 = c83403nh.A1N;
        if (l8 != null) {
            anonymousClass182.A0R("ephemeral_after_view_expiration_timestamp_ms", l8.longValue());
        }
        anonymousClass182.A0T("is_ephemeral_exception", c83403nh.A2E);
        if (c83403nh.A2B != null) {
            C16V.A03(anonymousClass182, "receiver_fetch_preview_data");
            for (C910143t c910143t2 : c83403nh.A2B) {
                if (c910143t2 != null) {
                    AbstractC910043s.A00(anonymousClass182, c910143t2);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0T("is_receiver_fetch_pending", c83403nh.A2K);
        anonymousClass182.A0T("is_receiver_fetch_copy_message", c83403nh.A2J);
        String str33 = c83403nh.A1l;
        if (str33 != null) {
            anonymousClass182.A0S("receiver_fetch_action_type", str33);
        }
        String str34 = c83403nh.A1n;
        if (str34 != null) {
            anonymousClass182.A0S("receiver_fetch_content_type", str34);
        }
        String str35 = c83403nh.A1m;
        if (str35 != null) {
            anonymousClass182.A0S("receiver_fetch_content_owner", str35);
        }
        if (c83403nh.A0Q != null) {
            anonymousClass182.A0r("bot_metadata");
            C7BW c7bw = c83403nh.A0Q;
            anonymousClass182.A0d();
            String str36 = c7bw.A05;
            if (str36 != null) {
                anonymousClass182.A0S("response_id", str36);
            }
            Integer num5 = c7bw.A02;
            if (num5 != null) {
                if (1 - num5.intValue() != 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                anonymousClass182.A0Q("streaming_state", i);
            }
            C51752Mtb c51752Mtb = c7bw.A00;
            if (c51752Mtb != null) {
                anonymousClass182.A0r("sentiment");
                anonymousClass182.A0d();
                anonymousClass182.A0Q("sentiment_type", c51752Mtb.A01);
                anonymousClass182.A0Q("sentiment_intensity", c51752Mtb.A00);
                Number number = (Number) c51752Mtb.A02;
                if (number != null) {
                    anonymousClass182.A0Q("reaction", number.intValue());
                }
                anonymousClass182.A0a();
            }
            String str37 = c7bw.A04;
            if (str37 != null) {
                anonymousClass182.A0S("bot_invocation_otid", str37);
            }
            String str38 = c7bw.A09;
            if (str38 != null) {
                anonymousClass182.A0S("thread_subscription_action", str38);
            }
            String str39 = c7bw.A06;
            if (str39 != null) {
                anonymousClass182.A0S("message_image_source", str39);
            }
            String str40 = c7bw.A08;
            if (str40 != null) {
                anonymousClass182.A0S("prompt", str40);
            }
            List<String> list = c7bw.A0C;
            if (list != null) {
                C16V.A03(anonymousClass182, "bot_response_additional_message_otids");
                for (String str41 : list) {
                    if (str41 != null) {
                        anonymousClass182.A0u(str41);
                    }
                }
                anonymousClass182.A0Z();
            }
            String str42 = c7bw.A0B;
            if (str42 != null) {
                anonymousClass182.A0S("thread_subscription_product_type", str42);
            }
            String str43 = c7bw.A0A;
            if (str43 != null) {
                anonymousClass182.A0S("bot_subscription_id", str43);
            }
            String str44 = c7bw.A03;
            if (str44 != null) {
                anonymousClass182.A0S("bot_invocation_message_id", str44);
            }
            Integer num6 = c7bw.A01;
            if (num6 != null) {
                anonymousClass182.A0Q("bot_proactive_message_type", num6.intValue());
            }
            String str45 = c7bw.A07;
            if (str45 != null) {
                anonymousClass182.A0S("messaging_source", str45);
            }
            anonymousClass182.A0a();
        }
        if (c83403nh.A04 != null) {
            anonymousClass182.A0r("paid_partnership_info");
            C9B5 c9b5 = c83403nh.A04;
            anonymousClass182.A0d();
            anonymousClass182.A0T("is_paid_partnership", c9b5.A00);
            anonymousClass182.A0a();
        }
        if (c83403nh.A09 != null) {
            anonymousClass182.A0r("genai_params");
            AbstractC83783oN.A00(c83403nh.A09, anonymousClass182);
        }
        if (c83403nh.A0M != null) {
            anonymousClass182.A0r("ai_consumption_params");
            E6F e6f = c83403nh.A0M;
            anonymousClass182.A0d();
            String str46 = e6f.A02;
            if (str46 != null) {
                anonymousClass182.A0S("prompt", str46);
            }
            String str47 = e6f.A00;
            if (str47 != null) {
                anonymousClass182.A0S(TraceFieldType.ContentType, str47);
            }
            String str48 = e6f.A01;
            if (str48 != null) {
                anonymousClass182.A0S("mimicry_caption", str48);
            }
            anonymousClass182.A0a();
        }
        if (c83403nh.A0l != null) {
            anonymousClass182.A0r("image_glyphs");
            AbstractC69935Vy6.A00(anonymousClass182, c83403nh.A0l);
        }
        if (c83403nh.A29 != null) {
            C16V.A03(anonymousClass182, "mustache_ctas");
            for (C9CP c9cp : c83403nh.A29) {
                if (c9cp != null) {
                    C4G0.A00(c9cp, anonymousClass182);
                }
            }
            anonymousClass182.A0Z();
        }
        String str49 = c83403nh.A1h;
        if (str49 != null) {
            anonymousClass182.A0S("message_trace_id", str49);
        }
        anonymousClass182.A0Q("edit_count", c83403nh.A01);
        if (c83403nh.A0k != null) {
            anonymousClass182.A0r("ctx_ad_conversation_starter_info");
            C111254zn c111254zn = c83403nh.A0k;
            anonymousClass182.A0d();
            String str50 = c111254zn.A00;
            if (str50 != null) {
                anonymousClass182.A0S("welcome_message", str50);
            }
            if (c111254zn.A01 != null) {
                C16V.A03(anonymousClass182, "ice_breakers");
                for (C111274zp c111274zp : c111254zn.A01) {
                    if (c111274zp != null) {
                        anonymousClass182.A0d();
                        String str51 = c111274zp.A00;
                        if (str51 != null) {
                            anonymousClass182.A0S("text", str51);
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        String str52 = c83403nh.A1Y;
        if (str52 != null) {
            anonymousClass182.A0S("encrypted", str52);
        }
        String str53 = c83403nh.A1i;
        if (str53 != null) {
            anonymousClass182.A0S(AbstractC43591JPw.A00(1228), str53);
        }
        String str54 = c83403nh.A1X;
        if (str54 != null) {
            anonymousClass182.A0S("decryption_merge_error", str54);
        }
        if (c83403nh.A0O != null) {
            anonymousClass182.A0r("bloks_xma");
            C62519SEv c62519SEv = c83403nh.A0O;
            anonymousClass182.A0d();
            String str55 = c62519SEv.A01;
            if (str55 != null) {
                anonymousClass182.A0S("bloks_payload", str55);
            }
            anonymousClass182.A0a();
        }
        if (c83403nh.A0E != null) {
            anonymousClass182.A0r("in_app_notification_info");
            C45127Jxw c45127Jxw = c83403nh.A0E;
            anonymousClass182.A0d();
            Boolean bool6 = (Boolean) c45127Jxw.A00;
            if (bool6 != null) {
                anonymousClass182.A0T("should_in_app_notify", bool6.booleanValue());
            }
            String str56 = c45127Jxw.A01;
            if (str56 != null) {
                anonymousClass182.A0S("notification_message", str56);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("is_taken_down", c83403nh.A2Q);
        String str57 = c83403nh.A1j;
        if (str57 != null) {
            anonymousClass182.A0S("otid", str57);
        }
        Integer num7 = c83403nh.A1H;
        if (num7 != null) {
            anonymousClass182.A0Q("thread_locked_status", num7.intValue());
        }
        Long l9 = c83403nh.A1Q;
        if (l9 != null) {
            anonymousClass182.A0R(AbstractC43591JPw.A00(1300), l9.longValue());
        }
        anonymousClass182.A0T("is_pinned", c83403nh.A2H);
        if (c83403nh.A05 != null) {
            anonymousClass182.A0r("one_click_upsell");
            AbstractC126465nh.A00(c83403nh.A05, anonymousClass182);
        }
        if (c83403nh.A0m != null) {
            anonymousClass182.A0r("media_reaction_group");
            C83473no c83473no = c83403nh.A0m;
            anonymousClass182.A0d();
            if (c83473no.A00 != null) {
                C16V.A03(anonymousClass182, "media_reaction_group_reactions");
                Iterator it2 = c83473no.A00.iterator();
                while (it2.hasNext()) {
                    E6A e6a = (E6A) it2.next();
                    if (e6a != null) {
                        anonymousClass182.A0d();
                        String str58 = e6a.A00;
                        if (str58 != null) {
                            anonymousClass182.A0S("media_reaction_media_id", str58);
                        }
                        if (e6a.A01 != null) {
                            C16V.A03(anonymousClass182, "media_reaction_reaction_per_media");
                            Iterator it3 = e6a.A01.iterator();
                            while (it3.hasNext()) {
                                C50679MYx c50679MYx2 = (C50679MYx) it3.next();
                                if (c50679MYx2 != null) {
                                    anonymousClass182.A0d();
                                    String str59 = c50679MYx2.A01;
                                    if (str59 != null) {
                                        anonymousClass182.A0S("sender_emoji_sender", str59);
                                    }
                                    String str60 = c50679MYx2.A00;
                                    if (str60 != null) {
                                        anonymousClass182.A0S("sender_emoji_emoji", str60);
                                    }
                                    anonymousClass182.A0a();
                                }
                            }
                            anonymousClass182.A0Z();
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
