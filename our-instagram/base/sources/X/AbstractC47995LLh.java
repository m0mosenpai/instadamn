package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.LLh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47995LLh {
    /* JADX WARN: Removed duplicated region for block: B:62:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C25621Ms A00(X.C9CK r18, X.C26069Bfx r19, com.instagram.common.gallery.metadata.MediaUploadMetadata r20, com.instagram.common.session.UserSession r21, X.L1W r22, X.AnonymousClass442 r23, com.instagram.model.direct.DirectThreadKey r24, X.EnumC40111tc r25, java.lang.Boolean r26, java.lang.Boolean r27, java.lang.Long r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.util.List r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC47995LLh.A00(X.9CK, X.Bfx, com.instagram.common.gallery.metadata.MediaUploadMetadata, com.instagram.common.session.UserSession, X.L1W, X.442, com.instagram.model.direct.DirectThreadKey, X.1tc, java.lang.Boolean, java.lang.Boolean, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean, boolean, boolean, boolean):X.1Ms");
    }

    public static GifUrlImpl A0C(C2JO c2jo, DirectAnimatedMedia directAnimatedMedia, String str) {
        c2jo.A09(str, "author_username");
        GifUrlImpl gifUrlImpl = directAnimatedMedia.A02;
        c2jo.A07(Integer.valueOf((int) gifUrlImpl.A02.floatValue()), IgReactMediaPickerNativeModule.HEIGHT);
        c2jo.A07(Integer.valueOf((int) gifUrlImpl.A03.floatValue()), IgReactMediaPickerNativeModule.WIDTH);
        c2jo.A09(gifUrlImpl.A09, "url");
        c2jo.A09(gifUrlImpl.A0A, "webp");
        return gifUrlImpl;
    }

    public static void A0D(C25621Ms c25621Ms, L1W l1w, DirectThreadKey directThreadKey, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        LLX.A04(c25621Ms, l1w, directThreadKey, str, str2, str3, "", z, z2, z3);
    }

    public static void A0E(C25621Ms c25621Ms, String str, String str2) {
        if (str != null && str2 != null) {
            c25621Ms.A0H("private_reply_post_link", str);
            c25621Ms.A0H("private_reply_comment_id", str2);
        }
    }

    public static void A0F(AbstractC23721Ec abstractC23721Ec, AnonymousClass442 anonymousClass442) {
        if (anonymousClass442 != null) {
            abstractC23721Ec.A9s("replied_to_action_source", anonymousClass442.A0Q);
            abstractC23721Ec.A9s("replied_to_client_context", anonymousClass442.A0R);
            abstractC23721Ec.A9s("replied_to_item_id", anonymousClass442.A0T);
            abstractC23721Ec.A9s("replied_to_target_type", anonymousClass442.A0F.A00);
            abstractC23721Ec.A9s("replied_to_user_id", anonymousClass442.A0U);
        }
    }

    public static C25621Ms A02(UserSession userSession, L3Y l3y, DirectThreadKey directThreadKey, Integer num, String str) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("direct_v2/threads/broadcast/status_reply/");
        A0M.A9s("status_id", l3y.A02);
        A0M.A9s("status_key", l3y.A03);
        A0M.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
        A0M.A9s("reply_type", AbstractC46857Knq.A00(num));
        AbstractC31176DnK.A1P(A0M, "status_author_id", str);
        return A0M;
    }

    public static C25621Ms A03(UserSession userSession, DirectThreadKey directThreadKey, MessageIdentifier messageIdentifier, Integer num, String str, List list) {
        String str2;
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("direct_v2/shared_album/modify_media/");
        A0M.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
        A0M.A9s("album_id", messageIdentifier.A01);
        if (num.intValue() != 0) {
            str2 = "DELETE";
        } else {
            str2 = "ADD";
        }
        A0M.A9s("modification_type", str2);
        A0M.A9s("media_ids", AbstractC31175DnJ.A0b(list));
        if (str != null) {
            A0M.A9s("client_context", str);
        }
        return A0M;
    }

    public static C25621Ms A04(UserSession userSession, DirectThreadKey directThreadKey, MessageIdentifier messageIdentifier, String str, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l = AbstractC43592JPx.A0l(it).A2I;
            if (l != null) {
                AbstractC166997dE.A1S(l, A1E);
            }
        }
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("direct_v2/shared_album/initialize/");
        A0M.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
        A0M.A9s("seed_message_id", messageIdentifier.A01);
        A0M.A9s("client_context", str);
        A0M.A9s("media_ids", AbstractC31175DnJ.A0b(A1E));
        A0M.A9s("seed_message_client_context", messageIdentifier.A00());
        return A0M;
    }

    public static C1ON A05(UserSession userSession, L1W l1w, DirectForwardingParams directForwardingParams, DirectThreadKey directThreadKey, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("direct_v2/threads/broadcast/forward/");
        A0M.A0S(C32207EDg.class, C34793FUv.class);
        A0D(A0M, l1w, directThreadKey, str, str2, str3, z, z2, z3);
        if (directForwardingParams != null) {
            A0M.A9s("forwarded_from_thread_id", directForwardingParams.A07);
            A0M.A9s("forwarded_from_thread_item_id", directForwardingParams.A06);
            Integer num = directForwardingParams.A01;
            if (num != null) {
                A0M.A0D(AbstractC111324zv.A00(946), num.intValue());
            }
        }
        return A0M.A0N();
    }

    public static C1ON A06(UserSession userSession, L1W l1w, C47791L8x c47791L8x, DirectThreadKey directThreadKey, Boolean bool, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        String str6;
        try {
            str6 = AbstractC46844Knd.A00(c47791L8x);
        } catch (IOException e) {
            C0w9.A06("DirectMessageApi", "Error while parsing DirectPollMessage", e);
            str6 = null;
        }
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0E = str3;
        A0M.A9s("poll", str6);
        A0M.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
        A0M.A0S(C32207EDg.class, C34793FUv.class);
        if (str != null) {
            A0M.A9s("poll_question_id", str);
        }
        if (bool != null) {
            A0M.A0I("should_xpost", bool.booleanValue());
        }
        A0D(A0M, l1w, directThreadKey, str2, str4, str5, z, false, z2);
        A0M.A0R = true;
        return A0M.A0N();
    }

    public static C1ON A07(UserSession userSession, L1W l1w, AnonymousClass442 anonymousClass442, DirectThreadKey directThreadKey, DirectAnimatedMedia directAnimatedMedia, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("direct_v2/threads/broadcast/animated_media/");
        A0M.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_ID, directAnimatedMedia.A05);
        A0M.A9s("offline_threading_id", str);
        A0M.A9s("client_context", str);
        AbstractC31176DnK.A1P(A0M, AbstractC31688Dvt.A01(), C16030qx.A00(AbstractC12290kX.A00));
        LLX.A0A(A0M, directThreadKey);
        A0M.A9s("mutation_token", str2);
        if (z) {
            A0M.A9s("sampled", "true");
        }
        if (str3 != null) {
            A0M.A9s("send_attribution", str3);
        }
        Boolean bool = directAnimatedMedia.A04;
        if (bool != null && bool.booleanValue()) {
            A0M.A9s("is_random", "true");
        }
        if (directAnimatedMedia.A06) {
            A0M.A9s("is_sticker", "true");
        }
        if (z3) {
            A0M.A9s("send_silently", "true");
        }
        String str4 = directAnimatedMedia.A00;
        if (str4 != null) {
            A0M.A9s("gif_category_position", str4);
        }
        A0M.A0J("is_shh_mode", z2);
        LLX.A03(A0M, l1w);
        A0F(A0M, anonymousClass442);
        return A0M.A0N();
    }

    public static C1ON A08(UserSession userSession, C44996Jvm c44996Jvm, DirectThreadKey directThreadKey, Long l, String str, String str2, boolean z) {
        String str3;
        AbstractC47211Ktk abstractC47211Ktk;
        JSONObject A0q = AbstractC31171DnF.A0q();
        if (z) {
            str3 = "media_note_id";
        } else {
            str3 = "note_igid";
        }
        try {
            A0q.put(str3, String.valueOf(l));
            if (str2 != null) {
                A0q.put("audio_cluster_id", str2);
            }
        } catch (JSONException unused) {
            C0w9.A03("DirectMessageApi", "Error forming json for note reply");
        }
        if (z) {
            abstractC47211Ktk = AbstractC47211Ktk.A04;
        } else {
            abstractC47211Ktk = AbstractC47211Ktk.A0M;
        }
        C25621Ms A00 = LLX.A00(userSession, abstractC47211Ktk, c44996Jvm, directThreadKey, A0q);
        AbstractC31176DnK.A1P(A00, "text", str);
        return A00.A0N();
    }

    public static C1ON A09(UserSession userSession, String str) {
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        A0N.A0B("direct_v2/get_note_join_chat_thread_preview_info/");
        A0N.A9s("note_id", str);
        return AbstractC31172DnG.A0S(A0N, C67843UzG.class, C69938Vy9.class);
    }

    public static C1ON A0A(UserSession userSession, String str, String str2) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("direct_v2/join_thread_via_group_link/");
        A0M.A9s("group_link_hash", str);
        A0M.A0S(EBV.class, C34795FUx.class);
        if (str2 != null) {
            A0M.A9s("group_link_source", str2);
        }
        return A0M.A0N();
    }

    public static C1ON A0B(UserSession userSession, String str, String str2, String str3) {
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        A0N.A0B("direct_v2/get_group_link_preview_info/");
        A0N.A9s("group_link_hash", str);
        A0N.A0S(C67843UzG.class, C69938Vy9.class);
        if (str2 != null) {
            A0N.A9s("group_link_source", str2);
        }
        if (str3 != null) {
            A0N.A9s("shared_content_hash", str3);
        }
        return A0N.A0N();
    }

    public static void A0G(C1P1 c1p1, UserSession userSession, C1GL c1gl, C45026JwH c45026JwH) {
        String str;
        String A0n = AbstractC166997dE.A0n();
        DirectAnimatedMedia directAnimatedMedia = c45026JwH.A00;
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, A0n, "client_mutation_id");
        C2JO c2jo = new C2JO();
        c2jo.A09(directAnimatedMedia.A05, "giphy_id");
        DirectAnimatedMediaUser directAnimatedMediaUser = directAnimatedMedia.A01;
        if (directAnimatedMediaUser != null) {
            str = directAnimatedMediaUser.A00;
        } else {
            str = null;
        }
        GifUrlImpl A0C = A0C(c2jo, directAnimatedMedia, str);
        c2jo.A07(Integer.valueOf(AbstractC167017dG.A0K(A0C.A05)), "size");
        c2jo.A07(Integer.valueOf(AbstractC167017dG.A0K(A0C.A06)), "webp_size");
        c2jo.A05("tags", AbstractC166987dD.A1E());
        c2jo.A09(A0C.A08, "mp4");
        c2jo.A07(Integer.valueOf(AbstractC25227BEk.A06(A0C.A04, 0)), "mp4_size");
        AbstractC43592JPx.A1O(A0T, c2jo, "giphy_data");
        C2JM A0b = AbstractC25225BEi.A0b();
        C1ON A00 = AnonymousClass963.A00(AbstractC40691uc.A01(userSession).A03(new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "IGSaveGifMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59421QeI.class, true, null, 8, "input", "xfb_save_gif_for_eimu", AbstractC166987dD.A1E())));
        A00.A00 = c1p1;
        c1gl.schedule(A00);
    }

    public static void A0H(C1P1 c1p1, UserSession userSession, C1GL c1gl, C45026JwH c45026JwH) {
        String str;
        String A0n = AbstractC166997dE.A0n();
        DirectAnimatedMedia directAnimatedMedia = c45026JwH.A00;
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, A0n, "client_mutation_id");
        C2JO c2jo = new C2JO();
        c2jo.A09(directAnimatedMedia.A05, "giphy_id");
        DirectAnimatedMediaUser directAnimatedMediaUser = directAnimatedMedia.A01;
        if (directAnimatedMediaUser != null) {
            str = directAnimatedMediaUser.A00;
        } else {
            str = null;
        }
        GifUrlImpl A0C = A0C(c2jo, directAnimatedMedia, str);
        c2jo.A07(Integer.valueOf(AbstractC167017dG.A0K(A0C.A05)), "size");
        c2jo.A07(Integer.valueOf(AbstractC167017dG.A0K(A0C.A06)), "webp_size");
        c2jo.A05("tags", AbstractC166987dD.A1E());
        c2jo.A09(A0C.A08, "mp4");
        c2jo.A07(Integer.valueOf(AbstractC25227BEk.A06(A0C.A04, 0)), "mp4_size");
        AbstractC43592JPx.A1O(A0T, c2jo, "giphy_data");
        C2JM A0b = AbstractC25225BEi.A0b();
        C1ON A00 = AnonymousClass963.A00(AbstractC40691uc.A01(userSession).A03(new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "IGUnsaveGifMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59446Qeh.class, true, null, 8, "input", "xfb_unsave_gif_for_eimu", AbstractC166987dD.A1E())));
        A00.A00 = c1p1;
        c1gl.schedule(A00);
    }

    public static void A0I(UserSession userSession, String str) {
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, AbstractC166997dE.A0n(), "client_mutation_id");
        C0CA.A00(A0T, str, "sticker_id");
        C2JM A0b = AbstractC25225BEi.A0b();
        AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "IGSaveStickerMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59422QeJ.class, true, null, 8, "input", "xfb_save_sticker_for_eimu", AbstractC166987dD.A1E()), new C67936V3b(4));
    }

    public static void A0J(UserSession userSession, String str) {
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, AbstractC166997dE.A0n(), "client_mutation_id");
        C0CA.A00(A0T, str, "sticker_id");
        C2JM A0b = AbstractC25225BEi.A0b();
        AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "IGUnsaveStickerMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59447Qei.class, true, null, 8, "input", "xfb_unsave_sticker_for_eimu", AbstractC166987dD.A1E()), new C67936V3b(5));
    }

    public static C25621Ms A01(UserSession userSession, L1W l1w, C38321qM c38321qM, DirectThreadKey directThreadKey, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        C2EY c2ey = C2EY.A0G;
        A0M.A0B("direct_v2/threads/broadcast/clip_share/");
        A0M.A0S(C32207EDg.class, C34793FUv.class);
        C14360o3.A0B(directThreadKey, 1);
        LLX.A0A(A0M, directThreadKey);
        A0M.A9s("offline_threading_id", str);
        A0M.A9s("client_context", str);
        A0M.A9s("action", "send_item");
        A0M.A9s("text", str2);
        String A00 = C16030qx.A00(AbstractC12290kX.A00);
        C14360o3.A07(A00);
        A0M.A9s(AbstractC31688Dvt.A01(), A00);
        A0M.A9s("mutation_token", str4);
        if (str5 != null) {
            A0M.A9s("send_attribution", str5);
        }
        if (z) {
            A0M.A9s("sampled", "true");
        }
        if (z3) {
            A0M.A9s("send_silently", "true");
        }
        C1QN c1qn = C1QM.A00;
        C14360o3.A07(c1qn);
        String str9 = c1qn.A02.A02;
        if (str9 != null) {
            A0M.A9s("nav_chain", str9);
        }
        if (str6 != null && str6.length() > 0) {
            A0M.A9s("reshared_ad_id", str6);
        }
        LLX.A03(A0M, l1w);
        A0M.A0J("is_shh_mode", z2);
        if (c38321qM.A0C.Bns() != null) {
            A0M.A9s("repost_id", c38321qM.A0C.Bns().Bnr());
        }
        if (z5) {
            A0M.A9s("should_skip_genai_eval", "true");
        }
        if (str7 != null) {
            String[] split = str7.split("_");
            if (split.length > 0) {
                A0M.A9s("spin_id", split[0]);
                str3 = AbstractC13670mt.A0G(str5, "spins_reply") ? "CLIPS_SPIN_REPLY" : "CLIPS_SPIN_SHARE";
            }
        }
        A0M.A9s("media_id", c38321qM.A38());
        A0M.A9s("ranking_info_token", c38321qM.A0C.getLoggingInfoToken());
        A0M.A0H("text", str2);
        A0M.A0H("social_context_share_type", str3);
        A0M.A0H("inventory_source", c38321qM.A0C.BJN());
        A0M.A0H("blend_recommender_igids", str8);
        if (c38321qM.CdW()) {
            A0M.A0H("tracking_token", c38321qM.A33());
        }
        C40041tV c40041tV = c38321qM.A0d;
        if (!c40041tV.A05.A00.isEmpty() && C18U.A06(C06090Tz.A05, userSession, 36321795392939850L)) {
            A0M.A9s("comment_id", ((C84923qg) c40041tV.A05.A00.get(0)).A0G);
        }
        A0M.A0I("is_x_transport_forward", z4);
        return A0M;
    }
}
