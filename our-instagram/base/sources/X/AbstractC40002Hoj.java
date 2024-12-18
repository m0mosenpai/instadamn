package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hoj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40002Hoj {
    public static Map A00(JM5 jm5) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (jm5.Arj() != null) {
            InterfaceC43557JLr Arj = jm5.Arj();
            if (Arj != null) {
                treeUpdaterJNI2 = Arj.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("coordinates", treeUpdaterJNI2);
        }
        if (jm5.BJJ() != null) {
            A1I.put("invalidate_truncated_text", jm5.BJJ());
        }
        if (jm5.getText() != null) {
            AbstractC37300Gc1.A15(jm5.getText(), A1I);
        }
        if (jm5.C6p() != null) {
            InterfaceC43572JMg C6p = jm5.C6p();
            if (C6p != null) {
                treeUpdaterJNI = C6p.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("text_styling", treeUpdaterJNI);
        }
        if (jm5.C8U() != null) {
            JKK C8U = jm5.C8U();
            if (C8U != null) {
                treeUpdaterJNI3 = C8U.F7o();
            }
            A1I.put("time_stamp", treeUpdaterJNI3);
        }
        if (jm5.CB7() != null) {
            A1I.put("truncation_text", jm5.CB7());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
