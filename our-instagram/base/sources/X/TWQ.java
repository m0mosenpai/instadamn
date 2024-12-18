package X;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.Deque;
import java.util.List;

/* loaded from: classes10.dex */
public final class TWQ implements InterfaceC65593TnY {
    public static final List A06 = AbstractC63404SjZ.A06("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List A07 = AbstractC63404SjZ.A06("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final EnumC61215RhF A00;
    public final C65158TeX A01;
    public final C62709SMx A02;
    public final THU A03;
    public volatile C63029Sb0 A04;
    public volatile boolean A05;

    @Override // X.InterfaceC65593TnY
    public final void cancel() {
        this.A05 = true;
        if (this.A04 != null) {
            this.A04.A05(C05F.A0j);
        }
    }

    @Override // X.InterfaceC65593TnY
    public final C65158TeX AJU() {
        return this.A01;
    }

    @Override // X.InterfaceC65593TnY
    public final InterfaceC65679Tr9 AN2(C62696SMk c62696SMk, long j) {
        return this.A04.A01();
    }

    @Override // X.InterfaceC65593TnY
    public final void AVk() {
        this.A04.A01().close();
    }

    @Override // X.InterfaceC65593TnY
    public final void AWG() {
        this.A03.A0J.A00();
    }

    @Override // X.InterfaceC65593TnY
    public final InterfaceC65677Tr7 E2t(THP thp) {
        return this.A04.A09;
    }

    @Override // X.InterfaceC65593TnY
    public final SZJ E8I(boolean z) {
        Deque deque;
        C63365SiO c63365SiO;
        C63029Sb0 c63029Sb0 = this.A04;
        synchronized (c63029Sb0) {
            C65168Teh c65168Teh = c63029Sb0.A0A;
            c65168Teh.A08();
            while (true) {
                try {
                    deque = c63029Sb0.A06;
                    if (!deque.isEmpty() || c63029Sb0.A03 != null) {
                        break;
                    }
                    try {
                        c63029Sb0.wait();
                    } catch (InterruptedException unused) {
                        AbstractC58318PtA.A18();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    c65168Teh.A0B();
                    throw th;
                }
            }
            c65168Teh.A0B();
            if (!deque.isEmpty()) {
                c63365SiO = (C63365SiO) deque.removeFirst();
            } else {
                IOException iOException = c63029Sb0.A02;
                if (iOException == null) {
                    throw new C61031Rdz(c63029Sb0.A03);
                }
                throw iOException;
            }
        }
        EnumC61215RhF enumC61215RhF = this.A00;
        SNS sns = new SNS();
        String[] strArr = c63365SiO.A00;
        int length = strArr.length / 2;
        C62937SYf c62937SYf = null;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            String str = strArr[i2];
            String str2 = strArr[i2 + 1];
            if (str.equals(":status")) {
                c62937SYf = C62937SYf.A00(AnonymousClass001.A0R("HTTP/1.1 ", str2));
            } else if (!A07.contains(str)) {
                sns.A01(str, str2);
            }
        }
        if (c62937SYf != null) {
            SZJ szj = new SZJ();
            szj.A06 = enumC61215RhF;
            szj.A00 = c62937SYf.A00;
            szj.A03 = c62937SYf.A01;
            szj.A05 = C63365SiO.A00(new C63365SiO(sns));
            if (z && szj.A00 == 100) {
                return null;
            }
            return szj;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // X.InterfaceC65593TnY
    public final long EIv(THP thp) {
        C64531TIl c64531TIl = AbstractC63263SgM.A00;
        String A04 = thp.A05.A04("Content-Length");
        if (A04 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(A04);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0196, code lost:
    
        if (r1 == (-1)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dc, code lost:
    
        if (r7.A00 == 0) goto L34;
     */
    @Override // X.InterfaceC65593TnY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FEf(X.C62696SMk r24) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TWQ.FEf(X.SMk):void");
    }

    public TWQ(TIY tiy, C65158TeX c65158TeX, C62709SMx c62709SMx, THU thu) {
        this.A01 = c65158TeX;
        this.A02 = c62709SMx;
        this.A03 = thu;
        List list = tiy.A0A;
        EnumC61215RhF enumC61215RhF = EnumC61215RhF.H2_PRIOR_KNOWLEDGE;
        this.A00 = list.contains(enumC61215RhF) ? enumC61215RhF : EnumC61215RhF.HTTP_2;
    }
}
