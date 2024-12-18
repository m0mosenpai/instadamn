package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.api.schemas.ImmutablePandoIGLocalEventDict;
import com.instagram.api.schemas.ImmutablePandoIGProjectPortalInfoDict;
import com.instagram.api.schemas.ImmutablePandoIGRFSurveyContextDict;
import com.instagram.api.schemas.ImmutablePandoIGRFSurveyContextMappingDict;
import com.instagram.api.schemas.ImmutablePandoIGRFSurveyInfoDict;
import com.instagram.api.schemas.ImmutablePandoIceBreakerMessage;
import com.instagram.api.schemas.ImmutablePandoImageURIDict;
import com.instagram.api.schemas.ImmutablePandoInlineStyleAtRangeDict;
import com.instagram.api.schemas.ImmutablePandoIntentAwareAdsFormatInfo;
import com.instagram.api.schemas.ImmutablePandoIntentAwareAdsInfo;
import com.instagram.api.schemas.ImmutablePandoLinkWithText;
import com.instagram.api.schemas.ImmutablePandoListeningNowResponseInfo;
import com.instagram.api.schemas.ImmutablePandoLiveNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoLocationNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoLoyaltyToplineInfoDict;
import com.instagram.api.schemas.ImmutablePandoLyrics;
import com.instagram.api.schemas.ImmutablePandoMediaCroppingCoordinates;
import com.instagram.api.schemas.ImmutablePandoMediaIdToBrandSafetyContentBlocklistBitmapMap;
import com.instagram.api.schemas.ImmutablePandoMediaReminder;
import com.instagram.api.schemas.ImmutablePandoMediaVCRTappableData;
import com.instagram.api.schemas.ImmutablePandoMetaPlaceDict;
import com.instagram.api.schemas.ImmutablePandoMiniShopColorCustomization;
import com.instagram.api.schemas.ImmutablePandoMiniShopColorPaletteCustomization;
import com.instagram.api.schemas.ImmutablePandoMusicStatusStyleResponseInfo;
import com.instagram.api.schemas.ImmutablePandoNonDiscInfo;
import com.instagram.api.schemas.ImmutablePandoNoteChatResponseInfo;
import com.instagram.api.schemas.ImmutablePandoNoteCustomTheme;
import com.instagram.api.schemas.ImmutablePandoNotePogImageDict;
import com.instagram.api.schemas.ImmutablePandoNotePogVideoDict;
import com.instagram.api.schemas.ImmutablePandoOnFeedMessages;
import com.instagram.api.schemas.ImmutablePandoOneTapLinkedProfileInfo;
import com.instagram.api.schemas.ImmutablePandoOpenDraftGalleryCommand;
import com.instagram.api.schemas.ImmutablePandoOpenInspirationHubCommand;
import com.instagram.api.schemas.ImmutablePandoOriginalAudioPartMetadata;
import com.instagram.api.schemas.ImmutablePandoOriginalSoundConsumptionInfo;
import com.instagram.api.schemas.ImmutablePandoOriginalSoundData;
import com.instagram.api.schemas.ImmutablePandoOriginalityFollowButtonInfo;
import com.instagram.api.schemas.ImmutablePandoOriginalityInfo;
import com.instagram.api.schemas.ImmutablePandoOriginalitySourceMediaInfo;
import com.instagram.api.schemas.ImmutablePandoPaymentInfo;
import com.instagram.api.schemas.ImmutablePandoPaymentMethod;
import com.instagram.api.schemas.ImmutablePandoPhrase;
import com.instagram.api.schemas.ImmutablePandoPivotPageInsightsTip;
import com.instagram.api.schemas.ImmutablePandoPopularReelWithFollowersInsightMetadata;
import com.instagram.api.schemas.ImmutablePandoPrivacyDisclosureInfo;
import com.instagram.api.schemas.ImmutablePandoProductAffiliateInformationDict;
import com.instagram.api.schemas.ImmutablePandoProductArtsLabelInformationDict;
import com.instagram.api.schemas.ImmutablePandoProductArtsLabelsDict;
import com.instagram.api.schemas.ImmutablePandoProductDetailsSellerBadgeContent;
import com.instagram.api.schemas.ImmutablePandoProductDiscountInformationDict;
import com.instagram.api.schemas.ImmutablePandoProductDiscountsDict;
import com.instagram.api.schemas.ImmutablePandoProductPivotsButton;
import com.instagram.api.schemas.ImmutablePandoProductTileBannerMetadataDecoration;
import com.instagram.api.schemas.ImmutablePandoProductTileContext;
import com.instagram.api.schemas.ImmutablePandoProductTileContextMetadata;
import com.instagram.api.schemas.ImmutablePandoProductTileFeaturedProductPermissionInfoLabelOptions;
import com.instagram.api.schemas.ImmutablePandoProductTileLabel;
import com.instagram.api.schemas.ImmutablePandoProductTileLayoutContent;
import com.instagram.api.schemas.ImmutablePandoProductTileMetadata;
import com.instagram.api.schemas.ImmutablePandoProductTileMetadataDecorations;
import com.instagram.api.schemas.ImmutablePandoProductTilePriceLabelOptions;
import com.instagram.api.schemas.ImmutablePandoProductTileProduct;
import com.instagram.api.schemas.ImmutablePandoProductTileProductNameLabelOptions;
import com.instagram.api.schemas.ImmutablePandoProductTileUCILoggingInfo;
import com.instagram.api.schemas.ImmutablePandoProductVariantPossibleValueDict;
import com.instagram.api.schemas.ImmutablePandoProductWithMediaImage;
import com.instagram.api.schemas.ImmutablePandoProfilePicUrlInfo;
import com.instagram.api.schemas.ImmutablePandoProfilePicture;
import com.instagram.api.schemas.ImmutablePandoProfileTheme;
import com.instagram.api.schemas.ImmutablePandoRIXUTextLink;
import com.instagram.api.schemas.ImmutablePandoRange;
import com.instagram.api.schemas.ImmutablePandoRankingInfo;
import com.instagram.api.schemas.ImmutablePandoRingSpec;
import com.instagram.api.schemas.ImmutablePandoRingSpecPoint;
import com.instagram.api.schemas.ImmutablePandoSMBSupportStickerDict;
import com.instagram.api.schemas.ImmutablePandoScheduledLiveAffiliateInfo;
import com.instagram.api.schemas.ImmutablePandoScheduledLiveDiscountInfo;
import com.instagram.api.schemas.ImmutablePandoSellerBadgeDict;
import com.instagram.api.schemas.ImmutablePandoShoppingBrandWithProducts;
import com.instagram.api.schemas.ImmutablePandoShoppingBrandWithProductsSubtitle;
import com.instagram.api.schemas.ImmutablePandoSocialProofInfo;
import com.instagram.api.schemas.ImmutablePandoStatusResponse;
import com.instagram.api.schemas.ImmutablePandoStatusStyleResponseInfo;
import com.instagram.api.schemas.ImmutablePandoStoryGroupMentionTappableData;
import com.instagram.api.schemas.ImmutablePandoStoryLinkInfoDict;
import com.instagram.api.schemas.ImmutablePandoStoryMultiProductStickerLinkData;
import com.instagram.api.schemas.ImmutablePandoStoryMusicPickTappableData;
import com.instagram.api.schemas.ImmutablePandoStoryProductItemStickerTappableData;
import com.instagram.api.schemas.ImmutablePandoStoryPromptFailureTooltipDict;
import com.instagram.api.schemas.ImmutablePandoStoryPromptParticipationFrictionInfoDict;
import com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData;
import com.instagram.api.schemas.ImmutablePandoStorySmbSupportStickerObject;
import com.instagram.api.schemas.ImmutablePandoStoryTemplateAssetDict;
import com.instagram.api.schemas.ImmutablePandoStoryTemplateAvatarStickerOverlayDict;
import com.instagram.api.schemas.ImmutablePandoStoryTemplateCaptionDict;
import com.instagram.api.schemas.ImmutablePandoStoryTemplateDict;
import com.instagram.api.schemas.ImmutablePandoStoryTemplateFillableGalleryStickerDict;
import com.instagram.api.schemas.ImmutablePandoStoryTemplateFillableMusicStickerDict;
import com.instagram.api.schemas.ImmutablePandoStoryTemplateFillableStickersDict;
import com.instagram.api.schemas.ImmutablePandoStoryTemplateGiphyStickerDict;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.HXy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39307HXy extends AbstractC136426Fv {
    public final int A00;

    public C39307HXy(int i) {
        this.A00 = i;
    }

    public static C39307HXy A00(int i) {
        return new C39307HXy(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ImmutablePandoIGLocalEventDict[i];
            case 1:
                return new ImmutablePandoIGProjectPortalInfoDict[i];
            case 2:
                return new ImmutablePandoIGRFSurveyContextDict[i];
            case 3:
                return new ImmutablePandoIGRFSurveyContextMappingDict[i];
            case 4:
                return new ImmutablePandoIGRFSurveyInfoDict[i];
            case 5:
                return new ImmutablePandoIceBreakerMessage[i];
            case 6:
                return new ImmutablePandoImageURIDict[i];
            case 7:
                return new ImmutablePandoInlineStyleAtRangeDict[i];
            case 8:
                return new ImmutablePandoIntentAwareAdsFormatInfo[i];
            case 9:
                return new ImmutablePandoIntentAwareAdsInfo[i];
            case 10:
                return new ImmutablePandoLinkWithText[i];
            case 11:
                return new ImmutablePandoListeningNowResponseInfo[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new ImmutablePandoLiveNoteResponseInfo[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new ImmutablePandoLocationNoteResponseInfo[i];
            case 14:
                return new ImmutablePandoLoyaltyToplineInfoDict[i];
            case Process.SIGTERM /* 15 */:
                return new ImmutablePandoLyrics[i];
            case 16:
                return new ImmutablePandoMediaCroppingCoordinates[i];
            case 17:
                return new ImmutablePandoMediaIdToBrandSafetyContentBlocklistBitmapMap[i];
            case 18:
                return new ImmutablePandoMediaReminder[i];
            case Process.SIGSTOP /* 19 */:
                return new ImmutablePandoMediaVCRTappableData[i];
            case 20:
                return new ImmutablePandoMetaPlaceDict[i];
            case 21:
                return new ImmutablePandoMiniShopColorCustomization[i];
            case 22:
                return new ImmutablePandoMiniShopColorPaletteCustomization[i];
            case 23:
                return new ImmutablePandoMusicStatusStyleResponseInfo[i];
            case 24:
                return new ImmutablePandoNonDiscInfo[i];
            case 25:
                return new ImmutablePandoNoteChatResponseInfo[i];
            case 26:
                return new ImmutablePandoNoteCustomTheme[i];
            case 27:
                return new ImmutablePandoNotePogImageDict[i];
            case 28:
                return new ImmutablePandoNotePogVideoDict[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new ImmutablePandoOnFeedMessages[i];
            case 30:
                return new ImmutablePandoOneTapLinkedProfileInfo[i];
            case 31:
                return new ImmutablePandoOpenDraftGalleryCommand[i];
            case 32:
                return new ImmutablePandoOpenInspirationHubCommand[i];
            case 33:
                return new ImmutablePandoOriginalAudioPartMetadata[i];
            case 34:
                return new ImmutablePandoOriginalSoundConsumptionInfo[i];
            case 35:
                return new ImmutablePandoOriginalSoundData[i];
            case 36:
                return new ImmutablePandoOriginalityFollowButtonInfo[i];
            case 37:
                return new ImmutablePandoOriginalityInfo[i];
            case 38:
                return new ImmutablePandoOriginalitySourceMediaInfo[i];
            case 39:
                return new ImmutablePandoPaymentInfo[i];
            case 40:
                return new ImmutablePandoPaymentMethod[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new ImmutablePandoPhrase[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new ImmutablePandoPivotPageInsightsTip[i];
            case 43:
                return new ImmutablePandoPopularReelWithFollowersInsightMetadata[i];
            case 44:
                return new ImmutablePandoPrivacyDisclosureInfo[i];
            case 45:
                return new ImmutablePandoProductAffiliateInformationDict[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new ImmutablePandoProductArtsLabelInformationDict[i];
            case 47:
                return new ImmutablePandoProductArtsLabelsDict[i];
            case 48:
                return new ImmutablePandoProductDetailsSellerBadgeContent[i];
            case 49:
                return new ImmutablePandoProductDiscountInformationDict[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new ImmutablePandoProductDiscountsDict[i];
            case 51:
                return new ImmutablePandoProductPivotsButton[i];
            case 52:
                return new ImmutablePandoProductTileBannerMetadataDecoration[i];
            case 53:
                return new ImmutablePandoProductTileContext[i];
            case 54:
                return new ImmutablePandoProductTileContextMetadata[i];
            case 55:
                return new ImmutablePandoProductTileFeaturedProductPermissionInfoLabelOptions[i];
            case 56:
                return new ImmutablePandoProductTileLabel[i];
            case 57:
                return new ImmutablePandoProductTileLayoutContent[i];
            case 58:
                return new ImmutablePandoProductTileMetadata[i];
            case 59:
                return new ImmutablePandoProductTileMetadataDecorations[i];
            case 60:
                return new ImmutablePandoProductTilePriceLabelOptions[i];
            case 61:
                return new ImmutablePandoProductTileProduct[i];
            case 62:
                return new ImmutablePandoProductTileProductNameLabelOptions[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new ImmutablePandoProductTileUCILoggingInfo[i];
            case 64:
                return new ImmutablePandoProductVariantPossibleValueDict[i];
            case 65:
                return new ImmutablePandoProductWithMediaImage[i];
            case 66:
                return new ImmutablePandoProfilePicUrlInfo[i];
            case 67:
                return new ImmutablePandoProfilePicture[i];
            case 68:
                return new ImmutablePandoProfileTheme[i];
            case 69:
                return new ImmutablePandoRIXUTextLink[i];
            case 70:
                return new ImmutablePandoRange[i];
            case 71:
                return new ImmutablePandoRankingInfo[i];
            case 72:
                return new ImmutablePandoRingSpec[i];
            case 73:
                return new ImmutablePandoRingSpecPoint[i];
            case 74:
                return new ImmutablePandoSMBSupportStickerDict[i];
            case 75:
                return new ImmutablePandoScheduledLiveAffiliateInfo[i];
            case 76:
                return new ImmutablePandoScheduledLiveDiscountInfo[i];
            case 77:
                return new ImmutablePandoSellerBadgeDict[i];
            case 78:
                return new ImmutablePandoShoppingBrandWithProducts[i];
            case 79:
                return new ImmutablePandoShoppingBrandWithProductsSubtitle[i];
            case 80:
                return new ImmutablePandoSocialProofInfo[i];
            case 81:
                return new ImmutablePandoStatusResponse[i];
            case 82:
                return new ImmutablePandoStatusStyleResponseInfo[i];
            case 83:
                return new ImmutablePandoStoryGroupMentionTappableData[i];
            case 84:
                return new ImmutablePandoStoryLinkInfoDict[i];
            case 85:
                return new ImmutablePandoStoryMultiProductStickerLinkData[i];
            case 86:
                return new ImmutablePandoStoryMusicPickTappableData[i];
            case 87:
                return new ImmutablePandoStoryProductItemStickerTappableData[i];
            case 88:
                return new ImmutablePandoStoryPromptFailureTooltipDict[i];
            case 89:
                return new ImmutablePandoStoryPromptParticipationFrictionInfoDict[i];
            case 90:
                return new ImmutablePandoStoryPromptTappableData[i];
            case 91:
                return new ImmutablePandoStorySmbSupportStickerObject[i];
            case 92:
                return new ImmutablePandoStoryTemplateAssetDict[i];
            case 93:
                return new ImmutablePandoStoryTemplateAvatarStickerOverlayDict[i];
            case 94:
                return new ImmutablePandoStoryTemplateCaptionDict[i];
            case 95:
                return new ImmutablePandoStoryTemplateDict[i];
            case 96:
                return new ImmutablePandoStoryTemplateFillableGalleryStickerDict[i];
            case 97:
                return new ImmutablePandoStoryTemplateFillableMusicStickerDict[i];
            case 98:
                return new ImmutablePandoStoryTemplateFillableStickersDict[i];
            default:
                return new ImmutablePandoStoryTemplateGiphyStickerDict[i];
        }
    }
}
