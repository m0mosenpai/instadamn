package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OdB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55148OdB {
    public static void A00(InterfaceC02590Ai interfaceC02590Ai, InterfaceC11380iw interfaceC11380iw, Long l) {
        interfaceC02590Ai.A9K(AbstractC43591JPw.A00(1335), l);
        interfaceC02590Ai.AAP("media_id", null);
        interfaceC02590Ai.AAP("source_of_action", interfaceC11380iw.getModuleName());
        interfaceC02590Ai.Cht();
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(interfaceC11380iw, userSession, 0), "instagram_bc_add_new_partner");
        A0f.A7v("is_editing", false);
        A0f.AAP("sponsor_igid", str);
        AbstractC50523MSb.A10(A0f, null, "feed");
        AbstractC37300Gc1.A0n(A0f, interfaceC11380iw.getModuleName());
        A0f.Cht();
        InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_organic_tag_business_partner");
        A0f2.AAP("source_of_action", interfaceC11380iw.getModuleName());
        A0f2.A9K(AbstractC111324zv.A00(1976), AbstractC25228BEl.A13(str));
        A0f2.Cht();
    }

    public static final void A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(interfaceC11380iw, userSession, 0), "instagram_bc_add_partner_exit");
        A0f.A7v("is_editing", false);
        A0f.AAP("sponsor_igid", str);
        AbstractC50523MSb.A10(A0f, null, "feed");
        AbstractC37300Gc1.A0n(A0f, interfaceC11380iw.getModuleName());
        A0f.A7v("is_permission_enabled", false);
        A0f.Cht();
    }

    public static final void A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        A00(AbstractC166987dD.A0f(AbstractC31176DnK.A0L(interfaceC11380iw, userSession), "ig_branded_content_permission_required_dialog_cancel_tapped"), interfaceC11380iw, AbstractC25228BEl.A13(str));
    }

    public static final void A04(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        AbstractC167017dG.A1O(userSession, str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_organic_remove_business_partner");
        A0f.AAP("source_of_action", str);
        A0f.Cht();
    }
}
