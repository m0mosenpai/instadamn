package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hnn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39958Hnn {
    public static Map A00(JM4 jm4) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jm4.BSZ() != null) {
            A1I.put("merchant_id", jm4.BSZ());
        }
        if (jm4.Bcl() != null) {
            A1I.put("photo", jm4.Bcl().F7o());
        }
        if (jm4.Bgl() != null) {
            A1I.put("product", AbstractC37302Gc3.A0B(jm4.Bgl()));
        }
        if (jm4.getProductId() != null) {
            A1I.put("product_id", jm4.getProductId());
        }
        if (jm4.Bh6() != null) {
            A1I.put("product_image_id", jm4.Bh6());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
