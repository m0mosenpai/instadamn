package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.Entity;
import com.instagram.api.schemas.RangeIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HsQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40201HsQ {
    public static Map A00(RangeIntf rangeIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (rangeIntf.B2H() != null) {
            Entity B2H = rangeIntf.B2H();
            if (B2H != null) {
                treeUpdaterJNI = B2H.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("entity", treeUpdaterJNI);
        }
        if (rangeIntf.BN2() != null) {
            A1I.put("length", rangeIntf.BN2());
        }
        if (rangeIntf.BYa() != null) {
            A1I.put("offset", rangeIntf.BYa());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
