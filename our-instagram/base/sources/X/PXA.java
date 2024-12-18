package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.login.credentialmanager.CredentialManagerSaveHelper;
import com.instagram.mediakit.repository.MediaKitRepository;
import com.instagram.ml.audiotranscription.CalDownloader;
import com.instagram.moments.data.StandaloneMomentsDataSource;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;
import com.instagram.newsfeed.followrequests.data.FollowRequestsRepository;
import com.instagram.newsfeed.viewmodel.ActivityFeedViewModel;
import com.instagram.nme.contextualpromo.ContextualPromoApi;
import com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder;
import com.instagram.opal.impl.data.OpalEditRepository;
import com.instagram.opal.impl.data.OpalRepository;
import com.instagram.pendingmedia.service.impl.MediaUploader;
import com.instagram.pendingmedia.service.impl.PendingMediaWorker;
import com.instagram.pendingmedia.service.impl.ShareSpinnableClipHelper;
import com.instagram.pendingmedia.service.upload.UploadAudioStep;
import com.instagram.pendingmedia.service.upload.UploadImageStep;
import com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressMediaUploader;
import com.instagram.pendingmedia.service.upload.armadilloexpress.ArmadilloExpressUploadMediaStep;
import com.instagram.profile.productsonprofile.producttab.ui.ProductTabRepository;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.repository.common.MemoryCache;
import com.instagram.security.attestation.playintegrity.worker.IgPlayIntegrityAttestationUtils;
import com.instagram.settings2.core.data.SettingsRepository;
import com.instagram.settings2.core.session.AbstractValueResolverImpl;
import com.instagram.settings2.core.viewmodel.ScreenModelExtensionsKt;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import com.instagram.share.facebook.upsell.data.CLNoticeRepository;
import com.instagram.stickersearch.api.AvatarStickerGraphQLApi;
import com.instagram.stickersearch.api.AvatarStickerSearchRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import go.Seq;

