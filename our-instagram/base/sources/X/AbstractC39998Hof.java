package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hof, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39998Hof {
    public static Map A00(InterfaceC43536JKw interfaceC43536JKw) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43536JKw.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC43536JKw.getId(), A1I);
        }
        if (interfaceC43536JKw.getName() != null) {
            AbstractC37300Gc1.A14(interfaceC43536JKw.getName(), A1I);
        }
        if (interfaceC43536JKw.CEM() != null) {
            A1I.put("validOrigins", interfaceC43536JKw.CEM());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
