package X;

/* loaded from: classes7.dex */
public final class HGY extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C6WQ A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ C19L A06;

    public HGY(C6WQ c6wq, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, C19L c19l, int i, int i2, int i3) {
        this.A06 = c19l;
        this.A03 = c6wq;
        this.A05 = interfaceC16820sZ;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = interfaceC16820sZ2;
        this.A00 = i3;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(35661715);
        this.A04.invoke();
        AbstractC37765Gjg.A00.A01(this.A00, null);
        C0f9.A0A(-1867961706, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(411111480);
        AbstractC166987dD.A1Z(new GSQ(this.A03, null, 47), this.A06);
        C0f9.A0A(-1305574455, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(205152594);
        AbstractC166987dD.A1Z(new GSQ(this.A03, null, 48), this.A06);
        C0f9.A0A(752393090, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1817155534);
        int A032 = C0f9.A03(-1632270479);
        this.A05.invoke();
        AbstractC37765Gjg.A00.A01(this.A02, Integer.valueOf(this.A01));
        C0f9.A0A(276828597, A032);
        C0f9.A0A(1764299359, A03);
    }
}
