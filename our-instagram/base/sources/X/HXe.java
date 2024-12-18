package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HXe extends C17T implements JK6 {
    @Override // X.JK6
    public final List B2z() {
        return A08(100893, HXf.class);
    }

    @Override // X.JK6
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I9Q.A00(this));
    }

    @Override // X.JK6
    public final H83 F7D() {
        ArrayList arrayList;
        List B2z = B2z();
        if (B2z != null) {
            arrayList = AbstractC167017dG.A0q(B2z);
            Iterator it = B2z.iterator();
            while (it.hasNext()) {
                arrayList.add(((JLJ) it.next()).F7E());
            }
        } else {
            arrayList = null;
        }
        return new H83(arrayList);
    }
}
