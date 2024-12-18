package X;

import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HSN extends C17T implements JJW {
    public List A00;
    public List A01;

    @Override // X.JJW
    public final JJW E9h(C1DY c1dy) {
        List A0m = AbstractC37304Gc5.A0m(this, this.A00);
        ArrayList A0q = AbstractC167017dG.A0q(A0m);
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1G(c1dy, A0q, it);
        }
        this.A00 = A0q;
        List A0o = A0o(-1167125638, ImmutablePandoUserDict.class);
        ArrayList A0q2 = AbstractC167017dG.A0q(A0o);
        Iterator it2 = A0o.iterator();
        while (it2.hasNext()) {
            AbstractC37304Gc5.A1I(c1dy, A0q2, it2);
        }
        this.A01 = A0q2;
        return this;
    }

    @Override // X.JJW
    public final C38749H4p Eyj(C1DY c1dy) {
        List A0m = AbstractC37304Gc5.A0m(this, this.A00);
        ArrayList A0i = AbstractC167007dF.A0i(A0m);
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1C(c1dy, A0i, it);
        }
        List A0o = A0o(-1167125638, ImmutablePandoUserDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it2 = A0o.iterator();
        while (it2.hasNext()) {
            AbstractC37304Gc5.A1I(c1dy, A0q, it2);
        }
        ArrayList A0i2 = AbstractC167007dF.A0i(A0q);
        Iterator it3 = A0q.iterator();
        while (it3.hasNext()) {
            AbstractC37303Gc4.A18(c1dy, A0i2, it3);
        }
        return new C38749H4p(A0h(1788746812), A0k(-798298666), A0h(1634460456), A0i, A0i2, getIntValueByHashCode(-381369392));
    }
}
