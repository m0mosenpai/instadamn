package X;

/* loaded from: classes11.dex */
public final class WRP implements XE1 {
    public boolean A00;
    public final C70348WSc A02 = new C70348WSc();
    public final WFa A01 = new WFa(2786);

    @Override // X.XE1
    public final /* synthetic */ XE1 CCR() {
        return this;
    }

    @Override // X.XE1
    public final void EMc(long j, long j2) {
        this.A00 = false;
        this.A02.EMb();
    }

    @Override // X.XE1
    public final void CNe(InterfaceC72026XFo interfaceC72026XFo) {
        this.A02.ANM(interfaceC72026XFo, new W4Q(Integer.MIN_VALUE, 0, 1));
        interfaceC72026XFo.ASd();
        C70345WRz.A00(interfaceC72026XFo, -9223372036854775807L);
    }

    @Override // X.XE1
    public final int E7l(XGj xGj, VZk vZk) {
        WFa wFa = this.A01;
        int read = xGj.read(wFa.A02, 0, 2786);
        if (read == -1) {
            return -1;
        }
        wFa.A0O(0);
        wFa.A0N(read);
        if (!this.A00) {
            this.A02.A03 = 0L;
            this.A00 = true;
        }
        this.A02.AJY(wFa);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        r12.EJn();
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003c, code lost:
    
        if ((r6 - r2) >= 8192) goto L30;
     */
    @Override // X.XE1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean EmK(X.XGj r12) {
        /*
            r11 = this;
            r5 = 10
            X.WFa r4 = new X.WFa
            r4.<init>(r5)
            r3 = 0
            r2 = 0
        L9:
            byte[] r0 = r4.A02
            r12.E3s(r0, r3, r5)
            r4.A0O(r3)
            int r1 = r4.A06()
            r0 = 4801587(0x494433, float:6.728456E-39)
            if (r1 == r0) goto L7e
            r12.EJn()
            r12.AB0(r2)
            r6 = r2
        L21:
            r5 = 0
        L22:
            byte[] r0 = r4.A02
            r9 = 6
            r12.E3s(r0, r3, r9)
            r4.A0O(r3)
            int r1 = r4.A08()
            r0 = 2935(0xb77, float:4.113E-42)
            if (r1 == r0) goto L42
            r12.EJn()
            int r6 = r6 + 1
            int r1 = r6 - r2
            r0 = 8192(0x2000, float:1.148E-41)
            if (r1 >= r0) goto L8e
            r12.AB0(r6)
            goto L21
        L42:
            r0 = 1
            int r5 = r5 + 1
            r10 = 4
            if (r5 < r10) goto L49
            return r0
        L49:
            byte[] r8 = r4.A02
            int r0 = r8.length
            if (r0 < r9) goto L8e
            r0 = 5
            r0 = r8[r0]
            r1 = r0 & 248(0xf8, float:3.48E-43)
            r7 = 3
            int r1 = r1 >> r7
            r0 = 10
            if (r1 <= r0) goto L72
            r0 = 2
            r0 = r8[r0]
            r0 = r0 & 7
            int r1 = r0 << 8
            r0 = r8[r7]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            int r0 = r0 + 1
            int r1 = r0 * 2
        L69:
            r0 = -1
            if (r1 == r0) goto L8e
            int r0 = r1 + (-6)
            r12.AB0(r0)
            goto L22
        L72:
            r0 = r8[r10]
            r1 = r0 & 192(0xc0, float:2.69E-43)
            int r1 = r1 >> r9
            r0 = r0 & 63
            int r1 = X.W1D.A00(r1, r0)
            goto L69
        L7e:
            r0 = 3
            r4.A0P(r0)
            int r1 = r4.A04()
            int r0 = r1 + 10
            int r2 = r2 + r0
            r12.AB0(r1)
            goto L9
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRP.EmK(X.XGj):boolean");
    }
}
