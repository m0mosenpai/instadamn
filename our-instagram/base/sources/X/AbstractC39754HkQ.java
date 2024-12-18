package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HkQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39754HkQ {
    public static Map A00(InterfaceC43500JJm interfaceC43500JJm) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43500JJm.Bgx() != null) {
            List<JK8> Bgx = interfaceC43500JJm.Bgx();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (JK8 jk8 : Bgx) {
                if (jk8 != null) {
                    A1E.add(jk8.F7o());
                }
            }
            A1I.put("product_enum_info_text_list", A1E);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
