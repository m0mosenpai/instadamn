package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.creation.ml.VisualFeatureStore;
import com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository;
import com.instagram.creator.agent.settings.audience.AudienceRepository;
import com.instagram.crossposting.feed.graphql.FetchFBToIGDefaultAudienceApi;
import com.instagram.direct.avatar.powerups.repository.AvatarPowerupsAssetsGifCacheDownloader;
import com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository;
import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel;
import com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel;
import com.instagram.direct.fragment.channels.periodicpolling.threadview.BroadcastChannelPollRefresher;
import com.instagram.direct.fragment.channels.periodicpolling.threadview.CountBasedReactionRefresher;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.OptimisticNetworkOperation;
import com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository;
import com.instagram.direct.securityalert.data.SecurityAlertRepository;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.direct.store.impl.sqlite.DirectThreadsParser;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository;
import com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl;
import com.instagram.feed.media.flashmedia.FlashMediaCacheImpl;
import com.instagram.feed.media.flashmedia.FlashMediaRepository;
import com.instagram.feed.tifu.TifuViewModel;
import com.instagram.genai.imageservice.service.SingleFlightWithCache;
import com.instagram.hallpass.repository.HallPassRepository;
import com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator;
import com.instagram.igtv.draft.model.IGTVDraftsRepository;
import com.instagram.igtv.repository.series.IGTVSeriesRepository;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository;
import com.instagram.inappbrowser.expandablefooter.retailads.viewmodel.IGMetadataFooterRepository;
import com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache;
import com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder;
import com.instagram.invite.repository.InviteContactRepository;
import com.instagram.login.credentialmanager.CredentialManagerFetchHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class MAK extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAK(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A05 = 5;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A05) {
            case 0:
                A00(obj, this);
                return ((VisualFeatureStore) this.A04).A03(null, null, this, false, false);
            case 1:
                A00(obj, this);
                return ((BU4) this.A04).A03(null, this);
            case 2:
                A00(obj, this);
                return ((CreatorAIAgentCreationRepository) this.A04).A00(null, this);
            case 3:
                A00(obj, this);
                return ((AudienceRepository) this.A04).A03(null, this);
            case 4:
                A00(obj, this);
                return ((AbstractC26895Btw) this.A04).A05(null, null, this);
            case 5:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return FetchFBToIGDefaultAudienceApi.A02(null, null, null, this);
            case 6:
                A00(obj, this);
                return ((AvatarPowerupsAssetsGifCacheDownloader) this.A04).AQE(null, this);
            case 7:
                A00(obj, this);
                return AvatarReactionsRepository.A01((AvatarReactionsRepository) this.A04, this);
            case 8:
                A00(obj, this);
                return DirectStickerSuggestionsController.A01((DirectStickerSuggestionsController) this.A04, this);
            case 9:
                A00(obj, this);
                return ((DirectCardGalleryRepository) this.A04).A04(null, null, this, null);
            case 10:
                A00(obj, this);
                return ((DirectCardGalleryRepository) this.A04).A05(null, null, null, null, this);
            case 11:
                A00(obj, this);
                return ChannelDiscoveryViewModel.A02((ChannelDiscoveryViewModel) this.A04, null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A00(obj, this);
                return ChannelDiscoveryViewModel.A03((ChannelDiscoveryViewModel) this.A04, null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A00(obj, this);
                return ChannelDirectoryInboxViewModel.A05(null, (ChannelDirectoryInboxViewModel) this.A04, this);
            case 14:
                A00(obj, this);
                return ChannelDirectoryInboxViewModel.A06(null, (ChannelDirectoryInboxViewModel) this.A04, this);
            case Process.SIGTERM /* 15 */:
                A00(obj, this);
                return ((BroadcastChannelPollRefresher) this.A04).A00(null, null, this, 0, false);
            case 16:
                A00(obj, this);
                return ((CountBasedReactionRefresher) this.A04).A00(null, null, this, 0);
            case 17:
                A00(obj, this);
                return DirectShareSheetFragmentViewModel.A02((DirectShareSheetFragmentViewModel) this.A04, null, this);
            case 18:
                A00(obj, this);
                return ((NotesRepository) this.A04).A0A(null, null, this);
            case Process.SIGSTOP /* 19 */:
                A00(obj, this);
                return ((OptimisticNetworkOperation) this.A04).A05(this);
            case 20:
                A00(obj, this);
                return ((DirectDailyPromptsResponseListRepository) this.A04).A00(null, null, null, this);
            case 21:
                A00(obj, this);
                return ((SecurityAlertRepository) this.A04).A00(this);
            case 22:
                A00(obj, this);
                return ArmadilloExpressLinkMessageSender.A02(null, (ArmadilloExpressLinkMessageSender) this.A04, this);
            case 23:
                A00(obj, this);
                return ((DirectThreadsParser) this.A04).A00(null, null, this);
            case 24:
                A00(obj, this);
                return ((ContentFilterDictionaryImpl) this.A04).A01(this);
            case 25:
                A00(obj, this);
                return C164447Xj.A02((C164447Xj) this.A04, this);
            case 26:
                A00(obj, this);
                return ((FanClubApi) this.A04).A0F(null, this);
            case 27:
                A00(obj, this);
                return FanClubConsiderationViewModel.A05((FanClubConsiderationViewModel) this.A04, null, this);
            case 28:
                A00(obj, this);
                return ((FanClubMemberListCategoryRepository) this.A04).A01(null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A00(obj, this);
                return ((FanClubContentPreviewInteractorImpl) this.A04).AK7(null, this);
            case 30:
                A00(obj, this);
                return FlashMediaCacheImpl.A06((FlashMediaCacheImpl) this.A04, null, this);
            case 31:
                A00(obj, this);
                return FlashMediaCacheImpl.A04((FlashMediaCacheImpl) this.A04, null, this);
            case 32:
                A00(obj, this);
                return FlashMediaRepository.A00((FlashMediaRepository) this.A04, null, this);
            case 33:
                A00(obj, this);
                return TifuViewModel.A00((TifuViewModel) this.A04, null, this);
            case 34:
                A00(obj, this);
                return ((TifuViewModel) this.A04).A02(null, null, this);
            case 35:
                A00(obj, this);
                return AbstractC47035Kqs.A00((C47915LEj) this.A04, null, this);
            case 36:
                A00(obj, this);
                return ((SingleFlightWithCache) this.A04).A00(null, this, null);
            case 37:
                A00(obj, this);
                return ((HallPassRepository) this.A04).A01(null, this);
            case 38:
                A00(obj, this);
                return ((HallPassRepository) this.A04).A02(null, this);
            case 39:
                A00(obj, this);
                return IgSignalsTtncEstimator.A00((IgSignalsTtncEstimator) this.A04, this, null);
            case 40:
                A00(obj, this);
                return ((IGTVDraftsRepository) this.A04).AOe(null, this);
            case Seq.NULL_REFNUM /* 41 */:
                A00(obj, this);
                return ((IGTVSeriesRepository) this.A04).A02(null, null, null, null, this);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A00(obj, this);
                return ((IGTVSeriesRepository) this.A04).A03(null, null, null, null, this);
            case 43:
                A00(obj, this);
                return IGTVUploadViewModel.A00((IGTVUploadViewModel) this.A04, null, this);
            case 44:
                A00(obj, this);
                return ((ImmersiveCatchUpRepository) this.A04).A01(null, this);
            case 45:
                A00(obj, this);
                return ((IGMetadataFooterRepository) this.A04).A01(null, null, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A00(obj, this);
                return ((BrowserLinkshimUrlCache) this.A04).A01(null, null, this);
            case 47:
                A00(obj, this);
                return TranslatedCaptionsStickerViewBinder$Holder.A03(null, null, (TranslatedCaptionsStickerViewBinder$Holder) this.A04, null, this);
            case 48:
                A00(obj, this);
                return ((InviteContactRepository) this.A04).A00(null, this, false);
            default:
                A00(obj, this);
                return CredentialManagerFetchHelper.A00((CredentialManagerFetchHelper) this.A04, null, this);
        }
    }

    public static void A00(Object obj, MAK mak) {
        mak.A03 = obj;
        mak.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof MAK) && ((MAK) obj).A05 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAK(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A05 = i;
        this.A04 = obj;
    }
}
