package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.GlH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37862GlH {
    public static final void A02(SocialContextType socialContextType, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2, int i, int i2, long j, boolean z) {
        long j2;
        Long l;
        Long A0j;
        C14360o3.A0B(str, 2);
        if (c38321qM != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_friendly_bubble_long_press");
            if (A0f.isSampled()) {
                AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
                String A38 = c38321qM.A38();
                if (A38 != null && (A0j = AbstractC166997dE.A0j(A38)) != null) {
                    j2 = A0j.longValue();
                } else {
                    j2 = 0;
                }
                AbstractC37303Gc4.A0c(A0f, i, j2);
                AbstractC25225BEi.A1P(A0f, str);
                User A14 = AbstractC25226BEj.A14(c38321qM);
                if (A14 != null) {
                    l = AbstractC25231BEo.A0k(A14);
                } else {
                    l = null;
                }
                AbstractC25233BEq.A17(A0f, "ranking_info_token", A00(A0f, c38321qM, l, str2));
                A01(A0f, socialContextType, Long.valueOf(j), i2, z);
                AbstractC31176DnK.A1I(A0f);
            }
        }
    }

    public static final void A03(SocialContextType socialContextType, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2, int i, int i2, long j, boolean z) {
        long j2;
        Long l;
        Long A0j;
        C14360o3.A0B(str, 2);
        if (c38321qM != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_clips_friendly_viewer_keyboard_interaction_client");
            if (A0f.isSampled()) {
                AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
                String A38 = c38321qM.A38();
                if (A38 != null && (A0j = AbstractC166997dE.A0j(A38)) != null) {
                    j2 = A0j.longValue();
                } else {
                    j2 = 0;
                }
                AbstractC37303Gc4.A0c(A0f, i, j2);
                AbstractC25225BEi.A1P(A0f, str);
                User A14 = AbstractC25226BEj.A14(c38321qM);
                if (A14 != null) {
                    l = AbstractC25231BEo.A0k(A14);
                } else {
                    l = null;
                }
                AbstractC25233BEq.A17(A0f, "ranking_info_token", A00(A0f, c38321qM, l, str2));
                A0f.AAk("facepile_user_ids", AbstractC166987dD.A1J(Long.valueOf(j)));
                A0f.AAP("social_context_type", AbstractC37670Gi3.A02(socialContextType));
                A0f.A7v("immersive_viewer", AbstractC37300Gc1.A0P(A0f, AbstractC31171DnF.A0V(i2), "bubble_position", z));
                AbstractC31176DnK.A1I(A0f);
            }
        }
    }

    public static final void A04(SocialContextType socialContextType, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2, int i, int i2, long j, boolean z, boolean z2) {
        Long A0j;
        long j2;
        Long l;
        Long A0j2;
        long j3;
        Long l2;
        Long A0j3;
        C14360o3.A0B(str, 2);
        if (c38321qM != null) {
            long j4 = 0;
            if (z2) {
                InterfaceC02590Ai A0A = AbstractC37302Gc3.A0A(interfaceC60442pS, userSession);
                if (A0A.isSampled()) {
                    AbstractC25229BEm.A1A(A0A, interfaceC60442pS);
                    String A2u = c38321qM.A2u();
                    if (A2u != null && (A0j3 = AbstractC166997dE.A0j(A2u)) != null) {
                        j3 = A0j3.longValue();
                    } else {
                        j3 = 0;
                    }
                    AbstractC37303Gc4.A0c(A0A, i, j3);
                    AbstractC25225BEi.A1P(A0A, str);
                    User A14 = AbstractC25226BEj.A14(c38321qM);
                    Long l3 = null;
                    if (A14 != null) {
                        l2 = AbstractC25231BEo.A0k(A14);
                    } else {
                        l2 = null;
                    }
                    AbstractC37300Gc1.A0k(A0A, l2);
                    AbstractC37300Gc1.A0r(A0A, str2);
                    AbstractC37302Gc3.A0y(A0A, c38321qM);
                    A0A.AAP("link_format", "tag_above_profile");
                    A0A.A9K("link_index", null);
                    AbstractC37302Gc3.A0t(A0A);
                    InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
                    if (AoB != null) {
                        l3 = AbstractC37302Gc3.A0V(AoB.getAttributionAppId());
                    }
                    A0A.A9K("app_attribution_id", l3);
                    AbstractC37300Gc1.A0e(BQL.A1C, A0A);
                    AbstractC25225BEi.A1M(EnumC120795dP.A0Q, A0A);
                    A0A.AAk("facepile_user_ids", AbstractC166987dD.A1J(Long.valueOf(j)));
                    String A02 = AbstractC37670Gi3.A02(socialContextType);
                    if (A02 == null) {
                        A02 = "unknown";
                    }
                    A0A.AAP("social_context_type", A02);
                    A0A.Cht();
                }
                if (!c38321qM.CdW()) {
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_clips_bubble_tap");
                    if (A0f.isSampled()) {
                        AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
                        String A38 = c38321qM.A38();
                        if (A38 != null && (A0j2 = AbstractC166997dE.A0j(A38)) != null) {
                            j2 = A0j2.longValue();
                        } else {
                            j2 = 0;
                        }
                        AbstractC37303Gc4.A0c(A0f, i, j2);
                        AbstractC25225BEi.A1P(A0f, str);
                        User A142 = AbstractC25226BEj.A14(c38321qM);
                        if (A142 != null) {
                            l = AbstractC25231BEo.A0k(A142);
                        } else {
                            l = null;
                        }
                        AbstractC25233BEq.A17(A0f, "ranking_info_token", A00(A0f, c38321qM, l, str2));
                        A01(A0f, socialContextType, Long.valueOf(j), i2, z);
                        AbstractC31176DnK.A1I(A0f);
                    }
                }
            }
            if (c38321qM.CdW()) {
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_ad_bubble_tap");
                if (A0f2.isSampled()) {
                    AbstractC25229BEm.A1A(A0f2, interfaceC60442pS);
                    String A382 = c38321qM.A38();
                    if (A382 != null && (A0j = AbstractC166997dE.A0j(A382)) != null) {
                        j4 = A0j.longValue();
                    }
                    AbstractC37303Gc4.A0c(A0f2, i, j4);
                    AbstractC25225BEi.A1P(A0f2, str);
                    AbstractC37300Gc1.A0g(A0f2, AbstractC25233BEq.A0n(c38321qM.A2W()));
                    AbstractC37300Gc1.A0o(A0f2, c38321qM.A33());
                    AbstractC37300Gc1.A0r(A0f2, str2);
                    AbstractC25233BEq.A17(A0f2, "ranking_info_token", AbstractC25226BEj.A1G(c38321qM));
                    A01(A0f2, socialContextType, Long.valueOf(j), i2, z);
                    A0f2.A7v("is_tappable", Boolean.valueOf(z2));
                    AbstractC31176DnK.A1I(A0f2);
                }
            }
        }
    }

    public static final void A05(SocialContextType socialContextType, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, int i, int i2, long j, boolean z) {
        long j2;
        Long A0j;
        long j3;
        Long A0j2;
        C14360o3.A0B(str, 2);
        if (c38321qM != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_clips_viewer_link_impression");
            if (A0f.isSampled()) {
                AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
                String A2u = c38321qM.A2u();
                if (A2u != null && (A0j2 = AbstractC166997dE.A0j(A2u)) != null) {
                    j3 = A0j2.longValue();
                } else {
                    j3 = 0;
                }
                AbstractC37303Gc4.A0c(A0f, i, j3);
                AbstractC25233BEq.A17(A0f, "viewer_session_id", str);
                AbstractC37300Gc1.A0e(BQL.A1C, A0f);
                AbstractC25225BEi.A1M(EnumC120795dP.A0Q, A0f);
                A0f.Cht();
            }
            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_clips_bubble_impression");
            if (A0f2.isSampled()) {
                AbstractC25229BEm.A1A(A0f2, interfaceC60442pS);
                String A38 = c38321qM.A38();
                if (A38 != null && (A0j = AbstractC166997dE.A0j(A38)) != null) {
                    j2 = A0j.longValue();
                } else {
                    j2 = 0;
                }
                AbstractC37303Gc4.A0c(A0f2, i, j2);
                AbstractC25225BEi.A1P(A0f2, str);
                User A14 = AbstractC25226BEj.A14(c38321qM);
                Long l = null;
                if (A14 != null) {
                    l = AbstractC25231BEo.A0k(A14);
                }
                AbstractC25233BEq.A17(A0f2, "ranking_info_token", A00(A0f2, c38321qM, l, str2));
                A01(A0f2, socialContextType, Long.valueOf(j), i2, z);
                A0f2.A9K("comment_id", AbstractC37302Gc3.A0V(str3));
                AbstractC31176DnK.A1I(A0f2);
            }
        }
    }

    public static final void A06(SocialContextType socialContextType, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2, List list, int i, boolean z) {
        long j;
        Long l;
        Long A0j;
        C14360o3.A0B(str, 2);
        if (c38321qM != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_clips_bubble_drag_dismissal");
            if (A0f.isSampled()) {
                AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
                String A38 = c38321qM.A38();
                if (A38 != null && (A0j = AbstractC166997dE.A0j(A38)) != null) {
                    j = A0j.longValue();
                } else {
                    j = 0;
                }
                AbstractC37303Gc4.A0c(A0f, i, j);
                AbstractC25225BEi.A1P(A0f, str);
                User A14 = AbstractC25226BEj.A14(c38321qM);
                if (A14 != null) {
                    l = AbstractC25231BEo.A0k(A14);
                } else {
                    l = null;
                }
                AbstractC25233BEq.A17(A0f, "ranking_info_token", A00(A0f, c38321qM, l, str2));
                A0f.AAk("facepile_user_ids", list);
                A0f.A7v("immersive_viewer", AbstractC31173DnH.A0e(A0f, "social_context_type", AbstractC37670Gi3.A02(socialContextType), z));
                AbstractC31176DnK.A1I(A0f);
            }
        }
    }

    public static String A00(InterfaceC02590Ai interfaceC02590Ai, C38321qM c38321qM, Long l, String str) {
        interfaceC02590Ai.A9K("media_author_id", l);
        interfaceC02590Ai.AAP("chaining_session_id", str);
        return c38321qM.A0C.getLoggingInfoToken();
    }

    public static final void A07(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, long j, boolean z) {
        String str;
        if (c38321qM != null) {
            C18A A00 = AnonymousClass189.A00(userSession);
            String valueOf = String.valueOf(j);
            if (A00.A02(valueOf) != null) {
                if (z) {
                    str = "friendly_viewer_bubble_tap";
                } else {
                    str = "friendly_feed_bubble_tap";
                }
                C1571673v.A09(interfaceC60442pS, userSession, EnumC1571773w.A03, str, valueOf, c38321qM.getId(), c38321qM.CAR(), AbstractC25226BEj.A1G(c38321qM), AbstractC111324zv.A00(79));
            }
        }
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, SocialContextType socialContextType, Object obj, int i, boolean z) {
        List singletonList = Collections.singletonList(obj);
        C14360o3.A07(singletonList);
        interfaceC02590Ai.AAk("facepile_user_ids", singletonList);
        interfaceC02590Ai.AAP("social_context_type", AbstractC37670Gi3.A02(socialContextType));
        interfaceC02590Ai.A8p("bubble_position", Integer.valueOf(i));
        interfaceC02590Ai.A7v("immersive_viewer", Boolean.valueOf(z));
    }
}
