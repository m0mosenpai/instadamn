package X;

/* renamed from: X.Bq5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26670Bq5 extends AbstractC78423f8 {
    public static final C26670Bq5 A00 = new C26670Bq5();

    @Override // X.AbstractC78423f8
    public final int A00(long j) {
        int i = (((int) j) & Integer.MAX_VALUE) >>> 18;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    @Override // X.AbstractC78423f8
    public final int A01(long j) {
        int i = ((int) j) & 1073741823 & 262143;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    @Override // X.AbstractC78423f8
    public final long A04(int i, int i2) {
        int i3 = i + 1;
        if (i == Integer.MAX_VALUE) {
            i3 = 0;
        }
        return (((i3 & 8191) << 18) | (this.A00 << 30) | (262143 & (i2 != Integer.MAX_VALUE ? i2 + 1 : 0))) & 4294967295L;
    }

    public C26670Bq5() {
        super(new C17u(8190, 262142), 2);
    }

    @Override // X.AbstractC78423f8
    public final int A02(long j) {
        int i = ((int) (j >>> 32)) & 1073741823 & 262143;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    @Override // X.AbstractC78423f8
    public final int A03(long j) {
        int i = (((int) (j >>> 32)) & Integer.MAX_VALUE) >>> 18;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }
}
