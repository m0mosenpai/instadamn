package X;

import java.util.Arrays;

/* renamed from: X.2iA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56212iA extends C56162i5 {
    public int A00;
    public C56182i7 A01;
    public C56242iD A02;
    public C56152i4[] A03;
    public C56152i4[] A04;

    public static final void A01(C56212iA c56212iA, C56152i4 c56152i4) {
        int i = 0;
        while (true) {
            int i2 = c56212iA.A00;
            if (i < i2) {
                C56152i4[] c56152i4Arr = c56212iA.A03;
                if (c56152i4Arr[i] != c56152i4) {
                    i++;
                } else {
                    while (true) {
                        int i3 = i2 - 1;
                        if (i < i3) {
                            int i4 = i + 1;
                            c56152i4Arr[i] = c56152i4Arr[i4];
                            i = i4;
                        } else {
                            c56212iA.A00 = i3;
                            c56152i4.A07 = false;
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // X.C56162i5, X.InterfaceC56172i6
    public final C56152i4 BdO(C56142i3 c56142i3, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            C56152i4[] c56152i4Arr = this.A03;
            C56152i4 c56152i4 = c56152i4Arr[i2];
            if (!zArr[c56152i4.A02]) {
                this.A02.A01 = c56152i4;
                if (i == -1) {
                    int i3 = 8;
                    do {
                        float f = c56152i4.A09[i3];
                        if (f > 0.0f) {
                            break;
                        }
                        if (f < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    } while (i3 >= 0);
                } else {
                    C56152i4 c56152i42 = c56152i4Arr[i];
                    int i4 = 8;
                    while (true) {
                        float f2 = c56152i42.A09[i4];
                        float f3 = c56152i4.A09[i4];
                        if (f3 == f2) {
                            i4--;
                            if (i4 >= 0) {
                            }
                        } else if (f3 >= f2) {
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.A03[i];
    }

    @Override // X.C56162i5, X.InterfaceC56172i6
    public final void clear() {
        this.A00 = 0;
        super.A00 = 0.0f;
    }

    private final void A02(C56152i4 c56152i4) {
        C56152i4[] c56152i4Arr;
        int i = this.A00 + 1;
        C56152i4[] c56152i4Arr2 = this.A03;
        int length = c56152i4Arr2.length;
        if (i > length) {
            C56152i4[] c56152i4Arr3 = (C56152i4[]) Arrays.copyOf(c56152i4Arr2, length * 2);
            this.A03 = c56152i4Arr3;
            this.A04 = (C56152i4[]) Arrays.copyOf(c56152i4Arr3, c56152i4Arr3.length * 2);
        }
        C56152i4[] c56152i4Arr4 = this.A03;
        int i2 = this.A00;
        c56152i4Arr4[i2] = c56152i4;
        int i3 = i2 + 1;
        this.A00 = i3;
        if (i3 > 1 && c56152i4Arr4[i3 - 1].A02 > c56152i4.A02) {
            int i4 = 0;
            do {
                c56152i4Arr = this.A04;
                c56152i4Arr[i4] = c56152i4Arr4[i4];
                i4++;
            } while (i4 < i3);
            Arrays.sort(c56152i4Arr, 0, i3, new C29608D2j(this));
            for (int i5 = 0; i5 < this.A00; i5++) {
                this.A03[i5] = this.A04[i5];
            }
        }
        c56152i4.A07 = true;
        c56152i4.A01(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        r11[r8] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if (r8 < 9) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r13 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        A01(r12.A02, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        r17.A00 += r18.A00 * r16;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        r1 = r5.A09[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r1 == 0.0f) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        r1 = r1 * r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (java.lang.Math.abs(r1) >= 1.0E-4f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        r9.A09[r8] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r8 < 9) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        A02(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        r9.A09[r8] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r9.A07 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        r11 = r9.A09;
        r1 = r11[r8] + (r5.A09[r8] * r16);
        r11[r8] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if (java.lang.Math.abs(r1) >= 1.0E-4f) goto L17;
     */
    @Override // X.C56162i5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(X.C56162i5 r18, X.C56142i3 r19, boolean r20) {
        /*
            r17 = this;
            r6 = r18
            X.2i4 r5 = r6.A02
            if (r5 == 0) goto L81
            X.2iC r4 = r6.A01
            r0 = r4
            X.2iB r0 = (X.C56222iB) r0
            int r3 = r0.A00
            r2 = 0
        Le:
            r7 = r17
            if (r2 >= r3) goto L7e
            X.2i4 r9 = r4.CEc(r2)
            float r16 = r4.CEd(r2)
            X.2iD r12 = r7.A02
            r12.A01 = r9
            boolean r0 = r9.A07
            r15 = 953267991(0x38d1b717, float:1.0E-4)
            r10 = 9
            r14 = 0
            r13 = 1
            r8 = 0
            if (r0 == 0) goto L5a
        L2a:
            float[] r11 = r9.A09
            r1 = r11[r8]
            float[] r0 = r5.A09
            r0 = r0[r8]
            float r0 = r0 * r16
            float r1 = r1 + r0
            r11[r8] = r1
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 >= 0) goto L58
            r11[r8] = r14
        L41:
            int r8 = r8 + 1
            if (r8 < r10) goto L2a
            if (r13 == 0) goto L4c
            X.2iA r0 = r12.A02
            A01(r0, r9)
        L4c:
            float r1 = r7.A00
            float r0 = r6.A00
            float r0 = r0 * r16
            float r1 = r1 + r0
            r7.A00 = r1
            int r2 = r2 + 1
            goto Le
        L58:
            r13 = 0
            goto L41
        L5a:
            float[] r0 = r5.A09
            r1 = r0[r8]
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 == 0) goto L79
            float r1 = r1 * r16
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 >= 0) goto L6d
            r1 = 0
        L6d:
            float[] r0 = r9.A09
            r0[r8] = r1
        L71:
            int r8 = r8 + 1
            if (r8 < r10) goto L5a
            r7.A02(r9)
            goto L4c
        L79:
            float[] r0 = r9.A09
            r0[r8] = r14
            goto L71
        L7e:
            A01(r7, r5)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56212iA.A07(X.2i5, X.2i3, boolean):void");
    }

    @Override // X.C56162i5, X.InterfaceC56172i6
    public final void A8S(C56152i4 c56152i4) {
        this.A02.A01 = c56152i4;
        float[] fArr = c56152i4.A09;
        Arrays.fill(fArr, 0.0f);
        fArr[c56152i4.A04] = 1.0f;
        A02(c56152i4);
    }

    @Override // X.C56162i5, X.InterfaceC56172i6
    public final boolean isEmpty() {
        if (this.A00 != 0) {
            return false;
        }
        return true;
    }

    @Override // X.C56162i5
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(" goal -> (");
        sb.append(super.A00);
        sb.append(") : ");
        String obj = sb.toString();
        for (int i = 0; i < this.A00; i++) {
            C56152i4 c56152i4 = this.A03[i];
            C56242iD c56242iD = this.A02;
            c56242iD.A01 = c56152i4;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(c56242iD);
            sb2.append(" ");
            obj = sb2.toString();
        }
        return obj;
    }
}
