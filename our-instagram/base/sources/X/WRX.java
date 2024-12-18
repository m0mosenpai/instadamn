package X;

/* loaded from: classes11.dex */
public final class WRX implements XE1 {
    public long A00;
    public InterfaceC72026XFo A01;
    public boolean A02;
    public long A03;
    public boolean A04;
    public final WFZ A05;
    public final WFa A06;
    public final C70352WSg A07;
    public final WFa A08;

    @Override // X.XE1
    public final /* synthetic */ XE1 CCR() {
        return this;
    }

    @Override // X.XE1
    public final void EMc(long j, long j2) {
        this.A04 = false;
        this.A07.EMb();
        this.A03 = j2;
    }

    @Override // X.XE1
    public final boolean EmK(XGj xGj) {
        WFa wFa;
        int i = 0;
        while (true) {
            wFa = this.A06;
            xGj.E3s(wFa.A02, 0, 10);
            wFa.A0O(0);
            if (wFa.A06() != 4801587) {
                break;
            }
            wFa.A0P(3);
            int A04 = wFa.A04();
            i += A04 + 10;
            xGj.AB0(A04);
        }
        xGj.EJn();
        xGj.AB0(i);
        if (this.A00 == -1) {
            this.A00 = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            xGj.E3s(wFa.A02, 0, 2);
            wFa.A0O(0);
            if ((wFa.A08() & 65526) == 65520) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                xGj.E3s(wFa.A02, 0, 4);
                WFZ wfz = this.A05;
                wfz.A07(14);
                int A042 = wfz.A04(13);
                if (A042 > 6) {
                    xGj.AB0(A042 - 6);
                    i4 += A042;
                }
            }
            i2++;
            xGj.EJn();
            xGj.AB0(i2);
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    @Override // X.XE1
    public final void CNe(InterfaceC72026XFo interfaceC72026XFo) {
        this.A01 = interfaceC72026XFo;
        this.A07.ANM(interfaceC72026XFo, new W4Q(Integer.MIN_VALUE, 0, 1));
        interfaceC72026XFo.ASd();
    }

    @Override // X.XE1
    public final int E7l(XGj xGj, VZk vZk) {
        WDn.A00(this.A01);
        WFa wFa = this.A08;
        int read = xGj.read(wFa.A02, 0, C3OO.FLAG_MOVED);
        boolean A1P = AbstractC167007dF.A1P(read, -1);
        if (!this.A02) {
            C70345WRz.A00(this.A01, -9223372036854775807L);
            this.A02 = true;
        }
        if (A1P) {
            return -1;
        }
        wFa.A0O(0);
        wFa.A0N(read);
        if (!this.A04) {
            this.A07.A09 = this.A03;
            this.A04 = true;
        }
        this.A07.AJY(wFa);
        return 0;
    }

    public WRX(int i) {
        this.A07 = new C70352WSg(null, 0, true);
        this.A08 = new WFa(C3OO.FLAG_MOVED);
        this.A00 = -1L;
        WFa wFa = new WFa(10);
        this.A06 = wFa;
        this.A05 = new WFZ(wFa.A02);
    }

    public WRX() {
        this(0);
    }
}
