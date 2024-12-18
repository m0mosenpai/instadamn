package X;

/* renamed from: X.5gH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122215gH {
    public static final C122215gH A03;
    public final float A00;
    public final long A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C122215gH) {
                long j = this.A01;
                C122215gH c122215gH = (C122215gH) obj;
                long j2 = c122215gH.A01;
                long j3 = C1132359l.A01;
                if (j != j2 || this.A02 != c122215gH.A02 || this.A00 != c122215gH.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = C1132359l.A01;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j3 = this.A02;
        return ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shadow(color=");
        sb.append((Object) C1132359l.A06(this.A01));
        sb.append(", offset=");
        sb.append((Object) C119365at.A08(this.A02));
        sb.append(", blurRadius=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C122215gH(float f, long j, long j2) {
        this.A01 = j;
        this.A02 = j2;
        this.A00 = f;
    }

    static {
        long j = C1132359l.A01;
        A03 = new C122215gH(0.0f, 4278190080L << 32, 0L);
    }
}
