package X;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.facebook.cameracore.ardelivery.model.SparkVisionCapability;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.ClipChainType;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.ContextualHighlightType;
import com.instagram.api.schemas.DirectAudioFallbackUrl;
import com.instagram.api.schemas.ElectionAddYoursInfoDict;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.PollType;
import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.api.schemas.RingSpecImpl;
import com.instagram.api.schemas.RingSpecPoint;
import com.instagram.api.schemas.RingSpecPointImpl;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.api.schemas.ScreenTimeScreenType;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.api.schemas.ShopManagementAccessState;
import com.instagram.api.schemas.ShoppingOnboardingState;
import com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.api.schemas.SocialProofInfoImpl;
import com.instagram.api.schemas.SponsoredAdsDisclaimerType;
import com.instagram.api.schemas.StickerTraySectionCTAType;
import com.instagram.api.schemas.StoryLinkInfoDict;
import com.instagram.api.schemas.StoryPollColorType;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryPromptFailureTooltipDict;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.api.schemas.StoryTemplateAssetDict;
import com.instagram.api.schemas.StoryTemplateCaptionDict;
import com.instagram.api.schemas.StoryTemplateDict;
import com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict;
import com.instagram.api.schemas.StoryTemplateFillableStickersDict;
import com.instagram.api.schemas.StoryTemplateFillableStickersDictImpl;
import com.instagram.api.schemas.StoryTemplateGiphyStickerDict;
import com.instagram.api.schemas.StoryTemplateGiphyStickerImageDict;
import com.instagram.api.schemas.StoryTemplateMusicAssetInfoDict;
import com.instagram.api.schemas.StoryTemplateMusicStickerDict;
import com.instagram.api.schemas.StoryTemplateReshareMediaDict;
import com.instagram.api.schemas.StoryTemplateStaticOverlayDict;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SuggestedUsersStyle;
import com.instagram.api.schemas.TIFUAppDestinationEnum;
import com.instagram.api.schemas.TestimonialDictImpl;
import com.instagram.api.schemas.TextPostAppHeaderFollowVariant;
import com.instagram.api.schemas.TextPostAppSuggestionCardProfileContextIdentifier;
import com.instagram.api.schemas.ThreadsInFeedUnitTypeEnum;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.UndoStyle;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.api.schemas.UserTagInfoDict;
import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.api.schemas.WhatsAppAttributionInfoImpl;
import com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility;
import com.instagram.api.schemas.XDTTextPostAppAccountPrivacyOptions;
import com.instagram.api.schemas.XFBsizeCalibrationScore;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.common.AvatarInfo;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerDirectData;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.intf.ClipsWatchAndBrowseData;
import com.instagram.clips.model.ClipsReplyBarData;
import com.instagram.clips.model.ClipsSpotlightData;
import com.instagram.clips.model.ClipsTogetherData;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfo;
import com.instagram.clips.model.metadata.PlaylistContext;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.FaceCenter;
import com.instagram.common.gallery.GeneratedMediaMetadata;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.typedurl.directlogging.DirectImageLoggingData;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat;
import com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.direct.messagethread.reactions.model.ReactionViewModel;
import com.instagram.direct.model.DirectMessageEditHistory;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.direct.model.comments.DirectMessageComments;
import com.instagram.direct.model.mentions.MentionedEntity;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.model.thread.ChannelsContextLine;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;
import com.instagram.direct.smartsuggestion.model.SmartSuggestionCTA;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.feed.audio.Audio;
import com.instagram.feed.media.CameraToolInfo;
import com.instagram.feed.media.CreativeConfig;
import com.instagram.feed.media.EffectActionSheet;
import com.instagram.feed.media.EffectPreview;
import com.instagram.feed.media.ReelCTA;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.model.androidlink.AndroidLinkImpl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.rixu.RIXUChainingBehaviorDefinition;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelMultiProductLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.AudioType;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.9Av, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206139Av implements Parcelable.Creator {
    public final int A00;

    public C206139Av(int i) {
        this.A00 = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new RepostRestrictedReason[i];
            case 1:
                return new RingSpecImpl[i];
            case 2:
                return new RingSpecPointImpl[i];
            case 3:
                return new SMBPartnerType[i];
            case 4:
                return new ScreenTimeScreenType[i];
            case 5:
                return new SellerShoppableFeedType[i];
            case 6:
                return new ShopManagementAccessState[i];
            case 7:
                return new ShoppingOnboardingState[i];
            case 8:
                return new SocialContextType[i];
            case 9:
                return new SocialProofInfoImpl[i];
            case 10:
                return new SponsoredAdsDisclaimerType[i];
            case 11:
                return new StickerTraySectionCTAType[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new StoryLinkInfoDict[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new StoryPollColorType[i];
            case 14:
                return new StoryPromptDisablementState[i];
            case Process.SIGTERM /* 15 */:
                return new StoryPromptFailureTooltipDict[i];
            case 16:
                return new StoryPromptTappableData[i];
            case 17:
                return new StoryPromptType[i];
            case 18:
                return new StoryTemplateAssetDict[i];
            case Process.SIGSTOP /* 19 */:
                return new StoryTemplateCaptionDict[i];
            case 20:
                return new StoryTemplateDict[i];
            case 21:
                return new StoryTemplateFillableStickersDictImpl[i];
            case 22:
                return new StoryTemplateGiphyStickerDict[i];
            case 23:
                return new StoryTemplateGiphyStickerImageDict[i];
            case 24:
                return new StoryTemplateMusicStickerDict[i];
            case 25:
                return new StoryTemplateStaticOverlayDict[i];
            case 26:
                return new SubscriptionStickerDict[i];
            case 27:
                return new SuggestedUsersStyle[i];
            case 28:
                return new TIFUAppDestinationEnum[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new TestimonialDictImpl[i];
            case 30:
                return new TextPostAppHeaderFollowVariant[i];
            case 31:
                return new TextPostAppSuggestionCardProfileContextIdentifier[i];
            case 32:
                return new ThreadsInFeedUnitTypeEnum[i];
            case 33:
                return new TrackDataImpl[i];
            case 34:
                return new UndoStyle[i];
            case 35:
                return new UserMonetizationProductType[i];
            case 36:
                return new UserTagInfoDict[i];
            case 37:
                return new WearablesAppAttributionType[i];
            case 38:
                return new WhatsAppAttributionInfoImpl[i];
            case 39:
                return new XDTTextAppQuoteAttachmentEligibility[i];
            case 40:
                return new XDTTextPostAppAccountPrivacyOptions[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new XFBsizeCalibrationScore[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new AvatarCoinFlipConfig[i];
            case 43:
                return new AvatarCoinFlipSticker[i];
            case 44:
                return new AvatarInfo[i];
            case 45:
                return new CameraAREffect[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new ClipsViewerConfig[i];
            case 47:
                return new ClipsViewerDirectData[i];
            case 48:
                return new ClipsViewerSource[i];
            case 49:
                return new ClipsWatchAndBrowseData[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new ClipsReplyBarData[i];
            case 51:
                return new ClipsContextualHighlightInfo[i];
            case 52:
                return new PlaylistContext[i];
            case 53:
                return new Draft[i];
            case 54:
                return new GeneratedMediaMetadata[i];
            case 55:
                return new Medium[i];
            case 56:
                return new RemoteMedia[i];
            case 57:
                return new ImmersiveMediaFields[i];
            case 58:
                return new MediaUploadMetadata[i];
            case 59:
                return new ImageCacheKey[i];
            case 60:
                return new SimpleImageUrl[i];
            case 61:
                return new DirectImageLoggingData[i];
            case 62:
                return new ReboundHorizontalScrollView.SavedState[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new SocialContextBubbleUiState[i];
            case 64:
                return new CropInfo[i];
            case 65:
                return new CameraConfiguration[i];
            case 66:
                return new NineSixteenLayoutConfigImpl[i];
            case 67:
                return new CameraSpec[i];
            case 68:
                return new GalleryGridFormat[i];
            case 69:
                return new CaptureRuleSystemState[i];
            case 70:
                return new PhotoFilter[i];
            case 71:
                return new SurfaceCropFilter[i];
            case 72:
                return new Capabilities[i];
            case 73:
                return new MediaViewerReplyBarEligibilityCheckerImpl[i];
            case 74:
                return new NoteAudience[i];
            case 75:
                return new NoteStyle[i];
            case 76:
                return new DirectCountBasedReaction[i];
            case 77:
                return new ReactionViewModel[i];
            case 78:
                return new DirectMessageEditHistory[i];
            case 79:
                return new DirectThreadThemeInfo[i];
            case 80:
                return new DirectMessageComments[i];
            case 81:
                return new MentionedEntity[i];
            case 82:
                return new MessagingUser[i];
            case 83:
                return new ChannelsContextLine[i];
            case 84:
                return new CreatorBroadcastThreadInfo[i];
            case 85:
                return new CreatorSubscriberThreadInfo[i];
            case 86:
                return new DirectPromptTypes[i];
            case 87:
                return new SmartSuggestion[i];
            case 88:
                return new SmartSuggestionCTA[i];
            case 89:
                return new DirectThreadAnalyticsParams[i];
            case 90:
                return new PrivacyMediaOverlayViewModel[i];
            case 91:
                return new ExploreTopicCluster[i];
            case 92:
                return new Audio[i];
            case 93:
                return new CameraToolInfo[i];
            case 94:
                return new CreativeConfig[i];
            case 95:
                return new EffectActionSheet[i];
            case 96:
                return new EffectPreview[i];
            case 97:
                return new ReelCTA[i];
            case 98:
                return new FilterGroupModelImpl[i];
            default:
                return new AndroidLinkImpl[i];
        }
    }

    /* JADX WARN: Type inference failed for: r0v127, types: [java.lang.Object, com.instagram.direct.smartsuggestion.model.SmartSuggestionCTA] */
    /* JADX WARN: Type inference failed for: r0v156, types: [java.lang.Object, com.instagram.direct.smartsuggestion.model.SmartSuggestion] */
    /* JADX WARN: Type inference failed for: r0v163, types: [java.lang.Object, com.instagram.direct.model.thread.CreatorSubscriberThreadInfo] */
    /* JADX WARN: Type inference failed for: r0v169, types: [java.lang.Object, com.instagram.direct.model.thread.CreatorBroadcastThreadInfo] */
    /* JADX WARN: Type inference failed for: r0v171, types: [java.lang.Object, com.instagram.direct.model.thread.ChannelsContextLine] */
    /* JADX WARN: Type inference failed for: r0v174, types: [java.lang.Object, com.instagram.direct.model.mentions.MentionedEntity] */
    /* JADX WARN: Type inference failed for: r0v177, types: [java.lang.Object, com.instagram.direct.model.comments.DirectMessageComments] */
    /* JADX WARN: Type inference failed for: r0v194, types: [com.instagram.direct.model.DirectMessageEditHistory, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v222, types: [java.lang.Object, com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter] */
    /* JADX WARN: Type inference failed for: r0v320, types: [android.view.View$BaseSavedState, com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v368, types: [com.instagram.common.gallery.metadata.ImmersiveMediaFields, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v616, types: [java.lang.Object, com.instagram.camera.effect.models.CameraAREffect] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Boolean bool;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer num12;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        Boolean valueOf;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(parcel, 0);
                return RepostRestrictedReason.values()[parcel.readInt()];
            case 1:
                C14360o3.A0B(parcel, 0);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                RingSpecPoint ringSpecPoint = (RingSpecPoint) parcel.readParcelable(RingSpecImpl.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList10.add(Float.valueOf(parcel.readFloat()));
                }
                return new RingSpecImpl(ringSpecPoint, (RingSpecPoint) parcel.readParcelable(RingSpecImpl.class.getClassLoader()), parcel.readString(), createStringArrayList, arrayList10);
            case 2:
                C14360o3.A0B(parcel, 0);
                return new RingSpecPointImpl(parcel.readFloat(), parcel.readFloat());
            case 3:
                C14360o3.A0B(parcel, 0);
                return SMBPartnerType.values()[parcel.readInt()];
            case 4:
                C14360o3.A0B(parcel, 0);
                return ScreenTimeScreenType.values()[parcel.readInt()];
            case 5:
                C14360o3.A0B(parcel, 0);
                return SellerShoppableFeedType.values()[parcel.readInt()];
            case 6:
                C14360o3.A0B(parcel, 0);
                return ShopManagementAccessState.values()[parcel.readInt()];
            case 7:
                C14360o3.A0B(parcel, 0);
                return ShoppingOnboardingState.values()[parcel.readInt()];
            case 8:
                C14360o3.A0B(parcel, 0);
                return SocialContextType.values()[parcel.readInt()];
            case 9:
                C14360o3.A0B(parcel, 0);
                return new SocialProofInfoImpl(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 10:
                C14360o3.A0B(parcel, 0);
                return SponsoredAdsDisclaimerType.values()[parcel.readInt()];
            case 11:
                C14360o3.A0B(parcel, 0);
                return StickerTraySectionCTAType.values()[parcel.readInt()];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(parcel, 0);
                return new StoryLinkInfoDict(parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(parcel, 0);
                return StoryPollColorType.values()[parcel.readInt()];
            case 14:
                C14360o3.A0B(parcel, 0);
                return StoryPromptDisablementState.values()[parcel.readInt()];
            case Process.SIGTERM /* 15 */:
                C14360o3.A0B(parcel, 0);
                return new StoryPromptFailureTooltipDict(parcel.readString(), parcel.readString());
            case 16:
                C14360o3.A0B(parcel, 0);
                String readString = parcel.readString();
                StoryPromptDisablementState storyPromptDisablementState = (StoryPromptDisablementState) parcel.readParcelable(StoryPromptTappableData.class.getClassLoader());
                ElectionAddYoursInfoDict electionAddYoursInfoDict = (ElectionAddYoursInfoDict) parcel.readParcelable(StoryPromptTappableData.class.getClassLoader());
                int readInt2 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(readInt2);
                int i2 = 0;
                while (true) {
                    ClassLoader classLoader = StoryPromptTappableData.class.getClassLoader();
                    if (i2 == readInt2) {
                        return new StoryPromptTappableData(electionAddYoursInfoDict, (GenAIToolInfoDict) parcel.readParcelable(classLoader), storyPromptDisablementState, (StoryPromptFailureTooltipDict) parcel.readParcelable(StoryPromptTappableData.class.getClassLoader()), (StoryPromptParticipationFrictionInfoDict) parcel.readParcelable(StoryPromptTappableData.class.getClassLoader()), (StoryPromptType) parcel.readParcelable(StoryPromptTappableData.class.getClassLoader()), (StoryTemplateDict) parcel.readParcelable(StoryPromptTappableData.class.getClassLoader()), (User) parcel.readParcelable(StoryPromptTappableData.class.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null, readString, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), arrayList11, parcel.readInt());
                    }
                    arrayList11.add(parcel.readParcelable(classLoader));
                    i2++;
                }
            case 17:
                C14360o3.A0B(parcel, 0);
                return StoryPromptType.values()[parcel.readInt()];
            case 18:
                C14360o3.A0B(parcel, 0);
                return new StoryTemplateAssetDict((ImageInfo) parcel.readParcelable(StoryTemplateAssetDict.class.getClassLoader()), (ImageInfo) parcel.readParcelable(StoryTemplateAssetDict.class.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString());
            case Process.SIGSTOP /* 19 */:
                C14360o3.A0B(parcel, 0);
                return new StoryTemplateCaptionDict((ClipsTextFormatType) parcel.readParcelable(StoryTemplateCaptionDict.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
            case 20:
                C14360o3.A0B(parcel, 0);
                StoryTemplateFillableStickersDict storyTemplateFillableStickersDict = (StoryTemplateFillableStickersDict) parcel.readParcelable(StoryTemplateDict.class.getClassLoader());
                ArrayList arrayList12 = null;
                Boolean valueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Boolean valueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                StoryTemplateMusicStickerDict storyTemplateMusicStickerDict = (StoryTemplateMusicStickerDict) parcel.readParcelable(StoryTemplateDict.class.getClassLoader());
                StoryTemplateReshareMediaDict storyTemplateReshareMediaDict = (StoryTemplateReshareMediaDict) parcel.readParcelable(StoryTemplateDict.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList8 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    arrayList8 = new ArrayList(readInt3);
                    for (int i3 = 0; i3 != readInt3; i3++) {
                        arrayList8.add(parcel.readParcelable(StoryTemplateDict.class.getClassLoader()));
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList9 = null;
                } else {
                    int readInt4 = parcel.readInt();
                    arrayList9 = new ArrayList(readInt4);
                    for (int i4 = 0; i4 != readInt4; i4++) {
                        arrayList9.add(parcel.readParcelable(StoryTemplateDict.class.getClassLoader()));
                    }
                }
                if (parcel.readInt() != 0) {
                    int readInt5 = parcel.readInt();
                    arrayList12 = new ArrayList(readInt5);
                    for (int i5 = 0; i5 != readInt5; i5++) {
                        arrayList12.add(parcel.readParcelable(StoryTemplateDict.class.getClassLoader()));
                    }
                }
                return new StoryTemplateDict((StoryTemplateAssetDict) parcel.readParcelable(StoryTemplateDict.class.getClassLoader()), storyTemplateFillableStickersDict, storyTemplateMusicStickerDict, storyTemplateReshareMediaDict, valueOf2, valueOf3, arrayList8, arrayList9, arrayList12, parcel.createStringArrayList());
            case 21:
                C14360o3.A0B(parcel, 0);
                if (parcel.readInt() == 0) {
                    arrayList7 = null;
                } else {
                    int readInt6 = parcel.readInt();
                    arrayList7 = new ArrayList(readInt6);
                    for (int i6 = 0; i6 != readInt6; i6++) {
                        arrayList7.add(parcel.readParcelable(StoryTemplateFillableStickersDictImpl.class.getClassLoader()));
                    }
                }
                return new StoryTemplateFillableStickersDictImpl((StoryTemplateFillableMusicStickerDict) parcel.readParcelable(StoryTemplateFillableStickersDictImpl.class.getClassLoader()), arrayList7);
            case 22:
                C14360o3.A0B(parcel, 0);
                return new StoryTemplateGiphyStickerDict((StoryTemplateGiphyStickerImageDict) parcel.readParcelable(StoryTemplateGiphyStickerDict.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            case 23:
                C14360o3.A0B(parcel, 0);
                return new StoryTemplateGiphyStickerImageDict(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 24:
                C14360o3.A0B(parcel, 0);
                return new StoryTemplateMusicStickerDict((Lyrics) parcel.readParcelable(StoryTemplateMusicStickerDict.class.getClassLoader()), (StoryTemplateMusicAssetInfoDict) parcel.readParcelable(StoryTemplateMusicStickerDict.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 25:
                C14360o3.A0B(parcel, 0);
                return new StoryTemplateStaticOverlayDict((StoryTemplateGiphyStickerDict) parcel.readParcelable(StoryTemplateStaticOverlayDict.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
            case 26:
                C14360o3.A0B(parcel, 0);
                return new SubscriptionStickerDict((User) parcel.readParcelable(SubscriptionStickerDict.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            case 27:
                C14360o3.A0B(parcel, 0);
                return SuggestedUsersStyle.values()[parcel.readInt()];
            case 28:
                C14360o3.A0B(parcel, 0);
                return TIFUAppDestinationEnum.values()[parcel.readInt()];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C14360o3.A0B(parcel, 0);
                return new TestimonialDictImpl((User) parcel.readParcelable(TestimonialDictImpl.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
            case 30:
                C14360o3.A0B(parcel, 0);
                return TextPostAppHeaderFollowVariant.values()[parcel.readInt()];
            case 31:
                C14360o3.A0B(parcel, 0);
                return TextPostAppSuggestionCardProfileContextIdentifier.values()[parcel.readInt()];
            case 32:
                C14360o3.A0B(parcel, 0);
                return ThreadsInFeedUnitTypeEnum.values()[parcel.readInt()];
            case 33:
                C14360o3.A0B(parcel, 0);
                boolean z = parcel.readInt() != 0;
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                ImageUrl imageUrl = (ImageUrl) parcel.readParcelable(TrackDataImpl.class.getClassLoader());
                ImageUrl imageUrl2 = (ImageUrl) parcel.readParcelable(TrackDataImpl.class.getClassLoader());
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString8 = parcel.readString();
                Boolean valueOf5 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                if (parcel.readInt() == 0) {
                    arrayList6 = null;
                } else {
                    int readInt7 = parcel.readInt();
                    arrayList6 = new ArrayList(readInt7);
                    for (int i7 = 0; i7 != readInt7; i7++) {
                        arrayList6.add(Integer.valueOf(parcel.readInt()));
                    }
                }
                return new TrackDataImpl((Lyrics) parcel.readParcelable(TrackDataImpl.class.getClassLoader()), imageUrl, imageUrl2, valueOf5, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), valueOf4, readString2, readString3, readString4, readString5, readString6, readString7, readString8, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), arrayList6, z, parcel.readInt() != 0);
            case 34:
                C14360o3.A0B(parcel, 0);
                return UndoStyle.values()[parcel.readInt()];
            case 35:
                C14360o3.A0B(parcel, 0);
                return UserMonetizationProductType.values()[parcel.readInt()];
            case 36:
                C14360o3.A0B(parcel, 0);
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                Float valueOf6 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                if (parcel.readInt() == 0) {
                    arrayList5 = null;
                } else {
                    int readInt8 = parcel.readInt();
                    arrayList5 = new ArrayList(readInt8);
                    for (int i8 = 0; i8 != readInt8; i8++) {
                        arrayList5.add(Float.valueOf(parcel.readFloat()));
                    }
                }
                return new UserTagInfoDict((User) parcel.readParcelable(UserTagInfoDict.class.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), valueOf6, parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, createStringArrayList2, arrayList5);
            case 37:
                C14360o3.A0B(parcel, 0);
                return WearablesAppAttributionType.values()[parcel.readInt()];
            case 38:
                C14360o3.A0B(parcel, 0);
                return new WhatsAppAttributionInfoImpl(parcel.readString(), parcel.readString());
            case 39:
                C14360o3.A0B(parcel, 0);
                return XDTTextAppQuoteAttachmentEligibility.values()[parcel.readInt()];
            case 40:
                C14360o3.A0B(parcel, 0);
                return XDTTextPostAppAccountPrivacyOptions.values()[parcel.readInt()];
            case Seq.NULL_REFNUM /* 41 */:
                C14360o3.A0B(parcel, 0);
                return XFBsizeCalibrationScore.values()[parcel.readInt()];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C14360o3.A0B(parcel, 0);
                Parcelable.Creator creator = AvatarCoinFlipSticker.CREATOR;
                return new AvatarCoinFlipConfig((AvatarCoinFlipBackgroundOptionResponse) parcel.readParcelable(AvatarCoinFlipConfig.class.getClassLoader()), (AvatarCoinFlipSticker) creator.createFromParcel(parcel), (AvatarCoinFlipSticker) creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : EnumC152426tV.valueOf(parcel.readString()), (AvatarInfo) parcel.readParcelable(AvatarCoinFlipConfig.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 43:
                C14360o3.A0B(parcel, 0);
                return new AvatarCoinFlipSticker(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 44:
                C14360o3.A0B(parcel, 0);
                return new AvatarInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 45:
                ?? obj = new Object();
                obj.A0X = Collections.emptyList();
                obj.A0b = new HashSet();
                obj.A0a = new HashSet();
                obj.A09 = C05F.A0N;
                obj.A0T = Collections.emptyList();
                obj.A04 = new SparkVisionCapability();
                obj.A0V = new ArrayList();
                obj.A0W = new ArrayList();
                obj.A06 = new SimpleImageUrl("");
                obj.A0Y = new ArrayList();
                obj.A0Z = new HashMap();
                String readString9 = parcel.readString();
                readString9.getClass();
                obj.A0K = readString9;
                String readString10 = parcel.readString();
                readString10.getClass();
                obj.A0S = readString10;
                Parcelable readParcelable = parcel.readParcelable(ImageUrl.class.getClassLoader());
                readParcelable.getClass();
                obj.A07 = (ImageUrl) readParcelable;
                obj.A0B = parcel.readString();
                obj.A0C = parcel.readString();
                obj.A01 = parcel.readInt();
                ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                createStringArrayList3.getClass();
                obj.A0V = createStringArrayList3;
                ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
                createStringArrayList4.getClass();
                obj.A0W = createStringArrayList4;
                obj.A0g = parcel.readByte() != 0;
                obj.A0h = parcel.readByte() != 0;
                obj.A0d = parcel.readByte() != 0;
                String readString11 = parcel.readString();
                readString11.getClass();
                obj.A0M = readString11;
                String readString12 = parcel.readString();
                readString12.getClass();
                obj.A0G = readString12;
                obj.A0e = parcel.readByte() != 0;
                obj.A0D = parcel.readString();
                obj.A0R = parcel.readString();
                obj.A0F = parcel.readString();
                obj.A0E = parcel.readString();
                return obj;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C14360o3.A0B(parcel, 0);
                ClipsViewerSource clipsViewerSource = (ClipsViewerSource) ClipsViewerSource.CREATOR.createFromParcel(parcel);
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                int readInt9 = parcel.readInt();
                String readString17 = parcel.readString();
                ImmutableList immutableList = (ImmutableList) parcel.readSerializable();
                String readString18 = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                Boolean valueOf7 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                ClipsContextualHighlightInfo clipsContextualHighlightInfo = (ClipsContextualHighlightInfo) parcel.readParcelable(ClipsViewerConfig.class.getClassLoader());
                String readString22 = parcel.readString();
                int readInt10 = parcel.readInt();
                String readString23 = parcel.readString();
                String readString24 = parcel.readString();
                String readString25 = parcel.readString();
                String readString26 = parcel.readString();
                String readString27 = parcel.readString();
                AudioType audioType = (AudioType) parcel.readParcelable(ClipsViewerConfig.class.getClassLoader());
                ImmutableList immutableList2 = (ImmutableList) parcel.readSerializable();
                String readString28 = parcel.readString();
                String readString29 = parcel.readString();
                PollType pollType = (PollType) parcel.readParcelable(ClipsViewerConfig.class.getClassLoader());
                EnumC120785dO valueOf8 = parcel.readInt() == 0 ? null : EnumC120785dO.valueOf(parcel.readString());
                String readString30 = parcel.readString();
                String readString31 = parcel.readString();
                Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                EnumC120795dP valueOf10 = parcel.readInt() == 0 ? null : EnumC120795dP.valueOf(parcel.readString());
                EnumC120805dQ valueOf11 = parcel.readInt() == 0 ? null : EnumC120805dQ.valueOf(parcel.readString());
                boolean z3 = parcel.readInt() != 0;
                C22P valueOf12 = C22P.valueOf(parcel.readString());
                String readString32 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                EnumC116885Qs valueOf13 = EnumC116885Qs.valueOf(parcel.readString());
                Integer A00 = C9IF.A00(parcel.readString());
                boolean z5 = parcel.readInt() != 0;
                boolean z6 = parcel.readInt() != 0;
                EnumC114765Gh valueOf14 = parcel.readInt() == 0 ? null : EnumC114765Gh.valueOf(parcel.readString());
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                boolean z9 = parcel.readInt() != 0;
                boolean z10 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                String readString33 = parcel.readString();
                String readString34 = parcel.readString();
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0;
                int readInt11 = parcel.readInt();
                boolean z15 = parcel.readInt() != 0;
                boolean z16 = parcel.readInt() != 0;
                boolean z17 = parcel.readInt() != 0;
                boolean z18 = parcel.readInt() != 0;
                boolean z19 = parcel.readInt() != 0;
                boolean z20 = parcel.readInt() != 0;
                boolean z21 = parcel.readInt() != 0;
                boolean z22 = parcel.readInt() != 0;
                boolean z23 = parcel.readInt() != 0;
                String readString35 = parcel.readString();
                String readString36 = parcel.readString();
                AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) parcel.readParcelable(ClipsViewerConfig.class.getClassLoader());
                SearchContext searchContext = (SearchContext) parcel.readParcelable(ClipsViewerConfig.class.getClassLoader());
                String readString37 = parcel.readString();
                String readString38 = parcel.readString();
                String readString39 = parcel.readString();
                String readString40 = parcel.readString();
                Integer valueOf15 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                ClipsWatchAndBrowseData clipsWatchAndBrowseData = (ClipsWatchAndBrowseData) (parcel.readInt() == 0 ? null : ClipsWatchAndBrowseData.CREATOR.createFromParcel(parcel));
                String readString41 = parcel.readString();
                String readString42 = parcel.readString();
                ClipsReplyBarData clipsReplyBarData = (ClipsReplyBarData) parcel.readParcelable(ClipsViewerConfig.class.getClassLoader());
                ClipsTogetherData clipsTogetherData = (ClipsTogetherData) parcel.readParcelable(ClipsViewerConfig.class.getClassLoader());
                ClipsSpotlightData clipsSpotlightData = (ClipsSpotlightData) parcel.readParcelable(ClipsViewerConfig.class.getClassLoader());
                boolean z24 = parcel.readInt() != 0;
                boolean z25 = parcel.readInt() != 0;
                String readString43 = parcel.readString();
                ClipsViewerDirectData clipsViewerDirectData = (ClipsViewerDirectData) (parcel.readInt() == 0 ? null : ClipsViewerDirectData.CREATOR.createFromParcel(parcel));
                boolean z26 = parcel.readInt() != 0;
                String readString44 = parcel.readString();
                int readInt12 = parcel.readInt();
                String readString45 = parcel.readString();
                String readString46 = parcel.readString();
                boolean z27 = parcel.readInt() != 0;
                PlaylistContext playlistContext = (PlaylistContext) parcel.readParcelable(ClipsViewerConfig.class.getClassLoader());
                String readString47 = parcel.readString();
                boolean z28 = parcel.readInt() != 0;
                boolean z29 = parcel.readInt() != 0;
                boolean z30 = parcel.readInt() != 0;
                boolean z31 = parcel.readInt() != 0;
                boolean z32 = parcel.readInt() != 0;
                boolean z33 = parcel.readInt() != 0;
                float readFloat = parcel.readFloat();
                float readFloat2 = parcel.readFloat();
                float readFloat3 = parcel.readFloat();
                float readFloat4 = parcel.readFloat();
                boolean z34 = parcel.readInt() != 0;
                String readString48 = parcel.readString();
                boolean z35 = parcel.readInt() != 0;
                RIXUChainingBehaviorDefinition rIXUChainingBehaviorDefinition = (RIXUChainingBehaviorDefinition) parcel.readParcelable(ClipsViewerConfig.class.getClassLoader());
                boolean z36 = parcel.readInt() != 0;
                boolean z37 = parcel.readInt() != 0;
                boolean z38 = parcel.readInt() != 0;
                String readString49 = parcel.readString();
                String readString50 = parcel.readString();
                Integer valueOf16 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                boolean z39 = parcel.readInt() != 0;
                boolean z40 = parcel.readInt() != 0;
                ClipChainType clipChainType = (ClipChainType) parcel.readParcelable(ClipsViewerConfig.class.getClassLoader());
                String readString51 = parcel.readString();
                if (readString51.equals("DEFAULT")) {
                    num10 = C05F.A00;
                } else if (readString51.equals("AD_SEED")) {
                    num10 = C05F.A01;
                } else {
                    if (!readString51.equals(AbstractC111324zv.A00(633))) {
                        throw new IllegalArgumentException(readString51);
                    }
                    num10 = C05F.A0C;
                }
                String readString52 = parcel.readString();
                Integer valueOf17 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Long valueOf18 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString53 = parcel.readString();
                if (parcel.readInt() == 0) {
                    num11 = null;
                } else {
                    String readString54 = parcel.readString();
                    if (!readString54.equals(AbstractC111324zv.A00(3516))) {
                        throw new IllegalArgumentException(readString54);
                    }
                    num11 = C05F.A00;
                }
                Integer valueOf19 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                boolean z41 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    num12 = null;
                } else {
                    String readString55 = parcel.readString();
                    if (readString55.equals("RANKED")) {
                        num12 = C05F.A00;
                    } else if (readString55.equals("LATEST_TOP")) {
                        num12 = C05F.A01;
                    } else if (readString55.equals(AbstractC111324zv.A00(3668))) {
                        num12 = C05F.A0C;
                    } else if (readString55.equals("FOLLOWERS")) {
                        num12 = C05F.A0N;
                    } else if (readString55.equals(AbstractC43591JPw.A00(271))) {
                        num12 = C05F.A0Y;
                    } else if (readString55.equals("QUESTIONS")) {
                        num12 = C05F.A0j;
                    } else {
                        if (!readString55.equals("NOT_SET")) {
                            throw new IllegalArgumentException(readString55);
                        }
                        num12 = C05F.A0u;
                    }
                }
                String readString56 = parcel.readString();
                String readString57 = parcel.readString();
                boolean z42 = parcel.readInt() != 0;
                String readString58 = parcel.readString();
                boolean z43 = parcel.readInt() != 0;
                boolean z44 = parcel.readInt() != 0;
                boolean z45 = parcel.readInt() != 0;
                String readString59 = parcel.readString();
                boolean z46 = parcel.readInt() != 0;
                boolean z47 = parcel.readInt() != 0;
                String readString60 = parcel.readString();
                return new ClipsViewerConfig(valueOf12, valueOf10, valueOf11, valueOf8, immutableList, immutableList2, clipChainType, pollType, valueOf13, clipsViewerDirectData, clipsViewerSource, clipsWatchAndBrowseData, clipsReplyBarData, clipsSpotlightData, clipsTogetherData, clipsContextualHighlightInfo, playlistContext, rIXUChainingBehaviorDefinition, audioOverlayTrack, audioType, searchContext, valueOf14, valueOf7, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), valueOf9, A00, valueOf15, valueOf16, num10, valueOf17, num11, valueOf19, num12, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, valueOf18, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), readString13, readString14, readString15, readString16, readString17, readString18, readString19, readString20, readString21, readString22, readString23, readString24, readString25, readString26, readString27, readString28, readString29, readString30, readString31, readString32, readString33, readString34, readString35, readString36, readString37, readString38, readString39, readString40, readString41, readString42, readString43, readString44, readString45, readString46, readString47, readString48, readString49, readString50, readString52, readString53, readString56, readString57, readString58, readString59, readString60, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), readFloat, readFloat2, readFloat3, readFloat4, readInt9, readInt10, readInt11, readInt12, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, z33, z34, z35, z36, z37, z38, z39, z40, z41, z42, z43, z44, z45, z46, z47, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 47:
                C14360o3.A0B(parcel, 0);
                return new ClipsViewerDirectData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 48:
                C14360o3.A0B(parcel, 0);
                return ClipsViewerSource.values()[parcel.readInt()];
            case 49:
                C14360o3.A0B(parcel, 0);
                int readInt13 = parcel.readInt();
                float readFloat5 = parcel.readFloat();
                int readInt14 = parcel.readInt();
                Integer A002 = C9IF.A00(parcel.readString());
                Integer A003 = C9IF.A00(parcel.readString());
                String readString61 = parcel.readString();
                if (readString61.equals("DISABLED")) {
                    num8 = C05F.A00;
                } else if (readString61.equals("DISMISS")) {
                    num8 = C05F.A01;
                } else if (readString61.equals("COLLAPSE_BOTTOM_SHEET")) {
                    num8 = C05F.A0C;
                } else if (readString61.equals("COLLAPSE_OR_DISMISS_BOTTOM_SHEET")) {
                    num8 = C05F.A0N;
                } else {
                    if (!readString61.equals("DISMISS_ONLY_BROWSER")) {
                        throw new IllegalArgumentException(readString61);
                    }
                    num8 = C05F.A0Y;
                }
                String readString62 = parcel.readString();
                if (readString62.equals("DISABLED")) {
                    num9 = C05F.A00;
                } else if (readString62.equals("DISMISS")) {
                    num9 = C05F.A01;
                } else if (readString62.equals("EXPAND_BOTTOM_SHEET")) {
                    num9 = C05F.A0C;
                } else {
                    if (!readString62.equals("EXPAND_OR_CHAIN")) {
                        throw new IllegalArgumentException(readString62);
                    }
                    num9 = C05F.A0N;
                }
                return new ClipsWatchAndBrowseData(A002, A003, num8, num9, parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), readFloat5, parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), readInt13, readInt14, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                C14360o3.A0B(parcel, 0);
                return new ClipsReplyBarData((DirectShareTarget) parcel.readParcelable(ClipsReplyBarData.class.getClassLoader()), (DirectThreadKey) parcel.readParcelable(ClipsReplyBarData.class.getClassLoader()), (MsysThreadId) parcel.readParcelable(ClipsReplyBarData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 51:
                C14360o3.A0B(parcel, 0);
                return new ClipsContextualHighlightInfo((ContextualHighlightType) parcel.readParcelable(ClipsContextualHighlightInfo.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            case 52:
                C14360o3.A0B(parcel, 0);
                return new PlaylistContext(parcel.readString());
            case 53:
                C14360o3.A0B(parcel, 0);
                return new Draft(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 54:
                C14360o3.A0B(parcel, 0);
                return new GeneratedMediaMetadata(parcel.readString(), parcel.readInt() != 0);
            case 55:
                C14360o3.A0B(parcel, 0);
                Medium medium = new Medium();
                medium.A05 = parcel.readInt();
                medium.A08 = parcel.readInt();
                String readString63 = parcel.readString();
                if (readString63 != null) {
                    medium.A0X = readString63;
                    medium.A02 = parcel.readInt();
                    medium.A0O = parcel.readString();
                    medium.A03 = parcel.readInt();
                    String readString64 = parcel.readString();
                    if (readString64 != null) {
                        medium.A0U = readString64;
                        medium.A0b = parcel.readString();
                        medium.A0e = parcel.readInt() == 1;
                        medium.A0a = parcel.readString();
                        medium.A07 = parcel.readInt();
                        medium.A0D = parcel.readLong();
                        medium.A0C = parcel.readLong();
                        medium.A06 = parcel.readInt();
                        MediaUploadMetadata mediaUploadMetadata = (MediaUploadMetadata) parcel.readParcelable(MediaUploadMetadata.class.getClassLoader());
                        if (mediaUploadMetadata == null) {
                            mediaUploadMetadata = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
                        }
                        medium.A0G = mediaUploadMetadata;
                        medium.A0H = (BackgroundGradientColors) parcel.readParcelable(BackgroundGradientColors.class.getClassLoader());
                        medium.A0N = parcel.readString();
                        medium.A0g = parcel.readInt() == 1;
                        medium.A0d = parcel.readInt() == 1;
                        medium.A00 = parcel.readDouble();
                        medium.A01 = parcel.readDouble();
                        medium.A0B = parcel.readInt();
                        medium.A04 = parcel.readInt();
                        medium.A0V = parcel.readString();
                        medium.A0T = parcel.readString();
                        medium.A0Z = parcel.readString();
                        medium.A0L = parcel.readString();
                        medium.A0R = parcel.readString();
                        ArrayList createTypedArrayList = parcel.createTypedArrayList(FaceCenter.CREATOR);
                        if (createTypedArrayList != null) {
                            medium.A0c = new ArrayList(createTypedArrayList);
                            medium.A0Y = parcel.readString();
                            medium.A0M = parcel.readString();
                            int readInt15 = parcel.readInt();
                            if (readInt15 != 0) {
                                bool = readInt15 != 1 ? null : true;
                            } else {
                                bool = false;
                            }
                            medium.A0I = bool;
                            GeneratedMediaMetadata generatedMediaMetadata = (GeneratedMediaMetadata) parcel.readParcelable(GeneratedMediaMetadata.class.getClassLoader());
                            if (generatedMediaMetadata == null) {
                                generatedMediaMetadata = new GeneratedMediaMetadata(null, false);
                            }
                            medium.A0E = generatedMediaMetadata;
                            return medium;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            case 56:
                C14360o3.A0B(parcel, 0);
                return new RemoteMedia((MediaUploadMetadata) parcel.readParcelable(RemoteMedia.class.getClassLoader()), (ImageUrl) parcel.readParcelable(RemoteMedia.class.getClassLoader()), (ImageUrl) parcel.readParcelable(RemoteMedia.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 57:
                C14360o3.A0B(parcel, 0);
                String readString65 = parcel.readString();
                boolean z48 = parcel.readInt() != 0;
                ?? obj2 = new Object();
                obj2.A00 = readString65;
                obj2.A01 = z48;
                return obj2;
            case 58:
                C14360o3.A0B(parcel, 0);
                return new MediaUploadMetadata((ImmersiveMediaFields) (parcel.readInt() == 0 ? null : ImmersiveMediaFields.CREATOR.createFromParcel(parcel)), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 59:
                return new ImageCacheKey(parcel);
            case 60:
                String readString66 = parcel.readString();
                readString66.getClass();
                return new SimpleImageUrl(readString66, parcel.readInt(), parcel.readInt());
            case 61:
                C14360o3.A0B(parcel, 0);
                boolean z49 = parcel.readInt() != 0;
                boolean z50 = parcel.readInt() != 0;
                long readLong = parcel.readLong();
                String readString67 = parcel.readString();
                if (readString67.equals("PERMANENT_IMAGE")) {
                    num7 = C05F.A00;
                } else if (readString67.equals("PERMANENT_VIDEO_COVER")) {
                    num7 = C05F.A01;
                } else if (readString67.equals("EPHEMERAL_IMAGE")) {
                    num7 = C05F.A0C;
                } else if (readString67.equals("EPHEMERAL_VIDEO_COVER")) {
                    num7 = C05F.A0N;
                } else if (readString67.equals("REEL_RESHARE")) {
                    num7 = C05F.A0Y;
                } else if (readString67.equals("FEED_IMAGE_RESHARE")) {
                    num7 = C05F.A0j;
                } else if (readString67.equals("STORY_RESHARE")) {
                    num7 = C05F.A0u;
                } else if (readString67.equals("STORY_REPLY")) {
                    num7 = C05F.A15;
                } else if (readString67.equals("STORY_MENTION")) {
                    num7 = C05F.A1F;
                } else if (readString67.equals("STORY_OTHER")) {
                    num7 = C05F.A1I;
                } else if (readString67.equals("STACKS_IMAGE")) {
                    num7 = C05F.A02;
                } else if (readString67.equals("STACKS_VIDEO_COVER")) {
                    num7 = C05F.A03;
                } else if (readString67.equals("LINK_PREVIEW")) {
                    num7 = C05F.A04;
                } else if (readString67.equals("XMA_OTHER")) {
                    num7 = C05F.A05;
                } else if (readString67.equals("OTHER")) {
                    num7 = C05F.A06;
                } else {
                    if (!readString67.equals("AVATAR_STICKER")) {
                        throw new IllegalArgumentException(readString67);
                    }
                    num7 = C05F.A07;
                }
                return new DirectImageLoggingData(num7, parcel.readString(), parcel.readString(), parcel.readString(), readLong, z49, z50, parcel.readInt() != 0);
            case 62:
                C14360o3.A0B(parcel, 0);
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.A00 = parcel.readInt();
                return baseSavedState;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                C14360o3.A0B(parcel, 0);
                String readString68 = parcel.readString();
                ImageUrl imageUrl3 = (ImageUrl) parcel.readParcelable(SocialContextBubbleUiState.class.getClassLoader());
                String readString69 = parcel.readString();
                User user = (User) parcel.readParcelable(SocialContextBubbleUiState.class.getClassLoader());
                int readInt16 = parcel.readInt();
                String readString70 = parcel.readString();
                int readInt17 = parcel.readInt();
                ArrayList arrayList13 = new ArrayList(readInt17);
                for (int i9 = 0; i9 != readInt17; i9++) {
                    arrayList13.add(parcel.readParcelable(SocialContextBubbleUiState.class.getClassLoader()));
                }
                boolean z51 = parcel.readInt() != 0;
                boolean z52 = parcel.readInt() != 0;
                SocialContextType socialContextType = (SocialContextType) parcel.readParcelable(SocialContextBubbleUiState.class.getClassLoader());
                String readString71 = parcel.readString();
                String readString72 = parcel.readString();
                String readString73 = parcel.readString();
                if (readString73.equals("BELOW_CAPTION_REELS_VIEWER")) {
                    num6 = C05F.A00;
                } else if (readString73.equals("OVERLAID_ON_MEDIA_REELS_VIEWER")) {
                    num6 = C05F.A01;
                } else if (readString73.equals("OVERLAID_ON_MEDIA_FEED")) {
                    num6 = C05F.A0C;
                } else {
                    if (!readString73.equals("SEPERATE_ROW_FEED")) {
                        throw new IllegalArgumentException(readString73);
                    }
                    num6 = C05F.A0N;
                }
                boolean z53 = parcel.readInt() != 0;
                boolean z54 = parcel.readInt() != 0;
                int readInt18 = parcel.readInt();
                ArrayList arrayList14 = new ArrayList(readInt18);
                for (int i10 = 0; i10 != readInt18; i10++) {
                    arrayList14.add(parcel.readValue(SocialContextBubbleUiState.class.getClassLoader()));
                }
                return new SocialContextBubbleUiState((C51756Mtf) parcel.readValue(SocialContextBubbleUiState.class.getClassLoader()), socialContextType, imageUrl3, user, num6, readString68, readString69, readString70, readString71, readString72, arrayList13, arrayList14, readInt16, z51, z52, z53, z54);
            case 64:
                C14360o3.A0B(parcel, 0);
                return new CropInfo((Rect) parcel.readParcelable(CropInfo.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 65:
                C14360o3.A0B(parcel, 0);
                return new CameraConfiguration(parcel);
            case 66:
                C14360o3.A0B(parcel, 0);
                return new NineSixteenLayoutConfigImpl(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            case 67:
                C14360o3.A0B(parcel, 0);
                return new CameraSpec(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
            case 68:
                C14360o3.A0B(parcel, 0);
                return GalleryGridFormat.valueOf(parcel.readString());
            case 69:
                C14360o3.A0B(parcel, 0);
                C8B9 valueOf20 = C8B9.valueOf(parcel.readString());
                return new CaptureRuleSystemState(parcel.readInt() == 0 ? null : EnumC150226pU.valueOf(parcel.readString()), valueOf20, parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 70:
                return new PhotoFilter(parcel);
            case 71:
                ?? obj3 = new Object();
                Parcelable readParcelable2 = parcel.readParcelable(SurfaceCropFilterModel.class.getClassLoader());
                readParcelable2.getClass();
                SurfaceCropFilterModel surfaceCropFilterModel = (SurfaceCropFilterModel) readParcelable2;
                obj3.A00 = surfaceCropFilterModel;
                SurfaceCropFilterModel.FullTransform fullTransform = surfaceCropFilterModel.A06;
                SurfaceCropFilterModel.FullTransform fullTransform2 = surfaceCropFilterModel.A0J;
                fullTransform2.A06 = fullTransform.A06;
                fullTransform2.A00 = fullTransform.A00;
                fullTransform2.A01 = fullTransform.A01;
                fullTransform2.A02 = fullTransform.A02;
                fullTransform2.A03 = fullTransform.A03;
                fullTransform2.A04 = fullTransform.A04;
                fullTransform2.A05 = fullTransform.A05;
                fullTransform2.A07 = fullTransform.A07;
                surfaceCropFilterModel.A0G = true;
                surfaceCropFilterModel.A06 = fullTransform2;
                return obj3;
            case 72:
                C14360o3.A0B(parcel, 0);
                Parcelable.Creator creator2 = Capabilities.CREATOR;
                BitSet valueOf21 = BitSet.valueOf(parcel.createByteArray());
                C14360o3.A07(valueOf21);
                BitSet valueOf22 = BitSet.valueOf(parcel.createByteArray());
                C14360o3.A07(valueOf22);
                return new Capabilities(valueOf21, valueOf22);
            case 73:
                C14360o3.A0B(parcel, 0);
                return new MediaViewerReplyBarEligibilityCheckerImpl(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 74:
                C14360o3.A0B(parcel, 0);
                return NoteAudience.values()[parcel.readInt()];
            case 75:
                C14360o3.A0B(parcel, 0);
                return NoteStyle.values()[parcel.readInt()];
            case 76:
                C14360o3.A0B(parcel, 0);
                return new DirectCountBasedReaction(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
            case 77:
                C14360o3.A0B(parcel, 0);
                return new ReactionViewModel((ImageUrl) parcel.readParcelable(ReactionViewModel.class.getClassLoader()), (ImageUrl) parcel.readParcelable(ReactionViewModel.class.getClassLoader()), (MessagingUser) parcel.readParcelable(ReactionViewModel.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 78:
                C14360o3.A0B(parcel, 0);
                String readString74 = parcel.readString();
                long readLong2 = parcel.readLong();
                C14360o3.A0B(readString74, 1);
                ?? obj4 = new Object();
                obj4.A01 = readString74;
                obj4.A00 = readLong2;
                return obj4;
            case 79:
                C14360o3.A0B(parcel, 0);
                boolean z55 = parcel.readInt() != 0;
                String readString75 = parcel.readString();
                String readString76 = parcel.readString();
                String readString77 = parcel.readString();
                String readString78 = parcel.readString();
                ArrayList<String> createStringArrayList5 = parcel.createStringArrayList();
                ArrayList<String> createStringArrayList6 = parcel.createStringArrayList();
                String readString79 = parcel.readString();
                String readString80 = parcel.readString();
                Integer num13 = null;
                if (parcel.readInt() == 0) {
                    num5 = null;
                } else {
                    String readString81 = parcel.readString();
                    if (readString81.equals("DEFAULT")) {
                        num5 = C05F.A00;
                    } else if (readString81.equals("DARK_MODE")) {
                        num5 = C05F.A01;
                    } else {
                        if (!readString81.equals("LIGHT_MODE")) {
                            throw new IllegalArgumentException(readString81);
                        }
                        num5 = C05F.A0C;
                    }
                }
                String readString82 = parcel.readString();
                String readString83 = parcel.readString();
                int readInt19 = parcel.readInt();
                String readString84 = parcel.readString();
                String readString85 = parcel.readString();
                int readInt20 = parcel.readInt();
                int readInt21 = parcel.readInt();
                int readInt22 = parcel.readInt();
                int readInt23 = parcel.readInt();
                String readString86 = parcel.readString();
                String readString87 = parcel.readString();
                String readString88 = parcel.readString();
                String readString89 = parcel.readString();
                String readString90 = parcel.readString();
                String readString91 = parcel.readString();
                int readInt24 = parcel.readInt();
                int readInt25 = parcel.readInt();
                int readInt26 = parcel.readInt();
                String readString92 = parcel.readString();
                String readString93 = parcel.readString();
                String readString94 = parcel.readString();
                String readString95 = parcel.readString();
                String readString96 = parcel.readString();
                String readString97 = parcel.readString();
                String readString98 = parcel.readString();
                String readString99 = parcel.readString();
                ArrayList<String> createStringArrayList7 = parcel.createStringArrayList();
                ArrayList<String> createStringArrayList8 = parcel.createStringArrayList();
                String readString100 = parcel.readString();
                String readString101 = parcel.readString();
                String readString102 = parcel.readString();
                String readString103 = parcel.readString();
                String readString104 = parcel.readString();
                String readString105 = parcel.readString();
                String readString106 = parcel.readString();
                String readString107 = parcel.readString();
                if (parcel.readInt() != 0) {
                    String readString108 = parcel.readString();
                    if (readString108.equals("COLOR")) {
                        num13 = C05F.A00;
                    } else {
                        if (!readString108.equals("THEME")) {
                            throw new IllegalArgumentException(readString108);
                        }
                        num13 = C05F.A01;
                    }
                }
                return new DirectThreadThemeInfo(num5, num13, readString75, readString76, readString77, readString78, readString79, readString80, readString82, readString83, readString84, readString85, readString86, readString87, readString88, readString89, readString90, readString91, readString92, readString93, readString94, readString95, readString96, readString97, readString98, readString99, readString100, readString101, readString102, readString103, readString104, readString105, readString106, readString107, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), createStringArrayList5, createStringArrayList6, createStringArrayList7, createStringArrayList8, readInt19, readInt20, readInt21, readInt22, readInt23, readInt24, readInt25, readInt26, parcel.readInt(), z55, parcel.readInt() != 0);
            case 80:
                C14360o3.A0B(parcel, 0);
                int readInt27 = parcel.readInt();
                String readString109 = parcel.readString();
                C14360o3.A0B(readString109, 2);
                ?? obj5 = new Object();
                obj5.A00 = readInt27;
                obj5.A01 = readString109;
                return obj5;
            case 81:
                C14360o3.A0B(parcel, 0);
                String readString110 = parcel.readString();
                if (readString110 == null) {
                    readString110 = "";
                }
                int readInt28 = parcel.readInt();
                int readInt29 = parcel.readInt();
                int readInt30 = parcel.readInt();
                ?? obj6 = new Object();
                obj6.A03 = readString110;
                obj6.A01 = readInt28;
                obj6.A00 = readInt29;
                obj6.A02 = readInt30;
                return obj6;
            case 82:
                return new MessagingUser(parcel);
            case 83:
                C14360o3.A0B(parcel, 0);
                String readString111 = parcel.readString();
                String readString112 = parcel.readString();
                String readString113 = parcel.readString();
                ?? obj7 = new Object();
                obj7.A01 = readString111;
                obj7.A00 = readString112;
                obj7.A02 = readString113;
                return obj7;
            case 84:
                C14360o3.A0B(parcel, 0);
                String readString114 = parcel.readString();
                ImageUrl imageUrl4 = (ImageUrl) parcel.readParcelable(CreatorBroadcastThreadInfo.class.getClassLoader());
                boolean z56 = parcel.readInt() != 0;
                int readInt31 = parcel.readInt();
                String readString115 = parcel.readString();
                boolean z57 = parcel.readInt() != 0;
                int readInt32 = parcel.readInt();
                String readString116 = parcel.readString();
                String readString117 = parcel.readString();
                ?? obj8 = new Object();
                obj8.A03 = readString114;
                obj8.A02 = imageUrl4;
                obj8.A07 = z56;
                obj8.A00 = readInt31;
                obj8.A05 = readString115;
                obj8.A08 = z57;
                obj8.A01 = readInt32;
                obj8.A04 = readString116;
                obj8.A06 = readString117;
                return obj8;
            case 85:
                C14360o3.A0B(parcel, 0);
                ?? obj9 = new Object();
                obj9.A01 = Long.valueOf(parcel.readLong());
                obj9.A02 = parcel.readString();
                obj9.A00 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
                return obj9;
            case 86:
                C14360o3.A0B(parcel, 0);
                return DirectPromptTypes.valueOf(parcel.readString());
            case 87:
                C14360o3.A0B(parcel, 0);
                String readString118 = parcel.readString();
                if (readString118.equals("UNKNOWN")) {
                    num4 = C05F.A00;
                } else if (readString118.equals(AbstractC111324zv.A00(1790))) {
                    num4 = C05F.A01;
                } else if (readString118.equals(AbstractC111324zv.A00(1600))) {
                    num4 = C05F.A0C;
                } else if (readString118.equals(AbstractC111324zv.A00(1703))) {
                    num4 = C05F.A0N;
                } else if (readString118.equals(AbstractC111324zv.A00(1704))) {
                    num4 = C05F.A0Y;
                } else if (readString118.equals(AbstractC111324zv.A00(1482))) {
                    num4 = C05F.A0j;
                } else {
                    if (!readString118.equals(AbstractC111324zv.A00(1810))) {
                        throw new IllegalArgumentException(readString118);
                    }
                    num4 = C05F.A0u;
                }
                EnumC82333lv valueOf23 = EnumC82333lv.valueOf(parcel.readString());
                String readString119 = parcel.readString();
                String readString120 = parcel.readString();
                String readString121 = parcel.readString();
                SmartSuggestionCTA smartSuggestionCTA = (SmartSuggestionCTA) (parcel.readInt() == 0 ? null : SmartSuggestionCTA.CREATOR.createFromParcel(parcel));
                SmartSuggestionCTA smartSuggestionCTA2 = (SmartSuggestionCTA) (parcel.readInt() != 0 ? SmartSuggestionCTA.CREATOR.createFromParcel(parcel) : null);
                int readInt33 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt33);
                for (int i11 = 0; i11 != readInt33; i11++) {
                    hashMap.put(parcel.readString(), parcel.readString());
                }
                C14360o3.A0B(num4, 1);
                C14360o3.A0B(valueOf23, 2);
                ?? obj10 = new Object();
                obj10.A03 = num4;
                obj10.A02 = valueOf23;
                obj10.A04 = readString119;
                obj10.A06 = readString120;
                obj10.A05 = readString121;
                obj10.A00 = smartSuggestionCTA;
                obj10.A01 = smartSuggestionCTA2;
                obj10.A07 = hashMap;
                return obj10;
            case 88:
                C14360o3.A0B(parcel, 0);
                String readString122 = parcel.readString();
                if (readString122.equals("UNKNOWN")) {
                    num3 = C05F.A00;
                } else if (readString122.equals("SEND")) {
                    num3 = C05F.A01;
                } else {
                    if (!readString122.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
                        throw new IllegalArgumentException(readString122);
                    }
                    num3 = C05F.A0C;
                }
                String readString123 = parcel.readString();
                C14360o3.A0B(num3, 1);
                ?? obj11 = new Object();
                obj11.A00 = num3;
                obj11.A01 = readString123;
                return obj11;
            case 89:
                C14360o3.A0B(parcel, 0);
                return new DirectThreadAnalyticsParams(EnumC1579076z.valueOf(parcel.readString()), parcel.readLong(), parcel.readLong());
            case 90:
                C14360o3.A0B(parcel, 0);
                String readString124 = parcel.readString();
                String readString125 = parcel.readString();
                Integer valueOf24 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString126 = parcel.readString();
                String readString127 = parcel.readString();
                String readString128 = parcel.readString();
                if (readString128.equals("OPEN_MEDIA")) {
                    num2 = C05F.A00;
                } else {
                    if (!readString128.equals("NO_OP")) {
                        throw new IllegalArgumentException(readString128);
                    }
                    num2 = C05F.A01;
                }
                return new PrivacyMediaOverlayViewModel(valueOf24, num2, readString124, readString125, readString126, readString127, parcel.readInt(), parcel.readInt() != 0);
            case 91:
                C14360o3.A0B(parcel, 0);
                String readString129 = parcel.readString();
                String readString130 = parcel.readString();
                String readString131 = parcel.readString();
                String readString132 = parcel.readString();
                int readInt34 = parcel.readInt();
                boolean z58 = parcel.readInt() != 0;
                boolean z59 = parcel.readInt() != 0;
                String readString133 = parcel.readString();
                String readString134 = parcel.readString();
                String readString135 = parcel.readString();
                String readString136 = parcel.readString();
                if (readString136.equals("EXPLORE_ALL")) {
                    num = C05F.A00;
                } else if (readString136.equals("HASHTAG")) {
                    num = C05F.A01;
                } else if (readString136.equals("HASHTAG_INSPIRED")) {
                    num = C05F.A0C;
                } else if (readString136.equals("MAP")) {
                    num = C05F.A0N;
                } else if (readString136.equals("NEARBY")) {
                    num = C05F.A0Y;
                } else if (readString136.equals("POPULAR_REELS")) {
                    num = C05F.A0j;
                } else if (readString136.equals("SHOPPING")) {
                    num = C05F.A0u;
                } else if (readString136.equals("TRENDING")) {
                    num = C05F.A15;
                } else if (readString136.equals("INTEREST_KEYWORD")) {
                    num = C05F.A1F;
                } else if (readString136.equals("TOPIC")) {
                    num = C05F.A1I;
                } else {
                    if (!readString136.equals("UNKNOWN")) {
                        throw new IllegalArgumentException(readString136);
                    }
                    num = C05F.A02;
                }
                return new ExploreTopicCluster(EnumC127875qG.valueOf(parcel.readString()), num, readString129, readString130, readString131, readString132, readString133, readString134, readString135, readInt34, parcel.readInt(), z58, z59);
            case 92:
                C14360o3.A0B(parcel, 0);
                String readString137 = parcel.readString();
                Long valueOf25 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Long valueOf26 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                DirectAudioFallbackUrl directAudioFallbackUrl = (DirectAudioFallbackUrl) parcel.readParcelable(Audio.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList4 = null;
                } else {
                    int readInt35 = parcel.readInt();
                    arrayList4 = new ArrayList(readInt35);
                    for (int i12 = 0; i12 != readInt35; i12++) {
                        arrayList4.add(Float.valueOf(parcel.readFloat()));
                    }
                }
                return new Audio(directAudioFallbackUrl, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, valueOf25, valueOf26, readString137, arrayList4);
            case 93:
                C14360o3.A0B(parcel, 0);
                return new CameraToolInfo((CameraTool) parcel.readParcelable(CameraToolInfo.class.getClassLoader()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            case 94:
                C14360o3.A0B(parcel, 0);
                AttributionUser attributionUser = (AttributionUser) parcel.readParcelable(CreativeConfig.class.getClassLoader());
                ArrayList<String> createStringArrayList9 = parcel.createStringArrayList();
                String readString138 = parcel.readString();
                ArrayList arrayList15 = null;
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt36 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt36);
                    for (int i13 = 0; i13 != readInt36; i13++) {
                        arrayList2.add(CameraToolInfo.CREATOR.createFromParcel(parcel));
                    }
                }
                String readString139 = parcel.readString();
                String readString140 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt37 = parcel.readInt();
                    arrayList3 = new ArrayList(readInt37);
                    for (int i14 = 0; i14 != readInt37; i14++) {
                        arrayList3.add(EffectPreview.CREATOR.createFromParcel(parcel));
                    }
                }
                EffectPreview effectPreview = (EffectPreview) (parcel.readInt() == 0 ? null : EffectPreview.CREATOR.createFromParcel(parcel));
                ProductItemWithAR productItemWithAR = (ProductItemWithAR) parcel.readParcelable(CreativeConfig.class.getClassLoader());
                String readString141 = parcel.readString();
                String readString142 = parcel.readString();
                String readString143 = parcel.readString();
                String readString144 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt38 = parcel.readInt();
                    arrayList15 = new ArrayList(readInt38);
                    for (int i15 = 0; i15 != readInt38; i15++) {
                        arrayList15.add(parcel.readParcelable(CreativeConfig.class.getClassLoader()));
                    }
                }
                return new CreativeConfig(attributionUser, effectPreview, productItemWithAR, readString138, readString139, readString140, readString141, readString142, readString143, readString144, parcel.readString(), createStringArrayList9, arrayList2, arrayList3, arrayList15);
            case 95:
                C14360o3.A0B(parcel, 0);
                return new EffectActionSheet(parcel.createStringArrayList(), parcel.createStringArrayList());
            case 96:
                C14360o3.A0B(parcel, 0);
                AttributionUser attributionUser2 = (AttributionUser) parcel.readParcelable(EffectPreview.class.getClassLoader());
                String readString145 = parcel.readString();
                EffectActionSheet effectActionSheet = (EffectActionSheet) (parcel.readInt() == 0 ? null : EffectActionSheet.CREATOR.createFromParcel(parcel));
                String readString146 = parcel.readString();
                String readString147 = parcel.readString();
                String readString148 = parcel.readString();
                String readString149 = parcel.readString();
                return new EffectPreview(attributionUser2, (ImageUrl) parcel.readParcelable(EffectPreview.class.getClassLoader()), effectActionSheet, (EffectThumbnailImageDict) parcel.readParcelable(EffectPreview.class.getClassLoader()), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null, readString145, readString146, readString147, readString148, readString149, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 97:
                C14360o3.A0B(parcel, 0);
                ShoppingSwipeUpCTATextIcon shoppingSwipeUpCTATextIcon = (ShoppingSwipeUpCTATextIcon) parcel.readParcelable(ReelCTA.class.getClassLoader());
                String readString150 = parcel.readString();
                String readString151 = parcel.readString();
                String readString152 = parcel.readString();
                ArrayList arrayList16 = null;
                EffectPreview effectPreview2 = (EffectPreview) (parcel.readInt() == 0 ? null : EffectPreview.CREATOR.createFromParcel(parcel));
                String readString153 = parcel.readString();
                String readString154 = parcel.readString();
                Boolean valueOf27 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt39 = parcel.readInt();
                    arrayList = new ArrayList(readInt39);
                    for (int i16 = 0; i16 != readInt39; i16++) {
                        arrayList.add(parcel.readParcelable(ReelCTA.class.getClassLoader()));
                    }
                }
                ReelMultiProductLink reelMultiProductLink = (ReelMultiProductLink) parcel.readParcelable(ReelCTA.class.getClassLoader());
                String readString155 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt40 = parcel.readInt();
                    arrayList16 = new ArrayList(readInt40);
                    for (int i17 = 0; i17 != readInt40; i17++) {
                        arrayList16.add(parcel.readParcelable(ReelCTA.class.getClassLoader()));
                    }
                }
                return new ReelCTA(shoppingSwipeUpCTATextIcon, effectPreview2, (ProductCollectionLink) parcel.readParcelable(ReelCTA.class.getClassLoader()), (ProfileShopLink) parcel.readParcelable(ReelCTA.class.getClassLoader()), reelMultiProductLink, (ReelProductLink) parcel.readParcelable(ReelCTA.class.getClassLoader()), valueOf27, readString150, readString151, readString152, readString153, readString154, readString155, arrayList, arrayList16);
            case 98:
                C14360o3.A0B(parcel, 0);
                return new FilterGroupModelImpl((FilterChain) parcel.readParcelable(FilterGroupModelImpl.class.getClassLoader()), (PhotoFilter) parcel.readParcelable(FilterGroupModelImpl.class.getClassLoader()), AE6.A00(parcel.readString()), parcel.readInt(), parcel.readInt() != 0);
            default:
                C14360o3.A0B(parcel, 0);
                String readString156 = parcel.readString();
                String readString157 = parcel.readString();
                Integer valueOf28 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString158 = parcel.readString();
                String readString159 = parcel.readString();
                String readString160 = parcel.readString();
                String readString161 = parcel.readString();
                String readString162 = parcel.readString();
                String readString163 = parcel.readString();
                String readString164 = parcel.readString();
                String readString165 = parcel.readString();
                Integer valueOf29 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString166 = parcel.readString();
                Boolean valueOf30 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Boolean valueOf31 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Boolean valueOf32 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new AndroidLinkImpl(valueOf30, valueOf31, valueOf32, valueOf, valueOf28, valueOf29, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, readString156, readString157, readString158, readString159, readString160, readString161, readString162, readString163, readString164, readString165, readString166, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }
}
