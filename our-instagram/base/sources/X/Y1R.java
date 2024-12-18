package X;

/* loaded from: classes12.dex */
public final class Y1R {
    public static final Y1R A02;
    public static final Y1R A03;
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Y1R y1r = (Y1R) obj;
            if (this.A01 != y1r.A01 || this.A00 != y1r.A00) {
                return false;
            }
        }
        return true;
    }

    static {
        Y1R y1r = new Y1R(0L, 0L);
        A03 = y1r;
        new Y1R(Long.MAX_VALUE, Long.MAX_VALUE);
        new Y1R(Long.MAX_VALUE, 0L);
        new Y1R(0L, Long.MAX_VALUE);
        A02 = y1r;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public Y1R(long j, long j2) {
        WDn.A01(MSY.A1R((j > 0L ? 1 : (j == 0L ? 0 : -1))));
        WDn.A01(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }
}
