package X;

import android.util.SparseLongArray;

/* renamed from: X.0Ww, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC06620Ww {
    public long A00;
    public long A01;
    public final C0Xc[] A02;
    public final InterfaceC07530aS A03;
    public final InterfaceC07530aS A04;
    public final C10390h6 A05;
    public final C0R9 A06;

    public int A03(C0Xc c0Xc) {
        return 0;
    }

    public abstract int[] A04(C0Xc c0Xc);

    /* JADX WARN: Type inference failed for: r10v0, types: [X.0aS, android.util.SparseLongArray] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0aS, android.util.SparseLongArray] */
    public AbstractC06620Ww(C10390h6 c10390h6, C0R9 c0r9, C0Xc[] c0XcArr) {
        int length;
        this.A02 = c0XcArr;
        this.A05 = c10390h6;
        this.A06 = c0r9;
        if (c0XcArr != null && (length = c0XcArr.length) != 0) {
            if (length <= 64) {
                if (length > 58 && c10390h6 != null) {
                    c10390h6.A08(new IllegalArgumentException(AnonymousClass001.A0c("We are reaching limit of listeners: ", " registered", length)));
                }
                ?? sparseLongArray = new SparseLongArray(30);
                this.A04 = sparseLongArray;
                ?? sparseLongArray2 = new SparseLongArray(4);
                this.A03 = sparseLongArray2;
                long j = 1;
                int i = 0;
                long j2 = 0;
                long j3 = 0;
                do {
                    int[] A04 = A04(c0XcArr[i]);
                    if (A04 != null) {
                        for (int i2 : A04) {
                            if (i2 == -1) {
                                j2 |= j;
                            } else if (i2 != -2) {
                                sparseLongArray.put(i2, sparseLongArray.get(i2, 0L) | j);
                            }
                            j3 |= j;
                        }
                    }
                    i++;
                    j <<= 1;
                } while (i < length);
                this.A00 = j2;
                this.A01 = j3;
                long j4 = 1;
                int i3 = 0;
                do {
                    int A03 = A03(c0XcArr[i3]);
                    if (A03 != 0) {
                        sparseLongArray2.put(A03, sparseLongArray2.get(A03, 0L) | j4);
                    }
                    i3++;
                    j4 <<= 1;
                } while (i3 < length);
                return;
            }
            throw new UnsupportedOperationException("We support up to 64 listeners");
        }
        this.A04 = null;
        this.A03 = null;
        this.A00 = 0L;
        this.A01 = 0L;
    }

    public final long A01(int i) {
        InterfaceC07530aS interfaceC07530aS = this.A04;
        if (interfaceC07530aS == null || this.A02 == null) {
            return 0L;
        }
        return interfaceC07530aS.get(i, 0L) | this.A01;
    }

    public final long A02(int i, int i2) {
        InterfaceC07530aS interfaceC07530aS;
        InterfaceC07530aS interfaceC07530aS2 = this.A04;
        if (interfaceC07530aS2 == null || this.A02 == null || (interfaceC07530aS = this.A03) == null || (i2 & 32) == 32) {
            return 0L;
        }
        if ((i2 & 128) == 128) {
            return interfaceC07530aS.get(i2 & 64, 0L) & interfaceC07530aS2.get(i, 0L);
        }
        return interfaceC07530aS.get(i2, 0L) | this.A00 | interfaceC07530aS2.get(i, 0L);
    }
}
