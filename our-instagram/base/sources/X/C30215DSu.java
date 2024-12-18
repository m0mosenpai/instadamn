package X;

/* renamed from: X.DSu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30215DSu extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30215DSu(Object obj, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A03 = obj;
        this.A04 = z;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                AbstractC27462CAg.A00(A0S, (InterfaceC16820sZ) this.A03, this.A01 | 1, this.A02, this.A04);
                break;
            case 1:
                AbstractC25645BVh.A00(A0S, (InterfaceC16620sF) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A04);
                break;
            case 2:
                AbstractC28346Cf4.A01(A0S, (InterfaceC16660sJ) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A04);
                break;
            case 3:
                CIG.A00(A0S, (InterfaceC16660sJ) this.A03, this.A02, AbstractC25225BEi.A04(this.A01), this.A04);
                break;
            case 4:
                AbstractC28058CYm.A00(A0S, (InterfaceC16820sZ) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A04);
                break;
            case 5:
                AbstractC28058CYm.A01(A0S, (InterfaceC16820sZ) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A04);
                break;
            default:
                AbstractC28064CYs.A01(A0S, (InterfaceC16820sZ) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A04);
                break;
        }
        return C0eB.A00;
    }
}
