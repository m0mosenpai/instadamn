package X;

import com.instagram.model.shopping.reels.ReelProductLinkIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I4C {
    public static Map A00(ReelProductLinkIntf reelProductLinkIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (reelProductLinkIntf.Bgl() != null) {
            A1I.put("product", AbstractC37302Gc3.A0B(reelProductLinkIntf.Bgl()));
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
