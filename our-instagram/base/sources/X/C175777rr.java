package X;

/* renamed from: X.7rr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C175777rr extends AbstractC179687yI implements InterfaceC175747ro {
    public static final void A00(Class cls) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls);
        sb.append(" is not available!  There may be a misconfiguration in the OneCamera camera factory.");
        C0K8.A0C("BasicInputCoordinator", sb.toString());
    }

    @Override // X.AbstractC178227vw
    public void A09() {
        Class cls;
        C178087vh c178087vh = InterfaceC178667we.A00;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC179687yI) this).A00;
        if (!interfaceC178207vu.CRY(c178087vh)) {
            cls = InterfaceC178667we.class;
        } else {
            C178087vh c178087vh2 = InterfaceC178737wl.A00;
            if (!interfaceC178207vu.CRY(c178087vh2)) {
                cls = InterfaceC178737wl.class;
            } else {
                InterfaceC178067vf Aq0 = interfaceC178207vu.Aq0(c178087vh);
                C14360o3.A07(Aq0);
                InterfaceC178067vf Aq02 = interfaceC178207vu.Aq0(c178087vh2);
                C14360o3.A07(Aq02);
                C175007qa c175007qa = ((C178647wc) ((InterfaceC178667we) Aq0)).A02;
                C14360o3.A07(c175007qa);
                InterfaceC175497rP C4Q = ((InterfaceC178737wl) Aq02).C4Q();
                C14360o3.A07(C4Q);
                C174997qZ c174997qZ = c175007qa.A0R;
                boolean z = c175007qa.A0S;
                C176277sk c176277sk = new C176277sk(C4Q, c174997qZ, z);
                if (z) {
                    c174997qZ.A01 = c176277sk;
                    return;
                } else {
                    c174997qZ.A02 = c176277sk;
                    return;
                }
            }
        }
        A00(cls);
    }

    @Override // X.InterfaceC179607yA
    public final C175767rq BKU() {
        return InterfaceC175747ro.A02;
    }
}
