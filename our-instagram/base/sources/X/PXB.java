package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.shopping.repository.featuredproducts.FeaturedProductsMediaApi;
import com.instagram.stickersearch.AvatarStickerInteractor;
import com.instagram.trials.impl.TrialsPreferencesImpl;
import com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl;
import com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel;
import com.instagram.unifiedfeedback.disclosure.UnifiedFeedbackDisclosureApi;
import com.instagram.urlhandlers.messagingadinspiration.MessagingAdInspirationDataFetcher;
import com.instagram.user.follow.GraphQLFollowRequestApiKt;
import com.instagram.userpay.api.UserPayApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastInfoApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastSettingsApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveExploreLiveApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveFollowStatusApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveHeartbeatApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveJoinRequestsApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveLikesApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi;
import go.Seq;

/* loaded from: classes9.dex */
public final class PXB extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                A02(obj, this);
                return ((FeaturedProductsMediaApi) this.A02).A00(null, null, this);
            case 1:
            case 2:
            case 6:
            case 10:
                A01(obj, this);
                return ((J6P) this.A01).emit(null, this);
            case 3:
            case 7:
            case 8:
            case 9:
            case 11:
                A01(obj, this);
                return ((MWC) this.A01).emit(null, this);
            case 4:
                A02(obj, this);
                return ((AvatarStickerInteractor) this.A02).A01(null, null, null, null, null, null, this);
            case 5:
                A01(obj, this);
                return AvatarStickerInteractor.A00(null, null, null, null, null, null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A02(obj, this);
                return ((TrialsPreferencesImpl) this.A02).A00(this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A02(obj, this);
                return ((TrialsPreferencesImpl) this.A02).A02(this);
            case 14:
                A02(obj, this);
                return ((ClipsTrialBottomSheetRepositoryImpl) this.A02).A01(null, null, this);
            case Process.SIGTERM /* 15 */:
                A02(obj, this);
                return ((ClipsTrialBottomSheetRepositoryImpl) this.A02).A02(null, null, this);
            case 16:
                A02(obj, this);
                return ((ClipsTrialBottomSheetRepositoryImpl) this.A02).A00(null, null, this);
            case 17:
                A02(obj, this);
                return ((ClipsTrialBottomSheetRepositoryImpl) this.A02).A03(null, this);
            case 18:
                A02(obj, this);
                return ClipsTrialBottomSheetViewModel.A00((ClipsTrialBottomSheetViewModel) this.A02, this);
            case Process.SIGSTOP /* 19 */:
                A02(obj, this);
                return ((UnifiedFeedbackDisclosureApi) this.A02).A01(this);
            case 20:
                A02(obj, this);
                return MessagingAdInspirationDataFetcher.A00(null, (MessagingAdInspirationDataFetcher) this.A02, this);
            case 21:
                A01(obj, this);
                return GraphQLFollowRequestApiKt.A02(null, null, null, this);
            case 22:
                A01(obj, this);
                return GraphQLFollowRequestApiKt.A03(null, null, null, this);
            case 23:
                A01(obj, this);
                return ((MY6) this.A01).emit(null, this);
            case 24:
                A01(obj, this);
                return ((C57113PVc) this.A01).emit(null, this);
            case 25:
                A02(obj, this);
                return ((UserPayApi) this.A02).A00(this);
            case 26:
                A02(obj, this);
                return ((IgLiveBroadcastInfoApi) this.A02).A00(null, this);
            case 27:
                A02(obj, this);
                return ((IgLiveBroadcastSettingsApi) this.A02).A01(null, this);
            case 28:
                A02(obj, this);
                return ((IgLiveBroadcastSettingsApi) this.A02).A02(null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A02(obj, this);
                return ((IgLiveBroadcastSettingsApi) this.A02).A03(null, this);
            case 30:
                A02(obj, this);
                return ((IgLiveBroadcastSettingsApi) this.A02).A00(null, null, this);
            case 31:
                A02(obj, this);
                return ((IgLiveBroadcastSettingsApi) this.A02).A04(null, this);
            case 32:
                A02(obj, this);
                return ((IgLiveCommentsApi) this.A02).A00(null, null, this);
            case 33:
                A02(obj, this);
                return ((IgLiveCommentsApi) this.A02).A01(null, null, null, null, this, 0, 0L, 0L, 0L);
            case 34:
                A02(obj, this);
                return ((IgLiveCommentsApi) this.A02).A02(null, null, this);
            case 35:
                A02(obj, this);
                return ((IgLiveCommentsApi) this.A02).A05(null, null, this, 0L);
            case 36:
                A02(obj, this);
                return ((IgLiveCommentsApi) this.A02).A03(null, null, this);
            case 37:
                A02(obj, this);
                return ((IgLiveCommentsApi) this.A02).A06(null, null, this, 0L);
            case 38:
                A02(obj, this);
                return ((IgLiveCommentsApi) this.A02).A04(null, null, this);
            case 39:
                A02(obj, this);
                return ((IgLiveExploreLiveApi) this.A02).A00(this, false);
            case 40:
                A02(obj, this);
                return ((IgLiveFollowStatusApi) this.A02).A00(null, this);
            case Seq.NULL_REFNUM /* 41 */:
                A02(obj, this);
                return ((IgLiveHeartbeatApi) this.A02).A01(null, this, 0L);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A02(obj, this);
                return ((IgLiveJoinRequestsApi) this.A02).A00(null, this);
            case 43:
                A02(obj, this);
                return ((IgLiveJoinRequestsApi) this.A02).A01(null, this, 0, 0L);
            case 44:
                A02(obj, this);
                return ((IgLiveLikesApi) this.A02).A00(null, null, this);
            case 45:
                A02(obj, this);
                return ((IgLiveModerationApi) this.A02).A00(null, null, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A02(obj, this);
                return ((IgLiveModerationApi) this.A02).A01(null, null, this);
            case 47:
                A02(obj, this);
                return ((IgLiveModerationApi) this.A02).A02(null, null, this);
            case 48:
                A02(obj, this);
                return ((IgLiveModerationApi) this.A02).A03(null, null, this);
            default:
                A02(obj, this);
                return ((IgLiveModerationApi) this.A02).A04(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXB(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
    }

    public static PXB A00(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        return new PXB(obj, interfaceC23621Ds, i, 42);
    }

    public static void A01(Object obj, PXB pxb) {
        pxb.A02 = obj;
        pxb.A00 |= Integer.MIN_VALUE;
    }

    public static void A02(Object obj, PXB pxb) {
        pxb.A01 = obj;
        pxb.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A03(Object obj, int i) {
        if ((obj instanceof PXB) && ((PXB) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXB(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A03 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXB(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }
}
