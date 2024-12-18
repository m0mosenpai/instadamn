package X;

/* renamed from: X.5Vz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC118155Vz {
    public static final long A01(int i) {
        return A00(i, 4294967296L);
    }

    public static final boolean A02(long j) {
        C118145Vy[] c118145VyArr = C118135Vx.A02;
        if ((j & 1095216660480L) != 0) {
            return false;
        }
        return true;
    }

    public static final long A00(float f, long j) {
        long floatToIntBits = j | (Float.floatToIntBits(f) & 4294967295L);
        C118145Vy[] c118145VyArr = C118135Vx.A02;
        return floatToIntBits;
    }
}
