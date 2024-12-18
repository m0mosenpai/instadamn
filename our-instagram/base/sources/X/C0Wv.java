package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Wv, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Wv {
    public List A07;
    public List A08;
    public ArrayList A05 = new ArrayList();
    public ArrayList A06 = new ArrayList();
    public double[] A0A = new double[15];
    public int A00 = 0;
    public long[] A0B = new long[15];
    public int A02 = 0;
    public byte[] A09 = new byte[20];
    public int A03 = 0;
    public int A01 = -1;
    public String A04 = null;

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x001f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e1 A[LOOP:0: B:9:0x000d->B:17:0x00e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00df A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String A03(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Wv.A03(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0022. Please report as an issue. */
    public final synchronized List A04() {
        List list;
        int i;
        String str;
        int i2;
        List list2 = this.A08;
        list = list2;
        if (list2 == null) {
            int i3 = this.A03;
            if (i3 == 0) {
                list = Collections.emptyList();
            } else {
                ArrayList arrayList = new ArrayList(i3 * 2);
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (i4 < this.A03) {
                    byte[] bArr = this.A09;
                    switch (bArr[i4]) {
                        case 1:
                            i = i5 + 1;
                            str = (String) this.A06.get(i5);
                            arrayList.add((String) this.A05.get(i4));
                            arrayList.add(str);
                            i4++;
                            i5 = i;
                        case 2:
                            i2 = i6 + 1;
                            str = Integer.toString((int) this.A0B[i6]);
                            i = i5;
                            i6 = i2;
                            arrayList.add((String) this.A05.get(i4));
                            arrayList.add(str);
                            i4++;
                            i5 = i;
                        case 3:
                            i2 = i6 + 1;
                            str = Long.toString(this.A0B[i6]);
                            i = i5;
                            i6 = i2;
                            arrayList.add((String) this.A05.get(i4));
                            arrayList.add(str);
                            i4++;
                            i5 = i;
                        case 4:
                            i = i5 + 1;
                            str = C0Wu.A03((String[]) this.A06.get(i5));
                            arrayList.add((String) this.A05.get(i4));
                            arrayList.add(str);
                            i4++;
                            i5 = i;
                        case 5:
                            i = i5 + 1;
                            str = C0Wu.A01((int[]) this.A06.get(i5));
                            arrayList.add((String) this.A05.get(i4));
                            arrayList.add(str);
                            i4++;
                            i5 = i;
                        case 6:
                            str = Double.toString(this.A0A[i7]);
                            i = i5;
                            i7++;
                            arrayList.add((String) this.A05.get(i4));
                            arrayList.add(str);
                            i4++;
                            i5 = i;
                        case 7:
                            i = i5 + 1;
                            str = C0Wu.A00((double[]) this.A06.get(i5));
                            arrayList.add((String) this.A05.get(i4));
                            arrayList.add(str);
                            i4++;
                            i5 = i;
                        case 8:
                            i2 = i6 + 1;
                            boolean z = false;
                            if (this.A0B[i6] != 0) {
                                z = true;
                            }
                            str = Boolean.toString(z);
                            i = i5;
                            i6 = i2;
                            arrayList.add((String) this.A05.get(i4));
                            arrayList.add(str);
                            i4++;
                            i5 = i;
                        case 9:
                            i = i5 + 1;
                            str = C0Wu.A04((boolean[]) this.A06.get(i5));
                            arrayList.add((String) this.A05.get(i4));
                            arrayList.add(str);
                            i4++;
                            i5 = i;
                        case 10:
                            i = i5 + 1;
                            str = C0Wu.A02((long[]) this.A06.get(i5));
                            arrayList.add((String) this.A05.get(i4));
                            arrayList.add(str);
                            i4++;
                            i5 = i;
                        default:
                            throw new UnsupportedOperationException(AnonymousClass001.A0O("Unsupported type ", bArr[i4]));
                    }
                }
                this.A08 = arrayList;
                list = arrayList;
            }
        }
        return list;
    }

    public final synchronized void A05(String str, int i) {
        this.A08 = null;
        this.A07 = null;
        this.A05.add(str);
        A02(this, i);
        A00(this, (byte) 2);
    }

    public final synchronized void A06(String str, boolean z) {
        long j;
        this.A08 = null;
        this.A07 = null;
        this.A05.add(str);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        A02(this, j);
        A00(this, (byte) 8);
    }

    public static void A00(C0Wv c0Wv, byte b) {
        int i = c0Wv.A03;
        byte[] bArr = c0Wv.A09;
        int length = bArr.length;
        if (i == length) {
            if (length == 0) {
                bArr = new byte[20];
            } else {
                bArr = Arrays.copyOf(bArr, (int) (length * 1.4d));
            }
            c0Wv.A09 = bArr;
        }
        int i2 = c0Wv.A03;
        c0Wv.A03 = i2 + 1;
        bArr[i2] = b;
    }

    public static void A01(C0Wv c0Wv, double d) {
        int i = c0Wv.A00;
        double[] dArr = c0Wv.A0A;
        int length = dArr.length;
        if (i == length) {
            dArr = Arrays.copyOf(dArr, (int) (length * 1.4d));
            c0Wv.A0A = dArr;
        }
        int i2 = c0Wv.A00;
        c0Wv.A00 = i2 + 1;
        dArr[i2] = d;
    }

    public static void A02(C0Wv c0Wv, long j) {
        int i = c0Wv.A02;
        long[] jArr = c0Wv.A0B;
        int length = jArr.length;
        if (i == length) {
            jArr = Arrays.copyOf(jArr, (int) (length * 1.4d));
            c0Wv.A0B = jArr;
        }
        int i2 = c0Wv.A02;
        c0Wv.A02 = i2 + 1;
        jArr[i2] = j;
    }
}
