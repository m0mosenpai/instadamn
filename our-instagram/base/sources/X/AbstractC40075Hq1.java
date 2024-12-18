package X;

import com.instagram.api.schemas.MetaGalleryNetegoInStoryMediaType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hq1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40075Hq1 {
    public static Map A00(JKP jkp) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jkp.BRo() != null) {
            MetaGalleryNetegoInStoryMediaType BRo = jkp.BRo();
            if (BRo != null) {
                str = BRo.A00;
            } else {
                str = null;
            }
            AbstractC37300Gc1.A19(str, A1I);
        }
        if (jkp.BS0() != null) {
            A1I.put("media_url", jkp.BS0());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
