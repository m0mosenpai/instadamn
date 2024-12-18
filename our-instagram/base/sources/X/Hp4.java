package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class Hp4 {
    public static Map A00(InterfaceC104994oF interfaceC104994oF) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC104994oF.BWD() != null) {
            List<JM5> BWD = interfaceC104994oF.BWD();
            ArrayList arrayList = null;
            if (BWD != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JM5 jm5 : BWD) {
                    if (jm5 != null) {
                        arrayList.add(jm5.F7o());
                    }
                }
            }
            A1I.put("native_payload_v1", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
