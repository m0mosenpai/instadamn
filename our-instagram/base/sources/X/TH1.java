package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TH1 implements InterfaceC65675Tr5 {
    public final /* synthetic */ SX4 A00;

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void CwQ(float f) {
    }

    @Override // X.InterfaceC86363t8
    public final void CwR(Integer num, float f) {
        C14360o3.A0B(num, 1);
        SX4 sx4 = this.A00;
        Iterator it = sx4.A02.iterator();
        while (it.hasNext()) {
            it.next();
        }
        Iterator it2 = sx4.A01.iterator();
        while (it2.hasNext()) {
            ((InterfaceC86363t8) it2.next()).CwR(num, f);
        }
    }

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void Czx() {
    }

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void D00() {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void D5o() {
    }

    @Override // X.InterfaceC86363t8
    public final void D5p(Integer num) {
        C14360o3.A0B(num, 0);
        SX4 sx4 = this.A00;
        Iterator it = sx4.A02.iterator();
        while (it.hasNext()) {
            it.next();
        }
        Iterator it2 = sx4.A01.iterator();
        while (it2.hasNext()) {
            ((InterfaceC86363t8) it2.next()).D5p(num);
        }
    }

    @Override // X.InterfaceC86363t8
    public final void DId(Integer num) {
        C14360o3.A0B(num, 0);
        SX4 sx4 = this.A00;
        Iterator it = sx4.A02.iterator();
        while (it.hasNext()) {
            it.next();
        }
        Iterator it2 = sx4.A01.iterator();
        while (it2.hasNext()) {
            ((InterfaceC86363t8) it2.next()).DId(num);
        }
    }

    @Override // X.InterfaceC86363t8
    public final void Dyj(C51752Mtb c51752Mtb) {
        C14360o3.A0B(c51752Mtb, 0);
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC86363t8) it.next()).Dyj(c51752Mtb);
        }
    }

    public TH1(SX4 sx4) {
        this.A00 = sx4;
    }

    @Override // X.InterfaceC86363t8
    public final void DB6() {
        SX4 sx4 = this.A00;
        Iterator it = sx4.A02.iterator();
        while (it.hasNext()) {
            it.next();
        }
        Iterator it2 = sx4.A01.iterator();
        while (it2.hasNext()) {
            ((InterfaceC86363t8) it2.next()).DB6();
        }
    }

    @Override // X.InterfaceC86363t8
    public final void DZk(int i, int i2) {
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC86363t8) it.next()).DZk(i, i2);
        }
    }
}
