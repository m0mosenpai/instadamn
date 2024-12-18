package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class BFU {
    public static Map A00(InterfaceC88383wt interfaceC88383wt) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList2 = null;
        if (interfaceC88383wt.BJ0() != null) {
            List<InterfaceC88183wS> BJ0 = interfaceC88383wt.BJ0();
            if (BJ0 != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC88183wS interfaceC88183wS : BJ0) {
                    if (interfaceC88183wS != null) {
                        arrayList.add(interfaceC88183wS.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("interested", arrayList);
        }
        if (interfaceC88383wt.BXH() != null) {
            List<InterfaceC88183wS> BXH = interfaceC88383wt.BXH();
            if (BXH != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (InterfaceC88183wS interfaceC88183wS2 : BXH) {
                    if (interfaceC88183wS2 != null) {
                        arrayList2.add(interfaceC88183wS2.F7o());
                    }
                }
            }
            A1I.put(NetInfoModule.CONNECTION_TYPE_NONE, arrayList2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
