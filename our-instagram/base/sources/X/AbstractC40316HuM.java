package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HuM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40316HuM {
    public static Map A00(InterfaceC43540JLa interfaceC43540JLa) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43540JLa.Arz() != null) {
            A1I.put("count", interfaceC43540JLa.Arz());
        }
        if (interfaceC43540JLa.BEE() != null) {
            A1I.put("hint_text", interfaceC43540JLa.BEE());
        }
        if (interfaceC43540JLa.CVt() != null) {
            A1I.put("is_hint_row", interfaceC43540JLa.CVt());
        }
        if (interfaceC43540JLa.getText() != null) {
            AbstractC37300Gc1.A15(interfaceC43540JLa.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
