package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5Tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117505Tk implements C5Tl {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public C0w5 A07;
    public C5UF A08;
    public C59P A0A;
    public C117555Tq A0B;
    public C117445Td A0C;
    public C117565Tr A0D;
    public C117465Tf A0E;
    public C117465Tf A0F;
    public C117465Tf A0G;
    public C117605Tv A0H;
    public C128375r6 A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public int[] A0R;
    public C117595Tu A0S;
    public final C5TZ A0T;
    public final C57I A0U;
    public final C57Q A0V;
    public final C117445Td A0Y;
    public final C117515Tm A0Z;
    public final C117575Ts A0b;
    public final java.util.Set A0d;
    public final C117535To A0e;
    public final C117515Tm A0a = new C117515Tm();
    public final C117525Tn A0W = new C117525Tn();
    public final List A0c = new ArrayList();
    public final C117525Tn A0f = new C117525Tn();
    public C59P A09 = C59O.A00;
    public final C117525Tn A0X = new C117525Tn();
    public int A06 = -1;

    private final void A0B(int i) {
        A03(this, i, 0, false);
        C117575Ts.A02(this.A0b);
    }

    public static final void A0H(C117505Tk c117505Tk) {
        c117505Tk.A08 = null;
        c117505Tk.A04 = 0;
        c117505Tk.A03 = 0;
        c117505Tk.A02 = 0;
        c117505Tk.A0M = false;
        C117575Ts c117575Ts = c117505Tk.A0b;
        c117575Ts.A06 = false;
        c117575Ts.A0A.A00 = 0;
        c117575Ts.A03 = 0;
        c117505Tk.A0Z.A00.clear();
        c117505Tk.A0R = null;
        c117505Tk.A07 = null;
    }

    public static final void A0I(C117505Tk c117505Tk) {
        A0L(c117505Tk, false);
    }

    @Override // X.C5Tl
    public final void AIS() {
        this.A0J = true;
        this.A0P = true;
        this.A0Y.A06 = new HashMap();
        this.A0C.A06 = new HashMap();
        C117565Tr c117565Tr = this.A0D;
        C117445Td c117445Td = c117565Tr.A0L;
        c117565Tr.A0G = c117445Td.A06;
        c117565Tr.A0C = c117445Td.A04;
    }

    @Override // X.C5Tl
    public final void ASV() {
        A0L(this, false);
        C5UU A0O = A0O();
        if (A0O != null) {
            int i = A0O.A01;
            if ((i & 1) != 0) {
                A0O.A01 = i | 2;
            }
        }
    }

    @Override // X.C5Tl
    public final void ASW() {
        A0L(this, true);
    }

    @Override // X.C5Tl
    public final void EnE() {
        A0K(this, null, null, -127, 0);
    }

    @Override // X.C5Tl
    public final void EnY(int i, Object obj) {
        A0K(this, obj, null, i, 0);
    }

    @Override // X.C5Tl
    public final void Enp(int i) {
        A0K(this, null, null, i, 0);
    }

    @Override // X.C5Tl
    public final void Ent() {
        A0K(this, null, null, 125, 2);
        this.A0M = true;
    }

    private final int A00(int i) {
        int[] iArr = this.A0B.A0A;
        int i2 = 0;
        for (int i3 = iArr[(i * 5) + 2] + 1; i3 < i; i3 += iArr[(i3 * 5) + 3]) {
            if ((iArr[(i3 * 5) + 1] & 536870912) == 0) {
                i2++;
            }
        }
        return i2;
    }

    private final int A01(int i) {
        int i2;
        int A03;
        if (i < 0) {
            C0w5 c0w5 = this.A07;
            if (c0w5 == null || (A03 = c0w5.A03(i)) < 0) {
                return 0;
            }
            return c0w5.A03[A03];
        }
        int[] iArr = this.A0R;
        if (iArr != null && (i2 = iArr[i]) >= 0) {
            return i2;
        }
        return this.A0B.A0A[(i * 5) + 1] & 67108863;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
    
        if (r1.equals(X.C5UI.A00) == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A02(int r8, int r9, int r10, int r11) {
        /*
            r7 = this;
            if (r8 == r10) goto L29
            X.5Tq r6 = r7.A0B
            int[] r1 = r6.A0A
            int r5 = r8 * 5
            int r4 = r5 + 1
            r0 = r1[r4]
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r3
            if (r0 == 0) goto L2a
            java.lang.Object r1 = X.C117555Tq.A00(r6, r1, r8)
            if (r1 == 0) goto L44
            boolean r0 = r1 instanceof java.lang.Enum
            if (r0 == 0) goto L3f
            java.lang.Enum r1 = (java.lang.Enum) r1
            int r2 = r1.ordinal()
        L21:
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            if (r2 != r0) goto L45
            r11 = 126665345(0x78cc281, float:2.1179178E-34)
        L29:
            return r11
        L2a:
            r2 = r1[r5]
            r0 = 207(0xcf, float:2.9E-43)
            if (r2 != r0) goto L21
            java.lang.Object r1 = r6.A05(r8)
            if (r1 == 0) goto L21
            java.lang.Object r0 = X.C5UI.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3f
            goto L21
        L3f:
            int r2 = r1.hashCode()
            goto L21
        L44:
            r2 = 0
        L45:
            X.5Tq r0 = r7.A0B
            int[] r1 = r0.A0A
            int r0 = r5 + 2
            r1 = r1[r0]
            if (r1 == r10) goto L57
            int r0 = r7.A00(r1)
            int r11 = r7.A02(r1, r0, r10, r11)
        L57:
            X.5Tq r0 = r7.A0B
            int[] r0 = r0.A0A
            r0 = r0[r4]
            r0 = r0 & r3
            if (r0 == 0) goto L61
            r9 = 0
        L61:
            r1 = 3
            int r0 = java.lang.Integer.rotateLeft(r11, r1)
            r0 = r0 ^ r2
            int r11 = java.lang.Integer.rotateLeft(r0, r1)
            r11 = r11 ^ r9
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117505Tk.A02(int, int, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e6, code lost:
    
        if (r9 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e8, code lost:
    
        r0 = r13 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ea, code lost:
    
        r1 = r1 + A03(r11, r3, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ef, code lost:
    
        if (r9 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f1, code lost:
    
        r0 = r11.A0b;
        X.C117575Ts.A02(r0);
        r0.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0104, code lost:
    
        if (r14 != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A03(X.C117505Tk r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117505Tk.A03(X.5Tk, int, int, boolean):int");
    }

    public static final C59P A04(C117505Tk c117505Tk) {
        Object A05;
        Object obj;
        C59P c59p = c117505Tk.A0A;
        if (c59p == null) {
            int i = c117505Tk.A0B.A05;
            if (c117505Tk.A0K && c117505Tk.A0Q) {
                C117565Tr c117565Tr = c117505Tk.A0D;
                int i2 = c117565Tr.A08;
                while (i2 > 0) {
                    int[] iArr = c117565Tr.A0I;
                    if (iArr[C117565Tr.A00(c117565Tr, i2) * 5] == 202) {
                        int A00 = C117565Tr.A00(c117565Tr, i2) * 5;
                        int i3 = iArr[A00 + 1];
                        if ((536870912 & i3) != 0) {
                            obj = c117565Tr.A0J[iArr[A00 + 4] + AbstractC117585Tt.A00(i3 >> 30)];
                        } else {
                            obj = null;
                        }
                        if (C14360o3.A0K(obj, C5UC.A00)) {
                            C117565Tr c117565Tr2 = c117505Tk.A0D;
                            int A002 = C117565Tr.A00(c117565Tr2, i2);
                            int[] iArr2 = c117565Tr2.A0I;
                            int i4 = iArr2[(A002 * 5) + 1];
                            if ((268435456 & i4) != 0) {
                                A05 = c117565Tr2.A0J[C117565Tr.A01(c117565Tr2, iArr2, A002) + AbstractC117585Tt.A00(i4 >> 29)];
                            } else {
                                A05 = C5UI.A00;
                            }
                            C14360o3.A0C(A05, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                            c59p = (C59P) A05;
                            c117505Tk.A0A = c59p;
                        }
                    }
                    c117565Tr = c117505Tk.A0D;
                    i2 = C117565Tr.A02(c117565Tr, c117565Tr.A0I, i2);
                }
            }
            C117555Tq c117555Tq = c117505Tk.A0B;
            if (c117555Tq.A08 > 0) {
                while (i > 0) {
                    int[] iArr3 = c117555Tq.A0A;
                    int i5 = i * 5;
                    if (iArr3[i5] == 202 && C14360o3.A0K(C117555Tq.A00(c117555Tq, iArr3, i), C5UC.A00)) {
                        C128375r6 c128375r6 = c117505Tk.A0I;
                        if (c128375r6 == null || (c59p = (C59P) c128375r6.A00.get(i)) == null) {
                            A05 = c117505Tk.A0B.A05(i);
                            C14360o3.A0C(A05, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                            c59p = (C59P) A05;
                        }
                        c117505Tk.A0A = c59p;
                    } else {
                        c117555Tq = c117505Tk.A0B;
                        i = c117555Tq.A0A[i5 + 2];
                    }
                }
            }
            c59p = c117505Tk.A09;
            c117505Tk.A0A = c59p;
        }
        return c59p;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5VS, X.5VR, java.util.Map] */
    public static final C59O A05(C117505Tk c117505Tk, C59P c59p, C59P c59p2) {
        C59O c59o = (C59O) c59p;
        ?? c5vs = new C5VS(c59o);
        c5vs.A00 = c59o;
        c5vs.putAll(c59p2);
        C59O A06 = c5vs.A06();
        A0K(c117505Tk, C5UC.A03, null, 204, 0);
        c117505Tk.A0P();
        c117505Tk.A0Q(A06);
        c117505Tk.A0P();
        c117505Tk.A0Q(c59p2);
        A0L(c117505Tk, false);
        return A06;
    }

    private final void A06() {
        C117445Td c117445Td = new C117445Td();
        if (this.A0P) {
            c117445Td.A06 = new HashMap();
        }
        if (this.A0U.A0D()) {
            c117445Td.A04 = new C18750w2(6);
        }
        this.A0C = c117445Td;
        C117565Tr A01 = c117445Td.A01();
        A01.A0P(true);
        this.A0D = A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if ((!r3.AT1(r2.Aul().A04, r5.A03(r2))) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0269 A[EDGE_INSN: B:68:0x0269->B:63:0x0269 BREAK  A[LOOP:0: B:9:0x0049->B:67:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A07() {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117505Tk.A07():void");
    }

    private final void A08() {
        A0B(this.A0B.A01);
        C117575Ts c117575Ts = this.A0b;
        C117575Ts.A01(c117575Ts);
        c117575Ts.A05.A00.A02(C5ZG.A00);
        int i = c117575Ts.A03;
        C117555Tq c117555Tq = c117575Ts.A09.A0B;
        c117575Ts.A03 = i + c117555Tq.A0A[(c117555Tq.A01 * 5) + 3];
    }

    private final void A09() {
        int i;
        C117555Tq c117555Tq = this.A0B;
        int i2 = c117555Tq.A05;
        if (i2 >= 0) {
            i = c117555Tq.A0A[(i2 * 5) + 1] & 67108863;
        } else {
            i = 0;
        }
        this.A03 = i;
        c117555Tq.A09();
    }

    private final void A0A() {
        if (!(!this.A0M)) {
            C5UC.A03("A call to createNode(), emitNode() or useNode() expected");
            throw C00O.createAndThrow();
        }
    }

    private final void A0C(int i, int i2) {
        Object obj;
        if (i > 0 && i != i2) {
            int i3 = i * 5;
            A0C(this.A0B.A0A[i3 + 2], i2);
            C117555Tq c117555Tq = this.A0B;
            if (AbstractC117585Tt.A03(c117555Tq.A0A, i)) {
                C117575Ts c117575Ts = this.A0b;
                int[] iArr = c117555Tq.A0A;
                if (AbstractC117585Tt.A03(iArr, i)) {
                    obj = c117555Tq.A0B[iArr[i3 + 4]];
                } else {
                    obj = null;
                }
                C117575Ts.A02(c117575Ts);
                c117575Ts.A04.A00.add(obj);
            }
        }
    }

    private final void A0F(int i, int i2, int i3) {
        C117555Tq c117555Tq = this.A0B;
        int i4 = i;
        int i5 = i2;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                int[] iArr = c117555Tq.A0A;
                int i6 = iArr[(i * 5) + 2];
                if (i6 == i2) {
                    i4 = i2;
                } else {
                    int i7 = iArr[(i2 * 5) + 2];
                    if (i7 != i) {
                        if (i6 == i7) {
                            i4 = i6;
                        } else {
                            int i8 = i;
                            int i9 = 0;
                            while (i8 > 0 && i8 != i3) {
                                i8 = iArr[(i8 * 5) + 2];
                                i9++;
                            }
                            int i10 = i2;
                            int i11 = 0;
                            while (i10 > 0 && i10 != i3) {
                                i10 = iArr[(i10 * 5) + 2];
                                i11++;
                            }
                            int i12 = i9 - i11;
                            for (int i13 = 0; i13 < i12; i13++) {
                                i4 = iArr[(i4 * 5) + 2];
                            }
                            int i14 = i11 - i9;
                            for (int i15 = 0; i15 < i14; i15++) {
                                i5 = iArr[(i5 * 5) + 2];
                            }
                            while (i4 != i5) {
                                i4 = iArr[(i4 * 5) + 2];
                                i5 = iArr[(i5 * 5) + 2];
                            }
                        }
                    }
                }
            } else {
                i4 = i3;
            }
        }
        while (i > 0 && i != i4) {
            if (AbstractC117585Tt.A03(c117555Tq.A0A, i)) {
                this.A0b.A04();
            }
            i = c117555Tq.A0A[(i * 5) + 2];
        }
        A0C(i2, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x026c A[Catch: all -> 0x02e6, TryCatch #0 {all -> 0x02e6, blocks: (B:36:0x00a2, B:38:0x00b7, B:41:0x00c8, B:42:0x00d3, B:44:0x00ea, B:47:0x00f5, B:48:0x00f0, B:49:0x00f7, B:51:0x00fb, B:54:0x0106, B:55:0x0101, B:56:0x0108, B:58:0x0114, B:60:0x011b, B:62:0x0122, B:63:0x0129, B:64:0x012c, B:67:0x0138, B:70:0x0145, B:71:0x0148, B:77:0x0260, B:79:0x026c, B:80:0x0276, B:82:0x027f, B:83:0x0290, B:85:0x0299, B:88:0x02a5, B:150:0x02e5, B:91:0x02b1, B:94:0x02c6, B:149:0x02df, B:151:0x0133, B:152:0x00c5, B:73:0x014e, B:75:0x0153, B:76:0x018e, B:99:0x0165, B:102:0x016b, B:104:0x0173, B:105:0x0193, B:107:0x0199, B:108:0x01a6, B:110:0x01ae, B:113:0x01bb, B:114:0x01c1, B:120:0x01ef, B:122:0x01f7, B:123:0x0202, B:124:0x0207, B:129:0x022b, B:131:0x0233, B:132:0x024f, B:133:0x0253, B:134:0x023b, B:135:0x0243, B:137:0x0247, B:138:0x024d, B:139:0x025b, B:140:0x021b, B:141:0x01d3, B:143:0x01d7, B:144:0x01de, B:145:0x01ea), top: B:35:0x00a2, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027f A[Catch: all -> 0x02e6, TryCatch #0 {all -> 0x02e6, blocks: (B:36:0x00a2, B:38:0x00b7, B:41:0x00c8, B:42:0x00d3, B:44:0x00ea, B:47:0x00f5, B:48:0x00f0, B:49:0x00f7, B:51:0x00fb, B:54:0x0106, B:55:0x0101, B:56:0x0108, B:58:0x0114, B:60:0x011b, B:62:0x0122, B:63:0x0129, B:64:0x012c, B:67:0x0138, B:70:0x0145, B:71:0x0148, B:77:0x0260, B:79:0x026c, B:80:0x0276, B:82:0x027f, B:83:0x0290, B:85:0x0299, B:88:0x02a5, B:150:0x02e5, B:91:0x02b1, B:94:0x02c6, B:149:0x02df, B:151:0x0133, B:152:0x00c5, B:73:0x014e, B:75:0x0153, B:76:0x018e, B:99:0x0165, B:102:0x016b, B:104:0x0173, B:105:0x0193, B:107:0x0199, B:108:0x01a6, B:110:0x01ae, B:113:0x01bb, B:114:0x01c1, B:120:0x01ef, B:122:0x01f7, B:123:0x0202, B:124:0x0207, B:129:0x022b, B:131:0x0233, B:132:0x024f, B:133:0x0253, B:134:0x023b, B:135:0x0243, B:137:0x0247, B:138:0x024d, B:139:0x025b, B:140:0x021b, B:141:0x01d3, B:143:0x01d7, B:144:0x01de, B:145:0x01ea), top: B:35:0x00a2, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0299 A[Catch: all -> 0x02e6, TryCatch #0 {all -> 0x02e6, blocks: (B:36:0x00a2, B:38:0x00b7, B:41:0x00c8, B:42:0x00d3, B:44:0x00ea, B:47:0x00f5, B:48:0x00f0, B:49:0x00f7, B:51:0x00fb, B:54:0x0106, B:55:0x0101, B:56:0x0108, B:58:0x0114, B:60:0x011b, B:62:0x0122, B:63:0x0129, B:64:0x012c, B:67:0x0138, B:70:0x0145, B:71:0x0148, B:77:0x0260, B:79:0x026c, B:80:0x0276, B:82:0x027f, B:83:0x0290, B:85:0x0299, B:88:0x02a5, B:150:0x02e5, B:91:0x02b1, B:94:0x02c6, B:149:0x02df, B:151:0x0133, B:152:0x00c5, B:73:0x014e, B:75:0x0153, B:76:0x018e, B:99:0x0165, B:102:0x016b, B:104:0x0173, B:105:0x0193, B:107:0x0199, B:108:0x01a6, B:110:0x01ae, B:113:0x01bb, B:114:0x01c1, B:120:0x01ef, B:122:0x01f7, B:123:0x0202, B:124:0x0207, B:129:0x022b, B:131:0x0233, B:132:0x024f, B:133:0x0253, B:134:0x023b, B:135:0x0243, B:137:0x0247, B:138:0x024d, B:139:0x025b, B:140:0x021b, B:141:0x01d3, B:143:0x01d7, B:144:0x01de, B:145:0x01ea), top: B:35:0x00a2, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0J(X.C117505Tk r17, X.C117455Te r18, X.InterfaceC16620sF r19) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117505Tk.A0J(X.5Tk, X.5Te, X.0sF):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0298, code lost:
    
        if (r12 == r0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        if (r26.A0O == false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v110, types: [X.5UK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.5UK, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0K(X.C117505Tk r26, java.lang.Object r27, java.lang.Object r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117505Tk.A0K(X.5Tk, java.lang.Object, java.lang.Object, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x03a6, code lost:
    
        if (r7 == r1) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04d2, code lost:
    
        if (r3 == r1) goto L226;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097 A[LOOP:0: B:21:0x0095->B:22:0x0097, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f3  */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0L(X.C117505Tk r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 1521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117505Tk.A0L(X.5Tk, boolean):void");
    }

    private final void A0M(C5UF c5uf, boolean z) {
        C117515Tm c117515Tm = this.A0a;
        c117515Tm.A00.add(this.A08);
        this.A08 = c5uf;
        C117525Tn c117525Tn = this.A0W;
        c117525Tn.A00(this.A03);
        c117525Tn.A00(this.A05);
        c117525Tn.A00(this.A04);
        if (z) {
            this.A04 = 0;
        }
        this.A03 = 0;
        this.A05 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r2 == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0N(boolean r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117505Tk.A0N(boolean, java.lang.Object):void");
    }

    public final C5UU A0O() {
        C117515Tm c117515Tm = this.A0Z;
        if (this.A00 == 0) {
            ArrayList arrayList = c117515Tm.A00;
            if (!arrayList.isEmpty()) {
                return (C5UU) arrayList.get(arrayList.size() - 1);
            }
            return null;
        }
        return null;
    }

    public final Object A0P() {
        if (this.A0K) {
            A0A();
        } else {
            Object A04 = this.A0B.A04();
            if (!this.A0O || (A04 instanceof C6NL)) {
                return A04;
            }
        }
        return C5UI.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, X.01h] */
    public final void A0Q(Object obj) {
        C5Ti c5Ti;
        int i;
        String obj2;
        StringBuilder sb;
        int i2;
        if (this.A0K) {
            C117565Tr c117565Tr = this.A0D;
            if (c117565Tr.A06 > 0) {
                if (c117565Tr.A02 != c117565Tr.A0B) {
                    C18750w2 c18750w2 = c117565Tr.A0D;
                    C18750w2 c18750w22 = c18750w2;
                    if (c18750w2 == null) {
                        c18750w22 = new C18750w2(6);
                    }
                    c117565Tr.A0D = c18750w22;
                    int i3 = c117565Tr.A08;
                    Object A03 = c18750w22.A03(i3);
                    Object obj3 = A03;
                    if (A03 == null) {
                        ?? obj4 = new Object();
                        obj4.A01 = new Object[16];
                        c18750w22.A08(i3, obj4);
                        obj3 = obj4;
                    }
                    ((C18620vp) obj3).A00(obj);
                    return;
                }
                C117565Tr.A09(c117565Tr, 1, c117565Tr.A08);
            }
            c117565Tr.A02++;
            c117565Tr.A0N(obj);
            return;
        }
        C117555Tq c117555Tq = this.A0B;
        if (c117555Tq.A07) {
            int i4 = c117555Tq.A02;
            int[] iArr = c117555Tq.A0A;
            int i5 = c117555Tq.A05;
            int i6 = i5 * 5;
            int A00 = (i4 - (iArr[i6 + 4] + AbstractC117585Tt.A00(iArr[i6 + 1] >> 28))) - 1;
            C117575Ts c117575Ts = this.A0b;
            if (c117575Ts.A09.A0B.A05 - c117575Ts.A03 < 0) {
                C117595Tu A02 = c117555Tq.A02(i5);
                C117485Th c117485Th = c117575Ts.A05.A00;
                c5Ti = C72073XMr.A00;
                c117485Th.A02(c5Ti);
                AbstractC117665Ub.A01(c117485Th, obj, 0);
                AbstractC117665Ub.A01(c117485Th, A02, 1);
                AbstractC117665Ub.A00(c117485Th, 0, A00);
                int i7 = c117485Th.A03;
                int i8 = c5Ti.A00;
                int i9 = 0;
                if (i8 != 0) {
                    i9 = (-1) >>> (32 - i8);
                }
                if (i7 == i9) {
                    int i10 = c117485Th.A04;
                    int i11 = c5Ti.A01;
                    int i12 = 0;
                    if (i11 != 0) {
                        i12 = (-1) >>> (32 - i11);
                    }
                    if (i10 == i12) {
                        return;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                i = 0;
                for (int i13 = 0; i13 < i8; i13++) {
                    if (((1 << i13) & c117485Th.A03) != 0) {
                        if (i > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(c5Ti.A00(i13));
                        i++;
                    }
                }
                obj2 = sb2.toString();
                C14360o3.A07(obj2);
                sb = new StringBuilder();
                int i14 = c5Ti.A01;
                i2 = 0;
                for (int i15 = 0; i15 < i14; i15++) {
                    if (((1 << i15) & c117485Th.A04) != 0) {
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(c5Ti.A01(i15));
                        i2++;
                    }
                }
            } else {
                C117575Ts.A03(c117575Ts, true);
                C117485Th c117485Th2 = c117575Ts.A05.A00;
                c5Ti = C5Z8.A00;
                c117485Th2.A02(c5Ti);
                AbstractC117665Ub.A01(c117485Th2, obj, 0);
                AbstractC117665Ub.A00(c117485Th2, 0, A00);
                int i16 = (-1) >>> 31;
                if (c117485Th2.A03 == i16 && c117485Th2.A04 == i16) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                i = 0;
                for (int i17 = 0; i17 < 1; i17 = 1) {
                    if (((1 << i17) & c117485Th2.A03) != 0) {
                        if (i > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(c5Ti.A00(i17));
                        i++;
                    }
                }
                obj2 = sb3.toString();
                C14360o3.A07(obj2);
                sb = new StringBuilder();
                i2 = 0;
                if (((1 << 0) & c117485Th2.A04) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(c5Ti.A01(0));
                    i2 = 1;
                }
            }
        } else {
            C117575Ts c117575Ts2 = this.A0b;
            C117595Tu A022 = c117555Tq.A02(c117555Tq.A05);
            C117485Th c117485Th3 = c117575Ts2.A05.A00;
            c5Ti = C72138XPl.A00;
            c117485Th3.A02(c5Ti);
            AbstractC117665Ub.A01(c117485Th3, A022, 0);
            AbstractC117665Ub.A01(c117485Th3, obj, 1);
            int i18 = c117485Th3.A03;
            int i19 = c5Ti.A00;
            int i20 = 0;
            if (i19 != 0) {
                i20 = (-1) >>> (32 - i19);
            }
            if (i18 == i20) {
                int i21 = c117485Th3.A04;
                int i22 = c5Ti.A01;
                int i23 = 0;
                if (i22 != 0) {
                    i23 = (-1) >>> (32 - i22);
                }
                if (i21 == i23) {
                    return;
                }
            }
            StringBuilder sb4 = new StringBuilder();
            i = 0;
            for (int i24 = 0; i24 < i19; i24++) {
                if (((1 << i24) & c117485Th3.A03) != 0) {
                    if (i > 0) {
                        sb4.append(", ");
                    }
                    sb4.append(c5Ti.A00(i24));
                    i++;
                }
            }
            obj2 = sb4.toString();
            C14360o3.A07(obj2);
            sb = new StringBuilder();
            int i25 = c5Ti.A01;
            i2 = 0;
            for (int i26 = 0; i26 < i25; i26++) {
                if (((1 << i26) & c117485Th3.A04) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(c5Ti.A01(i26));
                    i2++;
                }
            }
        }
        String obj5 = sb.toString();
        C14360o3.A07(obj5);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Error while pushing ");
        sb5.append(c5Ti);
        sb5.append(". Not all arguments were provided. Missing ");
        sb5.append(i);
        sb5.append(" int arguments (");
        sb5.append(obj2);
        sb5.append(") and ");
        sb5.append(i2);
        sb5.append(" object arguments (");
        sb5.append(obj5);
        sb5.append(").");
        SQP.A01(sb5.toString());
        throw C00O.createAndThrow();
    }

    @Override // X.C5Tl
    public final void ABx(Object obj, InterfaceC16620sF interfaceC16620sF) {
        C5XK c5xk;
        int i;
        String obj2;
        StringBuilder sb;
        int i2;
        if (this.A0K) {
            C117485Th c117485Th = this.A0H.A00;
            c5xk = C5XK.A00;
            c117485Th.A02(c5xk);
            AbstractC117665Ub.A01(c117485Th, obj, 0);
            C14360o3.A0C(interfaceC16620sF, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            C15500q5.A06(interfaceC16620sF, 2);
            AbstractC117665Ub.A01(c117485Th, interfaceC16620sF, 1);
            int i3 = c117485Th.A03;
            int i4 = c5xk.A00;
            int i5 = 0;
            if (i4 != 0) {
                i5 = (-1) >>> (32 - i4);
            }
            if (i3 == i5) {
                int i6 = c117485Th.A04;
                int i7 = c5xk.A01;
                int i8 = 0;
                if (i7 != 0) {
                    i8 = (-1) >>> (32 - i7);
                }
                if (i6 == i8) {
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            i = 0;
            for (int i9 = 0; i9 < i4; i9++) {
                if (((1 << i9) & c117485Th.A03) != 0) {
                    if (i > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(c5xk.A00(i9));
                    i++;
                }
            }
            obj2 = sb2.toString();
            C14360o3.A07(obj2);
            sb = new StringBuilder();
            int i10 = c5xk.A01;
            i2 = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                if (((1 << i11) & c117485Th.A04) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(c5xk.A01(i11));
                    i2++;
                }
            }
        } else {
            C117575Ts c117575Ts = this.A0b;
            C117575Ts.A00(c117575Ts);
            C117485Th c117485Th2 = c117575Ts.A05.A00;
            c5xk = C5XK.A00;
            c117485Th2.A02(c5xk);
            AbstractC117665Ub.A01(c117485Th2, obj, 0);
            C14360o3.A0C(interfaceC16620sF, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            C15500q5.A06(interfaceC16620sF, 2);
            AbstractC117665Ub.A01(c117485Th2, interfaceC16620sF, 1);
            int i12 = c117485Th2.A03;
            int i13 = c5xk.A00;
            int i14 = 0;
            if (i13 != 0) {
                i14 = (-1) >>> (32 - i13);
            }
            if (i12 == i14) {
                int i15 = c117485Th2.A04;
                int i16 = c5xk.A01;
                int i17 = 0;
                if (i16 != 0) {
                    i17 = (-1) >>> (32 - i16);
                }
                if (i15 == i17) {
                    return;
                }
            }
            StringBuilder sb3 = new StringBuilder();
            i = 0;
            for (int i18 = 0; i18 < i13; i18++) {
                if (((1 << i18) & c117485Th2.A03) != 0) {
                    if (i > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(c5xk.A00(i18));
                    i++;
                }
            }
            obj2 = sb3.toString();
            C14360o3.A07(obj2);
            sb = new StringBuilder();
            int i19 = c5xk.A01;
            i2 = 0;
            for (int i20 = 0; i20 < i19; i20++) {
                if (((1 << i20) & c117485Th2.A04) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(c5xk.A01(i20));
                    i2++;
                }
            }
        }
        String obj3 = sb.toString();
        C14360o3.A07(obj3);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Error while pushing ");
        sb4.append(c5xk);
        sb4.append(". Not all arguments were provided. Missing ");
        sb4.append(i);
        sb4.append(" int arguments (");
        sb4.append(obj2);
        sb4.append(") and ");
        sb4.append(i2);
        sb4.append(" object arguments (");
        sb4.append(obj3);
        sb4.append(").");
        SQP.A01(sb4.toString());
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (r4 != r3) goto L20;
     */
    @Override // X.C5Tl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AMd(X.InterfaceC16820sZ r19) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117505Tk.AMd(X.0sZ):void");
    }

    @Override // X.C5Tl
    public final void ANi(boolean z) {
        if (this.A03 == 0) {
            if (!this.A0K) {
                if (!z) {
                    A09();
                    return;
                }
                C117555Tq c117555Tq = this.A0B;
                int i = c117555Tq.A01;
                int i2 = c117555Tq.A00;
                C117575Ts c117575Ts = this.A0b;
                C117575Ts.A03(c117575Ts, false);
                c117575Ts.A05.A00.A02(C5Z6.A00);
                C5UC.A05(this.A0c, i, i2);
                this.A0B.A09();
                return;
            }
            return;
        }
        C5UC.A03("No nodes can be emitted before calling dactivateToEndGroup");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (r6 == r1) goto L30;
     */
    @Override // X.C5Tl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5UU ASZ() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117505Tk.ASZ():X.5UU");
    }

    @Override // X.C5Tl
    public final void ASa() {
        if (this.A0O && this.A0B.A05 == this.A06) {
            this.A06 = -1;
            this.A0O = false;
        }
        A0L(this, false);
    }

    @Override // X.C5Tl
    public final boolean Bxj() {
        C5UU A0O;
        if (!this.A0K && !this.A0O && !this.A0N && (A0O = A0O()) != null && (A0O.A01 & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C5Tl
    public final Object EEc() {
        if (this.A0K) {
            A0A();
        } else {
            Object A04 = this.A0B.A04();
            if (!this.A0O || (A04 instanceof C6NL)) {
                if (!(A04 instanceof C117675Uc)) {
                    return A04;
                }
                return ((C117675Uc) A04).A01;
            }
        }
        return C5UI.A00;
    }

    @Override // X.C5Tl
    public final void Em9() {
        if (this.A03 == 0) {
            C5UU A0O = A0O();
            if (A0O != null) {
                A0O.A01 |= 16;
            }
            if (this.A0c.isEmpty()) {
                A09();
                return;
            } else {
                A07();
                return;
            }
        }
        C5UC.A03("No nodes can be emitted before calling skipAndEndGroup");
        throw C00O.createAndThrow();
    }

    @Override // X.C5Tl
    public final void Eno(int i) {
        int i2;
        if (this.A08 != null) {
            A0K(this, null, null, i, 0);
            return;
        }
        A0A();
        this.A02 = this.A05 ^ Integer.rotateLeft(Integer.rotateLeft(this.A02, 3) ^ i, 3);
        this.A05++;
        C117555Tq c117555Tq = this.A0B;
        if (this.A0K) {
            c117555Tq.A04++;
            C117565Tr c117565Tr = this.A0D;
            Object obj = C5UI.A00;
            C117565Tr.A0E(c117565Tr, obj, obj, i, false);
            A0M(null, false);
            return;
        }
        int i3 = c117555Tq.A01;
        int i4 = c117555Tq.A00;
        if (i3 < i4) {
            i2 = c117555Tq.A0A[i3 * 5];
        } else {
            i2 = 0;
        }
        if (i2 != i || (i3 < i4 && (c117555Tq.A0A[(i3 * 5) + 1] & 536870912) != 0)) {
            if (c117555Tq.A04 <= 0 && i3 != i4) {
                int i5 = this.A04;
                A08();
                this.A0b.A05(i5, c117555Tq.A01());
                C5UC.A05(this.A0c, i3, c117555Tq.A01);
            }
            c117555Tq.A04++;
            this.A0K = true;
            this.A0A = null;
            C117565Tr c117565Tr2 = this.A0D;
            if (c117565Tr2.A0H) {
                c117565Tr2 = this.A0C.A01();
                this.A0D = c117565Tr2;
                c117565Tr2.A0M();
                this.A0Q = false;
                this.A0A = null;
            }
            c117565Tr2.A0J();
            int i6 = c117565Tr2.A00;
            Object obj2 = C5UI.A00;
            C117565Tr.A0E(c117565Tr2, obj2, obj2, i, false);
            this.A0S = c117565Tr2.A0I(i6);
            A0M(null, false);
            return;
        }
        c117555Tq.A0A();
        A0M(null, false);
    }

    @Override // X.C5Tl
    public final void Ens(int i, Object obj) {
        C117555Tq c117555Tq;
        int i2;
        if (!this.A0K && (i2 = (c117555Tq = this.A0B).A01) < c117555Tq.A00 && c117555Tq.A0A[i2 * 5] == 207 && !C14360o3.A0K(c117555Tq.A03(), obj) && this.A06 < 0) {
            this.A06 = this.A0B.A01;
            this.A0O = true;
        }
        A0K(this, null, obj, 207, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r2 == r1) goto L15;
     */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.5Uc, java.lang.Object] */
    @Override // X.C5Tl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FBy(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117505Tk.FBy(java.lang.Object):void");
    }

    @Override // X.C5Tl
    public final void FDO() {
        Object obj;
        String str;
        if (!this.A0M) {
            str = "A call to createNode(), emitNode() or useNode() expected was not expected";
        } else {
            this.A0M = false;
            if (!(!this.A0K)) {
                str = "useNode() called while inserting";
            } else {
                C117555Tq c117555Tq = this.A0B;
                int i = c117555Tq.A05;
                int[] iArr = c117555Tq.A0A;
                if (AbstractC117585Tt.A03(iArr, i)) {
                    obj = c117555Tq.A0B[iArr[(i * 5) + 4]];
                } else {
                    obj = null;
                }
                C117575Ts c117575Ts = this.A0b;
                C117575Ts.A02(c117575Ts);
                c117575Ts.A04.A00.add(obj);
                if (this.A0O && (obj instanceof C59C)) {
                    C117575Ts.A00(c117575Ts);
                    c117575Ts.A05.A00.A02(C5Z7.A00);
                    return;
                }
                return;
            }
        }
        C5UC.A03(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        if (r8.A0D() != false) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.5To] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C117505Tk(X.C5TZ r7, X.C57I r8, X.C57Q r9, X.C117445Td r10, X.C117465Tf r11, X.C117465Tf r12, java.util.Set r13) {
        /*
            r6 = this;
            r6.<init>()
            r6.A0T = r7
            r6.A0U = r8
            r6.A0Y = r10
            r6.A0d = r13
            r6.A0E = r11
            r6.A0G = r12
            r6.A0V = r9
            X.5Tm r0 = new X.5Tm
            r0.<init>()
            r6.A0a = r0
            X.5Tn r0 = new X.5Tn
            r0.<init>()
            r6.A0W = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.A0c = r0
            X.5Tn r0 = new X.5Tn
            r0.<init>()
            r6.A0f = r0
            X.59O r0 = X.C59O.A00
            r6.A09 = r0
            X.5Tn r0 = new X.5Tn
            r0.<init>()
            r6.A0X = r0
            r0 = -1
            r6.A06 = r0
            boolean r0 = r8 instanceof androidx.compose.runtime.Recomposer
            if (r0 == 0) goto L9c
            r5 = 0
        L40:
            r3 = 0
            r4 = 1
            if (r5 != 0) goto L4b
            boolean r1 = r8.A0D()
            r0 = 0
            if (r1 == 0) goto L4c
        L4b:
            r0 = 1
        L4c:
            r6.A0P = r0
            X.5To r0 = new X.5To
            r0.<init>()
            r6.A0e = r0
            X.5Tm r0 = new X.5Tm
            r0.<init>()
            r6.A0Z = r0
            X.5Tq r0 = r10.A00()
            r0.A07()
            r6.A0B = r0
            X.5Td r2 = new X.5Td
            r2.<init>()
            if (r5 == 0) goto L73
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.A06 = r0
        L73:
            boolean r0 = r8.A0D()
            if (r0 == 0) goto L81
            r1 = 6
            X.0w2 r0 = new X.0w2
            r0.<init>(r1)
            r2.A04 = r0
        L81:
            r6.A0C = r2
            X.5Tr r0 = r2.A01()
            r0.A0P(r4)
            r6.A0D = r0
            X.5Tf r1 = r6.A0E
            X.5Ts r0 = new X.5Ts
            r0.<init>(r6, r1)
            r6.A0b = r0
            X.5Td r0 = r6.A0C
            X.5Tq r1 = r0.A00()
            goto La2
        L9c:
            r0 = r8
            X.5Tw r0 = (X.C117615Tw) r0
            boolean r5 = r0.A05
            goto L40
        La2:
            X.5Tu r0 = r1.A02(r3)     // Catch: java.lang.Throwable -> Lb3
            r1.A07()
            r6.A0S = r0
            X.5Tv r0 = new X.5Tv
            r0.<init>()
            r6.A0H = r0
            return
        Lb3:
            r0 = move-exception
            r1.A07()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117505Tk.<init>(X.5TZ, X.57I, X.57Q, X.5Td, X.5Tf, X.5Tf, java.util.Set):void");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.01F, X.0w5] */
    private final void A0D(int i, int i2) {
        if (A01(i) != i2) {
            if (i < 0) {
                C0w5 c0w5 = this.A07;
                C0w5 c0w52 = c0w5;
                if (c0w5 == null) {
                    ?? c01f = new C01F();
                    long[] jArr = AbstractC004701m.A00;
                    C0w5.A02(c01f, 6);
                    this.A07 = c01f;
                    c0w52 = c01f;
                }
                c0w52.A05(i, i2);
                return;
            }
            int[] iArr = this.A0R;
            if (iArr == null) {
                int i3 = this.A0B.A08;
                iArr = new int[i3];
                Arrays.fill(iArr, 0, i3, -1);
                this.A0R = iArr;
            }
            iArr[i] = i2;
        }
    }

    private final void A0E(int i, int i2) {
        int A01 = A01(i);
        if (A01 != i2) {
            int i3 = i2 - A01;
            ArrayList arrayList = this.A0a.A00;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int A012 = A01(i) + i3;
                A0D(i, A012);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        C5UF c5uf = (C5UF) arrayList.get(i4);
                        if (c5uf != null && c5uf.A00(i, A012)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                C117555Tq c117555Tq = this.A0B;
                if (i < 0) {
                    i = c117555Tq.A05;
                } else {
                    int[] iArr = c117555Tq.A0A;
                    if (!AbstractC117585Tt.A03(iArr, i)) {
                        i = iArr[(i * 5) + 2];
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static final void A0G(C117505Tk c117505Tk) {
        A0H(c117505Tk);
        c117505Tk.A0a.A00.clear();
        c117505Tk.A0W.A00 = 0;
        c117505Tk.A0f.A00 = 0;
        c117505Tk.A0X.A00 = 0;
        c117505Tk.A0I = null;
        C117605Tv c117605Tv = c117505Tk.A0H;
        c117605Tv.A01.A00();
        c117605Tv.A00.A00();
        c117505Tk.A02 = 0;
        c117505Tk.A00 = 0;
        c117505Tk.A0M = false;
        c117505Tk.A0K = false;
        c117505Tk.A0O = false;
        c117505Tk.A0L = false;
        c117505Tk.A06 = -1;
        C117555Tq c117555Tq = c117505Tk.A0B;
        if (!c117555Tq.A06) {
            c117555Tq.A07();
        }
        if (!c117505Tk.A0D.A0H) {
            c117505Tk.A06();
        }
    }

    @Override // X.C5Tl
    public final boolean AH0(double d) {
        Object A0P = A0P();
        if ((A0P instanceof Double) && d == ((Number) A0P).doubleValue()) {
            return false;
        }
        A0Q(Double.valueOf(d));
        return true;
    }

    @Override // X.C5Tl
    public final boolean AH1(float f) {
        Object A0P = A0P();
        if ((A0P instanceof Float) && f == ((Number) A0P).floatValue()) {
            return false;
        }
        A0Q(Float.valueOf(f));
        return true;
    }

    @Override // X.C5Tl
    public final boolean AH2(int i) {
        Object A0P = A0P();
        if ((A0P instanceof Integer) && i == ((Number) A0P).intValue()) {
            return false;
        }
        A0Q(Integer.valueOf(i));
        return true;
    }

    @Override // X.C5Tl
    public final boolean AH3(long j) {
        Object A0P = A0P();
        if ((A0P instanceof Long) && j == ((Number) A0P).longValue()) {
            return false;
        }
        A0Q(Long.valueOf(j));
        return true;
    }

    @Override // X.C5Tl
    public final boolean AH4(Object obj) {
        if (!C14360o3.A0K(A0P(), obj)) {
            A0Q(obj);
            return true;
        }
        return false;
    }

    @Override // X.C5Tl
    public final boolean AH5(boolean z) {
        Object A0P = A0P();
        if ((A0P instanceof Boolean) && z == ((Boolean) A0P).booleanValue()) {
            return false;
        }
        A0Q(Boolean.valueOf(z));
        return true;
    }

    @Override // X.C5Tl
    public final boolean AH6(Object obj) {
        if (A0P() != obj) {
            A0Q(obj);
            return true;
        }
        return false;
    }

    @Override // X.C5Tl
    public final Object AJX(C5UQ c5uq) {
        return C5UT.A01(c5uq, A04(this));
    }

    @Override // X.C5Tl
    public final boolean AwS() {
        C5UU A0O;
        if (Bxj() && !this.A0N && ((A0O = A0O()) == null || (A0O.A01 & 4) == 0)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.5UU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.5UU, java.lang.Object] */
    @Override // X.C5Tl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C117505Tk Enr(int r5) {
        /*
            r4 = this;
            r4.Eno(r5)
            boolean r0 = r4.A0K
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L2c
            X.57Q r0 = r4.A0V
            X.C14360o3.A0C(r0, r2)
            X.5Ta r0 = (X.C117415Ta) r0
            X.5UU r3 = new X.5UU
            r3.<init>()
            r3.A05 = r0
            X.5Tm r0 = r4.A0Z
            java.util.ArrayList r0 = r0.A00
            r0.add(r3)
            r4.A0Q(r3)
        L21:
            int r0 = r4.A01
            r3.A00 = r0
            int r0 = r3.A01
            r0 = r0 & (-17)
            r3.A01 = r0
            return r4
        L2c:
            java.util.List r1 = r4.A0c
            X.5Tq r0 = r4.A0B
            int r0 = r0.A05
            int r0 = X.C5UC.A00(r1, r0)
            if (r0 < 0) goto L83
            java.lang.Object r1 = r1.remove(r0)
        L3c:
            X.5Tq r0 = r4.A0B
            java.lang.Object r3 = r0.A04()
            java.lang.Object r0 = X.C5UI.A00
            boolean r0 = X.C14360o3.A0K(r3, r0)
            if (r0 == 0) goto L7b
            X.57Q r0 = r4.A0V
            X.C14360o3.A0C(r0, r2)
            X.5Ta r0 = (X.C117415Ta) r0
            X.5UU r3 = new X.5UU
            r3.<init>()
            r3.A05 = r0
            r4.A0Q(r3)
        L5b:
            r2 = 0
            if (r1 != 0) goto L68
            int r1 = r3.A01
            r0 = r1 & 64
            if (r0 == 0) goto L69
            r0 = r1 & (-65)
            r3.A01 = r0
        L68:
            r2 = 1
        L69:
            int r1 = r3.A01
            r0 = r1 & (-9)
            if (r2 == 0) goto L71
            r0 = r1 | 8
        L71:
            r3.A01 = r0
            X.5Tm r0 = r4.A0Z
            java.util.ArrayList r0 = r0.A00
            r0.add(r3)
            goto L21
        L7b:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            X.C14360o3.A0C(r3, r0)
            X.5UU r3 = (X.C5UU) r3
            goto L5b
        L83:
            r1 = 0
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117505Tk.Enr(int):X.5Tk");
    }
}
