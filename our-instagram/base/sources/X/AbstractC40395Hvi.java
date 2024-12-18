package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextAppTextFragmentType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hvi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40395Hvi {
    public static Map A00(JMW jmw) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        String str;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI4 = null;
        if (jmw.B5W() != null) {
            InterfaceC43495JJh B5W = jmw.B5W();
            if (B5W != null) {
                treeUpdaterJNI3 = B5W.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put(AbstractC111324zv.A00(933), treeUpdaterJNI3);
        }
        if (jmw.B8V() != null) {
            TextAppTextFragmentType B8V = jmw.B8V();
            if (B8V != null) {
                str = B8V.A00;
            } else {
                str = null;
            }
            A1I.put(AbstractC111324zv.A00(947), str);
        }
        if (jmw.BNO() != null) {
            InterfaceC43517JKd BNO = jmw.BNO();
            if (BNO != null) {
                treeUpdaterJNI2 = BNO.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put(AbstractC111324zv.A00(1079), treeUpdaterJNI2);
        }
        if (jmw.BSM() != null) {
            InterfaceC43542JLc BSM = jmw.BSM();
            if (BSM != null) {
                treeUpdaterJNI = BSM.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(1107), treeUpdaterJNI);
        }
        if (jmw.Bdh() != null) {
            A1I.put("plaintext", jmw.Bdh());
        }
        if (jmw.C4y() != null) {
            InterfaceC43496JJi C4y = jmw.C4y();
            if (C4y != null) {
                treeUpdaterJNI4 = C4y.F7o();
            }
            A1I.put(AbstractC111324zv.A00(1322), treeUpdaterJNI4);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
