package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gdf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37399Gdf {
    public static Map A00(InterfaceC39391sK interfaceC39391sK) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (interfaceC39391sK.AiT() != null) {
            InterfaceC39371sI AiT = interfaceC39391sK.AiT();
            if (AiT != null) {
                treeUpdaterJNI = AiT.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("browser_peek", treeUpdaterJNI);
        }
        if (interfaceC39391sK.Bca() != null) {
            InterfaceC87603vS Bca = interfaceC39391sK.Bca();
            if (Bca != null) {
                treeUpdaterJNI2 = Bca.F7o();
            }
            A1I.put("persistent_iab", treeUpdaterJNI2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
