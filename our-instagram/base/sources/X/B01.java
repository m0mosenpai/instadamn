package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class B01 implements Runnable {
    public final /* synthetic */ C26086BgF A00;
    public final /* synthetic */ Medium A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C36941nr A03;
    public final /* synthetic */ InterfaceC185598Lb A04;
    public final /* synthetic */ ACA A05;
    public final /* synthetic */ C211689Zc A06;
    public final /* synthetic */ A8X A07;
    public final /* synthetic */ C47Z A08;

    public B01(C26086BgF c26086BgF, Medium medium, UserSession userSession, C36941nr c36941nr, InterfaceC185598Lb interfaceC185598Lb, ACA aca, C211689Zc c211689Zc, A8X a8x, C47Z c47z) {
        this.A03 = c36941nr;
        this.A02 = userSession;
        this.A01 = medium;
        this.A08 = c47z;
        this.A05 = aca;
        this.A06 = c211689Zc;
        this.A07 = a8x;
        this.A00 = c26086BgF;
        this.A04 = interfaceC185598Lb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36941nr c36941nr = this.A03;
        UserSession userSession = this.A02;
        Medium medium = this.A01;
        C47Z c47z = this.A08;
        C36941nr.A00(this.A00, medium, userSession, c36941nr, this.A04, this.A05, this.A06, this.A07, c47z, false);
    }
}
