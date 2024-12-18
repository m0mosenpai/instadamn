package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fgi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35249Fgi {
    public static final void A02(EnumC33510Erj enumC33510Erj, EnumC33500ErZ enumC33500ErZ, UserSession userSession, String str, boolean z) {
        C14360o3.A0B(enumC33510Erj, 1);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "invite_succeeded");
        if (A0f.isSampled()) {
            AbstractC31176DnK.A1H(enumC33510Erj, A0f, AbstractC31178DnM.A0b());
            A0f.A8R(enumC33500ErZ, "invite_option");
            A0f.AAP("url", str);
            A00(A0f, z);
        }
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, boolean z) {
        interfaceC02590Ai.A7v(AbstractC111324zv.A00(1036), Boolean.valueOf(z));
        interfaceC02590Ai.Cht();
    }

    public static final void A01(EnumC33510Erj enumC33510Erj, EnumC33500ErZ enumC33500ErZ, UserSession userSession) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0N(userSession), "invitation_failed");
        if (A0f.isSampled()) {
            AbstractC31176DnK.A1H(enumC33510Erj, A0f, AbstractC31178DnM.A0b());
            A0f.A8R(enumC33500ErZ, "invite_option");
            A0f.Cht();
        }
    }

    public static final void A03(EnumC33510Erj enumC33510Erj, EnumC33500ErZ enumC33500ErZ, UserSession userSession, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0N(userSession), "invite_option_tapped");
        if (A0f.isSampled()) {
            AbstractC31176DnK.A1H(enumC33510Erj, A0f, AbstractC31178DnM.A0b());
            A0f.A8R(enumC33500ErZ, "invite_option");
            A00(A0f, z);
        }
    }

    public static final void A04(EnumC33510Erj enumC33510Erj, UserSession userSession, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "invite_upsell_dismissed");
        if (A0f.isSampled()) {
            AbstractC31176DnK.A1H(enumC33510Erj, A0f, AbstractC31178DnM.A0b());
            A00(A0f, z);
        }
    }

    public static final void A05(EnumC33510Erj enumC33510Erj, UserSession userSession, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0N(userSession), "invite_upsell_impression");
        if (A0f.isSampled()) {
            AbstractC31176DnK.A1H(enumC33510Erj, A0f, AbstractC31178DnM.A0b());
            A00(A0f, z);
        }
    }

    public static final void A06(EnumC33510Erj enumC33510Erj, UserSession userSession, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0N(userSession), "invite_upsell_tapped");
        if (A0f.isSampled()) {
            AbstractC31176DnK.A1H(enumC33510Erj, A0f, AbstractC31178DnM.A0b());
            A00(A0f, z);
        }
    }
}
