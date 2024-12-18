package X;

import com.instagram.api.schemas.GuideMediaType;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I0D {
    public static Map A00(JLE jle) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jle.Aqp() != null) {
            A1I.put("content", jle.Aqp().F7o());
        }
        if (jle.CBS() != null) {
            GuideMediaType CBS = jle.CBS();
            C14360o3.A0B(CBS, 0);
            AbstractC37300Gc1.A16(CBS.A00, A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
