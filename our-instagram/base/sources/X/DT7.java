package X;

/* loaded from: classes5.dex */
public final class DT7 extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DT7(String str, String str2, String str3, int i, int i2) {
        super(2);
        this.A00 = i2;
        switch (i2) {
            case 0:
                this.A03 = str;
                this.A02 = str2;
                this.A04 = str3;
                break;
            case 1:
                this.A04 = str;
                this.A02 = str2;
                this.A03 = str3;
                break;
            default:
                this.A03 = str;
                this.A04 = str2;
                this.A02 = str3;
                break;
        }
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                AbstractC28438Cgm.A02(A0S, this.A03, this.A02, this.A04, AbstractC25225BEi.A04(this.A01));
                break;
            case 1:
                AbstractC28391Cfu.A03(A0S, this.A04, this.A02, this.A03, AbstractC25225BEi.A04(this.A01));
                break;
            default:
                AbstractC28509Ci3.A0F(A0S, this.A03, this.A04, this.A02, AbstractC25225BEi.A04(this.A01));
                break;
        }
        return C0eB.A00;
    }
}
