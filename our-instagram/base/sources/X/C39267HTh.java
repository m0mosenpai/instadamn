package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HTh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39267HTh extends C17T implements JJZ {
    public InterfaceC37791pH A00;

    @Override // X.JJZ
    public final JJZ EAM(C1DY c1dy) {
        InterfaceC37791pH interfaceC37791pH = this.A00;
        if (interfaceC37791pH == null && (interfaceC37791pH = (InterfaceC37791pH) A05(580362274, HWN.class)) == null) {
            interfaceC37791pH = null;
        } else {
            interfaceC37791pH.EBd(c1dy);
        }
        this.A00 = interfaceC37791pH;
        return this;
    }

    @Override // X.JJZ
    public final C38770H5k F0u(C1DY c1dy) {
        C37771pE F5R;
        String A0j = A0j(501281532);
        ClipsACRMidCardSubType clipsACRMidCardSubType = (ClipsACRMidCardSubType) A0N(346870402, JBM.A00);
        List A0o = A0o(-724653039, HT1.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            A0q.add(((JJH) it.next()).Ezi());
        }
        InterfaceC37791pH interfaceC37791pH = this.A00;
        if (interfaceC37791pH == null && (interfaceC37791pH = (InterfaceC37791pH) A05(580362274, HWN.class)) == null) {
            F5R = null;
        } else {
            F5R = interfaceC37791pH.F5R(c1dy);
        }
        return new C38770H5k(clipsACRMidCardSubType, F5R, A0j, A0U(), A0Y(), A0q);
    }
}
