package X;

/* loaded from: classes5.dex */
public final class DV9 extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DV9(C118125Vw c118125Vw, String str, int i, int i2, int i3, long j, long j2, boolean z) {
        super(2);
        this.A06 = str;
        this.A07 = z;
        this.A03 = j;
        this.A02 = i;
        this.A05 = c118125Vw;
        this.A04 = j2;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A06;
        boolean z = this.A07;
        long j = this.A03;
        int i = this.A02;
        AbstractC27527CCx.A00(A0S, (C118125Vw) this.A05, str, i, AbstractC25225BEi.A04(this.A00), this.A01, j, this.A04, z);
        return C0eB.A00;
    }
}
