package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.arp.api.AvatarEffectsApiController;
import com.instagram.arp.api.AvatarTaskHelper;
import com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment;
import com.instagram.avatars.graphql.AvatarCustomizationOptionsRepository;
import com.instagram.avatars.graphql.AvatarMutationRepository;
import com.instagram.avatars.privacysettings.AvatarPrivacySettingsRepository;
import com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository;
import com.instagram.barcelona.feed.post.data.PostViewStateRepository;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureViewModel;
import com.instagram.brandedcontent.project.BrandedContentProjectRepository;
import com.instagram.brandedcontent.repository.BrandedContentSettingsRepository;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.camera.effect.mq.effectmetadata.EffectsByIdMetadataService;
import com.instagram.casper.IgSignalsCasper;
import com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil;
import com.instagram.closefriends.audiencelists.repository.AudienceListsListRepository;
import com.instagram.comments.mvvm.data.CommentGiphyRepository;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.api.base.CoroutineHttpService$ChannelHttpResponse;
import com.instagram.compose.ui.capturable.CapturableModifierNode;
import com.instagram.contentnotes.data.OptimisticNetworkOperation;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel$special$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.sfx.repository.SfxAudioRepository;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource;
import com.instagram.creation.drafts.model.datasource.clips.ClipsImportDraftDataSource;
import com.instagram.creation.drafts.model.validation.clips.ClipsDraftValidator;
import com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel;
import com.instagram.creation.genai.magicmod.consentflow.MagicModConsentMigrator;
import com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class MAG extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAG(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A04 = obj;
    }

    public static void A00(Object obj, MAG mag) {
        mag.A02 = obj;
        mag.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof MAG) && ((MAG) obj).A03 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A03;
        A00(obj, this);
        switch (i) {
            case 0:
                return ((AvatarEffectsApiController) this.A04).A01(this);
            case 1:
                return AvatarTaskHelper.A00((AvatarTaskHelper) this.A04, null, this, null);
            case 2:
                return AvatarConvergenceUpsellBottomSheetFragment.A00((AvatarConvergenceUpsellBottomSheetFragment) this.A04, null, this);
            case 3:
                return ((C50093M9h) this.A04).A01(null, this);
            case 4:
                return ((AvatarCustomizationOptionsRepository) this.A04).A00(null, this, false);
            case 5:
                return ((AvatarMutationRepository) this.A04).A00(this);
            case 6:
                return ((AvatarPrivacySettingsRepository) this.A04).A00(null, null, this);
            case 7:
                return ((ContextualSuggestionsStickersRepository) this.A04).E5J(this);
            case 8:
                return PostViewStateRepository.A00((PostViewStateRepository) this.A04, null, this);
            case 9:
                return ((BrandedContentDisclosureBaseViewModel) this.A04).A03(this);
            case 10:
                return ((BrandedContentDisclosureMenuViewModel) this.A04).A09(this);
            case 11:
                return ((BrandedContentDisclosureViewModel) this.A04).A09(null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return ((BrandedContentProjectRepository) this.A04).A01(null, this, 0);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return ((BrandedContentSettingsRepository) this.A04).A02(this);
            case 14:
                return ((BrandedContentSettingsRepository) this.A04).A01(null, this);
            case Process.SIGTERM /* 15 */:
                return EffectTrayService.A01(null, (EffectTrayService) this.A04, this);
            case 16:
                return ((EffectsByIdMetadataService) this.A04).A02(null, this);
            case 17:
                return IgSignalsCasper.A01((IgSignalsCasper) this.A04, this);
            case 18:
                return ((AudienceListsApiUtil) this.A04).A04(null, null, null, null, null, null, this);
            case Process.SIGSTOP /* 19 */:
                return ((AudienceListsApiUtil) this.A04).A08(null, null, this);
            case 20:
                return ((AudienceListsApiUtil) this.A04).A06(null, null, null, this);
            case 21:
                return ((AudienceListsApiUtil) this.A04).A09(null, this);
            case 22:
                return ((AudienceListsApiUtil) this.A04).A07(null, null, null, null, this);
            case 23:
                return ((AudienceListsListRepository) this.A04).A00(this);
            case 24:
                return CommentGiphyRepository.A00((CommentGiphyRepository) this.A04, null, this);
            case 25:
                return MediaCommentListRepository.A08((MediaCommentListRepository) this.A04, this);
            case 26:
                return ((CoroutineHttpService$ChannelHttpResponse) this.A04).A00(this);
            case 27:
                return ((CoroutineHttpService$ChannelHttpResponse) this.A04).A01(this);
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return ((C25588BTb) this.A04).emit(null, this);
            case 30:
                return JWH.A00(this.A04, this);
            case 31:
                return CapturableModifierNode.A01((CapturableModifierNode) this.A04, this);
            case 32:
                return ((OptimisticNetworkOperation) this.A04).A00(this);
            case 33:
                return ClipsAssetHubViewModel.A00((ClipsAssetHubViewModel) this.A04, this);
            case 34:
                return GalleryMemoriesViewModel.A01((GalleryMemoriesViewModel) this.A04, this);
            case 35:
                return ((GalleryMemoriesViewModel$special$$inlined$map$1$2) this.A04).emit(null, this);
            case 36:
                return ClipsStackedTimelineFragment.A02((ClipsStackedTimelineFragment) this.A04, this);
            case 37:
                return ((SfxAudioRepository) this.A04).A01(this);
            case 38:
                return ((ClipsAudioStore) this.A04).A04(null, null, null, this);
            case 39:
                return ((ClipsDraftRepository) this.A04).A0K(null, this);
            case 40:
                return ((C2PV) this.A04).A01(0, this);
            case Seq.NULL_REFNUM /* 41 */:
                return ((ClipsDraftLocalDataSource) this.A04).A08(null, this);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return ((ClipsImportDraftDataSource) this.A04).A00(null, this);
            case 43:
                return ((ClipsImportDraftDataSource) this.A04).A01(null, this);
            case 44:
                return ((ClipsDraftValidator) this.A04).A01(null, this);
            case 45:
                return ContextualBackgroundViewModel.A00((ContextualBackgroundViewModel) this.A04, null, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return ((MagicModConsentMigrator) this.A04).A00(this);
            case 47:
                return ((BU4) this.A04).A01(null, this);
            case 48:
                return ((BU4) this.A04).A02(null, this);
            default:
                return ((CreatorAIFanNuxRepository) this.A04).A00(this);
        }
    }
}
