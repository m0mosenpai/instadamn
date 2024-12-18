package X;

import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I4B {
    public static Map A00(ReelMultiProductLinkIntf reelMultiProductLinkIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (reelMultiProductLinkIntf.BhR() != null) {
            List BhR = reelMultiProductLinkIntf.BhR();
            ArrayList arrayList = null;
            if (BhR != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = BhR.iterator();
                while (it.hasNext()) {
                    AbstractC37303Gc4.A1U(arrayList, it);
                }
            }
            A1I.put("products", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
