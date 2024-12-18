package X;

import android.graphics.PointF;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.api.schemas.EventPageNavigationMetadata;
import com.instagram.api.schemas.IGLocalEventDict;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.api.schemas.ScheduledLiveAffiliateInfo;
import com.instagram.api.schemas.ScheduledLiveDiscountInfo;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.sponsored.signals.model.AdsBizBadgeInfo;
import com.instagram.sponsored.signals.model.AdsTextTrustInfo;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.trials.model.TrialMetricsData;
import com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;
import com.instagram.ui.slidecardpageadapter.SlideCardViewModel;
import com.instagram.ui.widget.editphonenumber.CountryCodeTextView;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductCollectionImpl;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductWrapper;
import com.instagram.user.model.ScheduledLiveProductsMetadata;
import com.instagram.user.model.UnavailableProductImpl;
import com.instagram.user.model.UpcomingDropCampaignEventMetadata;
import com.instagram.user.model.UpcomingDropCampaignEventMetadataImpl;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.UpcomingEventLiveMetadata;
import com.instagram.user.model.UpcomingEventLiveMetadataImpl;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig;
import com.instagram.util.gallery.ImageManager$ImageListParam;
import com.instagram.video.common.events.IgRtcEventHeader;
import com.instagram.videofeed.intf.VideoFeedType;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import com.instagram.wellbeing.supportinbox.model.SupportInboxDetailBottomSheetModel;
import com.instagram.wonderwall.model.Destination;
import com.instagram.wonderwall.model.WallGifPostItem;
import com.instagram.wonderwall.model.WallImage;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallLaunchConfig;
import com.instagram.wonderwall.model.WallMediaPostItem;
import com.instagram.wonderwall.model.WallMenuConfig;
import com.instagram.wonderwall.model.WallMusicPostItem;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallRepostItem;
import com.instagram.wonderwall.model.WallText;
import com.instagram.wonderwall.model.WallTextPostItem;
import com.instagram.xme.immersivemedia.ImmersiveMediaInfo;
import com.meta.arfx.engine.interfaces.ARNetworkClientWorkerResponse;
import com.meta.flytrap.attachment.model.AttachmentCounter;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaType;
import com.meta.foa.accountswitcher.DBLSwitcherArgs;
import com.meta.foa.accountswitcher.FullSheetOverflowSwitcherArgs;
import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenCallerDismissCallback;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;
import com.meta.foa.fallbacklogin.UserLoginCredential;
import com.meta.foa.session.FoaUserSession;
import com.meta.payments.error.ErrorCode;
import com.meta.payments.model.configuration.AdditionalInfoKey;
import com.meta.payments.model.configuration.InternalPaymentConfiguration;
import com.meta.payments.model.configuration.PartnerId;
import com.meta.payments.model.configuration.PaymentContainerType;
import com.meta.payments.model.configuration.PaymentMode;
import com.meta.payments.model.offer.InternalOffer;
import com.meta.payments.model.payment.BillingAddressMode;
import com.meta.payments.model.payment.InternalPaymentContainer;
import com.meta.payments.model.payment.InternalPaymentDetails;
import com.meta.payments.model.payment.InternalPaymentItem;
import com.meta.payments.model.payment.InternalPaymentOptions;
import com.meta.payments.model.payment.InternalPaymentRequest;
import com.meta.payments.model.payment.InternalPaymentResponse;
import com.meta.payments.model.payment.InternalSummaryPaymentItem;
import com.meta.payments.model.payment.PaymentAddress;
import com.meta.payments.model.payment.PaymentCtaType;
import com.meta.payments.model.payment.PaymentCurrencyAmount;
import com.meta.payments.model.payment.SummaryPaymentItemType;
import com.meta.payments.model.shipping.InternalShippingOption;
import com.meta.payments.model.shipping.ShippingOptionType;
import com.spotify.sdk.android.auth.AuthorizationRequest;
import com.spotify.sdk.android.auth.AuthorizationResponse;
import fxcache.model.FxCalAccount;
import fxcache.model.FxCalAccountLinkageInfo;
import fxcache.model.FxCalAccountLinkageInfoForSwitcher;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import go.Seq;
import instagram.features.clips.viewer.recipesheet.RecipeSheetParams;
import java.io.Serializable;
import java.util.ArrayList;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequest;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem;
import libraries.access.src.main.base.common.FXDeviceItem;
import libraries.fxcallauncher.model.FxUnifiedLauncherAddedAccount;

