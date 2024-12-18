package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.I2y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40718I2y {
    public static Map A00(JMG jmg) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jmg.AZD() != null) {
            A1I.put("ad_id", jmg.AZD());
        }
        if (jmg.AtX() != null) {
            A1I.put("cta", jmg.AtX().F7o());
        }
        if (jmg.BSW() != null) {
            AbstractC37301Gc2.A1Q(jmg.BSW(), A1I);
        }
        if (jmg.BSY() != null) {
            A1I.put("merchant_details", jmg.BSY());
        }
        if (jmg.Bh7() != null) {
            A1I.put("product_image_urls", jmg.Bh7());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
