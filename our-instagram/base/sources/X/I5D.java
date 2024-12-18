package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I5D {
    public static Map A00(InterfaceC43548JLi interfaceC43548JLi) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43548JLi.getAmount() != null) {
            A1I.put("amount", interfaceC43548JLi.getAmount());
        }
        if (interfaceC43548JLi.C8e() != null) {
            A1I.put("timestamp", interfaceC43548JLi.C8e());
        }
        AbstractC37302Gc3.A1T(interfaceC43548JLi.CDj(), A1I);
        return AbstractC06930Yk.A0B(A1I);
    }
}
