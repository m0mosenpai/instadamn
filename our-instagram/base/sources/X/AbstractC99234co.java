package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ReplyControlStr;
import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.api.schemas.TextAppMentionType;
import com.instagram.api.schemas.TextAppSearchDiscussionTopic;
import com.instagram.api.schemas.TextAppSearchDiscussionTopicImpl;
import com.instagram.api.schemas.TextAppTextFragmentType;
import com.instagram.api.schemas.TextPostAppHeaderFollowVariant;
import com.instagram.api.schemas.TextPostAppPostUnavailableReason;
import com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4co, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC99234co {
    public static C99324d1 parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            URR urr = null;
            Long l = null;
            Integer num = null;
            Long l2 = null;
            C99284cu c99284cu = null;
            TextPostAppHeaderFollowVariant textPostAppHeaderFollowVariant = null;
            UQu uQu = null;
            Integer num2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            C99364d6 c99364d6 = null;
            C38321qM c38321qM = null;
            C66642URg c66642URg = null;
            Integer num3 = null;
            C4d9 c4d9 = null;
            String str = null;
            TextPostAppPostUnavailableReason textPostAppPostUnavailableReason = null;
            User user = null;
            Integer num4 = null;
            URP urp = null;
            ArrayList arrayList = null;
            ReplyControlStr replyControlStr = null;
            Integer num5 = null;
            ArrayList arrayList2 = null;
            Integer num6 = null;
            User user2 = null;
            Integer num7 = null;
            Integer num8 = null;
            TextAppSearchDiscussionTopicImpl textAppSearchDiscussionTopicImpl = null;
            Integer num9 = null;
            C99314cz c99314cz = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            String str2 = null;
            C38792H6h c38792H6h = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("can_private_reply".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("can_reply".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("debug_info".equals(A0q)) {
                    urr = VPE.parseFromJson(c16l);
                } else if ("delete_timestamp".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("direct_reply_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("expiry_timestamp".equals(A0q)) {
                    l2 = Long.valueOf(c16l.A0y());
                } else if ("fediverse_info".equals(A0q)) {
                    c99284cu = AbstractC99274ct.parseFromJson(c16l);
                } else if ("header_follow_variant".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P4 = null;
                    } else {
                        A1P4 = c16l.A1P();
                    }
                    textPostAppHeaderFollowVariant = (TextPostAppHeaderFollowVariant) TextPostAppHeaderFollowVariant.A01.get(A1P4);
                    if (textPostAppHeaderFollowVariant == null) {
                        textPostAppHeaderFollowVariant = TextPostAppHeaderFollowVariant.A05;
                    }
                } else if ("hush_info".equals(A0q)) {
                    uQu = AbstractC99244cq.parseFromJson(c16l);
                } else if ("impression_count".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("is_archived".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("is_first_post".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("is_parent_edited".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("is_post_unavailable".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("is_reply".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("is_share_ufi_highlight_enabled".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("link_preview_attachment".equals(A0q)) {
                    c99364d6 = AbstractC99254cr.parseFromJson(c16l);
                } else if ("linked_inline_media".equals(A0q)) {
                    c38321qM = C38321qM.A0h.A0C(c16l, true, false);
                } else if ("loop_community_info".equals(A0q)) {
                    c66642URg = VTG.parseFromJson(c16l);
                } else if ("mention_count".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("pinned_post_info".equals(A0q)) {
                    c4d9 = VPG.parseFromJson(c16l);
                } else if ("post_preview_caption".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("post_unavailable_reason".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    textPostAppPostUnavailableReason = (TextPostAppPostUnavailableReason) TextPostAppPostUnavailableReason.A01.get(A1P3);
                    if (textPostAppPostUnavailableReason == null) {
                        textPostAppPostUnavailableReason = TextPostAppPostUnavailableReason.A05;
                    }
                } else if ("private_reply_partner".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("quote_count".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                } else if ("related_trends_info".equals(A0q)) {
                    urp = VPA.parseFromJson(c16l);
                } else if ("relevant_hashtag_labels".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                arrayList.add(A1P2);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("reply_control".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    replyControlStr = (ReplyControlStr) ReplyControlStr.A01.get(A1P);
                    if (replyControlStr == null) {
                        replyControlStr = ReplyControlStr.A08;
                    }
                } else if ("reply_count".equals(A0q)) {
                    num5 = Integer.valueOf(c16l.A1D());
                } else if ("reply_facepile_users".equals(A0q)) {
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
                } else if ("reply_level".equals(A0q)) {
                    num6 = Integer.valueOf(c16l.A1D());
                } else if ("reply_to_author".equals(A0q)) {
                    Parcelable.Creator creator3 = User.CREATOR;
                    user2 = AbstractC38851rI.A00(c16l, false);
                } else if ("repost_count".equals(A0q)) {
                    num7 = Integer.valueOf(c16l.A1D());
                } else if ("reshare_count".equals(A0q)) {
                    num8 = Integer.valueOf(c16l.A1D());
                } else if ("search_trend_info_from_link_preview".equals(A0q)) {
                    textAppSearchDiscussionTopicImpl = AbstractC99264cs.parseFromJson(c16l);
                } else if ("self_thread_count".equals(A0q)) {
                    num9 = Integer.valueOf(c16l.A1D());
                } else if ("share_info".equals(A0q)) {
                    c99314cz = AbstractC99304cw.parseFromJson(c16l);
                } else if ("should_prefetch_permalink".equals(A0q)) {
                    bool9 = Boolean.valueOf(c16l.A0d());
                } else if ("show_header_follow".equals(A0q)) {
                    bool10 = Boolean.valueOf(c16l.A0d());
                } else if ("special_effects_enabled_str".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("text_fragments".equals(A0q)) {
                    c38792H6h = AbstractC40398Hvl.parseFromJson(c16l);
                } else if ("viewer_marked_not_interested".equals(A0q)) {
                    bool11 = Boolean.valueOf(c16l.A0d());
                } else if ("will_add_author_to_mentioned_users".equals(A0q)) {
                    bool12 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            return new C99324d1(c99284cu, uQu, c99364d6, replyControlStr, urp, textAppSearchDiscussionTopicImpl, c38792H6h, urr, textPostAppHeaderFollowVariant, c4d9, textPostAppPostUnavailableReason, c66642URg, c38321qM, c99314cz, user, user2, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, num, num2, num3, num4, num5, num6, num7, num8, num9, l, l2, str, str2, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C99324d1 c99324d1) {
        anonymousClass182.A0d();
        Boolean bool = c99324d1.A0G;
        if (bool != null) {
            anonymousClass182.A0T("can_private_reply", bool.booleanValue());
        }
        Boolean bool2 = c99324d1.A0H;
        if (bool2 != null) {
            anonymousClass182.A0T("can_reply", bool2.booleanValue());
        }
        InterfaceC99344d3 interfaceC99344d3 = c99324d1.A07;
        if (interfaceC99344d3 != null) {
            anonymousClass182.A0r("debug_info");
            URR F38 = interfaceC99344d3.F38();
            anonymousClass182.A0d();
            String str = F38.A00;
            if (str != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(1025), str);
            }
            String str2 = F38.A01;
            if (str2 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(1128), str2);
            }
            String str3 = F38.A02;
            if (str3 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(1205), str3);
            }
            anonymousClass182.A0a();
        }
        Long l = c99324d1.A0b;
        if (l != null) {
            anonymousClass182.A0R("delete_timestamp", l.longValue());
        }
        Integer num = c99324d1.A0S;
        if (num != null) {
            anonymousClass182.A0Q("direct_reply_count", num.intValue());
        }
        Long l2 = c99324d1.A0c;
        if (l2 != null) {
            anonymousClass182.A0R("expiry_timestamp", l2.longValue());
        }
        InterfaceC99294cv interfaceC99294cv = c99324d1.A00;
        if (interfaceC99294cv != null) {
            anonymousClass182.A0r("fediverse_info");
            C99284cu EtT = interfaceC99294cv.EtT();
            anonymousClass182.A0d();
            Boolean bool3 = EtT.A00;
            if (bool3 != null) {
                anonymousClass182.A0T("enqueued_for_federation", bool3.booleanValue());
            }
            Integer num2 = EtT.A02;
            if (num2 != null) {
                anonymousClass182.A0Q("federated_like_count", num2.intValue());
            }
            Integer num3 = EtT.A03;
            if (num3 != null) {
                anonymousClass182.A0Q("fediverse_reply_count", num3.intValue());
            }
            Boolean bool4 = EtT.A01;
            if (bool4 != null) {
                anonymousClass182.A0T("is_federated", bool4.booleanValue());
            }
            Integer num4 = EtT.A04;
            if (num4 != null) {
                anonymousClass182.A0Q("liked_instance_count", num4.intValue());
            }
            Integer num5 = EtT.A05;
            if (num5 != null) {
                anonymousClass182.A0Q("reply_instance_count", num5.intValue());
            }
            List<String> list = EtT.A06;
            if (list != null) {
                C16V.A03(anonymousClass182, "reply_owner_profile_pic_uris");
                for (String str4 : list) {
                    if (str4 != null) {
                        anonymousClass182.A0u(str4);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        TextPostAppHeaderFollowVariant textPostAppHeaderFollowVariant = c99324d1.A08;
        if (textPostAppHeaderFollowVariant != null) {
            anonymousClass182.A0S("header_follow_variant", textPostAppHeaderFollowVariant.A00);
        }
        InterfaceC99354d5 interfaceC99354d5 = c99324d1.A01;
        if (interfaceC99354d5 != null) {
            anonymousClass182.A0r("hush_info");
            UQu EuC = interfaceC99354d5.EuC();
            anonymousClass182.A0d();
            anonymousClass182.A0T("can_hush", EuC.A01);
            anonymousClass182.A0T("can_unhush", EuC.A02);
            anonymousClass182.A0Q(AbstractC43591JPw.A00(326), EuC.A00);
            anonymousClass182.A0T("is_post_covered", EuC.A03);
            anonymousClass182.A0a();
        }
        Integer num6 = c99324d1.A0T;
        if (num6 != null) {
            anonymousClass182.A0Q("impression_count", num6.intValue());
        }
        Boolean bool5 = c99324d1.A0I;
        if (bool5 != null) {
            anonymousClass182.A0T("is_archived", bool5.booleanValue());
        }
        Boolean bool6 = c99324d1.A0J;
        if (bool6 != null) {
            anonymousClass182.A0T("is_first_post", bool6.booleanValue());
        }
        Boolean bool7 = c99324d1.A0K;
        if (bool7 != null) {
            anonymousClass182.A0T("is_parent_edited", bool7.booleanValue());
        }
        Boolean bool8 = c99324d1.A0L;
        if (bool8 != null) {
            anonymousClass182.A0T("is_post_unavailable", bool8.booleanValue());
        }
        Boolean bool9 = c99324d1.A0M;
        if (bool9 != null) {
            anonymousClass182.A0T("is_reply", bool9.booleanValue());
        }
        Boolean bool10 = c99324d1.A0N;
        if (bool10 != null) {
            anonymousClass182.A0T("is_share_ufi_highlight_enabled", bool10.booleanValue());
        }
        C99364d6 c99364d6 = c99324d1.A02;
        if (c99364d6 != null) {
            anonymousClass182.A0r("link_preview_attachment");
            anonymousClass182.A0d();
            String str5 = c99364d6.A02;
            if (str5 != null) {
                anonymousClass182.A0S("display_url", str5);
            }
            ImageUrl imageUrl = c99364d6.A00;
            if (imageUrl != null) {
                anonymousClass182.A0r("favicon_url");
                AbstractC222616c.A01(anonymousClass182, imageUrl);
            }
            ImageUrl imageUrl2 = c99364d6.A01;
            if (imageUrl2 != null) {
                anonymousClass182.A0r("image_url");
                AbstractC222616c.A01(anonymousClass182, imageUrl2);
            }
            String str6 = c99364d6.A03;
            if (str6 != null) {
                anonymousClass182.A0S("raw_url", str6);
            }
            String str7 = c99364d6.A04;
            if (str7 != null) {
                anonymousClass182.A0S(DialogModule.KEY_TITLE, str7);
            }
            String str8 = c99364d6.A05;
            if (str8 != null) {
                anonymousClass182.A0S("url", str8);
            }
            anonymousClass182.A0a();
        }
        C38321qM c38321qM = c99324d1.A0C;
        if (c38321qM != null) {
            anonymousClass182.A0r("linked_inline_media");
            C38801rC c38801rC = C38321qM.A0h;
            C38801rC.A07(anonymousClass182, c38321qM);
        }
        InterfaceC99384d8 interfaceC99384d8 = c99324d1.A0B;
        if (interfaceC99384d8 != null) {
            anonymousClass182.A0r("loop_community_info");
            C66642URg F4l = interfaceC99384d8.F4l(new C37761pD(null));
            anonymousClass182.A0d();
            String str9 = F4l.A05;
            if (str9 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(836), str9);
            }
            String str10 = F4l.A06;
            if (str10 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(837), str10);
            }
            Boolean bool11 = F4l.A01;
            if (bool11 != null) {
                anonymousClass182.A0T(AbstractC111324zv.A00(1051), bool11.booleanValue());
            }
            Boolean bool12 = F4l.A02;
            if (bool12 != null) {
                anonymousClass182.A0T(AbstractC111324zv.A00(1052), bool12.booleanValue());
            }
            Boolean bool13 = F4l.A03;
            if (bool13 != null) {
                anonymousClass182.A0T(AbstractC111324zv.A00(1067), bool13.booleanValue());
            }
            C38321qM c38321qM2 = F4l.A00;
            if (c38321qM2 != null) {
                anonymousClass182.A0r(AbstractC111324zv.A00(1087));
                C38801rC c38801rC2 = C38321qM.A0h;
                C38801rC.A07(anonymousClass182, c38321qM2);
            }
            Integer num7 = F4l.A04;
            if (num7 != null) {
                anonymousClass182.A0Q(AbstractC111324zv.A00(1150), num7.intValue());
            }
            anonymousClass182.A0a();
        }
        Integer num8 = c99324d1.A0U;
        if (num8 != null) {
            anonymousClass182.A0Q("mention_count", num8.intValue());
        }
        C4d9 c4d9 = c99324d1.A09;
        if (c4d9 != null) {
            anonymousClass182.A0r("pinned_post_info");
            anonymousClass182.A0d();
            Boolean bool14 = c4d9.A00;
            if (bool14 != null) {
                anonymousClass182.A0T(AbstractC111324zv.A00(781), bool14.booleanValue());
            }
            Boolean bool15 = c4d9.A01;
            if (bool15 != null) {
                anonymousClass182.A0T(AbstractC111324zv.A00(782), bool15.booleanValue());
            }
            Boolean bool16 = c4d9.A02;
            if (bool16 != null) {
                anonymousClass182.A0T(AbstractC111324zv.A00(783), bool16.booleanValue());
            }
            Boolean bool17 = c4d9.A03;
            if (bool17 != null) {
                anonymousClass182.A0T(AbstractC111324zv.A00(784), bool17.booleanValue());
            }
            Boolean bool18 = c4d9.A04;
            if (bool18 != null) {
                anonymousClass182.A0T(AbstractC111324zv.A00(971), bool18.booleanValue());
            }
            Boolean bool19 = c4d9.A05;
            if (bool19 != null) {
                anonymousClass182.A0T(AbstractC111324zv.A00(1058), bool19.booleanValue());
            }
            Boolean bool20 = c4d9.A06;
            if (bool20 != null) {
                anonymousClass182.A0T(AbstractC111324zv.A00(1059), bool20.booleanValue());
            }
            Boolean bool21 = c4d9.A07;
            if (bool21 != null) {
                anonymousClass182.A0T(AbstractC111324zv.A00(1163), bool21.booleanValue());
            }
            String str11 = c4d9.A08;
            if (str11 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(1164), str11);
            }
            String str12 = c4d9.A09;
            if (str12 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(1165), str12);
            }
            anonymousClass182.A0a();
        }
        String str13 = c99324d1.A0d;
        if (str13 != null) {
            anonymousClass182.A0S("post_preview_caption", str13);
        }
        TextPostAppPostUnavailableReason textPostAppPostUnavailableReason = c99324d1.A0A;
        if (textPostAppPostUnavailableReason != null) {
            anonymousClass182.A0S("post_unavailable_reason", textPostAppPostUnavailableReason.A00);
        }
        User user = c99324d1.A0E;
        if (user != null) {
            anonymousClass182.A0r("private_reply_partner");
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        Integer num9 = c99324d1.A0V;
        if (num9 != null) {
            anonymousClass182.A0Q("quote_count", num9.intValue());
        }
        InterfaceC99404dC interfaceC99404dC = c99324d1.A04;
        if (interfaceC99404dC != null) {
            anonymousClass182.A0r("related_trends_info");
            URP F2x = interfaceC99404dC.F2x();
            anonymousClass182.A0d();
            TextAppSearchDiscussionTopic textAppSearchDiscussionTopic = F2x.A00;
            if (textAppSearchDiscussionTopic != null) {
                anonymousClass182.A0r(AbstractC111324zv.A00(899));
                AbstractC99264cs.A00(anonymousClass182, textAppSearchDiscussionTopic.F2y());
            }
            Integer num10 = F2x.A01;
            if (num10 != null) {
                anonymousClass182.A0Q(AbstractC111324zv.A00(1222), num10.intValue());
            }
            String str14 = F2x.A02;
            if (str14 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(1223), str14);
            }
            String str15 = F2x.A03;
            if (str15 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(1349), str15);
            }
            anonymousClass182.A0a();
        }
        List<String> list2 = c99324d1.A0f;
        if (list2 != null) {
            C16V.A03(anonymousClass182, "relevant_hashtag_labels");
            for (String str16 : list2) {
                if (str16 != null) {
                    anonymousClass182.A0u(str16);
                }
            }
            anonymousClass182.A0Z();
        }
        ReplyControlStr replyControlStr = c99324d1.A03;
        if (replyControlStr != null) {
            anonymousClass182.A0S("reply_control", replyControlStr.A00);
        }
        Integer num11 = c99324d1.A0W;
        if (num11 != null) {
            anonymousClass182.A0Q("reply_count", num11.intValue());
        }
        List<User> list3 = c99324d1.A0g;
        if (list3 != null) {
            C16V.A03(anonymousClass182, "reply_facepile_users");
            for (User user2 : list3) {
                if (user2 != null) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    AbstractC38851rI.A08(anonymousClass182, user2);
                }
            }
            anonymousClass182.A0Z();
        }
        Integer num12 = c99324d1.A0X;
        if (num12 != null) {
            anonymousClass182.A0Q("reply_level", num12.intValue());
        }
        User user3 = c99324d1.A0F;
        if (user3 != null) {
            anonymousClass182.A0r("reply_to_author");
            Parcelable.Creator creator3 = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user3);
        }
        Integer num13 = c99324d1.A0Y;
        if (num13 != null) {
            anonymousClass182.A0Q("repost_count", num13.intValue());
        }
        Integer num14 = c99324d1.A0Z;
        if (num14 != null) {
            anonymousClass182.A0Q("reshare_count", num14.intValue());
        }
        TextAppSearchDiscussionTopic textAppSearchDiscussionTopic2 = c99324d1.A05;
        if (textAppSearchDiscussionTopic2 != null) {
            anonymousClass182.A0r("search_trend_info_from_link_preview");
            AbstractC99264cs.A00(anonymousClass182, textAppSearchDiscussionTopic2.F2y());
        }
        Integer num15 = c99324d1.A0a;
        if (num15 != null) {
            anonymousClass182.A0Q("self_thread_count", num15.intValue());
        }
        C99314cz c99314cz = c99324d1.A0D;
        if (c99314cz != null) {
            anonymousClass182.A0r("share_info");
            anonymousClass182.A0d();
            XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility = c99314cz.A01;
            if (xDTTextAppQuoteAttachmentEligibility != null) {
                anonymousClass182.A0S("can_quote_attachment", xDTTextAppQuoteAttachmentEligibility.A00);
            }
            Boolean bool22 = c99314cz.A05;
            if (bool22 != null) {
                anonymousClass182.A0T("can_quote_post", bool22.booleanValue());
            }
            Boolean bool23 = c99314cz.A06;
            if (bool23 != null) {
                anonymousClass182.A0T("can_repost", bool23.booleanValue());
            }
            Boolean bool24 = c99314cz.A07;
            if (bool24 != null) {
                anonymousClass182.A0T("can_unlink_quote", bool24.booleanValue());
            }
            Boolean bool25 = c99314cz.A08;
            if (bool25 != null) {
                anonymousClass182.A0T("can_unlink_quoted_attachment", bool25.booleanValue());
            }
            Boolean bool26 = c99314cz.A09;
            if (bool26 != null) {
                anonymousClass182.A0T("is_reposted_by_viewer", bool26.booleanValue());
            }
            Boolean bool27 = c99314cz.A0A;
            if (bool27 != null) {
                anonymousClass182.A0T("is_reshared_to_ig_by_viewer", bool27.booleanValue());
            }
            Boolean bool28 = c99314cz.A0B;
            if (bool28 != null) {
                anonymousClass182.A0T("quoted_attachment_author_attribution_allowed", bool28.booleanValue());
            }
            C38321qM c38321qM3 = c99314cz.A02;
            if (c38321qM3 != null) {
                anonymousClass182.A0r("quoted_attachment_post");
                C38801rC c38801rC3 = C38321qM.A0h;
                C38801rC.A07(anonymousClass182, c38321qM3);
            }
            Boolean bool29 = c99314cz.A0C;
            if (bool29 != null) {
                anonymousClass182.A0T("quoted_attachment_post_unavailable", bool29.booleanValue());
            }
            Integer num16 = c99314cz.A0D;
            if (num16 != null) {
                anonymousClass182.A0Q("quoted_attachment_usage_count", num16.intValue());
            }
            C38321qM c38321qM4 = c99314cz.A03;
            if (c38321qM4 != null) {
                anonymousClass182.A0r("quoted_post");
                C38801rC c38801rC4 = C38321qM.A0h;
                C38801rC.A07(anonymousClass182, c38321qM4);
            }
            String str17 = c99314cz.A0E;
            if (str17 != null) {
                anonymousClass182.A0S("quoted_post_caption", str17);
            }
            RepostRestrictedReason repostRestrictedReason = c99314cz.A00;
            if (repostRestrictedReason != null) {
                anonymousClass182.A0S("repost_restricted_reason", repostRestrictedReason.A00);
            }
            C38321qM c38321qM5 = c99314cz.A04;
            if (c38321qM5 != null) {
                anonymousClass182.A0r("reposted_post");
                C38801rC c38801rC5 = C38321qM.A0h;
                C38801rC.A07(anonymousClass182, c38321qM5);
            }
            anonymousClass182.A0a();
        }
        Boolean bool30 = c99324d1.A0O;
        if (bool30 != null) {
            anonymousClass182.A0T("should_prefetch_permalink", bool30.booleanValue());
        }
        Boolean bool31 = c99324d1.A0P;
        if (bool31 != null) {
            anonymousClass182.A0T("show_header_follow", bool31.booleanValue());
        }
        String str18 = c99324d1.A0e;
        if (str18 != null) {
            anonymousClass182.A0S("special_effects_enabled_str", str18);
        }
        InterfaceC99414dE interfaceC99414dE = c99324d1.A06;
        if (interfaceC99414dE != null) {
            anonymousClass182.A0r("text_fragments");
            C38792H6h F33 = interfaceC99414dE.F33(new C37761pD(null));
            anonymousClass182.A0d();
            List<JMW> list4 = F33.A00;
            if (list4 != null) {
                C16V.A03(anonymousClass182, "fragments");
                for (JMW jmw : list4) {
                    if (jmw != null) {
                        C38791H6g F31 = jmw.F31(new C37761pD(null));
                        anonymousClass182.A0d();
                        InterfaceC43495JJh interfaceC43495JJh = F31.A00;
                        if (interfaceC43495JJh != null) {
                            anonymousClass182.A0r(AbstractC111324zv.A00(933));
                            C38787H6c F2t = interfaceC43495JJh.F2t();
                            anonymousClass182.A0d();
                            String str19 = F2t.A00;
                            if (str19 != null) {
                                anonymousClass182.A0S(AbstractC111324zv.A00(417), str19);
                            }
                            anonymousClass182.A0a();
                        }
                        TextAppTextFragmentType textAppTextFragmentType = F31.A04;
                        if (textAppTextFragmentType != null) {
                            anonymousClass182.A0S(AbstractC111324zv.A00(947), textAppTextFragmentType.A00);
                        }
                        InterfaceC43517JKd interfaceC43517JKd = F31.A01;
                        if (interfaceC43517JKd != null) {
                            anonymousClass182.A0r(AbstractC111324zv.A00(1079));
                            C38788H6d F2u = interfaceC43517JKd.F2u();
                            anonymousClass182.A0d();
                            String str20 = F2u.A00;
                            if (str20 != null) {
                                anonymousClass182.A0S("display_text", str20);
                            }
                            String str21 = F2u.A01;
                            if (str21 != null) {
                                anonymousClass182.A0S("uri", str21);
                            }
                            anonymousClass182.A0a();
                        }
                        InterfaceC43542JLc interfaceC43542JLc = F31.A02;
                        if (interfaceC43542JLc != null) {
                            anonymousClass182.A0r(AbstractC111324zv.A00(1107));
                            C38789H6e F2w = interfaceC43542JLc.F2w(new C37761pD(null));
                            anonymousClass182.A0d();
                            TextAppMentionType textAppMentionType = F2w.A00;
                            if (textAppMentionType != null) {
                                anonymousClass182.A0S(AbstractC111324zv.A00(234), textAppMentionType.A00);
                            }
                            User user4 = F2w.A01;
                            if (user4 != null) {
                                anonymousClass182.A0r(AbstractC43591JPw.A00(173));
                                Parcelable.Creator creator4 = User.CREATOR;
                                AbstractC38851rI.A08(anonymousClass182, user4);
                            }
                            anonymousClass182.A0a();
                        }
                        String str22 = F31.A05;
                        if (str22 != null) {
                            anonymousClass182.A0S("plaintext", str22);
                        }
                        InterfaceC43496JJi interfaceC43496JJi = F31.A03;
                        if (interfaceC43496JJi != null) {
                            anonymousClass182.A0r(AbstractC111324zv.A00(1322));
                            C38790H6f F2z = interfaceC43496JJi.F2z();
                            anonymousClass182.A0d();
                            String str23 = F2z.A00;
                            if (str23 != null) {
                                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str23);
                            }
                            anonymousClass182.A0a();
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        Boolean bool32 = c99324d1.A0Q;
        if (bool32 != null) {
            anonymousClass182.A0T("viewer_marked_not_interested", bool32.booleanValue());
        }
        Boolean bool33 = c99324d1.A0R;
        if (bool33 != null) {
            anonymousClass182.A0T("will_add_author_to_mentioned_users", bool33.booleanValue());
        }
        anonymousClass182.A0a();
    }
}