/* loaded from: classes9.dex */
public final class PXA extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A05) {
            case 0:
                A02(obj, this);
                return CredentialManagerSaveHelper.A00((CredentialManagerSaveHelper) this.A04, null, null, null, this);
            case 1:
                A02(obj, this);
                return C29461bN.A00((C29461bN) this.A04, null, this);
            case 2:
                A02(obj, this);
                return ((MediaKitRepository) this.A04).A08(null, this);
            case 3:
                A02(obj, this);
                return ((PVX) this.A04).A00(null, this);
            case 4:
                A02(obj, this);
                return ((MediaKitRepository) this.A04).A07(null, this);
            case 5:
                A02(obj, this);
                return ((CalDownloader) this.A04).A00(null, null, this);
            case 6:
                A02(obj, this);
                return StandaloneMomentsDataSource.A01((StandaloneMomentsDataSource) this.A04, this);
            case 7:
                A02(obj, this);
                return ((OnboardingRepository) this.A04).A02(null, this);
            case 8:
                A02(obj, this);
                return FollowRequestsRepository.A00(null, (FollowRequestsRepository) this.A04, this);
            case 9:
                A02(obj, this);
                return ActivityFeedViewModel.A00(null, (ActivityFeedViewModel) this.A04, this);
            case 10:
                A02(obj, this);
                return ((ContextualPromoApi) this.A04).A00(null, null, null, null, this);
            case 11:
                A02(obj, this);
                return ((HandlerExecutorAndBuilder) this.A04).A01(this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A02(obj, this);
                return ((OpalEditRepository) this.A04).A02(null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A02(obj, this);
                return ((OpalRepository) this.A04).A03(null, this);
            case 14:
                A02(obj, this);
                return ((C9GJ) this.A04).A00(this);
            case Process.SIGTERM /* 15 */:
                A02(obj, this);
                return MediaUploader.A00(null, (MediaUploader) this.A04, this);
            case 16:
                A02(obj, this);
                return PendingMediaWorker.A01(null, null, (PendingMediaWorker) this.A04, null, this);
            case 17:
                A02(obj, this);
                return ((ShareSpinnableClipHelper) this.A04).A00(null, this, null);
            case 18:
                A02(obj, this);
                return UploadAudioStep.A02(null, (UploadAudioStep) this.A04, this);
            case Process.SIGSTOP /* 19 */:
                A02(obj, this);
                return ((UploadImageStep) this.A04).F8t(null, this);
            case 20:
                A02(obj, this);
                return ((ArmadilloExpressMediaUploader) this.A04).A00(null, this);
            case 21:
                A02(obj, this);
                return ((ArmadilloExpressUploadMediaStep) this.A04).F8t(null, this);
            case 22:
                A02(obj, this);
                return ((ProductTabRepository) this.A04).A00(null, null, this, 0);
            case 23:
                A02(obj, this);
                return ((QuickSnapRepository) this.A04).A01(null, this);
            case 24:
                A02(obj, this);
                return ((MemoryCache) this.A04).A02(null, this, null);
            case 25:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return IgPlayIntegrityAttestationUtils.A00(null, null, null, null, this, null, 0, false);
            case 26:
                A02(obj, this);
                return ((SettingsRepository) this.A04).A05(null, this);
            case 27:
                A02(obj, this);
                return ((SettingsRepository) this.A04).A07(null, this);
            case 28:
                A02(obj, this);
                return AbstractC55145Od4.A01(this.A04, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A02(obj, this);
                return AbstractC55145Od4.A01(this.A04, this);
            case 30:
                A02(obj, this);
                return AbstractC55145Od4.A01(this.A04, this);
            case 31:
                A02(obj, this);
                return AbstractC55145Od4.A01(this.A04, this);
            case 32:
                A02(obj, this);
                return AbstractC55145Od4.A01(this.A04, this);
            case 33:
                A02(obj, this);
                return AbstractC55145Od4.A01(this.A04, this);
            case 34:
                A02(obj, this);
                return AbstractC55145Od4.A01(this.A04, this);
            case 35:
                A02(obj, this);
                return ((AbstractValueResolverImpl) this.A04).A01(null, this);
            case 36:
                A02(obj, this);
                return ((AbstractValueResolverImpl) this.A04).A00(null, this, null);
            case 37:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ScreenModelExtensionsKt.A01(null, null, null, null, null, this, false);
            case 38:
                A02(obj, this);
                return SettingsScreenViewModel.A02((SettingsScreenViewModel) this.A04, null, this);
            case 39:
                A02(obj, this);
                return ((CLNoticeRepository) this.A04).A00(this);
            case 40:
                A02(obj, this);
                return LJY.A01((LJY) this.A04, null, this, 0L);
            case Seq.NULL_REFNUM /* 41 */:
                A02(obj, this);
                return LJY.A00((LJY) this.A04, null, null, this);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A02(obj, this);
                return ((AvatarStickerGraphQLApi) this.A04).A00(null, null, null, null, this, false);
            case 43:
                A02(obj, this);
                return ((C43813JZa) this.A04).A00(null, this);
            case 44:
                A02(obj, this);
                return ((AvatarStickerSearchRepository) this.A04).A00(null, this);
            case 45:
                A02(obj, this);
                return ((AvatarStickerSearchRepository) this.A04).A01(null, null, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A02(obj, this);
                return ((IgLiveCommentsRepository) this.A04).A0B(null, null, this);
            case 47:
                A02(obj, this);
                return IgLiveCommentsRepository.A05((IgLiveCommentsRepository) this.A04, this);
            case 48:
                A02(obj, this);
                return ((IgLiveCommentsRepository) this.A04).A0G(null, this);
            default:
                A02(obj, this);
                return IgLiveCommentsRepository.A06((IgLiveCommentsRepository) this.A04, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXA(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A05 = i;
        this.A04 = obj;
    }

    public static PXA A00(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        return new PXA(obj, interfaceC23621Ds, i);
    }

    public static void A01(Object obj, Object obj2, PXA pxa, int i) {
        pxa.A01 = obj;
        pxa.A02 = obj2;
        pxa.A00 = i;
    }

    public static void A02(Object obj, PXA pxa) {
        pxa.A03 = obj;
        pxa.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A03(Object obj, int i) {
        if ((obj instanceof PXA) && ((PXA) obj).A05 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXA(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A05 = i;
    }
}
