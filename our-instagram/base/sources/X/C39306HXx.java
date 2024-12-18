package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.api.schemas.ImmutablePandoAchievement;
import com.instagram.api.schemas.ImmutablePandoAchievementButtonInfo;
import com.instagram.api.schemas.ImmutablePandoAchievementDetails;
import com.instagram.api.schemas.ImmutablePandoAdvantageAudienceData;
import com.instagram.api.schemas.ImmutablePandoAiAgentMetadataDict;
import com.instagram.api.schemas.ImmutablePandoAppInstallCTAInfo;
import com.instagram.api.schemas.ImmutablePandoAppstoreMetadataDict;
import com.instagram.api.schemas.ImmutablePandoAttributionUser;
import com.instagram.api.schemas.ImmutablePandoAudienceList;
import com.instagram.api.schemas.ImmutablePandoAudienceMessageEntityRange;
import com.instagram.api.schemas.ImmutablePandoAudienceValidationAction;
import com.instagram.api.schemas.ImmutablePandoAudienceValidationResponse;
import com.instagram.api.schemas.ImmutablePandoAudioFilterInfo;
import com.instagram.api.schemas.ImmutablePandoAudioMutingInfo;
import com.instagram.api.schemas.ImmutablePandoAudioNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoAvatarCoinFlipBackgroundOptionResponse;
import com.instagram.api.schemas.ImmutablePandoAvatarNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoAvatarStatus;
import com.instagram.api.schemas.ImmutablePandoBoostUpsellBannerPayloadSchema;
import com.instagram.api.schemas.ImmutablePandoBrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.api.schemas.ImmutablePandoBrandedContentGatingCountryMinimumAge;
import com.instagram.api.schemas.ImmutablePandoBrandedContentGatingInfo;
import com.instagram.api.schemas.ImmutablePandoBrandedContentProjectMetadata;
import com.instagram.api.schemas.ImmutablePandoBusinessProfileDict;
import com.instagram.api.schemas.ImmutablePandoCachedExternalLoginUser;
import com.instagram.api.schemas.ImmutablePandoCallAdsInfoDict;
import com.instagram.api.schemas.ImmutablePandoChallenge;
import com.instagram.api.schemas.ImmutablePandoChallengeButtonInfo;
import com.instagram.api.schemas.ImmutablePandoChallengeDetails;
import com.instagram.api.schemas.ImmutablePandoClipsBreakingCreatorInfo;
import com.instagram.api.schemas.ImmutablePandoClipsMashupFollowButtonInfo;
import com.instagram.api.schemas.ImmutablePandoClipsTrialDict;
import com.instagram.api.schemas.ImmutablePandoCloseToEarningAchievementMedia;
import com.instagram.api.schemas.ImmutablePandoCollabFollowButtonInfo;
import com.instagram.api.schemas.ImmutablePandoCollectionButtonCustomization;
import com.instagram.api.schemas.ImmutablePandoCollectionCustomization;
import com.instagram.api.schemas.ImmutablePandoCollectionTitleCustomization;
import com.instagram.api.schemas.ImmutablePandoColorAtTextRangeDict;
import com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaFixedHeightImages;
import com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaImages;
import com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaInfo;
import com.instagram.api.schemas.ImmutablePandoCommentPrompt;
import com.instagram.api.schemas.ImmutablePandoCommerceReviewStatisticsDict;
import com.instagram.api.schemas.ImmutablePandoContextualAdResponseExtras;
import com.instagram.api.schemas.ImmutablePandoContextualAdResponseOrganicInfo;
import com.instagram.api.schemas.ImmutablePandoCreatorDigestSignalInfo;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerBottomCTA;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerContextCTA;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerInsightInfo;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalAudioDetails;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalDetails;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalInfo;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalModel;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalPlainDetails;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalReelsTextDetails;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalWithInsightsInfo;
import com.instagram.api.schemas.ImmutablePandoDEPProgramLevelContentResponse;
import com.instagram.api.schemas.ImmutablePandoDevserverInfo;
import com.instagram.api.schemas.ImmutablePandoDirectAudioFallbackUrl;
import com.instagram.api.schemas.ImmutablePandoDirectMediaFallbackUrl;
import com.instagram.api.schemas.ImmutablePandoDropsEventPageNavigationMetadata;
import com.instagram.api.schemas.ImmutablePandoEarnedOnMedia;
import com.instagram.api.schemas.ImmutablePandoElectionAddYoursInfoDict;
import com.instagram.api.schemas.ImmutablePandoEntity;
import com.instagram.api.schemas.ImmutablePandoEstimate;
import com.instagram.api.schemas.ImmutablePandoEventPageNavigationMetadata;
import com.instagram.api.schemas.ImmutablePandoFBProductItemDetailsDict;
import com.instagram.api.schemas.ImmutablePandoFanClubFanConsiderationPageFeatureEligibilityResponse;
import com.instagram.api.schemas.ImmutablePandoFanClubInfoDict;
import com.instagram.api.schemas.ImmutablePandoFanClubStatusSyncInfo;
import com.instagram.api.schemas.ImmutablePandoFileCandidate;
import com.instagram.api.schemas.ImmutablePandoFormattedString;
import com.instagram.api.schemas.ImmutablePandoGIFNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoGenAIMessagingData;
import com.instagram.api.schemas.ImmutablePandoGenAIPersonaBannerDict;
import com.instagram.api.schemas.ImmutablePandoGenAIPersonaBannersResponse;
import com.instagram.api.schemas.ImmutablePandoGenAIToolInfoDict;
import com.instagram.api.schemas.ImmutablePandoGoalsToastInfo;
import com.instagram.api.schemas.ImmutablePandoGraphGuardianContent;
import com.instagram.api.schemas.ImmutablePandoGreetingAttachment;
import com.instagram.api.schemas.ImmutablePandoGroupMetadata;
import com.instagram.api.schemas.ImmutablePandoGrowthFrictionInfo;
import com.instagram.api.schemas.ImmutablePandoGrowthFrictionInterventionButton;
import com.instagram.api.schemas.ImmutablePandoGrowthFrictionInterventionCategories;
import com.instagram.api.schemas.ImmutablePandoGrowthFrictionInterventionDetail;
import com.instagram.api.schemas.ImmutablePandoGuidanceTipResponse;
import com.instagram.api.schemas.ImmutablePandoHallpassDetailsDict;
import com.instagram.api.schemas.ImmutablePandoHzwPageInfo;
import com.instagram.api.schemas.ImmutablePandoIABPostClickDataDict;
import com.instagram.api.schemas.ImmutablePandoIGAdCreationOptimizationPayloadDict;
import com.instagram.api.schemas.ImmutablePandoIGAdCreativeOptimizationConfigByTypeDict;
import com.instagram.api.schemas.ImmutablePandoIGAdCreativeStory9x16CaptionData;
import com.instagram.api.schemas.ImmutablePandoIGAdProfileProductTabDict;
import com.instagram.api.schemas.ImmutablePandoIGAdScreenshotURLDataDict;
import com.instagram.api.schemas.ImmutablePandoIGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.ImmutablePandoIGBWPIABPostClickDataExtensionDict;
import com.instagram.api.schemas.ImmutablePandoIGCTATextVariant;
import com.instagram.api.schemas.ImmutablePandoIGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.ImmutablePandoIGCommentSheetMoreInfo;
import com.instagram.api.schemas.ImmutablePandoIGLeadGenSubheaderTrustSignalDataDict;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.HXx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39306HXx extends AbstractC136426Fv {
    public final int A00;

    public C39306HXx(int i) {
        this.A00 = i;
    }

    public static C39306HXx A00(int i) {
        return new C39306HXx(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ImmutablePandoAchievement[i];
            case 1:
                return new ImmutablePandoAchievementButtonInfo[i];
            case 2:
                return new ImmutablePandoAchievementDetails[i];
            case 3:
                return new ImmutablePandoAdvantageAudienceData[i];
            case 4:
                return new ImmutablePandoAiAgentMetadataDict[i];
            case 5:
                return new ImmutablePandoAppInstallCTAInfo[i];
            case 6:
                return new ImmutablePandoAppstoreMetadataDict[i];
            case 7:
                return new ImmutablePandoAttributionUser[i];
            case 8:
                return new ImmutablePandoAudienceList[i];
            case 9:
                return new ImmutablePandoAudienceMessageEntityRange[i];
            case 10:
                return new ImmutablePandoAudienceValidationAction[i];
            case 11:
                return new ImmutablePandoAudienceValidationResponse[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new ImmutablePandoAudioFilterInfo[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new ImmutablePandoAudioMutingInfo[i];
            case 14:
                return new ImmutablePandoAudioNoteResponseInfo[i];
            case Process.SIGTERM /* 15 */:
                return new ImmutablePandoAvatarCoinFlipBackgroundOptionResponse[i];
            case 16:
                return new ImmutablePandoAvatarNoteResponseInfo[i];
            case 17:
                return new ImmutablePandoAvatarStatus[i];
            case 18:
                return new ImmutablePandoBoostUpsellBannerPayloadSchema[i];
            case Process.SIGSTOP /* 19 */:
                return new ImmutablePandoBrandSafetyContentBlocklistBitmapQLObj[i];
            case 20:
                return new ImmutablePandoBrandedContentGatingCountryMinimumAge[i];
            case 21:
                return new ImmutablePandoBrandedContentGatingInfo[i];
            case 22:
                return new ImmutablePandoBrandedContentProjectMetadata[i];
            case 23:
                return new ImmutablePandoBusinessProfileDict[i];
            case 24:
                return new ImmutablePandoCachedExternalLoginUser[i];
            case 25:
                return new ImmutablePandoCallAdsInfoDict[i];
            case 26:
                return new ImmutablePandoChallenge[i];
            case 27:
                return new ImmutablePandoChallengeButtonInfo[i];
            case 28:
                return new ImmutablePandoChallengeDetails[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new ImmutablePandoClipsBreakingCreatorInfo[i];
            case 30:
                return new ImmutablePandoClipsMashupFollowButtonInfo[i];
            case 31:
                return new ImmutablePandoClipsTrialDict[i];
            case 32:
                return new ImmutablePandoCloseToEarningAchievementMedia[i];
            case 33:
                return new ImmutablePandoCollabFollowButtonInfo[i];
            case 34:
                return new ImmutablePandoCollectionButtonCustomization[i];
            case 35:
                return new ImmutablePandoCollectionCustomization[i];
            case 36:
                return new ImmutablePandoCollectionTitleCustomization[i];
            case 37:
                return new ImmutablePandoColorAtTextRangeDict[i];
            case 38:
                return new ImmutablePandoCommentGiphyMediaFixedHeightImages[i];
            case 39:
                return new ImmutablePandoCommentGiphyMediaImages[i];
            case 40:
                return new ImmutablePandoCommentGiphyMediaInfo[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new ImmutablePandoCommentPrompt[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new ImmutablePandoCommerceReviewStatisticsDict[i];
            case 43:
                return new ImmutablePandoContextualAdResponseExtras[i];
            case 44:
                return new ImmutablePandoContextualAdResponseOrganicInfo[i];
            case 45:
                return new ImmutablePandoCreatorDigestSignalInfo[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new ImmutablePandoCreatorViewerBottomCTA[i];
            case 47:
                return new ImmutablePandoCreatorViewerContextCTA[i];
            case 48:
                return new ImmutablePandoCreatorViewerInsightInfo[i];
            case 49:
                return new ImmutablePandoCreatorViewerSignalAudioDetails[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new ImmutablePandoCreatorViewerSignalDetails[i];
            case 51:
                return new ImmutablePandoCreatorViewerSignalInfo[i];
            case 52:
                return new ImmutablePandoCreatorViewerSignalModel[i];
            case 53:
                return new ImmutablePandoCreatorViewerSignalPlainDetails[i];
            case 54:
                return new ImmutablePandoCreatorViewerSignalReelsTextDetails[i];
            case 55:
                return new ImmutablePandoCreatorViewerSignalWithInsightsInfo[i];
            case 56:
                return new ImmutablePandoDEPProgramLevelContentResponse[i];
            case 57:
                return new ImmutablePandoDevserverInfo[i];
            case 58:
                return new ImmutablePandoDirectAudioFallbackUrl[i];
            case 59:
                return new ImmutablePandoDirectMediaFallbackUrl[i];
            case 60:
                return new ImmutablePandoDropsEventPageNavigationMetadata[i];
            case 61:
                return new ImmutablePandoEarnedOnMedia[i];
            case 62:
                return new ImmutablePandoElectionAddYoursInfoDict[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new ImmutablePandoEntity[i];
            case 64:
                return new ImmutablePandoEstimate[i];
            case 65:
                return new ImmutablePandoEventPageNavigationMetadata[i];
            case 66:
                return new ImmutablePandoFBProductItemDetailsDict[i];
            case 67:
                return new ImmutablePandoFanClubFanConsiderationPageFeatureEligibilityResponse[i];
            case 68:
                return new ImmutablePandoFanClubInfoDict[i];
            case 69:
                return new ImmutablePandoFanClubStatusSyncInfo[i];
            case 70:
                return new ImmutablePandoFileCandidate[i];
            case 71:
                return new ImmutablePandoFormattedString[i];
            case 72:
                return new ImmutablePandoGIFNoteResponseInfo[i];
            case 73:
                return new ImmutablePandoGenAIMessagingData[i];
            case 74:
                return new ImmutablePandoGenAIPersonaBannerDict[i];
            case 75:
                return new ImmutablePandoGenAIPersonaBannersResponse[i];
            case 76:
                return new ImmutablePandoGenAIToolInfoDict[i];
            case 77:
                return new ImmutablePandoGoalsToastInfo[i];
            case 78:
                return new ImmutablePandoGraphGuardianContent[i];
            case 79:
                return new ImmutablePandoGreetingAttachment[i];
            case 80:
                return new ImmutablePandoGroupMetadata[i];
            case 81:
                return new ImmutablePandoGrowthFrictionInfo[i];
            case 82:
                return new ImmutablePandoGrowthFrictionInterventionButton[i];
            case 83:
                return new ImmutablePandoGrowthFrictionInterventionCategories[i];
            case 84:
                return new ImmutablePandoGrowthFrictionInterventionDetail[i];
            case 85:
                return new ImmutablePandoGuidanceTipResponse[i];
            case 86:
                return new ImmutablePandoHallpassDetailsDict[i];
            case 87:
                return new ImmutablePandoHzwPageInfo[i];
            case 88:
                return new ImmutablePandoIABPostClickDataDict[i];
            case 89:
                return new ImmutablePandoIGAdCreationOptimizationPayloadDict[i];
            case 90:
                return new ImmutablePandoIGAdCreativeOptimizationConfigByTypeDict[i];
            case 91:
                return new ImmutablePandoIGAdCreativeStory9x16CaptionData[i];
            case 92:
                return new ImmutablePandoIGAdProfileProductTabDict[i];
            case 93:
                return new ImmutablePandoIGAdScreenshotURLDataDict[i];
            case 94:
                return new ImmutablePandoIGAdsIABScreenshotDataDict[i];
            case 95:
                return new ImmutablePandoIGBWPIABPostClickDataExtensionDict[i];
            case 96:
                return new ImmutablePandoIGCTATextVariant[i];
            case 97:
                return new ImmutablePandoIGCTMessagingAdsInfoDict[i];
            case 98:
                return new ImmutablePandoIGCommentSheetMoreInfo[i];
            default:
                return new ImmutablePandoIGLeadGenSubheaderTrustSignalDataDict[i];
        }
    }
}
