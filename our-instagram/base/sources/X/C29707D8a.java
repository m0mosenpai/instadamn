package X;

/* renamed from: X.D8a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29707D8a extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29707D8a(BJF bjf, InterfaceC16620sF interfaceC16620sF, int i, int i2, boolean z) {
        super(0);
        this.A00 = i2;
        this.A04 = z;
        this.A02 = interfaceC16620sF;
        this.A01 = i;
        this.A03 = bjf;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 == 0 ? !this.A04 : this.A04) {
            ((InterfaceC16620sF) this.A02).invoke(Integer.valueOf(this.A01), this.A03);
        }
        return C0eB.A00;
    }
}
