package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hp6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40023Hp6 {
    public static Map A00(JKM jkm) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (jkm.Bha() != null) {
            JJQ Bha = jkm.Bha();
            if (Bha != null) {
                treeUpdaterJNI = Bha.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("profile_card_info", treeUpdaterJNI);
        }
        if (jkm.BjS() != null) {
            InterfaceC108064tp BjS = jkm.BjS();
            if (BjS != null) {
                treeUpdaterJNI2 = BjS.F7o();
            }
            A1I.put("question_card_info", treeUpdaterJNI2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
