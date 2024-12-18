package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hlb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39827Hlb {
    public static Map A00(InterfaceC110134xi interfaceC110134xi) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC110134xi.BaN() != null) {
            A1I.put(AbstractC111324zv.A00(2847), interfaceC110134xi.BaN());
        }
        if (interfaceC110134xi.BsM() != null) {
            List<JKC> BsM = interfaceC110134xi.BsM();
            ArrayList arrayList = null;
            if (BsM != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JKC jkc : BsM) {
                    if (jkc != null) {
                        arrayList.add(jkc.F7o());
                    }
                }
            }
            A1I.put(AbstractC111324zv.A00(5269), arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
