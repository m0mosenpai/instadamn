package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hkg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39770Hkg {
    public static Map A00(InterfaceC43552JLm interfaceC43552JLm) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43552JLm.AcH() != null) {
            A1I.put("app_id", interfaceC43552JLm.AcH());
        }
        C914346k AgU = interfaceC43552JLm.AgU();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (AgU != null) {
            A1I.put("bloks_data", AgU.A00());
        }
        if (interfaceC43552JLm.Age() != null) {
            A1I.put("bloks_sticker_type", interfaceC43552JLm.Age());
        }
        if (interfaceC43552JLm.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC43552JLm.getId(), A1I);
        }
        if (interfaceC43552JLm.C0X() != null) {
            InterfaceC43501JJn C0X = interfaceC43552JLm.C0X();
            if (C0X != null) {
                treeUpdaterJNI = C0X.F7o();
            }
            A1I.put("sticker_data", treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
