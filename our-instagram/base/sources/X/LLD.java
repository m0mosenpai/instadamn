package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;

/* loaded from: classes8.dex */
public abstract class LLD {
    public static final long A00(UserSession userSession) {
        String str = userSession.userId;
        C14360o3.A0B(str, 0);
        return AbstractC167027dH.A03(str);
    }

    public static final void A01(EnumC46297KeT enumC46297KeT, EnumC46278KeA enumC46278KeA, UserSession userSession, DirectThreadAnalyticsParams directThreadAnalyticsParams) {
        Long l;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "mwb_odnc_interaction_event");
        if (A0f.isSampled()) {
            AbstractC31178DnM.A16(A0f, userSession);
            JQ0.A12(enumC46297KeT, enumC46278KeA, A0f, "get_safety_tips_click");
            EnumC1579076z enumC1579076z = null;
            if (directThreadAnalyticsParams != null) {
                l = Long.valueOf(directThreadAnalyticsParams.A01);
            } else {
                l = null;
            }
            A0f.A9K("thread_size", l);
            if (directThreadAnalyticsParams != null) {
                enumC1579076z = directThreadAnalyticsParams.A02;
            }
            AbstractC43593JPy.A1H(A0f, AbstractC43594JPz.A0p(enumC1579076z, A0f, directThreadAnalyticsParams));
        }
    }

    public static final void A02(EnumC46297KeT enumC46297KeT, UserSession userSession, DirectThreadAnalyticsParams directThreadAnalyticsParams) {
        Long l;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0N(userSession), "mwb_odnc_interaction_event");
        if (A0f.isSampled()) {
            AbstractC31178DnM.A16(A0f, userSession);
            A0f.AAP("event_name", "dialog_ok_click");
            A0f.A8R(enumC46297KeT, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.A8R(EnumC46278KeA.SENDER, "user_role");
            EnumC1579076z enumC1579076z = null;
            if (directThreadAnalyticsParams != null) {
                l = Long.valueOf(directThreadAnalyticsParams.A01);
            } else {
                l = null;
            }
            A0f.A9K("thread_size", l);
            if (directThreadAnalyticsParams != null) {
                enumC1579076z = directThreadAnalyticsParams.A02;
            }
            AbstractC43593JPy.A1H(A0f, AbstractC43594JPz.A0p(enumC1579076z, A0f, directThreadAnalyticsParams));
        }
    }

    public static final void A03(EnumC46297KeT enumC46297KeT, UserSession userSession, DirectThreadAnalyticsParams directThreadAnalyticsParams, boolean z) {
        EnumC46278KeA enumC46278KeA;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0N(userSession), "mwb_odnc_interaction_event");
        if (A0f.isSampled()) {
            if (z) {
                enumC46278KeA = EnumC46278KeA.SENDER;
            } else {
                enumC46278KeA = EnumC46278KeA.RECEIVER;
            }
            AbstractC31178DnM.A16(A0f, userSession);
            JQ0.A12(enumC46297KeT, enumC46278KeA, A0f, "blur_impression");
            A0f.A9K("thread_size", Long.valueOf(directThreadAnalyticsParams.A01));
            A0f.A8R(directThreadAnalyticsParams.A02, "direct_source");
            AbstractC43593JPy.A1H(A0f, Long.valueOf(directThreadAnalyticsParams.A00));
        }
        ((C48507Lcy) userSession.A01(C48507Lcy.class, new C50159MDm(userSession, 2))).A00 = true;
    }

    public static final void A04(EnumC46297KeT enumC46297KeT, UserSession userSession, DirectThreadAnalyticsParams directThreadAnalyticsParams, boolean z) {
        EnumC46278KeA enumC46278KeA;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "mwb_odnc_interaction_event");
        if (A0f.isSampled()) {
            if (z) {
                enumC46278KeA = EnumC46278KeA.SENDER;
            } else {
                enumC46278KeA = EnumC46278KeA.RECEIVER;
            }
            AbstractC31178DnM.A16(A0f, userSession);
            JQ0.A12(enumC46297KeT, enumC46278KeA, A0f, "unblur_click");
            A0f.A9K("thread_size", Long.valueOf(directThreadAnalyticsParams.A01));
            A0f.A8R(directThreadAnalyticsParams.A02, "direct_source");
            AbstractC43593JPy.A1H(A0f, Long.valueOf(directThreadAnalyticsParams.A00));
        }
    }

    public static final void A05(EnumC46278KeA enumC46278KeA, UserSession userSession, DirectThreadAnalyticsParams directThreadAnalyticsParams) {
        Long l;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0N(userSession), "mwb_odnc_interaction_event");
        if (A0f.isSampled()) {
            AbstractC31178DnM.A16(A0f, userSession);
            A0f.AAP("event_name", MSV.A00(990));
            A0f.A8R(EnumC46297KeT.IN_THREAD, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.A8R(enumC46278KeA, "user_role");
            EnumC1579076z enumC1579076z = null;
            if (directThreadAnalyticsParams != null) {
                l = Long.valueOf(directThreadAnalyticsParams.A01);
            } else {
                l = null;
            }
            A0f.A9K("thread_size", l);
            if (directThreadAnalyticsParams != null) {
                enumC1579076z = directThreadAnalyticsParams.A02;
            }
            AbstractC43593JPy.A1H(A0f, AbstractC43594JPz.A0p(enumC1579076z, A0f, directThreadAnalyticsParams));
        }
    }

    public static final void A06(EnumC46278KeA enumC46278KeA, UserSession userSession, DirectThreadAnalyticsParams directThreadAnalyticsParams) {
        Long l;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0N(userSession), "mwb_odnc_interaction_event");
        if (A0f.isSampled()) {
            AbstractC31178DnM.A16(A0f, userSession);
            A0f.AAP("event_name", "banner_impression");
            A0f.A8R(EnumC46297KeT.IN_THREAD, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.A8R(enumC46278KeA, "user_role");
            EnumC1579076z enumC1579076z = null;
            if (directThreadAnalyticsParams != null) {
                l = Long.valueOf(directThreadAnalyticsParams.A01);
            } else {
                l = null;
            }
            A0f.A9K("thread_size", l);
            if (directThreadAnalyticsParams != null) {
                enumC1579076z = directThreadAnalyticsParams.A02;
            }
            AbstractC43593JPy.A1H(A0f, AbstractC43594JPz.A0p(enumC1579076z, A0f, directThreadAnalyticsParams));
        }
    }
}
