package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class HrN {
    public static Map A00(JMK jmk) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList = null;
        if (jmk.AiP() != null) {
            List<InterfaceC37961pd> AiP = jmk.AiP();
            if (AiP != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC37961pd interfaceC37961pd : AiP) {
                    if (interfaceC37961pd != null) {
                        arrayList.add(interfaceC37961pd.F7o());
                    }
                }
            }
            A1I.put("broadcasts", arrayList);
        }
        if (jmk.Aki() != null) {
            A1I.put("can_reply", jmk.Aki());
        }
        if (jmk.Akk() != null) {
            A1I.put("can_reshare", jmk.Akk());
        }
        if (jmk.BLv() != null) {
            A1I.put("last_seen_broadcast_ts", AbstractC166997dE.A0f(jmk.BLv()));
        }
        if (jmk.getPk() != null) {
            A1I.put("pk", jmk.getPk());
        }
        AbstractC37302Gc3.A1T(jmk.CDj(), A1I);
        return AbstractC06930Yk.A0B(A1I);
    }
}
