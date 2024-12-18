package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.api.schemas.IgUserRelatedAccountTypeEnum;
import com.instagram.api.schemas.ImageURIDict;
import com.instagram.api.schemas.InstagramProductTaggabilityState;
import com.instagram.api.schemas.LinkWithText;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.MusicStatusStyleResponseInfo;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.ProductItemStickerBundleStyle;
import com.instagram.api.schemas.SMBSupportStickerDict;
import com.instagram.api.schemas.ShoppingBrandWithProductsSubtitle;
import com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles;
import com.instagram.api.schemas.ShoppingPivotItemType;
import com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon;
import com.instagram.api.schemas.ShowreelNativeClientName;
import com.instagram.api.schemas.SmartReelType;
import com.instagram.api.schemas.SoundPlatformProduct;
import com.instagram.api.schemas.StatusResponseImpl;
import com.instagram.api.schemas.StatusStyle;
import com.instagram.api.schemas.StatusStyleResponseInfo;
import com.instagram.api.schemas.StatusStyleResponseInfoImpl;
import com.instagram.api.schemas.StatusType;
import com.instagram.api.schemas.StickerPack;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StoryAdKeywordStyleEnum;
import com.instagram.api.schemas.StoryAdKeywordTypeEnum;
import com.instagram.api.schemas.StoryEmojisEntryAnimationType;
import com.instagram.api.schemas.StoryGroupMentionTappableData;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.api.schemas.StoryLinkInfoDict;
import com.instagram.api.schemas.StoryMultiProductStickerLinkDataImpl;
import com.instagram.api.schemas.StoryMusicPickAggregationVisibility;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.StoryProductItemStickerTappableData;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDictImpl;
import com.instagram.api.schemas.StoryPromptParticipationFrictionType;
import com.instagram.api.schemas.StoryPromptPrefType;
import com.instagram.api.schemas.StorySmbSupportStickerObjectImpl;
import com.instagram.api.schemas.StoryTemplateAssetDict;
import com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDictImpl;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDictImpl;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes;
import com.instagram.api.schemas.StoryTemplateFillableMusicStickerDictImpl;
import com.instagram.api.schemas.StoryTemplateMusicAssetInfoDict;
import com.instagram.api.schemas.StoryTemplateReshareMediaDictImpl;
import com.instagram.api.schemas.StoryTextAttributionType;
import com.instagram.api.schemas.StoryThenAndNowStickerDict;
import com.instagram.api.schemas.StoryTrendingPromptMediaSubType;
import com.instagram.api.schemas.StoryTrendingPromptSubType;
import com.instagram.api.schemas.StoryTrendingTemplateSectionType;
import com.instagram.api.schemas.StoryUnlockableStickerDataImpl;
import com.instagram.api.schemas.StoryUnlockableStickerTappableObjectImpl;
import com.instagram.api.schemas.SubmittedSubPostManageType;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.TIXUDesignTypeEnum;
import com.instagram.api.schemas.TappableComponentFeedRole;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.api.schemas.TemplateTopic;
import com.instagram.api.schemas.TemplatesBrowserSectionSize;
import com.instagram.api.schemas.TextAppAutoArchiveSettingInt;
import com.instagram.api.schemas.TextAppMentionType;
import com.instagram.api.schemas.TextAppMessagingPrototypeEligibility;
import com.instagram.api.schemas.TextAppOnlineStatusVisibilitySetting;
import com.instagram.api.schemas.TextAppPostBatchPurpose;
import com.instagram.api.schemas.TextAppRecommendedUsersType;
import com.instagram.api.schemas.TextAppSearchDiscussionTopicImpl;
import com.instagram.api.schemas.TextAppShareIgDirectContactRecommendationEntityType;
import com.instagram.api.schemas.TextAppTextFragmentType;
import com.instagram.api.schemas.TextAppUserFavoriteNotificationPostType;
import com.instagram.api.schemas.TextEntityType;
import com.instagram.api.schemas.TextPostAppAYSFButton;
import com.instagram.api.schemas.TextPostAppAYSFStyle;
import com.instagram.api.schemas.TextPostAppBadgeStatus;
import com.instagram.api.schemas.TextPostAppBottomSheetCTAType;
import com.instagram.api.schemas.TextPostAppPostUnavailableReason;
import com.instagram.api.schemas.TextPostAppUserFediverseInfoImpl;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.api.schemas.TextWithEntitiesBlockDict;
import com.instagram.api.schemas.ThreadContainerType;
import com.instagram.api.schemas.ThreadHeaderContextType;
import com.instagram.api.schemas.ThreadHeaderStyle;
import com.instagram.api.schemas.ThreadItemType;
import com.instagram.api.schemas.ThreadThemeType;
import com.instagram.api.schemas.ThumbnailInteractionType;
import com.instagram.api.schemas.Topic;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.api.schemas.TrackMetadataImpl;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.api.schemas.UnlockableStickerStatus;
import com.instagram.api.schemas.UntaggableReason;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.api.schemas.UpcomingEventStickerSource;
import com.instagram.api.schemas.UrpIndexAction;
import com.instagram.api.schemas.UrpRendererType;
import com.instagram.api.schemas.UserBannerInlineOtherProfileDict;
import com.instagram.api.schemas.UserBannerInlineOtherProfileDictImpl;
import com.instagram.api.schemas.UserCallSettings;
import com.instagram.api.schemas.UserRelatedAccountsInfoDictImpl;
import com.instagram.api.schemas.UserRoleOnFundraiser;
import com.instagram.api.schemas.VisualSearchSuggestedProductContainer;
import com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerDict;
import com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerDictImpl;
import com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObjectImpl;
import com.instagram.api.schemas.WordOffsetImpl;
import com.instagram.api.schemas.WorldLocationPagesInfoImpl;
import com.instagram.api.schemas.XDTCreatorInspirationHubType;
import com.instagram.api.schemas.XDTFloatingContextItemType;
import com.instagram.api.schemas.XDTIGAIAgentBannerType;
import com.instagram.api.schemas.XDTLazyFloatingContextItemImpl;
import com.instagram.api.schemas.XDTMetaAIMediaSuggestedPromptInfoImpl;
import com.instagram.api.schemas.XFBAdproRegionalRegulatedCategory;
import com.instagram.api.schemas.XFBBABITermsAcceptanceStatus;
import com.instagram.api.schemas.XFBCTXWelcomeMessageStatus;
import com.instagram.api.schemas.XFBFXIGPCEntryPoint;
import com.instagram.api.schemas.XFBIGBoostAudienceGeolocationImportance;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import com.instagram.api.schemas.XFBYPRequestStatus;
import com.instagram.common.textwithentities.model.TextWithEntities;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;

