package X;

/* loaded from: classes5.dex */
public final class DSR extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSR(InterfaceC16820sZ interfaceC16820sZ, int i, long j, boolean z) {
        super(2);
        this.A01 = j;
        this.A02 = interfaceC16820sZ;
        this.A03 = z;
        this.A00 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        long j = this.A01;
        AbstractC28335CeN.A02(A0S, this.A02, AbstractC25225BEi.A04(this.A00), j, this.A03);
        return C0eB.A00;
    }
}
