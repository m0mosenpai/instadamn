package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.settings.language.ContentLanguageSettingsRepository;
import com.instagram.settings2.core.data.SettingsRepository;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import com.instagram.settings2.extension.customstorage.savestorytogallery.SaveStoryToGalleryCustomStorageHandler;
import com.instagram.shopping.repository.mediafeed.FeaturedProductsMediaFeedRepository;
import com.instagram.sponsored.asyncads.requestpathsignals.persistence.QSRealtimeSignalRoom;
import com.instagram.spotlight.fetch.SpotlightFetchRepository;
import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;
import com.instagram.stickersearch.api.ODRAvatarStickerRepository;
import com.instagram.trials.repository.ActiveTrialsRepository;
import com.instagram.user.userlist.data.LikesListRemoteDataSource;
import com.instagram.user.userlist.data.LikesListRepository;
import com.instagram.video.live.mvvm.model.domainmodel.IgLiveBroadcastInfoKt;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel;
import com.instagram.wellbeing.equity.diversity.DiversityInfoRepository;
import com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository;
import com.instagram.zero.headers.IGZeroHeadersStorage;
import com.instagram.zero.zbd.ZeroBalanceDetectionIg4aHttpRequest;
import com.meta.compose.material.bottomsheet.AnchoredDraggableState;
import com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository;
import com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository;
import com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import com.meta.metaai.promptsheet.creation.impl.data.PromptSheetAIRepository;
import com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel;
import go.Seq;

