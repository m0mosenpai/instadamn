package X;

import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeSubmissionShareInfo;
import com.instagram.direct.fragment.prompts.dailyprompt.model.DailyPromptsShareInfo;
import com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel;
import com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel;
import com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem;
import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;
import com.instagram.direct.inbox.DirectInviteContactViewModel;
import com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import com.instagram.direct.inbox.notes.models.NoteCreationSource;
import com.instagram.direct.inbox.notes.reply.MusicNoteQuickReplySheetContent;
import com.instagram.direct.inbox.notes.reply.QuickReplySheetContent;
import com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel;
import com.instagram.direct.intf.DirectReplyModalPrivateReplyInfo;
import com.instagram.direct.messagethread.collections.model.DirectCollectionArguments;
import com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData;
import com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionLabelSpan;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;
import com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate;
import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo;
import com.instagram.direct.model.launcher.AutoSendMessageData;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import com.instagram.direct.model.textformatting.FormattedText;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.direct.prompts.DirectEditAddYoursParams;
import com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$SharedThreadContentInfo;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import com.instagram.direct.sharetostory.data.ChannelChallengeStickerData;
import com.instagram.direct.sharetostory.data.JoinChatStickerData;
import com.instagram.direct.sharetostory.data.MessageShareStickerData;
import com.instagram.direct.ui.collections.DirectThreadDetailsCollectionRowViewModel;
import com.instagram.direct.ui.collections.DirectThreadDetailsCollectionViewModel;
import com.instagram.direct.visual.model.DirectVisualMessageItemModel;
import com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.education.NudityReceiverEducationSafetyTipsViewModel;
import com.instagram.discoverpeople.model.FindPeopleButtonOverride;
import com.instagram.discovery.api.model.SectionPagination;
import com.instagram.discovery.categories.model.Category;
import com.instagram.discovery.chaining.intf.DiscoveryChainingConfig;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig;
import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.discovery.filters.intf.FilterConfig;
import com.instagram.discovery.mediamap.fragment.LocationListFragmentMode;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.discovery.mediamap.model.MediaMapPinPreview;
import com.instagram.discovery.refinement.model.QueryInformation;
import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.discovery.refinement.model.RefinementAttributes;
import com.instagram.discovery.related.model.RelatedItem;
import com.instagram.explore.intf.ExploreFragmentConfig;
import com.instagram.fanclub.intf.FanClubGuidedActivationProfileBannerParams;
import com.instagram.fanclub.intf.UserPayFanclubUpsellParams;
import com.instagram.feed.feeditem.SuggestedChannels;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.feed.su.model.MiddleStateCardUser;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import com.instagram.filterkit.filter.FilterGroup;
import com.instagram.filterkit.filter.IdentityFilter;
import com.instagram.filterkit.filter.resize.LanczosFilter;
import com.instagram.filterkit.filter.resize.ResizeFilter;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.instagram.follow.autofollowback.AutoFollowBackBottomSheetData;
import com.instagram.friendmap.configs.AggregatedBannerConfig;
import com.instagram.friendmap.configs.FriendMapLaunchConfig;
import com.instagram.friendmap.configs.PagerSheetLaunchConfig;
import com.instagram.friendmap.data.MapText;
import com.instagram.friendmap.view.fragment.FriendMapAudienceListFragment$CustomAudienceLaunchConfig;
import com.instagram.friendmap.view.fragment.FriendMapFloatyClusterFragment$FriendMapClusterLaunchConfig;
import com.instagram.friendmap.view.fragment.FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig;
import com.instagram.friendmap.view.fragment.FriendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig;
import com.instagram.fx.igxfb.IgxfbNetEgoCTABannerParams;
import com.instagram.guides.intf.GuideCreationLoggerState;
import com.instagram.guides.intf.GuideCreationType;
import com.instagram.guides.intf.GuideFragmentConfig;
import com.instagram.guides.intf.model.MinimalGuide;
import com.instagram.guides.intf.model.MinimalGuideItem;
import com.instagram.guides.model.GuideItemAttachment;
import com.instagram.hallpass.model.HallPassMemberViewModel;
import com.instagram.hallpass.model.HallPassViewModel;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class LNL implements Parcelable.Creator {
    public final int A00;

    public LNL(int i) {
        this.A00 = i;
    }

    public static LNL A00(int i) {
        return new LNL(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:200:0x060c  */
    /* JADX WARN: Type inference failed for: r0v191, types: [com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v193, types: [java.lang.Object, com.instagram.direct.model.DirectAREffectShare] */
    /* JADX WARN: Type inference failed for: r0v204, types: [com.instagram.direct.model.mentions.SendMentionData$MentionData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v205, types: [java.lang.Object, com.instagram.direct.model.textformatting.FormattedText] */
    /* JADX WARN: Type inference failed for: r0v207, types: [com.instagram.direct.model.thread.DiscoverableThreadInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v249, types: [com.instagram.direct.ui.collections.DirectThreadDetailsCollectionRowViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v275, types: [com.instagram.discovery.categories.model.Category, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v318, types: [com.instagram.discovery.mediamap.model.LocationPageInformation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v320, types: [java.lang.Object, com.instagram.discovery.mediamap.model.MediaMapPin] */
    /* JADX WARN: Type inference failed for: r0v321, types: [java.lang.Object, com.instagram.discovery.mediamap.model.MediaMapPinPreview] */
    /* JADX WARN: Type inference failed for: r0v322, types: [java.lang.Object, com.instagram.discovery.refinement.model.QueryInformation] */
    /* JADX WARN: Type inference failed for: r0v323, types: [java.lang.Object, com.instagram.discovery.refinement.model.Refinement] */
    /* JADX WARN: Type inference failed for: r0v324, types: [com.instagram.discovery.refinement.model.RefinementAttributes, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v325, types: [com.instagram.discovery.related.model.RelatedItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v331, types: [com.instagram.fanclub.intf.UserPayFanclubUpsellParams, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v412, types: [java.lang.Object, com.instagram.guides.intf.model.MinimalGuide] */
    /* JADX WARN: Type inference failed for: r0v413, types: [com.instagram.guides.intf.model.MinimalGuideItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v418, types: [com.instagram.guides.model.GuideItemAttachment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r39v0, types: [java.lang.Object, android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r3v70, types: [X.Vba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v119, types: [com.instagram.guides.intf.model.MinimalGuideItem[]] */
    /* JADX WARN: Type inference failed for: r4v120 */
    /* JADX WARN: Type inference failed for: r4v121 */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r39) {
        /*
            Method dump skipped, instructions count: 5628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LNL.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ChannelChallengeSubmissionShareInfo[i];
            case 1:
                return new DailyPromptsShareInfo[i];
            case 2:
                return new PollMessageOptionViewModel[i];
            case 3:
                return new PollMessageVoterInfoViewModel[i];
            case 4:
                return new ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem[i];
            case 5:
                return new InviteLinkShareInfo[i];
            case 6:
                return new DirectInviteContactViewModel[i];
            case 7:
                return new ClipsInteractionReplySheetContent[i];
            case 8:
                return new NoteAudienceItem[i];
            case 9:
                return new NoteCreationSource[i];
            case 10:
                return new MusicNoteQuickReplySheetContent[i];
            case 11:
                return new QuickReplySheetContent[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new FullscreenBannerViewModel[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new FullscreenBannerViewModel.SectionBulletPoint[i];
            case 14:
                return new DirectReplyModalPrivateReplyInfo[i];
            case Process.SIGTERM /* 15 */:
                return new Parcelable[i];
            case 16:
                return new DirectCollectionArguments[i];
            case 17:
                return new LongPressActionData[i];
            case 18:
                return new LongPressActionLabelSpan[i];
            case Process.SIGSTOP /* 19 */:
                return new MessageActionsViewModel[i];
            case 20:
                return new ThemeViewModelDelegate[i];
            case 21:
                return new DirectAREffectShare[i];
            case 22:
                return new DirectForwardingParams[i];
            case 23:
                return new BroadcastChannelXpostingChannelInfo[i];
            case 24:
                return new AutoSendMessageData[i];
            case 25:
                return new SendMentionData$MentionData[i];
            case 26:
                return new FormattedText[i];
            case 27:
                return new DiscoverableThreadInfo[i];
            case 28:
                return new MsysThreadSubtype.BlendDualSend[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new MsysThreadSubtype.BlendDualSendNoNetwork[i];
            case 30:
                return new MsysThreadSubtype.BtvCompanion[i];
            case 31:
                return new MsysThreadSubtype.DualSendShadow[i];
            case 32:
                return new MsysThreadSubtype.Standard[i];
            case 33:
                return new MsysThreadSubtype.Unknown[i];
            case 34:
                return new DirectEditAddYoursParams[i];
            case 35:
                return new DirectCustomReactionTabModel[i];
            case 36:
                return new DirectCustomReactionTabModel.TabType[i];
            case 37:
                return new GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo[i];
            case 38:
                return new GroupLinkPreviewResponse$SharedThreadContentInfo[i];
            case 39:
                return new GroupLinkPreviewResponse$Success[i];
            case 40:
                return new ChannelChallengeStickerData[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new JoinChatStickerData[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new MessageShareStickerData[i];
            case 43:
                return new DirectThreadDetailsCollectionRowViewModel[i];
            case 44:
                return new DirectThreadDetailsCollectionViewModel[i];
            case 45:
                return new DirectVisualMessageItemModel[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new DirectVisualMessageItemModel.MediaFields.RemixMedia[i];
            case 47:
                return new DirectVisualMessageItemModel.MediaFields.TamMedia[i];
            case 48:
                return new DirectWellBeingUpsellBottomSheetData[i];
            case 49:
                return new NudityReceiverEducationSafetyTipsViewModel[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new FindPeopleButtonOverride[i];
            case 51:
                return new SectionPagination[i];
            case 52:
                return new Category[i];
            case 53:
                return new DiscoveryChainingConfig[i];
            case 54:
                return new DiscoveryChainingItem[i];
            case 55:
                return new EntityContextualFeedConfig[i];
            case 56:
                return new FiltersLoggingInfo[i];
            case 57:
                return new FilterConfig[i];
            case 58:
                return new LocationListFragmentMode[i];
            case 59:
                return new MapEntryPoint[i];
            case 60:
                return new MediaMapQuery[i];
            case 61:
                return new LocationPageInformation[i];
            case 62:
                return new MediaMapPin[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new MediaMapPinPreview[i];
            case 64:
                return new QueryInformation[i];
            case 65:
                return new Refinement[i];
            case 66:
                return new RefinementAttributes[i];
            case 67:
                return new RelatedItem[i];
            case 68:
                return new ExploreFragmentConfig[i];
            case 69:
                return new FanClubGuidedActivationProfileBannerParams[i];
            case 70:
                return new UserPayFanclubUpsellParams[i];
            case 71:
                return new SuggestedChannels[i];
            case 72:
                return new ContextualFeedNetworkConfig[i];
            case 73:
                return new MiddleStateCardUser[i];
            case 74:
                return new IntentAwareAdPivotState[i];
            case 75:
                return new FilterGroup[i];
            case 76:
                return new IdentityFilter[i];
            case 77:
                return new com.instagram.filterkit.filter.resize.IdentityFilter[i];
            case 78:
                return new LanczosFilter[i];
            case 79:
                return new ResizeFilter[i];
            case 80:
                return new IgMetaSessionImpl[i];
            case 81:
                return new AutoFollowBackBottomSheetData[i];
            case 82:
                return new AggregatedBannerConfig[i];
            case 83:
                return new FriendMapLaunchConfig[i];
            case 84:
                return new PagerSheetLaunchConfig[i];
            case 85:
                return new MapText.Raw[i];
            case 86:
                return new MapText.Res[i];
            case 87:
                return new FriendMapAudienceListFragment$CustomAudienceLaunchConfig[i];
            case 88:
                return new FriendMapFloatyClusterFragment$FriendMapClusterLaunchConfig[i];
            case 89:
                return new FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig[i];
            case 90:
                return new FriendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig[i];
            case 91:
                return new IgxfbNetEgoCTABannerParams[i];
            case 92:
                return new GuideCreationLoggerState[i];
            case 93:
                return new GuideCreationType[i];
            case 94:
                return new GuideFragmentConfig[i];
            case 95:
                return new MinimalGuide[i];
            case 96:
                return new MinimalGuideItem[i];
            case 97:
                return new GuideItemAttachment[i];
            case 98:
                return new HallPassMemberViewModel[i];
            default:
                return new HallPassViewModel[i];
        }
    }
}
