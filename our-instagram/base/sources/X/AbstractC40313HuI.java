package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HuI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40313HuI {
    public static Map A00(InterfaceC43561JLv interfaceC43561JLv) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43561JLv.Ac5() != null) {
            A1I.put("answer", interfaceC43561JLv.Ac5());
        }
        if (interfaceC43561JLv.CBD() != null) {
            A1I.put("ts", interfaceC43561JLv.CBD());
        }
        AbstractC37302Gc3.A1T(interfaceC43561JLv.CDj(), A1I);
        return AbstractC06930Yk.A0B(A1I);
    }
}
