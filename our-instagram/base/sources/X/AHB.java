package X;

/* loaded from: classes4.dex */
public final class AHB {
    public final long A00;
    public static final long A01 = 4 << 32;
    public static final long A06 = 19 << 32;
    public static final long A03 = 20 << 32;
    public static final long A04 = 21 << 32;
    public static final long A05 = 22 << 32;
    public static final long A02 = 23 << 32;
    public static final long A0C = 61 << 32;
    public static final long A07 = 66 << 32;
    public static final long A08 = 111 << 32;
    public static final long A0B = 92 << 32;
    public static final long A0A = 93 << 32;
    public static final long A09 = 160 << 32;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AHB) || j != ((AHB) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AnonymousClass001.A0Q("Key code: ", this.A00);
    }
}
