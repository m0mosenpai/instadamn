package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hoh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40000Hoh {
    public static Map A00(InterfaceC43537JKx interfaceC43537JKx) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (interfaceC43537JKx.AeL() != null) {
            JKI AeL = interfaceC43537JKx.AeL();
            if (AeL != null) {
                treeUpdaterJNI2 = AeL.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("availability", treeUpdaterJNI2);
        }
        if (interfaceC43537JKx.Bbm() != null) {
            JKJ Bbm = interfaceC43537JKx.Bbm();
            if (Bbm != null) {
                treeUpdaterJNI = Bbm.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("paymentConfig", treeUpdaterJNI);
        }
        if (interfaceC43537JKx.Bkw() != null) {
            InterfaceC43536JKw Bkw = interfaceC43537JKx.Bkw();
            if (Bkw != null) {
                treeUpdaterJNI3 = Bkw.F7o();
            }
            A1I.put("receiverInfo", treeUpdaterJNI3);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
