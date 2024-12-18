package X;

/* renamed from: X.5i7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123325i7 extends C0T6 {
    public final float A00;
    public final long A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C123325i7) {
                C123325i7 c123325i7 = (C123325i7) obj;
                if (!C14360o3.A0K(this.A02, c123325i7.A02) || this.A01 != c123325i7.A01 || Float.compare(this.A00, c123325i7.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScrollMetrics(scrollContext=");
        sb.append(this.A02);
        sb.append(", scrollDurationMs=");
        sb.append(this.A01);
        sb.append(", scrollDistanceDp=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.A02.hashCode() * 31;
        long j = this.A01;
        return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.A00);
    }

    public C123325i7(String str, float f, long j) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = f;
    }
}
