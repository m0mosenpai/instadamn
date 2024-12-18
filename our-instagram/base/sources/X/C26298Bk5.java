package X;

import java.util.ArrayList;

/* renamed from: X.Bk5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26298Bk5 extends AbstractC51572Yf {
    public final InterfaceC16820sZ A00;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        CRX crx = (CRX) this.A00.invoke();
        String str = crx.A02;
        if (str == null) {
            return new C2WF(null, null, null, null, false);
        }
        C2XE c2xe = c76223bS.A05;
        ArrayList A1E = AbstractC166987dD.A1E();
        C14360o3.A0B(c2xe, 1);
        C75933ay c75933ay = C51722Yv.A02;
        A1E.add(new H8D(AbstractC25230BEn.A0d(null, C05F.A00, 100.0f, 0), crx.A00, crx.A01, str));
        return new C2WF(null, null, null, A1E, false);
    }

    public C26298Bk5(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }
}
