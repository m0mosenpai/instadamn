package X;

import com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus;

/* renamed from: X.KjN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46584KjN {
    public static final BrandedContentBrandTaggingRequestApprovalStatus A00(String str) {
        BrandedContentBrandTaggingRequestApprovalStatus brandedContentBrandTaggingRequestApprovalStatus = (BrandedContentBrandTaggingRequestApprovalStatus) BrandedContentBrandTaggingRequestApprovalStatus.A01.get(str);
        if (brandedContentBrandTaggingRequestApprovalStatus == null) {
            return BrandedContentBrandTaggingRequestApprovalStatus.A0A;
        }
        return brandedContentBrandTaggingRequestApprovalStatus;
    }
}
