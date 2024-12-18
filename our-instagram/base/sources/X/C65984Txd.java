package X;

/* renamed from: X.Txd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65984Txd {
    public static final C65984Txd A02 = new C65984Txd(C05F.A0C, 1.0E21f);
    public final float A00;
    public final Integer A01;

    public final String toString() {
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                return "auto";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.A00);
            return AbstractC166997dE.A0x("%", sb);
        }
        return Float.toString(this.A00);
    }

    public C65984Txd(Integer num, float f) {
        this.A00 = f;
        this.A01 = num;
    }
}
