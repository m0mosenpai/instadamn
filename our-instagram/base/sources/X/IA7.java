package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductCollection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class IA7 {
    public static Map A00(JLK jlk) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jlk.AyL() != null) {
            ProductCollection AyL = jlk.AyL();
            if (AyL != null) {
                treeUpdaterJNI = AyL.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("discount_metadata", treeUpdaterJNI);
        }
        if (jlk.B24() != null) {
            A1I.put("end_time", jlk.B24());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
