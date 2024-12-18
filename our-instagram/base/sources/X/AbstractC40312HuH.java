package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HuH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40312HuH {
    public static Map A00(InterfaceC43574JMi interfaceC43574JMi) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43574JMi.Arx() != null) {
            A1I.put(AbstractC111324zv.A00(4184), interfaceC43574JMi.Arx());
        }
        if (interfaceC43574JMi.AwK() != null) {
            A1I.put(AbstractC111324zv.A00(4245), interfaceC43574JMi.AwK());
        }
        if (interfaceC43574JMi.getEndBackgroundColor() != null) {
            A1I.put("end_background_color", interfaceC43574JMi.getEndBackgroundColor());
        }
        if (interfaceC43574JMi.B6X() != null) {
            A1I.put("finished", interfaceC43574JMi.B6X());
        }
        if (interfaceC43574JMi.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC43574JMi.getId(), A1I);
        }
        ArrayList arrayList2 = null;
        if (interfaceC43574JMi.BZN() != null) {
            List<InterfaceC43540JLa> BZN = interfaceC43574JMi.BZN();
            if (BZN != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC43540JLa interfaceC43540JLa : BZN) {
                    if (interfaceC43540JLa != null) {
                        arrayList.add(interfaceC43540JLa.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("options", arrayList);
        }
        if (interfaceC43574JMi.getQuestion() != null) {
            A1I.put("question", interfaceC43574JMi.getQuestion());
        }
        if (interfaceC43574JMi.Bjo() != null) {
            A1I.put("quiz_id", interfaceC43574JMi.Bjo());
        }
        if (interfaceC43574JMi.getStartBackgroundColor() != null) {
            A1I.put("start_background_color", interfaceC43574JMi.getStartBackgroundColor());
        }
        if (interfaceC43574JMi.C5D() != null) {
            List<InterfaceC43540JLa> C5D = interfaceC43574JMi.C5D();
            if (C5D != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (InterfaceC43540JLa interfaceC43540JLa2 : C5D) {
                    if (interfaceC43540JLa2 != null) {
                        arrayList2.add(interfaceC43540JLa2.F7o());
                    }
                }
            }
            A1I.put("tallies", arrayList2);
        }
        if (interfaceC43574JMi.getTextColor() != null) {
            A1I.put("text_color", interfaceC43574JMi.getTextColor());
        }
        if (interfaceC43574JMi.CFy() != null) {
            A1I.put(AbstractC111324zv.A00(5570), interfaceC43574JMi.CFy());
        }
        if (interfaceC43574JMi.CG0() != null) {
            A1I.put(AbstractC111324zv.A00(5571), interfaceC43574JMi.CG0());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
