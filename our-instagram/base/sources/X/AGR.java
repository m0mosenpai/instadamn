package X;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes4.dex */
public final class AGR {
    public CountDownLatch A00;
    public boolean A01;
    public Integer A02;
    public final InterfaceC25219BDt A03;
    public final InterfaceC25158BBd A04;
    public final InterfaceC25158BBd A05;
    public final InterfaceC176037sM A06;
    public final String A07;
    public volatile boolean A08;
    public volatile boolean A09;
    public volatile boolean A0A;
    public volatile boolean A0B;
    public volatile boolean A0C;

    public static synchronized void A00(AGR agr) {
        InterfaceC25158BBd interfaceC25158BBd;
        InterfaceC25219BDt interfaceC25219BDt;
        synchronized (agr) {
            if (!agr.A09 && !agr.A0A && !agr.A01) {
                InterfaceC25158BBd interfaceC25158BBd2 = agr.A04;
                if ((interfaceC25158BBd2 != null && interfaceC25158BBd2.BaG() == null) || ((interfaceC25158BBd = agr.A05) != null && interfaceC25158BBd.BaG() == null)) {
                    agr.A0C = true;
                } else {
                    Integer num = agr.A02;
                    if (num != null && num != C05F.A0C) {
                        interfaceC25219BDt = agr.A03;
                        interfaceC25219BDt.AJB(agr.A07, num);
                    } else {
                        interfaceC25219BDt = agr.A03;
                        interfaceC25219BDt.AJA(agr.A07);
                    }
                    if (interfaceC25158BBd2 != null && interfaceC25158BBd2.BaG() != null) {
                        interfaceC25219BDt.EQ1(interfaceC25158BBd2.BaG());
                    }
                    if (interfaceC25158BBd != null && interfaceC25158BBd.BaG() != null) {
                        interfaceC25219BDt.Egv(interfaceC25158BBd.BaG());
                    }
                    interfaceC25219BDt.EaE(0);
                    interfaceC25219BDt.start();
                    agr.A09 = true;
                }
            }
        }
    }

    public AGR(InterfaceC25158BBd interfaceC25158BBd, InterfaceC25158BBd interfaceC25158BBd2, InterfaceC176037sM interfaceC176037sM, InterfaceC25219BDt interfaceC25219BDt, Integer num, String str) {
        this.A03 = interfaceC25219BDt;
        this.A07 = str;
        this.A04 = interfaceC25158BBd;
        this.A05 = interfaceC25158BBd2;
        if (interfaceC25158BBd != null && interfaceC25158BBd2 != null) {
            this.A00 = new CountDownLatch(2);
        }
        this.A06 = interfaceC176037sM;
        this.A08 = false;
        this.A0B = false;
        this.A0C = false;
        this.A02 = num;
    }
}
