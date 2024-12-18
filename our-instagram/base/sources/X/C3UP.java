package X;

/* renamed from: X.3UP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3UP implements InterfaceC12870lZ {
    public final Runnable A00 = new Runnable() { // from class: X.3UQ
        @Override // java.lang.Runnable
        public final void run() {
            C3UO c3uo = C3UP.this.A01;
            if (C3UT.A00(c3uo.A05)) {
                c3uo.CNt(c3uo.A00, c3uo.A02, c3uo.A03);
            }
        }
    };
    public final /* synthetic */ C3UO A01;

    public C3UP(C3UO c3uo) {
        this.A01 = c3uo;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        C0f9.A0A(-643571422, C0f9.A03(1892489));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1990762);
        if (((Boolean) AbstractC15930qn.A02.A04.invoke()).booleanValue()) {
            InterfaceC14020nS A00 = C14120nc.A00();
            Runnable runnable = this.A00;
            C14360o3.A0B(runnable, 1);
            A00.ATO(new C18320vJ(373005541, runnable));
        } else {
            this.A00.run();
        }
        C0f9.A0A(2059867593, A03);
    }
}
