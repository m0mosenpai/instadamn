package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HvU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40381HvU {
    public static Map A00(InterfaceC101384gv interfaceC101384gv) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC101384gv.Arz() != null) {
            A1I.put("count", interfaceC101384gv.Arz());
        }
        if (interfaceC101384gv.B7g() != null) {
            A1I.put("font_size", AbstractC166997dE.A0f(interfaceC101384gv.B7g()));
        }
        if (interfaceC101384gv.getText() != null) {
            AbstractC37300Gc1.A15(interfaceC101384gv.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
