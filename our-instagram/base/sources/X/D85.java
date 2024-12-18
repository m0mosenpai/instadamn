package X;

/* loaded from: classes5.dex */
public final class D85 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final long A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D85(long j, int i) {
        super(0);
        this.A00 = i;
        this.A01 = j;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            return AbstractC25225BEi.A0p(this.A01);
        }
        return Long.valueOf(Math.max(0L, this.A01 - AbstractC166987dD.A0L(System.currentTimeMillis())));
    }
}
