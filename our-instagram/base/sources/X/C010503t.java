package X;

/* renamed from: X.03t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C010503t implements C0LR {
    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A00;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        long[] jArr = new long[8];
        C0JC.A02("/proc/self/status", jArr, C0AX.A00);
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        c024209q.A02(C0LK.A0h, Long.valueOf(j));
        c024209q.A02(C0LK.A0g, Long.valueOf(j2));
        c024209q.A02(C0LK.A2s, Long.valueOf(j3));
        c024209q.A02(C0LK.A2r, Long.valueOf(j4));
        c024209q.A02(C0LK.A2v, Long.valueOf(j5));
        c024209q.A02(C0LK.A2x, Long.valueOf(j6));
        c024209q.A02(C0LK.A1W, Long.valueOf(j7));
        c024209q.A02(C0LK.A32, Long.valueOf(j8));
    }
}
