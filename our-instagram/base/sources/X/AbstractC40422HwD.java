package X;

import com.instagram.api.schemas.TopicIntf;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HwD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40422HwD {
    public static Map A00(TopicIntf topicIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (topicIntf.getStatus() != null) {
            A1I.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, topicIntf.getStatus());
        }
        if (topicIntf.C9c() != null) {
            A1I.put("topic_id", topicIntf.C9c());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
