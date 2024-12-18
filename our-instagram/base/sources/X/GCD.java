package X;

/* loaded from: classes6.dex */
public final class GCD implements C5OV {
    public final Long A00;
    public final Long A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        Long l;
        int i;
        Long l2 = this.A00;
        if (l2 == null || (l = this.A01) == null) {
            return false;
        }
        long A0L = AbstractC166987dD.A0L(System.currentTimeMillis() - C123815iv.A00());
        long longValue = l2.longValue();
        long longValue2 = l.longValue();
        if (longValue > longValue2) {
            if (A0L < longValue) {
                i = (A0L > longValue2 ? 1 : (A0L == longValue2 ? 0 : -1));
            }
            return true;
        }
        if (A0L > longValue2) {
            return false;
        }
        i = (longValue > A0L ? 1 : (longValue == A0L ? 0 : -1));
        if (i > 0) {
            return false;
        }
        return true;
    }

    public GCD(Long l, Long l2) {
        this.A00 = l;
        this.A01 = l2;
    }
}
