package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.api.schemas.AdsRatingAndReviewDisplayFormat;
import com.instagram.api.schemas.CollectionPrivacyModeEnum;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.api.schemas.LinkWithText;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.discovery.filters.intf.FilterConfig;
import com.instagram.fanclub.intf.UserPayFanclubUpsellParams;
import com.instagram.fx.igxfb.IgxfbNetEgoCTABannerParams;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.payments.checkout.model.CheckoutData;
import com.instagram.pendingmedia.model.AllUserStoryTarget;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget;
import com.instagram.pendingmedia.model.GroupProfileUserStoryTarget;
import com.instagram.pendingmedia.model.GroupUserStoryTarget;
import com.instagram.pendingmedia.model.SimpleUserStoryTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.profile.bindergroup.AccountLinkModel;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.profile.intf.MultipleLinksEditModel;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.reels.groupmention.fragment.GroupMentionQuickReplySheetContent;
import com.instagram.reels.memories.model.MemoryItem;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import com.instagram.reels.profilecard.model.ProfileCardStickerModel;
import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.MusicQuestionResponseModel;
import com.instagram.reels.question.model.MusicQuestionResponseModelIntf;
import com.instagram.reels.question.model.QuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponseReshareModel;
import com.instagram.reels.question.model.QuestionResponsesModel;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import com.instagram.reels.smb.model.ProfileStickerAiAgentData;
import com.instagram.reels.smb.model.ProfileStickerModel;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.model.UserBirthDate;
import com.instagram.rtc.activity.RtcIncomingParams;
import com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId;
import com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import com.instagram.rtc.statemodel.RtcSettingsParticipant;
import com.instagram.save.analytics.SaveToCollectionsParentInsightsHost;
import com.instagram.save.contextualfeed.intf.SavedContextualFeedNetworkConfig;
import com.instagram.save.model.CollaborativeCollectionMetadata;
import com.instagram.save.model.SavedCollection;
import com.instagram.schools.management.data.BadgeVisibilitySettingItem;
import com.instagram.schools.management.data.SchoolAddress;
import com.instagram.schools.management.data.SchoolInfo;
import com.instagram.schools.management.data.SchoolOnboardingParcelData;
import com.instagram.search.surface.fragment.contextualfeed.SerpContextualFeedConfig;
import com.instagram.search.surface.serp.contextualfeed.intf.KeywordSerpContextualFeedConfig;
import com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import com.instagram.settings2.core.view.SettingsScreenConfirmBottomSheetFragment$Item;
import com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments;
import com.instagram.shopping.fragment.pdp.mediagrid.MediaGridArguments;
import com.instagram.shopping.interactor.destination.home.state.ShoppingHomeState;
import com.instagram.shopping.intf.ProductDetailsPageArguments;
import com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration;
import com.instagram.shopping.intf.productpicker.MultiProductPickerResult;
import com.instagram.shopping.intf.productpicker.ProductPickerArguments;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.shopping.model.ShippingAndReturnsSection;
import com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.shopping.model.analytics.ShoppingNavigationInfo;
import com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo;
import com.instagram.shopping.model.collection.ProductCollectionShareInfo;
import com.instagram.shopping.model.destination.home.DestinationContentType;
import com.instagram.shopping.model.destination.home.DestinationItemLabelType;
import com.instagram.shopping.model.destination.home.DestinationSignalType;
import com.instagram.shopping.model.pdp.herocarousel.HeroCarouselItemConverter$ParcelableHeroCarouselItemModel;
import com.instagram.shopping.model.pdp.link.secondarytext.SecondaryTextContent;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import com.instagram.shopping.model.productsource.ProductSourceOverrideStatus;
import com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint;
import com.instagram.shopping.model.share.ShopShareInfo;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import com.instagram.shopping.model.taggingfeed.SourceType;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.sponsored.signals.model.AdsBizBadgeInfo;
import com.instagram.sponsored.signals.model.AdsBizBadgeInfoImpl;
import com.instagram.sponsored.signals.model.AdsCTATrustInfo;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfo;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import com.instagram.video.common.events.IgRtcEventHeader;
import go.Seq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONObject;

