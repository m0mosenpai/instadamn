package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Huo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40344Huo {
    public static Map A00(JMD jmd) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jmd.BOs() != null) {
            JKY BOs = jmd.BOs();
            if (BOs != null) {
                treeUpdaterJNI = BOs.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("logging_info", treeUpdaterJNI);
        }
        if (jmd.BR6() != null) {
            List BR6 = jmd.BR6();
            ArrayList A0q = AbstractC167017dG.A0q(BR6);
            Iterator it = BR6.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1S(A0q, it);
            }
            A1I.put("media_infos", A0q);
        }
        if (jmd.Bii() != null) {
            A1I.put(AbstractC111324zv.A00(504), jmd.Bii().F7o());
        }
        if (jmd.Bll() != null) {
            A1I.put("reel_pks", jmd.Bll());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
