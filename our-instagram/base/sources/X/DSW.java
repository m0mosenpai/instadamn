package X;

/* loaded from: classes5.dex */
public final class DSW extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSW(int i, String str, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A02 = i;
        this.A03 = str;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            AbstractC28324CeC.A02(A0S, this.A03, this.A02, AbstractC25225BEi.A04(this.A01));
        } else {
            CGQ.A00(A0S, this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
        }
        return C0eB.A00;
    }
}
