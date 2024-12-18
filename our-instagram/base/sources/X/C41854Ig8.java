package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.ClipChainType;
import com.instagram.api.schemas.ClipsACRMidCardSubType;
import com.instagram.api.schemas.ClipsAggregateTrendType;
import com.instagram.api.schemas.ClipsAudioMuteReasonType;
import com.instagram.api.schemas.ClipsBreakingCreatorInfoImpl;
import com.instagram.api.schemas.ClipsCameraSurface;
import com.instagram.api.schemas.ClipsCuratedTrendFlowVariant;
import com.instagram.api.schemas.ClipsMerchandisingPillType;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.ClipsMidCardType;
import com.instagram.api.schemas.ClipsPrefetchTriggerType;
import com.instagram.api.schemas.ClipsRSAMidCardSubType;
import com.instagram.api.schemas.ClipsSpinSwappableElementType;
import com.instagram.api.schemas.ClipsTemplateBrowserCategory;
import com.instagram.api.schemas.ClipsTemplateBrowserType;
import com.instagram.api.schemas.ClipsTemplateBrowserV2Type;
import com.instagram.api.schemas.ClipsTemplatesStickerType;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.ClipsTrendType;
import com.instagram.api.schemas.ClipsTrialDictImpl;
import com.instagram.api.schemas.ClipsTrimmingStrategy;
import com.instagram.api.schemas.CloseToEarningAchievementMedia;
import com.instagram.api.schemas.CollectionButtonCustomization;
import com.instagram.api.schemas.CollectionCustomization;
import com.instagram.api.schemas.CollectionPrivacyModeEnum;
import com.instagram.api.schemas.CollectionTitleCustomization;
import com.instagram.api.schemas.CollectionTitleCustomizationImpl;
import com.instagram.api.schemas.ColorAtTextRangeDict;
import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages;
import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImagesImpl;
import com.instagram.api.schemas.CommentGiphyMediaImages;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.api.schemas.CommentPromptImpl;
import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.ContentActivation;
import com.instagram.api.schemas.ContentAppreciationDisclaimerType;
import com.instagram.api.schemas.ContentAppreciationFanOfferType;
import com.instagram.api.schemas.ContentAppreciationFeatureStatus;
import com.instagram.api.schemas.ContentAppreciationLoggingOnboardingStatusEnum;
import com.instagram.api.schemas.ContentStudioSurface;
import com.instagram.api.schemas.ContextualAdResponseExtrasImpl;
import com.instagram.api.schemas.ContextualAdResponseOrganicInfoImpl;
import com.instagram.api.schemas.ContextualLinkCtaType;
import com.instagram.api.schemas.CreatorDigestSignalInfoImpl;
import com.instagram.api.schemas.CreatorViewerBottomCTAImpl;
import com.instagram.api.schemas.CreatorViewerBottomCTAType;
import com.instagram.api.schemas.CreatorViewerContextCTAImpl;
import com.instagram.api.schemas.CreatorViewerContextCTATarget;
import com.instagram.api.schemas.CreatorViewerContextCTAType;
import com.instagram.api.schemas.CreatorViewerInsightCTA;
import com.instagram.api.schemas.CreatorViewerInsightInfoImpl;
import com.instagram.api.schemas.CreatorViewerInsightType;
import com.instagram.api.schemas.CreatorViewerInsightTypeV2;
import com.instagram.api.schemas.CreatorViewerSignalAudioDetails;
import com.instagram.api.schemas.CreatorViewerSignalAudioDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalDetails;
import com.instagram.api.schemas.CreatorViewerSignalDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalInfo;
import com.instagram.api.schemas.CreatorViewerSignalInfoImpl;
import com.instagram.api.schemas.CreatorViewerSignalModelImpl;
import com.instagram.api.schemas.CreatorViewerSignalPlainDetails;
import com.instagram.api.schemas.CreatorViewerSignalPlainDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails;
import com.instagram.api.schemas.CreatorViewerSignalReelsTextDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalType;
import com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfoImpl;
import com.instagram.api.schemas.CreditCardAssociation;
import com.instagram.api.schemas.DEPProgramLevelContentResponse;
import com.instagram.api.schemas.DayOfTheWeek;
import com.instagram.api.schemas.DemarcatorActionType;
import com.instagram.api.schemas.DestinationRecommendationReason;
import com.instagram.api.schemas.DevserverInfoImpl;
import com.instagram.api.schemas.DropsEventPageNavigationMetadataImpl;
import com.instagram.api.schemas.DynamicCreativeOptimizationDoFType;
import com.instagram.api.schemas.DynamicEffectState;
import com.instagram.api.schemas.EarnedOnMediaImpl;
import com.instagram.api.schemas.EarnedOnMediaState;
import com.instagram.api.schemas.EditFailureReason;
import com.instagram.api.schemas.ElectionAddYoursInfoDict;
import com.instagram.api.schemas.EntityImpl;
import com.instagram.api.schemas.ErrorHandlingResponseType;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.api.schemas.ErrorLevel;
import com.instagram.api.schemas.Estimate;
import com.instagram.api.schemas.EventPageNavigationMetadataImpl;
import com.instagram.api.schemas.EventVisibilityType;
import com.instagram.api.schemas.FBProductItemDetailsDictImpl;
import com.instagram.api.schemas.FBTagType;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.api.schemas.FanClubNextStepsCompletionState;
import com.instagram.api.schemas.FanClubNextStepsRecommendationsType;
import com.instagram.api.schemas.FanClubSubscriptionButtonType;
import com.instagram.api.schemas.FeedAfterPartyPromoteEligibilityStatusEnum;
import com.instagram.api.schemas.FileCandidateImpl;
import com.instagram.api.schemas.FormattedString;
import com.instagram.api.schemas.FormattedStringImpl;
import com.instagram.api.schemas.FundingSourceType;
import com.instagram.api.schemas.FundraiserCampaignStateEnum;
import com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus;
import com.instagram.api.schemas.GIFNoteResponseInfoImpl;
import com.instagram.api.schemas.GatingResponseType;
import com.instagram.api.schemas.GenAIMagicModNotificationType;
import com.instagram.api.schemas.GenAIMessagingData;
import com.instagram.api.schemas.GenAIMessagingDataImpl;
import com.instagram.api.schemas.GenAIPersonaBannerDictImpl;
import com.instagram.api.schemas.GenAIPersonaBannersResponseImpl;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.GiftsMonetizationStatus;
import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.api.schemas.GoalsToastInfoImpl;
import com.instagram.api.schemas.GoalsToastType;
import com.instagram.api.schemas.InspirationSignalType;
import com.instagram.api.schemas.MediaTrialGraduationStrategy;
import com.instagram.api.schemas.MediaTrialStatus;
import com.instagram.api.schemas.MiniShopColorCustomization;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;

