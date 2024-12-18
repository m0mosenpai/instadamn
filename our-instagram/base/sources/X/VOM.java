package X;

import com.instagram.api.schemas.GreetingAttachmentIntf;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VOM {
    public static Map A00(GreetingAttachmentIntf greetingAttachmentIntf) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (greetingAttachmentIntf.BDS() != null) {
            linkedHashMap.put(IgReactMediaPickerNativeModule.HEIGHT, greetingAttachmentIntf.BDS());
        }
        if (greetingAttachmentIntf.getUrl() != null) {
            linkedHashMap.put("url", greetingAttachmentIntf.getUrl());
        }
        if (greetingAttachmentIntf.CHg() != null) {
            linkedHashMap.put(IgReactMediaPickerNativeModule.WIDTH, greetingAttachmentIntf.CHg());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
