package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGCTAStickerPositioningStrategyEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class Ho5 {
    public static Map A00(C40C c40c) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str = null;
        if (c40c.AvL() != null) {
            AnonymousClass409 AvL = c40c.AvL();
            if (AvL != null) {
                treeUpdaterJNI = AvL.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("customPositionInfo", treeUpdaterJNI);
        }
        if (c40c.BaT() != null) {
            A1I.put("overlapsBottom10Percent", c40c.BaT());
        }
        if (c40c.BaU() != null) {
            A1I.put("overlapsBottom20Percent", c40c.BaU());
        }
        if (c40c.CBU() != null) {
            IGCTAStickerPositioningStrategyEnum CBU = c40c.CBU();
            if (CBU != null) {
                str = CBU.A00;
            }
            AbstractC37300Gc1.A16(str, A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