/* renamed from: X.PWy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57146PWy extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A04) {
            case 0:
                A00(obj, this);
                return ((ContentLanguageSettingsRepository) this.A03).A01(this);
            case 1:
                A00(obj, this);
                return ((SettingsRepository) this.A03).A0A(this);
            case 2:
                A00(obj, this);
                return AbstractC55145Od4.A01(this.A03, this);
            case 3:
                A00(obj, this);
                return AbstractC55145Od4.A01(this.A03, this);
            case 4:
                A00(obj, this);
                return AbstractC55145Od4.A01(this.A03, this);
            case 5:
                A00(obj, this);
                return AbstractC55145Od4.A01(this.A03, this);
            case 6:
                A00(obj, this);
                return AbstractC55145Od4.A01(this.A03, this);
            case 7:
                A00(obj, this);
                return SettingsScreenViewModel.A01(null, (SettingsScreenViewModel) this.A03, this);
            case 8:
                A00(obj, this);
                return ((SaveStoryToGalleryCustomStorageHandler) this.A03).A00(this, false);
            case 9:
                A00(obj, this);
                return ((FeaturedProductsMediaFeedRepository) this.A03).A00(this);
            case 10:
                A00(obj, this);
                return ((QSRealtimeSignalRoom) this.A03).A00(null, this, 0L);
            case 11:
                A00(obj, this);
                return SpotlightFetchRepository.A00((SpotlightFetchRepository) this.A03, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A00(obj, this);
                return ((AvatarStickerPreRenderInteractor) this.A03).A05(this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A00(obj, this);
                return ((ODRAvatarStickerRepository) this.A03).A00(null, null, this);
            case 14:
                A00(obj, this);
                return ((ODRAvatarStickerRepository) this.A03).A01(null, null, this);
            case Process.SIGTERM /* 15 */:
                A00(obj, this);
                return ((ActiveTrialsRepository) this.A03).A00(null, this, 0);
            case 16:
                A00(obj, this);
                return LikesListRemoteDataSource.A00(null, null, (LikesListRemoteDataSource) this.A03, this, 0L);
            case 17:
                A00(obj, this);
                return ((LikesListRepository) this.A03).A04(null, this);
            case 18:
                this.A03 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return IgLiveBroadcastInfoKt.A01(null, null, this);
            case Process.SIGSTOP /* 19 */:
                A00(obj, this);
                return ((IgLiveCobroadcastRepository) this.A03).A02(null, null, null, this, 0L);
            case 20:
                A00(obj, this);
                return ((IgLiveCommentsRepository) this.A03).A0H(this);
            case 21:
                A00(obj, this);
                return ((IgLiveExploreRepository) this.A03).A03(this);
            case 22:
                A00(obj, this);
                return IgLiveJoinRequestsRepository.A00((IgLiveJoinRequestsRepository) this.A03, null, this);
            case 23:
                A00(obj, this);
                return ((IgLiveModerationRepository) this.A03).A00(null, null, this);
            case 24:
                A00(obj, this);
                return ((IgLiveQuestionsRepository) this.A03).A03(null, this, 0L);
            case 25:
                A00(obj, this);
                return ((IgLiveQuestionsRepository) this.A03).A01(null, this);
            case 26:
                A00(obj, this);
                return IgLiveViewerJoinFlowRepository.A00((IgLiveViewerJoinFlowRepository) this.A03, null, this);
            case 27:
                A00(obj, this);
                return ((IgLiveViewerJoinFlowRepository) this.A03).A02(null, this);
            case 28:
                A00(obj, this);
                return ((IgLiveViewerJoinFlowRepository) this.A03).A03(null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A00(obj, this);
                return IgLiveViewerLikesViewModel.A01((IgLiveViewerLikesViewModel) this.A03, this);
            case 30:
                A00(obj, this);
                return DiversityInfoRepository.A02((DiversityInfoRepository) this.A03, this);
            case 31:
                A00(obj, this);
                return DiversityInfoRepository.A00(null, (DiversityInfoRepository) this.A03, this);
            case 32:
                A00(obj, this);
                return IgZeroDogfoodingEasyRepository.A00((IgZeroDogfoodingEasyRepository) this.A03, null, null, this);
            case 33:
                A00(obj, this);
                return ((IGZeroHeadersStorage) this.A03).A04(null, this);
            case 34:
                A00(obj, this);
                return ZeroBalanceDetectionIg4aHttpRequest.A00((ZeroBalanceDetectionIg4aHttpRequest) this.A03, this, null);
            case 35:
                A00(obj, this);
                return ((AnchoredDraggableState) this.A03).A06(null, this, null);
            case 36:
                A00(obj, this);
                return ((AnchoredDraggableState) this.A03).A05(null, null, this, null);
            case 37:
                A00(obj, this);
                return ((ImagineEditRepository) this.A03).A02(null, this);
            case 38:
                A00(obj, this);
                return ((ImagineGenerationImageRepository) this.A03).A02(null, this);
            case 39:
                A00(obj, this);
                return ImagineGenerationImageRepository.A00((ImagineGenerationImageRepository) this.A03, null, null, null, null, this, false);
            case 40:
                A00(obj, this);
                return ((MEmuNetworkService) this.A03).A02(null, null, this, null, false);
            case Seq.NULL_REFNUM /* 41 */:
                A00(obj, this);
                return ImagineNetworkService.A05((ImagineNetworkService) this.A03, null, null, this);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A00(obj, this);
                return ImagineNetworkService.A01(null, (ImagineNetworkService) this.A03, null, null, this);
            case 43:
                A00(obj, this);
                return ((PromptSheetAIRepository) this.A03).A00(null, this);
            case 44:
                A00(obj, this);
                return PromptSheetAIViewModel.A01((PromptSheetAIViewModel) this.A03, null, this, null);
            case 45:
                A00(obj, this);
                return PromptSheetAIViewModel.A00((PromptSheetAIViewModel) this.A03, null, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A00(obj, this);
                return C51035Mgj.A00((C51035Mgj) this.A03, null, this);
            case 47:
                A00(obj, this);
                return ((C55214Oeb) this.A03).A08(null, null, null, this);
            case 48:
                A00(obj, this);
                return C31841Dz0.A00((C31841Dz0) this.A03, this);
            default:
                A00(obj, this);
                return C51046Mgy.A01((C51046Mgy) this.A03, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57146PWy(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A04 = i;
        this.A03 = obj;
    }

    public static void A00(Object obj, C57146PWy c57146PWy) {
        c57146PWy.A02 = obj;
        c57146PWy.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof C57146PWy) && ((C57146PWy) obj).A04 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57146PWy(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A04 = 18;
    }
}
