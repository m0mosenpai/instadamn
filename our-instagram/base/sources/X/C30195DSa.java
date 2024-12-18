package X;

/* renamed from: X.DSa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30195DSa extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30195DSa(String str, String str2, int i, int i2) {
        super(2);
        this.A00 = i2;
        switch (i2) {
            case 0:
            case 2:
                this.A03 = str;
                this.A02 = str2;
                break;
            case 1:
            default:
                this.A02 = str;
                this.A03 = str2;
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
                AbstractC28309Cdv.A02(this.A03, this.A02, A0S, AbstractC25225BEi.A04(this.A01));
                break;
            case 1:
                AbstractC28048CYc.A01(this.A02, this.A03, A0S, AbstractC25225BEi.A04(this.A01));
                break;
            case 2:
                CJN.A00(this.A03, this.A02, A0S, AbstractC25225BEi.A04(this.A01));
                break;
            default:
                AbstractC28509Ci3.A0J(this.A02, this.A03, A0S, AbstractC25225BEi.A04(this.A01));
                break;
        }
        return C0eB.A00;
    }
}
