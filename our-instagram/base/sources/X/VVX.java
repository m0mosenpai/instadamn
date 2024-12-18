package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VVX {
    public static Map A00(XGE xge) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xge.AlC() != null) {
            linkedHashMap.put("can_viewer_donate", xge.AlC());
        }
        if (xge.Ayq() != null) {
            XGB Ayq = xge.Ayq();
            if (Ayq != null) {
                treeUpdaterJNI = Ayq.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("donation_amount_config", treeUpdaterJNI);
        }
        if (xge.Ayt() != null) {
            linkedHashMap.put("donation_disabled_message", xge.Ayt());
        }
        if (xge.Ayu() != null) {
            linkedHashMap.put("donation_url", xge.Ayu());
        }
        if (xge.BgZ() != null) {
            linkedHashMap.put("privacy_disclaimer", xge.BgZ());
        }
        if (xge.Bhk() != null) {
            linkedHashMap.put("profile_fundraiser_id", xge.Bhk());
        }
        if (xge.CIf() != null) {
            linkedHashMap.put("you_donated_message", xge.CIf());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
