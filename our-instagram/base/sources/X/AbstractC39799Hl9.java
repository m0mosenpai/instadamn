package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hl9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39799Hl9 {
    public static Map A00(InterfaceC43528JKo interfaceC43528JKo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC43528JKo.Am3();
        A1I.put("carousel_child_index", Integer.valueOf(interfaceC43528JKo.Am3()));
        interfaceC43528JKo.CRI();
        A1I.put("is_child_deleted", Boolean.valueOf(interfaceC43528JKo.CRI()));
        if (interfaceC43528JKo.BSQ() != null) {
            A1I.put("mentioned_child_id", interfaceC43528JKo.BSQ());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
