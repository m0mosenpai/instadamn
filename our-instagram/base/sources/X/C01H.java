package X;

/* renamed from: X.01H, reason: invalid class name */
/* loaded from: classes.dex */
public final class C01H {
    public final long A00;

    public static long A00(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C01H) || j != ((C01H) obj).A00) {
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
