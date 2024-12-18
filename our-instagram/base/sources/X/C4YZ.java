package X;

import android.util.Pair;

/* renamed from: X.4YZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4YZ implements C4Z1 {
    public final boolean A00 = C2C5.A02(C2C1.A0e);
    public final C4Z1[] A01;

    /* JADX WARN: Multi-variable type inference failed */
    private boolean A00(C4Z1 c4z1) {
        int i;
        if (c4z1 instanceof C4YV) {
            i = ((C4YV) c4z1).A0F;
        } else {
            if (this.A00 && (c4z1 instanceof C5T8)) {
                C4WU c4wu = ((C5T8) c4z1).A06;
                if (c4wu.A01 == 1) {
                    C4WV c4wv = (C4WV) c4wu.A02.get(0);
                    if (c4wv.A01 == 1) {
                        i = c4wv.A02;
                    }
                }
            }
            return false;
        }
        if (i == 3) {
            return true;
        }
        return false;
    }

    public final Pair A01() {
        long j = Long.MAX_VALUE;
        long j2 = Long.MIN_VALUE;
        for (C4Z1 c4z1 : this.A01) {
            if (!A00(c4z1)) {
                long BWx = c4z1.BWx();
                if (BWx != Long.MIN_VALUE) {
                    j = Math.min(j, BWx);
                    j2 = Math.max(j2, BWx);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            return new Pair(Long.MIN_VALUE, Long.MIN_VALUE);
        }
        return new Pair(Long.valueOf(j), Long.valueOf(j2));
    }

    @Override // X.C4Z1
    public final void AGb(long j) {
        for (C4Z1 c4z1 : this.A01) {
            c4z1.AGb(j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r4 > r18) goto L14;
     */
    @Override // X.C4Z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AJq(long r18, long r20) {
        /*
            r17 = this;
            r16 = 0
        L2:
            r1 = r17
            android.util.Pair r9 = r1.A01()
            java.lang.Object r0 = r9.first
            java.lang.Number r0 = (java.lang.Number) r0
            long r14 = r0.longValue()
            r12 = -9223372036854775808
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 == 0) goto L51
            X.4Z1[] r8 = r1.A01
            int r7 = r8.length
            r0 = 0
        L1a:
            if (r0 >= r7) goto L1f
            int r0 = r0 + 1
            goto L1a
        L1f:
            r6 = 0
            r11 = 0
        L21:
            if (r6 >= r7) goto L4d
            r10 = r8[r6]
            long r4 = r10.BWx()
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            r2 = r18
            if (r0 == 0) goto L34
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L35
        L34:
            r1 = 0
        L35:
            java.lang.Object r0 = r9.second
            java.lang.Number r0 = (java.lang.Number) r0
            r0.longValue()
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L45
            if (r1 != 0) goto L45
        L42:
            int r6 = r6 + 1
            goto L21
        L45:
            r0 = r20
            boolean r0 = r10.AJq(r2, r0)
            r11 = r11 | r0
            goto L42
        L4d:
            r16 = r16 | r11
            if (r11 != 0) goto L2
        L51:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4YZ.AJq(long, long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r3 > r18.A01) goto L14;
     */
    @Override // X.C4Z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AJr(X.C69080VhW r18) {
        /*
            r17 = this;
            r16 = 0
        L2:
            r1 = r17
            android.util.Pair r10 = r1.A01()
            java.lang.Object r0 = r10.first
            java.lang.Number r0 = (java.lang.Number) r0
            long r14 = r0.longValue()
            r12 = -9223372036854775808
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 == 0) goto L51
            X.4Z1[] r9 = r1.A01
            int r8 = r9.length
            r0 = 0
        L1a:
            if (r0 >= r8) goto L1f
            int r0 = r0 + 1
            goto L1a
        L1f:
            r7 = 0
            r6 = 0
        L21:
            if (r7 >= r8) goto L4d
            r5 = r9[r7]
            long r3 = r5.BWx()
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            r11 = r18
            if (r0 == 0) goto L36
            long r1 = r11.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L37
        L36:
            r1 = 0
        L37:
            java.lang.Object r0 = r10.second
            java.lang.Number r0 = (java.lang.Number) r0
            r0.longValue()
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 == 0) goto L47
            if (r1 != 0) goto L47
        L44:
            int r7 = r7 + 1
            goto L21
        L47:
            boolean r0 = r5.AJr(r11)
            r6 = r6 | r0
            goto L44
        L4d:
            r16 = r16 | r6
            if (r6 != 0) goto L2
        L51:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4YZ.AJr(X.VhW):boolean");
    }

    @Override // X.C4Z1
    public final long Aii(long j) {
        long j2 = Long.MAX_VALUE;
        for (C4Z1 c4z1 : this.A01) {
            if (!A00(c4z1)) {
                long Aii = c4z1.Aii(j);
                if (Aii == Long.MIN_VALUE) {
                    continue;
                } else {
                    if (Aii <= 0) {
                        return 0L;
                    }
                    j2 = Math.min(j2, Aii);
                }
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return 0L;
        }
        return j2;
    }

    @Override // X.C4Z1
    public final long Aik() {
        long j = Long.MAX_VALUE;
        for (C4Z1 c4z1 : this.A01) {
            if (!A00(c4z1)) {
                long Aik = c4z1.Aik();
                if (Aik != Long.MIN_VALUE) {
                    j = Math.min(j, Aik);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // X.C4Z1
    public final long BWx() {
        long j = Long.MAX_VALUE;
        for (C4Z1 c4z1 : this.A01) {
            if (!A00(c4z1)) {
                long BWx = c4z1.BWx();
                if (BWx != Long.MIN_VALUE) {
                    j = Math.min(j, BWx);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // X.C4Z1
    public final void ECm(long j) {
        for (C4Z1 c4z1 : this.A01) {
            c4z1.ECm(j);
        }
    }

    @Override // X.C4Z1
    public final void Eax(boolean z) {
        for (C4Z1 c4z1 : this.A01) {
            c4z1.Eax(z);
        }
    }

    @Override // X.C4Z1
    public final void FBK(byte b, boolean z) {
        for (C4Z1 c4z1 : this.A01) {
            c4z1.FBK(b, z);
        }
    }

    @Override // X.C4Z1
    public final boolean isLoading() {
        for (C4Z1 c4z1 : this.A01) {
            if (c4z1.isLoading()) {
                return true;
            }
        }
        return false;
    }

    public C4YZ(C4Z1[] c4z1Arr) {
        this.A01 = c4z1Arr;
    }
}
