package X;

import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I3Q {
    public static final List A00(ClipsShoppingInfoIntf clipsShoppingInfoIntf) {
        List BhR = clipsShoppingInfoIntf.BhR();
        ArrayList A1E = AbstractC166987dD.A1E();
        if (BhR != null) {
            Iterator it = BhR.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1T(A1E, it);
            }
        }
        return A1E;
    }
}
