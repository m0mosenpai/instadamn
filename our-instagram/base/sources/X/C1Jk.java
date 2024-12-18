package X;

/* renamed from: X.1Jk, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1Jk {
    public static int A01(int hashCode) {
        return (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
    }

    public static int A00(int i) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (1.0d * highestOneBit))) {
            int i2 = highestOneBit << 1;
            if (i2 <= 0) {
                return AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
            }
            return i2;
        }
        return highestOneBit;
    }

    public static int A02(Object o) {
        int hashCode;
        if (o == null) {
            hashCode = 0;
        } else {
            hashCode = o.hashCode();
        }
        return A01(hashCode);
    }
}
