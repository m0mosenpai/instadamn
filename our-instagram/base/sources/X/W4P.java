package X;

/* loaded from: classes11.dex */
public final class W4P {
    public static final W4P A04;
    public static final W4P A05;
    public final W4H A00;
    public final W4H A01;
    public final W4H A02;
    public final W4H A03;

    static {
        W4H w4h = W4H.A03;
        A05 = new W4P(w4h, w4h, w4h, w4h);
        W4H w4h2 = W4H.A02;
        A04 = new W4P(w4h, w4h2, w4h, w4h2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{left=");
        sb.append(this.A01);
        sb.append(", top=");
        sb.append(this.A03);
        sb.append(", right=");
        sb.append(this.A02);
        sb.append(", bottom=");
        return AbstractC58320PtC.A11(this.A00, sb);
    }

    public W4P(W4H w4h, W4H w4h2, W4H w4h3, W4H w4h4) {
        this.A01 = w4h;
        this.A03 = w4h2;
        this.A02 = w4h3;
        this.A00 = w4h4;
    }
}
