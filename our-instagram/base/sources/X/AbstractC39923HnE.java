package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductCollection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HnE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39923HnE {
    public static Map A00(JMT jmt) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (jmt.Ap9() != null) {
            ProductCollection Ap9 = jmt.Ap9();
            if (Ap9 != null) {
                treeUpdaterJNI = Ap9.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("collection_metadata", treeUpdaterJNI);
        }
        if (jmt.ApG() != null) {
            A1I.put("collection_type", jmt.ApG());
        }
        if (jmt.AyK() != null) {
            JL0 AyK = jmt.AyK();
            if (AyK != null) {
                treeUpdaterJNI2 = AyK.F7o();
            }
            A1I.put("discount_metadata", treeUpdaterJNI2);
        }
        if (jmt.BE2() != null) {
            A1I.put("highlight_bar_destination", jmt.BE2());
        }
        if (jmt.BE3() != null) {
            A1I.put(AbstractC111324zv.A00(435), jmt.BE3());
        }
        if (jmt.CQH() != null) {
            A1I.put("is_auto_tagged", jmt.CQH());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
