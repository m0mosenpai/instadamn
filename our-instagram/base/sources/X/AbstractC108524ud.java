package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.IGLiveGameStatus;
import com.instagram.api.schemas.IGLiveGames;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4ud, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC108524ud {
    public static C37941pb parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C109894xH c109894xH = null;
            C109054vU c109054vU = null;
            Long l = null;
            String str = null;
            User user = null;
            String str2 = null;
            String str3 = null;
            C109914xJ c109914xJ = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            Boolean bool = null;
            String str4 = null;
            IGLiveGames iGLiveGames = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            C108544uf c108544uf = null;
            String str8 = null;
            Integer num = null;
            Boolean bool2 = null;
            IGLiveGameStatus iGLiveGameStatus = null;
            C109934xN c109934xN = null;
            Boolean bool3 = null;
            Long l2 = null;
            Long l3 = null;
            Integer num2 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Integer num3 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Long l4 = null;
            String str9 = null;
            C109084vX c109084vX = null;
            Boolean bool12 = null;
            Integer num4 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            Integer num5 = null;
            String str14 = null;
            Integer num6 = null;
            Long l5 = null;
            Integer num7 = null;
            Boolean bool13 = null;
            Long l6 = null;
            ArrayList arrayList3 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            Integer num8 = null;
            ArrayList arrayList4 = null;
            C109834xB c109834xB = null;
            Float f = null;
            Float f2 = null;
            ArrayList arrayList5 = null;
            Integer num9 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("affiliate_info".equals(A0q)) {
                    c109894xH = AbstractC41241INh.parseFromJson(c16l);
                } else if ("broadcast_experiments".equals(A0q)) {
                    c109054vU = AbstractC108564uh.parseFromJson(c16l);
                } else if (TraceFieldType.BroadcastId.equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("broadcast_message".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("broadcast_owner".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("broadcast_prompt".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("broadcast_status".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("charity_info".equals(A0q)) {
                    c109914xJ = AbstractC69864Vwp.parseFromJson(c16l);
                } else if ("chat_info".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            H45 parseFromJson = IOQ.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("cobroadcasters".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Parcelable.Creator creator2 = User.CREATOR;
                            User A00 = AbstractC38851rI.A00(c16l, false);
                            if (A00 != null) {
                                arrayList2.add(A00);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("copyright_violation".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("cover_frame_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("current_game".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    iGLiveGames = (IGLiveGames) IGLiveGames.A01.get(A1P3);
                    if (iGLiveGames == null) {
                        iGLiveGames = IGLiveGames.A06;
                    }
                } else if ("dash_abr_playback_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("dash_manifest".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("dash_playback_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("dimensions_typed".equals(A0q)) {
                    c108544uf = AbstractC108534ue.parseFromJson(c16l);
                } else if ("encoding_tag".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("expire_at".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("fan_club_subscribe_enabled".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("game_status".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    iGLiveGameStatus = (IGLiveGameStatus) IGLiveGameStatus.A01.get(A1P2);
                    if (iGLiveGameStatus == null) {
                        iGLiveGameStatus = IGLiveGameStatus.A06;
                    }
                } else if ("gating".equals(A0q)) {
                    c109934xN = IOB.parseFromJson(c16l);
                } else if ("hide_from_feed_unit".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    l2 = Long.valueOf(c16l.A0y());
                } else if ("igtv_post_id".equals(A0q)) {
                    l3 = Long.valueOf(c16l.A0y());
                } else if ("index_position_in_response".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("internal_only".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("is_exclusive_live".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("is_fit_green".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("is_live_comment_mention_enabled".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("is_live_comment_replies_enabled".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("is_ongoing_trivia".equals(A0q)) {
                    bool9 = Boolean.valueOf(c16l.A0d());
                } else if ("is_player_live_trace_enabled".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("is_scheduled_live".equals(A0q)) {
                    bool10 = Boolean.valueOf(c16l.A0d());
                } else if ("is_viewer_comment_allowed".equals(A0q)) {
                    bool11 = Boolean.valueOf(c16l.A0d());
                } else if ("live_post_id".equals(A0q)) {
                    l4 = Long.valueOf(c16l.A0y());
                } else if ("media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("media_overlay_info".equals(A0q)) {
                    c109084vX = AbstractC109074vW.parseFromJson(c16l);
                } else if ("muted".equals(A0q)) {
                    bool12 = Boolean.valueOf(c16l.A0d());
                } else if ("number_of_qualities".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                } else if ("organic_tracking_token".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("playlist".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("preview".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                } else if ("progressive_playback_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str13 = null;
                    } else {
                        str13 = c16l.A1P();
                    }
                } else if ("published_time".equals(A0q)) {
                    num5 = Integer.valueOf(c16l.A1D());
                } else if ("question_pk".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str14 = null;
                    } else {
                        str14 = c16l.A1P();
                    }
                } else if ("ranked_position".equals(A0q)) {
                    num6 = Integer.valueOf(c16l.A1D());
                } else if ("response_timestamp".equals(A0q)) {
                    l5 = Long.valueOf(c16l.A0y());
                } else if ("seen_ranked_position".equals(A0q)) {
                    num7 = Integer.valueOf(c16l.A1D());
                } else if ("show_bff_upsell".equals(A0q)) {
                    bool13 = Boolean.valueOf(c16l.A0d());
                } else if ("simulcast_fb_broadcast_id".equals(A0q)) {
                    l6 = Long.valueOf(c16l.A0y());
                } else if ("sponsor_tags".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C102184io parseFromJson2 = AbstractC102174in.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("streaming_from_wearable".equals(A0q)) {
                    bool14 = Boolean.valueOf(c16l.A0d());
                } else if ("sup_active".equals(A0q)) {
                    bool15 = Boolean.valueOf(c16l.A0d());
                } else if ("total_unique_viewer_count".equals(A0q)) {
                    num8 = Integer.valueOf(c16l.A1D());
                } else if ("unseen_media_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList4.add(A1P);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("user_pay_viewer_config".equals(A0q)) {
                    c109834xB = AbstractC109684wu.parseFromJson(c16l);
                } else if ("video_duration".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("viewer_count".equals(A0q)) {
                    f2 = new Float(c16l.A0U());
                } else if ("viewer_count_avatars".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Parcelable.Creator creator3 = User.CREATOR;
                            User A002 = AbstractC38851rI.A00(c16l, false);
                            if (A002 != null) {
                                arrayList5.add(A002);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("visibility".equals(A0q)) {
                    num9 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new C37941pb(c109894xH, c109914xJ, c109934xN, c109054vU, iGLiveGameStatus, iGLiveGames, c108544uf, c109834xB, c109084vX, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, f, f2, num, num2, num3, num4, num5, num6, num7, num8, num9, l, l2, l3, l4, l5, l6, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C37941pb c37941pb) {
        anonymousClass182.A0d();
        C109894xH c109894xH = c37941pb.A00;
        if (c109894xH != null) {
            anonymousClass182.A0r("affiliate_info");
            AbstractC41241INh.A00(anonymousClass182, c109894xH);
        }
        C109054vU c109054vU = c37941pb.A03;
        if (c109054vU != null) {
            anonymousClass182.A0r("broadcast_experiments");
            AbstractC108564uh.A00(anonymousClass182, c109054vU);
        }
        Long l = c37941pb.A0a;
        if (l != null) {
            anonymousClass182.A0R(TraceFieldType.BroadcastId, l.longValue());
        }
        String str = c37941pb.A0g;
        if (str != null) {
            anonymousClass182.A0S("broadcast_message", str);
        }
        User user = c37941pb.A09;
        if (user != null) {
            anonymousClass182.A0r("broadcast_owner");
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        String str2 = c37941pb.A0h;
        if (str2 != null) {
            anonymousClass182.A0S("broadcast_prompt", str2);
        }
        String str3 = c37941pb.A0i;
        if (str3 != null) {
            anonymousClass182.A0S("broadcast_status", str3);
        }
        C109914xJ c109914xJ = c37941pb.A01;
        if (c109914xJ != null) {
            anonymousClass182.A0r("charity_info");
            AbstractC69864Vwp.A00(anonymousClass182, c109914xJ);
        }
        List<H45> list = c37941pb.A0u;
        if (list != null) {
            C16V.A03(anonymousClass182, "chat_info");
            for (H45 h45 : list) {
                if (h45 != null) {
                    IOQ.A00(anonymousClass182, h45);
                }
            }
            anonymousClass182.A0Z();
        }
        List<User> list2 = c37941pb.A0v;
        if (list2 != null) {
            C16V.A03(anonymousClass182, "cobroadcasters");
            for (User user2 : list2) {
                if (user2 != null) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    AbstractC38851rI.A08(anonymousClass182, user2);
                }
            }
            anonymousClass182.A0Z();
        }
        Boolean bool = c37941pb.A0A;
        if (bool != null) {
            anonymousClass182.A0T("copyright_violation", bool.booleanValue());
        }
        String str4 = c37941pb.A0j;
        if (str4 != null) {
            anonymousClass182.A0S("cover_frame_url", str4);
        }
        IGLiveGames iGLiveGames = c37941pb.A05;
        if (iGLiveGames != null) {
            anonymousClass182.A0S("current_game", iGLiveGames.A00);
        }
        String str5 = c37941pb.A0k;
        if (str5 != null) {
            anonymousClass182.A0S("dash_abr_playback_url", str5);
        }
        String str6 = c37941pb.A0l;
        if (str6 != null) {
            anonymousClass182.A0S("dash_manifest", str6);
        }
        String str7 = c37941pb.A0m;
        if (str7 != null) {
            anonymousClass182.A0S("dash_playback_url", str7);
        }
        C108544uf c108544uf = c37941pb.A06;
        if (c108544uf != null) {
            anonymousClass182.A0r("dimensions_typed");
            anonymousClass182.A0d();
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, c108544uf.A00);
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, c108544uf.A01);
            anonymousClass182.A0a();
        }
        String str8 = c37941pb.A0n;
        if (str8 != null) {
            anonymousClass182.A0S("encoding_tag", str8);
        }
        Integer num = c37941pb.A0R;
        if (num != null) {
            anonymousClass182.A0Q("expire_at", num.intValue());
        }
        Boolean bool2 = c37941pb.A0B;
        if (bool2 != null) {
            anonymousClass182.A0T("fan_club_subscribe_enabled", bool2.booleanValue());
        }
        IGLiveGameStatus iGLiveGameStatus = c37941pb.A04;
        if (iGLiveGameStatus != null) {
            anonymousClass182.A0S("game_status", iGLiveGameStatus.A00);
        }
        C109934xN c109934xN = c37941pb.A02;
        if (c109934xN != null) {
            anonymousClass182.A0r("gating");
            IOB.A00(anonymousClass182, c109934xN);
        }
        Boolean bool3 = c37941pb.A0C;
        if (bool3 != null) {
            anonymousClass182.A0T("hide_from_feed_unit", bool3.booleanValue());
        }
        Long l2 = c37941pb.A0b;
        if (l2 != null) {
            anonymousClass182.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, l2.longValue());
        }
        Long l3 = c37941pb.A0c;
        if (l3 != null) {
            anonymousClass182.A0R("igtv_post_id", l3.longValue());
        }
        Integer num2 = c37941pb.A0S;
        if (num2 != null) {
            anonymousClass182.A0Q("index_position_in_response", num2.intValue());
        }
        Boolean bool4 = c37941pb.A0D;
        if (bool4 != null) {
            anonymousClass182.A0T("internal_only", bool4.booleanValue());
        }
        Boolean bool5 = c37941pb.A0E;
        if (bool5 != null) {
            anonymousClass182.A0T("is_exclusive_live", bool5.booleanValue());
        }
        Boolean bool6 = c37941pb.A0F;
        if (bool6 != null) {
            anonymousClass182.A0T("is_fit_green", bool6.booleanValue());
        }
        Boolean bool7 = c37941pb.A0G;
        if (bool7 != null) {
            anonymousClass182.A0T("is_live_comment_mention_enabled", bool7.booleanValue());
        }
        Boolean bool8 = c37941pb.A0H;
        if (bool8 != null) {
            anonymousClass182.A0T("is_live_comment_replies_enabled", bool8.booleanValue());
        }
        Boolean bool9 = c37941pb.A0I;
        if (bool9 != null) {
            anonymousClass182.A0T("is_ongoing_trivia", bool9.booleanValue());
        }
        Integer num3 = c37941pb.A0T;
        if (num3 != null) {
            anonymousClass182.A0Q("is_player_live_trace_enabled", num3.intValue());
        }
        Boolean bool10 = c37941pb.A0J;
        if (bool10 != null) {
            anonymousClass182.A0T("is_scheduled_live", bool10.booleanValue());
        }
        Boolean bool11 = c37941pb.A0K;
        if (bool11 != null) {
            anonymousClass182.A0T("is_viewer_comment_allowed", bool11.booleanValue());
        }
        Long l4 = c37941pb.A0d;
        if (l4 != null) {
            anonymousClass182.A0R("live_post_id", l4.longValue());
        }
        String str9 = c37941pb.A0o;
        if (str9 != null) {
            anonymousClass182.A0S("media_id", str9);
        }
        C109084vX c109084vX = c37941pb.A08;
        if (c109084vX != null) {
            anonymousClass182.A0r("media_overlay_info");
            AbstractC109074vW.A00(anonymousClass182, c109084vX);
        }
        Boolean bool12 = c37941pb.A0L;
        if (bool12 != null) {
            anonymousClass182.A0T("muted", bool12.booleanValue());
        }
        Integer num4 = c37941pb.A0U;
        if (num4 != null) {
            anonymousClass182.A0Q("number_of_qualities", num4.intValue());
        }
        String str10 = c37941pb.A0p;
        if (str10 != null) {
            anonymousClass182.A0S("organic_tracking_token", str10);
        }
        String str11 = c37941pb.A0q;
        if (str11 != null) {
            anonymousClass182.A0S("playlist", str11);
        }
        String str12 = c37941pb.A0r;
        if (str12 != null) {
            anonymousClass182.A0S("preview", str12);
        }
        String str13 = c37941pb.A0s;
        if (str13 != null) {
            anonymousClass182.A0S("progressive_playback_url", str13);
        }
        Integer num5 = c37941pb.A0V;
        if (num5 != null) {
            anonymousClass182.A0Q("published_time", num5.intValue());
        }
        String str14 = c37941pb.A0t;
        if (str14 != null) {
            anonymousClass182.A0S("question_pk", str14);
        }
        Integer num6 = c37941pb.A0W;
        if (num6 != null) {
            anonymousClass182.A0Q("ranked_position", num6.intValue());
        }
        Long l5 = c37941pb.A0e;
        if (l5 != null) {
            anonymousClass182.A0R("response_timestamp", l5.longValue());
        }
        Integer num7 = c37941pb.A0X;
        if (num7 != null) {
            anonymousClass182.A0Q("seen_ranked_position", num7.intValue());
        }
        Boolean bool13 = c37941pb.A0M;
        if (bool13 != null) {
            anonymousClass182.A0T("show_bff_upsell", bool13.booleanValue());
        }
        Long l6 = c37941pb.A0f;
        if (l6 != null) {
            anonymousClass182.A0R("simulcast_fb_broadcast_id", l6.longValue());
        }
        List<C102184io> list3 = c37941pb.A0w;
        if (list3 != null) {
            C16V.A03(anonymousClass182, "sponsor_tags");
            for (C102184io c102184io : list3) {
                if (c102184io != null) {
                    AbstractC102174in.A00(anonymousClass182, c102184io);
                }
            }
            anonymousClass182.A0Z();
        }
        Boolean bool14 = c37941pb.A0N;
        if (bool14 != null) {
            anonymousClass182.A0T("streaming_from_wearable", bool14.booleanValue());
        }
        Boolean bool15 = c37941pb.A0O;
        if (bool15 != null) {
            anonymousClass182.A0T("sup_active", bool15.booleanValue());
        }
        Integer num8 = c37941pb.A0Y;
        if (num8 != null) {
            anonymousClass182.A0Q("total_unique_viewer_count", num8.intValue());
        }
        List<String> list4 = c37941pb.A0x;
        if (list4 != null) {
            C16V.A03(anonymousClass182, "unseen_media_ids");
            for (String str15 : list4) {
                if (str15 != null) {
                    anonymousClass182.A0u(str15);
                }
            }
            anonymousClass182.A0Z();
        }
        C109834xB c109834xB = c37941pb.A07;
        if (c109834xB != null) {
            anonymousClass182.A0r("user_pay_viewer_config");
            AbstractC109684wu.A00(anonymousClass182, c109834xB);
        }
        Float f = c37941pb.A0P;
        if (f != null) {
            anonymousClass182.A0P("video_duration", f.floatValue());
        }
        Float f2 = c37941pb.A0Q;
        if (f2 != null) {
            anonymousClass182.A0P("viewer_count", f2.floatValue());
        }
        List<User> list5 = c37941pb.A0y;
        if (list5 != null) {
            C16V.A03(anonymousClass182, "viewer_count_avatars");
            for (User user3 : list5) {
                if (user3 != null) {
                    Parcelable.Creator creator3 = User.CREATOR;
                    AbstractC38851rI.A08(anonymousClass182, user3);
                }
            }
            anonymousClass182.A0Z();
        }
        Integer num9 = c37941pb.A0Z;
        if (num9 != null) {
            anonymousClass182.A0Q("visibility", num9.intValue());
        }
        anonymousClass182.A0a();
    }
}
