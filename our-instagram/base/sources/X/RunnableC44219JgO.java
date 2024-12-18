package X;

/* renamed from: X.JgO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44219JgO implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ InterfaceC74623Ww A03;
    public final /* synthetic */ C75363a3 A04;
    public final /* synthetic */ C5TA A05;
    public final /* synthetic */ C4S7 A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public RunnableC44219JgO(InterfaceC74623Ww interfaceC74623Ww, C75363a3 c75363a3, C5TA c5ta, C4S7 c4s7, String str, String str2, float f, int i, int i2, boolean z, boolean z2) {
        this.A05 = c5ta;
        this.A0A = z;
        this.A04 = c75363a3;
        this.A03 = interfaceC74623Ww;
        this.A06 = c4s7;
        this.A00 = f;
        this.A09 = z2;
        this.A08 = str;
        this.A07 = str2;
        this.A02 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5TA c5ta = this.A05;
        C4QW c4qw = c5ta.A06;
        c4qw.EYb(this.A0A);
        C75363a3 c75363a3 = this.A04;
        InterfaceC74623Ww interfaceC74623Ww = this.A03;
        C4S7 c4s7 = this.A06;
        float f = this.A00;
        boolean z = this.A09;
        c4qw.E5v(new C4SC(interfaceC74623Ww, new C4QP(false, false, false, false), c75363a3, c4s7, this.A07, this.A08, f, this.A02, this.A01, z));
        c5ta.A07.A01 = AbstractC25225BEi.A16(c4s7);
    }
}
