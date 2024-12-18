package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.AdsMessageExtensionType;
import com.instagram.api.schemas.AdsTargetingGender;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.BoostedPostAudienceOption;
import com.instagram.api.schemas.DEPProgramLevelContentResponse;
import com.instagram.api.schemas.DestinationRecommendationReason;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.api.schemas.ErrorLevel;
import com.instagram.api.schemas.Estimate;
import com.instagram.api.schemas.InstagramProfileCallToActionDestinations;
import com.instagram.api.schemas.NonDiscInfo;
import com.instagram.api.schemas.PaymentInfo;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.api.schemas.XFBAdproRegionalRegulatedCategory;
import com.instagram.api.schemas.XFBCTXWelcomeMessageStatus;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfoImpl;
import com.instagram.api.schemas.ZodiacSign;
import com.instagram.appreciation.analytics.LoggingData;
import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import com.instagram.archive.intf.ArchivePendingUpload;
import com.instagram.avatar.AddAvatarHelper$LoadedImage$LoadedImageMetadata;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.barcelona.creation.location.model.PostLocationModel;
import com.instagram.barcelona.creation.phototag.model.UserTag;
import com.instagram.barcelona.creation.phototag.model.UserTagResult;
import com.instagram.barcelona.creation.voiceclips.model.TranscriptionToken;
import com.instagram.barcelona.creation.voiceclips.model.VoiceRecordingResult;
import com.instagram.barcelona.location.model.LocationModel;
import com.instagram.barcelona.permalink.ui.state.PermalinkTitle$CountdownTitle;
import com.instagram.barcelona.permalink.ui.state.PermalinkTitle$Ephemeral24HrTitle;
import com.instagram.barcelona.permalink.ui.state.PermalinkTitle$SectionTitle;
import com.instagram.barcelona.search.model.ResultUserInfo;
import com.instagram.barcelonaig.intf.GetApp$Type;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.brandedcontent.adseligibility.util.AdsEligibilityErrorDataItem;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs;
import com.instagram.brandedcontent.intf.response.MonetizationProductOnboardingNextStepInfo;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.business.boost.model.AdCreativeAuthorizationCategory;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.boost.webview.BoostWebViewAdPreviewFragment$Config;
import com.instagram.business.controller.datamodel.BusinessConversionFlowStatus;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.business.insights.model.DataPoint;
import com.instagram.business.insights.model.DaysHourlyFollowersData;
import com.instagram.business.insights.model.FollowersGrowthData;
import com.instagram.business.insights.model.GrowthDataPoint;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import com.instagram.business.model.BoostGuidanceItemResponse;
import com.instagram.business.model.PagePhotoItem;
import com.instagram.business.promote.model.AdsManagerBoostingStatusErrorCode;
import com.instagram.business.promote.model.AdsManagerPaymentAnomalyType;
import com.instagram.business.promote.model.AudienceGender;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.AudienceInterest;
import com.instagram.business.promote.model.AudiencePotentialReachRating;
import com.instagram.business.promote.model.BillingWizardName;
import com.instagram.business.promote.model.DistanceUnit;
import com.instagram.business.promote.model.ErrorHandlingResponseType;
import com.instagram.business.promote.model.HpiSessionStatus;
import com.instagram.business.promote.model.IGBoostPackage;
import com.instagram.business.promote.model.IGBoostPackagesFlowInfo;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.InstagramPromoteSuggestionReason;
import com.instagram.business.promote.model.LinkingAuthState;
import com.instagram.business.promote.model.PendingLocation;
import com.instagram.business.promote.model.PromoteAdsManagerActionType;
import com.instagram.business.promote.model.PromoteAudience;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteAudiencePotentialReach;
import com.instagram.business.promote.model.PromoteAudiencePotentialReachStore;
import com.instagram.business.promote.model.PromoteButtonAction;
import com.instagram.business.promote.model.PromoteButtonActionType;
import com.instagram.business.promote.model.PromoteCampaignControlsHeaderViewModel;
import com.instagram.business.promote.model.PromoteCreateAudienceResponse;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteDataSnapshot;
import com.instagram.business.promote.model.PromoteEnrollCouponInfo;
import com.instagram.business.promote.model.PromoteErrorHandlingResponse;
import com.instagram.business.promote.model.PromoteErrorLevel;
import com.instagram.business.promote.model.PromoteIntegrityCheckDataModel;
import com.instagram.business.promote.model.PromoteIntegrityCheckMessage;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.business.promote.model.PromoteReachEstimationStore;
import com.instagram.business.promote.model.PromoteSaveAudienceEditResponse;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.business.promote.model.PromoteWhatsAppAccountType;
import com.instagram.business.promote.model.PromotionMetric;
import com.instagram.business.promote.model.RejectionReason;
import com.instagram.business.promote.model.RejectionReasonRanges;
import com.instagram.business.promote.model.SbgChannelName;
import com.instagram.business.promote.model.SelectedInterestRowItem;
import com.instagram.business.promote.model.SpecialRequirementCategory;
import com.instagram.business.promote.model.SuggestedInterestRowItem;
import com.instagram.business.promote.model.SuggestedPromotion;
import com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel;
import com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures;
import com.instagram.camera.effect.models.AttributionUser;
import com.instagram.camera.effect.models.EffectActionSheet;
import com.instagram.camera.effect.models.ProfilePicture;
import com.instagram.camera.effect.models.ThumbnailImage;
import com.instagram.camera.effect.models.effectpreview.EffectPreview;
import com.instagram.camera.mpfacade.CameraEffectFacadeIntf$State;
import com.instagram.challenge.selfiecaptchachallenge.IgFaceTrackerModelsProvider;
import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.common.textwithentities.model.TextWithEntities;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.model.coupon.PromoteAdsCouponUseCase;
import com.instagram.model.coupon.PromoteCouponCurrencyAmount;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.music.common.model.ARAudioEffectData;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.AudioType;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.FollowStatus;
import com.meta.flytrap.attachment.model.AttachmentCounter;
import go.Seq;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.WId, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70220WId implements Parcelable.Creator {
    public final int A00;

    public C70220WId(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [com.instagram.challenge.selfiecaptchachallenge.IgFaceTrackerModelsProvider, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, com.instagram.business.promote.model.SuggestedInterestRowItem] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, com.instagram.business.promote.model.SelectedInterestRowItem] */
    /* JADX WARN: Type inference failed for: r10v14, types: [com.instagram.business.promote.model.RejectionReasonRanges, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v15, types: [com.instagram.business.promote.model.RejectionReason, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, com.instagram.business.promote.model.PromotionMetric] */
    /* JADX WARN: Type inference failed for: r10v19, types: [com.instagram.business.promote.model.PromoteSaveAudienceEditResponse, java.lang.Object, X.1um] */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.instagram.camera.effect.models.effectpreview.EffectPreview, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Object, com.instagram.business.promote.model.PromoteIntegrityCheckMessage] */
    /* JADX WARN: Type inference failed for: r10v23, types: [com.instagram.business.promote.model.PromoteIntegrityCheckDataModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.Object, com.instagram.business.promote.model.PromoteErrorHandlingResponse] */
    /* JADX WARN: Type inference failed for: r10v27, types: [com.instagram.business.promote.model.PromoteEnrollCouponInfo, java.lang.Object, X.1um] */
    /* JADX WARN: Type inference failed for: r10v28, types: [java.lang.Object, com.instagram.business.promote.model.PromoteData] */
    /* JADX WARN: Type inference failed for: r10v29, types: [com.instagram.business.promote.model.PromoteCreateAudienceResponse, java.lang.Object, X.1um] */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.instagram.camera.effect.models.ThumbnailImage, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v30, types: [com.instagram.business.promote.model.PromoteCampaignControlsHeaderViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v32, types: [com.instagram.business.promote.model.PromoteButtonAction, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.lang.Object, X.1um, com.instagram.business.promote.model.PromoteAudiencePotentialReach] */
    /* JADX WARN: Type inference failed for: r10v34, types: [com.instagram.business.promote.model.PromoteAudienceInfo, java.lang.Object, X.1um] */
    /* JADX WARN: Type inference failed for: r10v48, types: [java.lang.Object, com.instagram.business.promote.model.AudienceInterest] */
    /* JADX WARN: Type inference failed for: r10v49, types: [java.lang.Object, com.instagram.business.promote.model.AudienceGeoLocation] */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.instagram.camera.effect.models.EffectActionSheet, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.instagram.camera.effect.models.AttributionUser, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v60, types: [java.lang.Object, com.instagram.business.controller.datamodel.PageSelectionOverrideData] */
    /* JADX WARN: Type inference failed for: r10v72, types: [java.lang.Object, com.instagram.brandedcontent.intf.response.MonetizationProductOnboardingNextStepInfo] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel] */
    /* JADX WARN: Type inference failed for: r10v9, types: [com.instagram.business.promote.model.SuggestedPromotion, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer num;
        C26031BfK c26031BfK;
        HashSet hashSet;
        ArrayList arrayList;
        UPI upi;
        UPA upa;
        HashMap hashMap;
        Boolean bool;
        Double valueOf;
        LinkedHashMap linkedHashMap;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(parcel, 0);
                return XIGIGBoostCallToAction.values()[parcel.readInt()];
            case 1:
                C14360o3.A0B(parcel, 0);
                return XIGIGBoostDestination.values()[parcel.readInt()];
            case 2:
                return new XpostOriginalSoundFBCreatorInfoImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                C14360o3.A0B(parcel, 0);
                return ZodiacSign.values()[parcel.readInt()];
            case 4:
                return new LoggingData(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 5:
                return new LoggingFanData(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                boolean z = true;
                boolean A1M = AbstractC167007dF.A1M(AbstractC37304Gc5.A00(parcel));
                if (parcel.readInt() == 0) {
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    for (int i = 0; i != readInt; i++) {
                        MSX.A1N(Long.valueOf(parcel.readLong()), linkedHashMap, parcel.readLong());
                    }
                }
                return new CreatorLoggingData(A1M, z, linkedHashMap);
            case 7:
                String A0d = AbstractC37304Gc5.A0d(parcel);
                String readString = parcel.readString();
                ImageUrl imageUrl = (ImageUrl) AbstractC37304Gc5.A04(parcel, EffectsPageModel.class);
                Integer num2 = null;
                if (parcel.readInt() != 0) {
                    num2 = AbstractC37304Gc5.A0U(parcel);
                }
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean A1V = AbstractC37304Gc5.A1V(parcel);
                boolean A1V2 = AbstractC37304Gc5.A1V(parcel);
                Integer A0Y = AbstractC37304Gc5.A0Y(parcel);
                boolean A1V3 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V4 = AbstractC37304Gc5.A1V(parcel);
                return new EffectsPageModel((EffectAttribution) AbstractC37304Gc5.A04(parcel, EffectsPageModel.class), imageUrl, num2, A0Y, AbstractC37304Gc5.A0Y(parcel), AbstractC37304Gc5.A0W(parcel), A0d, readString, readString2, readString3, readString4, readString5, readString6, parcel.readString(), A1V, A1V2, A1V3, A1V4, AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 8:
                return new ArchivePendingUpload(AbstractC37304Gc5.A0d(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt(), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 9:
                C14360o3.A0B(parcel, 0);
                return new AddAvatarHelper$LoadedImage$LoadedImageMetadata(parcel);
            case 10:
                return UpdateProfilePicturePagerAdapter$UpdateProfileTabType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 11:
                return new PostLocationModel((LocationModel) AbstractC37304Gc5.A04(parcel, PostLocationModel.class), AbstractC37304Gc5.A0d(parcel));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new UserTag((ResultUserInfo) AbstractC37304Gc5.A04(parcel, UserTag.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readFloat(), parcel.readFloat());
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                String A0d2 = AbstractC37304Gc5.A0d(parcel);
                String readString7 = parcel.readString();
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = AbstractC37304Gc5.A01(parcel, UserTag.CREATOR, arrayList2, i2);
                }
                return new UserTagResult(A0d2, readString7, arrayList2);
            case 14:
                return new TranscriptionToken(AbstractC37304Gc5.A0d(parcel), parcel.readInt(), parcel.readInt(), AbstractC37304Gc5.A1V(parcel));
            case Process.SIGTERM /* 15 */:
                return new VoiceRecordingResult(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 16:
                C14360o3.A0B(parcel, 0);
                long readLong = parcel.readLong();
                String readString8 = parcel.readString();
                Double d = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Double.valueOf(parcel.readDouble());
                }
                if (parcel.readInt() != 0) {
                    d = Double.valueOf(parcel.readDouble());
                }
                return new LocationModel(valueOf, d, readString8, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), readLong);
            case 17:
                return new PermalinkTitle$CountdownTitle(AbstractC37304Gc5.A00(parcel), parcel.readLong());
            case 18:
                return new PermalinkTitle$Ephemeral24HrTitle(AbstractC37304Gc5.A00(parcel));
            case Process.SIGSTOP /* 19 */:
                return new PermalinkTitle$SectionTitle(AbstractC37304Gc5.A00(parcel), parcel.readString());
            case 20:
                String A0d3 = AbstractC37304Gc5.A0d(parcel);
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ImageUrl imageUrl2 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ResultUserInfo.class);
                boolean A1V5 = AbstractC37304Gc5.A1V(parcel);
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                C5Hb c5Hb = null;
                if (parcel.readInt() != 0) {
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt3);
                    for (int i3 = 0; i3 != readInt3; i3++) {
                        AbstractC37304Gc5.A0r(parcel, ResultUserInfo.class, arrayList3);
                    }
                    c5Hb = AbstractC133095zb.A03(arrayList3);
                }
                return new ResultUserInfo(imageUrl2, (FollowStatus) AbstractC37304Gc5.A04(parcel, ResultUserInfo.class), AbstractC37304Gc5.A0X(parcel), A0d3, readString9, readString10, readString11, readString12, c5Hb, A1V5, AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 21:
                return GetApp$Type.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 22:
                return new IgBloksScreenConfig(parcel);
            case 23:
                return new AdsEligibilityErrorDataItem(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 24:
                C14360o3.A0B(parcel, 0);
                parcel.readInt();
                return new BrandedContentDisclosureArgs();
            case 25:
                C14360o3.A0B(parcel, 0);
                ?? obj = new Object();
                obj.A00 = parcel.readInt();
                obj.A01 = parcel.readString();
                return obj;
            case 26:
                String A0d4 = AbstractC37304Gc5.A0d(parcel);
                if (A0d4 == null) {
                    A0d4 = "";
                }
                String readString13 = parcel.readString();
                if (readString13 == null) {
                    readString13 = "";
                }
                String readString14 = parcel.readString();
                if (readString14 == null) {
                    readString14 = "";
                }
                return new BugReportComposerViewModel(A0d4, readString13, readString14, AbstractC37304Gc5.A1X(parcel), AbstractC37304Gc5.A1X(parcel), AbstractC37304Gc5.A1X(parcel));
            case 27:
                String A0d5 = AbstractC37304Gc5.A0d(parcel);
                String readString15 = parcel.readString();
                int readInt4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt4);
                for (int i4 = 0; i4 != readInt4; i4++) {
                    AbstractC37304Gc5.A0r(parcel, BugReport.class, arrayList4);
                }
                int readInt5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt5);
                for (int i5 = 0; i5 != readInt5; i5++) {
                    int readInt6 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(readInt6);
                    for (int i6 = 0; i6 != readInt6; i6++) {
                        AbstractC37304Gc5.A0r(parcel, BugReport.class, arrayList6);
                    }
                    arrayList5.add(arrayList6);
                }
                int readInt7 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt7);
                for (int i7 = 0; i7 != readInt7; i7++) {
                    AbstractC37304Gc5.A0r(parcel, BugReport.class, arrayList7);
                }
                int readInt8 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt8);
                for (int i8 = 0; i8 != readInt8; i8++) {
                    AbstractC37304Gc5.A0r(parcel, BugReport.class, arrayList8);
                }
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                String readString18 = parcel.readString();
                String readString19 = parcel.readString();
                BugReportSource valueOf2 = BugReportSource.valueOf(parcel.readString());
                int readInt9 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt9);
                for (int i9 = 0; i9 != readInt9; i9++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                return new BugReport(valueOf2, (AttachmentCounter) AbstractC37304Gc5.A04(parcel, BugReport.class), (AttachmentCounter) AbstractC37304Gc5.A04(parcel, BugReport.class), (AttachmentCounter) AbstractC37304Gc5.A04(parcel, BugReport.class), (AttachmentCounter) AbstractC37304Gc5.A04(parcel, BugReport.class), (File) parcel.readSerializable(), A0d5, readString15, readString16, readString17, readString18, readString19, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), arrayList4, arrayList5, arrayList7, arrayList8, linkedHashMap2, AbstractC37304Gc5.A1V(parcel));
            case 28:
                return BoostMediaPickerTabType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C14360o3.A0B(parcel, 0);
                return AdCreativeAuthorizationCategory.values()[parcel.readInt()];
            case 30:
                return BoostFlowType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 31:
                return new BoostWebViewAdPreviewFragment$Config(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 32:
                C14360o3.A0B(parcel, 0);
                return new BusinessConversionFlowStatus(parcel);
            case 33:
                C14360o3.A0B(parcel, 0);
                return new BusinessConversionStep(parcel);
            case 34:
                String A0d6 = AbstractC37304Gc5.A0d(parcel);
                if (A0d6 != null && A0d6.length() != 0) {
                    try {
                        return ConversionStep.valueOf(A0d6);
                    } catch (IllegalArgumentException unused) {
                        return ConversionStep.A0K;
                    }
                }
                return ConversionStep.A0K;
            case 35:
                C14360o3.A0B(parcel, 0);
                ?? obj2 = new Object();
                obj2.A01 = parcel.readInt();
                obj2.A00 = parcel.readInt();
                obj2.A04 = parcel.readString();
                obj2.A03 = parcel.readString();
                obj2.A06 = parcel.readString();
                String readString20 = parcel.readString();
                if (readString20 == null) {
                    readString20 = "";
                }
                obj2.A02 = readString20;
                obj2.A08 = parcel.readString();
                obj2.A07 = parcel.readString();
                obj2.A05 = parcel.readString();
                return obj2;
            case 36:
                return new DataPoint(AbstractC37304Gc5.A00(parcel), parcel.readString());
            case 37:
                String A0d7 = AbstractC37304Gc5.A0d(parcel);
                int readInt10 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(readInt10);
                int i10 = 0;
                while (i10 != readInt10) {
                    i10 = AbstractC37304Gc5.A01(parcel, DataPoint.CREATOR, arrayList9, i10);
                }
                return new DaysHourlyFollowersData(A0d7, arrayList9);
            case 38:
                String A0d8 = AbstractC37304Gc5.A0d(parcel);
                int readInt11 = parcel.readInt();
                int readInt12 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(readInt12);
                int i11 = 0;
                while (i11 != readInt12) {
                    i11 = AbstractC37304Gc5.A01(parcel, GrowthDataPoint.CREATOR, arrayList10, i11);
                }
                return new FollowersGrowthData(arrayList10, readInt11, A0d8);
            case 39:
                return new GrowthDataPoint(AbstractC37304Gc5.A00(parcel), parcel.readInt());
            case 40:
                try {
                    return new IGInstantExperiencesParameters("", AbstractC167007dF.A0d());
                } catch (JSONException e) {
                    C0K8.A0F("IGInstantExperiencesParameters", "Failed to create class IGInstantExperiencesParameters", e);
                    return null;
                }
            case Seq.NULL_REFNUM /* 41 */:
                return new BoostGuidanceItemResponse(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new PagePhotoItem(parcel);
            case 43:
                return AdsManagerBoostingStatusErrorCode.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 44:
                return AdsManagerPaymentAnomalyType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 45:
                return AudienceGender.valueOf(AbstractC37304Gc5.A0d(parcel));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C14360o3.A0B(parcel, 0);
                ?? obj3 = new Object();
                obj3.A06 = parcel.readString();
                obj3.A05 = parcel.readString();
                obj3.A03 = (AdGeoLocationType) AbstractC37304Gc5.A04(parcel, AdGeoLocationType.class);
                obj3.A00 = parcel.readDouble();
                obj3.A01 = parcel.readDouble();
                obj3.A02 = parcel.readInt();
                obj3.A04 = parcel.readString();
                obj3.A08 = parcel.readString();
                obj3.A07 = parcel.readString();
                return obj3;
            case 47:
                C14360o3.A0B(parcel, 0);
                ?? obj4 = new Object();
                String readString21 = parcel.readString();
                if (readString21 != null) {
                    obj4.A00 = readString21;
                    String readString22 = parcel.readString();
                    if (readString22 != null) {
                        obj4.A01 = readString22;
                        return obj4;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            case 48:
                return AudiencePotentialReachRating.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 49:
                return BillingWizardName.valueOf(AbstractC37304Gc5.A0d(parcel));
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return DistanceUnit.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 51:
                return ErrorHandlingResponseType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 52:
                return HpiSessionStatus.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 53:
                C14360o3.A0B(parcel, 0);
                parcel.readInt();
                return new Object();
            case 54:
                C14360o3.A0B(parcel, 0);
                parcel.readInt();
                return new Object();
            case 55:
                return InstagramMediaProductType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 56:
                return InstagramPromoteSuggestionReason.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 57:
                return LinkingAuthState.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 58:
                C14360o3.A0B(parcel, 0);
                PendingLocation pendingLocation = new PendingLocation();
                AbstractC65702TsY.A0z(parcel, AudienceGeoLocation.class, pendingLocation.A05);
                pendingLocation.A00 = parcel.readInt();
                pendingLocation.A01 = (AudienceGeoLocation) AbstractC37304Gc5.A04(parcel, AudienceGeoLocation.class);
                pendingLocation.A02 = (AudienceGeoLocation) AbstractC37304Gc5.A04(parcel, AudienceGeoLocation.class);
                AbstractC65702TsY.A0z(parcel, AudienceGeoLocation.class, pendingLocation.A04);
                Object A0n = AbstractC58321PtD.A0n(parcel, Boolean.TYPE);
                if (A0n instanceof Boolean) {
                    bool = (Boolean) A0n;
                } else {
                    bool = null;
                }
                pendingLocation.A03 = bool;
                return pendingLocation;
            case 59:
                return PromoteAdsManagerActionType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 60:
                C14360o3.A0B(parcel, 0);
                PromoteAudience promoteAudience = new PromoteAudience();
                promoteAudience.A05 = parcel.readString();
                promoteAudience.A07 = parcel.readString();
                promoteAudience.A06 = parcel.readString();
                promoteAudience.A03 = (BoostedPostAudienceOption) AbstractC37304Gc5.A04(parcel, BoostedPostAudienceOption.class);
                promoteAudience.A01 = parcel.readInt();
                promoteAudience.A00 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList();
                promoteAudience.A08 = arrayList11;
                parcel.readTypedList(arrayList11, AdsTargetingGender.CREATOR);
                promoteAudience.A09 = parcel.createStringArrayList();
                promoteAudience.A0A = parcel.createStringArrayList();
                promoteAudience.A04 = (TargetingRelaxationConstants) AbstractC37304Gc5.A04(parcel, TargetingRelaxationConstants.class);
                boolean z2 = false;
                promoteAudience.A0C = AbstractC167007dF.A1P(parcel.readInt(), 1);
                if (parcel.readInt() == 1) {
                    z2 = true;
                }
                promoteAudience.A0D = z2;
                promoteAudience.A02 = (AdvantageAudienceData) AbstractC37304Gc5.A04(parcel, AdvantageAudienceData.class);
                return promoteAudience;
            case 61:
                C14360o3.A0B(parcel, 0);
                ?? c40791um = new C40791um();
                c40791um.A04 = parcel.readString();
                c40791um.A05 = parcel.readString();
                c40791um.A01 = parcel.readInt();
                c40791um.A00 = parcel.readInt();
                ArrayList arrayList12 = null;
                if (parcel.readByte() == 0) {
                    c40791um.A06 = null;
                } else {
                    ArrayList arrayList13 = new ArrayList();
                    AbstractC65702TsY.A0z(parcel, AudienceGender.class, arrayList13);
                    c40791um.A06 = arrayList13;
                }
                if (parcel.readByte() == 0) {
                    c40791um.A07 = null;
                } else {
                    ArrayList arrayList14 = new ArrayList();
                    AbstractC65702TsY.A0z(parcel, AudienceGeoLocation.class, arrayList14);
                    c40791um.A07 = arrayList14;
                }
                if (parcel.readByte() != 0) {
                    arrayList12 = new ArrayList();
                    AbstractC65702TsY.A0z(parcel, AudienceInterest.class, arrayList12);
                }
                c40791um.A08 = arrayList12;
                c40791um.A03 = (TargetingRelaxationConstants) AbstractC37304Gc5.A04(parcel, TargetingRelaxationConstants.class);
                c40791um.A02 = (AdvantageAudienceData) AbstractC37304Gc5.A04(parcel, AdvantageAudienceData.class);
                return c40791um;
            case 62:
                C14360o3.A0B(parcel, 0);
                ?? c40791um2 = new C40791um();
                c40791um2.A00 = parcel.readInt();
                c40791um2.A03 = (AudiencePotentialReachRating) AbstractC37304Gc5.A04(parcel, AudiencePotentialReachRating.class);
                c40791um2.A01 = parcel.readInt();
                c40791um2.A02 = parcel.readInt();
                return c40791um2;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                C14360o3.A0B(parcel, 0);
                PromoteAudiencePotentialReachStore promoteAudiencePotentialReachStore = new PromoteAudiencePotentialReachStore();
                int readInt13 = parcel.readInt();
                int i12 = 1;
                if (1 > readInt13) {
                    return promoteAudiencePotentialReachStore;
                }
                while (true) {
                    Parcelable A04 = AbstractC37304Gc5.A04(parcel, PromoteAudienceInfo.class);
                    if (A04 != null) {
                        Parcelable A042 = AbstractC37304Gc5.A04(parcel, PromoteAudiencePotentialReach.class);
                        if (A042 != null) {
                            promoteAudiencePotentialReachStore.A00.put(A04, A042);
                            if (i12 == readInt13) {
                                return promoteAudiencePotentialReachStore;
                            }
                            i12++;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            case 64:
                C14360o3.A0B(parcel, 0);
                ?? obj5 = new Object();
                String readString23 = parcel.readString();
                if (readString23 != null) {
                    obj5.A01 = readString23;
                    String readString24 = parcel.readString();
                    if (readString24 != null) {
                        obj5.A02 = readString24;
                        Parcelable A043 = AbstractC37304Gc5.A04(parcel, PromoteButtonActionType.class);
                        if (A043 != null) {
                            PromoteButtonActionType promoteButtonActionType = (PromoteButtonActionType) A043;
                            C14360o3.A0B(promoteButtonActionType, 0);
                            obj5.A00 = promoteButtonActionType;
                            return obj5;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            case 65:
                return PromoteButtonActionType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 66:
                C14360o3.A0B(parcel, 0);
                ?? obj6 = new Object();
                String readString25 = parcel.readString();
                if (readString25 != null) {
                    obj6.A00 = readString25;
                    return obj6;
                }
                throw AbstractC166997dE.A0g();
            case 67:
                C14360o3.A0B(parcel, 0);
                ?? c40791um3 = new C40791um();
                c40791um3.A01 = parcel.readString();
                c40791um3.A02 = AbstractC37304Gc5.A1X(parcel);
                return c40791um3;
            case 68:
                ?? obj7 = new Object();
                boolean z3 = false;
                AbstractC65702TsY.A1N(obj7);
                AbstractC65702TsY.A1O(obj7);
                Boolean bool2 = null;
                obj7.A1C = null;
                obj7.A1D = null;
                obj7.A25 = new HashSet();
                obj7.A2C = false;
                obj7.A2z = false;
                obj7.A2M = false;
                obj7.A35 = false;
                obj7.A1S = parcel.readString();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                ArrayList arrayList15 = new ArrayList();
                obj7.A1v = arrayList15;
                if (createStringArrayList != null) {
                    arrayList15.addAll(createStringArrayList);
                }
                obj7.A0m = (IGBoostPackagesFlowInfo) AbstractC37304Gc5.A04(parcel, IGBoostPackagesFlowInfo.class);
                obj7.A0H = parcel.readInt();
                obj7.A17 = (ProductType) AbstractC37304Gc5.A04(parcel, ProductType.class);
                obj7.A0l = (BoostFlowType) AbstractC37304Gc5.A04(parcel, BoostFlowType.class);
                obj7.A11 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                ArrayList arrayList16 = new ArrayList();
                obj7.A1w = arrayList16;
                if (createStringArrayList2 != null) {
                    arrayList16.addAll(createStringArrayList2);
                }
                obj7.A1A = parcel.readString();
                obj7.A1B = parcel.readString();
                obj7.A1Q = parcel.readString();
                obj7.A1R = parcel.readString();
                obj7.A10 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                obj7.A1K = parcel.readString();
                obj7.A1L = parcel.readString();
                obj7.A2u = AbstractC167007dF.A1M(parcel.readByte());
                obj7.A2K = AbstractC37304Gc5.A1X(parcel);
                obj7.A28 = AbstractC37304Gc5.A1X(parcel);
                obj7.A32 = AbstractC37304Gc5.A1X(parcel);
                obj7.A30 = AbstractC37304Gc5.A1X(parcel);
                obj7.A2T = AbstractC37304Gc5.A1X(parcel);
                obj7.A0i = (XIGIGBoostDestination) AbstractC37304Gc5.A04(parcel, XIGIGBoostDestination.class);
                obj7.A0g = (XIGIGBoostDestination) AbstractC37304Gc5.A04(parcel, XIGIGBoostDestination.class);
                obj7.A0f = (XIGIGBoostDestination) AbstractC37304Gc5.A04(parcel, XIGIGBoostDestination.class);
                obj7.A0h = (XIGIGBoostDestination) AbstractC37304Gc5.A04(parcel, XIGIGBoostDestination.class);
                obj7.A0j = (XIGIGBoostDestination) AbstractC37304Gc5.A04(parcel, XIGIGBoostDestination.class);
                ArrayList createTypedArrayList = parcel.createTypedArrayList(XIGIGBoostDestination.CREATOR);
                createTypedArrayList.getClass();
                obj7.A20 = createTypedArrayList;
                obj7.A0S = (DestinationRecommendationReason) AbstractC37304Gc5.A04(parcel, DestinationRecommendationReason.class);
                obj7.A1I = parcel.readString();
                obj7.A1W = parcel.readString();
                obj7.A0b = (XIGIGBoostCallToAction) AbstractC37304Gc5.A04(parcel, XIGIGBoostCallToAction.class);
                obj7.A0c = (XIGIGBoostCallToAction) AbstractC37304Gc5.A04(parcel, XIGIGBoostCallToAction.class);
                obj7.A1m = parcel.createTypedArrayList(PromoteAudience.CREATOR);
                obj7.A2e = AbstractC37304Gc5.A1X(parcel);
                obj7.A2f = AbstractC37304Gc5.A1X(parcel);
                obj7.A2r = AbstractC37304Gc5.A1X(parcel);
                obj7.A2U = AbstractC37304Gc5.A1X(parcel);
                obj7.A1Z = parcel.readString();
                obj7.A1V = parcel.readString();
                obj7.A1X = parcel.readString();
                obj7.A1b = parcel.readString();
                obj7.A18 = (AudioOverlayTrack) AbstractC37304Gc5.A04(parcel, AudioOverlayTrack.class);
                HashMap hashMap2 = new HashMap();
                int readInt14 = parcel.readInt();
                for (int i13 = 0; i13 < readInt14; i13++) {
                    hashMap2.put(parcel.readString(), AbstractC37304Gc5.A04(parcel, PromoteAudience.class));
                }
                obj7.A22 = hashMap2;
                obj7.A1j = (Currency) parcel.readSerializable();
                obj7.A06 = parcel.readInt();
                obj7.A2P = AbstractC37304Gc5.A1X(parcel);
                obj7.A2S = AbstractC37304Gc5.A1X(parcel);
                obj7.A2R = AbstractC37304Gc5.A1X(parcel);
                obj7.A2Q = AbstractC37304Gc5.A1X(parcel);
                obj7.A2G = AbstractC37304Gc5.A1X(parcel);
                obj7.A2H = AbstractC37304Gc5.A1X(parcel);
                obj7.A01 = parcel.readInt();
                obj7.A02 = parcel.readInt();
                obj7.A00 = parcel.readInt();
                AbstractC65702TsY.A0z(parcel, Integer.class, obj7.A1n);
                AbstractC65702TsY.A0z(parcel, Integer.class, obj7.A1y);
                AbstractC65702TsY.A0z(parcel, Integer.class, obj7.A1o);
                obj7.A07 = parcel.readInt();
                obj7.A0C = parcel.readInt();
                obj7.A08 = parcel.readInt();
                obj7.A0I = parcel.readInt();
                obj7.A0A = parcel.readInt();
                obj7.A09 = parcel.readInt();
                obj7.A2w = AbstractC37304Gc5.A1X(parcel);
                obj7.A0u = (PromoteIntegrityCheckDataModel) AbstractC37304Gc5.A04(parcel, PromoteIntegrityCheckDataModel.class);
                obj7.A1F = parcel.readString();
                obj7.A04 = parcel.readInt();
                obj7.A2s = AbstractC37304Gc5.A1X(parcel);
                obj7.A2d = AbstractC37304Gc5.A1X(parcel);
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(AdsAPIInstagramPosition.CREATOR);
                createTypedArrayList2.getClass();
                obj7.A1r = createTypedArrayList2;
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(AdsMessageExtensionType.CREATOR);
                createTypedArrayList3.getClass();
                obj7.A1x = createTypedArrayList3;
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(XIGIGBoostDestination.CREATOR);
                createTypedArrayList4.getClass();
                obj7.A1p = createTypedArrayList4;
                obj7.A2o = AbstractC37304Gc5.A1X(parcel);
                obj7.A34 = AbstractC37304Gc5.A1X(parcel);
                obj7.A1U = parcel.readString();
                if (parcel.readByte() == 0) {
                    c26031BfK = null;
                } else {
                    c26031BfK = new C26031BfK(parcel.readFloat(), 0);
                }
                obj7.A0M = c26031BfK;
                obj7.A0X = (PaymentInfo) AbstractC37304Gc5.A04(parcel, PaymentInfo.class);
                obj7.A0W = (NonDiscInfo) AbstractC37304Gc5.A04(parcel, NonDiscInfo.class);
                obj7.A1H = parcel.readString();
                obj7.A2D = AbstractC37304Gc5.A1X(parcel);
                obj7.A0t = (PromoteEnrollCouponInfo) AbstractC37304Gc5.A04(parcel, PromoteEnrollCouponInfo.class);
                obj7.A33 = AbstractC37304Gc5.A1X(parcel);
                obj7.A2x = AbstractC37304Gc5.A1X(parcel);
                obj7.A0w = (PromoteReachEstimationStore) AbstractC37304Gc5.A04(parcel, PromoteReachEstimationStore.class);
                obj7.A2p = AbstractC37304Gc5.A1X(parcel);
                obj7.A2Y = AbstractC37304Gc5.A1X(parcel);
                obj7.A2v = AbstractC37304Gc5.A1X(parcel);
                Parcelable.Creator creator = InstagramProfileCallToActionDestinations.CREATOR;
                ArrayList createTypedArrayList5 = parcel.createTypedArrayList(creator);
                if (createTypedArrayList5 == null) {
                    createTypedArrayList5 = new ArrayList();
                }
                obj7.A1q = createTypedArrayList5;
                ArrayList createTypedArrayList6 = parcel.createTypedArrayList(creator);
                if (createTypedArrayList6 != null) {
                    hashSet = new HashSet(createTypedArrayList6);
                } else {
                    hashSet = new HashSet();
                }
                obj7.A24 = hashSet;
                obj7.A0x = (PromoteWhatsAppAccountType) AbstractC37304Gc5.A04(parcel, PromoteWhatsAppAccountType.class);
                obj7.A0k = (AdCreativeAuthorizationCategory) AbstractC37304Gc5.A04(parcel, AdCreativeAuthorizationCategory.class);
                obj7.A2t = AbstractC37304Gc5.A1X(parcel);
                obj7.A2k = AbstractC37304Gc5.A1X(parcel);
                obj7.A2l = AbstractC37304Gc5.A1X(parcel);
                obj7.A0U = (Estimate) AbstractC37304Gc5.A04(parcel, Estimate.class);
                obj7.A0T = (Estimate) AbstractC37304Gc5.A04(parcel, Estimate.class);
                obj7.A0q = (PromoteAudienceInfo) AbstractC37304Gc5.A04(parcel, PromoteAudienceInfo.class);
                obj7.A0p = (PromoteAudienceInfo) AbstractC37304Gc5.A04(parcel, PromoteAudienceInfo.class);
                obj7.A1J = parcel.readString();
                byte readByte = parcel.readByte();
                if (readByte != 0) {
                    bool2 = Boolean.valueOf(AbstractC167007dF.A1P(readByte, 1));
                }
                obj7.A19 = bool2;
                obj7.A2a = AbstractC37304Gc5.A1X(parcel);
                obj7.A0R = (DEPProgramLevelContentResponse) AbstractC37304Gc5.A04(parcel, DEPProgramLevelContentResponse.class);
                obj7.A1l = PromoteData.A00(parcel);
                obj7.A1c = parcel.readString();
                obj7.A0v = (PromoteLaunchOrigin) AbstractC37304Gc5.A04(parcel, PromoteLaunchOrigin.class);
                if (parcel.readByte() == 0) {
                    upa = null;
                } else {
                    if (parcel.readByte() == 0) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        int readInt15 = parcel.readInt();
                        for (int i14 = 0; i14 < readInt15; i14++) {
                            arrayList.add(new C66634UQm(parcel.readString(), parcel.readString()));
                        }
                    }
                    String readString26 = parcel.readString();
                    if (parcel.readByte() == 0) {
                        upi = null;
                    } else {
                        String readString27 = parcel.readString();
                        ArrayList A00 = PromoteData.A00(parcel);
                        upi = new UPI((com.instagram.api.schemas.ErrorHandlingResponseType) AbstractC37304Gc5.A04(parcel, com.instagram.api.schemas.ErrorHandlingResponseType.class), (ErrorLevel) AbstractC37304Gc5.A04(parcel, ErrorLevel.class), readString27, parcel.readString(), parcel.readString(), parcel.readString(), A00);
                    }
                    upa = new UPA(upi, (ErrorIdentifier) AbstractC37304Gc5.A04(parcel, ErrorIdentifier.class), readString26, parcel.readString(), arrayList);
                }
                obj7.A0Y = upa;
                obj7.A2y = AbstractC37304Gc5.A1X(parcel);
                obj7.A1T = parcel.readString();
                obj7.A0F = parcel.readInt();
                obj7.A0D = parcel.readInt();
                obj7.A0G = parcel.readInt();
                obj7.A0E = parcel.readInt();
                obj7.A0o = (PendingLocation) AbstractC37304Gc5.A04(parcel, PendingLocation.class);
                obj7.A0r = (PromoteAudiencePotentialReachStore) AbstractC37304Gc5.A04(parcel, PromoteAudiencePotentialReachStore.class);
                if (parcel.readByte() != 0) {
                    hashMap = new HashMap();
                    int readInt16 = parcel.readInt();
                    for (int i15 = 0; i15 < readInt16; i15++) {
                        AbstractC166997dE.A1U(AbstractC37304Gc5.A0U(parcel), hashMap, parcel.readInt());
                    }
                } else {
                    hashMap = null;
                }
                obj7.A23 = hashMap;
                obj7.A05 = parcel.readInt();
                obj7.A2X = AbstractC37304Gc5.A1X(parcel);
                obj7.A1P = parcel.readString();
                obj7.A2g = AbstractC37304Gc5.A1X(parcel);
                obj7.A0Q = (com.instagram.api.schemas.BillingWizardName) AbstractC37304Gc5.A04(parcel, com.instagram.api.schemas.BillingWizardName.class);
                obj7.A1E = parcel.readString();
                obj7.A1Y = parcel.readString();
                obj7.A2h = AbstractC37304Gc5.A1X(parcel);
                obj7.A2Z = AbstractC37304Gc5.A1X(parcel);
                obj7.A2j = AbstractC37304Gc5.A1X(parcel);
                obj7.A2i = AbstractC37304Gc5.A1X(parcel);
                obj7.A2n = AbstractC37304Gc5.A1X(parcel);
                obj7.A2m = AbstractC37304Gc5.A1X(parcel);
                obj7.A2J = AbstractC37304Gc5.A1X(parcel);
                obj7.A31 = AbstractC37304Gc5.A1X(parcel);
                if (parcel.readByte() != 0) {
                    String readString28 = parcel.readString();
                    readString28.getClass();
                    obj7.A13 = EnumC68189VFh.valueOf(readString28);
                }
                if (parcel.readByte() != 0) {
                    String readString29 = parcel.readString();
                    readString29.getClass();
                    obj7.A15 = EnumC68198VFq.valueOf(readString29);
                }
                if (parcel.readByte() != 0) {
                    String readString30 = parcel.readString();
                    readString30.getClass();
                    obj7.A14 = EnumC68198VFq.valueOf(readString30);
                }
                obj7.A0n = (LinkingAuthState) AbstractC37304Gc5.A04(parcel, LinkingAuthState.class);
                obj7.A2b = AbstractC37304Gc5.A1X(parcel);
                obj7.A2I = AbstractC37304Gc5.A1X(parcel);
                obj7.A2L = AbstractC37304Gc5.A1X(parcel);
                obj7.A0s = (PromoteDataSnapshot) AbstractC37304Gc5.A04(parcel, PromoteDataSnapshot.class);
                obj7.A2W = AbstractC37304Gc5.A1X(parcel);
                obj7.A2q = AbstractC37304Gc5.A1X(parcel);
                obj7.A1C = parcel.readString();
                obj7.A1D = parcel.readString();
                obj7.A0a = (XFBCTXWelcomeMessageStatus) AbstractC37304Gc5.A04(parcel, XFBCTXWelcomeMessageStatus.class);
                AbstractC65702TsY.A0z(parcel, SpecialRequirementCategory.class, obj7.A21);
                obj7.A2V = AbstractC37304Gc5.A1X(parcel);
                ArrayList createTypedArrayList7 = parcel.createTypedArrayList(XIGIGBoostDestination.CREATOR);
                createTypedArrayList7.getClass();
                obj7.A26 = new HashSet(createTypedArrayList7);
                obj7.A1a = parcel.readString();
                obj7.A1G = parcel.readString();
                obj7.A29 = AbstractC37304Gc5.A1X(parcel);
                obj7.A2c = AbstractC37304Gc5.A1X(parcel);
                ArrayList createTypedArrayList8 = parcel.createTypedArrayList(XFBAdproRegionalRegulatedCategory.CREATOR);
                createTypedArrayList8.getClass();
                obj7.A25 = new HashSet(createTypedArrayList8);
                obj7.A2C = AbstractC37304Gc5.A1X(parcel);
                obj7.A1d = parcel.readString();
                obj7.A1g = parcel.readString();
                obj7.A1e = parcel.readString();
                obj7.A1h = parcel.readString();
                obj7.A1f = parcel.readString();
                obj7.A1i = parcel.readString();
                obj7.A12 = (EnumC39597He7) parcel.readSerializable();
                obj7.A2z = AbstractC37304Gc5.A1X(parcel);
                obj7.A2M = AbstractC37304Gc5.A1X(parcel);
                if (parcel.readByte() != 0) {
                    z3 = true;
                }
                obj7.A35 = z3;
                return obj7;
            case 69:
                C14360o3.A0B(parcel, 0);
                PromoteDataSnapshot promoteDataSnapshot = new PromoteDataSnapshot();
                promoteDataSnapshot.A07 = (XIGIGBoostDestination) AbstractC37304Gc5.A04(parcel, XIGIGBoostDestination.class);
                promoteDataSnapshot.A0A = parcel.readString();
                promoteDataSnapshot.A04 = (XFBCTXWelcomeMessageStatus) AbstractC37304Gc5.A04(parcel, XFBCTXWelcomeMessageStatus.class);
                promoteDataSnapshot.A05 = (XIGIGBoostCallToAction) AbstractC37304Gc5.A04(parcel, XIGIGBoostCallToAction.class);
                promoteDataSnapshot.A06 = (XIGIGBoostCallToAction) AbstractC37304Gc5.A04(parcel, XIGIGBoostCallToAction.class);
                promoteDataSnapshot.A0C = AbstractC37304Gc5.A1X(parcel);
                promoteDataSnapshot.A0B = parcel.readString();
                promoteDataSnapshot.A01 = parcel.readInt();
                promoteDataSnapshot.A00 = parcel.readInt();
                promoteDataSnapshot.A03 = (Estimate) AbstractC37304Gc5.A04(parcel, Estimate.class);
                promoteDataSnapshot.A02 = (Estimate) AbstractC37304Gc5.A04(parcel, Estimate.class);
                PromoteReachEstimationStore promoteReachEstimationStore = (PromoteReachEstimationStore) AbstractC37304Gc5.A04(parcel, Estimate.class);
                if (promoteReachEstimationStore == null) {
                    return promoteDataSnapshot;
                }
                promoteDataSnapshot.A09 = promoteReachEstimationStore;
                List list = promoteDataSnapshot.A0D;
                list.clear();
                AbstractC65702TsY.A0z(parcel, SpecialRequirementCategory.class, list);
                AdCreativeAuthorizationCategory adCreativeAuthorizationCategory = (AdCreativeAuthorizationCategory) AbstractC37304Gc5.A04(parcel, AdCreativeAuthorizationCategory.class);
                if (adCreativeAuthorizationCategory == null) {
                    adCreativeAuthorizationCategory = AdCreativeAuthorizationCategory.A04;
                }
                promoteDataSnapshot.A08 = adCreativeAuthorizationCategory;
                return promoteDataSnapshot;
            case 70:
                C14360o3.A0B(parcel, 0);
                ?? c40791um4 = new C40791um();
                c40791um4.A06 = parcel.readString();
                Parcelable A044 = AbstractC37304Gc5.A04(parcel, PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.class);
                if (A044 != null) {
                    PromoteEnrollCouponInfo.PromoteEnrollCouponStatus promoteEnrollCouponStatus = (PromoteEnrollCouponInfo.PromoteEnrollCouponStatus) A044;
                    C14360o3.A0B(promoteEnrollCouponStatus, 0);
                    c40791um4.A00 = promoteEnrollCouponStatus;
                    c40791um4.A0A = parcel.readString();
                    c40791um4.A09 = parcel.readString();
                    c40791um4.A0B = parcel.readString();
                    c40791um4.A08 = parcel.readString();
                    c40791um4.A04 = (PromoteCouponCurrencyAmount) AbstractC37304Gc5.A04(parcel, PromoteCouponCurrencyAmount.class);
                    c40791um4.A03 = (PromoteCouponCurrencyAmount) AbstractC37304Gc5.A04(parcel, PromoteCouponCurrencyAmount.class);
                    c40791um4.A02 = (PromoteCouponCurrencyAmount) AbstractC37304Gc5.A04(parcel, PromoteCouponCurrencyAmount.class);
                    c40791um4.A01 = (PromoteAdsCouponUseCase) AbstractC37304Gc5.A04(parcel, PromoteAdsCouponUseCase.class);
                    return c40791um4;
                }
                throw AbstractC166997dE.A0g();
            case 71:
                String A0d9 = AbstractC37304Gc5.A0d(parcel);
                if (A0d9 != null) {
                    return PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.valueOf(A0d9);
                }
                throw AbstractC166997dE.A0g();
            case 72:
                C14360o3.A0B(parcel, 0);
                ?? obj8 = new Object();
                obj8.A00 = (ErrorHandlingResponseType) AbstractC37304Gc5.A04(parcel, ErrorHandlingResponseType.class);
                obj8.A03 = parcel.readString();
                obj8.A04 = parcel.readString();
                obj8.A01 = (PromoteErrorLevel) AbstractC37304Gc5.A04(parcel, PromoteErrorLevel.class);
                obj8.A02 = parcel.readString();
                obj8.A05 = parcel.readString();
                return obj8;
            case 73:
                return PromoteErrorLevel.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 74:
                C14360o3.A0B(parcel, 0);
                ?? obj9 = new Object();
                obj9.A00 = (PromoteIntegrityCheckMessage) AbstractC37304Gc5.A04(parcel, PromoteIntegrityCheckMessage.class);
                obj9.A01 = AbstractC37304Gc5.A1X(parcel);
                return obj9;
            case 75:
                C14360o3.A0B(parcel, 0);
                ?? obj10 = new Object();
                obj10.A01 = (TextWithEntities) AbstractC37304Gc5.A04(parcel, TextWithEntities.class);
                obj10.A00 = (PromoteIntegrityCheckMessage.Type) AbstractC37304Gc5.A04(parcel, PromoteIntegrityCheckMessage.Type.class);
                obj10.A02 = parcel.readString();
                obj10.A03 = parcel.readString();
                return obj10;
            case 76:
                return PromoteIntegrityCheckMessage.Type.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 77:
                return PromoteLaunchOrigin.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 78:
                C14360o3.A0B(parcel, 0);
                PromoteReachEstimationStore promoteReachEstimationStore2 = new PromoteReachEstimationStore();
                promoteReachEstimationStore2.A03 = parcel.readString();
                promoteReachEstimationStore2.A02 = parcel.readString();
                promoteReachEstimationStore2.A00 = parcel.readString();
                promoteReachEstimationStore2.A01 = parcel.readString();
                boolean z4 = true;
                promoteReachEstimationStore2.A06 = AbstractC167007dF.A1M(parcel.readByte());
                if (parcel.readByte() == 0) {
                    z4 = false;
                }
                promoteReachEstimationStore2.A07 = z4;
                Map map = promoteReachEstimationStore2.A05;
                C14360o3.A0C(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.Int, com.instagram.api.schemas.Estimate>");
                AbstractMap abstractMap = (AbstractMap) map;
                int readInt17 = parcel.readInt();
                int i16 = 1;
                if (1 <= readInt17) {
                    while (true) {
                        int readInt18 = parcel.readInt();
                        Parcelable A045 = AbstractC37304Gc5.A04(parcel, Estimate.class);
                        Integer valueOf3 = Integer.valueOf(readInt18);
                        C14360o3.A0C(A045, "null cannot be cast to non-null type com.instagram.api.schemas.Estimate");
                        abstractMap.put(valueOf3, A045);
                        if (i16 != readInt17) {
                            i16++;
                        }
                    }
                }
                Map map2 = promoteReachEstimationStore2.A04;
                C14360o3.A0C(map2, "null cannot be cast to non-null type java.util.HashMap<kotlin.Int, com.instagram.api.schemas.Estimate>");
                AbstractMap abstractMap2 = (AbstractMap) map2;
                int readInt19 = parcel.readInt();
                int i17 = 1;
                if (1 > readInt19) {
                    return promoteReachEstimationStore2;
                }
                while (true) {
                    int readInt20 = parcel.readInt();
                    Parcelable A046 = AbstractC37304Gc5.A04(parcel, Estimate.class);
                    Integer valueOf4 = Integer.valueOf(readInt20);
                    C14360o3.A0C(A046, "null cannot be cast to non-null type com.instagram.api.schemas.Estimate");
                    abstractMap2.put(valueOf4, A046);
                    if (i17 == readInt19) {
                        return promoteReachEstimationStore2;
                    }
                    i17++;
                }
            case 79:
                C14360o3.A0B(parcel, 0);
                ?? c40791um5 = new C40791um();
                c40791um5.A00 = AbstractC37304Gc5.A1X(parcel);
                return c40791um5;
            case 80:
                C14360o3.A0B(parcel, 0);
                PromoteState promoteState = new PromoteState();
                boolean z5 = true;
                promoteState.A05 = AbstractC167007dF.A1M(parcel.readByte());
                promoteState.A02 = AbstractC37304Gc5.A1X(parcel);
                promoteState.A06 = AbstractC37304Gc5.A1X(parcel);
                promoteState.A03 = AbstractC37304Gc5.A1X(parcel);
                promoteState.A07 = AbstractC37304Gc5.A1X(parcel);
                promoteState.A00 = AbstractC37304Gc5.A1X(parcel);
                promoteState.A08 = AbstractC37304Gc5.A1X(parcel);
                if (parcel.readByte() == 0) {
                    z5 = false;
                }
                promoteState.A01 = z5;
                return promoteState;
            case 81:
                return PromoteWhatsAppAccountType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 82:
                C14360o3.A0B(parcel, 0);
                ?? obj11 = new Object();
                String valueOf5 = String.valueOf(parcel.readString());
                C14360o3.A0B(valueOf5, 0);
                obj11.A01 = valueOf5;
                Object A0n2 = AbstractC58321PtD.A0n(parcel, Integer.TYPE);
                if (A0n2 instanceof Integer) {
                    num = (Integer) A0n2;
                } else {
                    num = null;
                }
                obj11.A00 = num;
                return obj11;
            case 83:
                C14360o3.A0B(parcel, 0);
                ?? obj12 = new Object();
                String readString31 = parcel.readString();
                if (readString31 != null) {
                    obj12.A00 = readString31;
                    obj12.A02 = AbstractC37304Gc5.A1X(parcel);
                    List createTypedArrayList9 = parcel.createTypedArrayList(RejectionReasonRanges.CREATOR);
                    if (createTypedArrayList9 == null) {
                        createTypedArrayList9 = C16930sl.A00;
                    }
                    obj12.A01 = createTypedArrayList9;
                    return obj12;
                }
                throw AbstractC166997dE.A0g();
            case 84:
                C14360o3.A0B(parcel, 0);
                ?? obj13 = new Object();
                obj13.A01 = parcel.readInt();
                obj13.A00 = parcel.readInt();
                String readString32 = parcel.readString();
                if (readString32 != null) {
                    obj13.A02 = readString32;
                    return obj13;
                }
                throw AbstractC166997dE.A0g();
            case 85:
                return SbgChannelName.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 86:
                C14360o3.A0B(parcel, 0);
                ?? obj14 = new Object();
                Parcelable A047 = AbstractC37304Gc5.A04(parcel, AudienceInterest.class);
                if (A047 != null) {
                    AudienceInterest audienceInterest = (AudienceInterest) A047;
                    C14360o3.A0B(audienceInterest, 0);
                    obj14.A00 = audienceInterest;
                    return obj14;
                }
                throw AbstractC166997dE.A0g();
            case 87:
                String A0d10 = AbstractC37304Gc5.A0d(parcel);
                if (A0d10 != null) {
                    return AbstractC68456VRm.A00(A0d10);
                }
                throw AbstractC166997dE.A0g();
            case 88:
                C14360o3.A0B(parcel, 0);
                ?? obj15 = new Object();
                Parcelable A048 = AbstractC37304Gc5.A04(parcel, AudienceInterest.class);
                if (A048 != null) {
                    AudienceInterest audienceInterest2 = (AudienceInterest) A048;
                    C14360o3.A0B(audienceInterest2, 0);
                    obj15.A00 = audienceInterest2;
                    return obj15;
                }
                throw AbstractC166997dE.A0g();
            case 89:
                C14360o3.A0B(parcel, 0);
                ?? obj16 = new Object();
                String valueOf6 = String.valueOf(parcel.readString());
                C14360o3.A0B(valueOf6, 0);
                obj16.A03 = valueOf6;
                String valueOf7 = String.valueOf(parcel.readString());
                C14360o3.A0B(valueOf7, 0);
                obj16.A05 = valueOf7;
                String valueOf8 = String.valueOf(parcel.readString());
                C14360o3.A0B(valueOf8, 0);
                obj16.A04 = valueOf8;
                Parcelable A049 = AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                if (A049 != null) {
                    ImageUrl imageUrl3 = (ImageUrl) A049;
                    C14360o3.A0B(imageUrl3, 0);
                    obj16.A01 = imageUrl3;
                    Parcelable A0410 = AbstractC37304Gc5.A04(parcel, InstagramPromoteSuggestionReason.class);
                    if (A0410 != null) {
                        InstagramPromoteSuggestionReason instagramPromoteSuggestionReason = (InstagramPromoteSuggestionReason) A0410;
                        C14360o3.A0B(instagramPromoteSuggestionReason, 0);
                        obj16.A00 = instagramPromoteSuggestionReason;
                        obj16.A02 = parcel.readString();
                        return obj16;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            case 90:
                C14360o3.A0B(parcel, 0);
                ?? obj17 = new Object();
                obj17.A07 = String.valueOf(parcel.readString());
                obj17.A03 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                obj17.A04 = parcel.readString();
                obj17.A05 = parcel.readString();
                String readString33 = parcel.readString();
                if (readString33 != null) {
                    VG4 valueOf9 = VG4.valueOf(readString33);
                    C14360o3.A0B(valueOf9, 0);
                    obj17.A02 = valueOf9;
                }
                String valueOf10 = String.valueOf(parcel.readString());
                C14360o3.A0B(valueOf10, 0);
                obj17.A06 = valueOf10;
                return obj17;
            case 91:
                C14360o3.A0B(parcel, 0);
                return new NonSupportedContentSchedulingFeatures(AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 92:
                C14360o3.A0B(parcel, 0);
                ?? obj18 = new Object();
                obj18.A01 = parcel.readString();
                obj18.A02 = parcel.readString();
                obj18.A00 = (ProfilePicture) AbstractC37304Gc5.A04(parcel, ProfilePicture.class);
                return obj18;
            case 93:
                C14360o3.A0B(parcel, 0);
                ?? obj19 = new Object();
                List emptyList = Collections.emptyList();
                C14360o3.A07(emptyList);
                obj19.A00 = emptyList;
                List emptyList2 = Collections.emptyList();
                C14360o3.A07(emptyList2);
                obj19.A01 = emptyList2;
                ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                if (createStringArrayList3 != null) {
                    obj19.A00 = createStringArrayList3;
                    ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
                    if (createStringArrayList4 != null) {
                        obj19.A01 = createStringArrayList4;
                        return obj19;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            case 94:
                C14360o3.A0B(parcel, 0);
                return new ProfilePicture(parcel);
            case 95:
                C14360o3.A0B(parcel, 0);
                ?? obj20 = new Object();
                obj20.A00 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                return obj20;
            case 96:
                ?? obj21 = new Object();
                String readString34 = parcel.readString();
                readString34.getClass();
                obj21.A07 = readString34;
                String readString35 = parcel.readString();
                readString35.getClass();
                obj21.A08 = readString35;
                Parcelable A0411 = AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                A0411.getClass();
                obj21.A02 = (ImageUrl) A0411;
                obj21.A0A = parcel.readString();
                obj21.A03 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                obj21.A00 = (AttributionUser) AbstractC37304Gc5.A04(parcel, AttributionUser.class);
                String readString36 = parcel.readString();
                readString36.getClass();
                obj21.A0B = readString36;
                Parcelable A0412 = AbstractC37304Gc5.A04(parcel, EffectActionSheet.class);
                A0412.getClass();
                obj21.A01 = (EffectActionSheet) A0412;
                obj21.A06 = (ProductAREffectContainer) AbstractC37304Gc5.A04(parcel, ProductAREffectContainer.class);
                obj21.A09 = parcel.readString();
                obj21.A04 = (EnumC223179sw) parcel.readSerializable();
                return obj21;
            case 97:
                C14360o3.A0B(parcel, 0);
                return new CameraEffectFacadeIntf$State((ARAudioEffectData) AbstractC37304Gc5.A04(parcel, CameraEffectFacadeIntf$State.class), AbstractC37304Gc5.A1V(parcel));
            case 98:
                C14360o3.A0B(parcel, 0);
                ?? obj22 = new Object();
                String readString37 = parcel.readString();
                if (readString37 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", readString37);
                    obj22.A00 = C023409i.A0A.A04(bundle);
                    return obj22;
                }
                throw AbstractC166997dE.A0g();
            default:
                C14360o3.A0B(parcel, 0);
                return new AudioPageAssetModel((AudioType) AbstractC37304Gc5.A04(parcel, AudioPageAssetModel.class), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new XIGIGBoostCallToAction[i];
            case 1:
                return new XIGIGBoostDestination[i];
            case 2:
                return new XpostOriginalSoundFBCreatorInfoImpl[i];
            case 3:
                return new ZodiacSign[i];
            case 4:
                return new LoggingData[i];
            case 5:
                return new LoggingFanData[i];
            case 6:
                return new CreatorLoggingData[i];
            case 7:
                return new EffectsPageModel[i];
            case 8:
                return new ArchivePendingUpload[i];
            case 9:
                return new AddAvatarHelper$LoadedImage$LoadedImageMetadata[i];
            case 10:
                return new UpdateProfilePicturePagerAdapter$UpdateProfileTabType[i];
            case 11:
                return new PostLocationModel[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new UserTag[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new UserTagResult[i];
            case 14:
                return new TranscriptionToken[i];
            case Process.SIGTERM /* 15 */:
                return new VoiceRecordingResult[i];
            case 16:
                return new LocationModel[i];
            case 17:
                return new PermalinkTitle$CountdownTitle[i];
            case 18:
                return new PermalinkTitle$Ephemeral24HrTitle[i];
            case Process.SIGSTOP /* 19 */:
                return new PermalinkTitle$SectionTitle[i];
            case 20:
                return new ResultUserInfo[i];
            case 21:
                return new GetApp$Type[i];
            case 22:
                return new IgBloksScreenConfig[i];
            case 23:
                return new AdsEligibilityErrorDataItem[i];
            case 24:
                return new BrandedContentDisclosureArgs[i];
            case 25:
                return new MonetizationProductOnboardingNextStepInfo[i];
            case 26:
                return new BugReportComposerViewModel[i];
            case 27:
                return new BugReport[i];
            case 28:
                return new BoostMediaPickerTabType[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new AdCreativeAuthorizationCategory[i];
            case 30:
                return new BoostFlowType[i];
            case 31:
                return new BoostWebViewAdPreviewFragment$Config[i];
            case 32:
                return new BusinessConversionFlowStatus[i];
            case 33:
                return new BusinessConversionStep[i];
            case 34:
                return new ConversionStep[i];
            case 35:
                return new PageSelectionOverrideData[i];
            case 36:
                return new DataPoint[i];
            case 37:
                return new DaysHourlyFollowersData[i];
            case 38:
                return new FollowersGrowthData[i];
            case 39:
                return new GrowthDataPoint[i];
            case 40:
                return new IGInstantExperiencesParameters[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new BoostGuidanceItemResponse[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new PagePhotoItem[i];
            case 43:
                return new AdsManagerBoostingStatusErrorCode[i];
            case 44:
                return new AdsManagerPaymentAnomalyType[i];
            case 45:
                return new AudienceGender[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new AudienceGeoLocation[i];
            case 47:
                return new AudienceInterest[i];
            case 48:
                return new AudiencePotentialReachRating[i];
            case 49:
                return new BillingWizardName[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new DistanceUnit[i];
            case 51:
                return new ErrorHandlingResponseType[i];
            case 52:
                return new HpiSessionStatus[i];
            case 53:
                return new IGBoostPackage[i];
            case 54:
                return new IGBoostPackagesFlowInfo[i];
            case 55:
                return new InstagramMediaProductType[i];
            case 56:
                return new InstagramPromoteSuggestionReason[i];
            case 57:
                return new LinkingAuthState[i];
            case 58:
                return new PendingLocation[i];
            case 59:
                return new PromoteAdsManagerActionType[i];
            case 60:
                return new PromoteAudience[i];
            case 61:
                return new PromoteAudienceInfo[i];
            case 62:
                return new PromoteAudiencePotentialReach[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new PromoteAudiencePotentialReachStore[i];
            case 64:
                return new PromoteButtonAction[i];
            case 65:
                return new PromoteButtonActionType[i];
            case 66:
                return new PromoteCampaignControlsHeaderViewModel[i];
            case 67:
                return new PromoteCreateAudienceResponse[i];
            case 68:
                return new PromoteData[i];
            case 69:
                return new PromoteDataSnapshot[i];
            case 70:
                return new PromoteEnrollCouponInfo[i];
            case 71:
                return new PromoteEnrollCouponInfo.PromoteEnrollCouponStatus[i];
            case 72:
                return new PromoteErrorHandlingResponse[i];
            case 73:
                return new PromoteErrorLevel[i];
            case 74:
                return new PromoteIntegrityCheckDataModel[i];
            case 75:
                return new PromoteIntegrityCheckMessage[i];
            case 76:
                return new PromoteIntegrityCheckMessage.Type[i];
            case 77:
                return new PromoteLaunchOrigin[i];
            case 78:
                return new PromoteReachEstimationStore[i];
            case 79:
                return new PromoteSaveAudienceEditResponse[i];
            case 80:
                return new PromoteState[i];
            case 81:
                return new PromoteWhatsAppAccountType[i];
            case 82:
                return new PromotionMetric[i];
            case 83:
                return new RejectionReason[i];
            case 84:
                return new RejectionReasonRanges[i];
            case 85:
                return new SbgChannelName[i];
            case 86:
                return new SelectedInterestRowItem[i];
            case 87:
                return new SpecialRequirementCategory[i];
            case 88:
                return new SuggestedInterestRowItem[i];
            case 89:
                return new SuggestedPromotion[i];
            case 90:
                return new PromoteBottomSheetSlideCardViewModel[i];
            case 91:
                return new NonSupportedContentSchedulingFeatures[i];
            case 92:
                return new AttributionUser[i];
            case 93:
                return new EffectActionSheet[i];
            case 94:
                return new ProfilePicture[i];
            case 95:
                return new ThumbnailImage[i];
            case 96:
                return new EffectPreview[i];
            case 97:
                return new CameraEffectFacadeIntf$State[i];
            case 98:
                return new IgFaceTrackerModelsProvider[i];
            default:
                return new AudioPageAssetModel[i];
        }
    }
}
