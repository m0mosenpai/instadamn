package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Htr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40287Htr {
    public static Map A00(JMA jma) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jma.AbX() != null) {
            A1I.put("amount_raised", jma.AbX());
        }
        User AnB = jma.AnB();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (AnB != null) {
            A1I.put("charity", AnB.A07());
        }
        if (jma.Ayv() != null) {
            InterfaceC43549JLj Ayv = jma.Ayv();
            if (Ayv != null) {
                treeUpdaterJNI = Ayv.F7o();
            }
            A1I.put("donations", treeUpdaterJNI);
        }
        if (jma.getFundraiserId() != null) {
            A1I.put("fundraiser_id", jma.getFundraiserId());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
