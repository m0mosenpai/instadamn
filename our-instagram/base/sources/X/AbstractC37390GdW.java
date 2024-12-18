package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.GdW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37390GdW {
    public static Map A00(InterfaceC38221qC interfaceC38221qC) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList2 = null;
        if (interfaceC38221qC.AtO() != null) {
            List<InterfaceC39521sX> AtO = interfaceC38221qC.AtO();
            if (AtO != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC39521sX interfaceC39521sX : AtO) {
                    if (interfaceC39521sX != null) {
                        arrayList.add(interfaceC39521sX.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("cross_surface", arrayList);
        }
        if (interfaceC38221qC.BOJ() != null) {
            List<InterfaceC39521sX> BOJ = interfaceC38221qC.BOJ();
            if (BOJ != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (InterfaceC39521sX interfaceC39521sX2 : BOJ) {
                    if (interfaceC39521sX2 != null) {
                        arrayList2.add(interfaceC39521sX2.F7o());
                    }
                }
            }
            A1I.put("local_surface", arrayList2);
        }
        if (interfaceC38221qC.BTJ() != null) {
            A1I.put("meta_ids", interfaceC38221qC.BTJ());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
