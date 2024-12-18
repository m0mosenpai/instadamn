package X;

/* renamed from: X.Lxr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49722Lxr implements InterfaceC42241xE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C31446Drq A02;
    public final /* synthetic */ InterfaceC50462MPq A03;
    public final /* synthetic */ C3o9 A04;
    public final /* synthetic */ String A05;

    public C49722Lxr(C31446Drq c31446Drq, InterfaceC50462MPq interfaceC50462MPq, C3o9 c3o9, String str, int i, int i2) {
        this.A03 = interfaceC50462MPq;
        this.A04 = c3o9;
        this.A05 = str;
        this.A02 = c31446Drq;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        InterfaceC50462MPq interfaceC50462MPq = this.A03;
        C3o9 c3o9 = this.A04;
        String str = this.A05;
        interfaceC50462MPq.Cs0(this.A02, c3o9, Integer.valueOf(this.A00), str, this.A01);
    }
}
