package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDS {
    public static Map A00(InterfaceC101444h6 interfaceC101444h6) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC101444h6.AqN() != null) {
            A1I.put("connected_similar_user_id", interfaceC101444h6.AqN());
        }
        interfaceC101444h6.Cez();
        A1I.put("is_unconnected_impersonator", Boolean.valueOf(interfaceC101444h6.Cez()));
        return AbstractC06930Yk.A0B(A1I);
    }
}
