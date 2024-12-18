package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.api.schemas.GreetingAttachment;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.api.schemas.IGAIAgentVisibilityStatus;
import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerClickAreaEnum;
import com.instagram.api.schemas.IGAdsCardStickerSizeEnum;
import com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum;
import com.instagram.api.schemas.IGAdsGenericCardFormatEnum;
import com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum;
import com.instagram.api.schemas.IGAdsStickerCardRevampTypographyHierarchyEnum;
import com.instagram.api.schemas.IGAdsStoryInteractiveMediaGestureType;
import com.instagram.api.schemas.IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum;
import com.instagram.api.schemas.IGCTAStickerPositioningStrategyEnum;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum;
import com.instagram.api.schemas.IGLiveBadgeSettings;
import com.instagram.api.schemas.IGLiveModeratorEligibilityType;
import com.instagram.api.schemas.IGLiveModeratorStatus;
import com.instagram.api.schemas.IGLiveNotificationPreference;
import com.instagram.api.schemas.IGLiveWaveStatus;
import com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum;
import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;
import com.instagram.api.schemas.IGPostTriggerExperience;
import com.instagram.api.schemas.IGStoryTextAlignmentTypeEnum;
import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.IGUserHighlightsTrayType;
import com.instagram.api.schemas.IGUserProfileGridType;
import com.instagram.api.schemas.IGUserThirdPartyDownloads;
import com.instagram.api.schemas.IceBreakerMessage;
import com.instagram.api.schemas.IgUserBioLinkTypeEnum;
import com.instagram.api.schemas.IntentAwareAdsFormatInfo;
import com.instagram.api.schemas.IntentAwareAdsFormatType;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.InterestPivotStyle;
import com.instagram.api.schemas.LimitedInteractionsVersions;
import com.instagram.api.schemas.LineType;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.MediaCommentAudienceControlType;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.MediaNoteMimicryTrigger;
import com.instagram.api.schemas.MediaNoteMimicryType;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.api.schemas.MediaReminderImpl;
import com.instagram.api.schemas.MediaType;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.api.schemas.MerchantCheckoutStyle;
import com.instagram.api.schemas.MomentAdsTypeEnum;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.MoreInfoFacepilePositionType;
import com.instagram.api.schemas.MoreInfoFacepileSizeType;
import com.instagram.api.schemas.MoreInfoProductTagType;
import com.instagram.api.schemas.MoreInfoSUGPositionType;
import com.instagram.api.schemas.MoreInfoStickerCTAType;
import com.instagram.api.schemas.MoreInfoTextStyle;
import com.instagram.api.schemas.MoreInfoType;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicInfoImpl;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.MusicNoteResponseInfo;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.NavBarCameraDestination;
import com.instagram.api.schemas.NoteBackgroundColor;
import com.instagram.api.schemas.NoteFontStyle;
import com.instagram.api.schemas.NudgeType;
import com.instagram.api.schemas.NudgeVisualType;
import com.instagram.api.schemas.OnFeedMessages;
import com.instagram.api.schemas.OnImpressionStyle;
import com.instagram.api.schemas.OnboardingEntryActionType;
import com.instagram.api.schemas.OnboardingEntryPointPriority;
import com.instagram.api.schemas.OpenCarouselSubmissionState;
import com.instagram.api.schemas.OriginalAudioPartMetadata;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundConsumptionInfo;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalityFollowButtonInfo;
import com.instagram.api.schemas.OriginalityFollowButtonInfoImpl;
import com.instagram.api.schemas.OriginalityInfoImpl;
import com.instagram.api.schemas.OriginalitySourceMediaInfo;
import com.instagram.api.schemas.OriginalitySourceMediaInfoImpl;
import com.instagram.api.schemas.PollType;
import com.instagram.api.schemas.PostTriggerExperienceEligibleTrigger;
import com.instagram.api.schemas.PrimaryProfileLinkType;
import com.instagram.api.schemas.PrivacyDisclosureInfo;
import com.instagram.api.schemas.PrivacyDisclosureInfoImpl;
import com.instagram.api.schemas.PrivateReplyStatus;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.ProfessionalClipsUpsellType;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.api.schemas.ProfilePicUrlInfoImpl;
import com.instagram.api.schemas.ProfilePictureImpl;
import com.instagram.api.schemas.RIXUActionSource;
import com.instagram.api.schemas.RIXUAspectRatio;
import com.instagram.api.schemas.RIXUChainingSourceType;
import com.instagram.api.schemas.RIXUCoverChainingType;
import com.instagram.api.schemas.RIXUCtaType;
import com.instagram.api.schemas.RIXULayoutFormat;
import com.instagram.api.schemas.RIXULayoutStyle;
import com.instagram.api.schemas.RIXUPlayType;
import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.api.schemas.ReplyControlStr;
import com.instagram.api.schemas.SocialProofInfo;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.WhatsAppAttributionInfo;
import com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;

