package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.WoP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71128WoP implements InterfaceC72018XFg {
    public UserSession A00;

    @Override // X.InterfaceC72018XFg
    public final /* bridge */ /* synthetic */ Object DV9(C69427VnC c69427VnC, Object obj, int i) {
        Integer num;
        C68251VJn c68251VJn = (C68251VJn) obj;
        c68251VJn.getClass();
        if (i == 1) {
            C67887V0u c67887V0u = c68251VJn.A03;
            if (c67887V0u.A00 == c67887V0u.A01 - 1) {
                num = C05F.A0j;
            } else {
                num = C05F.A01;
            }
            AbstractC69975Vyq.A00(this.A00, c69427VnC.A07, num);
            C67887V0u c67887V0u2 = c68251VJn.A03;
            C67887V0u.A00(c67887V0u2, c67887V0u2.A00 + 1);
            return c68251VJn;
        }
        C67887V0u.A00(c68251VJn.A03, r1.A00 - 1);
        c68251VJn.A03.getChildFragmentManager().A0b();
        return c68251VJn;
    }
}
