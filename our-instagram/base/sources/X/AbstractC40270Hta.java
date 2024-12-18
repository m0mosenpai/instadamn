package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hta, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40270Hta {
    public static Map A00(JLZ jlz) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jlz.AdF() != null) {
            ImageUrl AdF = jlz.AdF();
            if (AdF != null) {
                str = AdF.getUrl();
            } else {
                str = null;
            }
            A1I.put("attribution_icon_url", str);
        }
        if (jlz.AdH() != null) {
            A1I.put("attribution_label", jlz.AdH());
        }
        if (jlz.AgP() != null) {
            A1I.put("bloks_app_id", jlz.AgP());
        }
        if (jlz.AgR() != null) {
            A1I.put("bloks_attribution_type", jlz.AgR());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
