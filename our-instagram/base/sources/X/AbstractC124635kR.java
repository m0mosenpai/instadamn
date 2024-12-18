package X;

/* renamed from: X.5kR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC124635kR {
    public static final long A00(C82513mF c82513mF) {
        C14360o3.A0B(c82513mF, 0);
        long j = 0;
        for (C82523mG c82523mG : c82513mF.A02) {
            long j2 = c82523mG.A01;
            if (j2 >= 0) {
                long j3 = c82523mG.A00;
                if (j3 >= 0) {
                    j += j3 - j2;
                }
            }
        }
        return j;
    }
}
