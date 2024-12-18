package X;

/* loaded from: classes5.dex */
public final class DT8 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DT8(String str, String str2, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z) {
        super(2);
        this.A02 = str;
        this.A01 = i;
        this.A03 = str2;
        this.A04 = interfaceC16660sJ;
        this.A05 = z;
        this.A00 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A02;
        int i = this.A01;
        AbstractC27524CCu.A00(A0S, str, this.A03, this.A04, i, AbstractC25225BEi.A04(this.A00), this.A05);
        return C0eB.A00;
    }
}
