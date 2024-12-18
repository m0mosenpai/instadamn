package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ClientDisplayMethod;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.api.schemas.CommentRestrictStatus;
import com.instagram.api.schemas.MediaType;
import com.instagram.api.schemas.PrivateReplyStatus;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1rG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38841rG {
    public static C38891rO parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            C38706H2r c38706H2r = null;
            String str = null;
            String str2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            C5FI c5fi = null;
            ArrayList arrayList = null;
            Integer num = null;
            Integer num2 = null;
            Boolean bool3 = null;
            Integer num3 = null;
            Integer num4 = null;
            ArrayList arrayList2 = null;
            Long l = null;
            Long l2 = null;
            String str3 = null;
            Boolean bool4 = null;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            Integer num5 = null;
            CommentGiphyMediaInfo commentGiphyMediaInfo = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            String str4 = null;
            C38707H2t c38707H2t = null;
            ClientDisplayMethod clientDisplayMethod = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            Boolean bool13 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            Boolean bool16 = null;
            Boolean bool17 = null;
            Boolean bool18 = null;
            Boolean bool19 = null;
            Boolean bool20 = null;
            C110864yy c110864yy = null;
            String str5 = null;
            String str6 = null;
            C5FO c5fo = null;
            HashMap hashMap = null;
            String str7 = null;
            String str8 = null;
            Integer num6 = null;
            Integer num7 = null;
            String str9 = null;
            Integer num8 = null;
            String str10 = null;
            ArrayList arrayList6 = null;
            PrivateReplyStatus privateReplyStatus = null;
            String str11 = null;
            CommentRestrictStatus commentRestrictStatus = null;
            Boolean bool21 = null;
            Boolean bool22 = null;
            String str12 = null;
            String str13 = null;
            Integer num9 = null;
            Integer num10 = null;
            User user = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    if ("avatar_media_info".equals(A0q)) {
                        c38706H2r = AbstractC39840Hlo.parseFromJson(c16l);
                    } else if ("background_color".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str = null;
                        } else {
                            str = c16l.A1P();
                        }
                    } else if ("background_color_alpha".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str2 = null;
                        } else {
                            str2 = c16l.A1P();
                        }
                    } else if ("can_viewer_hide".equals(A0q)) {
                        bool = Boolean.valueOf(c16l.A0d());
                    } else if ("can_viewer_unhide".equals(A0q)) {
                        bool2 = Boolean.valueOf(c16l.A0d());
                    } else if ("caption_area".equals(A0q)) {
                        c5fi = IR5.parseFromJson(c16l);
                    } else if ("carousel_child_mentions".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                H2Z parseFromJson = AbstractC39801HlB.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                    } else if ("child_comment_count".equals(A0q)) {
                        num = Integer.valueOf(c16l.A1D());
                    } else if ("child_comment_index".equals(A0q)) {
                        num2 = Integer.valueOf(c16l.A1D());
                    } else if ("comment_has_a_visual_reply_media".equals(A0q)) {
                        bool3 = Boolean.valueOf(c16l.A0d());
                    } else if ("comment_index".equals(A0q)) {
                        num3 = Integer.valueOf(c16l.A1D());
                    } else if ("comment_like_count".equals(A0q)) {
                        num4 = Integer.valueOf(c16l.A1D());
                    } else if ("comment_social_context_likers".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Parcelable.Creator creator = User.CREATOR;
                                User A00 = AbstractC38851rI.A00(c16l, false);
                                if (A00 != null) {
                                    arrayList2.add(A00);
                                }
                            }
                        } else {
                            arrayList2 = null;
                        }
                    } else if ("created_at".equals(A0q)) {
                        l = Long.valueOf(c16l.A0y());
                    } else if ("created_at_utc".equals(A0q)) {
                        l2 = Long.valueOf(c16l.A0y());
                    } else if ("default_caption".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str3 = null;
                        } else {
                            str3 = c16l.A1P();
                        }
                    } else if ("did_report_as_spam".equals(A0q)) {
                        bool4 = Boolean.valueOf(c16l.A0d());
                    } else if ("distinct_emojis_used".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList3 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                    arrayList3.add(A1P4);
                                }
                            }
                        } else {
                            arrayList3 = null;
                        }
                    } else if ("e2ee_mentioned_user_list".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList4 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Parcelable.Creator creator2 = User.CREATOR;
                                User A002 = AbstractC38851rI.A00(c16l, false);
                                if (A002 != null) {
                                    arrayList4.add(A002);
                                }
                            }
                        } else {
                            arrayList4 = null;
                        }
                    } else if ("fb_mentioned_users".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList5 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                H3I parseFromJson2 = AbstractC39918Hn8.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList5.add(parseFromJson2);
                                }
                            }
                        } else {
                            arrayList5 = null;
                        }
                    } else if ("first_sentence_length".equals(A0q)) {
                        num5 = Integer.valueOf(c16l.A1D());
                    } else if ("giphy_media_info".equals(A0q)) {
                        commentGiphyMediaInfo = AbstractC41253INt.parseFromJson(c16l);
                    } else if ("has_liked_comment".equals(A0q)) {
                        bool5 = Boolean.valueOf(c16l.A0d());
                    } else if ("has_more_head_child_comments".equals(A0q)) {
                        bool6 = Boolean.valueOf(c16l.A0d());
                    } else if ("has_more_tail_child_comments".equals(A0q)) {
                        bool7 = Boolean.valueOf(c16l.A0d());
                    } else if ("has_translation".equals(A0q)) {
                        bool8 = Boolean.valueOf(c16l.A0d());
                    } else if ("hide_username".equals(A0q)) {
                        bool9 = Boolean.valueOf(c16l.A0d());
                    } else if ("idempotence_token".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str4 = null;
                        } else {
                            str4 = c16l.A1P();
                        }
                    } else if ("imagine_create_media_info".equals(A0q)) {
                        c38707H2t = AbstractC39844Hls.parseFromJson(c16l);
                    } else if ("inline_composer_display_condition".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            A1P3 = null;
                        } else {
                            A1P3 = c16l.A1P();
                        }
                        clientDisplayMethod = (ClientDisplayMethod) ClientDisplayMethod.A01.get(A1P3);
                        if (clientDisplayMethod == null) {
                            clientDisplayMethod = ClientDisplayMethod.A08;
                        }
                    } else if ("is_covered".equals(A0q)) {
                        bool10 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_created_by_media_owner".equals(A0q)) {
                        bool11 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_goal_setting_message".equals(A0q)) {
                        bool12 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_high_value".equals(A0q)) {
                        bool13 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_liked_by_media_owner".equals(A0q)) {
                        bool14 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_limited".equals(A0q)) {
                        bool15 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_new".equals(A0q)) {
                        bool16 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_pinned".equals(A0q)) {
                        bool17 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_question".equals(A0q)) {
                        bool18 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_ranked_comment".equals(A0q)) {
                        bool19 = Boolean.valueOf(c16l.A0d());
                    } else if ("is_viewer_followed_by_comment_author".equals(A0q)) {
                        bool20 = Boolean.valueOf(c16l.A0d());
                    } else if ("keyword_highlight_info".equals(A0q)) {
                        c110864yy = IR7.parseFromJson(c16l);
                    } else if ("media_code".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str5 = null;
                        } else {
                            str5 = c16l.A1P();
                        }
                    } else if ("media_id".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str6 = null;
                        } else {
                            str6 = c16l.A1P();
                        }
                    } else if ("media_info".equals(A0q)) {
                        c5fo = I03.parseFromJson(c16l);
                    } else if ("mention_user_list".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            hashMap = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P5 = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap.put(A1P5, null);
                                } else {
                                    Parcelable.Creator creator3 = User.CREATOR;
                                    User A003 = AbstractC38851rI.A00(c16l, false);
                                    if (A003 != null) {
                                        hashMap.put(A1P5, A003);
                                    }
                                }
                            }
                        } else {
                            hashMap = null;
                        }
                    } else if ("next_max_child_cursor".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str7 = null;
                        } else {
                            str7 = c16l.A1P();
                        }
                    } else if ("next_min_child_cursor".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str8 = null;
                        } else {
                            str8 = c16l.A1P();
                        }
                    } else if ("num_head_child_comments".equals(A0q)) {
                        num6 = Integer.valueOf(c16l.A1D());
                    } else if ("num_tail_child_comments".equals(A0q)) {
                        num7 = Integer.valueOf(c16l.A1D());
                    } else if ("parent_comment_id".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str9 = null;
                        } else {
                            str9 = c16l.A1P();
                        }
                    } else if ("parent_comment_index".equals(A0q)) {
                        num8 = Integer.valueOf(c16l.A1D());
                    } else if ("pk".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str10 = null;
                        } else {
                            str10 = c16l.A1P();
                        }
                    } else if ("preview_child_comments".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList6 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C38891rO parseFromJson3 = parseFromJson(c16l);
                                if (parseFromJson3 != null) {
                                    arrayList6.add(parseFromJson3);
                                }
                            }
                        } else {
                            arrayList6 = null;
                        }
                    } else if ("private_reply_status".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            A1P2 = null;
                        } else {
                            A1P2 = c16l.A1P();
                        }
                        privateReplyStatus = (PrivateReplyStatus) PrivateReplyStatus.A01.get(A1P2);
                        if (privateReplyStatus == null) {
                            privateReplyStatus = PrivateReplyStatus.A07;
                        }
                    } else if ("replied_to_comment_id".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str11 = null;
                        } else {
                            str11 = c16l.A1P();
                        }
                    } else if ("restricted_status".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            A1P = null;
                        } else {
                            A1P = c16l.A1P();
                        }
                        commentRestrictStatus = (CommentRestrictStatus) CommentRestrictStatus.A01.get(A1P);
                        if (commentRestrictStatus == null) {
                            commentRestrictStatus = CommentRestrictStatus.A06;
                        }
                    } else if ("show_fanclub_badge".equals(A0q)) {
                        bool21 = Boolean.valueOf(c16l.A0d());
                    } else if ("show_reshare_nudge".equals(A0q)) {
                        bool22 = Boolean.valueOf(c16l.A0d());
                    } else if ("text".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str12 = null;
                        } else {
                            str12 = c16l.A1P();
                        }
                    } else if ("text_color".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str13 = null;
                        } else {
                            str13 = c16l.A1P();
                        }
                    } else if ("text_size".equals(A0q)) {
                        num9 = Integer.valueOf(c16l.A1D());
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                        num10 = Integer.valueOf(c16l.A1D());
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                        Parcelable.Creator creator4 = User.CREATOR;
                        user = AbstractC38851rI.A00(c16l, false);
                    }
                    c16l.A0z();
                } else {
                    return new C38891rO(clientDisplayMethod, c38706H2r, commentGiphyMediaInfo, c38707H2t, commentRestrictStatus, privateReplyStatus, c5fo, c5fi, c110864yy, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21, bool22, num, num2, num3, num4, num5, num6, num7, num8, num9, num10, l, l2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, hashMap, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6);
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38891rO c38891rO) {
        anonymousClass182.A0d();
        C5FH c5fh = c38891rO.A01;
        if (c5fh != null) {
            anonymousClass182.A0r("avatar_media_info");
            C38706H2r EsM = c5fh.EsM();
            anonymousClass182.A0d();
            String str = EsM.A01;
            if (str != null) {
                anonymousClass182.A0S("avatar_sticker_cdn_url", str);
            }
            String str2 = EsM.A02;
            if (str2 != null) {
                anonymousClass182.A0S("avatar_sticker_ikid", str2);
            }
            MediaType mediaType = EsM.A00;
            if (mediaType != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, mediaType.A00);
            }
            anonymousClass182.A0a();
        }
        String str3 = c38891rO.A0i;
        if (str3 != null) {
            anonymousClass182.A0S("background_color", str3);
        }
        String str4 = c38891rO.A0j;
        if (str4 != null) {
            anonymousClass182.A0S("background_color_alpha", str4);
        }
        Boolean bool = c38891rO.A0A;
        if (bool != null) {
            anonymousClass182.A0T("can_viewer_hide", bool.booleanValue());
        }
        Boolean bool2 = c38891rO.A0B;
        if (bool2 != null) {
            anonymousClass182.A0T("can_viewer_unhide", bool2.booleanValue());
        }
        C5FI c5fi = c38891rO.A07;
        if (c5fi != null) {
            anonymousClass182.A0r("caption_area");
            IR5.A00(anonymousClass182, c5fi);
        }
        List<H2Z> list = c38891rO.A0w;
        if (list != null) {
            C16V.A03(anonymousClass182, "carousel_child_mentions");
            for (H2Z h2z : list) {
                if (h2z != null) {
                    anonymousClass182.A0d();
                    anonymousClass182.A0Q("carousel_child_index", h2z.A00);
                    anonymousClass182.A0T("is_child_deleted", h2z.A02);
                    String str5 = h2z.A01;
                    if (str5 != null) {
                        anonymousClass182.A0S("mentioned_child_id", str5);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        Integer num = c38891rO.A0W;
        if (num != null) {
            anonymousClass182.A0Q("child_comment_count", num.intValue());
        }
        Integer num2 = c38891rO.A0X;
        if (num2 != null) {
            anonymousClass182.A0Q("child_comment_index", num2.intValue());
        }
        Boolean bool3 = c38891rO.A0C;
        if (bool3 != null) {
            anonymousClass182.A0T("comment_has_a_visual_reply_media", bool3.booleanValue());
        }
        Integer num3 = c38891rO.A0Y;
        if (num3 != null) {
            anonymousClass182.A0Q("comment_index", num3.intValue());
        }
        Integer num4 = c38891rO.A0Z;
        if (num4 != null) {
            anonymousClass182.A0Q("comment_like_count", num4.intValue());
        }
        List<User> list2 = c38891rO.A0x;
        if (list2 != null) {
            C16V.A03(anonymousClass182, "comment_social_context_likers");
            for (User user : list2) {
                if (user != null) {
                    Parcelable.Creator creator = User.CREATOR;
                    AbstractC38851rI.A08(anonymousClass182, user);
                }
            }
            anonymousClass182.A0Z();
        }
        Long l = c38891rO.A0g;
        if (l != null) {
            anonymousClass182.A0R("created_at", l.longValue());
        }
        Long l2 = c38891rO.A0h;
        if (l2 != null) {
            anonymousClass182.A0R("created_at_utc", l2.longValue());
        }
        String str6 = c38891rO.A0k;
        if (str6 != null) {
            anonymousClass182.A0S("default_caption", str6);
        }
        Boolean bool4 = c38891rO.A0D;
        if (bool4 != null) {
            anonymousClass182.A0T("did_report_as_spam", bool4.booleanValue());
        }
        List<String> list3 = c38891rO.A0y;
        if (list3 != null) {
            C16V.A03(anonymousClass182, "distinct_emojis_used");
            for (String str7 : list3) {
                if (str7 != null) {
                    anonymousClass182.A0u(str7);
                }
            }
            anonymousClass182.A0Z();
        }
        List<User> list4 = c38891rO.A0z;
        if (list4 != null) {
            C16V.A03(anonymousClass182, "e2ee_mentioned_user_list");
            for (User user2 : list4) {
                if (user2 != null) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    AbstractC38851rI.A08(anonymousClass182, user2);
                }
            }
            anonymousClass182.A0Z();
        }
        List<JLO> list5 = c38891rO.A10;
        if (list5 != null) {
            C16V.A03(anonymousClass182, "fb_mentioned_users");
            for (JLO jlo : list5) {
                if (jlo != null) {
                    H3I EtS = jlo.EtS();
                    anonymousClass182.A0d();
                    anonymousClass182.A0Q("length", EtS.A00);
                    anonymousClass182.A0Q("offset", EtS.A01);
                    String str8 = EtS.A02;
                    if (str8 != null) {
                        anonymousClass182.A0S("profile_deeplink", str8);
                    }
                    String str9 = EtS.A03;
                    if (str9 != null) {
                        anonymousClass182.A0S("profile_www_link", str9);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        Integer num5 = c38891rO.A0a;
        if (num5 != null) {
            anonymousClass182.A0Q("first_sentence_length", num5.intValue());
        }
        CommentGiphyMediaInfo commentGiphyMediaInfo = c38891rO.A02;
        if (commentGiphyMediaInfo != null) {
            anonymousClass182.A0r("giphy_media_info");
            AbstractC41253INt.A00(anonymousClass182, commentGiphyMediaInfo);
        }
        Boolean bool5 = c38891rO.A0E;
        if (bool5 != null) {
            anonymousClass182.A0T("has_liked_comment", bool5.booleanValue());
        }
        Boolean bool6 = c38891rO.A0F;
        if (bool6 != null) {
            anonymousClass182.A0T("has_more_head_child_comments", bool6.booleanValue());
        }
        Boolean bool7 = c38891rO.A0G;
        if (bool7 != null) {
            anonymousClass182.A0T("has_more_tail_child_comments", bool7.booleanValue());
        }
        Boolean bool8 = c38891rO.A0H;
        if (bool8 != null) {
            anonymousClass182.A0T("has_translation", bool8.booleanValue());
        }
        Boolean bool9 = c38891rO.A0I;
        if (bool9 != null) {
            anonymousClass182.A0T("hide_username", bool9.booleanValue());
        }
        String str10 = c38891rO.A0l;
        if (str10 != null) {
            anonymousClass182.A0S("idempotence_token", str10);
        }
        C5FM c5fm = c38891rO.A03;
        if (c5fm != null) {
            anonymousClass182.A0r("imagine_create_media_info");
            C38707H2t EsQ = c5fm.EsQ();
            anonymousClass182.A0d();
            String str11 = EsQ.A00;
            if (str11 != null) {
                anonymousClass182.A0S("imagine_create_media_url", str11);
            }
            anonymousClass182.A0a();
        }
        ClientDisplayMethod clientDisplayMethod = c38891rO.A00;
        if (clientDisplayMethod != null) {
            anonymousClass182.A0S("inline_composer_display_condition", clientDisplayMethod.A00);
        }
        Boolean bool10 = c38891rO.A0J;
        if (bool10 != null) {
            anonymousClass182.A0T("is_covered", bool10.booleanValue());
        }
        Boolean bool11 = c38891rO.A0K;
        if (bool11 != null) {
            anonymousClass182.A0T("is_created_by_media_owner", bool11.booleanValue());
        }
        Boolean bool12 = c38891rO.A0L;
        if (bool12 != null) {
            anonymousClass182.A0T("is_goal_setting_message", bool12.booleanValue());
        }
        Boolean bool13 = c38891rO.A0M;
        if (bool13 != null) {
            anonymousClass182.A0T("is_high_value", bool13.booleanValue());
        }
        Boolean bool14 = c38891rO.A0N;
        if (bool14 != null) {
            anonymousClass182.A0T("is_liked_by_media_owner", bool14.booleanValue());
        }
        Boolean bool15 = c38891rO.A0O;
        if (bool15 != null) {
            anonymousClass182.A0T("is_limited", bool15.booleanValue());
        }
        Boolean bool16 = c38891rO.A0P;
        if (bool16 != null) {
            anonymousClass182.A0T("is_new", bool16.booleanValue());
        }
        Boolean bool17 = c38891rO.A0Q;
        if (bool17 != null) {
            anonymousClass182.A0T("is_pinned", bool17.booleanValue());
        }
        Boolean bool18 = c38891rO.A0R;
        if (bool18 != null) {
            anonymousClass182.A0T("is_question", bool18.booleanValue());
        }
        Boolean bool19 = c38891rO.A0S;
        if (bool19 != null) {
            anonymousClass182.A0T("is_ranked_comment", bool19.booleanValue());
        }
        Boolean bool20 = c38891rO.A0T;
        if (bool20 != null) {
            anonymousClass182.A0T("is_viewer_followed_by_comment_author", bool20.booleanValue());
        }
        C110864yy c110864yy = c38891rO.A08;
        if (c110864yy != null) {
            anonymousClass182.A0r("keyword_highlight_info");
            IR7.A00(anonymousClass182, c110864yy);
        }
        String str12 = c38891rO.A0m;
        if (str12 != null) {
            anonymousClass182.A0S("media_code", str12);
        }
        String str13 = c38891rO.A0n;
        if (str13 != null) {
            anonymousClass182.A0S("media_id", str13);
        }
        C5FO c5fo = c38891rO.A06;
        if (c5fo != null) {
            anonymousClass182.A0r("media_info");
            anonymousClass182.A0d();
            C38321qM c38321qM = c5fo.A00;
            if (c38321qM != null) {
                anonymousClass182.A0r("media");
                AtomicBoolean atomicBoolean = C38321qM.A0i;
                C38801rC.A07(anonymousClass182, c38321qM);
            }
            anonymousClass182.A0a();
        }
        HashMap hashMap = c38891rO.A0v;
        if (hashMap != null) {
            anonymousClass182.A0r("mention_user_list");
            anonymousClass182.A0d();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (!C16V.A04(anonymousClass182, entry)) {
                    User user3 = (User) entry.getValue();
                    Parcelable.Creator creator3 = User.CREATOR;
                    AbstractC38851rI.A08(anonymousClass182, user3);
                }
            }
            anonymousClass182.A0a();
        }
        String str14 = c38891rO.A0o;
        if (str14 != null) {
            anonymousClass182.A0S("next_max_child_cursor", str14);
        }
        String str15 = c38891rO.A0p;
        if (str15 != null) {
            anonymousClass182.A0S("next_min_child_cursor", str15);
        }
        Integer num6 = c38891rO.A0b;
        if (num6 != null) {
            anonymousClass182.A0Q("num_head_child_comments", num6.intValue());
        }
        Integer num7 = c38891rO.A0c;
        if (num7 != null) {
            anonymousClass182.A0Q("num_tail_child_comments", num7.intValue());
        }
        String str16 = c38891rO.A0q;
        if (str16 != null) {
            anonymousClass182.A0S("parent_comment_id", str16);
        }
        Integer num8 = c38891rO.A0d;
        if (num8 != null) {
            anonymousClass182.A0Q("parent_comment_index", num8.intValue());
        }
        String str17 = c38891rO.A0r;
        if (str17 != null) {
            anonymousClass182.A0S("pk", str17);
        }
        List<C38891rO> list6 = c38891rO.A11;
        if (list6 != null) {
            C16V.A03(anonymousClass182, "preview_child_comments");
            for (C38891rO c38891rO2 : list6) {
                if (c38891rO2 != null) {
                    A00(anonymousClass182, c38891rO2);
                }
            }
            anonymousClass182.A0Z();
        }
        PrivateReplyStatus privateReplyStatus = c38891rO.A05;
        if (privateReplyStatus != null) {
            anonymousClass182.A0S("private_reply_status", privateReplyStatus.A00);
        }
        String str18 = c38891rO.A0s;
        if (str18 != null) {
            anonymousClass182.A0S("replied_to_comment_id", str18);
        }
        CommentRestrictStatus commentRestrictStatus = c38891rO.A04;
        if (commentRestrictStatus != null) {
            anonymousClass182.A0S("restricted_status", commentRestrictStatus.A00);
        }
        Boolean bool21 = c38891rO.A0U;
        if (bool21 != null) {
            anonymousClass182.A0T("show_fanclub_badge", bool21.booleanValue());
        }
        Boolean bool22 = c38891rO.A0V;
        if (bool22 != null) {
            anonymousClass182.A0T("show_reshare_nudge", bool22.booleanValue());
        }
        String str19 = c38891rO.A0t;
        if (str19 != null) {
            anonymousClass182.A0S("text", str19);
        }
        String str20 = c38891rO.A0u;
        if (str20 != null) {
            anonymousClass182.A0S("text_color", str20);
        }
        Integer num9 = c38891rO.A0e;
        if (num9 != null) {
            anonymousClass182.A0Q("text_size", num9.intValue());
        }
        Integer num10 = c38891rO.A0f;
        if (num10 != null) {
            anonymousClass182.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, num10.intValue());
        }
        User user4 = c38891rO.A09;
        if (user4 != null) {
            anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            Parcelable.Creator creator4 = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user4);
        }
        anonymousClass182.A0a();
    }
}
