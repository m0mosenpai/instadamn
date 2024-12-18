package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.api.schemas.CaptionTextFontStyle;
import com.instagram.api.schemas.EventVisibilityType;
import com.instagram.api.schemas.GraphGuardianContentImpl;
import com.instagram.api.schemas.GreetingAttachment;
import com.instagram.api.schemas.GroupMetadataImpl;
import com.instagram.api.schemas.GrowthFrictionInterventionButtonImpl;
import com.instagram.api.schemas.GrowthFrictionInterventionDetailImpl;
import com.instagram.api.schemas.GuidanceTipIconAsset;
import com.instagram.api.schemas.GuidanceTipResponseImpl;
import com.instagram.api.schemas.GuideMediaType;
import com.instagram.api.schemas.GuideTypeStr;
import com.instagram.api.schemas.HzwPageInfoImpl;
import com.instagram.api.schemas.IABPostClickDataDictImpl;
import com.instagram.api.schemas.IABPostClickEligibleExperienceTypes;
import com.instagram.api.schemas.IABScreenshotEffectOnUserAction;
import com.instagram.api.schemas.IABScreenshotTransitionTime;
import com.instagram.api.schemas.IGAdCreationOptimizationPayloadDictImpl;
import com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDictImpl;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionDataImpl;
import com.instagram.api.schemas.IGAdProfileProductTabDictImpl;
import com.instagram.api.schemas.IGAdProfileProductTabFeatureModeEnum;
import com.instagram.api.schemas.IGAdScreenshotURLDataDictImpl;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDictImpl;
import com.instagram.api.schemas.IGAdsIABScreenshotVariant;
import com.instagram.api.schemas.IGAdsRrFormatEnum;
import com.instagram.api.schemas.IGAdsTrustInfoTypeEnum;
import com.instagram.api.schemas.IGBWPExperienceTypes;
import com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict;
import com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDictImpl;
import com.instagram.api.schemas.IGBuyWithPrimeExperienceTypes;
import com.instagram.api.schemas.IGCTATextVariantImpl;
import com.instagram.api.schemas.IGCTATextVariantSource;
import com.instagram.api.schemas.IGClickToMessagingCardTypeEnum;
import com.instagram.api.schemas.IGCommentSheetMoreInfoImpl;
import com.instagram.api.schemas.IGConsiderAndBrowseType;
import com.instagram.api.schemas.IGCreatorIncentiveProgram;
import com.instagram.api.schemas.IGCreatorIncentiveProgramFetchEntryPoint;
import com.instagram.api.schemas.IGLeadGenSubheaderTrustSignalDataDictImpl;
import com.instagram.api.schemas.IGLiveFriendChatGuestStatus;
import com.instagram.api.schemas.IGLiveGameStatus;
import com.instagram.api.schemas.IGLiveGames;
import com.instagram.api.schemas.IGLocalEventDictImpl;
import com.instagram.api.schemas.IGMusicArtistPinningErrorType;
import com.instagram.api.schemas.IGNativeSmartTextOverlayBackgroundShape;
import com.instagram.api.schemas.IGNativeSmartTextOverlayFontStyleEnum;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingAlignment;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingFontStyle;
import com.instagram.api.schemas.IGNativeSmartTextOverlayTextAlignmentEnum;
import com.instagram.api.schemas.IGNativeTextOverlayTextBoxAlignmentEnum;
import com.instagram.api.schemas.IGProjectPortalInfoDict;
import com.instagram.api.schemas.IGProjectPortalInfoDictImpl;
import com.instagram.api.schemas.IGRFSurveyContextDict;
import com.instagram.api.schemas.IGRFSurveyContextDictImpl;
import com.instagram.api.schemas.IGRFSurveyContextMappingDictImpl;
import com.instagram.api.schemas.IGRFSurveyInfoDictImpl;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import com.instagram.api.schemas.ISOCountryCode;
import com.instagram.api.schemas.IgUserRelatedAccountTypeEnum;
import com.instagram.api.schemas.ImageURIDictImpl;
import com.instagram.api.schemas.InlineStyleAtRangeDict;
import com.instagram.api.schemas.InspirationSignalType;
import com.instagram.api.schemas.InstagramMediaProductType;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.api.schemas.InstagramProductTaggabilityState;
import com.instagram.api.schemas.InstagramProfileCallToActionDestinations;
import com.instagram.api.schemas.InstapalCharacterType;
import com.instagram.api.schemas.IntegrityInterstitialType;
import com.instagram.api.schemas.IntentAwareAdsFormatInfoImpl;
import com.instagram.api.schemas.IntentAwareAdsFormatType;
import com.instagram.api.schemas.InterestPivotRedirect;
import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.api.schemas.LikeVisibilityType;
import com.instagram.api.schemas.LinkAction;
import com.instagram.api.schemas.LinkAttachmentDisallowedReason;
import com.instagram.api.schemas.LinkStickerType;
import com.instagram.api.schemas.LinkType;
import com.instagram.api.schemas.LinkWithText;
import com.instagram.api.schemas.ListeningNowResponseInfo;
import com.instagram.api.schemas.ListeningNowState;
import com.instagram.api.schemas.LiveNoteResponseInfo;
import com.instagram.api.schemas.LoadMoreType;
import com.instagram.api.schemas.LocationNoteResponseInfoImpl;
import com.instagram.api.schemas.LocationTypeaheadType;
import com.instagram.api.schemas.LoyaltyToplineInfoDictImpl;
import com.instagram.api.schemas.MapListType;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.api.schemas.MediaControlSurfaceEnum;
import com.instagram.api.schemas.MediaDestinationEnum;
import com.instagram.api.schemas.MediaGiftCountVisibilityState;
import com.instagram.api.schemas.MediaGiftingState;
import com.instagram.api.schemas.MediaIdToBrandSafetyContentBlocklistBitmapMapImpl;
import com.instagram.api.schemas.MediaKitVisibility;
import com.instagram.api.schemas.MediaNoticeIcon;
import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.api.schemas.MediaTrialGraduationStrategy;
import com.instagram.api.schemas.MediaTrialStatus;
import com.instagram.api.schemas.MessagingOffPlatformShareType;
import com.instagram.api.schemas.MetaGalleryAlbumType;
import com.instagram.api.schemas.MetaGalleryNetegoInStoryMediaType;
import com.instagram.api.schemas.MetaPlaceDictImpl;
import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.api.schemas.MidCardOverlayType;
import com.instagram.api.schemas.MidCardReelsChainCtaType;
import com.instagram.api.schemas.MiniShopColorCustomization;
import com.instagram.api.schemas.MiniShopColorPaletteCustomization;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.RingSpec;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;

