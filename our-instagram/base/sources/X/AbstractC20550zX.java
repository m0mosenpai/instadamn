package X;

/* renamed from: X.0zX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC20550zX {
    public final C20600zd A04;
    public long A00 = 0;
    public long A03 = 0;
    public long A01 = 0;
    public long A02 = 0;

    public AbstractC20550zX(C20600zd c20600zd) {
        this.A04 = c20600zd;
    }

    public final long A00() {
        long j = this.A02;
        int i = 0;
        do {
            i++;
            j >>= 7;
        } while (j != 0);
        return (i + 1 + this.A01 + 4 + 3) & (-4);
    }

    public void A01(long j, long j2) {
        long j3 = this.A00 + ((3 + j) & (-4));
        this.A00 = j3;
        long j4 = this.A03 + j2;
        this.A03 = j4;
        long j5 = this.A01;
        int i = 0;
        do {
            i++;
            j >>= 7;
        } while (j != 0);
        int i2 = 0;
        do {
            i2++;
            j2 >>= 7;
        } while (j2 != 0);
        this.A01 = j5 + i + i2;
        this.A02++;
        if (j3 >= 0 && j4 >= 0) {
            long A00 = A00();
            if (A00 <= 17179869184L && j3 + 12 + A00 + 12 >= 0) {
                return;
            }
        }
        throw this.A04;
    }
}
