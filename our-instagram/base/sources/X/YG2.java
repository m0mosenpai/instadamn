package X;

/* loaded from: classes12.dex */
public final class YG2 implements Comparable {
    public final int A00;
    public final long A01;
    public final Runnable A02;
    public volatile boolean A03;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        YG2 yg2 = (YG2) obj;
        long j = this.A01;
        long j2 = yg2.A01;
        if (j >= j2) {
            if (j <= j2) {
                int i = this.A00;
                int i2 = yg2.A00;
                if (i >= i2) {
                    if (i <= i2) {
                        return 0;
                    }
                } else {
                    return -1;
                }
            }
            return 1;
        }
        return -1;
    }

    public YG2(Long l, Runnable runnable, int i) {
        this.A02 = runnable;
        this.A01 = l.longValue();
        this.A00 = i;
    }
}
