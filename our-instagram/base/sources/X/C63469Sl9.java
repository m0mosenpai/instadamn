package X;

import X.AbstractC37304Gc5;
import X.C63469Sl9;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.AbsSavedState;
import android.view.View;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.vision.face.internal.client.zza;
import com.google.android.gms.vision.face.internal.client.zzf;
import com.google.android.material.badge.BadgeDrawable$SavedState;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CompositeDateValidator;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ParcelableSparseBooleanArray;
import com.google.android.material.internal.ParcelableSparseIntArray;
import com.google.android.material.navigation.NavigationBarPresenter$SavedState;
import com.google.android.material.slider.BaseSlider$SliderState;
import com.google.android.material.slider.RangeSlider$RangeSliderState;
import com.google.android.material.timepicker.TimeModel;
import com.google.android.play.core.review.ReviewInfo;
import com.google.firebase.iid.zzm;
import com.google.firebase.messaging.RemoteMessage;
import com.google.mlkit.vision.common.internal.VisionImageMetadataParcel;
import com.instagram.aistudio.logging.AiStudioLoggingData;
import com.instagram.aistudio.model.AiAgentShareModel;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerModel;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerPersonaModel;
import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.AchievementButtonAction;
import com.instagram.api.schemas.AchievementButtonInfo;
import com.instagram.api.schemas.AchievementButtonInfoImpl;
import com.instagram.api.schemas.AchievementCategory;
import com.instagram.api.schemas.AchievementDetailsImpl;
import com.instagram.api.schemas.AchievementName;
import com.instagram.api.schemas.AcquisitionExploreCampaignType;
import com.instagram.api.schemas.ActionType;
import com.instagram.api.schemas.ActivityPubUserIngestionStatusStr;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.api.schemas.AdModelType;
import com.instagram.api.schemas.AdproObjectiveTypesEnum;
import com.instagram.api.schemas.AdproRegulatedCategory;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.AdsMessageExtensionType;
import com.instagram.api.schemas.AdsRatingAndReviewDisplayFormat;
import com.instagram.api.schemas.AdsRatingAndReviewStarType;
import com.instagram.api.schemas.AdsTargetingGender;
import com.instagram.api.schemas.AdvantageAudienceDataImpl;
import com.instagram.api.schemas.AfiInterestsRecoStyle;
import com.instagram.api.schemas.AiAgentMetadataDictImpl;
import com.instagram.api.schemas.ApiAdFormats;
import com.instagram.api.schemas.AppColorMode;
import com.instagram.api.schemas.AppInstallCTAInfo;
import com.instagram.api.schemas.AppSwitcherBadgeStatus;
import com.instagram.api.schemas.AppreciationUFIEntryActionType;
import com.instagram.api.schemas.AssetRecommendationType;
import com.instagram.api.schemas.AssetType;
import com.instagram.api.schemas.AudienceList;
import com.instagram.api.schemas.AudienceMessageEntityRangeImpl;
import com.instagram.api.schemas.AudienceValidationActionImpl;
import com.instagram.api.schemas.AudienceValidationActionType;
import com.instagram.api.schemas.AudienceValidationResponse;
import com.instagram.api.schemas.AudienceValidationResponseStatus;
import com.instagram.api.schemas.AudioBrowserCategoryType;
import com.instagram.api.schemas.AudioBrowserCollectionType;
import com.instagram.api.schemas.AudioBrowserPlaylistType;
import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.AudioNoteResponseInfo;
import com.instagram.api.schemas.AutoDubStatus;
import com.instagram.api.schemas.AvatarNoteResponseInfoImpl;
import com.instagram.api.schemas.BCAdsPermissionStatus;
import com.instagram.api.schemas.BCPDealOutputTypeEnum;
import com.instagram.api.schemas.BeneficiaryType;
import com.instagram.api.schemas.BillingWizardName;
import com.instagram.api.schemas.BonusPromoDialogAudienceType;
import com.instagram.api.schemas.BonusPromoDialogType;
import com.instagram.api.schemas.BoostUpsellBannerPayloadSchemaImpl;
import com.instagram.api.schemas.BoostedActionStatus;
import com.instagram.api.schemas.BoostedComponentMessageType;
import com.instagram.api.schemas.BoostedPostAudienceOption;
import com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus;
import com.instagram.api.schemas.BrandedContentGatingCountryMinimumAgeImpl;
import com.instagram.api.schemas.BrandedContentProjectAction;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.BudgetRecommendationType;
import com.instagram.api.schemas.BusinessProfileDictImpl;
import com.instagram.api.schemas.BuyWithIntegrationPostClickExperienceTypes;
import com.instagram.api.schemas.BwPIconOverlayType;
import com.instagram.api.schemas.BwPPostClickLandingExperineceType;
import com.instagram.api.schemas.CTABarActionType;
import com.instagram.api.schemas.CTABarAnimationType;
import com.instagram.api.schemas.CTABarType;
import com.instagram.api.schemas.CachedExternalLoginUserImpl;
import com.instagram.api.schemas.CallAdsInfoDictImpl;
import com.instagram.api.schemas.CallToActionType;
import com.instagram.api.schemas.CaptionTextFontStyle;
import com.instagram.api.schemas.Challenge;
import com.instagram.api.schemas.ChallengeButtonAction;
import com.instagram.api.schemas.ChallengeButtonInfo;
import com.instagram.api.schemas.ChallengeButtonInfoImpl;
import com.instagram.api.schemas.ChallengeDetails;
import com.instagram.api.schemas.ChallengeName;
import com.instagram.api.schemas.ChallengeState;
import com.instagram.api.schemas.ChildCommentPagingDirection;
import com.instagram.api.schemas.EarnedOnMedia;
import com.instagram.api.schemas.EarnedOnMediaState;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.api.schemas.IGAIAgentVisibilityStatus;
import com.instagram.api.schemas.MediaType;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.feed.audio.Audio;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: X.Sl9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63469Sl9 implements Parcelable.Creator {
    public final int A00;

    public C63469Sl9(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r6v79, types: [java.lang.Object, com.google.firebase.messaging.RemoteMessage] */
    /* JADX WARN: Type inference failed for: r6v81, types: [com.google.firebase.iid.zzm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v85, types: [android.view.View$BaseSavedState, com.google.android.material.slider.BaseSlider$SliderState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v86, types: [java.lang.Object, com.google.android.material.navigation.NavigationBarPresenter$SavedState] */
    /* JADX WARN: Type inference failed for: r6v87, types: [com.google.android.material.datepicker.SingleDateSelector, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v94, types: [com.google.android.material.badge.BadgeDrawable$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v97, types: [com.google.android.gms.vision.face.internal.client.zzf, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(final Parcel parcel) {
        Boolean valueOf;
        ArrayList A17;
        InterfaceC65517Tlm interfaceC65517Tlm;
        switch (this.A00) {
            case 0:
                int A00 = AbstractC125725mK.A00(parcel);
                LandmarkParcel[] landmarkParcelArr = null;
                zza[] zzaVarArr = null;
                int i = 0;
                int i2 = 0;
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                float f4 = 0.0f;
                float f5 = Float.MAX_VALUE;
                float f6 = Float.MAX_VALUE;
                float f7 = Float.MAX_VALUE;
                float f8 = 0.0f;
                float f9 = 0.0f;
                float f10 = 0.0f;
                float f11 = -1.0f;
                while (parcel.dataPosition() < A00) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i = AbstractC58321PtD.A0A(parcel, readInt);
                            break;
                        case 2:
                            i2 = AbstractC58321PtD.A0A(parcel, readInt);
                            break;
                        case 3:
                            f = AbstractC58321PtD.A02(parcel, readInt);
                            break;
                        case 4:
                            f2 = AbstractC58321PtD.A02(parcel, readInt);
                            break;
                        case 5:
                            f3 = AbstractC58321PtD.A02(parcel, readInt);
                            break;
                        case 6:
                            f4 = AbstractC58321PtD.A02(parcel, readInt);
                            break;
                        case 7:
                            f5 = AbstractC58321PtD.A02(parcel, readInt);
                            break;
                        case '\b':
                            f6 = AbstractC58321PtD.A02(parcel, readInt);
                            break;
                        case '\t':
                            landmarkParcelArr = (LandmarkParcel[]) AbstractC125725mK.A0J(parcel, LandmarkParcel.CREATOR, readInt);
                            break;
                        case '\n':
                            f8 = AbstractC58321PtD.A02(parcel, readInt);
                            break;
                        case 11:
                            f9 = AbstractC58321PtD.A02(parcel, readInt);
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            f10 = AbstractC58321PtD.A02(parcel, readInt);
                            break;
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                            zzaVarArr = (zza[]) AbstractC125725mK.A0J(parcel, zza.CREATOR, readInt);
                            break;
                        case 14:
                            f7 = AbstractC58321PtD.A02(parcel, readInt);
                            break;
                        case Process.SIGTERM /* 15 */:
                            f11 = AbstractC58321PtD.A02(parcel, readInt);
                            break;
                        default:
                            AbstractC125725mK.A0C(parcel, readInt);
                            break;
                    }
                }
                AbstractC125725mK.A0B(parcel, A00);
                return new FaceParcel(landmarkParcelArr, zzaVarArr, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, i, i2);
            case 1:
                int A002 = AbstractC125725mK.A00(parcel);
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                boolean z = false;
                boolean z2 = false;
                float f12 = -1.0f;
                while (parcel.dataPosition() < A002) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            i3 = AbstractC58321PtD.A0A(parcel, readInt2);
                            break;
                        case 3:
                            i4 = AbstractC58321PtD.A0A(parcel, readInt2);
                            break;
                        case 4:
                            i5 = AbstractC58321PtD.A0A(parcel, readInt2);
                            break;
                        case 5:
                            z = AbstractC125725mK.A0G(parcel, readInt2);
                            break;
                        case 6:
                            z2 = AbstractC125725mK.A0G(parcel, readInt2);
                            break;
                        case 7:
                            f12 = AbstractC58321PtD.A02(parcel, readInt2);
                            break;
                        default:
                            AbstractC125725mK.A0C(parcel, readInt2);
                            break;
                    }
                }
                AbstractC125725mK.A0B(parcel, A002);
                ?? obj = new Object();
                obj.A01 = i3;
                obj.A02 = i4;
                obj.A03 = i5;
                obj.A04 = z;
                obj.A05 = z2;
                obj.A00 = f12;
                return obj;
            case 2:
                int A003 = AbstractC125725mK.A00(parcel);
                float f13 = 0.0f;
                float f14 = 0.0f;
                int i6 = 0;
                int i7 = 0;
                while (parcel.dataPosition() < A003) {
                    int readInt3 = parcel.readInt();
                    char c = (char) readInt3;
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                i7 = AbstractC58323PtF.A05(parcel, c, readInt3, i7);
                            } else {
                                f14 = AbstractC58321PtD.A02(parcel, readInt3);
                            }
                        } else {
                            f13 = AbstractC58321PtD.A02(parcel, readInt3);
                        }
                    } else {
                        i6 = AbstractC58321PtD.A0A(parcel, readInt3);
                    }
                }
                AbstractC125725mK.A0B(parcel, A003);
                return new LandmarkParcel(i6, f13, f14, i7);
            case 3:
                ?? obj2 = new Object();
                obj2.A02 = 255;
                obj2.A0A = -1;
                obj2.A03 = parcel.readInt();
                obj2.A05 = parcel.readInt();
                obj2.A02 = parcel.readInt();
                obj2.A0A = parcel.readInt();
                obj2.A09 = parcel.readInt();
                obj2.A0C = parcel.readString();
                obj2.A07 = parcel.readInt();
                obj2.A04 = parcel.readInt();
                obj2.A08 = parcel.readInt();
                obj2.A0B = parcel.readInt();
                obj2.A00 = parcel.readInt();
                obj2.A01 = parcel.readInt();
                obj2.A0D = AbstractC37304Gc5.A1V(parcel);
                return obj2;
            case 4:
                return new CalendarConstraints((CalendarConstraints.DateValidator) AbstractC37304Gc5.A04(parcel, CalendarConstraints.DateValidator.class), (Month) AbstractC37304Gc5.A04(parcel, Month.class), (Month) AbstractC37304Gc5.A04(parcel, Month.class), (Month) AbstractC37304Gc5.A04(parcel, Month.class));
            case 5:
                ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
                int readInt4 = parcel.readInt();
                if (readInt4 != 2 && readInt4 == 1) {
                    interfaceC65517Tlm = CompositeDateValidator.A03;
                } else {
                    interfaceC65517Tlm = CompositeDateValidator.A02;
                }
                readArrayList.getClass();
                return new CompositeDateValidator(interfaceC65517Tlm, readArrayList);
            case 6:
                return new DateValidatorPointBackward(parcel.readLong());
            case 7:
                return new DateValidatorPointForward(parcel.readLong());
            case 8:
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                calendar.clear();
                calendar.set(1, readInt5);
                calendar.set(2, readInt6);
                return new Month(calendar);
            case 9:
                RangeDateSelector rangeDateSelector = new RangeDateSelector();
                rangeDateSelector.A01 = (Long) AbstractC58321PtD.A0n(parcel, Long.class);
                rangeDateSelector.A00 = (Long) AbstractC58321PtD.A0n(parcel, Long.class);
                return rangeDateSelector;
            case 10:
                ?? obj3 = new Object();
                obj3.A00 = (Long) AbstractC58321PtD.A0n(parcel, Long.class);
                return obj3;
            case 11:
                int readInt7 = parcel.readInt();
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(readInt7);
                int[] iArr = new int[readInt7];
                boolean[] zArr = new boolean[readInt7];
                parcel.readIntArray(iArr);
                parcel.readBooleanArray(zArr);
                for (int i8 = 0; i8 < readInt7; i8++) {
                    sparseBooleanArray.put(iArr[i8], zArr[i8]);
                }
                return sparseBooleanArray;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                int readInt8 = parcel.readInt();
                SparseIntArray sparseIntArray = new SparseIntArray(readInt8);
                int[] iArr2 = new int[readInt8];
                int[] iArr3 = new int[readInt8];
                parcel.readIntArray(iArr2);
                parcel.readIntArray(iArr3);
                for (int i9 = 0; i9 < readInt8; i9++) {
                    sparseIntArray.put(iArr2[i9], iArr3[i9]);
                }
                return sparseIntArray;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                ?? obj4 = new Object();
                obj4.A00 = parcel.readInt();
                obj4.A01 = (ParcelableSparseArray) AbstractC37304Gc5.A04(parcel, obj4.getClass());
                return obj4;
            case 14:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.A01 = parcel.readFloat();
                baseSavedState.A02 = parcel.readFloat();
                ArrayList A1E = AbstractC166987dD.A1E();
                baseSavedState.A03 = A1E;
                parcel.readList(A1E, Float.class.getClassLoader());
                baseSavedState.A00 = parcel.readFloat();
                baseSavedState.A04 = parcel.createBooleanArray()[0];
                return baseSavedState;
            case Process.SIGTERM /* 15 */:
                return new AbsSavedState(parcel) { // from class: com.google.android.material.slider.RangeSlider$RangeSliderState
                    public static final Parcelable.Creator CREATOR = new C63469Sl9(15);
                    public float A00;
                    public int A01;

                    {
                        super(AbstractC37304Gc5.A04(parcel, RangeSlider$RangeSliderState.class));
                        this.A00 = parcel.readFloat();
                        this.A01 = parcel.readInt();
                    }

                    @Override // android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        super.writeToParcel(parcel2, i10);
                        parcel2.writeFloat(this.A00);
                        parcel2.writeInt(this.A01);
                    }
                };
            case 16:
                return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 17:
                return new com.google.android.play.core.review.zza((PendingIntent) AbstractC37304Gc5.A04(parcel, ReviewInfo.class), AbstractC37304Gc5.A1V(parcel));
            case 18:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    ?? obj5 = new Object();
                    obj5.A00 = new Messenger(readStrongBinder);
                    return obj5;
                }
                return null;
            case Process.SIGSTOP /* 19 */:
                int A004 = AbstractC125725mK.A00(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < A004) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 2) {
                        AbstractC125725mK.A0C(parcel, readInt9);
                    } else {
                        bundle = AbstractC125725mK.A02(parcel, readInt9);
                    }
                }
                AbstractC125725mK.A0B(parcel, A004);
                ?? obj6 = new Object();
                obj6.A00 = bundle;
                return obj6;
            case 20:
                int A005 = AbstractC125725mK.A00(parcel);
                long j = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < A005) {
                    int readInt10 = parcel.readInt();
                    char c2 = (char) readInt10;
                    if (c2 != 1) {
                        if (c2 != 2) {
                            if (c2 != 3) {
                                if (c2 != 4) {
                                    i13 = AbstractC58323PtF.A06(parcel, c2, 5, readInt10, i13);
                                } else {
                                    j = AbstractC58322PtE.A0D(parcel, readInt10);
                                }
                            } else {
                                i12 = AbstractC58321PtD.A0A(parcel, readInt10);
                            }
                        } else {
                            i11 = AbstractC58321PtD.A0A(parcel, readInt10);
                        }
                    } else {
                        i10 = AbstractC58321PtD.A0A(parcel, readInt10);
                    }
                }
                AbstractC125725mK.A0B(parcel, A005);
                return new VisionImageMetadataParcel(i10, i11, i12, j, i13);
            case 21:
                return new AiStudioLoggingData((IGAIAgentType) AbstractC37304Gc5.A04(parcel, AiStudioLoggingData.class), AbstractC37304Gc5.A0d(parcel));
            case 22:
                return new AiAgentShareModel((IGAIAgentType) AbstractC37304Gc5.A04(parcel, AiAgentShareModel.class), (IGAIAgentVisibilityStatus) AbstractC37304Gc5.A04(parcel, AiAgentShareModel.class), AbstractC37304Gc5.A0d(parcel));
            case 23:
                return new UtmMetadata(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            case 24:
                String A0d = AbstractC37304Gc5.A0d(parcel);
                int readInt11 = parcel.readInt();
                ArrayList A172 = AbstractC25225BEi.A17(readInt11);
                int i14 = 0;
                while (i14 != readInt11) {
                    i14 = AbstractC37304Gc5.A01(parcel, AiStudioProfileBannerPersonaModel.CREATOR, A172, i14);
                }
                return new AiStudioProfileBannerModel(A0d, A172);
            case 25:
                return new AiStudioProfileBannerPersonaModel(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 26:
                String A0d2 = AbstractC37304Gc5.A0d(parcel);
                long readLong = parcel.readLong();
                String readString = parcel.readString();
                AchievementCategory achievementCategory = (AchievementCategory) AbstractC37304Gc5.A04(parcel, Achievement.class);
                ArrayList arrayList = null;
                if (parcel.readInt() != 0) {
                    int readInt12 = parcel.readInt();
                    arrayList = AbstractC25225BEi.A17(readInt12);
                    for (int i15 = 0; i15 != readInt12; i15++) {
                        AbstractC37304Gc5.A0r(parcel, Achievement.class, arrayList);
                    }
                }
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                EarnedOnMediaState earnedOnMediaState = (EarnedOnMediaState) AbstractC37304Gc5.A04(parcel, Achievement.class);
                String readString7 = parcel.readString();
                AchievementButtonInfo achievementButtonInfo = (AchievementButtonInfo) AbstractC37304Gc5.A04(parcel, Achievement.class);
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                AchievementName achievementName = (AchievementName) AbstractC37304Gc5.A04(parcel, Achievement.class);
                return new Achievement(achievementButtonInfo, (AchievementButtonInfo) AbstractC37304Gc5.A04(parcel, Achievement.class), (AchievementButtonInfo) AbstractC37304Gc5.A04(parcel, Achievement.class), achievementCategory, achievementName, earnedOnMediaState, AbstractC37304Gc5.A0Y(parcel), AbstractC37304Gc5.A0W(parcel), A0d2, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, parcel.readString(), parcel.readString(), parcel.readString(), arrayList, parcel.readInt(), readLong);
            case 27:
                C14360o3.A0B(parcel, 0);
                return AchievementButtonAction.values()[parcel.readInt()];
            case 28:
                C14360o3.A0B(parcel, 0);
                return new AchievementButtonInfoImpl((AchievementButtonAction) AbstractC37304Gc5.A04(parcel, AchievementButtonInfoImpl.class), parcel.readString(), parcel.readString());
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C14360o3.A0B(parcel, 0);
                return AchievementCategory.values()[parcel.readInt()];
            case 30:
                String A0d3 = AbstractC37304Gc5.A0d(parcel);
                AchievementCategory achievementCategory2 = (AchievementCategory) AbstractC37304Gc5.A04(parcel, AchievementDetailsImpl.class);
                ArrayList arrayList2 = null;
                if (parcel.readInt() != 0) {
                    int readInt13 = parcel.readInt();
                    arrayList2 = AbstractC25225BEi.A17(readInt13);
                    for (int i16 = 0; i16 != readInt13; i16++) {
                        AbstractC37304Gc5.A0r(parcel, AchievementDetailsImpl.class, arrayList2);
                    }
                }
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                EarnedOnMedia earnedOnMedia = (EarnedOnMedia) AbstractC37304Gc5.A04(parcel, AchievementDetailsImpl.class);
                String readString12 = parcel.readString();
                int readInt14 = parcel.readInt();
                return new AchievementDetailsImpl((AchievementButtonInfo) AbstractC37304Gc5.A04(parcel, AchievementDetailsImpl.class), (AchievementButtonInfo) AbstractC37304Gc5.A04(parcel, AchievementDetailsImpl.class), achievementCategory2, (AchievementName) AbstractC37304Gc5.A04(parcel, AchievementDetailsImpl.class), earnedOnMedia, AbstractC37304Gc5.A0Y(parcel), AbstractC37304Gc5.A0W(parcel), A0d3, readString10, readString11, readString12, parcel.readString(), parcel.readString(), arrayList2, readInt14);
            case 31:
                C14360o3.A0B(parcel, 0);
                return AchievementName.values()[parcel.readInt()];
            case 32:
                C14360o3.A0B(parcel, 0);
                return AcquisitionExploreCampaignType.values()[parcel.readInt()];
            case 33:
                C14360o3.A0B(parcel, 0);
                return ActionType.values()[parcel.readInt()];
            case 34:
                C14360o3.A0B(parcel, 0);
                return ActivityPubUserIngestionStatusStr.values()[parcel.readInt()];
            case 35:
                C14360o3.A0B(parcel, 0);
                return AdGeoLocationType.values()[parcel.readInt()];
            case 36:
                C14360o3.A0B(parcel, 0);
                return AdModelType.values()[parcel.readInt()];
            case 37:
                C14360o3.A0B(parcel, 0);
                return AdproObjectiveTypesEnum.values()[parcel.readInt()];
            case 38:
                C14360o3.A0B(parcel, 0);
                return AdproRegulatedCategory.values()[parcel.readInt()];
            case 39:
                C14360o3.A0B(parcel, 0);
                return AdsAPIInstagramPosition.values()[parcel.readInt()];
            case 40:
                C14360o3.A0B(parcel, 0);
                return AdsMessageExtensionType.values()[parcel.readInt()];
            case Seq.NULL_REFNUM /* 41 */:
                C14360o3.A0B(parcel, 0);
                return AdsRatingAndReviewDisplayFormat.values()[parcel.readInt()];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C14360o3.A0B(parcel, 0);
                return AdsRatingAndReviewStarType.values()[parcel.readInt()];
            case 43:
                C14360o3.A0B(parcel, 0);
                return AdsTargetingGender.values()[parcel.readInt()];
            case 44:
                C14360o3.A0B(parcel, 0);
                return new AdvantageAudienceDataImpl((XFBTargetingAutomationAdvantageAudienceStatus) AbstractC37304Gc5.A04(parcel, AdvantageAudienceDataImpl.class), AbstractC37304Gc5.A0V(parcel));
            case 45:
                C14360o3.A0B(parcel, 0);
                return AfiInterestsRecoStyle.values()[parcel.readInt()];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new AiAgentMetadataDictImpl((IGAIAgentType) AbstractC37304Gc5.A04(parcel, AiAgentMetadataDictImpl.class), AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 47:
                C14360o3.A0B(parcel, 0);
                return ApiAdFormats.values()[parcel.readInt()];
            case 48:
                C14360o3.A0B(parcel, 0);
                return AppColorMode.values()[parcel.readInt()];
            case 49:
                return new AppInstallCTAInfo(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                C14360o3.A0B(parcel, 0);
                return AppSwitcherBadgeStatus.values()[parcel.readInt()];
            case 51:
                C14360o3.A0B(parcel, 0);
                return AppreciationUFIEntryActionType.values()[parcel.readInt()];
            case 52:
                C14360o3.A0B(parcel, 0);
                return AssetRecommendationType.values()[parcel.readInt()];
            case 53:
                C14360o3.A0B(parcel, 0);
                return AssetType.values()[parcel.readInt()];
            case 54:
                C14360o3.A0B(parcel, 0);
                return new AudienceList(parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 55:
                Integer num = null;
                if (AbstractC37304Gc5.A00(parcel) != 0) {
                    num = AbstractC37304Gc5.A0U(parcel);
                }
                return new AudienceMessageEntityRangeImpl(num, AbstractC37304Gc5.A0W(parcel), parcel.readString());
            case 56:
                C14360o3.A0B(parcel, 0);
                return new AudienceValidationActionImpl((AudienceValidationActionType) AbstractC37304Gc5.A04(parcel, AudienceValidationActionImpl.class), parcel.readString(), parcel.readString());
            case 57:
                C14360o3.A0B(parcel, 0);
                return AudienceValidationActionType.values()[parcel.readInt()];
            case 58:
                ArrayList arrayList3 = null;
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    A17 = null;
                } else {
                    int readInt15 = parcel.readInt();
                    A17 = AbstractC25225BEi.A17(readInt15);
                    for (int i17 = 0; i17 != readInt15; i17++) {
                        AbstractC37304Gc5.A0r(parcel, AudienceValidationResponse.class, A17);
                    }
                }
                String readString13 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt16 = parcel.readInt();
                    arrayList3 = AbstractC25225BEi.A17(readInt16);
                    for (int i18 = 0; i18 != readInt16; i18++) {
                        AbstractC37304Gc5.A0r(parcel, AudienceValidationResponse.class, arrayList3);
                    }
                }
                return new AudienceValidationResponse((AudienceValidationResponseStatus) AbstractC37304Gc5.A04(parcel, AudienceValidationResponse.class), (BoostedComponentMessageType) AbstractC37304Gc5.A04(parcel, AudienceValidationResponse.class), readString13, parcel.readString(), A17, arrayList3);
            case 59:
                C14360o3.A0B(parcel, 0);
                return AudienceValidationResponseStatus.values()[parcel.readInt()];
            case 60:
                C14360o3.A0B(parcel, 0);
                return AudioBrowserCategoryType.values()[parcel.readInt()];
            case 61:
                C14360o3.A0B(parcel, 0);
                return AudioBrowserCollectionType.values()[parcel.readInt()];
            case 62:
                C14360o3.A0B(parcel, 0);
                return AudioBrowserPlaylistType.values()[parcel.readInt()];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                C14360o3.A0B(parcel, 0);
                return new AudioFilterInfo((AudioFilterType) AbstractC37304Gc5.A04(parcel, AudioFilterInfo.class));
            case 64:
                C14360o3.A0B(parcel, 0);
                return new AudioNoteResponseInfo((Audio) AbstractC37304Gc5.A04(parcel, AudioNoteResponseInfo.class), parcel.readString());
            case 65:
                C14360o3.A0B(parcel, 0);
                return AutoDubStatus.values()[parcel.readInt()];
            case 66:
                C14360o3.A0B(parcel, 0);
                return new AvatarNoteResponseInfoImpl((MediaType) AbstractC37304Gc5.A04(parcel, AvatarNoteResponseInfoImpl.class), parcel.readString(), parcel.readString());
            case 67:
                C14360o3.A0B(parcel, 0);
                return BCAdsPermissionStatus.values()[parcel.readInt()];
            case 68:
                C14360o3.A0B(parcel, 0);
                return BCPDealOutputTypeEnum.values()[parcel.readInt()];
            case 69:
                C14360o3.A0B(parcel, 0);
                return BeneficiaryType.values()[parcel.readInt()];
            case 70:
                C14360o3.A0B(parcel, 0);
                return BillingWizardName.values()[parcel.readInt()];
            case 71:
                C14360o3.A0B(parcel, 0);
                return BonusPromoDialogAudienceType.values()[parcel.readInt()];
            case 72:
                C14360o3.A0B(parcel, 0);
                return BonusPromoDialogType.values()[parcel.readInt()];
            case 73:
                return new BoostUpsellBannerPayloadSchemaImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 74:
                C14360o3.A0B(parcel, 0);
                return BoostedActionStatus.values()[parcel.readInt()];
            case 75:
                C14360o3.A0B(parcel, 0);
                return BoostedComponentMessageType.values()[parcel.readInt()];
            case 76:
                C14360o3.A0B(parcel, 0);
                return BoostedPostAudienceOption.values()[parcel.readInt()];
            case 77:
                C14360o3.A0B(parcel, 0);
                return BrandedContentBrandTaggingRequestApprovalStatus.values()[parcel.readInt()];
            case 78:
                return new BrandedContentGatingCountryMinimumAgeImpl(AbstractC37304Gc5.A0d(parcel), AbstractC37304Gc5.A0V(parcel));
            case 79:
                C14360o3.A0B(parcel, 0);
                return BrandedContentProjectAction.values()[parcel.readInt()];
            case 80:
                C14360o3.A0B(parcel, 0);
                BrandedContentProjectAction brandedContentProjectAction = (BrandedContentProjectAction) AbstractC37304Gc5.A04(parcel, BrandedContentProjectMetadata.class);
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new BrandedContentProjectMetadata((BCPDealOutputTypeEnum) AbstractC37304Gc5.A04(parcel, BrandedContentProjectMetadata.class), brandedContentProjectAction, valueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 81:
                C14360o3.A0B(parcel, 0);
                return BudgetRecommendationType.values()[parcel.readInt()];
            case 82:
                return new BusinessProfileDictImpl((ImageUrl) AbstractC37304Gc5.A04(parcel, BusinessProfileDictImpl.class), AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 83:
                C14360o3.A0B(parcel, 0);
                return BuyWithIntegrationPostClickExperienceTypes.values()[parcel.readInt()];
            case 84:
                C14360o3.A0B(parcel, 0);
                return BwPIconOverlayType.values()[parcel.readInt()];
            case 85:
                C14360o3.A0B(parcel, 0);
                return BwPPostClickLandingExperineceType.values()[parcel.readInt()];
            case 86:
                C14360o3.A0B(parcel, 0);
                return CTABarActionType.values()[parcel.readInt()];
            case 87:
                C14360o3.A0B(parcel, 0);
                return CTABarAnimationType.values()[parcel.readInt()];
            case 88:
                C14360o3.A0B(parcel, 0);
                return CTABarType.values()[parcel.readInt()];
            case 89:
                return new CachedExternalLoginUserImpl((ImageUrl) AbstractC37304Gc5.A04(parcel, CachedExternalLoginUserImpl.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 90:
                return new CallAdsInfoDictImpl(AbstractC37304Gc5.A0d(parcel), AbstractC37304Gc5.A1V(parcel));
            case 91:
                C14360o3.A0B(parcel, 0);
                return CallToActionType.values()[parcel.readInt()];
            case 92:
                C14360o3.A0B(parcel, 0);
                return CaptionTextFontStyle.values()[parcel.readInt()];
            case 93:
                String A0d4 = AbstractC37304Gc5.A0d(parcel);
                String readString14 = parcel.readString();
                ChallengeButtonInfo challengeButtonInfo = (ChallengeButtonInfo) AbstractC37304Gc5.A04(parcel, Challenge.class);
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong2 = parcel.readLong();
                ChallengeButtonInfo challengeButtonInfo2 = (ChallengeButtonInfo) AbstractC37304Gc5.A04(parcel, Challenge.class);
                ChallengeButtonInfo challengeButtonInfo3 = (ChallengeButtonInfo) AbstractC37304Gc5.A04(parcel, Challenge.class);
                String readString17 = parcel.readString();
                boolean A1V = AbstractC37304Gc5.A1V(parcel);
                String readString18 = parcel.readString();
                ChallengeButtonInfo challengeButtonInfo4 = (ChallengeButtonInfo) AbstractC37304Gc5.A04(parcel, Challenge.class);
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                String readString22 = parcel.readString();
                Integer A0V = AbstractC37304Gc5.A0V(parcel);
                return new Challenge(challengeButtonInfo, challengeButtonInfo2, challengeButtonInfo3, challengeButtonInfo4, (ChallengeName) AbstractC37304Gc5.A04(parcel, Challenge.class), (ChallengeState) AbstractC37304Gc5.A04(parcel, Challenge.class), A0V, A0d4, readString14, readString15, readString16, readString17, readString18, readString19, readString20, readString21, readString22, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), readLong2, A1V);
            case 94:
                C14360o3.A0B(parcel, 0);
                return ChallengeButtonAction.values()[parcel.readInt()];
            case 95:
                C14360o3.A0B(parcel, 0);
                return new ChallengeButtonInfoImpl((ChallengeButtonAction) AbstractC37304Gc5.A04(parcel, ChallengeButtonInfoImpl.class), parcel.readString(), parcel.readString());
            case 96:
                String A0d5 = AbstractC37304Gc5.A0d(parcel);
                String readString23 = parcel.readString();
                boolean A1V2 = AbstractC37304Gc5.A1V(parcel);
                String readString24 = parcel.readString();
                ChallengeName challengeName = (ChallengeName) AbstractC37304Gc5.A04(parcel, ChallengeDetails.class);
                return new ChallengeDetails((ChallengeButtonInfo) AbstractC37304Gc5.A04(parcel, ChallengeDetails.class), (ChallengeButtonInfo) AbstractC37304Gc5.A04(parcel, ChallengeDetails.class), (ChallengeButtonInfo) AbstractC37304Gc5.A04(parcel, ChallengeDetails.class), challengeName, (ChallengeState) AbstractC37304Gc5.A04(parcel, ChallengeDetails.class), A0d5, readString23, readString24, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), A1V2);
            case 97:
                C14360o3.A0B(parcel, 0);
                return ChallengeName.values()[parcel.readInt()];
            case 98:
                C14360o3.A0B(parcel, 0);
                return ChallengeState.values()[parcel.readInt()];
            default:
                C14360o3.A0B(parcel, 0);
                return ChildCommentPagingDirection.values()[parcel.readInt()];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new FaceParcel[i];
            case 1:
                return new zzf[i];
            case 2:
                return new LandmarkParcel[i];
            case 3:
                return new BadgeDrawable$SavedState[i];
            case 4:
                return new CalendarConstraints[i];
            case 5:
                return new CompositeDateValidator[i];
            case 6:
                return new DateValidatorPointBackward[i];
            case 7:
                return new DateValidatorPointForward[i];
            case 8:
                return new Month[i];
            case 9:
                return new RangeDateSelector[i];
            case 10:
                return new SingleDateSelector[i];
            case 11:
                return new ParcelableSparseBooleanArray[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new ParcelableSparseIntArray[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new NavigationBarPresenter$SavedState[i];
            case 14:
                return new BaseSlider$SliderState[i];
            case Process.SIGTERM /* 15 */:
                return new RangeSlider$RangeSliderState[i];
            case 16:
                return new TimeModel[i];
            case 17:
                return new ReviewInfo[i];
            case 18:
                return new zzm[i];
            case Process.SIGSTOP /* 19 */:
                return new RemoteMessage[i];
            case 20:
                return new VisionImageMetadataParcel[i];
            case 21:
                return new AiStudioLoggingData[i];
            case 22:
                return new AiAgentShareModel[i];
            case 23:
                return new UtmMetadata[i];
            case 24:
                return new AiStudioProfileBannerModel[i];
            case 25:
                return new AiStudioProfileBannerPersonaModel[i];
            case 26:
                return new Achievement[i];
            case 27:
                return new AchievementButtonAction[i];
            case 28:
                return new AchievementButtonInfoImpl[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new AchievementCategory[i];
            case 30:
                return new AchievementDetailsImpl[i];
            case 31:
                return new AchievementName[i];
            case 32:
                return new AcquisitionExploreCampaignType[i];
            case 33:
                return new ActionType[i];
            case 34:
                return new ActivityPubUserIngestionStatusStr[i];
            case 35:
                return new AdGeoLocationType[i];
            case 36:
                return new AdModelType[i];
            case 37:
                return new AdproObjectiveTypesEnum[i];
            case 38:
                return new AdproRegulatedCategory[i];
            case 39:
                return new AdsAPIInstagramPosition[i];
            case 40:
                return new AdsMessageExtensionType[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new AdsRatingAndReviewDisplayFormat[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new AdsRatingAndReviewStarType[i];
            case 43:
                return new AdsTargetingGender[i];
            case 44:
                return new AdvantageAudienceDataImpl[i];
            case 45:
                return new AfiInterestsRecoStyle[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new AiAgentMetadataDictImpl[i];
            case 47:
                return new ApiAdFormats[i];
            case 48:
                return new AppColorMode[i];
            case 49:
                return new AppInstallCTAInfo[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new AppSwitcherBadgeStatus[i];
            case 51:
                return new AppreciationUFIEntryActionType[i];
            case 52:
                return new AssetRecommendationType[i];
            case 53:
                return new AssetType[i];
            case 54:
                return new AudienceList[i];
            case 55:
                return new AudienceMessageEntityRangeImpl[i];
            case 56:
                return new AudienceValidationActionImpl[i];
            case 57:
                return new AudienceValidationActionType[i];
            case 58:
                return new AudienceValidationResponse[i];
            case 59:
                return new AudienceValidationResponseStatus[i];
            case 60:
                return new AudioBrowserCategoryType[i];
            case 61:
                return new AudioBrowserCollectionType[i];
            case 62:
                return new AudioBrowserPlaylistType[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new AudioFilterInfo[i];
            case 64:
                return new AudioNoteResponseInfo[i];
            case 65:
                return new AutoDubStatus[i];
            case 66:
                return new AvatarNoteResponseInfoImpl[i];
            case 67:
                return new BCAdsPermissionStatus[i];
            case 68:
                return new BCPDealOutputTypeEnum[i];
            case 69:
                return new BeneficiaryType[i];
            case 70:
                return new BillingWizardName[i];
            case 71:
                return new BonusPromoDialogAudienceType[i];
            case 72:
                return new BonusPromoDialogType[i];
            case 73:
                return new BoostUpsellBannerPayloadSchemaImpl[i];
            case 74:
                return new BoostedActionStatus[i];
            case 75:
                return new BoostedComponentMessageType[i];
            case 76:
                return new BoostedPostAudienceOption[i];
            case 77:
                return new BrandedContentBrandTaggingRequestApprovalStatus[i];
            case 78:
                return new BrandedContentGatingCountryMinimumAgeImpl[i];
            case 79:
                return new BrandedContentProjectAction[i];
            case 80:
                return new BrandedContentProjectMetadata[i];
            case 81:
                return new BudgetRecommendationType[i];
            case 82:
                return new BusinessProfileDictImpl[i];
            case 83:
                return new BuyWithIntegrationPostClickExperienceTypes[i];
            case 84:
                return new BwPIconOverlayType[i];
            case 85:
                return new BwPPostClickLandingExperineceType[i];
            case 86:
                return new CTABarActionType[i];
            case 87:
                return new CTABarAnimationType[i];
            case 88:
                return new CTABarType[i];
            case 89:
                return new CachedExternalLoginUserImpl[i];
            case 90:
                return new CallAdsInfoDictImpl[i];
            case 91:
                return new CallToActionType[i];
            case 92:
                return new CaptionTextFontStyle[i];
            case 93:
                return new Challenge[i];
            case 94:
                return new ChallengeButtonAction[i];
            case 95:
                return new ChallengeButtonInfoImpl[i];
            case 96:
                return new ChallengeDetails[i];
            case 97:
                return new ChallengeName[i];
            case 98:
                return new ChallengeState[i];
            default:
                return new ChildCommentPagingDirection[i];
        }
    }
}