/* renamed from: X.9Ax, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206159Ax implements Parcelable.Creator {
    public final int A00;

    public C206159Ax(int i) {
        this.A00 = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        Boolean valueOf2;
        Boolean valueOf3;
        Boolean valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        Float valueOf7;
        Long valueOf8;
        Boolean valueOf9;
        Boolean valueOf10;
        Integer valueOf11;
        ArrayList arrayList;
        ArrayList arrayList2;
        Integer valueOf12;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Boolean valueOf13;
        Boolean valueOf14;
        Integer valueOf15;
        Boolean valueOf16;
        Boolean valueOf17;
        Boolean valueOf18;
        Boolean valueOf19;
        Boolean valueOf20;
        Boolean valueOf21;
        Integer valueOf22;
        Integer valueOf23;
        Integer valueOf24;
        Boolean valueOf25;
        Boolean valueOf26;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(parcel, 0);
                return HighlightReelTypeStr.values()[parcel.readInt()];
            case 1:
                C14360o3.A0B(parcel, 0);
                return IGAIAgentType.values()[parcel.readInt()];
            case 2:
                C14360o3.A0B(parcel, 0);
                return IGAIAgentVisibilityStatus.values()[parcel.readInt()];
            case 3:
                C14360o3.A0B(parcel, 0);
                return IGAdTransparencyDisclaimerPlacement.values()[parcel.readInt()];
            case 4:
                C14360o3.A0B(parcel, 0);
                return IGAdsCardBackgroundTypeEnum.values()[parcel.readInt()];
            case 5:
                C14360o3.A0B(parcel, 0);
                return IGAdsCardStickerCTATypeEnum.values()[parcel.readInt()];
            case 6:
                C14360o3.A0B(parcel, 0);
                return IGAdsCardStickerClickAreaEnum.values()[parcel.readInt()];
            case 7:
                C14360o3.A0B(parcel, 0);
                return IGAdsCardStickerSizeEnum.values()[parcel.readInt()];
            case 8:
                C14360o3.A0B(parcel, 0);
                return IGAdsFeedVideoWBViewerTypeEnum.values()[parcel.readInt()];
            case 9:
                C14360o3.A0B(parcel, 0);
                return IGAdsGenericCardFormatEnum.values()[parcel.readInt()];
            case 10:
                C14360o3.A0B(parcel, 0);
                return IGAdsGenericCardInfoTypeEnum.values()[parcel.readInt()];
            case 11:
                C14360o3.A0B(parcel, 0);
                return IGAdsStickerCardRevampTypographyHierarchyEnum.values()[parcel.readInt()];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(parcel, 0);
                return IGAdsStoryInteractiveMediaGestureType.values()[parcel.readInt()];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(parcel, 0);
                return IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum.values()[parcel.readInt()];
            case 14:
                C14360o3.A0B(parcel, 0);
                return IGCTAStickerPositioningStrategyEnum.values()[parcel.readInt()];
            case Process.SIGTERM /* 15 */:
                C14360o3.A0B(parcel, 0);
                String readString = parcel.readString();
                boolean z = true;
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    boolean z2 = false;
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    }
                    valueOf = Boolean.valueOf(z2);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    boolean z3 = false;
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    }
                    valueOf2 = Boolean.valueOf(z3);
                }
                OnFeedMessages onFeedMessages = (OnFeedMessages) parcel.readParcelable(IGCTMessagingAdsInfoDict.class.getClassLoader());
                String readString2 = parcel.readString();
                PrivacyDisclosureInfo privacyDisclosureInfo = (PrivacyDisclosureInfo) parcel.readParcelable(IGCTMessagingAdsInfoDict.class.getClassLoader());
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    boolean z4 = false;
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    }
                    valueOf3 = Boolean.valueOf(z4);
                }
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() == 0) {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                }
                return new IGCTMessagingAdsInfoDict(onFeedMessages, privacyDisclosureInfo, (SocialProofInfo) parcel.readParcelable(IGCTMessagingAdsInfoDict.class.getClassLoader()), (WhatsAppAttributionInfo) parcel.readParcelable(IGCTMessagingAdsInfoDict.class.getClassLoader()), valueOf, valueOf2, valueOf3, bool, readString, readString2, readString3, readString4);
            case 16:
                C14360o3.A0B(parcel, 0);
                return IGFormatLiquidityUseCaseEnum.values()[parcel.readInt()];
            case 17:
                C14360o3.A0B(parcel, 0);
                return IGLiveBadgeSettings.values()[parcel.readInt()];
            case 18:
                C14360o3.A0B(parcel, 0);
                return IGLiveModeratorEligibilityType.values()[parcel.readInt()];
            case Process.SIGSTOP /* 19 */:
                C14360o3.A0B(parcel, 0);
                return IGLiveModeratorStatus.values()[parcel.readInt()];
            case 20:
                C14360o3.A0B(parcel, 0);
                return IGLiveNotificationPreference.values()[parcel.readInt()];
            case 21:
                C14360o3.A0B(parcel, 0);
                return IGLiveWaveStatus.values()[parcel.readInt()];
            case 22:
                C14360o3.A0B(parcel, 0);
                return IGPBIAProfileBrowseTypeEnum.values()[parcel.readInt()];
            case 23:
                C14360o3.A0B(parcel, 0);
                return IGPostClickEligibleExperienceTypes.values()[parcel.readInt()];
            case 24:
                C14360o3.A0B(parcel, 0);
                return IGPostTriggerExperience.values()[parcel.readInt()];
            case 25:
                C14360o3.A0B(parcel, 0);
                return IGStoryTextAlignmentTypeEnum.values()[parcel.readInt()];
            case 26:
                C14360o3.A0B(parcel, 0);
                return IGTVAccountLevelMonetizationToggleSetting.values()[parcel.readInt()];
            case 27:
                C14360o3.A0B(parcel, 0);
                return IGUserHighlightsTrayType.values()[parcel.readInt()];
            case 28:
                C14360o3.A0B(parcel, 0);
                return IGUserProfileGridType.values()[parcel.readInt()];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C14360o3.A0B(parcel, 0);
                return IGUserThirdPartyDownloads.values()[parcel.readInt()];
            case 30:
                C14360o3.A0B(parcel, 0);
                return new IceBreakerMessage(parcel.readString(), parcel.readString(), parcel.readString());
            case 31:
                C14360o3.A0B(parcel, 0);
                return IgUserBioLinkTypeEnum.values()[parcel.readInt()];
            case 32:
                C14360o3.A0B(parcel, 0);
                return IntentAwareAdsFormatType.values()[parcel.readInt()];
            case 33:
                C14360o3.A0B(parcel, 0);
                IntentAwareAdsFormatInfo intentAwareAdsFormatInfo = (IntentAwareAdsFormatInfo) parcel.readParcelable(IntentAwareAdsInfo.class.getClassLoader());
                String readString5 = parcel.readString();
                Integer num = null;
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    boolean z5 = false;
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    }
                    valueOf4 = Boolean.valueOf(z5);
                }
                String readString6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Integer.valueOf(parcel.readInt());
                }
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                if (parcel.readInt() != 0) {
                    num = Integer.valueOf(parcel.readInt());
                }
                return new IntentAwareAdsInfo(intentAwareAdsFormatInfo, valueOf4, valueOf5, num, readString5, readString6, readString7, readString8, parcel.readString(), parcel.readString());
            case 34:
                C14360o3.A0B(parcel, 0);
                return InterestPivotStyle.values()[parcel.readInt()];
            case 35:
                C14360o3.A0B(parcel, 0);
                return LimitedInteractionsVersions.values()[parcel.readInt()];
            case 36:
                C14360o3.A0B(parcel, 0);
                return LineType.values()[parcel.readInt()];
            case 37:
                C14360o3.A0B(parcel, 0);
                return LiveUserPaySupportTier.values()[parcel.readInt()];
            case 38:
                C14360o3.A0B(parcel, 0);
                int readInt = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList5.add(parcel.readParcelable(Lyrics.class.getClassLoader()));
                }
                return new Lyrics(arrayList5);
            case 39:
                C14360o3.A0B(parcel, 0);
                return MediaCommentAudienceControlType.values()[parcel.readInt()];
            case 40:
                C14360o3.A0B(parcel, 0);
                return new MediaCroppingCoordinates(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
            case Seq.NULL_REFNUM /* 41 */:
                C14360o3.A0B(parcel, 0);
                return MediaGenAIDetectionMethod.values()[parcel.readInt()];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C14360o3.A0B(parcel, 0);
                return MediaNoteMimicryTrigger.values()[parcel.readInt()];
            case 43:
                C14360o3.A0B(parcel, 0);
                return MediaNoteMimicryType.values()[parcel.readInt()];
            case 44:
                C14360o3.A0B(parcel, 0);
                return MediaOptionStyle.values()[parcel.readInt()];
            case 45:
                C14360o3.A0B(parcel, 0);
                Boolean bool2 = null;
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() != 0) {
                    boolean z6 = false;
                    if (parcel.readInt() != 0) {
                        z6 = true;
                    }
                    bool2 = Boolean.valueOf(z6);
                }
                return new MediaReminderImpl(bool2, valueOf6);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C14360o3.A0B(parcel, 0);
                return MediaType.values()[parcel.readInt()];
            case 47:
                C14360o3.A0B(parcel, 0);
                boolean z7 = false;
                if (parcel.readInt() != 0) {
                    z7 = true;
                }
                String readString9 = parcel.readString();
                Float f = null;
                if (parcel.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Float.valueOf(parcel.readFloat());
                }
                User user = (User) parcel.readParcelable(MediaVCRTappableData.class.getClassLoader());
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                if (parcel.readInt() != 0) {
                    f = Float.valueOf(parcel.readFloat());
                }
                return new MediaVCRTappableData(user, valueOf7, f, readString9, readString10, readString11, readString12, readString13, readString14, parcel.readString(), z7);
            case 48:
                C14360o3.A0B(parcel, 0);
                return MerchantCheckoutStyle.values()[parcel.readInt()];
            case 49:
                C14360o3.A0B(parcel, 0);
                return MomentAdsTypeEnum.values()[parcel.readInt()];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                C14360o3.A0B(parcel, 0);
                return MonetizationEligibilityDecision.values()[parcel.readInt()];
            case 51:
                C14360o3.A0B(parcel, 0);
                return MoreInfoFacepilePositionType.values()[parcel.readInt()];
            case 52:
                C14360o3.A0B(parcel, 0);
                return MoreInfoFacepileSizeType.values()[parcel.readInt()];
            case 53:
                C14360o3.A0B(parcel, 0);
                return MoreInfoProductTagType.values()[parcel.readInt()];
            case 54:
                C14360o3.A0B(parcel, 0);
                return MoreInfoSUGPositionType.values()[parcel.readInt()];
            case 55:
                C14360o3.A0B(parcel, 0);
                return MoreInfoStickerCTAType.values()[parcel.readInt()];
            case 56:
                C14360o3.A0B(parcel, 0);
                return MoreInfoTextStyle.values()[parcel.readInt()];
            case 57:
                C14360o3.A0B(parcel, 0);
                return MoreInfoType.values()[parcel.readInt()];
            case 58:
                C14360o3.A0B(parcel, 0);
                return MusicCanonicalType.values()[parcel.readInt()];
            case 59:
                C14360o3.A0B(parcel, 0);
                TrackData trackData = (TrackData) parcel.readParcelable(MusicInfoImpl.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf8 = null;
                } else {
                    valueOf8 = Long.valueOf(parcel.readLong());
                }
                return new MusicInfoImpl(trackData, (MusicConsumptionModel) parcel.readParcelable(MusicInfoImpl.class.getClassLoader()), valueOf8);
            case 60:
                C14360o3.A0B(parcel, 0);
                return MusicMuteAudioReason.values()[parcel.readInt()];
            case 61:
                C14360o3.A0B(parcel, 0);
                boolean z8 = true;
                Integer num2 = null;
                if (parcel.readInt() == 0) {
                    valueOf9 = null;
                } else {
                    boolean z9 = false;
                    if (parcel.readInt() != 0) {
                        z9 = true;
                    }
                    valueOf9 = Boolean.valueOf(z9);
                }
                if (parcel.readInt() == 0) {
                    valueOf10 = null;
                } else {
                    if (parcel.readInt() == 0) {
                        z8 = false;
                    }
                    valueOf10 = Boolean.valueOf(z8);
                }
                MusicInfo musicInfo = (MusicInfo) parcel.readParcelable(MusicNoteResponseInfo.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    num2 = Integer.valueOf(parcel.readInt());
                }
                return new MusicNoteResponseInfo(musicInfo, (User) parcel.readParcelable(MusicNoteResponseInfo.class.getClassLoader()), valueOf9, valueOf10, num2, parcel.readString());
            case 62:
                C14360o3.A0B(parcel, 0);
                return MusicProduct.values()[parcel.readInt()];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                C14360o3.A0B(parcel, 0);
                return NavBarCameraDestination.values()[parcel.readInt()];
            case 64:
                C14360o3.A0B(parcel, 0);
                return NoteBackgroundColor.values()[parcel.readInt()];
            case 65:
                C14360o3.A0B(parcel, 0);
                return NoteFontStyle.values()[parcel.readInt()];
            case 66:
                C14360o3.A0B(parcel, 0);
                return NudgeType.values()[parcel.readInt()];
            case 67:
                C14360o3.A0B(parcel, 0);
                return NudgeVisualType.values()[parcel.readInt()];
            case 68:
                C14360o3.A0B(parcel, 0);
                Boolean bool3 = null;
                if (parcel.readInt() == 0) {
                    valueOf11 = null;
                } else {
                    valueOf11 = Integer.valueOf(parcel.readInt());
                }
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                String readString18 = parcel.readString();
                String readString19 = parcel.readString();
                boolean z10 = false;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        arrayList.add(parcel.readParcelable(OnFeedMessages.class.getClassLoader()));
                    }
                }
                GreetingAttachment greetingAttachment = (GreetingAttachment) parcel.readParcelable(OnFeedMessages.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    bool3 = Boolean.valueOf(z10);
                }
                return new OnFeedMessages(greetingAttachment, bool3, valueOf11, readString15, readString16, readString17, readString18, readString19, arrayList);
            case 69:
                C14360o3.A0B(parcel, 0);
                return OnImpressionStyle.values()[parcel.readInt()];
            case 70:
                C14360o3.A0B(parcel, 0);
                return OnboardingEntryActionType.values()[parcel.readInt()];
            case 71:
                C14360o3.A0B(parcel, 0);
                return OnboardingEntryPointPriority.values()[parcel.readInt()];
            case 72:
                C14360o3.A0B(parcel, 0);
                return OpenCarouselSubmissionState.values()[parcel.readInt()];
            case 73:
                C14360o3.A0B(parcel, 0);
                Boolean bool4 = null;
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt3);
                    for (int i3 = 0; i3 != readInt3; i3++) {
                        arrayList2.add(parcel.readParcelable(OriginalAudioPartMetadata.class.getClassLoader()));
                    }
                }
                int readInt4 = parcel.readInt();
                MusicCanonicalType musicCanonicalType = (MusicCanonicalType) parcel.readParcelable(OriginalAudioPartMetadata.class.getClassLoader());
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                int readInt5 = parcel.readInt();
                User user2 = (User) parcel.readParcelable(OriginalAudioPartMetadata.class.getClassLoader());
                boolean z11 = false;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                if (parcel.readInt() != 0) {
                    boolean z12 = false;
                    if (parcel.readInt() != 0) {
                        z12 = true;
                    }
                    bool4 = Boolean.valueOf(z12);
                }
                boolean z13 = false;
                if (parcel.readInt() != 0) {
                    z13 = true;
                }
                return new OriginalAudioPartMetadata(musicCanonicalType, (ImageUrl) parcel.readParcelable(OriginalAudioPartMetadata.class.getClassLoader()), user2, bool4, readString20, readString21, parcel.readString(), arrayList2, readInt4, readInt5, parcel.readInt(), z11, z13);
            case 74:
                C14360o3.A0B(parcel, 0);
                return OriginalAudioSubtype.values()[parcel.readInt()];
            case 75:
                C14360o3.A0B(parcel, 0);
                String readString22 = parcel.readString();
                boolean z14 = false;
                boolean z15 = false;
                if (parcel.readInt() != 0) {
                    z15 = true;
                }
                if (parcel.readInt() != 0) {
                    z14 = true;
                }
                return new OriginalSoundConsumptionInfo((MusicMuteAudioReason) parcel.readParcelable(OriginalSoundConsumptionInfo.class.getClassLoader()), readString22, parcel.readString(), z15, z14);
            case 76:
                C14360o3.A0B(parcel, 0);
                boolean z16 = false;
                if (parcel.readInt() != 0) {
                    z16 = true;
                }
                String readString23 = parcel.readString();
                Integer num3 = null;
                if (parcel.readInt() == 0) {
                    valueOf12 = null;
                } else {
                    valueOf12 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt6 = parcel.readInt();
                    arrayList3 = new ArrayList(readInt6);
                    for (int i4 = 0; i4 != readInt6; i4++) {
                        arrayList3.add(parcel.readParcelable(OriginalSoundData.class.getClassLoader()));
                    }
                }
                int readInt7 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt7);
                for (int i5 = 0; i5 != readInt7; i5++) {
                    arrayList6.add(parcel.readParcelable(OriginalSoundData.class.getClassLoader()));
                }
                if (parcel.readInt() == 0) {
                    arrayList4 = null;
                } else {
                    int readInt8 = parcel.readInt();
                    arrayList4 = new ArrayList(readInt8);
                    for (int i6 = 0; i6 != readInt8; i6++) {
                        arrayList4.add(parcel.readParcelable(OriginalSoundData.class.getClassLoader()));
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf13 = null;
                } else {
                    boolean z17 = false;
                    if (parcel.readInt() != 0) {
                        z17 = true;
                    }
                    valueOf13 = Boolean.valueOf(z17);
                }
                if (parcel.readInt() == 0) {
                    valueOf14 = null;
                } else {
                    boolean z18 = false;
                    if (parcel.readInt() != 0) {
                        z18 = true;
                    }
                    valueOf14 = Boolean.valueOf(z18);
                }
                OriginalSoundConsumptionInfo originalSoundConsumptionInfo = (OriginalSoundConsumptionInfo) parcel.readParcelable(OriginalSoundData.class.getClassLoader());
                String readString24 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf15 = null;
                } else {
                    valueOf15 = Integer.valueOf(parcel.readInt());
                }
                String readString25 = parcel.readString();
                boolean z19 = false;
                if (parcel.readInt() != 0) {
                    z19 = true;
                }
                User user3 = (User) parcel.readParcelable(OriginalSoundData.class.getClassLoader());
                boolean z20 = false;
                if (parcel.readInt() != 0) {
                    z20 = true;
                }
                if (parcel.readInt() == 0) {
                    valueOf16 = null;
                } else {
                    boolean z21 = false;
                    if (parcel.readInt() != 0) {
                        z21 = true;
                    }
                    valueOf16 = Boolean.valueOf(z21);
                }
                if (parcel.readInt() == 0) {
                    valueOf17 = null;
                } else {
                    boolean z22 = false;
                    if (parcel.readInt() != 0) {
                        z22 = true;
                    }
                    valueOf17 = Boolean.valueOf(z22);
                }
                boolean z23 = false;
                if (parcel.readInt() != 0) {
                    z23 = true;
                }
                if (parcel.readInt() == 0) {
                    valueOf18 = null;
                } else {
                    boolean z24 = false;
                    if (parcel.readInt() != 0) {
                        z24 = true;
                    }
                    valueOf18 = Boolean.valueOf(z24);
                }
                if (parcel.readInt() == 0) {
                    valueOf19 = null;
                } else {
                    boolean z25 = false;
                    if (parcel.readInt() != 0) {
                        z25 = true;
                    }
                    valueOf19 = Boolean.valueOf(z25);
                }
                if (parcel.readInt() == 0) {
                    valueOf20 = null;
                } else {
                    boolean z26 = false;
                    if (parcel.readInt() != 0) {
                        z26 = true;
                    }
                    valueOf20 = Boolean.valueOf(z26);
                }
                String readString26 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf21 = null;
                } else {
                    boolean z27 = false;
                    if (parcel.readInt() != 0) {
                        z27 = true;
                    }
                    valueOf21 = Boolean.valueOf(z27);
                }
                OriginalAudioSubtype originalAudioSubtype = (OriginalAudioSubtype) parcel.readParcelable(OriginalSoundData.class.getClassLoader());
                String readString27 = parcel.readString();
                String readString28 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf22 = null;
                } else {
                    valueOf22 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    valueOf23 = null;
                } else {
                    valueOf23 = Integer.valueOf(parcel.readInt());
                }
                String readString29 = parcel.readString();
                boolean z28 = false;
                if (parcel.readInt() != 0) {
                    z28 = true;
                }
                if (parcel.readInt() == 0) {
                    valueOf24 = null;
                } else {
                    valueOf24 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() != 0) {
                    num3 = Integer.valueOf(parcel.readInt());
                }
                return new OriginalSoundData(originalAudioSubtype, originalSoundConsumptionInfo, (XpostOriginalSoundFBCreatorInfo) parcel.readParcelable(OriginalSoundData.class.getClassLoader()), user3, valueOf13, valueOf14, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf12, valueOf15, valueOf22, valueOf23, valueOf24, num3, readString23, readString24, readString25, readString26, readString27, readString28, readString29, arrayList3, arrayList6, arrayList4, z16, z19, z20, z23, z28);
            case 77:
                C14360o3.A0B(parcel, 0);
                boolean z29 = true;
                Boolean bool5 = null;
                if (parcel.readInt() == 0) {
                    valueOf25 = null;
                } else {
                    boolean z30 = false;
                    if (parcel.readInt() != 0) {
                        z30 = true;
                    }
                    valueOf25 = Boolean.valueOf(z30);
                }
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() == 0) {
                        z29 = false;
                    }
                    bool5 = Boolean.valueOf(z29);
                }
                return new OriginalityFollowButtonInfoImpl(valueOf25, bool5);
            case 78:
                C14360o3.A0B(parcel, 0);
                if (parcel.readInt() == 0) {
                    valueOf26 = null;
                } else {
                    boolean z31 = false;
                    if (parcel.readInt() != 0) {
                        z31 = true;
                    }
                    valueOf26 = Boolean.valueOf(z31);
                }
                return new OriginalityInfoImpl((OriginalityFollowButtonInfo) parcel.readParcelable(OriginalityInfoImpl.class.getClassLoader()), (OriginalitySourceMediaInfo) parcel.readParcelable(OriginalityInfoImpl.class.getClassLoader()), valueOf26);
            case 79:
                C14360o3.A0B(parcel, 0);
                return new OriginalitySourceMediaInfoImpl((User) parcel.readParcelable(OriginalitySourceMediaInfoImpl.class.getClassLoader()), parcel.readString());
            case 80:
                C14360o3.A0B(parcel, 0);
                return PollType.values()[parcel.readInt()];
            case 81:
                C14360o3.A0B(parcel, 0);
                return PostTriggerExperienceEligibleTrigger.values()[parcel.readInt()];
            case 82:
                C14360o3.A0B(parcel, 0);
                return PrimaryProfileLinkType.values()[parcel.readInt()];
            case 83:
                C14360o3.A0B(parcel, 0);
                return new PrivacyDisclosureInfoImpl(parcel.readString(), parcel.readString());
            case 84:
                C14360o3.A0B(parcel, 0);
                return PrivateReplyStatus.values()[parcel.readInt()];
            case 85:
                C14360o3.A0B(parcel, 0);
                return ProductReviewStatus.values()[parcel.readInt()];
            case 86:
                C14360o3.A0B(parcel, 0);
                return ProfessionalClipsUpsellType.values()[parcel.readInt()];
            case 87:
                C14360o3.A0B(parcel, 0);
                return ProfileBannerType.values()[parcel.readInt()];
            case 88:
                C14360o3.A0B(parcel, 0);
                return new ProfilePicUrlInfoImpl(parcel.readInt(), parcel.readString(), parcel.readInt());
            case 89:
                C14360o3.A0B(parcel, 0);
                return new ProfilePictureImpl((ImageUrl) parcel.readParcelable(ProfilePictureImpl.class.getClassLoader()));
            case 90:
                C14360o3.A0B(parcel, 0);
                return RIXUActionSource.values()[parcel.readInt()];
            case 91:
                C14360o3.A0B(parcel, 0);
                return RIXUAspectRatio.values()[parcel.readInt()];
            case 92:
                C14360o3.A0B(parcel, 0);
                return RIXUChainingSourceType.values()[parcel.readInt()];
            case 93:
                C14360o3.A0B(parcel, 0);
                return RIXUCoverChainingType.values()[parcel.readInt()];
            case 94:
                C14360o3.A0B(parcel, 0);
                return RIXUCtaType.values()[parcel.readInt()];
            case 95:
                C14360o3.A0B(parcel, 0);
                return RIXULayoutFormat.values()[parcel.readInt()];
            case 96:
                C14360o3.A0B(parcel, 0);
                return RIXULayoutStyle.values()[parcel.readInt()];
            case 97:
                C14360o3.A0B(parcel, 0);
                return RIXUPlayType.values()[parcel.readInt()];
            case 98:
                C14360o3.A0B(parcel, 0);
                return ReelAutoArchiveSettingStr.values()[parcel.readInt()];
            default:
                C14360o3.A0B(parcel, 0);
                return ReplyControlStr.values()[parcel.readInt()];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new HighlightReelTypeStr[i];
            case 1:
                return new IGAIAgentType[i];
            case 2:
                return new IGAIAgentVisibilityStatus[i];
            case 3:
                return new IGAdTransparencyDisclaimerPlacement[i];
            case 4:
                return new IGAdsCardBackgroundTypeEnum[i];
            case 5:
                return new IGAdsCardStickerCTATypeEnum[i];
            case 6:
                return new IGAdsCardStickerClickAreaEnum[i];
            case 7:
                return new IGAdsCardStickerSizeEnum[i];
            case 8:
                return new IGAdsFeedVideoWBViewerTypeEnum[i];
            case 9:
                return new IGAdsGenericCardFormatEnum[i];
            case 10:
                return new IGAdsGenericCardInfoTypeEnum[i];
            case 11:
                return new IGAdsStickerCardRevampTypographyHierarchyEnum[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new IGAdsStoryInteractiveMediaGestureType[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum[i];
            case 14:
                return new IGCTAStickerPositioningStrategyEnum[i];
            case Process.SIGTERM /* 15 */:
                return new IGCTMessagingAdsInfoDict[i];
            case 16:
                return new IGFormatLiquidityUseCaseEnum[i];
            case 17:
                return new IGLiveBadgeSettings[i];
            case 18:
                return new IGLiveModeratorEligibilityType[i];
            case Process.SIGSTOP /* 19 */:
                return new IGLiveModeratorStatus[i];
            case 20:
                return new IGLiveNotificationPreference[i];
            case 21:
                return new IGLiveWaveStatus[i];
            case 22:
                return new IGPBIAProfileBrowseTypeEnum[i];
            case 23:
                return new IGPostClickEligibleExperienceTypes[i];
            case 24:
                return new IGPostTriggerExperience[i];
            case 25:
                return new IGStoryTextAlignmentTypeEnum[i];
            case 26:
                return new IGTVAccountLevelMonetizationToggleSetting[i];
            case 27:
                return new IGUserHighlightsTrayType[i];
            case 28:
                return new IGUserProfileGridType[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new IGUserThirdPartyDownloads[i];
            case 30:
                return new IceBreakerMessage[i];
            case 31:
                return new IgUserBioLinkTypeEnum[i];
            case 32:
                return new IntentAwareAdsFormatType[i];
            case 33:
                return new IntentAwareAdsInfo[i];
            case 34:
                return new InterestPivotStyle[i];
            case 35:
                return new LimitedInteractionsVersions[i];
            case 36:
                return new LineType[i];
            case 37:
                return new LiveUserPaySupportTier[i];
            case 38:
                return new Lyrics[i];
            case 39:
                return new MediaCommentAudienceControlType[i];
            case 40:
                return new MediaCroppingCoordinates[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new MediaGenAIDetectionMethod[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new MediaNoteMimicryTrigger[i];
            case 43:
                return new MediaNoteMimicryType[i];
            case 44:
                return new MediaOptionStyle[i];
            case 45:
                return new MediaReminderImpl[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new MediaType[i];
            case 47:
                return new MediaVCRTappableData[i];
            case 48:
                return new MerchantCheckoutStyle[i];
            case 49:
                return new MomentAdsTypeEnum[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new MonetizationEligibilityDecision[i];
            case 51:
                return new MoreInfoFacepilePositionType[i];
            case 52:
                return new MoreInfoFacepileSizeType[i];
            case 53:
                return new MoreInfoProductTagType[i];
            case 54:
                return new MoreInfoSUGPositionType[i];
            case 55:
                return new MoreInfoStickerCTAType[i];
            case 56:
                return new MoreInfoTextStyle[i];
            case 57:
                return new MoreInfoType[i];
            case 58:
                return new MusicCanonicalType[i];
            case 59:
                return new MusicInfoImpl[i];
            case 60:
                return new MusicMuteAudioReason[i];
            case 61:
                return new MusicNoteResponseInfo[i];
            case 62:
                return new MusicProduct[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new NavBarCameraDestination[i];
            case 64:
                return new NoteBackgroundColor[i];
            case 65:
                return new NoteFontStyle[i];
            case 66:
                return new NudgeType[i];
            case 67:
                return new NudgeVisualType[i];
            case 68:
                return new OnFeedMessages[i];
            case 69:
                return new OnImpressionStyle[i];
            case 70:
                return new OnboardingEntryActionType[i];
            case 71:
                return new OnboardingEntryPointPriority[i];
            case 72:
                return new OpenCarouselSubmissionState[i];
            case 73:
                return new OriginalAudioPartMetadata[i];
            case 74:
                return new OriginalAudioSubtype[i];
            case 75:
                return new OriginalSoundConsumptionInfo[i];
            case 76:
                return new OriginalSoundData[i];
            case 77:
                return new OriginalityFollowButtonInfoImpl[i];
            case 78:
                return new OriginalityInfoImpl[i];
            case 79:
                return new OriginalitySourceMediaInfoImpl[i];
            case 80:
                return new PollType[i];
            case 81:
                return new PostTriggerExperienceEligibleTrigger[i];
            case 82:
                return new PrimaryProfileLinkType[i];
            case 83:
                return new PrivacyDisclosureInfoImpl[i];
            case 84:
                return new PrivateReplyStatus[i];
            case 85:
                return new ProductReviewStatus[i];
            case 86:
                return new ProfessionalClipsUpsellType[i];
            case 87:
                return new ProfileBannerType[i];
            case 88:
                return new ProfilePicUrlInfoImpl[i];
            case 89:
                return new ProfilePictureImpl[i];
            case 90:
                return new RIXUActionSource[i];
            case 91:
                return new RIXUAspectRatio[i];
            case 92:
                return new RIXUChainingSourceType[i];
            case 93:
                return new RIXUCoverChainingType[i];
            case 94:
                return new RIXUCtaType[i];
            case 95:
                return new RIXULayoutFormat[i];
            case 96:
                return new RIXULayoutStyle[i];
            case 97:
                return new RIXUPlayType[i];
            case 98:
                return new ReelAutoArchiveSettingStr[i];
            default:
                return new ReplyControlStr[i];
        }
    }
}
