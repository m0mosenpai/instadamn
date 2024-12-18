package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HuK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40315HuK {
    public static Map A00(JMB jmb) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jmb.BPp() != null) {
            A1I.put("max_id", jmb.BPp());
        }
        if (jmb.BUs() != null) {
            A1I.put("more_available", jmb.BUs());
        }
        if (jmb.BbX() != null) {
            List<InterfaceC43561JLv> BbX = jmb.BbX();
            ArrayList arrayList = null;
            if (BbX != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC43561JLv interfaceC43561JLv : BbX) {
                    if (interfaceC43561JLv != null) {
                        arrayList.add(interfaceC43561JLv.F7o());
                    }
                }
            }
            A1I.put("participants", arrayList);
        }
        if (jmb.Bjo() != null) {
            A1I.put("quiz_id", jmb.Bjo());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
