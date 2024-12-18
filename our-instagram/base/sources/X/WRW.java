package X;

/* loaded from: classes11.dex */
public final class WRW implements XE1 {
    public InterfaceC72026XFo A00;
    public AbstractC69657Vsy A01;
    public boolean A02;

    @Override // X.XE1
    public final /* synthetic */ XE1 CCR() {
        return this;
    }

    private boolean A00(XGj xGj) {
        AbstractC69657Vsy abstractC69657Vsy;
        C69712Vu7 c69712Vu7 = new C69712Vu7();
        if (c69712Vu7.A01(xGj, true) && (c69712Vu7.A03 & 2) == 2) {
            int min = Math.min(c69712Vu7.A00, 8);
            WFa wFa = new WFa(min);
            xGj.E3s(wFa.A02, 0, min);
            wFa.A0O(0);
            if (wFa.A00 - wFa.A01 >= 5 && wFa.A05() == 127 && wFa.A0C() == 1179402563) {
                abstractC69657Vsy = new AbstractC69657Vsy();
            } else {
                wFa.A0O(0);
                try {
                    if (W6N.A02(wFa, 1, true)) {
                        abstractC69657Vsy = new AbstractC69657Vsy();
                    }
                } catch (VCM unused) {
                }
                wFa.A0O(0);
                if (C66411UFx.A00(wFa, C66411UFx.A02)) {
                    abstractC69657Vsy = new AbstractC69657Vsy();
                }
            }
            this.A01 = abstractC69657Vsy;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:0x048c, code lost:
    
        r1.A00.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0493, code lost:
    
        r3 = r0.A09.A00;
        r0.A00 = r3.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x049e, code lost:
    
        if (r0.A0A != false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x04a0, code lost:
    
        r0.A07.AWZ(r3);
        r0.A0A = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x04a7, code lost:
    
        r9 = r0.A09.A01;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x04ac, code lost:
    
        if (r9 != null) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x04ae, code lost:
    
        r15 = r26.getLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x04b6, code lost:
    
        if (r15 != (-1)) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x04b8, code lost:
    
        r9 = new java.lang.Object();
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x04da, code lost:
    
        r5 = r5.A03;
        r9 = new X.WSM(r0, r0.A04, r15, r5.A01 + r5.A00, r5.A04, X.AbstractC167007dF.A1M(r5.A03 & 4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x04bd, code lost:
    
        r0.A08 = r9;
        r0.A01 = 2;
        r2 = r6.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x04c8, code lost:
    
        if (r2.length == 65025) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x04ca, code lost:
    
        r6.A0Q(java.util.Arrays.copyOf(r2, java.lang.Math.max(65025, r6.A00)), r6.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04d9, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x063f, code lost:
    
        if (r3 != 3) goto L273;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x05c6  */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.WSK, java.lang.Object] */
    @Override // X.XE1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E7l(X.XGj r26, X.VZk r27) {
        /*
            Method dump skipped, instructions count: 1749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRW.E7l(X.XGj, X.VZk):int");
    }

    @Override // X.XE1
    public final void EMc(long j, long j2) {
        AbstractC69657Vsy abstractC69657Vsy = this.A01;
        if (abstractC69657Vsy != null) {
            C69581Vrk c69581Vrk = abstractC69657Vsy.A0C;
            C69712Vu7 c69712Vu7 = c69581Vrk.A03;
            c69712Vu7.A03 = 0;
            c69712Vu7.A04 = 0L;
            c69712Vu7.A02 = 0;
            c69712Vu7.A01 = 0;
            c69712Vu7.A00 = 0;
            c69581Vrk.A02.A0M(0);
            c69581Vrk.A00 = -1;
            c69581Vrk.A01 = false;
            if (j == 0) {
                abstractC69657Vsy.A01(!abstractC69657Vsy.A0B);
            } else {
                if (abstractC69657Vsy.A01 == 0) {
                    return;
                }
                long j3 = (abstractC69657Vsy.A00 * j2) / 1000000;
                abstractC69657Vsy.A05 = j3;
                abstractC69657Vsy.A08.Enx(j3);
                abstractC69657Vsy.A01 = 2;
            }
        }
    }

    @Override // X.XE1
    public final void CNe(InterfaceC72026XFo interfaceC72026XFo) {
        this.A00 = interfaceC72026XFo;
    }

    @Override // X.XE1
    public final boolean EmK(XGj xGj) {
        try {
            return A00(xGj);
        } catch (VCM unused) {
            return false;
        }
    }
}
