package X;

/* renamed from: X.Lrk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49352Lrk implements InterfaceC50483MQl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC37261GbE A01;
    public final /* synthetic */ C47971LIf A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16820sZ A05;

    public C49352Lrk(InterfaceC37261GbE interfaceC37261GbE, C47971LIf c47971LIf, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, int i) {
        this.A02 = c47971LIf;
        this.A04 = str;
        this.A00 = i;
        this.A05 = interfaceC16820sZ;
        this.A01 = interfaceC37261GbE;
        this.A03 = str2;
    }

    @Override // X.InterfaceC50483MQl
    public final void DFf() {
        C47971LIf c47971LIf = this.A02;
        C47971LIf.A00(this.A01, c47971LIf, this.A03, this.A05, this.A00);
    }

    @Override // X.InterfaceC50483MQl
    public final void DLt() {
        C47971LIf c47971LIf = this.A02;
        C47971LIf.A00(this.A01, c47971LIf, this.A03, this.A05, this.A00);
    }

    @Override // X.InterfaceC50483MQl
    public final void DqJ(boolean z) {
        C47971LIf c47971LIf = this.A02;
        c47971LIf.A05.put(this.A04, Integer.valueOf(z ? 1 : 0));
        if (z) {
            c47971LIf.A01 = true;
        }
        C47971LIf.A00(this.A01, c47971LIf, this.A03, this.A05, this.A00);
    }
}
