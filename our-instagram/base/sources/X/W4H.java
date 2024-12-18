package X;

/* loaded from: classes11.dex */
public final class W4H {
    public static final W4H A02 = new W4H(C05F.A00, 0.0f);
    public static final W4H A03 = new W4H(C05F.A01, 0.0f);
    public final float A00;
    public final Integer A01;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append(' ');
        switch (this.A01.intValue()) {
            case 0:
                str = "UNSET";
                break;
            case 1:
                str = "PIXEL";
                break;
            default:
                str = "DP";
                break;
        }
        return AbstractC166997dE.A0x(str, sb);
    }

    public W4H(Integer num, float f) {
        this.A01 = num;
        this.A00 = f;
    }
}
