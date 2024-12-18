package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class IH1 {
    public final Map A00;
    public final List A01;
    public final java.util.Set A02;

    public IH1(List list, java.util.Set set) {
        AbstractC167017dG.A1P(list, set);
        this.A01 = list;
        this.A02 = set;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C41730Ie1 c41730Ie1 = (C41730Ie1) it.next();
            AbstractC166997dE.A1R(c41730Ie1.A05(), new C41031IFa(this.A02.contains(c41730Ie1.A05()), false), A0q);
        }
        this.A00 = AbstractC06930Yk.A03(AbstractC06930Yk.A08(A0q));
    }
}
