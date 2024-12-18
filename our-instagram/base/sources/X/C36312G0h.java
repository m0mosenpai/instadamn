package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectIfyXma;
import com.instagram.user.model.User;

/* renamed from: X.G0h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36312G0h implements InterfaceC43071ya {
    public final float A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final java.util.Set A03 = AbstractC31171DnF.A0l();

    public C36312G0h(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = C18U.A06(C06090Tz.A05, userSession, 36326820504680596L) ? 0.45f : 0.75f;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        String str;
        String str2;
        Long l;
        DirectIfyXma directIfyXma;
        User A14;
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        AbstractC35044FcH abstractC35044FcH = (AbstractC35044FcH) c59062n7.A03;
        if (interfaceC57162jr.CGk(c59062n7) >= this.A00) {
            java.util.Set set = this.A03;
            String str3 = abstractC35044FcH.A08;
            C14360o3.A07(str3);
            if (set.add(str3)) {
                UserSession userSession = this.A02;
                InterfaceC11380iw interfaceC11380iw = this.A01;
                C2EY c2ey = abstractC35044FcH.A05;
                Object obj = abstractC35044FcH.A06;
                String A01 = AbstractC35044FcH.A01(c2ey, obj);
                if ((obj instanceof C38321qM) && (A14 = AbstractC25226BEj.A14((C38321qM) obj)) != null) {
                    str = A14.getId();
                } else {
                    str = null;
                }
                if (c2ey == C2EY.A1U) {
                    str2 = AbstractC111324zv.A00(3972);
                } else {
                    str2 = "direct_share_sheet";
                }
                if (c2ey == C2EY.A12 && (obj instanceof C32756EbM) && (directIfyXma = ((C32756EbM) obj).A00) != null) {
                    l = directIfyXma.A02;
                } else {
                    l = null;
                }
                AbstractC73317Y7a.A0A(interfaceC11380iw, userSession, l, A01, str, str2, str3);
            }
        }
    }
}
