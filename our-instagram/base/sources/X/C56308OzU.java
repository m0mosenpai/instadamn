package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OzU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56308OzU implements BC2 {
    public final List A00;

    @Override // X.BC2
    public final Object Cq7(C128175qm c128175qm, InterfaceC23621Ds interfaceC23621Ds) {
        ArrayList A0Z = AbstractC50523MSb.A0Z(c128175qm.A0j);
        if (A0Z.isEmpty()) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                A0Z.add(it.next());
            }
        } else {
            HashMap A1G = AbstractC166987dD.A1G();
            Iterator it2 = this.A00.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            Iterator it3 = A0Z.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
            if (!A1G.isEmpty()) {
                Iterator A14 = AbstractC166997dE.A14(A1G);
                while (A14.hasNext()) {
                    A0Z.add(AbstractC31176DnK.A0j(A14));
                }
            }
        }
        MXY mxy = new MXY();
        mxy.A01 = MXZ.A00(A0Z);
        return mxy.A01(c128175qm);
    }

    public C56308OzU(List list) {
        this.A00 = list;
    }
}
