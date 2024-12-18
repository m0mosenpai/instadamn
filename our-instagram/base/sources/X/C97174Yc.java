package X;

/* renamed from: X.4Yc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97174Yc implements C4Z0, InterfaceC96664Wb {
    public long A00;
    public long A01;
    public long A02;
    public C116475Pc A03;
    public InterfaceC96664Wb A04;
    public C97184Yd[] A05 = new C97184Yd[0];
    public final C4Z0 A06;

    @Override // X.C4Z0
    public final long E53(long j) {
        return 0L;
    }

    @Override // X.C4Z1
    public final void AGb(long j) {
        this.A06.AGb(j);
    }

    @Override // X.C4Z0, X.C4Z1
    public final boolean AJq(long j, long j2) {
        return this.A06.AJq(j, j2);
    }

    @Override // X.C4Z0, X.C4Z1
    public final /* synthetic */ boolean AJr(C69080VhW c69080VhW) {
        return this.A06.AJq(c69080VhW.A01, -9223372036854775807L);
    }

    @Override // X.C4Z0
    public final void APa(long j, boolean z) {
        this.A06.APa(j, z);
    }

    @Override // X.C4Z0
    public final long AZz(C4TT c4tt, long j) {
        long j2;
        C4TT c4tt2 = c4tt;
        long j3 = this.A02;
        if (j != j3) {
            long j4 = c4tt2.A01;
            long max = Math.max(0L, Math.min(j4, j - j3));
            long j5 = c4tt2.A00;
            long j6 = this.A00;
            if (j6 == Long.MIN_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j6 - j;
            }
            long max2 = Math.max(0L, Math.min(j5, j2));
            if (max != j4 || max2 != j5) {
                c4tt2 = new C4TT(max, max2);
            }
            return this.A06.AZz(c4tt2, j);
        }
        return j3;
    }

    @Override // X.C4Z1
    public final long Aii(long j) {
        return this.A06.Aii(j);
    }

    @Override // X.C4Z0, X.C4Z1
    public final long Aik() {
        long Aik = this.A06.Aik();
        if (Aik != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || Aik < j) {
                return Aik;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // X.C4Z0, X.C4Z1
    public final long BWx() {
        long BWx = this.A06.BWx();
        if (BWx != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || BWx < j) {
                return BWx;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // X.C4Z0
    public final C4WU CAF() {
        return this.A06.CAF();
    }

    @Override // X.C4Z0
    public final void Coz() {
        C116475Pc c116475Pc = this.A03;
        if (c116475Pc == null) {
            this.A06.Coz();
            return;
        }
        throw c116475Pc;
    }

    @Override // X.InterfaceC96674Wc
    public final /* bridge */ /* synthetic */ void D7l(C4Z1 c4z1) {
        InterfaceC96664Wb interfaceC96664Wb = this.A04;
        interfaceC96664Wb.getClass();
        interfaceC96664Wb.D7l(this);
    }

    @Override // X.InterfaceC96664Wb
    public final void DaW(C4Z0 c4z0) {
        if (this.A03 == null) {
            InterfaceC96664Wb interfaceC96664Wb = this.A04;
            interfaceC96664Wb.getClass();
            interfaceC96664Wb.DaW(this);
        }
    }

    @Override // X.C4Z0
    public final void E5S(InterfaceC96664Wb interfaceC96664Wb, long j) {
        this.A04 = interfaceC96664Wb;
        this.A06.E5S(this, j);
    }

    @Override // X.C4Z0
    public final long E7z() {
        long j = this.A01;
        if (j != -9223372036854775807L) {
            this.A01 = -9223372036854775807L;
            long E7z = E7z();
            if (E7z != -9223372036854775807L) {
                return E7z;
            }
            return j;
        }
        long E7z2 = this.A06.E7z();
        if (E7z2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        boolean z2 = false;
        if (E7z2 >= this.A02) {
            z2 = true;
        }
        C4B8.A04(z2);
        long j2 = this.A00;
        if (j2 != Long.MIN_VALUE && E7z2 > j2) {
            z = false;
        }
        C4B8.A04(z);
        return E7z2;
    }

    @Override // X.C4Z0, X.C4Z1
    public final void ECm(long j) {
        this.A06.ECm(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r10 > r0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // X.C4Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long EMx(X.InterfaceC97394Yz[] r19, X.C4WE[] r20, boolean[] r21, boolean[] r22, long r23) {
        /*
            r18 = this;
            r6 = r19
            int r4 = r6.length
            X.4Yd[] r7 = new X.C97184Yd[r4]
            r5 = r18
            r5.A05 = r7
            X.4Yz[] r12 = new X.InterfaceC97394Yz[r4]
            r3 = 0
            r1 = 0
        Ld:
            r2 = 0
            if (r1 >= r4) goto L1f
            r0 = r19[r1]
            X.4Yd r0 = (X.C97184Yd) r0
            r7[r1] = r0
            if (r0 == 0) goto L1a
            X.4Yz r2 = r0.A01
        L1a:
            r12[r1] = r2
            int r1 = r1 + 1
            goto Ld
        L1f:
            X.4Z0 r11 = r5.A06
            r13 = r20
            r14 = r21
            r15 = r22
            r16 = r23
            long r10 = r11.EMx(r12, r13, r14, r15, r16)
            long r0 = r5.A01
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 == 0) goto La1
            long r0 = r5.A02
            int r7 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r7 != 0) goto La1
            r8 = 0
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 == 0) goto La1
            int r8 = r13.length
            r7 = 0
        L46:
            if (r7 >= r8) goto La1
            r0 = r20[r7]
            if (r0 == 0) goto L9e
            X.4B6 r0 = r0.Bsc()
            java.lang.String r1 = r0.A0W
            java.lang.String r0 = r0.A0R
            boolean r0 = X.C2IH.A07(r1, r0)
            if (r0 != 0) goto L9e
            r0 = r10
        L5b:
            r5.A01 = r0
            int r0 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r0 == 0) goto L73
            long r0 = r5.A02
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 < 0) goto L9c
            long r0 = r5.A00
            r8 = -9223372036854775808
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 == 0) goto L73
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 > 0) goto L9c
        L73:
            r0 = 1
        L74:
            X.C4B8.A04(r0)
        L77:
            if (r3 >= r4) goto La7
            r0 = r12[r3]
            X.4Yd[] r7 = r5.A05
            if (r0 != 0) goto L88
            r7[r3] = r2
        L81:
            r0 = r7[r3]
            r19[r3] = r0
            int r3 = r3 + 1
            goto L77
        L88:
            r0 = r7[r3]
            if (r0 == 0) goto L92
            X.4Yz r1 = r0.A01
            r0 = r12[r3]
            if (r1 == r0) goto L81
        L92:
            r1 = r12[r3]
            X.4Yd r0 = new X.4Yd
            r0.<init>(r5, r1)
            r7[r3] = r0
            goto L81
        L9c:
            r0 = 0
            goto L74
        L9e:
            int r7 = r7 + 1
            goto L46
        La1:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L5b
        La7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97174Yc.EMx(X.4Yz[], X.4WE[], boolean[], boolean[], long):long");
    }

    @Override // X.C4Z1
    public final void Eax(boolean z) {
        this.A06.Eax(z);
    }

    @Override // X.C4Z1
    public final void FBK(byte b, boolean z) {
        this.A06.FBK(b, z);
    }

    @Override // X.C4Z0, X.C4Z1
    public final boolean isLoading() {
        return this.A06.isLoading();
    }

    public C97174Yc(C4Z0 c4z0, long j, long j2) {
        this.A06 = c4z0;
        this.A01 = j;
        this.A02 = j;
        this.A00 = j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r6 > r3) goto L17;
     */
    @Override // X.C4Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long EMn(long r9, boolean r11) {
        /*
            r8 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.A01 = r0
            X.4Yd[] r3 = r8.A05
            int r2 = r3.length
            r5 = 0
            r1 = 0
        Lc:
            if (r1 >= r2) goto L17
            r0 = r3[r1]
            if (r0 == 0) goto L14
            r0.A00 = r5
        L14:
            int r1 = r1 + 1
            goto Lc
        L17:
            X.4Z0 r0 = r8.A06
            long r6 = r0.EMn(r9, r11)
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 == 0) goto L33
            long r1 = r8.A02
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L34
            long r3 = r8.A00
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L33
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto L34
        L33:
            r5 = 1
        L34:
            X.C4B8.A04(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97174Yc.EMn(long, boolean):long");
    }
}
