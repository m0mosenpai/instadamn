package X;

/* renamed from: X.6O1, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6O1 {
    public static final int A00(C57S c57s, int i) {
        int i2 = c57s.A00 - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = c57s.A02;
            int i5 = ((C6Nx) objArr[i4]).A01;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((C6Nx) objArr[i3]).A01) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }
}
