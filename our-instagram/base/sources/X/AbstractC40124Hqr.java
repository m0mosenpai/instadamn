package X;

import com.instagram.api.schemas.OrganicCTAType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hqr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40124Hqr {
    public static Map A00(JLT jlt) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jlt.AtY() != null) {
            A1I.put("cta_action_links", jlt.AtY());
        }
        if (jlt.getCtaSubtitle() != null) {
            A1I.put("cta_subtitle", jlt.getCtaSubtitle());
        }
        if (jlt.getCtaTitle() != null) {
            A1I.put("cta_title", jlt.getCtaTitle());
        }
        if (jlt.Atr() != null) {
            OrganicCTAType Atr = jlt.Atr();
            C14360o3.A0B(Atr, 0);
            A1I.put("cta_type", Atr.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
