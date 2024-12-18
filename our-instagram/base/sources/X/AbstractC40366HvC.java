package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HvC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40366HvC {
    public static Map A00(InterfaceC43563JLx interfaceC43563JLx) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43563JLx.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC43563JLx.getId(), A1I);
        }
        if (interfaceC43563JLx.CU1() != null) {
            A1I.put("is_exclusive", interfaceC43563JLx.CU1());
        }
        if (interfaceC43563JLx.BWt() != null) {
            A1I.put("next_id", interfaceC43563JLx.BWt());
        }
        if (interfaceC43563JLx.BxX() != null) {
            A1I.put("single_choice_answer", interfaceC43563JLx.BxX());
        }
        if (interfaceC43563JLx.getText() != null) {
            AbstractC37300Gc1.A15(interfaceC43563JLx.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
