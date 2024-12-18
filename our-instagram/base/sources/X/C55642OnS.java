package X;

import java.util.Iterator;

/* renamed from: X.OnS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55642OnS implements InterfaceC58098PpN, InterfaceC57901Pm5 {
    public C54806OKa A00;
    public final java.util.Set A01;
    public final OWV A02;

    public C55642OnS(OWV owv) {
        C14360o3.A0B(owv, 1);
        this.A02 = owv;
        this.A01 = AbstractC31171DnF.A0l();
    }

    @Override // X.InterfaceC58098PpN
    public final synchronized void AP3() {
        OWV owv = this.A02;
        owv.A01();
        synchronized (owv) {
            owv.A03.remove(this);
        }
        this.A00 = null;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC57900Pm4) it.next()).CwK(this.A00);
        }
    }

    @Override // X.InterfaceC58098PpN
    public final synchronized void CNy(C51653Mrk c51653Mrk) {
        if (this.A00 == null) {
            OWV owv = this.A02;
            this.A00 = owv.A00(c51653Mrk);
            synchronized (owv) {
                owv.A03.add(this);
            }
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                ((InterfaceC57900Pm4) it.next()).CwK(this.A00);
            }
        }
    }

    @Override // X.InterfaceC58098PpN
    public final synchronized void ED4(InterfaceC57900Pm4 interfaceC57900Pm4) {
        this.A01.add(interfaceC57900Pm4);
    }

    @Override // X.InterfaceC57901Pm5
    public final void CwK(C54806OKa c54806OKa) {
        this.A00 = c54806OKa;
    }
}
