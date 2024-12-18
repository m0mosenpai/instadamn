package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hk3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39733Hk3 {
    public static Map A00(InterfaceC104774nh interfaceC104774nh) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC104774nh.B22() != null) {
            List B22 = interfaceC104774nh.B22();
            ArrayList arrayList = null;
            if (B22 != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = B22.iterator();
                while (it.hasNext()) {
                    AbstractC37303Gc4.A1U(arrayList, it);
                }
            }
            A1I.put("end_scene_products", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
