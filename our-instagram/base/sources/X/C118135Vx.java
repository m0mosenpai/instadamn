package X;

/* renamed from: X.5Vx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C118135Vx {
    public final long A00;
    public static final C118145Vy[] A02 = {new C118145Vy(0), new C118145Vy(4294967296L), new C118145Vy(8589934592L)};
    public static final long A01 = AbstractC118155Vz.A00(Float.NaN, 0);

    public static final long A01(long j) {
        return A02[(int) ((j & 1095216660480L) >>> 32)].A00;
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C118135Vx) || j != ((C118135Vx) obj).A00) {
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

    public static String A02(long j) {
        StringBuilder sb;
        String str;
        long A012 = A01(j);
        if (A012 == 0) {
            return "Unspecified";
        }
        if (A012 == 4294967296L) {
            sb = new StringBuilder();
            sb.append(A00(j));
            str = ".sp";
        } else if (A012 == 8589934592L) {
            sb = new StringBuilder();
            sb.append(A00(j));
            str = ".em";
        } else {
            return "Invalid";
        }
        sb.append(str);
        return sb.toString();
    }

    public static final float A00(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
