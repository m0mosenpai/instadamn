package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Nqa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC53784Nqa {
    public static Map A00(InterfaceC109814x8 interfaceC109814x8) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC109814x8.AqY() != null) {
            A1I.put("consumption_sheet_config", interfaceC109814x8.AqY().F7o());
        }
        interfaceC109814x8.AxP();
        A1I.put("digital_non_consumable_product_id", Long.valueOf(interfaceC109814x8.AxP()));
        interfaceC109814x8.AxQ();
        A1I.put("digital_product_id", Long.valueOf(interfaceC109814x8.AxQ()));
        interfaceC109814x8.Bbi();
        A1I.put("payee_id", Long.valueOf(interfaceC109814x8.Bbi()));
        if (interfaceC109814x8.BdK() != null) {
            A1I.put("pinned_row_config", interfaceC109814x8.BdK().F7o());
        }
        if (interfaceC109814x8.C8H() != null) {
            List<InterfaceC109734x0> C8H = interfaceC109814x8.C8H();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (InterfaceC109734x0 interfaceC109734x0 : C8H) {
                if (interfaceC109734x0 != null) {
                    A1E.add(interfaceC109734x0.F7o());
                }
            }
            A1I.put("tier_infos", A1E);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
