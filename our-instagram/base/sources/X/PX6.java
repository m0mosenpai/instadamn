package X;

import androidx.work.CoroutineWorker;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.feed.media.flashmedia.FlashMediaCacheImpl;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.genai.imageservice.service.GenAIImageService;
import com.instagram.igtv.repository.series.IGTVSeriesRepository;
import com.instagram.mediakit.repository.upload.MediaKitUploadApi;
import com.instagram.ml.hashtag.IgContextualHashtagsProcessor;
import com.instagram.newsfeed.followrequests.data.FollowRequestsActionDataSource;
import com.instagram.opal.impl.data.OpalRepoUtil;
import com.instagram.pendingmedia.service.common.IngestionStepDebugLogger;
import com.instagram.pendingmedia.service.common.ParsingSyncHttpService;
import com.instagram.pendingmedia.service.igapi.ConfigureMediaStep;
import com.instagram.pendingmedia.service.upload.UploadFileStep;
import com.instagram.pendingmedia.service.upload.armadilloexpress.RenderVideoStep;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.security.attestation.keystore.worker.KeyAttestationUtils;
import com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationUtils;
import com.instagram.settings2.core.data.SettingsRepository;
import com.instagram.settings2.core.viewmodel.UiStateKt;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.wonderwall.api.WallApiGraphQLImpl;
import com.instagram.wonderwall.repository.WallPendingPostManager;
import com.instagram.zero.headers.IGZeroHeadersConfigFetch;
import com.instagram.zero.headers.IGZeroHeadersSideEffects;
import com.instagram.zero.headers.IGZeroHeadersStorage;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel;

/* loaded from: classes9.dex */
public final class PX6 extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                A01(obj, this);
                return FlashMediaCacheImpl.A00(null, (FlashMediaCacheImpl) this.A05, null, this);
            case 1:
                A01(obj, this);
                return FxSsoViewModel.A00(null, null, null, (FxSsoViewModel) this.A05, this);
            case 2:
                A01(obj, this);
                return GenAIImageService.A05((GenAIImageService) this.A05, null, null, this);
            case 3:
                A01(obj, this);
                return GenAIImageService.A04((GenAIImageService) this.A05, null, null, this);
            case 4:
                A01(obj, this);
                return ((IGTVSeriesRepository) this.A05).A04(null, null, this);
            case 5:
                A01(obj, this);
                return ((MediaKitUploadApi) this.A05).A01(null, null, this);
            case 6:
                A01(obj, this);
                return MediaKitUploadApi.A00(null, (MediaKitUploadApi) this.A05, null, this);
            case 7:
                A01(obj, this);
                return ((IgContextualHashtagsProcessor) this.A05).A00(null, null, this);
            case 8:
                A01(obj, this);
                return ((CoroutineWorker) this.A05).A03(this);
            case 9:
                A01(obj, this);
                return ((FollowRequestsActionDataSource) this.A05).A02(null, this, null, false);
            case 10:
                A01(obj, this);
                return ((FollowRequestsActionDataSource) this.A05).A03(null, this, null, false);
            case 11:
                A01(obj, this);
                return ((OpalRepoUtil) this.A05).A02(null, null, null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A01(obj, this);
                return IngestionStepDebugLogger.A00(null, (IngestionStepDebugLogger) this.A05, null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A01(obj, this);
                return ((ParsingSyncHttpService) this.A05).A02(null, null, null, this);
            case 14:
                A01(obj, this);
                return ConfigureMediaStep.A00(null, (ConfigureMediaStep) this.A05, this);
            case Process.SIGTERM /* 15 */:
                A01(obj, this);
                return UploadFileStep.A00(null, (UploadFileStep) this.A05, this);
            case 16:
                A01(obj, this);
                return ((RenderVideoStep) this.A05).F8t(null, this);
            case 17:
                this.A05 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return KeyAttestationUtils.A00(null, null, null, null, null, null, this, null, false);
            case 18:
                this.A05 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return PlayIntegrityAttestationUtils.A00(null, null, null, null, null, null, this, null, false);
            case Process.SIGSTOP /* 19 */:
                A01(obj, this);
                return ((SettingsRepository) this.A05).A08(null, this);
            case 20:
                A01(obj, this);
                return ((SettingsRepository) this.A05).A09(null, this);
            case 21:
                this.A05 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return UiStateKt.A06(null, null, null, this);
            case 22:
                A01(obj, this);
                return ((IgLiveCobroadcastRepository) this.A05).A06(null, null, this);
            case 23:
                A01(obj, this);
                return IgLiveCommentsRepository.A03((IgLiveCommentsRepository) this.A05, null, this, false);
            case 24:
                A01(obj, this);
                return ((WallApiGraphQLImpl) this.A05).A02(null, null, this);
            case 25:
                A01(obj, this);
                return WallPendingPostManager.A01(null, (WallPendingPostManager) this.A05, null, this);
            case 26:
                A01(obj, this);
                return ((IGZeroHeadersConfigFetch) this.A05).A00(null, null, this);
            case 27:
                A01(obj, this);
                return ((IGZeroHeadersSideEffects) this.A05).A00(null, this);
            case 28:
                A01(obj, this);
                return ((IGZeroHeadersStorage) this.A05).A02(null, null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A01(obj, this);
                return ((C57113PVc) this.A05).emit(null, this);
            case 30:
                A01(obj, this);
                return ImagineNetworkService.A03(null, (ImagineNetworkService) this.A05, null, null, null, null, this, false);
            case 31:
                A01(obj, this);
                return WriteWithAICreationViewModel.A01(null, (WriteWithAICreationViewModel) this.A05, null, null, this);
            case 32:
                A01(obj, this);
                return WriteWithAICreationViewModel.A02(null, (WriteWithAICreationViewModel) this.A05, null, null, this);
            case 33:
                A01(obj, this);
                return C55209OeS.A00((C55209OeS) this.A05, null, null, this);
            case 34:
                A01(obj, this);
                return C55214Oeb.A03(null, null, null, (C55214Oeb) this.A05, null, this);
            case 35:
                A01(obj, this);
                return C37866GlL.A02(null, (C37866GlL) this.A05, null, this);
            default:
                A01(obj, this);
                return C38937HCk.A00((C38937HCk) this.A05, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX6(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A06 = i;
        this.A05 = obj;
    }

    public static void A00(Object obj, Object obj2, Object obj3, PX6 px6, int i) {
        px6.A01 = obj;
        px6.A02 = obj2;
        px6.A03 = obj3;
        px6.A00 = i;
    }

    public static void A01(Object obj, PX6 px6) {
        px6.A04 = obj;
        px6.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof PX6) && ((PX6) obj).A06 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX6(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A06 = i;
    }
}
