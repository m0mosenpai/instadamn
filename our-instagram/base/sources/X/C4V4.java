package X;

/* renamed from: X.4V4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4V4 implements C4V5 {
    public InterfaceC123215hw A00;
    public C4V3 A01;
    public C2B5 A02;

    @Override // X.C4V5
    public final long BUB(C4TG c4tg, InterfaceC97914aW interfaceC97914aW, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, boolean z, boolean z2, boolean z3) {
        if (j7 == -9223372036854775807L && j8 == -9223372036854775807L && j9 == -9223372036854775807L) {
            C4V3 c4v3 = this.A01;
            if (!c4v3.A0M) {
                return -9223372036854775807L;
            }
            if (c4v3.A00 <= 0 && c4v3.A01 <= 0) {
                return -9223372036854775807L;
            }
        }
        if (!z) {
            return -9223372036854775807L;
        }
        C4V3 c4v32 = this.A01;
        if (c4tg == null || !c4tg.A00) {
            return -9223372036854775807L;
        }
        long j10 = 0;
        long j11 = c4v32.A00;
        long j12 = c4v32.A01;
        if (j7 != -9223372036854775807L && j7 > 0) {
            j10 = j7;
        }
        if (j8 != -9223372036854775807L && j8 > 0) {
            j11 = j8;
        }
        if (j9 != -9223372036854775807L && j9 > 0) {
            j12 = j9;
        }
        if (j10 > 0 && (j2 < j5 || j < j3)) {
            if (!z3) {
                return -9223372036854775807L;
            }
            return j4 - (j10 * 1000);
        }
        if (j11 <= 0 || j12 <= 0) {
            return -9223372036854775807L;
        }
        long j13 = j4 - (j11 * 1000);
        C97894aU c97894aU = (C97894aU) interfaceC97914aW;
        if (j2 >= Math.max(j5, Math.min(c97894aU.A0f[c97894aU.A0E.Bsd()].A04(j13 - (j12 * 1000)), j6))) {
            return -9223372036854775807L;
        }
        return j13;
    }
}
