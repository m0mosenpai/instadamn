package X;

import com.facebook.common.dextricks.Constants;

/* loaded from: classes11.dex */
public final class WRQ implements XE1 {
    public boolean A00;
    public final C70349WSd A02 = new C70349WSd();
    public final WFa A01 = new WFa(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);

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
        int read = xGj.read(wFa.A02, 0, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r12.EJn();
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if ((r5 - r2) >= 8192) goto L32;
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
            if (r1 == r0) goto L8e
            r12.EJn()
            r12.AB0(r2)
            r5 = r2
        L21:
            r1 = 0
        L22:
            byte[] r0 = r4.A02
            r6 = 7
            r12.E3s(r0, r3, r6)
            r4.A0O(r3)
            int r7 = r4.A08()
            r0 = 44096(0xac40, float:6.1792E-41)
            if (r7 == r0) goto L48
            r0 = 44097(0xac41, float:6.1793E-41)
            if (r7 == r0) goto L48
            r12.EJn()
            int r5 = r5 + 1
            int r1 = r5 - r2
            r0 = 8192(0x2000, float:1.148E-41)
            if (r1 >= r0) goto L9e
            r12.AB0(r5)
            goto L21
        L48:
            r0 = 1
            int r1 = r1 + 1
            r9 = 4
            if (r1 < r9) goto L4f
            return r0
        L4f:
            byte[] r8 = r4.A02
            int r0 = r8.length
            r10 = 7
            if (r0 < r6) goto L9e
            r0 = 2
            r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r6 = r0 << 8
            r0 = 3
            r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6 = r6 | r0
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r6 != r0) goto L8c
            r0 = r8[r9]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r6 = r0 << 16
            r0 = 5
            r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r6 = r6 | r0
            r0 = 6
            r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6 = r6 | r0
        L7b:
            r0 = 44097(0xac41, float:6.1793E-41)
            if (r7 != r0) goto L82
            int r10 = r10 + 2
        L82:
            int r6 = r6 + r10
            r0 = -1
            if (r6 == r0) goto L9e
            int r0 = r6 + (-7)
            r12.AB0(r0)
            goto L22
        L8c:
            r10 = 4
            goto L7b
        L8e:
            r0 = 3
            r4.A0P(r0)
            int r1 = r4.A04()
            int r0 = r1 + 10
            int r2 = r2 + r0
            r12.AB0(r1)
            goto L9
        L9e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRQ.EmK(X.XGj):boolean");
    }
}
