package X;

/* loaded from: classes5.dex */
public final class DWC extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ C7Y A05;
    public final /* synthetic */ C7I A06;
    public final /* synthetic */ C5Hc A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWC(C7Y c7y, C7I c7i, C5Hc c5Hc, float f, int i, int i2, int i3, long j, boolean z, boolean z2) {
        super(2);
        this.A07 = c5Hc;
        this.A00 = f;
        this.A06 = c7i;
        this.A05 = c7y;
        this.A08 = z;
        this.A09 = z2;
        this.A03 = i;
        this.A04 = j;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        C5Hc c5Hc = this.A07;
        float f = this.A00;
        C7I c7i = this.A06;
        C7Y c7y = this.A05;
        boolean z = this.A08;
        boolean z2 = this.A09;
        CGI.A00(A0S, c7y, c7i, c5Hc, f, this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A04, z, z2);
        return C0eB.A00;
    }
}
