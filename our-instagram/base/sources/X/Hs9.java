package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.androidlink.AndroidLink;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class Hs9 {
    public static Map A00(C47W c47w) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c47w.Abl() != null) {
            AndroidLink Abl = c47w.Abl();
            if (Abl != null) {
                treeUpdaterJNI = Abl.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("android_link", treeUpdaterJNI);
        }
        if (c47w.BrW() != null) {
            A1I.put("secondary_cta_destination", c47w.BrW());
        }
        if (c47w.BrX() != null) {
            A1I.put("secondary_cta_hint_text", c47w.BrX());
        }
        if (c47w.BrZ() != null) {
            A1I.put("secondary_cta_title", c47w.BrZ());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
