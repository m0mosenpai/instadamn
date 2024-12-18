package X;

/* renamed from: X.9vf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC224549vf {
    public static C199758sR A00(C199758sR c199758sR, int i, int i2) {
        float f = c199758sR.A00;
        float f2 = c199758sR.A01;
        int i3 = (int) (i * (f / f2));
        if (i3 <= i2) {
            return new C199758sR(i, i3);
        }
        return new C199758sR((int) (i2 * (f2 / f)), i2);
    }
}
