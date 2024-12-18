package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I2X {
    public static Map A00(JLF jlf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jlf.Agr() != null) {
            A1I.put("body", jlf.Agr());
        }
        if (jlf.Ajn() != null) {
            InterfaceC43515JKb Ajn = jlf.Ajn();
            if (Ajn != null) {
                treeUpdaterJNI = Ajn.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("call_to_action", treeUpdaterJNI);
        }
        if (jlf.getTitle() != null) {
            AbstractC37300Gc1.A17(jlf.getTitle(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
