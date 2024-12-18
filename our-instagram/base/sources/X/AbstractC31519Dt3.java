package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Dt3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC31519Dt3 {
    public static Map A00(InterfaceC81833l1 interfaceC81833l1) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (interfaceC81833l1.BNb() != null) {
            InterfaceC110324y3 BNb = interfaceC81833l1.BNb();
            if (BNb != null) {
                treeUpdaterJNI = BNb.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("linked_fb_page", treeUpdaterJNI);
        }
        if (interfaceC81833l1.BNc() != null) {
            C43H BNc = interfaceC81833l1.BNc();
            if (BNc != null) {
                treeUpdaterJNI2 = BNc.F7o();
            }
            A1I.put("linked_fb_user", treeUpdaterJNI2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
