package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Twa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC65929Twa {
    public static Map A00(C44K c44k) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c44k.AqZ() != null) {
            C44I AqZ = c44k.AqZ();
            if (AqZ != null) {
                treeUpdaterJNI = AqZ.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("consumption_sheet_config", treeUpdaterJNI);
        }
        if (c44k.BB2() != null) {
            linkedHashMap.put("has_active_fundraiser", c44k.BB2());
        }
        if (c44k.CUE() != null) {
            linkedHashMap.put("is_facebook_onboarded_charity", c44k.CUE());
        }
        if (c44k.getPk() != null) {
            linkedHashMap.put("pk", c44k.getPk());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
