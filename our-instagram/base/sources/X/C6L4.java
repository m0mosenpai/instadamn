package X;

/* renamed from: X.6L4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6L4 extends C6L5 {
    public final long A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6L4) {
                long j = this.A00;
                long j2 = ((C6L4) obj).A00;
                long j3 = C1132359l.A01;
                if (j == j2) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = C1132359l.A01;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SolidColor(value=");
        sb.append((Object) C1132359l.A06(this.A00));
        sb.append(')');
        return sb.toString();
    }

    public C6L4(long j) {
        this.A00 = j;
    }
}
