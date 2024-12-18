package X;

import androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3Yw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75063Yw implements Iterable, InterfaceC15590qF {
    public static final C75063Yw A04 = new C75063Yw(0, 0, null, 0);
    public final int A00;
    public final long A01;
    public final long A02;
    public final int[] A03;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC224917l.A0D(new SnapshotIdSet$iterator$1(this, null));
    }

    public final C75063Yw A00(int i) {
        int i2;
        long j;
        long j2;
        int[] iArr;
        int i3 = this.A00;
        int i4 = i - i3;
        if (i4 >= 0) {
            if (i4 < 64) {
                long j3 = 1 << i4;
                long j4 = this.A01;
                if ((j4 & j3) != 0) {
                    j = this.A02;
                    j2 = j4 & (j3 ^ (-1));
                    iArr = this.A03;
                }
                return this;
            }
            if (i4 < 128) {
                long j5 = 1 << (i4 - 64);
                long j6 = this.A02;
                if ((j6 & j5) != 0) {
                    j = j6 & (j5 ^ (-1));
                    j2 = this.A01;
                    iArr = this.A03;
                }
            }
            return this;
            return new C75063Yw(j, j2, iArr, i3);
        }
        int[] iArr2 = this.A03;
        if (iArr2 != null) {
            int length = iArr2.length - 1;
            int i5 = 0;
            while (true) {
                if (i5 <= length) {
                    i2 = (i5 + length) >>> 1;
                    int i6 = iArr2[i2];
                    if (i > i6) {
                        i5 = i2 + 1;
                    } else {
                        if (i >= i6) {
                            break;
                        }
                        length = i2 - 1;
                    }
                } else {
                    i2 = -(i5 + 1);
                    break;
                }
            }
            if (i2 >= 0) {
                if (length == 0) {
                    j = this.A02;
                    j2 = this.A01;
                    iArr = null;
                    return new C75063Yw(j, j2, iArr, i3);
                }
                int[] iArr3 = new int[length];
                if (i2 > 0) {
                    AbstractC06960Yn.A0U(iArr2, iArr3, 0, 0, i2);
                }
                if (i2 < length) {
                    AbstractC06960Yn.A0U(iArr2, iArr3, i2, i2 + 1, length + 1);
                }
                return new C75063Yw(this.A02, this.A01, iArr3, i3);
            }
        }
        return this;
    }

    public final C75063Yw A01(int i) {
        int i2;
        long j;
        long j2;
        int[] iArr;
        int[] iArr2;
        int i3 = this.A00;
        int i4 = i - i3;
        if (i4 >= 0) {
            if (i4 < 64) {
                long j3 = 1 << i4;
                long j4 = this.A01;
                if ((j4 & j3) == 0) {
                    j = this.A02;
                    j2 = j4 | j3;
                    iArr = this.A03;
                }
                return this;
            }
            if (i4 < 128) {
                long j5 = 1 << (i4 - 64);
                long j6 = this.A02;
                if ((j6 & j5) == 0) {
                    j = j6 | j5;
                    j2 = this.A01;
                    iArr = this.A03;
                }
            } else if (!A04(i)) {
                long j7 = this.A02;
                long j8 = this.A01;
                ArrayList arrayList = null;
                int i5 = ((i + 1) / 64) * 64;
                while (true) {
                    if (i3 < i5) {
                        if (j8 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                int[] iArr3 = this.A03;
                                if (iArr3 != null) {
                                    for (int i6 : iArr3) {
                                        arrayList.add(Integer.valueOf(i6));
                                    }
                                }
                            }
                            int i7 = 0;
                            do {
                                if (((1 << i7) & j8) != 0) {
                                    arrayList.add(Integer.valueOf(i7 + i3));
                                }
                                i7++;
                            } while (i7 < 64);
                        }
                        if (j7 == 0) {
                            j8 = 0;
                            break;
                        }
                        i3 += 64;
                        j8 = j7;
                        j7 = 0;
                    } else {
                        i5 = i3;
                        break;
                    }
                }
                if (arrayList != null) {
                    iArr2 = AbstractC001800i.A0x(arrayList);
                } else {
                    iArr2 = this.A03;
                }
                return new C75063Yw(j7, j8, iArr2, i5).A01(i);
            }
            return this;
            return new C75063Yw(j, j2, iArr, i3);
        }
        int[] iArr4 = this.A03;
        if (iArr4 == null) {
            j = this.A02;
            j2 = this.A01;
            iArr = new int[]{i};
            return new C75063Yw(j, j2, iArr, i3);
        }
        int length = iArr4.length;
        int i8 = length - 1;
        int i9 = 0;
        while (true) {
            if (i9 <= i8) {
                i2 = (i9 + i8) >>> 1;
                int i10 = iArr4[i2];
                if (i > i10) {
                    i9 = i2 + 1;
                } else {
                    if (i >= i10) {
                        break;
                    }
                    i8 = i2 - 1;
                }
            } else {
                i2 = -(i9 + 1);
                break;
            }
        }
        if (i2 < 0) {
            int i11 = -(i2 + 1);
            int i12 = length + 1;
            int[] iArr5 = new int[i12];
            AbstractC06960Yn.A0U(iArr4, iArr5, 0, 0, i11);
            AbstractC06960Yn.A0U(iArr4, iArr5, i11 + 1, i11, i12 - 1);
            iArr5[i11] = i;
            return new C75063Yw(this.A02, this.A01, iArr5, i3);
        }
        return this;
    }

    public final C75063Yw A02(C75063Yw c75063Yw) {
        C75063Yw c75063Yw2;
        C75063Yw c75063Yw3 = A04;
        if (c75063Yw == c75063Yw3) {
            return this;
        }
        if (this != c75063Yw3) {
            int i = c75063Yw.A00;
            int i2 = this.A00;
            if (i == i2) {
                int[] iArr = c75063Yw.A03;
                int[] iArr2 = this.A03;
                if (iArr == iArr2) {
                    return new C75063Yw((c75063Yw.A02 ^ (-1)) & this.A02, ((-1) ^ c75063Yw.A01) & this.A01, iArr2, i2);
                }
            }
            int[] iArr3 = c75063Yw.A03;
            int i3 = 0;
            if (iArr3 != null) {
                c75063Yw2 = this;
                for (int i4 : iArr3) {
                    c75063Yw2 = c75063Yw2.A00(i4);
                }
            } else {
                c75063Yw2 = this;
            }
            long j = c75063Yw.A01;
            if (j != 0) {
                int i5 = 0;
                do {
                    if ((j & (1 << i5)) != 0) {
                        c75063Yw2 = c75063Yw2.A00(i + i5);
                    }
                    i5++;
                } while (i5 < 64);
            }
            long j2 = c75063Yw.A02;
            if (j2 == 0) {
                return c75063Yw2;
            }
            do {
                if ((j2 & (1 << i3)) != 0) {
                    c75063Yw2 = c75063Yw2.A00(i3 + 64 + i);
                }
                i3++;
            } while (i3 < 64);
            return c75063Yw2;
        }
        return c75063Yw3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x009e, code lost:
    
        if (r6 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a6, code lost:
    
        if ((r6 & (1 << r8)) == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a8, code lost:
    
        r0 = r0.A01((r8 + 64) + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00af, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b1, code lost:
    
        if (r8 >= 64) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b4, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C75063Yw A03(X.C75063Yw r20) {
        /*
            r19 = this;
            r12 = r20
            X.3Yw r0 = X.C75063Yw.A04
            r11 = r19
            if (r12 != r0) goto L9
            return r19
        L9:
            if (r11 != r0) goto Lc
            return r20
        Lc:
            int r10 = r12.A00
            int r7 = r11.A00
            if (r10 != r7) goto L2e
            int[] r0 = r12.A03
            int[] r6 = r11.A03
            if (r0 != r6) goto L2e
            long r0 = r11.A02
            long r4 = r12.A02
            long r4 = r4 | r0
            long r2 = r11.A01
            long r0 = r12.A01
            long r0 = r0 | r2
            X.3Yw r12 = new X.3Yw
            r13 = r4
            r15 = r0
            r17 = r6
            r18 = r7
            r12.<init>(r13, r15, r17, r18)
        L2d:
            return r12
        L2e:
            int[] r0 = r11.A03
            r15 = 1
            r9 = 64
            r8 = 0
            r13 = 0
            if (r0 != 0) goto L6d
            long r1 = r11.A01
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L53
            r10 = 0
        L40:
            long r5 = r15 << r10
            long r3 = r1 & r5
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 == 0) goto L4e
            int r0 = r7 + r10
            X.3Yw r12 = r12.A01(r0)
        L4e:
            int r10 = r10 + 1
            if (r10 >= r9) goto L53
            goto L40
        L53:
            long r1 = r11.A02
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L2d
        L59:
            long r5 = r15 << r8
            long r3 = r1 & r5
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 == 0) goto L68
            int r0 = r8 + 64
            int r0 = r0 + r7
            X.3Yw r12 = r12.A01(r0)
        L68:
            int r8 = r8 + 1
            if (r8 >= r9) goto L2d
            goto L59
        L6d:
            int[] r4 = r12.A03
            if (r4 == 0) goto L7f
            int r3 = r4.length
            r0 = r11
            r2 = 0
        L74:
            if (r2 >= r3) goto L80
            r1 = r4[r2]
            X.3Yw r0 = r0.A01(r1)
            int r2 = r2 + 1
            goto L74
        L7f:
            r0 = r11
        L80:
            long r2 = r12.A01
            int r1 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r1 == 0) goto L9a
            r11 = 0
        L87:
            long r6 = r15 << r11
            long r4 = r2 & r6
            int r1 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r1 == 0) goto L95
            int r1 = r10 + r11
            X.3Yw r0 = r0.A01(r1)
        L95:
            int r11 = r11 + 1
            if (r11 >= r9) goto L9a
            goto L87
        L9a:
            long r6 = r12.A02
            int r1 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r1 == 0) goto Lb4
        La0:
            long r4 = r15 << r8
            long r2 = r6 & r4
            int r1 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r1 == 0) goto Laf
            int r1 = r8 + 64
            int r1 = r1 + r10
            X.3Yw r0 = r0.A01(r1)
        Laf:
            int r8 = r8 + 1
            if (r8 >= r9) goto Lb4
            goto La0
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75063Yw.A03(X.3Yw):X.3Yw");
    }

    public final boolean A04(int i) {
        int i2;
        long j;
        long j2;
        int i3 = i - this.A00;
        if (i3 >= 0) {
            if (i3 < 64) {
                j = 1 << i3;
                j2 = this.A01;
            } else if (i3 < 128) {
                j = 1 << (i3 - 64);
                j2 = this.A02;
            }
            if ((j & j2) != 0) {
                return true;
            }
            return false;
        }
        int[] iArr = this.A03;
        if (iArr != null) {
            int length = iArr.length - 1;
            int i4 = 0;
            while (true) {
                if (i4 <= length) {
                    i2 = (i4 + length) >>> 1;
                    int i5 = iArr[i2];
                    if (i > i5) {
                        i4 = i2 + 1;
                    } else {
                        if (i >= i5) {
                            break;
                        }
                        length = i2 - 1;
                    }
                } else {
                    i2 = -(i4 + 1);
                    break;
                }
            }
            if (i2 >= 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C75063Yw(long j, long j2, int[] iArr, int i) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
        this.A03 = iArr;
    }

    public final String toString() {
        String obj = super.toString();
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj2 != null && !(obj2 instanceof CharSequence)) {
                if (obj2 instanceof Character) {
                    sb.append(((Character) obj2).charValue());
                } else {
                    obj2 = String.valueOf(obj2);
                }
            }
            sb.append((CharSequence) obj2);
        }
        sb.append((CharSequence) "");
        return AnonymousClass001.A0h(obj, " [", sb.toString(), ']');
    }
}
