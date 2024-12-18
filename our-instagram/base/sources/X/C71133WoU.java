package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.WoU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71133WoU implements InterfaceC72018XFg {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C68251VJn A01;
    public final /* synthetic */ C1V4 A02;

    public C71133WoU(UserSession userSession, C68251VJn c68251VJn, C1V4 c1v4) {
        this.A02 = c1v4;
        this.A00 = userSession;
        this.A01 = c68251VJn;
    }

    @Override // X.InterfaceC72018XFg
    public final /* bridge */ /* synthetic */ Object DV9(C69427VnC c69427VnC, Object obj, int i) {
        UserSession userSession = this.A00;
        C18A A00 = AnonymousClass189.A00(userSession);
        C68251VJn c68251VJn = this.A01;
        A00.A03(c68251VJn.A04);
        C35264Fgy.A04(c68251VJn.A01.A0O);
        c68251VJn.A04.A0c(userSession);
        MUK.A02(userSession).A00 = true;
        this.A02.A06("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93", c68251VJn);
        return null;
    }
}
