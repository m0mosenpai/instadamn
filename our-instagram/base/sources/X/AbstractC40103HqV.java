package X;

import com.instagram.api.schemas.NativeInfoCardTextAlignment;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HqV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40103HqV {
    public static Map A00(InterfaceC43559JLt interfaceC43559JLt) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43559JLt.Aat() != null) {
            NativeInfoCardTextAlignment Aat = interfaceC43559JLt.Aat();
            if (Aat != null) {
                str = Aat.A00;
            } else {
                str = null;
            }
            A1I.put("alignment", str);
        }
        if (interfaceC43559JLt.B7g() != null) {
            A1I.put("font_size", AbstractC166997dE.A0f(interfaceC43559JLt.B7g()));
        }
        if (interfaceC43559JLt.BPy() != null) {
            A1I.put("max_number_of_lines", interfaceC43559JLt.BPy());
        }
        if (interfaceC43559JLt.getText() != null) {
            AbstractC37300Gc1.A15(interfaceC43559JLt.getText(), A1I);
        }
        if (interfaceC43559JLt.getTextColor() != null) {
            A1I.put("text_color", interfaceC43559JLt.getTextColor());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
