package X;

/* renamed from: X.0B9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0B9 {
    public static final String[] A07 = {"rchar:", "wchar:", "syscr:", "syscw:", "read_bytes:", "write_bytes:", "cancelled_write_bytes:"};
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;

    public static C0B9 A00() {
        long[] jArr = new long[7];
        if (C0JC.A02("/proc/self/io", jArr, A07)) {
            return new C0B9(jArr[0], jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]);
        }
        return null;
    }

    public final C0B9 A01(C0B9 c0b9) {
        return new C0B9(this.A02 - c0b9.A02, this.A05 - c0b9.A05, this.A03 - c0b9.A03, this.A06 - c0b9.A06, this.A01 - c0b9.A01, this.A04 - c0b9.A04, this.A00 - c0b9.A00);
    }

    public C0B9(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.A02 = j;
        this.A05 = j2;
        this.A03 = j3;
        this.A06 = j4;
        this.A01 = j5;
        this.A04 = j6;
        this.A00 = j7;
    }
}
