package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EuH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33667EuH {
    public static Map A00(InterfaceC37271GbO interfaceC37271GbO) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC37271GbO.BNG() != null) {
            A1I.put("liker_user_ids", interfaceC37271GbO.BNG());
        }
        if (interfaceC37271GbO.BlA() != null) {
            InterfaceC87503vI BlA = interfaceC37271GbO.BlA();
            if (BlA != null) {
                treeUpdaterJNI = BlA.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("recommender_info", treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
