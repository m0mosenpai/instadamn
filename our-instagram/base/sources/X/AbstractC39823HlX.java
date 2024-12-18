package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsSpinSwappableElementType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HlX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39823HlX {
    public static Map A00(InterfaceC43532JKs interfaceC43532JKs) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43532JKs.B0s() != null) {
            A1I.put("element_id", interfaceC43532JKs.B0s());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (interfaceC43532JKs.B0z() != null) {
            ClipsSpinSwappableElementType B0z = interfaceC43532JKs.B0z();
            if (B0z != null) {
                str = B0z.A00;
            } else {
                str = null;
            }
            A1I.put("element_type", str);
        }
        if (interfaceC43532JKs.C4X() != null) {
            InterfaceC43504JJq C4X = interfaceC43532JKs.C4X();
            if (C4X != null) {
                treeUpdaterJNI = C4X.F7o();
            }
            A1I.put("swapped_text", treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
