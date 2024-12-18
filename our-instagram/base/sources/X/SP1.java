package X;

/* loaded from: classes10.dex */
public final class SP1 {
    public SP1 A00;
    public final C4VF A01;
    public final /* synthetic */ TZL A02;

    public final int A01(Object index, int x) {
        while (x > 2) {
            int i = (((x - 1) / 2) - 1) / 2;
            TZL tzl = this.A02;
            Object A00 = TZL.A00(tzl, i);
            if (this.A01.compare(A00, index) <= 0) {
                break;
            }
            tzl.A02[x] = A00;
            x = i;
        }
        this.A02.A02[x] = index;
        return x;
    }

    public SP1(final TZL this$0, C4VF ordering) {
        this.A02 = this$0;
        this.A01 = ordering;
    }

    public final int A00(int a, int b) {
        C4VF c4vf = this.A01;
        TZL tzl = this.A02;
        return c4vf.compare(TZL.A00(tzl, a), TZL.A00(tzl, b));
    }

    public final int A02(Object index, int x) {
        int i;
        Object[] objArr;
        int i2;
        if (x == 0) {
            objArr = this.A02.A02;
            i = 0;
        } else {
            i = (x - 1) / 2;
            TZL tzl = this.A02;
            Object A00 = TZL.A00(tzl, i);
            if (i != 0 && (i2 = (((i - 1) / 2) * 2) + 2) != i && (i2 * 2) + 1 >= tzl.A01) {
                Object A002 = TZL.A00(tzl, i2);
                if (this.A01.compare(A002, A00) < 0) {
                    i = i2;
                    A00 = A002;
                }
            }
            int compare = this.A01.compare(A00, index);
            objArr = tzl.A02;
            if (compare < 0) {
                objArr[x] = A00;
            } else {
                objArr[x] = index;
                return x;
            }
        }
        objArr[i] = index;
        return i;
    }
}
