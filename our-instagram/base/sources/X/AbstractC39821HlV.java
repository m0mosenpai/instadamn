package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsSpinSwappableElementType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HlV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39821HlV {
    public static Map A00(InterfaceC43531JKr interfaceC43531JKr) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43531JKr.B0s() != null) {
            A1I.put("element_id", interfaceC43531JKr.B0s());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (interfaceC43531JKr.B0z() != null) {
            ClipsSpinSwappableElementType B0z = interfaceC43531JKr.B0z();
            if (B0z != null) {
                str = B0z.A00;
            } else {
                str = null;
            }
            A1I.put("element_type", str);
        }
        if (interfaceC43531JKr.C4W() != null) {
            InterfaceC43579JMn C4W = interfaceC43531JKr.C4W();
            if (C4W != null) {
                treeUpdaterJNI = C4W.F7o();
            }
            A1I.put("swappable_text", treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
