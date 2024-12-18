package X;

/* renamed from: X.9Dj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206789Dj extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206789Dj(int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A01 = i;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        boolean z;
        int i2;
        switch (this.A00) {
            case 0:
                Boolean A00 = AbstractC28485Chd.A00((C58Z) obj, this.A01);
                if (A00 != null) {
                    z = A00.booleanValue();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (((C115475Kh) obj) != null) {
                    i = (int) Math.ceil(r5.A0B() / this.A01);
                } else {
                    i = 0;
                }
                return Integer.valueOf(i);
            case 2:
                break;
            case 3:
            case 5:
                ((Number) obj).intValue();
                break;
            case 4:
            default:
                int intValue = ((Number) obj).intValue();
                i2 = 100;
                if (intValue >= 0 && intValue < this.A01) {
                    i2 = 1;
                }
                return Integer.valueOf(i2);
        }
        i2 = this.A01;
        return Integer.valueOf(i2);
    }
}
