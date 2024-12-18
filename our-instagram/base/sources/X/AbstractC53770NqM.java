package X;

import com.instagram.api.schemas.BCPDealOutputTypeEnum;
import com.instagram.api.schemas.BrandedContentProjectAction;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.NqM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC53770NqM {
    public static Map A00(BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (brandedContentProjectMetadataIntf.AYK() != null) {
            BrandedContentProjectAction AYK = brandedContentProjectMetadataIntf.AYK();
            C14360o3.A0B(AYK, 0);
            A1I.put("action", AYK.A00);
        }
        if (brandedContentProjectMetadataIntf.AaB() != null) {
            A1I.put("ads_permission_required", brandedContentProjectMetadataIntf.AaB());
        }
        if (brandedContentProjectMetadataIntf.Ahu() != null) {
            A1I.put("brand_id", brandedContentProjectMetadataIntf.Ahu());
        }
        if (brandedContentProjectMetadataIntf.Ai2() != null) {
            A1I.put("brand_username", brandedContentProjectMetadataIntf.Ai2());
        }
        if (brandedContentProjectMetadataIntf.AkB() != null) {
            A1I.put("campaign_app_android_package_name", brandedContentProjectMetadataIntf.AkB());
        }
        if (brandedContentProjectMetadataIntf.AkC() != null) {
            A1I.put("campaign_app_ios_content_id", brandedContentProjectMetadataIntf.AkC());
        }
        if (brandedContentProjectMetadataIntf.Avs() != null) {
            BCPDealOutputTypeEnum Avs = brandedContentProjectMetadataIntf.Avs();
            if (Avs != null) {
                str = Avs.A00;
            } else {
                str = null;
            }
            A1I.put("deal_output_type", str);
        }
        if (brandedContentProjectMetadataIntf.BiT() != null) {
            A1I.put("project_id", brandedContentProjectMetadataIntf.BiT());
        }
        if (brandedContentProjectMetadataIntf.BiU() != null) {
            A1I.put("project_name", brandedContentProjectMetadataIntf.BiU());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
