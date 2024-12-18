package X;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* loaded from: classes10.dex */
public final class TWR implements InterfaceC65593TnY {
    public int A00 = 0;
    public long A01 = 262144;
    public C63365SiO A02;
    public final TIY A03;
    public final C65158TeX A04;
    public final InterfaceC65700TsM A05;
    public final InterfaceC65701TsN A06;

    public static C63365SiO A00(TWR twr) {
        SNS sns = new SNS();
        while (true) {
            String E8V = twr.A06.E8V(twr.A01);
            long j = twr.A01;
            int length = E8V.length();
            twr.A01 = j - length;
            if (length != 0) {
                int indexOf = E8V.indexOf(":", 1);
                if (indexOf != -1) {
                    sns.A01(AbstractC58318PtA.A0j(E8V, indexOf), AbstractC58318PtA.A0g(indexOf, E8V));
                } else {
                    if (E8V.startsWith(":")) {
                        E8V = E8V.substring(1);
                    }
                    sns.A01("", E8V);
                }
            } else {
                return new C63365SiO(sns);
            }
        }
    }

    public final void A01(String str, C63365SiO c63365SiO) {
        int i = this.A00;
        if (i == 0) {
            InterfaceC65700TsM interfaceC65700TsM = this.A05;
            interfaceC65700TsM.FEs(str);
            interfaceC65700TsM.FEs("\r\n");
            String[] strArr = c63365SiO.A00;
            int length = strArr.length / 2;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                interfaceC65700TsM.FEs(strArr[i3]);
                interfaceC65700TsM.FEs(": ");
                interfaceC65700TsM.FEs(strArr[i3 + 1]);
                interfaceC65700TsM.FEs("\r\n");
            }
            interfaceC65700TsM.FEs("\r\n");
            this.A00 = 1;
            return;
        }
        throw AbstractC31175DnJ.A0U("state: ", i);
    }

    @Override // X.InterfaceC65593TnY
    public final C65158TeX AJU() {
        return this.A04;
    }

    @Override // X.InterfaceC65593TnY
    public final InterfaceC65679Tr9 AN2(C62696SMk c62696SMk, long j) {
        if ("chunked".equalsIgnoreCase(c62696SMk.A02.A04("Transfer-Encoding"))) {
            int i = this.A00;
            if (i == 1) {
                this.A00 = 2;
                return new TWZ(this);
            }
            throw AbstractC31175DnJ.A0U("state: ", i);
        }
        int i2 = this.A00;
        if (i2 == 1) {
            this.A00 = 2;
            return new C64835TWa(this);
        }
        throw AbstractC31175DnJ.A0U("state: ", i2);
    }

    @Override // X.InterfaceC65593TnY
    public final void AVk() {
        this.A05.flush();
    }

    @Override // X.InterfaceC65593TnY
    public final void AWG() {
        this.A05.flush();
    }

    @Override // X.InterfaceC65593TnY
    public final SZJ E8I(boolean z) {
        String str;
        int i = this.A00;
        int i2 = 3;
        if (i != 1 && i != 3) {
            throw AbstractC31175DnJ.A0U("state: ", i);
        }
        try {
            String E8V = this.A06.E8V(this.A01);
            this.A01 -= E8V.length();
            C62937SYf A00 = C62937SYf.A00(E8V);
            SZJ szj = new SZJ();
            szj.A06 = A00.A02;
            int i3 = A00.A00;
            szj.A00 = i3;
            szj.A03 = A00.A01;
            szj.A05 = C63365SiO.A00(A00(this));
            if (z && i3 == 100) {
                return null;
            }
            if (i3 != 100) {
                i2 = 4;
            }
            this.A00 = i2;
            return szj;
        } catch (EOFException e) {
            C65158TeX c65158TeX = this.A04;
            if (c65158TeX != null) {
                str = c65158TeX.A0E.A02.A0A.A0A();
            } else {
                str = "unknown";
            }
            throw new IOException(AnonymousClass001.A0R("unexpected end of stream on ", str), e);
        }
    }

    @Override // X.InterfaceC65593TnY
    public final void FEf(C62696SMk c62696SMk) {
        Proxy.Type type = this.A04.A0E.A01.type();
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(c62696SMk.A00);
        A1C.append(' ');
        C63379Sit c63379Sit = c62696SMk.A03;
        if (!c63379Sit.A03.equals("https") && type == Proxy.Type.HTTP) {
            A1C.append(c63379Sit);
        } else {
            String A07 = c63379Sit.A07();
            String A08 = c63379Sit.A08();
            if (A08 != null) {
                A07 = AnonymousClass001.A0T(A07, A08, '?');
            }
            A1C.append(A07);
        }
        A01(AbstractC166997dE.A0x(" HTTP/1.1", A1C), c62696SMk.A02);
    }

    @Override // X.InterfaceC65593TnY
    public final void cancel() {
        C65158TeX c65158TeX = this.A04;
        if (c65158TeX != null) {
            AbstractC63404SjZ.A0A(c65158TeX.A05);
        }
    }

    public TWR(TIY tiy, C65158TeX c65158TeX, InterfaceC65700TsM interfaceC65700TsM, InterfaceC65701TsN interfaceC65701TsN) {
        this.A03 = tiy;
        this.A04 = c65158TeX;
        this.A06 = interfaceC65701TsN;
        this.A05 = interfaceC65700TsM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        if (r3 != (-1)) goto L5;
     */
    @Override // X.InterfaceC65593TnY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC65677Tr7 E2t(X.THP r6) {
        /*
            r5 = this;
            boolean r0 = X.AbstractC63263SgM.A02(r6)
            if (r0 != 0) goto L16
            r3 = 0
        L8:
            int r1 = r5.A00
            r0 = 4
            if (r1 != r0) goto L51
            r0 = 5
            r5.A00 = r0
            X.TeU r0 = new X.TeU
            r0.<init>(r5, r3)
            return r0
        L16:
            java.lang.String r0 = "Transfer-Encoding"
            r2 = 0
            X.SiO r1 = r6.A05
            java.lang.String r0 = r1.A04(r0)
            if (r0 == 0) goto L22
            r2 = r0
        L22:
            java.lang.String r0 = "chunked"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L3c
            X.SMk r0 = r6.A07
            X.Sit r2 = r0.A03
            int r1 = r5.A00
            r0 = 4
            if (r1 != r0) goto L59
            r0 = 5
            r5.A00 = r0
            X.TeW r0 = new X.TeW
            r0.<init>(r2, r5)
            return r0
        L3c:
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r1.A04(r0)
            r3 = -1
            if (r0 == 0) goto L61
            long r3 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L4a
        L4a:
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L61
            goto L8
        L51:
            java.lang.String r0 = "state: "
            java.lang.IllegalStateException r0 = X.AbstractC31175DnJ.A0U(r0, r1)
            throw r0
        L59:
            java.lang.String r0 = "state: "
            java.lang.IllegalStateException r0 = X.AbstractC31175DnJ.A0U(r0, r1)
            throw r0
        L61:
            int r1 = r5.A00
            r0 = 4
            if (r1 != r0) goto L74
            r0 = 5
            r5.A00 = r0
            X.TeX r0 = r5.A04
            r0.A01()
            X.TeV r0 = new X.TeV
            r0.<init>(r5)
            return r0
        L74:
            java.lang.String r0 = "state: "
            java.lang.IllegalStateException r0 = X.AbstractC31175DnJ.A0U(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TWR.E2t(X.THP):X.Tr7");
    }

    @Override // X.InterfaceC65593TnY
    public final long EIv(THP thp) {
        if (!AbstractC63263SgM.A02(thp)) {
            return 0L;
        }
        String str = null;
        C63365SiO c63365SiO = thp.A05;
        String A04 = c63365SiO.A04("Transfer-Encoding");
        if (A04 != null) {
            str = A04;
        }
        if ("chunked".equalsIgnoreCase(str)) {
            return -1L;
        }
        String A042 = c63365SiO.A04("Content-Length");
        long j = -1;
        if (A042 == null) {
            return -1L;
        }
        try {
            j = Long.parseLong(A042);
            return j;
        } catch (NumberFormatException unused) {
            return j;
        }
    }
}
