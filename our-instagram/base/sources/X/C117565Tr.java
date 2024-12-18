package X;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.5Tr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117565Tr {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public C18750w2 A0C;
    public C18750w2 A0D;
    public C6NJ A0E;
    public ArrayList A0F;
    public HashMap A0G;
    public boolean A0H;
    public int[] A0I;
    public Object[] A0J;
    public final C117525Tn A0K;
    public final C117445Td A0L;
    public final C117525Tn A0M;
    public final C117525Tn A0N;

    public static final boolean A0F(C117565Tr c117565Tr, int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = c117565Tr.A0F;
            A06(c117565Tr, i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = c117565Tr.A0G;
                int i3 = i2 + i;
                int length = (c117565Tr.A0I.length / 5) - c117565Tr.A04;
                ArrayList arrayList2 = c117565Tr.A0F;
                int A01 = AbstractC117585Tt.A01(arrayList2, i3, length);
                if (A01 < 0) {
                    A01 = -(A01 + 1);
                }
                if (A01 >= arrayList2.size()) {
                    A01--;
                }
                int i4 = A01 + 1;
                int i5 = 0;
                while (A01 >= 0) {
                    C117595Tu c117595Tu = (C117595Tu) c117565Tr.A0F.get(A01);
                    int A0H = c117565Tr.A0H(c117595Tu);
                    if (A0H < i) {
                        break;
                    }
                    if (A0H < i3) {
                        c117595Tu.A00 = Integer.MIN_VALUE;
                        if (hashMap != null) {
                            hashMap.remove(c117595Tu);
                        }
                        if (i5 == 0) {
                            i5 = A01 + 1;
                        }
                        i4 = A01;
                    }
                    A01--;
                }
                if (i4 < i5) {
                    z = true;
                    c117565Tr.A0F.subList(i4, i5).clear();
                }
            }
            c117565Tr.A05 = i;
            c117565Tr.A04 += i2;
            int i6 = c117565Tr.A0A;
            if (i6 > i) {
                c117565Tr.A0A = Math.max(i, i6 - i2);
            }
            int i7 = c117565Tr.A01;
            if (i7 >= i) {
                c117565Tr.A01 = i7 - i2;
            }
            int i8 = c117565Tr.A08;
            if (i8 >= 0 && (c117565Tr.A0I[(A00(c117565Tr, i8) * 5) + 1] & 67108864) != 0) {
                A08(c117565Tr, i8);
            }
        }
        return z;
    }

    public final void A0P(boolean z) {
        this.A0H = true;
        if (z && this.A0N.A00 == 0) {
            A06(this, (this.A0I.length / 5) - this.A04);
            A0A(this, this.A0J.length - this.A09, this.A05);
            int i = this.A0B;
            AbstractC06960Yn.A0V(this.A0J, i, this.A09 + i);
            A04(this);
        }
        C117445Td c117445Td = this.A0L;
        int[] iArr = this.A0I;
        int i2 = this.A05;
        Object[] objArr = this.A0J;
        int i3 = this.A0B;
        ArrayList arrayList = this.A0F;
        HashMap hashMap = this.A0G;
        C18750w2 c18750w2 = this.A0C;
        if (c117445Td.A07) {
            c117445Td.A07 = false;
            c117445Td.A08 = iArr;
            c117445Td.A00 = i2;
            c117445Td.A09 = objArr;
            c117445Td.A02 = i3;
            c117445Td.A05 = arrayList;
            c117445Td.A06 = hashMap;
            c117445Td.A04 = c18750w2;
            return;
        }
        SQP.A00("Unexpected writer close()");
        throw C00O.createAndThrow();
    }

    public static final int A00(C117565Tr c117565Tr, int i) {
        if (i >= c117565Tr.A05) {
            return i + c117565Tr.A04;
        }
        return i;
    }

    public static final int A01(C117565Tr c117565Tr, int[] iArr, int i) {
        if (i >= c117565Tr.A0I.length / 5) {
            return c117565Tr.A0J.length - c117565Tr.A09;
        }
        int i2 = iArr[(i * 5) + 4];
        int i3 = c117565Tr.A09;
        int length = c117565Tr.A0J.length;
        if (i2 >= 0) {
            return i2;
        }
        return (length - i3) + i2 + 1;
    }

    public static final int A03(C117565Tr c117565Tr, int[] iArr, int i) {
        if (i >= c117565Tr.A0I.length / 5) {
            return c117565Tr.A0J.length - c117565Tr.A09;
        }
        int i2 = i * 5;
        int A00 = iArr[i2 + 4] + AbstractC117585Tt.A00(iArr[i2 + 1] >> 28);
        int i3 = c117565Tr.A09;
        int length = c117565Tr.A0J.length;
        if (A00 >= 0) {
            return A00;
        }
        return (length - i3) + A00 + 1;
    }

    public static final void A04(C117565Tr c117565Tr) {
        boolean z;
        C6NJ c6nj = c117565Tr.A0E;
        if (c6nj != null) {
            while (!c6nj.A00.isEmpty()) {
                int A00 = c6nj.A00();
                int A002 = A00(c117565Tr, A00);
                int i = A00 + 1;
                int[] iArr = c117565Tr.A0I;
                int i2 = A002 * 5;
                int i3 = A00 + iArr[i2 + 3];
                while (true) {
                    if (i < i3) {
                        if ((iArr[(A00(c117565Tr, i) * 5) + 1] & 201326592) != 0) {
                            z = true;
                            break;
                        }
                        i += iArr[(A00(c117565Tr, i) * 5) + 3];
                    } else {
                        z = false;
                        break;
                    }
                }
                boolean z2 = true;
                int i4 = i2 + 1;
                int i5 = iArr[i4];
                if ((i5 & 67108864) == 0) {
                    z2 = false;
                }
                if (z2 != z) {
                    int i6 = i5 | 67108864;
                    if (!z) {
                        i6 = (-67108865) & i5;
                    }
                    iArr[i4] = i6;
                    int A02 = A02(c117565Tr, iArr, A00);
                    if (A02 >= 0) {
                        c6nj.A01(A02);
                    }
                }
            }
        }
    }

    public static final void A05(C117565Tr c117565Tr, int i) {
        int i2;
        if (i > 0) {
            int i3 = c117565Tr.A00;
            A06(c117565Tr, i3);
            int i4 = c117565Tr.A05;
            int i5 = c117565Tr.A04;
            int[] iArr = c117565Tr.A0I;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i8 = max - i6;
                AbstractC06960Yn.A0U(iArr, iArr2, 0, 0, i4 * 5);
                AbstractC06960Yn.A0U(iArr, iArr2, (i4 + i8) * 5, (i5 + i4) * 5, length * 5);
                c117565Tr.A0I = iArr2;
                iArr = iArr2;
                i5 = i8;
            }
            int i9 = c117565Tr.A01;
            if (i9 >= i4) {
                c117565Tr.A01 = i9 + i;
            }
            int i10 = i4 + i;
            c117565Tr.A05 = i10;
            c117565Tr.A04 = i5 - i;
            if (i6 > 0) {
                i2 = A01(c117565Tr, iArr, A00(c117565Tr, i3 + i));
            } else {
                i2 = 0;
            }
            int i11 = c117565Tr.A0A;
            if (i11 >= i4) {
                i7 = c117565Tr.A0B;
            }
            int i12 = c117565Tr.A09;
            int length2 = c117565Tr.A0J.length;
            if (i2 > i7) {
                i2 = -(((length2 - i12) - i2) + 1);
            }
            for (int i13 = i4; i13 < i10; i13++) {
                iArr[(i13 * 5) + 4] = i2;
            }
            if (i11 >= i4) {
                c117565Tr.A0A = i11 + i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        r6 = r8.A0I;
        r5 = r9 * 5;
        r2 = r4 * 5;
        r1 = r3 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        if (r9 >= r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        X.AbstractC06960Yn.A0U(r6, r6, r2 + r5, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        X.AbstractC06960Yn.A0U(r6, r6, r1, r1 + r2, r5 + r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.C117565Tr r8, int r9) {
        /*
            int r4 = r8.A04
            int r3 = r8.A05
            if (r3 == r9) goto Lb6
            java.util.ArrayList r0 = r8.A0F
            boolean r0 = r0.isEmpty()
            r7 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L5f
            int r1 = r8.A04
            int[] r0 = r8.A0I
            int r0 = r0.length
            int r6 = r0 / 5
            int r6 = r6 - r1
            java.util.ArrayList r5 = r8.A0F
            if (r3 >= r9) goto L3e
            int r2 = X.AbstractC117585Tt.A01(r5, r3, r6)
            if (r2 >= 0) goto L26
            int r0 = r2 + 1
            int r2 = -r0
        L26:
            int r0 = r5.size()
            if (r2 >= r0) goto L5f
            java.lang.Object r1 = r5.get(r2)
            X.5Tu r1 = (X.C117595Tu) r1
            int r0 = r1.A00
            if (r0 >= 0) goto L5f
            int r0 = r0 + r6
            if (r0 >= r9) goto L5f
            r1.A00 = r0
            int r2 = r2 + 1
            goto L26
        L3e:
            int r2 = X.AbstractC117585Tt.A01(r5, r9, r6)
            if (r2 >= 0) goto L47
            int r0 = r2 + 1
            int r2 = -r0
        L47:
            int r0 = r5.size()
            if (r2 >= r0) goto L5f
            java.lang.Object r1 = r5.get(r2)
            X.5Tu r1 = (X.C117595Tu) r1
            int r0 = r1.A00
            if (r0 < 0) goto L5f
            int r0 = r6 - r0
            int r0 = -r0
            r1.A00 = r0
            int r2 = r2 + 1
            goto L47
        L5f:
            if (r4 <= 0) goto L6f
            int[] r6 = r8.A0I
            int r5 = r9 * 5
            int r2 = r4 * 5
            int r1 = r3 * 5
            if (r9 >= r3) goto Laf
            int r2 = r2 + r5
            X.AbstractC06960Yn.A0U(r6, r6, r2, r5, r1)
        L6f:
            if (r9 >= r3) goto L73
            int r3 = r9 + r4
        L73:
            int[] r0 = r8.A0I
            int r0 = r0.length
            int r5 = r0 / 5
            if (r3 < r5) goto L7b
            r7 = 0
        L7b:
            X.C5UC.A06(r7)
        L7e:
            if (r3 >= r5) goto Lb6
            int[] r2 = r8.A0I
            int r0 = r3 * 5
            int r0 = r0 + 2
            r7 = r2[r0]
            r6 = r7
            r0 = -2
            if (r7 > r0) goto L95
            int r0 = r2.length
            int r1 = r0 / 5
            int r0 = r8.A04
            int r1 = r1 - r0
            int r1 = r1 + r7
            int r6 = r1 + 2
        L95:
            if (r6 < r9) goto La1
            int r0 = r2.length
            int r1 = r0 / 5
            int r0 = r8.A04
            int r1 = r1 - r0
            int r1 = r1 - r6
            int r0 = r1 + 2
            int r6 = -r0
        La1:
            if (r6 == r7) goto La9
            int r0 = r3 * 5
            int r0 = r0 + 2
            r2[r0] = r6
        La9:
            int r3 = r3 + 1
            if (r3 != r9) goto L7e
            int r3 = r3 + r4
            goto L7e
        Laf:
            int r0 = r1 + r2
            int r5 = r5 + r2
            X.AbstractC06960Yn.A0U(r6, r6, r1, r0, r5)
            goto L6f
        Lb6:
            r8.A05 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117565Tr.A06(X.5Tr, int):void");
    }

    public static final void A07(C117565Tr c117565Tr, int i) {
        int length;
        ArrayList arrayList;
        int A01;
        Object obj;
        HashMap hashMap = c117565Tr.A0G;
        if (hashMap != null && i >= 0 && i < (length = (c117565Tr.A0I.length / 5) - c117565Tr.A04) && (A01 = AbstractC117585Tt.A01((arrayList = c117565Tr.A0F), i, length)) >= 0 && (obj = arrayList.get(A01)) != null) {
            hashMap.get(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A08(C117565Tr c117565Tr, int i) {
        if (i >= 0) {
            C6NJ c6nj = c117565Tr.A0E;
            if (c6nj == null) {
                c6nj = new C6NJ(null, 0 == true ? 1 : 0, 1);
                c117565Tr.A0E = c6nj;
            }
            c6nj.A01(i);
        }
    }

    public static final void A09(C117565Tr c117565Tr, int i, int i2) {
        if (i > 0) {
            A0A(c117565Tr, c117565Tr.A02, i2);
            int i3 = c117565Tr.A0B;
            int i4 = c117565Tr.A09;
            if (i4 < i) {
                Object[] objArr = c117565Tr.A0J;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                AbstractC06960Yn.A0W(objArr, objArr2, 0, 0, i3);
                AbstractC06960Yn.A0W(objArr, objArr2, i3 + i7, i4 + i3, length);
                c117565Tr.A0J = objArr2;
                i4 = i7;
            }
            int i8 = c117565Tr.A03;
            if (i8 >= i3) {
                c117565Tr.A03 = i8 + i;
            }
            c117565Tr.A0B = i3 + i;
            c117565Tr.A09 = i4 - i;
        }
    }

    public static final void A0A(C117565Tr c117565Tr, int i, int i2) {
        String str;
        int i3 = c117565Tr.A09;
        int i4 = c117565Tr.A0B;
        int i5 = c117565Tr.A0A;
        if (i4 != i) {
            Object[] objArr = c117565Tr.A0J;
            if (i < i4) {
                AbstractC06960Yn.A0W(objArr, objArr, i + i3, i, i4);
            } else {
                AbstractC06960Yn.A0W(objArr, objArr, i4, i4 + i3, i + i3);
            }
        }
        int[] iArr = c117565Tr.A0I;
        int length = iArr.length / 5;
        int i6 = c117565Tr.A04;
        int min = Math.min(i2 + 1, length - i6);
        if (i5 != min) {
            int length2 = c117565Tr.A0J.length - i3;
            if (min < i5) {
                int A00 = A00(c117565Tr, min);
                int A002 = A00(c117565Tr, i5);
                int i7 = c117565Tr.A05;
                while (A00 < A002) {
                    int i8 = (A00 * 5) + 4;
                    int i9 = iArr[i8];
                    if (i9 >= 0) {
                        iArr[i8] = -((length2 - i9) + 1);
                        A00++;
                        if (A00 == i7) {
                            A00 += i6;
                        }
                    } else {
                        str = "Unexpected anchor value, expected a positive anchor";
                        C5UC.A03(str);
                        throw C00O.createAndThrow();
                    }
                }
                c117565Tr.A0A = min;
            } else {
                int A003 = A00(c117565Tr, i5);
                int A004 = A00(c117565Tr, min);
                while (A003 < A004) {
                    int i10 = iArr[(A003 * 5) + 4];
                    if (i10 < 0) {
                        iArr[(A003 * 5) + 4] = i10 + length2 + 1;
                        A003++;
                        if (A003 == c117565Tr.A05) {
                            A003 += i6;
                        }
                    } else {
                        str = "Unexpected anchor value, expected a negative anchor";
                        C5UC.A03(str);
                        throw C00O.createAndThrow();
                    }
                }
                c117565Tr.A0A = min;
            }
        }
        c117565Tr.A0B = i;
    }

    public static final void A0B(C117565Tr c117565Tr, int i, int i2, int i3) {
        if (i >= c117565Tr.A05) {
            i = -((((c117565Tr.A0I.length / 5) - c117565Tr.A04) - i) + 2);
        }
        while (i3 < i2) {
            int[] iArr = c117565Tr.A0I;
            int A00 = A00(c117565Tr, i3) * 5;
            iArr[A00 + 2] = i;
            int i4 = iArr[A00 + 3] + i3;
            A0B(c117565Tr, i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public static final void A0C(C117565Tr c117565Tr, int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = c117565Tr.A09;
            int i5 = i + i2;
            A0A(c117565Tr, i5, i3);
            c117565Tr.A0B = i;
            c117565Tr.A09 = i4 + i2;
            AbstractC06960Yn.A0V(c117565Tr.A0J, i, i5);
            int i6 = c117565Tr.A03;
            if (i6 >= i) {
                c117565Tr.A03 = i6 - i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r18 == r0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0E(X.C117565Tr r16, java.lang.Object r17, java.lang.Object r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117565Tr.A0E(X.5Tr, java.lang.Object, java.lang.Object, int, boolean):void");
    }

    public final int A0H(C117595Tu c117595Tu) {
        int i = c117595Tu.A00;
        if (i < 0) {
            return i + ((this.A0I.length / 5) - this.A04);
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.5Tu] */
    public final C117595Tu A0I(int i) {
        ArrayList arrayList = this.A0F;
        int length = (this.A0I.length / 5) - this.A04;
        int A01 = AbstractC117585Tt.A01(arrayList, i, length);
        if (A01 < 0) {
            if (i > this.A05) {
                i = -(length - i);
            }
            ?? obj = new Object();
            obj.A00 = i;
            arrayList.add(-(A01 + 1), obj);
            return obj;
        }
        return (C117595Tu) arrayList.get(A01);
    }

    public final void A0J() {
        int i = this.A06;
        this.A06 = i + 1;
        if (i == 0) {
            this.A0K.A00(((this.A0I.length / 5) - this.A04) - this.A01);
        }
    }

    public final void A0K() {
        int i;
        int A00;
        AbstractC004201h abstractC004201h;
        int i2 = 0;
        boolean z = false;
        if (this.A06 > 0) {
            z = true;
        }
        int i3 = this.A00;
        int i4 = this.A01;
        int i5 = this.A08;
        int A002 = A00(this, i5);
        int i6 = this.A07;
        int i7 = i3 - i5;
        int[] iArr = this.A0I;
        boolean A03 = AbstractC117585Tt.A03(iArr, A002);
        if (z) {
            C18750w2 c18750w2 = this.A0D;
            if (c18750w2 != null && (abstractC004201h = (AbstractC004201h) c18750w2.A03(i5)) != null) {
                Object[] objArr = abstractC004201h.A01;
                int i8 = abstractC004201h.A00;
                for (int i9 = 0; i9 < i8; i9++) {
                    Object obj = objArr[i9];
                    if (this.A06 > 0) {
                        A09(this, 1, this.A08);
                    }
                    this.A02++;
                    A0N(obj);
                }
                c18750w2.A07(i5);
            }
            int[] iArr2 = this.A0I;
            boolean z2 = false;
            if (i7 >= 0) {
                z2 = true;
            }
            C5UC.A06(z2);
            iArr2[(A002 * 5) + 3] = i7;
            AbstractC117585Tt.A02(iArr2, A002, i6);
            C117525Tn c117525Tn = this.A0M;
            int[] iArr3 = c117525Tn.A01;
            int i10 = c117525Tn.A00 - 1;
            c117525Tn.A00 = i10;
            int i11 = iArr3[i10];
            if (A03) {
                i6 = 1;
            }
            this.A07 = i11 + i6;
            int A02 = A02(this, iArr2, i5);
            this.A08 = A02;
            if (A02 < 0) {
                A00 = (this.A0I.length / 5) - this.A04;
            } else {
                A00 = A00(this, A02 + 1);
            }
            if (A00 >= 0) {
                i2 = A01(this, iArr2, A00);
            }
            this.A02 = i2;
            this.A03 = i2;
            return;
        }
        if (i3 == i4) {
            int i12 = A002 * 5;
            int i13 = i12 + 3;
            int i14 = iArr[i13];
            int i15 = iArr[i12 + 1] & 67108863;
            boolean z3 = false;
            if (i7 >= 0) {
                z3 = true;
            }
            C5UC.A06(z3);
            iArr[i13] = i7;
            AbstractC117585Tt.A02(iArr, A002, i6);
            C117525Tn c117525Tn2 = this.A0N;
            int[] iArr4 = c117525Tn2.A01;
            int i16 = c117525Tn2.A00 - 1;
            c117525Tn2.A00 = i16;
            int i17 = iArr4[i16];
            int length = (this.A0I.length / 5) - this.A04;
            C117525Tn c117525Tn3 = this.A0K;
            int[] iArr5 = c117525Tn3.A01;
            int i18 = c117525Tn3.A00 - 1;
            c117525Tn3.A00 = i18;
            this.A01 = length - iArr5[i18];
            this.A08 = i17;
            int A022 = A02(this, iArr, i5);
            C117525Tn c117525Tn4 = this.A0M;
            int[] iArr6 = c117525Tn4.A01;
            int i19 = c117525Tn4.A00 - 1;
            c117525Tn4.A00 = i19;
            int i20 = iArr6[i19];
            this.A07 = i20;
            if (A022 == i17) {
                if (!A03) {
                    i2 = i6 - i15;
                }
                i = i20 + i2;
            } else {
                int i21 = i7 - i14;
                int i22 = i6 - i15;
                if (A03) {
                    i22 = 0;
                }
                if (i21 != 0 || i22 != 0) {
                    while (A022 != 0 && A022 != i17 && (i22 != 0 || i21 != 0)) {
                        int A003 = A00(this, A022);
                        if (i21 != 0) {
                            int i23 = iArr[(A003 * 5) + 3] + i21;
                            boolean z4 = false;
                            if (i23 >= 0) {
                                z4 = true;
                            }
                            C5UC.A06(z4);
                            iArr[(A003 * 5) + 3] = i23;
                        }
                        if (i22 != 0) {
                            AbstractC117585Tt.A02(iArr, A003, (iArr[(A003 * 5) + 1] & 67108863) + i22);
                        }
                        if (AbstractC117585Tt.A03(iArr, A003)) {
                            i22 = 0;
                        }
                        A022 = A02(this, iArr, A022);
                    }
                }
                i = i20 + i22;
            }
            this.A07 = i;
            return;
        }
        C5UC.A03("Expected to be at the end of a group");
        throw C00O.createAndThrow();
    }

    public final void A0L() {
        int i = this.A06;
        if (i > 0) {
            int i2 = i - 1;
            this.A06 = i2;
            if (i2 == 0) {
                if (this.A0M.A00 == this.A0N.A00) {
                    int length = (this.A0I.length / 5) - this.A04;
                    C117525Tn c117525Tn = this.A0K;
                    int[] iArr = c117525Tn.A01;
                    int i3 = c117525Tn.A00 - 1;
                    c117525Tn.A00 = i3;
                    this.A01 = length - iArr[i3];
                    return;
                }
                C5UC.A03("startGroup/endGroup mismatch while inserting");
            } else {
                return;
            }
        } else {
            SQP.A01("Unbalanced begin/end insert");
        }
        throw C00O.createAndThrow();
    }

    public final void A0M() {
        int i = this.A01;
        this.A00 = i;
        this.A02 = A01(this, this.A0I, A00(this, i));
    }

    public final void A0N(Object obj) {
        int i = this.A02;
        if (i <= this.A03) {
            Object[] objArr = this.A0J;
            int i2 = i - 1;
            if (i2 >= this.A0B) {
                i2 += this.A09;
            }
            objArr[i2] = obj;
            return;
        }
        C5UC.A03("Writing to an invalid slot");
        throw C00O.createAndThrow();
    }

    public final void A0O(Object obj) {
        int A00 = A00(this, this.A00);
        int[] iArr = this.A0I;
        int i = iArr[(A00 * 5) + 1];
        if ((268435456 & i) != 0) {
            Object[] objArr = this.A0J;
            int A01 = A01(this, iArr, A00) + AbstractC117585Tt.A00(i >> 29);
            if (A01 >= this.A0B) {
                A01 += this.A09;
            }
            objArr[A01] = obj;
            return;
        }
        C5UC.A03("Updating the data of a group that was not created with a data slot");
        throw C00O.createAndThrow();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SlotWriter(current = ");
        sb.append(this.A00);
        sb.append(" end=");
        sb.append(this.A01);
        sb.append(" size = ");
        int length = this.A0I.length / 5;
        int i = this.A04;
        sb.append(length - i);
        sb.append(" gap=");
        int i2 = this.A05;
        sb.append(i2);
        sb.append('-');
        sb.append(i2 + i);
        sb.append(')');
        return sb.toString();
    }

    public C117565Tr(C117445Td c117445Td) {
        this.A0L = c117445Td;
        int[] iArr = c117445Td.A08;
        this.A0I = iArr;
        Object[] objArr = c117445Td.A09;
        this.A0J = objArr;
        this.A0F = c117445Td.A05;
        this.A0G = c117445Td.A06;
        this.A0C = c117445Td.A04;
        int i = c117445Td.A00;
        this.A05 = i;
        this.A04 = (iArr.length / 5) - i;
        int i2 = c117445Td.A02;
        this.A0B = i2;
        this.A09 = objArr.length - i2;
        this.A0A = i;
        this.A0N = new C117525Tn();
        this.A0K = new C117525Tn();
        this.A0M = new C117525Tn();
        this.A01 = i;
        this.A08 = -1;
    }

    public static final int A02(C117565Tr c117565Tr, int[] iArr, int i) {
        int i2 = iArr[(A00(c117565Tr, i) * 5) + 2];
        if (i2 <= -2) {
            return ((c117565Tr.A0I.length / 5) - c117565Tr.A04) + i2 + 2;
        }
        return i2;
    }

    public static final void A0D(C117565Tr c117565Tr, Object obj, int i) {
        int A00 = A00(c117565Tr, i);
        int[] iArr = c117565Tr.A0I;
        if (A00 < iArr.length && AbstractC117585Tt.A03(iArr, A00)) {
            Object[] objArr = c117565Tr.A0J;
            int A01 = A01(c117565Tr, iArr, A00);
            if (A01 >= c117565Tr.A0B) {
                A01 += c117565Tr.A09;
            }
            objArr[A01] = obj;
            return;
        }
        C5UC.A03(AnonymousClass001.A0c("Updating the node of a group at ", " that was not created with as a node group", i));
        throw C00O.createAndThrow();
    }

    public final int A0G(int i, int i2) {
        int A00 = A00(this, i);
        int[] iArr = this.A0I;
        int A03 = A03(this, iArr, A00);
        int A01 = A01(this, iArr, A00(this, i + 1));
        int i3 = A03 + i2;
        if (i3 >= A03 && i3 < A01) {
            return i3;
        }
        C5UC.A03(AnonymousClass001.A02(i2, i, "Write to an invalid slot index ", " for group "));
        throw C00O.createAndThrow();
    }
}
