package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hvz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40412Hvz {
    public static Map A00(InterfaceC43568JMc interfaceC43568JMc) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43568JMc.B1I() != null) {
            A1I.put("emphasis_style", interfaceC43568JMc.B1I());
        }
        if (interfaceC43568JMc.B7g() != null) {
            A1I.put("font_size", AbstractC166997dE.A0f(interfaceC43568JMc.B7g()));
        }
        if (interfaceC43568JMc.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC43568JMc.getId(), A1I);
        }
        if (interfaceC43568JMc.CPu() != null) {
            A1I.put("is_animated", interfaceC43568JMc.CPu());
        }
        if (interfaceC43568JMc.CV0() != null) {
            A1I.put("is_flig_enabled", interfaceC43568JMc.CV0());
        }
        if (interfaceC43568JMc.getText() != null) {
            AbstractC37300Gc1.A15(interfaceC43568JMc.getText(), A1I);
        }
        if (interfaceC43568JMc.C5z() != null) {
            A1I.put("text_alignment", interfaceC43568JMc.C5z());
        }
        if (interfaceC43568JMc.getTextColor() != null) {
            A1I.put("text_color", interfaceC43568JMc.getTextColor());
        }
        if (interfaceC43568JMc.C6J() != null) {
            A1I.put("text_format", interfaceC43568JMc.C6J());
        }
        if (interfaceC43568JMc.CAe() != null) {
            List<InterfaceC43519JKf> CAe = interfaceC43568JMc.CAe();
            ArrayList arrayList = null;
            if (CAe != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC43519JKf interfaceC43519JKf : CAe) {
                    if (interfaceC43519JKf != null) {
                        arrayList.add(interfaceC43519JKf.F7o());
                    }
                }
            }
            A1I.put("translated_text", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
