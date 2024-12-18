package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GuideTypeStr;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I08 {
    public static Map A00(JMX jmx) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jmx.getDescription() != null) {
            A1I.put(DevServerEntity.COLUMN_DESCRIPTION, jmx.getDescription());
        }
        if (jmx.getId() != null) {
            AbstractC37300Gc1.A12(jmx.getId(), A1I);
        }
        if (jmx.BUE() != null) {
            JLE BUE = jmx.BUE();
            if (BUE != null) {
                treeUpdaterJNI = BUE.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("mixed_cover_media", treeUpdaterJNI);
        }
        jmx.BXg();
        A1I.put("num_items", Integer.valueOf(jmx.BXg()));
        if (jmx.getTitle() != null) {
            AbstractC37300Gc1.A17(jmx.getTitle(), A1I);
        }
        if (jmx.CBT() != null) {
            GuideTypeStr CBT = jmx.CBT();
            C14360o3.A0B(CBT, 0);
            AbstractC37300Gc1.A16(CBT.A00, A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