/* renamed from: X.Ig8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41854Ig8 implements Parcelable.Creator {
    public final int A00;

    public C41854Ig8(int i) {
        this.A00 = i;
    }

    public static C41854Ig8 A00(int i) {
        return new C41854Ig8(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        ArrayList A17;
        Boolean valueOf2;
        Boolean valueOf3;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(parcel, 0);
                return ClipChainType.values()[parcel.readInt()];
            case 1:
                C14360o3.A0B(parcel, 0);
                return ClipsACRMidCardSubType.values()[parcel.readInt()];
            case 2:
                C14360o3.A0B(parcel, 0);
                return ClipsAggregateTrendType.values()[parcel.readInt()];
            case 3:
                C14360o3.A0B(parcel, 0);
                return ClipsAudioMuteReasonType.values()[parcel.readInt()];
            case 4:
                return new ClipsBreakingCreatorInfoImpl(AbstractC37304Gc5.A0d(parcel));
            case 5:
                C14360o3.A0B(parcel, 0);
                return ClipsCameraSurface.values()[parcel.readInt()];
            case 6:
                C14360o3.A0B(parcel, 0);
                return ClipsCuratedTrendFlowVariant.values()[parcel.readInt()];
            case 7:
                C14360o3.A0B(parcel, 0);
                return ClipsMerchandisingPillType.values()[parcel.readInt()];
            case 8:
                C14360o3.A0B(parcel, 0);
                return ClipsMidCardSubtype.values()[parcel.readInt()];
            case 9:
                C14360o3.A0B(parcel, 0);
                return ClipsMidCardType.values()[parcel.readInt()];
            case 10:
                C14360o3.A0B(parcel, 0);
                return ClipsPrefetchTriggerType.values()[parcel.readInt()];
            case 11:
                C14360o3.A0B(parcel, 0);
                return ClipsRSAMidCardSubType.values()[parcel.readInt()];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(parcel, 0);
                return ClipsSpinSwappableElementType.values()[parcel.readInt()];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(parcel, 0);
                return ClipsTemplateBrowserCategory.values()[parcel.readInt()];
            case 14:
                C14360o3.A0B(parcel, 0);
                return ClipsTemplateBrowserType.values()[parcel.readInt()];
            case Process.SIGTERM /* 15 */:
                C14360o3.A0B(parcel, 0);
                return ClipsTemplateBrowserV2Type.values()[parcel.readInt()];
            case 16:
                C14360o3.A0B(parcel, 0);
                return ClipsTemplatesStickerType.values()[parcel.readInt()];
            case 17:
                C14360o3.A0B(parcel, 0);
                return ClipsTrendType.values()[parcel.readInt()];
            case 18:
                Boolean bool = null;
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                MediaTrialGraduationStrategy mediaTrialGraduationStrategy = (MediaTrialGraduationStrategy) AbstractC37304Gc5.A04(parcel, ClipsTrialDictImpl.class);
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(AbstractC37304Gc5.A1W(parcel));
                }
                return new ClipsTrialDictImpl(mediaTrialGraduationStrategy, (MediaTrialStatus) AbstractC37304Gc5.A04(parcel, ClipsTrialDictImpl.class), valueOf, bool);
            case Process.SIGSTOP /* 19 */:
                C14360o3.A0B(parcel, 0);
                return ClipsTrimmingStrategy.values()[parcel.readInt()];
            case 20:
                return new CloseToEarningAchievementMedia(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readInt());
            case 21:
                C14360o3.A0B(parcel, 0);
                return new CollectionButtonCustomization((MiniShopColorCustomization) AbstractC37304Gc5.A04(parcel, CollectionButtonCustomization.class));
            case 22:
                C14360o3.A0B(parcel, 0);
                return new CollectionCustomization((CollectionButtonCustomization) AbstractC37304Gc5.A04(parcel, CollectionCustomization.class), (CollectionTitleCustomization) AbstractC37304Gc5.A04(parcel, CollectionCustomization.class));
            case 23:
                C14360o3.A0B(parcel, 0);
                return CollectionPrivacyModeEnum.values()[parcel.readInt()];
            case 24:
                return new CollectionTitleCustomizationImpl(AbstractC37304Gc5.A00(parcel));
            case 25:
                String A0d = AbstractC37304Gc5.A0d(parcel);
                String readString = parcel.readString();
                Integer num = null;
                if (parcel.readInt() != 0) {
                    num = AbstractC37304Gc5.A0U(parcel);
                }
                return new ColorAtTextRangeDict(num, AbstractC37304Gc5.A0W(parcel), A0d, readString);
            case 26:
                Integer num2 = null;
                if (AbstractC37304Gc5.A00(parcel) != 0) {
                    num2 = AbstractC37304Gc5.A0U(parcel);
                }
                return new CommentGiphyMediaFixedHeightImagesImpl(num2, AbstractC37304Gc5.A0Y(parcel), AbstractC37304Gc5.A0Y(parcel), AbstractC37304Gc5.A0Y(parcel), AbstractC37304Gc5.A0X(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            case 27:
                C14360o3.A0B(parcel, 0);
                return new CommentGiphyMediaImages((CommentGiphyMediaFixedHeightImages) AbstractC37304Gc5.A04(parcel, CommentGiphyMediaImages.class));
            case 28:
                return new CommentPromptImpl(AbstractC37304Gc5.A0d(parcel), AbstractC37304Gc5.A0V(parcel));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C14360o3.A0B(parcel, 0);
                return ContainerEffectEnum.values()[parcel.readInt()];
            case 30:
                C14360o3.A0B(parcel, 0);
                return ContentActivation.values()[parcel.readInt()];
            case 31:
                C14360o3.A0B(parcel, 0);
                return ContentAppreciationDisclaimerType.values()[parcel.readInt()];
            case 32:
                C14360o3.A0B(parcel, 0);
                return ContentAppreciationFanOfferType.values()[parcel.readInt()];
            case 33:
                C14360o3.A0B(parcel, 0);
                return ContentAppreciationFeatureStatus.values()[parcel.readInt()];
            case 34:
                C14360o3.A0B(parcel, 0);
                return ContentAppreciationLoggingOnboardingStatusEnum.values()[parcel.readInt()];
            case 35:
                C14360o3.A0B(parcel, 0);
                return ContentStudioSurface.values()[parcel.readInt()];
            case 36:
                return new ContextualAdResponseExtrasImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            case 37:
                return new ContextualAdResponseOrganicInfoImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 38:
                C14360o3.A0B(parcel, 0);
                return ContextualLinkCtaType.values()[parcel.readInt()];
            case 39:
                C14360o3.A0B(parcel, 0);
                return new CreatorDigestSignalInfoImpl((InspirationSignalType) AbstractC37304Gc5.A04(parcel, CreatorDigestSignalInfoImpl.class), parcel.readString(), parcel.readString());
            case 40:
                C14360o3.A0B(parcel, 0);
                return new CreatorViewerBottomCTAImpl((CreatorViewerBottomCTAType) AbstractC37304Gc5.A04(parcel, CreatorViewerBottomCTAImpl.class), parcel.readString());
            case Seq.NULL_REFNUM /* 41 */:
                C14360o3.A0B(parcel, 0);
                return CreatorViewerBottomCTAType.values()[parcel.readInt()];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C14360o3.A0B(parcel, 0);
                return new CreatorViewerContextCTAImpl((CreatorViewerContextCTATarget) AbstractC37304Gc5.A04(parcel, CreatorViewerContextCTAImpl.class), (CreatorViewerContextCTAType) AbstractC37304Gc5.A04(parcel, CreatorViewerContextCTAImpl.class), (FormattedString) AbstractC37304Gc5.A04(parcel, CreatorViewerContextCTAImpl.class), (FormattedString) AbstractC37304Gc5.A04(parcel, CreatorViewerContextCTAImpl.class), parcel.readString(), parcel.readString());
            case 43:
                C14360o3.A0B(parcel, 0);
                return CreatorViewerContextCTATarget.values()[parcel.readInt()];
            case 44:
                C14360o3.A0B(parcel, 0);
                return CreatorViewerContextCTAType.values()[parcel.readInt()];
            case 45:
                C14360o3.A0B(parcel, 0);
                return CreatorViewerInsightCTA.values()[parcel.readInt()];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C14360o3.A0B(parcel, 0);
                return new CreatorViewerInsightInfoImpl((CreatorViewerInsightTypeV2) AbstractC37304Gc5.A04(parcel, CreatorViewerInsightInfoImpl.class), (FormattedString) AbstractC37304Gc5.A04(parcel, CreatorViewerInsightInfoImpl.class), parcel.readString());
            case 47:
                C14360o3.A0B(parcel, 0);
                return CreatorViewerInsightType.values()[parcel.readInt()];
            case 48:
                C14360o3.A0B(parcel, 0);
                return CreatorViewerInsightTypeV2.values()[parcel.readInt()];
            case 49:
                C14360o3.A0B(parcel, 0);
                return new CreatorViewerSignalAudioDetailsImpl((FormattedString) AbstractC37304Gc5.A04(parcel, CreatorViewerSignalAudioDetailsImpl.class), (TrackOrOriginalSoundSchema) AbstractC37304Gc5.A04(parcel, CreatorViewerSignalAudioDetailsImpl.class));
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                C14360o3.A0B(parcel, 0);
                return new CreatorViewerSignalDetailsImpl((CreatorViewerSignalAudioDetails) AbstractC37304Gc5.A04(parcel, CreatorViewerSignalDetailsImpl.class), (CreatorViewerSignalPlainDetails) AbstractC37304Gc5.A04(parcel, CreatorViewerSignalDetailsImpl.class), (CreatorViewerSignalReelsTextDetails) AbstractC37304Gc5.A04(parcel, CreatorViewerSignalDetailsImpl.class));
            case 51:
                C14360o3.A0B(parcel, 0);
                return new CreatorViewerSignalInfoImpl((CreatorViewerSignalType) AbstractC37304Gc5.A04(parcel, CreatorViewerSignalInfoImpl.class), parcel.readString());
            case 52:
                C14360o3.A0B(parcel, 0);
                return new CreatorViewerSignalModelImpl((CreatorViewerSignalDetails) AbstractC37304Gc5.A04(parcel, CreatorViewerSignalModelImpl.class), (InspirationSignalType) AbstractC37304Gc5.A04(parcel, CreatorViewerSignalModelImpl.class), parcel.readString());
            case 53:
                return new CreatorViewerSignalPlainDetailsImpl((FormattedString) AbstractC37304Gc5.A04(parcel, CreatorViewerSignalPlainDetailsImpl.class), AbstractC37304Gc5.A0d(parcel));
            case 54:
                C14360o3.A0B(parcel, 0);
                return new CreatorViewerSignalReelsTextDetailsImpl((ClipsTextFormatType) AbstractC37304Gc5.A04(parcel, CreatorViewerSignalReelsTextDetailsImpl.class), (FormattedString) AbstractC37304Gc5.A04(parcel, CreatorViewerSignalReelsTextDetailsImpl.class));
            case 55:
                C14360o3.A0B(parcel, 0);
                return CreatorViewerSignalType.values()[parcel.readInt()];
            case 56:
                String A0d2 = AbstractC37304Gc5.A0d(parcel);
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    A17 = null;
                } else {
                    int readInt = parcel.readInt();
                    A17 = AbstractC25225BEi.A17(readInt);
                    for (int i = 0; i != readInt; i++) {
                        AbstractC37304Gc5.A0r(parcel, CreatorViewerSignalWithInsightsInfoImpl.class, A17);
                    }
                }
                return new CreatorViewerSignalWithInsightsInfoImpl((CreatorViewerSignalInfo) AbstractC37304Gc5.A04(parcel, CreatorViewerSignalWithInsightsInfoImpl.class), A0d2, readString2, A17);
            case 57:
                C14360o3.A0B(parcel, 0);
                return CreditCardAssociation.values()[parcel.readInt()];
            case 58:
                return new DEPProgramLevelContentResponse(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 59:
                C14360o3.A0B(parcel, 0);
                return DayOfTheWeek.values()[parcel.readInt()];
            case 60:
                C14360o3.A0B(parcel, 0);
                return DemarcatorActionType.values()[parcel.readInt()];
            case 61:
                C14360o3.A0B(parcel, 0);
                return DestinationRecommendationReason.values()[parcel.readInt()];
            case 62:
                return new DevserverInfoImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new DropsEventPageNavigationMetadataImpl(AbstractC37304Gc5.A0d(parcel));
            case 64:
                C14360o3.A0B(parcel, 0);
                return DynamicCreativeOptimizationDoFType.values()[parcel.readInt()];
            case 65:
                C14360o3.A0B(parcel, 0);
                return DynamicEffectState.values()[parcel.readInt()];
            case 66:
                return new EarnedOnMediaImpl((EarnedOnMediaState) AbstractC37304Gc5.A04(parcel, EarnedOnMediaImpl.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 67:
                C14360o3.A0B(parcel, 0);
                return EarnedOnMediaState.values()[parcel.readInt()];
            case 68:
                C14360o3.A0B(parcel, 0);
                return EditFailureReason.values()[parcel.readInt()];
            case 69:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new ElectionAddYoursInfoDict(valueOf2, parcel.readString(), parcel.createStringArrayList());
            case 70:
                return new EntityImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 71:
                C14360o3.A0B(parcel, 0);
                return ErrorHandlingResponseType.values()[parcel.readInt()];
            case 72:
                C14360o3.A0B(parcel, 0);
                return ErrorIdentifier.values()[parcel.readInt()];
            case 73:
                C14360o3.A0B(parcel, 0);
                return ErrorLevel.values()[parcel.readInt()];
            case 74:
                return new Estimate(AbstractC37304Gc5.A00(parcel), parcel.readInt());
            case 75:
                return new EventPageNavigationMetadataImpl(AbstractC37304Gc5.A0d(parcel), AbstractC37304Gc5.A0V(parcel), parcel.readString());
            case 76:
                C14360o3.A0B(parcel, 0);
                return EventVisibilityType.values()[parcel.readInt()];
            case 77:
                C14360o3.A0B(parcel, 0);
                ProductCheckoutProperties productCheckoutProperties = (ProductCheckoutProperties) AbstractC37304Gc5.A04(parcel, FBProductItemDetailsDictImpl.class);
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new FBProductItemDetailsDictImpl(productCheckoutProperties, (ProductImageContainer) AbstractC37304Gc5.A04(parcel, FBProductItemDetailsDictImpl.class), (ProductImageContainer) AbstractC37304Gc5.A04(parcel, FBProductItemDetailsDictImpl.class), valueOf3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 78:
                C14360o3.A0B(parcel, 0);
                return FBTagType.values()[parcel.readInt()];
            case 79:
                C14360o3.A0B(parcel, 0);
                return FanClubCategoryType.values()[parcel.readInt()];
            case 80:
                C14360o3.A0B(parcel, 0);
                return FanClubNextStepsCompletionState.values()[parcel.readInt()];
            case 81:
                C14360o3.A0B(parcel, 0);
                return FanClubNextStepsRecommendationsType.values()[parcel.readInt()];
            case 82:
                C14360o3.A0B(parcel, 0);
                return FanClubSubscriptionButtonType.values()[parcel.readInt()];
            case 83:
                C14360o3.A0B(parcel, 0);
                return FeedAfterPartyPromoteEligibilityStatusEnum.values()[parcel.readInt()];
            case 84:
                return new FileCandidateImpl(AbstractC37304Gc5.A0a(parcel), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 85:
                return new FormattedStringImpl(AbstractC37304Gc5.A0d(parcel));
            case 86:
                C14360o3.A0B(parcel, 0);
                return FundingSourceType.values()[parcel.readInt()];
            case 87:
                C14360o3.A0B(parcel, 0);
                return FundraiserCampaignStateEnum.values()[parcel.readInt()];
            case 88:
                C14360o3.A0B(parcel, 0);
                return FundraiserVisibilityOnProfileStatus.values()[parcel.readInt()];
            case 89:
                C14360o3.A0B(parcel, 0);
                return new GIFNoteResponseInfoImpl((CommentGiphyMediaInfo) AbstractC37304Gc5.A04(parcel, GIFNoteResponseInfoImpl.class));
            case 90:
                C14360o3.A0B(parcel, 0);
                return GatingResponseType.values()[parcel.readInt()];
            case 91:
                C14360o3.A0B(parcel, 0);
                return GenAIMagicModNotificationType.values()[parcel.readInt()];
            case 92:
                return new GenAIMessagingDataImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 93:
                C14360o3.A0B(parcel, 0);
                return new GenAIPersonaBannerDictImpl((GenAIMessagingData) AbstractC37304Gc5.A04(parcel, GenAIPersonaBannerDictImpl.class), parcel.readString(), parcel.readString(), parcel.readString());
            case 94:
                int A00 = AbstractC37304Gc5.A00(parcel);
                ArrayList A172 = AbstractC25225BEi.A17(A00);
                for (int i2 = 0; i2 != A00; i2++) {
                    AbstractC37304Gc5.A0r(parcel, GenAIPersonaBannersResponseImpl.class, A172);
                }
                return new GenAIPersonaBannersResponseImpl(A172);
            case 95:
                return new GenAIToolInfoDict((CameraTool) AbstractC37304Gc5.A04(parcel, GenAIToolInfoDict.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 96:
                C14360o3.A0B(parcel, 0);
                return GiftsMonetizationStatus.values()[parcel.readInt()];
            case 97:
                C14360o3.A0B(parcel, 0);
                return GiphyRequestSurface.values()[parcel.readInt()];
            case 98:
                return new GoalsToastInfoImpl((GoalsToastType) AbstractC37304Gc5.A04(parcel, GoalsToastInfoImpl.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            default:
                C14360o3.A0B(parcel, 0);
                return GoalsToastType.values()[parcel.readInt()];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ClipChainType[i];
            case 1:
                return new ClipsACRMidCardSubType[i];
            case 2:
                return new ClipsAggregateTrendType[i];
            case 3:
                return new ClipsAudioMuteReasonType[i];
            case 4:
                return new ClipsBreakingCreatorInfoImpl[i];
            case 5:
                return new ClipsCameraSurface[i];
            case 6:
                return new ClipsCuratedTrendFlowVariant[i];
            case 7:
                return new ClipsMerchandisingPillType[i];
            case 8:
                return new ClipsMidCardSubtype[i];
            case 9:
                return new ClipsMidCardType[i];
            case 10:
                return new ClipsPrefetchTriggerType[i];
            case 11:
                return new ClipsRSAMidCardSubType[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new ClipsSpinSwappableElementType[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new ClipsTemplateBrowserCategory[i];
            case 14:
                return new ClipsTemplateBrowserType[i];
            case Process.SIGTERM /* 15 */:
                return new ClipsTemplateBrowserV2Type[i];
            case 16:
                return new ClipsTemplatesStickerType[i];
            case 17:
                return new ClipsTrendType[i];
            case 18:
                return new ClipsTrialDictImpl[i];
            case Process.SIGSTOP /* 19 */:
                return new ClipsTrimmingStrategy[i];
            case 20:
                return new CloseToEarningAchievementMedia[i];
            case 21:
                return new CollectionButtonCustomization[i];
            case 22:
                return new CollectionCustomization[i];
            case 23:
                return new CollectionPrivacyModeEnum[i];
            case 24:
                return new CollectionTitleCustomizationImpl[i];
            case 25:
                return new ColorAtTextRangeDict[i];
            case 26:
                return new CommentGiphyMediaFixedHeightImagesImpl[i];
            case 27:
                return new CommentGiphyMediaImages[i];
            case 28:
                return new CommentPromptImpl[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new ContainerEffectEnum[i];
            case 30:
                return new ContentActivation[i];
            case 31:
                return new ContentAppreciationDisclaimerType[i];
            case 32:
                return new ContentAppreciationFanOfferType[i];
            case 33:
                return new ContentAppreciationFeatureStatus[i];
            case 34:
                return new ContentAppreciationLoggingOnboardingStatusEnum[i];
            case 35:
                return new ContentStudioSurface[i];
            case 36:
                return new ContextualAdResponseExtrasImpl[i];
            case 37:
                return new ContextualAdResponseOrganicInfoImpl[i];
            case 38:
                return new ContextualLinkCtaType[i];
            case 39:
                return new CreatorDigestSignalInfoImpl[i];
            case 40:
                return new CreatorViewerBottomCTAImpl[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new CreatorViewerBottomCTAType[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new CreatorViewerContextCTAImpl[i];
            case 43:
                return new CreatorViewerContextCTATarget[i];
            case 44:
                return new CreatorViewerContextCTAType[i];
            case 45:
                return new CreatorViewerInsightCTA[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new CreatorViewerInsightInfoImpl[i];
            case 47:
                return new CreatorViewerInsightType[i];
            case 48:
                return new CreatorViewerInsightTypeV2[i];
            case 49:
                return new CreatorViewerSignalAudioDetailsImpl[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new CreatorViewerSignalDetailsImpl[i];
            case 51:
                return new CreatorViewerSignalInfoImpl[i];
            case 52:
                return new CreatorViewerSignalModelImpl[i];
            case 53:
                return new CreatorViewerSignalPlainDetailsImpl[i];
            case 54:
                return new CreatorViewerSignalReelsTextDetailsImpl[i];
            case 55:
                return new CreatorViewerSignalType[i];
            case 56:
                return new CreatorViewerSignalWithInsightsInfoImpl[i];
            case 57:
                return new CreditCardAssociation[i];
            case 58:
                return new DEPProgramLevelContentResponse[i];
            case 59:
                return new DayOfTheWeek[i];
            case 60:
                return new DemarcatorActionType[i];
            case 61:
                return new DestinationRecommendationReason[i];
            case 62:
                return new DevserverInfoImpl[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new DropsEventPageNavigationMetadataImpl[i];
            case 64:
                return new DynamicCreativeOptimizationDoFType[i];
            case 65:
                return new DynamicEffectState[i];
            case 66:
                return new EarnedOnMediaImpl[i];
            case 67:
                return new EarnedOnMediaState[i];
            case 68:
                return new EditFailureReason[i];
            case 69:
                return new ElectionAddYoursInfoDict[i];
            case 70:
                return new EntityImpl[i];
            case 71:
                return new ErrorHandlingResponseType[i];
            case 72:
                return new ErrorIdentifier[i];
            case 73:
                return new ErrorLevel[i];
            case 74:
                return new Estimate[i];
            case 75:
                return new EventPageNavigationMetadataImpl[i];
            case 76:
                return new EventVisibilityType[i];
            case 77:
                return new FBProductItemDetailsDictImpl[i];
            case 78:
                return new FBTagType[i];
            case 79:
                return new FanClubCategoryType[i];
            case 80:
                return new FanClubNextStepsCompletionState[i];
            case 81:
                return new FanClubNextStepsRecommendationsType[i];
            case 82:
                return new FanClubSubscriptionButtonType[i];
            case 83:
                return new FeedAfterPartyPromoteEligibilityStatusEnum[i];
            case 84:
                return new FileCandidateImpl[i];
            case 85:
                return new FormattedStringImpl[i];
            case 86:
                return new FundingSourceType[i];
            case 87:
                return new FundraiserCampaignStateEnum[i];
            case 88:
                return new FundraiserVisibilityOnProfileStatus[i];
            case 89:
                return new GIFNoteResponseInfoImpl[i];
            case 90:
                return new GatingResponseType[i];
            case 91:
                return new GenAIMagicModNotificationType[i];
            case 92:
                return new GenAIMessagingDataImpl[i];
            case 93:
                return new GenAIPersonaBannerDictImpl[i];
            case 94:
                return new GenAIPersonaBannersResponseImpl[i];
            case 95:
                return new GenAIToolInfoDict[i];
            case 96:
                return new GiftsMonetizationStatus[i];
            case 97:
                return new GiphyRequestSurface[i];
            case 98:
                return new GoalsToastInfoImpl[i];
            default:
                return new GoalsToastType[i];
        }
    }
}
