package X;

import com.instagram.model.shopping.clips.IGTVShoppingInfoIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I3S {
    public static final ArrayList A00(IGTVShoppingInfoIntf iGTVShoppingInfoIntf) {
        C14360o3.A0B(iGTVShoppingInfoIntf, 0);
        List BhR = iGTVShoppingInfoIntf.BhR();
        ArrayList A1E = AbstractC166987dD.A1E();
        if (BhR != null) {
            Iterator it = BhR.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1T(A1E, it);
            }
        }
        return AbstractC166987dD.A1F(A1E);
    }
}
