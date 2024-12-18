package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.I2i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40702I2i {
    public static Map A00(InterfaceC38101pu interfaceC38101pu) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (interfaceC38101pu.AtH() != null) {
            List AtH = interfaceC38101pu.AtH();
            if (AtH != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = AtH.iterator();
                while (it.hasNext()) {
                    AbstractC37303Gc4.A1X(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            A1I.put(AbstractC111324zv.A00(2213), arrayList);
        }
        if (interfaceC38101pu.AtL() != null) {
            A1I.put(AbstractC111324zv.A00(2214), interfaceC38101pu.AtL().F7o());
        }
        if (interfaceC38101pu.B8t() != null) {
            InterfaceC130575v2 B8t = interfaceC38101pu.B8t();
            if (B8t != null) {
                treeUpdaterJNI = B8t.F7o();
            }
            A1I.put(AbstractC111324zv.A00(2410), treeUpdaterJNI);
        }
        if (interfaceC38101pu.getMediaId() != null) {
            AbstractC37300Gc1.A18(interfaceC38101pu.getMediaId(), A1I);
        }
        if (interfaceC38101pu.CDG() != null) {
            A1I.put(AbstractC111324zv.A00(3272), interfaceC38101pu.CDG());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
