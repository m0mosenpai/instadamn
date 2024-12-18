package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.I5i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40780I5i {
    public static Map A00(InterfaceC38571ql interfaceC38571ql) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC38571ql.BGu() != null) {
            A1I.put("image_url", interfaceC38571ql.BGu());
        }
        if (interfaceC38571ql.BGv() != null) {
            A1I.put(AbstractC111324zv.A00(221), interfaceC38571ql.BGv());
        }
        if (interfaceC38571ql.getName() != null) {
            AbstractC37300Gc1.A14(interfaceC38571ql.getName(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
