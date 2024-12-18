package X;

/* renamed from: X.4It, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4It {
    public final double A00;
    public final int A01;
    public final long A02;
    public final C4Ir A03;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(this.A00);
        sb.append(", bwe delta=");
        sb.append(Math.round(this.A02 - this.A03.A00));
        sb.append(" (C");
        sb.append(this.A01);
        sb.append(")}");
        return sb.toString();
    }

    public C4It(C4Ir c4Ir, double d, int i, long j) {
        this.A02 = j;
        this.A01 = i;
        this.A00 = d;
        this.A03 = c4Ir;
    }
}
