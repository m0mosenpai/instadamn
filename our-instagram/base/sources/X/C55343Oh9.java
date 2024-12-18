package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.graphql.enums.EnumHelper;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.gallery.Medium;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.igtv.model.IGTVCreationToolsResponse;
import com.instagram.igtv.model.IGTVViewerLoggingToken;
import com.instagram.igtv.persistence.draft.IGTVBrandedContentTags;
import com.instagram.igtv.uploadflow.common.IGTVUploadProgress;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;
import com.instagram.infocenter.model.InfoCenterFactShareInfo;
import com.instagram.infocenter.model.ShareInfo;
import com.instagram.leadads.model.LeadAdsDisclaimerResponse;
import com.instagram.leadads.model.LeadAdsInputFieldResponse;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.api.LeadGenInfoFieldData;
import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;
import com.instagram.leadgen.core.api.OrganicLeadGenCtaLabel;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import com.instagram.leadgen.core.model.LeadGenConditionalAnswerInfo;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.model.LeadGenProfileContentInfo;
import com.instagram.leadgen.core.model.LeadGenTrustSignal;
import com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimer;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBody;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBodyUrlRanges;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerCheckbox;
import com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData;
import com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy;
import com.instagram.leadgen.organic.model.LeadFormCustomQuestion;
import com.instagram.leadgen.organic.model.LeadGenConsumerFormData;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import com.instagram.location.contextualfeed.intf.LocationContextualFeedConfig;
import com.instagram.location.impl.LocationSignalPackageImpl;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import com.instagram.location.surface.data.LocationPageInfo;
import com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount;
import com.instagram.login.api.TwoFactorInfoConfig;
import com.instagram.login.twofac.model.TotpSeed;
import com.instagram.login.twofac.model.TrustedDevice;
import com.instagram.mainfeed.intentawaread.api.ContextualOrganicInfo;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;
import com.instagram.mediakit.analytics.VisibilitySheetOrigin;
import com.instagram.mediakit.config.MediaKitConfig;
import com.instagram.mediakit.config.MediaKitGalleryFoldersSheetConfig;
import com.instagram.mediakit.config.MediaKitInfoSheetConfig;
import com.instagram.mediakit.config.MediaKitSectionActionSheetConfig;
import com.instagram.mediakit.model.MediaKitInsightType;
import com.instagram.mediakit.model.MediaKitSectionType;
import com.instagram.mediakit.ui.model.MediaKitFolderSheetItemModel;
import com.instagram.mediakit.ui.model.MediaKitInfoSheetItemModel;
import com.instagram.mediakit.ui.model.MediaKitLink;
import com.instagram.model.arads.ArAdsUIModel;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.ProfileAddressData;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.model.comments.ParcelableCommenterDetails;
import com.instagram.model.coupon.PromoteAdsCouponUseCase;
import com.instagram.model.coupon.PromoteCouponCurrencyAmount;
import com.instagram.model.coupon.PromoteCouponType;
import com.instagram.model.direct.DirectIfyXma;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.direct.DirectPendingMusicShare;
import com.instagram.model.direct.DirectRoomsXma;
import com.instagram.model.direct.DirectSearchMetaAIResponse;
import com.instagram.model.direct.DirectSearchPrompt;
import com.instagram.model.direct.DirectSearchResharedContent;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.DirectVisualMessageTarget;
import com.instagram.model.direct.HighlightRange;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem;
import com.instagram.model.direct.stickerstore.StickerPack;
import com.instagram.model.direct.stickerstore.StickerPackResponseItem;
import com.instagram.model.direct.stickerstore.TypedImageUrl;
import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;
import com.instagram.model.direct.threadkey.util.ThreadIdParcelable;
import com.instagram.model.direct.threadkey.util.UnifiedThreadKeyParcelable;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.fundraiser.FundraiserDisplayInfoModel;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagFollowStatus;
import com.instagram.model.hashtag.response.HashtagCollection;
import com.instagram.model.keyword.Keyword;
import com.instagram.model.keyword.KeywordRecommendations;
import com.instagram.model.mapquery.MapQuery;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.payments.CurrencyAmountInfoImpl;
import com.instagram.model.payments.DeliveryWindowInfoImpl;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.model.payments.common.ProductItem;
import com.instagram.model.reels.ReelViewerContextButtonType;
import com.instagram.model.reels.StoryWedgingType;
import com.instagram.model.reels.netego.BloksStoryNetegoCTAStyle;
import com.instagram.model.reels.netego.ShoppingNetegoInStoryIconType;
import com.instagram.model.reels.netego.ShoppingNetegoInStorySuggestionType;
import com.instagram.model.reels.netego.ShoppingNetegoType;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.model.shopping.video.ShoppingCreationConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import go.Seq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Oh9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55343Oh9 implements Parcelable.Creator {
    public final int A00;

    public C55343Oh9(int i) {
        this.A00 = i;
    }

    public static C55343Oh9 A00(int i) {
        return new C55343Oh9(i);
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [com.instagram.model.direct.DirectThreadKey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [com.instagram.model.keyword.KeywordRecommendations, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [com.instagram.model.hashtag.response.HashtagCollection, java.lang.Object, X.1um] */
    /* JADX WARN: Type inference failed for: r7v17, types: [com.instagram.model.fbusertag.FBUserTag$FBUserInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, com.instagram.model.effect.AttributedAREffect] */
    /* JADX WARN: Type inference failed for: r7v28, types: [com.instagram.model.direct.HighlightRange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v29, types: [com.instagram.model.direct.DirectVisualMessageTarget, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, com.instagram.model.direct.DirectSearchResharedContent] */
    /* JADX WARN: Type inference failed for: r7v33, types: [com.instagram.model.direct.DirectSearchMetaAIResponse, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v35, types: [com.instagram.model.direct.DirectPendingMusicShare, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Object, com.instagram.model.direct.DirectMessageSearchThread] */
    /* JADX WARN: Type inference failed for: r7v38, types: [com.instagram.model.direct.DirectMessageSearchMessage, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v42, types: [com.instagram.model.coupon.PromoteCouponCurrencyAmount, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v45, types: [com.instagram.model.business.PublicPhoneContact, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v47, types: [com.instagram.model.business.BusinessInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, com.instagram.model.business.Address] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, com.instagram.model.payments.common.ProductItem] */
    /* JADX WARN: Type inference failed for: r7v61, types: [java.lang.Object, com.instagram.mainfeed.intentawaread.api.ContextualOrganicInfo] */
    /* JADX WARN: Type inference failed for: r7v62, types: [java.lang.Object, com.instagram.login.twofac.model.TrustedDevice] */
    /* JADX WARN: Type inference failed for: r7v63, types: [com.instagram.login.twofac.model.TotpSeed, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v65, types: [com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v67, types: [com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v68, types: [com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour, java.lang.Object, X.1um] */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.instagram.model.payments.checkout.CheckoutLaunchParams, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v90, types: [java.lang.Object, com.instagram.leadads.model.LeadAdsInputFieldResponse] */
    /* JADX WARN: Type inference failed for: r7v91, types: [java.lang.Object, com.instagram.leadads.model.LeadAdsDisclaimerResponse] */
    /* JADX WARN: Type inference failed for: r7v92, types: [java.lang.Object, com.instagram.infocenter.model.ShareInfo] */
    /* JADX WARN: Type inference failed for: r7v93, types: [com.instagram.infocenter.model.InfoCenterFactShareInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v94, types: [com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v97, types: [com.instagram.igtv.model.IGTVViewerLoggingToken, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v98, types: [com.instagram.igtv.model.IGTVCreationToolsResponse, java.lang.Object, X.1um] */
    /* JADX WARN: Type inference failed for: r7v99, types: [android.view.View$BaseSavedState, com.instagram.igds.components.form.IgFormField$SavedState, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        EnumC77213d7 enumC77213d7;
        Object obj;
        InterfaceC83733oI c83693oE;
        Double valueOf;
        Boolean valueOf2;
        Object createFromParcel;
        EnumC50680MYy enumC50680MYy;
        Long valueOf3;
        Float valueOf4;
        Integer num;
        Object createFromParcel2;
        Object createFromParcel3;
        Object createFromParcel4;
        Object createFromParcel5;
        Object createFromParcel6;
        Boolean valueOf5;
        VG1 valueOf6;
        switch (this.A00) {
            case 0:
                return new HashtagContextualFeedConfig(parcel);
            case 1:
                C14360o3.A0B(parcel, 0);
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.A00 = parcel.readInt();
                return baseSavedState;
            case 2:
                C14360o3.A0B(parcel, 0);
                ?? c40791um = new C40791um();
                Parcelable A04 = AbstractC37304Gc5.A04(parcel, ShoppingCreationConfig.class);
                C14360o3.A0A(A04);
                c40791um.A00 = (ShoppingCreationConfig) A04;
                return c40791um;
            case 3:
                ?? obj2 = new Object();
                obj2.A03 = parcel.readString();
                obj2.A05 = parcel.readString();
                obj2.A02 = parcel.readString();
                obj2.A04 = parcel.readString();
                obj2.A01 = parcel.readInt();
                obj2.A00 = parcel.readInt();
                return obj2;
            case 4:
                C14360o3.A0B(parcel, 0);
                parcel.readInt();
                return new Object();
            case 5:
                C14360o3.A0B(parcel, 0);
                return new IGTVUploadProgress(parcel);
            case 6:
                C14360o3.A0B(parcel, 0);
                ?? obj3 = new Object();
                String readString = parcel.readString();
                C14360o3.A0A(readString);
                C14360o3.A0B(readString, 0);
                obj3.A02 = readString;
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                if (createStringArrayList == null) {
                    createStringArrayList = AbstractC166987dD.A1E();
                }
                obj3.A03 = createStringArrayList;
                obj3.A01 = parcel.readString();
                return obj3;
            case 7:
                ?? obj4 = new Object();
                obj4.A00 = C05F.A01;
                obj4.A00 = AbstractC47054KrB.A00(parcel.readString());
                obj4.A0A = parcel.readString();
                obj4.A02 = parcel.readString();
                obj4.A0G = parcel.readString();
                obj4.A0F = parcel.readString();
                obj4.A0D = parcel.readString();
                obj4.A0E = parcel.readString();
                obj4.A0C = parcel.readString();
                obj4.A04 = parcel.readString();
                obj4.A05 = parcel.readString();
                obj4.A03 = parcel.readString();
                obj4.A0I = parcel.readString();
                obj4.A0J = parcel.readString();
                obj4.A0H = parcel.readString();
                obj4.A0B = parcel.readString();
                obj4.A07 = parcel.readString();
                obj4.A06 = parcel.readString();
                obj4.A09 = parcel.readString();
                obj4.A01 = parcel.readString();
                obj4.A08 = parcel.readString();
                return obj4;
            case 8:
                ?? obj5 = new Object();
                Integer num2 = C05F.A00;
                obj5.A05 = num2;
                obj5.A04 = num2;
                obj5.A05 = AbstractC47054KrB.A00(parcel.readString());
                obj5.A0D = AbstractC43593JPy.A1Y(parcel.readInt());
                obj5.A0A = parcel.readString();
                obj5.A08 = parcel.readString();
                obj5.A09 = parcel.readString();
                obj5.A06 = parcel.readString();
                obj5.A07 = parcel.readString();
                List<String> A1E = AbstractC166987dD.A1E();
                obj5.A0B = A1E;
                parcel.readStringList(A1E);
                List<String> A1E2 = AbstractC166987dD.A1E();
                obj5.A0C = A1E2;
                parcel.readStringList(A1E2);
                obj5.A04 = AbstractC47052Kr9.A00(parcel.readString());
                obj5.A00 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                obj5.A01 = (ExtendedImageUrl) AbstractC37304Gc5.A04(parcel, ExtendedImageUrl.class);
                obj5.A02 = (ExtendedImageUrl) AbstractC37304Gc5.A04(parcel, ExtendedImageUrl.class);
                obj5.A03 = (ExtendedImageUrl) AbstractC37304Gc5.A04(parcel, ExtendedImageUrl.class);
                return obj5;
            case 9:
                String A0d = AbstractC37304Gc5.A0d(parcel);
                boolean A1V = AbstractC37304Gc5.A1V(parcel);
                ?? obj6 = new Object();
                obj6.A00 = A0d;
                obj6.A01 = A1V;
                return obj6;
            case 10:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = VG1.valueOf(parcel.readString());
                }
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                ?? obj7 = new Object();
                obj7.A00 = valueOf6;
                obj7.A03 = readString2;
                obj7.A02 = readString3;
                obj7.A01 = readString4;
                return obj7;
            case 11:
                C14360o3.A0B(parcel, 0);
                ImageUrl imageUrl = (ImageUrl) AbstractC37304Gc5.A04(parcel, LeadForm.class);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList A17 = AbstractC25225BEi.A17(readInt);
                boolean z = false;
                int i = 0;
                while (i != readInt) {
                    i = AbstractC37304Gc5.A01(parcel, LeadGenInfoFieldData.CREATOR, A17, i);
                }
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    valueOf5 = Boolean.valueOf(z);
                }
                return new LeadForm(imageUrl, valueOf5, readString5, readString6, parcel.readString(), A17);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(parcel, 0);
                return new LeadGenInfoFieldData(parcel.readString(), parcel.createStringArrayList(), AbstractC37304Gc5.A1V(parcel));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(parcel, 0);
                return LeadGenInfoFieldTypes.values()[parcel.readInt()];
            case 14:
                C14360o3.A0B(parcel, 0);
                return OrganicLeadGenCtaLabel.values()[parcel.readInt()];
            case Process.SIGTERM /* 15 */:
                C14360o3.A0B(parcel, 0);
                XIGIGBoostCallToAction xIGIGBoostCallToAction = (XIGIGBoostCallToAction) AbstractC37304Gc5.A04(parcel, LeadGenBaseFormList.class);
                LeadForm leadForm = (LeadForm) AbstractC37304Gc5.A04(parcel, LeadGenBaseFormList.class);
                int readInt2 = parcel.readInt();
                ArrayList A172 = AbstractC25225BEi.A17(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    AbstractC37304Gc5.A0r(parcel, LeadGenBaseFormList.class, A172);
                }
                return new LeadGenBaseFormList(xIGIGBoostCallToAction, leadForm, parcel.readString(), parcel.readString(), A172, AbstractC37304Gc5.A1V(parcel));
            case 16:
                C14360o3.A0B(parcel, 0);
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                int readInt3 = parcel.readInt();
                LinkedHashMap A18 = AbstractC25225BEi.A18(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    A18.put(parcel.readString(), LeadGenConditionalAnswerInfo.CREATOR.createFromParcel(parcel));
                }
                return new LeadGenConditionalAnswerInfo(createStringArrayList2, A18);
            case 17:
                String A0d2 = AbstractC37304Gc5.A0d(parcel);
                String readString7 = parcel.readString();
                VEF valueOf7 = VEF.valueOf(parcel.readString());
                ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                Integer A0V = AbstractC37304Gc5.A0V(parcel);
                ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean A1V2 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V3 = AbstractC37304Gc5.A1V(parcel);
                int readInt4 = parcel.readInt();
                LinkedHashMap A182 = AbstractC25225BEi.A18(readInt4);
                for (int i4 = 0; i4 != readInt4; i4++) {
                    A182.put(parcel.readString(), LeadGenConditionalAnswerInfo.CREATOR.createFromParcel(parcel));
                }
                boolean A1V4 = AbstractC37304Gc5.A1V(parcel);
                return new LeadGenFormBaseQuestion(valueOf7, A0V, A0d2, readString7, readString8, readString9, readString10, readString11, parcel.readString(), parcel.readString(), parcel.readString(), createStringArrayList3, createStringArrayList4, parcel.createStringArrayList(), parcel.createStringArrayList(), A182, parcel.readInt(), A1V2, A1V3, A1V4, AbstractC37304Gc5.A1V(parcel));
            case 18:
                String A0d3 = AbstractC37304Gc5.A0d(parcel);
                ImageUrl imageUrl2 = (ImageUrl) AbstractC37304Gc5.A04(parcel, LeadGenProfileContentInfo.class);
                if (parcel.readInt() == 0) {
                    createFromParcel6 = null;
                } else {
                    createFromParcel6 = LeadGenTrustSignalsPayload.CREATOR.createFromParcel(parcel);
                }
                return new LeadGenProfileContentInfo(imageUrl2, (LeadGenTrustSignalsPayload) createFromParcel6, A0d3);
            case Process.SIGSTOP /* 19 */:
                return new LeadGenTrustSignal(EnumC53274NhC.valueOf(AbstractC37304Gc5.A0d(parcel)), parcel.readString(), parcel.readInt());
            case 20:
                String A0d4 = AbstractC37304Gc5.A0d(parcel);
                String readString12 = parcel.readString();
                if (readString12.equals("INSTAGRAM")) {
                    num = C05F.A00;
                } else if (readString12.equals("FACEBOOK")) {
                    num = C05F.A01;
                } else if (readString12.equals("UNKNOWN")) {
                    num = C05F.A0C;
                } else {
                    throw AbstractC166987dD.A12(readString12);
                }
                Object obj8 = null;
                if (parcel.readInt() == 0) {
                    createFromParcel2 = null;
                } else {
                    createFromParcel2 = LeadGenTrustSignal.CREATOR.createFromParcel(parcel);
                }
                LeadGenTrustSignal leadGenTrustSignal = (LeadGenTrustSignal) createFromParcel2;
                if (parcel.readInt() == 0) {
                    createFromParcel3 = null;
                } else {
                    createFromParcel3 = LeadGenTrustSignal.CREATOR.createFromParcel(parcel);
                }
                LeadGenTrustSignal leadGenTrustSignal2 = (LeadGenTrustSignal) createFromParcel3;
                if (parcel.readInt() == 0) {
                    createFromParcel4 = null;
                } else {
                    createFromParcel4 = LeadGenTrustSignal.CREATOR.createFromParcel(parcel);
                }
                LeadGenTrustSignal leadGenTrustSignal3 = (LeadGenTrustSignal) createFromParcel4;
                if (parcel.readInt() == 0) {
                    createFromParcel5 = null;
                } else {
                    createFromParcel5 = LeadGenTrustSignal.CREATOR.createFromParcel(parcel);
                }
                LeadGenTrustSignal leadGenTrustSignal4 = (LeadGenTrustSignal) createFromParcel5;
                if (parcel.readInt() != 0) {
                    obj8 = LeadGenTrustSignal.CREATOR.createFromParcel(parcel);
                }
                LeadGenTrustSignal leadGenTrustSignal5 = (LeadGenTrustSignal) obj8;
                int readInt5 = parcel.readInt();
                ArrayList A173 = AbstractC25225BEi.A17(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = AbstractC37304Gc5.A01(parcel, LeadGenTrustSignal.CREATOR, A173, i5);
                }
                return new LeadGenTrustSignalsPayload(leadGenTrustSignal, leadGenTrustSignal2, leadGenTrustSignal3, leadGenTrustSignal4, leadGenTrustSignal5, num, A0d4, A173);
            case 21:
                String A0d5 = AbstractC37304Gc5.A0d(parcel);
                LeadGenCustomDisclaimerBody leadGenCustomDisclaimerBody = (LeadGenCustomDisclaimerBody) LeadGenCustomDisclaimerBody.CREATOR.createFromParcel(parcel);
                int readInt6 = parcel.readInt();
                ArrayList A174 = AbstractC25225BEi.A17(readInt6);
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = AbstractC37304Gc5.A01(parcel, LeadGenCustomDisclaimerCheckbox.CREATOR, A174, i6);
                }
                return new LeadGenCustomDisclaimer(leadGenCustomDisclaimerBody, A0d5, A174);
            case 22:
                String A0d6 = AbstractC37304Gc5.A0d(parcel);
                int readInt7 = parcel.readInt();
                ArrayList A175 = AbstractC25225BEi.A17(readInt7);
                int i7 = 0;
                while (i7 != readInt7) {
                    i7 = AbstractC37304Gc5.A01(parcel, LeadGenCustomDisclaimerBodyUrlRanges.CREATOR, A175, i7);
                }
                return new LeadGenCustomDisclaimerBody(A0d6, A175);
            case 23:
                return new LeadGenCustomDisclaimerBodyUrlRanges(AbstractC37304Gc5.A00(parcel), parcel.readInt(), parcel.readString());
            case 24:
                String A0d7 = AbstractC37304Gc5.A0d(parcel);
                String readString13 = parcel.readString();
                boolean z2 = true;
                boolean A1M = AbstractC167007dF.A1M(parcel.readInt());
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new LeadGenCustomDisclaimerCheckbox(A0d7, readString13, A1M, z2);
            case 25:
                return new LeadGenDisqualifyingScreenData(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            case 26:
                return new LeadGenPrivacyPolicy(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 27:
                return new LeadFormCustomQuestion(EnumC53203Nfz.valueOf(parcel.readString()), AbstractC37304Gc5.A0d(parcel), parcel.createStringArrayList());
            case 28:
                String A0d8 = AbstractC37304Gc5.A0d(parcel);
                String readString14 = parcel.readString();
                long readLong = parcel.readLong();
                String readString15 = parcel.readString();
                ImageUrl imageUrl3 = (ImageUrl) AbstractC37304Gc5.A04(parcel, LeadGenConsumerFormData.class);
                int readInt8 = parcel.readInt();
                String readString16 = parcel.readString();
                boolean A1M2 = AbstractC167007dF.A1M(parcel.readInt());
                boolean A1V5 = AbstractC37304Gc5.A1V(parcel);
                String readString17 = parcel.readString();
                ImageUrl imageUrl4 = (ImageUrl) AbstractC37304Gc5.A04(parcel, LeadGenConsumerFormData.class);
                int readInt9 = parcel.readInt();
                ArrayList A176 = AbstractC25225BEi.A17(readInt9);
                for (int i8 = 0; i8 != readInt9; i8++) {
                    AbstractC37304Gc5.A0r(parcel, LeadGenConsumerFormData.class, A176);
                }
                return new LeadGenConsumerFormData(imageUrl3, imageUrl4, (LeadGenFormBaseQuestion) AbstractC37304Gc5.A04(parcel, LeadGenConsumerFormData.class), (LeadGenPrivacyPolicy) AbstractC37304Gc5.A04(parcel, LeadGenConsumerFormData.class), A0d8, readString14, readString15, readString16, readString17, A176, readInt8, readLong, A1M2, A1V5);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                EnumC53251Ngp valueOf8 = EnumC53251Ngp.valueOf(AbstractC37304Gc5.A0d(parcel));
                String readString18 = parcel.readString();
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                ImageUrl imageUrl5 = (ImageUrl) AbstractC37304Gc5.A04(parcel, LeadGenFormData.class);
                int i9 = 0;
                boolean A1M3 = AbstractC167007dF.A1M(parcel.readInt());
                boolean A1V6 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V7 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V8 = AbstractC37304Gc5.A1V(parcel);
                int readInt10 = parcel.readInt();
                ArrayList A177 = AbstractC25225BEi.A17(readInt10);
                while (i9 != readInt10) {
                    i9 = AbstractC37304Gc5.A01(parcel, LeadFormCustomQuestion.CREATOR, A177, i9);
                }
                return new LeadGenFormData(imageUrl5, valueOf8, readString18, readString19, readString20, readString21, A177, A1M3, A1V6, A1V7, A1V8);
            case 30:
                return new LocationContextualFeedConfig(parcel);
            case 31:
                return new LocationSignalPackageImpl((C202098wp) AbstractC37304Gc5.A04(parcel, C202098wp.class));
            case 32:
                ?? c40791um2 = new C40791um();
                c40791um2.A00 = parcel.readString();
                List<String> A1E3 = AbstractC166987dD.A1E();
                c40791um2.A01 = A1E3;
                parcel.readStringList(A1E3);
                return c40791um2;
            case 33:
                ?? obj9 = new Object();
                obj9.A03 = parcel.readString();
                List A1E4 = AbstractC166987dD.A1E();
                obj9.A04 = A1E4;
                parcel.readList(A1E4, LocationPageInfoPageOperationHour.class.getClassLoader());
                obj9.A01 = parcel.readString();
                obj9.A02 = parcel.readString();
                obj9.A00 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                return obj9;
            case 34:
                C14360o3.A0B(parcel, 0);
                return new LocationPageInfo(parcel);
            case 35:
                ?? obj10 = new Object();
                obj10.A02 = parcel.readString();
                obj10.A03 = parcel.readString();
                obj10.A00 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                obj10.A01 = parcel.readString();
                return obj10;
            case 36:
                return new TwoFactorInfoConfig(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 37:
                ?? obj11 = new Object();
                obj11.A02 = parcel.readString();
                obj11.A00 = parcel.readString();
                obj11.A01 = parcel.readString();
                return obj11;
            case 38:
                ?? obj12 = new Object();
                obj12.A04 = parcel.readString();
                obj12.A05 = parcel.readString();
                obj12.A06 = parcel.readString();
                obj12.A07 = parcel.readString();
                obj12.A02 = parcel.readLong();
                obj12.A00 = parcel.readDouble();
                obj12.A01 = parcel.readDouble();
                obj12.A09 = AbstractC43593JPy.A1Y(parcel.readInt());
                obj12.A08 = parcel.readString();
                return obj12;
            case 39:
                String A0d9 = AbstractC37304Gc5.A0d(parcel);
                String readString22 = parcel.readString();
                ?? obj13 = new Object();
                obj13.A01 = A0d9;
                obj13.A00 = readString22;
                return obj13;
            case 40:
                return MediaKitEntryPoint.valueOf(AbstractC37304Gc5.A0d(parcel));
            case Seq.NULL_REFNUM /* 41 */:
                return VisibilitySheetOrigin.valueOf(AbstractC37304Gc5.A0d(parcel));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new MediaKitConfig((MediaKitEntryPoint) AbstractC37304Gc5.A04(parcel, MediaKitConfig.class), AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 43:
                int A00 = AbstractC37304Gc5.A00(parcel);
                ArrayList A178 = AbstractC25225BEi.A17(A00);
                for (int i10 = 0; i10 != A00; i10++) {
                    AbstractC37304Gc5.A0r(parcel, MediaKitGalleryFoldersSheetConfig.class, A178);
                }
                return new MediaKitGalleryFoldersSheetConfig(A178);
            case 44:
                C14360o3.A0B(parcel, 0);
                MediaKitInfoSheetConfig mediaKitInfoSheetConfig = MediaKitInfoSheetConfig.A0D;
                return new MediaKitInfoSheetConfig(AbstractC37304Gc5.A0V(parcel));
            case 45:
                return new MediaKitSectionActionSheetConfig(AbstractC37304Gc5.A0d(parcel));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C14360o3.A0B(parcel, 0);
                return MediaKitInsightType.values()[parcel.readInt()];
            case 47:
                C14360o3.A0B(parcel, 0);
                return MediaKitSectionType.values()[parcel.readInt()];
            case 48:
                return new MediaKitFolderSheetItemModel((Medium) AbstractC37304Gc5.A04(parcel, MediaKitFolderSheetItemModel.class), parcel.readString(), (InterfaceC16660sJ) parcel.readSerializable(), AbstractC37304Gc5.A00(parcel));
            case 49:
                Integer num3 = null;
                if (AbstractC37304Gc5.A00(parcel) != 0) {
                    num3 = Integer.valueOf(parcel.readInt());
                }
                return new MediaKitInfoSheetItemModel(num3, AbstractC37304Gc5.A0X(parcel), AbstractC37304Gc5.A0W(parcel));
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new MediaKitLink((InterfaceC16820sZ) parcel.readSerializable(), AbstractC37304Gc5.A00(parcel));
            case 51:
                return new ArAdsUIModel(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 52:
                C14360o3.A0B(parcel, 0);
                ?? obj14 = new Object();
                obj14.A03 = parcel.readString();
                obj14.A04 = parcel.readString();
                obj14.A01 = parcel.readString();
                obj14.A00 = parcel.readString();
                obj14.A02 = parcel.readString();
                return obj14;
            case 53:
                ?? obj15 = new Object();
                obj15.A09 = parcel.readString();
                obj15.A0A = parcel.readString();
                obj15.A0B = parcel.readString();
                obj15.A01 = (PublicPhoneContact) AbstractC37304Gc5.A04(parcel, PublicPhoneContact.class);
                obj15.A0J = parcel.readString();
                obj15.A0L = parcel.readString();
                obj15.A00 = (Address) AbstractC37304Gc5.A04(parcel, Address.class);
                obj15.A0M = parcel.readArrayList(ProfileAddressData.class.getClassLoader());
                obj15.A0K = parcel.readString();
                obj15.A05 = parcel.readString();
                obj15.A04 = parcel.readString();
                obj15.A06 = parcel.readString();
                obj15.A07 = parcel.readString();
                obj15.A08 = parcel.readString();
                obj15.A0C = parcel.readString();
                obj15.A0D = parcel.readString();
                obj15.A0E = parcel.readString();
                obj15.A0F = parcel.readString();
                boolean z3 = true;
                obj15.A0N = AbstractC167007dF.A1M(parcel.readByte());
                obj15.A0Q = AbstractC37304Gc5.A1X(parcel);
                obj15.A0S = AbstractC37304Gc5.A1X(parcel);
                obj15.A0R = AbstractC37304Gc5.A1X(parcel);
                obj15.A0O = AbstractC37304Gc5.A1X(parcel);
                if (parcel.readByte() == 0) {
                    z3 = false;
                }
                obj15.A0P = z3;
                String readString23 = parcel.readString();
                if (readString23 != null) {
                    obj15.A02 = C16Z.A00(Integer.parseInt(readString23));
                }
                String readString24 = parcel.readString();
                if (readString24 != null) {
                    obj15.A03 = C16Z.A00(Integer.parseInt(readString24));
                }
                obj15.A0G = parcel.readString();
                obj15.A0I = parcel.readString();
                obj15.A0H = parcel.readString();
                return obj15;
            case 54:
                String A0d10 = AbstractC37304Gc5.A0d(parcel);
                String readString25 = parcel.readString();
                String readString26 = parcel.readString();
                String readString27 = parcel.readString();
                String readString28 = parcel.readString();
                Float f = null;
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Float.valueOf(parcel.readFloat());
                }
                if (parcel.readInt() != 0) {
                    f = Float.valueOf(parcel.readFloat());
                }
                return new ProfileAddressData(valueOf4, f, A0d10, readString25, readString26, readString27, readString28, parcel.readString());
            case 55:
                C14360o3.A0B(parcel, 0);
                ?? obj16 = new Object();
                obj16.A03 = parcel.readString();
                obj16.A00 = parcel.readString();
                obj16.A01 = parcel.readString();
                obj16.A02 = parcel.readString();
                return obj16;
            case 56:
                C14360o3.A0B(parcel, 0);
                return new ParcelableCommenterDetails(parcel);
            case 57:
                String A0d11 = AbstractC37304Gc5.A0d(parcel);
                if (A0d11 != null) {
                    return PromoteAdsCouponUseCase.valueOf(A0d11);
                }
                throw AbstractC166997dE.A0g();
            case 58:
                C14360o3.A0B(parcel, 0);
                ?? obj17 = new Object();
                String readString29 = parcel.readString();
                if (readString29 != null) {
                    obj17.A02 = readString29;
                    String readString30 = parcel.readString();
                    if (readString30 != null) {
                        obj17.A03 = readString30;
                        obj17.A00 = parcel.readInt();
                        obj17.A01 = parcel.readInt();
                        return obj17;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 59:
                String A0d12 = AbstractC37304Gc5.A0d(parcel);
                if (A0d12 != null) {
                    if (A0d12.equals("RECREATE_MIN_SPEND_X_TO_GET_Y")) {
                        return PromoteCouponType.A04;
                    }
                    return PromoteCouponType.A03;
                }
                throw AbstractC166997dE.A0g();
            case 60:
                C14360o3.A0B(parcel, 0);
                long readLong2 = parcel.readLong();
                EnumC33381EpE enumC33381EpE = null;
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(parcel.readLong());
                }
                String readString31 = parcel.readString();
                if (parcel.readInt() != 0) {
                    enumC33381EpE = EnumC33381EpE.valueOf(parcel.readString());
                }
                return new DirectIfyXma(enumC33381EpE, valueOf3, readString31, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), readLong2);
            case 61:
                C14360o3.A0B(parcel, 0);
                ?? obj18 = new Object();
                String readString32 = parcel.readString();
                if (readString32 != null) {
                    obj18.A07 = readString32;
                    String readString33 = parcel.readString();
                    if (readString33 != null) {
                        obj18.A08 = readString33;
                        String readString34 = parcel.readString();
                        if (readString34 != null) {
                            obj18.A0B = readString34;
                            Parcelable A042 = AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                            if (A042 != null) {
                                obj18.A05 = (ImageUrl) A042;
                                obj18.A06 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                                obj18.A02 = parcel.readLong();
                                String readString35 = parcel.readString();
                                if (readString35 != null) {
                                    obj18.A09 = readString35;
                                    String readString36 = parcel.readString();
                                    if (readString36 != null) {
                                        obj18.A0A = readString36;
                                        List A1E5 = AbstractC166987dD.A1E();
                                        parcel.readList(A1E5, HighlightRange.class.getClassLoader());
                                        obj18.A03 = ImmutableList.copyOf((Collection) A1E5);
                                        List A1E6 = AbstractC166987dD.A1E();
                                        parcel.readList(A1E6, PendingRecipient.class.getClassLoader());
                                        obj18.A04 = ImmutableList.copyOf((Collection) A1E6);
                                        obj18.A01 = parcel.readLong();
                                        obj18.A00 = parcel.readLong();
                                        return obj18;
                                    }
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 62:
                C14360o3.A0B(parcel, 0);
                ?? obj19 = new Object();
                String readString37 = parcel.readString();
                if (readString37 != null) {
                    obj19.A08 = readString37;
                    String readString38 = parcel.readString();
                    if (readString38 != null) {
                        obj19.A06 = readString38;
                        String readString39 = parcel.readString();
                        if (readString39 != null) {
                            obj19.A09 = readString39;
                            String readString40 = parcel.readString();
                            if (readString40 != null) {
                                obj19.A0A = readString40;
                                String readString41 = parcel.readString();
                                if (readString41 != null) {
                                    obj19.A07 = readString41;
                                    Parcelable A043 = AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                                    if (A043 != null) {
                                        obj19.A04 = (ImageUrl) A043;
                                        obj19.A05 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                                        List A1E7 = AbstractC166987dD.A1E();
                                        parcel.readList(A1E7, PendingRecipient.class.getClassLoader());
                                        obj19.A03 = ImmutableList.copyOf((Collection) A1E7);
                                        obj19.A02 = parcel.readLong();
                                        obj19.A01 = parcel.readLong();
                                        obj19.A00 = parcel.readLong();
                                        return obj19;
                                    }
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new DirectPendingLayeredXma((ExtendedImageUrl) AbstractC37304Gc5.A04(parcel, DirectPendingLayeredXma.class), (ExtendedImageUrl) AbstractC37304Gc5.A04(parcel, DirectPendingLayeredXma.class), (User) AbstractC37304Gc5.A04(parcel, DirectPendingLayeredXma.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 64:
                C14360o3.A0B(parcel, 0);
                ExtendedImageUrl extendedImageUrl = (ExtendedImageUrl) AbstractC37304Gc5.A04(parcel, DirectPendingMusicShare.class);
                String readString42 = parcel.readString();
                String readString43 = parcel.readString();
                String readString44 = parcel.readString();
                String readString45 = parcel.readString();
                String readString46 = parcel.readString();
                ?? obj20 = new Object();
                obj20.A00 = extendedImageUrl;
                obj20.A05 = readString42;
                obj20.A04 = readString43;
                obj20.A02 = readString44;
                obj20.A01 = readString45;
                obj20.A03 = readString46;
                return obj20;
            case 65:
                return new DirectRoomsXma(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel), parcel.readString());
            case 66:
                C14360o3.A0B(parcel, 0);
                ArrayList createTypedArrayList = parcel.createTypedArrayList(DirectSearchPrompt.CREATOR);
                if (createTypedArrayList != null) {
                    EnumC53305Nhh enumC53305Nhh = (EnumC53305Nhh) EnumHelper.A00(parcel.readString(), EnumC53305Nhh.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    C14360o3.A07(enumC53305Nhh);
                    ?? obj21 = new Object();
                    obj21.A01 = createTypedArrayList;
                    obj21.A00 = enumC53305Nhh;
                    return obj21;
                }
                throw AbstractC166987dD.A12("Required value was null.");
            case 67:
                String A0d13 = AbstractC37304Gc5.A0d(parcel);
                if (A0d13 != null) {
                    String readString47 = parcel.readString();
                    if (readString47 != null) {
                        EnumC50680MYy[] values = EnumC50680MYy.values();
                        int length = values.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                enumC50680MYy = values[i11];
                                if (!C14360o3.A0K(enumC50680MYy.A00, readString47)) {
                                    i11++;
                                }
                            } else {
                                enumC50680MYy = EnumC50680MYy.A04;
                            }
                        }
                        String readString48 = parcel.readString();
                        if (readString48 != null) {
                            String readString49 = parcel.readString();
                            if (readString49 != null) {
                                return new DirectSearchPrompt(enumC50680MYy, A0d13, readString48, readString49);
                            }
                            throw AbstractC166987dD.A12("Required value was null.");
                        }
                        throw AbstractC166987dD.A12("Required value was null.");
                    }
                    throw AbstractC166987dD.A12("Required value was null.");
                }
                throw AbstractC166987dD.A12("Required value was null.");
            case 68:
                ?? obj22 = new Object();
                obj22.A00 = AbstractC31171DnF.A0G(AbstractC31176DnK.A09(parcel.readString()));
                if (parcel.readInt() == 1) {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    try {
                        C9BW A002 = C51I.A00(obj22.A00, bArr);
                        Throwable th = (Throwable) A002.A00;
                        if (th == null) {
                            obj22.A01 = (C38321qM) A002.A01;
                        } else {
                            throw th;
                        }
                    } catch (IOException e) {
                        C0K8.A0F("DirectSearchResharedContent", "Media was not deserializable.", e);
                    }
                }
                ArrayList A1E8 = AbstractC166987dD.A1E();
                parcel.readList(A1E8, null);
                ArrayList A1E9 = AbstractC166987dD.A1E();
                Iterator it = A1E8.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    try {
                        Parcelable.Creator creator = User.CREATOR;
                        A1E9.add(AbstractC38851rI.A04(A1B));
                    } catch (IOException e2) {
                        C0K8.A0F("DirectSearchResharedContent", "Couldn't deserialize string to user", e2);
                    }
                }
                obj22.A02 = ImmutableSet.A03(A1E9);
                return obj22;
            case 69:
                ?? obj23 = new Object();
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(PendingRecipient.CREATOR);
                if (createTypedArrayList2 == null) {
                    createTypedArrayList2 = AbstractC166987dD.A1E();
                }
                obj23.A02 = createTypedArrayList2;
                obj23.A00 = parcel.readString();
                obj23.A01 = parcel.readString();
                obj23.A03 = AbstractC37304Gc5.A1X(parcel);
                return obj23;
            case 70:
                ?? obj24 = new Object();
                obj24.A02 = parcel.readInt();
                obj24.A01 = parcel.readInt();
                obj24.A00 = parcel.readInt();
                return obj24;
            case 71:
                String A0d14 = AbstractC37304Gc5.A0d(parcel);
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = TypedImageUrl.CREATOR.createFromParcel(parcel);
                }
                return new DirectStoreSticker((TypedImageUrl) createFromParcel, (TypedImageUrl) TypedImageUrl.CREATOR.createFromParcel(parcel), A0d14, parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 72:
                String A0d15 = AbstractC37304Gc5.A0d(parcel);
                String readString50 = parcel.readString();
                String readString51 = parcel.readString();
                int readInt11 = parcel.readInt();
                int readInt12 = parcel.readInt();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Double.valueOf(parcel.readDouble());
                }
                String readString52 = parcel.readString();
                String readString53 = parcel.readString();
                boolean z4 = true;
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() == 0) {
                        z4 = false;
                    }
                    bool = Boolean.valueOf(z4);
                }
                return new DirectStoreStickerResponseItem(valueOf2, bool, valueOf, A0d15, readString50, readString51, readString52, readString53, parcel.readString(), readInt11, readInt12);
            case 73:
                String A0d16 = AbstractC37304Gc5.A0d(parcel);
                String readString54 = parcel.readString();
                String readString55 = parcel.readString();
                String readString56 = parcel.readString();
                int readInt13 = parcel.readInt();
                ArrayList A179 = AbstractC25225BEi.A17(readInt13);
                int i12 = 0;
                while (i12 != readInt13) {
                    i12 = AbstractC37304Gc5.A01(parcel, DirectStoreSticker.CREATOR, A179, i12);
                }
                return new StickerPack(A0d16, readString54, readString55, readString56, A179);
            case 74:
                return new StickerPackResponseItem(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            case 75:
                C14360o3.A0B(parcel, 0);
                return new TypedImageUrl((ImageUrl) AbstractC37304Gc5.A04(parcel, TypedImageUrl.class), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 76:
                String A0d17 = AbstractC37304Gc5.A0d(parcel);
                long readLong3 = parcel.readLong();
                int readInt14 = parcel.readInt();
                return new MsysPendingRecipient((ImageUrl) AbstractC37304Gc5.A04(parcel, MsysPendingRecipient.class), (FollowStatus) AbstractC37304Gc5.A04(parcel, MsysPendingRecipient.class), AbstractC37304Gc5.A0V(parcel), A0d17, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), readInt14, readLong3, AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 77:
                C14360o3.A0B(parcel, 0);
                return new DirectMsysMixedThreadKey((DirectThreadKey) AbstractC37304Gc5.A04(parcel, DirectMsysMixedThreadKey.class), (MsysThreadId) AbstractC37304Gc5.A04(parcel, DirectMsysMixedThreadKey.class));
            case 78:
                C14360o3.A0B(parcel, 0);
                int readInt15 = parcel.readInt();
                if (readInt15 != 0) {
                    if (readInt15 != 1) {
                        if (readInt15 == 2) {
                            MsysThreadId msysThreadId = (MsysThreadId) AbstractC37304Gc5.A04(parcel, MsysThreadId.class);
                            if (msysThreadId != null) {
                                String readString57 = parcel.readString();
                                C14360o3.A0A(readString57);
                                c83693oE = new EgH(new C83693oE(readString57), msysThreadId);
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Unexpected parcel contents");
                        }
                    } else {
                        c83693oE = (MsysThreadId) AbstractC37304Gc5.A04(parcel, MsysThreadId.class);
                        if (c83693oE == null) {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                } else {
                    String readString58 = parcel.readString();
                    C14360o3.A0A(readString58);
                    c83693oE = new C83693oE(readString58);
                }
                return new ThreadIdParcelable(c83693oE);
            case 79:
                C14360o3.A0B(parcel, 0);
                int readInt16 = parcel.readInt();
                if (readInt16 != 0) {
                    if (readInt16 != 1) {
                        if (readInt16 == 2) {
                            Object A044 = AbstractC37304Gc5.A04(parcel, DirectMsysMixedThreadKey.class);
                            obj = A044;
                            if (A044 == null) {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Unexpected parcel contents");
                        }
                    } else {
                        Object obj25 = (MsysThreadId) AbstractC37304Gc5.A04(parcel, MsysThreadId.class);
                        obj = obj25;
                        if (obj25 == null) {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                } else {
                    ?? obj26 = new Object();
                    obj26.A00 = parcel.readString();
                    obj26.A01 = parcel.readString();
                    obj26.A02 = parcel.createStringArrayList();
                    obj = obj26;
                }
                return new UnifiedThreadKeyParcelable((C3o9) obj);
            case 80:
                ?? obj27 = new Object();
                String readString59 = parcel.readString();
                readString59.getClass();
                obj27.A09 = readString59;
                String readString60 = parcel.readString();
                readString60.getClass();
                obj27.A0A = readString60;
                obj27.A02 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                obj27.A07 = parcel.readString();
                obj27.A06 = parcel.readString();
                obj27.A01 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                obj27.A00 = parcel.readInt();
                if (parcel.readByte() != 0) {
                    enumC77213d7 = EnumC77213d7.A04;
                } else {
                    enumC77213d7 = EnumC77213d7.A03;
                }
                obj27.A05 = enumC77213d7;
                ArrayList<String> createStringArrayList5 = parcel.createStringArrayList();
                createStringArrayList5.getClass();
                obj27.A0E = createStringArrayList5;
                ArrayList<String> createStringArrayList6 = parcel.createStringArrayList();
                createStringArrayList6.getClass();
                obj27.A0G = createStringArrayList6;
                obj27.A0C = parcel.readString();
                obj27.A04 = (ProductAREffectContainer) AbstractC37304Gc5.A04(parcel, ProductAREffectContainer.class);
                obj27.A0B = parcel.readString();
                obj27.A0F = parcel.createStringArrayList();
                obj27.A08 = parcel.readString();
                obj27.A0D = parcel.readString();
                obj27.A03 = (EnumC223179sw) parcel.readSerializable();
                return obj27;
            case 81:
                ?? obj28 = new Object();
                String readString61 = parcel.readString();
                if (readString61 != null) {
                    obj28.A05 = readString61;
                } else {
                    obj28.A05 = "";
                }
                obj28.A00 = parcel.readString();
                String readString62 = parcel.readString();
                if (readString62 != null) {
                    obj28.A01 = readString62;
                } else {
                    obj28.A01 = "";
                }
                obj28.A02 = parcel.readString();
                obj28.A03 = parcel.readString();
                obj28.A04 = parcel.readString();
                obj28.A06 = parcel.readString();
                return obj28;
            case 82:
                return new FundraiserDisplayInfoModel(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 83:
                String A0d18 = AbstractC37304Gc5.A0d(parcel);
                int readInt17 = parcel.readInt();
                return new NewFundraiserInfo(A0d18, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), readInt17, AbstractC37304Gc5.A1V(parcel));
            case 84:
                C14360o3.A0B(parcel, 0);
                return HashtagFollowStatus.values()[parcel.readInt()];
            case 85:
                ?? c40791um3 = new C40791um();
                if (parcel.readByte() == 1) {
                    ArrayList A1E10 = AbstractC166987dD.A1E();
                    ArrayList A0q = AbstractC167017dG.A0q(A1E10);
                    Iterator it2 = A1E10.iterator();
                    while (it2.hasNext()) {
                        A0q.add(((Hashtag) it2.next()).F59());
                    }
                    c40791um3.A00 = A0q;
                    parcel.readList(A0q, Hashtag.class.getClassLoader());
                    return c40791um3;
                }
                c40791um3.A00 = null;
                return c40791um3;
            case 86:
                C14360o3.A0B(parcel, 0);
                Keyword keyword = new Keyword(null, null, "", null, null, null, null, null, 0L, false, false);
                keyword.A03 = parcel.readString();
                String readString63 = parcel.readString();
                if (readString63 == null) {
                    readString63 = "";
                }
                keyword.A04 = readString63;
                keyword.A00 = parcel.readLong();
                keyword.A05 = parcel.readString();
                keyword.A06 = parcel.readString();
                keyword.A01 = Double.valueOf(parcel.readDouble());
                return keyword;
            case 87:
                String A0d19 = AbstractC37304Gc5.A0d(parcel);
                String str = "";
                if (A0d19 == null) {
                    A0d19 = "";
                }
                String readString64 = parcel.readString();
                if (readString64 != null) {
                    str = readString64;
                }
                List createTypedArrayList3 = parcel.createTypedArrayList(Keyword.CREATOR);
                if (createTypedArrayList3 == null) {
                    createTypedArrayList3 = C16930sl.A00;
                }
                ?? obj29 = new Object();
                obj29.A00 = A0d19;
                obj29.A01 = str;
                obj29.A02 = createTypedArrayList3;
                return obj29;
            case 88:
                C14360o3.A0B(parcel, 0);
                String str2 = "";
                Locale locale = Locale.ROOT;
                MapQuery mapQuery = new MapQuery("", "", AbstractC31172DnG.A16(locale, "CATEGORY"));
                String readString65 = parcel.readString();
                if (readString65 == null) {
                    readString65 = "";
                }
                mapQuery.A00 = readString65;
                String readString66 = parcel.readString();
                if (readString66 == null) {
                    readString66 = "";
                }
                mapQuery.A01 = readString66;
                String readString67 = parcel.readString();
                if (readString67 != null) {
                    str2 = readString67;
                }
                mapQuery.A03 = str2;
                String readString68 = parcel.readString();
                if (readString68 == null) {
                    readString68 = AbstractC31172DnG.A16(locale, "CATEGORY");
                }
                mapQuery.A02 = readString68;
                return mapQuery;
            case 89:
                return new CurrencyAmountInfoImpl(AbstractC37304Gc5.A0V(parcel), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 90:
                C14360o3.A0B(parcel, 0);
                return new DeliveryWindowInfoImpl(parcel.readLong(), parcel.readLong());
            case 91:
                ?? obj30 = new Object();
                obj30.A06 = parcel.readString();
                obj30.A07 = parcel.readString();
                obj30.A02 = parcel.readString();
                obj30.A04 = parcel.readString();
                ArrayList A1E11 = AbstractC166987dD.A1E();
                obj30.A09 = A1E11;
                parcel.readList(A1E11, ProductItem.class.getClassLoader());
                obj30.A00 = parcel.readString();
                obj30.A05 = parcel.readString();
                boolean z5 = false;
                obj30.A0B = AbstractC167007dF.A1P(parcel.readInt(), 1);
                if (parcel.readInt() == 1) {
                    z5 = true;
                }
                obj30.A0C = z5;
                obj30.A08 = parcel.readString();
                obj30.A03 = parcel.readString();
                obj30.A01 = parcel.readString();
                return obj30;
            case 92:
                ?? obj31 = new Object();
                obj31.A03 = parcel.readString();
                obj31.A01 = (CurrencyAmountInfoImpl) AbstractC37304Gc5.A04(parcel, CurrencyAmountInfo.class);
                obj31.A00 = parcel.readInt();
                obj31.A02 = parcel.readString();
                return obj31;
            case 93:
                String A0d20 = AbstractC37304Gc5.A0d(parcel);
                if (A0d20 != null) {
                    return ReelViewerContextButtonType.valueOf(A0d20);
                }
                throw AbstractC166997dE.A0g();
            case 94:
                C14360o3.A0B(parcel, 0);
                return StoryWedgingType.values()[parcel.readInt()];
            case 95:
                C14360o3.A0B(parcel, 0);
                return BloksStoryNetegoCTAStyle.values()[parcel.readInt()];
            case 96:
                C14360o3.A0B(parcel, 0);
                return ShoppingNetegoInStoryIconType.values()[parcel.readInt()];
            case 97:
                C14360o3.A0B(parcel, 0);
                return ShoppingNetegoInStorySuggestionType.values()[parcel.readInt()];
            case 98:
                C14360o3.A0B(parcel, 0);
                return ShoppingNetegoType.values()[parcel.readInt()];
            default:
                int A003 = AbstractC37304Gc5.A00(parcel);
                ArrayList A1710 = AbstractC25225BEi.A17(A003);
                for (int i13 = 0; i13 != A003; i13++) {
                    AbstractC37304Gc5.A0r(parcel, RtcCallAudience.class, A1710);
                }
                return new RtcCallAudience((ImageUrl) AbstractC37304Gc5.A04(parcel, RtcCallAudience.class), parcel.readString(), parcel.readString(), parcel.readString(), A1710, parcel.createStringArrayList(), AbstractC37304Gc5.A1V(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new HashtagContextualFeedConfig[i];
            case 1:
                return new IgFormField.SavedState[i];
            case 2:
                return new IGTVCreationToolsResponse[i];
            case 3:
                return new IGTVViewerLoggingToken[i];
            case 4:
                return new IGTVBrandedContentTags[i];
            case 5:
                return new IGTVUploadProgress[i];
            case 6:
                return new IGTVShoppingMetadata[i];
            case 7:
                return new InfoCenterFactShareInfo[i];
            case 8:
                return new ShareInfo[i];
            case 9:
                return new LeadAdsDisclaimerResponse[i];
            case 10:
                return new LeadAdsInputFieldResponse[i];
            case 11:
                return new LeadForm[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new LeadGenInfoFieldData[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new LeadGenInfoFieldTypes[i];
            case 14:
                return new OrganicLeadGenCtaLabel[i];
            case Process.SIGTERM /* 15 */:
                return new LeadGenBaseFormList[i];
            case 16:
                return new LeadGenConditionalAnswerInfo[i];
            case 17:
                return new LeadGenFormBaseQuestion[i];
            case 18:
                return new LeadGenProfileContentInfo[i];
            case Process.SIGSTOP /* 19 */:
                return new LeadGenTrustSignal[i];
            case 20:
                return new LeadGenTrustSignalsPayload[i];
            case 21:
                return new LeadGenCustomDisclaimer[i];
            case 22:
                return new LeadGenCustomDisclaimerBody[i];
            case 23:
                return new LeadGenCustomDisclaimerBodyUrlRanges[i];
            case 24:
                return new LeadGenCustomDisclaimerCheckbox[i];
            case 25:
                return new LeadGenDisqualifyingScreenData[i];
            case 26:
                return new LeadGenPrivacyPolicy[i];
            case 27:
                return new LeadFormCustomQuestion[i];
            case 28:
                return new LeadGenConsumerFormData[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new LeadGenFormData[i];
            case 30:
                return new LocationContextualFeedConfig[i];
            case 31:
                return new LocationSignalPackageImpl[i];
            case 32:
                return new LocationPageInfoPageOperationHour[i];
            case 33:
                return new LocationPageInfoPageOperationHourResponse[i];
            case 34:
                return new LocationPageInfo[i];
            case 35:
                return new AssistAccountRecoveryResponse$UhlAccount[i];
            case 36:
                return new TwoFactorInfoConfig[i];
            case 37:
                return new TotpSeed[i];
            case 38:
                return new TrustedDevice[i];
            case 39:
                return new ContextualOrganicInfo[i];
            case 40:
                return new MediaKitEntryPoint[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new VisibilitySheetOrigin[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new MediaKitConfig[i];
            case 43:
                return new MediaKitGalleryFoldersSheetConfig[i];
            case 44:
                return new MediaKitInfoSheetConfig[i];
            case 45:
                return new MediaKitSectionActionSheetConfig[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new MediaKitInsightType[i];
            case 47:
                return new MediaKitSectionType[i];
            case 48:
                return new MediaKitFolderSheetItemModel[i];
            case 49:
                return new MediaKitInfoSheetItemModel[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new MediaKitLink[i];
            case 51:
                return new ArAdsUIModel[i];
            case 52:
                return new Address[i];
            case 53:
                return new BusinessInfo[i];
            case 54:
                return new ProfileAddressData[i];
            case 55:
                return new PublicPhoneContact[i];
            case 56:
                return new ParcelableCommenterDetails[i];
            case 57:
                return new PromoteAdsCouponUseCase[i];
            case 58:
                return new PromoteCouponCurrencyAmount[i];
            case 59:
                return new PromoteCouponType[i];
            case 60:
                return new DirectIfyXma[i];
            case 61:
                return new DirectMessageSearchMessage[i];
            case 62:
                return new DirectMessageSearchThread[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new DirectPendingLayeredXma[i];
            case 64:
                return new DirectPendingMusicShare[i];
            case 65:
                return new DirectRoomsXma[i];
            case 66:
                return new DirectSearchMetaAIResponse[i];
            case 67:
                return new DirectSearchPrompt[i];
            case 68:
                return new DirectSearchResharedContent[i];
            case 69:
                return new DirectVisualMessageTarget[i];
            case 70:
                return new HighlightRange[i];
            case 71:
                return new DirectStoreSticker[i];
            case 72:
                return new DirectStoreStickerResponseItem[i];
            case 73:
                return new StickerPack[i];
            case 74:
                return new StickerPackResponseItem[i];
            case 75:
                return new TypedImageUrl[i];
            case 76:
                return new MsysPendingRecipient[i];
            case 77:
                return new DirectMsysMixedThreadKey[i];
            case 78:
                return new ThreadIdParcelable[i];
            case 79:
                return new UnifiedThreadKeyParcelable[i];
            case 80:
                return new AttributedAREffect[i];
            case 81:
                return new FBUserTag.FBUserInfo[i];
            case 82:
                return new FundraiserDisplayInfoModel[i];
            case 83:
                return new NewFundraiserInfo[i];
            case 84:
                return new HashtagFollowStatus[i];
            case 85:
                return new HashtagCollection[i];
            case 86:
                return new Keyword[i];
            case 87:
                return new KeywordRecommendations[i];
            case 88:
                return new MapQuery[i];
            case 89:
                return new CurrencyAmountInfoImpl[i];
            case 90:
                return new DeliveryWindowInfoImpl[i];
            case 91:
                return new CheckoutLaunchParams[i];
            case 92:
                return new ProductItem[i];
            case 93:
                return new ReelViewerContextButtonType[i];
            case 94:
                return new StoryWedgingType[i];
            case 95:
                return new BloksStoryNetegoCTAStyle[i];
            case 96:
                return new ShoppingNetegoInStoryIconType[i];
            case 97:
                return new ShoppingNetegoInStorySuggestionType[i];
            case 98:
                return new ShoppingNetegoType[i];
            default:
                return new RtcCallAudience[i];
        }
    }
}
