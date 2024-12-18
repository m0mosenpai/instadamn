package X;

/* renamed from: X.3f8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC78423f8 {
    public final int A00;
    public final C17u A01;

    public int A00(long j) {
        int i = ((int) j) & 1073741823;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public abstract int A01(long j);

    public abstract int A02(long j);

    public abstract int A03(long j);

    public abstract long A04(int i, int i2);

    public AbstractC78423f8(C17u c17u, int i) {
        this.A01 = c17u;
        this.A00 = i;
    }
}
