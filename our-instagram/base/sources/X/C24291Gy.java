package X;

/* renamed from: X.1Gy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24291Gy {
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public long A00 = -1;
    public boolean A04 = false;
    public boolean A05 = false;

    public final C1FB A00() {
        long j = this.A01;
        if (j == 0 && this.A02 == 0 && this.A03 == 0) {
            throw new IllegalArgumentException("Should set at least some max size limit");
        }
        long j2 = this.A02;
        if (j2 == 0) {
            this.A02 = j;
            j2 = j;
        }
        long j3 = this.A03;
        if (j3 == 0) {
            this.A03 = j2;
            j3 = j2;
        }
        return new C1FB(j, j2, j3, this.A00, this.A04, this.A05);
    }
}
