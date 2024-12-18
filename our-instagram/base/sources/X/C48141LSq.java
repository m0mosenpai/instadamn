package X;

/* renamed from: X.LSq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48141LSq implements InterfaceC48212Jk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C91P A02;
    public final /* synthetic */ L6Q A03;
    public final /* synthetic */ boolean A04;

    public C48141LSq(C91P c91p, L6Q l6q, int i, int i2, boolean z) {
        this.A03 = l6q;
        this.A02 = c91p;
        this.A04 = z;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        LFg lFg = new LFg(this.A02);
        boolean z = this.A04;
        LFg.A00(lFg).A0L(new C48345LaL(new C50265MHu(this.A01, this.A00, z)));
    }
}
