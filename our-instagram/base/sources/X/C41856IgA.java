package X;

import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.api.schemas.DynamicEffectState;
import com.instagram.api.schemas.MultiProductComponentDestinationType;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.api.schemas.ProductTileUCILoggingInfo;
import com.instagram.api.schemas.ProductTileUCILoggingInfoImpl;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.payments.DeliveryWindowInfo;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.rtc.RtcCallFunnelSessionId;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcCreateCallArgs;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.model.rtc.RtcJoinCallArgs;
import com.instagram.model.rtc.RtcThreadKey;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.model.shopping.CompoundProductId;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.model.shopping.ProductAutoTagMetadata;
import com.instagram.model.shopping.ProductContainer;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.ShoppingCameraSurveyMetadata;
import com.instagram.model.shopping.ShoppingHomeDestination;
import com.instagram.model.shopping.ThumbnailImage;
import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.clips.ClipsShoppingCTABar;
import com.instagram.model.shopping.clips.IGTVShoppingInfo;
import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import com.instagram.model.shopping.featuredproduct.SurfaceVisibility;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonStyleType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerIconType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveButtonDestinationType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetailImpl;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveNuxDisplayStyle;
import com.instagram.model.shopping.incentives.igfunded.SellerIncentiveBanner;
import com.instagram.model.shopping.incentives.igfunded.SellerIncentiveBannerBottomSheetContent;
import com.instagram.model.shopping.incentives.igfunded.SellerIncentiveBannerButton;
import com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata;
import com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadataImpl;
import com.instagram.model.shopping.productcollection.ProductCollectionTagInfo;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductCollectionFooter;
import com.instagram.model.shopping.productfeed.ProductCollectionFooterLink;
import com.instagram.model.shopping.productfeed.ProductCollectionHeader;
import com.instagram.model.shopping.productfeed.ProductCollectionTile;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformationImpl;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.model.shopping.reels.InstagramShopLink;
import com.instagram.model.shopping.reels.MultiProductSticker;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadata;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadataImpl;
import com.instagram.model.shopping.reels.ProductShareConfig;
import com.instagram.model.shopping.reels.ProductSticker;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelMultiProductLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.model.shopping.reels.ShoppingDestinationMetadata;
import com.instagram.model.shopping.reels.ShoppingIncentiveMetadata;
import com.instagram.model.shopping.sizechart.SizeChart;
import com.instagram.model.shopping.sizechart.SizeChartMeasurement;
import com.instagram.model.shopping.sizechart.SizeChartRow;
import com.instagram.model.shopping.video.ShoppingCreationConfig;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.model.simpleplace.SimplePlace;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import com.instagram.model.venue.Venue;
import com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.ARAudioEffectData;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.LyricsPhrase;
import com.instagram.music.common.model.MusicAssetBeatInfo;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicBrowserCategoryModel;
import com.instagram.music.common.model.MusicModelEffectPair;
import com.instagram.music.common.model.MusicSearchArtist;
import com.instagram.music.common.model.MusicSearchPlaylistType;
import com.instagram.music.common.model.OriginalPartsAttributionModel;
import com.instagram.music.common.model.TrackSnippet;
import com.instagram.music.common.model.WordOffset;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import com.instagram.newsfeed.model.PillsFilterCategory;
import com.instagram.nux.cal.model.ConnectContent;
import com.instagram.nux.cal.model.ContentText;
import com.instagram.nux.cal.model.DpActionContent;
import com.instagram.nux.cal.model.FXCalAgeInfo;
import com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent;
import com.instagram.nux.cal.model.FxAccountInfo;
import com.instagram.nux.cal.model.NuxConnectResponse;
import com.instagram.nux.cal.model.SignupContent;
import com.instagram.nux.common.HowItWorksNuxFragment$Row;
import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UnavailableProduct;
import com.instagram.user.model.UnavailableProductImpl;
import com.instagram.user.model.User;
import go.Seq;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: X.IgA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41856IgA implements Parcelable.Creator {
    public final int A00;

    public C41856IgA(int i) {
        this.A00 = i;
    }

    public static C41856IgA A00(int i) {
        return new C41856IgA(i);
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [com.instagram.music.common.model.WordOffset, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v13, types: [com.instagram.music.common.model.TrackSnippet, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17, types: [com.instagram.music.common.model.MusicModelEffectPair, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v18, types: [com.instagram.music.common.model.MusicBrowserCategoryModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v19, types: [com.instagram.music.common.model.MusicBrowseCategory, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.instagram.nux.cal.model.SignupContent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v20, types: [com.instagram.music.common.model.MusicAssetModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v27, types: [com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v29, types: [com.instagram.model.simpleplace.SimplePlace, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.instagram.nux.cal.model.NuxConnectResponse, java.lang.Object, X.1um] */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Object, com.instagram.model.shopping.video.ShoppingCreationConfig] */
    /* JADX WARN: Type inference failed for: r10v31, types: [java.lang.Object, com.instagram.model.shopping.sizechart.SizeChartRow] */
    /* JADX WARN: Type inference failed for: r10v32, types: [com.instagram.model.shopping.sizechart.SizeChartMeasurement, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.lang.Object, com.instagram.model.shopping.sizechart.SizeChart] */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.instagram.nux.cal.model.FxAccountInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v44, types: [java.lang.Object, com.instagram.model.shopping.reels.InstagramShopLink] */
    /* JADX WARN: Type inference failed for: r10v48, types: [com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v49, types: [com.instagram.model.shopping.productfeed.ProductTileMedia, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v50, types: [java.lang.Object, com.instagram.model.shopping.productfeed.ProductTile] */
    /* JADX WARN: Type inference failed for: r10v51, types: [com.instagram.model.shopping.productfeed.ProductFeedResponse, java.lang.Object, X.1um] */
    /* JADX WARN: Type inference failed for: r10v52, types: [com.instagram.model.shopping.productfeed.ProductFeedItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v53, types: [com.instagram.model.shopping.productfeed.ProductCollectionTile, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v54, types: [java.lang.Object, com.instagram.model.shopping.productfeed.ProductCollectionHeader] */
    /* JADX WARN: Type inference failed for: r10v55, types: [java.lang.Object, com.instagram.model.shopping.productfeed.ProductCollectionFooterLink] */
    /* JADX WARN: Type inference failed for: r10v7, types: [com.instagram.nux.cal.model.DpActionContent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v77, types: [com.instagram.model.shopping.ThumbnailImage, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v78, types: [com.instagram.model.shopping.ShoppingHomeDestination, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [com.instagram.nux.cal.model.ContentText, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v81, types: [com.instagram.model.shopping.ProductTag, java.lang.Object, com.instagram.tagging.model.Tag] */
    /* JADX WARN: Type inference failed for: r10v82, types: [com.instagram.model.shopping.ProductSource, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v84, types: [java.lang.Object, com.instagram.model.shopping.ProductGroup$VariantKey] */
    /* JADX WARN: Type inference failed for: r10v85, types: [com.instagram.model.shopping.ProductGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v86, types: [com.instagram.model.shopping.ProductContainer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v89, types: [java.lang.Object, com.instagram.model.shopping.ProductAREffectContainer] */
    /* JADX WARN: Type inference failed for: r10v9, types: [com.instagram.nux.cal.model.ConnectContent, java.lang.Object, X.1um] */
    /* JADX WARN: Type inference failed for: r10v91, types: [java.lang.Object, com.instagram.model.sharelater.ShareLaterMedia] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        EnumC185288Jt enumC185288Jt;
        ArrayList A17;
        ArrayList A172;
        ArrayList A173;
        Boolean valueOf;
        Boolean valueOf2;
        Double valueOf3;
        Object createFromParcel;
        ArrayList A174;
        Boolean valueOf4;
        Boolean valueOf5;
        ArrayList A175;
        Object createFromParcel2;
        Boolean valueOf6;
        ArrayList A176;
        ArrayList A177;
        Boolean valueOf7;
        Boolean valueOf8;
        EnumC39581Hdr valueOf9;
        ImageInfoImpl imageInfoImpl;
        C5GU valueOf10;
        Boolean valueOf11;
        Boolean valueOf12;
        Object createFromParcel3;
        ArrayList A178;
        Object createFromParcel4;
        Boolean valueOf13;
        Object createFromParcel5;
        C22P c22p;
        HashMap hashMap;
        Float valueOf14;
        HashMap hashMap2;
        Integer num;
        Integer num2;
        Integer num3;
        Object createFromParcel6;
        Object createFromParcel7;
        EnumC46283KeF valueOf15;
        switch (this.A00) {
            case 0:
                return new RtcCallKey(AbstractC37304Gc5.A0d(parcel));
            case 1:
                C7T3 valueOf16 = C7T3.valueOf(AbstractC37304Gc5.A0d(parcel));
                RtcThreadKey rtcThreadKey = (RtcThreadKey) RtcThreadKey.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf15 = null;
                } else {
                    valueOf15 = EnumC46283KeF.valueOf(parcel.readString());
                }
                return new RtcCallSource(valueOf15, valueOf16, rtcThreadKey);
            case 2:
                EnumC53137Neq valueOf17 = EnumC53137Neq.valueOf(AbstractC37304Gc5.A0d(parcel));
                RtcCallAudience rtcCallAudience = (RtcCallAudience) RtcCallAudience.CREATOR.createFromParcel(parcel);
                RtcCallSource rtcCallSource = (RtcCallSource) RtcCallSource.CREATOR.createFromParcel(parcel);
                boolean A1V = AbstractC37304Gc5.A1V(parcel);
                RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments = (RtcStartCoWatchPlaybackArguments) AbstractC37304Gc5.A04(parcel, RtcCreateCallArgs.class);
                boolean A1V2 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V3 = AbstractC37304Gc5.A1V(parcel);
                int readInt = parcel.readInt();
                EnumC46283KeF enumC46283KeF = null;
                if (parcel.readInt() == 0) {
                    createFromParcel7 = null;
                } else {
                    createFromParcel7 = RtcIgNotification.CREATOR.createFromParcel(parcel);
                }
                RtcIgNotification rtcIgNotification = (RtcIgNotification) createFromParcel7;
                String readString = parcel.readString();
                RtcCallFunnelSessionId rtcCallFunnelSessionId = (RtcCallFunnelSessionId) AbstractC37304Gc5.A04(parcel, RtcCreateCallArgs.class);
                if (parcel.readInt() != 0) {
                    enumC46283KeF = EnumC46283KeF.valueOf(parcel.readString());
                }
                return new RtcCreateCallArgs(enumC46283KeF, valueOf17, rtcCallAudience, rtcCallFunnelSessionId, rtcCallSource, rtcIgNotification, rtcStartCoWatchPlaybackArguments, readString, readInt, A1V, A1V2, A1V3);
            case 3:
                return new RtcIgNotification(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                EnumC53137Neq valueOf18 = EnumC53137Neq.valueOf(AbstractC37304Gc5.A0d(parcel));
                RtcCallAudience rtcCallAudience2 = (RtcCallAudience) RtcCallAudience.CREATOR.createFromParcel(parcel);
                RtcCallSource rtcCallSource2 = (RtcCallSource) RtcCallSource.CREATOR.createFromParcel(parcel);
                boolean A1V4 = AbstractC37304Gc5.A1V(parcel);
                RtcCallKey rtcCallKey = (RtcCallKey) RtcCallKey.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                int readInt2 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    createFromParcel6 = null;
                } else {
                    createFromParcel6 = RtcIgNotification.CREATOR.createFromParcel(parcel);
                }
                return new RtcJoinCallArgs(valueOf18, EnumC53138Ner.valueOf(parcel.readString()), rtcCallAudience2, (RtcCallFunnelSessionId) AbstractC37304Gc5.A04(parcel, RtcJoinCallArgs.class), rtcCallKey, rtcCallSource2, (RtcIgNotification) createFromParcel6, readString2, parcel.readString(), readInt2, A1V4);
            case 5:
                C14360o3.A0B(parcel, 0);
                return new RtcThreadKey((DirectThreadKey) AbstractC37304Gc5.A04(parcel, RtcThreadKey.class), parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                String A0d = AbstractC37304Gc5.A0d(parcel);
                String readString3 = parcel.readString();
                if (readString3.equals("INSTAGRAM")) {
                    num = C05F.A00;
                } else if (readString3.equals("FACEBOOK")) {
                    num = C05F.A01;
                } else if (readString3.equals("MESSAGING")) {
                    num = C05F.A0C;
                } else {
                    throw AbstractC166987dD.A12(readString3);
                }
                String readString4 = parcel.readString();
                if (readString4.equals("PHOTO")) {
                    num2 = C05F.A00;
                } else if (readString4.equals("VIDEO")) {
                    num2 = C05F.A01;
                } else if (readString4.equals(MSV.A00(695))) {
                    num2 = C05F.A0C;
                } else if (readString4.equals(MSV.A00(696))) {
                    num2 = C05F.A0N;
                } else if (readString4.equals("CAROUSEL")) {
                    num2 = C05F.A0Y;
                } else if (readString4.equals("IGTV")) {
                    num2 = C05F.A0j;
                } else if (readString4.equals("REELS")) {
                    num2 = C05F.A0u;
                } else if (readString4.equals("UNKNOWN")) {
                    num2 = C05F.A15;
                } else {
                    throw AbstractC166987dD.A12(readString4);
                }
                String readString5 = parcel.readString();
                if (readString5.equals("DEEP_LINK")) {
                    num3 = C05F.A00;
                } else if (readString5.equals("THREAD")) {
                    num3 = C05F.A01;
                } else if (readString5.equals("SHARE_SHEET")) {
                    num3 = C05F.A0C;
                } else if (readString5.equals("IN_CALL")) {
                    num3 = C05F.A0N;
                } else if (readString5.equals("IN_CALL_SHARESHEET")) {
                    num3 = C05F.A0Y;
                } else if (readString5.equals("THREAD_SINGLE_FEED")) {
                    num3 = C05F.A0j;
                } else if (readString5.equals("DIRECT_SHARE")) {
                    num3 = C05F.A0u;
                } else if (readString5.equals("DIRECT_SHARE_LOCAL")) {
                    num3 = C05F.A15;
                } else if (readString5.equals("BLOKS")) {
                    num3 = C05F.A1F;
                } else if (readString5.equals("ROOMS_TAB_WATCH_TOGETHER")) {
                    num3 = C05F.A1I;
                } else if (readString5.equals("REELS_TOGETHER")) {
                    num3 = C05F.A02;
                } else {
                    throw AbstractC166987dD.A12(readString5);
                }
                return new RtcStartCoWatchPlaybackArguments(num, num2, num3, AbstractC37304Gc5.A0V(parcel), A0d, parcel.readString());
            case 7:
                ?? obj = new Object();
                obj.A04 = parcel.readString();
                String readString6 = parcel.readString();
                readString6.getClass();
                obj.A05 = readString6;
                EnumC40111tc A00 = AbstractC40091ta.A00(AbstractC37304Gc5.A0U(parcel));
                A00.getClass();
                obj.A02 = A00;
                obj.A03 = (Venue) AbstractC37304Gc5.A04(parcel, Venue.class);
                boolean z = false;
                obj.A08 = AbstractC167007dF.A1P(parcel.readInt(), 1);
                boolean[] zArr = new boolean[C05F.A00(1).length];
                parcel.readBooleanArray(zArr);
                obj.A07 = zArr[0];
                if (parcel.readInt() != 0) {
                    z = true;
                }
                obj.A09 = z;
                Parcelable A04 = AbstractC37304Gc5.A04(parcel, MediaUploadMetadata.class);
                A04.getClass();
                obj.A00 = (MediaUploadMetadata) A04;
                return obj;
            case 8:
                return new CompoundProductId(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 9:
                ?? obj2 = new Object();
                Parcelable A042 = AbstractC37304Gc5.A04(parcel, ProductItemWithAR.class);
                A042.getClass();
                obj2.A00 = (ProductItemWithAR) A042;
                obj2.A01 = AbstractC37304Gc5.A1X(parcel);
                return obj2;
            case 10:
                C14360o3.A0B(parcel, 0);
                ContainerEffectEnum containerEffectEnum = (ContainerEffectEnum) AbstractC37304Gc5.A04(parcel, ProductArEffectMetadata.class);
                DynamicEffectState dynamicEffectState = (DynamicEffectState) AbstractC37304Gc5.A04(parcel, ProductArEffectMetadata.class);
                String readString7 = parcel.readString();
                Object obj3 = null;
                if (parcel.readInt() == 0) {
                    hashMap2 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    hashMap2 = new HashMap(readInt3);
                    for (int i = 0; i != readInt3; i++) {
                        hashMap2.put(parcel.readString(), parcel.readString());
                    }
                }
                String readString8 = parcel.readString();
                if (parcel.readInt() != 0) {
                    obj3 = EffectThumbnailImageDict.CREATOR.createFromParcel(parcel);
                }
                return new ProductArEffectMetadata(containerEffectEnum, dynamicEffectState, (EffectThumbnailImageDict) obj3, readString7, readString8, hashMap2);
            case 11:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    valueOf14 = null;
                } else {
                    valueOf14 = Float.valueOf(parcel.readFloat());
                }
                return new ProductAutoTagMetadata((PointF) AbstractC37304Gc5.A04(parcel, ProductAutoTagMetadata.class), valueOf14);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(parcel, 0);
                ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) AbstractC37304Gc5.A04(parcel, Product.class);
                UnavailableProductImpl unavailableProductImpl = (UnavailableProductImpl) AbstractC37304Gc5.A04(parcel, UnavailableProduct.class);
                ?? obj4 = new Object();
                obj4.A00 = productDetailsProductItemDict;
                obj4.A01 = unavailableProductImpl;
                return obj4;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                ?? obj5 = new Object();
                ArrayList A1E = AbstractC166987dD.A1E();
                obj5.A01 = A1E;
                parcel.readList(A1E, Product.class.getClassLoader());
                ArrayList A1E2 = AbstractC166987dD.A1E();
                obj5.A02 = A1E2;
                parcel.readList(A1E2, ProductVariantDimension.class.getClassLoader());
                int readInt4 = parcel.readInt();
                if (readInt4 == -1) {
                    hashMap = null;
                } else {
                    hashMap = new HashMap(readInt4);
                    for (int i2 = 0; i2 < readInt4; i2++) {
                        Parcelable A043 = AbstractC37304Gc5.A04(parcel, ProductGroup.VariantKey.class);
                        ArrayList A1E3 = AbstractC166987dD.A1E();
                        parcel.readList(A1E3, Product.class.getClassLoader());
                        hashMap.put(A043, A1E3);
                    }
                }
                obj5.A00 = hashMap;
                return obj5;
            case 14:
                ?? obj6 = new Object();
                String readString9 = parcel.readString();
                readString9.getClass();
                obj6.A00 = readString9;
                String readString10 = parcel.readString();
                readString10.getClass();
                obj6.A01 = readString10;
                return obj6;
            case Process.SIGTERM /* 15 */:
                C14360o3.A0B(parcel, 0);
                return new ProductItemWithAR((ProductArEffectMetadata) ProductArEffectMetadata.CREATOR.createFromParcel(parcel), (ProductDetailsProductItemDict) AbstractC37304Gc5.A04(parcel, ProductItemWithAR.class));
            case 16:
                ?? obj7 = new Object();
                obj7.A01 = parcel.readString();
                obj7.A00 = I3J.A00(parcel.readString());
                obj7.A04 = parcel.readString();
                obj7.A03 = parcel.readString();
                obj7.A02 = parcel.readString();
                return obj7;
            case 17:
                ?? tag = new com.instagram.tagging.model.Tag(parcel, Product.class.getClassLoader());
                tag.A03 = null;
                tag.A01 = null;
                tag.A03 = parcel.readString();
                tag.A01 = (ProductAutoTagMetadata) AbstractC37304Gc5.A04(parcel, ProductAutoTagMetadata.class);
                return tag;
            case 18:
                return new ProductVariantDimension(parcel);
            case Process.SIGSTOP /* 19 */:
                String A0d2 = AbstractC37304Gc5.A0d(parcel);
                C14360o3.A0A(A0d2);
                Parcelable A044 = AbstractC37304Gc5.A04(parcel, User.class);
                C14360o3.A0A(A044);
                User user = (User) A044;
                String readString11 = parcel.readString();
                C14360o3.A0A(readString11);
                Serializable readSerializable = parcel.readSerializable();
                if (!(readSerializable instanceof C22P) || (c22p = (C22P) readSerializable) == null) {
                    c22p = C22P.A5N;
                }
                return new ShoppingCameraSurveyMetadata(c22p, user, A0d2, readString11, parcel.readInt(), parcel.readLong());
            case 20:
                EnumC39588Hdy enumC39588Hdy = (EnumC39588Hdy) EnumC39588Hdy.A01.get(AbstractC37304Gc5.A0d(parcel));
                if (enumC39588Hdy == null) {
                    enumC39588Hdy = EnumC39588Hdy.A0S;
                }
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                ArrayList A1E4 = AbstractC166987dD.A1E();
                parcel.readStringList(A1E4);
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                ?? obj8 = new Object();
                obj8.A00 = enumC39588Hdy;
                obj8.A02 = readString12;
                obj8.A03 = readString13;
                obj8.A04 = readString14;
                obj8.A07 = A1E4;
                obj8.A01 = readString15;
                obj8.A05 = readString16;
                obj8.A06 = null;
                return obj8;
            case 21:
                C14360o3.A0B(parcel, 0);
                ?? obj9 = new Object();
                obj9.A00 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                return obj9;
            case 22:
                C14360o3.A0B(parcel, 0);
                return ProductCollectionReviewStatus.values()[parcel.readInt()];
            case 23:
                return new ClipsShoppingCTABar(AbstractC37304Gc5.A0T(parcel, AbstractC37304Gc5.A00(parcel)), AbstractC37304Gc5.A0W(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 24:
                ArrayList arrayList = null;
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    createFromParcel5 = null;
                } else {
                    createFromParcel5 = ClipsShoppingCTABar.CREATOR.createFromParcel(parcel);
                }
                ClipsShoppingCTABar clipsShoppingCTABar = (ClipsShoppingCTABar) createFromParcel5;
                ProductCollection productCollection = (ProductCollection) AbstractC37304Gc5.A04(parcel, IGTVShoppingInfo.class);
                User user2 = (User) AbstractC37304Gc5.A04(parcel, IGTVShoppingInfo.class);
                if (parcel.readInt() != 0) {
                    int readInt5 = parcel.readInt();
                    arrayList = AbstractC25225BEi.A17(readInt5);
                    for (int i3 = 0; i3 != readInt5; i3++) {
                        AbstractC37304Gc5.A0r(parcel, IGTVShoppingInfo.class, arrayList);
                    }
                }
                return new IGTVShoppingInfo(clipsShoppingCTABar, productCollection, user2, arrayList);
            case 25:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    valueOf13 = null;
                } else {
                    valueOf13 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new DropsLaunchAnimation(valueOf13);
            case 26:
                C14360o3.A0B(parcel, 0);
                return SurfaceVisibility.values()[parcel.readInt()];
            case 27:
                Object obj10 = null;
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    createFromParcel3 = null;
                } else {
                    createFromParcel3 = IgFundedIncentiveBannerIconType.CREATOR.createFromParcel(parcel);
                }
                IgFundedIncentiveBannerIconType igFundedIncentiveBannerIconType = (IgFundedIncentiveBannerIconType) createFromParcel3;
                Integer A0Y = AbstractC37304Gc5.A0Y(parcel);
                Integer A0Y2 = AbstractC37304Gc5.A0Y(parcel);
                String readString17 = parcel.readString();
                if (parcel.readInt() == 0) {
                    A178 = null;
                } else {
                    int readInt6 = parcel.readInt();
                    A178 = AbstractC25225BEi.A17(readInt6);
                    for (int i4 = 0; i4 != readInt6; i4++) {
                        AbstractC37304Gc5.A0r(parcel, IgFundedIncentive.class, A178);
                    }
                }
                if (parcel.readInt() == 0) {
                    createFromParcel4 = null;
                } else {
                    createFromParcel4 = IgFundedIncentiveBannerButton.CREATOR.createFromParcel(parcel);
                }
                IgFundedIncentiveBannerButton igFundedIncentiveBannerButton = (IgFundedIncentiveBannerButton) createFromParcel4;
                boolean A1V5 = AbstractC37304Gc5.A1V(parcel);
                String readString18 = parcel.readString();
                boolean A1V6 = AbstractC37304Gc5.A1V(parcel);
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                IgFundedIncentiveNuxDisplayStyle igFundedIncentiveNuxDisplayStyle = (IgFundedIncentiveNuxDisplayStyle) IgFundedIncentiveNuxDisplayStyle.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    obj10 = IgFundedIncentiveBannerButton.CREATOR.createFromParcel(parcel);
                }
                return new IgFundedIncentive(igFundedIncentiveBannerButton, (IgFundedIncentiveBannerButton) obj10, igFundedIncentiveBannerIconType, igFundedIncentiveNuxDisplayStyle, A0Y, A0Y2, readString17, readString18, readString19, readString20, parcel.readString(), A178, A1V5, A1V6, AbstractC37304Gc5.A1V(parcel));
            case 28:
                C14360o3.A0B(parcel, 0);
                return new IgFundedIncentiveBannerButton((IgFundedIncentiveBannerButtonStyleType) IgFundedIncentiveBannerButtonStyleType.CREATOR.createFromParcel(parcel), (IgFundedIncentiveButtonDestinationType) IgFundedIncentiveButtonDestinationType.CREATOR.createFromParcel(parcel), parcel.readString());
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C14360o3.A0B(parcel, 0);
                return IgFundedIncentiveBannerButtonStyleType.values()[parcel.readInt()];
            case 30:
                C14360o3.A0B(parcel, 0);
                return IgFundedIncentiveBannerIconType.values()[parcel.readInt()];
            case 31:
                C14360o3.A0B(parcel, 0);
                return IgFundedIncentiveButtonDestinationType.values()[parcel.readInt()];
            case 32:
                return new IgFundedIncentiveDetailImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 33:
                C14360o3.A0B(parcel, 0);
                return IgFundedIncentiveNuxDisplayStyle.values()[parcel.readInt()];
            case 34:
                String A0d3 = AbstractC37304Gc5.A0d(parcel);
                ArrayList arrayList2 = null;
                if (parcel.readInt() != 0) {
                    int readInt7 = parcel.readInt();
                    arrayList2 = AbstractC25225BEi.A17(readInt7);
                    int i5 = 0;
                    while (i5 != readInt7) {
                        i5 = AbstractC37304Gc5.A01(parcel, SellerIncentiveBannerBottomSheetContent.CREATOR, arrayList2, i5);
                    }
                }
                return new SellerIncentiveBanner(AbstractC37304Gc5.A0Y(parcel), AbstractC37304Gc5.A0W(parcel), A0d3, parcel.readString(), arrayList2, parcel.readLong());
            case 35:
                return new SellerIncentiveBannerBottomSheetContent(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 36:
                return new SellerIncentiveBannerButton(AbstractC37304Gc5.A0d(parcel));
            case 37:
                C14360o3.A0B(parcel, 0);
                DeliveryWindowInfo deliveryWindowInfo = (DeliveryWindowInfo) AbstractC37304Gc5.A04(parcel, ShippingAndReturnsMetadata.class);
                Integer num4 = null;
                if (parcel.readInt() == 0) {
                    valueOf12 = null;
                } else {
                    valueOf12 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                CurrencyAmountInfo currencyAmountInfo = (CurrencyAmountInfo) AbstractC37304Gc5.A04(parcel, ShippingAndReturnsMetadata.class);
                if (parcel.readInt() != 0) {
                    num4 = AbstractC37304Gc5.A0U(parcel);
                }
                return new ShippingAndReturnsMetadata(currencyAmountInfo, (CurrencyAmountInfo) AbstractC37304Gc5.A04(parcel, ShippingAndReturnsMetadata.class), deliveryWindowInfo, valueOf12, num4, parcel.readString());
            case 38:
                C14360o3.A0B(parcel, 0);
                return new ProductCollectionCoverImpl((ProductImageContainer) AbstractC37304Gc5.A04(parcel, ProductCollectionCoverImpl.class), (IgShowreelNativeAnimation) AbstractC37304Gc5.A04(parcel, ProductCollectionCoverImpl.class));
            case 39:
                C14360o3.A0B(parcel, 0);
                return new ProductCollectionDropsMetadataImpl(AbstractC37304Gc5.A0V(parcel), parcel.readLong(), AbstractC37304Gc5.A1V(parcel));
            case 40:
                String A0d4 = AbstractC37304Gc5.A0d(parcel);
                String readString21 = parcel.readString();
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf11 = null;
                } else {
                    valueOf11 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new ProductCollectionTagInfo(valueOf11, A0d4, readString21, readString22, readString23);
            case Seq.NULL_REFNUM /* 41 */:
                return new MultiProductComponent(parcel);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C14360o3.A0B(parcel, 0);
                ProductCollectionFooter productCollectionFooter = new ProductCollectionFooter();
                productCollectionFooter.A00 = parcel.readString();
                parcel.readTypedList(productCollectionFooter.A01, ProductCollectionFooterLink.CREATOR);
                return productCollectionFooter;
            case 43:
                ?? obj11 = new Object();
                obj11.A00 = (EnumC906041v) EnumC906041v.A01.get(parcel.readInt());
                obj11.A02 = parcel.readString();
                obj11.A01 = parcel.readString();
                return obj11;
            case 44:
                C14360o3.A0B(parcel, 0);
                ProductCollectionCoverImpl productCollectionCoverImpl = (ProductCollectionCoverImpl) AbstractC37304Gc5.A04(parcel, ProductCollectionHeader.class);
                String readString24 = parcel.readString();
                int readInt8 = parcel.readInt();
                ArrayList A179 = AbstractC25225BEi.A17(readInt8);
                for (int i6 = 0; i6 != readInt8; i6++) {
                    AbstractC37304Gc5.A0r(parcel, ProductCollectionHeader.class, A179);
                }
                String readString25 = parcel.readString();
                String readString26 = parcel.readString();
                ProductCollectionDropsMetadataImpl productCollectionDropsMetadataImpl = (ProductCollectionDropsMetadataImpl) AbstractC37304Gc5.A04(parcel, ProductCollectionHeader.class);
                AbstractC167027dH.A13(productCollectionCoverImpl, readString24, A179);
                ?? obj12 = new Object();
                obj12.A00 = productCollectionCoverImpl;
                obj12.A04 = readString24;
                obj12.A05 = A179;
                obj12.A03 = readString25;
                obj12.A02 = readString26;
                obj12.A01 = productCollectionDropsMetadataImpl;
                return obj12;
            case 45:
                String A0d5 = AbstractC37304Gc5.A0d(parcel);
                Long l = null;
                if (parcel.readInt() == 0) {
                    valueOf10 = null;
                } else {
                    valueOf10 = C5GU.valueOf(parcel.readString());
                }
                String readString27 = parcel.readString();
                String readString28 = parcel.readString();
                String readString29 = parcel.readString();
                User user3 = (User) AbstractC37304Gc5.A04(parcel, ProductCollectionTile.class);
                ProductCollectionCoverImpl productCollectionCoverImpl2 = (ProductCollectionCoverImpl) AbstractC37304Gc5.A04(parcel, ProductCollectionTile.class);
                if (parcel.readInt() != 0) {
                    l = Long.valueOf(parcel.readLong());
                }
                ?? obj13 = new Object();
                obj13.A04 = A0d5;
                obj13.A01 = valueOf10;
                obj13.A05 = readString27;
                obj13.A07 = readString28;
                obj13.A06 = readString29;
                obj13.A02 = user3;
                obj13.A00 = productCollectionCoverImpl2;
                obj13.A03 = l;
                return obj13;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                ?? obj14 = new Object();
                obj14.A06 = C05F.A0C;
                obj14.A01 = (MultiProductComponent) AbstractC37304Gc5.A04(parcel, MultiProductComponent.class);
                obj14.A04 = (ProductDetailsProductItemDict) AbstractC37304Gc5.A04(parcel, Product.class);
                obj14.A05 = (UnavailableProductImpl) AbstractC37304Gc5.A04(parcel, UnavailableProductImpl.class);
                obj14.A02 = (ProductTile) AbstractC37304Gc5.A04(parcel, ProductTile.class);
                obj14.A03 = (ProductTileMedia) AbstractC37304Gc5.A04(parcel, ProductTileMedia.class);
                obj14.A04();
                return obj14;
            case 47:
                ?? c40791um = new C40791um();
                c40791um.A03 = AbstractC166987dD.A1E();
                boolean z2 = true;
                if (parcel.readInt() != 1) {
                    z2 = false;
                }
                c40791um.A04 = z2;
                c40791um.A01 = parcel.readString();
                c40791um.A00 = parcel.readInt();
                parcel.readList(c40791um.A03, ProductFeedItem.class.getClassLoader());
                c40791um.A02 = parcel.readString();
                return c40791um;
            case 48:
                ?? obj15 = new Object();
                ProductDetailsProductItemDict productDetailsProductItemDict2 = (ProductDetailsProductItemDict) AbstractC37304Gc5.A04(parcel, ProductDetailsProductItemDict.class);
                obj15.A08 = productDetailsProductItemDict2;
                obj15.A07 = AbstractC38048Gob.A01(productDetailsProductItemDict2);
                obj15.A02 = (ProductTileProductImpl) AbstractC37304Gc5.A04(parcel, ProductTileProductImpl.class);
                obj15.A00 = (ProductCardSubtitleType) parcel.readSerializable();
                obj15.A01 = (ProductTileMetadataImpl) AbstractC37304Gc5.A04(parcel, ProductTileMetadataImpl.class);
                obj15.A06 = (ProductTileMedia) AbstractC37304Gc5.A04(parcel, ProductTileMedia.class);
                obj15.A04 = (RankingInfo) AbstractC37304Gc5.A04(parcel, RankingInfo.class);
                obj15.A03 = (ProductTileUCILoggingInfoImpl) AbstractC37304Gc5.A04(parcel, ProductTileUCILoggingInfo.class);
                return obj15;
            case 49:
                ?? obj16 = new Object();
                String readString30 = parcel.readString();
                readString30.getClass();
                obj16.A02 = readString30;
                ImageInfo imageInfo = (ImageInfo) AbstractC37304Gc5.A04(parcel, ImageInfo.class);
                if (imageInfo != null) {
                    imageInfoImpl = imageInfo.F5B();
                } else {
                    imageInfoImpl = null;
                }
                obj16.A00 = imageInfoImpl;
                obj16.A03 = parcel.readString();
                Parcelable A045 = AbstractC37304Gc5.A04(parcel, User.class);
                A045.getClass();
                obj16.A01 = (User) A045;
                return obj16;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                String A0d6 = AbstractC37304Gc5.A0d(parcel);
                String readString31 = parcel.readString();
                long readLong = parcel.readLong();
                String readString32 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf9 = null;
                } else {
                    valueOf9 = EnumC39581Hdr.valueOf(parcel.readString());
                }
                long readLong2 = parcel.readLong();
                long readLong3 = parcel.readLong();
                AbstractC25234BEr.A1P(A0d6, readString31, readString32);
                ?? obj17 = new Object();
                obj17.A04 = A0d6;
                obj17.A05 = readString31;
                obj17.A00 = readLong;
                obj17.A06 = readString32;
                obj17.A03 = valueOf9;
                obj17.A02 = readLong2;
                obj17.A01 = readLong3;
                return obj17;
            case 51:
                return new TaggingFeedSessionInformation(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 52:
                String A0d7 = AbstractC37304Gc5.A0d(parcel);
                Long l2 = null;
                if (parcel.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                if (parcel.readInt() == 0) {
                    valueOf8 = null;
                } else {
                    valueOf8 = Boolean.valueOf(AbstractC37304Gc5.A1W(parcel));
                }
                if (parcel.readInt() != 0) {
                    l2 = Long.valueOf(parcel.readLong());
                }
                return new ProductLaunchInformationImpl(valueOf7, valueOf8, l2, A0d7);
            case 53:
                C14360o3.A0B(parcel, 0);
                return ProductVariantVisualStyle.values()[parcel.readInt()];
            case 54:
                C14360o3.A0B(parcel, 0);
                boolean z3 = true;
                if (parcel.readInt() != 1) {
                    z3 = false;
                }
                ?? obj18 = new Object();
                obj18.A00 = z3;
                return obj18;
            case 55:
                String A0d8 = AbstractC37304Gc5.A0d(parcel);
                ArrayList arrayList3 = null;
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                if (parcel.readInt() == 0) {
                    A176 = null;
                } else {
                    int readInt9 = parcel.readInt();
                    A176 = AbstractC25225BEi.A17(readInt9);
                    for (int i7 = 0; i7 != readInt9; i7++) {
                        AbstractC37304Gc5.A0r(parcel, MultiProductSticker.class, A176);
                    }
                }
                String readString33 = parcel.readString();
                if (parcel.readInt() == 0) {
                    A177 = null;
                } else {
                    int readInt10 = parcel.readInt();
                    A177 = AbstractC25225BEi.A17(readInt10);
                    for (int i8 = 0; i8 != readInt10; i8++) {
                        AbstractC37304Gc5.A0r(parcel, MultiProductSticker.class, A177);
                    }
                }
                if (parcel.readInt() != 0) {
                    int readInt11 = parcel.readInt();
                    arrayList3 = AbstractC25225BEi.A17(readInt11);
                    for (int i9 = 0; i9 != readInt11; i9++) {
                        AbstractC37304Gc5.A0r(parcel, MultiProductSticker.class, arrayList3);
                    }
                }
                return new MultiProductSticker(valueOf6, A0d8, readString33, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), A176, A177, arrayList3);
            case 56:
                String A0d9 = AbstractC37304Gc5.A0d(parcel);
                String readString34 = parcel.readString();
                if (parcel.readInt() == 0) {
                    createFromParcel2 = null;
                } else {
                    createFromParcel2 = ShoppingDestinationMetadata.CREATOR.createFromParcel(parcel);
                }
                return new ProductCollectionLink((MultiProductComponentDestinationType) AbstractC37304Gc5.A04(parcel, ProductCollectionLink.class), (ShoppingDestinationMetadata) createFromParcel2, A0d9, readString34, parcel.readString(), parcel.readString());
            case 57:
                return new ProductCollectionLinkMetadataImpl((ProductCollectionReviewStatus) AbstractC37304Gc5.A04(parcel, ProductCollectionLinkMetadataImpl.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 58:
                C14360o3.A0B(parcel, 0);
                return new ProductShareConfig(parcel);
            case 59:
                String A0d10 = AbstractC37304Gc5.A0d(parcel);
                DropsLaunchAnimation dropsLaunchAnimation = (DropsLaunchAnimation) AbstractC37304Gc5.A04(parcel, ProductSticker.class);
                DropsEventPageNavigationMetadata dropsEventPageNavigationMetadata = (DropsEventPageNavigationMetadata) AbstractC37304Gc5.A04(parcel, ProductSticker.class);
                String readString35 = parcel.readString();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                String readString36 = parcel.readString();
                ProductDetailsProductItemDict productDetailsProductItemDict3 = (ProductDetailsProductItemDict) AbstractC37304Gc5.A04(parcel, ProductSticker.class);
                if (parcel.readInt() == 0) {
                    A175 = null;
                } else {
                    int readInt12 = parcel.readInt();
                    A175 = AbstractC25225BEi.A17(readInt12);
                    for (int i10 = 0; i10 != readInt12; i10++) {
                        AbstractC37304Gc5.A0r(parcel, ProductSticker.class, A175);
                    }
                }
                String readString37 = parcel.readString();
                String readString38 = parcel.readString();
                TextReviewStatus textReviewStatus = (TextReviewStatus) AbstractC37304Gc5.A04(parcel, ProductSticker.class);
                String readString39 = parcel.readString();
                String readString40 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(AbstractC37304Gc5.A1W(parcel));
                }
                return new ProductSticker(dropsEventPageNavigationMetadata, textReviewStatus, dropsLaunchAnimation, productDetailsProductItemDict3, valueOf4, valueOf5, bool, A0d10, readString35, readString36, readString37, readString38, readString39, readString40, A175);
            case 60:
                return new ProfileShopLink((SellerShoppableFeedType) AbstractC37304Gc5.A04(parcel, ProfileShopLink.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 61:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    A174 = null;
                } else {
                    int readInt13 = parcel.readInt();
                    A174 = AbstractC25225BEi.A17(readInt13);
                    for (int i11 = 0; i11 != readInt13; i11++) {
                        AbstractC37304Gc5.A0r(parcel, ReelMultiProductLink.class, A174);
                    }
                }
                return new ReelMultiProductLink(A174);
            case 62:
                C14360o3.A0B(parcel, 0);
                return new ReelProductLink((ProductDetailsProductItemDict) AbstractC37304Gc5.A04(parcel, ReelProductLink.class));
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = ShoppingIncentiveMetadata.CREATOR.createFromParcel(parcel);
                }
                return new ShoppingDestinationMetadata((ProductCollectionLinkMetadata) AbstractC37304Gc5.A04(parcel, ShoppingDestinationMetadata.class), (ShoppingIncentiveMetadata) createFromParcel);
            case 64:
                return new ShoppingIncentiveMetadata(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 65:
                C14360o3.A0B(parcel, 0);
                ?? obj19 = new Object();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                if (createStringArrayList != null) {
                    obj19.A01 = createStringArrayList;
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(SizeChartRow.CREATOR);
                    if (createTypedArrayList != null) {
                        obj19.A02 = createTypedArrayList;
                        obj19.A00 = parcel.readString();
                        return obj19;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 66:
                C14360o3.A0B(parcel, 0);
                ?? obj20 = new Object();
                String readString41 = parcel.readString();
                if (readString41 != null) {
                    obj20.A02 = readString41;
                    Integer num5 = null;
                    if (parcel.readByte() == 0) {
                        obj20.A00 = null;
                    } else {
                        obj20.A00 = AbstractC37304Gc5.A0U(parcel);
                    }
                    if (parcel.readByte() != 0) {
                        num5 = AbstractC37304Gc5.A0U(parcel);
                    }
                    obj20.A01 = num5;
                    obj20.A03 = parcel.readString();
                    return obj20;
                }
                throw AbstractC166997dE.A0g();
            case 67:
                C14360o3.A0B(parcel, 0);
                ?? obj21 = new Object();
                String readString42 = parcel.readString();
                if (readString42 != null) {
                    obj21.A00 = readString42;
                    ArrayList createTypedArrayList2 = parcel.createTypedArrayList(SizeChartMeasurement.CREATOR);
                    if (createTypedArrayList2 != null) {
                        obj21.A01 = createTypedArrayList2;
                        return obj21;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 68:
                C14360o3.A0B(parcel, 0);
                ?? obj22 = new Object();
                obj22.A01 = AbstractC37304Gc5.A1X(parcel);
                obj22.A00 = parcel.readInt();
                return obj22;
            case 69:
                ?? obj23 = new Object();
                obj23.A05 = parcel.readString();
                obj23.A01 = Double.valueOf(parcel.readDouble());
                obj23.A02 = Double.valueOf(parcel.readDouble());
                obj23.A06 = parcel.readString();
                obj23.A04 = parcel.readString();
                obj23.A03 = parcel.readString();
                obj23.A00 = (User) AbstractC37304Gc5.A04(parcel, User.class);
                return obj23;
            case 70:
                String A0d11 = AbstractC37304Gc5.A0d(parcel);
                ArrayList arrayList4 = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(AbstractC37304Gc5.A1W(parcel));
                }
                String readString43 = parcel.readString();
                ProductImageContainer productImageContainer = (ProductImageContainer) AbstractC37304Gc5.A04(parcel, UpcomingEventMediaImpl.class);
                ImageInfo imageInfo2 = (ImageInfo) AbstractC37304Gc5.A04(parcel, UpcomingEventMediaImpl.class);
                String readString44 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Double.valueOf(parcel.readDouble());
                }
                if (parcel.readInt() != 0) {
                    int readInt14 = parcel.readInt();
                    arrayList4 = AbstractC25225BEi.A17(readInt14);
                    for (int i12 = 0; i12 != readInt14; i12++) {
                        AbstractC37304Gc5.A0r(parcel, UpcomingEventMediaImpl.class, arrayList4);
                    }
                }
                return new UpcomingEventMediaImpl(imageInfo2, productImageContainer, valueOf, valueOf2, valueOf3, A0d11, readString43, readString44, arrayList4);
            case 71:
                C14360o3.A0B(parcel, 0);
                ?? obj24 = new Object();
                obj24.A00 = 0;
                obj24.A02 = null;
                obj24.A01 = "incomplete";
                obj24.A00 = parcel.readInt();
                obj24.A02 = parcel.readString();
                obj24.A01 = parcel.readString();
                return obj24;
            case 72:
                return AudioTrackType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 73:
                C14360o3.A0B(parcel, 0);
                double readDouble = parcel.readDouble();
                double readDouble2 = parcel.readDouble();
                double readDouble3 = parcel.readDouble();
                double readDouble4 = parcel.readDouble();
                String readString45 = parcel.readString();
                String readString46 = parcel.readString();
                String readString47 = parcel.readString();
                if (parcel.readInt() == 0) {
                    A172 = null;
                } else {
                    int readInt15 = parcel.readInt();
                    A172 = AbstractC25225BEi.A17(readInt15);
                    int i13 = 0;
                    while (i13 != readInt15) {
                        i13 = AbstractC37304Gc5.A01(parcel, MusicAssetBeatInfo.CREATOR, A172, i13);
                    }
                }
                if (parcel.readInt() == 0) {
                    A173 = null;
                } else {
                    int readInt16 = parcel.readInt();
                    A173 = AbstractC25225BEi.A17(readInt16);
                    int i14 = 0;
                    while (i14 != readInt16) {
                        i14 = AbstractC37304Gc5.A01(parcel, LyricsPhrase.CREATOR, A173, i14);
                    }
                }
                return new ARAudioEffectData(readString45, readString46, readString47, A172, A173, readDouble, readDouble2, readDouble3, readDouble4);
            case 74:
                return new DownloadedTrack(AbstractC37304Gc5.A0d(parcel), parcel.readInt(), parcel.readInt());
            case 75:
                return InstagramAudioApplySource.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 76:
                int A002 = AbstractC37304Gc5.A00(parcel);
                String readString48 = parcel.readString();
                if (parcel.readInt() == 0) {
                    A17 = null;
                } else {
                    int readInt17 = parcel.readInt();
                    A17 = AbstractC25225BEi.A17(readInt17);
                    int i15 = 0;
                    while (i15 != readInt17) {
                        i15 = AbstractC37304Gc5.A01(parcel, WordOffset.CREATOR, A17, i15);
                    }
                }
                return new LyricsPhrase(A17, A002, readString48);
            case 77:
                return new MusicAssetBeatInfo(AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A00(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 78:
                ?? obj25 = new Object();
                obj25.A01 = OriginalAudioSubtype.A05;
                obj25.A0K = AbstractC166987dD.A1E();
                boolean z4 = false;
                obj25.A07 = false;
                obj25.A04 = null;
                obj25.A08 = false;
                obj25.A0E = parcel.readString();
                obj25.A0B = parcel.readString();
                obj25.A0H = parcel.readString();
                obj25.A0C = parcel.readString();
                obj25.A0J = parcel.readArrayList(Integer.class.getClassLoader());
                obj25.A0I = parcel.readString();
                obj25.A0D = parcel.readString();
                obj25.A0A = parcel.readString();
                obj25.A02 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                obj25.A03 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                obj25.A00 = parcel.readInt();
                obj25.A0S = AbstractC167007dF.A1P(parcel.readInt(), 1);
                obj25.A0Q = AbstractC167007dF.A1P(parcel.readInt(), 1);
                obj25.A0R = AbstractC167007dF.A1P(parcel.readInt(), 1);
                obj25.A0O = AbstractC167007dF.A1P(parcel.readInt(), 1);
                obj25.A0U = AbstractC167007dF.A1P(parcel.readInt(), 1);
                obj25.A0L = AbstractC167007dF.A1P(parcel.readInt(), 1);
                obj25.A0G = parcel.readString();
                obj25.A0P = AbstractC167007dF.A1P(parcel.readInt(), 1);
                obj25.A0T = AbstractC167007dF.A1P(parcel.readInt(), 1);
                obj25.A0F = parcel.readString();
                obj25.A0M = AbstractC167007dF.A1P(parcel.readInt(), 1);
                obj25.A0N = AbstractC167007dF.A1P(parcel.readInt(), 1);
                obj25.A01 = OriginalAudioSubtype.valueOf(parcel.readString());
                parcel.readList(obj25.A0K, OriginalPartsAttributionModel.class.getClassLoader());
                obj25.A07 = Boolean.valueOf(AbstractC167007dF.A1P(parcel.readInt(), 1));
                if (parcel.readInt() == 1) {
                    z4 = true;
                }
                obj25.A08 = Boolean.valueOf(z4);
                try {
                    MusicAssetModel.A04(obj25);
                    return obj25;
                } catch (IOException e) {
                    C0w9.A07("MusicAssetModel", e);
                    return obj25;
                }
            case 79:
                String A0d12 = AbstractC37304Gc5.A0d(parcel);
                if (A0d12 != null) {
                    String readString49 = parcel.readString();
                    String readString50 = parcel.readString();
                    Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
                    String readString51 = parcel.readString();
                    MusicSearchPlaylistType musicSearchPlaylistType = (MusicSearchPlaylistType) AbstractC37304Gc5.A04(parcel, MusicSearchPlaylistType.class);
                    String readString52 = parcel.readString();
                    boolean A1P = AbstractC167007dF.A1P(parcel.readInt(), 1);
                    ?? obj26 = new Object();
                    obj26.A02 = A0d12;
                    obj26.A04 = readString49;
                    obj26.A06 = readString50;
                    obj26.A00 = readBundle;
                    obj26.A05 = readString51;
                    obj26.A01 = musicSearchPlaylistType;
                    obj26.A03 = readString52;
                    obj26.A07 = A1P;
                    return obj26;
                }
                throw AbstractC166997dE.A0g();
            case 80:
                String A0d13 = AbstractC37304Gc5.A0d(parcel);
                String readString53 = parcel.readString();
                String readString54 = parcel.readString();
                ?? obj27 = new Object();
                obj27.A00 = A0d13;
                obj27.A01 = readString53;
                obj27.A02 = readString54;
                return obj27;
            case 81:
                C14360o3.A0B(parcel, 0);
                MusicAssetModel musicAssetModel = (MusicAssetModel) AbstractC37304Gc5.A04(parcel, MusicAssetModel.class);
                String readString55 = parcel.readString();
                if (readString55 != null) {
                    try {
                        enumC185288Jt = EnumC185288Jt.valueOf(readString55);
                    } catch (IllegalArgumentException unused) {
                        enumC185288Jt = null;
                    }
                } else {
                    enumC185288Jt = null;
                }
                ?? obj28 = new Object();
                obj28.A01 = musicAssetModel;
                obj28.A00 = enumC185288Jt;
                return obj28;
            case 82:
                C14360o3.A0B(parcel, 0);
                Parcelable A046 = AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                if (A046 != null) {
                    ImageUrl imageUrl = (ImageUrl) A046;
                    String readString56 = parcel.readString();
                    if (readString56 != null) {
                        C14360o3.A0B(imageUrl, 0);
                        MusicSearchArtist musicSearchArtist = new MusicSearchArtist(new H2I(imageUrl, parcel.readString(), parcel.readString(), readString56));
                        musicSearchArtist.A00 = parcel.readString();
                        return musicSearchArtist;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 83:
                return MusicSearchPlaylistType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 84:
                return new OriginalPartsAttributionModel((ImageUrl) AbstractC37304Gc5.A04(parcel, OriginalPartsAttributionModel.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 85:
                C14360o3.A0B(parcel, 0);
                ?? obj29 = new Object();
                obj29.A01 = parcel.readInt();
                obj29.A00 = parcel.readInt();
                return obj29;
            case 86:
                int A003 = AbstractC37304Gc5.A00(parcel);
                int readInt18 = parcel.readInt();
                int readInt19 = parcel.readInt();
                int readInt20 = parcel.readInt();
                boolean A1V7 = AbstractC37304Gc5.A1V(parcel);
                ?? obj30 = new Object();
                obj30.A02 = A003;
                obj30.A00 = readInt18;
                obj30.A03 = readInt19;
                obj30.A01 = readInt20;
                obj30.A04 = A1V7;
                return obj30;
            case 87:
                return new MusicOverlaySearchTab((MusicBrowseCategory) AbstractC37304Gc5.A04(parcel, MusicOverlaySearchTab.class), (MusicBrowserCategoryModel) AbstractC37304Gc5.A04(parcel, MusicOverlaySearchTab.class), AbstractC37304Gc5.A00(parcel));
            case 88:
                return new PillsFilterCategory(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 89:
                ?? c40791um2 = new C40791um();
                Class<?> cls = c40791um2.getClass();
                c40791um2.A00 = (ImageUrl) AbstractC37304Gc5.A04(parcel, cls);
                c40791um2.A0D = parcel.readString();
                c40791um2.A08 = parcel.readString();
                c40791um2.A09 = parcel.readString();
                c40791um2.A07 = parcel.readString();
                c40791um2.A05 = parcel.readString();
                c40791um2.A06 = parcel.readString();
                c40791um2.A0C = parcel.readString();
                int readInt21 = parcel.readInt();
                ArrayList A1710 = AbstractC25225BEi.A17(readInt21);
                for (int i16 = 0; i16 < readInt21; i16++) {
                    AbstractC37304Gc5.A0r(parcel, cls, A1710);
                }
                c40791um2.A0I = Collections.unmodifiableList(A1710);
                c40791um2.A0A = parcel.readString();
                c40791um2.A0B = parcel.readString();
                c40791um2.A04 = parcel.readString();
                int readInt22 = parcel.readInt();
                ArrayList A1711 = AbstractC25225BEi.A17(readInt22);
                for (int i17 = 0; i17 < readInt22; i17++) {
                    AbstractC37304Gc5.A0r(parcel, cls, A1711);
                }
                c40791um2.A0J = Collections.unmodifiableList(A1711);
                c40791um2.A01 = (FXCalAgeRestrictionScreenContent) AbstractC37304Gc5.A04(parcel, cls);
                c40791um2.A03 = (FxAccountInfo) AbstractC37304Gc5.A04(parcel, cls);
                c40791um2.A02 = (FxAccountInfo) AbstractC37304Gc5.A04(parcel, cls);
                c40791um2.A0F = parcel.readString();
                c40791um2.A0G = parcel.readString();
                c40791um2.A0E = parcel.readString();
                c40791um2.A0H = parcel.readString();
                return c40791um2;
            case 90:
                C14360o3.A0B(parcel, 0);
                ?? obj31 = new Object();
                String readString57 = parcel.readString();
                if (readString57 != null) {
                    obj31.A01 = AbstractC34257F9d.A00(readString57);
                }
                LinkedList linkedList = new LinkedList();
                obj31.A02 = linkedList;
                parcel.readStringList(linkedList);
                obj31.A00 = (Boolean) parcel.readValue(Boolean.TYPE.getClassLoader());
                return obj31;
            case 91:
                C14360o3.A0B(parcel, 0);
                ?? obj32 = new Object();
                obj32.A02 = parcel.readString();
                obj32.A00 = parcel.readString();
                obj32.A01 = parcel.readString();
                return obj32;
            case 92:
                return new FXCalAgeInfo(parcel);
            case 93:
                C14360o3.A0B(parcel, 0);
                ?? obj33 = new Object();
                obj33.A01 = (FXCalAgeInfo) AbstractC37304Gc5.A04(parcel, FXCalAgeInfo.class);
                obj33.A04 = parcel.readString();
                obj33.A02 = parcel.readString();
                obj33.A03 = parcel.readString();
                obj33.A00 = (FXCalAgeInfo) AbstractC37304Gc5.A04(parcel, FXCalAgeInfo.class);
                return obj33;
            case 94:
                C14360o3.A0B(parcel, 0);
                ?? obj34 = new Object();
                obj34.A01 = parcel.readString();
                obj34.A02 = parcel.readString();
                obj34.A00 = (ImageUrl) AbstractC37304Gc5.A04(parcel, obj34.getClass());
                obj34.A03 = parcel.readString();
                return obj34;
            case 95:
                ?? c40791um3 = new C40791um();
                c40791um3.A01 = parcel.readString();
                c40791um3.A02 = parcel.readString();
                c40791um3.A00 = parcel.readString();
                return c40791um3;
            case 96:
                C14360o3.A0B(parcel, 0);
                ?? obj35 = new Object();
                obj35.A02 = parcel.readString();
                int readInt23 = parcel.readInt();
                ArrayList A1712 = AbstractC25225BEi.A17(readInt23);
                for (int i18 = 0; i18 < readInt23; i18++) {
                    AbstractC37304Gc5.A0r(parcel, obj35.getClass(), A1712);
                }
                obj35.A07 = Collections.unmodifiableList(A1712);
                obj35.A00 = parcel.readString();
                obj35.A01 = parcel.readString();
                obj35.A04 = parcel.readString();
                obj35.A05 = parcel.readString();
                obj35.A03 = parcel.readString();
                obj35.A06 = parcel.readString();
                return obj35;
            case 97:
                Integer num6 = null;
                if (AbstractC37304Gc5.A00(parcel) != 0) {
                    num6 = AbstractC37304Gc5.A0U(parcel);
                }
                return new HowItWorksNuxFragment$Row(num6, AbstractC37304Gc5.A0X(parcel), AbstractC37304Gc5.A0X(parcel), AbstractC37304Gc5.A0W(parcel));
            case 98:
                return new OpalAudienceSelectorRepository.OpalAudience(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            default:
                C14360o3.A0B(parcel, 0);
                boolean A1V8 = AbstractC37304Gc5.A1V(parcel);
                String readString58 = parcel.readString();
                String readString59 = parcel.readString();
                String readString60 = parcel.readString();
                String readString61 = parcel.readString();
                String readString62 = parcel.readString();
                boolean A1V9 = AbstractC37304Gc5.A1V(parcel);
                String readString63 = parcel.readString();
                C74 valueOf19 = C74.valueOf(parcel.readString());
                boolean A1V10 = AbstractC37304Gc5.A1V(parcel);
                int readInt24 = parcel.readInt();
                int readInt25 = parcel.readInt();
                ArrayList A1713 = AbstractC25225BEi.A17(readInt25);
                int i19 = 0;
                while (i19 != readInt25) {
                    i19 = AbstractC37304Gc5.A01(parcel, OpalAudienceSelectorRepository.OpalAudience.CREATOR, A1713, i19);
                }
                return new OpalProfileData(valueOf19, readString58, readString59, readString60, readString61, readString62, readString63, A1713, readInt24, A1V8, A1V9, A1V10, AbstractC37304Gc5.A1V(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new RtcCallKey[i];
            case 1:
                return new RtcCallSource[i];
            case 2:
                return new RtcCreateCallArgs[i];
            case 3:
                return new RtcIgNotification[i];
            case 4:
                return new RtcJoinCallArgs[i];
            case 5:
                return new RtcThreadKey[i];
            case 6:
                return new RtcStartCoWatchPlaybackArguments[i];
            case 7:
                return new ShareLaterMedia[i];
            case 8:
                return new CompoundProductId[i];
            case 9:
                return new ProductAREffectContainer[i];
            case 10:
                return new ProductArEffectMetadata[i];
            case 11:
                return new ProductAutoTagMetadata[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new ProductContainer[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new ProductGroup[i];
            case 14:
                return new ProductGroup.VariantKey[i];
            case Process.SIGTERM /* 15 */:
                return new ProductItemWithAR[i];
            case 16:
                return new ProductSource[i];
            case 17:
                return new ProductTag[i];
            case 18:
                return new ProductVariantDimension[i];
            case Process.SIGSTOP /* 19 */:
                return new ShoppingCameraSurveyMetadata[i];
            case 20:
                return new ShoppingHomeDestination[i];
            case 21:
                return new ThumbnailImage[i];
            case 22:
                return new ProductCollectionReviewStatus[i];
            case 23:
                return new ClipsShoppingCTABar[i];
            case 24:
                return new IGTVShoppingInfo[i];
            case 25:
                return new DropsLaunchAnimation[i];
            case 26:
                return new SurfaceVisibility[i];
            case 27:
                return new IgFundedIncentive[i];
            case 28:
                return new IgFundedIncentiveBannerButton[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new IgFundedIncentiveBannerButtonStyleType[i];
            case 30:
                return new IgFundedIncentiveBannerIconType[i];
            case 31:
                return new IgFundedIncentiveButtonDestinationType[i];
            case 32:
                return new IgFundedIncentiveDetailImpl[i];
            case 33:
                return new IgFundedIncentiveNuxDisplayStyle[i];
            case 34:
                return new SellerIncentiveBanner[i];
            case 35:
                return new SellerIncentiveBannerBottomSheetContent[i];
            case 36:
                return new SellerIncentiveBannerButton[i];
            case 37:
                return new ShippingAndReturnsMetadata[i];
            case 38:
                return new ProductCollectionCoverImpl[i];
            case 39:
                return new ProductCollectionDropsMetadataImpl[i];
            case 40:
                return new ProductCollectionTagInfo[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new MultiProductComponent[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new ProductCollectionFooter[i];
            case 43:
                return new ProductCollectionFooterLink[i];
            case 44:
                return new ProductCollectionHeader[i];
            case 45:
                return new ProductCollectionTile[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new ProductFeedItem[i];
            case 47:
                return new ProductFeedResponse[i];
            case 48:
                return new ProductTile[i];
            case 49:
                return new ProductTileMedia[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new ShoppingModuleLoggingInfo[i];
            case 51:
                return new TaggingFeedSessionInformation[i];
            case 52:
                return new ProductLaunchInformationImpl[i];
            case 53:
                return new ProductVariantVisualStyle[i];
            case 54:
                return new InstagramShopLink[i];
            case 55:
                return new MultiProductSticker[i];
            case 56:
                return new ProductCollectionLink[i];
            case 57:
                return new ProductCollectionLinkMetadataImpl[i];
            case 58:
                return new ProductShareConfig[i];
            case 59:
                return new ProductSticker[i];
            case 60:
                return new ProfileShopLink[i];
            case 61:
                return new ReelMultiProductLink[i];
            case 62:
                return new ReelProductLink[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new ShoppingDestinationMetadata[i];
            case 64:
                return new ShoppingIncentiveMetadata[i];
            case 65:
                return new SizeChart[i];
            case 66:
                return new SizeChartMeasurement[i];
            case 67:
                return new SizeChartRow[i];
            case 68:
                return new ShoppingCreationConfig[i];
            case 69:
                return new SimplePlace[i];
            case 70:
                return new UpcomingEventMediaImpl[i];
            case 71:
                return new ProductOnboardingNextStepInfo[i];
            case 72:
                return new AudioTrackType[i];
            case 73:
                return new ARAudioEffectData[i];
            case 74:
                return new DownloadedTrack[i];
            case 75:
                return new InstagramAudioApplySource[i];
            case 76:
                return new LyricsPhrase[i];
            case 77:
                return new MusicAssetBeatInfo[i];
            case 78:
                return new MusicAssetModel[i];
            case 79:
                return new MusicBrowseCategory[i];
            case 80:
                return new MusicBrowserCategoryModel[i];
            case 81:
                return new MusicModelEffectPair[i];
            case 82:
                return new MusicSearchArtist[i];
            case 83:
                return new MusicSearchPlaylistType[i];
            case 84:
                return new OriginalPartsAttributionModel[i];
            case 85:
                return new TrackSnippet[i];
            case 86:
                return new WordOffset[i];
            case 87:
                return new MusicOverlaySearchTab[i];
            case 88:
                return new PillsFilterCategory[i];
            case 89:
                return new ConnectContent[i];
            case 90:
                return new ContentText[i];
            case 91:
                return new DpActionContent[i];
            case 92:
                return new FXCalAgeInfo[i];
            case 93:
                return new FXCalAgeRestrictionScreenContent[i];
            case 94:
                return new FxAccountInfo[i];
            case 95:
                return new NuxConnectResponse[i];
            case 96:
                return new SignupContent[i];
            case 97:
                return new HowItWorksNuxFragment$Row[i];
            case 98:
                return new OpalAudienceSelectorRepository.OpalAudience[i];
            default:
                return new OpalProfileData[i];
        }
    }
}