/* renamed from: X.GcR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37324GcR implements Parcelable.Creator {
    public final int A00;

    public static Object A02(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return DirectMessageInteropReachabilityOptions.CREATOR.createFromParcel(parcel);
        }
        return null;
    }

    public C37324GcR(int i) {
        this.A00 = i;
    }

    public static C37324GcR A00(int i) {
        return new C37324GcR(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    public static final SimpleUserStoryTarget A01(String str) {
        UserStoryTarget userStoryTarget;
        if (str != null) {
            switch (str.hashCode()) {
                case -517433529:
                    if (str.equals("SHARE_TO_FRIENDS_STORY")) {
                        userStoryTarget = UserStoryTarget.A0C;
                        C14360o3.A0C(userStoryTarget, "null cannot be cast to non-null type com.instagram.pendingmedia.model.SimpleUserStoryTarget");
                        return (SimpleUserStoryTarget) userStoryTarget;
                    }
                    break;
                case 64897:
                    if (str.equals("ALL")) {
                        userStoryTarget = UserStoryTarget.A01;
                        C14360o3.A0C(userStoryTarget, "null cannot be cast to non-null type com.instagram.pendingmedia.model.SimpleUserStoryTarget");
                        return (SimpleUserStoryTarget) userStoryTarget;
                    }
                    break;
                case 2432460:
                    if (str.equals("OPAL")) {
                        userStoryTarget = UserStoryTarget.A08;
                        C14360o3.A0C(userStoryTarget, "null cannot be cast to non-null type com.instagram.pendingmedia.model.SimpleUserStoryTarget");
                        return (SimpleUserStoryTarget) userStoryTarget;
                    }
                    break;
                case 702693113:
                    if (str.equals("PRIVATE_STORY")) {
                        userStoryTarget = UserStoryTarget.A09;
                        C14360o3.A0C(userStoryTarget, "null cannot be cast to non-null type com.instagram.pendingmedia.model.SimpleUserStoryTarget");
                        return (SimpleUserStoryTarget) userStoryTarget;
                    }
                    break;
                case 734941130:
                    if (str.equals("HALLPASS")) {
                        userStoryTarget = UserStoryTarget.A06;
                        C14360o3.A0C(userStoryTarget, "null cannot be cast to non-null type com.instagram.pendingmedia.model.SimpleUserStoryTarget");
                        return (SimpleUserStoryTarget) userStoryTarget;
                    }
                    break;
                case 842397247:
                    if (str.equals("HIGHLIGHTS")) {
                        userStoryTarget = UserStoryTarget.A07;
                        C14360o3.A0C(userStoryTarget, "null cannot be cast to non-null type com.instagram.pendingmedia.model.SimpleUserStoryTarget");
                        return (SimpleUserStoryTarget) userStoryTarget;
                    }
                    break;
                case 1261689812:
                    if (str.equals("EXCLUSIVE_STORY")) {
                        userStoryTarget = UserStoryTarget.A03;
                        C14360o3.A0C(userStoryTarget, "null cannot be cast to non-null type com.instagram.pendingmedia.model.SimpleUserStoryTarget");
                        return (SimpleUserStoryTarget) userStoryTarget;
                    }
                    break;
                case 1279756998:
                    if (str.equals("FACEBOOK")) {
                        userStoryTarget = UserStoryTarget.A04;
                        C14360o3.A0C(userStoryTarget, "null cannot be cast to non-null type com.instagram.pendingmedia.model.SimpleUserStoryTarget");
                        return (SimpleUserStoryTarget) userStoryTarget;
                    }
                    break;
                case 1702038030:
                    if (str.equals("CLOSE_FRIENDS")) {
                        userStoryTarget = UserStoryTarget.A02;
                        C14360o3.A0C(userStoryTarget, "null cannot be cast to non-null type com.instagram.pendingmedia.model.SimpleUserStoryTarget");
                        return (SimpleUserStoryTarget) userStoryTarget;
                    }
                    break;
                case 2036774020:
                    if (str.equals("FACEBOOK_DATING")) {
                        userStoryTarget = UserStoryTarget.A05;
                        C14360o3.A0C(userStoryTarget, "null cannot be cast to non-null type com.instagram.pendingmedia.model.SimpleUserStoryTarget");
                        return (SimpleUserStoryTarget) userStoryTarget;
                    }
                    break;
            }
        }
        throw AbstractC31175DnJ.A0V("Cannot identify an existing instance of SimpleUserStoryTarget for type ", str);
    }

    /* JADX WARN: Type inference failed for: r1v189, types: [java.lang.Object, X.FQq] */
    /* JADX WARN: Type inference failed for: r1v76, types: [X.A98, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.instagram.payments.checkout.model.CheckoutData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, com.instagram.pendingmedia.model.AllUserStoryTarget] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.instagram.pendingmedia.model.BrandedContentTag, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v27, types: [com.instagram.reels.memories.model.MemoryItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v38, types: [com.instagram.registration.model.RegFlowExtras, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v39, types: [com.instagram.registration.model.UserBirthDate, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.instagram.pendingmedia.model.GroupProfileUserStoryTarget, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, com.instagram.pendingmedia.model.GroupUserStoryTarget] */
    /* JADX WARN: Type inference failed for: r8v50, types: [java.lang.Object, com.instagram.save.model.CollaborativeCollectionMetadata] */
    /* JADX WARN: Type inference failed for: r8v51, types: [java.lang.Object, com.instagram.save.model.SavedCollection, X.1um] */
    /* JADX WARN: Type inference failed for: r8v58, types: [com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse, java.lang.Object, X.1um] */
    /* JADX WARN: Type inference failed for: r8v76, types: [java.lang.Object, com.instagram.shopping.model.ShippingAndReturnsSection] */
    /* JADX WARN: Type inference failed for: r8v98, types: [java.lang.Object, com.instagram.sponsored.analytics.SourceModelInfoParams] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Integer num;
        Integer num2;
        Object createFromParcel;
        Object createFromParcel2;
        Long valueOf;
        Long valueOf2;
        Object createFromParcel3;
        Boolean valueOf3;
        Boolean valueOf4;
        Integer num3;
        Integer num4;
        Object createFromParcel4;
        C34517FJd c34517FJd;
        EnumC27396C6z valueOf5;
        Object createFromParcel5;
        Integer num5;
        Integer num6;
        Integer num7;
        JSONObject jSONObject;
        Integer num8;
        EnumC39584Hdu enumC39584Hdu;
        Integer num9;
        ArrayList A17;
        ArrayList A172;
        Object createFromParcel6;
        Object createFromParcel7;
        ArrayList A173;
        Boolean valueOf6;
        Boolean valueOf7;
        switch (this.A00) {
            case 0:
                ?? obj = new Object();
                obj.A00 = (CheckoutLaunchParams) AbstractC37304Gc5.A04(parcel, CheckoutLaunchParams.class);
                return obj;
            case 1:
                C14360o3.A0B(parcel, 0);
                ?? obj2 = new Object();
                obj2.A00 = "ALL_WITH_BLACKLIST";
                obj2.A00 = parcel.readString();
                ArrayList readArrayList = parcel.readArrayList(AllUserStoryTarget.class.getClassLoader());
                if (readArrayList != null) {
                    arrayList = AbstractC167017dG.A0q(readArrayList);
                    Iterator it = readArrayList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().toString());
                    }
                } else {
                    arrayList = null;
                }
                obj2.A01 = arrayList;
                return obj2;
            case 2:
                C14360o3.A0B(parcel, 0);
                ?? obj3 = new Object();
                obj3.A02 = "";
                obj3.A01 = parcel.readString();
                obj3.A02 = String.valueOf(parcel.readString());
                obj3.A04 = Boolean.parseBoolean(parcel.readString());
                obj3.A03 = Boolean.parseBoolean(parcel.readString());
                return obj3;
            case 3:
                C14360o3.A0B(parcel, 0);
                ?? obj4 = new Object();
                obj4.A00 = "CLOSE_FRIENDS_WITH_BLACKLIST";
                obj4.A00 = parcel.readString();
                ArrayList readArrayList2 = parcel.readArrayList(CloseFriendsUserStoryTarget.class.getClassLoader());
                if (readArrayList2 != null) {
                    arrayList2 = AbstractC167017dG.A0q(readArrayList2);
                    Iterator it2 = readArrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(it2.next().toString());
                    }
                } else {
                    arrayList2 = null;
                }
                obj4.A01 = arrayList2;
                return obj4;
            case 4:
                C14360o3.A0B(parcel, 0);
                ?? obj5 = new Object();
                obj5.A01 = "GROUP_PROFILE";
                obj5.A01 = parcel.readString();
                obj5.A00 = (PendingRecipient) PendingRecipient.CREATOR.createFromParcel(parcel);
                return obj5;
            case 5:
                C14360o3.A0B(parcel, 0);
                ?? obj6 = new Object();
                obj6.A02 = "GROUP";
                obj6.A02 = parcel.readString();
                obj6.A03 = parcel.createTypedArrayList(PendingRecipient.CREATOR);
                obj6.A01 = parcel.readString();
                obj6.A00 = (DirectThreadKey) AbstractC37304Gc5.A04(parcel, DirectThreadKey.class);
                return obj6;
            case 6:
                return A01(AbstractC37304Gc5.A0d(parcel));
            case 7:
                return new AccountLinkModel.AddExternalLinkData(AbstractC37304Gc5.A0d(parcel));
            case 8:
                return new AccountLinkModel.AddExternalLinkDataEnhanced(AbstractC37304Gc5.A0d(parcel), AbstractC37304Gc5.A1V(parcel));
            case 9:
                return new AccountLinkModel.AddExternalLinkDataV2(AbstractC37304Gc5.A0d(parcel), AbstractC37304Gc5.A1V(parcel));
            case 10:
                return new AccountLinkModel.AddFacebookLinkData(AbstractC37304Gc5.A0d(parcel), AbstractC37304Gc5.A1V(parcel));
            case 11:
                return new AccountLinkModel.AddFacebookPageLinkData(AbstractC37304Gc5.A0d(parcel), AbstractC37304Gc5.A1V(parcel));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(parcel, 0);
                return new AccountLinkModel.BottomMessageData(parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new AccountLinkModel.ExternalLinkData(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 14:
                return new AccountLinkModel.ExternalLinkDataEnhanced(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case Process.SIGTERM /* 15 */:
                return new AccountLinkModel.ExternalLinkDataV2(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 16:
                return new AccountLinkModel.FacebookLinkData(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 17:
                return new AccountLinkModel.FacebookLinkDataV2(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 18:
                return new AccountLinkModel.FacebookPageLinkData(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case Process.SIGSTOP /* 19 */:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    num = null;
                } else {
                    String readString = parcel.readString();
                    if (readString.equals("HIGHLIGHT")) {
                        num = C05F.A00;
                    } else if (readString.equals("USER_STORY")) {
                        num = C05F.A01;
                    } else if (readString.equals("LIVE")) {
                        num = C05F.A0C;
                    } else {
                        throw AbstractC166987dD.A12(readString);
                    }
                }
                return new AutoLaunchReelParams(num, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 20:
                String A0d = AbstractC37304Gc5.A0d(parcel);
                if (A0d.equals("CREATE")) {
                    num2 = C05F.A00;
                } else if (A0d.equals("EDIT")) {
                    num2 = C05F.A01;
                } else {
                    throw AbstractC166987dD.A12(A0d);
                }
                return new MultipleLinksEditModel(num2, parcel.readString());
            case 21:
                return new UserDetailEntryInfo(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 22:
                String A0d2 = AbstractC37304Gc5.A0d(parcel);
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = AutoLaunchReelParams.CREATOR.createFromParcel(parcel);
                }
                AutoLaunchReelParams autoLaunchReelParams = (AutoLaunchReelParams) createFromParcel;
                boolean A1V = AbstractC37304Gc5.A1V(parcel);
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                FilterConfig filterConfig = (FilterConfig) AbstractC37304Gc5.A04(parcel, UserDetailLaunchConfig.class);
                SourceModelInfoParams sourceModelInfoParams = (SourceModelInfoParams) AbstractC37304Gc5.A04(parcel, UserDetailLaunchConfig.class);
                boolean A1V2 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V3 = AbstractC37304Gc5.A1V(parcel);
                if (parcel.readInt() == 0) {
                    createFromParcel2 = null;
                } else {
                    createFromParcel2 = UserDetailEntryInfo.CREATOR.createFromParcel(parcel);
                }
                UserDetailEntryInfo userDetailEntryInfo = (UserDetailEntryInfo) createFromParcel2;
                boolean A1V4 = AbstractC37304Gc5.A1V(parcel);
                String readString11 = parcel.readString();
                boolean A1V5 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V6 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V7 = AbstractC37304Gc5.A1V(parcel);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                boolean A1V8 = AbstractC37304Gc5.A1V(parcel);
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                boolean A1V9 = AbstractC37304Gc5.A1V(parcel);
                UserPayFanclubUpsellParams userPayFanclubUpsellParams = (UserPayFanclubUpsellParams) AbstractC37304Gc5.A04(parcel, UserDetailLaunchConfig.class);
                boolean A1V10 = AbstractC37304Gc5.A1V(parcel);
                String readString17 = parcel.readString();
                String readString18 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(parcel.readLong());
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(parcel.readLong());
                }
                boolean A1V11 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V12 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V13 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V14 = AbstractC37304Gc5.A1V(parcel);
                String readString19 = parcel.readString();
                boolean A1V15 = AbstractC37304Gc5.A1V(parcel);
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                boolean A1V16 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V17 = AbstractC37304Gc5.A1V(parcel);
                String readString22 = parcel.readString();
                boolean A1V18 = AbstractC37304Gc5.A1V(parcel);
                String readString23 = parcel.readString();
                boolean A1V19 = AbstractC37304Gc5.A1V(parcel);
                IgxfbNetEgoCTABannerParams igxfbNetEgoCTABannerParams = (IgxfbNetEgoCTABannerParams) AbstractC37304Gc5.A04(parcel, UserDetailLaunchConfig.class);
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new UserDetailLaunchConfig(filterConfig, userPayFanclubUpsellParams, igxfbNetEgoCTABannerParams, autoLaunchReelParams, userDetailEntryInfo, sourceModelInfoParams, bool, valueOf, valueOf2, A0d2, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, readString18, readString19, readString20, readString21, readString22, readString23, createStringArrayList, A1V, A1V2, A1V3, A1V4, A1V5, A1V6, A1V7, A1V8, A1V9, A1V10, A1V11, A1V12, A1V13, A1V14, A1V15, A1V16, A1V17, A1V18, A1V19, AbstractC37304Gc5.A1V(parcel));
            case 23:
                C14360o3.A0B(parcel, 0);
                return new ChannelChallengeStickerWinnerModel((ImageUrl) AbstractC37304Gc5.A04(parcel, ChannelChallengeStickerWinnerModel.class), (User) AbstractC37304Gc5.A04(parcel, ChannelChallengeStickerWinnerModel.class), parcel.readString());
            case 24:
                C14360o3.A0B(parcel, 0);
                return ChatStickerChannelType.values()[parcel.readInt()];
            case 25:
                C14360o3.A0B(parcel, 0);
                return ChatStickerStickerType.values()[parcel.readInt()];
            case 26:
                return new GroupMentionQuickReplySheetContent((ImageUrl) AbstractC37304Gc5.A04(parcel, GroupMentionQuickReplySheetContent.class), AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 27:
                ?? obj7 = new Object();
                obj7.A01 = new Object();
                String readString24 = parcel.readString();
                EnumC222889sT enumC222889sT = (EnumC222889sT) EnumC222889sT.A01.get(readString24);
                if (enumC222889sT != null) {
                    obj7.A00 = enumC222889sT;
                    String readString25 = parcel.readString();
                    if (readString25 != null) {
                        try {
                            obj7.A01 = AEK.parseFromJson(C16V.A00(readString25));
                            return obj7;
                        } catch (IOException unused) {
                            return obj7;
                        }
                    }
                    return obj7;
                }
                throw AbstractC166987dD.A1D(AnonymousClass001.A0R(AbstractC111324zv.A00(1838), readString24));
            case 28:
                C14360o3.A0B(parcel, 0);
                return new MusicPickReelTag(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C14360o3.A0B(parcel, 0);
                return new MusicPickStickerModel((StoryMusicPickTappableData) AbstractC37304Gc5.A04(parcel, MusicPickStickerModel.class));
            case 30:
                return new ProfileCardStickerModel((MusicOverlayStickerModel) AbstractC37304Gc5.A04(parcel, ProfileCardStickerModel.class), AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 31:
                C14360o3.A0B(parcel, 0);
                return new MusicQuestionResponseModel((TrackData) AbstractC37304Gc5.A04(parcel, MusicQuestionResponseModel.class), (MusicConsumptionModel) AbstractC37304Gc5.A04(parcel, MusicQuestionResponseModel.class));
            case 32:
                boolean A1M = AbstractC167007dF.A1M(AbstractC37304Gc5.A00(parcel));
                String readString26 = parcel.readString();
                QuestionMediaResponseModel questionMediaResponseModel = (QuestionMediaResponseModel) AbstractC37304Gc5.A04(parcel, QuestionResponseModel.class);
                Boolean bool2 = null;
                if (parcel.readInt() == 0) {
                    createFromParcel3 = null;
                } else {
                    createFromParcel3 = MusicQuestionResponseModel.CREATOR.createFromParcel(parcel);
                }
                MusicQuestionResponseModel musicQuestionResponseModel = (MusicQuestionResponseModel) createFromParcel3;
                String readString27 = parcel.readString();
                QuestionResponseType questionResponseType = (QuestionResponseType) AbstractC37304Gc5.A04(parcel, QuestionResponseModel.class);
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                if (parcel.readInt() != 0) {
                    bool2 = Boolean.valueOf(AbstractC37304Gc5.A1W(parcel));
                }
                return new QuestionResponseModel(musicQuestionResponseModel, questionResponseType, questionMediaResponseModel, (User) AbstractC37304Gc5.A04(parcel, QuestionResponseModel.class), valueOf3, bool2, readString26, readString27, parcel.readInt(), A1M);
            case 33:
                int A00 = AbstractC37304Gc5.A00(parcel);
                String readString28 = parcel.readString();
                String readString29 = parcel.readString();
                String readString30 = parcel.readString();
                return new QuestionResponseReshareModel((MusicQuestionResponseModelIntf) AbstractC37304Gc5.A04(parcel, QuestionResponseReshareModel.class), (QuestionResponseType) AbstractC37304Gc5.A04(parcel, QuestionResponseReshareModel.class), (QuestionMediaResponseModelIntf) AbstractC37304Gc5.A04(parcel, QuestionResponseReshareModel.class), (User) AbstractC37304Gc5.A04(parcel, QuestionResponseReshareModel.class), (User) AbstractC37304Gc5.A04(parcel, QuestionResponseReshareModel.class), readString28, readString29, readString30, parcel.readString(), parcel.readString(), A00, AbstractC37304Gc5.A1V(parcel));
            case 34:
                String A0d3 = AbstractC37304Gc5.A0d(parcel);
                Long A0a = AbstractC37304Gc5.A0a(parcel);
                String readString31 = parcel.readString();
                int i = 0;
                boolean A1M2 = AbstractC167007dF.A1M(parcel.readInt());
                String readString32 = parcel.readString();
                User user = (User) AbstractC37304Gc5.A04(parcel, QuestionResponsesModel.class);
                String readString33 = parcel.readString();
                int readInt = parcel.readInt();
                QuestionStickerType questionStickerType = (QuestionStickerType) AbstractC37304Gc5.A04(parcel, QuestionResponsesModel.class);
                int readInt2 = parcel.readInt();
                ArrayList A174 = AbstractC25225BEi.A17(readInt2);
                while (i != readInt2) {
                    i = AbstractC37304Gc5.A01(parcel, QuestionResponseModel.CREATOR, A174, i);
                }
                return new QuestionResponsesModel(questionStickerType, user, A0a, A0d3, readString31, readString32, readString33, parcel.readString(), A174, readInt, parcel.readInt(), A1M2);
            case 35:
                ArrayList arrayList3 = null;
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                String readString34 = parcel.readString();
                ImageInfo imageInfo = (ImageInfo) AbstractC37304Gc5.A04(parcel, QuestionMediaResponseModel.class);
                Integer A0Y = AbstractC37304Gc5.A0Y(parcel);
                Integer A0Y2 = AbstractC37304Gc5.A0Y(parcel);
                Integer A0Y3 = AbstractC37304Gc5.A0Y(parcel);
                Integer A0Y4 = AbstractC37304Gc5.A0Y(parcel);
                SpritesheetInfo spritesheetInfo = (SpritesheetInfo) AbstractC37304Gc5.A04(parcel, QuestionMediaResponseModel.class);
                String readString35 = parcel.readString();
                String readString36 = parcel.readString();
                String readString37 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt3 = parcel.readInt();
                    arrayList3 = AbstractC25225BEi.A17(readInt3);
                    for (int i2 = 0; i2 != readInt3; i2++) {
                        AbstractC37304Gc5.A0r(parcel, QuestionMediaResponseModel.class, arrayList3);
                    }
                }
                return new QuestionMediaResponseModel(imageInfo, spritesheetInfo, valueOf4, A0Y, A0Y2, A0Y3, A0Y4, readString34, readString35, readString36, readString37, arrayList3);
            case 36:
                return new ProfileStickerAiAgentData((IGAIAgentType) AbstractC37304Gc5.A04(parcel, ProfileStickerAiAgentData.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 37:
                C14360o3.A0B(parcel, 0);
                Parcelable.Creator creator = ProfileStickerModel.CREATOR;
                User user2 = (User) AbstractC37304Gc5.A04(parcel, ProfileStickerModel.class);
                C148276lx parseFromJson = AbstractC201078up.parseFromJson(C16V.A00(parcel.readString()));
                C14360o3.A07(parseFromJson);
                String readString38 = parcel.readString();
                if (readString38.equals("BLACK")) {
                    num3 = C05F.A00;
                } else if (readString38.equals("BLUE")) {
                    num3 = C05F.A01;
                } else {
                    throw AbstractC166987dD.A12(readString38);
                }
                String readString39 = parcel.readString();
                if (readString39.equals("BUSINESS")) {
                    num4 = C05F.A00;
                } else if (readString39.equals("PERSONAL")) {
                    num4 = C05F.A01;
                } else if (readString39.equals("AI_AGENT")) {
                    num4 = C05F.A0C;
                } else {
                    throw AbstractC166987dD.A12(readString39);
                }
                if (parcel.readInt() == 0) {
                    createFromParcel4 = null;
                } else {
                    createFromParcel4 = ProfileStickerAiAgentData.CREATOR.createFromParcel(parcel);
                }
                return new ProfileStickerModel(parseFromJson, (ProfileStickerAiAgentData) createFromParcel4, user2, num3, num4);
            case 38:
                ?? obj8 = new Object();
                boolean z = false;
                obj8.A0u = false;
                obj8.A0m = false;
                ClassLoader classLoader = obj8.getClass().getClassLoader();
                obj8.A01 = (CountryCodeData) parcel.readParcelable(classLoader);
                obj8.A0R = parcel.readString();
                obj8.A0Q = parcel.readString();
                obj8.A08 = parcel.readString();
                obj8.A0O = parcel.readString();
                obj8.A0Z = parcel.readString();
                obj8.A0W = parcel.readString();
                obj8.A0P = parcel.readString();
                obj8.A05 = parcel.readString();
                obj8.A0B = parcel.readString();
                obj8.A0D = parcel.readString();
                obj8.A0C = parcel.readString();
                obj8.A0X = parcel.readString();
                obj8.A00 = parcel.readLong();
                obj8.A0n = AbstractC37304Gc5.A1X(parcel);
                obj8.A10 = AbstractC37304Gc5.A1X(parcel);
                obj8.A0h = AbstractC37304Gc5.A1X(parcel);
                obj8.A0q = AbstractC37304Gc5.A1X(parcel);
                obj8.A0w = AbstractC37304Gc5.A1X(parcel);
                obj8.A0g = AbstractC37304Gc5.A1X(parcel);
                obj8.A12 = AbstractC37304Gc5.A1X(parcel);
                obj8.A0s = AbstractC37304Gc5.A1X(parcel);
                obj8.A0v = AbstractC37304Gc5.A1X(parcel);
                obj8.A0k = AbstractC37304Gc5.A1X(parcel);
                obj8.A0u = AbstractC37304Gc5.A1X(parcel);
                obj8.A11 = AbstractC37304Gc5.A1X(parcel);
                obj8.A03 = (UserBirthDate) parcel.readParcelable(classLoader);
                List<String> A1E = AbstractC166987dD.A1E();
                obj8.A0e = A1E;
                parcel.readStringList(A1E);
                ArrayList A1E2 = AbstractC166987dD.A1E();
                parcel.readStringList(A1E2);
                obj8.A0f = AbstractC25225BEi.A17(A1E2.size());
                Iterator it3 = A1E2.iterator();
                while (it3.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it3);
                    List list = obj8.A0f;
                    try {
                        c34517FJd = AbstractC34297FAr.parseFromJson(C16V.A00(A1B));
                    } catch (IOException unused2) {
                        c34517FJd = null;
                    }
                    list.add(c34517FJd);
                }
                int readInt4 = parcel.readInt();
                if (readInt4 >= 0) {
                    obj8.A02 = new C34706FQr();
                    for (int i3 = 0; i3 < readInt4; i3++) {
                        List A1E3 = AbstractC166987dD.A1E();
                        parcel.readList(A1E3, classLoader);
                        List list2 = obj8.A02.A00;
                        ?? obj9 = new Object();
                        obj9.A00 = A1E3;
                        list2.add(obj9);
                    }
                }
                obj8.A0S = parcel.readString();
                obj8.A0N = parcel.readString();
                obj8.A0V = parcel.readString();
                obj8.A07 = parcel.readString();
                obj8.A06 = parcel.readString();
                obj8.A0l = AbstractC37304Gc5.A1X(parcel);
                obj8.A0x = AbstractC37304Gc5.A1X(parcel);
                obj8.A0Y = parcel.readString();
                obj8.A0A = parcel.readString();
                obj8.A04 = parcel.readString();
                obj8.A0T = parcel.readString();
                obj8.A0U = parcel.readString();
                obj8.A0J = parcel.readString();
                obj8.A0M = parcel.readString();
                obj8.A09 = parcel.readString();
                obj8.A0r = AbstractC37304Gc5.A1X(parcel);
                obj8.A0m = AbstractC37304Gc5.A1X(parcel);
                obj8.A0b = parcel.readString();
                obj8.A0d = parcel.readString();
                obj8.A0c = parcel.readString();
                obj8.A0a = parcel.readString();
                obj8.A0H = parcel.readString();
                obj8.A0G = parcel.readString();
                obj8.A0t = AbstractC37304Gc5.A1X(parcel);
                obj8.A0y = AbstractC37304Gc5.A1X(parcel);
                obj8.A0K = parcel.readString();
                obj8.A0L = parcel.readString();
                obj8.A0I = parcel.readString();
                obj8.A0z = AbstractC37304Gc5.A1X(parcel);
                obj8.A0i = AbstractC37304Gc5.A1X(parcel);
                obj8.A0E = parcel.readString();
                obj8.A0F = parcel.readString();
                obj8.A0o = AbstractC37304Gc5.A1X(parcel);
                obj8.A0p = AbstractC37304Gc5.A1X(parcel);
                if (parcel.readByte() != 0) {
                    z = true;
                }
                obj8.A0j = z;
                return obj8;
            case 39:
                ?? obj10 = new Object();
                obj10.A02 = parcel.readInt();
                obj10.A01 = parcel.readInt();
                obj10.A00 = parcel.readInt();
                return obj10;
            case 40:
                return new RtcIncomingParams(AbstractC37304Gc5.A0d(parcel), parcel.readString(), AbstractC167007dF.A1M(parcel.readInt()), AbstractC37304Gc5.A1W(parcel));
            case Seq.NULL_REFNUM /* 41 */:
                C14360o3.A0B(parcel, 0);
                return new RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId((ParcelUuid) AbstractC37304Gc5.A04(parcel, RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId.class));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString(AbstractC37304Gc5.A0d(parcel));
            case 43:
                EnumC53186Nfi valueOf8 = EnumC53186Nfi.valueOf(AbstractC37304Gc5.A0d(parcel));
                String readString40 = parcel.readString();
                Integer A002 = AET.A00(parcel.readString());
                Integer A003 = AbstractC41350IRv.A00(parcel.readString());
                String readString41 = parcel.readString();
                RtcIgNotification rtcIgNotification = (RtcIgNotification) AbstractC37304Gc5.A04(parcel, RtcConnectionEntity.EndCallConnectionEntity.class);
                Long l = null;
                if (parcel.readInt() != 0) {
                    l = Long.valueOf(parcel.readLong());
                }
                return new RtcConnectionEntity.EndCallConnectionEntity(EnumC53137Neq.valueOf(parcel.readString()), rtcIgNotification, valueOf8, A002, A003, AbstractC37304Gc5.A0W(parcel), l, readString40, readString41, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 44:
                EnumC53186Nfi valueOf9 = EnumC53186Nfi.valueOf(AbstractC37304Gc5.A0d(parcel));
                String readString42 = parcel.readString();
                return new RtcConnectionEntity.LiveInviteConnectionEntity((ImageUrl) AbstractC37304Gc5.A04(parcel, RtcConnectionEntity.LiveInviteConnectionEntity.class), (RtcIgNotification) AbstractC37304Gc5.A04(parcel, RtcConnectionEntity.LiveInviteConnectionEntity.class), valueOf9, AET.A00(parcel.readString()), AbstractC41350IRv.A00(parcel.readString()), AbstractC37304Gc5.A0a(parcel), readString42, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 45:
                EnumC53186Nfi valueOf10 = EnumC53186Nfi.valueOf(AbstractC37304Gc5.A0d(parcel));
                String readString43 = parcel.readString();
                Integer A004 = AET.A00(parcel.readString());
                Integer A005 = AbstractC41350IRv.A00(parcel.readString());
                String readString44 = parcel.readString();
                RtcIgNotification rtcIgNotification2 = (RtcIgNotification) AbstractC37304Gc5.A04(parcel, RtcConnectionEntity.RtcCallConnectionEntity.class);
                Long A0a2 = AbstractC37304Gc5.A0a(parcel);
                String readString45 = parcel.readString();
                String readString46 = parcel.readString();
                String readString47 = parcel.readString();
                String readString48 = parcel.readString();
                String readString49 = parcel.readString();
                String readString50 = parcel.readString();
                String readString51 = parcel.readString();
                String readString52 = parcel.readString();
                String readString53 = parcel.readString();
                EnumC53137Neq valueOf11 = EnumC53137Neq.valueOf(parcel.readString());
                boolean A1V20 = AbstractC37304Gc5.A1V(parcel);
                return new RtcConnectionEntity.RtcCallConnectionEntity(valueOf11, EnumC53138Ner.valueOf(parcel.readString()), (RtcCallKey) AbstractC37304Gc5.A04(parcel, RtcConnectionEntity.RtcCallConnectionEntity.class), rtcIgNotification2, valueOf10, (IgRtcEventHeader) AbstractC37304Gc5.A04(parcel, RtcConnectionEntity.RtcCallConnectionEntity.class), A004, A005, A0a2, readString43, readString44, readString45, readString46, readString47, readString48, readString49, readString50, readString51, readString52, readString53, A1V20, AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new RtcConnectionEntity.RtcCallGenericConnectionEntity((RtcIgNotification) AbstractC37304Gc5.A04(parcel, RtcConnectionEntity.RtcCallGenericConnectionEntity.class), EnumC53186Nfi.valueOf(AbstractC37304Gc5.A0d(parcel)), AET.A00(parcel.readString()), AbstractC41350IRv.A00(parcel.readString()), AbstractC37304Gc5.A0a(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 47:
                String A0d4 = AbstractC37304Gc5.A0d(parcel);
                String readString54 = parcel.readString();
                return new RtcSettingsParticipant((ImageUrl) AbstractC37304Gc5.A04(parcel, RtcSettingsParticipant.class), AbstractC37304Gc5.A0a(parcel), A0d4, readString54, parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 48:
                return new SaveToCollectionsParentInsightsHost((C11520jB) parcel.readSerializable(), AbstractC37304Gc5.A0d(parcel), AbstractC167007dF.A1M(parcel.readInt()), AbstractC37304Gc5.A1W(parcel));
            case 49:
                C14360o3.A0B(parcel, 0);
                return new SavedContextualFeedNetworkConfig((SavedCollection) AbstractC37304Gc5.A04(parcel, SavedContextualFeedNetworkConfig.class), parcel.readString());
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                int A006 = AbstractC37304Gc5.A00(parcel);
                ArrayList A175 = AbstractC25225BEi.A17(A006);
                for (int i4 = 0; i4 != A006; i4++) {
                    AbstractC37304Gc5.A0r(parcel, CollaborativeCollectionMetadata.class, A175);
                }
                String readString55 = parcel.readString();
                String readString56 = parcel.readString();
                AbstractC167017dG.A1R(readString55, readString56);
                ?? obj11 = new Object();
                obj11.A02 = A175;
                obj11.A01 = readString55;
                obj11.A00 = readString56;
                return obj11;
            case 51:
                ?? c40791um = new C40791um();
                c40791um.A07 = EnumC33416Epn.A0A;
                c40791um.A0L = AbstractC166987dD.A1E();
                c40791um.A0M = AbstractC166987dD.A1E();
                c40791um.A06 = null;
                boolean z2 = false;
                c40791um.A0B = false;
                c40791um.A0K = AbstractC166987dD.A1E();
                c40791um.A02 = null;
                c40791um.A0I = null;
                c40791um.A0N = false;
                c40791um.A0F = parcel.readString();
                c40791um.A0G = parcel.readString();
                c40791um.A0H = parcel.readString();
                c40791um.A07 = VWQ.A00(parcel.readString());
                List<String> A1E4 = AbstractC166987dD.A1E();
                parcel.readStringList(A1E4);
                c40791um.A0K = A1E4;
                c40791um.A09 = Boolean.valueOf(AbstractC167007dF.A1P(parcel.readInt(), 1));
                if (parcel.readInt() == 1) {
                    z2 = true;
                }
                c40791um.A0C = Boolean.valueOf(z2);
                c40791um.A05 = (CollaborativeCollectionMetadata) AbstractC37304Gc5.A04(parcel, CollaborativeCollectionMetadata.class);
                c40791um.A00 = (CollectionPrivacyModeEnum) AbstractC37304Gc5.A04(parcel, CollectionPrivacyModeEnum.class);
                c40791um.A02 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ImageUrl.class);
                c40791um.A0I = parcel.readString();
                return c40791um;
            case 52:
                return new BadgeVisibilitySettingItem(EnumC53288NhQ.valueOf(AbstractC37304Gc5.A0d(parcel)), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 53:
                return new SchoolAddress(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 54:
                return new SchoolInfo((SchoolAddress) SchoolAddress.CREATOR.createFromParcel(parcel), AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 55:
                String A0d5 = AbstractC37304Gc5.A0d(parcel);
                String readString57 = parcel.readString();
                EnumC27395C6y enumC27395C6y = null;
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = EnumC27396C6z.valueOf(parcel.readString());
                }
                Integer A0Y5 = AbstractC37304Gc5.A0Y(parcel);
                Integer A0Y6 = AbstractC37304Gc5.A0Y(parcel);
                int readInt5 = parcel.readInt();
                ArrayList A176 = AbstractC25225BEi.A17(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = AbstractC37304Gc5.A01(parcel, SchoolInfo.CREATOR, A176, i5);
                }
                int readInt6 = parcel.readInt();
                ArrayList A177 = AbstractC25225BEi.A17(readInt6);
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = AbstractC37304Gc5.A01(parcel, SchoolInfo.CREATOR, A177, i6);
                }
                String readString58 = parcel.readString();
                String readString59 = parcel.readString();
                String readString60 = parcel.readString();
                boolean A1V21 = AbstractC37304Gc5.A1V(parcel);
                if (parcel.readInt() != 0) {
                    enumC27395C6y = EnumC27395C6y.valueOf(parcel.readString());
                }
                EnumC27383C6m valueOf12 = EnumC27383C6m.valueOf(parcel.readString());
                boolean A1V22 = AbstractC37304Gc5.A1V(parcel);
                String readString61 = parcel.readString();
                EnumC39642HiX valueOf13 = EnumC39642HiX.valueOf(parcel.readString());
                int readInt7 = parcel.readInt();
                ArrayList A178 = AbstractC25225BEi.A17(readInt7);
                for (int i7 = 0; i7 != readInt7; i7++) {
                    A178.add(C75.valueOf(parcel.readString()));
                }
                return new SchoolOnboardingParcelData(valueOf13, enumC27395C6y, valueOf5, valueOf12, A0Y5, A0Y6, A0d5, readString57, readString58, readString59, readString60, readString61, A176, A177, A178, A1V21, A1V22);
            case 56:
                return new SerpContextualFeedConfig(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 57:
                C14360o3.A0B(parcel, 0);
                return new KeywordSerpContextualFeedConfig(parcel);
            case 58:
                ?? c40791um2 = new C40791um();
                c40791um2.A03 = parcel.readString();
                c40791um2.A02 = parcel.readString();
                c40791um2.A01 = parcel.readString();
                c40791um2.A00 = (DataDownloadStatusCheckResponse.JobStatus) AbstractC37304Gc5.A04(parcel, DataDownloadStatusCheckResponse.JobStatus.class);
                return c40791um2;
            case 59:
                return DataDownloadStatusCheckResponse.JobStatus.values()[parcel.readInt()];
            case 60:
                return DirectMessageInteropReachabilityOptions.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 61:
                Object obj12 = null;
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    createFromParcel5 = null;
                } else {
                    createFromParcel5 = DirectMessageInteropReachabilityOptions.CREATOR.createFromParcel(parcel);
                }
                DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = (DirectMessageInteropReachabilityOptions) createFromParcel5;
                DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2 = (DirectMessageInteropReachabilityOptions) A02(parcel);
                DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3 = (DirectMessageInteropReachabilityOptions) A02(parcel);
                DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions4 = (DirectMessageInteropReachabilityOptions) A02(parcel);
                DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions5 = (DirectMessageInteropReachabilityOptions) A02(parcel);
                DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions6 = (DirectMessageInteropReachabilityOptions) A02(parcel);
                DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions7 = (DirectMessageInteropReachabilityOptions) A02(parcel);
                DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions8 = (DirectMessageInteropReachabilityOptions) A02(parcel);
                DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions9 = (DirectMessageInteropReachabilityOptions) A02(parcel);
                if (parcel.readInt() != 0) {
                    obj12 = DirectMessageInteropReachabilityOptions.CREATOR.createFromParcel(parcel);
                }
                return new DirectMessagesInteropOptionsViewModel(directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions3, directMessageInteropReachabilityOptions4, directMessageInteropReachabilityOptions5, directMessageInteropReachabilityOptions6, directMessageInteropReachabilityOptions7, directMessageInteropReachabilityOptions8, directMessageInteropReachabilityOptions9, (DirectMessageInteropReachabilityOptions) obj12);
            case 62:
                return new SettingsScreenConfirmBottomSheetFragment$Item(AbstractC37304Gc5.A0d(parcel), AbstractC37304Gc5.A0V(parcel));
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                C14360o3.A0B(parcel, 0);
                boolean A1V23 = AbstractC37304Gc5.A1V(parcel);
                int readInt8 = parcel.readInt();
                Parcelable[] parcelableArr = new Parcelable[readInt8];
                for (int i8 = 0; i8 != readInt8; i8++) {
                    parcelableArr[i8] = AbstractC37304Gc5.A04(parcel, LightboxArguments.class);
                }
                Product product = (Product) AbstractC37304Gc5.A04(parcel, LightboxArguments.class);
                String readString62 = parcel.readString();
                String readString63 = parcel.readString();
                String readString64 = parcel.readString();
                String readString65 = parcel.readString();
                String readString66 = parcel.readString();
                String readString67 = parcel.readString();
                String readString68 = parcel.readString();
                int readInt9 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt9);
                for (int i9 = 0; i9 != readInt9; i9++) {
                    hashMap.put(parcel.readString(), parcel.readString());
                }
                String readString69 = parcel.readString();
                String readString70 = parcel.readString();
                String readString71 = parcel.readString();
                String readString72 = parcel.readString();
                String readString73 = parcel.readString();
                RankingInfo rankingInfo = (RankingInfo) AbstractC37304Gc5.A04(parcel, LightboxArguments.class);
                int readInt10 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt10);
                for (int i10 = 0; i10 != readInt10; i10++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new LightboxArguments(rankingInfo, product, readString62, readString63, readString64, readString65, readString66, readString67, readString68, readString69, readString70, readString71, readString72, readString73, parcel.readString(), parcel.readString(), hashMap, linkedHashSet, parcelableArr, A1V23, AbstractC37304Gc5.A1V(parcel));
            case 64:
                C14360o3.A0B(parcel, 0);
                Product product2 = (Product) AbstractC37304Gc5.A04(parcel, MediaGridArguments.class);
                String readString74 = parcel.readString();
                String readString75 = parcel.readString();
                String readString76 = parcel.readString();
                String readString77 = parcel.readString();
                String readString78 = parcel.readString();
                int readInt11 = parcel.readInt();
                HashMap hashMap2 = new HashMap(readInt11);
                for (int i11 = 0; i11 != readInt11; i11++) {
                    hashMap2.put(parcel.readString(), parcel.readString());
                }
                String readString79 = parcel.readString();
                String readString80 = parcel.readString();
                RankingInfo rankingInfo2 = (RankingInfo) AbstractC37304Gc5.A04(parcel, MediaGridArguments.class);
                String readString81 = parcel.readString();
                String readString82 = parcel.readString();
                String readString83 = parcel.readString();
                String readString84 = parcel.readString();
                int readInt12 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt12);
                for (int i12 = 0; i12 != readInt12; i12++) {
                    linkedHashSet2.add(parcel.readString());
                }
                return new MediaGridArguments(rankingInfo2, product2, readString74, readString75, readString76, readString77, readString78, readString79, readString80, readString81, readString82, readString83, readString84, parcel.readString(), hashMap2, linkedHashSet2);
            case 65:
                C14360o3.A0B(parcel, 0);
                return new ShoppingHomeState(parcel);
            case 66:
                int A007 = AbstractC37304Gc5.A00(parcel);
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(A007);
                for (int i13 = 0; i13 != A007; i13++) {
                    linkedHashSet3.add(parcel.readString());
                }
                int readInt13 = parcel.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(readInt13);
                for (int i14 = 0; i14 != readInt13; i14++) {
                    linkedHashSet4.add(parcel.readString());
                }
                int readInt14 = parcel.readInt();
                LinkedHashSet linkedHashSet5 = new LinkedHashSet(readInt14);
                for (int i15 = 0; i15 != readInt14; i15++) {
                    linkedHashSet5.add(parcel.readString());
                }
                int readInt15 = parcel.readInt();
                LinkedHashSet linkedHashSet6 = new LinkedHashSet(readInt15);
                for (int i16 = 0; i16 != readInt15; i16++) {
                    linkedHashSet6.add(parcel.readString());
                }
                int readInt16 = parcel.readInt();
                LinkedHashSet linkedHashSet7 = new LinkedHashSet(readInt16);
                for (int i17 = 0; i17 != readInt16; i17++) {
                    linkedHashSet7.add(parcel.readString());
                }
                return new ShoppingHomeState.HiddenIds(linkedHashSet3, linkedHashSet4, linkedHashSet5, linkedHashSet6, linkedHashSet7);
            case 67:
                int A008 = AbstractC37304Gc5.A00(parcel);
                LinkedHashMap A18 = AbstractC25225BEi.A18(A008);
                for (int i18 = 0; i18 != A008; i18++) {
                    A18.put(parcel.readString(), EnumC77173d3.valueOf(parcel.readString()));
                }
                int readInt17 = parcel.readInt();
                LinkedHashMap A182 = AbstractC25225BEi.A18(readInt17);
                for (int i19 = 0; i19 != readInt17; i19++) {
                    A182.put(parcel.readString(), EnumC77213d7.valueOf(parcel.readString()));
                }
                int readInt18 = parcel.readInt();
                LinkedHashMap A183 = AbstractC25225BEi.A18(readInt18);
                for (int i20 = 0; i20 != readInt18; i20++) {
                    A183.put(parcel.readString(), EnumC77213d7.valueOf(parcel.readString()));
                }
                int readInt19 = parcel.readInt();
                LinkedHashMap A184 = AbstractC25225BEi.A18(readInt19);
                for (int i21 = 0; i21 != readInt19; i21++) {
                    A184.put(parcel.readString(), EnumC77213d7.valueOf(parcel.readString()));
                }
                return new ShoppingHomeState.LikeSaveStatus(A18, A182, A183, A184);
            case 68:
                String A0d6 = AbstractC37304Gc5.A0d(parcel);
                if (A0d6 == null) {
                    A0d6 = "";
                }
                String readString85 = parcel.readString();
                if (readString85 == null) {
                    readString85 = "";
                }
                String readString86 = parcel.readString();
                if (readString86 == null) {
                    readString86 = "";
                }
                ProductTileMedia productTileMedia = (ProductTileMedia) AbstractC37304Gc5.A04(parcel, ProductTileMedia.class);
                String readString87 = parcel.readString();
                String readString88 = parcel.readString();
                String readString89 = parcel.readString();
                Class cls = Integer.TYPE;
                Object readValue = parcel.readValue(cls.getClassLoader());
                if (readValue instanceof Integer) {
                    num5 = (Integer) readValue;
                } else {
                    num5 = null;
                }
                Object readValue2 = parcel.readValue(cls.getClassLoader());
                if (readValue2 instanceof Integer) {
                    num6 = (Integer) readValue2;
                } else {
                    num6 = null;
                }
                String readString90 = parcel.readString();
                boolean A1X = AbstractC37304Gc5.A1X(parcel);
                String readString91 = parcel.readString();
                Object readValue3 = parcel.readValue(cls.getClassLoader());
                if (readValue3 instanceof Integer) {
                    num7 = (Integer) readValue3;
                } else {
                    num7 = null;
                }
                Product product3 = (Product) AbstractC37304Gc5.A04(parcel, Product.class);
                String readString92 = parcel.readString();
                String readString93 = parcel.readString();
                String readString94 = parcel.readString();
                boolean A1X2 = AbstractC37304Gc5.A1X(parcel);
                String readString95 = parcel.readString();
                ShoppingSearchLoggingInfo shoppingSearchLoggingInfo = (ShoppingSearchLoggingInfo) AbstractC37304Gc5.A04(parcel, ShoppingSearchLoggingInfo.class);
                boolean A1X3 = AbstractC37304Gc5.A1X(parcel);
                ShoppingGuideLoggingInfo shoppingGuideLoggingInfo = (ShoppingGuideLoggingInfo) AbstractC37304Gc5.A04(parcel, ShoppingGuideLoggingInfo.class);
                String readString96 = parcel.readString();
                long readLong = parcel.readLong();
                Bundle readBundle = parcel.readBundle();
                RankingInfo rankingInfo3 = (RankingInfo) AbstractC37304Gc5.A04(parcel, RankingInfo.class);
                String readString97 = parcel.readString();
                String readString98 = parcel.readString();
                boolean A1X4 = AbstractC37304Gc5.A1X(parcel);
                String readString99 = parcel.readString();
                String readString100 = parcel.readString();
                String readString101 = parcel.readString();
                String readString102 = parcel.readString();
                String readString103 = parcel.readString();
                String readString104 = parcel.readString();
                String readString105 = parcel.readString();
                String readString106 = parcel.readString();
                if (readString106 != null) {
                    jSONObject = new JSONObject(readString106);
                } else {
                    jSONObject = null;
                }
                boolean A1X5 = AbstractC37304Gc5.A1X(parcel);
                String readString107 = parcel.readString();
                String readString108 = parcel.readString();
                if (readString108 == null) {
                    readString108 = TimeZone.getDefault().getID();
                }
                return new ProductDetailsPageArguments(readBundle, rankingInfo3, productTileMedia, shoppingGuideLoggingInfo, shoppingSearchLoggingInfo, product3, num5, num6, num7, A0d6, readString85, readString86, readString87, readString88, readString89, readString90, readString91, readString92, readString93, readString94, readString95, readString96, readString97, readString98, readString99, readString100, readString101, readString102, readString103, readString104, readString105, readString107, readString108, parcel.readString(), jSONObject, readLong, A1X, A1X2, A1X3, A1X4, A1X5);
            case 69:
                String A0d7 = AbstractC37304Gc5.A0d(parcel);
                C14360o3.A0A(A0d7);
                String readString109 = parcel.readString();
                C14360o3.A0A(readString109);
                String readString110 = parcel.readString();
                C14360o3.A0A(readString110);
                ArrayList A1E5 = AbstractC166987dD.A1E();
                parcel.readStringList(A1E5);
                ArrayList A0q = AbstractC167017dG.A0q(A1E5);
                Iterator it4 = A1E5.iterator();
                while (it4.hasNext()) {
                    Object obj13 = FeaturedProductPermissionStatus.A01.get(it4.next());
                    if (obj13 == null) {
                        obj13 = FeaturedProductPermissionStatus.A0F;
                    }
                    A0q.add(obj13);
                }
                return new FeaturedProductMediaFeedGridConfiguration(A0d7, readString109, readString110, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), A0q, parcel.createStringArrayList(), AbstractC37304Gc5.A1X(parcel));
            case 70:
                int A009 = AbstractC37304Gc5.A00(parcel);
                ArrayList A179 = AbstractC25225BEi.A17(A009);
                for (int i22 = 0; i22 != A009; i22++) {
                    AbstractC37304Gc5.A0r(parcel, MultiProductPickerResult.class, A179);
                }
                int readInt20 = parcel.readInt();
                LinkedHashMap A185 = AbstractC25225BEi.A18(readInt20);
                for (int i23 = 0; i23 != readInt20; i23++) {
                    A185.put(parcel.readString(), AbstractC37304Gc5.A04(parcel, MultiProductPickerResult.class));
                }
                return new MultiProductPickerResult((ProductCollectionFeedTaggingMeta) AbstractC37304Gc5.A04(parcel, MultiProductPickerResult.class), (ProductCollection) AbstractC37304Gc5.A04(parcel, MultiProductPickerResult.class), A179, A185);
            case 71:
                C14360o3.A0B(parcel, 0);
                String readString111 = parcel.readString();
                C14360o3.A0A(readString111);
                C14360o3.A0B(readString111, 0);
                Integer[] A0010 = C05F.A00(7);
                int length = A0010.length;
                int i24 = 0;
                while (true) {
                    if (i24 < length) {
                        num8 = A0010[i24];
                        if (!C14360o3.A0K(AbstractC41359ISm.A00(num8), readString111)) {
                            i24++;
                        }
                    } else {
                        num8 = null;
                    }
                }
                C14360o3.A0A(num8);
                String readString112 = parcel.readString();
                C14360o3.A0A(readString112);
                boolean A1X6 = AbstractC37304Gc5.A1X(parcel);
                String readString113 = parcel.readString();
                boolean A1X7 = AbstractC37304Gc5.A1X(parcel);
                String readString114 = parcel.readString();
                String readString115 = parcel.readString();
                Parcelable.Creator creator2 = ProductTag.CREATOR;
                ArrayList createTypedArrayList = parcel.createTypedArrayList(creator2);
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(creator2);
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                String readString116 = parcel.readString();
                EnumC39584Hdu[] values = EnumC39584Hdu.values();
                int length2 = values.length;
                int i25 = 0;
                while (true) {
                    if (i25 < length2) {
                        enumC39584Hdu = values[i25];
                        if (!C14360o3.A0K(enumC39584Hdu.A00, readString116)) {
                            i25++;
                        }
                    } else {
                        enumC39584Hdu = null;
                    }
                }
                return new ProductPickerArguments(enumC39584Hdu, num8, readString112, readString113, readString114, readString115, parcel.readString(), createTypedArrayList, createTypedArrayList2, createStringArrayList2, A1X6, A1X7, AbstractC37304Gc5.A1X(parcel), AbstractC37304Gc5.A1X(parcel));
            case 72:
                String A0d8 = AbstractC37304Gc5.A0d(parcel);
                String readString117 = parcel.readString();
                if (readString117.equals("AFFILIATE_DISCOVERY")) {
                    num9 = C05F.A00;
                } else if (readString117.equals("PRODUCT_TAGS")) {
                    num9 = C05F.A01;
                } else if (readString117.equals("PRODUCT_STICKERS")) {
                    num9 = C05F.A0C;
                } else if (readString117.equals("SWIPE_UP_LINK")) {
                    num9 = C05F.A0N;
                } else if (readString117.equals("HIGHLIGHTED_PRODUCTS")) {
                    num9 = C05F.A0Y;
                } else if (readString117.equals("REQUEST_TO_FEATURE_IN_SHOP")) {
                    num9 = C05F.A0j;
                } else if (readString117.equals("IGTV_COMPOSER")) {
                    num9 = C05F.A0u;
                } else {
                    throw AbstractC166987dD.A12(readString117);
                }
                EnumC39584Hdu valueOf14 = EnumC39584Hdu.valueOf(parcel.readString());
                String readString118 = parcel.readString();
                String readString119 = parcel.readString();
                String readString120 = parcel.readString();
                ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                String readString121 = parcel.readString();
                String readString122 = parcel.readString();
                boolean A1V24 = AbstractC37304Gc5.A1V(parcel);
                ShoppingTaggingFeedHeader shoppingTaggingFeedHeader = (ShoppingTaggingFeedHeader) AbstractC37304Gc5.A04(parcel, ShoppingTaggingFeedArguments.class);
                return new ShoppingTaggingFeedArguments((ClipInfo) AbstractC37304Gc5.A04(parcel, ShoppingTaggingFeedArguments.class), valueOf14, (ShoppingTaggingFeedClientState) AbstractC37304Gc5.A04(parcel, ShoppingTaggingFeedArguments.class), shoppingTaggingFeedHeader, (TaggingFeedMultiSelectState) AbstractC37304Gc5.A04(parcel, ShoppingTaggingFeedArguments.class), num9, AbstractC37304Gc5.A0a(parcel), A0d8, readString118, readString119, readString120, readString121, readString122, parcel.readString(), parcel.readString(), createStringArrayList3, A1V24, AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 73:
                ?? obj14 = new Object();
                obj14.A02 = parcel.readString();
                obj14.A01 = parcel.readString();
                obj14.A00 = (LinkWithText) AbstractC37304Gc5.A04(parcel, LinkWithText.class);
                return obj14;
            case 74:
                C14360o3.A0B(parcel, 0);
                return new ProductDetailsPageLoggingInfo(parcel);
            case 75:
                C14360o3.A0B(parcel, 0);
                return new ShoppingGuideLoggingInfo(parcel);
            case 76:
                return new ShoppingNavigationInfo(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            case 77:
                return new ShoppingSearchLoggingInfo(AbstractC37304Gc5.A0d(parcel), parcel.readString(), (HashMap) parcel.readSerializable());
            case 78:
                String A0d9 = AbstractC37304Gc5.A0d(parcel);
                String readString123 = parcel.readString();
                String readString124 = parcel.readString();
                String readString125 = parcel.readString();
                String readString126 = parcel.readString();
                ImageUrl imageUrl = (ImageUrl) AbstractC37304Gc5.A04(parcel, ProductCollectionShareInfo.class);
                String readString127 = parcel.readString();
                String readString128 = parcel.readString();
                ImageUrl imageUrl2 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ProductCollectionShareInfo.class);
                if (parcel.readInt() == 0) {
                    A17 = null;
                } else {
                    int readInt21 = parcel.readInt();
                    A17 = AbstractC25225BEi.A17(readInt21);
                    for (int i26 = 0; i26 != readInt21; i26++) {
                        AbstractC37304Gc5.A0r(parcel, ProductCollectionShareInfo.class, A17);
                    }
                }
                return new ProductCollectionShareInfo(imageUrl, imageUrl2, A0d9, readString123, readString124, readString125, readString126, readString127, readString128, A17);
            case 79:
                C14360o3.A0B(parcel, 0);
                return DestinationContentType.values()[parcel.readInt()];
            case 80:
                C14360o3.A0B(parcel, 0);
                return DestinationItemLabelType.values()[parcel.readInt()];
            case 81:
                C14360o3.A0B(parcel, 0);
                return DestinationSignalType.values()[parcel.readInt()];
            case 82:
                return new HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(parcel);
            case 83:
                C14360o3.A0B(parcel, 0);
                SecondaryTextContent secondaryTextContent = new SecondaryTextContent();
                secondaryTextContent.A00 = parcel.readString();
                secondaryTextContent.A01 = parcel.createStringArrayList();
                return secondaryTextContent;
            case 84:
                C14360o3.A0B(parcel, 0);
                Parcelable A04 = AbstractC37304Gc5.A04(parcel, ProductSourceOverrideStatus.class);
                C14360o3.A0A(A04);
                return new ProductSourceOverrideState((ProductSource) AbstractC37304Gc5.A04(parcel, ProductSource.class), (ProductSourceOverrideStatus) A04, parcel.readString());
            case 85:
                return ProductSourceOverrideStatus.values()[parcel.readInt()];
            case 86:
                C14360o3.A0B(parcel, 0);
                parcel.readInt();
                return ShoppingReconFeedEndpoint.ReconDestinationFeedEndpoint.A00;
            case 87:
                String A0d10 = AbstractC37304Gc5.A0d(parcel);
                String readString129 = parcel.readString();
                String readString130 = parcel.readString();
                boolean A1M3 = AbstractC167007dF.A1M(parcel.readInt());
                ImageUrl imageUrl3 = (ImageUrl) AbstractC37304Gc5.A04(parcel, ShopShareInfo.class);
                String readString131 = parcel.readString();
                String readString132 = parcel.readString();
                ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    A172 = null;
                } else {
                    int readInt22 = parcel.readInt();
                    A172 = AbstractC25225BEi.A17(readInt22);
                    for (int i27 = 0; i27 != readInt22; i27++) {
                        AbstractC37304Gc5.A0r(parcel, ShopShareInfo.class, A172);
                    }
                }
                return new ShopShareInfo(imageUrl3, A0d10, readString129, readString130, readString131, readString132, createStringArrayList4, A172, A1M3);
            case 88:
                return new ProductCollectionFeedTaggingMeta((ProductCollectionV2Type) AbstractC37304Gc5.A04(parcel, ProductCollectionFeedTaggingMeta.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 89:
                int A0011 = AbstractC37304Gc5.A00(parcel);
                ArrayList A1710 = AbstractC25225BEi.A17(A0011);
                for (int i28 = 0; i28 != A0011; i28++) {
                    AbstractC37304Gc5.A0r(parcel, ShoppingTaggingFeedClientState.class, A1710);
                }
                ArrayList<String> createStringArrayList5 = parcel.createStringArrayList();
                ArrayList<String> createStringArrayList6 = parcel.createStringArrayList();
                ArrayList<String> createStringArrayList7 = parcel.createStringArrayList();
                ArrayList<String> createStringArrayList8 = parcel.createStringArrayList();
                int readInt23 = parcel.readInt();
                ArrayList A1711 = AbstractC25225BEi.A17(readInt23);
                for (int i29 = 0; i29 != readInt23; i29++) {
                    AbstractC37304Gc5.A0r(parcel, ShoppingTaggingFeedClientState.class, A1711);
                }
                return new ShoppingTaggingFeedClientState(A1710, createStringArrayList5, createStringArrayList6, createStringArrayList7, createStringArrayList8, A1711, parcel.createStringArrayList());
            case 90:
                return new ShoppingTaggingFeedHeader(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 91:
                C14360o3.A0B(parcel, 0);
                return SourceType.values()[parcel.readInt()];
            case 92:
                int A0012 = AbstractC37304Gc5.A00(parcel);
                LinkedHashMap A186 = AbstractC25225BEi.A18(A0012);
                for (int i30 = 0; i30 != A0012; i30++) {
                    A186.put(parcel.readString(), AbstractC37304Gc5.A04(parcel, TaggingFeedMultiSelectState.class));
                }
                int readInt24 = parcel.readInt();
                LinkedHashMap A187 = AbstractC25225BEi.A18(readInt24);
                for (int i31 = 0; i31 != readInt24; i31++) {
                    A187.put(parcel.readString(), ProductCollectionFeedTaggingMeta.CREATOR.createFromParcel(parcel));
                }
                int readInt25 = parcel.readInt();
                LinkedHashMap A188 = AbstractC25225BEi.A18(readInt25);
                for (int i32 = 0; i32 != readInt25; i32++) {
                    A188.put(parcel.readString(), AbstractC37304Gc5.A04(parcel, TaggingFeedMultiSelectState.class));
                }
                ArrayList<String> createStringArrayList9 = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    createFromParcel6 = null;
                } else {
                    createFromParcel6 = ProductCollectionFeedTaggingMeta.CREATOR.createFromParcel(parcel);
                }
                return new TaggingFeedMultiSelectState((ProductCollectionFeedTaggingMeta) createFromParcel6, createStringArrayList9, A186, A187, A188);
            case 93:
                return new VariantSelectorModel(parcel);
            case 94:
                return new SimpleWebViewConfig(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 95:
                C14360o3.A0B(parcel, 0);
                ?? obj15 = new Object();
                obj15.A06 = parcel.readString();
                obj15.A02 = parcel.readInt();
                obj15.A00 = parcel.readInt();
                obj15.A09 = parcel.readString();
                obj15.A05 = parcel.readString();
                obj15.A04 = parcel.readString();
                obj15.A01 = parcel.readInt();
                obj15.A03 = parcel.readInt();
                obj15.A08 = parcel.readString();
                obj15.A07 = parcel.readString();
                return obj15;
            case 96:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    createFromParcel7 = null;
                } else {
                    createFromParcel7 = AdsRatingInfo.CREATOR.createFromParcel(parcel);
                }
                return new AdsBizBadgeInfoImpl((AdsRatingInfo) createFromParcel7);
            case 97:
                C14360o3.A0B(parcel, 0);
                AdsBizBadgeInfo adsBizBadgeInfo = (AdsBizBadgeInfo) AbstractC37304Gc5.A04(parcel, AdsCTATrustInfo.class);
                if (parcel.readInt() == 0) {
                    A173 = null;
                } else {
                    int readInt26 = parcel.readInt();
                    A173 = AbstractC25225BEi.A17(readInt26);
                    for (int i33 = 0; i33 != readInt26; i33++) {
                        AbstractC37304Gc5.A0r(parcel, AdsCTATrustInfo.class, A173);
                    }
                }
                return new AdsCTATrustInfo(adsBizBadgeInfo, A173);
            case 98:
                String A0d11 = AbstractC37304Gc5.A0d(parcel);
                ArrayList arrayList4 = null;
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                if (parcel.readInt() != 0) {
                    int readInt27 = parcel.readInt();
                    arrayList4 = AbstractC25225BEi.A17(readInt27);
                    for (int i34 = 0; i34 != readInt27; i34++) {
                        AbstractC37304Gc5.A0r(parcel, AdsIAWRatingInfo.class, arrayList4);
                    }
                }
                return new AdsIAWRatingInfo(valueOf6, AbstractC37304Gc5.A0S(parcel), AbstractC37304Gc5.A0W(parcel), A0d11, arrayList4);
            default:
                String A0d12 = AbstractC37304Gc5.A0d(parcel);
                ArrayList arrayList5 = null;
                if (parcel.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat = (AdsRatingAndReviewDisplayFormat) AbstractC37304Gc5.A04(parcel, AdsRatingInfo.class);
                if (parcel.readInt() != 0) {
                    int readInt28 = parcel.readInt();
                    arrayList5 = AbstractC25225BEi.A17(readInt28);
                    for (int i35 = 0; i35 != readInt28; i35++) {
                        AbstractC37304Gc5.A0r(parcel, AdsRatingInfo.class, arrayList5);
                    }
                }
                return new AdsRatingInfo(adsRatingAndReviewDisplayFormat, valueOf7, AbstractC37304Gc5.A0S(parcel), AbstractC37304Gc5.A0W(parcel), A0d12, arrayList5);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new CheckoutData[i];
            case 1:
                return new AllUserStoryTarget[i];
            case 2:
                return new BrandedContentTag[i];
            case 3:
                return new CloseFriendsUserStoryTarget[i];
            case 4:
                return new GroupProfileUserStoryTarget[i];
            case 5:
                return new GroupUserStoryTarget[i];
            case 6:
                return new SimpleUserStoryTarget[i];
            case 7:
                return new AccountLinkModel.AddExternalLinkData[i];
            case 8:
                return new AccountLinkModel.AddExternalLinkDataEnhanced[i];
            case 9:
                return new AccountLinkModel.AddExternalLinkDataV2[i];
            case 10:
                return new AccountLinkModel.AddFacebookLinkData[i];
            case 11:
                return new AccountLinkModel.AddFacebookPageLinkData[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new AccountLinkModel.BottomMessageData[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new AccountLinkModel.ExternalLinkData[i];
            case 14:
                return new AccountLinkModel.ExternalLinkDataEnhanced[i];
            case Process.SIGTERM /* 15 */:
                return new AccountLinkModel.ExternalLinkDataV2[i];
            case 16:
                return new AccountLinkModel.FacebookLinkData[i];
            case 17:
                return new AccountLinkModel.FacebookLinkDataV2[i];
            case 18:
                return new AccountLinkModel.FacebookPageLinkData[i];
            case Process.SIGSTOP /* 19 */:
                return new AutoLaunchReelParams[i];
            case 20:
                return new MultipleLinksEditModel[i];
            case 21:
                return new UserDetailEntryInfo[i];
            case 22:
                return new UserDetailLaunchConfig[i];
            case 23:
                return new ChannelChallengeStickerWinnerModel[i];
            case 24:
                return new ChatStickerChannelType[i];
            case 25:
                return new ChatStickerStickerType[i];
            case 26:
                return new GroupMentionQuickReplySheetContent[i];
            case 27:
                return new MemoryItem[i];
            case 28:
                return new MusicPickReelTag[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new MusicPickStickerModel[i];
            case 30:
                return new ProfileCardStickerModel[i];
            case 31:
                return new MusicQuestionResponseModel[i];
            case 32:
                return new QuestionResponseModel[i];
            case 33:
                return new QuestionResponseReshareModel[i];
            case 34:
                return new QuestionResponsesModel[i];
            case 35:
                return new QuestionMediaResponseModel[i];
            case 36:
                return new ProfileStickerAiAgentData[i];
            case 37:
                return new ProfileStickerModel[i];
            case 38:
                return new RegFlowExtras[i];
            case 39:
                return new UserBirthDate[i];
            case 40:
                return new RtcIncomingParams[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString[i];
            case 43:
                return new RtcConnectionEntity.EndCallConnectionEntity[i];
            case 44:
                return new RtcConnectionEntity.LiveInviteConnectionEntity[i];
            case 45:
                return new RtcConnectionEntity.RtcCallConnectionEntity[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new RtcConnectionEntity.RtcCallGenericConnectionEntity[i];
            case 47:
                return new RtcSettingsParticipant[i];
            case 48:
                return new SaveToCollectionsParentInsightsHost[i];
            case 49:
                return new SavedContextualFeedNetworkConfig[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new CollaborativeCollectionMetadata[i];
            case 51:
                return new SavedCollection[i];
            case 52:
                return new BadgeVisibilitySettingItem[i];
            case 53:
                return new SchoolAddress[i];
            case 54:
                return new SchoolInfo[i];
            case 55:
                return new SchoolOnboardingParcelData[i];
            case 56:
                return new SerpContextualFeedConfig[i];
            case 57:
                return new KeywordSerpContextualFeedConfig[i];
            case 58:
                return new DataDownloadStatusCheckResponse[i];
            case 59:
                return new DataDownloadStatusCheckResponse.JobStatus[i];
            case 60:
                return new DirectMessageInteropReachabilityOptions[i];
            case 61:
                return new DirectMessagesInteropOptionsViewModel[i];
            case 62:
                return new SettingsScreenConfirmBottomSheetFragment$Item[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new LightboxArguments[i];
            case 64:
                return new MediaGridArguments[i];
            case 65:
                return new ShoppingHomeState[i];
            case 66:
                return new ShoppingHomeState.HiddenIds[i];
            case 67:
                return new ShoppingHomeState.LikeSaveStatus[i];
            case 68:
                return new ProductDetailsPageArguments[i];
            case 69:
                return new FeaturedProductMediaFeedGridConfiguration[i];
            case 70:
                return new MultiProductPickerResult[i];
            case 71:
                return new ProductPickerArguments[i];
            case 72:
                return new ShoppingTaggingFeedArguments[i];
            case 73:
                return new ShippingAndReturnsSection[i];
            case 74:
                return new ProductDetailsPageLoggingInfo[i];
            case 75:
                return new ShoppingGuideLoggingInfo[i];
            case 76:
                return new ShoppingNavigationInfo[i];
            case 77:
                return new ShoppingSearchLoggingInfo[i];
            case 78:
                return new ProductCollectionShareInfo[i];
            case 79:
                return new DestinationContentType[i];
            case 80:
                return new DestinationItemLabelType[i];
            case 81:
                return new DestinationSignalType[i];
            case 82:
                return new HeroCarouselItemConverter$ParcelableHeroCarouselItemModel[i];
            case 83:
                return new SecondaryTextContent[i];
            case 84:
                return new ProductSourceOverrideState[i];
            case 85:
                return new ProductSourceOverrideStatus[i];
            case 86:
                return new ShoppingReconFeedEndpoint.ReconDestinationFeedEndpoint[i];
            case 87:
                return new ShopShareInfo[i];
            case 88:
                return new ProductCollectionFeedTaggingMeta[i];
            case 89:
                return new ShoppingTaggingFeedClientState[i];
            case 90:
                return new ShoppingTaggingFeedHeader[i];
            case 91:
                return new SourceType[i];
            case 92:
                return new TaggingFeedMultiSelectState[i];
            case 93:
                return new VariantSelectorModel[i];
            case 94:
                return new SimpleWebViewConfig[i];
            case 95:
                return new SourceModelInfoParams[i];
            case 96:
                return new AdsBizBadgeInfoImpl[i];
            case 97:
                return new AdsCTATrustInfo[i];
            case 98:
                return new AdsIAWRatingInfo[i];
            default:
                return new AdsRatingInfo[i];
        }
    }
}
