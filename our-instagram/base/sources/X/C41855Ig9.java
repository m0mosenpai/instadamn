package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.api.schemas.BusinessProfileDict;
import com.instagram.api.schemas.CreditCardAssociation;
import com.instagram.api.schemas.Entity;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.FundingSourceType;
import com.instagram.api.schemas.GuidanceTipIconAsset;
import com.instagram.api.schemas.MiniShopColorPaletteCustomizationImpl;
import com.instagram.api.schemas.MiniShopSellerOnboardingStatus;
import com.instagram.api.schemas.ModuleVariant;
import com.instagram.api.schemas.MultiAuthorStoryType;
import com.instagram.api.schemas.MultiProductComponentDestinationType;
import com.instagram.api.schemas.MusicDropStreamingServiceData;
import com.instagram.api.schemas.MusicDropStreamingServiceEnum;
import com.instagram.api.schemas.MusicDropType;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.api.schemas.MusicStatusStyleResponseInfoImpl;
import com.instagram.api.schemas.NativeInfoCardCommentLayout;
import com.instagram.api.schemas.NativeInfoCardTextAlignment;
import com.instagram.api.schemas.NonDiscInfo;
import com.instagram.api.schemas.NonprofitSelectorSurfaceEnum;
import com.instagram.api.schemas.NoteActivationType;
import com.instagram.api.schemas.NoteChatResponseInfoImpl;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteEmojiReactionInfo;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.api.schemas.NoteReactionType;
import com.instagram.api.schemas.OneTapLinkedProfileInfoImpl;
import com.instagram.api.schemas.OpenDraftGalleryCommandImpl;
import com.instagram.api.schemas.OpenInspirationHubCommandImpl;
import com.instagram.api.schemas.OrganicCTAType;
import com.instagram.api.schemas.OverlayAdTapDestinationEnum;
import com.instagram.api.schemas.OverlayAdsFormatEnum;
import com.instagram.api.schemas.OverlayAdsTextStyleEnum;
import com.instagram.api.schemas.PartnerProgramOnboardingSteps;
import com.instagram.api.schemas.PartnerTypes;
import com.instagram.api.schemas.PaymentCredentialTypeEnum;
import com.instagram.api.schemas.PaymentInfo;
import com.instagram.api.schemas.PaymentMethod;
import com.instagram.api.schemas.PaymentMethodImpl;
import com.instagram.api.schemas.PendingShareToFriendsStoryBadgePreviewState;
import com.instagram.api.schemas.PermalinkItemType;
import com.instagram.api.schemas.Phrase;
import com.instagram.api.schemas.PivotPageInsightsTipImpl;
import com.instagram.api.schemas.PopularReelWithFollowersInsightMetadataImpl;
import com.instagram.api.schemas.PresenceAudience;
import com.instagram.api.schemas.ProductAffiliateInformationDictImpl;
import com.instagram.api.schemas.ProductArtsLabelInformationDictImpl;
import com.instagram.api.schemas.ProductArtsLabelsDict;
import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.api.schemas.ProductDetailsSellerBadgeContent;
import com.instagram.api.schemas.ProductDetailsSellerBadgeContentImpl;
import com.instagram.api.schemas.ProductDiscountInformationDictImpl;
import com.instagram.api.schemas.ProductDiscountsDictImpl;
import com.instagram.api.schemas.ProductItemStickerBundleStyle;
import com.instagram.api.schemas.ProductMediaType;
import com.instagram.api.schemas.ProductPivotsButtonActionType;
import com.instagram.api.schemas.ProductPivotsButtonImpl;
import com.instagram.api.schemas.ProductPivotsSourceMediaType;
import com.instagram.api.schemas.ProductTaggingFeedComponentType;
import com.instagram.api.schemas.ProductTileBannerMetadataDecorationImpl;
import com.instagram.api.schemas.ProductTileBannerType;
import com.instagram.api.schemas.ProductTileContext;
import com.instagram.api.schemas.ProductTileContextImpl;
import com.instagram.api.schemas.ProductTileContextMetadata;
import com.instagram.api.schemas.ProductTileContextMetadataImpl;
import com.instagram.api.schemas.ProductTileContextVariant;
import com.instagram.api.schemas.ProductTileFeaturedProductPermissionInfoLabelOptions;
import com.instagram.api.schemas.ProductTileFeaturedProductPermissionInfoLabelOptionsImpl;
import com.instagram.api.schemas.ProductTileLabelImpl;
import com.instagram.api.schemas.ProductTileLabelType;
import com.instagram.api.schemas.ProductTileLayoutContent;
import com.instagram.api.schemas.ProductTileLayoutContentImpl;
import com.instagram.api.schemas.ProductTileMetadataDecorations;
import com.instagram.api.schemas.ProductTileMetadataDecorationsImpl;
import com.instagram.api.schemas.ProductTileMetadataDestination;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import com.instagram.api.schemas.ProductTilePriceLabelOptions;
import com.instagram.api.schemas.ProductTilePriceLabelOptionsImpl;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.api.schemas.ProductTileProductNameLabelOptions;
import com.instagram.api.schemas.ProductTileProductNameLabelOptionsImpl;
import com.instagram.api.schemas.ProductTileTextColorType;
import com.instagram.api.schemas.ProductTileTextStyleType;
import com.instagram.api.schemas.ProductTileUCILoggingInfoImpl;
import com.instagram.api.schemas.ProductVariantPossibleValueDict;
import com.instagram.api.schemas.ProductWithMediaImageImpl;
import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.api.schemas.ProfileThemeImpl;
import com.instagram.api.schemas.ProfileThemeType;
import com.instagram.api.schemas.PromoteUnavailableReason;
import com.instagram.api.schemas.PromptFirstMediaType;
import com.instagram.api.schemas.PublisherPlatform;
import com.instagram.api.schemas.REPETITION_UI_TYPE;
import com.instagram.api.schemas.RIXUCoverCTAPosition;
import com.instagram.api.schemas.RIXUCoverElementMetadataType;
import com.instagram.api.schemas.RIXUCoverPreviewType;
import com.instagram.api.schemas.RIXUCoverSize;
import com.instagram.api.schemas.RIXUTextLinkImpl;
import com.instagram.api.schemas.Range;
import com.instagram.api.schemas.RankingAlgorithm;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.ReelTappableObjectType;
import com.instagram.api.schemas.ReelsMediaInteractivityType;
import com.instagram.api.schemas.RemoteBooleanSettingId;
import com.instagram.api.schemas.RemoteStringSettingId;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.api.schemas.SMBSupportStickerDict;
import com.instagram.api.schemas.ScheduledLiveAffiliateInfoImpl;
import com.instagram.api.schemas.ScheduledLiveDiscountInfoImpl;
import com.instagram.api.schemas.SellerBadgeDict;
import com.instagram.api.schemas.SellerBadgeSurfaces;
import com.instagram.api.schemas.SellerBadgeType;
import com.instagram.api.schemas.SettingId;
import com.instagram.api.schemas.ShoppingBrandWithProductsImpl;
import com.instagram.api.schemas.ShoppingBrandWithProductsSubtitle;
import com.instagram.api.schemas.XDTCreatorInspirationHubType;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;

