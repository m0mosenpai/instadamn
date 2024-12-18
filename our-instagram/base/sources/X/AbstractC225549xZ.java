package X;

import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9xZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC225549xZ {
    public static Map A00(SubscriptionStickerDictIntf subscriptionStickerDictIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        User Asq = subscriptionStickerDictIntf.Asq();
        if (Asq != null) {
            A1I.put("creator", Asq.A07());
        }
        if (subscriptionStickerDictIntf.Asv() != null) {
            A1I.put("creator_id", subscriptionStickerDictIntf.Asv());
        }
        if (subscriptionStickerDictIntf.Asz() != null) {
            A1I.put("creator_profile_pic_url", subscriptionStickerDictIntf.Asz());
        }
        if (subscriptionStickerDictIntf.At6() != null) {
            A1I.put("creator_username", subscriptionStickerDictIntf.At6());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
