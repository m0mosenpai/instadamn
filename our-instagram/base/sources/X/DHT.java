package X;

/* loaded from: classes5.dex */
public final class DHT extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHT(String str, String str2, boolean z, boolean z2) {
        super(1);
        this.A01 = str;
        this.A00 = str2;
        this.A03 = z;
        this.A02 = z2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C166137bh c166137bh = (C166137bh) obj;
        C14360o3.A0B(c166137bh, 0);
        return AbstractC166327c1.A06(c166137bh, this.A01, this.A00, new DHA(this.A03, this.A02));
    }
}
