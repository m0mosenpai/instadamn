package X;

/* renamed from: X.5Vy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C118145Vy {
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C118145Vy) || j != ((C118145Vy) obj).A00) {
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
        if (j == 0) {
            return "Unspecified";
        }
        if (j == 4294967296L) {
            return "Sp";
        }
        if (j == 8589934592L) {
            return "Em";
        }
        return "Invalid";
    }
}
