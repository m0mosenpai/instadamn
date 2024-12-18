package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.creator.agent.settings.audience.AudienceUseCase;
import com.instagram.creator.agent.settings.avoidedtopics.repository.AvoidedTopicsRepository;
import com.instagram.creator.agent.settings.content.sources.fetch.IGCreatorAIContentCategoriesRepository;
import com.instagram.creator.agent.settings.facts.repository.FactsRepository;
import com.instagram.creator.agent.settings.facts.viewmodel.AddFactUseCase;
import com.instagram.creator.agent.settings.keyword.KeywordRepository;
import com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository;
import com.instagram.creator.agent.settings.summary.BioSummaryRepository;
import com.instagram.creator.agent.suggestedreplies.repository.CreatorAgentSuggestedRepliesRepository;
import com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository;
import com.instagram.creator.inspiration.repository.CreatorInspirationHubAccountsRepository;
import com.instagram.creator.inspiration.repository.CreatorInspirationHubReelsHScrollPagingSource;
import com.instagram.crossposting.story.StoryCrosspostingAudienceSettingManager;
import com.instagram.direct.avatar.powerups.api.AvatarPowerupsApi;
import com.instagram.direct.avatar.reactions.api.AvatarReactionsApi;
import com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository;
import com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchRepository;
import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel;
import com.instagram.direct.fragment.channels.featuredevent.ChannelsFeaturedEventListViewModel;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository;
import com.instagram.direct.inbox.birthdays.BirthdayPogsApi;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.securityalert.debug.SecurityAlertDevUtils;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender;
import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaMessageMutationFactory;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.impl.HiddenWordsPostsDictionary;
import com.instagram.fanclub.consideration.FanClubConsiderationRepository;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import com.instagram.fanclub.consideration.FanClubCustomizedBenefitsRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class MAF extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A03;
        A00(obj, this);
        switch (i) {
            case 0:
                return AudienceUseCase.A00((AudienceUseCase) this.A04, this);
            case 1:
                return AudienceUseCase.A01((AudienceUseCase) this.A04, this);
            case 2:
                return ((AvoidedTopicsRepository) this.A04).A02(this);
            case 3:
                return ((AvoidedTopicsRepository) this.A04).A01(null, null, null, this);
            case 4:
                return ((IGCreatorAIContentCategoriesRepository) this.A04).A01(this);
            case 5:
                return ((FactsRepository) this.A04).A03(null, null, this);
            case 6:
                return ((FactsRepository) this.A04).A04(null, this);
            case 7:
                return ((AddFactUseCase) this.A04).A05(null, null, this);
            case 8:
                return ((KeywordRepository) this.A04).A05(null, this);
            case 9:
                return ((KeywordRepository) this.A04).A04(null, null, this);
            case 10:
                return ((KeywordRepository) this.A04).A03(null, null, null, this);
            case 11:
                return ((KeywordRepository) this.A04).A01(null, null, null, null, null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return ((KeywordRepository) this.A04).A02(null, null, null, null, this);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return ((CreatorAiSettingsRepository) this.A04).A02(this);
            case 14:
                return ((BioSummaryRepository) this.A04).A01(this);
            case Process.SIGTERM /* 15 */:
                return ((BioSummaryRepository) this.A04).A00(null, this);
            case 16:
                return ((CreatorAgentSuggestedRepliesRepository) this.A04).A00(null, null, this, false);
            case 17:
                return CreatorAgentSuggestedRepliesSettingsRepository.A00((CreatorAgentSuggestedRepliesSettingsRepository) this.A04, this);
            case 18:
                return CreatorAgentSuggestedRepliesSettingsRepository.A01((CreatorAgentSuggestedRepliesSettingsRepository) this.A04, this, false);
            case Process.SIGSTOP /* 19 */:
                return ((CreatorInspirationHubAccountsRepository) this.A04).A00(null, this);
            case 20:
                return CreatorInspirationHubReelsHScrollPagingSource.A00((CreatorInspirationHubReelsHScrollPagingSource) this.A04, null, this);
            case 21:
                return ((StoryCrosspostingAudienceSettingManager) this.A04).A00(this);
            case 22:
                return ((AvatarPowerupsApi) this.A04).A00(this);
            case 23:
                return ((AvatarReactionsApi) this.A04).A00(this);
            case 24:
                return AvatarReactionsRepository.A00((AvatarReactionsRepository) this.A04, null, this);
            case 25:
                return AvatarLocalStickerSearchRepository.A00((AvatarLocalStickerSearchRepository) this.A04, this);
            case 26:
                return DirectStickerSuggestionsController.A00((DirectStickerSuggestionsController) this.A04, this);
            case 27:
                return ((DirectCardGalleryRepository) this.A04).A08(null, null, null, this, false);
            case 28:
                return ((DirectCardGalleryRepository) this.A04).A09(null, null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return BroadcastChannelActivityFeedV2ViewModel.A00((BroadcastChannelActivityFeedV2ViewModel) this.A04, this, 0);
            case 30:
                return ChannelsFeaturedEventListViewModel.A00((ChannelsFeaturedEventListViewModel) this.A04, null, this);
            case 31:
                return DirectShareSheetFragmentViewModel.A03((DirectShareSheetFragmentViewModel) this.A04, null, this);
            case 32:
                return ((DirectPollMessageOptionVotersRepository) this.A04).A01(null, null, this, false);
            case 33:
                return ((BirthdayPogsApi) this.A04).A00(this);
            case 34:
                return ((C31649DvF) this.A04).A00(null, this);
            case 35:
                return ((NotesRepository) this.A04).A09(null, null, null, this);
            case 36:
                return ((JWH) this.A04).A02(this, false);
            case 37:
                return ((AbstractC48512Ld9) this.A04).A01(this, false);
            case 38:
                return SecurityAlertDevUtils.A02(null, (SecurityAlertDevUtils) this.A04, this);
            case 39:
                return ArmadilloExpressNoteReplySender.A03((ArmadilloExpressNoteReplySender) this.A04, null, this, 0, 0, false);
            case 40:
                return ArmadilloExpressNoteReplySender.A00(null, (ArmadilloExpressNoteReplySender) this.A04, this, 0, 0);
            case Seq.NULL_REFNUM /* 41 */:
                return ((DirectConfigureMediaMessageMutationFactory) this.A04).A03(null, null, null, this);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return C2043892u.A00((C2043892u) this.A04, this);
            case 43:
                return ((DictionaryRepository) this.A04).A01(this);
            case 44:
                return ((HiddenWordsPostsDictionary) this.A04).Bbf(this, false);
            case 45:
                return ((FanClubConsiderationRepository) this.A04).A01(null, this, false);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return ((FanClubConsiderationRepository) this.A04).A02(null, this, false);
            case 47:
                return FanClubConsiderationViewModel.A06((FanClubConsiderationViewModel) this.A04, this);
            case 48:
                return ((FanClubCustomizedBenefitsRepository) this.A04).A00(null, this);
            default:
                return ((FanClubCustomizedBenefitsRepository) this.A04).A01(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAF(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A03 = i;
        this.A04 = obj;
    }

    public static void A00(Object obj, MAF maf) {
        maf.A02 = obj;
        maf.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof MAF) && ((MAF) obj).A03 == i) {
            return true;
        }
        return false;
    }
}
