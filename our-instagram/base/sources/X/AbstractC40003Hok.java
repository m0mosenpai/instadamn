package X;

import com.instagram.api.schemas.IGNativeTextOverlayTextBoxAlignmentEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hok, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40003Hok {
    public static Map A00(InterfaceC43557JLr interfaceC43557JLr) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43557JLr.Aha() != null) {
            A1I.put("bottom_right_x_pct", interfaceC43557JLr.Aha());
        }
        if (interfaceC43557JLr.Ahb() != null) {
            A1I.put("bottom_right_y_pct", interfaceC43557JLr.Ahb());
        }
        if (interfaceC43557JLr.Ahq() != null) {
            IGNativeTextOverlayTextBoxAlignmentEnum Ahq = interfaceC43557JLr.Ahq();
            if (Ahq != null) {
                str = Ahq.A00;
            } else {
                str = null;
            }
            A1I.put("box_alignment", str);
        }
        if (interfaceC43557JLr.C9W() != null) {
            A1I.put("top_left_x_pct", interfaceC43557JLr.C9W());
        }
        if (interfaceC43557JLr.C9X() != null) {
            A1I.put("top_left_y_pct", interfaceC43557JLr.C9X());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
