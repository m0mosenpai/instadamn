package X;

/* loaded from: classes5.dex */
public final class DTF extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C51610Mr3 A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTF(C51610Mr3 c51610Mr3, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, boolean z) {
        super(2);
        this.A02 = i;
        this.A05 = z;
        this.A04 = interfaceC16820sZ;
        this.A03 = c51610Mr3;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        int i = this.A02;
        boolean z = this.A05;
        AbstractC27634CHf.A00(A0S, this.A03, this.A04, i, AbstractC25225BEi.A04(this.A00), this.A01, z);
        return C0eB.A00;
    }
}
