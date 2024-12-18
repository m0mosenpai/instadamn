package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDB {
    public static Map A00(C5HL c5hl) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c5hl.B9u() != null) {
            List<InterfaceC31129DmC> B9u = c5hl.B9u();
            ArrayList arrayList = null;
            if (B9u != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC31129DmC interfaceC31129DmC : B9u) {
                    if (interfaceC31129DmC != null) {
                        arrayList.add(interfaceC31129DmC.F7o());
                    }
                }
            }
            A1I.put("giphy_videos", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
