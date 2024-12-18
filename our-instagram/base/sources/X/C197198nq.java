package X;

import android.content.Context;

/* renamed from: X.8nq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197198nq extends AbstractC178657wd implements InterfaceC178057ve {
    public InterfaceC179077xJ A00;

    @Override // X.AbstractC178227vw
    public final void A09() {
        C178037vc c178037vc = InterfaceC178107vj.A05;
        Object obj = false;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC178657wd) this).A00;
        Object AqG = interfaceC178207vu.AqG(c178037vc);
        if (AqG != null) {
            obj = AqG;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C179107xM c179107xM = null;
        if (booleanValue) {
            InterfaceC178287w2 Aq1 = interfaceC178207vu.Aq1(InterfaceC178297w3.A00);
            C14360o3.A07(Aq1);
            InterfaceC178297w3 interfaceC178297w3 = (InterfaceC178297w3) Aq1;
            InterfaceC178287w2 Aq12 = interfaceC178207vu.Aq1(InterfaceC178407wE.A00);
            C14360o3.A07(Aq12);
            InterfaceC178407wE interfaceC178407wE = (InterfaceC178407wE) Aq12;
            Context context = interfaceC178207vu.getContext();
            C14360o3.A07(context);
            C14360o3.A0B(interfaceC178297w3, 2);
            C14360o3.A0B(interfaceC178407wE, 3);
            c179107xM = AbstractC179127xO.A00(context, null, null, C178747wm.A01, interfaceC178407wE, interfaceC178297w3, true, false, false, false, false, false, true, false);
        }
        InterfaceC179077xJ interfaceC179077xJ = (InterfaceC179077xJ) A0B(InterfaceC178107vj.A0C);
        C178747wm c178747wm = C178747wm.A01;
        C14360o3.A08(c178747wm);
        this.A00 = new C199458rm(null, c179107xM, c178747wm, interfaceC179077xJ, true, false);
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        C178087vh c178087vh = InterfaceC178057ve.A01;
        C14360o3.A08(c178087vh);
        return c178087vh;
    }

    @Override // X.InterfaceC178057ve
    public final InterfaceC179077xJ BQo() {
        InterfaceC179077xJ interfaceC179077xJ = this.A00;
        if (interfaceC179077xJ == null) {
            C14360o3.A0F("mediaGraph");
            throw C00O.createAndThrow();
        }
        return interfaceC179077xJ;
    }
}
