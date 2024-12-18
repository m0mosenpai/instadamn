package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FWj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34828FWj {
    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        AbstractC167007dF.A1E(str2, 1, interfaceC11380iw);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "nme_label_rendering_ig");
        if (A0f.isSampled()) {
            A0f.AAP("event_type", "impression_start");
            AbstractC31171DnF.A1E(A0f, str);
            A0f.A7v("is_label_visible", true);
            A0f.A9K("entity_owner_id", Long.valueOf(AbstractC167027dH.A03(str2)));
            A0f.Cht();
        }
    }

    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        AbstractC167027dH.A13(str2, userSession, interfaceC11380iw);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_nme_benefits");
        if (A0f.isSampled()) {
            A0f.AAP("event_type", "click");
            A0f.AAP("benefit_type", "LABEL");
            A0f.AAP("subject_type", "viewer");
            A0f.AAP("object_type", "profile");
            A0f.A9K("pbs_owner_id", Long.valueOf(AbstractC167027dH.A03(str2)));
            AbstractC31171DnF.A1E(A0f, str);
            AbstractC31174DnI.A1F(A0f, AbstractC25233BEq.A0p("viewer_id", userSession.userId, AbstractC166987dD.A1L("profile_id", str2)));
        }
    }
}
