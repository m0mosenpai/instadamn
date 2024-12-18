package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class CHV {
    public static final String A00(String str, Collection collection) {
        C14360o3.A0B(collection, 1);
        ArrayList A0q = AbstractC167017dG.A0q(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0q.add(((C25313BIi) it.next()).A03);
        }
        return AbstractC25226BEj.A1H("_", AbstractC001800i.A0S(BJT.A00(A0q, 4), AbstractC166987dD.A1J(str)), null);
    }
}
