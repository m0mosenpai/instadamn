package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class M7C implements Runnable {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ K2D A02;
    public final /* synthetic */ C46094Kas A03;
    public final /* synthetic */ C7DO A04;
    public final /* synthetic */ C75363a3 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public M7C(InterfaceC11380iw interfaceC11380iw, UserSession userSession, K2D k2d, C46094Kas c46094Kas, C7DO c7do, C75363a3 c75363a3, String str, boolean z) {
        this.A03 = c46094Kas;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A04 = c7do;
        this.A06 = str;
        this.A05 = c75363a3;
        this.A02 = k2d;
        this.A07 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C46094Kas c46094Kas = this.A03;
        UserSession userSession = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C5TA A00 = C46094Kas.A00(interfaceC11380iw, userSession, c46094Kas, this.A04);
        String str = this.A06;
        C75363a3 c75363a3 = this.A05;
        InterfaceC74623Ww interfaceC74623Ww = (InterfaceC74623Ww) c46094Kas.A0F.getView();
        C4S7 c4s7 = new C4S7(this.A02, 0);
        c4s7.A00 = true;
        A00.A08(interfaceC74623Ww, c75363a3, c4s7, str, interfaceC11380iw.getModuleName(), 1.0f, -1, 0, true, this.A07);
    }
}
