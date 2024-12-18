package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.api.schemas.ClipChainType;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.api.schemas.InspirationSignalType;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gi3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37670Gi3 {
    public static final void A05(EnumC120795dP enumC120795dP, BQL bql, EnumC37731Gj6 enumC37731Gj6, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC43589JPu interfaceC43589JPu, Integer num, Long l, Long l2, int i, long j) {
        C18920wW A0Q = AbstractC31173DnH.A0Q(interfaceC11380iw, userSession, bql, 7);
        C12180kM c12180kM = A0Q.A00;
        InterfaceC02590Ai A00 = A0Q.A00(c12180kM, "instagram_clips_viewer_link_impression");
        if (A00.isSampled()) {
            AbstractC25229BEm.A1A(A00, interfaceC11380iw);
            AbstractC37303Gc4.A0c(A00, i, j);
            InterfaceC43589JPu.A00(A00, interfaceC43589JPu);
            AbstractC25233BEq.A17(A00, "chaining_session_id", interfaceC43589JPu.Amq());
            A00.A8R(enumC37731Gj6, "delivery_class");
            A00.A8p("link_index", num);
            A00.A9K("app_attribution_id", l);
            AbstractC37300Gc1.A0e(bql, A00);
            AbstractC25225BEi.A1M(enumC120795dP, A00);
            A00.Cht();
        }
        if (bql == BQL.A0q) {
            InterfaceC02590Ai A002 = A0Q.A00(c12180kM, "ig_nme_benefits");
            if (A002.isSampled() && l2 != null) {
                A04(A002, l2, "impression");
            }
        }
    }

    public static final void A07(EnumC120795dP enumC120795dP, BQL bql, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, String str2, boolean z, boolean z2, boolean z3) {
        long j;
        Py6 py6;
        Py6 py62;
        Long A0j;
        int i = 0;
        C14360o3.A0B(interfaceC11380iw, 0);
        InterfaceC02590Ai A0A = AbstractC37302Gc3.A0A(interfaceC11380iw, userSession);
        if (A0A.isSampled()) {
            AbstractC25229BEm.A1A(A0A, interfaceC11380iw);
            String A2u = c38321qM.A2u();
            if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            AbstractC25230BEn.A1B(A0A, j);
            int i2 = 0;
            AbstractC25229BEm.A19(A0A, 0);
            AbstractC25225BEi.A1P(A0A, "");
            AbstractC37300Gc1.A0e(bql, A0A);
            AbstractC25225BEi.A1M(enumC120795dP, A0A);
            Py6[] values = Py6.values();
            int length = values.length;
            while (true) {
                py6 = null;
                if (i < length) {
                    py62 = values[i];
                    if (C14360o3.A0K(py62.A00, str)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    py62 = null;
                    break;
                }
            }
            A0A.A8R(py62, "original_language");
            Py6[] values2 = Py6.values();
            int length2 = values2.length;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                Py6 py63 = values2[i2];
                if (C14360o3.A0K(py63.A00, str2)) {
                    py6 = py63;
                    break;
                }
                i2++;
            }
            A03(py6, A0A, z);
            String str3 = "on";
            String str4 = "off";
            if (z2) {
                str4 = "on";
            }
            A0A.AAP("translation_consumption_setting", str4);
            if (!z3) {
                str3 = "off";
            }
            A0A.AAP("caption_consumption_setting", str3);
            A0A.Cht();
        }
    }

    public static final void A08(EnumC120795dP enumC120795dP, BQL bql, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC43589JPu interfaceC43589JPu, Integer num, Long l, Long l2, String str, int i, long j) {
        AbstractC25233BEq.A0y(2, interfaceC43589JPu, bql, enumC120795dP);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        C12180kM c12180kM = A01.A00;
        InterfaceC02590Ai A00 = A01.A00(c12180kM, "instagram_clips_viewer_link_tap");
        if (A00.isSampled()) {
            AbstractC25229BEm.A1A(A00, interfaceC11380iw);
            AbstractC37303Gc4.A0c(A00, i, j);
            InterfaceC43589JPu.A00(A00, interfaceC43589JPu);
            AbstractC37300Gc1.A0e(bql, A00);
            AbstractC25225BEi.A1M(enumC120795dP, A00);
            InterfaceC43589JPu.A01(A00, interfaceC43589JPu);
            A00.A9K("link_index", AbstractC25234BEr.A0X(A00, num, "ranking_info_token", str));
            A00.A9K("app_attribution_id", l);
            AbstractC167017dG.A1C(A00);
        }
        if (bql == BQL.A0q) {
            InterfaceC02590Ai A002 = A01.A00(c12180kM, "ig_nme_benefits");
            if (A002.isSampled() && l2 != null) {
                A04(A002, l2, "click");
            }
        }
    }

    public static final void A0A(EnumC120795dP enumC120795dP, BQL bql, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC43589JPu interfaceC43589JPu, int i) {
        long j;
        Long l;
        String attributionAppId;
        Long A0j;
        C14360o3.A0B(interfaceC43589JPu, 2);
        InterfaceC02590Ai A0A = AbstractC37302Gc3.A0A(interfaceC60442pS, userSession);
        if (A0A.isSampled()) {
            AbstractC25229BEm.A1A(A0A, interfaceC60442pS);
            String A2u = c38321qM.A2u();
            if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            AbstractC37303Gc4.A0c(A0A, i, j);
            InterfaceC43589JPu.A00(A0A, interfaceC43589JPu);
            User A14 = AbstractC25226BEj.A14(c38321qM);
            Long l2 = null;
            if (A14 != null) {
                l = AbstractC25231BEo.A0k(A14);
            } else {
                l = null;
            }
            AbstractC37300Gc1.A0k(A0A, l);
            A0A.AAP("chaining_session_id", interfaceC43589JPu.Amq());
            AbstractC37302Gc3.A0y(A0A, c38321qM);
            AbstractC37300Gc1.A0e(bql, A0A);
            AbstractC25225BEi.A1M(enumC120795dP, A0A);
            A0A.AAP("chaining_session_id", interfaceC43589JPu.Amq());
            A0A.A8R(EnumC37731Gj6.AD, "delivery_class");
            A0A.A9K("link_index", 1L);
            InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
            if (AoB != null && (attributionAppId = AoB.getAttributionAppId()) != null) {
                l2 = AbstractC166997dE.A0j(attributionAppId);
            }
            A0A.A9K("app_attribution_id", l2);
            A0A.A9K("link_index", 1L);
            A0A.Cht();
        }
    }

    public static final void A0B(EnumC120795dP enumC120795dP, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, InterfaceC43589JPu interfaceC43589JPu, String str, long j) {
        C14360o3.A0B(interfaceC43589JPu, 2);
        AbstractC167017dG.A1T(userSession, interfaceC11380iw);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_clips_comment_tap");
        AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
        String id = c38321qM.getId();
        if (id != null) {
            A0f.AAP("media_compound_key", id);
            AbstractC25230BEn.A1C(A0f, j);
            InterfaceC43589JPu.A00(A0f, interfaceC43589JPu);
            AbstractC25225BEi.A1M(enumC120795dP, A0f);
            AbstractC37300Gc1.A0j(A0f, null);
            A0f.AAP("viewer_init_media_compound_key", str);
            AbstractC25234BEr.A10(A0f, c38321qM);
            AbstractC167017dG.A1C(A0f);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A0C(BQL bql, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Boolean bool, String str) {
        long j;
        Long l;
        Py6 py6;
        Long A0j;
        C14360o3.A0B(userSession, 0);
        AbstractC167017dG.A1P(interfaceC60442pS, c38321qM);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_clips_viewer_link_impression");
        if (A0f.isSampled()) {
            AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
            String A2u = c38321qM.A2u();
            if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            AbstractC25230BEn.A1B(A0f, j);
            int i = 0;
            AbstractC25229BEm.A19(A0f, 0);
            AbstractC25225BEi.A1P(A0f, "");
            A0f.AAP("link_type", str);
            A0f.AAP("link_format", "tag_below_profile");
            AbstractC37300Gc1.A0e(bql, A0f);
            AbstractC25225BEi.A1M(EnumC120795dP.A0i, A0f);
            Py6[] values = Py6.values();
            int length = values.length;
            while (true) {
                l = null;
                if (i < length) {
                    py6 = values[i];
                    if (C14360o3.A0K(py6.A00, C1Q2.A02().getLanguage())) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    py6 = null;
                    break;
                }
            }
            A0f.A8R(py6, "translated_language");
            A0f.A7v("is_translated", bool);
            User A14 = AbstractC25226BEj.A14(c38321qM);
            if (A14 != null) {
                l = AbstractC25231BEo.A0k(A14);
            }
            AbstractC37300Gc1.A0k(A0f, l);
            A0f.Cht();
        }
    }

    public static final void A0D(BQL bql, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, boolean z) {
        long j;
        Py6 py6;
        Long A0j;
        C14360o3.A0B(userSession, 0);
        AbstractC167017dG.A1P(interfaceC60442pS, c38321qM);
        InterfaceC02590Ai A0A = AbstractC37302Gc3.A0A(interfaceC60442pS, userSession);
        if (A0A.isSampled()) {
            AbstractC25229BEm.A1A(A0A, interfaceC60442pS);
            String A2u = c38321qM.A2u();
            if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            AbstractC25230BEn.A1B(A0A, j);
            int i = 0;
            AbstractC25229BEm.A19(A0A, 0);
            AbstractC25225BEi.A1P(A0A, "");
            A0A.AAP("link_type", str);
            A0A.AAP("link_format", "tag_below_profile");
            AbstractC37300Gc1.A0e(bql, A0A);
            AbstractC25225BEi.A1M(EnumC120795dP.A0i, A0A);
            Py6[] values = Py6.values();
            int length = values.length;
            while (true) {
                if (i < length) {
                    py6 = values[i];
                    if (AbstractC37303Gc4.A1Z(py6)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    py6 = null;
                    break;
                }
            }
            A03(py6, A0A, z);
            A0A.Cht();
        }
    }

    public static final void A0H(EnumC39636HiR enumC39636HiR, C8JW c8jw, C153756vk c153756vk, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Long l, String str, String str2, String str3, String str4, String str5) {
        AbstractC167007dF.A1G(userSession, 0, interfaceC11380iw);
        C14360o3.A0B(c153756vk, 8);
        if (l != null) {
            Long A0W = AbstractC37302Gc3.A0W(str2);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_organic_play_button_tapped");
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            AbstractC37300Gc1.A0j(A0f, l);
            AbstractC37300Gc1.A0p(A0f, AbstractC166997dE.A0n());
            AbstractC37300Gc1.A0h(A0f, AbstractC37302Gc3.A0V(str));
            AbstractC37300Gc1.A0k(A0f, A0W);
            AbstractC25233BEq.A17(A0f, "ranking_info_token", str3);
            A0f.A9K("audio_owner_id", A0W);
            AbstractC37302Gc3.A0s(enumC39636HiR, A0f, str4);
            if (c8jw == null) {
                c8jw = c153756vk.A02;
            }
            A0f.A8R(c8jw, "pivot_page_entry_point");
            A0f.AAP("pivot_page_session_id", c153756vk.getSessionId());
            A0f.AAP("trending_tab_category", str5);
            A0f.Cht();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
    
        if (r10 == X.EnumC185288Jt.A0C) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0I(X.EnumC39636HiR r6, X.C153756vk r7, X.InterfaceC11380iw r8, com.instagram.common.session.UserSession r9, X.EnumC185288Jt r10, java.lang.Long r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC37670Gi3.A0I(X.HiR, X.6vk, X.0iw, com.instagram.common.session.UserSession, X.8Jt, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static final void A0L(EnumC39652Hih enumC39652Hih, C8JW c8jw, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, long j, long j2) {
        AbstractC167007dF.A1G(userSession, 1, c38321qM);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC60442pS, userSession, str2, 7), "instagram_organic_effect_tap");
        AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
        String id = c38321qM.getId();
        if (id != null) {
            A0f.AAP("media_compound_key", id);
            AbstractC25225BEi.A1M(enumC39652Hih, A0f);
            A0f.A9K("target_id", Long.valueOf(j));
            AbstractC37300Gc1.A0p(A0f, str);
            AbstractC25230BEn.A1C(A0f, j2);
            AbstractC25225BEi.A1P(A0f, str2);
            A0f.AAP("viewer_init_media_compound_key", str3);
            AbstractC25234BEr.A10(A0f, c38321qM);
            AbstractC37302Gc3.A0t(A0f);
            A0f.A8R(c8jw, "pivot_page_entry_point");
            A0f.Cht();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A0N(EnumC39652Hih enumC39652Hih, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, String str2, int i) {
        AbstractC167007dF.A1F(userSession, 1, str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_organic_clips_remix_option_impression");
        AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
        String A38 = c38321qM.A38();
        if (A38 != null) {
            AbstractC25236BEt.A0r(A0f, A38);
            AbstractC25225BEi.A1M(enumC39652Hih, A0f);
            C4SX c4sx = null;
            AbstractC37300Gc1.A0j(A0f, AbstractC37302Gc3.A0W(str2));
            if (c38321qM.A2E(userSession) != null) {
                User A2E = c38321qM.A2E(userSession);
                C14360o3.A0A(A2E);
                c4sx = C4SX.A00(A2E.getId());
            }
            A0f.AAK(c4sx, "media_author_id");
            AbstractC25230BEn.A1C(A0f, i);
            AbstractC37300Gc1.A0p(A0f, str);
            AbstractC25234BEr.A10(A0f, c38321qM);
            AbstractC167017dG.A1C(A0f);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A0R(EnumC39652Hih enumC39652Hih, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2, int i) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC60442pS, userSession, str, 3), "instagram_organic_see_all_effect_tap");
        AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
        String id = c38321qM.getId();
        if (id != null) {
            A0f.AAP("media_compound_key", id);
            AbstractC25225BEi.A1M(enumC39652Hih, A0f);
            AbstractC37300Gc1.A0p(A0f, AbstractC166997dE.A0n());
            AbstractC25230BEn.A1C(A0f, i);
            AbstractC25225BEi.A1P(A0f, str);
            A0f.AAP("viewer_init_media_compound_key", str2);
            AbstractC25234BEr.A10(A0f, c38321qM);
            AbstractC167017dG.A1C(A0f);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A0U(C120985dq c120985dq, UserSession userSession, InterfaceC60442pS interfaceC60442pS, SearchContext searchContext, String str) {
        C82713mZ A01;
        C14360o3.A0B(searchContext, 4);
        String A00 = AbstractC111324zv.A00(5007);
        if (c120985dq.A02 != null && (A01 = A01(c120985dq, userSession, interfaceC60442pS, A00)) != null) {
            A01.A6S = str;
            A01.A6y = searchContext.A05;
            A01.A6f = searchContext.A03;
            A01.A6d = searchContext.A02;
            C32U.A0I(userSession, A01, interfaceC60442pS, C05F.A00);
        }
    }

    public static final void A0X(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM) {
        List list;
        String str;
        long j;
        User A14;
        String A38;
        Long A0j;
        AbstractC167007dF.A1K(userSession, interfaceC11380iw);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_clips_subtitles_impression");
        if (A0f.isSampled()) {
            Long l = null;
            if (c38321qM != null) {
                list = c38321qM.A0C.CAf();
                str = c38321qM.A0C.CFX();
            } else {
                list = null;
                str = null;
            }
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            if (c38321qM != null && (A38 = c38321qM.A38()) != null && (A0j = AbstractC166997dE.A0j(A38)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            AbstractC37303Gc4.A0c(A0f, 0, j);
            String str2 = "";
            AbstractC25225BEi.A1P(A0f, "");
            A0f.AAP("original_language", AbstractC75343a1.A01(str));
            if (list != null && AbstractC166987dD.A1b(list)) {
                str2 = ((InterfaceC105674pe) list.get(0)).BL7();
            }
            A0f.AAP("translated_language", str2);
            String str3 = "on";
            String str4 = "off";
            if (AbstractC75343a1.A07(userSession)) {
                str4 = "on";
            }
            A0f.AAP("caption_consumption_setting", str4);
            if (!AbstractC75373a4.A06(userSession)) {
                str3 = "off";
            }
            A0f.AAP("translation_consumption_setting", str3);
            if (c38321qM != null && (A14 = AbstractC25226BEj.A14(c38321qM)) != null) {
                l = AbstractC25231BEo.A0k(A14);
            }
            AbstractC37300Gc1.A0k(A0f, l);
            A0f.Cht();
        }
    }

    public static final void A0a(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, String str2, String str3) {
        AbstractC25233BEq.A0w(2, str, str2, str3);
        C25531Mh A0I = C25531Mh.A0I(AbstractC12220kQ.A01(interfaceC11380iw, userSession));
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            A0I.A0Q("a_pk", AbstractC25228BEl.A13(A2E.getId()));
            User A2E2 = c38321qM.A2E(userSession);
            if (A2E2 != null) {
                A0I.A0R("follow_status", A2E2.B7L().toString());
                A0I.A0R("is_coming_from", "clips");
                A0I.A0O(AbstractC111324zv.A00(1037), false);
                String id = c38321qM.getId();
                if (id != null) {
                    A0I.A0l(id);
                    A0I.A0Q("m_t", AbstractC37302Gc3.A0U(c38321qM));
                    A0I.A0R(AbstractC111324zv.A00(495), "");
                    Long A0d = AbstractC167007dF.A0d();
                    AbstractC37305Gc6.A06(A0I, interfaceC11380iw, A0d);
                    A0I.A0R("sticker_id", str);
                    AbstractC37305Gc6.A07(A0I, userSession, A0d, str2);
                    A0I.A0R("viewer_session_id", str3);
                    A0I.Cht();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A0b(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, boolean z) {
        BQL bql;
        int i;
        long j;
        Py6 py6;
        String A2u;
        Long A0j;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_clips_viewer_link_impression");
        if (A0f.isSampled()) {
            if (z) {
                bql = BQL.A1A;
                i = 3102;
            } else {
                bql = BQL.A1B;
                i = 3106;
            }
            String A00 = AbstractC111324zv.A00(i);
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            if (c38321qM != null && (A2u = c38321qM.A2u()) != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            AbstractC25230BEn.A1B(A0f, j);
            int i2 = 0;
            AbstractC25229BEm.A19(A0f, 0);
            AbstractC25225BEi.A1P(A0f, str);
            A0f.AAP("link_format", AbstractC111324zv.A00(273));
            A0f.AAP("link_type", A00);
            AbstractC37300Gc1.A0e(bql, A0f);
            AbstractC25225BEi.A1M(EnumC120795dP.A0k, A0f);
            Py6[] values = Py6.values();
            int length = values.length;
            while (true) {
                if (i2 < length) {
                    py6 = values[i2];
                    if (AbstractC37303Gc4.A1Z(py6)) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    py6 = null;
                    break;
                }
            }
            A03(py6, A0f, true);
            A0f.Cht();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r2.isEmpty() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0j(com.instagram.common.session.UserSession r8, X.C38321qM r9, X.InterfaceC60442pS r10, X.InterfaceC43589JPu r11, java.lang.String r12, long r13) {
        /*
            r5 = 0
            r3 = 0
            if (r12 == 0) goto L98
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36312170372334528(0x8101ba001103c0, double:3.0273009886136664E-306)
            boolean r0 = X.C18U.A06(r2, r8, r0)
            if (r0 != 0) goto L98
            X.1rF r0 = r9.A0C
            java.util.List r2 = r0.CAf()
            if (r2 == 0) goto L20
            boolean r1 = r2.isEmpty()
            r0 = 0
            if (r1 == 0) goto L21
        L20:
            r0 = 1
        L21:
            r6 = 0
            if (r0 != 0) goto L9c
            boolean r0 = X.AbstractC75373a4.A07(r8)
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r2.get(r3)
            X.4pe r0 = (X.InterfaceC105674pe) r0
            java.lang.String r7 = r0.BL7()
            if (r7 == 0) goto L3c
            X.Gm1 r0 = X.EnumC37904Gm1.CLOSED_CAPTION
            java.util.List r6 = X.AbstractC166987dD.A1J(r0)
        L3c:
            X.0wW r1 = X.AbstractC12220kQ.A01(r10, r8)
            java.lang.String r0 = "instagram_clips_see_less"
            X.0Ai r4 = X.AbstractC166987dD.A0f(r1, r0)
            java.lang.String r0 = "see_less_hide"
            X.AbstractC31171DnF.A1C(r4, r0)
            X.AbstractC25229BEm.A1A(r4, r10)
            java.lang.String r0 = r9.A2u()
            r2 = 0
            if (r0 == 0) goto L99
            java.lang.Long r0 = X.AbstractC166997dE.A0j(r0)
            if (r0 == 0) goto L99
            long r0 = r0.longValue()
        L60:
            X.AbstractC25230BEn.A1B(r4, r0)
            com.instagram.user.model.User r0 = X.AbstractC25226BEj.A14(r9)
            if (r0 == 0) goto L73
            java.lang.Long r0 = X.AbstractC25231BEo.A0k(r0)
            if (r0 == 0) goto L73
            long r2 = r0.longValue()
        L73:
            X.AbstractC25230BEn.A1D(r4, r2)
            int r0 = (int) r13
            X.AbstractC25229BEm.A19(r4, r0)
            X.InterfaceC43589JPu.A00(r4, r11)
            X.InterfaceC43589JPu.A01(r4, r11)
            X.AbstractC37302Gc3.A0y(r4, r9)
            X.AbstractC37302Gc3.A0z(r4, r9)
            java.lang.String r0 = "sfplt_reason"
            X.AbstractC25233BEq.A17(r4, r0, r5)
            java.lang.String r0 = "translated_language"
            r4.AAP(r0, r7)
            java.lang.String r0 = "translation_delivery_method"
            r4.AAk(r0, r6)
            r4.Cht()
        L98:
            return
        L99:
            r0 = 0
            goto L60
        L9c:
            r7 = r5
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC37670Gi3.A0j(com.instagram.common.session.UserSession, X.1qM, X.2pS, X.JPu, java.lang.String, long):void");
    }

    public static void A03(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, boolean z) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "translated_language");
        interfaceC02590Ai.A7v("is_translated", Boolean.valueOf(z));
    }

    public static void A04(InterfaceC02590Ai interfaceC02590Ai, Long l, String str) {
        interfaceC02590Ai.AAP("event_type", str);
        interfaceC02590Ai.AAP(AbstractC111324zv.A00(1978), AbstractC111324zv.A00(1506));
        interfaceC02590Ai.AAP(AbstractC111324zv.A00(3187), "viewer");
        interfaceC02590Ai.AAP(AbstractC111324zv.A00(2811), "pill");
        interfaceC02590Ai.A9K(AbstractC111324zv.A00(2860), l);
        interfaceC02590Ai.AAP("surface", AbstractC111324zv.A00(2503));
        interfaceC02590Ai.Cht();
    }

    public static final void A06(EnumC120795dP enumC120795dP, BQL bql, C120985dq c120985dq, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, InterfaceC43589JPu interfaceC43589JPu, Integer num, int i) {
        long j;
        Long l;
        String attributionAppId;
        Long A0j;
        AbstractC37302Gc3.A1U(interfaceC43589JPu, c38321qM);
        String A2u = c38321qM.A2u();
        if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
        Long l2 = null;
        if (AoB != null && (attributionAppId = AoB.getAttributionAppId()) != null) {
            l = AbstractC166997dE.A0j(attributionAppId);
        } else {
            l = null;
        }
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            l2 = AbstractC25231BEo.A0k(A2E);
        }
        A05(enumC120795dP, bql, A00(c120985dq), interfaceC11380iw, userSession, interfaceC43589JPu, num, l, l2, i, j);
    }

    public static final void A09(EnumC120795dP enumC120795dP, BQL bql, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_clips_dialog_tap");
        if (A0f.isSampled()) {
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            AbstractC37303Gc4.A0c(A0f, 0, Long.parseLong(str));
            AbstractC25225BEi.A1P(A0f, "");
            AbstractC37300Gc1.A0e(bql, A0f);
            AbstractC25225BEi.A1M(enumC120795dP, A0f);
            AbstractC25232BEp.A1L(A0f, "nav_chain", String.valueOf(AbstractC25225BEi.A14()));
        }
    }

    public static final void A0K(EnumC39652Hih enumC39652Hih, C8JW c8jw, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, SearchContext searchContext, Boolean bool, Boolean bool2, Boolean bool3, Long l, String str, String str2, String str3, String str4, String str5, String str6, long j, long j2) {
        String str7;
        String str8;
        String str9;
        boolean A1b = AbstractC25233BEq.A1b(interfaceC11380iw, userSession, str);
        AbstractC25229BEm.A1L(str4, 10, searchContext);
        Boolean valueOf = Boolean.valueOf(A1b);
        String str10 = null;
        if (C14360o3.A0K(bool2, valueOf) && C14360o3.A0K(bool3, valueOf)) {
            str7 = "audio_multitrack_filter";
        } else if (C14360o3.A0K(bool3, valueOf)) {
            str7 = "audio_filter";
        } else if (C14360o3.A0K(bool2, valueOf)) {
            str7 = "audio_multitrack";
        } else {
            str7 = null;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), AbstractC43591JPw.A00(81));
        AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
        if (c38321qM == null || (str8 = c38321qM.getId()) == null) {
            str8 = "";
        }
        A0f.AAP("media_compound_key", str8);
        AbstractC25225BEi.A1M(enumC39652Hih, A0f);
        A0f.A9K("target_id", Long.valueOf(j));
        AbstractC37300Gc1.A0p(A0f, str);
        AbstractC25230BEn.A1C(A0f, j2);
        AbstractC25225BEi.A1P(A0f, str2);
        A0f.AAP("viewer_init_media_compound_key", str3);
        if (c38321qM != null) {
            str9 = c38321qM.A0C.getMezqlToken();
        } else {
            str9 = null;
        }
        A0f.AAP("mezql_token", str9);
        if (c38321qM != null) {
            str10 = AbstractC25226BEj.A1G(c38321qM);
        }
        AbstractC25233BEq.A17(A0f, "ranking_info_token", str10);
        A0f.A8R(c8jw, "pivot_page_entry_point");
        A0f.AAP("pivot_page_session_id", str4);
        A0f.A9K("best_audio_cluster_id", AbstractC37302Gc3.A0V(str5));
        A0f.AAP("search_session_id", searchContext.A05);
        A0f.AAP("rank_token", searchContext.A03);
        A0f.AAP("query_text", searchContext.A02);
        A0f.AAP("link_type", str7);
        A0f.A7v("is_audio_unavailable", bool);
        AbstractC37300Gc1.A0j(A0f, l);
        AbstractC25232BEp.A1L(A0f, "trending_tab_category", str6);
    }

    public static final void A0Y(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, C1M1 c1m1, String str, int i) {
        String str2;
        String str3;
        Long l;
        String str4;
        String str5;
        String str6;
        ClipChainType AoC;
        AbstractC167017dG.A1N(interfaceC11380iw, userSession);
        User A2E = c38321qM.A2E(userSession);
        C1571673v c1571673v = C1571673v.A00;
        String id = c38321qM.getId();
        if (id != null) {
            EnumC40111tc BRp = c38321qM.BRp();
            List A3o = c38321qM.A3o();
            ArrayList A3K = c38321qM.A3K();
            String A1G = AbstractC25226BEj.A1G(c38321qM);
            InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
            if (AoB != null) {
                str2 = AoB.getAttributionAppId();
            } else {
                str2 = null;
            }
            InterfaceC43530JKq Ao5 = c38321qM.A0C.Ao5();
            if (Ao5 != null && (AoC = Ao5.AoC()) != null) {
                str3 = AoC.A00;
            } else {
                str3 = null;
            }
            InterfaceC43530JKq Ao52 = c38321qM.A0C.Ao5();
            if (Ao52 != null) {
                l = AbstractC31171DnF.A0V(Ao52.Ao6());
            } else {
                l = null;
            }
            if (A2E != null) {
                str4 = A2E.getId();
                str5 = A2E.getUsername();
            } else {
                str4 = null;
                str5 = null;
            }
            int i2 = i / 3;
            int i3 = i % 3;
            if (c1m1 != null) {
                str6 = c1m1.getSessionId();
            } else {
                str6 = null;
            }
            c1571673v.A0C(interfaceC11380iw, userSession, BRp, l, id, A1G, str2, str3, str4, str5, str, str6, A3o, A3K, i2, i3);
            User A14 = AbstractC25226BEj.A14(c38321qM);
            String str7 = C55772hI.A00(userSession).A08;
            String str8 = C55772hI.A00(userSession).A09;
            if (A14 != null) {
                EnumC1571773w A0R = AbstractC31179DnN.A0R(userSession, A14);
                String str9 = userSession.userId;
                String A00 = AbstractC111324zv.A00(3207);
                C14360o3.A0B(A0R, 3);
                C1571673v.A02(null, null, interfaceC11380iw, userSession, A0R, null, null, null, null, null, null, A00, str9, "clips_tab", c38321qM.getId(), c38321qM.CAR(), null, str7, str8, null, null, null, null, AbstractC25226BEj.A1G(c38321qM), null, null, null);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A0g(InterfaceC11380iw interfaceC11380iw, UserSession userSession, boolean z, boolean z2) {
        EnumC120795dP enumC120795dP;
        if (z) {
            enumC120795dP = EnumC120795dP.A0B;
        } else {
            enumC120795dP = EnumC120795dP.A0C;
        }
        BQL bql = BQL.A0U;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_toggle_third_party_downloads_allowed_setting");
        AbstractC37300Gc1.A0e(bql, A0f);
        A0f.A7v("toggled_setting_new_value", Boolean.valueOf(z2));
        AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
        AbstractC25229BEm.A19(A0f, -1);
        AbstractC25225BEi.A1M(enumC120795dP, A0f);
        AbstractC167017dG.A1C(A0f);
    }

    public static final EnumC37731Gj6 A00(C120985dq c120985dq) {
        if (c120985dq.CdW()) {
            return EnumC37731Gj6.AD;
        }
        if (c120985dq.A0H()) {
            return EnumC37731Gj6.NETEGO;
        }
        if (c120985dq.A01 == EnumC129395t1.A0G) {
            return EnumC37731Gj6.ORGANIC;
        }
        return EnumC37731Gj6.UNKNOWN;
    }

    public static final C82713mZ A01(C120985dq c120985dq, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        if (c120985dq.CdW()) {
            return AbstractC82703mY.A01(userSession, null, interfaceC60442pS, c120985dq.A06(), null, null, str);
        }
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            return AbstractC37301Gc2.A0F(userSession, c38321qM, interfaceC60442pS, str);
        }
        throw AbstractC166997dE.A0g();
    }

    public static final String A02(SocialContextType socialContextType) {
        int ordinal = socialContextType.ordinal();
        if (ordinal != 9) {
            if (ordinal != 7) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 8) {
                            return null;
                        }
                        return "follower_count";
                    }
                    return GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
                }
                return "comment_reaction";
            }
            return "follow";
        }
        return "like";
    }

    public static final void A0E(EnumC39636HiR enumC39636HiR, EnumC39652Hih enumC39652Hih, C8JW c8jw, C153756vk c153756vk, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, long j) {
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        C25531Mh c25531Mh = new C25531Mh(AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), AbstractC111324zv.A00(2565)), DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
        c25531Mh.A0R("containermodule", interfaceC11380iw.getModuleName());
        c25531Mh.A0Q("container_id", Long.valueOf(j));
        c25531Mh.A0M(enumC39652Hih, "action_source");
        c25531Mh.A0Q("media_id", AbstractC37302Gc3.A0W(str2));
        c25531Mh.A0R("ranking_info_token", str3);
        c25531Mh.A0R("media_tap_token", AbstractC166997dE.A0n());
        c25531Mh.A0Q("music_canonical_segment_id", AbstractC37302Gc3.A0W(str4));
        c25531Mh.A0t(AbstractC25225BEi.A14());
        c25531Mh.A0M(enumC39636HiR, "audio_type");
        c25531Mh.A0R("audio_sub_type", str5);
        c25531Mh.A0Q("media_author_id", AbstractC37302Gc3.A0W(str));
        c25531Mh.A0Q("audio_owner_id", AbstractC37302Gc3.A0V(str));
        c25531Mh.A0R("trending_tab_category", str6);
        if (c153756vk != null) {
            if (c8jw == null) {
                c8jw = c153756vk.A02;
            }
            c25531Mh.A0M(c8jw, "pivot_page_entry_point");
            c25531Mh.A0R("pivot_page_session_id", c153756vk.getSessionId());
        }
        c25531Mh.Cht();
    }

    public static final void A0F(EnumC39636HiR enumC39636HiR, EnumC39652Hih enumC39652Hih, OriginalAudioSubtype originalAudioSubtype, C153756vk c153756vk, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, int i, long j, boolean z) {
        String str4;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_organic_audio_page_audio_mix_tap");
        if (A0f.isSampled()) {
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            AbstractC37301Gc2.A10(A0f, j);
            if (str3 == null) {
                str3 = "";
            }
            AbstractC37300Gc1.A0p(A0f, str3);
            String str5 = null;
            AbstractC37300Gc1.A0h(A0f, AbstractC37302Gc3.A0W(str));
            AbstractC37300Gc1.A0k(A0f, AbstractC37302Gc3.A0W(str2));
            A0f.A8R(enumC39636HiR, "audio_type");
            A0f.AAP("audio_sub_type", "mix");
            AbstractC37303Gc4.A0e(A0f, c153756vk);
            AbstractC25225BEi.A1M(enumC39652Hih, A0f);
            A0f.A9K("audio_mix_position", AbstractC31171DnF.A0V(i));
            if (z) {
                str5 = "MULTI_TRACKS_OVERFLOW_SHEET";
            }
            A0f.AAP("overflow_sheet", str5);
            int ordinal = originalAudioSubtype.ordinal();
            if (ordinal != 3) {
                if (ordinal != 1) {
                    str4 = null;
                } else {
                    str4 = "partial_attribution";
                }
            } else {
                str4 = "multitrack";
            }
            A0f.AAP("contained_audio_relationship", str4);
            A0f.Cht();
        }
    }

    public static final void A0G(EnumC39636HiR enumC39636HiR, C8JW c8jw, C153756vk c153756vk, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Long l, String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1N(interfaceC11380iw, userSession);
        C14360o3.A0B(c153756vk, 7);
        if (l != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_organic_pause_button_tapped");
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            AbstractC37300Gc1.A0j(A0f, l);
            AbstractC37300Gc1.A0p(A0f, AbstractC166997dE.A0n());
            AbstractC25233BEq.A17(A0f, "ranking_info_token", str);
            A0f.A9K("audio_owner_id", AbstractC25233BEq.A0n(str2));
            AbstractC37302Gc3.A0s(enumC39636HiR, A0f, str3);
            if (c8jw == null) {
                c8jw = c153756vk.A02;
            }
            A0f.A8R(c8jw, "pivot_page_entry_point");
            A0f.AAP("pivot_page_session_id", c153756vk.getSessionId());
            A0f.AAP("trending_tab_category", str4);
            A0f.Cht();
        }
    }

    public static final void A0J(EnumC39652Hih enumC39652Hih, C8JW c8jw, C153756vk c153756vk, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, long j) {
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        C25531Mh c25531Mh = new C25531Mh(AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), AbstractC111324zv.A00(2566)), 301);
        c25531Mh.A0R("containermodule", interfaceC11380iw.getModuleName());
        c25531Mh.A0Q("container_id", Long.valueOf(j));
        c25531Mh.A0M(enumC39652Hih, "action_source");
        c25531Mh.A0Q("media_id", AbstractC37302Gc3.A0W(str2));
        c25531Mh.A0R("ranking_info_token", str3);
        c25531Mh.A0R("media_tap_token", AbstractC166997dE.A0n());
        c25531Mh.A0t(AbstractC25225BEi.A14());
        c25531Mh.A0Q("media_author_id", AbstractC37302Gc3.A0V(str));
        c25531Mh.A0R("trending_tab_category", str4);
        if (c153756vk != null) {
            if (c8jw == null) {
                c8jw = c153756vk.A02;
            }
            c25531Mh.A0M(c8jw, "pivot_page_entry_point");
            c25531Mh.A0R("pivot_page_session_id", c153756vk.getSessionId());
        }
        c25531Mh.Cht();
    }

    public static final void A0M(EnumC39652Hih enumC39652Hih, C153756vk c153756vk, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, long j, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_organic_audio_trending_label_impression");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1M(enumC39652Hih, A0f);
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            AbstractC37301Gc2.A10(A0f, j);
            A0f.A9K("is_trending_label", Long.valueOf(AbstractC37302Gc3.A03(z ? 1 : 0)));
            InterfaceC02580Ag interfaceC02580Ag = null;
            if (str2 != null) {
                interfaceC02580Ag = C4SX.A00(str2);
            }
            A0f.AAK(interfaceC02580Ag, "media_author_id");
            AbstractC37300Gc1.A0h(A0f, AbstractC37302Gc3.A0V(str));
            A0f.A8R(c153756vk.A02, "pivot_page_entry_point");
            AbstractC25233BEq.A17(A0f, "pivot_page_session_id", c153756vk.getSessionId());
            A0f.Cht();
        }
    }

    public static final void A0O(EnumC39652Hih enumC39652Hih, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, String str2, long j) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_organic_location_tap");
        AbstractC25225BEi.A1M(enumC39652Hih, A0f);
        AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
        String A38 = c38321qM.A38();
        if (A38 != null) {
            AbstractC25236BEt.A0r(A0f, A38);
            A0f.A9K("target_id", AbstractC25228BEl.A13(str2));
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                A0f.AAK(C4SX.A00(A2E.getId()), "media_author_id");
                AbstractC25230BEn.A1C(A0f, j);
                AbstractC37300Gc1.A0p(A0f, str);
                AbstractC25234BEr.A10(A0f, c38321qM);
                A0f.Cht();
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A0P(EnumC39652Hih enumC39652Hih, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, long j) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0L(interfaceC11380iw, userSession), "instagram_organic_audio_trending_tap");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1M(enumC39652Hih, A0f);
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            AbstractC37301Gc2.A10(A0f, j);
            AbstractC25233BEq.A17(A0f, "media_tap_token", str);
            A0f.A9K("audio_owner_id", AbstractC37302Gc3.A0W(str2));
            AbstractC37300Gc1.A0h(A0f, AbstractC37302Gc3.A0V(str3));
            A0f.Cht();
        }
    }

    public static final void A0Q(EnumC39652Hih enumC39652Hih, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i) {
        A0N(enumC39652Hih, interfaceC60442pS, userSession, c38321qM, AbstractC167017dG.A0j(), null, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0S(com.instagram.api.schemas.SocialContextType r5, com.instagram.common.session.UserSession r6, X.C38321qM r7, X.InterfaceC60442pS r8, X.InterfaceC43589JPu r9, int r10) {
        /*
            X.0Ai r2 = X.AbstractC37302Gc3.A0A(r8, r6)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto Lc0
            X.1rF r0 = r7.A0C
            java.util.List r0 = r0.ByK()
            r4 = 0
            if (r0 == 0) goto L50
            java.util.Iterator r3 = r0.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.3vI r0 = (X.InterfaceC87503vI) r0
            com.instagram.api.schemas.SocialContextType r0 = r0.ByT()
            if (r0 != r5) goto L17
        L2a:
            X.3vI r1 = (X.InterfaceC87503vI) r1
            if (r1 == 0) goto L50
            java.util.List r0 = r1.ByM()
            if (r0 == 0) goto L50
            java.util.ArrayList r3 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r1 = r0.iterator()
        L3c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L51
            com.instagram.user.model.User r0 = X.AbstractC25226BEj.A15(r1)
            java.lang.String r0 = r0.getId()
            X.AbstractC31177DnL.A1R(r0, r3)
            goto L3c
        L4e:
            r1 = r4
            goto L2a
        L50:
            r3 = r4
        L51:
            X.AbstractC25229BEm.A1A(r2, r8)
            java.lang.String r0 = r7.A2u()
            if (r0 == 0) goto Lc3
            java.lang.Long r0 = X.AbstractC166997dE.A0j(r0)
            if (r0 == 0) goto Lc3
            long r0 = r0.longValue()
        L64:
            X.AbstractC37303Gc4.A0c(r2, r10, r0)
            X.InterfaceC43589JPu.A00(r2, r9)
            com.instagram.user.model.User r0 = X.AbstractC25226BEj.A14(r7)
            if (r0 == 0) goto Lc1
            java.lang.Long r0 = X.AbstractC25231BEo.A0k(r0)
        L74:
            X.AbstractC37300Gc1.A0k(r2, r0)
            X.InterfaceC43589JPu.A01(r2, r9)
            X.AbstractC37302Gc3.A0y(r2, r7)
            java.lang.String r1 = "tag_above_profile"
            java.lang.String r0 = "link_format"
            r2.AAP(r0, r1)
            java.lang.String r0 = "link_index"
            r2.A9K(r0, r4)
            X.AbstractC37302Gc3.A0t(r2)
            X.1rF r0 = r7.A0C
            X.DmE r0 = r0.AoB()
            if (r0 == 0) goto L9c
            java.lang.String r0 = r0.getAttributionAppId()
            java.lang.Long r4 = X.AbstractC37302Gc3.A0V(r0)
        L9c:
            java.lang.String r0 = "app_attribution_id"
            r2.A9K(r0, r4)
            X.BQL r0 = X.BQL.A1C
            X.AbstractC37300Gc1.A0e(r0, r2)
            X.5dP r0 = X.EnumC120795dP.A0i
            X.AbstractC25225BEi.A1M(r0, r2)
            java.lang.String r0 = "facepile_user_ids"
            r2.AAk(r0, r3)
            java.lang.String r1 = A02(r5)
            if (r1 != 0) goto Lb8
            java.lang.String r1 = "unknown"
        Lb8:
            java.lang.String r0 = "social_context_type"
            r2.AAP(r0, r1)
            r2.Cht()
        Lc0:
            return
        Lc1:
            r0 = r4
            goto L74
        Lc3:
            r0 = 0
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC37670Gi3.A0S(com.instagram.api.schemas.SocialContextType, com.instagram.common.session.UserSession, X.1qM, X.2pS, X.JPu, int):void");
    }

    public static final void A0T(C120985dq c120985dq, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, String str, boolean z) {
        long j;
        EnumC120795dP enumC120795dP;
        Py6 py6;
        Long A0j;
        boolean A1a = AbstractC167017dG.A1a(userSession, interfaceC11380iw);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_clips_viewer_link_impression");
        if (A0f.isSampled()) {
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            AbstractC25230BEn.A1B(A0f, j);
            int i = 0;
            AbstractC25229BEm.A19(A0f, AbstractC167017dG.A0K(num));
            AbstractC25225BEi.A1P(A0f, "");
            AbstractC37300Gc1.A0e(BQL.A0v, A0f);
            if (z) {
                enumC120795dP = EnumC120795dP.A0j;
            } else {
                enumC120795dP = EnumC120795dP.A02;
            }
            AbstractC25225BEi.A1M(enumC120795dP, A0f);
            Py6[] values = Py6.values();
            int length = values.length;
            while (true) {
                if (i < length) {
                    py6 = values[i];
                    if (AbstractC37303Gc4.A1Z(py6)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    py6 = null;
                    break;
                }
            }
            A03(py6, A0f, A1a);
            if (c120985dq != null) {
                A0f.A8R(A00(c120985dq), "delivery_class");
            }
            A0f.Cht();
        }
    }

    public static final void A0V(C120985dq c120985dq, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Integer num, String str, boolean z) {
        long j;
        EnumC120795dP enumC120795dP;
        Py6 py6;
        Long A0j;
        boolean A1a = AbstractC167017dG.A1a(userSession, interfaceC60442pS);
        InterfaceC02590Ai A0A = AbstractC37302Gc3.A0A(interfaceC60442pS, userSession);
        if (A0A.isSampled()) {
            AbstractC25229BEm.A1A(A0A, interfaceC60442pS);
            if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                j = A0j.longValue();
            } else {
                j = 0;
            }
            AbstractC25230BEn.A1B(A0A, j);
            int i = 0;
            AbstractC25229BEm.A19(A0A, AbstractC167017dG.A0K(num));
            AbstractC25225BEi.A1P(A0A, "");
            AbstractC37300Gc1.A0e(BQL.A0v, A0A);
            if (z) {
                enumC120795dP = EnumC120795dP.A0j;
            } else {
                enumC120795dP = EnumC120795dP.A02;
            }
            AbstractC25225BEi.A1M(enumC120795dP, A0A);
            Py6[] values = Py6.values();
            int length = values.length;
            while (true) {
                if (i < length) {
                    py6 = values[i];
                    if (AbstractC37303Gc4.A1Z(py6)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    py6 = null;
                    break;
                }
            }
            A03(py6, A0A, A1a);
            if (c120985dq != null) {
                A0A.A8R(A00(c120985dq), "delivery_class");
            }
            A0A.Cht();
        }
    }

    public static final void A0W(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        userSession.A01(C33E.class, C33D.A00);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, MSV.A00(194));
        if (A0f.isSampled()) {
            A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "quick_send_reels");
            A0f.Cht();
        }
    }

    public static final void A0Z(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, String str2, long j) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_clips_overflow_menu_option_tap");
        if (A0f.isSampled()) {
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            A0f.AAP("menu_option", str);
            String A38 = c38321qM.A38();
            if (A38 != null) {
                AbstractC25236BEt.A0r(A0f, A38);
                AbstractC25230BEn.A1C(A0f, j);
                if (str2 == null) {
                    str2 = "";
                }
                AbstractC25225BEi.A1P(A0f, str2);
                AbstractC25232BEp.A1L(A0f, "nav_chain", String.valueOf(AbstractC25225BEi.A14()));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static final void A0c(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, List list, int i) {
        Long A0k;
        CreatorViewerSignalModel creatorViewerSignalModel;
        AbstractC167017dG.A1N(interfaceC11380iw, userSession);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_lumen_recipe_sheet_overflow_tip_impression");
        String A2u = c38321qM.A2u();
        if (A2u != null && (A0k = AbstractC003100w.A0k(10, A2u)) != null && (creatorViewerSignalModel = (CreatorViewerSignalModel) AbstractC001800i.A0O(list, i)) != null && A0f.isSampled()) {
            ArrayList A0i = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A0x(new C0Zx(), (CreatorViewerSignalModel) it.next(), A0i);
            }
            AbstractC37305Gc6.A05(A0f, creatorViewerSignalModel, A0k);
            A0f.AAP("metric_name", "");
            AbstractC31175DnJ.A0z(A0f, i + 1);
            A0f.A9K(AbstractC111324zv.A00(1112), null);
            A0f.AAP("category", creatorViewerSignalModel.BxI().toString());
            AbstractC37301Gc2.A15(A0f, interfaceC11380iw);
            AbstractC37301Gc2.A1A(A0f, "flow", "recipe_sheet", A0i);
            AbstractC31176DnK.A1I(A0f);
        }
    }

    public static final void A0d(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, List list, int i) {
        Long A0k;
        CreatorViewerSignalModel creatorViewerSignalModel;
        AbstractC167027dH.A12(interfaceC11380iw, userSession, c38321qM);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC11380iw, userSession, list, 3), "ig_lumen_recipe_sheet_overflow_tip_tap");
        String A2u = c38321qM.A2u();
        if (A2u != null && (A0k = AbstractC003100w.A0k(10, A2u)) != null && (creatorViewerSignalModel = (CreatorViewerSignalModel) AbstractC001800i.A0O(list, i)) != null && A0f.isSampled()) {
            ArrayList A0i = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A0x(new C0Zx(), (CreatorViewerSignalModel) it.next(), A0i);
            }
            AbstractC37305Gc6.A05(A0f, creatorViewerSignalModel, A0k);
            A0f.AAP("metric_name", "");
            AbstractC31175DnJ.A0z(A0f, i + 1);
            A0f.A9K(AbstractC111324zv.A00(1112), null);
            A0f.AAP("category", creatorViewerSignalModel.BxI().toString());
            AbstractC37301Gc2.A15(A0f, interfaceC11380iw);
            AbstractC37301Gc2.A1A(A0f, "flow", "recipe_sheet", A0i);
            AbstractC31176DnK.A1I(A0f);
        }
    }

    public static final void A0e(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0L(interfaceC11380iw, userSession), AbstractC111324zv.A00(990));
        if (A0f.isSampled()) {
            A0f.AAP("event_name", AbstractC111324zv.A00(3299));
            A0f.AAP("entrypoint", str);
            A0f.Cht();
        }
    }

    public static final void A0f(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, List list, long j) {
        String str4;
        AbstractC167017dG.A1N(interfaceC11380iw, userSession);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC11380iw, userSession, str, 4), "ig_lumen_midcard_element_tap");
        if (A0f.isSampled()) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InspirationSignalType inspirationSignalType = (InspirationSignalType) it.next();
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("signal", inspirationSignalType.A00);
                A0q.add(c0Zx);
            }
            C0Zx c0Zx2 = new C0Zx();
            c0Zx2.A06("button_text_enum", str);
            List A1J = AbstractC166987dD.A1J(c0Zx2);
            A0f.A9K("media_ig_id", Long.valueOf(j));
            InspirationSignalType inspirationSignalType2 = (InspirationSignalType) AbstractC001800i.A0J(list);
            if (inspirationSignalType2 == null || (str4 = inspirationSignalType2.A00) == null) {
                str4 = InspirationSignalType.A0E.A00;
            }
            AbstractC37301Gc2.A1A(A0f, "signal", str4, A0q);
            A0f.AAk("button_info", A1J);
            AbstractC37301Gc2.A15(A0f, interfaceC11380iw);
            A0f.AAP("layout", str2);
            A0f.AAP("midcard_type", str3);
            A0f.Cht();
        }
    }

    public static final void A0h(UserSession userSession, InterfaceC11380iw interfaceC11380iw, String str, String str2, String str3, int i) {
        AbstractC167017dG.A1N(interfaceC11380iw, userSession);
        InterfaceC02590Ai A10 = AbstractC25232BEp.A10(interfaceC11380iw, userSession);
        if (A10.isSampled()) {
            A10.AAP("organic_tap_action", str);
            A10.AAP("organic_tap_action_source", str2);
            AbstractC25229BEm.A1A(A10, interfaceC11380iw);
            AbstractC25229BEm.A19(A10, i);
            if (str3 == null) {
                str3 = "";
            }
            AbstractC25225BEi.A1P(A10, str3);
            A10.Cht();
        }
    }

    public static final void A0i(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC43589JPu interfaceC43589JPu, Long l, String str, String str2, String str3, int i, int i2) {
        long j;
        String str4;
        Long l2;
        String id;
        Long A0j;
        User A14;
        String pkId;
        Long A0j2;
        AbstractC167017dG.A1N(interfaceC60442pS, userSession);
        C14360o3.A0B(interfaceC43589JPu, 4);
        if (str2 != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_clips_viewer_exit");
            AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
            long j2 = -1;
            if (c38321qM != null && (A14 = AbstractC25226BEj.A14(c38321qM)) != null && (pkId = A14.A03.getPkId()) != null && (A0j2 = AbstractC166997dE.A0j(pkId)) != null) {
                j = A0j2.longValue();
            } else {
                j = -1;
            }
            AbstractC25230BEn.A1D(A0f, j);
            if (c38321qM != null && (id = c38321qM.getId()) != null && (A0j = AbstractC166997dE.A0j(id)) != null) {
                j2 = A0j.longValue();
            }
            AbstractC37303Gc4.A0c(A0f, i, j2);
            AbstractC37303Gc4.A0a(A0f);
            A0f.AAP("viewer_exit_action_source", str);
            InterfaceC43589JPu.A00(A0f, interfaceC43589JPu);
            InterfaceC43589JPu.A01(A0f, interfaceC43589JPu);
            if (c38321qM != null) {
                str4 = AbstractC25226BEj.A1G(c38321qM);
            } else {
                str4 = null;
            }
            A0f.AAP("ranking_info_token", str4);
            if (l != null) {
                long longValue = l.longValue();
                C11520jB A0B = AbstractC37300Gc1.A0B();
                C11500j9 c11500j9 = C5I8.A24;
                boolean z = true;
                AbstractC37300Gc1.A0z(c11500j9, A0B, true);
                C11500j9 c11500j92 = C5I8.A23;
                if (i2 == 0) {
                    z = false;
                }
                AbstractC37300Gc1.A0z(c11500j92, A0B, z);
                C11500j9 c11500j93 = C5I8.A22;
                A0B.A04(c11500j93, Integer.valueOf(i2));
                C11500j9 c11500j94 = C5I8.A0C;
                A0B.A04(c11500j94, Long.valueOf(longValue));
                C0Zx c0Zx = new C0Zx();
                c0Zx.A03("is_delayed_skip_ad", (Boolean) A0B.A01(c11500j9));
                c0Zx.A03("is_action_on_unskippable", (Boolean) A0B.A01(c11500j92));
                Number number = (Number) A0B.A01(c11500j93);
                if (number != null) {
                    l2 = AbstractC25229BEm.A0n(number);
                } else {
                    l2 = null;
                }
                c0Zx.A05(AbstractC111324zv.A00(1888), l2);
                c0Zx.A05("ad_id", (Long) A0B.A01(c11500j94));
                A0f.AAQ(c0Zx, AbstractC111324zv.A00(2994));
            }
            if (str3 != null) {
                A0f.A9K("blend_id", AbstractC25228BEl.A13(str3));
            }
            A0f.Cht();
        }
    }

    public static final void A0k(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC43589JPu interfaceC43589JPu, String str, String str2, int i) {
        AbstractC167017dG.A1N(interfaceC60442pS, userSession);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC60442pS, userSession, interfaceC43589JPu, 3), "instagram_clips_create_clips");
        AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
        AbstractC25230BEn.A1C(A0f, i);
        InterfaceC43589JPu.A00(A0f, interfaceC43589JPu);
        AbstractC37300Gc1.A0j(A0f, null);
        A0f.AAP("media_compound_key", c38321qM.getId());
        InterfaceC43589JPu.A01(A0f, interfaceC43589JPu);
        A0f.AAP("viewer_init_media_compound_key", str);
        AbstractC25234BEr.A10(A0f, c38321qM);
        A0f.A9K("best_audio_cluster_id", AbstractC37302Gc3.A0V(str2));
        AbstractC167017dG.A1C(A0f);
    }

    public static final void A0l(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2, long j) {
        C4GI BZr;
        AbstractC25234BEr.A1P(userSession, c38321qM, str);
        C14360o3.A0B(str2, 5);
        InterfaceC84163p3 A1P = c38321qM.A1P();
        if (A1P != null && (BZr = A1P.BZr()) != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_organic_clips_remix_owner_tap");
            AbstractC31171DnF.A1C(A0f, MSV.A00(963));
            AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
            AbstractC25225BEi.A1P(A0f, str);
            A0f.A9K("media_type", AbstractC37302Gc3.A0U(c38321qM));
            A0f.A9K(AbstractC111324zv.A00(2700), 16L);
            String A38 = c38321qM.A38();
            if (A38 != null) {
                A0f.AAP("media_id", A38);
                AbstractC25230BEn.A1C(A0f, j);
                User A2E = c38321qM.A2E(userSession);
                if (A2E != null) {
                    A0f.AAP("media_author_id", A2E.getId());
                    String A0S = AbstractC37300Gc1.A0S(c38321qM);
                    if (A0S == null) {
                        A0S = "";
                    }
                    A0f.AAP("inventory_source", A0S);
                    A0f.AAP("ranking_session_id", str2);
                    long j2 = 0;
                    A0f.A9K("chaining_seed_author_id", Long.valueOf(AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, BZr.CDj().getId()))));
                    String pk = BZr.getPk();
                    C14360o3.A0B(pk, 0);
                    Long A0k = AbstractC003100w.A0k(10, pk);
                    if (A0k != null) {
                        j2 = A0k.longValue();
                    }
                    A0f.A9K("chaining_seed_media_id", Long.valueOf(j2));
                    AbstractC25234BEr.A10(A0f, c38321qM);
                    AbstractC37300Gc1.A0o(A0f, c38321qM.CAR());
                    A0f.Cht();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }
}
