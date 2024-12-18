package X;

import java.util.List;

/* renamed from: X.EdA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32868EdA extends AbstractC46517KiG {
    public final boolean A00;

    @Override // X.AbstractC46517KiG
    public final /* bridge */ /* synthetic */ C43617JRa A00(MNN mnn, InterfaceC37093GWc interfaceC37093GWc) {
        Object obj;
        List A1J;
        E9B e9b = (E9B) interfaceC37093GWc;
        C14360o3.A0B(e9b, 1);
        AbstractC33547EsL abstractC33547EsL = e9b.A00;
        C32885EdS c32885EdS = C32885EdS.A00;
        if (C14360o3.A0K(abstractC33547EsL, c32885EdS)) {
            A1J = C16930sl.A00;
        } else {
            C14360o3.A0B(c32885EdS, 0);
            e9b = new E9B(c32885EdS);
            if (this.A00) {
                obj = new Object();
            } else {
                obj = new Object();
            }
            A1J = AbstractC166987dD.A1J(obj);
        }
        return new C43617JRa(e9b, A1J);
    }

    public C32868EdA(boolean z) {
        this.A00 = z;
    }

    @Override // X.AbstractC46517KiG
    public final Class A01() {
        return G5N.class;
    }
}