/* renamed from: X.OhA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55344OhA implements Parcelable.Creator {
    public final int A00;

    public static WallPostInfo A01(Parcel parcel) {
        C14360o3.A0B(parcel, 0);
        return (WallPostInfo) WallPostInfo.CREATOR.createFromParcel(parcel);
    }

    public C55344OhA(int i) {
        this.A00 = i;
    }

    public static C55344OhA A00(int i) {
        return new C55344OhA(i);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.instagram.ui.slidecardpageadapter.SlideCardViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [com.instagram.ui.slidecardpageadapter.SlideCardViewModel$SlideCardSectionViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.instagram.tagging.api.model.MediaSuggestedProductTag, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object, com.instagram.util.gallery.ImageManager$ImageListParam] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object, com.instagram.wellbeing.supportinbox.model.SupportInboxDetailBottomSheetModel] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View$BaseSavedState, com.instagram.tagging.widget.TagsInteractiveLayout$UnnamedTagSavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v47, types: [com.instagram.xme.immersivemedia.ImmersiveMediaInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v94, types: [java.lang.Object, libraries.fxcallauncher.model.FxUnifiedLauncherAddedAccount] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A17;
        Object createFromParcel;
        ArrayList A172;
        Object createFromParcel2;
        Object createFromParcel3;
        Long valueOf;
        Boolean valueOf2;
        Long valueOf3;
        Boolean valueOf4;
        Boolean valueOf5;
        Object createFromParcel4;
        Object createFromParcel5;
        Object createFromParcel6;
        Object createFromParcel7;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(parcel, 0);
                AdsBizBadgeInfo adsBizBadgeInfo = (AdsBizBadgeInfo) AbstractC37304Gc5.A04(parcel, AdsTextTrustInfo.class);
                if (parcel.readInt() == 0) {
                    A17 = null;
                } else {
                    int readInt = parcel.readInt();
                    A17 = AbstractC25225BEi.A17(readInt);
                    for (int i = 0; i != readInt; i++) {
                        AbstractC37304Gc5.A0r(parcel, AdsTextTrustInfo.class, A17);
                    }
                }
                return new AdsTextTrustInfo(adsBizBadgeInfo, A17);
            case 1:
                C14360o3.A0B(parcel, 0);
                ?? obj = new Object();
                AbstractC50524MSc.A0L(obj, AbstractC166987dD.A1E());
                String readString = parcel.readString();
                if (readString != null) {
                    obj.A06 = readString;
                    obj.A02 = (ImageUrl) AbstractC37304Gc5.A04(parcel, SimpleImageUrl.class);
                    obj.A08 = parcel.readString();
                    obj.A0B = MSY.A0j(parcel.createTypedArrayList(PeopleTag.CREATOR));
                    obj.A0A = MSY.A0j(parcel.createTypedArrayList(FBUserTag.CREATOR));
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(PeopleTag.CREATOR);
                    if (createTypedArrayList == null) {
                        createTypedArrayList = AbstractC166987dD.A1E();
                    }
                    obj.A0F = createTypedArrayList;
                    obj.A01 = parcel.readInt();
                    obj.A00 = parcel.readFloat();
                    obj.A0C = MSY.A0j(parcel.createTypedArrayList(ProductTag.CREATOR));
                    obj.A0D = MSY.A0j(parcel.createTypedArrayList(MediaSuggestedProductTag.CREATOR));
                    obj.A0H = AbstractC50523MSb.A1Y(parcel);
                    Serializable readSerializable = parcel.readSerializable();
                    C14360o3.A0C(readSerializable, "null cannot be cast to non-null type com.instagram.model.mediatype.MediaType");
                    obj.A03 = (EnumC40111tc) readSerializable;
                    obj.A0G = parcel.createStringArrayList();
                    obj.A04 = (ClipInfo) parcel.readValue(ClipInfo.class.getClassLoader());
                    obj.A0E = MSY.A0j(parcel.createStringArrayList());
                    obj.A09 = MSY.A0j(parcel.createStringArrayList());
                    obj.A05 = parcel.readString();
                    obj.A07 = parcel.readString();
                    return obj;
                }
                throw AbstractC166997dE.A0g();
            case 2:
                ?? obj2 = new Object();
                ArrayList A1E = AbstractC166987dD.A1E();
                obj2.A02 = A1E;
                parcel.readList(A1E, MediaSuggestedProductTagProductItemContainer.class.getClassLoader());
                obj2.A00 = (PointF) AbstractC37304Gc5.A04(parcel, PointF.class);
                EnumC53230NgS enumC53230NgS = (EnumC53230NgS) EnumC53230NgS.A01.get(parcel.readString());
                if (enumC53230NgS == null) {
                    enumC53230NgS = EnumC53230NgS.A06;
                }
                obj2.A01 = enumC53230NgS;
                return obj2;
            case 3:
                ?? obj3 = new Object();
                obj3.A01 = (ProductDetailsProductItemDict) AbstractC37304Gc5.A04(parcel, Product.class);
                obj3.A00 = parcel.readFloat();
                return obj3;
            case 4:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                PointF pointF = new PointF();
                baseSavedState.A00 = pointF;
                pointF.x = parcel.readFloat();
                baseSavedState.A00.y = parcel.readFloat();
                return baseSavedState;
            case 5:
                return new TrialMetricsData(AbstractC37304Gc5.A00(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 6:
                C14360o3.A0B(parcel, 0);
                return new MixedAttributionModel((ImageUrl) AbstractC37304Gc5.A04(parcel, MixedAttributionModel.class), (MixedAttributionModel.MixedAttributionType) MixedAttributionModel.MixedAttributionType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 7:
                return MixedAttributionModel.MixedAttributionType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 8:
                return new ColorTint(AbstractC37304Gc5.A00(parcel), parcel.readInt(), parcel.readInt());
            case 9:
                return new IconConfig.IconWithTextConfig(AbstractC37304Gc5.A00(parcel), parcel.readString());
            case 10:
                return new IconConfig.SimpleIconConfig(AbstractC37304Gc5.A00(parcel));
            case 11:
                return new InfoItem((IconConfig) AbstractC37304Gc5.A04(parcel, InfoItem.class), AbstractC37304Gc5.A0V(parcel), AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                String A0d = AbstractC37304Gc5.A0d(parcel);
                Object obj4 = null;
                if (parcel.readInt() != 0) {
                    obj4 = TitleIcon.CREATOR.createFromParcel(parcel);
                }
                TitleIcon titleIcon = (TitleIcon) obj4;
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                ArrayList A173 = AbstractC25225BEi.A17(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = AbstractC37304Gc5.A01(parcel, InfoItem.CREATOR, A173, i2);
                }
                return new PrimerBottomSheetConfig(titleIcon, AbstractC37304Gc5.A0X(parcel), AbstractC37304Gc5.A0Y(parcel), AbstractC37304Gc5.A0Y(parcel), AbstractC37304Gc5.A0Y(parcel), AbstractC37304Gc5.A0Y(parcel), AbstractC37304Gc5.A0Y(parcel), AbstractC37304Gc5.A0W(parcel), A0d, parcel.readString(), parcel.readString(), parcel.readString(), A173, readInt2, AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                int A00 = AbstractC37304Gc5.A00(parcel);
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = ColorTint.CREATOR.createFromParcel(parcel);
                }
                return new TitleIcon((ColorTint) createFromParcel, A00);
            case 14:
                ?? obj5 = new Object();
                ArrayList A1E2 = AbstractC166987dD.A1E();
                obj5.A0C = A1E2;
                parcel.readTypedList(A1E2, SlideCardViewModel.SlideCardSectionViewModel.CREATOR);
                obj5.A00 = parcel.readInt();
                obj5.A01 = parcel.readInt();
                obj5.A06 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                obj5.A05 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                obj5.A0B = parcel.readString();
                obj5.A0A = parcel.readString();
                obj5.A08 = parcel.readString();
                obj5.A09 = parcel.readString();
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                obj5.A07 = (CharSequence) creator.createFromParcel(parcel);
                obj5.A02 = (SpannableString) creator.createFromParcel(parcel);
                obj5.A03 = null;
                obj5.A04 = null;
                return obj5;
            case Process.SIGTERM /* 15 */:
                ?? obj6 = new Object();
                obj6.A03 = parcel.readInt();
                obj6.A08 = parcel.readString();
                obj6.A07 = parcel.readString();
                obj6.A01 = parcel.readInt();
                obj6.A05 = (android.net.Uri) AbstractC37304Gc5.A04(parcel, android.net.Uri.class);
                obj6.A02 = parcel.readInt();
                obj6.A09 = WDp.A02(parcel);
                obj6.A00 = parcel.readInt();
                obj6.A06 = parcel.readString();
                obj6.A04 = (android.net.Uri) AbstractC37304Gc5.A04(parcel, android.net.Uri.class);
                return obj6;
            case 16:
                return new CountryCodeTextView.SavedState(parcel);
            case 17:
                return UpcomingEventReminderAction.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 18:
                String A0d2 = AbstractC37304Gc5.A0d(parcel);
                ProductCollectionReviewStatus productCollectionReviewStatus = (ProductCollectionReviewStatus) AbstractC37304Gc5.A04(parcel, ProductCollectionImpl.class);
                ProductCollectionV2Type productCollectionV2Type = (ProductCollectionV2Type) AbstractC37304Gc5.A04(parcel, ProductCollectionImpl.class);
                ProductCollectionCover productCollectionCover = (ProductCollectionCover) AbstractC37304Gc5.A04(parcel, ProductCollectionImpl.class);
                String readString2 = parcel.readString();
                ProductCollectionDropsMetadata productCollectionDropsMetadata = (ProductCollectionDropsMetadata) AbstractC37304Gc5.A04(parcel, ProductCollectionImpl.class);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    A172 = null;
                } else {
                    int readInt4 = parcel.readInt();
                    A172 = AbstractC25225BEi.A17(readInt4);
                    int i3 = 0;
                    while (i3 != readInt4) {
                        i3 = AbstractC37304Gc5.A01(parcel, User.CREATOR, A172, i3);
                    }
                }
                return new ProductCollectionImpl(productCollectionV2Type, productCollectionReviewStatus, productCollectionCover, productCollectionDropsMetadata, A0d2, readString2, readString3, readString4, readString5, A172);
            case Process.SIGSTOP /* 19 */:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    createFromParcel2 = null;
                } else {
                    createFromParcel2 = ProductDetailsProductItemDict.CREATOR.createFromParcel(parcel);
                }
                return new ProductWrapper((ProductDetailsProductItemDict) createFromParcel2);
            case 20:
                C14360o3.A0B(parcel, 0);
                ScheduledLiveAffiliateInfo scheduledLiveAffiliateInfo = (ScheduledLiveAffiliateInfo) AbstractC37304Gc5.A04(parcel, ScheduledLiveProductsMetadata.class);
                ProductCollection productCollection = (ProductCollection) AbstractC37304Gc5.A04(parcel, ScheduledLiveProductsMetadata.class);
                ScheduledLiveDiscountInfo scheduledLiveDiscountInfo = (ScheduledLiveDiscountInfo) AbstractC37304Gc5.A04(parcel, ScheduledLiveProductsMetadata.class);
                ArrayList arrayList = null;
                if (parcel.readInt() == 0) {
                    createFromParcel3 = null;
                } else {
                    createFromParcel3 = User.CREATOR.createFromParcel(parcel);
                }
                User user = (User) createFromParcel3;
                if (parcel.readInt() != 0) {
                    int readInt5 = parcel.readInt();
                    arrayList = AbstractC25225BEi.A17(readInt5);
                    int i4 = 0;
                    while (i4 != readInt5) {
                        i4 = AbstractC37304Gc5.A01(parcel, ProductWrapper.CREATOR, arrayList, i4);
                    }
                }
                return new ScheduledLiveProductsMetadata(scheduledLiveAffiliateInfo, scheduledLiveDiscountInfo, productCollection, user, arrayList);
            case 21:
                return new UnavailableProductImpl((User) User.CREATOR.createFromParcel(parcel), AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 22:
                C14360o3.A0B(parcel, 0);
                ProductCollection productCollection2 = (ProductCollection) AbstractC37304Gc5.A04(parcel, UpcomingDropCampaignEventMetadataImpl.class);
                UpcomingEventMedia upcomingEventMedia = (UpcomingEventMedia) AbstractC37304Gc5.A04(parcel, UpcomingDropCampaignEventMetadataImpl.class);
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                User user2 = (User) User.CREATOR.createFromParcel(parcel);
                int readInt6 = parcel.readInt();
                ArrayList A174 = AbstractC25225BEi.A17(readInt6);
                int i5 = 0;
                while (i5 != readInt6) {
                    i5 = AbstractC37304Gc5.A01(parcel, ProductDetailsProductItemDict.CREATOR, A174, i5);
                }
                return new UpcomingDropCampaignEventMetadataImpl(upcomingEventMedia, productCollection2, user2, readString6, readString7, A174);
            case 23:
                C14360o3.A0B(parcel, 0);
                UpcomingDropCampaignEventMetadata upcomingDropCampaignEventMetadata = (UpcomingDropCampaignEventMetadata) AbstractC37304Gc5.A04(parcel, UpcomingEventImpl.class);
                Object obj7 = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(parcel.readLong());
                }
                EventPageNavigationMetadata eventPageNavigationMetadata = (EventPageNavigationMetadata) AbstractC37304Gc5.A04(parcel, UpcomingEventImpl.class);
                String readString8 = parcel.readString();
                IGLocalEventDict iGLocalEventDict = (IGLocalEventDict) AbstractC37304Gc5.A04(parcel, UpcomingEventImpl.class);
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(parcel.readLong());
                }
                UpcomingEventLiveMetadata upcomingEventLiveMetadata = (UpcomingEventLiveMetadata) AbstractC37304Gc5.A04(parcel, UpcomingEventImpl.class);
                UpcomingEventMedia upcomingEventMedia2 = (UpcomingEventMedia) AbstractC37304Gc5.A04(parcel, UpcomingEventImpl.class);
                if (parcel.readInt() != 0) {
                    obj7 = User.CREATOR.createFromParcel(parcel);
                }
                boolean A1V = AbstractC37304Gc5.A1V(parcel);
                long readLong = parcel.readLong();
                return new UpcomingEventImpl(eventPageNavigationMetadata, iGLocalEventDict, (UpcomingEventIDType) AbstractC37304Gc5.A04(parcel, UpcomingEventImpl.class), upcomingEventMedia2, upcomingDropCampaignEventMetadata, upcomingEventLiveMetadata, (User) obj7, valueOf2, valueOf, valueOf3, readString8, parcel.readString(), parcel.readString(), readLong, A1V);
            case 24:
                String A0d3 = AbstractC37304Gc5.A0d(parcel);
                Object obj8 = null;
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                boolean A1V2 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V3 = AbstractC37304Gc5.A1V(parcel);
                String readString9 = parcel.readString();
                if (parcel.readInt() != 0) {
                    obj8 = ScheduledLiveProductsMetadata.CREATOR.createFromParcel(parcel);
                }
                return new UpcomingEventLiveMetadataImpl((ScheduledLiveProductsMetadata) obj8, valueOf4, AbstractC37304Gc5.A0X(parcel), A0d3, readString9, A1V2, A1V3);
            case 25:
                return new FollowListData(EnumC31556Dtg.valueOf(AbstractC37304Gc5.A0d(parcel)), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 26:
                return new SocialContextFollowListFragmentConfig((FollowListData) AbstractC37304Gc5.A04(parcel, SocialContextFollowListFragmentConfig.class), AbstractC37304Gc5.A0d(parcel));
            case 27:
                C14360o3.A0B(parcel, 0);
                ?? obj9 = new Object();
                obj9.A03 = C05F.A00(4)[parcel.readInt()];
                obj9.A00 = parcel.readInt();
                obj9.A01 = parcel.readInt();
                obj9.A04 = parcel.readString();
                obj9.A02 = (android.net.Uri) parcel.readParcelable(null);
                obj9.A05 = AbstractC37304Gc5.A1V(parcel);
                return obj9;
            case 28:
                Long l = null;
                if (AbstractC37304Gc5.A00(parcel) != 0) {
                    l = Long.valueOf(parcel.readLong());
                }
                return new IgRtcEventHeader(AbstractC37304Gc5.A0Y(parcel), AbstractC37304Gc5.A0Y(parcel), AbstractC37304Gc5.A0X(parcel), l, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                String A0d4 = AbstractC37304Gc5.A0d(parcel);
                if (A0d4 != null) {
                    return VideoFeedType.valueOf(A0d4);
                }
                throw AbstractC166997dE.A0g();
            case 30:
                return new ExistingStandaloneFundraiserForFeedModel(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            case 31:
                ?? obj10 = new Object();
                obj10.A03 = parcel.readString();
                obj10.A00 = parcel.readString();
                obj10.A01 = parcel.readString();
                obj10.A02 = parcel.readString();
                return obj10;
            case 32:
                return new Destination.Composer(AbstractC37304Gc5.A0d(parcel));
            case 33:
                return new Destination.Preview(AbstractC37304Gc5.A0d(parcel));
            case 34:
                return new WallGifPostItem((GifUrlImpl) parcel.readValue(WallGifPostItem.class.getClassLoader()), A01(parcel), parcel.readString());
            case 35:
                C14360o3.A0B(parcel, 0);
                return new WallImage.CircularAvatar((User) AbstractC37304Gc5.A04(parcel, WallImage.CircularAvatar.class), (User) AbstractC37304Gc5.A04(parcel, WallImage.CircularAvatar.class));
            case 36:
                return new WallImage.Drawable(AbstractC37304Gc5.A00(parcel));
            case 37:
                String A0d5 = AbstractC37304Gc5.A0d(parcel);
                String readString10 = parcel.readString();
                User user3 = (User) AbstractC37304Gc5.A04(parcel, WallInfo.class);
                boolean z = false;
                boolean A1M = AbstractC167007dF.A1M(parcel.readInt());
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new WallInfo(user3, A0d5, readString10, A1M, z);
            case 38:
                return new WallLaunchConfig((Destination) AbstractC37304Gc5.A04(parcel, WallLaunchConfig.class), AbstractC37304Gc5.A0d(parcel));
            case 39:
                return new WallMediaPostItem((C38321qM) parcel.readValue(WallMediaPostItem.class.getClassLoader()), A01(parcel));
            case 40:
                C14360o3.A0B(parcel, 0);
                parcel.readInt();
                return new WallMenuConfig();
            case Seq.NULL_REFNUM /* 41 */:
                WallPostInfo A01 = A01(parcel);
                AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) AbstractC37304Gc5.A04(parcel, WallMusicPostItem.class);
                int readInt7 = parcel.readInt();
                ArrayList A175 = AbstractC25225BEi.A17(readInt7);
                for (int i6 = 0; i6 != readInt7; i6++) {
                    AbstractC166997dE.A1W(A175, parcel.readInt());
                }
                return new WallMusicPostItem(audioOverlayTrack, A01, A175);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                String A0d6 = AbstractC37304Gc5.A0d(parcel);
                User user4 = (User) AbstractC37304Gc5.A04(parcel, WallPostInfo.class);
                WallInfo wallInfo = (WallInfo) WallInfo.CREATOR.createFromParcel(parcel);
                String readString11 = parcel.readString();
                boolean A1M2 = AbstractC167007dF.A1M(parcel.readInt());
                boolean A1V4 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V5 = AbstractC37304Gc5.A1V(parcel);
                int readInt8 = parcel.readInt();
                int readInt9 = parcel.readInt();
                ArrayList A176 = AbstractC25225BEi.A17(readInt9);
                for (int i7 = 0; i7 != readInt9; i7++) {
                    AbstractC37304Gc5.A0r(parcel, WallPostInfo.class, A176);
                }
                return new WallPostInfo(user4, wallInfo, C7B.valueOf(parcel.readString()), A0d6, readString11, A176, readInt8, parcel.readInt(), parcel.readLong(), A1M2, A1V4, A1V5);
            case 43:
                return new WallRepostItem(A01(parcel), (WallPostItem) AbstractC37304Gc5.A04(parcel, WallRepostItem.class));
            case 44:
                return new WallText.Raw(AbstractC37304Gc5.A0d(parcel));
            case 45:
                return new WallText.Res(AbstractC37304Gc5.A00(parcel), parcel.createStringArray());
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new WallTextPostItem(A01(parcel));
            case 47:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                ?? obj11 = new Object();
                obj11.A00 = valueOf5;
                return obj11;
            case 48:
                ARNetworkClientWorkerResponse aRNetworkClientWorkerResponse = new ARNetworkClientWorkerResponse();
                int dataPosition = parcel.dataPosition();
                int readInt10 = parcel.readInt();
                String A002 = AbstractC58317Pt9.A00(602);
                try {
                    if (readInt10 >= 4) {
                        if (parcel.dataPosition() - dataPosition >= readInt10) {
                            if (dataPosition > Integer.MAX_VALUE - readInt10) {
                                throw new BadParcelableException(A002);
                            }
                        } else {
                            aRNetworkClientWorkerResponse.A00 = parcel.readInt();
                            if (parcel.dataPosition() - dataPosition >= readInt10) {
                                if (dataPosition > Integer.MAX_VALUE - readInt10) {
                                    throw new BadParcelableException(A002);
                                }
                            } else {
                                aRNetworkClientWorkerResponse.A02 = parcel.readString();
                                if (parcel.dataPosition() - dataPosition >= readInt10) {
                                    if (dataPosition > Integer.MAX_VALUE - readInt10) {
                                        throw new BadParcelableException(A002);
                                    }
                                } else {
                                    aRNetworkClientWorkerResponse.A03 = parcel.createByteArray();
                                    if (parcel.dataPosition() - dataPosition >= readInt10) {
                                        if (dataPosition > Integer.MAX_VALUE - readInt10) {
                                            throw new BadParcelableException(A002);
                                        }
                                    } else {
                                        aRNetworkClientWorkerResponse.A01 = parcel.readLong();
                                        if (dataPosition > Integer.MAX_VALUE - readInt10) {
                                            throw new BadParcelableException(A002);
                                        }
                                    }
                                }
                            }
                        }
                        parcel.setDataPosition(dataPosition + readInt10);
                        return aRNetworkClientWorkerResponse;
                    }
                    throw new BadParcelableException(AbstractC58317Pt9.A00(611));
                } catch (Throwable th) {
                    if (dataPosition > Integer.MAX_VALUE - readInt10) {
                        throw new BadParcelableException(A002);
                    }
                    parcel.setDataPosition(dataPosition + readInt10);
                    throw th;
                }
            case 49:
                int A003 = AbstractC37304Gc5.A00(parcel);
                ArrayList A177 = AbstractC25225BEi.A17(A003);
                for (int i8 = 0; i8 != A003; i8++) {
                    AbstractC37304Gc5.A0r(parcel, AttachmentCounter.class, A177);
                }
                return new AttachmentCounter(A177);
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                C14360o3.A0B(parcel, 0);
                C3R9[] c3r9Arr = BugReportAttachment.A05;
                return new BugReportAttachment((BugReportAttachmentMediaSource) BugReportAttachmentMediaSource.CREATOR.createFromParcel(parcel), BugReportAttachmentMediaType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 51:
                return BugReportAttachmentMediaSource.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 52:
                int A004 = AbstractC37304Gc5.A00(parcel);
                ArrayList A178 = AbstractC25225BEi.A17(A004);
                int i9 = 0;
                while (i9 != A004) {
                    i9 = AbstractC37304Gc5.A01(parcel, UserAccountInfo.CREATOR, A178, i9);
                }
                return new DBLSwitcherArgs((FoaUserSession) AbstractC37304Gc5.A04(parcel, DBLSwitcherArgs.class), parcel.readString(), parcel.readString(), A178);
            case 53:
                C14360o3.A0B(parcel, 0);
                return new FullSheetOverflowSwitcherArgs((FoaUserSession) AbstractC37304Gc5.A04(parcel, FullSheetOverflowSwitcherArgs.class), parcel.readString(), parcel.readString());
            case 54:
                return new UserAccountInfo(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 55:
                C14360o3.A0B(parcel, 0);
                parcel.readInt();
                return CdsBottomSheetDimmingBehaviour.Default.A00;
            case 56:
                C14360o3.A0B(parcel, 0);
                return new CdsBottomSheetDimmingBehaviour.FixedAlpha(parcel.readFloat());
            case 57:
                return new CdsBottomSheetTopSpan.Dp(AbstractC37304Gc5.A00(parcel));
            case 58:
                C14360o3.A0B(parcel, 0);
                return new CdsBottomSheetTopSpan.ScreenPercent(parcel.readFloat());
            case 59:
                XBW xbw = (XBW) AbstractC66261U6f.A01(XBW.class, Integer.valueOf(parcel.readInt()));
                if (xbw == null) {
                    C50662Um.A01(EnumC50702Ur.A03, "CdsOpenScreenCallerDismissCallback", "Expected non-null CallerDismissCallbackRunnable from BloksDataStorage");
                    return new CdsOpenScreenCallerDismissCallback(new XBW() { // from class: X.PJy
                        @Override // X.XBW
                        public final void EL9(int i10) {
                        }
                    });
                }
                return new CdsOpenScreenCallerDismissCallback(xbw);
            case 60:
                return new CdsOpenScreenConfig$BottomSheetMargins(AbstractC37304Gc5.A00(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 61:
                return new UserLoginCredential(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 62:
                return ErrorCode.valueOf(AbstractC37304Gc5.A0d(parcel));
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return AdditionalInfoKey.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 64:
                int A005 = AbstractC37304Gc5.A00(parcel);
                int readInt11 = parcel.readInt();
                String readString12 = parcel.readString();
                int readInt12 = parcel.readInt();
                ArrayList A179 = AbstractC25225BEi.A17(readInt12);
                for (int i10 = 0; i10 != readInt12; i10++) {
                    AbstractC166997dE.A1W(A179, parcel.readInt());
                }
                return new InternalPaymentConfiguration(MSY.A08(parcel, InternalPaymentConfiguration.class), readString12, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), A179, A005, readInt11);
            case 65:
                return PartnerId.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 66:
                return PaymentContainerType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 67:
                return PaymentMode.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 68:
                return new InternalOffer(MSY.A08(parcel, InternalOffer.class), AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 69:
                return BillingAddressMode.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 70:
                return new InternalPaymentContainer(AbstractC37304Gc5.A00(parcel), parcel.readString(), parcel.readString());
            case 71:
                Object obj12 = null;
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    createFromParcel4 = null;
                } else {
                    createFromParcel4 = InternalPaymentItem.CREATOR.createFromParcel(parcel);
                }
                InternalPaymentItem internalPaymentItem = (InternalPaymentItem) createFromParcel4;
                int readInt13 = parcel.readInt();
                ArrayList A1710 = AbstractC25225BEi.A17(readInt13);
                int i11 = 0;
                int i12 = 0;
                while (i12 != readInt13) {
                    i12 = AbstractC37304Gc5.A01(parcel, InternalSummaryPaymentItem.CREATOR, A1710, i12);
                }
                int readInt14 = parcel.readInt();
                ArrayList A1711 = AbstractC25225BEi.A17(readInt14);
                int i13 = 0;
                while (i13 != readInt14) {
                    i13 = AbstractC37304Gc5.A01(parcel, InternalPaymentItem.CREATOR, A1711, i13);
                }
                int readInt15 = parcel.readInt();
                ArrayList A1712 = AbstractC25225BEi.A17(readInt15);
                int i14 = 0;
                while (i14 != readInt15) {
                    i14 = AbstractC37304Gc5.A01(parcel, InternalOffer.CREATOR, A1712, i14);
                }
                if (parcel.readInt() == 0) {
                    createFromParcel5 = null;
                } else {
                    createFromParcel5 = PaymentAddress.CREATOR.createFromParcel(parcel);
                }
                PaymentAddress paymentAddress = (PaymentAddress) createFromParcel5;
                if (parcel.readInt() != 0) {
                    obj12 = PaymentAddress.CREATOR.createFromParcel(parcel);
                }
                PaymentAddress paymentAddress2 = (PaymentAddress) obj12;
                int readInt16 = parcel.readInt();
                ArrayList A1713 = AbstractC25225BEi.A17(readInt16);
                while (i11 != readInt16) {
                    i11 = AbstractC37304Gc5.A01(parcel, InternalShippingOption.CREATOR, A1713, i11);
                }
                return new InternalPaymentDetails(MSY.A08(parcel, InternalPaymentDetails.class), internalPaymentItem, paymentAddress, paymentAddress2, parcel.readString(), A1710, A1711, A1712, A1713);
            case 72:
                Object obj13 = null;
                if (AbstractC37304Gc5.A00(parcel) != 0) {
                    obj13 = PaymentCurrencyAmount.CREATOR.createFromParcel(parcel);
                }
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                return new InternalPaymentItem(MSY.A08(parcel, InternalPaymentItem.class), (PaymentCurrencyAmount) obj13, AbstractC37304Gc5.A0W(parcel), readString13, readString14, parcel.readString(), parcel.readString());
            case 73:
                C14360o3.A0B(parcel, 0);
                return new InternalPaymentOptions(MSY.A08(parcel, InternalPaymentOptions.class), parcel.readInt(), parcel.readInt(), parcel.readInt(), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 74:
                C14360o3.A0B(parcel, 0);
                InternalPaymentConfiguration internalPaymentConfiguration = (InternalPaymentConfiguration) InternalPaymentConfiguration.CREATOR.createFromParcel(parcel);
                InternalPaymentDetails internalPaymentDetails = (InternalPaymentDetails) InternalPaymentDetails.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    createFromParcel6 = null;
                } else {
                    createFromParcel6 = InternalPaymentOptions.CREATOR.createFromParcel(parcel);
                }
                return new InternalPaymentRequest(MSY.A08(parcel, InternalPaymentRequest.class), internalPaymentConfiguration, internalPaymentDetails, (InternalPaymentOptions) createFromParcel6);
            case 75:
                String A0d7 = AbstractC37304Gc5.A0d(parcel);
                String readString15 = parcel.readString();
                InternalPaymentContainer internalPaymentContainer = (InternalPaymentContainer) InternalPaymentContainer.CREATOR.createFromParcel(parcel);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                String readString18 = parcel.readString();
                Object obj14 = null;
                if (parcel.readInt() == 0) {
                    createFromParcel7 = null;
                } else {
                    createFromParcel7 = PaymentAddress.CREATOR.createFromParcel(parcel);
                }
                PaymentAddress paymentAddress3 = (PaymentAddress) createFromParcel7;
                if (parcel.readInt() != 0) {
                    obj14 = PaymentAddress.CREATOR.createFromParcel(parcel);
                }
                PaymentAddress paymentAddress4 = (PaymentAddress) obj14;
                int readInt17 = parcel.readInt();
                ArrayList A1714 = AbstractC25225BEi.A17(readInt17);
                int i15 = 0;
                while (i15 != readInt17) {
                    i15 = AbstractC37304Gc5.A01(parcel, InternalOffer.CREATOR, A1714, i15);
                }
                return new InternalPaymentResponse(MSY.A08(parcel, InternalPaymentResponse.class), internalPaymentContainer, paymentAddress3, paymentAddress4, A0d7, readString15, readString16, readString17, readString18, A1714);
            case 76:
                C14360o3.A0B(parcel, 0);
                return new InternalSummaryPaymentItem(MSY.A08(parcel, InternalSummaryPaymentItem.class), (PaymentCurrencyAmount) PaymentCurrencyAmount.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt());
            case 77:
                C14360o3.A0B(parcel, 0);
                return new PaymentAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 78:
                return PaymentCtaType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 79:
                return new PaymentCurrencyAmount(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 80:
                return SummaryPaymentItemType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 81:
                C14360o3.A0B(parcel, 0);
                return new InternalShippingOption(MSY.A08(parcel, InternalShippingOption.class), (PaymentCurrencyAmount) PaymentCurrencyAmount.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 82:
                return ShippingOptionType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 83:
                return new AuthorizationRequest(parcel);
            case 84:
                return new AuthorizationResponse(parcel);
            case 85:
                String A0d8 = AbstractC37304Gc5.A0d(parcel);
                if (A0d8 == null) {
                    A0d8 = "";
                }
                String readString19 = parcel.readString();
                if (readString19 == null) {
                    readString19 = "";
                }
                String readString20 = parcel.readString();
                if (readString20 == null) {
                    readString20 = "";
                }
                String readString21 = parcel.readString();
                if (readString21 == null) {
                    readString21 = "";
                }
                String readString22 = parcel.readString();
                if (readString22 == null) {
                    readString22 = "";
                }
                String readString23 = parcel.readString();
                if (readString23 == null) {
                    readString23 = "";
                }
                String readString24 = parcel.readString();
                if (readString24 == null) {
                    readString24 = "";
                }
                return new FxCalAccount(A0d8, readString19, readString20, readString21, readString22, readString23, readString24, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 86:
                C14360o3.A0B(parcel, 0);
                C16930sl c16930sl = C16930sl.A00;
                parcel.readParcelableArray(FxCalAccount.class.getClassLoader());
                long readLong2 = parcel.readLong();
                String readString25 = parcel.readString();
                if (readString25 == null) {
                    readString25 = "UNSET";
                }
                return new FxCalAccountLinkageInfo(AbstractC41441vt.A00(readString25), c16930sl, readLong2);
            case 87:
                C14360o3.A0B(parcel, 0);
                C16930sl c16930sl2 = C16930sl.A00;
                parcel.readParcelableArray(FxCalAccount.class.getClassLoader());
                long readLong3 = parcel.readLong();
                String readString26 = parcel.readString();
                if (readString26 == null) {
                    readString26 = "UNSET";
                }
                return new FxCalAccountLinkageInfoForSwitcher(AbstractC41441vt.A00(readString26), c16930sl2, readLong3);
            case 88:
                String A0d9 = AbstractC37304Gc5.A0d(parcel);
                if (A0d9 == null) {
                    A0d9 = "";
                }
                String readString27 = parcel.readString();
                if (readString27 == null) {
                    readString27 = "";
                }
                String readString28 = parcel.readString();
                if (readString28 == null) {
                    readString28 = "";
                }
                String readString29 = parcel.readString();
                if (readString29 == null) {
                    readString29 = "";
                }
                String readString30 = parcel.readString();
                if (readString30 == null) {
                    readString30 = "";
                }
                String readString31 = parcel.readString();
                if (readString31 == null) {
                    readString31 = "";
                }
                String readString32 = parcel.readString();
                if (readString32 == null) {
                    readString32 = "";
                }
                int readInt18 = parcel.readInt();
                int readInt19 = parcel.readInt();
                int readInt20 = parcel.readInt();
                String readString33 = parcel.readString();
                boolean A02 = WDp.A02(parcel);
                String readString34 = parcel.readString();
                if (readString34 == null) {
                    readString34 = "";
                }
                return new FxCalAccountWithSwitcherInfo(A0d9, readString27, readString28, readString29, readString30, readString31, readString32, readString33, readString34, readInt18, readInt19, readInt20, A02);
            case 89:
                String A0d10 = AbstractC37304Gc5.A0d(parcel);
                long readLong4 = parcel.readLong();
                boolean z2 = false;
                boolean A1M3 = AbstractC167007dF.A1M(parcel.readInt());
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new RecipeSheetParams(A0d10, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), readLong4, A1M3, z2);
            case 90:
                return new FXAccessLibraryDeviceRequest(parcel);
            case 91:
                return new FXAccessLibraryDeviceRequestItem(parcel);
            case 92:
                return new FXDeviceItem(parcel);
            default:
                String A0d11 = AbstractC37304Gc5.A0d(parcel);
                String str = "";
                if (A0d11 == null) {
                    A0d11 = "";
                }
                String readString35 = parcel.readString();
                if (readString35 == null) {
                    readString35 = "";
                }
                String readString36 = parcel.readString();
                if (readString36 != null) {
                    str = readString36;
                }
                ?? obj15 = new Object();
                obj15.A02 = A0d11;
                obj15.A01 = readString35;
                obj15.A00 = str;
                return obj15;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new AdsTextTrustInfo[i];
            case 1:
                return new MediaTaggingInfo[i];
            case 2:
                return new MediaSuggestedProductTag[i];
            case 3:
                return new MediaSuggestedProductTagProductItemContainer[i];
            case 4:
                return new TagsInteractiveLayout.UnnamedTagSavedState[i];
            case 5:
                return new TrialMetricsData[i];
            case 6:
                return new MixedAttributionModel[i];
            case 7:
                return new MixedAttributionModel.MixedAttributionType[i];
            case 8:
                return new ColorTint[i];
            case 9:
                return new IconConfig.IconWithTextConfig[i];
            case 10:
                return new IconConfig.SimpleIconConfig[i];
            case 11:
                return new InfoItem[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new PrimerBottomSheetConfig[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new TitleIcon[i];
            case 14:
                return new SlideCardViewModel[i];
            case Process.SIGTERM /* 15 */:
                return new SlideCardViewModel.SlideCardSectionViewModel[i];
            case 16:
                return new CountryCodeTextView.SavedState[i];
            case 17:
                return new UpcomingEventReminderAction[i];
            case 18:
                return new ProductCollectionImpl[i];
            case Process.SIGSTOP /* 19 */:
                return new ProductWrapper[i];
            case 20:
                return new ScheduledLiveProductsMetadata[i];
            case 21:
                return new UnavailableProductImpl[i];
            case 22:
                return new UpcomingDropCampaignEventMetadataImpl[i];
            case 23:
                return new UpcomingEventImpl[i];
            case 24:
                return new UpcomingEventLiveMetadataImpl[i];
            case 25:
                return new FollowListData[i];
            case 26:
                return new SocialContextFollowListFragmentConfig[i];
            case 27:
                return new ImageManager$ImageListParam[i];
            case 28:
                return new IgRtcEventHeader[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new VideoFeedType[i];
            case 30:
                return new ExistingStandaloneFundraiserForFeedModel[i];
            case 31:
                return new SupportInboxDetailBottomSheetModel[i];
            case 32:
                return new Destination.Composer[i];
            case 33:
                return new Destination.Preview[i];
            case 34:
                return new WallGifPostItem[i];
            case 35:
                return new WallImage.CircularAvatar[i];
            case 36:
                return new WallImage.Drawable[i];
            case 37:
                return new WallInfo[i];
            case 38:
                return new WallLaunchConfig[i];
            case 39:
                return new WallMediaPostItem[i];
            case 40:
                return new WallMenuConfig[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new WallMusicPostItem[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new WallPostInfo[i];
            case 43:
                return new WallRepostItem[i];
            case 44:
                return new WallText.Raw[i];
            case 45:
                return new WallText.Res[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new WallTextPostItem[i];
            case 47:
                return new ImmersiveMediaInfo[i];
            case 48:
                return new ARNetworkClientWorkerResponse[i];
            case 49:
                return new AttachmentCounter[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new BugReportAttachment[i];
            case 51:
                return new BugReportAttachmentMediaSource[i];
            case 52:
                return new DBLSwitcherArgs[i];
            case 53:
                return new FullSheetOverflowSwitcherArgs[i];
            case 54:
                return new UserAccountInfo[i];
            case 55:
                return new CdsBottomSheetDimmingBehaviour.Default[i];
            case 56:
                return new CdsBottomSheetDimmingBehaviour.FixedAlpha[i];
            case 57:
                return new CdsBottomSheetTopSpan.Dp[i];
            case 58:
                return new CdsBottomSheetTopSpan.ScreenPercent[i];
            case 59:
                return new CdsOpenScreenCallerDismissCallback[i];
            case 60:
                return new CdsOpenScreenConfig$BottomSheetMargins[i];
            case 61:
                return new UserLoginCredential[i];
            case 62:
                return new ErrorCode[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new AdditionalInfoKey[i];
            case 64:
                return new InternalPaymentConfiguration[i];
            case 65:
                return new PartnerId[i];
            case 66:
                return new PaymentContainerType[i];
            case 67:
                return new PaymentMode[i];
            case 68:
                return new InternalOffer[i];
            case 69:
                return new BillingAddressMode[i];
            case 70:
                return new InternalPaymentContainer[i];
            case 71:
                return new InternalPaymentDetails[i];
            case 72:
                return new InternalPaymentItem[i];
            case 73:
                return new InternalPaymentOptions[i];
            case 74:
                return new InternalPaymentRequest[i];
            case 75:
                return new InternalPaymentResponse[i];
            case 76:
                return new InternalSummaryPaymentItem[i];
            case 77:
                return new PaymentAddress[i];
            case 78:
                return new PaymentCtaType[i];
            case 79:
                return new PaymentCurrencyAmount[i];
            case 80:
                return new SummaryPaymentItemType[i];
            case 81:
                return new InternalShippingOption[i];
            case 82:
                return new ShippingOptionType[i];
            case 83:
                return new AuthorizationRequest[i];
            case 84:
                return new AuthorizationResponse[i];
            case 85:
                return new FxCalAccount[i];
            case 86:
                return new FxCalAccountLinkageInfo[i];
            case 87:
                return new FxCalAccountLinkageInfoForSwitcher[i];
            case 88:
                return new FxCalAccountWithSwitcherInfo[i];
            case 89:
                return new RecipeSheetParams[i];
            case 90:
                return new FXAccessLibraryDeviceRequest[i];
            case 91:
                return new FXAccessLibraryDeviceRequestItem[i];
            case 92:
                return new FXDeviceItem[i];
            default:
                return new FxUnifiedLauncherAddedAccount[i];
        }
    }
}
