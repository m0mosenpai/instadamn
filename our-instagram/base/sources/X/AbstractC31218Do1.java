package X;

import com.instagram.api.schemas.ProfilePicUrlInfo;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Do1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC31218Do1 {
    public static Map A00(ProfilePicUrlInfo profilePicUrlInfo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        profilePicUrlInfo.getHeight();
        linkedHashMap.put(IgReactMediaPickerNativeModule.HEIGHT, Integer.valueOf(profilePicUrlInfo.getHeight()));
        if (profilePicUrlInfo.getUrl() != null) {
            linkedHashMap.put("url", profilePicUrlInfo.getUrl());
        }
        profilePicUrlInfo.getWidth();
        linkedHashMap.put(IgReactMediaPickerNativeModule.WIDTH, Integer.valueOf(profilePicUrlInfo.getWidth()));
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
