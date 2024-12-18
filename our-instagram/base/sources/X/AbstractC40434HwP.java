package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HwP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40434HwP {
    public static Map A00(InterfaceC43522JKi interfaceC43522JKi) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43522JKi.B13() != null) {
            List<InterfaceC43544JLe> B13 = interfaceC43522JKi.B13();
            ArrayList arrayList = null;
            if (B13 != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC43544JLe interfaceC43544JLe : B13) {
                    if (interfaceC43544JLe != null) {
                        arrayList.add(interfaceC43544JLe.F7o());
                    }
                }
            }
            A1I.put("eligible_engagement_signals", arrayList);
        }
        if (interfaceC43522JKi.BTv() != null) {
            A1I.put("min_post_gap_to_previous_item", interfaceC43522JKi.BTv());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
