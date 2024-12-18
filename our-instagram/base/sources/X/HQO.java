package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HQO extends C17T implements AnonymousClass536 {
    @Override // X.AnonymousClass536
    public final List BiX() {
        return A08(949135447, HQP.class);
    }

    @Override // X.AnonymousClass536
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40016Hox.A00(this));
    }

    @Override // X.AnonymousClass536
    public final String B7l() {
        return A0i(1406770015);
    }

    @Override // X.AnonymousClass536
    public final Boolean CQI() {
        return getOptionalBooleanValueByHashCode(-955251547);
    }

    @Override // X.AnonymousClass536
    public final AnonymousClass535 EvR() {
        ArrayList arrayList;
        String A0i = A0i(1406770015);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-955251547);
        List BiX = BiX();
        if (BiX != null) {
            arrayList = AbstractC167017dG.A0q(BiX);
            Iterator it = BiX.iterator();
            while (it.hasNext()) {
                arrayList.add(((JKL) it.next()).EvS());
            }
        } else {
            arrayList = null;
        }
        return new AnonymousClass535(optionalBooleanValueByHashCode, A0i, arrayList);
    }
}
