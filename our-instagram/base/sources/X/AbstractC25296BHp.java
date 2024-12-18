package X;

/* renamed from: X.BHp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25296BHp {
    public static final int A00(long j, long j2) {
        boolean A1M = AbstractC167007dF.A1M((int) (j & 4294967295L));
        if (A1M != AbstractC167007dF.A1M((int) (j2 & 4294967295L))) {
            if (!A1M) {
                return 1;
            }
            return -1;
        }
        return (int) Math.signum(AbstractC25227BEk.A01(j) - AbstractC25227BEk.A01(j2));
    }
}