/* renamed from: X.IgC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41858IgC implements Parcelable.Creator {
    public final int A00;

    public C41858IgC(int i) {
        this.A00 = i;
    }

    public static C41858IgC A00(int i) {
        return new C41858IgC(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        Boolean valueOf2;
        Boolean valueOf3;
        ArrayList A17;
        ArrayList A172;
        Integer A0U;
        Boolean valueOf4;
        Boolean valueOf5;
        Boolean valueOf6;
        Boolean valueOf7;
        ArrayList A173;
        ArrayList A174;
        Boolean valueOf8;
        switch (this.A00) {
            case 0:
                return new GraphGuardianContentImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 1:
                Integer num = null;
                if (AbstractC37304Gc5.A00(parcel) != 0) {
                    num = AbstractC37304Gc5.A0U(parcel);
                }
                return new GreetingAttachment(num, AbstractC37304Gc5.A0W(parcel), parcel.readString());
            case 2:
                C14360o3.A0B(parcel, 0);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                boolean A1V = AbstractC37304Gc5.A1V(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean A1V2 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V3 = AbstractC37304Gc5.A1V(parcel);
                Long l = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                boolean A1V4 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V5 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V6 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V7 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V8 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V9 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V10 = AbstractC37304Gc5.A1V(parcel);
                if (parcel.readInt() != 0) {
                    l = Long.valueOf(parcel.readLong());
                }
                return new GroupMetadataImpl((RingSpec) AbstractC37304Gc5.A04(parcel, GroupMetadataImpl.class), valueOf, l, readString, readString2, readString3, readString4, createStringArrayList, createStringArrayList2, parcel.createStringArrayList(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), A1V, A1V2, A1V3, A1V4, A1V5, A1V6, A1V7, A1V8, A1V9, A1V10);
            case 3:
                String A0d = AbstractC37304Gc5.A0d(parcel);
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new GrowthFrictionInterventionButtonImpl(valueOf2, A0d, parcel.readString(), parcel.readString());
            case 4:
                String A0d2 = AbstractC37304Gc5.A0d(parcel);
                int readInt = parcel.readInt();
                ArrayList A175 = AbstractC25225BEi.A17(readInt);
                for (int i = 0; i != readInt; i++) {
                    AbstractC37304Gc5.A0r(parcel, GrowthFrictionInterventionDetailImpl.class, A175);
                }
                return new GrowthFrictionInterventionDetailImpl(A0d2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), A175);
            case 5:
                C14360o3.A0B(parcel, 0);
                return GuidanceTipIconAsset.values()[parcel.readInt()];
            case 6:
                return new GuidanceTipResponseImpl((GuidanceTipIconAsset) AbstractC37304Gc5.A04(parcel, GuidanceTipResponseImpl.class), AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 7:
                C14360o3.A0B(parcel, 0);
                return GuideMediaType.values()[parcel.readInt()];
            case 8:
                C14360o3.A0B(parcel, 0);
                return GuideTypeStr.values()[parcel.readInt()];
            case 9:
                String A0d3 = AbstractC37304Gc5.A0d(parcel);
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new HzwPageInfoImpl(A0d3, valueOf3);
            case 10:
                C14360o3.A0B(parcel, 0);
                IGBWPIABPostClickDataExtensionDict iGBWPIABPostClickDataExtensionDict = (IGBWPIABPostClickDataExtensionDict) AbstractC37304Gc5.A04(parcel, IABPostClickDataDictImpl.class);
                if (parcel.readInt() == 0) {
                    A17 = null;
                } else {
                    int readInt2 = parcel.readInt();
                    A17 = AbstractC25225BEi.A17(readInt2);
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        AbstractC37304Gc5.A0r(parcel, IABPostClickDataDictImpl.class, A17);
                    }
                }
                return new IABPostClickDataDictImpl(iGBWPIABPostClickDataExtensionDict, A17);
            case 11:
                C14360o3.A0B(parcel, 0);
                return IABPostClickEligibleExperienceTypes.values()[parcel.readInt()];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(parcel, 0);
                return IABScreenshotEffectOnUserAction.values()[parcel.readInt()];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(parcel, 0);
                return IABScreenshotTransitionTime.values()[parcel.readInt()];
            case 14:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    A172 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    A172 = AbstractC25225BEi.A17(readInt3);
                    for (int i3 = 0; i3 != readInt3; i3++) {
                        AbstractC37304Gc5.A0r(parcel, IGAdCreationOptimizationPayloadDictImpl.class, A172);
                    }
                }
                return new IGAdCreationOptimizationPayloadDictImpl(A172);
            case Process.SIGTERM /* 15 */:
                return new IGAdCreativeOptimizationConfigByTypeDictImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 16:
                String A0d4 = AbstractC37304Gc5.A0d(parcel);
                String readString5 = parcel.readString();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    A0U = null;
                } else {
                    A0U = AbstractC37304Gc5.A0U(parcel);
                }
                Float A0S = AbstractC37304Gc5.A0S(parcel);
                Float A0S2 = AbstractC37304Gc5.A0S(parcel);
                String readString6 = parcel.readString();
                Integer A0Y = AbstractC37304Gc5.A0Y(parcel);
                CaptionTextFontStyle captionTextFontStyle = (CaptionTextFontStyle) AbstractC37304Gc5.A04(parcel, IGAdCreativeStory9x16CaptionDataImpl.class);
                Integer A0Y2 = AbstractC37304Gc5.A0Y(parcel);
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(AbstractC37304Gc5.A1W(parcel));
                }
                return new IGAdCreativeStory9x16CaptionDataImpl(captionTextFontStyle, valueOf4, bool, A0S, A0S2, A0U, A0Y, A0Y2, A0d4, readString5, readString6);
            case 17:
                C14360o3.A0B(parcel, 0);
                IGAdProfileProductTabFeatureModeEnum iGAdProfileProductTabFeatureModeEnum = (IGAdProfileProductTabFeatureModeEnum) AbstractC37304Gc5.A04(parcel, IGAdProfileProductTabDictImpl.class);
                ArrayList arrayList = null;
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(AbstractC37304Gc5.A1W(parcel));
                }
                if (parcel.readInt() != 0) {
                    int readInt4 = parcel.readInt();
                    arrayList = AbstractC25225BEi.A17(readInt4);
                    for (int i4 = 0; i4 != readInt4; i4++) {
                        AbstractC37304Gc5.A0r(parcel, IGAdProfileProductTabDictImpl.class, arrayList);
                    }
                }
                return new IGAdProfileProductTabDictImpl(iGAdProfileProductTabFeatureModeEnum, valueOf5, valueOf6, arrayList);
            case 18:
                C14360o3.A0B(parcel, 0);
                return IGAdProfileProductTabFeatureModeEnum.values()[parcel.readInt()];
            case Process.SIGSTOP /* 19 */:
                String A0d5 = AbstractC37304Gc5.A0d(parcel);
                Integer num2 = null;
                if (parcel.readInt() != 0) {
                    num2 = AbstractC37304Gc5.A0U(parcel);
                }
                return new IGAdScreenshotURLDataDictImpl((IGProjectPortalInfoDict) AbstractC37304Gc5.A04(parcel, IGAdScreenshotURLDataDictImpl.class), num2, AbstractC37304Gc5.A0X(parcel), A0d5, parcel.readString());
            case 20:
                Boolean bool2 = null;
                Float A0T = AbstractC37304Gc5.A0T(parcel, AbstractC37304Gc5.A00(parcel));
                Float A0S3 = AbstractC37304Gc5.A0S(parcel);
                IABScreenshotEffectOnUserAction iABScreenshotEffectOnUserAction = (IABScreenshotEffectOnUserAction) AbstractC37304Gc5.A04(parcel, IGAdsIABScreenshotDataDictImpl.class);
                Float A0S4 = AbstractC37304Gc5.A0S(parcel);
                Float A0S5 = AbstractC37304Gc5.A0S(parcel);
                IABScreenshotTransitionTime iABScreenshotTransitionTime = (IABScreenshotTransitionTime) AbstractC37304Gc5.A04(parcel, IGAdsIABScreenshotDataDictImpl.class);
                String readString7 = parcel.readString();
                IGAdsIABScreenshotVariant iGAdsIABScreenshotVariant = (IGAdsIABScreenshotVariant) AbstractC37304Gc5.A04(parcel, IGAdsIABScreenshotDataDictImpl.class);
                if (parcel.readInt() != 0) {
                    bool2 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new IGAdsIABScreenshotDataDictImpl(iABScreenshotEffectOnUserAction, iABScreenshotTransitionTime, iGAdsIABScreenshotVariant, bool2, A0T, A0S3, A0S4, A0S5, readString7, parcel.readString());
            case 21:
                C14360o3.A0B(parcel, 0);
                return IGAdsIABScreenshotVariant.values()[parcel.readInt()];
            case 22:
                C14360o3.A0B(parcel, 0);
                return IGAdsRrFormatEnum.values()[parcel.readInt()];
            case 23:
                C14360o3.A0B(parcel, 0);
                return IGAdsTrustInfoTypeEnum.values()[parcel.readInt()];
            case 24:
                C14360o3.A0B(parcel, 0);
                return IGBWPExperienceTypes.values()[parcel.readInt()];
            case 25:
                String A0d6 = AbstractC37304Gc5.A0d(parcel);
                Integer num3 = null;
                if (parcel.readInt() != 0) {
                    num3 = AbstractC37304Gc5.A0U(parcel);
                }
                return new IGBWPIABPostClickDataExtensionDictImpl((IGBWPExperienceTypes) AbstractC37304Gc5.A04(parcel, IGBWPIABPostClickDataExtensionDictImpl.class), num3, AbstractC37304Gc5.A0W(parcel), A0d6, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 26:
                C14360o3.A0B(parcel, 0);
                return IGBuyWithPrimeExperienceTypes.values()[parcel.readInt()];
            case 27:
                String A0d7 = AbstractC37304Gc5.A0d(parcel);
                if (parcel.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new IGCTATextVariantImpl((IGCTATextVariantSource) AbstractC37304Gc5.A04(parcel, IGCTATextVariantImpl.class), valueOf7, A0d7, parcel.readString());
            case 28:
                C14360o3.A0B(parcel, 0);
                return IGCTATextVariantSource.values()[parcel.readInt()];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C14360o3.A0B(parcel, 0);
                return IGClickToMessagingCardTypeEnum.values()[parcel.readInt()];
            case 30:
                return new IGCommentSheetMoreInfoImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 31:
                C14360o3.A0B(parcel, 0);
                return IGConsiderAndBrowseType.values()[parcel.readInt()];
            case 32:
                C14360o3.A0B(parcel, 0);
                return IGCreatorIncentiveProgram.values()[parcel.readInt()];
            case 33:
                C14360o3.A0B(parcel, 0);
                return IGCreatorIncentiveProgramFetchEntryPoint.values()[parcel.readInt()];
            case 34:
                return new IGLeadGenSubheaderTrustSignalDataDictImpl(AbstractC37304Gc5.A0d(parcel));
            case 35:
                C14360o3.A0B(parcel, 0);
                return IGLiveFriendChatGuestStatus.values()[parcel.readInt()];
            case 36:
                C14360o3.A0B(parcel, 0);
                return IGLiveGameStatus.values()[parcel.readInt()];
            case 37:
                C14360o3.A0B(parcel, 0);
                return IGLiveGames.values()[parcel.readInt()];
            case 38:
                return new IGLocalEventDictImpl((EventVisibilityType) AbstractC37304Gc5.A04(parcel, IGLocalEventDictImpl.class), AbstractC37304Gc5.A0d(parcel));
            case 39:
                C14360o3.A0B(parcel, 0);
                return IGMusicArtistPinningErrorType.values()[parcel.readInt()];
            case 40:
                C14360o3.A0B(parcel, 0);
                return IGNativeSmartTextOverlayBackgroundShape.values()[parcel.readInt()];
            case Seq.NULL_REFNUM /* 41 */:
                C14360o3.A0B(parcel, 0);
                return IGNativeSmartTextOverlayFontStyleEnum.values()[parcel.readInt()];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C14360o3.A0B(parcel, 0);
                return IGNativeSmartTextOverlayStylingAlignment.values()[parcel.readInt()];
            case 43:
                C14360o3.A0B(parcel, 0);
                return IGNativeSmartTextOverlayStylingFontStyle.values()[parcel.readInt()];
            case 44:
                C14360o3.A0B(parcel, 0);
                return IGNativeSmartTextOverlayTextAlignmentEnum.values()[parcel.readInt()];
            case 45:
                C14360o3.A0B(parcel, 0);
                return IGNativeTextOverlayTextBoxAlignmentEnum.values()[parcel.readInt()];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new IGProjectPortalInfoDictImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 47:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    A173 = null;
                } else {
                    int readInt5 = parcel.readInt();
                    A173 = AbstractC25225BEi.A17(readInt5);
                    for (int i5 = 0; i5 != readInt5; i5++) {
                        AbstractC37304Gc5.A0r(parcel, IGRFSurveyContextDictImpl.class, A173);
                    }
                }
                return new IGRFSurveyContextDictImpl(A173, parcel.readString());
            case 48:
                return new IGRFSurveyContextMappingDictImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 49:
                C14360o3.A0B(parcel, 0);
                return new IGRFSurveyInfoDictImpl((IGRFSurveyContextDict) AbstractC37304Gc5.A04(parcel, IGRFSurveyInfoDictImpl.class));
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                C14360o3.A0B(parcel, 0);
                return IGRevShareProductType.values()[parcel.readInt()];
            case 51:
                C14360o3.A0B(parcel, 0);
                return INLINE_SURVEY_QUESTION_TYPES.values()[parcel.readInt()];
            case 52:
                C14360o3.A0B(parcel, 0);
                return ISOCountryCode.values()[parcel.readInt()];
            case 53:
                C14360o3.A0B(parcel, 0);
                return IgUserRelatedAccountTypeEnum.values()[parcel.readInt()];
            case 54:
                return new ImageURIDictImpl(AbstractC37304Gc5.A0d(parcel));
            case 55:
                Integer num4 = null;
                if (AbstractC37304Gc5.A00(parcel) != 0) {
                    num4 = AbstractC37304Gc5.A0U(parcel);
                }
                return new InlineStyleAtRangeDict(num4, AbstractC37304Gc5.A0X(parcel), AbstractC37304Gc5.A0W(parcel));
            case 56:
                C14360o3.A0B(parcel, 0);
                return InspirationSignalType.values()[parcel.readInt()];
            case 57:
                C14360o3.A0B(parcel, 0);
                return InstagramMediaProductType.values()[parcel.readInt()];
            case 58:
                C14360o3.A0B(parcel, 0);
                return InstagramMidcardType.values()[parcel.readInt()];
            case 59:
                C14360o3.A0B(parcel, 0);
                return InstagramProductTaggabilityState.values()[parcel.readInt()];
            case 60:
                C14360o3.A0B(parcel, 0);
                return InstagramProfileCallToActionDestinations.values()[parcel.readInt()];
            case 61:
                C14360o3.A0B(parcel, 0);
                return InstapalCharacterType.values()[parcel.readInt()];
            case 62:
                C14360o3.A0B(parcel, 0);
                return IntegrityInterstitialType.values()[parcel.readInt()];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                C14360o3.A0B(parcel, 0);
                return new IntentAwareAdsFormatInfoImpl((IntentAwareAdsFormatType) AbstractC37304Gc5.A04(parcel, IntentAwareAdsFormatInfoImpl.class), parcel.readString());
            case 64:
                C14360o3.A0B(parcel, 0);
                return InterestPivotRedirect.values()[parcel.readInt()];
            case 65:
                C14360o3.A0B(parcel, 0);
                return LeadGenEntryPoint.values()[parcel.readInt()];
            case 66:
                C14360o3.A0B(parcel, 0);
                return LikeVisibilityType.values()[parcel.readInt()];
            case 67:
                C14360o3.A0B(parcel, 0);
                return LinkAction.values()[parcel.readInt()];
            case 68:
                C14360o3.A0B(parcel, 0);
                return LinkAttachmentDisallowedReason.values()[parcel.readInt()];
            case 69:
                C14360o3.A0B(parcel, 0);
                return LinkStickerType.values()[parcel.readInt()];
            case 70:
                C14360o3.A0B(parcel, 0);
                return LinkType.values()[parcel.readInt()];
            case 71:
                return new LinkWithText(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 72:
                Boolean bool3 = null;
                if (AbstractC37304Gc5.A00(parcel) != 0) {
                    bool3 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new ListeningNowResponseInfo((ListeningNowState) AbstractC37304Gc5.A04(parcel, ListeningNowResponseInfo.class), (MusicInfo) AbstractC37304Gc5.A04(parcel, ListeningNowResponseInfo.class), bool3, AbstractC37304Gc5.A0W(parcel));
            case 73:
                C14360o3.A0B(parcel, 0);
                return ListeningNowState.values()[parcel.readInt()];
            case 74:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    A174 = null;
                } else {
                    int readInt6 = parcel.readInt();
                    A174 = AbstractC25225BEi.A17(readInt6);
                    for (int i6 = 0; i6 != readInt6; i6++) {
                        AbstractC37304Gc5.A0r(parcel, LiveNoteResponseInfo.class, A174);
                    }
                }
                return new LiveNoteResponseInfo(A174, parcel.readLong());
            case 75:
                C14360o3.A0B(parcel, 0);
                return LoadMoreType.values()[parcel.readInt()];
            case 76:
                return new LocationNoteResponseInfoImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 77:
                C14360o3.A0B(parcel, 0);
                return LocationTypeaheadType.values()[parcel.readInt()];
            case 78:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    valueOf8 = null;
                } else {
                    valueOf8 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new LoyaltyToplineInfoDictImpl(parcel.readString(), valueOf8);
            case 79:
                C14360o3.A0B(parcel, 0);
                return MapListType.values()[parcel.readInt()];
            case 80:
                C14360o3.A0B(parcel, 0);
                return MediaControlEventSourceEnum.values()[parcel.readInt()];
            case 81:
                C14360o3.A0B(parcel, 0);
                return MediaControlSurfaceEnum.values()[parcel.readInt()];
            case 82:
                C14360o3.A0B(parcel, 0);
                return MediaDestinationEnum.values()[parcel.readInt()];
            case 83:
                C14360o3.A0B(parcel, 0);
                return MediaGiftCountVisibilityState.values()[parcel.readInt()];
            case 84:
                C14360o3.A0B(parcel, 0);
                return MediaGiftingState.values()[parcel.readInt()];
            case 85:
                C14360o3.A0B(parcel, 0);
                return new MediaIdToBrandSafetyContentBlocklistBitmapMapImpl((BrandSafetyContentBlocklistBitmapQLObj) AbstractC37304Gc5.A04(parcel, MediaIdToBrandSafetyContentBlocklistBitmapMapImpl.class), parcel.readString());
            case 86:
                C14360o3.A0B(parcel, 0);
                return MediaKitVisibility.values()[parcel.readInt()];
            case 87:
                C14360o3.A0B(parcel, 0);
                return MediaNoticeIcon.values()[parcel.readInt()];
            case 88:
                C14360o3.A0B(parcel, 0);
                return MediaPromptPrefType.values()[parcel.readInt()];
            case 89:
                C14360o3.A0B(parcel, 0);
                return MediaTrialGraduationStrategy.values()[parcel.readInt()];
            case 90:
                C14360o3.A0B(parcel, 0);
                return MediaTrialStatus.values()[parcel.readInt()];
            case 91:
                C14360o3.A0B(parcel, 0);
                return MessagingOffPlatformShareType.values()[parcel.readInt()];
            case 92:
                C14360o3.A0B(parcel, 0);
                return MetaGalleryAlbumType.values()[parcel.readInt()];
            case 93:
                C14360o3.A0B(parcel, 0);
                return MetaGalleryNetegoInStoryMediaType.values()[parcel.readInt()];
            case 94:
                return new MetaPlaceDictImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 95:
                C14360o3.A0B(parcel, 0);
                return MidCardClipsClickedAction.values()[parcel.readInt()];
            case 96:
                C14360o3.A0B(parcel, 0);
                return MidCardLayoutType.values()[parcel.readInt()];
            case 97:
                C14360o3.A0B(parcel, 0);
                return MidCardOverlayType.values()[parcel.readInt()];
            case 98:
                C14360o3.A0B(parcel, 0);
                return MidCardReelsChainCtaType.values()[parcel.readInt()];
            default:
                C14360o3.A0B(parcel, 0);
                return new MiniShopColorCustomization((MiniShopColorPaletteCustomization) AbstractC37304Gc5.A04(parcel, MiniShopColorCustomization.class), (MiniShopColorPaletteCustomization) AbstractC37304Gc5.A04(parcel, MiniShopColorCustomization.class));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new GraphGuardianContentImpl[i];
            case 1:
                return new GreetingAttachment[i];
            case 2:
                return new GroupMetadataImpl[i];
            case 3:
                return new GrowthFrictionInterventionButtonImpl[i];
            case 4:
                return new GrowthFrictionInterventionDetailImpl[i];
            case 5:
                return new GuidanceTipIconAsset[i];
            case 6:
                return new GuidanceTipResponseImpl[i];
            case 7:
                return new GuideMediaType[i];
            case 8:
                return new GuideTypeStr[i];
            case 9:
                return new HzwPageInfoImpl[i];
            case 10:
                return new IABPostClickDataDictImpl[i];
            case 11:
                return new IABPostClickEligibleExperienceTypes[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new IABScreenshotEffectOnUserAction[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new IABScreenshotTransitionTime[i];
            case 14:
                return new IGAdCreationOptimizationPayloadDictImpl[i];
            case Process.SIGTERM /* 15 */:
                return new IGAdCreativeOptimizationConfigByTypeDictImpl[i];
            case 16:
                return new IGAdCreativeStory9x16CaptionDataImpl[i];
            case 17:
                return new IGAdProfileProductTabDictImpl[i];
            case 18:
                return new IGAdProfileProductTabFeatureModeEnum[i];
            case Process.SIGSTOP /* 19 */:
                return new IGAdScreenshotURLDataDictImpl[i];
            case 20:
                return new IGAdsIABScreenshotDataDictImpl[i];
            case 21:
                return new IGAdsIABScreenshotVariant[i];
            case 22:
                return new IGAdsRrFormatEnum[i];
            case 23:
                return new IGAdsTrustInfoTypeEnum[i];
            case 24:
                return new IGBWPExperienceTypes[i];
            case 25:
                return new IGBWPIABPostClickDataExtensionDictImpl[i];
            case 26:
                return new IGBuyWithPrimeExperienceTypes[i];
            case 27:
                return new IGCTATextVariantImpl[i];
            case 28:
                return new IGCTATextVariantSource[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new IGClickToMessagingCardTypeEnum[i];
            case 30:
                return new IGCommentSheetMoreInfoImpl[i];
            case 31:
                return new IGConsiderAndBrowseType[i];
            case 32:
                return new IGCreatorIncentiveProgram[i];
            case 33:
                return new IGCreatorIncentiveProgramFetchEntryPoint[i];
            case 34:
                return new IGLeadGenSubheaderTrustSignalDataDictImpl[i];
            case 35:
                return new IGLiveFriendChatGuestStatus[i];
            case 36:
                return new IGLiveGameStatus[i];
            case 37:
                return new IGLiveGames[i];
            case 38:
                return new IGLocalEventDictImpl[i];
            case 39:
                return new IGMusicArtistPinningErrorType[i];
            case 40:
                return new IGNativeSmartTextOverlayBackgroundShape[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new IGNativeSmartTextOverlayFontStyleEnum[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new IGNativeSmartTextOverlayStylingAlignment[i];
            case 43:
                return new IGNativeSmartTextOverlayStylingFontStyle[i];
            case 44:
                return new IGNativeSmartTextOverlayTextAlignmentEnum[i];
            case 45:
                return new IGNativeTextOverlayTextBoxAlignmentEnum[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new IGProjectPortalInfoDictImpl[i];
            case 47:
                return new IGRFSurveyContextDictImpl[i];
            case 48:
                return new IGRFSurveyContextMappingDictImpl[i];
            case 49:
                return new IGRFSurveyInfoDictImpl[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new IGRevShareProductType[i];
            case 51:
                return new INLINE_SURVEY_QUESTION_TYPES[i];
            case 52:
                return new ISOCountryCode[i];
            case 53:
                return new IgUserRelatedAccountTypeEnum[i];
            case 54:
                return new ImageURIDictImpl[i];
            case 55:
                return new InlineStyleAtRangeDict[i];
            case 56:
                return new InspirationSignalType[i];
            case 57:
                return new InstagramMediaProductType[i];
            case 58:
                return new InstagramMidcardType[i];
            case 59:
                return new InstagramProductTaggabilityState[i];
            case 60:
                return new InstagramProfileCallToActionDestinations[i];
            case 61:
                return new InstapalCharacterType[i];
            case 62:
                return new IntegrityInterstitialType[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new IntentAwareAdsFormatInfoImpl[i];
            case 64:
                return new InterestPivotRedirect[i];
            case 65:
                return new LeadGenEntryPoint[i];
            case 66:
                return new LikeVisibilityType[i];
            case 67:
                return new LinkAction[i];
            case 68:
                return new LinkAttachmentDisallowedReason[i];
            case 69:
                return new LinkStickerType[i];
            case 70:
                return new LinkType[i];
            case 71:
                return new LinkWithText[i];
            case 72:
                return new ListeningNowResponseInfo[i];
            case 73:
                return new ListeningNowState[i];
            case 74:
                return new LiveNoteResponseInfo[i];
            case 75:
                return new LoadMoreType[i];
            case 76:
                return new LocationNoteResponseInfoImpl[i];
            case 77:
                return new LocationTypeaheadType[i];
            case 78:
                return new LoyaltyToplineInfoDictImpl[i];
            case 79:
                return new MapListType[i];
            case 80:
                return new MediaControlEventSourceEnum[i];
            case 81:
                return new MediaControlSurfaceEnum[i];
            case 82:
                return new MediaDestinationEnum[i];
            case 83:
                return new MediaGiftCountVisibilityState[i];
            case 84:
                return new MediaGiftingState[i];
            case 85:
                return new MediaIdToBrandSafetyContentBlocklistBitmapMapImpl[i];
            case 86:
                return new MediaKitVisibility[i];
            case 87:
                return new MediaNoticeIcon[i];
            case 88:
                return new MediaPromptPrefType[i];
            case 89:
                return new MediaTrialGraduationStrategy[i];
            case 90:
                return new MediaTrialStatus[i];
            case 91:
                return new MessagingOffPlatformShareType[i];
            case 92:
                return new MetaGalleryAlbumType[i];
            case 93:
                return new MetaGalleryNetegoInStoryMediaType[i];
            case 94:
                return new MetaPlaceDictImpl[i];
            case 95:
                return new MidCardClipsClickedAction[i];
            case 96:
                return new MidCardLayoutType[i];
            case 97:
                return new MidCardOverlayType[i];
            case 98:
                return new MidCardReelsChainCtaType[i];
            default:
                return new MiniShopColorCustomization[i];
        }
    }
}
