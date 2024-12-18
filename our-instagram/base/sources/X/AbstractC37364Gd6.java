package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gd6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37364Gd6 {
    public static Map A00(InterfaceC84133oz interfaceC84133oz) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC84133oz.getEnabled();
        A1I.put("enabled", Boolean.valueOf(interfaceC84133oz.getEnabled()));
        if (interfaceC84133oz.B2S() != null) {
            C4CW B2S = interfaceC84133oz.B2S();
            if (B2S != null) {
                treeUpdaterJNI = B2S.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("entry_point_container", treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
