package X;

/* renamed from: X.0BG, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0BG {
    public static final String[] A00;

    static {
        A00 = r2;
        String[] strArr = {"pgpgin", "pgpgout", "pgmajfault", "allocstall", "allocstall_high", "allocstall_dma", "allocstall_dma32", "allocstall_normal", "allocstall_movable", "pgsteal_kswapd_normal", "pgsteal_kswapd_high", "pgsteal_kswapd_movable", "pgsteal_direct_normal", "pgsteal_direct_high", "pgsteal_direct_movable"};
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.0BF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.0BF, java.lang.Object] */
    public static final C0BF A00() {
        long[] jArr = new long[15];
        C0JC.A02("/proc/vmstat", jArr, A00);
        ?? obj = new Object();
        long j = jArr[0];
        obj.A02 = j;
        long j2 = jArr[1];
        obj.A04 = j2;
        long j3 = jArr[2];
        obj.A03 = j3;
        long j4 = obj.A00 + jArr[3];
        obj.A00 = j4;
        long j5 = j4 + jArr[4];
        obj.A00 = j5;
        long j6 = j5 + jArr[5];
        obj.A00 = j6;
        long j7 = j6 + jArr[6];
        obj.A00 = j7;
        long j8 = j7 + jArr[7];
        obj.A00 = j8;
        long j9 = j8 + jArr[8];
        obj.A00 = j9;
        long j10 = obj.A01 + jArr[9];
        obj.A01 = j10;
        long j11 = j10 + jArr[10];
        obj.A01 = j11;
        long j12 = j11 + jArr[11];
        obj.A01 = j12;
        long j13 = j12 + jArr[12];
        obj.A01 = j13;
        long j14 = j13 + jArr[13];
        obj.A01 = j14;
        long j15 = j14 + jArr[14];
        obj.A01 = j15;
        if (j == 0 && j2 == 0 && j3 == 0 && j9 == 0 && j15 == 0) {
            ?? obj2 = new Object();
            obj2.A00 = -1L;
            obj2.A02 = -1L;
            obj2.A04 = -1L;
            obj2.A03 = -1L;
            obj2.A01 = -1L;
            return obj2;
        }
        return obj;
    }
}
