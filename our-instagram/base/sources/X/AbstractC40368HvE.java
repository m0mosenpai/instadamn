package X;

import com.facebook.react.modules.intent.IntentModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HvE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40368HvE {
    public static Map A00(InterfaceC43541JLb interfaceC43541JLb) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43541JLb.CU1() != null) {
            A1I.put("is_exclusive", interfaceC43541JLb.CU1());
        }
        if (interfaceC43541JLb.BXy() != null) {
            A1I.put("num_responders", interfaceC43541JLb.BXy());
        }
        if (interfaceC43541JLb.getText() != null) {
            AbstractC37300Gc1.A15(interfaceC43541JLb.getText(), A1I);
        }
        if (interfaceC43541JLb.getValue() != null) {
            A1I.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, interfaceC43541JLb.getValue());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
