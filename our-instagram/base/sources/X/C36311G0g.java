package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.G0g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36311G0g implements InterfaceC43071ya {
    public final UserSession A00;
    public final InterfaceC60442pS A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        EnumC33488ErN enumC33488ErN;
        AbstractC167007dF.A1K(c59062n7, interfaceC57162jr);
        if (interfaceC57162jr.CFq(c59062n7).intValue() == 0) {
            Object obj = c59062n7.A03;
            C14360o3.A06(obj);
            FJZ fjz = (FJZ) obj;
            UserSession userSession = this.A00;
            InterfaceC60442pS interfaceC60442pS = this.A01;
            String str = fjz.A00;
            String str2 = fjz.A01;
            boolean equals = str.equals(str2);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "ig_creator_connections_events");
            AbstractC31171DnF.A1B(A0f, "impression");
            A0f.A8R(AbstractC100604fP.A00(userSession), "project");
            if (equals) {
                enumC33488ErN = EnumC33488ErN.SELF_PROFILE;
            } else {
                enumC33488ErN = EnumC33488ErN.PROFILE;
            }
            A0f.A8R(enumC33488ErN, "screen");
            A0f.AAP("target", "badge");
            A0f.Cht();
            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_open_to_collab_surface_profile_badge_impression");
            if (A0f2.isSampled()) {
                A0f2.A9K(AbstractC111324zv.A00(343), AbstractC003100w.A0k(10, str));
                A0f2.A9K(AbstractC111324zv.A00(1327), AbstractC003100w.A0k(10, str2));
                A0f2.Cht();
            }
        }
    }

    public C36311G0g(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
    }
}
