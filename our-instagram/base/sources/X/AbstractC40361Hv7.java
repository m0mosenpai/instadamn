package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hv7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40361Hv7 {
    public static Map A00(JMO jmo) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jmo.Alx() != null) {
            A1I.put("card_id", jmo.Alx());
        }
        if (jmo.getMediaId() != null) {
            AbstractC37300Gc1.A18(jmo.getMediaId(), A1I);
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (jmo.BaB() != null) {
            List<InterfaceC43562JLw> BaB = jmo.BaB();
            if (BaB != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC43562JLw interfaceC43562JLw : BaB) {
                    if (interfaceC43562JLw != null) {
                        arrayList.add(interfaceC43562JLw.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("other_users_data", arrayList);
        }
        if (jmo.C59() != null) {
            A1I.put("taken_at", jmo.C59());
        }
        if (jmo.C5f() != null) {
            A1I.put("template_id", jmo.C5f());
        }
        if (jmo.CDq() != null) {
            InterfaceC43562JLw CDq = jmo.CDq();
            if (CDq != null) {
                treeUpdaterJNI = CDq.F7o();
            }
            A1I.put("user_data", treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
