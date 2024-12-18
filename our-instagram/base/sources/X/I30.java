package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I30 {
    public static Map A00(JLG jlg) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jlg.getDestination() != null) {
            A1I.put("destination", jlg.getDestination());
        }
        if (jlg.BpJ() != null) {
            JK5 BpJ = jlg.BpJ();
            if (BpJ != null) {
                treeUpdaterJNI = BpJ.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("rich_destination", treeUpdaterJNI);
        }
        if (jlg.BpL() != null) {
            A1I.put("rich_text", jlg.BpL());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
