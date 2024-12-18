package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.C1DV;
import X.C2JT;
import X.C38321qM;
import X.EnumC223249tA;
import X.EnumC27412C7p;
import X.EnumC33429Eq0;
import X.EnumC39602HeC;
import X.EnumC39604HeE;
import X.EnumC39605HeF;
import X.EnumC39607HeH;
import X.EnumC39608HeI;
import X.EnumC39610HeK;
import X.EnumC39611HeL;
import X.EnumC39613HeN;
import X.EnumC61201Rh1;
import X.EnumC61202Rh2;
import X.EnumC72385XcL;
import X.VF5;
import X.VF6;
import X.VF7;
import X.VF8;
import X.VF9;
import X.VFA;
import X.VFB;
import X.VFC;
import X.VFE;
import X.VFM;
import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public interface CreatorInspirationSignalsPlaygroundClipsMedia extends C2JT {

    /* loaded from: classes11.dex */
    public interface Attribution extends C2JT {
        String getName();
    }

    /* loaded from: classes11.dex */
    public interface BrandedContentAdsBoostPostTokens extends C2JT {
        String getAccessToken();
    }

    /* loaded from: classes11.dex */
    public interface Caption extends C2JT {

        /* loaded from: classes10.dex */
        public interface User extends C2JT {

            /* loaded from: classes11.dex */
            public interface FanClubInfo extends C2JT {

                /* loaded from: classes11.dex */
                public interface FanConsiderationPageRevampEligiblity extends C2JT {
                    boolean getShouldShowContentPreview();

                    boolean getShouldShowSocialContext();

                    boolean hasShouldShowContentPreview();

                    boolean hasShouldShowSocialContext();
                }

                boolean getAutosaveToExclusiveHighlight();

                int getConnectedMemberCount();

                String getFanClubId();

                String getFanClubName();

                FanConsiderationPageRevampEligiblity getFanConsiderationPageRevampEligiblity();

                boolean getHasEnoughSubscribersForSsc();

                int getSubscriberCount();

                boolean hasAutosaveToExclusiveHighlight();

                boolean hasConnectedMemberCount();

                boolean hasHasEnoughSubscribersForSsc();

                boolean hasIsFanClubGiftingEligible();

                boolean hasIsFanClubReferralEligible();

                boolean hasSubscriberCount();

                boolean isFanClubGiftingEligible();

                boolean isFanClubReferralEligible();
            }

            /* loaded from: classes10.dex */
            public interface FriendshipStatus extends C2JT {
                boolean getFollowing();

                boolean getOutgoingRequest();

                boolean hasFollowing();

                boolean hasIsBestie();

                boolean hasIsFeedFavorite();

                boolean hasIsRestricted();

                boolean hasOutgoingRequest();

                boolean isBestie();

                boolean isFeedFavorite();

                boolean isRestricted();
            }

            int getAllMediaCount();

            EnumC61201Rh1 getAllowedCommenterType();

            boolean getCanBoostPost();

            boolean getCanSeeOrganicInsights();

            FanClubInfo getFanClubInfo();

            String getFbidV2();

            boolean getFeedPostReshareDisabled();

            FriendshipStatus getFriendshipStatus();

            String getFullName();

            boolean getHasAnonymousProfilePicture();

            boolean getHasOnboardedToTextPostApp();

            String getId();

            String getInteropMessagingUserFbid();

            long getLatestReelMedia();

            int getLikedClipsCount();

            String getPk();

            String getPkId();

            String getProfilePicId();

            String getProfilePicUrl();

            EnumC61202Rh2 getReelAutoArchive();

            boolean getShowAccountTransparencyDetails();

            boolean getShowInsightsTerms();

            int getTextPostAppJoinerNumber();

            int getThirdPartyDownloadsEnabled();

            boolean getTransparencyProductEnabled();

            String getUsername();

            boolean hasAllMediaCount();

            boolean hasCanBoostPost();

            boolean hasCanSeeOrganicInsights();

            boolean hasFeedPostReshareDisabled();

            boolean hasHasAnonymousProfilePicture();

            boolean hasHasOnboardedToTextPostApp();

            boolean hasIsFavorite();

            boolean hasIsPrivate();

            boolean hasIsUnpublished();

            boolean hasIsVerified();

            boolean hasLatestReelMedia();

            boolean hasLikedClipsCount();

            boolean hasShowAccountTransparencyDetails();

            boolean hasShowInsightsTerms();

            boolean hasTextPostAppJoinerNumber();

            boolean hasThirdPartyDownloadsEnabled();

            boolean hasTransparencyProductEnabled();

            boolean isFavorite();

            boolean isPrivate();

            boolean isUnpublished();

            boolean isVerified();
        }

        int getBitFlags();

        String getContentType();

        long getCreatedAt();

        long getCreatedAtUtc();

        boolean getDidReportAsSpam();

        boolean getHasTranslation();

        String getMediaId();

        String getPk();

        int getPrivateReplyStatus();

        boolean getShareEnabled();

        String getStatus();

        String getText();

        int getType();

        User getUser();

        String getUserId();

        boolean hasBitFlags();

        boolean hasCreatedAt();

        boolean hasCreatedAtUtc();

        boolean hasDidReportAsSpam();

        boolean hasHasTranslation();

        boolean hasIsCovered();

        boolean hasIsRankedComment();

        boolean hasPrivateReplyStatus();

        boolean hasShareEnabled();

        boolean hasType();

        boolean isCovered();

        boolean isRankedComment();
    }

    /* loaded from: classes11.dex */
    public interface ClipsAttributionInfo extends C2JT {

        /* loaded from: classes11.dex */
        public interface PivotPageHeader extends C2JT {

            /* loaded from: classes11.dex */
            public interface Profile extends C2JT {
                String getFullName();

                String getId();

                String getPk();

                String getPkId();

                String getProfilePicId();

                String getProfilePicUrl();

                String getUsername();

                boolean hasIsPrivate();

                boolean hasIsVerified();

                boolean isPrivate();

                boolean isVerified();
            }

            String getContentUrl();

            String getDeveloperAppLogoUrl();

            String getMediaCount();

            Profile getProfile();
        }

        String getAttributionAppId();

        String getAttributionAppName();

        PivotPageHeader getPivotPageHeader();
    }

    /* loaded from: classes11.dex */
    public interface ClipsMetadata extends C2JT {

        /* loaded from: classes11.dex */
        public interface AchievementsInfo extends C2JT {
            int getNumEarnedAchievements();

            boolean getShowAchievements();

            boolean hasNumEarnedAchievements();

            boolean hasShowAchievements();
        }

        /* loaded from: classes11.dex */
        public interface AdditionalAudioInfo extends C2JT {

            /* loaded from: classes11.dex */
            public interface AudioReattributionInfo extends C2JT {
                boolean getShouldAllowRestore();

                boolean hasShouldAllowRestore();
            }

            String getAdditionalAudioUsername();

            AudioReattributionInfo getAudioReattributionInfo();
        }

        /* loaded from: classes11.dex */
        public interface AssetRecommendationInfo extends C2JT {

            /* loaded from: classes11.dex */
            public interface AssetRecommendations extends C2JT {
                String getAssetId();

                String getAssetName();

                VF5 getAssetType();

                String getCoverArtworkThumbnailUri();

                String getExtra();
            }

            ImmutableList getAssetRecommendations();
        }

        /* loaded from: classes11.dex */
        public interface AudioRankingInfo extends C2JT {
            String getBestAudioClusterId();
        }

        /* loaded from: classes11.dex */
        public interface BrandedContentTagInfo extends C2JT {
            boolean getCanAddTag();

            boolean hasCanAddTag();
        }

        /* loaded from: classes11.dex */
        public interface ContentAppreciationInfo extends C2JT {

            /* loaded from: classes11.dex */
            public interface EntryPointContainer extends C2JT {

                /* loaded from: classes11.dex */
                public interface Comment extends C2JT {
                    EnumC39607HeH getActionType();
                }

                /* loaded from: classes11.dex */
                public interface Pill extends C2JT {
                    EnumC39607HeH getActionType();

                    int getPriority();

                    boolean hasPriority();
                }

                Comment getComment();

                Pill getPill();
            }

            boolean getEnabled();

            EntryPointContainer getEntryPointContainer();

            boolean hasEnabled();
        }

        /* loaded from: classes11.dex */
        public interface ContextualHighlightInfo extends C2JT {
            String getChainingMediaId();

            VF8 getContextualHighlightDestinationType();

            String getContextualHighlightId();

            String getContextualHighlightTitle();

            EnumC39602HeC getContextualHighlightType();
        }

        /* loaded from: classes11.dex */
        public interface MashupInfo extends C2JT {

            /* loaded from: classes11.dex */
            public interface OriginalMedia extends C2JT {

                /* loaded from: classes10.dex */
                public interface User extends C2JT {
                    int getAllMediaCount();

                    EnumC61201Rh1 getAllowedCommenterType();

                    String getFbidV2();

                    String getFullName();

                    boolean getHasAnonymousProfilePicture();

                    boolean getHasOnboardedToTextPostApp();

                    String getId();

                    String getInteropMessagingUserFbid();

                    int getLikedClipsCount();

                    String getPk();

                    String getPkId();

                    String getProfilePicId();

                    String getProfilePicUrl();

                    EnumC61202Rh2 getReelAutoArchive();

                    int getTextPostAppJoinerNumber();

                    int getThirdPartyDownloadsEnabled();

                    String getUsername();

                    boolean hasAllMediaCount();

                    boolean hasHasAnonymousProfilePicture();

                    boolean hasHasOnboardedToTextPostApp();

                    boolean hasIsPrivate();

                    boolean hasIsVerified();

                    boolean hasLikedClipsCount();

                    boolean hasTextPostAppJoinerNumber();

                    boolean hasThirdPartyDownloadsEnabled();

                    boolean isPrivate();

                    boolean isVerified();
                }

                boolean getMashupsAllowed();

                String getMediaType();

                int getNonPrivacyFilteredMashupsMediaCount();

                String getPk();

                String getProductType();

                ImmutableList getSidecarChildMediaIds();

                User getUser();

                boolean hasIsLightWeightCheck();

                boolean hasIsPivotPageAvailable();

                boolean hasMashupsAllowed();

                boolean hasNonPrivacyFilteredMashupsMediaCount();

                boolean isLightWeightCheck();

                boolean isPivotPageAvailable();
            }

            boolean getCanToggleMashupsAllowed();

            boolean getHasBeenMashedUp();

            boolean getHasNonmimicableAdditionalAudio();

            String getMashupType();

            boolean getMashupsAllowed();

            int getNonPrivacyFilteredMashupsMediaCount();

            OriginalMedia getOriginalMedia();

            boolean hasCanToggleMashupsAllowed();

            boolean hasHasBeenMashedUp();

            boolean hasHasNonmimicableAdditionalAudio();

            boolean hasIsCreatorRequestingMashup();

            boolean hasIsLightWeightCheck();

            boolean hasIsPivotPageAvailable();

            boolean hasMashupsAllowed();

            boolean hasNonPrivacyFilteredMashupsMediaCount();

            boolean isCreatorRequestingMashup();

            boolean isLightWeightCheck();

            boolean isPivotPageAvailable();
        }

        /* loaded from: classes11.dex */
        public interface MerchandisingPillInfo extends C2JT {
            int getLoopTime();

            boolean hasLoopTime();
        }

        /* loaded from: classes11.dex */
        public interface MusicInfo extends C2JT {

            /* loaded from: classes11.dex */
            public interface MusicAssetInfo extends C2JT {
                boolean getAllowsSaving();

                String getArtistId();

                String getAudioAssetId();

                String getAudioClusterId();

                String getCoverArtworkThumbnailUri();

                String getCoverArtworkUri();

                String getDashManifest();

                String getDisplayArtist();

                int getDurationInMs();

                String getFastStartProgressiveDownloadUrl();

                boolean getHasLyrics();

                String getId();

                String getIgUsername();

                String getProgressiveDownloadUrl();

                String getSubtitle();

                String getTitle();

                String getWeb30sPreviewDownloadUrl();

                boolean hasAllowsSaving();

                boolean hasDurationInMs();

                boolean hasHasLyrics();

                boolean hasIsExplicit();

                boolean isExplicit();
            }

            /* loaded from: classes11.dex */
            public interface MusicConsumptionInfo extends C2JT {

                /* loaded from: classes11.dex */
                public interface IgArtist extends C2JT {
                    String getFullName();

                    boolean getHasOnboardedToTextPostApp();

                    String getId();

                    String getPk();

                    String getPkId();

                    String getProfilePicId();

                    String getProfilePicUrl();

                    String getUsername();

                    boolean hasHasOnboardedToTextPostApp();

                    boolean hasIsPrivate();

                    boolean hasIsVerified();

                    boolean isPrivate();

                    boolean isVerified();
                }

                boolean getAllowMediaCreationWithMusic();

                int getAudioAssetStartTimeInMs();

                String getDerivedContentId();

                IgArtist getIgArtist();

                int getOverlapDurationInMs();

                String getPlaceholderProfilePicUrl();

                boolean getShouldAllowMusicEditing();

                boolean getShouldMuteAudio();

                String getShouldMuteAudioReason();

                EnumC39605HeF getShouldMuteAudioReasonType();

                int getTrendRank();

                boolean hasAllowMediaCreationWithMusic();

                boolean hasAudioAssetStartTimeInMs();

                boolean hasIsBookmarked();

                boolean hasIsTrendingInClips();

                boolean hasOverlapDurationInMs();

                boolean hasShouldAllowMusicEditing();

                boolean hasShouldMuteAudio();

                boolean hasTrendRank();

                boolean isBookmarked();

                boolean isTrendingInClips();
            }

            MusicAssetInfo getMusicAssetInfo();

            MusicConsumptionInfo getMusicConsumptionInfo();
        }

        /* loaded from: classes11.dex */
        public interface OriginalSoundInfo extends C2JT {

            /* loaded from: classes11.dex */
            public interface AudioParts extends C2JT {
                CreatorInspirationSignalsPlaygroundAudioPartMetadata2 asCreatorInspirationSignalsPlaygroundAudioPartMetadata2();
            }

            /* loaded from: classes11.dex */
            public interface AudioPartsByFilter extends C2JT {
                CreatorInspirationSignalsPlaygroundAudioPartMetadata asCreatorInspirationSignalsPlaygroundAudioPartMetadata();
            }

            /* loaded from: classes11.dex */
            public interface ConsumptionInfo extends C2JT {
                String getShouldMuteAudioReason();

                boolean hasIsBookmarked();

                boolean hasIsTrendingInClips();

                boolean isBookmarked();

                boolean isTrendingInClips();
            }

            /* loaded from: classes11.dex */
            public interface IgArtist extends C2JT {
                String getFullName();

                boolean getHasOnboardedToTextPostApp();

                String getId();

                String getPk();

                String getPkId();

                String getProfilePicId();

                String getProfilePicUrl();

                String getUsername();

                boolean hasHasOnboardedToTextPostApp();

                boolean hasIsPrivate();

                boolean hasIsVerified();

                boolean isPrivate();

                boolean isVerified();
            }

            boolean getAllowCreatorToRename();

            String getAudioAssetId();

            ImmutableList getAudioParts();

            ImmutableList getAudioPartsByFilter();

            boolean getCanRemixBeSharedToFb();

            ConsumptionInfo getConsumptionInfo();

            String getDashManifest();

            int getDurationInMs();

            boolean getHideRemixing();

            IgArtist getIgArtist();

            VFC getOriginalAudioSubtype();

            String getOriginalAudioTitle();

            String getOriginalMediaId();

            String getProgressiveDownloadUrl();

            boolean getShouldMuteAudio();

            int getTimeCreated();

            int getTrendRank();

            boolean hasAllowCreatorToRename();

            boolean hasCanRemixBeSharedToFb();

            boolean hasDurationInMs();

            boolean hasHideRemixing();

            boolean hasIsAudioAutomaticallyAttributed();

            boolean hasIsExplicit();

            boolean hasIsOriginalAudioDownloadEligible();

            boolean hasIsReuseDisabled();

            boolean hasIsXpostFromFb();

            boolean hasShouldMuteAudio();

            boolean hasTimeCreated();

            boolean hasTrendRank();

            boolean isAudioAutomaticallyAttributed();

            boolean isExplicit();

            boolean isOriginalAudioDownloadEligible();

            boolean isReuseDisabled();

            boolean isXpostFromFb();
        }

        /* loaded from: classes11.dex */
        public interface ShoppingInfo extends C2JT {

            /* loaded from: classes11.dex */
            public interface ClipsShoppingCtaBar extends C2JT {
                double getAnimationTimeSec();

                String getCtaBarType();

                String getDestination();

                String getDominantColor();

                int getDwellTimeSec();

                String getTitle();

                String getToggledDestination();

                String getToggledTitle();

                boolean hasAnimationTimeSec();

                boolean hasDwellTimeSec();
            }

            /* loaded from: classes11.dex */
            public interface Merchant extends C2JT {
                boolean getDisabledSharingProductsToGuides();

                String getId();

                String getPk();

                String getProfilePicUrl();

                String getStorefrontAttributionUsername();

                String getUsername();

                boolean hasDisabledSharingProductsToGuides();

                boolean hasIsVerified();

                boolean isVerified();
            }

            /* loaded from: classes11.dex */
            public interface Products extends C2JT {

                /* loaded from: classes11.dex */
                public interface ProductDetails extends C2JT {

                    /* loaded from: classes11.dex */
                    public interface AggregatedRating extends C2JT {
                        int getRatingCount();

                        double getValue();

                        boolean hasRatingCount();

                        boolean hasValue();
                    }

                    /* loaded from: classes11.dex */
                    public interface ArtsLabels extends C2JT {

                        /* loaded from: classes11.dex */
                        public interface Labels extends C2JT {
                            String getLabelDisplayValue();

                            String getLabelType();
                        }

                        ImmutableList getLabels();
                    }

                    /* loaded from: classes11.dex */
                    public interface CheckoutProperties extends C2JT {

                        /* loaded from: classes11.dex */
                        public interface CurrencyAmount extends C2JT {
                            String getAmount();

                            String getAmountWithOffset();

                            String getCurrency();

                            int getOffset();

                            boolean hasOffset();
                        }

                        /* loaded from: classes11.dex */
                        public interface ShippingAndReturn extends C2JT {

                            /* loaded from: classes11.dex */
                            public interface ReturnCost extends C2JT {
                                String getAmount();

                                String getAmountWithOffset();

                                String getCurrency();

                                int getOffset();

                                boolean hasOffset();
                            }

                            /* loaded from: classes11.dex */
                            public interface ShippingCost extends C2JT {
                                String getAmount();

                                String getAmountWithOffset();

                                String getCurrency();

                                int getOffset();

                                boolean hasOffset();
                            }

                            ReturnCost getReturnCost();

                            ShippingCost getShippingCost();

                            String getShippingCostStripped();
                        }

                        boolean getCanAddToBag();

                        boolean getCanEnableRestockReminder();

                        boolean getCanShowInventoryQuantity();

                        CurrencyAmount getCurrencyAmount();

                        int getFullInventoryQuantity();

                        boolean getHasFreeShipping();

                        String getIgReferrerFbid();

                        int getInventoryQuantity();

                        boolean getProductGroupHasInventory();

                        String getReceiverId();

                        ShippingAndReturn getShippingAndReturn();

                        int getViewerPurchaseLimit();

                        boolean hasCanAddToBag();

                        boolean hasCanEnableRestockReminder();

                        boolean hasCanShowInventoryQuantity();

                        boolean hasFullInventoryQuantity();

                        boolean hasHasFreeShipping();

                        boolean hasInventoryQuantity();

                        boolean hasIsShopifyMerchant();

                        boolean hasProductGroupHasInventory();

                        boolean hasViewerPurchaseLimit();

                        boolean isShopifyMerchant();
                    }

                    /* loaded from: classes11.dex */
                    public interface CommerceReviewStatistics extends C2JT {
                        double getAverageRating();

                        int getReviewCount();

                        boolean hasAverageRating();

                        boolean hasReviewCount();
                    }

                    /* loaded from: classes11.dex */
                    public interface DiscountInformation extends C2JT {

                        /* loaded from: classes11.dex */
                        public interface Discounts extends C2JT {
                            String getCtaText();

                            String getDescription();

                            String getId();

                            String getName();

                            String getSeeDetailsText();
                        }

                        ImmutableList getDiscounts();
                    }

                    /* loaded from: classes11.dex */
                    public interface ImageQualityMetadata extends C2JT {

                        /* loaded from: classes11.dex */
                        public interface Goodness extends C2JT {
                            String getId();

                            double getScore();

                            boolean hasScore();
                        }

                        /* loaded from: classes11.dex */
                        public interface LifestyleBackground extends C2JT {
                            String getId();

                            double getScore();

                            boolean hasScore();
                        }

                        ImmutableList getGoodness();

                        ImmutableList getLifestyleBackground();
                    }

                    /* loaded from: classes11.dex */
                    public interface MainImage extends C2JT {

                        /* loaded from: classes11.dex */
                        public interface ImageVersions2 extends C2JT {

                            /* loaded from: classes11.dex */
                            public interface Candidates extends C2JT {
                                int getHeight();

                                String getUrl();

                                int getWidth();

                                boolean hasHeight();

                                boolean hasWidth();
                            }

                            ImmutableList getCandidates();
                        }

                        ImageVersions2 getImageVersions2();

                        String getPreview();
                    }

                    /* loaded from: classes11.dex */
                    public interface Merchant extends C2JT {
                        boolean getDisabledSharingProductsToGuides();

                        String getId();

                        String getPk();

                        String getProfilePicUrl();

                        String getStorefrontAttributionUsername();

                        String getUsername();

                        boolean hasDisabledSharingProductsToGuides();

                        boolean hasIsVerified();

                        boolean isVerified();
                    }

                    /* loaded from: classes11.dex */
                    public interface RichTextDescription extends C2JT {

                        /* loaded from: classes11.dex */
                        public interface TextWithEntities extends C2JT {

                            /* loaded from: classes11.dex */
                            public interface InlineStyleRanges extends C2JT {
                                int getInlineStyle();

                                int getLength();

                                int getOffset();

                                boolean hasInlineStyle();

                                boolean hasLength();

                                boolean hasOffset();
                            }

                            ImmutableList getInlineStyleRanges();
                        }

                        String getBlockType();

                        int getDepth();

                        TextWithEntities getTextWithEntities();

                        boolean hasDepth();
                    }

                    /* loaded from: classes11.dex */
                    public interface SellerBadge extends C2JT {
                        String getDescription();

                        String getName();

                        EnumC39610HeK getType();
                    }

                    /* loaded from: classes11.dex */
                    public interface ThumbnailImage extends C2JT {

                        /* loaded from: classes11.dex */
                        public interface ImageVersions2 extends C2JT {

                            /* loaded from: classes11.dex */
                            public interface Candidates extends C2JT {
                                int getHeight();

                                String getUrl();

                                int getWidth();

                                boolean hasHeight();

                                boolean hasWidth();
                            }

                            ImmutableList getCandidates();
                        }

                        ImageVersions2 getImageVersions2();

                        String getPreview();
                    }

                    /* loaded from: classes11.dex */
                    public interface VariantValues extends C2JT {
                        String getId();

                        String getName();

                        String getNormalizedValue();

                        String getValue();

                        VFE getVisualStyle();

                        boolean hasIsPreselected();

                        boolean isPreselected();
                    }

                    AggregatedRating getAggregatedRating();

                    ArtsLabels getArtsLabels();

                    boolean getCanShareToStory();

                    boolean getCanViewerSeeRnr();

                    CheckoutProperties getCheckoutProperties();

                    EnumC33429Eq0 getCheckoutStyle();

                    CommerceReviewStatistics getCommerceReviewStatistics();

                    String getCompoundProductId();

                    String getCurrentPrice();

                    String getCurrentPriceAmount();

                    String getCurrentPriceStripped();

                    String getDescription();

                    DiscountInformation getDiscountInformation();

                    String getExternalUrl();

                    String getFullPrice();

                    String getFullPriceAmount();

                    String getFullPriceStripped();

                    boolean getHasVariants();

                    boolean getHasViewerSaved();

                    boolean getIgIsProductEditableOnMobile();

                    ImageQualityMetadata getImageQualityMetadata();

                    MainImage getMainImage();

                    String getMainImageId();

                    Merchant getMerchant();

                    String getName();

                    String getPrice();

                    String getProductId();

                    String getRetailerId();

                    String getReviewStatus();

                    ImmutableList getRichTextDescription();

                    SellerBadge getSellerBadge();

                    VFM getSizeCalibrationScore();

                    ThumbnailImage getThumbnailImage();

                    ImmutableList getVariantValues();

                    boolean hasCanShareToStory();

                    boolean hasCanViewerSeeRnr();

                    boolean hasHasVariants();

                    boolean hasHasViewerSaved();

                    boolean hasIgIsProductEditableOnMobile();

                    boolean hasIsEnteredInDrawing();

                    boolean hasIsInStock();

                    boolean isEnteredInDrawing();

                    boolean isInStock();
                }

                ProductDetails getProductDetails();
            }

            ClipsShoppingCtaBar getClipsShoppingCtaBar();

            Merchant getMerchant();

            ImmutableList getProducts();
        }

        /* loaded from: classes11.dex */
        public interface TemplateInfo extends C2JT {

            /* loaded from: classes11.dex */
            public interface AttributionInfo extends C2JT {
                String getOwnerUsername();

                String getTemplateMediaId();
            }

            /* loaded from: classes11.dex */
            public interface EffectsInfo extends C2JT {

                /* loaded from: classes11.dex */
                public interface SegmentEffectsInfo extends C2JT {
                    long getEffectId();

                    int getSegmentIndex();

                    boolean hasEffectId();

                    boolean hasSegmentIndex();
                }

                ImmutableList getSegmentEffectsInfo();
            }

            /* loaded from: classes11.dex */
            public interface SegmentsInfo extends C2JT {
                long getDurationInMs();

                int getReusableTemplateMediaAssetEndTimeMs();

                int getReusableTemplateMediaAssetStartTimeMs();

                boolean hasDurationInMs();

                boolean hasReusableTemplateMediaAssetEndTimeMs();

                boolean hasReusableTemplateMediaAssetStartTimeMs();
            }

            /* loaded from: classes11.dex */
            public interface TimedTextsInfo extends C2JT {

                /* loaded from: classes11.dex */
                public interface TextInfoList extends C2JT {

                    /* loaded from: classes11.dex */
                    public interface Colors extends C2JT {
                        int getCount();

                        String getHexRgbaColor();

                        boolean hasCount();
                    }

                    VF6 getAlignment();

                    ImmutableList getColors();

                    double getEndTimeMs();

                    double getFontSize();

                    double getHeight();

                    String getId();

                    double getOffsetX();

                    double getOffsetY();

                    double getRotationDegree();

                    double getScale();

                    double getStartTimeMs();

                    String getText();

                    VF7 getTextEmphasisMode();

                    EnumC223249tA getTextFormatType();

                    double getWidth();

                    int getZIndex();

                    boolean hasEndTimeMs();

                    boolean hasFontSize();

                    boolean hasHeight();

                    boolean hasIsAnimated();

                    boolean hasOffsetX();

                    boolean hasOffsetY();

                    boolean hasRotationDegree();

                    boolean hasScale();

                    boolean hasStartTimeMs();

                    boolean hasWidth();

                    boolean hasZIndex();

                    int isAnimated();
                }

                ImmutableList getTextInfoList();
            }

            /* loaded from: classes11.dex */
            public interface TransitionEffectsInfo extends C2JT {
                long getDurationInMs();

                int getIndex();

                String getName();

                long getStartTimeInMs();

                boolean hasDurationInMs();

                boolean hasIndex();

                boolean hasStartTimeInMs();
            }

            AttributionInfo getAttributionInfo();

            EffectsInfo getEffectsInfo();

            int getMinNumSegments();

            ImmutableList getSegmentsInfo();

            long getTemplateClipsMediaId();

            TimedTextsInfo getTimedTextsInfo();

            ImmutableList getTransitionEffectsInfo();

            boolean hasMinNumSegments();

            boolean hasTemplateClipsMediaId();
        }

        AchievementsInfo getAchievementsInfo();

        AdditionalAudioInfo getAdditionalAudioInfo();

        AssetRecommendationInfo getAssetRecommendationInfo();

        AudioRankingInfo getAudioRankingInfo();

        VFB getAudioType();

        BrandedContentTagInfo getBrandedContentTagInfo();

        String getClipsCreationEntryPoint();

        ContentAppreciationInfo getContentAppreciationInfo();

        ContextualHighlightInfo getContextualHighlightInfo();

        boolean getDisableUseInClipsClientCache();

        MashupInfo getMashupInfo();

        MerchandisingPillInfo getMerchandisingPillInfo();

        String getMusicCanonicalId();

        MusicInfo getMusicInfo();

        OriginalSoundInfo getOriginalSoundInfo();

        int getProfessionalClipsUpsellType();

        String getReusableTextAttributeString();

        ShoppingInfo getShoppingInfo();

        boolean getShowAchievements();

        boolean getShowTips();

        TemplateInfo getTemplateInfo();

        boolean hasDisableUseInClipsClientCache();

        boolean hasIsFanClubPromoVideo();

        boolean hasIsPublicChatWelcomeVideo();

        boolean hasIsSharedToFb();

        boolean hasProfessionalClipsUpsellType();

        boolean hasShowAchievements();

        boolean hasShowTips();

        boolean isFanClubPromoVideo();

        boolean isPublicChatWelcomeVideo();

        boolean isSharedToFb();
    }

    /* loaded from: classes11.dex */
    public interface CoauthorProducers extends C2JT {
        String getFullName();

        boolean getHasOnboardedToTextPostApp();

        String getId();

        String getPk();

        String getPkId();

        String getProfilePicId();

        String getProfilePicUrl();

        String getUsername();

        boolean hasHasOnboardedToTextPostApp();

        boolean hasIsPrivate();

        boolean hasIsVerified();

        boolean isPrivate();

        boolean isVerified();
    }

    /* loaded from: classes11.dex */
    public interface CommentInformTreatment extends C2JT {
        boolean getShouldHaveInformTreatment();

        String getText();

        boolean hasShouldHaveInformTreatment();
    }

    /* loaded from: classes11.dex */
    public interface CreativeConfig extends C2JT {

        /* loaded from: classes11.dex */
        public interface CreationToolInfo extends C2JT {
            int getAppearanceEffect();

            int getCameraTool();

            String getColorFilters();

            double getDurationSelectorSeconds();

            double getSpeedSelector();

            double getTimerSelectorSeconds();

            boolean hasAppearanceEffect();

            boolean hasCameraTool();

            boolean hasDurationSelectorSeconds();

            boolean hasSpeedSelector();

            boolean hasTimerSelectorSeconds();
        }

        /* loaded from: classes11.dex */
        public interface EffectConfigs extends C2JT {

            /* loaded from: classes11.dex */
            public interface AttributionUser extends C2JT {

                /* loaded from: classes11.dex */
                public interface ProfilePicture extends C2JT {
                    String getUri();
                }

                String getInstagramUserId();

                ProfilePicture getProfilePicture();

                String getUsername();
            }

            /* loaded from: classes11.dex */
            public interface ThumbnailImage extends C2JT {
                String getUri();
            }

            AttributionUser getAttributionUser();

            String getEffectId();

            String getFailureCode();

            String getFailureReason();

            String getId();

            String getName();

            String getSaveStatus();

            ThumbnailImage getThumbnailImage();

            String getTitle();

            boolean hasIsAgeRestricted();

            boolean isAgeRestricted();
        }

        String getCaptureType();

        ImmutableList getCreationToolInfo();

        ImmutableList getEffectConfigs();
    }

    /* loaded from: classes11.dex */
    public interface FacepileTopLikers extends C2JT {
        String getFullName();

        String getId();

        String getPk();

        String getPkId();

        String getProfilePicId();

        String getProfilePicUrl();

        String getUsername();

        boolean hasIsPrivate();

        boolean hasIsVerified();

        boolean isPrivate();

        boolean isVerified();
    }

    /* loaded from: classes11.dex */
    public interface FundraiserTag extends C2JT {
        String getBeneficiaryName();

        String getBeneficiaryUsername();

        boolean getCanViewerDonate();

        boolean getCanViewerRemoveFundraiserTag();

        String getContextualTitleStr();

        String getFormattedAmountRaised();

        String getFormattedFundraiserProgressInfoText();

        String getFormattedGoalAmount();

        String getFundraiserId();

        String getFundraiserOwnerUsername();

        String getFundraiserTitle();

        EnumC72385XcL getFundraiserType();

        String getProgressStr();

        boolean getShowFundraiserOwnerAttribution();

        String getThumbnailDisplayUrl();

        boolean hasCanViewerDonate();

        boolean hasCanViewerRemoveFundraiserTag();

        boolean hasIsMediaOwnerFundraiserOwner();

        boolean hasShowFundraiserOwnerAttribution();

        boolean isMediaOwnerFundraiserOwner();
    }

    /* loaded from: classes11.dex */
    public interface IgtvSeriesInfo extends C2JT {
        boolean getHasCoverPhoto();

        String getId();

        int getNumEpisodes();

        String getTitle();

        boolean hasHasCoverPhoto();

        boolean hasNumEpisodes();
    }

    /* loaded from: classes11.dex */
    public interface IgtvShoppingInfo extends C2JT {

        /* loaded from: classes11.dex */
        public interface ClipsShoppingCtaBar extends C2JT {
            double getAnimationTimeSec();

            String getCtaBarType();

            String getDestination();

            String getDominantColor();

            int getDwellTimeSec();

            String getTitle();

            String getToggledDestination();

            String getToggledTitle();

            boolean hasAnimationTimeSec();

            boolean hasDwellTimeSec();
        }

        /* loaded from: classes11.dex */
        public interface Merchant extends C2JT {
            boolean getDisabledSharingProductsToGuides();

            String getId();

            String getPk();

            String getProfilePicUrl();

            String getUsername();

            boolean hasDisabledSharingProductsToGuides();

            boolean hasIsVerified();

            boolean isVerified();
        }

        /* loaded from: classes11.dex */
        public interface Products extends C2JT {

            /* loaded from: classes11.dex */
            public interface ProductDetails extends C2JT {

                /* loaded from: classes11.dex */
                public interface AggregatedRating extends C2JT {
                    int getRatingCount();

                    double getValue();

                    boolean hasRatingCount();

                    boolean hasValue();
                }

                /* loaded from: classes11.dex */
                public interface ArtsLabels extends C2JT {

                    /* loaded from: classes11.dex */
                    public interface Labels extends C2JT {
                        String getLabelDisplayValue();

                        String getLabelType();
                    }

                    ImmutableList getLabels();
                }

                /* loaded from: classes11.dex */
                public interface CheckoutProperties extends C2JT {

                    /* loaded from: classes11.dex */
                    public interface CurrencyAmount extends C2JT {
                        String getAmount();

                        String getAmountWithOffset();

                        String getCurrency();

                        int getOffset();

                        boolean hasOffset();
                    }

                    /* loaded from: classes11.dex */
                    public interface ShippingAndReturn extends C2JT {

                        /* loaded from: classes11.dex */
                        public interface ShippingCost extends C2JT {
                            String getAmount();

                            String getAmountWithOffset();

                            String getCurrency();

                            int getOffset();

                            boolean hasOffset();
                        }

                        ShippingCost getShippingCost();

                        String getShippingCostStripped();
                    }

                    boolean getCanAddToBag();

                    boolean getCanEnableRestockReminder();

                    boolean getCanShowInventoryQuantity();

                    CurrencyAmount getCurrencyAmount();

                    int getFullInventoryQuantity();

                    boolean getHasFreeShipping();

                    String getIgReferrerFbid();

                    int getInventoryQuantity();

                    boolean getProductGroupHasInventory();

                    String getReceiverId();

                    ShippingAndReturn getShippingAndReturn();

                    int getViewerPurchaseLimit();

                    boolean hasCanAddToBag();

                    boolean hasCanEnableRestockReminder();

                    boolean hasCanShowInventoryQuantity();

                    boolean hasFullInventoryQuantity();

                    boolean hasHasFreeShipping();

                    boolean hasInventoryQuantity();

                    boolean hasIsShopifyMerchant();

                    boolean hasProductGroupHasInventory();

                    boolean hasViewerPurchaseLimit();

                    boolean isShopifyMerchant();
                }

                /* loaded from: classes11.dex */
                public interface CommerceReviewStatistics extends C2JT {
                    double getAverageRating();

                    int getReviewCount();

                    boolean hasAverageRating();

                    boolean hasReviewCount();
                }

                /* loaded from: classes11.dex */
                public interface DiscountInformation extends C2JT {

                    /* loaded from: classes11.dex */
                    public interface Discounts extends C2JT {
                        String getCtaText();

                        String getDescription();

                        String getId();

                        String getName();

                        String getSeeDetailsText();
                    }

                    ImmutableList getDiscounts();
                }

                /* loaded from: classes11.dex */
                public interface ImageQualityMetadata extends C2JT {

                    /* loaded from: classes11.dex */
                    public interface Goodness extends C2JT {
                        String getId();

                        double getScore();

                        boolean hasScore();
                    }

                    /* loaded from: classes11.dex */
                    public interface LifestyleBackground extends C2JT {
                        String getId();

                        double getScore();

                        boolean hasScore();
                    }

                    ImmutableList getGoodness();

                    ImmutableList getLifestyleBackground();
                }

                /* loaded from: classes11.dex */
                public interface MainImage extends C2JT {

                    /* loaded from: classes11.dex */
                    public interface ImageVersions2 extends C2JT {

                        /* loaded from: classes11.dex */
                        public interface Candidates extends C2JT {
                            int getHeight();

                            String getUrl();

                            int getWidth();

                            boolean hasHeight();

                            boolean hasWidth();
                        }

                        ImmutableList getCandidates();
                    }

                    ImageVersions2 getImageVersions2();

                    String getPreview();
                }

                /* loaded from: classes11.dex */
                public interface Merchant extends C2JT {
                    boolean getDisabledSharingProductsToGuides();

                    String getId();

                    String getPk();

                    String getProfilePicUrl();

                    String getUsername();

                    boolean hasDisabledSharingProductsToGuides();

                    boolean hasIsVerified();

                    boolean isVerified();
                }

                /* loaded from: classes11.dex */
                public interface ThumbnailImage extends C2JT {

                    /* loaded from: classes11.dex */
                    public interface ImageVersions2 extends C2JT {

                        /* loaded from: classes11.dex */
                        public interface Candidates extends C2JT {
                            int getHeight();

                            String getUrl();

                            int getWidth();

                            boolean hasHeight();

                            boolean hasWidth();
                        }

                        ImmutableList getCandidates();
                    }

                    ImageVersions2 getImageVersions2();

                    String getPreview();
                }

                /* loaded from: classes11.dex */
                public interface VariantValues extends C2JT {
                    String getId();

                    String getName();

                    String getNormalizedValue();

                    String getValue();

                    VFE getVisualStyle();

                    boolean hasIsPreselected();

                    boolean isPreselected();
                }

                AggregatedRating getAggregatedRating();

                ArtsLabels getArtsLabels();

                boolean getCanShareToStory();

                boolean getCanViewerSeeRnr();

                CheckoutProperties getCheckoutProperties();

                EnumC33429Eq0 getCheckoutStyle();

                CommerceReviewStatistics getCommerceReviewStatistics();

                String getCompoundProductId();

                String getCurrentPrice();

                String getCurrentPriceAmount();

                String getCurrentPriceStripped();

                String getDescription();

                DiscountInformation getDiscountInformation();

                String getExternalUrl();

                String getFullPrice();

                String getFullPriceAmount();

                String getFullPriceStripped();

                boolean getHasVariants();

                boolean getHasViewerSaved();

                boolean getIgIsProductEditableOnMobile();

                ImageQualityMetadata getImageQualityMetadata();

                MainImage getMainImage();

                String getMainImageId();

                Merchant getMerchant();

                String getName();

                String getPrice();

                String getProductId();

                String getRetailerId();

                String getReviewStatus();

                VFM getSizeCalibrationScore();

                ThumbnailImage getThumbnailImage();

                ImmutableList getVariantValues();

                boolean hasCanShareToStory();

                boolean hasCanViewerSeeRnr();

                boolean hasHasVariants();

                boolean hasHasViewerSaved();

                boolean hasIgIsProductEditableOnMobile();

                boolean hasIsEnteredInDrawing();

                boolean hasIsInStock();

                boolean isEnteredInDrawing();

                boolean isInStock();
            }

            ProductDetails getProductDetails();
        }

        ClipsShoppingCtaBar getClipsShoppingCtaBar();

        Merchant getMerchant();

        ImmutableList getProducts();
    }

    /* loaded from: classes11.dex */
    public interface ImageVersions2 extends C2JT {

        /* loaded from: classes11.dex */
        public interface AdditionalCandidates extends C2JT {

            /* loaded from: classes11.dex */
            public interface FirstFrame extends C2JT {
                int getHeight();

                String getScansProfile();

                String getUrl();

                int getWidth();

                boolean hasHeight();

                boolean hasWidth();
            }

            /* loaded from: classes11.dex */
            public interface IgtvFirstFrame extends C2JT {
                int getHeight();

                String getScansProfile();

                String getUrl();

                int getWidth();

                boolean hasHeight();

                boolean hasWidth();
            }

            FirstFrame getFirstFrame();

            IgtvFirstFrame getIgtvFirstFrame();
        }

        /* loaded from: classes11.dex */
        public interface Candidates extends C2JT {
            int getHeight();

            String getScansProfile();

            String getUrl();

            int getWidth();

            boolean hasHeight();

            boolean hasWidth();
        }

        /* loaded from: classes11.dex */
        public interface ScrubberSpritesheetInfoCandidates extends C2JT {

            /* loaded from: classes11.dex */
            public interface Default extends C2JT {
                int getFileSizeKb();

                int getMaxThumbnailsPerSprite();

                int getRenderedWidth();

                int getSpriteHeight();

                int getSpriteWidth();

                double getThumbnailDuration();

                int getThumbnailHeight();

                int getThumbnailWidth();

                int getThumbnailsPerRow();

                int getTotalThumbnailNumPerSprite();

                double getVideoLength();

                boolean hasFileSizeKb();

                boolean hasMaxThumbnailsPerSprite();

                boolean hasRenderedWidth();

                boolean hasSpriteHeight();

                boolean hasSpriteWidth();

                boolean hasThumbnailDuration();

                boolean hasThumbnailHeight();

                boolean hasThumbnailWidth();

                boolean hasThumbnailsPerRow();

                boolean hasTotalThumbnailNumPerSprite();

                boolean hasVideoLength();
            }

            Default getDefault();
        }

        AdditionalCandidates getAdditionalCandidates();

        ImmutableList getCandidates();

        ScrubberSpritesheetInfoCandidates getScrubberSpritesheetInfoCandidates();

        boolean getSmartThumbnailEnabled();

        boolean hasSmartThumbnailEnabled();
    }

    /* loaded from: classes11.dex */
    public interface InvitedCoauthorProducers extends C2JT {
        String getFullName();

        boolean getHasOnboardedToTextPostApp();

        String getId();

        String getPk();

        String getPkId();

        String getProfilePicId();

        String getProfilePicUrl();

        String getUsername();

        boolean hasHasOnboardedToTextPostApp();

        boolean hasIsPrivate();

        boolean hasIsVerified();

        boolean isPrivate();

        boolean isVerified();
    }

    /* loaded from: classes11.dex */
    public interface Location extends C2JT {
        String getAddress();

        String getCity();

        String getExternalSource();

        long getFacebookPlacesId();

        boolean getHasViewerSaved();

        double getLat();

        double getLng();

        String getName();

        long getPk();

        String getShortName();

        boolean hasFacebookPlacesId();

        boolean hasHasViewerSaved();

        boolean hasIsEligibleForGuides();

        boolean hasLat();

        boolean hasLng();

        boolean hasPk();

        boolean isEligibleForGuides();
    }

    /* loaded from: classes11.dex */
    public interface MashupInfo extends C2JT {
        boolean getCanToggleMashupsAllowed();

        boolean getHasBeenMashedUp();

        boolean getHasNonmimicableAdditionalAudio();

        boolean getMashupsAllowed();

        boolean hasCanToggleMashupsAllowed();

        boolean hasHasBeenMashedUp();

        boolean hasHasNonmimicableAdditionalAudio();

        boolean hasIsCreatorRequestingMashup();

        boolean hasIsLightWeightCheck();

        boolean hasIsPivotPageAvailable();

        boolean hasMashupsAllowed();

        boolean isCreatorRequestingMashup();

        boolean isLightWeightCheck();

        boolean isPivotPageAvailable();
    }

    /* loaded from: classes11.dex */
    public interface MediaAppreciationSettings extends C2JT {
        VF9 getGiftCountVisibility();

        VFA getMediaGiftingState();
    }

    /* loaded from: classes11.dex */
    public interface MediaCroppingInfo extends C2JT {

        /* loaded from: classes11.dex */
        public interface FeedPreviewCrop extends C2JT {
            double getCropBottom();

            double getCropLeft();

            double getCropRight();

            double getCropTop();

            boolean hasCropBottom();

            boolean hasCropLeft();

            boolean hasCropRight();

            boolean hasCropTop();
        }

        /* loaded from: classes11.dex */
        public interface SquareCrop extends C2JT {
            double getCropBottom();

            double getCropLeft();

            double getCropRight();

            double getCropTop();

            boolean hasCropBottom();

            boolean hasCropLeft();

            boolean hasCropRight();

            boolean hasCropTop();
        }

        FeedPreviewCrop getFeedPreviewCrop();

        SquareCrop getSquareCrop();

        String getStrongId();
    }

    /* loaded from: classes11.dex */
    public interface MediaNotice extends C2JT {
        EnumC39604HeE getNoticeIcon();

        String getNoticeSubText();

        String getNoticeText();

        String getNoticeUrl();
    }

    /* loaded from: classes11.dex */
    public interface MediaOverlayInfo extends C2JT {

        /* loaded from: classes11.dex */
        public interface Buttons extends C2JT {

            /* loaded from: classes11.dex */
            public interface Icon extends C2JT {
                int getIconGlyph();

                int getIconType();

                String getName();

                boolean hasIconGlyph();

                boolean hasIconType();
            }

            /* loaded from: classes11.dex */
            public interface TextColor extends C2JT {
                String getDark();

                String getLight();
            }

            int getAction();

            String getActionUrl();

            int getButtonType();

            boolean getHasChevron();

            Icon getIcon();

            String getSecondaryText();

            String getText();

            TextColor getTextColor();

            boolean hasAction();

            boolean hasButtonType();

            boolean hasHasChevron();

            boolean hasIsTextCentered();

            boolean isTextCentered();
        }

        /* loaded from: classes11.dex */
        public interface Icon extends C2JT {
            int getIconGlyph();

            int getIconType();

            String getName();

            boolean hasIconGlyph();

            boolean hasIconType();
        }

        ImmutableList getButtons();

        String getDescription();

        Icon getIcon();

        int getMisinformationType();

        int getOverlayAppliedTimestamp();

        int getOverlayLayout();

        String getOverlayType();

        String getSessionId();

        String getSubCategory();

        String getTitle();

        boolean hasMisinformationType();

        boolean hasOverlayAppliedTimestamp();

        boolean hasOverlayLayout();
    }

    /* loaded from: classes11.dex */
    public interface MusicMetadata extends C2JT {

        /* loaded from: classes11.dex */
        public interface OriginalSoundInfo extends C2JT {

            /* loaded from: classes11.dex */
            public interface AudioParts extends C2JT {
                CreatorInspirationSignalsPlaygroundAudioPartMetadata asCreatorInspirationSignalsPlaygroundAudioPartMetadata();
            }

            /* loaded from: classes11.dex */
            public interface AudioPartsByFilter extends C2JT {
                CreatorInspirationSignalsPlaygroundAudioPartMetadata asCreatorInspirationSignalsPlaygroundAudioPartMetadata();
            }

            /* loaded from: classes11.dex */
            public interface ConsumptionInfo extends C2JT {
                String getShouldMuteAudioReason();

                boolean hasIsBookmarked();

                boolean hasIsTrendingInClips();

                boolean isBookmarked();

                boolean isTrendingInClips();
            }

            /* loaded from: classes11.dex */
            public interface IgArtist extends C2JT {
                String getFullName();

                String getId();

                String getPk();

                String getPkId();

                String getProfilePicId();

                String getProfilePicUrl();

                String getUsername();

                boolean hasIsPrivate();

                boolean hasIsVerified();

                boolean isPrivate();

                boolean isVerified();
            }

            boolean getAllowCreatorToRename();

            String getAudioAssetId();

            ImmutableList getAudioParts();

            ImmutableList getAudioPartsByFilter();

            boolean getCanRemixBeSharedToFb();

            ConsumptionInfo getConsumptionInfo();

            String getDashManifest();

            int getDurationInMs();

            boolean getHideRemixing();

            IgArtist getIgArtist();

            VFC getOriginalAudioSubtype();

            String getOriginalAudioTitle();

            String getOriginalMediaId();

            String getProgressiveDownloadUrl();

            boolean getShouldMuteAudio();

            int getTimeCreated();

            int getTrendRank();

            boolean hasAllowCreatorToRename();

            boolean hasCanRemixBeSharedToFb();

            boolean hasDurationInMs();

            boolean hasHideRemixing();

            boolean hasIsAudioAutomaticallyAttributed();

            boolean hasIsExplicit();

            boolean hasIsOriginalAudioDownloadEligible();

            boolean hasIsReuseDisabled();

            boolean hasIsXpostFromFb();

            boolean hasShouldMuteAudio();

            boolean hasTimeCreated();

            boolean hasTrendRank();

            boolean isAudioAutomaticallyAttributed();

            boolean isExplicit();

            boolean isOriginalAudioDownloadEligible();

            boolean isReuseDisabled();

            boolean isXpostFromFb();
        }

        VFB getAudioType();

        String getMusicCanonicalId();

        OriginalSoundInfo getOriginalSoundInfo();
    }

    /* loaded from: classes11.dex */
    public interface OrganicCtaInfo extends C2JT {
        String getCtaSubtitle();

        String getCtaTitle();

        EnumC39608HeI getCtaType();
    }

    /* loaded from: classes11.dex */
    public interface ProductTags extends C2JT {

        /* loaded from: classes11.dex */
        public interface In extends C2JT {

            /* loaded from: classes11.dex */
            public interface Product extends C2JT {

                /* loaded from: classes11.dex */
                public interface AggregatedRating extends C2JT {
                    int getRatingCount();

                    double getValue();

                    boolean hasRatingCount();

                    boolean hasValue();
                }

                /* loaded from: classes11.dex */
                public interface ArtsLabels extends C2JT {

                    /* loaded from: classes11.dex */
                    public interface Labels extends C2JT {
                        String getLabelDisplayValue();

                        String getLabelType();
                    }

                    ImmutableList getLabels();
                }

                /* loaded from: classes11.dex */
                public interface CheckoutProperties extends C2JT {

                    /* loaded from: classes11.dex */
                    public interface CurrencyAmount extends C2JT {
                        String getAmount();

                        String getAmountWithOffset();

                        String getCurrency();

                        int getOffset();

                        boolean hasOffset();
                    }

                    /* loaded from: classes11.dex */
                    public interface ShippingAndReturn extends C2JT {

                        /* loaded from: classes11.dex */
                        public interface ReturnCost extends C2JT {
                            String getAmount();

                            String getAmountWithOffset();

                            String getCurrency();

                            int getOffset();

                            boolean hasOffset();
                        }

                        /* loaded from: classes11.dex */
                        public interface ShippingCost extends C2JT {
                            String getAmount();

                            String getAmountWithOffset();

                            String getCurrency();

                            int getOffset();

                            boolean hasOffset();
                        }

                        ReturnCost getReturnCost();

                        ShippingCost getShippingCost();

                        String getShippingCostStripped();
                    }

                    boolean getCanAddToBag();

                    boolean getCanEnableRestockReminder();

                    CurrencyAmount getCurrencyAmount();

                    int getFullInventoryQuantity();

                    boolean getHasFreeShipping();

                    String getIgReferrerFbid();

                    int getInventoryQuantity();

                    boolean getProductGroupHasInventory();

                    String getReceiverId();

                    ShippingAndReturn getShippingAndReturn();

                    int getViewerPurchaseLimit();

                    boolean hasCanAddToBag();

                    boolean hasCanEnableRestockReminder();

                    boolean hasFullInventoryQuantity();

                    boolean hasHasFreeShipping();

                    boolean hasInventoryQuantity();

                    boolean hasIsShopifyMerchant();

                    boolean hasProductGroupHasInventory();

                    boolean hasViewerPurchaseLimit();

                    boolean isShopifyMerchant();
                }

                /* loaded from: classes11.dex */
                public interface CommerceReviewStatistics extends C2JT {
                    double getAverageRating();

                    int getReviewCount();

                    boolean hasAverageRating();

                    boolean hasReviewCount();
                }

                /* loaded from: classes11.dex */
                public interface DiscountInformation extends C2JT {

                    /* loaded from: classes11.dex */
                    public interface Discounts extends C2JT {
                        String getCtaText();

                        String getDescription();

                        String getId();

                        String getName();

                        String getSeeDetailsText();
                    }

                    ImmutableList getDiscounts();
                }

                /* loaded from: classes11.dex */
                public interface ImageQualityMetadata extends C2JT {

                    /* loaded from: classes11.dex */
                    public interface Goodness extends C2JT {
                        String getId();

                        double getScore();

                        boolean hasScore();
                    }

                    /* loaded from: classes11.dex */
                    public interface LifestyleBackground extends C2JT {
                        String getId();

                        double getScore();

                        boolean hasScore();
                    }

                    ImmutableList getGoodness();

                    ImmutableList getLifestyleBackground();
                }

                /* loaded from: classes11.dex */
                public interface MainImage extends C2JT {

                    /* loaded from: classes11.dex */
                    public interface ImageVersions2 extends C2JT {

                        /* loaded from: classes11.dex */
                        public interface Candidates extends C2JT {
                            int getHeight();

                            String getUrl();

                            int getWidth();

                            boolean hasHeight();

                            boolean hasWidth();
                        }

                        ImmutableList getCandidates();
                    }

                    ImageVersions2 getImageVersions2();

                    String getPreview();
                }

                /* loaded from: classes11.dex */
                public interface Merchant extends C2JT {
                    boolean getDisabledSharingProductsToGuides();

                    String getId();

                    String getPk();

                    String getProfilePicUrl();

                    String getStorefrontAttributionUsername();

                    String getUsername();

                    boolean hasDisabledSharingProductsToGuides();

                    boolean hasIsVerified();

                    boolean isVerified();
                }

                /* loaded from: classes11.dex */
                public interface RichTextDescription extends C2JT {

                    /* loaded from: classes11.dex */
                    public interface TextWithEntities extends C2JT {

                        /* loaded from: classes11.dex */
                        public interface InlineStyleRanges extends C2JT {
                            int getInlineStyle();

                            int getLength();

                            int getOffset();

                            boolean hasInlineStyle();

                            boolean hasLength();

                            boolean hasOffset();
                        }

                        ImmutableList getInlineStyleRanges();

                        String getText();
                    }

                    String getBlockType();

                    int getDepth();

                    TextWithEntities getTextWithEntities();

                    boolean hasDepth();
                }

                /* loaded from: classes11.dex */
                public interface SellerBadge extends C2JT {
                    String getDescription();

                    String getName();

                    EnumC39610HeK getType();
                }

                /* loaded from: classes11.dex */
                public interface ThumbnailImage extends C2JT {

                    /* loaded from: classes11.dex */
                    public interface ImageVersions2 extends C2JT {

                        /* loaded from: classes11.dex */
                        public interface Candidates extends C2JT {
                            int getHeight();

                            String getUrl();

                            int getWidth();

                            boolean hasHeight();

                            boolean hasWidth();
                        }

                        ImmutableList getCandidates();
                    }

                    ImageVersions2 getImageVersions2();
                }

                AggregatedRating getAggregatedRating();

                ArtsLabels getArtsLabels();

                boolean getCanShareToStory();

                boolean getCanViewerSeeRnr();

                CheckoutProperties getCheckoutProperties();

                EnumC33429Eq0 getCheckoutStyle();

                CommerceReviewStatistics getCommerceReviewStatistics();

                String getCompoundProductId();

                String getCurrentPrice();

                String getCurrentPriceAmount();

                String getCurrentPriceStripped();

                String getDescription();

                DiscountInformation getDiscountInformation();

                String getExternalUrl();

                String getFullPrice();

                String getFullPriceAmount();

                String getFullPriceStripped();

                boolean getHasVariants();

                boolean getHasViewerSaved();

                boolean getIgIsProductEditableOnMobile();

                ImageQualityMetadata getImageQualityMetadata();

                MainImage getMainImage();

                String getMainImageId();

                Merchant getMerchant();

                String getName();

                String getPrice();

                String getProductId();

                String getRetailerId();

                String getReviewStatus();

                ImmutableList getRichTextDescription();

                SellerBadge getSellerBadge();

                VFM getSizeCalibrationScore();

                ThumbnailImage getThumbnailImage();

                boolean hasCanShareToStory();

                boolean hasCanViewerSeeRnr();

                boolean hasHasVariants();

                boolean hasHasViewerSaved();

                boolean hasIgIsProductEditableOnMobile();

                boolean hasIsEnteredInDrawing();

                boolean hasIsInStock();

                boolean isEnteredInDrawing();

                boolean isInStock();
            }

            int getDestination();

            Product getProduct();

            boolean hasDestination();

            boolean hasIsRemovable();

            boolean isRemovable();
        }

        ImmutableList getIn();
    }

    /* loaded from: classes11.dex */
    public interface Senders extends C2JT {
        String getId();

        String getProfilePicUrl();
    }

    /* loaded from: classes11.dex */
    public interface SharingFrictionInfo extends C2JT {
        boolean getShouldHaveSharingFriction();

        boolean hasShouldHaveSharingFriction();
    }

    /* loaded from: classes11.dex */
    public interface SocialContext extends C2JT {

        /* loaded from: classes11.dex */
        public interface SocialContextFacepileUsers extends C2JT {
            String getFullName();

            String getId();

            String getPk();

            String getPkId();

            String getProfilePicId();

            String getProfilePicUrl();

            String getUsername();

            boolean hasIsPrivate();

            boolean hasIsVerified();

            boolean isPrivate();

            boolean isVerified();
        }

        ImmutableList getSocialContextFacepileUsers();

        EnumC39611HeL getSocialContextType();

        int getSocialContextUsersCount();

        boolean hasSocialContextUsersCount();
    }

    /* loaded from: classes11.dex */
    public interface SponsorTags extends C2JT {

        /* loaded from: classes11.dex */
        public interface Sponsor extends C2JT {
            String getFullName();

            boolean getHasOnboardedToTextPostApp();

            String getId();

            String getPk();

            String getPkId();

            String getProfilePicId();

            String getProfilePicUrl();

            String getUsername();

            boolean hasHasOnboardedToTextPostApp();

            boolean hasIsPrivate();

            boolean hasIsUnpublished();

            boolean hasIsVerified();

            boolean isPrivate();

            boolean isUnpublished();

            boolean isVerified();
        }

        boolean getPermission();

        Sponsor getSponsor();

        boolean hasIsPending();

        boolean hasPermission();

        boolean isPending();
    }

    /* loaded from: classes11.dex */
    public interface StoryPolls extends C2JT {

        /* loaded from: classes11.dex */
        public interface PollSticker extends C2JT {

            /* loaded from: classes11.dex */
            public interface Tallies extends C2JT {
                int getCount();

                double getFontSize();

                String getText();

                boolean hasCount();

                boolean hasFontSize();
            }

            String getColor();

            boolean getFinished();

            String getId();

            String getPollId();

            String getPollType();

            String getQuestion();

            ImmutableList getTallies();

            boolean getViewerCanVote();

            int getViewerVote();

            boolean hasFinished();

            boolean hasIsMultiOptionPoll();

            boolean hasIsSharedResult();

            boolean hasViewerCanVote();

            boolean hasViewerVote();

            boolean isMultiOptionPoll();

            boolean isSharedResult();
        }

        double getEndTimeMs();

        double getHeight();

        PollSticker getPollSticker();

        double getRotation();

        double getStartTimeMs();

        double getWidth();

        double getX();

        double getY();

        double getZ();

        boolean hasEndTimeMs();

        boolean hasHeight();

        boolean hasIsFbSticker();

        boolean hasIsHidden();

        boolean hasIsPinned();

        boolean hasIsSticker();

        boolean hasRotation();

        boolean hasStartTimeMs();

        boolean hasWidth();

        boolean hasX();

        boolean hasY();

        boolean hasZ();

        int isFbSticker();

        int isHidden();

        int isPinned();

        int isSticker();
    }

    /* loaded from: classes11.dex */
    public interface StorySliders extends C2JT {

        /* loaded from: classes11.dex */
        public interface SliderSticker extends C2JT {
            String getBackgroundColor();

            String getEmoji();

            String getQuestion();

            String getSliderId();

            double getSliderVoteAverage();

            int getSliderVoteCount();

            String getTextColor();

            boolean getViewerCanVote();

            boolean hasIsInteractiveMusicSticker();

            boolean hasSliderVoteAverage();

            boolean hasSliderVoteCount();

            boolean hasViewerCanVote();

            boolean isInteractiveMusicSticker();
        }

        double getEndTimeMs();

        double getHeight();

        double getRotation();

        SliderSticker getSliderSticker();

        double getStartTimeMs();

        double getWidth();

        double getX();

        double getY();

        double getZ();

        boolean hasEndTimeMs();

        boolean hasHeight();

        boolean hasIsFbSticker();

        boolean hasIsHidden();

        boolean hasIsPinned();

        boolean hasIsSticker();

        boolean hasRotation();

        boolean hasStartTimeMs();

        boolean hasWidth();

        boolean hasX();

        boolean hasY();

        boolean hasZ();

        int isFbSticker();

        int isHidden();

        int isPinned();

        int isSticker();
    }

    /* loaded from: classes11.dex */
    public interface UpcomingEvent extends C2JT {

        /* loaded from: classes11.dex */
        public interface Owner extends C2JT {
            String getId();

            String getPk();
        }

        long getEndTime();

        String getId();

        Owner getOwner();

        boolean getReminderEnabled();

        long getStartTime();

        String getStrongId();

        String getTitle();

        EnumC39613HeN getUpcomingEventIdType();

        boolean hasEndTime();

        boolean hasReminderEnabled();

        boolean hasStartTime();
    }

    /* loaded from: classes7.dex */
    public interface User extends C2JT {
        CreatorInspirationSignalsPlaygroundTestUser asCreatorInspirationSignalsPlaygroundTestUser();
    }

    /* loaded from: classes11.dex */
    public interface Usertags extends C2JT {

        /* loaded from: classes10.dex */
        public interface In extends C2JT {

            /* loaded from: classes10.dex */
            public interface User extends C2JT {

                /* loaded from: classes10.dex */
                public interface FriendshipStatus extends C2JT {
                    boolean getBlocking();

                    boolean getFollowedBy();

                    boolean getFollowing();

                    boolean getIncomingRequest();

                    boolean getMuting();

                    boolean getOutgoingRequest();

                    boolean hasBlocking();

                    boolean hasFollowedBy();

                    boolean hasFollowing();

                    boolean hasIncomingRequest();

                    boolean hasIsBestie();

                    boolean hasIsFeedFavorite();

                    boolean hasIsPrivate();

                    boolean hasIsRestricted();

                    boolean hasMuting();

                    boolean hasOutgoingRequest();

                    boolean isBestie();

                    boolean isFeedFavorite();

                    boolean isPrivate();

                    boolean isRestricted();
                }

                FriendshipStatus getFriendshipStatus();

                String getFullName();

                boolean getHasOnboardedToTextPostApp();

                String getId();

                String getPk();

                String getPkId();

                String getProfilePicId();

                String getProfilePicUrl();

                String getUsername();

                boolean hasHasOnboardedToTextPostApp();

                boolean hasIsPrivate();

                boolean hasIsVerified();

                boolean isPrivate();

                boolean isVerified();
            }

            boolean getShowCategoryOfUser();

            User getUser();

            boolean hasShowCategoryOfUser();
        }

        ImmutableList getIn();
    }

    /* loaded from: classes11.dex */
    public interface VideoVersions extends C2JT {
        int getHeight();

        String getId();

        int getType();

        String getUrl();

        int getWidth();

        boolean hasHeight();

        boolean hasType();

        boolean hasWidth();
    }

    /* loaded from: classes11.dex */
    public interface VisualCommentReplyStickerInfo extends C2JT {

        /* loaded from: classes11.dex */
        public interface VcrSticker extends C2JT {

            /* loaded from: classes11.dex */
            public interface OriginalCommentAuthor extends C2JT {
                String getFullName();

                boolean getHasOnboardedToTextPostApp();

                String getId();

                String getPk();

                String getPkId();

                String getProfilePicId();

                String getProfilePicUrl();

                String getUsername();

                boolean hasHasOnboardedToTextPostApp();

                boolean hasIsPrivate();

                boolean hasIsVerified();

                boolean isPrivate();

                boolean isVerified();
            }

            boolean getCanViewerLinkBackToOriginalMediaFromVcr();

            String getEndBackgroundColor();

            double getEndTimeMs();

            OriginalCommentAuthor getOriginalCommentAuthor();

            String getOriginalCommentId();

            String getOriginalCommentText();

            String getOriginalMediaId();

            String getStartBackgroundColor();

            double getStartTimeMs();

            String getTextColor();

            boolean hasCanViewerLinkBackToOriginalMediaFromVcr();

            boolean hasEndTimeMs();

            boolean hasStartTimeMs();
        }

        double getEndTimeMs();

        double getHeight();

        double getRotation();

        double getStartTimeMs();

        VcrSticker getVcrSticker();

        double getWidth();

        double getX();

        double getY();

        double getZ();

        boolean hasEndTimeMs();

        boolean hasHeight();

        boolean hasIsFbSticker();

        boolean hasIsHidden();

        boolean hasIsPinned();

        boolean hasIsSticker();

        boolean hasRotation();

        boolean hasStartTimeMs();

        boolean hasWidth();

        boolean hasX();

        boolean hasY();

        boolean hasZ();

        int isFbSticker();

        int isHidden();

        int isPinned();

        int isSticker();
    }

    /* loaded from: classes11.dex */
    public interface VisualRepliesInfo extends C2JT {

        /* loaded from: classes11.dex */
        public interface CommentInfo extends C2JT {
            String getCommentId();

            String getCommenterUsername();
        }

        /* loaded from: classes11.dex */
        public interface OriginalMedia extends C2JT {
            String getPk();
        }

        boolean getCanViewerLinkBackToOriginalMediaFromVcr();

        CommentInfo getCommentInfo();

        OriginalMedia getOriginalMedia();

        boolean hasCanViewerLinkBackToOriginalMediaFromVcr();
    }

    /* loaded from: classes11.dex */
    public interface WearableAttributionInfo extends C2JT {

        /* loaded from: classes11.dex */
        public interface WorldLocationPagesInfo extends C2JT {
            String getCoverPhoto();

            int getPostCount();

            String getWorldId();

            boolean hasPostCount();
        }

        String getAttributionCtaActionUrl();

        String getAttributionCtaText();

        String getAttributionIconUrl();

        String getAttributionSubtitle();

        String getAttributionTitle();

        String getAttributionTopIconUrl();

        EnumC27412C7p getAttributionType();

        int getIconicCurrentPresence();

        String getIconicHorizonWorldDeeplink();

        String getIconicHorizonWorldId();

        String getIconicHorizonWorldName();

        WorldLocationPagesInfo getWorldLocationPagesInfo();

        boolean hasIconicCurrentPresence();

        boolean hasIsWearableMediaProducer();

        boolean isWearableMediaProducer();
    }

    C38321qM asApiTypeModel(C1DV c1dv);

    C38321qM asRestModel__DO_NOT_USE(C1DV c1dv);

    boolean getAreRemixesCrosspostable();

    Attribution getAttribution();

    String getAudience();

    String getBoostUnavailableIdentifier();

    String getBoostUnavailableReason();

    String getBoostedBySponsor();

    String getBoostedStatus();

    ImmutableList getBrandedContentAdsBoostPostTokens();

    boolean getCanSeeInsightsAsBrand();

    boolean getCanViewerReshare();

    boolean getCanViewerSave();

    Caption getCaption();

    boolean getCaptionIsEdited();

    ClipsAttributionInfo getClipsAttributionInfo();

    ClipsMetadata getClipsMetadata();

    ImmutableList getClipsTabPinnedUserIds();

    boolean getCoauthorProducerCanSeeOrganicInsights();

    ImmutableList getCoauthorProducers();

    String getCode();

    int getCommentCount();

    CommentInformTreatment getCommentInformTreatment();

    boolean getCommentingDisabledForViewer();

    boolean getCommentsDisabled();

    CreativeConfig getCreativeConfig();

    int getDeletedReason();

    long getDeviceTimestamp();

    String getDominantColor();

    boolean getEnableWaist();

    ImmutableList getFacepileTopLikers();

    int getFbLikeCount();

    int getFbPlayCount();

    int getFilterType();

    FundraiserTag getFundraiserTag();

    boolean getHasAudio();

    boolean getHasDelayedMetadata();

    boolean getHasHiddenComments();

    boolean getHasLiked();

    boolean getHasMoreComments();

    boolean getHasReshares();

    int getHasSharedToFb();

    boolean getHasViewerSaved();

    boolean getHideViewAllCommentEntrypoint();

    String getId();

    boolean getIgMediaSharingDisabled();

    IgtvSeriesInfo getIgtvSeriesInfo();

    IgtvShoppingInfo getIgtvShoppingInfo();

    ImageVersions2 getImageVersions2();

    ImmutableList getInvitedCoauthorProducers();

    double getLat();

    boolean getLikeAndViewCountsDisabled();

    int getLikeCount();

    double getLng();

    Location getLocation();

    String getLoggingInfoToken();

    MashupInfo getMashupInfo();

    MediaAppreciationSettings getMediaAppreciationSettings();

    MediaCroppingInfo getMediaCroppingInfo();

    MediaNotice getMediaNotice();

    MediaOverlayInfo getMediaOverlayInfo();

    int getMediaType();

    MusicMetadata getMusicMetadata();

    String getNextMaxId();

    int getNumberOfQualities();

    OrganicCtaInfo getOrganicCtaInfo();

    EnumC39608HeI getOrganicCtaType();

    String getOrganicTrackingToken();

    int getOriginalHeight();

    boolean getOriginalMediaHasVisualReplyMedia();

    int getOriginalWidth();

    boolean getPhotoOfYou();

    int getPlayCount();

    String getPreview();

    ProductTags getProductTags();

    String getProductType();

    boolean getProfileGridControlEnabled();

    int getReshareCount();

    ImmutableList getSenders();

    SharingFrictionInfo getSharingFrictionInfo();

    String getShopRoutingUserId();

    ImmutableList getSocialContext();

    ImmutableList getSponsorTags();

    ImmutableList getStoryPolls();

    ImmutableList getStorySliders();

    boolean getSubscribeCtaVisible();

    String getSubscriptionMediaVisibility();

    long getTakenAt();

    String getTitle();

    ImmutableList getTopLikers();

    UpcomingEvent getUpcomingEvent();

    User getUser();

    Usertags getUsertags();

    String getVideoCodec();

    String getVideoDashManifest();

    double getVideoDuration();

    double getVideoSubtitlesConfidence();

    String getVideoSubtitlesUri();

    ImmutableList getVideoVersions();

    int getViewCount();

    int getViewStateItemType();

    ImmutableList getVisualCommentReplyStickerInfo();

    VisualRepliesInfo getVisualRepliesInfo();

    WearableAttributionInfo getWearableAttributionInfo();

    String getXpostDenyReason();

    boolean hasAreRemixesCrosspostable();

    boolean hasCanSeeInsightsAsBrand();

    boolean hasCanViewerReshare();

    boolean hasCanViewerSave();

    boolean hasCaptionIsEdited();

    boolean hasCoauthorProducerCanSeeOrganicInsights();

    boolean hasCommentCount();

    boolean hasCommentingDisabledForViewer();

    boolean hasCommentsDisabled();

    boolean hasDeletedReason();

    boolean hasDeviceTimestamp();

    boolean hasEnableWaist();

    boolean hasFbLikeCount();

    boolean hasFbPlayCount();

    boolean hasFilterType();

    boolean hasHasAudio();

    boolean hasHasDelayedMetadata();

    boolean hasHasHiddenComments();

    boolean hasHasLiked();

    boolean hasHasMoreComments();

    boolean hasHasReshares();

    boolean hasHasSharedToFb();

    boolean hasHasViewerSaved();

    boolean hasHideViewAllCommentEntrypoint();

    boolean hasIgMediaSharingDisabled();

    boolean hasIsArtistPick();

    boolean hasIsCommentsGifComposerEnabled();

    boolean hasIsCurrentlyPromotingBySponsor();

    boolean hasIsDashEligible();

    boolean hasIsFbOnly();

    boolean hasIsInProfileGrid();

    boolean hasIsInternalOnly();

    boolean hasIsOrganicProductTaggingEligible();

    boolean hasIsPaidPartnership();

    boolean hasIsPostLive();

    boolean hasIsThirdPartyDownloadsEligible();

    boolean hasIsUnifiedVideo();

    boolean hasIsVisualReplyCommenterNoticeEnabled();

    boolean hasLat();

    boolean hasLikeAndViewCountsDisabled();

    boolean hasLikeCount();

    boolean hasLng();

    boolean hasMediaType();

    boolean hasNumberOfQualities();

    boolean hasOriginalHeight();

    boolean hasOriginalMediaHasVisualReplyMedia();

    boolean hasOriginalWidth();

    boolean hasPhotoOfYou();

    boolean hasPlayCount();

    boolean hasProfileGridControlEnabled();

    boolean hasReshareCount();

    boolean hasSubscribeCtaVisible();

    boolean hasTakenAt();

    boolean hasVideoDuration();

    boolean hasVideoSubtitlesConfidence();

    boolean hasViewCount();

    boolean hasViewStateItemType();

    boolean isArtistPick();

    boolean isCommentsGifComposerEnabled();

    boolean isCurrentlyPromotingBySponsor();

    int isDashEligible();

    boolean isFbOnly();

    boolean isInProfileGrid();

    boolean isInternalOnly();

    boolean isOrganicProductTaggingEligible();

    boolean isPaidPartnership();

    boolean isPostLive();

    boolean isThirdPartyDownloadsEligible();

    boolean isUnifiedVideo();

    boolean isVisualReplyCommenterNoticeEnabled();
}
