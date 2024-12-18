package X;

import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HMd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39175HMd extends C17T implements JJJ {
    public List A00;

    @Override // X.JJJ
    public final JJJ E8e(C1DY c1dy) {
        List A0o = A0o(559155430, ImmutablePandoMediaDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1E(c1dy, A0q, it);
        }
        this.A00 = A0q;
        return this;
    }

    @Override // X.JJJ
    public final H2A EqW(C1DY c1dy) {
        List A0o = A0o(559155430, ImmutablePandoMediaDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1E(c1dy, A0q, it);
        }
        ArrayList A0i = AbstractC167007dF.A0i(A0q);
        Iterator it2 = A0q.iterator();
        while (it2.hasNext()) {
            AbstractC37304Gc5.A1H(c1dy, A0i, it2);
        }
        List A0o2 = A0o(-724653039, HT1.class);
        ArrayList A0i2 = AbstractC167007dF.A0i(A0o2);
        Iterator it3 = A0o2.iterator();
        while (it3.hasNext()) {
            A0i2.add(((JJH) it3.next()).Ezi());
        }
        return new H2A(A0i, A0i2);
    }
}
