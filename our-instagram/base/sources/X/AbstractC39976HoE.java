package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HoE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39976HoE {
    public static Map A00(InterfaceC43506JJs interfaceC43506JJs) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43506JJs.AiQ() != null) {
            List<InterfaceC43502JJo> AiQ = interfaceC43506JJs.AiQ();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (InterfaceC43502JJo interfaceC43502JJo : AiQ) {
                if (interfaceC43502JJo != null) {
                    A1E.add(interfaceC43502JJo.F7o());
                }
            }
            A1I.put("browse_info_dicts", A1E);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
