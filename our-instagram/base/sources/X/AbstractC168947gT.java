package X;

/* renamed from: X.7gT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC168947gT {
    public static final C168957gU A00(C2XE c2xe, C2VF c2vf, int i, boolean z) {
        return A01(c2xe, c2vf, C05F.A00, 1, Integer.MIN_VALUE, i, true, z);
    }

    public static final C168957gU A01(C2XE c2xe, C2VF c2vf, Integer num, int i, int i2, int i3, boolean z, boolean z2) {
        boolean z3;
        if (num.intValue() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new C168957gU(c2xe, c2vf, i, i2, i3, z, z2, z3);
    }
}
