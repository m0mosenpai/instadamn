package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.WxX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71625WxX implements Runnable {
    public final /* synthetic */ C0SG A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ InterfaceC72023XFl A02;
    public final /* synthetic */ C1338462s A03;
    public final /* synthetic */ InterfaceC191788ea A04;
    public final /* synthetic */ U5A A05;
    public final /* synthetic */ String A06;

    public RunnableC71625WxX(C0SG c0sg, FragmentActivity fragmentActivity, InterfaceC72023XFl interfaceC72023XFl, C1338462s c1338462s, InterfaceC191788ea interfaceC191788ea, U5A u5a, String str) {
        this.A00 = c0sg;
        this.A01 = fragmentActivity;
        this.A06 = str;
        this.A02 = interfaceC72023XFl;
        this.A04 = interfaceC191788ea;
        this.A03 = c1338462s;
        this.A05 = u5a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC72040XGi interfaceC72040XGi = (InterfaceC72040XGi) this.A00;
        XBU Bdi = interfaceC72040XGi.Bdi(EnumC68125VCj.A02);
        C14360o3.A0C(Bdi, "null cannot be cast to non-null type com.bloks.foa.cds.bottomsheet.intf.CdsBloksBottomSheetBehavior");
        FragmentActivity fragmentActivity = this.A01;
        String str = this.A06;
        interfaceC72040XGi.E2M(WGI.A01(fragmentActivity, this.A02, (C66209U4f) Bdi, this.A03, this.A04, str), this.A05);
    }
}
