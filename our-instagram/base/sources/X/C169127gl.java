package X;

import java.util.List;

/* renamed from: X.7gl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169127gl implements InterfaceC169517hR, InterfaceC169507hQ {
    public InterfaceC169507hQ A00;
    public Object A01;
    public Object A02;
    public String A03;
    public boolean A04;
    public final C1GL A05;
    public final InterfaceC169117gk A06;
    public final InterfaceC169517hR A07;
    public final boolean A08;
    public final Object A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
    
        if (r7.CXh() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C169127gl(X.C1GL r5, X.InterfaceC169117gk r6, X.InterfaceC169517hR r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            r3 = 1
            r4.<init>()
            r4.A05 = r5
            r4.A07 = r7
            r4.A06 = r6
            r4.A08 = r8
            java.lang.String r0 = r7.BjQ()
            r4.A03 = r0
            java.lang.Object r0 = r6.ARP()
            r4.A02 = r0
            java.lang.Object r0 = r7.B3l()
            r4.A09 = r0
            java.lang.String r0 = r7.Bk6()
            r4.A0A = r0
            java.lang.String r0 = r7.Bo9()
            r4.A0B = r0
            java.util.List r0 = r7.Bri()
            r4.A0C = r0
            r2 = 1
            boolean r1 = r7.CUG()
            r0 = 0
            if (r1 != r3) goto L39
            r0 = 1
        L39:
            r4.A0E = r0
            boolean r0 = r4.isLoading()
            if (r0 != 0) goto L48
            boolean r1 = r7.CXh()
            r0 = 1
            if (r1 != 0) goto L49
        L48:
            r0 = 0
        L49:
            r4.A0F = r0
            boolean r0 = r7.BC6()
            if (r0 == r3) goto L52
            r2 = 0
        L52:
            r4.A0D = r2
            if (r9 == 0) goto L5b
            java.lang.String r0 = ""
            r4.Eby(r0)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169127gl.<init>(X.1GL, X.7gk, X.7hR, boolean, boolean):void");
    }

    @Override // X.InterfaceC169517hR
    public final void ERL(List list) {
    }

    @Override // X.InterfaceC169517hR
    public final String An8() {
        return null;
    }

    @Override // X.InterfaceC169517hR
    public final Object B3l() {
        return this.A09;
    }

    @Override // X.InterfaceC169517hR
    public final boolean BC6() {
        return this.A0D;
    }

    @Override // X.InterfaceC169517hR
    public final String BjQ() {
        return this.A03;
    }

    @Override // X.InterfaceC169517hR
    public final String Bk6() {
        return this.A0A;
    }

    @Override // X.InterfaceC169517hR
    public final String Bo9() {
        return this.A0B;
    }

    @Override // X.InterfaceC169517hR
    public final Object Bov() {
        return this.A02;
    }

    @Override // X.InterfaceC169517hR
    public final List Bri() {
        return this.A0C;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CUG() {
        return this.A0E;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CXh() {
        return this.A0F;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CZV() {
        return false;
    }

    @Override // X.InterfaceC169517hR
    public final void DEw() {
        this.A07.DEw();
    }

    @Override // X.InterfaceC169507hQ
    public final void DcI(InterfaceC169517hR interfaceC169517hR) {
        InterfaceC169517hR interfaceC169517hR2 = this.A07;
        if (C14360o3.A0K(interfaceC169517hR2.BjQ(), this.A03)) {
            this.A02 = this.A06.AIV(this.A01, interfaceC169517hR2.Bov());
            InterfaceC169507hQ interfaceC169507hQ = this.A00;
            if (interfaceC169507hQ != null) {
                interfaceC169507hQ.DcI(this);
            }
        }
    }

    @Override // X.InterfaceC169517hR
    public final void EKu() {
        this.A07.EKu();
    }

    @Override // X.InterfaceC169517hR
    public final void EYJ(InterfaceC169507hQ interfaceC169507hQ) {
        if (this.A00 != interfaceC169507hQ) {
            this.A00 = interfaceC169507hQ;
            if (interfaceC169507hQ != null) {
                interfaceC169507hQ.DcI(this);
            }
        }
    }

    @Override // X.InterfaceC169517hR
    public final void Eby(final String str) {
        this.A03 = str;
        this.A01 = null;
        if ((str == null || str.length() == 0) && !this.A08) {
            this.A07.Eby(str);
        } else {
            this.A04 = true;
            this.A05.schedule(new C11R() { // from class: X.7gm
                public Object A00;
                public Object A01;

                @Override // X.C11R
                public final int getRunnableId() {
                    return 264;
                }

                @Override // X.C11R
                public final void onCancel() {
                }

                @Override // X.C11R
                public final void onStart() {
                }

                {
                    this.A01 = C169127gl.this.A06.ARP();
                }

                @Override // X.C11R
                public final String getName() {
                    return "queryBootstrap";
                }

                @Override // X.C11R
                public final void onFinish() {
                    C169127gl c169127gl = C169127gl.this;
                    String str2 = c169127gl.A03;
                    String str3 = str;
                    if (C14360o3.A0K(str2, str3)) {
                        c169127gl.A04 = false;
                        c169127gl.A01 = this.A00;
                        c169127gl.A02 = this.A01;
                        InterfaceC169517hR interfaceC169517hR = c169127gl.A07;
                        interfaceC169517hR.EYJ(null);
                        interfaceC169517hR.Eby(str3);
                        interfaceC169517hR.EYJ(c169127gl);
                    }
                }

                @Override // X.C11R
                public final void run() {
                    C169127gl c169127gl = C169127gl.this;
                    InterfaceC169117gk interfaceC169117gk = c169127gl.A06;
                    String str2 = str;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Object E7Q = interfaceC169117gk.E7Q(str2);
                    this.A00 = E7Q;
                    this.A01 = interfaceC169117gk.AIV(E7Q, c169127gl.A07.Bov());
                }
            });
        }
    }

    @Override // X.InterfaceC169517hR
    public final boolean isLoading() {
        if (!this.A04 && !this.A07.isLoading()) {
            return false;
        }
        return true;
    }
}
