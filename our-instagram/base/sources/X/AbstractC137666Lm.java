package X;

/* renamed from: X.6Lm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC137666Lm {
    public static final C137656Ll A00(float f, float f2, float f3, float f4, long j) {
        long j2 = AbstractC137646Lk.A00;
        long A00 = AbstractC137636Lj.A00(Float.intBitsToFloat((int) (j >> 32)), AbstractC137646Lk.A00(j));
        return new C137656Ll(f, f2, f3, f4, A00, A00, A00, A00);
    }

    public static final boolean A01(C137656Ll c137656Ll) {
        long j = c137656Ll.A06;
        long j2 = AbstractC137646Lk.A00;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat == AbstractC137646Lk.A00(j)) {
            long j3 = c137656Ll.A07;
            if (intBitsToFloat == Float.intBitsToFloat((int) (j3 >> 32)) && intBitsToFloat == AbstractC137646Lk.A00(j3)) {
                long j4 = c137656Ll.A05;
                if (intBitsToFloat == Float.intBitsToFloat((int) (j4 >> 32)) && intBitsToFloat == AbstractC137646Lk.A00(j4)) {
                    long j5 = c137656Ll.A04;
                    if (intBitsToFloat == Float.intBitsToFloat((int) (j5 >> 32)) && intBitsToFloat == AbstractC137646Lk.A00(j5)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