/* renamed from: X.Ig9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41855Ig9 implements Parcelable.Creator {
    public final int A00;

    public C41855Ig9(int i) {
        this.A00 = i;
    }

    public static C41855Ig9 A00(int i) {
        return new C41855Ig9(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        Integer A0U;
        ArrayList A17;
        ArrayList A172;
        Boolean valueOf2;
        Float valueOf3;
        Boolean valueOf4;
        ArrayList A173;
        ArrayList A174;
        switch (this.A00) {
            case 0:
                return new MiniShopColorPaletteCustomizationImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 1:
                C14360o3.A0B(parcel, 0);
                return MiniShopSellerOnboardingStatus.values()[parcel.readInt()];
            case 2:
                C14360o3.A0B(parcel, 0);
                return ModuleVariant.values()[parcel.readInt()];
            case 3:
                C14360o3.A0B(parcel, 0);
                return MultiAuthorStoryType.values()[parcel.readInt()];
            case 4:
                C14360o3.A0B(parcel, 0);
                return MultiProductComponentDestinationType.values()[parcel.readInt()];
            case 5:
                return new MusicDropStreamingServiceData((MusicDropStreamingServiceEnum) AbstractC37304Gc5.A04(parcel, MusicDropStreamingServiceData.class), AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 6:
                C14360o3.A0B(parcel, 0);
                return MusicDropStreamingServiceEnum.values()[parcel.readInt()];
            case 7:
                C14360o3.A0B(parcel, 0);
                return MusicDropType.values()[parcel.readInt()];
            case 8:
                C14360o3.A0B(parcel, 0);
                return MusicPageTabType.values()[parcel.readInt()];
            case 9:
                return new MusicStatusStyleResponseInfoImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 10:
                C14360o3.A0B(parcel, 0);
                return NativeInfoCardCommentLayout.values()[parcel.readInt()];
            case 11:
                C14360o3.A0B(parcel, 0);
                return NativeInfoCardTextAlignment.values()[parcel.readInt()];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new NonDiscInfo(AbstractC167007dF.A1M(AbstractC37304Gc5.A00(parcel)), AbstractC37304Gc5.A1W(parcel));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(parcel, 0);
                return NonprofitSelectorSurfaceEnum.values()[parcel.readInt()];
            case 14:
                C14360o3.A0B(parcel, 0);
                return NoteActivationType.values()[parcel.readInt()];
            case Process.SIGTERM /* 15 */:
                String A0d = AbstractC37304Gc5.A0d(parcel);
                boolean A1M = AbstractC167007dF.A1M(parcel.readInt());
                Integer A0V = AbstractC37304Gc5.A0V(parcel);
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                ArrayList A175 = AbstractC25225BEi.A17(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    AbstractC37304Gc5.A0r(parcel, NoteChatResponseInfoImpl.class, A175);
                }
                return new NoteChatResponseInfoImpl(A0V, A0d, A175, readInt, A1M);
            case 16:
                C14360o3.A0B(parcel, 0);
                return new NoteCustomThemeImpl((NoteActivationType) AbstractC37304Gc5.A04(parcel, NoteCustomThemeImpl.class), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 17:
                String A0d2 = AbstractC37304Gc5.A0d(parcel);
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new NoteEmojiReactionInfo((NoteReactionType) AbstractC37304Gc5.A04(parcel, NoteEmojiReactionInfo.class), (User) AbstractC37304Gc5.A04(parcel, NoteEmojiReactionInfo.class), valueOf, A0d2);
            case 18:
                return new NotePogImageDict(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case Process.SIGSTOP /* 19 */:
                String A0d3 = AbstractC37304Gc5.A0d(parcel);
                ImageInfo imageInfo = (ImageInfo) AbstractC37304Gc5.A04(parcel, NotePogVideoDict.class);
                String readString = parcel.readString();
                int readInt3 = parcel.readInt();
                ArrayList A176 = AbstractC25225BEi.A17(readInt3);
                for (int i2 = 0; i2 != readInt3; i2++) {
                    AbstractC37304Gc5.A0r(parcel, NotePogVideoDict.class, A176);
                }
                return new NotePogVideoDict(imageInfo, A0d3, readString, A176);
            case 20:
                C14360o3.A0B(parcel, 0);
                return NoteReactionType.values()[parcel.readInt()];
            case 21:
                return new OneTapLinkedProfileInfoImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 22:
                C14360o3.A0B(parcel, 0);
                return new OpenDraftGalleryCommandImpl(AbstractC37304Gc5.A0V(parcel));
            case 23:
                C14360o3.A0B(parcel, 0);
                return new OpenInspirationHubCommandImpl((XDTCreatorInspirationHubType) AbstractC37304Gc5.A04(parcel, OpenInspirationHubCommandImpl.class));
            case 24:
                C14360o3.A0B(parcel, 0);
                return OrganicCTAType.values()[parcel.readInt()];
            case 25:
                C14360o3.A0B(parcel, 0);
                return OverlayAdTapDestinationEnum.values()[parcel.readInt()];
            case 26:
                C14360o3.A0B(parcel, 0);
                return OverlayAdsFormatEnum.values()[parcel.readInt()];
            case 27:
                C14360o3.A0B(parcel, 0);
                return OverlayAdsTextStyleEnum.values()[parcel.readInt()];
            case 28:
                C14360o3.A0B(parcel, 0);
                return PartnerProgramOnboardingSteps.values()[parcel.readInt()];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C14360o3.A0B(parcel, 0);
                return PartnerTypes.values()[parcel.readInt()];
            case 30:
                C14360o3.A0B(parcel, 0);
                return PaymentCredentialTypeEnum.values()[parcel.readInt()];
            case 31:
                Integer num = null;
                if (AbstractC37304Gc5.A00(parcel) != 0) {
                    num = AbstractC37304Gc5.A0U(parcel);
                }
                return new PaymentInfo((PaymentMethod) AbstractC37304Gc5.A04(parcel, PaymentInfo.class), num, AbstractC37304Gc5.A0W(parcel), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 32:
                C14360o3.A0B(parcel, 0);
                return new PaymentMethodImpl((CreditCardAssociation) AbstractC37304Gc5.A04(parcel, PaymentMethodImpl.class), (FundingSourceType) AbstractC37304Gc5.A04(parcel, PaymentMethodImpl.class), parcel.readString(), parcel.readString());
            case 33:
                C14360o3.A0B(parcel, 0);
                return PendingShareToFriendsStoryBadgePreviewState.values()[parcel.readInt()];
            case 34:
                C14360o3.A0B(parcel, 0);
                return PermalinkItemType.values()[parcel.readInt()];
            case 35:
                ArrayList arrayList = null;
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    A0U = null;
                } else {
                    A0U = AbstractC37304Gc5.A0U(parcel);
                }
                String readString2 = parcel.readString();
                Integer A0X = AbstractC37304Gc5.A0X(parcel);
                if (parcel.readInt() != 0) {
                    int readInt4 = parcel.readInt();
                    arrayList = AbstractC25225BEi.A17(readInt4);
                    for (int i3 = 0; i3 != readInt4; i3++) {
                        AbstractC37304Gc5.A0r(parcel, Phrase.class, arrayList);
                    }
                }
                return new Phrase(A0U, A0X, readString2, arrayList);
            case 36:
                return new PivotPageInsightsTipImpl((GuidanceTipIconAsset) AbstractC37304Gc5.A04(parcel, PivotPageInsightsTipImpl.class), AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 37:
                return new PopularReelWithFollowersInsightMetadataImpl(parcel.createStringArrayList(), AbstractC37304Gc5.A00(parcel), parcel.readInt(), parcel.readInt());
            case 38:
                C14360o3.A0B(parcel, 0);
                return PresenceAudience.values()[parcel.readInt()];
            case 39:
                return new ProductAffiliateInformationDictImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 40:
                return new ProductArtsLabelInformationDictImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case Seq.NULL_REFNUM /* 41 */:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    A17 = null;
                } else {
                    int readInt5 = parcel.readInt();
                    A17 = AbstractC25225BEi.A17(readInt5);
                    for (int i4 = 0; i4 != readInt5; i4++) {
                        AbstractC37304Gc5.A0r(parcel, ProductArtsLabelsDict.class, A17);
                    }
                }
                return new ProductArtsLabelsDict(A17);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C14360o3.A0B(parcel, 0);
                return ProductCardSubtitleType.values()[parcel.readInt()];
            case 43:
                C14360o3.A0B(parcel, 0);
                return ProductCollectionV2Type.values()[parcel.readInt()];
            case 44:
                return new ProductDetailsSellerBadgeContentImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 45:
                return new ProductDiscountInformationDictImpl(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    A172 = null;
                } else {
                    int readInt6 = parcel.readInt();
                    A172 = AbstractC25225BEi.A17(readInt6);
                    for (int i5 = 0; i5 != readInt6; i5++) {
                        AbstractC37304Gc5.A0r(parcel, ProductDiscountsDictImpl.class, A172);
                    }
                }
                return new ProductDiscountsDictImpl(A172);
            case 47:
                C14360o3.A0B(parcel, 0);
                return ProductItemStickerBundleStyle.values()[parcel.readInt()];
            case 48:
                C14360o3.A0B(parcel, 0);
                return ProductMediaType.values()[parcel.readInt()];
            case 49:
                C14360o3.A0B(parcel, 0);
                return ProductPivotsButtonActionType.values()[parcel.readInt()];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                C14360o3.A0B(parcel, 0);
                return new ProductPivotsButtonImpl((ProductPivotsButtonActionType) AbstractC37304Gc5.A04(parcel, ProductPivotsButtonImpl.class), (ProductPivotsButtonActionType) AbstractC37304Gc5.A04(parcel, ProductPivotsButtonImpl.class), (User) AbstractC37304Gc5.A04(parcel, ProductPivotsButtonImpl.class), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 51:
                C14360o3.A0B(parcel, 0);
                return ProductPivotsSourceMediaType.values()[parcel.readInt()];
            case 52:
                C14360o3.A0B(parcel, 0);
                return ProductTaggingFeedComponentType.values()[parcel.readInt()];
            case 53:
                return new ProductTileBannerMetadataDecorationImpl((ProductTileBannerType) AbstractC37304Gc5.A04(parcel, ProductTileBannerMetadataDecorationImpl.class), AbstractC37304Gc5.A0d(parcel));
            case 54:
                C14360o3.A0B(parcel, 0);
                return ProductTileBannerType.values()[parcel.readInt()];
            case 55:
                C14360o3.A0B(parcel, 0);
                return new ProductTileContextImpl((ProductTileContextMetadata) AbstractC37304Gc5.A04(parcel, ProductTileContextImpl.class), (ProductTileContextVariant) AbstractC37304Gc5.A04(parcel, ProductTileContextImpl.class), parcel.readString());
            case 56:
                int A00 = AbstractC37304Gc5.A00(parcel);
                ArrayList A177 = AbstractC25225BEi.A17(A00);
                for (int i6 = 0; i6 != A00; i6++) {
                    AbstractC37304Gc5.A0r(parcel, ProductTileContextMetadataImpl.class, A177);
                }
                return new ProductTileContextMetadataImpl(A177);
            case 57:
                C14360o3.A0B(parcel, 0);
                return ProductTileContextVariant.values()[parcel.readInt()];
            case 58:
                return new ProductTileFeaturedProductPermissionInfoLabelOptionsImpl((ProductTileTextStyleType) AbstractC37304Gc5.A04(parcel, ProductTileFeaturedProductPermissionInfoLabelOptionsImpl.class), AbstractC37304Gc5.A0d(parcel));
            case 59:
                C14360o3.A0B(parcel, 0);
                return new ProductTileLabelImpl((ProductTileLabelType) AbstractC37304Gc5.A04(parcel, ProductTileLabelImpl.class), (ProductTileLayoutContent) AbstractC37304Gc5.A04(parcel, ProductTileLabelImpl.class));
            case 60:
                C14360o3.A0B(parcel, 0);
                return ProductTileLabelType.values()[parcel.readInt()];
            case 61:
                C14360o3.A0B(parcel, 0);
                return new ProductTileLayoutContentImpl((ProductTileFeaturedProductPermissionInfoLabelOptions) AbstractC37304Gc5.A04(parcel, ProductTileLayoutContentImpl.class), (ProductTilePriceLabelOptions) AbstractC37304Gc5.A04(parcel, ProductTileLayoutContentImpl.class), (ProductTileProductNameLabelOptions) AbstractC37304Gc5.A04(parcel, ProductTileLayoutContentImpl.class));
            case 62:
                int A002 = AbstractC37304Gc5.A00(parcel);
                ArrayList A178 = AbstractC25225BEi.A17(A002);
                for (int i7 = 0; i7 != A002; i7++) {
                    AbstractC37304Gc5.A0r(parcel, ProductTileMetadataDecorationsImpl.class, A178);
                }
                ProductTileContext productTileContext = (ProductTileContext) AbstractC37304Gc5.A04(parcel, ProductTileMetadataDecorationsImpl.class);
                boolean A1V = AbstractC37304Gc5.A1V(parcel);
                boolean A1V2 = AbstractC37304Gc5.A1V(parcel);
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new ProductTileMetadataDecorationsImpl(productTileContext, valueOf2, A178, A1V, A1V2, AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                C14360o3.A0B(parcel, 0);
                return ProductTileMetadataDestination.values()[parcel.readInt()];
            case 64:
                C14360o3.A0B(parcel, 0);
                ProductTileMetadataDecorations productTileMetadataDecorations = (ProductTileMetadataDecorations) AbstractC37304Gc5.A04(parcel, ProductTileMetadataImpl.class);
                ProductTileMetadataDestination productTileMetadataDestination = (ProductTileMetadataDestination) AbstractC37304Gc5.A04(parcel, ProductTileMetadataImpl.class);
                int readInt7 = parcel.readInt();
                ArrayList A179 = AbstractC25225BEi.A17(readInt7);
                for (int i8 = 0; i8 != readInt7; i8++) {
                    AbstractC37304Gc5.A0r(parcel, ProductTileMetadataImpl.class, A179);
                }
                return new ProductTileMetadataImpl(productTileMetadataDecorations, productTileMetadataDestination, A179);
            case 65:
                return new ProductTilePriceLabelOptionsImpl(AbstractC167007dF.A1M(AbstractC37304Gc5.A00(parcel)), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1W(parcel));
            case 66:
                C14360o3.A0B(parcel, 0);
                return new ProductTileProductImpl((FBProductItemDetailsDict) AbstractC37304Gc5.A04(parcel, ProductTileProductImpl.class));
            case 67:
                return new ProductTileProductNameLabelOptionsImpl(AbstractC37304Gc5.A00(parcel), AbstractC37304Gc5.A1V(parcel));
            case 68:
                C14360o3.A0B(parcel, 0);
                return ProductTileTextColorType.values()[parcel.readInt()];
            case 69:
                C14360o3.A0B(parcel, 0);
                return ProductTileTextStyleType.values()[parcel.readInt()];
            case 70:
                return new ProductTileUCILoggingInfoImpl(parcel.readLong(), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
            case 71:
                return new ProductVariantPossibleValueDict((ProductVariantVisualStyle) AbstractC37304Gc5.A04(parcel, ProductVariantPossibleValueDict.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 72:
                C14360o3.A0B(parcel, 0);
                return new ProductWithMediaImageImpl((ProductDetailsProductItemDict) AbstractC37304Gc5.A04(parcel, ProductWithMediaImageImpl.class));
            case 73:
                C14360o3.A0B(parcel, 0);
                return ProfileGridItemTypeEnum.values()[parcel.readInt()];
            case 74:
                return new ProfileThemeImpl((ProfileThemeType) AbstractC37304Gc5.A04(parcel, ProfileThemeImpl.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 75:
                C14360o3.A0B(parcel, 0);
                return ProfileThemeType.values()[parcel.readInt()];
            case 76:
                C14360o3.A0B(parcel, 0);
                return PromoteUnavailableReason.values()[parcel.readInt()];
            case 77:
                C14360o3.A0B(parcel, 0);
                return PromptFirstMediaType.values()[parcel.readInt()];
            case 78:
                C14360o3.A0B(parcel, 0);
                return PublisherPlatform.values()[parcel.readInt()];
            case 79:
                C14360o3.A0B(parcel, 0);
                return REPETITION_UI_TYPE.values()[parcel.readInt()];
            case 80:
                C14360o3.A0B(parcel, 0);
                return RIXUCoverCTAPosition.values()[parcel.readInt()];
            case 81:
                C14360o3.A0B(parcel, 0);
                return RIXUCoverElementMetadataType.values()[parcel.readInt()];
            case 82:
                C14360o3.A0B(parcel, 0);
                return RIXUCoverPreviewType.values()[parcel.readInt()];
            case 83:
                C14360o3.A0B(parcel, 0);
                return RIXUCoverSize.values()[parcel.readInt()];
            case 84:
                Integer num2 = null;
                if (AbstractC37304Gc5.A00(parcel) != 0) {
                    num2 = AbstractC37304Gc5.A0U(parcel);
                }
                return new RIXUTextLinkImpl(num2, AbstractC37304Gc5.A0W(parcel), parcel.readString(), parcel.readString());
            case 85:
                C14360o3.A0B(parcel, 0);
                Entity entity = (Entity) AbstractC37304Gc5.A04(parcel, Range.class);
                Integer num3 = null;
                if (parcel.readInt() != 0) {
                    num3 = AbstractC37304Gc5.A0U(parcel);
                }
                return new Range(entity, num3, AbstractC37304Gc5.A0W(parcel));
            case 86:
                C14360o3.A0B(parcel, 0);
                return RankingAlgorithm.values()[parcel.readInt()];
            case 87:
                return new RankingInfo(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 88:
                C14360o3.A0B(parcel, 0);
                return ReelTappableObjectType.values()[parcel.readInt()];
            case 89:
                C14360o3.A0B(parcel, 0);
                return ReelsMediaInteractivityType.values()[parcel.readInt()];
            case 90:
                C14360o3.A0B(parcel, 0);
                return RemoteBooleanSettingId.values()[parcel.readInt()];
            case 91:
                C14360o3.A0B(parcel, 0);
                return RemoteStringSettingId.values()[parcel.readInt()];
            case 92:
                C14360o3.A0B(parcel, 0);
                BusinessProfileDict businessProfileDict = (BusinessProfileDict) AbstractC37304Gc5.A04(parcel, SMBSupportStickerDict.class);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Float.valueOf(parcel.readFloat());
                }
                return new SMBSupportStickerDict(businessProfileDict, (SMBPartnerType) AbstractC37304Gc5.A04(parcel, SMBSupportStickerDict.class), valueOf3, readString3, readString4, readString5, readString6, readString7, readString8, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 93:
                return new ScheduledLiveAffiliateInfoImpl(AbstractC37304Gc5.A0d(parcel));
            case 94:
                String A0d4 = AbstractC37304Gc5.A0d(parcel);
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new ScheduledLiveDiscountInfoImpl(A0d4, valueOf4);
            case 95:
                String A0d5 = AbstractC37304Gc5.A0d(parcel);
                String readString9 = parcel.readString();
                if (parcel.readInt() == 0) {
                    A173 = null;
                } else {
                    int readInt8 = parcel.readInt();
                    A173 = AbstractC25225BEi.A17(readInt8);
                    for (int i9 = 0; i9 != readInt8; i9++) {
                        AbstractC37304Gc5.A0r(parcel, SellerBadgeDict.class, A173);
                    }
                }
                return new SellerBadgeDict((SellerBadgeType) AbstractC37304Gc5.A04(parcel, SellerBadgeDict.class), A0d5, readString9, A173);
            case 96:
                C14360o3.A0B(parcel, 0);
                return SellerBadgeSurfaces.values()[parcel.readInt()];
            case 97:
                C14360o3.A0B(parcel, 0);
                return SellerBadgeType.values()[parcel.readInt()];
            case 98:
                C14360o3.A0B(parcel, 0);
                return SettingId.values()[parcel.readInt()];
            default:
                String A0d6 = AbstractC37304Gc5.A0d(parcel);
                int readInt9 = parcel.readInt();
                ArrayList A1710 = AbstractC25225BEi.A17(readInt9);
                for (int i10 = 0; i10 != readInt9; i10++) {
                    AbstractC37304Gc5.A0r(parcel, ShoppingBrandWithProductsImpl.class, A1710);
                }
                if (parcel.readInt() == 0) {
                    A174 = null;
                } else {
                    int readInt10 = parcel.readInt();
                    A174 = AbstractC25225BEi.A17(readInt10);
                    for (int i11 = 0; i11 != readInt10; i11++) {
                        AbstractC37304Gc5.A0r(parcel, ShoppingBrandWithProductsImpl.class, A174);
                    }
                }
                return new ShoppingBrandWithProductsImpl((ProductDetailsSellerBadgeContent) AbstractC37304Gc5.A04(parcel, ShoppingBrandWithProductsImpl.class), (ShoppingBrandWithProductsSubtitle) AbstractC37304Gc5.A04(parcel, ShoppingBrandWithProductsImpl.class), (User) AbstractC37304Gc5.A04(parcel, ShoppingBrandWithProductsImpl.class), A0d6, A1710, A174);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new MiniShopColorPaletteCustomizationImpl[i];
            case 1:
                return new MiniShopSellerOnboardingStatus[i];
            case 2:
                return new ModuleVariant[i];
            case 3:
                return new MultiAuthorStoryType[i];
            case 4:
                return new MultiProductComponentDestinationType[i];
            case 5:
                return new MusicDropStreamingServiceData[i];
            case 6:
                return new MusicDropStreamingServiceEnum[i];
            case 7:
                return new MusicDropType[i];
            case 8:
                return new MusicPageTabType[i];
            case 9:
                return new MusicStatusStyleResponseInfoImpl[i];
            case 10:
                return new NativeInfoCardCommentLayout[i];
            case 11:
                return new NativeInfoCardTextAlignment[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new NonDiscInfo[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new NonprofitSelectorSurfaceEnum[i];
            case 14:
                return new NoteActivationType[i];
            case Process.SIGTERM /* 15 */:
                return new NoteChatResponseInfoImpl[i];
            case 16:
                return new NoteCustomThemeImpl[i];
            case 17:
                return new NoteEmojiReactionInfo[i];
            case 18:
                return new NotePogImageDict[i];
            case Process.SIGSTOP /* 19 */:
                return new NotePogVideoDict[i];
            case 20:
                return new NoteReactionType[i];
            case 21:
                return new OneTapLinkedProfileInfoImpl[i];
            case 22:
                return new OpenDraftGalleryCommandImpl[i];
            case 23:
                return new OpenInspirationHubCommandImpl[i];
            case 24:
                return new OrganicCTAType[i];
            case 25:
                return new OverlayAdTapDestinationEnum[i];
            case 26:
                return new OverlayAdsFormatEnum[i];
            case 27:
                return new OverlayAdsTextStyleEnum[i];
            case 28:
                return new PartnerProgramOnboardingSteps[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new PartnerTypes[i];
            case 30:
                return new PaymentCredentialTypeEnum[i];
            case 31:
                return new PaymentInfo[i];
            case 32:
                return new PaymentMethodImpl[i];
            case 33:
                return new PendingShareToFriendsStoryBadgePreviewState[i];
            case 34:
                return new PermalinkItemType[i];
            case 35:
                return new Phrase[i];
            case 36:
                return new PivotPageInsightsTipImpl[i];
            case 37:
                return new PopularReelWithFollowersInsightMetadataImpl[i];
            case 38:
                return new PresenceAudience[i];
            case 39:
                return new ProductAffiliateInformationDictImpl[i];
            case 40:
                return new ProductArtsLabelInformationDictImpl[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new ProductArtsLabelsDict[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new ProductCardSubtitleType[i];
            case 43:
                return new ProductCollectionV2Type[i];
            case 44:
                return new ProductDetailsSellerBadgeContentImpl[i];
            case 45:
                return new ProductDiscountInformationDictImpl[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new ProductDiscountsDictImpl[i];
            case 47:
                return new ProductItemStickerBundleStyle[i];
            case 48:
                return new ProductMediaType[i];
            case 49:
                return new ProductPivotsButtonActionType[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new ProductPivotsButtonImpl[i];
            case 51:
                return new ProductPivotsSourceMediaType[i];
            case 52:
                return new ProductTaggingFeedComponentType[i];
            case 53:
                return new ProductTileBannerMetadataDecorationImpl[i];
            case 54:
                return new ProductTileBannerType[i];
            case 55:
                return new ProductTileContextImpl[i];
            case 56:
                return new ProductTileContextMetadataImpl[i];
            case 57:
                return new ProductTileContextVariant[i];
            case 58:
                return new ProductTileFeaturedProductPermissionInfoLabelOptionsImpl[i];
            case 59:
                return new ProductTileLabelImpl[i];
            case 60:
                return new ProductTileLabelType[i];
            case 61:
                return new ProductTileLayoutContentImpl[i];
            case 62:
                return new ProductTileMetadataDecorationsImpl[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new ProductTileMetadataDestination[i];
            case 64:
                return new ProductTileMetadataImpl[i];
            case 65:
                return new ProductTilePriceLabelOptionsImpl[i];
            case 66:
                return new ProductTileProductImpl[i];
            case 67:
                return new ProductTileProductNameLabelOptionsImpl[i];
            case 68:
                return new ProductTileTextColorType[i];
            case 69:
                return new ProductTileTextStyleType[i];
            case 70:
                return new ProductTileUCILoggingInfoImpl[i];
            case 71:
                return new ProductVariantPossibleValueDict[i];
            case 72:
                return new ProductWithMediaImageImpl[i];
            case 73:
                return new ProfileGridItemTypeEnum[i];
            case 74:
                return new ProfileThemeImpl[i];
            case 75:
                return new ProfileThemeType[i];
            case 76:
                return new PromoteUnavailableReason[i];
            case 77:
                return new PromptFirstMediaType[i];
            case 78:
                return new PublisherPlatform[i];
            case 79:
                return new REPETITION_UI_TYPE[i];
            case 80:
                return new RIXUCoverCTAPosition[i];
            case 81:
                return new RIXUCoverElementMetadataType[i];
            case 82:
                return new RIXUCoverPreviewType[i];
            case 83:
                return new RIXUCoverSize[i];
            case 84:
                return new RIXUTextLinkImpl[i];
            case 85:
                return new Range[i];
            case 86:
                return new RankingAlgorithm[i];
            case 87:
                return new RankingInfo[i];
            case 88:
                return new ReelTappableObjectType[i];
            case 89:
                return new ReelsMediaInteractivityType[i];
            case 90:
                return new RemoteBooleanSettingId[i];
            case 91:
                return new RemoteStringSettingId[i];
            case 92:
                return new SMBSupportStickerDict[i];
            case 93:
                return new ScheduledLiveAffiliateInfoImpl[i];
            case 94:
                return new ScheduledLiveDiscountInfoImpl[i];
            case 95:
                return new SellerBadgeDict[i];
            case 96:
                return new SellerBadgeSurfaces[i];
            case 97:
                return new SellerBadgeType[i];
            case 98:
                return new SettingId[i];
            default:
                return new ShoppingBrandWithProductsImpl[i];
        }
    }
}
