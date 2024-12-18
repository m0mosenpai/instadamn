package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.I2p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40709I2p {
    public static Map A00(InterfaceC115905Mg interfaceC115905Mg) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (interfaceC115905Mg.AiD() != null) {
            InterfaceC37961pd AiD = interfaceC115905Mg.AiD();
            if (AiD != null) {
                treeUpdaterJNI2 = AiD.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("broadcast", treeUpdaterJNI2);
        }
        if (interfaceC115905Mg.Bf2() != null) {
            JMK Bf2 = interfaceC115905Mg.Bf2();
            if (Bf2 != null) {
                treeUpdaterJNI = Bf2.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("post_live_item", treeUpdaterJNI);
        }
        if (interfaceC115905Mg.BlP() != null) {
            InterfaceC37791pH BlP = interfaceC115905Mg.BlP();
            if (BlP != null) {
                treeUpdaterJNI3 = BlP.F7o();
            }
            A1I.put("reel", treeUpdaterJNI3);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