/* renamed from: X.IgB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41857IgB implements Parcelable.Creator {
    public final int A00;

    public C41857IgB(int i) {
        this.A00 = i;
    }

    public static C41857IgB A00(int i) {
        return new C41857IgB(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer A0U;
        Boolean valueOf;
        Boolean valueOf2;
        ArrayList A17;
        ArrayList A172;
        Long valueOf3;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(parcel, 0);
                return new ShoppingBrandWithProductsSubtitle(AbstractC37304Gc5.A1V(parcel), parcel.readString());
            case 1:
                C14360o3.A0B(parcel, 0);
                return ShoppingIGFundedIncentivesShopAdsBannerStyles.values()[parcel.readInt()];
            case 2:
                C14360o3.A0B(parcel, 0);
                return ShoppingPivotItemType.values()[parcel.readInt()];
            case 3:
                C14360o3.A0B(parcel, 0);
                return ShoppingSwipeUpCTATextIcon.values()[parcel.readInt()];
            case 4:
                C14360o3.A0B(parcel, 0);
                return ShowreelNativeClientName.values()[parcel.readInt()];
            case 5:
                C14360o3.A0B(parcel, 0);
                return SmartReelType.values()[parcel.readInt()];
            case 6:
                C14360o3.A0B(parcel, 0);
                return SoundPlatformProduct.values()[parcel.readInt()];
            case 7:
                String A0d = AbstractC37304Gc5.A0d(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                return new StatusResponseImpl((StatusStyle) AbstractC37304Gc5.A04(parcel, StatusResponseImpl.class), (StatusStyleResponseInfo) AbstractC37304Gc5.A04(parcel, StatusResponseImpl.class), (StatusType) AbstractC37304Gc5.A04(parcel, StatusResponseImpl.class), AbstractC37304Gc5.A0V(parcel), A0d, readString, readString2, readString3, readString4, parcel.readString(), parcel.readString());
            case 8:
                C14360o3.A0B(parcel, 0);
                return StatusStyle.values()[parcel.readInt()];
            case 9:
                C14360o3.A0B(parcel, 0);
                return new StatusStyleResponseInfoImpl((MusicStatusStyleResponseInfo) AbstractC37304Gc5.A04(parcel, StatusStyleResponseInfoImpl.class));
            case 10:
                C14360o3.A0B(parcel, 0);
                return StatusType.values()[parcel.readInt()];
            case 11:
                C14360o3.A0B(parcel, 0);
                return StickerPack.values()[parcel.readInt()];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(parcel, 0);
                return StickerTraySurface.values()[parcel.readInt()];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(parcel, 0);
                return StoryAdKeywordStyleEnum.values()[parcel.readInt()];
            case 14:
                C14360o3.A0B(parcel, 0);
                return StoryAdKeywordTypeEnum.values()[parcel.readInt()];
            case Process.SIGTERM /* 15 */:
                C14360o3.A0B(parcel, 0);
                return StoryEmojisEntryAnimationType.values()[parcel.readInt()];
            case 16:
                String A0d2 = AbstractC37304Gc5.A0d(parcel);
                String readString5 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList A173 = AbstractC25225BEi.A17(readInt);
                for (int i = 0; i != readInt; i++) {
                    AbstractC37304Gc5.A0r(parcel, StoryGroupMentionTappableData.class, A173);
                }
                return new StoryGroupMentionTappableData(AbstractC37304Gc5.A0V(parcel), A0d2, readString5, parcel.readString(), A173);
            case 17:
                C14360o3.A0B(parcel, 0);
                return StoryJoinChatStatus.values()[parcel.readInt()];
            case 18:
                C14360o3.A0B(parcel, 0);
                return new StoryMultiProductStickerLinkDataImpl(AbstractC37304Gc5.A0V(parcel));
            case Process.SIGSTOP /* 19 */:
                C14360o3.A0B(parcel, 0);
                return StoryMusicPickAggregationVisibility.values()[parcel.readInt()];
            case 20:
                C14360o3.A0B(parcel, 0);
                TrackData trackData = (TrackData) AbstractC37304Gc5.A04(parcel, StoryMusicPickTappableData.class);
                String readString6 = parcel.readString();
                StoryPromptDisablementState storyPromptDisablementState = (StoryPromptDisablementState) AbstractC37304Gc5.A04(parcel, StoryMusicPickTappableData.class);
                int readInt2 = parcel.readInt();
                ArrayList A174 = AbstractC25225BEi.A17(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    AbstractC37304Gc5.A0r(parcel, StoryMusicPickTappableData.class, A174);
                }
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                return new StoryMusicPickTappableData((OriginalSoundData) AbstractC37304Gc5.A04(parcel, StoryMusicPickTappableData.class), storyPromptDisablementState, (StoryTemplateAssetDict) AbstractC37304Gc5.A04(parcel, StoryMusicPickTappableData.class), trackData, readString6, readString7, readString8, parcel.readString(), A174, parcel.readInt());
            case 21:
                C14360o3.A0B(parcel, 0);
                return new StoryProductItemStickerTappableData((ProductItemStickerBundleStyle) AbstractC37304Gc5.A04(parcel, StoryProductItemStickerTappableData.class));
            case 22:
                return new StoryPromptParticipationFrictionInfoDictImpl((StoryLinkInfoDict) AbstractC37304Gc5.A04(parcel, StoryPromptParticipationFrictionInfoDictImpl.class), (StoryPromptParticipationFrictionType) AbstractC37304Gc5.A04(parcel, StoryPromptParticipationFrictionInfoDictImpl.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 23:
                C14360o3.A0B(parcel, 0);
                return StoryPromptParticipationFrictionType.values()[parcel.readInt()];
            case 24:
                C14360o3.A0B(parcel, 0);
                return StoryPromptPrefType.values()[parcel.readInt()];
            case 25:
                String A0d3 = AbstractC37304Gc5.A0d(parcel);
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                Float f = null;
                Float A0T = AbstractC37304Gc5.A0T(parcel, parcel.readInt());
                Float A0S = AbstractC37304Gc5.A0S(parcel);
                String readString12 = parcel.readString();
                Integer A0Y = AbstractC37304Gc5.A0Y(parcel);
                Integer A0Y2 = AbstractC37304Gc5.A0Y(parcel);
                Integer A0Y3 = AbstractC37304Gc5.A0Y(parcel);
                Integer A0Y4 = AbstractC37304Gc5.A0Y(parcel);
                String readString13 = parcel.readString();
                Float A0S2 = AbstractC37304Gc5.A0S(parcel);
                SMBSupportStickerDict sMBSupportStickerDict = (SMBSupportStickerDict) AbstractC37304Gc5.A04(parcel, StorySmbSupportStickerObjectImpl.class);
                Float A0S3 = AbstractC37304Gc5.A0S(parcel);
                Integer A0Y5 = AbstractC37304Gc5.A0Y(parcel);
                SubscriptionStickerDict subscriptionStickerDict = (SubscriptionStickerDict) AbstractC37304Gc5.A04(parcel, StorySmbSupportStickerObjectImpl.class);
                StickerTraySurface stickerTraySurface = (StickerTraySurface) AbstractC37304Gc5.A04(parcel, StorySmbSupportStickerObjectImpl.class);
                Float A0S4 = AbstractC37304Gc5.A0S(parcel);
                Float A0S5 = AbstractC37304Gc5.A0S(parcel);
                Float A0S6 = AbstractC37304Gc5.A0S(parcel);
                if (parcel.readInt() != 0) {
                    f = Float.valueOf(parcel.readFloat());
                }
                return new StorySmbSupportStickerObjectImpl(sMBSupportStickerDict, stickerTraySurface, subscriptionStickerDict, A0T, A0S, A0S2, A0S3, A0S4, A0S5, A0S6, f, A0Y, A0Y2, A0Y3, A0Y4, A0Y5, A0d3, readString9, readString10, readString11, readString12, readString13);
            case 26:
                return new StoryTemplateAvatarStickerOverlayDictImpl(AbstractC37304Gc5.A0T(parcel, parcel.readInt()), AbstractC37304Gc5.A0S(parcel), AbstractC37304Gc5.A0S(parcel), AbstractC37304Gc5.A0S(parcel), AbstractC37304Gc5.A0S(parcel), AbstractC37304Gc5.A0X(parcel), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 27:
                C14360o3.A0B(parcel, 0);
                return new StoryTemplateFillableGalleryStickerDictImpl((StoryTemplateFillableGalleryStickerShapes) AbstractC37304Gc5.A04(parcel, StoryTemplateFillableGalleryStickerDictImpl.class), AbstractC37304Gc5.A0T(parcel, parcel.readInt()), AbstractC37304Gc5.A0S(parcel), AbstractC37304Gc5.A0S(parcel), AbstractC37304Gc5.A0S(parcel), AbstractC37304Gc5.A0S(parcel), AbstractC37304Gc5.A0X(parcel));
            case 28:
                C14360o3.A0B(parcel, 0);
                return StoryTemplateFillableGalleryStickerShapes.values()[parcel.readInt()];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new StoryTemplateFillableMusicStickerDictImpl(AbstractC37304Gc5.A0T(parcel, parcel.readInt()), AbstractC37304Gc5.A0S(parcel), AbstractC37304Gc5.A0S(parcel), AbstractC37304Gc5.A0S(parcel), AbstractC37304Gc5.A0S(parcel), AbstractC37304Gc5.A0X(parcel), AbstractC37304Gc5.A0d(parcel));
            case 30:
                C14360o3.A0B(parcel, 0);
                MusicCanonicalType musicCanonicalType = (MusicCanonicalType) AbstractC37304Gc5.A04(parcel, StoryTemplateMusicAssetInfoDict.class);
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    A0U = null;
                } else {
                    A0U = AbstractC37304Gc5.A0U(parcel);
                }
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(AbstractC37304Gc5.A1W(parcel));
                }
                return new StoryTemplateMusicAssetInfoDict(musicCanonicalType, valueOf, bool, A0U, readString14, readString15, parcel.readString(), parcel.readString());
            case 31:
                C14360o3.A0B(parcel, 0);
                return new StoryTemplateReshareMediaDictImpl(parcel.readString(), AbstractC37304Gc5.A0V(parcel), parcel.readString());
            case 32:
                C14360o3.A0B(parcel, 0);
                return StoryTextAttributionType.values()[parcel.readInt()];
            case 33:
                String A0d4 = AbstractC37304Gc5.A0d(parcel);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new StoryThenAndNowStickerDict(valueOf2, A0d4, readString16, readString17);
            case 34:
                C14360o3.A0B(parcel, 0);
                return StoryTrendingPromptMediaSubType.values()[parcel.readInt()];
            case 35:
                C14360o3.A0B(parcel, 0);
                return StoryTrendingPromptSubType.values()[parcel.readInt()];
            case 36:
                C14360o3.A0B(parcel, 0);
                return StoryTrendingTemplateSectionType.values()[parcel.readInt()];
            case 37:
                return new StoryUnlockableStickerDataImpl((ImageURIDict) AbstractC37304Gc5.A04(parcel, StoryUnlockableStickerDataImpl.class), (UnlockableStickerStatus) AbstractC37304Gc5.A04(parcel, StoryUnlockableStickerDataImpl.class), AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 38:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    A17 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    A17 = AbstractC25225BEi.A17(readInt3);
                    for (int i3 = 0; i3 != readInt3; i3++) {
                        AbstractC37304Gc5.A0r(parcel, StoryUnlockableStickerTappableObjectImpl.class, A17);
                    }
                }
                return new StoryUnlockableStickerTappableObjectImpl(parcel.readString(), parcel.readString(), A17);
            case 39:
                C14360o3.A0B(parcel, 0);
                return SubmittedSubPostManageType.values()[parcel.readInt()];
            case 40:
                C14360o3.A0B(parcel, 0);
                return TIXUDesignTypeEnum.values()[parcel.readInt()];
            case Seq.NULL_REFNUM /* 41 */:
                C14360o3.A0B(parcel, 0);
                return TappableComponentFeedRole.values()[parcel.readInt()];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C14360o3.A0B(parcel, 0);
                return TargetingRelaxationConstants.values()[parcel.readInt()];
            case 43:
                C14360o3.A0B(parcel, 0);
                return TemplateTopic.values()[parcel.readInt()];
            case 44:
                C14360o3.A0B(parcel, 0);
                return TemplatesBrowserSectionSize.values()[parcel.readInt()];
            case 45:
                C14360o3.A0B(parcel, 0);
                return TextAppAutoArchiveSettingInt.values()[parcel.readInt()];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C14360o3.A0B(parcel, 0);
                return TextAppMentionType.values()[parcel.readInt()];
            case 47:
                C14360o3.A0B(parcel, 0);
                return TextAppMessagingPrototypeEligibility.values()[parcel.readInt()];
            case 48:
                C14360o3.A0B(parcel, 0);
                return TextAppOnlineStatusVisibilitySetting.values()[parcel.readInt()];
            case 49:
                C14360o3.A0B(parcel, 0);
                return TextAppPostBatchPurpose.values()[parcel.readInt()];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                C14360o3.A0B(parcel, 0);
                return TextAppRecommendedUsersType.values()[parcel.readInt()];
            case 51:
                return new TextAppSearchDiscussionTopicImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 52:
                C14360o3.A0B(parcel, 0);
                return TextAppShareIgDirectContactRecommendationEntityType.values()[parcel.readInt()];
            case 53:
                C14360o3.A0B(parcel, 0);
                return TextAppTextFragmentType.values()[parcel.readInt()];
            case 54:
                C14360o3.A0B(parcel, 0);
                return TextAppUserFavoriteNotificationPostType.values()[parcel.readInt()];
            case 55:
                C14360o3.A0B(parcel, 0);
                return TextEntityType.values()[parcel.readInt()];
            case 56:
                C14360o3.A0B(parcel, 0);
                return TextPostAppAYSFButton.values()[parcel.readInt()];
            case 57:
                C14360o3.A0B(parcel, 0);
                return TextPostAppAYSFStyle.values()[parcel.readInt()];
            case 58:
                C14360o3.A0B(parcel, 0);
                return TextPostAppBadgeStatus.values()[parcel.readInt()];
            case 59:
                C14360o3.A0B(parcel, 0);
                return TextPostAppBottomSheetCTAType.values()[parcel.readInt()];
            case 60:
                C14360o3.A0B(parcel, 0);
                return TextPostAppPostUnavailableReason.values()[parcel.readInt()];
            case 61:
                Integer num = null;
                if (AbstractC37304Gc5.A00(parcel) != 0) {
                    num = AbstractC37304Gc5.A0U(parcel);
                }
                return new TextPostAppUserFediverseInfoImpl(num, AbstractC37304Gc5.A0W(parcel));
            case 62:
                C14360o3.A0B(parcel, 0);
                return TextReviewStatus.values()[parcel.readInt()];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new TextWithEntitiesBlockDict((TextWithEntities) AbstractC37304Gc5.A04(parcel, TextWithEntitiesBlockDict.class), AbstractC37304Gc5.A0V(parcel), AbstractC37304Gc5.A0d(parcel));
            case 64:
                C14360o3.A0B(parcel, 0);
                return ThreadContainerType.values()[parcel.readInt()];
            case 65:
                C14360o3.A0B(parcel, 0);
                return ThreadHeaderContextType.values()[parcel.readInt()];
            case 66:
                C14360o3.A0B(parcel, 0);
                return ThreadHeaderStyle.values()[parcel.readInt()];
            case 67:
                C14360o3.A0B(parcel, 0);
                return ThreadItemType.values()[parcel.readInt()];
            case 68:
                C14360o3.A0B(parcel, 0);
                return ThreadThemeType.values()[parcel.readInt()];
            case 69:
                C14360o3.A0B(parcel, 0);
                return ThumbnailInteractionType.values()[parcel.readInt()];
            case 70:
                return new Topic(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 71:
                boolean A1M = AbstractC167007dF.A1M(AbstractC37304Gc5.A00(parcel));
                Boolean bool2 = null;
                if (parcel.readInt() == 0) {
                    A172 = null;
                } else {
                    int readInt4 = parcel.readInt();
                    A172 = AbstractC25225BEi.A17(readInt4);
                    for (int i4 = 0; i4 != readInt4; i4++) {
                        AbstractC37304Gc5.A0r(parcel, TrackMetadataImpl.class, A172);
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(parcel.readLong());
                }
                String readString18 = parcel.readString();
                boolean A1V = AbstractC37304Gc5.A1V(parcel);
                if (parcel.readInt() != 0) {
                    bool2 = Boolean.valueOf(AbstractC37304Gc5.A1W(parcel));
                }
                return new TrackMetadataImpl(bool2, AbstractC37304Gc5.A0Y(parcel), AbstractC37304Gc5.A0W(parcel), valueOf3, readString18, A172, A1M, A1V);
            case 72:
                C14360o3.A0B(parcel, 0);
                return new TrackOrOriginalSoundSchema((OriginalSoundData) AbstractC37304Gc5.A04(parcel, TrackOrOriginalSoundSchema.class), (TrackData) AbstractC37304Gc5.A04(parcel, TrackOrOriginalSoundSchema.class), (TrackMetadata) AbstractC37304Gc5.A04(parcel, TrackOrOriginalSoundSchema.class));
            case 73:
                C14360o3.A0B(parcel, 0);
                return UnlockableStickerStatus.values()[parcel.readInt()];
            case 74:
                C14360o3.A0B(parcel, 0);
                return new UntaggableReason((InstagramProductTaggabilityState) AbstractC37304Gc5.A04(parcel, UntaggableReason.class), (LinkWithText) AbstractC37304Gc5.A04(parcel, UntaggableReason.class), (LinkWithText) AbstractC37304Gc5.A04(parcel, UntaggableReason.class), parcel.readString(), parcel.readString());
            case 75:
                C14360o3.A0B(parcel, 0);
                return UpcomingEventIDType.values()[parcel.readInt()];
            case 76:
                C14360o3.A0B(parcel, 0);
                return UpcomingEventStickerSource.values()[parcel.readInt()];
            case 77:
                C14360o3.A0B(parcel, 0);
                return UrpIndexAction.values()[parcel.readInt()];
            case 78:
                C14360o3.A0B(parcel, 0);
                return UrpRendererType.values()[parcel.readInt()];
            case 79:
                return new UserBannerInlineOtherProfileDictImpl((IgUserRelatedAccountTypeEnum) AbstractC37304Gc5.A04(parcel, UserBannerInlineOtherProfileDictImpl.class), AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 80:
                C14360o3.A0B(parcel, 0);
                return UserCallSettings.values()[parcel.readInt()];
            case 81:
                C14360o3.A0B(parcel, 0);
                return new UserRelatedAccountsInfoDictImpl((UserBannerInlineOtherProfileDict) AbstractC37304Gc5.A04(parcel, UserRelatedAccountsInfoDictImpl.class), parcel.readString());
            case 82:
                C14360o3.A0B(parcel, 0);
                return UserRoleOnFundraiser.values()[parcel.readInt()];
            case 83:
                C14360o3.A0B(parcel, 0);
                return new VisualSearchSuggestedProductContainer(parcel.readLong(), parcel.readLong());
            case 84:
                return new WhatsAppChannelShareToIgStoryStickerDictImpl(AbstractC37304Gc5.A0d(parcel));
            case 85:
                String A0d5 = AbstractC37304Gc5.A0d(parcel);
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                Float f2 = null;
                Float A0T2 = AbstractC37304Gc5.A0T(parcel, parcel.readInt());
                Float A0S7 = AbstractC37304Gc5.A0S(parcel);
                String readString22 = parcel.readString();
                Integer A0Y6 = AbstractC37304Gc5.A0Y(parcel);
                Integer A0Y7 = AbstractC37304Gc5.A0Y(parcel);
                Integer A0Y8 = AbstractC37304Gc5.A0Y(parcel);
                Integer A0Y9 = AbstractC37304Gc5.A0Y(parcel);
                String readString23 = parcel.readString();
                Float A0S8 = AbstractC37304Gc5.A0S(parcel);
                Float A0S9 = AbstractC37304Gc5.A0S(parcel);
                Integer A0Y10 = AbstractC37304Gc5.A0Y(parcel);
                SubscriptionStickerDict subscriptionStickerDict2 = (SubscriptionStickerDict) AbstractC37304Gc5.A04(parcel, WhatsAppChannelShareToIgStoryStickerTappableObjectImpl.class);
                StickerTraySurface stickerTraySurface2 = (StickerTraySurface) AbstractC37304Gc5.A04(parcel, WhatsAppChannelShareToIgStoryStickerTappableObjectImpl.class);
                WhatsAppChannelShareToIgStoryStickerDict whatsAppChannelShareToIgStoryStickerDict = (WhatsAppChannelShareToIgStoryStickerDict) AbstractC37304Gc5.A04(parcel, WhatsAppChannelShareToIgStoryStickerTappableObjectImpl.class);
                Float A0S10 = AbstractC37304Gc5.A0S(parcel);
                Float A0S11 = AbstractC37304Gc5.A0S(parcel);
                Float A0S12 = AbstractC37304Gc5.A0S(parcel);
                if (parcel.readInt() != 0) {
                    f2 = Float.valueOf(parcel.readFloat());
                }
                return new WhatsAppChannelShareToIgStoryStickerTappableObjectImpl(stickerTraySurface2, subscriptionStickerDict2, whatsAppChannelShareToIgStoryStickerDict, A0T2, A0S7, A0S8, A0S9, A0S10, A0S11, A0S12, f2, A0Y6, A0Y7, A0Y8, A0Y9, A0Y10, A0d5, readString19, readString20, readString21, readString22, readString23);
            case 86:
                return new WordOffsetImpl(AbstractC37304Gc5.A00(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt(), AbstractC37304Gc5.A1V(parcel));
            case 87:
                return new WorldLocationPagesInfoImpl(AbstractC37304Gc5.A0d(parcel), AbstractC37304Gc5.A0V(parcel), parcel.readString());
            case 88:
                C14360o3.A0B(parcel, 0);
                return XDTCreatorInspirationHubType.values()[parcel.readInt()];
            case 89:
                C14360o3.A0B(parcel, 0);
                return XDTFloatingContextItemType.values()[parcel.readInt()];
            case 90:
                C14360o3.A0B(parcel, 0);
                return XDTIGAIAgentBannerType.values()[parcel.readInt()];
            case 91:
                C14360o3.A0B(parcel, 0);
                return new XDTLazyFloatingContextItemImpl((XDTFloatingContextItemType) AbstractC37304Gc5.A04(parcel, XDTLazyFloatingContextItemImpl.class), (User) AbstractC37304Gc5.A04(parcel, XDTLazyFloatingContextItemImpl.class));
            case 92:
                return new XDTMetaAIMediaSuggestedPromptInfoImpl(AbstractC37304Gc5.A0d(parcel));
            case 93:
                C14360o3.A0B(parcel, 0);
                return XFBAdproRegionalRegulatedCategory.values()[parcel.readInt()];
            case 94:
                C14360o3.A0B(parcel, 0);
                return XFBBABITermsAcceptanceStatus.values()[parcel.readInt()];
            case 95:
                C14360o3.A0B(parcel, 0);
                return XFBCTXWelcomeMessageStatus.values()[parcel.readInt()];
            case 96:
                C14360o3.A0B(parcel, 0);
                return XFBFXIGPCEntryPoint.values()[parcel.readInt()];
            case 97:
                C14360o3.A0B(parcel, 0);
                return XFBIGBoostAudienceGeolocationImportance.values()[parcel.readInt()];
            case 98:
                C14360o3.A0B(parcel, 0);
                return XFBTargetingAutomationAdvantageAudienceStatus.values()[parcel.readInt()];
            default:
                C14360o3.A0B(parcel, 0);
                return XFBYPRequestStatus.values()[parcel.readInt()];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ShoppingBrandWithProductsSubtitle[i];
            case 1:
                return new ShoppingIGFundedIncentivesShopAdsBannerStyles[i];
            case 2:
                return new ShoppingPivotItemType[i];
            case 3:
                return new ShoppingSwipeUpCTATextIcon[i];
            case 4:
                return new ShowreelNativeClientName[i];
            case 5:
                return new SmartReelType[i];
            case 6:
                return new SoundPlatformProduct[i];
            case 7:
                return new StatusResponseImpl[i];
            case 8:
                return new StatusStyle[i];
            case 9:
                return new StatusStyleResponseInfoImpl[i];
            case 10:
                return new StatusType[i];
            case 11:
                return new StickerPack[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new StickerTraySurface[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new StoryAdKeywordStyleEnum[i];
            case 14:
                return new StoryAdKeywordTypeEnum[i];
            case Process.SIGTERM /* 15 */:
                return new StoryEmojisEntryAnimationType[i];
            case 16:
                return new StoryGroupMentionTappableData[i];
            case 17:
                return new StoryJoinChatStatus[i];
            case 18:
                return new StoryMultiProductStickerLinkDataImpl[i];
            case Process.SIGSTOP /* 19 */:
                return new StoryMusicPickAggregationVisibility[i];
            case 20:
                return new StoryMusicPickTappableData[i];
            case 21:
                return new StoryProductItemStickerTappableData[i];
            case 22:
                return new StoryPromptParticipationFrictionInfoDictImpl[i];
            case 23:
                return new StoryPromptParticipationFrictionType[i];
            case 24:
                return new StoryPromptPrefType[i];
            case 25:
                return new StorySmbSupportStickerObjectImpl[i];
            case 26:
                return new StoryTemplateAvatarStickerOverlayDictImpl[i];
            case 27:
                return new StoryTemplateFillableGalleryStickerDictImpl[i];
            case 28:
                return new StoryTemplateFillableGalleryStickerShapes[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new StoryTemplateFillableMusicStickerDictImpl[i];
            case 30:
                return new StoryTemplateMusicAssetInfoDict[i];
            case 31:
                return new StoryTemplateReshareMediaDictImpl[i];
            case 32:
                return new StoryTextAttributionType[i];
            case 33:
                return new StoryThenAndNowStickerDict[i];
            case 34:
                return new StoryTrendingPromptMediaSubType[i];
            case 35:
                return new StoryTrendingPromptSubType[i];
            case 36:
                return new StoryTrendingTemplateSectionType[i];
            case 37:
                return new StoryUnlockableStickerDataImpl[i];
            case 38:
                return new StoryUnlockableStickerTappableObjectImpl[i];
            case 39:
                return new SubmittedSubPostManageType[i];
            case 40:
                return new TIXUDesignTypeEnum[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new TappableComponentFeedRole[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new TargetingRelaxationConstants[i];
            case 43:
                return new TemplateTopic[i];
            case 44:
                return new TemplatesBrowserSectionSize[i];
            case 45:
                return new TextAppAutoArchiveSettingInt[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new TextAppMentionType[i];
            case 47:
                return new TextAppMessagingPrototypeEligibility[i];
            case 48:
                return new TextAppOnlineStatusVisibilitySetting[i];
            case 49:
                return new TextAppPostBatchPurpose[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new TextAppRecommendedUsersType[i];
            case 51:
                return new TextAppSearchDiscussionTopicImpl[i];
            case 52:
                return new TextAppShareIgDirectContactRecommendationEntityType[i];
            case 53:
                return new TextAppTextFragmentType[i];
            case 54:
                return new TextAppUserFavoriteNotificationPostType[i];
            case 55:
                return new TextEntityType[i];
            case 56:
                return new TextPostAppAYSFButton[i];
            case 57:
                return new TextPostAppAYSFStyle[i];
            case 58:
                return new TextPostAppBadgeStatus[i];
            case 59:
                return new TextPostAppBottomSheetCTAType[i];
            case 60:
                return new TextPostAppPostUnavailableReason[i];
            case 61:
                return new TextPostAppUserFediverseInfoImpl[i];
            case 62:
                return new TextReviewStatus[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new TextWithEntitiesBlockDict[i];
            case 64:
                return new ThreadContainerType[i];
            case 65:
                return new ThreadHeaderContextType[i];
            case 66:
                return new ThreadHeaderStyle[i];
            case 67:
                return new ThreadItemType[i];
            case 68:
                return new ThreadThemeType[i];
            case 69:
                return new ThumbnailInteractionType[i];
            case 70:
                return new Topic[i];
            case 71:
                return new TrackMetadataImpl[i];
            case 72:
                return new TrackOrOriginalSoundSchema[i];
            case 73:
                return new UnlockableStickerStatus[i];
            case 74:
                return new UntaggableReason[i];
            case 75:
                return new UpcomingEventIDType[i];
            case 76:
                return new UpcomingEventStickerSource[i];
            case 77:
                return new UrpIndexAction[i];
            case 78:
                return new UrpRendererType[i];
            case 79:
                return new UserBannerInlineOtherProfileDictImpl[i];
            case 80:
                return new UserCallSettings[i];
            case 81:
                return new UserRelatedAccountsInfoDictImpl[i];
            case 82:
                return new UserRoleOnFundraiser[i];
            case 83:
                return new VisualSearchSuggestedProductContainer[i];
            case 84:
                return new WhatsAppChannelShareToIgStoryStickerDictImpl[i];
            case 85:
                return new WhatsAppChannelShareToIgStoryStickerTappableObjectImpl[i];
            case 86:
                return new WordOffsetImpl[i];
            case 87:
                return new WorldLocationPagesInfoImpl[i];
            case 88:
                return new XDTCreatorInspirationHubType[i];
            case 89:
                return new XDTFloatingContextItemType[i];
            case 90:
                return new XDTIGAIAgentBannerType[i];
            case 91:
                return new XDTLazyFloatingContextItemImpl[i];
            case 92:
                return new XDTMetaAIMediaSuggestedPromptInfoImpl[i];
            case 93:
                return new XFBAdproRegionalRegulatedCategory[i];
            case 94:
                return new XFBBABITermsAcceptanceStatus[i];
            case 95:
                return new XFBCTXWelcomeMessageStatus[i];
            case 96:
                return new XFBFXIGPCEntryPoint[i];
            case 97:
                return new XFBIGBoostAudienceGeolocationImportance[i];
            case 98:
                return new XFBTargetingAutomationAdvantageAudienceStatus[i];
            default:
                return new XFBYPRequestStatus[i];
        }
    }
}
