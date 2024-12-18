package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hmt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39906Hmt {
    public static Map A00(InterfaceC43533JKt interfaceC43533JKt) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList2 = null;
        if (interfaceC43533JKt.Abm() != null) {
            List Abm = interfaceC43533JKt.Abm();
            if (Abm != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = Abm.iterator();
                while (it.hasNext()) {
                    AbstractC37303Gc4.A1R(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            A1I.put("android_links", arrayList);
        }
        if (interfaceC43533JKt.B01() != null) {
            A1I.put("dynamic_item_id", interfaceC43533JKt.B01());
        }
        if (interfaceC43533JKt.BJY() != null) {
            List BJY = interfaceC43533JKt.BJY();
            if (BJY != null) {
                arrayList2 = AbstractC166987dD.A1E();
                Iterator it2 = BJY.iterator();
                while (it2.hasNext()) {
                    AbstractC37303Gc4.A1R(arrayList2, it2);
                }
            }
            A1I.put("ios_links", arrayList2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
