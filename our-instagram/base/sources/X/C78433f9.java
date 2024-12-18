package X;

/* renamed from: X.3f9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78433f9 extends AbstractC78423f8 {
    public static final C78433f9 A00 = new C78433f9();

    public C78433f9() {
        super(new C17u(0, 1073741822), 1);
    }

    @Override // X.AbstractC78423f8
    public final int A00(long j) {
        return 0;
    }

    @Override // X.AbstractC78423f8
    public final int A01(long j) {
        int i = ((int) j) & 1073741823;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    @Override // X.AbstractC78423f8
    public final int A03(long j) {
        return 0;
    }

    @Override // X.AbstractC78423f8
    public final int A02(long j) {
        int i = ((int) (j >>> 32)) & 1073741823;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    @Override // X.AbstractC78423f8
    public final long A04(int i, int i2) {
        int i3 = i2 + 1;
        if (i2 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        return ((i3 & 1073741823) | (this.A00 << 30)) & 4294967295L;
    }
}
