package X;

import com.instagram.user.model.User;

/* renamed from: X.IKz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41186IKz {
    public final /* synthetic */ C38925HBx A00;

    public C41186IKz(C38925HBx c38925HBx) {
        this.A00 = c38925HBx;
    }

    public final void A00(User user, Integer num) {
        Long l;
        C38925HBx c38925HBx = this.A00;
        InterfaceC09390do interfaceC09390do = c38925HBx.A0A;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) c38925HBx.A07.getValue();
        String str = c38925HBx.A04;
        String id = user.getId();
        AbstractC167007dF.A1K(A0o, interfaceC11380iw);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, A0o), AbstractC43591JPw.A00(1093));
        if (A0f.isSampled()) {
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            AbstractC25225BEi.A1M(EnumC39652Hih.A0H, A0f);
            A0f.AAP("tab_type", "accounts");
            AbstractC25233BEq.A17(A0f, "section_type", str);
            A0f.A9K("userId", AbstractC166997dE.A0j(id));
            if (num != null) {
                l = AbstractC31171DnF.A0V(num.intValue() + 1);
            } else {
                l = null;
            }
            A0f.A9K("index", l);
            A0f.Cht();
        }
        C31368DqX A01 = AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), user.getId(), "creator_inspiration_hub_account_tab", AbstractC111324zv.A00(860));
        C140966Yy A0j = AbstractC25233BEq.A0j(c38925HBx, interfaceC09390do);
        A0j.A08();
        C31368DqX.A02(A0j, AbstractC166987dD.A0r(interfaceC09390do), AbstractC31364DqT.A02(), A01);
    }
}
