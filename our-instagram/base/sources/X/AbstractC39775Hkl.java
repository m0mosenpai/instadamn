package X;

import com.instagram.api.schemas.BoostUpsellBannerPayloadSchema;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hkl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39775Hkl {
    public static Map A00(BoostUpsellBannerPayloadSchema boostUpsellBannerPayloadSchema) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (boostUpsellBannerPayloadSchema.getActionUrl() != null) {
            A1I.put("action_url", boostUpsellBannerPayloadSchema.getActionUrl());
        }
        if (boostUpsellBannerPayloadSchema.Ah2() != null) {
            A1I.put("body_text", boostUpsellBannerPayloadSchema.Ah2());
        }
        if (boostUpsellBannerPayloadSchema.Anr() != null) {
            A1I.put(AbstractC111324zv.A00(800), boostUpsellBannerPayloadSchema.Anr());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
