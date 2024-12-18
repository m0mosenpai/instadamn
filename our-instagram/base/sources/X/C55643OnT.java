package X;

import android.content.Context;
import java.util.Iterator;

/* renamed from: X.OnT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55643OnT implements InterfaceC58098PpN, InterfaceC57901Pm5 {
    public static C55643OnT A05;
    public static final C53676NoR A06 = new Object();
    public C54806OKa A00;
    public C0QS A01;
    public final Context A02;
    public final java.util.Set A03 = AbstractC31171DnF.A0l();
    public final OWV A04;

    @Override // X.InterfaceC58098PpN
    public final synchronized void AP3() {
        OWV owv = this.A04;
        owv.A01();
        synchronized (owv) {
            owv.A03.remove(this);
        }
        this.A00 = null;
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((InterfaceC57900Pm4) it.next()).CwK(this.A00);
        }
        C0QS c0qs = this.A01;
        if (c0qs != null) {
            this.A02.unregisterReceiver(c0qs);
        }
        this.A01 = null;
    }

    @Override // X.InterfaceC58098PpN
    public final synchronized void CNy(C51653Mrk c51653Mrk) {
        if (this.A00 == null) {
            OWV owv = this.A04;
            this.A00 = owv.A00(c51653Mrk);
            synchronized (owv) {
                owv.A03.add(this);
            }
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                ((InterfaceC57900Pm4) it.next()).CwK(this.A00);
            }
            this.A01 = new C0QS(new C55756OpP(this, 1));
            C0b3.A00();
            C0b3.A02(this.A02, this.A01);
        }
    }

    @Override // X.InterfaceC57901Pm5
    public final synchronized void CwK(C54806OKa c54806OKa) {
        this.A00 = c54806OKa;
    }

    @Override // X.InterfaceC58098PpN
    public final synchronized void ED4(InterfaceC57900Pm4 interfaceC57900Pm4) {
        this.A03.add(interfaceC57900Pm4);
    }

    public C55643OnT(Context context, OWV owv) {
        this.A04 = owv;
        this.A02 = context.getApplicationContext();
    }
}
