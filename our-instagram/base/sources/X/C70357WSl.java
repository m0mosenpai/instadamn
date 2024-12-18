package X;

import android.util.SparseArray;

/* renamed from: X.WSl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70357WSl implements InterfaceC71940XBp {
    public final WFZ A00 = new WFZ(new byte[4]);
    public final /* synthetic */ C70320WRa A01;

    @Override // X.InterfaceC71940XBp
    public final void CNd(C69793VvZ c69793VvZ, InterfaceC72026XFo interfaceC72026XFo, W4Q w4q) {
    }

    public C70357WSl(C70320WRa c70320WRa) {
        this.A01 = c70320WRa;
    }

    @Override // X.InterfaceC71940XBp
    public final void AJY(WFa wFa) {
        if (wFa.A05() == 0 && (wFa.A05() & 128) != 0) {
            wFa.A0P(6);
            int i = (wFa.A00 - wFa.A01) / 4;
            for (int i2 = 0; i2 < i; i2++) {
                WFZ wfz = this.A00;
                wFa.A0R(wfz.A03, 0, 4);
                wfz.A07(0);
                int A04 = wfz.A04(16);
                wfz.A08(3);
                if (A04 == 0) {
                    wfz.A08(13);
                } else {
                    int A042 = wfz.A04(13);
                    C70320WRa c70320WRa = this.A01;
                    SparseArray sparseArray = c70320WRa.A08;
                    if (sparseArray.get(A042) == null) {
                        sparseArray.put(A042, new C70360WSo(new C70358WSm(c70320WRa, A042)));
                        c70320WRa.A02++;
                    }
                }
            }
            this.A01.A08.remove(0);
        }
    }
}
