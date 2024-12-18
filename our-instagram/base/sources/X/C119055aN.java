package X;

/* renamed from: X.5aN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119055aN {
    public final long A00;

    public static final int A00(long j) {
        return (int) (j & 4294967295L);
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C119055aN) || j != ((C119055aN) obj).A00) {
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
        return AnonymousClass001.A0P(" x ", (int) (j >> 32), A00(j));
    }
}
