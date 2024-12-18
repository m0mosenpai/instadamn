package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HRF extends C17T implements JJU {
    public List A00;

    @Override // X.JJU
    public final JJU E9M(C1DY c1dy) {
        List<InterfaceC43584JMs> list = this.A00;
        if (list == null) {
            list = A0o(-1854476977, C39178HMg.class);
        }
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (InterfaceC43584JMs interfaceC43584JMs : list) {
            interfaceC43584JMs.E8g(c1dy);
            A0q.add(interfaceC43584JMs);
        }
        this.A00 = A0q;
        return this;
    }

    @Override // X.JJU
    public final H4L Eww(C1DY c1dy) {
        List list = this.A00;
        if (list == null) {
            list = A0o(-1854476977, C39178HMg.class);
        }
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC37303Gc4.A17(c1dy, A0q, it);
        }
        return new H4L(A0q, getIntValueByHashCode(-346560081), A0h(1296666401));
    }
}
