package X;

/* renamed from: X.61v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1336661v {
    public final C1336561u A00;

    public final LK0 A00(MPU mpu, String str) {
        C14360o3.A0B(str, 0);
        new LK0();
        C1336561u c1336561u = this.A00;
        LK0 lk0 = new LK0();
        Integer AfB = mpu.AfB();
        int intValue = AfB.intValue();
        if (intValue != 1) {
            if (intValue != 0) {
                throw new RuntimeException();
            }
        } else {
            str = "DEVICE_SCOPE_KEY_0";
        }
        C1336561u.A01(c1336561u, AfB, str).A04(new LSK(lk0, mpu, c1336561u, str));
        return lk0;
    }

    public final LK0 A01(MPU mpu, String str) {
        C14360o3.A0B(str, 0);
        new LK0();
        C1336561u c1336561u = this.A00;
        LK0 lk0 = new LK0();
        Integer AfB = mpu.AfB();
        int intValue = AfB.intValue();
        if (intValue != 1) {
            if (intValue != 0) {
                throw new RuntimeException();
            }
        } else {
            str = "DEVICE_SCOPE_KEY_0";
        }
        C1336561u.A01(c1336561u, AfB, str).A04(new LSL(lk0, mpu, c1336561u, str));
        return lk0;
    }

    public C1336661v(C1336561u c1336561u) {
        this.A00 = c1336561u;
    }
}
