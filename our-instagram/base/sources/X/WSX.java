package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class WSX implements XE2 {
    public int A00;
    public boolean A01;
    public int A02;
    public long A03 = -9223372036854775807L;
    public final List A04;
    public final XG2[] A05;

    @Override // X.XE2
    public final void ANM(InterfaceC72026XFo interfaceC72026XFo, W4Q w4q) {
        int i = 0;
        while (true) {
            XG2[] xg2Arr = this.A05;
            if (i < xg2Arr.length) {
                C68886Vdi c68886Vdi = (C68886Vdi) this.A04.get(i);
                w4q.A01();
                W4Q.A00(w4q);
                XG2 F87 = interfaceC72026XFo.F87(w4q.A00, 3);
                C70116W4o c70116W4o = new C70116W4o();
                W4Q.A00(w4q);
                c70116W4o.A0T = w4q.A01;
                c70116W4o.A00("application/dvbsubs");
                c70116W4o.A0X = Collections.singletonList(c68886Vdi.A01);
                c70116W4o.A0V = c68886Vdi.A00;
                XG2.A00(c70116W4o, F87);
                xg2Arr[i] = F87;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // X.XE2
    public final void EMb() {
        this.A01 = false;
        this.A03 = -9223372036854775807L;
    }

    @Override // X.XE2
    public final void AJY(WFa wFa) {
        boolean z = this.A01;
        if (z) {
            int i = this.A00;
            if (i == 2) {
                if (wFa.A00 - wFa.A01 != 0) {
                    if (wFa.A05() != 32) {
                        this.A01 = false;
                        z = false;
                    }
                    this.A00 = 1;
                    i = 1;
                    if (!z) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (i == 1) {
                if (wFa.A00 - wFa.A01 == 0) {
                    return;
                }
                if (wFa.A05() != 0) {
                    this.A01 = false;
                    z = false;
                }
                this.A00 = 0;
                if (!z) {
                    return;
                }
            }
            int i2 = wFa.A01;
            int i3 = wFa.A00 - i2;
            for (XG2 xg2 : this.A05) {
                wFa.A0O(i2);
                xg2.ELL(wFa, i3);
            }
            this.A02 += i3;
        }
    }

    @Override // X.XE2
    public final void E3B(boolean z) {
        if (this.A01) {
            WDn.A02(AbstractC167007dF.A1M((this.A03 > (-9223372036854775807L) ? 1 : (this.A03 == (-9223372036854775807L) ? 0 : -1))));
            for (XG2 xg2 : this.A05) {
                xg2.ELS(null, 1, this.A02, 0, this.A03);
            }
            this.A01 = false;
        }
    }

    @Override // X.XE2
    public final void E3C(long j, int i) {
        if ((i & 4) != 0) {
            this.A01 = true;
            this.A03 = j;
            this.A02 = 0;
            this.A00 = 2;
        }
    }

    public WSX(List list) {
        this.A04 = list;
        this.A05 = new XG2[list.size()];
    }
}
