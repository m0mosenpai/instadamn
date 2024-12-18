package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ShowreelNativeClientName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HSv extends C17T implements C69N {
    @Override // X.C69N
    public final List Acz() {
        return A08(-2143919126, HSw.class);
    }

    @Override // X.C69N
    public final ShowreelNativeClientName Any() {
        return (ShowreelNativeClientName) A0M(-173873537, C43274JAt.A00);
    }

    @Override // X.C69N
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, Ht8.A00(this));
    }

    @Override // X.C69N
    public final String Abu() {
        return A0h(1884610515);
    }

    @Override // X.C69N
    public final List Acx() {
        return getOptionalStringListByHashCode(-1408207997);
    }

    @Override // X.C69N
    public final String Aqq() {
        return A0h(951530617);
    }

    @Override // X.C69N
    public final Integer BDS() {
        return AbstractC37301Gc2.A0U(this);
    }

    @Override // X.C69N
    public final String BOt() {
        return A0i(-894921330);
    }

    @Override // X.C69N
    public final String C5i() {
        return A0h(-180214992);
    }

    @Override // X.C69N
    public final Integer CHg() {
        return AbstractC37301Gc2.A0Z(this);
    }

    @Override // X.C69N
    public final H5B EzX() {
        ArrayList arrayList;
        String A0h = A0h(1884610515);
        ImmutableList optionalStringListByHashCode = getOptionalStringListByHashCode(-1408207997);
        List Acz = Acz();
        if (Acz != null) {
            arrayList = AbstractC167017dG.A0q(Acz);
            Iterator it = Acz.iterator();
            while (it.hasNext()) {
                arrayList.add(((JLX) it.next()).EzY());
            }
        } else {
            arrayList = null;
        }
        ShowreelNativeClientName Any = Any();
        String A0h2 = A0h(951530617);
        return new H5B(Any, AbstractC37301Gc2.A0U(this), AbstractC37301Gc2.A0Z(this), A0h, A0h2, A0i(-894921330), A0h(-180214992), optionalStringListByHashCode, arrayList);
    }
}
