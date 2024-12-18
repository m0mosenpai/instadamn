package X;

import com.instagram.api.schemas.IGCreatorIncentiveProgramFetchEntryPoint;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Eu6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33656Eu6 {
    public static final C1ON A00(C25621Ms c25621Ms, IGCreatorIncentiveProgramFetchEntryPoint iGCreatorIncentiveProgramFetchEntryPoint, Integer num, String str) {
        c25621Ms.A06();
        c25621Ms.A03();
        c25621Ms.A0B("api/v1/creators/incentive_platform/get_bonuses_deal_metadata_lists/");
        c25621Ms.A0R(C32143EAq.class, FRz.class);
        if (str != null) {
            c25621Ms.A9s("m_pk", str);
        }
        if (iGCreatorIncentiveProgramFetchEntryPoint != null) {
            c25621Ms.A9s(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, iGCreatorIncentiveProgramFetchEntryPoint.A00);
        }
        if (num != null) {
            c25621Ms.A0D("scheduled_time", num.intValue());
        }
        C1ON A0N = c25621Ms.A0N();
        C14360o3.A0C(A0N, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BonusesDealsMetadataResponseIntf>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BonusesDealsMetadataResponseIntf>>");
        return A0N;
    }
}
