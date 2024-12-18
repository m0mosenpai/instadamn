package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AXh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23358AXh implements InterfaceC48212Jk {
    public final /* synthetic */ C195448kk A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    public C23358AXh(C195448kk c195448kk, String str, String str2, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = c195448kk;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        C195448kk c195448kk = this.A00;
        UserSession userSession = c195448kk.A01;
        String str = this.A02;
        String str2 = this.A01;
        String message = th.getMessage();
        C09530e4 A1L = AbstractC166987dD.A1L("album_type", str2);
        if (message == null) {
            message = "";
        }
        AbstractC208329Jr.A09(c195448kk, userSession, "error_logging", str, AbstractC167017dG.A0u("is_network", "network", A1L, AbstractC166987dD.A1L("error_message", message), AbstractC166987dD.A1L("error_type", "pagination_request")));
        InterfaceC16660sJ interfaceC16660sJ = this.A03;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(th);
        }
    }
}
