package X;

/* loaded from: classes5.dex */
public final class DSM extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ InterfaceC16620sF A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSM(InterfaceC16620sF interfaceC16620sF, float f, int i, boolean z) {
        super(2);
        this.A03 = z;
        this.A00 = f;
        this.A02 = interfaceC16620sF;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        boolean z = this.A03;
        AbstractC28306Cds.A02(A0S, this.A02, this.A00, AbstractC25225BEi.A04(this.A01), z);
        return C0eB.A00;
    }
}
