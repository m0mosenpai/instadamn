package X;

import com.instagram.api.schemas.IGCTATextVariant;
import com.instagram.api.schemas.IGCTATextVariantSource;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Euo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33700Euo {
    public static Map A00(IGCTATextVariant iGCTATextVariant) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (iGCTATextVariant.Atp() != null) {
            A1I.put("cta_text_replacement", iGCTATextVariant.Atp());
        }
        if (iGCTATextVariant.BBX() != null) {
            A1I.put("has_emoji", iGCTATextVariant.BBX());
        }
        if (iGCTATextVariant.BL7() != null) {
            A1I.put("language", iGCTATextVariant.BL7());
        }
        if (iGCTATextVariant.C6k() != null) {
            IGCTATextVariantSource C6k = iGCTATextVariant.C6k();
            if (C6k != null) {
                str = C6k.A00;
            } else {
                str = null;
            }
            A1I.put("text_source", str);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
