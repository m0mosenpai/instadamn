package X;

/* renamed from: X.6GY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6GY {
    public long A00;
    public final C5Y1 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6GY) {
                C6GY c6gy = (C6GY) obj;
                if (!C14360o3.A0K(this.A01, c6gy.A01) || this.A00 != c6gy.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        long j = this.A00;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnimData(anim=");
        sb.append(this.A01);
        sb.append(", startSize=");
        long j = this.A00;
        sb.append((Object) AnonymousClass001.A0P(" x ", (int) (j >> 32), C119055aN.A00(j)));
        sb.append(')');
        return sb.toString();
    }

    public C6GY(C5Y1 c5y1, long j) {
        this.A01 = c5y1;
        this.A00 = j;
    }
}
