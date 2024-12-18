package X;

/* renamed from: X.5C2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5C2 {
    public static final long A01 = 0 << 32;
    public final long A00;

    public static final int A00(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (i > i2) {
            return i;
        }
        return i2;
    }

    public static final int A01(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (i > i2) {
            return i2;
        }
        return i;
    }

    public static String A02(long j) {
        return AnonymousClass001.A0X("TextRange(", ", ", ')', (int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean A03(long j) {
        if (((int) (j >> 32)) != ((int) (j & 4294967295L))) {
            return false;
        }
        return true;
    }

    public static final boolean A04(long j) {
        if (((int) (j >> 32)) <= ((int) (j & 4294967295L))) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C5C2) || j != ((C5C2) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return A02(this.A00);
    }
}
