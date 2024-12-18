package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I3W {
    public static Map A00(InterfaceC43546JLg interfaceC43546JLg) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (interfaceC43546JLg.BcS() != null) {
            JLH BcS = interfaceC43546JLg.BcS();
            if (BcS != null) {
                treeUpdaterJNI = BcS.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("permission", treeUpdaterJNI);
        }
        if (interfaceC43546JLg.Bgl() != null) {
            ProductDetailsProductItemDictIntf Bgl = interfaceC43546JLg.Bgl();
            if (Bgl != null) {
                treeUpdaterJNI2 = Bgl.F7o();
            }
            A1I.put("product", treeUpdaterJNI2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
