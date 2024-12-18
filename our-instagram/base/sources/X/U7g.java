package X;

import java.io.File;
import java.util.List;

/* loaded from: classes11.dex */
public final class U7g implements XES {
    public XET A00;
    public VDT A01;
    public final /* synthetic */ W3H A02;

    public U7g(W3H w3h, VDT vdt, XET xet) {
        this.A02 = w3h;
        this.A01 = vdt;
        this.A00 = xet;
    }

    @Override // X.XES
    public final void D21(C70129W5q c70129W5q) {
        this.A00.D21(c70129W5q);
    }

    @Override // X.XES
    public final void D6f(List list) {
        this.A00.onSuccess();
    }

    @Override // X.XES
    public final /* bridge */ /* synthetic */ void DEg(C70129W5q c70129W5q, Object obj) {
        this.A00.DEe((C105764pn) obj, c70129W5q);
    }

    @Override // X.XES
    public final void Dbq(double d) {
        this.A00.Dk3(this.A01, (float) d);
    }

    @Override // X.XES
    public final void Dk4(File file, long j) {
        XET xet;
        int i;
        VDT vdt = this.A01;
        VDT vdt2 = VDT.A05;
        if (vdt == vdt2) {
            xet = this.A00;
            i = this.A02.A02;
        } else {
            vdt2 = VDT.A03;
            if (vdt == vdt2) {
                xet = this.A00;
                i = this.A02.A00;
            } else {
                vdt2 = VDT.A04;
                if (vdt != vdt2) {
                    return;
                }
                xet = this.A00;
                i = this.A02.A01;
            }
        }
        xet.Dk5(vdt2, file, i, j);
    }

    @Override // X.XES
    public final void Dk6(C55176Odf c55176Odf) {
        VDT vdt = this.A01;
        if (vdt == VDT.A05) {
            XET xet = this.A00;
            W3H w3h = this.A02;
            xet.Dk7(c55176Odf, vdt, w3h.A02);
            w3h.A02++;
            return;
        }
        if (vdt == VDT.A03) {
            XET xet2 = this.A00;
            W3H w3h2 = this.A02;
            xet2.Dk7(c55176Odf, vdt, w3h2.A00);
            w3h2.A00++;
            return;
        }
        if (vdt != VDT.A04) {
            return;
        }
        XET xet3 = this.A00;
        W3H w3h3 = this.A02;
        xet3.Dk7(c55176Odf, vdt, w3h3.A01);
        w3h3.A01++;
    }

    @Override // X.XES
    public final void onStart() {
        W3H w3h = this.A02;
        U7W u7w = w3h.A0A;
        if (u7w != null && u7w.A1E()) {
            VDT vdt = this.A01;
            if (vdt == VDT.A05) {
                w3h.A02 = 0;
            } else if (vdt == VDT.A03) {
                w3h.A00 = 0;
            } else if (vdt == VDT.A04) {
                w3h.A01 = 0;
            }
        }
        this.A00.onStart();
    }
}
