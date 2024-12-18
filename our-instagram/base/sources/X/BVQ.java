package X;

/* loaded from: classes5.dex */
public final class BVQ extends C0YY implements InterfaceC16820sZ {
    public final long A00;
    public final long A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BVQ(long j, long j2, boolean z) {
        super(0);
        this.A02 = z;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        long j;
        if (this.A02) {
            j = this.A01;
        } else {
            j = this.A00;
        }
        return AbstractC25225BEi.A0p(j);
    }
}
