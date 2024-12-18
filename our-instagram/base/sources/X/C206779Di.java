package X;

/* renamed from: X.9Di, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206779Di extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206779Di(int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int min;
        Number number = (Number) obj;
        if (this.A00 != 0) {
            int intValue = number.intValue();
            C115475Kh c115475Kh = (C115475Kh) obj2;
            C14360o3.A0B(c115475Kh, 1);
            C115525Km c115525Km = c115475Kh.A0G;
            min = Math.min(c115525Km.A03 + ((intValue * AbstractC54865OOa.A00(c115475Kh)) / this.A01), c115525Km.A02);
        } else {
            int intValue2 = number.intValue();
            C115475Kh c115475Kh2 = (C115475Kh) obj2;
            C14360o3.A0B(c115475Kh2, 1);
            min = (int) (Math.min((intValue2 + 1) * this.A01, c115475Kh2.A0B()) * c115475Kh2.A00);
        }
        return Integer.valueOf(min);
    }
}
