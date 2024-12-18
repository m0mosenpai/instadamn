package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IntentAwareAdsFormatInfo;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HpL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40034HpL {
    public static Map A00(IntentAwareAdsInfoIntf intentAwareAdsInfoIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (intentAwareAdsInfoIntf.B7z() != null) {
            IntentAwareAdsFormatInfo B7z = intentAwareAdsInfoIntf.B7z();
            if (B7z != null) {
                treeUpdaterJNI = B7z.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("format_info", treeUpdaterJNI);
        }
        if (intentAwareAdsInfoIntf.BIG() != null) {
            A1I.put("insertion_mechanism", intentAwareAdsInfoIntf.BIG());
        }
        if (intentAwareAdsInfoIntf.CcZ() != null) {
            A1I.put("is_seed_ad_eligible", intentAwareAdsInfoIntf.CcZ());
        }
        if (intentAwareAdsInfoIntf.BVC() != null) {
            A1I.put("multi_ads_first_ad_id", intentAwareAdsInfoIntf.BVC());
        }
        if (intentAwareAdsInfoIntf.BVJ() != null) {
            A1I.put("multi_ads_type", intentAwareAdsInfoIntf.BVJ());
        }
        if (intentAwareAdsInfoIntf.BVL() != null) {
            A1I.put("multi_ads_unit_id", intentAwareAdsInfoIntf.BVL());
        }
        if (intentAwareAdsInfoIntf.Brx() != null) {
            A1I.put("seed_ad_id", intentAwareAdsInfoIntf.Brx());
        }
        if (intentAwareAdsInfoIntf.Bry() != null) {
            A1I.put("seed_ad_position", intentAwareAdsInfoIntf.Bry());
        }
        if (intentAwareAdsInfoIntf.Brz() != null) {
            A1I.put("seed_ad_token", intentAwareAdsInfoIntf.Brz());
        }
        if (intentAwareAdsInfoIntf.CB4() != null) {
            A1I.put("trigger_type", intentAwareAdsInfoIntf.CB4());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
