package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class TWN implements InterfaceC65461TkX {
    public final InterfaceC65605Tnu A00;

    @Override // X.InterfaceC65461TkX
    public final THP COo(C62709SMx c62709SMx) {
        InterfaceC65701TsN interfaceC65701TsN;
        C62696SMk c62696SMk = c62709SMx.A04;
        C62999SaN c62999SaN = new C62999SaN(c62696SMk);
        if (c62696SMk.A04 != null) {
            c62999SaN.A02("Content-Length", Long.toString(0L));
            c62999SaN.A02.A00("Transfer-Encoding");
        }
        C63365SiO c63365SiO = c62696SMk.A02;
        boolean z = false;
        if (c63365SiO.A04("Host") == null) {
            c62999SaN.A02("Host", AbstractC63404SjZ.A05(c62696SMk.A03, false));
        }
        if (c63365SiO.A04("Connection") == null) {
            c62999SaN.A02("Connection", "Keep-Alive");
        }
        if (c63365SiO.A04("Accept-Encoding") == null && c63365SiO.A04("Range") == null) {
            z = true;
            c62999SaN.A02("Accept-Encoding", "gzip");
        }
        InterfaceC65605Tnu interfaceC65605Tnu = this.A00;
        C63379Sit c63379Sit = c62696SMk.A03;
        List emptyList = Collections.emptyList();
        if (!emptyList.isEmpty()) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            int size = emptyList.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    A1C.append("; ");
                }
                C63213SfI c63213SfI = (C63213SfI) emptyList.get(i);
                AbstractC58322PtE.A1S(A1C, c63213SfI.A02);
                A1C.append(c63213SfI.A04);
            }
            c62999SaN.A02("Cookie", A1C.toString());
        }
        if (c63365SiO.A04("User-Agent") == null) {
            c62999SaN.A02("User-Agent", "okhttp/3.14.9");
        }
        THP A00 = c62709SMx.A00(c62999SaN.A00(), c62709SMx.A05, c62709SMx.A06);
        C63365SiO c63365SiO2 = A00.A05;
        AbstractC63263SgM.A01(interfaceC65605Tnu, c63365SiO2, c63379Sit);
        SZJ szj = new SZJ(A00);
        szj.A07 = c62696SMk;
        if (z) {
            String str = null;
            String A04 = c63365SiO2.A04("Content-Encoding");
            if (A04 != null) {
                str = A04;
            }
            if ("gzip".equalsIgnoreCase(str) && AbstractC63263SgM.A02(A00)) {
                THH thh = A00.A0B;
                if (thh instanceof C65139TeE) {
                    interfaceC65701TsN = ((C65139TeE) thh).A01;
                } else {
                    interfaceC65701TsN = ((C65138TeD) thh).A00;
                }
                C64847TWn c64847TWn = new C64847TWn(interfaceC65701TsN);
                SNS A002 = C63365SiO.A00(c63365SiO2);
                A002.A00("Content-Encoding");
                A002.A00("Content-Length");
                szj.A05 = C63365SiO.A00(new C63365SiO(A002));
                szj.A0B = new C65139TeE(new TWW(c64847TWn), -1L);
            }
        }
        return szj.A00();
    }

    public TWN(InterfaceC65605Tnu interfaceC65605Tnu) {
        this.A00 = interfaceC65605Tnu;
    }
}
