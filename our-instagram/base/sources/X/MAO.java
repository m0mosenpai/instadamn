package X;

import androidx.compose.foundation.HoverableNode;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.datastore.core.DataMigrationInitializer$Companion;
import androidx.datastore.core.SingleProcessDataStore;
import androidx.paging.FlattenedPageController;
import androidx.paging.PageFetcher;
import com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl;
import com.facebook.avatar.expresso.odr.ODRController;
import com.facebook.avatar.expresso.odr.asset.ODRAssetManager;
import com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import com.facebookpay.addresstypeahead.controller.AddressTypeaheadController;
import com.instagram.aistudio.profile.AiStudioProfileBannerDataSource;
import com.instagram.appinitializer.reliability.MessageQueueTimelineInitializer;
import com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel;
import com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService$getSearchResults$$inlined$map$1$2;
import com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository;
import com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository;
import com.instagram.avatars.suggestions.LexiconRecommendationProvider;
import com.instagram.barcelona.share.data.PermalinkRepository;
import com.instagram.barcelona.weblink.data.FetchLinkMetadataCache;
import com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.camera.effect.mq.effectmetadata.EffectsByIdMetadataService;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.compose.igds.components.bottomsheet.IgComposeBottomSheetNavigator;
import com.instagram.compose.ui.capturable.CapturableModifierNode;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;
import com.instagram.creation.drafts.model.clips.ClipsNetworkImportDraftRepository;
import com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel;
import com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource;
import com.instagram.creation.genai.mai.adapter.MetaAIIntentsGeneratedImageResultAdapter;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class MAO extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAO(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A05 = 1;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A05) {
            case 0:
                A01(obj, this);
                return HoverableNode.A00((HoverableNode) this.A04, this);
            case 1:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return SelectionGesturesKt.A00(null, null, null, this);
            case 2:
                A01(obj, this);
                return DataMigrationInitializer$Companion.A00((DataMigrationInitializer$Companion) this.A04, null, null, this);
            case 3:
                A01(obj, this);
                return SingleProcessDataStore.A05((SingleProcessDataStore) this.A04, this);
            case 4:
                A01(obj, this);
                return ((JWH) this.A04).A01(null, this);
            case 5:
                A01(obj, this);
                return ((MTK) this.A04).A00(null, this);
            case 6:
                A01(obj, this);
                return ((FlattenedPageController) this.A04).A01(this);
            case 7:
                A01(obj, this);
                return ((C57113PVc) this.A04).emit(null, this);
            case 8:
                A01(obj, this);
                return ((C44071Jdw) this.A04).emit(null, this);
            case 9:
                A01(obj, this);
                return PageFetcher.A00((PageFetcher) this.A04, null, this);
            case 10:
                A01(obj, this);
                return ((AvatarStickerCacheImpl) this.A04).A05(this);
            case 11:
                A01(obj, this);
                return ODRController.A07((ODRController) this.A04, null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A01(obj, this);
                return ((ODRAssetManager) this.A04).A01(null, null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A01(obj, this);
                return ((OdrSnapshotHelper) this.A04).A03(null, this, null, null, 0);
            case 14:
                A01(obj, this);
                return OdrSnapshotHelper.A01((OdrSnapshotHelper) this.A04, null, this, null);
            case Process.SIGTERM /* 15 */:
                A01(obj, this);
                return GoogleAuthController.A06(null, null, (GoogleAuthController) this.A04, this);
            case 16:
                A01(obj, this);
                return InAppPurchaseControllerCoro.A01((InAppPurchaseControllerCoro) this.A04, null, this);
            case 17:
                A01(obj, this);
                return AddressTypeaheadController.A00((AddressTypeaheadController) this.A04, null, null, this);
            case 18:
                A01(obj, this);
                return ((AiStudioProfileBannerDataSource) this.A04).AXS(null, this);
            case Process.SIGSTOP /* 19 */:
                A01(obj, this);
                return MessageQueueTimelineInitializer.A01((MessageQueueTimelineInitializer) this.A04, this);
            case 20:
                A01(obj, this);
                return AppreciationBuyAndSendViewModel.A00((AppreciationBuyAndSendViewModel) this.A04, null, this);
            case 21:
                A01(obj, this);
                return ((AppreciationGiftFeedRepository) this.A04).A01(null, null, this, false);
            case 22:
                A01(obj, this);
                return ((AppreciationGiftFeedRepository) this.A04).A02(null, this);
            case 23:
                A01(obj, this);
                return ((C208369Jv) this.A04).emit(null, this);
            case 24:
                A01(obj, this);
                return ((MiniGalleryService$getSearchResults$$inlined$map$1$2) this.A04).emit(null, this);
            case 25:
                A01(obj, this);
                return JWH.A00(this.A04, this);
            case 26:
                A01(obj, this);
                return C142456c7.A01((C142456c7) this.A04, null, this);
            case 27:
                A01(obj, this);
                return AvatarStickerSuggestionRepository.A00((AvatarStickerSuggestionRepository) this.A04, null, this);
            case 28:
                A01(obj, this);
                return ((ContextualSuggestionsPerIntentRepository) this.A04).E5J(this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A01(obj, this);
                return ((LexiconRecommendationProvider) this.A04).COA(null, this);
            case 30:
                A01(obj, this);
                return ((PermalinkRepository) this.A04).A00(null, null, null, this);
            case 31:
                A01(obj, this);
                return ((FetchLinkMetadataCache) this.A04).A00(null, null, this);
            case 32:
                A01(obj, this);
                return ((BugReportComposerFragment$onClickScreenshotThumbnail$1) this.A04).A00(null, this);
            case 33:
                A01(obj, this);
                return EffectTrayService.A02(null, (EffectTrayService) this.A04, this);
            case 34:
                A01(obj, this);
                return EffectsByIdMetadataService.A00(null, (EffectsByIdMetadataService) this.A04, this);
            case 35:
                A01(obj, this);
                return ((MediaCommentListRepository) this.A04).A0A(null, null, this);
            case 36:
                A01(obj, this);
                return ((MediaCommentListRepository) this.A04).A0B(null, this);
            case 37:
                A01(obj, this);
                return MediaCommentListRepository.A05((MediaCommentListRepository) this.A04, null, null, this);
            case 38:
                A01(obj, this);
                return ((IgComposeBottomSheetNavigator) this.A04).A00(null, this);
            case 39:
                A01(obj, this);
                return CapturableModifierNode.A00(null, (CapturableModifierNode) this.A04, this);
            case 40:
                A01(obj, this);
                return ((C50090M9e) this.A04).A00(null, this);
            case Seq.NULL_REFNUM /* 41 */:
                A01(obj, this);
                return MagicMediaRemixEditController.A00((MagicMediaRemixEditController) this.A04, null, this);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A01(obj, this);
                return ((ClipsSharingDraftViewModel) this.A04).A04(this);
            case 43:
                A01(obj, this);
                return ClipsDraftRepository.A05((ClipsDraftRepository) this.A04, null, null, this);
            case 44:
                A01(obj, this);
                return ClipsDraftRepository.A02(null, (ClipsDraftRepository) this.A04, this);
            case 45:
                A01(obj, this);
                return ((ClipsDraftPreviewItemRepository) this.A04).A00(null, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A01(obj, this);
                return ClipsNetworkImportDraftRepository.A00((ClipsNetworkImportDraftRepository) this.A04, null, null, null, null, this, null);
            case 47:
                A01(obj, this);
                return ((ContextualBackgroundViewModel) this.A04).A01(null, this);
            case 48:
                A01(obj, this);
                return MagicModImageGenerationDataSource.A00((MagicModImageGenerationDataSource) this.A04, null, null, this);
            default:
                A01(obj, this);
                return ((MetaAIIntentsGeneratedImageResultAdapter) this.A04).A00(null, null, null, this);
        }
    }

    public static void A00(Object obj, Object obj2, MAO mao, int i) {
        mao.A01 = obj;
        mao.A02 = obj2;
        mao.A00 = i;
    }

    public static void A01(Object obj, MAO mao) {
        mao.A03 = obj;
        mao.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof MAO) && ((MAO) obj).A05 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAO(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A05 = i;
        this.A04 = obj;
    }
}
