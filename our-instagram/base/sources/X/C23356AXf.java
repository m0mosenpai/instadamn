package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AXf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23356AXf implements InterfaceC48212Jk {
    public final /* synthetic */ C195448kk A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    public C23356AXf(C195448kk c195448kk, String str, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = c195448kk;
        this.A01 = str;
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        C195448kk c195448kk = this.A00;
        UserSession userSession = c195448kk.A01;
        String str = this.A01;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        AbstractC208329Jr.A09(c195448kk, userSession, "error_logging", str, AbstractC06930Yk.A06(AbstractC167007dF.A1b("is_network", "network", AbstractC166987dD.A1L("error_message", message), AbstractC166987dD.A1L("error_type", "album_fetch"))));
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(th);
        }
    }
}
