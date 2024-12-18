package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.An3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24118An3 implements InterfaceC1119153d {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C71603Jf A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public C24118An3(UserSession userSession, C71603Jf c71603Jf, String str) {
        this.A00 = userSession;
        this.A01 = c71603Jf;
        this.A02 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC1119153d
    public final void Czx() {
        UserSession userSession = this.A00;
        AbstractC25651Mw.A00(userSession).E4s(new Object());
        C65761Ttc.A02(FDN.A00(AbstractC206099Aq.A00, userSession), this.A01.A03(0L), "ig_quiet_mode_pause_bottom_sheet_dismiss", this.A02);
    }
}
