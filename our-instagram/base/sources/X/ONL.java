package X;

import com.instagram.api.schemas.BCPDealOutputTypeEnum;
import com.instagram.api.schemas.BrandedContentProjectAction;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class ONL {
    public static BrandedContentProjectMetadata parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            BrandedContentProjectAction brandedContentProjectAction = null;
            Boolean bool = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            BCPDealOutputTypeEnum bCPDealOutputTypeEnum = null;
            String str5 = null;
            String str6 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("action".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    brandedContentProjectAction = (BrandedContentProjectAction) BrandedContentProjectAction.A01.get(A1P2);
                    if (brandedContentProjectAction == null) {
                        brandedContentProjectAction = BrandedContentProjectAction.A07;
                    }
                } else if ("ads_permission_required".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("brand_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("brand_username".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("campaign_app_android_package_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("campaign_app_ios_content_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("deal_output_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    bCPDealOutputTypeEnum = (BCPDealOutputTypeEnum) BCPDealOutputTypeEnum.A01.get(A1P);
                    if (bCPDealOutputTypeEnum == null) {
                        bCPDealOutputTypeEnum = BCPDealOutputTypeEnum.A06;
                    }
                } else if ("project_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("project_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (brandedContentProjectAction == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("action", c16l, "BrandedContentProjectMetadata");
            } else if (str5 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("project_id", c16l, "BrandedContentProjectMetadata");
            } else {
                return new BrandedContentProjectMetadata(bCPDealOutputTypeEnum, brandedContentProjectAction, bool, str, str2, str3, str4, str5, str6);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, BrandedContentProjectMetadata brandedContentProjectMetadata) {
        anonymousClass182.A0d();
        BrandedContentProjectAction brandedContentProjectAction = brandedContentProjectMetadata.A01;
        if (brandedContentProjectAction != null) {
            anonymousClass182.A0S("action", brandedContentProjectAction.A00);
        }
        Boolean bool = brandedContentProjectMetadata.A02;
        if (bool != null) {
            anonymousClass182.A0T("ads_permission_required", bool.booleanValue());
        }
        String str = brandedContentProjectMetadata.A03;
        if (str != null) {
            anonymousClass182.A0S("brand_id", str);
        }
        String str2 = brandedContentProjectMetadata.A04;
        if (str2 != null) {
            anonymousClass182.A0S("brand_username", str2);
        }
        String str3 = brandedContentProjectMetadata.A05;
        if (str3 != null) {
            anonymousClass182.A0S("campaign_app_android_package_name", str3);
        }
        String str4 = brandedContentProjectMetadata.A06;
        if (str4 != null) {
            anonymousClass182.A0S("campaign_app_ios_content_id", str4);
        }
        BCPDealOutputTypeEnum bCPDealOutputTypeEnum = brandedContentProjectMetadata.A00;
        if (bCPDealOutputTypeEnum != null) {
            anonymousClass182.A0S("deal_output_type", bCPDealOutputTypeEnum.A00);
        }
        String str5 = brandedContentProjectMetadata.A07;
        if (str5 != null) {
            anonymousClass182.A0S("project_id", str5);
        }
        String str6 = brandedContentProjectMetadata.A08;
        if (str6 != null) {
            anonymousClass182.A0S("project_name", str6);
        }
        anonymousClass182.A0a();
    }
}
