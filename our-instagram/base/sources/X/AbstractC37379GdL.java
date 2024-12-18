package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GdL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37379GdL {
    public static Map A00(C4CW c4cw) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI4 = null;
        if (c4cw.ApW() != null) {
            C4CS ApW = c4cw.ApW();
            if (ApW != null) {
                treeUpdaterJNI3 = ApW.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, treeUpdaterJNI3);
        }
        if (c4cw.BaO() != null) {
            InterfaceC116715Qa BaO = c4cw.BaO();
            if (BaO != null) {
                treeUpdaterJNI2 = BaO.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("overflow", treeUpdaterJNI2);
        }
        if (c4cw.BdB() != null) {
            C4CP BdB = c4cw.BdB();
            if (BdB != null) {
                treeUpdaterJNI = BdB.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("pill", treeUpdaterJNI);
        }
        if (c4cw.CC9() != null) {
            InterfaceC116735Qc CC9 = c4cw.CC9();
            if (CC9 != null) {
                treeUpdaterJNI4 = CC9.F7o();
            }
            A1I.put("ufi", treeUpdaterJNI4);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
