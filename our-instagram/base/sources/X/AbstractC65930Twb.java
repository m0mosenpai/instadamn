package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Twb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC65930Twb {
    public static Map A00(C44I c44i) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c44i.AlC() != null) {
            linkedHashMap.put("can_viewer_donate", c44i.AlC());
        }
        if (c44i.getCurrency() != null) {
            linkedHashMap.put("currency", c44i.getCurrency());
        }
        if (c44i.Ayr() != null) {
            C44G Ayr = c44i.Ayr();
            if (Ayr != null) {
                treeUpdaterJNI = Ayr.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("donation_amount_config", treeUpdaterJNI);
        }
        if (c44i.Ayt() != null) {
            linkedHashMap.put("donation_disabled_message", c44i.Ayt());
        }
        if (c44i.Ayu() != null) {
            linkedHashMap.put("donation_url", c44i.Ayu());
        }
        if (c44i.BCy() != null) {
            linkedHashMap.put("has_viewer_donated", c44i.BCy());
        }
        if (c44i.BgZ() != null) {
            linkedHashMap.put("privacy_disclaimer", c44i.BgZ());
        }
        if (c44i.Bhk() != null) {
            linkedHashMap.put("profile_fundraiser_id", c44i.Bhk());
        }
        if (c44i.CIf() != null) {
            linkedHashMap.put("you_donated_message", c44i.CIf());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
