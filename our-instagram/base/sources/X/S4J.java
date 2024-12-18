package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class S4J {
    public static final Map A00(C6FW c6fw) {
        android.net.Uri A0B = AbstractC25227BEk.A0B(AbstractC31177DnL.A0e(c6fw, 0));
        String host = A0B.getHost();
        String path = A0B.getPath();
        java.util.Set<String> queryParameterNames = A0B.getQueryParameterNames();
        C14360o3.A07(queryParameterNames);
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC50522MSa.A09(queryParameterNames));
        for (String str : queryParameterNames) {
            A18.put(str, A0B.getQueryParameter(str));
        }
        return AbstractC25232BEp.A1F("url_params", A18, AbstractC166987dD.A1L("host", host), AbstractC166987dD.A1L("path", path));
    }
}
