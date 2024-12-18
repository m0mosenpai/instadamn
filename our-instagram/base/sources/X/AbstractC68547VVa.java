package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsRrFormatEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VVa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68547VVa {
    public static Map A00(InterfaceC105374p1 interfaceC105374p1) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = null;
        if (interfaceC105374p1.Arq() != null) {
            InterfaceC72034XFw Arq = interfaceC105374p1.Arq();
            if (Arq != null) {
                treeUpdaterJNI2 = Arq.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put(AbstractC111324zv.A00(851), treeUpdaterJNI2);
        }
        if (interfaceC105374p1.BhZ() != null) {
            XG1 BhZ = interfaceC105374p1.BhZ();
            if (BhZ != null) {
                treeUpdaterJNI = BhZ.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put(AbstractC111324zv.A00(1189), treeUpdaterJNI);
        }
        if (interfaceC105374p1.Bpl() != null) {
            IGAdsRrFormatEnum Bpl = interfaceC105374p1.Bpl();
            if (Bpl != null) {
                str = Bpl.A00;
            }
            linkedHashMap.put("rr_format", str);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
