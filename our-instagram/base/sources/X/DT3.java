package X;

/* loaded from: classes5.dex */
public final class DT3 extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DT3(Object obj, String str, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A03 = str;
        this.A04 = z;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                boolean z = this.A04;
                CFZ.A00(A0S, (EnumC76383bi) this.A02, this.A03, AbstractC25225BEi.A04(this.A01), z);
                break;
            case 1:
                AbstractC28055CYj.A01(A0S, this.A03, (InterfaceC16820sZ) this.A02, AbstractC25225BEi.A04(this.A01), this.A04);
                break;
            case 2:
                AbstractC28509Ci3.A08(A0S, (C28208Cc5) this.A02, this.A03, AbstractC25225BEi.A04(this.A01), this.A04);
                break;
            case 3:
                AbstractC28509Ci3.A09(A0S, (C28208Cc5) this.A02, this.A03, AbstractC25225BEi.A04(this.A01), this.A04);
                break;
            case 4:
                AbstractC28509Ci3.A0A(A0S, (C28208Cc5) this.A02, this.A03, AbstractC25225BEi.A04(this.A01), this.A04);
                break;
            case 5:
                CK2.A00(A0S, this.A03, (InterfaceC16820sZ) this.A02, AbstractC25225BEi.A04(this.A01), this.A04);
                break;
            default:
                AbstractC28478ChW.A04(A0S, this.A03, (InterfaceC16820sZ) this.A02, AbstractC25225BEi.A04(this.A01), this.A04);
                break;
        }
        return C0eB.A00;
    }
}
