package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HqK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40093HqK {
    public static Map A00(JMJ jmj) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jmj.ArR() != null) {
            JKE ArR = jmj.ArR();
            if (ArR != null) {
                treeUpdaterJNI = ArR.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("contextual_ads_info", treeUpdaterJNI);
        }
        if (jmj.BVC() != null) {
            A1I.put("multi_ads_first_ad_id", jmj.BVC());
        }
        if (jmj.BVH() != null) {
            A1I.put("multi_ads_seed_ad_id", jmj.BVH());
        }
        jmj.BVI();
        A1I.put("multi_ads_type", Integer.valueOf(jmj.BVI()));
        if (jmj.BVK() != null) {
            A1I.put("multi_ads_unit_category_hash_id", jmj.BVK());
        }
        if (jmj.BVL() != null) {
            A1I.put("multi_ads_unit_id", jmj.BVL());
        }
        if (jmj.getTitle() != null) {
            AbstractC37300Gc1.A17(jmj.getTitle(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
