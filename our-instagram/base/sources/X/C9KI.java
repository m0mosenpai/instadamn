package X;

/* renamed from: X.9KI, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9KI {
    public static int A00(C8CE c8ce, int i) {
        int AZZ = c8ce.AZZ() - 1;
        int[] Au5 = c8ce.Au5();
        int i2 = 0;
        while (AZZ > i2) {
            int i3 = (AZZ + i2) / 2;
            if (i < Au5[i3]) {
                AZZ = i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return i2;
    }
}
