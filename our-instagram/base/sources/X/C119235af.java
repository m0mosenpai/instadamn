package X;

/* renamed from: X.5af, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119235af {
    public final long A00;

    public static final long A00(long j, long j2) {
        return ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L) | ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32);
    }

    public static final long A01(long j, long j2) {
        return ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L) | ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32);
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C119235af) || j != ((C119235af) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append((int) (j >> 32));
        sb.append(", ");
        sb.append((int) (j & 4294967295L));
        sb.append(')');
        return sb.toString();
    }
}
