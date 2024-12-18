package X;

import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: X.1ov, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37581ov implements InterfaceC37541or, InterfaceC37501on {
    public static final TreeMap A08 = new TreeMap();
    public int A00;
    public final double[] A01;
    public final long[] A02;
    public final String[] A03;
    public final byte[][] A04;
    public final int A05;
    public final int[] A06;
    public volatile String A07;

    @Override // X.InterfaceC37541or
    public final void ADc(int i, byte[] bArr) {
        C14360o3.A0B(bArr, 1);
        this.A06[i] = 5;
        this.A04[i] = bArr;
    }

    @Override // X.InterfaceC37541or
    public final void ADp(int i, String str) {
        C14360o3.A0B(str, 1);
        this.A06[i] = 4;
        this.A03[i] = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void A00() {
        TreeMap treeMap = A08;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.A05), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                C14360o3.A07(it);
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // X.InterfaceC37541or
    public final void ADg(int i, double d) {
        this.A06[i] = 3;
        this.A01[i] = d;
    }

    @Override // X.InterfaceC37541or
    public final void ADi(int i, long j) {
        this.A06[i] = 2;
        this.A02[i] = j;
    }

    @Override // X.InterfaceC37541or
    public final void ADj(int i) {
        this.A06[i] = 1;
    }

    @Override // X.InterfaceC37501on
    public final void ADs(InterfaceC37541or interfaceC37541or) {
        int i = this.A00;
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                int i3 = this.A06[i2];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 == 5) {
                                    byte[] bArr = this.A04[i2];
                                    if (bArr != null) {
                                        interfaceC37541or.ADc(i2, bArr);
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                            } else {
                                String str = this.A03[i2];
                                if (str != null) {
                                    interfaceC37541or.ADp(i2, str);
                                } else {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            }
                        } else {
                            interfaceC37541or.ADg(i2, this.A01[i2]);
                        }
                    } else {
                        interfaceC37541or.ADi(i2, this.A02[i2]);
                    }
                } else {
                    interfaceC37541or.ADj(i2);
                }
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC37501on
    public final String BzS() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C37581ov(int i) {
        this.A05 = i;
        int i2 = i + 1;
        this.A06 = new int[i2];
        this.A02 = new long[i2];
        this.A01 = new double[i2];
        this.A03 = new String[i2];
        this.A04 = new byte[i2];
    }
}
