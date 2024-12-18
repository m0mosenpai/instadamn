package X;

/* renamed from: X.Fsa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35860Fsa implements X9I {
    public final /* synthetic */ C6FQ A00;
    public final /* synthetic */ InterfaceC103384lE A01;

    public C35860Fsa(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        this.A01 = interfaceC103384lE;
        this.A00 = c6fq;
    }

    @Override // X.X9I
    public final void Dx3(int i, int i2, String str, double d) {
        C6FX A0s = AbstractC25225BEi.A0s();
        A0s.A01(Integer.valueOf(i));
        A0s.A02(Integer.valueOf((int) d));
        C11T.A02(new GP8(this.A00, A0s.A00(), this.A01));
    }
}
