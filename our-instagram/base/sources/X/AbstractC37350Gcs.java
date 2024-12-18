package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DirectMediaFallbackUrlIntf;
import com.instagram.model.mediasize.VideoVersionIntf;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gcs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37350Gcs {
    public static Map A00(VideoVersionIntf videoVersionIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (videoVersionIntf.B4E() != null) {
            DirectMediaFallbackUrlIntf B4E = videoVersionIntf.B4E();
            if (B4E != null) {
                treeUpdaterJNI = B4E.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("fallback", treeUpdaterJNI);
        }
        if (videoVersionIntf.BDS() != null) {
            linkedHashMap.put(IgReactMediaPickerNativeModule.HEIGHT, videoVersionIntf.BDS());
        }
        if (videoVersionIntf.getId() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, videoVersionIntf.getId());
        }
        if (videoVersionIntf.CBl() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, videoVersionIntf.CBl());
        }
        if (videoVersionIntf.getUrl() != null) {
            linkedHashMap.put("url", videoVersionIntf.getUrl());
        }
        if (videoVersionIntf.CDQ() != null) {
            linkedHashMap.put("url_expiration_timestamp_us", videoVersionIntf.CDQ());
        }
        if (videoVersionIntf.CHg() != null) {
            linkedHashMap.put(IgReactMediaPickerNativeModule.WIDTH, videoVersionIntf.CHg());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
