package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31175DnJ;
import X.AbstractC58317Pt9;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.AbstractC58324PtG;
import X.AbstractC65702TsY;
import X.AbstractC65703TsZ;
import X.AbstractC65704Tsa;
import X.AbstractC70143W6w;
import X.C14360o3;
import X.C173847oc;
import X.C1DV;
import X.C1DY;
import X.C2JS;
import X.C38321qM;
import X.C38801rC;
import X.C4OK;
import X.C4OM;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C67A;
import X.C94754Oe;
import X.C94774Oi;
import X.C94784Oj;
import X.C94894Ou;
import X.C95124Py;
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
import X.MSV;
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
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class CreatorInspirationSignalsPlaygroundClipsMediaImpl extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -879418459;

    /* loaded from: classes11.dex */
    public final class Attribution extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.Attribution {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 881551846;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return Attribution.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Attribution
        public String getName() {
            return AbstractC65702TsY.A0a(this, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 0);
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public Attribution(int i) {
            super(i);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(AbstractC58318PtA.A0Q(), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        }

        public Attribution() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class BrandedContentAdsBoostPostTokens extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.BrandedContentAdsBoostPostTokens {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -870181937;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return BrandedContentAdsBoostPostTokens.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.BrandedContentAdsBoostPostTokens
        public String getAccessToken() {
            return AbstractC65702TsY.A0a(this, "access_token", 0);
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public BrandedContentAdsBoostPostTokens(int i) {
            super(i);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(AbstractC58318PtA.A0Q(), "access_token");
        }

        public BrandedContentAdsBoostPostTokens() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class Caption extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.Caption {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1606269373;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return Caption.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes10.dex */
        public final class User extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -1040939645;

            /* loaded from: classes10.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return User.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class FanClubInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -121929847;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return FanClubInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                /* loaded from: classes11.dex */
                public final class FanConsiderationPageRevampEligiblity extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo.FanConsiderationPageRevampEligiblity {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1605469106;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return FanConsiderationPageRevampEligiblity.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo.FanConsiderationPageRevampEligiblity
                    public boolean getShouldShowContentPreview() {
                        return getRequiredBooleanField(0, "should_show_content_preview");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo.FanConsiderationPageRevampEligiblity
                    public boolean getShouldShowSocialContext() {
                        return getRequiredBooleanField(1, "should_show_social_context");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo.FanConsiderationPageRevampEligiblity
                    public boolean hasShouldShowContentPreview() {
                        return true;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo.FanConsiderationPageRevampEligiblity
                    public boolean hasShouldShowSocialContext() {
                        return true;
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        C95124Py c95124Py = C95124Py.A00;
                        return AbstractC167017dG.A0Y(new C94774Oi(c95124Py), new C4OW(new C94774Oi(c95124Py), "should_show_content_preview"), "should_show_social_context");
                    }

                    public FanConsiderationPageRevampEligiblity(int i) {
                        super(i);
                    }

                    public FanConsiderationPageRevampEligiblity() {
                        super(TYPE_TAG);
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo
                public boolean getAutosaveToExclusiveHighlight() {
                    return getCoercedBooleanField(0, "autosave_to_exclusive_highlight");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo
                public int getConnectedMemberCount() {
                    return getCoercedIntField(1, "connected_member_count");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo
                public boolean getHasEnoughSubscribersForSsc() {
                    return getCoercedBooleanField(5, "has_enough_subscribers_for_ssc");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo
                public boolean isFanClubGiftingEligible() {
                    return getCoercedBooleanField(6, "is_fan_club_gifting_eligible");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo
                public boolean isFanClubReferralEligible() {
                    return getCoercedBooleanField(7, "is_fan_club_referral_eligible");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo
                public String getFanClubId() {
                    return A09("fan_club_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo
                public String getFanClubName() {
                    return A0A("fan_club_name");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo
                public CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo.FanConsiderationPageRevampEligiblity getFanConsiderationPageRevampEligiblity() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo.FanConsiderationPageRevampEligiblity) getOptionalTreeField(4, "fan_consideration_page_revamp_eligiblity", FanConsiderationPageRevampEligiblity.class, FanConsiderationPageRevampEligiblity.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo
                public int getSubscriberCount() {
                    return getCoercedIntField(8, "subscriber_count");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo
                public boolean hasAutosaveToExclusiveHighlight() {
                    return hasFieldValue("autosave_to_exclusive_highlight");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo
                public boolean hasConnectedMemberCount() {
                    return hasFieldValue("connected_member_count");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo
                public boolean hasHasEnoughSubscribersForSsc() {
                    return hasFieldValue("has_enough_subscribers_for_ssc");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo
                public boolean hasIsFanClubGiftingEligible() {
                    return hasFieldValue("is_fan_club_gifting_eligible");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo
                public boolean hasIsFanClubReferralEligible() {
                    return hasFieldValue("is_fan_club_referral_eligible");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo
                public boolean hasSubscriberCount() {
                    return hasFieldValue("subscriber_count");
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    C95124Py c95124Py = C95124Py.A00;
                    C4OW c4ow = new C4OW(c95124Py, "autosave_to_exclusive_highlight");
                    C94894Ou c94894Ou = C94894Ou.A00;
                    C4OW c4ow2 = new C4OW(c94894Ou, "connected_member_count");
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return new C4OU(new C4OM[]{c4ow, c4ow2, new C4OW(c94754Oe, "fan_club_id"), new C4OW(c94754Oe, "fan_club_name"), new C4OK(FanConsiderationPageRevampEligiblity.class, "fan_consideration_page_revamp_eligiblity", FanConsiderationPageRevampEligiblity.TYPE_TAG), new C4OW(c95124Py, "has_enough_subscribers_for_ssc"), new C4OW(c95124Py, "is_fan_club_gifting_eligible"), new C4OW(c95124Py, "is_fan_club_referral_eligible"), new C4OW(c94894Ou, "subscriber_count")});
                }

                public FanClubInfo(int i) {
                    super(i);
                }

                public FanClubInfo() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes10.dex */
            public final class FriendshipStatus extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FriendshipStatus {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 719449629;

                /* loaded from: classes10.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return FriendshipStatus.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FriendshipStatus
                public boolean getFollowing() {
                    return getCoercedBooleanField(0, "following");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FriendshipStatus
                public boolean getOutgoingRequest() {
                    return getCoercedBooleanField(4, "outgoing_request");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FriendshipStatus
                public boolean isBestie() {
                    return getCoercedBooleanField(1, "is_bestie");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FriendshipStatus
                public boolean isFeedFavorite() {
                    return getCoercedBooleanField(2, "is_feed_favorite");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FriendshipStatus
                public boolean isRestricted() {
                    return getCoercedBooleanField(3, "is_restricted");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FriendshipStatus
                public boolean hasFollowing() {
                    return hasFieldValue("following");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FriendshipStatus
                public boolean hasIsBestie() {
                    return hasFieldValue("is_bestie");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FriendshipStatus
                public boolean hasIsFeedFavorite() {
                    return hasFieldValue("is_feed_favorite");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FriendshipStatus
                public boolean hasIsRestricted() {
                    return hasFieldValue("is_restricted");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FriendshipStatus
                public boolean hasOutgoingRequest() {
                    return hasFieldValue("outgoing_request");
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    C95124Py c95124Py = C95124Py.A00;
                    return AbstractC58319PtB.A0U(AbstractC58321PtD.A0W(c95124Py), AbstractC58322PtE.A0W(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_feed_favorite"), AbstractC166987dD.A0i(c95124Py, "is_restricted"), AbstractC166987dD.A0i(c95124Py, "outgoing_request"));
                }

                public FriendshipStatus(int i) {
                    super(i);
                }

                public FriendshipStatus() {
                    super(TYPE_TAG);
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public int getAllMediaCount() {
                return getCoercedIntField(0, "all_media_count");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean getCanBoostPost() {
                return getCoercedBooleanField(2, "can_boost_post");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean getCanSeeOrganicInsights() {
                return getCoercedBooleanField(3, "can_see_organic_insights");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean getFeedPostReshareDisabled() {
                return getCoercedBooleanField(6, "feed_post_reshare_disabled");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public EnumC61201Rh1 getAllowedCommenterType() {
                return (EnumC61201Rh1) getOptionalEnumField(1, "allowed_commenter_type", EnumC61201Rh1.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo getFanClubInfo() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo) getOptionalTreeField(4, "fan_club_info", FanClubInfo.class, FanClubInfo.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public String getFbidV2() {
                return A0C("fbid_v2");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FriendshipStatus getFriendshipStatus() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FriendshipStatus) getOptionalTreeField(7, "friendship_status", FriendshipStatus.class, FriendshipStatus.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public String getFullName() {
                return A0D("full_name");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean getHasAnonymousProfilePicture() {
                return getCoercedBooleanField(9, "has_anonymous_profile_picture");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean getHasOnboardedToTextPostApp() {
                return getCoercedBooleanField(10, "has_onboarded_to_text_post_app");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public String getId() {
                return getOptionalStringField(11, "strong_id__");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public String getInteropMessagingUserFbid() {
                return getOptionalStringField(12, "interop_messaging_user_fbid");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public long getLatestReelMedia() {
                return getCoercedTimeField(17, "latest_reel_media");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public int getLikedClipsCount() {
                return getCoercedIntField(18, "liked_clips_count");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public String getPk() {
                return getOptionalStringField(19, "pk");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public String getPkId() {
                return getOptionalStringField(20, "pk_id");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public String getProfilePicId() {
                return getOptionalStringField(21, "profile_pic_id");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public String getProfilePicUrl() {
                return getOptionalStringField(22, "profile_pic_url");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public EnumC61202Rh2 getReelAutoArchive() {
                return (EnumC61202Rh2) getOptionalEnumField(23, "reel_auto_archive", EnumC61202Rh2.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean getShowAccountTransparencyDetails() {
                return getCoercedBooleanField(24, "show_account_transparency_details");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean getShowInsightsTerms() {
                return getCoercedBooleanField(25, "show_insights_terms");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public int getTextPostAppJoinerNumber() {
                return getCoercedIntField(26, "text_post_app_joiner_number");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public int getThirdPartyDownloadsEnabled() {
                return getCoercedIntField(27, "third_party_downloads_enabled");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean getTransparencyProductEnabled() {
                return getCoercedBooleanField(28, "transparency_product_enabled");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public String getUsername() {
                return getOptionalStringField(29, AbstractC70143W6w.A00());
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean hasAllMediaCount() {
                return hasFieldValue("all_media_count");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean hasCanBoostPost() {
                return hasFieldValue("can_boost_post");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean hasCanSeeOrganicInsights() {
                return hasFieldValue("can_see_organic_insights");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean hasFeedPostReshareDisabled() {
                return hasFieldValue("feed_post_reshare_disabled");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean hasHasAnonymousProfilePicture() {
                return hasFieldValue("has_anonymous_profile_picture");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean hasHasOnboardedToTextPostApp() {
                return hasFieldValue("has_onboarded_to_text_post_app");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean hasIsFavorite() {
                return hasFieldValue("is_favorite");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean hasIsPrivate() {
                return hasFieldValue("is_private");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean hasIsUnpublished() {
                return hasFieldValue("is_unpublished");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean hasIsVerified() {
                return hasFieldValue("is_verified");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean hasLatestReelMedia() {
                return hasFieldValue("latest_reel_media");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean hasLikedClipsCount() {
                return hasFieldValue("liked_clips_count");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean isFavorite() {
                return getCoercedBooleanField(13, "is_favorite");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean isPrivate() {
                return getCoercedBooleanField(14, "is_private");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean isUnpublished() {
                return getCoercedBooleanField(15, "is_unpublished");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean isVerified() {
                return getCoercedBooleanField(16, "is_verified");
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                C4OM[] c4omArr = new C4OM[30];
                C94894Ou c94894Ou = C94894Ou.A00;
                C4OW A0i = AbstractC166987dD.A0i(c94894Ou, "all_media_count");
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW A0i2 = AbstractC166987dD.A0i(c94754Oe, "allowed_commenter_type");
                C95124Py c95124Py = C95124Py.A00;
                return AbstractC58321PtD.A0Z(new C4OM[]{AbstractC58321PtD.A0S(c94894Ou), AbstractC166987dD.A0i(c95124Py, "transparency_product_enabled"), AbstractC166987dD.A0i(c94754Oe, AbstractC70143W6w.A00())}, c4omArr, AbstractC31175DnJ.A1b(new C4OM[]{A0i, A0i2, AbstractC166987dD.A0i(c95124Py, "can_boost_post"), AbstractC166987dD.A0i(c95124Py, "can_see_organic_insights"), AbstractC58318PtA.A0O(FanClubInfo.class, "fan_club_info", FanClubInfo.TYPE_TAG), AbstractC58321PtD.A0V(c94754Oe), AbstractC166987dD.A0i(c95124Py, "feed_post_reshare_disabled"), AbstractC58322PtE.A0M(FriendshipStatus.class, FriendshipStatus.TYPE_TAG), AbstractC58319PtB.A0E(c94754Oe), AbstractC58321PtD.A0T(c95124Py), AbstractC58322PtE.A0T(c95124Py), AbstractC166997dE.A0V(c94754Oe), AbstractC58321PtD.A0R(c94754Oe), AbstractC166987dD.A0i(c95124Py, "is_favorite"), AbstractC58319PtB.A0O(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_unpublished"), AbstractC58319PtB.A0P(c95124Py), AbstractC58322PtE.A0Q(), AbstractC166987dD.A0i(c94894Ou, "liked_clips_count"), AbstractC58319PtB.A0H(c94754Oe), AbstractC58319PtB.A0K(c94754Oe), AbstractC58319PtB.A0Q(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC166987dD.A0i(c94754Oe, "reel_auto_archive"), AbstractC166987dD.A0i(c95124Py, "show_account_transparency_details"), AbstractC166987dD.A0i(c95124Py, "show_insights_terms"), AbstractC166987dD.A0i(c94894Ou, "text_post_app_joiner_number")}, c4omArr) ? 1 : 0, 27, 3);
            }

            public User(int i) {
                super(i);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean hasShowAccountTransparencyDetails() {
                return hasFieldValue("show_account_transparency_details");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean hasShowInsightsTerms() {
                return hasFieldValue("show_insights_terms");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean hasTextPostAppJoinerNumber() {
                return hasFieldValue("text_post_app_joiner_number");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean hasThirdPartyDownloadsEnabled() {
                return hasFieldValue("third_party_downloads_enabled");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User
            public boolean hasTransparencyProductEnabled() {
                return hasFieldValue("transparency_product_enabled");
            }

            public User() {
                super(TYPE_TAG);
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public int getBitFlags() {
            return getCoercedIntField(0, "bit_flags");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public long getCreatedAt() {
            return getCoercedTimeField(2, "created_at");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public long getCreatedAtUtc() {
            return getCoercedTimeField(3, "created_at_utc");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public boolean getDidReportAsSpam() {
            return getCoercedBooleanField(4, "did_report_as_spam");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public boolean getHasTranslation() {
            return getCoercedBooleanField(5, "has_translation");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public boolean isCovered() {
            return getCoercedBooleanField(6, "is_covered");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public boolean isRankedComment() {
            return getCoercedBooleanField(7, "is_ranked_comment");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public String getContentType() {
            return A08(TraceFieldType.ContentType);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public String getMediaId() {
            return A0D("media_id");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public String getPk() {
            return AbstractC65702TsY.A0a(this, "strong_id__", 9);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public int getPrivateReplyStatus() {
            return getCoercedIntField(10, "private_reply_status");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public boolean getShareEnabled() {
            return getCoercedBooleanField(11, "share_enabled");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public String getStatus() {
            return getOptionalStringField(12, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public String getText() {
            return getOptionalStringField(13, "text");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public int getType() {
            return getCoercedIntField(14, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User getUser() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User) getOptionalTreeField(15, PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.class, User.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public String getUserId() {
            return getOptionalStringField(16, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public boolean hasBitFlags() {
            return hasFieldValue("bit_flags");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public boolean hasCreatedAt() {
            return hasFieldValue("created_at");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public boolean hasCreatedAtUtc() {
            return hasFieldValue("created_at_utc");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public boolean hasDidReportAsSpam() {
            return hasFieldValue("did_report_as_spam");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public boolean hasHasTranslation() {
            return hasFieldValue("has_translation");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public boolean hasIsCovered() {
            return hasFieldValue("is_covered");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public boolean hasIsRankedComment() {
            return hasFieldValue("is_ranked_comment");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public boolean hasPrivateReplyStatus() {
            return hasFieldValue("private_reply_status");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public boolean hasShareEnabled() {
            return hasFieldValue("share_enabled");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Caption
        public boolean hasType() {
            return hasFieldValue(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C94894Ou c94894Ou = C94894Ou.A00;
            C4OW c4ow = new C4OW(c94894Ou, "bit_flags");
            C94754Oe c94754Oe = C94754Oe.A00;
            C4OW c4ow2 = new C4OW(c94754Oe, TraceFieldType.ContentType);
            C67A c67a = C67A.A00;
            C4OW c4ow3 = new C4OW(c67a, "created_at");
            C4OW c4ow4 = new C4OW(c67a, "created_at_utc");
            C95124Py c95124Py = C95124Py.A00;
            return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, c4ow4, new C4OW(c95124Py, "did_report_as_spam"), new C4OW(c95124Py, "has_translation"), new C4OW(c95124Py, "is_covered"), new C4OW(c95124Py, "is_ranked_comment"), new C4OW(c94754Oe, "media_id"), AbstractC58320PtC.A0Q(c94754Oe), new C4OW(c94894Ou, "private_reply_status"), new C4OW(c95124Py, "share_enabled"), new C4OW(c94754Oe, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS), AbstractC58319PtB.A0C(c94754Oe), AbstractC58319PtB.A0J(c94894Ou), new C4OK(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.TYPE_TAG), new C4OW(c94754Oe, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID)});
        }

        public Caption(int i) {
            super(i);
        }

        public Caption() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class ClipsAttributionInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -736244262;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return ClipsAttributionInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class PivotPageHeader extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 1893051914;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return PivotPageHeader.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class Profile extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader.Profile {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 692143738;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return Profile.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader.Profile
                public String getProfilePicId() {
                    return getOptionalStringField(6, "profile_pic_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader.Profile
                public String getProfilePicUrl() {
                    return getOptionalStringField(7, "profile_pic_url");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader.Profile
                public boolean isPrivate() {
                    return getCoercedBooleanField(2, "is_private");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader.Profile
                public boolean isVerified() {
                    return getCoercedBooleanField(3, "is_verified");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader.Profile
                public String getFullName() {
                    return A07("full_name");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader.Profile
                public String getId() {
                    return A08("strong_id__");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader.Profile
                public String getPk() {
                    return A0B("pk");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader.Profile
                public String getPkId() {
                    return A0C("pk_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader.Profile
                public boolean hasIsPrivate() {
                    return hasFieldValue("is_private");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader.Profile
                public boolean hasIsVerified() {
                    return hasFieldValue("is_verified");
                }

                public Profile(int i) {
                    super(i);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader.Profile
                public String getUsername() {
                    return A0D(AbstractC70143W6w.A00());
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC65703TsZ.A0n();
                }

                public Profile() {
                    super(TYPE_TAG);
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader
            public String getContentUrl() {
                return A07("content_url");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader
            public String getDeveloperAppLogoUrl() {
                return A08(AbstractC58317Pt9.A00(10));
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader
            public String getMediaCount() {
                return A09("media_count");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader
            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader.Profile getProfile() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader.Profile) getOptionalTreeField(3, "profile", Profile.class, Profile.TYPE_TAG);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC167007dF.A0Q(new C4OW(c94754Oe, "content_url"), new C4OW(c94754Oe, AbstractC58317Pt9.A00(10)), new C4OW(c94754Oe, "media_count"), new C4OK(Profile.class, "profile", Profile.TYPE_TAG));
            }

            public PivotPageHeader(int i) {
                super(i);
            }

            public PivotPageHeader() {
                super(TYPE_TAG);
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo
        public String getAttributionAppId() {
            return AbstractC65702TsY.A0a(this, "attribution_app_id", 0);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo
        public String getAttributionAppName() {
            return AbstractC65702TsY.A0a(this, "attribution_app_name", 1);
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo
        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader getPivotPageHeader() {
            C2JS requiredTreeField = getRequiredTreeField(2, "pivot_page_header", PivotPageHeader.class, PivotPageHeader.TYPE_TAG);
            C14360o3.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ClipsAttributionInfo.PivotPageHeader");
            return (PivotPageHeader) requiredTreeField;
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC58319PtB.A0T(new C4OW(new C94774Oi(c94754Oe), "attribution_app_id"), new C4OW(new C94774Oi(c94754Oe), "attribution_app_name"), new C4OK(C4OO.A01(), PivotPageHeader.class, "pivot_page_header", PivotPageHeader.TYPE_TAG));
        }

        public ClipsAttributionInfo(int i) {
            super(i);
        }

        public ClipsAttributionInfo() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class ClipsMetadata extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1399434244;

        /* loaded from: classes11.dex */
        public final class AchievementsInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AchievementsInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -379737106;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return AchievementsInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AchievementsInfo
            public int getNumEarnedAchievements() {
                return getCoercedIntField(0, "num_earned_achievements");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AchievementsInfo
            public boolean getShowAchievements() {
                return getCoercedBooleanField(1, "show_achievements");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AchievementsInfo
            public boolean hasNumEarnedAchievements() {
                return hasFieldValue("num_earned_achievements");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AchievementsInfo
            public boolean hasShowAchievements() {
                return hasFieldValue("show_achievements");
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Y(C95124Py.A00, new C4OW(C94894Ou.A00, "num_earned_achievements"), "show_achievements");
            }

            public AchievementsInfo(int i) {
                super(i);
            }

            public AchievementsInfo() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class AdditionalAudioInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AdditionalAudioInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -795159955;

            /* loaded from: classes11.dex */
            public final class AudioReattributionInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AdditionalAudioInfo.AudioReattributionInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -135472697;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return AudioReattributionInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AdditionalAudioInfo.AudioReattributionInfo
                public boolean getShouldAllowRestore() {
                    return getRequiredBooleanField(0, "should_allow_restore");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AdditionalAudioInfo.AudioReattributionInfo
                public boolean hasShouldAllowRestore() {
                    return true;
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public AudioReattributionInfo(int i) {
                    super(i);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0Z(AbstractC58319PtB.A0S(), "should_allow_restore");
                }

                public AudioReattributionInfo() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return AdditionalAudioInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AdditionalAudioInfo
            public String getAdditionalAudioUsername() {
                return A07("additional_audio_username");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AdditionalAudioInfo
            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AdditionalAudioInfo.AudioReattributionInfo getAudioReattributionInfo() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AdditionalAudioInfo.AudioReattributionInfo) A02(AudioReattributionInfo.class, "audio_reattribution_info", AudioReattributionInfo.TYPE_TAG);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0W(new C4OW(C94754Oe.A00, "additional_audio_username"), AudioReattributionInfo.class, "audio_reattribution_info", AudioReattributionInfo.TYPE_TAG);
            }

            public AdditionalAudioInfo(int i) {
                super(i);
            }

            public AdditionalAudioInfo() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class AssetRecommendationInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AssetRecommendationInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 846516070;

            /* loaded from: classes11.dex */
            public final class AssetRecommendations extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AssetRecommendationInfo.AssetRecommendations {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 1199335979;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return AssetRecommendations.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AssetRecommendationInfo.AssetRecommendations
                public String getAssetId() {
                    return AbstractC65702TsY.A0a(this, "asset_id", 0);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AssetRecommendationInfo.AssetRecommendations
                public String getAssetName() {
                    return AbstractC65702TsY.A0a(this, "asset_name", 1);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AssetRecommendationInfo.AssetRecommendations
                public VF5 getAssetType() {
                    Enum requiredEnumField = getRequiredEnumField(2, "asset_type", VF5.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    C14360o3.A07(requiredEnumField);
                    return (VF5) requiredEnumField;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AssetRecommendationInfo.AssetRecommendations
                public String getCoverArtworkThumbnailUri() {
                    return A0A("cover_artwork_thumbnail_uri");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AssetRecommendationInfo.AssetRecommendations
                public String getExtra() {
                    return A0B("extra");
                }

                public AssetRecommendations(int i) {
                    super(i);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC65703TsZ.A0l();
                }

                public AssetRecommendations() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return AssetRecommendationInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AssetRecommendationInfo
            public ImmutableList getAssetRecommendations() {
                return A06(AssetRecommendations.class, "asset_recommendations", AssetRecommendations.TYPE_TAG);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC167017dG.A0W(C4OO.A02(), AssetRecommendations.class, "asset_recommendations", AssetRecommendations.TYPE_TAG);
            }

            public AssetRecommendationInfo(int i) {
                super(i);
            }

            public AssetRecommendationInfo() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class AudioRankingInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AudioRankingInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 166580598;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return AudioRankingInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AudioRankingInfo
            public String getBestAudioClusterId() {
                return A07("best_audio_cluster_id");
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Z(C94754Oe.A00, "best_audio_cluster_id");
            }

            public AudioRankingInfo(int i) {
                super(i);
            }

            public AudioRankingInfo() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class BrandedContentTagInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.BrandedContentTagInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 328029074;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return BrandedContentTagInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.BrandedContentTagInfo
            public boolean getCanAddTag() {
                return getRequiredBooleanField(0, "can_add_tag");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.BrandedContentTagInfo
            public boolean hasCanAddTag() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public BrandedContentTagInfo(int i) {
                super(i);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Z(AbstractC58319PtB.A0S(), "can_add_tag");
            }

            public BrandedContentTagInfo() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return ClipsMetadata.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class ContentAppreciationInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 256258402;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return ContentAppreciationInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class EntryPointContainer extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 14967407;

                /* loaded from: classes11.dex */
                public final class Comment extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer.Comment {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -517283309;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return Comment.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer.Comment
                    public EnumC39607HeH getActionType() {
                        Enum requiredEnumField = getRequiredEnumField(0, "action_type", EnumC39607HeH.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                        C14360o3.A07(requiredEnumField);
                        return (EnumC39607HeH) requiredEnumField;
                    }

                    public Comment(int i) {
                        super(i);
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0Z(AbstractC58318PtA.A0Q(), "action_type");
                    }

                    public Comment() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return EntryPointContainer.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                /* loaded from: classes11.dex */
                public final class Pill extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer.Pill {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -203081011;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return Pill.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer.Pill
                    public int getPriority() {
                        return getRequiredIntField(1, "priority");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer.Pill
                    public boolean hasPriority() {
                        return true;
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer.Pill
                    public EnumC39607HeH getActionType() {
                        Enum requiredEnumField = getRequiredEnumField(0, "action_type", EnumC39607HeH.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                        C14360o3.A07(requiredEnumField);
                        return (EnumC39607HeH) requiredEnumField;
                    }

                    public Pill(int i) {
                        super(i);
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0Y(AbstractC58319PtB.A0R(), new C4OW(AbstractC58318PtA.A0Q(), "action_type"), "priority");
                    }

                    public Pill() {
                        super(TYPE_TAG);
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer
                public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer.Comment getComment() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer.Comment) A03(Comment.class, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, Comment.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer
                public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer.Pill getPill() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer.Pill) A02(Pill.class, "pill", Pill.TYPE_TAG);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC58320PtC.A0W(new C4OK(Comment.class, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, Comment.TYPE_TAG), Pill.class, "pill", Pill.TYPE_TAG);
                }

                public EntryPointContainer(int i) {
                    super(i);
                }

                public EntryPointContainer() {
                    super(TYPE_TAG);
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo
            public boolean getEnabled() {
                return getRequiredBooleanField(0, "enabled");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo
            public boolean hasEnabled() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo
            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer getEntryPointContainer() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer) A02(EntryPointContainer.class, AbstractC58317Pt9.A00(265), EntryPointContainer.TYPE_TAG);
            }

            public ContentAppreciationInfo(int i) {
                super(i);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0W(new C4OW(AbstractC58319PtB.A0S(), "enabled"), EntryPointContainer.class, AbstractC58317Pt9.A00(265), EntryPointContainer.TYPE_TAG);
            }

            public ContentAppreciationInfo() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class ContextualHighlightInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContextualHighlightInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -1643218500;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return ContextualHighlightInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContextualHighlightInfo
            public String getContextualHighlightId() {
                return AbstractC65702TsY.A0a(this, "contextual_highlight_id", 1);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContextualHighlightInfo
            public String getContextualHighlightTitle() {
                return AbstractC65702TsY.A0a(this, "contextual_highlight_title", 2);
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContextualHighlightInfo
            public String getChainingMediaId() {
                return A0B("chaining_media_id");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContextualHighlightInfo
            public VF8 getContextualHighlightDestinationType() {
                return (VF8) getOptionalEnumField(0, "contextual_highlight_destination_type", VF8.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContextualHighlightInfo
            public EnumC39602HeC getContextualHighlightType() {
                Enum requiredEnumField = getRequiredEnumField(3, "contextual_highlight_type", EnumC39602HeC.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                C14360o3.A07(requiredEnumField);
                return (EnumC39602HeC) requiredEnumField;
            }

            public ContextualHighlightInfo(int i) {
                super(i);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC65703TsZ.A0k();
            }

            public ContextualHighlightInfo() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class MashupInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 624224444;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return MashupInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class OriginalMedia extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 510906542;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return OriginalMedia.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                /* loaded from: classes10.dex */
                public final class User extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 138223931;

                    /* loaded from: classes10.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return User.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public int getAllMediaCount() {
                        return getCoercedIntField(0, "all_media_count");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public boolean getHasAnonymousProfilePicture() {
                        return getCoercedBooleanField(4, "has_anonymous_profile_picture");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public boolean getHasOnboardedToTextPostApp() {
                        return getCoercedBooleanField(5, "has_onboarded_to_text_post_app");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public String getId() {
                        return getOptionalStringField(6, "strong_id__");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public String getInteropMessagingUserFbid() {
                        return getOptionalStringField(7, "interop_messaging_user_fbid");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public EnumC61201Rh1 getAllowedCommenterType() {
                        return (EnumC61201Rh1) getOptionalEnumField(1, "allowed_commenter_type", EnumC61201Rh1.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public String getFbidV2() {
                        return A09("fbid_v2");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public String getFullName() {
                        return A0A("full_name");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public int getLikedClipsCount() {
                        return getCoercedIntField(10, "liked_clips_count");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public String getPk() {
                        return getOptionalStringField(11, "pk");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public String getPkId() {
                        return getOptionalStringField(12, "pk_id");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public String getProfilePicId() {
                        return getOptionalStringField(13, "profile_pic_id");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public String getProfilePicUrl() {
                        return getOptionalStringField(14, "profile_pic_url");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public EnumC61202Rh2 getReelAutoArchive() {
                        return (EnumC61202Rh2) getOptionalEnumField(15, "reel_auto_archive", EnumC61202Rh2.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public int getTextPostAppJoinerNumber() {
                        return getCoercedIntField(16, "text_post_app_joiner_number");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public int getThirdPartyDownloadsEnabled() {
                        return getCoercedIntField(17, "third_party_downloads_enabled");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public String getUsername() {
                        return getOptionalStringField(18, AbstractC70143W6w.A00());
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public boolean hasAllMediaCount() {
                        return hasFieldValue("all_media_count");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public boolean hasHasAnonymousProfilePicture() {
                        return hasFieldValue("has_anonymous_profile_picture");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public boolean hasHasOnboardedToTextPostApp() {
                        return hasFieldValue("has_onboarded_to_text_post_app");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public boolean hasIsPrivate() {
                        return hasFieldValue("is_private");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public boolean hasIsVerified() {
                        return hasFieldValue("is_verified");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public boolean hasLikedClipsCount() {
                        return hasFieldValue("liked_clips_count");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public boolean isPrivate() {
                        return getCoercedBooleanField(8, "is_private");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public boolean isVerified() {
                        return getCoercedBooleanField(9, "is_verified");
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        C94894Ou c94894Ou = C94894Ou.A00;
                        C4OW A0i = AbstractC166987dD.A0i(c94894Ou, "all_media_count");
                        C94754Oe c94754Oe = C94754Oe.A00;
                        C4OW A0i2 = AbstractC166987dD.A0i(c94754Oe, "allowed_commenter_type");
                        C4OW A0V = AbstractC58321PtD.A0V(c94754Oe);
                        C4OW A0E = AbstractC58319PtB.A0E(c94754Oe);
                        C95124Py c95124Py = C95124Py.A00;
                        return AbstractC166987dD.A0k(new C4OM[]{A0i, A0i2, A0V, A0E, AbstractC58321PtD.A0T(c95124Py), AbstractC58322PtE.A0T(c95124Py), AbstractC166997dE.A0V(c94754Oe), AbstractC58321PtD.A0R(c94754Oe), AbstractC58319PtB.A0O(c95124Py), AbstractC58319PtB.A0P(c95124Py), AbstractC166987dD.A0i(c94894Ou, "liked_clips_count"), AbstractC58319PtB.A0H(c94754Oe), AbstractC58319PtB.A0K(c94754Oe), AbstractC58319PtB.A0Q(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC166987dD.A0i(c94754Oe, "reel_auto_archive"), AbstractC166987dD.A0i(c94894Ou, "text_post_app_joiner_number"), AbstractC58321PtD.A0S(c94894Ou), AbstractC166987dD.A0i(c94754Oe, AbstractC70143W6w.A00())});
                    }

                    public User(int i) {
                        super(i);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public boolean hasTextPostAppJoinerNumber() {
                        return hasFieldValue("text_post_app_joiner_number");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User
                    public boolean hasThirdPartyDownloadsEnabled() {
                        return hasFieldValue("third_party_downloads_enabled");
                    }

                    public User() {
                        super(TYPE_TAG);
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia
                public boolean getMashupsAllowed() {
                    return getCoercedBooleanField(2, "mashups_allowed");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia
                public int getNonPrivacyFilteredMashupsMediaCount() {
                    return getCoercedIntField(4, "non_privacy_filtered_mashups_media_count");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia
                public String getPk() {
                    return AbstractC65702TsY.A0a(this, "pk", 5);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia
                public String getProductType() {
                    return getOptionalStringField(6, "product_type");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia
                public ImmutableList getSidecarChildMediaIds() {
                    return getCoercedCompactedTimeListField(7, "sidecar_child_media_ids");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia
                public boolean hasIsPivotPageAvailable() {
                    return true;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia
                public boolean isLightWeightCheck() {
                    return getCoercedBooleanField(0, "is_light_weight_check");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia
                public boolean isPivotPageAvailable() {
                    return getRequiredBooleanField(1, "is_pivot_page_available");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia
                public String getMediaType() {
                    return A0A("media_type");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia
                public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User getUser() {
                    C2JS requiredTreeField = getRequiredTreeField(8, PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.class, User.TYPE_TAG);
                    C14360o3.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ClipsMetadata.MashupInfo.OriginalMedia.User");
                    return (User) requiredTreeField;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia
                public boolean hasIsLightWeightCheck() {
                    return hasFieldValue("is_light_weight_check");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia
                public boolean hasMashupsAllowed() {
                    return hasFieldValue("mashups_allowed");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia
                public boolean hasNonPrivacyFilteredMashupsMediaCount() {
                    return hasFieldValue("non_privacy_filtered_mashups_media_count");
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    C95124Py c95124Py = C95124Py.A00;
                    C4OW c4ow = new C4OW(c95124Py, "is_light_weight_check");
                    C4OW A0U = AbstractC65703TsZ.A0U(c95124Py);
                    C4OW c4ow2 = new C4OW(c95124Py, "mashups_allowed");
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return new C4OU(new C4OM[]{c4ow, A0U, c4ow2, new C4OW(c94754Oe, "media_type"), new C4OW(C94894Ou.A00, "non_privacy_filtered_mashups_media_count"), AbstractC58320PtC.A0Q(c94754Oe), new C4OW(c94754Oe, "product_type"), new C4OW(new C94784Oj(new C94774Oi(C67A.A00)), "sidecar_child_media_ids"), new C4OK(C4OO.A01(), User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.TYPE_TAG)});
                }

                public OriginalMedia(int i) {
                    super(i);
                }

                public OriginalMedia() {
                    super(TYPE_TAG);
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public boolean getCanToggleMashupsAllowed() {
                return getRequiredBooleanField(0, "can_toggle_mashups_allowed");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public boolean getHasBeenMashedUp() {
                return getRequiredBooleanField(1, "has_been_mashed_up");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public boolean getHasNonmimicableAdditionalAudio() {
                return getCoercedBooleanField(2, "has_nonmimicable_additional_audio");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public String getMashupType() {
                return getOptionalStringField(6, "mashup_type");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public boolean getMashupsAllowed() {
                return getRequiredBooleanField(7, "mashups_allowed");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public boolean hasCanToggleMashupsAllowed() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public boolean hasHasBeenMashedUp() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public boolean hasIsCreatorRequestingMashup() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public boolean hasIsPivotPageAvailable() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public boolean hasMashupsAllowed() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public boolean isCreatorRequestingMashup() {
                return getRequiredBooleanField(3, "is_creator_requesting_mashup");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public boolean isLightWeightCheck() {
                return getCoercedBooleanField(4, "is_light_weight_check");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public boolean isPivotPageAvailable() {
                return getRequiredBooleanField(5, "is_pivot_page_available");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public int getNonPrivacyFilteredMashupsMediaCount() {
                return getCoercedIntField(8, "non_privacy_filtered_mashups_media_count");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia getOriginalMedia() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia) getOptionalTreeField(9, "original_media", OriginalMedia.class, OriginalMedia.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public boolean hasHasNonmimicableAdditionalAudio() {
                return hasFieldValue("has_nonmimicable_additional_audio");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public boolean hasIsLightWeightCheck() {
                return hasFieldValue("is_light_weight_check");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo
            public boolean hasNonPrivacyFilteredMashupsMediaCount() {
                return hasFieldValue("non_privacy_filtered_mashups_media_count");
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                C95124Py c95124Py = C95124Py.A00;
                return new C4OU(new C4OM[]{new C4OW(new C94774Oi(c95124Py), "can_toggle_mashups_allowed"), new C4OW(new C94774Oi(c95124Py), "has_been_mashed_up"), new C4OW(c95124Py, "has_nonmimicable_additional_audio"), new C4OW(new C94774Oi(c95124Py), "is_creator_requesting_mashup"), new C4OW(c95124Py, "is_light_weight_check"), AbstractC65703TsZ.A0U(c95124Py), new C4OW(C94754Oe.A00, "mashup_type"), new C4OW(new C94774Oi(c95124Py), "mashups_allowed"), new C4OW(C94894Ou.A00, "non_privacy_filtered_mashups_media_count"), new C4OK(OriginalMedia.class, "original_media", OriginalMedia.TYPE_TAG)});
            }

            public MashupInfo(int i) {
                super(i);
            }

            public MashupInfo() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class MerchandisingPillInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MerchandisingPillInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -206373002;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return MerchandisingPillInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MerchandisingPillInfo
            public int getLoopTime() {
                return getRequiredIntField(0, "loop_time");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MerchandisingPillInfo
            public boolean hasLoopTime() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public MerchandisingPillInfo(int i) {
                super(i);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Z(AbstractC58319PtB.A0R(), "loop_time");
            }

            public MerchandisingPillInfo() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class MusicInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -2011387909;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return MusicInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class MusicAssetInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -905756826;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return MusicAssetInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public boolean getAllowsSaving() {
                    return getRequiredBooleanField(0, "allows_saving");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public String getCoverArtworkUri() {
                    return AbstractC65702TsY.A0a(this, "cover_artwork_uri", 5);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public String getDashManifest() {
                    return getOptionalStringField(6, "dash_manifest");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public String getDisplayArtist() {
                    return getOptionalStringField(7, "display_artist");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public boolean hasAllowsSaving() {
                    return true;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public boolean hasIsExplicit() {
                    return true;
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public String getArtistId() {
                    return A08("artist_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public String getAudioAssetId() {
                    return A09("audio_asset_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public String getAudioClusterId() {
                    return A0A("audio_cluster_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public String getCoverArtworkThumbnailUri() {
                    return A0B("cover_artwork_thumbnail_uri");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public int getDurationInMs() {
                    return getCoercedIntField(8, "duration_in_ms");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public String getFastStartProgressiveDownloadUrl() {
                    return getOptionalStringField(9, "fast_start_progressive_download_url");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public boolean getHasLyrics() {
                    return getCoercedBooleanField(10, "has_lyrics");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public String getId() {
                    return AbstractC65702TsY.A0a(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 11);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public String getIgUsername() {
                    return getOptionalStringField(12, "ig_username");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public String getProgressiveDownloadUrl() {
                    return getOptionalStringField(14, "progressive_download_url");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public String getSubtitle() {
                    return getOptionalStringField(15, "subtitle");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public String getTitle() {
                    return getOptionalStringField(16, DialogModule.KEY_TITLE);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public String getWeb30sPreviewDownloadUrl() {
                    return getOptionalStringField(17, "web_30s_preview_download_url");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public boolean hasDurationInMs() {
                    return hasFieldValue("duration_in_ms");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public boolean hasHasLyrics() {
                    return hasFieldValue("has_lyrics");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo
                public boolean isExplicit() {
                    return getRequiredBooleanField(13, "is_explicit");
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    C95124Py c95124Py = C95124Py.A00;
                    C4OW A0V = AbstractC65703TsZ.A0V(c95124Py);
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return new C4OU(new C4OM[]{A0V, new C4OW(c94754Oe, "artist_id"), new C4OW(c94754Oe, "audio_asset_id"), new C4OW(c94754Oe, "audio_cluster_id"), new C4OW(c94754Oe, "cover_artwork_thumbnail_uri"), AbstractC65703TsZ.A0W(c94754Oe), new C4OW(c94754Oe, "dash_manifest"), new C4OW(c94754Oe, "display_artist"), new C4OW(C94894Ou.A00, "duration_in_ms"), new C4OW(c94754Oe, "fast_start_progressive_download_url"), new C4OW(c95124Py, "has_lyrics"), AbstractC58320PtC.A0P(c94754Oe), new C4OW(c94754Oe, "ig_username"), AbstractC65703TsZ.A0G(c95124Py), new C4OW(c94754Oe, "progressive_download_url"), new C4OW(c94754Oe, "subtitle"), AbstractC58319PtB.A0L(c94754Oe), new C4OW(c94754Oe, "web_30s_preview_download_url")});
                }

                public MusicAssetInfo(int i) {
                    super(i);
                }

                public MusicAssetInfo() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class MusicConsumptionInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1837756642;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return MusicConsumptionInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                /* loaded from: classes11.dex */
                public final class IgArtist extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -934720494;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return IgArtist.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist
                    public boolean getHasOnboardedToTextPostApp() {
                        return getCoercedBooleanField(1, "has_onboarded_to_text_post_app");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist
                    public String getPkId() {
                        return getOptionalStringField(6, "pk_id");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist
                    public String getProfilePicId() {
                        return getOptionalStringField(7, "profile_pic_id");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist
                    public boolean isPrivate() {
                        return getCoercedBooleanField(3, "is_private");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist
                    public boolean isVerified() {
                        return getCoercedBooleanField(4, "is_verified");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist
                    public String getFullName() {
                        return A07("full_name");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist
                    public String getId() {
                        return A09("strong_id__");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist
                    public String getPk() {
                        return A0C("pk");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist
                    public String getProfilePicUrl() {
                        return A0D("profile_pic_url");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist
                    public String getUsername() {
                        return getOptionalStringField(9, AbstractC70143W6w.A00());
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist
                    public boolean hasHasOnboardedToTextPostApp() {
                        return hasFieldValue("has_onboarded_to_text_post_app");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist
                    public boolean hasIsPrivate() {
                        return hasFieldValue("is_private");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist
                    public boolean hasIsVerified() {
                        return hasFieldValue("is_verified");
                    }

                    public IgArtist(int i) {
                        super(i);
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC65704Tsa.A04();
                    }

                    public IgArtist() {
                        super(TYPE_TAG);
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public boolean getAllowMediaCreationWithMusic() {
                    return getCoercedBooleanField(0, "allow_media_creation_with_music");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public int getAudioAssetStartTimeInMs() {
                    return getCoercedIntField(1, "audio_asset_start_time_in_ms");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public int getOverlapDurationInMs() {
                    return getCoercedIntField(6, "overlap_duration_in_ms");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public String getPlaceholderProfilePicUrl() {
                    return AbstractC65702TsY.A0a(this, "placeholder_profile_pic_url", 7);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public boolean hasShouldMuteAudio() {
                    return true;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public boolean isBookmarked() {
                    return getCoercedBooleanField(4, "is_bookmarked");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public boolean isTrendingInClips() {
                    return getCoercedBooleanField(5, "is_trending_in_clips");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public String getDerivedContentId() {
                    return A09("derived_content_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist getIgArtist() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist) getOptionalTreeField(3, "ig_artist", IgArtist.class, IgArtist.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public boolean getShouldAllowMusicEditing() {
                    return getCoercedBooleanField(8, "should_allow_music_editing");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public boolean getShouldMuteAudio() {
                    return getRequiredBooleanField(9, "should_mute_audio");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public String getShouldMuteAudioReason() {
                    return AbstractC65702TsY.A0a(this, "should_mute_audio_reason", 10);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public EnumC39605HeF getShouldMuteAudioReasonType() {
                    return (EnumC39605HeF) getOptionalEnumField(11, "should_mute_audio_reason_type", EnumC39605HeF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public int getTrendRank() {
                    return getCoercedIntField(12, "trend_rank");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public boolean hasAllowMediaCreationWithMusic() {
                    return hasFieldValue("allow_media_creation_with_music");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public boolean hasAudioAssetStartTimeInMs() {
                    return hasFieldValue("audio_asset_start_time_in_ms");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public boolean hasIsBookmarked() {
                    return hasFieldValue("is_bookmarked");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public boolean hasIsTrendingInClips() {
                    return hasFieldValue("is_trending_in_clips");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public boolean hasOverlapDurationInMs() {
                    return hasFieldValue("overlap_duration_in_ms");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public boolean hasShouldAllowMusicEditing() {
                    return hasFieldValue("should_allow_music_editing");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo
                public boolean hasTrendRank() {
                    return hasFieldValue("trend_rank");
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    C95124Py c95124Py = C95124Py.A00;
                    C4OW c4ow = new C4OW(c95124Py, "allow_media_creation_with_music");
                    C94894Ou c94894Ou = C94894Ou.A00;
                    C4OW c4ow2 = new C4OW(c94894Ou, "audio_asset_start_time_in_ms");
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return new C4OU(new C4OM[]{c4ow, c4ow2, new C4OW(c94754Oe, "derived_content_id"), new C4OK(IgArtist.class, "ig_artist", IgArtist.TYPE_TAG), new C4OW(c95124Py, "is_bookmarked"), new C4OW(c95124Py, "is_trending_in_clips"), new C4OW(c94894Ou, "overlap_duration_in_ms"), AbstractC65703TsZ.A0J(c94754Oe), new C4OW(c95124Py, "should_allow_music_editing"), AbstractC65703TsZ.A0c(c95124Py), AbstractC65703TsZ.A0b(c94754Oe), new C4OW(c94754Oe, "should_mute_audio_reason_type"), new C4OW(c94894Ou, "trend_rank")});
                }

                public MusicConsumptionInfo(int i) {
                    super(i);
                }

                public MusicConsumptionInfo() {
                    super(TYPE_TAG);
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo
            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo getMusicAssetInfo() {
                C2JS A05 = A05(MusicAssetInfo.class, "music_asset_info", MusicAssetInfo.TYPE_TAG);
                C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ClipsMetadata.MusicInfo.MusicAssetInfo");
                return (MusicAssetInfo) A05;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo
            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo getMusicConsumptionInfo() {
                C2JS requiredTreeField = getRequiredTreeField(1, "music_consumption_info", MusicConsumptionInfo.class, MusicConsumptionInfo.TYPE_TAG);
                C14360o3.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ClipsMetadata.MusicInfo.MusicConsumptionInfo");
                return (MusicConsumptionInfo) requiredTreeField;
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0T(C4OO.A01(), new C4OK(C4OO.A01(), MusicAssetInfo.class, "music_asset_info", MusicAssetInfo.TYPE_TAG), MusicConsumptionInfo.class, "music_consumption_info", MusicConsumptionInfo.TYPE_TAG);
            }

            public MusicInfo(int i) {
                super(i);
            }

            public MusicInfo() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class OriginalSoundInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 1303107027;

            /* loaded from: classes11.dex */
            public final class AudioParts extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.AudioParts {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 670235839;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return AudioParts.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.AudioParts
                public CreatorInspirationSignalsPlaygroundAudioPartMetadata2 asCreatorInspirationSignalsPlaygroundAudioPartMetadata2() {
                    return (CreatorInspirationSignalsPlaygroundAudioPartMetadata2) A01(CreatorInspirationSignalsPlaygroundAudioPartMetadata2Impl.class, CreatorInspirationSignalsPlaygroundAudioPartMetadata2Impl.TYPE_TAG);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0a(CreatorInspirationSignalsPlaygroundAudioPartMetadata2Impl.class, "CreatorInspirationSignalsPlaygroundAudioPartMetadata2", CreatorInspirationSignalsPlaygroundAudioPartMetadata2Impl.TYPE_TAG);
                }

                public AudioParts(int i) {
                    super(i);
                }

                public AudioParts() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class AudioPartsByFilter extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.AudioPartsByFilter {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -690018489;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return AudioPartsByFilter.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.AudioPartsByFilter
                public CreatorInspirationSignalsPlaygroundAudioPartMetadata asCreatorInspirationSignalsPlaygroundAudioPartMetadata() {
                    return (CreatorInspirationSignalsPlaygroundAudioPartMetadata) A01(CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.class, CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.TYPE_TAG);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0a(CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.class, "CreatorInspirationSignalsPlaygroundAudioPartMetadata", CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.TYPE_TAG);
                }

                public AudioPartsByFilter(int i) {
                    super(i);
                }

                public AudioPartsByFilter() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return OriginalSoundInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class ConsumptionInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.ConsumptionInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 251423850;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return ConsumptionInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.ConsumptionInfo
                public String getShouldMuteAudioReason() {
                    return AbstractC65702TsY.A0a(this, "should_mute_audio_reason", 2);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.ConsumptionInfo
                public boolean hasIsBookmarked() {
                    return true;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.ConsumptionInfo
                public boolean hasIsTrendingInClips() {
                    return true;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.ConsumptionInfo
                public boolean isBookmarked() {
                    return getRequiredBooleanField(0, "is_bookmarked");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.ConsumptionInfo
                public boolean isTrendingInClips() {
                    return getRequiredBooleanField(1, "is_trending_in_clips");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public ConsumptionInfo(int i) {
                    super(i);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC65703TsZ.A0v();
                }

                public ConsumptionInfo() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class IgArtist extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.IgArtist {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -881274254;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return IgArtist.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.IgArtist
                public boolean getHasOnboardedToTextPostApp() {
                    return getCoercedBooleanField(1, "has_onboarded_to_text_post_app");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.IgArtist
                public String getPkId() {
                    return getOptionalStringField(6, "pk_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.IgArtist
                public String getProfilePicId() {
                    return getOptionalStringField(7, "profile_pic_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.IgArtist
                public boolean isPrivate() {
                    return getCoercedBooleanField(3, "is_private");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.IgArtist
                public boolean isVerified() {
                    return getCoercedBooleanField(4, "is_verified");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.IgArtist
                public String getFullName() {
                    return A07("full_name");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.IgArtist
                public String getId() {
                    return A09("strong_id__");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.IgArtist
                public String getPk() {
                    return A0C("pk");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.IgArtist
                public String getProfilePicUrl() {
                    return A0D("profile_pic_url");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.IgArtist
                public String getUsername() {
                    return getOptionalStringField(9, AbstractC70143W6w.A00());
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.IgArtist
                public boolean hasHasOnboardedToTextPostApp() {
                    return hasFieldValue("has_onboarded_to_text_post_app");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.IgArtist
                public boolean hasIsPrivate() {
                    return hasFieldValue("is_private");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.IgArtist
                public boolean hasIsVerified() {
                    return hasFieldValue("is_verified");
                }

                public IgArtist(int i) {
                    super(i);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC65704Tsa.A04();
                }

                public IgArtist() {
                    super(TYPE_TAG);
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean getAllowCreatorToRename() {
                return getRequiredBooleanField(0, "allow_creator_to_rename");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public String getAudioAssetId() {
                return AbstractC65702TsY.A0a(this, "audio_asset_id", 1);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean getCanRemixBeSharedToFb() {
                return getCoercedBooleanField(4, "can_remix_be_shared_to_fb");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public String getDashManifest() {
                return AbstractC65702TsY.A0a(this, "dash_manifest", 6);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public int getDurationInMs() {
                return getCoercedIntField(7, "duration_in_ms");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean hasAllowCreatorToRename() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean hasHideRemixing() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean hasIsAudioAutomaticallyAttributed() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean hasIsExplicit() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean hasShouldMuteAudio() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public ImmutableList getAudioParts() {
                return getRequiredCompactedTreeListField(2, "audio_parts", AudioParts.class, AudioParts.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public ImmutableList getAudioPartsByFilter() {
                return getRequiredCompactedTreeListField(3, "audio_parts_by_filter", AudioPartsByFilter.class, AudioPartsByFilter.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.ConsumptionInfo getConsumptionInfo() {
                C2JS requiredTreeField = getRequiredTreeField(5, "consumption_info", ConsumptionInfo.class, ConsumptionInfo.TYPE_TAG);
                C14360o3.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ClipsMetadata.OriginalSoundInfo.ConsumptionInfo");
                return (ConsumptionInfo) requiredTreeField;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean getHideRemixing() {
                return getRequiredBooleanField(8, "hide_remixing");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.IgArtist getIgArtist() {
                C2JS requiredTreeField = getRequiredTreeField(9, "ig_artist", IgArtist.class, IgArtist.TYPE_TAG);
                C14360o3.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ClipsMetadata.OriginalSoundInfo.IgArtist");
                return (IgArtist) requiredTreeField;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public VFC getOriginalAudioSubtype() {
                Enum requiredEnumField = getRequiredEnumField(15, "original_audio_subtype", VFC.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                C14360o3.A07(requiredEnumField);
                return (VFC) requiredEnumField;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public String getOriginalAudioTitle() {
                return AbstractC65702TsY.A0a(this, "original_audio_title", 16);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public String getOriginalMediaId() {
                return AbstractC65702TsY.A0a(this, "original_media_id", 17);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public String getProgressiveDownloadUrl() {
                return AbstractC65702TsY.A0a(this, "progressive_download_url", 18);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean getShouldMuteAudio() {
                return getRequiredBooleanField(19, "should_mute_audio");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public int getTimeCreated() {
                return getCoercedIntField(20, "time_created");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public int getTrendRank() {
                return getCoercedIntField(21, "trend_rank");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean hasCanRemixBeSharedToFb() {
                return hasFieldValue("can_remix_be_shared_to_fb");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean hasDurationInMs() {
                return hasFieldValue("duration_in_ms");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean hasIsOriginalAudioDownloadEligible() {
                return hasFieldValue("is_original_audio_download_eligible");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean hasIsReuseDisabled() {
                return hasFieldValue("is_reuse_disabled");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean hasIsXpostFromFb() {
                return hasFieldValue("is_xpost_from_fb");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean hasTimeCreated() {
                return hasFieldValue("time_created");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean hasTrendRank() {
                return hasFieldValue("trend_rank");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean isAudioAutomaticallyAttributed() {
                return getRequiredBooleanField(10, "is_audio_automatically_attributed");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean isExplicit() {
                return getRequiredBooleanField(11, "is_explicit");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean isOriginalAudioDownloadEligible() {
                return getCoercedBooleanField(12, "is_original_audio_download_eligible");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean isReuseDisabled() {
                return getCoercedBooleanField(13, "is_reuse_disabled");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo
            public boolean isXpostFromFb() {
                return getCoercedBooleanField(14, "is_xpost_from_fb");
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                C95124Py c95124Py = C95124Py.A00;
                C4OW A0j = AbstractC65703TsZ.A0j(c95124Py);
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW A0X = AbstractC65703TsZ.A0X(c94754Oe);
                C4OK c4ok = new C4OK(C4OO.A02(), AudioParts.class, "audio_parts", AudioParts.TYPE_TAG);
                C4OK c4ok2 = new C4OK(C4OO.A02(), AudioPartsByFilter.class, "audio_parts_by_filter", AudioPartsByFilter.TYPE_TAG);
                C4OW c4ow = new C4OW(c95124Py, "can_remix_be_shared_to_fb");
                C4OK c4ok3 = new C4OK(C4OO.A01(), ConsumptionInfo.class, "consumption_info", ConsumptionInfo.TYPE_TAG);
                C4OW A0g = AbstractC65703TsZ.A0g(c94754Oe);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{A0j, A0X, c4ok, c4ok2, c4ow, c4ok3, A0g, new C4OW(c94894Ou, "duration_in_ms"), AbstractC65703TsZ.A0h(c95124Py), new C4OK(C4OO.A01(), IgArtist.class, "ig_artist", IgArtist.TYPE_TAG), AbstractC65703TsZ.A0H(c95124Py), AbstractC65703TsZ.A0G(c95124Py), new C4OW(c95124Py, "is_original_audio_download_eligible"), new C4OW(c95124Py, "is_reuse_disabled"), new C4OW(c95124Py, "is_xpost_from_fb"), AbstractC65703TsZ.A0f(c94754Oe), AbstractC65703TsZ.A0P(c94754Oe), AbstractC65703TsZ.A0F(c94754Oe), AbstractC65703TsZ.A0M(c94754Oe), AbstractC65703TsZ.A0c(c95124Py), new C4OW(c94894Ou, "time_created"), new C4OW(c94894Ou, "trend_rank")});
            }

            public OriginalSoundInfo(int i) {
                super(i);
            }

            public OriginalSoundInfo() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class ShoppingInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 1502720119;

            /* loaded from: classes11.dex */
            public final class ClipsShoppingCtaBar extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.ClipsShoppingCtaBar {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1469020760;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return ClipsShoppingCtaBar.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.ClipsShoppingCtaBar
                public double getAnimationTimeSec() {
                    return getCoercedDoubleField(0, "animation_time_sec");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.ClipsShoppingCtaBar
                public int getDwellTimeSec() {
                    return getCoercedIntField(4, "dwell_time_sec");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.ClipsShoppingCtaBar
                public String getToggledDestination() {
                    return getOptionalStringField(6, "toggled_destination");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.ClipsShoppingCtaBar
                public String getToggledTitle() {
                    return getOptionalStringField(7, "toggled_title");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.ClipsShoppingCtaBar
                public String getCtaBarType() {
                    return A08("cta_bar_type");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.ClipsShoppingCtaBar
                public String getDestination() {
                    return A09("destination");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.ClipsShoppingCtaBar
                public String getDominantColor() {
                    return A0A("dominant_color");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.ClipsShoppingCtaBar
                public String getTitle() {
                    return A0C(DialogModule.KEY_TITLE);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.ClipsShoppingCtaBar
                public boolean hasAnimationTimeSec() {
                    return hasFieldValue("animation_time_sec");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.ClipsShoppingCtaBar
                public boolean hasDwellTimeSec() {
                    return hasFieldValue("dwell_time_sec");
                }

                public ClipsShoppingCtaBar(int i) {
                    super(i);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC65703TsZ.A0m();
                }

                public ClipsShoppingCtaBar() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return ShoppingInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class Merchant extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Merchant {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1960773715;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return Merchant.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Merchant
                public boolean getDisabledSharingProductsToGuides() {
                    return getCoercedBooleanField(0, "disabled_sharing_products_to_guides");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Merchant
                public String getUsername() {
                    return getOptionalStringField(6, AbstractC70143W6w.A00());
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Merchant
                public boolean isVerified() {
                    return getCoercedBooleanField(2, "is_verified");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Merchant
                public String getId() {
                    return A08("strong_id__");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Merchant
                public String getPk() {
                    return A0A("pk");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Merchant
                public String getProfilePicUrl() {
                    return A0B("profile_pic_url");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Merchant
                public String getStorefrontAttributionUsername() {
                    return A0C("storefront_attribution_username");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Merchant
                public boolean hasDisabledSharingProductsToGuides() {
                    return hasFieldValue("disabled_sharing_products_to_guides");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Merchant
                public boolean hasIsVerified() {
                    return hasFieldValue("is_verified");
                }

                public Merchant(int i) {
                    super(i);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC65703TsZ.A0p();
                }

                public Merchant() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class Products extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 1601450224;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return Products.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                /* loaded from: classes11.dex */
                public final class ProductDetails extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -456596536;

                    /* loaded from: classes11.dex */
                    public final class AggregatedRating extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.AggregatedRating {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1513041188;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return AggregatedRating.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.AggregatedRating
                        public int getRatingCount() {
                            return getCoercedIntField(0, "rating_count");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.AggregatedRating
                        public double getValue() {
                            return getCoercedDoubleField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.AggregatedRating
                        public boolean hasRatingCount() {
                            return hasFieldValue("rating_count");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.AggregatedRating
                        public boolean hasValue() {
                            return hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        }

                        public AggregatedRating(int i) {
                            super(i);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC65703TsZ.A0s();
                        }

                        public AggregatedRating() {
                            super(TYPE_TAG);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class ArtsLabels extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ArtsLabels {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -698412464;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ArtsLabels.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class Labels extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ArtsLabels.Labels {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = 1226809924;

                            /* loaded from: classes11.dex */
                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return Labels.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ArtsLabels.Labels
                            public String getLabelDisplayValue() {
                                return A07("label_display_value");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ArtsLabels.Labels
                            public String getLabelType() {
                                return A08("label_type");
                            }

                            public Labels(int i) {
                                super(i);
                            }

                            @Override // X.C2JS
                            public C4OU modelSelectionSet() {
                                return AbstractC65703TsZ.A0u();
                            }

                            public Labels() {
                                super(TYPE_TAG);
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ArtsLabels
                        public ImmutableList getLabels() {
                            return getOptionalCompactedTreeListField(0, "labels", Labels.class, Labels.TYPE_TAG);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0W(C4OO.A00(), Labels.class, "labels", Labels.TYPE_TAG);
                        }

                        public ArtsLabels(int i) {
                            super(i);
                        }

                        public ArtsLabels() {
                            super(TYPE_TAG);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class CheckoutProperties extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -1680796727;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return CheckoutProperties.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class CurrencyAmount extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -770900763;

                            /* loaded from: classes11.dex */
                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return CurrencyAmount.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount
                            public int getOffset() {
                                return getCoercedIntField(3, "offset");
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount
                            public String getAmount() {
                                return A07("amount");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount
                            public String getAmountWithOffset() {
                                return A08("amount_with_offset");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount
                            public String getCurrency() {
                                return A09("currency");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount
                            public boolean hasOffset() {
                                return hasFieldValue("offset");
                            }

                            public CurrencyAmount(int i) {
                                super(i);
                            }

                            @Override // X.C2JS
                            public C4OU modelSelectionSet() {
                                return AbstractC65703TsZ.A0o();
                            }

                            public CurrencyAmount() {
                                super(TYPE_TAG);
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class ShippingAndReturn extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -1184522475;

                            /* loaded from: classes11.dex */
                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return ShippingAndReturn.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            /* loaded from: classes11.dex */
                            public final class ReturnCost extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ReturnCost {
                                public static final Companion Companion = new Object();
                                public static final int TYPE_TAG = -1676463092;

                                /* loaded from: classes11.dex */
                                public final class Companion {
                                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                                    }

                                    public final int getTYPE_TAG() {
                                        return ReturnCost.TYPE_TAG;
                                    }

                                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                    }

                                    public Companion() {
                                    }
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ReturnCost
                                public int getOffset() {
                                    return getCoercedIntField(3, "offset");
                                }

                                public static final int getTYPE_TAG() {
                                    return TYPE_TAG;
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ReturnCost
                                public String getAmount() {
                                    return A07("amount");
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ReturnCost
                                public String getAmountWithOffset() {
                                    return A08("amount_with_offset");
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ReturnCost
                                public String getCurrency() {
                                    return A09("currency");
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ReturnCost
                                public boolean hasOffset() {
                                    return hasFieldValue("offset");
                                }

                                public ReturnCost(int i) {
                                    super(i);
                                }

                                @Override // X.C2JS
                                public C4OU modelSelectionSet() {
                                    return AbstractC65703TsZ.A0o();
                                }

                                public ReturnCost() {
                                    super(TYPE_TAG);
                                }
                            }

                            /* loaded from: classes11.dex */
                            public final class ShippingCost extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost {
                                public static final Companion Companion = new Object();
                                public static final int TYPE_TAG = -1242952738;

                                /* loaded from: classes11.dex */
                                public final class Companion {
                                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                                    }

                                    public final int getTYPE_TAG() {
                                        return ShippingCost.TYPE_TAG;
                                    }

                                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                    }

                                    public Companion() {
                                    }
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost
                                public int getOffset() {
                                    return getCoercedIntField(3, "offset");
                                }

                                public static final int getTYPE_TAG() {
                                    return TYPE_TAG;
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost
                                public String getAmount() {
                                    return A07("amount");
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost
                                public String getAmountWithOffset() {
                                    return A08("amount_with_offset");
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost
                                public String getCurrency() {
                                    return A09("currency");
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost
                                public boolean hasOffset() {
                                    return hasFieldValue("offset");
                                }

                                public ShippingCost(int i) {
                                    super(i);
                                }

                                @Override // X.C2JS
                                public C4OU modelSelectionSet() {
                                    return AbstractC65703TsZ.A0o();
                                }

                                public ShippingCost() {
                                    super(TYPE_TAG);
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn
                            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ReturnCost getReturnCost() {
                                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ReturnCost) A03(ReturnCost.class, "return_cost", ReturnCost.TYPE_TAG);
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn
                            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost getShippingCost() {
                                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost) A02(ShippingCost.class, "shipping_cost", ShippingCost.TYPE_TAG);
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn
                            public String getShippingCostStripped() {
                                return A09("shipping_cost_stripped");
                            }

                            @Override // X.C2JS
                            public C4OU modelSelectionSet() {
                                return AbstractC167017dG.A0X(C94754Oe.A00, new C4OK(ReturnCost.class, "return_cost", ReturnCost.TYPE_TAG), new C4OK(ShippingCost.class, "shipping_cost", ShippingCost.TYPE_TAG), "shipping_cost_stripped");
                            }

                            public ShippingAndReturn(int i) {
                                super(i);
                            }

                            public ShippingAndReturn() {
                                super(TYPE_TAG);
                            }
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public boolean getCanAddToBag() {
                            return getCoercedBooleanField(0, "can_add_to_bag");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public boolean getCanEnableRestockReminder() {
                            return getCoercedBooleanField(1, "can_enable_restock_reminder");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public boolean getCanShowInventoryQuantity() {
                            return getCoercedBooleanField(2, "can_show_inventory_quantity");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public int getFullInventoryQuantity() {
                            return getCoercedIntField(4, "full_inventory_quantity");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public boolean getHasFreeShipping() {
                            return getCoercedBooleanField(5, "has_free_shipping");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public String getIgReferrerFbid() {
                            return getOptionalStringField(6, "ig_referrer_fbid");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public int getInventoryQuantity() {
                            return getCoercedIntField(7, "inventory_quantity");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount getCurrencyAmount() {
                            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount) getOptionalTreeField(3, "currency_amount", CurrencyAmount.class, CurrencyAmount.TYPE_TAG);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public boolean getProductGroupHasInventory() {
                            return getCoercedBooleanField(9, "product_group_has_inventory");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public String getReceiverId() {
                            return getOptionalStringField(10, "receiver_id");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn getShippingAndReturn() {
                            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn) getOptionalTreeField(11, "shipping_and_return", ShippingAndReturn.class, ShippingAndReturn.TYPE_TAG);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public int getViewerPurchaseLimit() {
                            return getCoercedIntField(12, "viewer_purchase_limit");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public boolean hasCanAddToBag() {
                            return hasFieldValue("can_add_to_bag");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public boolean hasCanEnableRestockReminder() {
                            return hasFieldValue("can_enable_restock_reminder");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public boolean hasCanShowInventoryQuantity() {
                            return hasFieldValue("can_show_inventory_quantity");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public boolean hasFullInventoryQuantity() {
                            return hasFieldValue("full_inventory_quantity");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public boolean hasHasFreeShipping() {
                            return hasFieldValue("has_free_shipping");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public boolean hasInventoryQuantity() {
                            return hasFieldValue("inventory_quantity");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public boolean hasIsShopifyMerchant() {
                            return hasFieldValue("is_shopify_merchant");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public boolean hasProductGroupHasInventory() {
                            return hasFieldValue("product_group_has_inventory");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public boolean hasViewerPurchaseLimit() {
                            return hasFieldValue("viewer_purchase_limit");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties
                        public boolean isShopifyMerchant() {
                            return getCoercedBooleanField(8, "is_shopify_merchant");
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            C95124Py c95124Py = C95124Py.A00;
                            C4OW c4ow = new C4OW(c95124Py, "can_add_to_bag");
                            C4OW c4ow2 = new C4OW(c95124Py, "can_enable_restock_reminder");
                            C4OW c4ow3 = new C4OW(c95124Py, "can_show_inventory_quantity");
                            C4OK c4ok = new C4OK(CurrencyAmount.class, "currency_amount", CurrencyAmount.TYPE_TAG);
                            C94894Ou c94894Ou = C94894Ou.A00;
                            C4OW c4ow4 = new C4OW(c94894Ou, "full_inventory_quantity");
                            C4OW c4ow5 = new C4OW(c95124Py, "has_free_shipping");
                            C94754Oe c94754Oe = C94754Oe.A00;
                            return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, c4ok, c4ow4, c4ow5, new C4OW(c94754Oe, "ig_referrer_fbid"), new C4OW(c94894Ou, "inventory_quantity"), new C4OW(c95124Py, "is_shopify_merchant"), new C4OW(c95124Py, "product_group_has_inventory"), new C4OW(c94754Oe, "receiver_id"), new C4OK(ShippingAndReturn.class, "shipping_and_return", ShippingAndReturn.TYPE_TAG), new C4OW(c94894Ou, "viewer_purchase_limit")});
                        }

                        public CheckoutProperties(int i) {
                            super(i);
                        }

                        public CheckoutProperties() {
                            super(TYPE_TAG);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class CommerceReviewStatistics extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CommerceReviewStatistics {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -2052810183;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return CommerceReviewStatistics.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CommerceReviewStatistics
                        public double getAverageRating() {
                            return getCoercedDoubleField(0, "average_rating");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CommerceReviewStatistics
                        public int getReviewCount() {
                            return getCoercedIntField(1, "review_count");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CommerceReviewStatistics
                        public boolean hasAverageRating() {
                            return hasFieldValue("average_rating");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CommerceReviewStatistics
                        public boolean hasReviewCount() {
                            return hasFieldValue("review_count");
                        }

                        public CommerceReviewStatistics(int i) {
                            super(i);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC65703TsZ.A0r();
                        }

                        public CommerceReviewStatistics() {
                            super(TYPE_TAG);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return ProductDetails.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class DiscountInformation extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.DiscountInformation {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 2141381936;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return DiscountInformation.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class Discounts extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.DiscountInformation.Discounts {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -374764815;

                            /* loaded from: classes11.dex */
                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return Discounts.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.DiscountInformation.Discounts
                            public String getId() {
                                return AbstractC65702TsY.A0a(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 2);
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.DiscountInformation.Discounts
                            public String getCtaText() {
                                return A07("cta_text");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.DiscountInformation.Discounts
                            public String getDescription() {
                                return A08(DevServerEntity.COLUMN_DESCRIPTION);
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.DiscountInformation.Discounts
                            public String getName() {
                                return A0A(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.DiscountInformation.Discounts
                            public String getSeeDetailsText() {
                                return A0B("see_details_text");
                            }

                            public Discounts(int i) {
                                super(i);
                            }

                            @Override // X.C2JS
                            public C4OU modelSelectionSet() {
                                return AbstractC65703TsZ.A0y();
                            }

                            public Discounts() {
                                super(TYPE_TAG);
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.DiscountInformation
                        public ImmutableList getDiscounts() {
                            return getOptionalCompactedTreeListField(0, "discounts", Discounts.class, Discounts.TYPE_TAG);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0W(C4OO.A00(), Discounts.class, "discounts", Discounts.TYPE_TAG);
                        }

                        public DiscountInformation(int i) {
                            super(i);
                        }

                        public DiscountInformation() {
                            super(TYPE_TAG);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class ImageQualityMetadata extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1995545465;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ImageQualityMetadata.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class Goodness extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata.Goodness {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = 1048020663;

                            /* loaded from: classes11.dex */
                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return Goodness.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata.Goodness
                            public double getScore() {
                                return getCoercedDoubleField(1, "score");
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata.Goodness
                            public String getId() {
                                return A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata.Goodness
                            public boolean hasScore() {
                                return hasFieldValue("score");
                            }

                            public Goodness(int i) {
                                super(i);
                            }

                            @Override // X.C2JS
                            public C4OU modelSelectionSet() {
                                return AbstractC58323PtF.A0S();
                            }

                            public Goodness() {
                                super(TYPE_TAG);
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class LifestyleBackground extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata.LifestyleBackground {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -1088568239;

                            /* loaded from: classes11.dex */
                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return LifestyleBackground.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata.LifestyleBackground
                            public double getScore() {
                                return getCoercedDoubleField(1, "score");
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata.LifestyleBackground
                            public String getId() {
                                return A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata.LifestyleBackground
                            public boolean hasScore() {
                                return hasFieldValue("score");
                            }

                            public LifestyleBackground(int i) {
                                super(i);
                            }

                            @Override // X.C2JS
                            public C4OU modelSelectionSet() {
                                return AbstractC58323PtF.A0S();
                            }

                            public LifestyleBackground() {
                                super(TYPE_TAG);
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata
                        public ImmutableList getGoodness() {
                            return getOptionalCompactedTreeListField(0, "goodness", Goodness.class, Goodness.TYPE_TAG);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata
                        public ImmutableList getLifestyleBackground() {
                            return getOptionalCompactedTreeListField(1, "lifestyle_background", LifestyleBackground.class, LifestyleBackground.TYPE_TAG);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC58320PtC.A0T(C4OO.A00(), new C4OK(C4OO.A00(), Goodness.class, "goodness", Goodness.TYPE_TAG), LifestyleBackground.class, "lifestyle_background", LifestyleBackground.TYPE_TAG);
                        }

                        public ImageQualityMetadata(int i) {
                            super(i);
                        }

                        public ImageQualityMetadata() {
                            super(TYPE_TAG);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class MainImage extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -773941500;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return MainImage.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class ImageVersions2 extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2 {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -1272297607;

                            /* loaded from: classes11.dex */
                            public final class Candidates extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2.Candidates {
                                public static final Companion Companion = new Object();
                                public static final int TYPE_TAG = 1751902548;

                                /* loaded from: classes11.dex */
                                public final class Companion {
                                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                                    }

                                    public final int getTYPE_TAG() {
                                        return Candidates.TYPE_TAG;
                                    }

                                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                    }

                                    public Companion() {
                                    }
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2.Candidates
                                public int getHeight() {
                                    return getCoercedIntField(0, IgReactMediaPickerNativeModule.HEIGHT);
                                }

                                public static final int getTYPE_TAG() {
                                    return TYPE_TAG;
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2.Candidates
                                public String getUrl() {
                                    return A08("url");
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2.Candidates
                                public int getWidth() {
                                    return A00(IgReactMediaPickerNativeModule.WIDTH);
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2.Candidates
                                public boolean hasHeight() {
                                    return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2.Candidates
                                public boolean hasWidth() {
                                    return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
                                }

                                public Candidates(int i) {
                                    super(i);
                                }

                                @Override // X.C2JS
                                public C4OU modelSelectionSet() {
                                    return AbstractC58323PtF.A0T();
                                }

                                public Candidates() {
                                    super(TYPE_TAG);
                                }
                            }

                            /* loaded from: classes11.dex */
                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return ImageVersions2.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2
                            public ImmutableList getCandidates() {
                                return getOptionalCompactedTreeListField(0, "candidates", Candidates.class, Candidates.TYPE_TAG);
                            }

                            @Override // X.C2JS
                            public C4OU modelSelectionSet() {
                                return AbstractC167017dG.A0W(C4OO.A00(), Candidates.class, "candidates", Candidates.TYPE_TAG);
                            }

                            public ImageVersions2(int i) {
                                super(i);
                            }

                            public ImageVersions2() {
                                super(TYPE_TAG);
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage
                        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2 getImageVersions2() {
                            C2JS A05 = A05(ImageVersions2.class, "image_versions2", ImageVersions2.TYPE_TAG);
                            C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2");
                            return (ImageVersions2) A05;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage
                        public String getPreview() {
                            return A08("preview");
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC58323PtF.A0W(C4OO.A01(), ImageVersions2.class, ImageVersions2.TYPE_TAG);
                        }

                        public MainImage(int i) {
                            super(i);
                        }

                        public MainImage() {
                            super(TYPE_TAG);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class Merchant extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.Merchant {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1982642153;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return Merchant.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.Merchant
                        public boolean getDisabledSharingProductsToGuides() {
                            return getCoercedBooleanField(0, "disabled_sharing_products_to_guides");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.Merchant
                        public String getUsername() {
                            return getOptionalStringField(6, AbstractC70143W6w.A00());
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.Merchant
                        public boolean isVerified() {
                            return getCoercedBooleanField(2, "is_verified");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.Merchant
                        public String getId() {
                            return A08("strong_id__");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.Merchant
                        public String getPk() {
                            return A0A("pk");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.Merchant
                        public String getProfilePicUrl() {
                            return A0B("profile_pic_url");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.Merchant
                        public String getStorefrontAttributionUsername() {
                            return A0C("storefront_attribution_username");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.Merchant
                        public boolean hasDisabledSharingProductsToGuides() {
                            return hasFieldValue("disabled_sharing_products_to_guides");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.Merchant
                        public boolean hasIsVerified() {
                            return hasFieldValue("is_verified");
                        }

                        public Merchant(int i) {
                            super(i);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC65703TsZ.A0p();
                        }

                        public Merchant() {
                            super(TYPE_TAG);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class RichTextDescription extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1156939697;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return RichTextDescription.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class TextWithEntities extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription.TextWithEntities {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -559730731;

                            /* loaded from: classes11.dex */
                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return TextWithEntities.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            /* loaded from: classes11.dex */
                            public final class InlineStyleRanges extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription.TextWithEntities.InlineStyleRanges {
                                public static final Companion Companion = new Object();
                                public static final int TYPE_TAG = 1964789413;

                                /* loaded from: classes11.dex */
                                public final class Companion {
                                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                                    }

                                    public final int getTYPE_TAG() {
                                        return InlineStyleRanges.TYPE_TAG;
                                    }

                                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                    }

                                    public Companion() {
                                    }
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription.TextWithEntities.InlineStyleRanges
                                public int getInlineStyle() {
                                    return getCoercedIntField(0, "inline_style");
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription.TextWithEntities.InlineStyleRanges
                                public int getLength() {
                                    return getCoercedIntField(1, "length");
                                }

                                public static final int getTYPE_TAG() {
                                    return TYPE_TAG;
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription.TextWithEntities.InlineStyleRanges
                                public int getOffset() {
                                    return A00("offset");
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription.TextWithEntities.InlineStyleRanges
                                public boolean hasInlineStyle() {
                                    return hasFieldValue("inline_style");
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription.TextWithEntities.InlineStyleRanges
                                public boolean hasLength() {
                                    return hasFieldValue("length");
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription.TextWithEntities.InlineStyleRanges
                                public boolean hasOffset() {
                                    return hasFieldValue("offset");
                                }

                                public InlineStyleRanges(int i) {
                                    super(i);
                                }

                                @Override // X.C2JS
                                public C4OU modelSelectionSet() {
                                    return AbstractC58323PtF.A0U();
                                }

                                public InlineStyleRanges() {
                                    super(TYPE_TAG);
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription.TextWithEntities
                            public ImmutableList getInlineStyleRanges() {
                                return getOptionalCompactedTreeListField(0, "inline_style_ranges", InlineStyleRanges.class, InlineStyleRanges.TYPE_TAG);
                            }

                            @Override // X.C2JS
                            public C4OU modelSelectionSet() {
                                return AbstractC167017dG.A0W(C4OO.A00(), InlineStyleRanges.class, "inline_style_ranges", InlineStyleRanges.TYPE_TAG);
                            }

                            public TextWithEntities(int i) {
                                super(i);
                            }

                            public TextWithEntities() {
                                super(TYPE_TAG);
                            }
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription
                        public int getDepth() {
                            return getCoercedIntField(1, "depth");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription
                        public String getBlockType() {
                            return A07("block_type");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription
                        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription.TextWithEntities getTextWithEntities() {
                            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription.TextWithEntities) A04(TextWithEntities.class, "text_with_entities", TextWithEntities.TYPE_TAG);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription
                        public boolean hasDepth() {
                            return hasFieldValue("depth");
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC58320PtC.A0V(new C4OW(C94754Oe.A00, "block_type"), new C4OW(C94894Ou.A00, "depth"), TextWithEntities.class, "text_with_entities", TextWithEntities.TYPE_TAG);
                        }

                        public RichTextDescription(int i) {
                            super(i);
                        }

                        public RichTextDescription() {
                            super(TYPE_TAG);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class SellerBadge extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.SellerBadge {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1961261768;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return SellerBadge.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.SellerBadge
                        public String getDescription() {
                            return A07(DevServerEntity.COLUMN_DESCRIPTION);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.SellerBadge
                        public String getName() {
                            return A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.SellerBadge
                        public EnumC39610HeK getType() {
                            return (EnumC39610HeK) getOptionalEnumField(2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, EnumC39610HeK.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            C94754Oe c94754Oe = C94754Oe.A00;
                            return AbstractC167017dG.A0X(c94754Oe, AbstractC58322PtE.A0Y(c94754Oe), AbstractC58321PtD.A0U(c94754Oe), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        }

                        public SellerBadge(int i) {
                            super(i);
                        }

                        public SellerBadge() {
                            super(TYPE_TAG);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class ThumbnailImage extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1472342914;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ThumbnailImage.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class ImageVersions2 extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2 {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -2097145300;

                            /* loaded from: classes11.dex */
                            public final class Candidates extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2.Candidates {
                                public static final Companion Companion = new Object();
                                public static final int TYPE_TAG = 2008878682;

                                /* loaded from: classes11.dex */
                                public final class Companion {
                                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                                    }

                                    public final int getTYPE_TAG() {
                                        return Candidates.TYPE_TAG;
                                    }

                                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                    }

                                    public Companion() {
                                    }
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2.Candidates
                                public int getHeight() {
                                    return getCoercedIntField(0, IgReactMediaPickerNativeModule.HEIGHT);
                                }

                                public static final int getTYPE_TAG() {
                                    return TYPE_TAG;
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2.Candidates
                                public String getUrl() {
                                    return A08("url");
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2.Candidates
                                public int getWidth() {
                                    return A00(IgReactMediaPickerNativeModule.WIDTH);
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2.Candidates
                                public boolean hasHeight() {
                                    return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
                                }

                                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2.Candidates
                                public boolean hasWidth() {
                                    return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
                                }

                                public Candidates(int i) {
                                    super(i);
                                }

                                @Override // X.C2JS
                                public C4OU modelSelectionSet() {
                                    return AbstractC58323PtF.A0T();
                                }

                                public Candidates() {
                                    super(TYPE_TAG);
                                }
                            }

                            /* loaded from: classes11.dex */
                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return ImageVersions2.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2
                            public ImmutableList getCandidates() {
                                return getOptionalCompactedTreeListField(0, "candidates", Candidates.class, Candidates.TYPE_TAG);
                            }

                            @Override // X.C2JS
                            public C4OU modelSelectionSet() {
                                return AbstractC167017dG.A0W(C4OO.A00(), Candidates.class, "candidates", Candidates.TYPE_TAG);
                            }

                            public ImageVersions2(int i) {
                                super(i);
                            }

                            public ImageVersions2() {
                                super(TYPE_TAG);
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage
                        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2 getImageVersions2() {
                            C2JS A05 = A05(ImageVersions2.class, "image_versions2", ImageVersions2.TYPE_TAG);
                            C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2");
                            return (ImageVersions2) A05;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage
                        public String getPreview() {
                            return A08("preview");
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC58323PtF.A0W(C4OO.A01(), ImageVersions2.class, ImageVersions2.TYPE_TAG);
                        }

                        public ThumbnailImage(int i) {
                            super(i);
                        }

                        public ThumbnailImage() {
                            super(TYPE_TAG);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class VariantValues extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.VariantValues {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 74565734;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return VariantValues.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.VariantValues
                        public String getId() {
                            return AbstractC65702TsY.A0a(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 0);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.VariantValues
                        public String getName() {
                            return AbstractC65702TsY.A0a(this, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 2);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.VariantValues
                        public String getValue() {
                            return AbstractC65702TsY.A0a(this, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, 4);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.VariantValues
                        public boolean hasIsPreselected() {
                            return true;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.VariantValues
                        public boolean isPreselected() {
                            return getRequiredBooleanField(1, "is_preselected");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.VariantValues
                        public String getNormalizedValue() {
                            return A0A("normalized_value");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.VariantValues
                        public VFE getVisualStyle() {
                            Enum requiredEnumField = getRequiredEnumField(5, "visual_style", VFE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                            C14360o3.A07(requiredEnumField);
                            return (VFE) requiredEnumField;
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            C94754Oe c94754Oe = C94754Oe.A00;
                            return AbstractC65703TsZ.A11(c94754Oe, new C94774Oi(c94754Oe));
                        }

                        public VariantValues(int i) {
                            super(i);
                        }

                        public VariantValues() {
                            super(TYPE_TAG);
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public boolean getCanShareToStory() {
                        return getCoercedBooleanField(2, "can_share_to_story");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public boolean getCanViewerSeeRnr() {
                        return getCoercedBooleanField(3, "can_viewer_see_rnr");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public String getCompoundProductId() {
                        return getOptionalStringField(7, "compound_product_id");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.AggregatedRating getAggregatedRating() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.AggregatedRating) A03(AggregatedRating.class, "aggregated_rating", AggregatedRating.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ArtsLabels getArtsLabels() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ArtsLabels) A02(ArtsLabels.class, "arts_labels", ArtsLabels.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties getCheckoutProperties() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties) getOptionalTreeField(4, "checkout_properties", CheckoutProperties.class, CheckoutProperties.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public EnumC33429Eq0 getCheckoutStyle() {
                        return (EnumC33429Eq0) getOptionalEnumField(5, "checkout_style", EnumC33429Eq0.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CommerceReviewStatistics getCommerceReviewStatistics() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CommerceReviewStatistics) getOptionalTreeField(6, "commerce_review_statistics", CommerceReviewStatistics.class, CommerceReviewStatistics.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public String getCurrentPrice() {
                        return A0D("current_price");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public String getCurrentPriceAmount() {
                        return getOptionalStringField(9, "current_price_amount");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public String getCurrentPriceStripped() {
                        return getOptionalStringField(10, "current_price_stripped");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public String getDescription() {
                        return getOptionalStringField(11, DevServerEntity.COLUMN_DESCRIPTION);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.DiscountInformation getDiscountInformation() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.DiscountInformation) getOptionalTreeField(12, "discount_information", DiscountInformation.class, DiscountInformation.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public String getExternalUrl() {
                        return getOptionalStringField(13, "external_url");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public String getFullPrice() {
                        return getOptionalStringField(14, "full_price");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public String getFullPriceAmount() {
                        return getOptionalStringField(15, "full_price_amount");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public String getFullPriceStripped() {
                        return getOptionalStringField(16, "full_price_stripped");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public boolean getHasVariants() {
                        return getCoercedBooleanField(17, "has_variants");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public boolean getHasViewerSaved() {
                        return getCoercedBooleanField(18, "has_viewer_saved");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public boolean getIgIsProductEditableOnMobile() {
                        return getCoercedBooleanField(19, "ig_is_product_editable_on_mobile");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata getImageQualityMetadata() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata) getOptionalTreeField(20, "image_quality_metadata", ImageQualityMetadata.class, ImageQualityMetadata.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage getMainImage() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage) getOptionalTreeField(23, "main_image", MainImage.class, MainImage.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public String getMainImageId() {
                        return getOptionalStringField(24, "main_image_id");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.Merchant getMerchant() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.Merchant) getOptionalTreeField(25, "merchant", Merchant.class, Merchant.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public String getName() {
                        return getOptionalStringField(26, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public String getPrice() {
                        return getOptionalStringField(27, "price");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public String getProductId() {
                        return getOptionalStringField(28, "product_id");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public String getRetailerId() {
                        return getOptionalStringField(29, "retailer_id");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public String getReviewStatus() {
                        return getOptionalStringField(30, "review_status");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public ImmutableList getRichTextDescription() {
                        return getOptionalCompactedTreeListField(31, "rich_text_description", RichTextDescription.class, RichTextDescription.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.SellerBadge getSellerBadge() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.SellerBadge) getOptionalTreeField(32, "seller_badge", SellerBadge.class, SellerBadge.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public VFM getSizeCalibrationScore() {
                        return (VFM) getOptionalEnumField(33, "size_calibration_score", VFM.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage getThumbnailImage() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage) getOptionalTreeField(34, "thumbnail_image", ThumbnailImage.class, ThumbnailImage.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public ImmutableList getVariantValues() {
                        return getOptionalCompactedTreeListField(35, "variant_values", VariantValues.class, VariantValues.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public boolean hasCanShareToStory() {
                        return hasFieldValue("can_share_to_story");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public boolean hasCanViewerSeeRnr() {
                        return hasFieldValue("can_viewer_see_rnr");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public boolean hasHasVariants() {
                        return hasFieldValue("has_variants");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public boolean hasHasViewerSaved() {
                        return hasFieldValue("has_viewer_saved");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public boolean hasIgIsProductEditableOnMobile() {
                        return hasFieldValue("ig_is_product_editable_on_mobile");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public boolean hasIsEnteredInDrawing() {
                        return hasFieldValue("is_entered_in_drawing");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public boolean hasIsInStock() {
                        return hasFieldValue("is_in_stock");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public boolean isEnteredInDrawing() {
                        return getCoercedBooleanField(21, "is_entered_in_drawing");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails
                    public boolean isInStock() {
                        return getCoercedBooleanField(22, "is_in_stock");
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        C4OM[] c4omArr = new C4OM[36];
                        C4OK c4ok = new C4OK(AggregatedRating.class, "aggregated_rating", AggregatedRating.TYPE_TAG);
                        C4OK c4ok2 = new C4OK(ArtsLabels.class, "arts_labels", ArtsLabels.TYPE_TAG);
                        C95124Py c95124Py = C95124Py.A00;
                        C4OW c4ow = new C4OW(c95124Py, "can_share_to_story");
                        C4OW c4ow2 = new C4OW(c95124Py, "can_viewer_see_rnr");
                        C4OK c4ok3 = new C4OK(CheckoutProperties.class, "checkout_properties", CheckoutProperties.TYPE_TAG);
                        C94754Oe c94754Oe = C94754Oe.A00;
                        boolean A1b = AbstractC31175DnJ.A1b(new C4OM[]{c4ok, c4ok2, c4ow, c4ow2, c4ok3, new C4OW(c94754Oe, "checkout_style"), new C4OK(CommerceReviewStatistics.class, "commerce_review_statistics", CommerceReviewStatistics.TYPE_TAG), new C4OW(c94754Oe, "compound_product_id"), new C4OW(c94754Oe, "current_price"), new C4OW(c94754Oe, "current_price_amount"), new C4OW(c94754Oe, "current_price_stripped"), AbstractC58322PtE.A0Y(c94754Oe), new C4OK(DiscountInformation.class, "discount_information", DiscountInformation.TYPE_TAG), new C4OW(c94754Oe, "external_url"), new C4OW(c94754Oe, "full_price"), new C4OW(c94754Oe, "full_price_amount"), new C4OW(c94754Oe, "full_price_stripped"), new C4OW(c95124Py, "has_variants"), new C4OW(c95124Py, "has_viewer_saved"), new C4OW(c95124Py, "ig_is_product_editable_on_mobile"), new C4OK(ImageQualityMetadata.class, "image_quality_metadata", ImageQualityMetadata.TYPE_TAG), new C4OW(c95124Py, "is_entered_in_drawing"), new C4OW(c95124Py, "is_in_stock"), new C4OK(MainImage.class, "main_image", MainImage.TYPE_TAG), new C4OW(c94754Oe, "main_image_id"), new C4OK(Merchant.class, "merchant", Merchant.TYPE_TAG), AbstractC58321PtD.A0U(c94754Oe)}, c4omArr);
                        return AbstractC58321PtD.A0Z(new C4OM[]{new C4OW(c94754Oe, "price"), new C4OW(c94754Oe, "product_id"), new C4OW(c94754Oe, "retailer_id"), new C4OW(c94754Oe, "review_status"), new C4OK(C4OO.A00(), RichTextDescription.class, "rich_text_description", RichTextDescription.TYPE_TAG), new C4OK(SellerBadge.class, "seller_badge", SellerBadge.TYPE_TAG), new C4OW(c94754Oe, "size_calibration_score"), new C4OK(ThumbnailImage.class, "thumbnail_image", ThumbnailImage.TYPE_TAG), new C4OK(C4OO.A00(), VariantValues.class, "variant_values", VariantValues.TYPE_TAG)}, c4omArr, A1b ? 1 : 0, 27, 9);
                    }

                    public ProductDetails(int i) {
                        super(i);
                    }

                    public ProductDetails() {
                        super(TYPE_TAG);
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products
                public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails getProductDetails() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails) A03(ProductDetails.class, "product_details", ProductDetails.TYPE_TAG);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0b(ProductDetails.class, "product_details", ProductDetails.TYPE_TAG);
                }

                public Products(int i) {
                    super(i);
                }

                public Products() {
                    super(TYPE_TAG);
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo
            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.ClipsShoppingCtaBar getClipsShoppingCtaBar() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.ClipsShoppingCtaBar) A03(ClipsShoppingCtaBar.class, "clips_shopping_cta_bar", ClipsShoppingCtaBar.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo
            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Merchant getMerchant() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Merchant) A02(Merchant.class, "merchant", Merchant.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo
            public ImmutableList getProducts() {
                return getOptionalCompactedTreeListField(2, "products", Products.class, Products.TYPE_TAG);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC58319PtB.A0T(new C4OK(ClipsShoppingCtaBar.class, "clips_shopping_cta_bar", ClipsShoppingCtaBar.TYPE_TAG), new C4OK(Merchant.class, "merchant", Merchant.TYPE_TAG), new C4OK(C4OO.A00(), Products.class, "products", Products.TYPE_TAG));
            }

            public ShoppingInfo(int i) {
                super(i);
            }

            public ShoppingInfo() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class TemplateInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 50521029;

            /* loaded from: classes11.dex */
            public final class AttributionInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.AttributionInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -695420975;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return AttributionInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.AttributionInfo
                public String getOwnerUsername() {
                    return AbstractC65702TsY.A0a(this, "owner_username", 0);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.AttributionInfo
                public String getTemplateMediaId() {
                    return AbstractC65702TsY.A0a(this, "template_media_id", 1);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC167017dG.A0Y(new C94774Oi(c94754Oe), new C4OW(new C94774Oi(c94754Oe), "owner_username"), "template_media_id");
                }

                public AttributionInfo(int i) {
                    super(i);
                }

                public AttributionInfo() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return TemplateInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class EffectsInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.EffectsInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1897423163;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return EffectsInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                /* loaded from: classes11.dex */
                public final class SegmentEffectsInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.EffectsInfo.SegmentEffectsInfo {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 447439558;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return SegmentEffectsInfo.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.EffectsInfo.SegmentEffectsInfo
                    public long getEffectId() {
                        return getRequiredTimeField(0, "effect_id");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.EffectsInfo.SegmentEffectsInfo
                    public int getSegmentIndex() {
                        return getRequiredIntField(1, "segment_index");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.EffectsInfo.SegmentEffectsInfo
                    public boolean hasEffectId() {
                        return true;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.EffectsInfo.SegmentEffectsInfo
                    public boolean hasSegmentIndex() {
                        return true;
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0Y(AbstractC58319PtB.A0R(), new C4OW(new C94774Oi(C67A.A00), "effect_id"), "segment_index");
                    }

                    public SegmentEffectsInfo(int i) {
                        super(i);
                    }

                    public SegmentEffectsInfo() {
                        super(TYPE_TAG);
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.EffectsInfo
                public ImmutableList getSegmentEffectsInfo() {
                    return getOptionalCompactedTreeListField(0, "segment_effects_info", SegmentEffectsInfo.class, SegmentEffectsInfo.TYPE_TAG);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0W(C4OO.A00(), SegmentEffectsInfo.class, "segment_effects_info", SegmentEffectsInfo.TYPE_TAG);
                }

                public EffectsInfo(int i) {
                    super(i);
                }

                public EffectsInfo() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class SegmentsInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.SegmentsInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1965321405;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return SegmentsInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.SegmentsInfo
                public long getDurationInMs() {
                    return getRequiredTimeField(0, "duration_in_ms");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.SegmentsInfo
                public int getReusableTemplateMediaAssetEndTimeMs() {
                    return getCoercedIntField(1, "reusable_template_media_asset_end_time_ms");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.SegmentsInfo
                public boolean hasDurationInMs() {
                    return true;
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.SegmentsInfo
                public int getReusableTemplateMediaAssetStartTimeMs() {
                    return A00("reusable_template_media_asset_start_time_ms");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.SegmentsInfo
                public boolean hasReusableTemplateMediaAssetEndTimeMs() {
                    return hasFieldValue("reusable_template_media_asset_end_time_ms");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.SegmentsInfo
                public boolean hasReusableTemplateMediaAssetStartTimeMs() {
                    return hasFieldValue("reusable_template_media_asset_start_time_ms");
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    C4OW A0d = AbstractC65703TsZ.A0d(C67A.A00);
                    C94894Ou c94894Ou = C94894Ou.A00;
                    return AbstractC167017dG.A0X(c94894Ou, A0d, new C4OW(c94894Ou, "reusable_template_media_asset_end_time_ms"), "reusable_template_media_asset_start_time_ms");
                }

                public SegmentsInfo(int i) {
                    super(i);
                }

                public SegmentsInfo() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class TimedTextsInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -502198144;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return TimedTextsInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                /* loaded from: classes11.dex */
                public final class TextInfoList extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1427806528;

                    /* loaded from: classes11.dex */
                    public final class Colors extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList.Colors {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -156043867;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return Colors.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList.Colors
                        public int getCount() {
                            return getRequiredIntField(0, "count");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList.Colors
                        public String getHexRgbaColor() {
                            return AbstractC65702TsY.A0a(this, "hex_rgba_color", 1);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList.Colors
                        public boolean hasCount() {
                            return true;
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public Colors(int i) {
                            super(i);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0Y(AbstractC58318PtA.A0Q(), new C4OW(AbstractC58319PtB.A0R(), "count"), "hex_rgba_color");
                        }

                        public Colors() {
                            super(TYPE_TAG);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return TextInfoList.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public double getEndTimeMs() {
                        return getRequiredDoubleField(2, "end_time_ms");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public double getFontSize() {
                        return getRequiredDoubleField(3, "font_size");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public double getHeight() {
                        return getRequiredDoubleField(4, IgReactMediaPickerNativeModule.HEIGHT);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public String getId() {
                        return AbstractC65702TsY.A0a(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 5);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public double getOffsetX() {
                        return getRequiredDoubleField(7, "offset_x");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public boolean hasEndTimeMs() {
                        return true;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public boolean hasFontSize() {
                        return true;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public boolean hasHeight() {
                        return true;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public boolean hasIsAnimated() {
                        return true;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public boolean hasOffsetX() {
                        return true;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public boolean hasOffsetY() {
                        return true;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public boolean hasRotationDegree() {
                        return true;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public boolean hasScale() {
                        return true;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public boolean hasStartTimeMs() {
                        return true;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public boolean hasWidth() {
                        return true;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public boolean hasZIndex() {
                        return true;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public int isAnimated() {
                        return getRequiredIntField(6, "is_animated");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public VF6 getAlignment() {
                        Enum requiredEnumField = getRequiredEnumField(0, "alignment", VF6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                        C14360o3.A07(requiredEnumField);
                        return (VF6) requiredEnumField;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public ImmutableList getColors() {
                        return getRequiredCompactedTreeListField(1, "colors", Colors.class, Colors.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public double getOffsetY() {
                        return getRequiredDoubleField(8, "offset_y");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public double getRotationDegree() {
                        return getRequiredDoubleField(9, "rotation_degree");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public double getScale() {
                        return getRequiredDoubleField(10, "scale");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public double getStartTimeMs() {
                        return getRequiredDoubleField(11, "start_time_ms");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public String getText() {
                        return AbstractC65702TsY.A0a(this, "text", 12);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public VF7 getTextEmphasisMode() {
                        Enum requiredEnumField = getRequiredEnumField(13, "text_emphasis_mode", VF7.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                        C14360o3.A07(requiredEnumField);
                        return (VF7) requiredEnumField;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public EnumC223249tA getTextFormatType() {
                        Enum requiredEnumField = getRequiredEnumField(14, "text_format_type", EnumC223249tA.A02);
                        C14360o3.A07(requiredEnumField);
                        return (EnumC223249tA) requiredEnumField;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public double getWidth() {
                        return getRequiredDoubleField(15, IgReactMediaPickerNativeModule.WIDTH);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList
                    public int getZIndex() {
                        return getRequiredIntField(16, "z_index");
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        C94754Oe c94754Oe = C94754Oe.A00;
                        C4OW c4ow = new C4OW(new C94774Oi(c94754Oe), "alignment");
                        C4OK c4ok = new C4OK(C4OO.A02(), Colors.class, "colors", Colors.TYPE_TAG);
                        C173847oc c173847oc = C173847oc.A00;
                        C4OW A0E = AbstractC65703TsZ.A0E(c173847oc);
                        C4OW c4ow2 = new C4OW(new C94774Oi(c173847oc), "font_size");
                        C4OW A0L = AbstractC65703TsZ.A0L(c173847oc);
                        C4OW A0P = AbstractC58320PtC.A0P(c94754Oe);
                        C94894Ou c94894Ou = C94894Ou.A00;
                        return new C4OU(new C4OM[]{c4ow, c4ok, A0E, c4ow2, A0L, A0P, new C4OW(new C94774Oi(c94894Ou), "is_animated"), AbstractC65703TsZ.A0N(c173847oc), new C4OW(new C94774Oi(c173847oc), "offset_y"), new C4OW(new C94774Oi(c173847oc), "rotation_degree"), new C4OW(new C94774Oi(c173847oc), "scale"), new C4OW(new C94774Oi(c173847oc), "start_time_ms"), AbstractC58319PtB.A0C(new C94774Oi(c94754Oe)), new C4OW(new C94774Oi(c94754Oe), "text_emphasis_mode"), new C4OW(new C94774Oi(c94754Oe), "text_format_type"), AbstractC58319PtB.A0M(new C94774Oi(c173847oc)), new C4OW(new C94774Oi(c94894Ou), "z_index")});
                    }

                    public TextInfoList(int i) {
                        super(i);
                    }

                    public TextInfoList() {
                        super(TYPE_TAG);
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo
                public ImmutableList getTextInfoList() {
                    return A06(TextInfoList.class, "text_info_list", TextInfoList.TYPE_TAG);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0W(C4OO.A02(), TextInfoList.class, "text_info_list", TextInfoList.TYPE_TAG);
                }

                public TimedTextsInfo(int i) {
                    super(i);
                }

                public TimedTextsInfo() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class TransitionEffectsInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TransitionEffectsInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -71381185;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return TransitionEffectsInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TransitionEffectsInfo
                public long getDurationInMs() {
                    return getRequiredTimeField(0, "duration_in_ms");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TransitionEffectsInfo
                public int getIndex() {
                    return getCoercedIntField(1, "index");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TransitionEffectsInfo
                public String getName() {
                    return AbstractC65702TsY.A0a(this, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 2);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TransitionEffectsInfo
                public long getStartTimeInMs() {
                    return getRequiredTimeField(3, "start_time_in_ms");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TransitionEffectsInfo
                public boolean hasDurationInMs() {
                    return true;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TransitionEffectsInfo
                public boolean hasStartTimeInMs() {
                    return true;
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TransitionEffectsInfo
                public boolean hasIndex() {
                    return hasFieldValue("index");
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    C67A c67a = C67A.A00;
                    return AbstractC58320PtC.A0U(new C94774Oi(c67a), AbstractC65703TsZ.A0d(c67a), new C4OW(C94894Ou.A00, "index"), AbstractC65703TsZ.A0K(C94754Oe.A00), "start_time_in_ms");
                }

                public TransitionEffectsInfo(int i) {
                    super(i);
                }

                public TransitionEffectsInfo() {
                    super(TYPE_TAG);
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo
            public long getTemplateClipsMediaId() {
                return getRequiredTimeField(4, "template_clips_media_id");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo
            public boolean hasTemplateClipsMediaId() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo
            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.AttributionInfo getAttributionInfo() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.AttributionInfo) A03(AttributionInfo.class, "attribution_info", AttributionInfo.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo
            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.EffectsInfo getEffectsInfo() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.EffectsInfo) A02(EffectsInfo.class, "effects_info", EffectsInfo.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo
            public int getMinNumSegments() {
                return A00("min_num_segments");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo
            public ImmutableList getSegmentsInfo() {
                return getRequiredCompactedTreeListField(3, "segments_info", SegmentsInfo.class, SegmentsInfo.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo
            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo getTimedTextsInfo() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo) getOptionalTreeField(5, "timed_texts_info", TimedTextsInfo.class, TimedTextsInfo.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo
            public ImmutableList getTransitionEffectsInfo() {
                return getOptionalCompactedTreeListField(6, "transition_effects_info", TransitionEffectsInfo.class, TransitionEffectsInfo.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo
            public boolean hasMinNumSegments() {
                return hasFieldValue("min_num_segments");
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return new C4OU(new C4OM[]{new C4OK(AttributionInfo.class, "attribution_info", AttributionInfo.TYPE_TAG), new C4OK(EffectsInfo.class, "effects_info", EffectsInfo.TYPE_TAG), new C4OW(C94894Ou.A00, "min_num_segments"), new C4OK(C4OO.A02(), SegmentsInfo.class, "segments_info", SegmentsInfo.TYPE_TAG), new C4OW(new C94774Oi(C67A.A00), "template_clips_media_id"), new C4OK(TimedTextsInfo.class, "timed_texts_info", TimedTextsInfo.TYPE_TAG), new C4OK(C4OO.A00(), TransitionEffectsInfo.class, "transition_effects_info", TransitionEffectsInfo.TYPE_TAG)});
            }

            public TemplateInfo(int i) {
                super(i);
            }

            public TemplateInfo() {
                super(TYPE_TAG);
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public String getClipsCreationEntryPoint() {
            return getOptionalStringField(6, "clips_creation_entry_point");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AchievementsInfo getAchievementsInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AchievementsInfo) A03(AchievementsInfo.class, "achievements_info", AchievementsInfo.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AdditionalAudioInfo getAdditionalAudioInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AdditionalAudioInfo) A02(AdditionalAudioInfo.class, "additional_audio_info", AdditionalAudioInfo.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AssetRecommendationInfo getAssetRecommendationInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AssetRecommendationInfo) A04(AssetRecommendationInfo.class, "asset_recommendation_info", AssetRecommendationInfo.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AudioRankingInfo getAudioRankingInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AudioRankingInfo) getOptionalTreeField(3, "audio_ranking_info", AudioRankingInfo.class, AudioRankingInfo.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public VFB getAudioType() {
            return (VFB) getOptionalEnumField(4, "audio_type", VFB.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.BrandedContentTagInfo getBrandedContentTagInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.BrandedContentTagInfo) getOptionalTreeField(5, "branded_content_tag_info", BrandedContentTagInfo.class, BrandedContentTagInfo.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo getContentAppreciationInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo) getOptionalTreeField(7, "content_appreciation_info", ContentAppreciationInfo.class, ContentAppreciationInfo.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContextualHighlightInfo getContextualHighlightInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContextualHighlightInfo) getOptionalTreeField(8, "contextual_highlight_info", ContextualHighlightInfo.class, ContextualHighlightInfo.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public boolean getDisableUseInClipsClientCache() {
            return getCoercedBooleanField(9, "disable_use_in_clips_client_cache");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo getMashupInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo) getOptionalTreeField(13, "mashup_info", MashupInfo.class, MashupInfo.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MerchandisingPillInfo getMerchandisingPillInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MerchandisingPillInfo) getOptionalTreeField(14, "merchandising_pill_info", MerchandisingPillInfo.class, MerchandisingPillInfo.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public String getMusicCanonicalId() {
            return getOptionalStringField(15, "music_canonical_id");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo getMusicInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo) getOptionalTreeField(16, "music_info", MusicInfo.class, MusicInfo.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo getOriginalSoundInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo) getOptionalTreeField(17, "original_sound_info", OriginalSoundInfo.class, OriginalSoundInfo.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public int getProfessionalClipsUpsellType() {
            return getCoercedIntField(18, "professional_clips_upsell_type");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public String getReusableTextAttributeString() {
            return getOptionalStringField(19, "reusable_text_attribute_string");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo getShoppingInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo) getOptionalTreeField(20, "shopping_info", ShoppingInfo.class, ShoppingInfo.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public boolean getShowAchievements() {
            return getCoercedBooleanField(21, "show_achievements");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public boolean getShowTips() {
            return getCoercedBooleanField(22, "show_tips");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo getTemplateInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo) getOptionalTreeField(23, "template_info", TemplateInfo.class, TemplateInfo.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public boolean hasDisableUseInClipsClientCache() {
            return hasFieldValue("disable_use_in_clips_client_cache");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public boolean hasIsFanClubPromoVideo() {
            return hasFieldValue("is_fan_club_promo_video");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public boolean hasIsPublicChatWelcomeVideo() {
            return hasFieldValue("is_public_chat_welcome_video");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public boolean hasIsSharedToFb() {
            return hasFieldValue("is_shared_to_fb");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public boolean hasProfessionalClipsUpsellType() {
            return hasFieldValue("professional_clips_upsell_type");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public boolean hasShowAchievements() {
            return hasFieldValue("show_achievements");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public boolean hasShowTips() {
            return hasFieldValue("show_tips");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public boolean isFanClubPromoVideo() {
            return getCoercedBooleanField(10, "is_fan_club_promo_video");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public boolean isPublicChatWelcomeVideo() {
            return getCoercedBooleanField(11, "is_public_chat_welcome_video");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata
        public boolean isSharedToFb() {
            return getCoercedBooleanField(12, "is_shared_to_fb");
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C4OK c4ok = new C4OK(AchievementsInfo.class, "achievements_info", AchievementsInfo.TYPE_TAG);
            C4OK c4ok2 = new C4OK(AdditionalAudioInfo.class, "additional_audio_info", AdditionalAudioInfo.TYPE_TAG);
            C4OK c4ok3 = new C4OK(AssetRecommendationInfo.class, "asset_recommendation_info", AssetRecommendationInfo.TYPE_TAG);
            C4OK c4ok4 = new C4OK(AudioRankingInfo.class, "audio_ranking_info", AudioRankingInfo.TYPE_TAG);
            C94754Oe c94754Oe = C94754Oe.A00;
            C4OW c4ow = new C4OW(c94754Oe, "audio_type");
            C4OK c4ok5 = new C4OK(BrandedContentTagInfo.class, "branded_content_tag_info", BrandedContentTagInfo.TYPE_TAG);
            C4OW c4ow2 = new C4OW(c94754Oe, "clips_creation_entry_point");
            C4OK c4ok6 = new C4OK(ContentAppreciationInfo.class, "content_appreciation_info", ContentAppreciationInfo.TYPE_TAG);
            C4OK c4ok7 = new C4OK(ContextualHighlightInfo.class, "contextual_highlight_info", ContextualHighlightInfo.TYPE_TAG);
            C95124Py c95124Py = C95124Py.A00;
            return new C4OU(new C4OM[]{c4ok, c4ok2, c4ok3, c4ok4, c4ow, c4ok5, c4ow2, c4ok6, c4ok7, new C4OW(c95124Py, "disable_use_in_clips_client_cache"), new C4OW(c95124Py, "is_fan_club_promo_video"), new C4OW(c95124Py, "is_public_chat_welcome_video"), new C4OW(c95124Py, "is_shared_to_fb"), new C4OK(MashupInfo.class, "mashup_info", MashupInfo.TYPE_TAG), new C4OK(MerchandisingPillInfo.class, "merchandising_pill_info", MerchandisingPillInfo.TYPE_TAG), new C4OW(c94754Oe, "music_canonical_id"), new C4OK(MusicInfo.class, "music_info", MusicInfo.TYPE_TAG), new C4OK(OriginalSoundInfo.class, "original_sound_info", OriginalSoundInfo.TYPE_TAG), new C4OW(C94894Ou.A00, "professional_clips_upsell_type"), new C4OW(c94754Oe, "reusable_text_attribute_string"), new C4OK(ShoppingInfo.class, "shopping_info", ShoppingInfo.TYPE_TAG), new C4OW(c95124Py, "show_achievements"), new C4OW(c95124Py, "show_tips"), new C4OK(TemplateInfo.class, "template_info", TemplateInfo.TYPE_TAG)});
        }

        public ClipsMetadata(int i) {
            super(i);
        }

        public ClipsMetadata() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class CoauthorProducers extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.CoauthorProducers {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -1985484072;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return CoauthorProducers.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CoauthorProducers
        public boolean getHasOnboardedToTextPostApp() {
            return getCoercedBooleanField(1, "has_onboarded_to_text_post_app");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CoauthorProducers
        public String getPkId() {
            return getOptionalStringField(6, "pk_id");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CoauthorProducers
        public String getProfilePicId() {
            return getOptionalStringField(7, "profile_pic_id");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CoauthorProducers
        public boolean isPrivate() {
            return getCoercedBooleanField(3, "is_private");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CoauthorProducers
        public boolean isVerified() {
            return getCoercedBooleanField(4, "is_verified");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CoauthorProducers
        public String getFullName() {
            return A07("full_name");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CoauthorProducers
        public String getId() {
            return A09("strong_id__");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CoauthorProducers
        public String getPk() {
            return A0C("pk");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CoauthorProducers
        public String getProfilePicUrl() {
            return A0D("profile_pic_url");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CoauthorProducers
        public String getUsername() {
            return getOptionalStringField(9, AbstractC70143W6w.A00());
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CoauthorProducers
        public boolean hasHasOnboardedToTextPostApp() {
            return hasFieldValue("has_onboarded_to_text_post_app");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CoauthorProducers
        public boolean hasIsPrivate() {
            return hasFieldValue("is_private");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CoauthorProducers
        public boolean hasIsVerified() {
            return hasFieldValue("is_verified");
        }

        public CoauthorProducers(int i) {
            super(i);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC65704Tsa.A04();
        }

        public CoauthorProducers() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class CommentInformTreatment extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.CommentInformTreatment {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1520671882;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return CommentInformTreatment.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CommentInformTreatment
        public boolean getShouldHaveInformTreatment() {
            return getRequiredBooleanField(0, "should_have_inform_treatment");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CommentInformTreatment
        public String getText() {
            return AbstractC65702TsY.A0a(this, "text", 1);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CommentInformTreatment
        public boolean hasShouldHaveInformTreatment() {
            return true;
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CommentInformTreatment(int i) {
            super(i);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Y(AbstractC58318PtA.A0Q(), new C4OW(AbstractC58319PtB.A0S(), "should_have_inform_treatment"), "text");
        }

        public CommentInformTreatment() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundClipsMediaImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* loaded from: classes11.dex */
    public final class CreativeConfig extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1648337249;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return CreativeConfig.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class CreationToolInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.CreationToolInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 1546691690;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return CreationToolInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.CreationToolInfo
            public int getAppearanceEffect() {
                return getRequiredIntField(0, "appearance_effect");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.CreationToolInfo
            public int getCameraTool() {
                return getRequiredIntField(1, "camera_tool");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.CreationToolInfo
            public String getColorFilters() {
                return AbstractC65702TsY.A0a(this, "color_filters", 2);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.CreationToolInfo
            public double getDurationSelectorSeconds() {
                return getCoercedDoubleField(3, "duration_selector_seconds");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.CreationToolInfo
            public double getSpeedSelector() {
                return getCoercedDoubleField(4, "speed_selector");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.CreationToolInfo
            public double getTimerSelectorSeconds() {
                return getCoercedDoubleField(5, "timer_selector_seconds");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.CreationToolInfo
            public boolean hasAppearanceEffect() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.CreationToolInfo
            public boolean hasCameraTool() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.CreationToolInfo
            public boolean hasDurationSelectorSeconds() {
                return hasFieldValue("duration_selector_seconds");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.CreationToolInfo
            public boolean hasSpeedSelector() {
                return hasFieldValue("speed_selector");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.CreationToolInfo
            public boolean hasTimerSelectorSeconds() {
                return hasFieldValue("timer_selector_seconds");
            }

            public CreationToolInfo(int i) {
                super(i);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC65703TsZ.A0z();
            }

            public CreationToolInfo() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class EffectConfigs extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 81273071;

            /* loaded from: classes11.dex */
            public final class AttributionUser extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.AttributionUser {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 1102210384;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return AttributionUser.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                /* loaded from: classes11.dex */
                public final class ProfilePicture extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.AttributionUser.ProfilePicture {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 250896392;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return ProfilePicture.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.AttributionUser.ProfilePicture
                    public String getUri() {
                        return A07("uri");
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0Z(C94754Oe.A00, "uri");
                    }

                    public ProfilePicture(int i) {
                        super(i);
                    }

                    public ProfilePicture() {
                        super(TYPE_TAG);
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.AttributionUser
                public String getInstagramUserId() {
                    return A07(AbstractC111324zv.A00(1024));
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.AttributionUser
                public CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.AttributionUser.ProfilePicture getProfilePicture() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.AttributionUser.ProfilePicture) A02(ProfilePicture.class, "profile_picture", ProfilePicture.TYPE_TAG);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC167017dG.A0X(c94754Oe, new C4OW(c94754Oe, AbstractC111324zv.A00(1024)), new C4OK(ProfilePicture.class, "profile_picture", ProfilePicture.TYPE_TAG), AbstractC70143W6w.A00());
                }

                public AttributionUser(int i) {
                    super(i);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.AttributionUser
                public String getUsername() {
                    return A09(AbstractC70143W6w.A00());
                }

                public AttributionUser() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return EffectConfigs.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class ThumbnailImage extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.ThumbnailImage {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -298164445;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return ThumbnailImage.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.ThumbnailImage
                public String getUri() {
                    return A07("uri");
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0Z(C94754Oe.A00, "uri");
                }

                public ThumbnailImage(int i) {
                    super(i);
                }

                public ThumbnailImage() {
                    super(TYPE_TAG);
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs
            public String getId() {
                return AbstractC65702TsY.A0a(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 4);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs
            public String getName() {
                return AbstractC65702TsY.A0a(this, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 6);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs
            public String getSaveStatus() {
                return AbstractC65702TsY.A0a(this, "save_status", 7);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs
            public boolean isAgeRestricted() {
                return getCoercedBooleanField(5, "is_age_restricted");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs
            public CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.AttributionUser getAttributionUser() {
                C2JS A05 = A05(AttributionUser.class, "attribution_user", AttributionUser.TYPE_TAG);
                C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.CreativeConfig.EffectConfigs.AttributionUser");
                return (AttributionUser) A05;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs
            public String getEffectId() {
                return A08("effect_id");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs
            public String getFailureCode() {
                return A09("failure_code");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs
            public String getFailureReason() {
                return A0A(TraceFieldType.FailureReason);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs
            public CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.ThumbnailImage getThumbnailImage() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.ThumbnailImage) getOptionalTreeField(8, "thumbnail_image", ThumbnailImage.class, ThumbnailImage.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs
            public String getTitle() {
                return getOptionalStringField(9, DialogModule.KEY_TITLE);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs
            public boolean hasIsAgeRestricted() {
                return hasFieldValue("is_age_restricted");
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                C4OK c4ok = new C4OK(C4OO.A01(), AttributionUser.class, "attribution_user", AttributionUser.TYPE_TAG);
                C94754Oe c94754Oe = C94754Oe.A00;
                return new C4OU(new C4OM[]{c4ok, new C4OW(c94754Oe, "effect_id"), new C4OW(c94754Oe, "failure_code"), new C4OW(c94754Oe, TraceFieldType.FailureReason), AbstractC58320PtC.A0P(c94754Oe), new C4OW(C95124Py.A00, "is_age_restricted"), AbstractC65703TsZ.A0K(c94754Oe), new C4OW(new C94774Oi(c94754Oe), "save_status"), new C4OK(ThumbnailImage.class, "thumbnail_image", ThumbnailImage.TYPE_TAG), AbstractC58319PtB.A0L(c94754Oe)});
            }

            public EffectConfigs(int i) {
                super(i);
            }

            public EffectConfigs() {
                super(TYPE_TAG);
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig
        public String getCaptureType() {
            return A07("capture_type");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig
        public ImmutableList getCreationToolInfo() {
            return getOptionalCompactedTreeListField(1, "creation_tool_info", CreationToolInfo.class, CreationToolInfo.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig
        public ImmutableList getEffectConfigs() {
            return getOptionalCompactedTreeListField(2, "effect_configs", EffectConfigs.class, EffectConfigs.TYPE_TAG);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC58319PtB.A0T(new C4OW(C94754Oe.A00, "capture_type"), new C4OK(C4OO.A00(), CreationToolInfo.class, "creation_tool_info", CreationToolInfo.TYPE_TAG), new C4OK(C4OO.A00(), EffectConfigs.class, "effect_configs", EffectConfigs.TYPE_TAG));
        }

        public CreativeConfig(int i) {
            super(i);
        }

        public CreativeConfig() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class FacepileTopLikers extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.FacepileTopLikers {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -1163259431;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return FacepileTopLikers.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FacepileTopLikers
        public String getProfilePicId() {
            return getOptionalStringField(6, "profile_pic_id");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FacepileTopLikers
        public String getProfilePicUrl() {
            return getOptionalStringField(7, "profile_pic_url");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FacepileTopLikers
        public boolean isPrivate() {
            return getCoercedBooleanField(2, "is_private");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FacepileTopLikers
        public boolean isVerified() {
            return getCoercedBooleanField(3, "is_verified");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FacepileTopLikers
        public String getFullName() {
            return A07("full_name");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FacepileTopLikers
        public String getId() {
            return A08("strong_id__");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FacepileTopLikers
        public String getPk() {
            return A0B("pk");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FacepileTopLikers
        public String getPkId() {
            return A0C("pk_id");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FacepileTopLikers
        public boolean hasIsPrivate() {
            return hasFieldValue("is_private");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FacepileTopLikers
        public boolean hasIsVerified() {
            return hasFieldValue("is_verified");
        }

        public FacepileTopLikers(int i) {
            super(i);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FacepileTopLikers
        public String getUsername() {
            return A0D(AbstractC70143W6w.A00());
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC65703TsZ.A0n();
        }

        public FacepileTopLikers() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class FundraiserTag extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -1902318741;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return FundraiserTag.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public boolean getCanViewerDonate() {
            return getCoercedBooleanField(2, "can_viewer_donate");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public boolean getCanViewerRemoveFundraiserTag() {
            return getCoercedBooleanField(3, "can_viewer_remove_fundraiser_tag");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public String getFormattedFundraiserProgressInfoText() {
            return getOptionalStringField(6, "formatted_fundraiser_progress_info_text");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public String getFormattedGoalAmount() {
            return getOptionalStringField(7, "formatted_goal_amount");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public String getBeneficiaryName() {
            return A07("beneficiary_name");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public String getBeneficiaryUsername() {
            return A08("beneficiary_username");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public String getContextualTitleStr() {
            return A0B("contextual_title_str");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public String getFormattedAmountRaised() {
            return A0C("formatted_amount_raised");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public String getFundraiserId() {
            return A0D("fundraiser_id");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public String getFundraiserOwnerUsername() {
            return getOptionalStringField(9, "fundraiser_owner_username");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public String getFundraiserTitle() {
            return getOptionalStringField(10, "fundraiser_title");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public EnumC72385XcL getFundraiserType() {
            return (EnumC72385XcL) getOptionalEnumField(11, "fundraiser_type", EnumC72385XcL.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public String getProgressStr() {
            return getOptionalStringField(13, "progress_str");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public boolean getShowFundraiserOwnerAttribution() {
            return getCoercedBooleanField(14, "show_fundraiser_owner_attribution");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public String getThumbnailDisplayUrl() {
            return getOptionalStringField(15, "thumbnail_display_url");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public boolean hasCanViewerDonate() {
            return hasFieldValue("can_viewer_donate");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public boolean hasCanViewerRemoveFundraiserTag() {
            return hasFieldValue("can_viewer_remove_fundraiser_tag");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public boolean hasIsMediaOwnerFundraiserOwner() {
            return hasFieldValue("is_media_owner_fundraiser_owner");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public boolean hasShowFundraiserOwnerAttribution() {
            return hasFieldValue("show_fundraiser_owner_attribution");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag
        public boolean isMediaOwnerFundraiserOwner() {
            return getCoercedBooleanField(12, "is_media_owner_fundraiser_owner");
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            C4OW c4ow = new C4OW(c94754Oe, "beneficiary_name");
            C4OW c4ow2 = new C4OW(c94754Oe, "beneficiary_username");
            C95124Py c95124Py = C95124Py.A00;
            return new C4OU(new C4OM[]{c4ow, c4ow2, new C4OW(c95124Py, "can_viewer_donate"), new C4OW(c95124Py, "can_viewer_remove_fundraiser_tag"), new C4OW(c94754Oe, "contextual_title_str"), new C4OW(c94754Oe, "formatted_amount_raised"), new C4OW(c94754Oe, "formatted_fundraiser_progress_info_text"), new C4OW(c94754Oe, "formatted_goal_amount"), new C4OW(c94754Oe, "fundraiser_id"), new C4OW(c94754Oe, "fundraiser_owner_username"), new C4OW(c94754Oe, "fundraiser_title"), new C4OW(c94754Oe, "fundraiser_type"), new C4OW(c95124Py, "is_media_owner_fundraiser_owner"), new C4OW(c94754Oe, "progress_str"), new C4OW(c95124Py, "show_fundraiser_owner_attribution"), new C4OW(c94754Oe, "thumbnail_display_url")});
        }

        public FundraiserTag(int i) {
            super(i);
        }

        public FundraiserTag() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class IgtvSeriesInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvSeriesInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1712175069;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return IgtvSeriesInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvSeriesInfo
        public boolean getHasCoverPhoto() {
            return getRequiredBooleanField(0, "has_cover_photo");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvSeriesInfo
        public String getId() {
            return AbstractC65702TsY.A0a(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 1);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvSeriesInfo
        public int getNumEpisodes() {
            return getRequiredIntField(2, "num_episodes");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvSeriesInfo
        public String getTitle() {
            return AbstractC65702TsY.A0a(this, DialogModule.KEY_TITLE, 3);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvSeriesInfo
        public boolean hasHasCoverPhoto() {
            return true;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvSeriesInfo
        public boolean hasNumEpisodes() {
            return true;
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public IgtvSeriesInfo(int i) {
            super(i);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C4OW c4ow = new C4OW(AbstractC58319PtB.A0S(), "has_cover_photo");
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC58320PtC.A0U(new C94774Oi(c94754Oe), c4ow, AbstractC58320PtC.A0P(c94754Oe), new C4OW(AbstractC58319PtB.A0R(), "num_episodes"), DialogModule.KEY_TITLE);
        }

        public IgtvSeriesInfo() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class IgtvShoppingInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1621764238;

        /* loaded from: classes11.dex */
        public final class ClipsShoppingCtaBar extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.ClipsShoppingCtaBar {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 1534300329;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return ClipsShoppingCtaBar.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.ClipsShoppingCtaBar
            public double getAnimationTimeSec() {
                return getCoercedDoubleField(0, "animation_time_sec");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.ClipsShoppingCtaBar
            public int getDwellTimeSec() {
                return getCoercedIntField(4, "dwell_time_sec");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.ClipsShoppingCtaBar
            public String getToggledDestination() {
                return getOptionalStringField(6, "toggled_destination");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.ClipsShoppingCtaBar
            public String getToggledTitle() {
                return getOptionalStringField(7, "toggled_title");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.ClipsShoppingCtaBar
            public String getCtaBarType() {
                return A08("cta_bar_type");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.ClipsShoppingCtaBar
            public String getDestination() {
                return A09("destination");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.ClipsShoppingCtaBar
            public String getDominantColor() {
                return A0A("dominant_color");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.ClipsShoppingCtaBar
            public String getTitle() {
                return A0C(DialogModule.KEY_TITLE);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.ClipsShoppingCtaBar
            public boolean hasAnimationTimeSec() {
                return hasFieldValue("animation_time_sec");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.ClipsShoppingCtaBar
            public boolean hasDwellTimeSec() {
                return hasFieldValue("dwell_time_sec");
            }

            public ClipsShoppingCtaBar(int i) {
                super(i);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC65703TsZ.A0m();
            }

            public ClipsShoppingCtaBar() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return IgtvShoppingInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class Merchant extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Merchant {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 320826530;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Merchant.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Merchant
            public boolean getDisabledSharingProductsToGuides() {
                return getCoercedBooleanField(0, "disabled_sharing_products_to_guides");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Merchant
            public boolean isVerified() {
                return getCoercedBooleanField(2, "is_verified");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Merchant
            public String getId() {
                return A08("strong_id__");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Merchant
            public String getPk() {
                return A0A("pk");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Merchant
            public String getProfilePicUrl() {
                return A0B("profile_pic_url");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Merchant
            public boolean hasDisabledSharingProductsToGuides() {
                return hasFieldValue("disabled_sharing_products_to_guides");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Merchant
            public boolean hasIsVerified() {
                return hasFieldValue("is_verified");
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                C95124Py c95124Py = C95124Py.A00;
                C4OW c4ow = new C4OW(c95124Py, "disabled_sharing_products_to_guides");
                C94754Oe c94754Oe = C94754Oe.A00;
                return new C4OU(new C4OM[]{c4ow, AbstractC166997dE.A0V(c94754Oe), new C4OW(c95124Py, "is_verified"), new C4OW(c94754Oe, "pk"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, AbstractC70143W6w.A00())});
            }

            public Merchant(int i) {
                super(i);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Merchant
            public String getUsername() {
                return A0C(AbstractC70143W6w.A00());
            }

            public Merchant() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class Products extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -1787573575;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Products.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class ProductDetails extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1359139002;

                /* loaded from: classes11.dex */
                public final class AggregatedRating extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.AggregatedRating {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1885043071;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return AggregatedRating.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.AggregatedRating
                    public int getRatingCount() {
                        return getCoercedIntField(0, "rating_count");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.AggregatedRating
                    public double getValue() {
                        return getCoercedDoubleField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.AggregatedRating
                    public boolean hasRatingCount() {
                        return hasFieldValue("rating_count");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.AggregatedRating
                    public boolean hasValue() {
                        return hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    }

                    public AggregatedRating(int i) {
                        super(i);
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC65703TsZ.A0s();
                    }

                    public AggregatedRating() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class ArtsLabels extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ArtsLabels {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1592089914;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return ArtsLabels.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class Labels extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ArtsLabels.Labels {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1529944581;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return Labels.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ArtsLabels.Labels
                        public String getLabelDisplayValue() {
                            return A07("label_display_value");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ArtsLabels.Labels
                        public String getLabelType() {
                            return A08("label_type");
                        }

                        public Labels(int i) {
                            super(i);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC65703TsZ.A0u();
                        }

                        public Labels() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ArtsLabels
                    public ImmutableList getLabels() {
                        return getOptionalCompactedTreeListField(0, "labels", Labels.class, Labels.TYPE_TAG);
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0W(C4OO.A00(), Labels.class, "labels", Labels.TYPE_TAG);
                    }

                    public ArtsLabels(int i) {
                        super(i);
                    }

                    public ArtsLabels() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class CheckoutProperties extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -2088610911;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return CheckoutProperties.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class CurrencyAmount extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -204789975;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return CurrencyAmount.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount
                        public int getOffset() {
                            return getCoercedIntField(3, "offset");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount
                        public String getAmount() {
                            return A07("amount");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount
                        public String getAmountWithOffset() {
                            return A08("amount_with_offset");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount
                        public String getCurrency() {
                            return A09("currency");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount
                        public boolean hasOffset() {
                            return hasFieldValue("offset");
                        }

                        public CurrencyAmount(int i) {
                            super(i);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC65703TsZ.A0o();
                        }

                        public CurrencyAmount() {
                            super(TYPE_TAG);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class ShippingAndReturn extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 864452211;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ShippingAndReturn.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class ShippingCost extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -1312496822;

                            /* loaded from: classes11.dex */
                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return ShippingCost.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost
                            public int getOffset() {
                                return getCoercedIntField(3, "offset");
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost
                            public String getAmount() {
                                return A07("amount");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost
                            public String getAmountWithOffset() {
                                return A08("amount_with_offset");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost
                            public String getCurrency() {
                                return A09("currency");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost
                            public boolean hasOffset() {
                                return hasFieldValue("offset");
                            }

                            public ShippingCost(int i) {
                                super(i);
                            }

                            @Override // X.C2JS
                            public C4OU modelSelectionSet() {
                                return AbstractC65703TsZ.A0o();
                            }

                            public ShippingCost() {
                                super(TYPE_TAG);
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn
                        public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost getShippingCost() {
                            return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost) A03(ShippingCost.class, "shipping_cost", ShippingCost.TYPE_TAG);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn
                        public String getShippingCostStripped() {
                            return A08("shipping_cost_stripped");
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0Y(C94754Oe.A00, new C4OK(ShippingCost.class, "shipping_cost", ShippingCost.TYPE_TAG), "shipping_cost_stripped");
                        }

                        public ShippingAndReturn(int i) {
                            super(i);
                        }

                        public ShippingAndReturn() {
                            super(TYPE_TAG);
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public boolean getCanAddToBag() {
                        return getCoercedBooleanField(0, "can_add_to_bag");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public boolean getCanEnableRestockReminder() {
                        return getCoercedBooleanField(1, "can_enable_restock_reminder");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public boolean getCanShowInventoryQuantity() {
                        return getCoercedBooleanField(2, "can_show_inventory_quantity");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public int getFullInventoryQuantity() {
                        return getCoercedIntField(4, "full_inventory_quantity");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public boolean getHasFreeShipping() {
                        return getCoercedBooleanField(5, "has_free_shipping");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public String getIgReferrerFbid() {
                        return getOptionalStringField(6, "ig_referrer_fbid");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public int getInventoryQuantity() {
                        return getCoercedIntField(7, "inventory_quantity");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount getCurrencyAmount() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount) getOptionalTreeField(3, "currency_amount", CurrencyAmount.class, CurrencyAmount.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public boolean getProductGroupHasInventory() {
                        return getCoercedBooleanField(9, "product_group_has_inventory");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public String getReceiverId() {
                        return getOptionalStringField(10, "receiver_id");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn getShippingAndReturn() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn) getOptionalTreeField(11, "shipping_and_return", ShippingAndReturn.class, ShippingAndReturn.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public int getViewerPurchaseLimit() {
                        return getCoercedIntField(12, "viewer_purchase_limit");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public boolean hasCanAddToBag() {
                        return hasFieldValue("can_add_to_bag");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public boolean hasCanEnableRestockReminder() {
                        return hasFieldValue("can_enable_restock_reminder");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public boolean hasCanShowInventoryQuantity() {
                        return hasFieldValue("can_show_inventory_quantity");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public boolean hasFullInventoryQuantity() {
                        return hasFieldValue("full_inventory_quantity");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public boolean hasHasFreeShipping() {
                        return hasFieldValue("has_free_shipping");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public boolean hasInventoryQuantity() {
                        return hasFieldValue("inventory_quantity");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public boolean hasIsShopifyMerchant() {
                        return hasFieldValue("is_shopify_merchant");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public boolean hasProductGroupHasInventory() {
                        return hasFieldValue("product_group_has_inventory");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public boolean hasViewerPurchaseLimit() {
                        return hasFieldValue("viewer_purchase_limit");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties
                    public boolean isShopifyMerchant() {
                        return getCoercedBooleanField(8, "is_shopify_merchant");
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        C95124Py c95124Py = C95124Py.A00;
                        C4OW c4ow = new C4OW(c95124Py, "can_add_to_bag");
                        C4OW c4ow2 = new C4OW(c95124Py, "can_enable_restock_reminder");
                        C4OW c4ow3 = new C4OW(c95124Py, "can_show_inventory_quantity");
                        C4OK c4ok = new C4OK(CurrencyAmount.class, "currency_amount", CurrencyAmount.TYPE_TAG);
                        C94894Ou c94894Ou = C94894Ou.A00;
                        C4OW c4ow4 = new C4OW(c94894Ou, "full_inventory_quantity");
                        C4OW c4ow5 = new C4OW(c95124Py, "has_free_shipping");
                        C94754Oe c94754Oe = C94754Oe.A00;
                        return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, c4ok, c4ow4, c4ow5, new C4OW(c94754Oe, "ig_referrer_fbid"), new C4OW(c94894Ou, "inventory_quantity"), new C4OW(c95124Py, "is_shopify_merchant"), new C4OW(c95124Py, "product_group_has_inventory"), new C4OW(c94754Oe, "receiver_id"), new C4OK(ShippingAndReturn.class, "shipping_and_return", ShippingAndReturn.TYPE_TAG), new C4OW(c94894Ou, "viewer_purchase_limit")});
                    }

                    public CheckoutProperties(int i) {
                        super(i);
                    }

                    public CheckoutProperties() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class CommerceReviewStatistics extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CommerceReviewStatistics {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 1657497215;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return CommerceReviewStatistics.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CommerceReviewStatistics
                    public double getAverageRating() {
                        return getCoercedDoubleField(0, "average_rating");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CommerceReviewStatistics
                    public int getReviewCount() {
                        return getCoercedIntField(1, "review_count");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CommerceReviewStatistics
                    public boolean hasAverageRating() {
                        return hasFieldValue("average_rating");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CommerceReviewStatistics
                    public boolean hasReviewCount() {
                        return hasFieldValue("review_count");
                    }

                    public CommerceReviewStatistics(int i) {
                        super(i);
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC65703TsZ.A0r();
                    }

                    public CommerceReviewStatistics() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return ProductDetails.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                /* loaded from: classes11.dex */
                public final class DiscountInformation extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.DiscountInformation {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1740040758;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return DiscountInformation.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class Discounts extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.DiscountInformation.Discounts {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -1246871306;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return Discounts.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.DiscountInformation.Discounts
                        public String getId() {
                            return AbstractC65702TsY.A0a(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 2);
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.DiscountInformation.Discounts
                        public String getCtaText() {
                            return A07("cta_text");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.DiscountInformation.Discounts
                        public String getDescription() {
                            return A08(DevServerEntity.COLUMN_DESCRIPTION);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.DiscountInformation.Discounts
                        public String getName() {
                            return A0A(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.DiscountInformation.Discounts
                        public String getSeeDetailsText() {
                            return A0B("see_details_text");
                        }

                        public Discounts(int i) {
                            super(i);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC65703TsZ.A0y();
                        }

                        public Discounts() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.DiscountInformation
                    public ImmutableList getDiscounts() {
                        return getOptionalCompactedTreeListField(0, "discounts", Discounts.class, Discounts.TYPE_TAG);
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0W(C4OO.A00(), Discounts.class, "discounts", Discounts.TYPE_TAG);
                    }

                    public DiscountInformation(int i) {
                        super(i);
                    }

                    public DiscountInformation() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class ImageQualityMetadata extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 740251614;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return ImageQualityMetadata.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class Goodness extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata.Goodness {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 865516424;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return Goodness.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata.Goodness
                        public double getScore() {
                            return getCoercedDoubleField(1, "score");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata.Goodness
                        public String getId() {
                            return A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata.Goodness
                        public boolean hasScore() {
                            return hasFieldValue("score");
                        }

                        public Goodness(int i) {
                            super(i);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC58323PtF.A0S();
                        }

                        public Goodness() {
                            super(TYPE_TAG);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class LifestyleBackground extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata.LifestyleBackground {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -1906728408;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return LifestyleBackground.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata.LifestyleBackground
                        public double getScore() {
                            return getCoercedDoubleField(1, "score");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata.LifestyleBackground
                        public String getId() {
                            return A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata.LifestyleBackground
                        public boolean hasScore() {
                            return hasFieldValue("score");
                        }

                        public LifestyleBackground(int i) {
                            super(i);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC58323PtF.A0S();
                        }

                        public LifestyleBackground() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata
                    public ImmutableList getGoodness() {
                        return getOptionalCompactedTreeListField(0, "goodness", Goodness.class, Goodness.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata
                    public ImmutableList getLifestyleBackground() {
                        return getOptionalCompactedTreeListField(1, "lifestyle_background", LifestyleBackground.class, LifestyleBackground.TYPE_TAG);
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC58320PtC.A0T(C4OO.A00(), new C4OK(C4OO.A00(), Goodness.class, "goodness", Goodness.TYPE_TAG), LifestyleBackground.class, "lifestyle_background", LifestyleBackground.TYPE_TAG);
                    }

                    public ImageQualityMetadata(int i) {
                        super(i);
                    }

                    public ImageQualityMetadata() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class MainImage extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 1051943642;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return MainImage.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class ImageVersions2 extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2 {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -619820846;

                        /* loaded from: classes11.dex */
                        public final class Candidates extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2.Candidates {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = 1482530109;

                            /* loaded from: classes11.dex */
                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return Candidates.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2.Candidates
                            public int getHeight() {
                                return getCoercedIntField(0, IgReactMediaPickerNativeModule.HEIGHT);
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2.Candidates
                            public String getUrl() {
                                return A08("url");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2.Candidates
                            public int getWidth() {
                                return A00(IgReactMediaPickerNativeModule.WIDTH);
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2.Candidates
                            public boolean hasHeight() {
                                return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2.Candidates
                            public boolean hasWidth() {
                                return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
                            }

                            public Candidates(int i) {
                                super(i);
                            }

                            @Override // X.C2JS
                            public C4OU modelSelectionSet() {
                                return AbstractC58323PtF.A0T();
                            }

                            public Candidates() {
                                super(TYPE_TAG);
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ImageVersions2.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2
                        public ImmutableList getCandidates() {
                            return getOptionalCompactedTreeListField(0, "candidates", Candidates.class, Candidates.TYPE_TAG);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0W(C4OO.A00(), Candidates.class, "candidates", Candidates.TYPE_TAG);
                        }

                        public ImageVersions2(int i) {
                            super(i);
                        }

                        public ImageVersions2() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage
                    public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2 getImageVersions2() {
                        C2JS A05 = A05(ImageVersions2.class, "image_versions2", ImageVersions2.TYPE_TAG);
                        C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.IgtvShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2");
                        return (ImageVersions2) A05;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage
                    public String getPreview() {
                        return A08("preview");
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC58323PtF.A0W(C4OO.A01(), ImageVersions2.class, ImageVersions2.TYPE_TAG);
                    }

                    public MainImage(int i) {
                        super(i);
                    }

                    public MainImage() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class Merchant extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.Merchant {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -674047041;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return Merchant.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.Merchant
                    public boolean getDisabledSharingProductsToGuides() {
                        return getCoercedBooleanField(0, "disabled_sharing_products_to_guides");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.Merchant
                    public boolean isVerified() {
                        return getCoercedBooleanField(2, "is_verified");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.Merchant
                    public String getId() {
                        return A08("strong_id__");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.Merchant
                    public String getPk() {
                        return A0A("pk");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.Merchant
                    public String getProfilePicUrl() {
                        return A0B("profile_pic_url");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.Merchant
                    public boolean hasDisabledSharingProductsToGuides() {
                        return hasFieldValue("disabled_sharing_products_to_guides");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.Merchant
                    public boolean hasIsVerified() {
                        return hasFieldValue("is_verified");
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        C95124Py c95124Py = C95124Py.A00;
                        C4OW c4ow = new C4OW(c95124Py, "disabled_sharing_products_to_guides");
                        C94754Oe c94754Oe = C94754Oe.A00;
                        return new C4OU(new C4OM[]{c4ow, AbstractC166997dE.A0V(c94754Oe), new C4OW(c95124Py, "is_verified"), new C4OW(c94754Oe, "pk"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, AbstractC70143W6w.A00())});
                    }

                    public Merchant(int i) {
                        super(i);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.Merchant
                    public String getUsername() {
                        return A0C(AbstractC70143W6w.A00());
                    }

                    public Merchant() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class ThumbnailImage extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1228205993;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return ThumbnailImage.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class ImageVersions2 extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2 {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 525772768;

                        /* loaded from: classes11.dex */
                        public final class Candidates extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2.Candidates {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -792584176;

                            /* loaded from: classes11.dex */
                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return Candidates.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2.Candidates
                            public int getHeight() {
                                return getCoercedIntField(0, IgReactMediaPickerNativeModule.HEIGHT);
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2.Candidates
                            public String getUrl() {
                                return A08("url");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2.Candidates
                            public int getWidth() {
                                return A00(IgReactMediaPickerNativeModule.WIDTH);
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2.Candidates
                            public boolean hasHeight() {
                                return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2.Candidates
                            public boolean hasWidth() {
                                return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
                            }

                            public Candidates(int i) {
                                super(i);
                            }

                            @Override // X.C2JS
                            public C4OU modelSelectionSet() {
                                return AbstractC58323PtF.A0T();
                            }

                            public Candidates() {
                                super(TYPE_TAG);
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ImageVersions2.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2
                        public ImmutableList getCandidates() {
                            return getOptionalCompactedTreeListField(0, "candidates", Candidates.class, Candidates.TYPE_TAG);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0W(C4OO.A00(), Candidates.class, "candidates", Candidates.TYPE_TAG);
                        }

                        public ImageVersions2(int i) {
                            super(i);
                        }

                        public ImageVersions2() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage
                    public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2 getImageVersions2() {
                        C2JS A05 = A05(ImageVersions2.class, "image_versions2", ImageVersions2.TYPE_TAG);
                        C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2");
                        return (ImageVersions2) A05;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage
                    public String getPreview() {
                        return A08("preview");
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC58323PtF.A0W(C4OO.A01(), ImageVersions2.class, ImageVersions2.TYPE_TAG);
                    }

                    public ThumbnailImage(int i) {
                        super(i);
                    }

                    public ThumbnailImage() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class VariantValues extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.VariantValues {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1698068769;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return VariantValues.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.VariantValues
                    public String getId() {
                        return AbstractC65702TsY.A0a(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 0);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.VariantValues
                    public String getName() {
                        return AbstractC65702TsY.A0a(this, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 2);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.VariantValues
                    public String getValue() {
                        return AbstractC65702TsY.A0a(this, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, 4);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.VariantValues
                    public boolean hasIsPreselected() {
                        return true;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.VariantValues
                    public boolean isPreselected() {
                        return getRequiredBooleanField(1, "is_preselected");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.VariantValues
                    public String getNormalizedValue() {
                        return A0A("normalized_value");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.VariantValues
                    public VFE getVisualStyle() {
                        Enum requiredEnumField = getRequiredEnumField(5, "visual_style", VFE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                        C14360o3.A07(requiredEnumField);
                        return (VFE) requiredEnumField;
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        C94754Oe c94754Oe = C94754Oe.A00;
                        return AbstractC65703TsZ.A11(c94754Oe, new C94774Oi(c94754Oe));
                    }

                    public VariantValues(int i) {
                        super(i);
                    }

                    public VariantValues() {
                        super(TYPE_TAG);
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public boolean getCanShareToStory() {
                    return getCoercedBooleanField(2, "can_share_to_story");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public boolean getCanViewerSeeRnr() {
                    return getCoercedBooleanField(3, "can_viewer_see_rnr");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public String getCompoundProductId() {
                    return getOptionalStringField(7, "compound_product_id");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.AggregatedRating getAggregatedRating() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.AggregatedRating) A03(AggregatedRating.class, "aggregated_rating", AggregatedRating.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ArtsLabels getArtsLabels() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ArtsLabels) A02(ArtsLabels.class, "arts_labels", ArtsLabels.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties getCheckoutProperties() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties) getOptionalTreeField(4, "checkout_properties", CheckoutProperties.class, CheckoutProperties.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public EnumC33429Eq0 getCheckoutStyle() {
                    return (EnumC33429Eq0) getOptionalEnumField(5, "checkout_style", EnumC33429Eq0.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CommerceReviewStatistics getCommerceReviewStatistics() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CommerceReviewStatistics) getOptionalTreeField(6, "commerce_review_statistics", CommerceReviewStatistics.class, CommerceReviewStatistics.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public String getCurrentPrice() {
                    return A0D("current_price");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public String getCurrentPriceAmount() {
                    return getOptionalStringField(9, "current_price_amount");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public String getCurrentPriceStripped() {
                    return getOptionalStringField(10, "current_price_stripped");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public String getDescription() {
                    return getOptionalStringField(11, DevServerEntity.COLUMN_DESCRIPTION);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.DiscountInformation getDiscountInformation() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.DiscountInformation) getOptionalTreeField(12, "discount_information", DiscountInformation.class, DiscountInformation.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public String getExternalUrl() {
                    return getOptionalStringField(13, "external_url");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public String getFullPrice() {
                    return getOptionalStringField(14, "full_price");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public String getFullPriceAmount() {
                    return getOptionalStringField(15, "full_price_amount");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public String getFullPriceStripped() {
                    return getOptionalStringField(16, "full_price_stripped");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public boolean getHasVariants() {
                    return getCoercedBooleanField(17, "has_variants");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public boolean getHasViewerSaved() {
                    return getCoercedBooleanField(18, "has_viewer_saved");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public boolean getIgIsProductEditableOnMobile() {
                    return getCoercedBooleanField(19, "ig_is_product_editable_on_mobile");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata getImageQualityMetadata() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata) getOptionalTreeField(20, "image_quality_metadata", ImageQualityMetadata.class, ImageQualityMetadata.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage getMainImage() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage) getOptionalTreeField(23, "main_image", MainImage.class, MainImage.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public String getMainImageId() {
                    return getOptionalStringField(24, "main_image_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.Merchant getMerchant() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.Merchant) getOptionalTreeField(25, "merchant", Merchant.class, Merchant.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public String getName() {
                    return getOptionalStringField(26, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public String getPrice() {
                    return getOptionalStringField(27, "price");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public String getProductId() {
                    return getOptionalStringField(28, "product_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public String getRetailerId() {
                    return getOptionalStringField(29, "retailer_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public String getReviewStatus() {
                    return getOptionalStringField(30, "review_status");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public VFM getSizeCalibrationScore() {
                    return (VFM) getOptionalEnumField(31, "size_calibration_score", VFM.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage getThumbnailImage() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage) getOptionalTreeField(32, "thumbnail_image", ThumbnailImage.class, ThumbnailImage.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public ImmutableList getVariantValues() {
                    return getOptionalCompactedTreeListField(33, "variant_values", VariantValues.class, VariantValues.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public boolean hasCanShareToStory() {
                    return hasFieldValue("can_share_to_story");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public boolean hasCanViewerSeeRnr() {
                    return hasFieldValue("can_viewer_see_rnr");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public boolean hasHasVariants() {
                    return hasFieldValue("has_variants");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public boolean hasHasViewerSaved() {
                    return hasFieldValue("has_viewer_saved");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public boolean hasIgIsProductEditableOnMobile() {
                    return hasFieldValue("ig_is_product_editable_on_mobile");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public boolean hasIsEnteredInDrawing() {
                    return hasFieldValue("is_entered_in_drawing");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public boolean hasIsInStock() {
                    return hasFieldValue("is_in_stock");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public boolean isEnteredInDrawing() {
                    return getCoercedBooleanField(21, "is_entered_in_drawing");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails
                public boolean isInStock() {
                    return getCoercedBooleanField(22, "is_in_stock");
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    C4OM[] c4omArr = new C4OM[34];
                    C4OK c4ok = new C4OK(AggregatedRating.class, "aggregated_rating", AggregatedRating.TYPE_TAG);
                    C4OK c4ok2 = new C4OK(ArtsLabels.class, "arts_labels", ArtsLabels.TYPE_TAG);
                    C95124Py c95124Py = C95124Py.A00;
                    C4OW c4ow = new C4OW(c95124Py, "can_share_to_story");
                    C4OW c4ow2 = new C4OW(c95124Py, "can_viewer_see_rnr");
                    C4OK c4ok3 = new C4OK(CheckoutProperties.class, "checkout_properties", CheckoutProperties.TYPE_TAG);
                    C94754Oe c94754Oe = C94754Oe.A00;
                    boolean A1b = AbstractC31175DnJ.A1b(new C4OM[]{c4ok, c4ok2, c4ow, c4ow2, c4ok3, new C4OW(c94754Oe, "checkout_style"), new C4OK(CommerceReviewStatistics.class, "commerce_review_statistics", CommerceReviewStatistics.TYPE_TAG), new C4OW(c94754Oe, "compound_product_id"), new C4OW(c94754Oe, "current_price"), new C4OW(c94754Oe, "current_price_amount"), new C4OW(c94754Oe, "current_price_stripped"), AbstractC58322PtE.A0Y(c94754Oe), new C4OK(DiscountInformation.class, "discount_information", DiscountInformation.TYPE_TAG), new C4OW(c94754Oe, "external_url"), new C4OW(c94754Oe, "full_price"), new C4OW(c94754Oe, "full_price_amount"), new C4OW(c94754Oe, "full_price_stripped"), new C4OW(c95124Py, "has_variants"), new C4OW(c95124Py, "has_viewer_saved"), new C4OW(c95124Py, "ig_is_product_editable_on_mobile"), new C4OK(ImageQualityMetadata.class, "image_quality_metadata", ImageQualityMetadata.TYPE_TAG), new C4OW(c95124Py, "is_entered_in_drawing"), new C4OW(c95124Py, "is_in_stock"), new C4OK(MainImage.class, "main_image", MainImage.TYPE_TAG), new C4OW(c94754Oe, "main_image_id"), new C4OK(Merchant.class, "merchant", Merchant.TYPE_TAG), AbstractC58321PtD.A0U(c94754Oe)}, c4omArr);
                    return AbstractC58321PtD.A0Z(new C4OM[]{new C4OW(c94754Oe, "price"), new C4OW(c94754Oe, "product_id"), new C4OW(c94754Oe, "retailer_id"), new C4OW(c94754Oe, "review_status"), new C4OW(c94754Oe, "size_calibration_score"), new C4OK(ThumbnailImage.class, "thumbnail_image", ThumbnailImage.TYPE_TAG), new C4OK(C4OO.A00(), VariantValues.class, "variant_values", VariantValues.TYPE_TAG)}, c4omArr, A1b ? 1 : 0, 27, 7);
                }

                public ProductDetails(int i) {
                    super(i);
                }

                public ProductDetails() {
                    super(TYPE_TAG);
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products
            public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails getProductDetails() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails) A03(ProductDetails.class, "product_details", ProductDetails.TYPE_TAG);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC167017dG.A0b(ProductDetails.class, "product_details", ProductDetails.TYPE_TAG);
            }

            public Products(int i) {
                super(i);
            }

            public Products() {
                super(TYPE_TAG);
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo
        public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.ClipsShoppingCtaBar getClipsShoppingCtaBar() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.ClipsShoppingCtaBar) A03(ClipsShoppingCtaBar.class, "clips_shopping_cta_bar", ClipsShoppingCtaBar.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo
        public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Merchant getMerchant() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Merchant) A02(Merchant.class, "merchant", Merchant.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo
        public ImmutableList getProducts() {
            return getOptionalCompactedTreeListField(2, "products", Products.class, Products.TYPE_TAG);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC58319PtB.A0T(new C4OK(ClipsShoppingCtaBar.class, "clips_shopping_cta_bar", ClipsShoppingCtaBar.TYPE_TAG), new C4OK(Merchant.class, "merchant", Merchant.TYPE_TAG), new C4OK(C4OO.A00(), Products.class, "products", Products.TYPE_TAG));
        }

        public IgtvShoppingInfo(int i) {
            super(i);
        }

        public IgtvShoppingInfo() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class ImageVersions2 extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2 {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -2040132517;

        /* loaded from: classes11.dex */
        public final class AdditionalCandidates extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 1971959079;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return AdditionalCandidates.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class FirstFrame extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.FirstFrame {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -843967344;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return FirstFrame.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.FirstFrame
                public int getHeight() {
                    return getCoercedIntField(0, IgReactMediaPickerNativeModule.HEIGHT);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.FirstFrame
                public int getWidth() {
                    return getCoercedIntField(3, IgReactMediaPickerNativeModule.WIDTH);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.FirstFrame
                public String getScansProfile() {
                    return A08("scans_profile");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.FirstFrame
                public String getUrl() {
                    return A09("url");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.FirstFrame
                public boolean hasHeight() {
                    return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.FirstFrame
                public boolean hasWidth() {
                    return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
                }

                public FirstFrame(int i) {
                    super(i);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC58323PtF.A0R();
                }

                public FirstFrame() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class IgtvFirstFrame extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.IgtvFirstFrame {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1932761430;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return IgtvFirstFrame.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.IgtvFirstFrame
                public int getHeight() {
                    return getCoercedIntField(0, IgReactMediaPickerNativeModule.HEIGHT);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.IgtvFirstFrame
                public int getWidth() {
                    return getCoercedIntField(3, IgReactMediaPickerNativeModule.WIDTH);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.IgtvFirstFrame
                public String getScansProfile() {
                    return A08("scans_profile");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.IgtvFirstFrame
                public String getUrl() {
                    return A09("url");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.IgtvFirstFrame
                public boolean hasHeight() {
                    return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.IgtvFirstFrame
                public boolean hasWidth() {
                    return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
                }

                public IgtvFirstFrame(int i) {
                    super(i);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC58323PtF.A0R();
                }

                public IgtvFirstFrame() {
                    super(TYPE_TAG);
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates
            public CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.FirstFrame getFirstFrame() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.FirstFrame) A03(FirstFrame.class, "first_frame", FirstFrame.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates
            public CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.IgtvFirstFrame getIgtvFirstFrame() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.IgtvFirstFrame) A02(IgtvFirstFrame.class, "igtv_first_frame", IgtvFirstFrame.TYPE_TAG);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0W(new C4OK(FirstFrame.class, "first_frame", FirstFrame.TYPE_TAG), IgtvFirstFrame.class, "igtv_first_frame", IgtvFirstFrame.TYPE_TAG);
            }

            public AdditionalCandidates(int i) {
                super(i);
            }

            public AdditionalCandidates() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class Candidates extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.Candidates {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 1407270378;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Candidates.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.Candidates
            public int getHeight() {
                return getCoercedIntField(0, IgReactMediaPickerNativeModule.HEIGHT);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.Candidates
            public int getWidth() {
                return getCoercedIntField(3, IgReactMediaPickerNativeModule.WIDTH);
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.Candidates
            public String getScansProfile() {
                return A08("scans_profile");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.Candidates
            public String getUrl() {
                return A09("url");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.Candidates
            public boolean hasHeight() {
                return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.Candidates
            public boolean hasWidth() {
                return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
            }

            public Candidates(int i) {
                super(i);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC58323PtF.A0R();
            }

            public Candidates() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return ImageVersions2.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class ScrubberSpritesheetInfoCandidates extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 848710674;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return ScrubberSpritesheetInfoCandidates.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class Default extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 227858889;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return Default.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public int getFileSizeKb() {
                    return getCoercedIntField(0, "file_size_kb");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public int getMaxThumbnailsPerSprite() {
                    return getCoercedIntField(1, "max_thumbnails_per_sprite");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public int getSpriteHeight() {
                    return getCoercedIntField(3, "sprite_height");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public int getSpriteWidth() {
                    return getCoercedIntField(4, "sprite_width");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public double getThumbnailDuration() {
                    return getCoercedDoubleField(5, "thumbnail_duration");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public int getThumbnailHeight() {
                    return getCoercedIntField(6, "thumbnail_height");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public int getThumbnailWidth() {
                    return getCoercedIntField(7, "thumbnail_width");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public int getRenderedWidth() {
                    return A00("rendered_width");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public int getThumbnailsPerRow() {
                    return getCoercedIntField(8, "thumbnails_per_row");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public int getTotalThumbnailNumPerSprite() {
                    return getCoercedIntField(9, "total_thumbnail_num_per_sprite");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public double getVideoLength() {
                    return getCoercedDoubleField(10, "video_length");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public boolean hasFileSizeKb() {
                    return hasFieldValue("file_size_kb");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public boolean hasMaxThumbnailsPerSprite() {
                    return hasFieldValue("max_thumbnails_per_sprite");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public boolean hasRenderedWidth() {
                    return hasFieldValue("rendered_width");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public boolean hasSpriteHeight() {
                    return hasFieldValue("sprite_height");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public boolean hasSpriteWidth() {
                    return hasFieldValue("sprite_width");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public boolean hasThumbnailDuration() {
                    return hasFieldValue("thumbnail_duration");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public boolean hasThumbnailHeight() {
                    return hasFieldValue("thumbnail_height");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public boolean hasThumbnailWidth() {
                    return hasFieldValue("thumbnail_width");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public boolean hasThumbnailsPerRow() {
                    return hasFieldValue("thumbnails_per_row");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public boolean hasTotalThumbnailNumPerSprite() {
                    return hasFieldValue("total_thumbnail_num_per_sprite");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default
                public boolean hasVideoLength() {
                    return hasFieldValue("video_length");
                }

                public Default(int i) {
                    super(i);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC65704Tsa.A03();
                }

                public Default() {
                    super(TYPE_TAG);
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates
            public CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default getDefault() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default) A03(Default.class, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, Default.TYPE_TAG);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC167017dG.A0b(Default.class, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, Default.TYPE_TAG);
            }

            public ScrubberSpritesheetInfoCandidates(int i) {
                super(i);
            }

            public ScrubberSpritesheetInfoCandidates() {
                super(TYPE_TAG);
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2
        public boolean getSmartThumbnailEnabled() {
            return getCoercedBooleanField(3, "smart_thumbnail_enabled");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2
        public CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates getAdditionalCandidates() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates) A03(AdditionalCandidates.class, AbstractC58317Pt9.A00(217), AdditionalCandidates.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2
        public ImmutableList getCandidates() {
            return getOptionalCompactedTreeListField(1, "candidates", Candidates.class, Candidates.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2
        public CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates getScrubberSpritesheetInfoCandidates() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates) A04(ScrubberSpritesheetInfoCandidates.class, AbstractC58317Pt9.A00(363), ScrubberSpritesheetInfoCandidates.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2
        public boolean hasSmartThumbnailEnabled() {
            return hasFieldValue("smart_thumbnail_enabled");
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC58320PtC.A0U(C95124Py.A00, new C4OK(AdditionalCandidates.class, AbstractC58317Pt9.A00(217), AdditionalCandidates.TYPE_TAG), new C4OK(C4OO.A00(), Candidates.class, "candidates", Candidates.TYPE_TAG), new C4OK(ScrubberSpritesheetInfoCandidates.class, AbstractC58317Pt9.A00(363), ScrubberSpritesheetInfoCandidates.TYPE_TAG), "smart_thumbnail_enabled");
        }

        public ImageVersions2(int i) {
            super(i);
        }

        public ImageVersions2() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class InvitedCoauthorProducers extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.InvitedCoauthorProducers {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1086627578;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return InvitedCoauthorProducers.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.InvitedCoauthorProducers
        public boolean getHasOnboardedToTextPostApp() {
            return getCoercedBooleanField(1, "has_onboarded_to_text_post_app");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.InvitedCoauthorProducers
        public String getPkId() {
            return getOptionalStringField(6, "pk_id");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.InvitedCoauthorProducers
        public String getProfilePicId() {
            return getOptionalStringField(7, "profile_pic_id");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.InvitedCoauthorProducers
        public boolean isPrivate() {
            return getCoercedBooleanField(3, "is_private");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.InvitedCoauthorProducers
        public boolean isVerified() {
            return getCoercedBooleanField(4, "is_verified");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.InvitedCoauthorProducers
        public String getFullName() {
            return A07("full_name");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.InvitedCoauthorProducers
        public String getId() {
            return A09("strong_id__");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.InvitedCoauthorProducers
        public String getPk() {
            return A0C("pk");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.InvitedCoauthorProducers
        public String getProfilePicUrl() {
            return A0D("profile_pic_url");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.InvitedCoauthorProducers
        public String getUsername() {
            return getOptionalStringField(9, AbstractC70143W6w.A00());
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.InvitedCoauthorProducers
        public boolean hasHasOnboardedToTextPostApp() {
            return hasFieldValue("has_onboarded_to_text_post_app");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.InvitedCoauthorProducers
        public boolean hasIsPrivate() {
            return hasFieldValue("is_private");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.InvitedCoauthorProducers
        public boolean hasIsVerified() {
            return hasFieldValue("is_verified");
        }

        public InvitedCoauthorProducers(int i) {
            super(i);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC65704Tsa.A04();
        }

        public InvitedCoauthorProducers() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class Location extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.Location {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 610333350;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return Location.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Location
        public long getFacebookPlacesId() {
            return getCoercedTimeField(3, "facebook_places_id");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Location
        public boolean getHasViewerSaved() {
            return getCoercedBooleanField(4, "has_viewer_saved");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Location
        public double getLat() {
            return getCoercedDoubleField(6, "lat");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Location
        public double getLng() {
            return getCoercedDoubleField(7, "lng");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Location
        public boolean isEligibleForGuides() {
            return getCoercedBooleanField(5, "is_eligible_for_guides");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Location
        public String getAddress() {
            return A07("address");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Location
        public String getCity() {
            return A08(ServerW3CShippingAddressConstants.CITY);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Location
        public String getExternalSource() {
            return A09("external_source");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Location
        public String getName() {
            return A0D(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Location
        public long getPk() {
            return getCoercedTimeField(9, "pk");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Location
        public String getShortName() {
            return getOptionalStringField(10, "short_name");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Location
        public boolean hasFacebookPlacesId() {
            return hasFieldValue("facebook_places_id");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Location
        public boolean hasHasViewerSaved() {
            return hasFieldValue("has_viewer_saved");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Location
        public boolean hasIsEligibleForGuides() {
            return hasFieldValue("is_eligible_for_guides");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Location
        public boolean hasLat() {
            return hasFieldValue("lat");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Location
        public boolean hasLng() {
            return hasFieldValue("lng");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Location
        public boolean hasPk() {
            return hasFieldValue("pk");
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC65704Tsa.A07(c94754Oe, c94754Oe);
        }

        public Location(int i) {
            super(i);
        }

        public Location() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class MashupInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -1592277675;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return MashupInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo
        public boolean getCanToggleMashupsAllowed() {
            return getRequiredBooleanField(0, "can_toggle_mashups_allowed");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo
        public boolean getHasBeenMashedUp() {
            return getRequiredBooleanField(1, "has_been_mashed_up");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo
        public boolean getHasNonmimicableAdditionalAudio() {
            return getCoercedBooleanField(2, "has_nonmimicable_additional_audio");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo
        public boolean getMashupsAllowed() {
            return getRequiredBooleanField(6, "mashups_allowed");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo
        public boolean hasCanToggleMashupsAllowed() {
            return true;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo
        public boolean hasHasBeenMashedUp() {
            return true;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo
        public boolean hasIsCreatorRequestingMashup() {
            return true;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo
        public boolean hasIsPivotPageAvailable() {
            return true;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo
        public boolean hasMashupsAllowed() {
            return true;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo
        public boolean isCreatorRequestingMashup() {
            return getRequiredBooleanField(3, "is_creator_requesting_mashup");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo
        public boolean isLightWeightCheck() {
            return getCoercedBooleanField(4, "is_light_weight_check");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo
        public boolean isPivotPageAvailable() {
            return getRequiredBooleanField(5, "is_pivot_page_available");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo
        public boolean hasHasNonmimicableAdditionalAudio() {
            return hasFieldValue("has_nonmimicable_additional_audio");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo
        public boolean hasIsLightWeightCheck() {
            return hasFieldValue("is_light_weight_check");
        }

        public MashupInfo(int i) {
            super(i);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC65704Tsa.A00();
        }

        public MashupInfo() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class MediaAppreciationSettings extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaAppreciationSettings {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1529877378;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return MediaAppreciationSettings.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaAppreciationSettings
        public VF9 getGiftCountVisibility() {
            Enum requiredEnumField = getRequiredEnumField(0, "gift_count_visibility", VF9.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            C14360o3.A07(requiredEnumField);
            return (VF9) requiredEnumField;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaAppreciationSettings
        public VFA getMediaGiftingState() {
            Enum requiredEnumField = getRequiredEnumField(1, "media_gifting_state", VFA.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            C14360o3.A07(requiredEnumField);
            return (VFA) requiredEnumField;
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC167017dG.A0Y(new C94774Oi(c94754Oe), new C4OW(new C94774Oi(c94754Oe), "gift_count_visibility"), "media_gifting_state");
        }

        public MediaAppreciationSettings(int i) {
            super(i);
        }

        public MediaAppreciationSettings() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class MediaCroppingInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1432586607;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return MediaCroppingInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class FeedPreviewCrop extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.FeedPreviewCrop {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -782546297;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return FeedPreviewCrop.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.FeedPreviewCrop
            public double getCropBottom() {
                return getRequiredDoubleField(0, "crop_bottom");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.FeedPreviewCrop
            public double getCropLeft() {
                return getRequiredDoubleField(1, "crop_left");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.FeedPreviewCrop
            public double getCropRight() {
                return getRequiredDoubleField(2, "crop_right");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.FeedPreviewCrop
            public double getCropTop() {
                return getRequiredDoubleField(3, "crop_top");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.FeedPreviewCrop
            public boolean hasCropBottom() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.FeedPreviewCrop
            public boolean hasCropLeft() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.FeedPreviewCrop
            public boolean hasCropRight() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.FeedPreviewCrop
            public boolean hasCropTop() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public FeedPreviewCrop(int i) {
                super(i);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC65703TsZ.A10();
            }

            public FeedPreviewCrop() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class SquareCrop extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.SquareCrop {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 564079321;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return SquareCrop.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.SquareCrop
            public double getCropBottom() {
                return getRequiredDoubleField(0, "crop_bottom");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.SquareCrop
            public double getCropLeft() {
                return getRequiredDoubleField(1, "crop_left");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.SquareCrop
            public double getCropRight() {
                return getRequiredDoubleField(2, "crop_right");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.SquareCrop
            public double getCropTop() {
                return getRequiredDoubleField(3, "crop_top");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.SquareCrop
            public boolean hasCropBottom() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.SquareCrop
            public boolean hasCropLeft() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.SquareCrop
            public boolean hasCropRight() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.SquareCrop
            public boolean hasCropTop() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public SquareCrop(int i) {
                super(i);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC65703TsZ.A10();
            }

            public SquareCrop() {
                super(TYPE_TAG);
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo
        public CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.FeedPreviewCrop getFeedPreviewCrop() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.FeedPreviewCrop) A03(FeedPreviewCrop.class, "feed_preview_crop", FeedPreviewCrop.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo
        public CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.SquareCrop getSquareCrop() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.SquareCrop) A02(SquareCrop.class, "square_crop", SquareCrop.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo
        public String getStrongId() {
            return A09("strong_id__");
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0X(C94754Oe.A00, new C4OK(FeedPreviewCrop.class, "feed_preview_crop", FeedPreviewCrop.TYPE_TAG), new C4OK(SquareCrop.class, "square_crop", SquareCrop.TYPE_TAG), "strong_id__");
        }

        public MediaCroppingInfo(int i) {
            super(i);
        }

        public MediaCroppingInfo() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class MediaNotice extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaNotice {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -557796809;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return MediaNotice.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaNotice
        public EnumC39604HeE getNoticeIcon() {
            return (EnumC39604HeE) getOptionalEnumField(0, "notice_icon", EnumC39604HeE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaNotice
        public String getNoticeSubText() {
            return A08("notice_sub_text");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaNotice
        public String getNoticeText() {
            return A09("notice_text");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaNotice
        public String getNoticeUrl() {
            return A0A("notice_url");
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC58320PtC.A0U(c94754Oe, new C4OW(c94754Oe, "notice_icon"), new C4OW(c94754Oe, "notice_sub_text"), new C4OW(c94754Oe, "notice_text"), "notice_url");
        }

        public MediaNotice(int i) {
            super(i);
        }

        public MediaNotice() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class MediaOverlayInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1386701942;

        /* loaded from: classes11.dex */
        public final class Buttons extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -980890725;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Buttons.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class Icon extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.Icon {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1351520668;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return Icon.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.Icon
                public int getIconGlyph() {
                    return getCoercedIntField(0, "icon_glyph");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.Icon
                public int getIconType() {
                    return getCoercedIntField(1, "icon_type");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.Icon
                public String getName() {
                    return A09(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.Icon
                public boolean hasIconGlyph() {
                    return hasFieldValue("icon_glyph");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.Icon
                public boolean hasIconType() {
                    return hasFieldValue("icon_type");
                }

                public Icon(int i) {
                    super(i);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC65703TsZ.A0x();
                }

                public Icon() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class TextColor extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.TextColor {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -989789208;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return TextColor.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.TextColor
                public String getDark() {
                    return AbstractC65702TsY.A0a(this, "dark", 0);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.TextColor
                public String getLight() {
                    return AbstractC65702TsY.A0a(this, "light", 1);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC167017dG.A0Y(new C94774Oi(c94754Oe), new C4OW(new C94774Oi(c94754Oe), "dark"), "light");
                }

                public TextColor(int i) {
                    super(i);
                }

                public TextColor() {
                    super(TYPE_TAG);
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons
            public int getAction() {
                return getCoercedIntField(0, "action");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons
            public boolean getHasChevron() {
                return getCoercedBooleanField(3, "has_chevron");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons
            public String getSecondaryText() {
                return getOptionalStringField(6, "secondary_text");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons
            public String getText() {
                return getOptionalStringField(7, "text");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons
            public boolean isTextCentered() {
                return getCoercedBooleanField(5, "is_text_centered");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons
            public String getActionUrl() {
                return A08("action_url");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons
            public int getButtonType() {
                return A00("button_type");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons
            public CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.Icon getIcon() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.Icon) getOptionalTreeField(4, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, Icon.class, Icon.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons
            public CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.TextColor getTextColor() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.TextColor) getOptionalTreeField(8, "text_color", TextColor.class, TextColor.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons
            public boolean hasAction() {
                return hasFieldValue("action");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons
            public boolean hasButtonType() {
                return hasFieldValue("button_type");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons
            public boolean hasHasChevron() {
                return hasFieldValue("has_chevron");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons
            public boolean hasIsTextCentered() {
                return hasFieldValue("is_text_centered");
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                C94894Ou c94894Ou = C94894Ou.A00;
                C4OW c4ow = new C4OW(c94894Ou, "action");
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW c4ow2 = new C4OW(c94754Oe, "action_url");
                C4OW c4ow3 = new C4OW(c94894Ou, "button_type");
                C95124Py c95124Py = C95124Py.A00;
                return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, new C4OW(c95124Py, "has_chevron"), new C4OK(Icon.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, Icon.TYPE_TAG), new C4OW(c95124Py, "is_text_centered"), new C4OW(c94754Oe, "secondary_text"), AbstractC58319PtB.A0C(c94754Oe), new C4OK(TextColor.class, "text_color", TextColor.TYPE_TAG)});
            }

            public Buttons(int i) {
                super(i);
            }

            public Buttons() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return MediaOverlayInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class Icon extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Icon {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -33690457;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Icon.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Icon
            public int getIconGlyph() {
                return getCoercedIntField(0, "icon_glyph");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Icon
            public int getIconType() {
                return getCoercedIntField(1, "icon_type");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Icon
            public String getName() {
                return A09(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Icon
            public boolean hasIconGlyph() {
                return hasFieldValue("icon_glyph");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Icon
            public boolean hasIconType() {
                return hasFieldValue("icon_type");
            }

            public Icon(int i) {
                super(i);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC65703TsZ.A0x();
            }

            public Icon() {
                super(TYPE_TAG);
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo
        public int getMisinformationType() {
            return getCoercedIntField(3, "misinformation_type");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo
        public int getOverlayAppliedTimestamp() {
            return getCoercedIntField(4, "overlay_applied_timestamp");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo
        public int getOverlayLayout() {
            return getCoercedIntField(5, "overlay_layout");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo
        public String getOverlayType() {
            return getOptionalStringField(6, "overlay_type");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo
        public String getSessionId() {
            return getOptionalStringField(7, AbstractC70143W6w.A01(9, 10, 0));
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo
        public ImmutableList getButtons() {
            return getOptionalCompactedTreeListField(0, "buttons", Buttons.class, Buttons.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo
        public String getDescription() {
            return A08(DevServerEntity.COLUMN_DESCRIPTION);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo
        public CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Icon getIcon() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Icon) A04(Icon.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, Icon.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo
        public String getSubCategory() {
            return A0D("sub_category");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo
        public String getTitle() {
            return getOptionalStringField(9, DialogModule.KEY_TITLE);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo
        public boolean hasMisinformationType() {
            return hasFieldValue("misinformation_type");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo
        public boolean hasOverlayAppliedTimestamp() {
            return hasFieldValue("overlay_applied_timestamp");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo
        public boolean hasOverlayLayout() {
            return hasFieldValue("overlay_layout");
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C4OK c4ok = new C4OK(C4OO.A00(), Buttons.class, "buttons", Buttons.TYPE_TAG);
            C94754Oe c94754Oe = C94754Oe.A00;
            C4OW A0Y = AbstractC58322PtE.A0Y(c94754Oe);
            C4OK c4ok2 = new C4OK(Icon.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, Icon.TYPE_TAG);
            C94894Ou c94894Ou = C94894Ou.A00;
            return new C4OU(new C4OM[]{c4ok, A0Y, c4ok2, new C4OW(c94894Ou, "misinformation_type"), new C4OW(c94894Ou, "overlay_applied_timestamp"), new C4OW(c94894Ou, "overlay_layout"), new C4OW(c94754Oe, "overlay_type"), new C4OW(c94754Oe, AbstractC70143W6w.A01(9, 10, 0)), new C4OW(c94754Oe, "sub_category"), AbstractC58319PtB.A0L(c94754Oe)});
        }

        public MediaOverlayInfo(int i) {
            super(i);
        }

        public MediaOverlayInfo() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class MusicMetadata extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -1054330615;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return MusicMetadata.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class OriginalSoundInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 2046091653;

            /* loaded from: classes11.dex */
            public final class AudioParts extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.AudioParts {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1347119813;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return AudioParts.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.AudioParts
                public CreatorInspirationSignalsPlaygroundAudioPartMetadata asCreatorInspirationSignalsPlaygroundAudioPartMetadata() {
                    return (CreatorInspirationSignalsPlaygroundAudioPartMetadata) A01(CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.class, CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.TYPE_TAG);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0a(CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.class, "CreatorInspirationSignalsPlaygroundAudioPartMetadata", CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.TYPE_TAG);
                }

                public AudioParts(int i) {
                    super(i);
                }

                public AudioParts() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class AudioPartsByFilter extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.AudioPartsByFilter {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 105011133;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return AudioPartsByFilter.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.AudioPartsByFilter
                public CreatorInspirationSignalsPlaygroundAudioPartMetadata asCreatorInspirationSignalsPlaygroundAudioPartMetadata() {
                    return (CreatorInspirationSignalsPlaygroundAudioPartMetadata) A01(CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.class, CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.TYPE_TAG);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0a(CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.class, "CreatorInspirationSignalsPlaygroundAudioPartMetadata", CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.TYPE_TAG);
                }

                public AudioPartsByFilter(int i) {
                    super(i);
                }

                public AudioPartsByFilter() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return OriginalSoundInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class ConsumptionInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.ConsumptionInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -636896919;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return ConsumptionInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.ConsumptionInfo
                public String getShouldMuteAudioReason() {
                    return AbstractC65702TsY.A0a(this, "should_mute_audio_reason", 2);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.ConsumptionInfo
                public boolean hasIsBookmarked() {
                    return true;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.ConsumptionInfo
                public boolean hasIsTrendingInClips() {
                    return true;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.ConsumptionInfo
                public boolean isBookmarked() {
                    return getRequiredBooleanField(0, "is_bookmarked");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.ConsumptionInfo
                public boolean isTrendingInClips() {
                    return getRequiredBooleanField(1, "is_trending_in_clips");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public ConsumptionInfo(int i) {
                    super(i);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC65703TsZ.A0v();
                }

                public ConsumptionInfo() {
                    super(TYPE_TAG);
                }
            }

            /* loaded from: classes11.dex */
            public final class IgArtist extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.IgArtist {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 1273598757;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return IgArtist.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.IgArtist
                public String getProfilePicId() {
                    return getOptionalStringField(6, "profile_pic_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.IgArtist
                public String getProfilePicUrl() {
                    return getOptionalStringField(7, "profile_pic_url");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.IgArtist
                public boolean isPrivate() {
                    return getCoercedBooleanField(2, "is_private");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.IgArtist
                public boolean isVerified() {
                    return getCoercedBooleanField(3, "is_verified");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.IgArtist
                public String getFullName() {
                    return A07("full_name");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.IgArtist
                public String getId() {
                    return A08("strong_id__");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.IgArtist
                public String getPk() {
                    return A0B("pk");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.IgArtist
                public String getPkId() {
                    return A0C("pk_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.IgArtist
                public boolean hasIsPrivate() {
                    return hasFieldValue("is_private");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.IgArtist
                public boolean hasIsVerified() {
                    return hasFieldValue("is_verified");
                }

                public IgArtist(int i) {
                    super(i);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.IgArtist
                public String getUsername() {
                    return A0D(AbstractC70143W6w.A00());
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC65703TsZ.A0n();
                }

                public IgArtist() {
                    super(TYPE_TAG);
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean getAllowCreatorToRename() {
                return getRequiredBooleanField(0, "allow_creator_to_rename");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public String getAudioAssetId() {
                return AbstractC65702TsY.A0a(this, "audio_asset_id", 1);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean getCanRemixBeSharedToFb() {
                return getCoercedBooleanField(4, "can_remix_be_shared_to_fb");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public String getDashManifest() {
                return AbstractC65702TsY.A0a(this, "dash_manifest", 6);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public int getDurationInMs() {
                return getCoercedIntField(7, "duration_in_ms");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean hasAllowCreatorToRename() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean hasHideRemixing() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean hasIsAudioAutomaticallyAttributed() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean hasIsExplicit() {
                return true;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean hasShouldMuteAudio() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public ImmutableList getAudioParts() {
                return getRequiredCompactedTreeListField(2, "audio_parts", AudioParts.class, AudioParts.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public ImmutableList getAudioPartsByFilter() {
                return getRequiredCompactedTreeListField(3, "audio_parts_by_filter", AudioPartsByFilter.class, AudioPartsByFilter.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.ConsumptionInfo getConsumptionInfo() {
                C2JS requiredTreeField = getRequiredTreeField(5, "consumption_info", ConsumptionInfo.class, ConsumptionInfo.TYPE_TAG);
                C14360o3.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.MusicMetadata.OriginalSoundInfo.ConsumptionInfo");
                return (ConsumptionInfo) requiredTreeField;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean getHideRemixing() {
                return getRequiredBooleanField(8, "hide_remixing");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.IgArtist getIgArtist() {
                C2JS requiredTreeField = getRequiredTreeField(9, "ig_artist", IgArtist.class, IgArtist.TYPE_TAG);
                C14360o3.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.MusicMetadata.OriginalSoundInfo.IgArtist");
                return (IgArtist) requiredTreeField;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public VFC getOriginalAudioSubtype() {
                Enum requiredEnumField = getRequiredEnumField(15, "original_audio_subtype", VFC.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                C14360o3.A07(requiredEnumField);
                return (VFC) requiredEnumField;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public String getOriginalAudioTitle() {
                return AbstractC65702TsY.A0a(this, "original_audio_title", 16);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public String getOriginalMediaId() {
                return AbstractC65702TsY.A0a(this, "original_media_id", 17);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public String getProgressiveDownloadUrl() {
                return AbstractC65702TsY.A0a(this, "progressive_download_url", 18);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean getShouldMuteAudio() {
                return getRequiredBooleanField(19, "should_mute_audio");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public int getTimeCreated() {
                return getCoercedIntField(20, "time_created");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public int getTrendRank() {
                return getCoercedIntField(21, "trend_rank");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean hasCanRemixBeSharedToFb() {
                return hasFieldValue("can_remix_be_shared_to_fb");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean hasDurationInMs() {
                return hasFieldValue("duration_in_ms");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean hasIsOriginalAudioDownloadEligible() {
                return hasFieldValue("is_original_audio_download_eligible");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean hasIsReuseDisabled() {
                return hasFieldValue("is_reuse_disabled");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean hasIsXpostFromFb() {
                return hasFieldValue("is_xpost_from_fb");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean hasTimeCreated() {
                return hasFieldValue("time_created");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean hasTrendRank() {
                return hasFieldValue("trend_rank");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean isAudioAutomaticallyAttributed() {
                return getRequiredBooleanField(10, "is_audio_automatically_attributed");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean isExplicit() {
                return getRequiredBooleanField(11, "is_explicit");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean isOriginalAudioDownloadEligible() {
                return getCoercedBooleanField(12, "is_original_audio_download_eligible");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean isReuseDisabled() {
                return getCoercedBooleanField(13, "is_reuse_disabled");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo
            public boolean isXpostFromFb() {
                return getCoercedBooleanField(14, "is_xpost_from_fb");
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                C95124Py c95124Py = C95124Py.A00;
                C4OW A0j = AbstractC65703TsZ.A0j(c95124Py);
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW A0X = AbstractC65703TsZ.A0X(c94754Oe);
                C4OK c4ok = new C4OK(C4OO.A02(), AudioParts.class, "audio_parts", AudioParts.TYPE_TAG);
                C4OK c4ok2 = new C4OK(C4OO.A02(), AudioPartsByFilter.class, "audio_parts_by_filter", AudioPartsByFilter.TYPE_TAG);
                C4OW c4ow = new C4OW(c95124Py, "can_remix_be_shared_to_fb");
                C4OK c4ok3 = new C4OK(C4OO.A01(), ConsumptionInfo.class, "consumption_info", ConsumptionInfo.TYPE_TAG);
                C4OW A0g = AbstractC65703TsZ.A0g(c94754Oe);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{A0j, A0X, c4ok, c4ok2, c4ow, c4ok3, A0g, new C4OW(c94894Ou, "duration_in_ms"), AbstractC65703TsZ.A0h(c95124Py), new C4OK(C4OO.A01(), IgArtist.class, "ig_artist", IgArtist.TYPE_TAG), AbstractC65703TsZ.A0H(c95124Py), AbstractC65703TsZ.A0G(c95124Py), new C4OW(c95124Py, "is_original_audio_download_eligible"), new C4OW(c95124Py, "is_reuse_disabled"), new C4OW(c95124Py, "is_xpost_from_fb"), AbstractC65703TsZ.A0f(c94754Oe), AbstractC65703TsZ.A0P(c94754Oe), AbstractC65703TsZ.A0F(c94754Oe), AbstractC65703TsZ.A0M(c94754Oe), AbstractC65703TsZ.A0c(c95124Py), new C4OW(c94894Ou, "time_created"), new C4OW(c94894Ou, "trend_rank")});
            }

            public OriginalSoundInfo(int i) {
                super(i);
            }

            public OriginalSoundInfo() {
                super(TYPE_TAG);
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata
        public String getMusicCanonicalId() {
            return AbstractC65702TsY.A0a(this, "music_canonical_id", 1);
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata
        public VFB getAudioType() {
            return (VFB) getOptionalEnumField(0, "audio_type", VFB.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata
        public CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo getOriginalSoundInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo) A04(OriginalSoundInfo.class, "original_sound_info", OriginalSoundInfo.TYPE_TAG);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC58320PtC.A0V(new C4OW(c94754Oe, "audio_type"), AbstractC65703TsZ.A0a(c94754Oe), OriginalSoundInfo.class, "original_sound_info", OriginalSoundInfo.TYPE_TAG);
        }

        public MusicMetadata(int i) {
            super(i);
        }

        public MusicMetadata() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class OrganicCtaInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.OrganicCtaInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -1405423150;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return OrganicCtaInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.OrganicCtaInfo
        public String getCtaTitle() {
            return AbstractC65702TsY.A0a(this, "cta_title", 1);
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.OrganicCtaInfo
        public String getCtaSubtitle() {
            return A07("cta_subtitle");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.OrganicCtaInfo
        public EnumC39608HeI getCtaType() {
            Enum requiredEnumField = getRequiredEnumField(2, "cta_type", EnumC39608HeI.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            C14360o3.A07(requiredEnumField);
            return (EnumC39608HeI) requiredEnumField;
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC167017dG.A0X(new C94774Oi(c94754Oe), new C4OW(c94754Oe, "cta_subtitle"), new C4OW(new C94774Oi(c94754Oe), "cta_title"), "cta_type");
        }

        public OrganicCtaInfo(int i) {
            super(i);
        }

        public OrganicCtaInfo() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class ProductTags extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 260944321;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return ProductTags.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class In extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 796933152;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return In.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class Product extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1736247688;

                /* loaded from: classes11.dex */
                public final class AggregatedRating extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.AggregatedRating {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 1994026379;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return AggregatedRating.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.AggregatedRating
                    public int getRatingCount() {
                        return getCoercedIntField(0, "rating_count");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.AggregatedRating
                    public double getValue() {
                        return getCoercedDoubleField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.AggregatedRating
                    public boolean hasRatingCount() {
                        return hasFieldValue("rating_count");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.AggregatedRating
                    public boolean hasValue() {
                        return hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    }

                    public AggregatedRating(int i) {
                        super(i);
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC65703TsZ.A0s();
                    }

                    public AggregatedRating() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class ArtsLabels extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ArtsLabels {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 1648138857;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return ArtsLabels.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class Labels extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ArtsLabels.Labels {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -1260668162;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return Labels.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ArtsLabels.Labels
                        public String getLabelDisplayValue() {
                            return A07("label_display_value");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ArtsLabels.Labels
                        public String getLabelType() {
                            return A08("label_type");
                        }

                        public Labels(int i) {
                            super(i);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC65703TsZ.A0u();
                        }

                        public Labels() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ArtsLabels
                    public ImmutableList getLabels() {
                        return getOptionalCompactedTreeListField(0, "labels", Labels.class, Labels.TYPE_TAG);
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0W(C4OO.A00(), Labels.class, "labels", Labels.TYPE_TAG);
                    }

                    public ArtsLabels(int i) {
                        super(i);
                    }

                    public ArtsLabels() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class CheckoutProperties extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 586985188;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return CheckoutProperties.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class CurrencyAmount extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.CurrencyAmount {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -258945771;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return CurrencyAmount.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.CurrencyAmount
                        public int getOffset() {
                            return getCoercedIntField(3, "offset");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.CurrencyAmount
                        public String getAmount() {
                            return A07("amount");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.CurrencyAmount
                        public String getAmountWithOffset() {
                            return A08("amount_with_offset");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.CurrencyAmount
                        public String getCurrency() {
                            return A09("currency");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.CurrencyAmount
                        public boolean hasOffset() {
                            return hasFieldValue("offset");
                        }

                        public CurrencyAmount(int i) {
                            super(i);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC65703TsZ.A0o();
                        }

                        public CurrencyAmount() {
                            super(TYPE_TAG);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class ShippingAndReturn extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 176533538;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ShippingAndReturn.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class ReturnCost extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ReturnCost {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = 169023367;

                            /* loaded from: classes11.dex */
                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return ReturnCost.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ReturnCost
                            public int getOffset() {
                                return getCoercedIntField(3, "offset");
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ReturnCost
                            public String getAmount() {
                                return A07("amount");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ReturnCost
                            public String getAmountWithOffset() {
                                return A08("amount_with_offset");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ReturnCost
                            public String getCurrency() {
                                return A09("currency");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ReturnCost
                            public boolean hasOffset() {
                                return hasFieldValue("offset");
                            }

                            public ReturnCost(int i) {
                                super(i);
                            }

                            @Override // X.C2JS
                            public C4OU modelSelectionSet() {
                                return AbstractC65703TsZ.A0o();
                            }

                            public ReturnCost() {
                                super(TYPE_TAG);
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class ShippingCost extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ShippingCost {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -435033297;

                            /* loaded from: classes11.dex */
                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return ShippingCost.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ShippingCost
                            public int getOffset() {
                                return getCoercedIntField(3, "offset");
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ShippingCost
                            public String getAmount() {
                                return A07("amount");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ShippingCost
                            public String getAmountWithOffset() {
                                return A08("amount_with_offset");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ShippingCost
                            public String getCurrency() {
                                return A09("currency");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ShippingCost
                            public boolean hasOffset() {
                                return hasFieldValue("offset");
                            }

                            public ShippingCost(int i) {
                                super(i);
                            }

                            @Override // X.C2JS
                            public C4OU modelSelectionSet() {
                                return AbstractC65703TsZ.A0o();
                            }

                            public ShippingCost() {
                                super(TYPE_TAG);
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn
                        public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ReturnCost getReturnCost() {
                            return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ReturnCost) A03(ReturnCost.class, "return_cost", ReturnCost.TYPE_TAG);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn
                        public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ShippingCost getShippingCost() {
                            return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ShippingCost) A02(ShippingCost.class, "shipping_cost", ShippingCost.TYPE_TAG);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn
                        public String getShippingCostStripped() {
                            return A09("shipping_cost_stripped");
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0X(C94754Oe.A00, new C4OK(ReturnCost.class, "return_cost", ReturnCost.TYPE_TAG), new C4OK(ShippingCost.class, "shipping_cost", ShippingCost.TYPE_TAG), "shipping_cost_stripped");
                        }

                        public ShippingAndReturn(int i) {
                            super(i);
                        }

                        public ShippingAndReturn() {
                            super(TYPE_TAG);
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public boolean getCanAddToBag() {
                        return getCoercedBooleanField(0, "can_add_to_bag");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public boolean getCanEnableRestockReminder() {
                        return getCoercedBooleanField(1, "can_enable_restock_reminder");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public int getFullInventoryQuantity() {
                        return getCoercedIntField(3, "full_inventory_quantity");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public boolean getHasFreeShipping() {
                        return getCoercedBooleanField(4, "has_free_shipping");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public int getInventoryQuantity() {
                        return getCoercedIntField(6, "inventory_quantity");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public boolean isShopifyMerchant() {
                        return getCoercedBooleanField(7, "is_shopify_merchant");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.CurrencyAmount getCurrencyAmount() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.CurrencyAmount) A04(CurrencyAmount.class, "currency_amount", CurrencyAmount.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public String getIgReferrerFbid() {
                        return A0C("ig_referrer_fbid");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public boolean getProductGroupHasInventory() {
                        return getCoercedBooleanField(8, "product_group_has_inventory");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public String getReceiverId() {
                        return getOptionalStringField(9, "receiver_id");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn getShippingAndReturn() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn) getOptionalTreeField(10, "shipping_and_return", ShippingAndReturn.class, ShippingAndReturn.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public int getViewerPurchaseLimit() {
                        return getCoercedIntField(11, "viewer_purchase_limit");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public boolean hasCanAddToBag() {
                        return hasFieldValue("can_add_to_bag");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public boolean hasCanEnableRestockReminder() {
                        return hasFieldValue("can_enable_restock_reminder");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public boolean hasFullInventoryQuantity() {
                        return hasFieldValue("full_inventory_quantity");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public boolean hasHasFreeShipping() {
                        return hasFieldValue("has_free_shipping");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public boolean hasInventoryQuantity() {
                        return hasFieldValue("inventory_quantity");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public boolean hasIsShopifyMerchant() {
                        return hasFieldValue("is_shopify_merchant");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public boolean hasProductGroupHasInventory() {
                        return hasFieldValue("product_group_has_inventory");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties
                    public boolean hasViewerPurchaseLimit() {
                        return hasFieldValue("viewer_purchase_limit");
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        C95124Py c95124Py = C95124Py.A00;
                        C4OW c4ow = new C4OW(c95124Py, "can_add_to_bag");
                        C4OW c4ow2 = new C4OW(c95124Py, "can_enable_restock_reminder");
                        C4OK c4ok = new C4OK(CurrencyAmount.class, "currency_amount", CurrencyAmount.TYPE_TAG);
                        C94894Ou c94894Ou = C94894Ou.A00;
                        C4OW c4ow3 = new C4OW(c94894Ou, "full_inventory_quantity");
                        C4OW c4ow4 = new C4OW(c95124Py, "has_free_shipping");
                        C94754Oe c94754Oe = C94754Oe.A00;
                        return new C4OU(new C4OM[]{c4ow, c4ow2, c4ok, c4ow3, c4ow4, new C4OW(c94754Oe, "ig_referrer_fbid"), new C4OW(c94894Ou, "inventory_quantity"), new C4OW(c95124Py, "is_shopify_merchant"), new C4OW(c95124Py, "product_group_has_inventory"), new C4OW(c94754Oe, "receiver_id"), new C4OK(ShippingAndReturn.class, "shipping_and_return", ShippingAndReturn.TYPE_TAG), new C4OW(c94894Ou, "viewer_purchase_limit")});
                    }

                    public CheckoutProperties(int i) {
                        super(i);
                    }

                    public CheckoutProperties() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class CommerceReviewStatistics extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CommerceReviewStatistics {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 1987092231;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return CommerceReviewStatistics.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CommerceReviewStatistics
                    public double getAverageRating() {
                        return getCoercedDoubleField(0, "average_rating");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CommerceReviewStatistics
                    public int getReviewCount() {
                        return getCoercedIntField(1, "review_count");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CommerceReviewStatistics
                    public boolean hasAverageRating() {
                        return hasFieldValue("average_rating");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CommerceReviewStatistics
                    public boolean hasReviewCount() {
                        return hasFieldValue("review_count");
                    }

                    public CommerceReviewStatistics(int i) {
                        super(i);
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC65703TsZ.A0r();
                    }

                    public CommerceReviewStatistics() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return Product.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                /* loaded from: classes11.dex */
                public final class DiscountInformation extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.DiscountInformation {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1281192883;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return DiscountInformation.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class Discounts extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.DiscountInformation.Discounts {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -1049786104;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return Discounts.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.DiscountInformation.Discounts
                        public String getId() {
                            return AbstractC65702TsY.A0a(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 2);
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.DiscountInformation.Discounts
                        public String getCtaText() {
                            return A07("cta_text");
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.DiscountInformation.Discounts
                        public String getDescription() {
                            return A08(DevServerEntity.COLUMN_DESCRIPTION);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.DiscountInformation.Discounts
                        public String getName() {
                            return A0A(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.DiscountInformation.Discounts
                        public String getSeeDetailsText() {
                            return A0B("see_details_text");
                        }

                        public Discounts(int i) {
                            super(i);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC65703TsZ.A0y();
                        }

                        public Discounts() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.DiscountInformation
                    public ImmutableList getDiscounts() {
                        return getOptionalCompactedTreeListField(0, "discounts", Discounts.class, Discounts.TYPE_TAG);
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0W(C4OO.A00(), Discounts.class, "discounts", Discounts.TYPE_TAG);
                    }

                    public DiscountInformation(int i) {
                        super(i);
                    }

                    public DiscountInformation() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class ImageQualityMetadata extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -43509148;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return ImageQualityMetadata.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class Goodness extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata.Goodness {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 2077816305;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return Goodness.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata.Goodness
                        public double getScore() {
                            return getCoercedDoubleField(1, "score");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata.Goodness
                        public String getId() {
                            return A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata.Goodness
                        public boolean hasScore() {
                            return hasFieldValue("score");
                        }

                        public Goodness(int i) {
                            super(i);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC58323PtF.A0S();
                        }

                        public Goodness() {
                            super(TYPE_TAG);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class LifestyleBackground extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata.LifestyleBackground {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1644851718;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return LifestyleBackground.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata.LifestyleBackground
                        public double getScore() {
                            return getCoercedDoubleField(1, "score");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata.LifestyleBackground
                        public String getId() {
                            return A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata.LifestyleBackground
                        public boolean hasScore() {
                            return hasFieldValue("score");
                        }

                        public LifestyleBackground(int i) {
                            super(i);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC58323PtF.A0S();
                        }

                        public LifestyleBackground() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata
                    public ImmutableList getGoodness() {
                        return getOptionalCompactedTreeListField(0, "goodness", Goodness.class, Goodness.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata
                    public ImmutableList getLifestyleBackground() {
                        return getOptionalCompactedTreeListField(1, "lifestyle_background", LifestyleBackground.class, LifestyleBackground.TYPE_TAG);
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC58320PtC.A0T(C4OO.A00(), new C4OK(C4OO.A00(), Goodness.class, "goodness", Goodness.TYPE_TAG), LifestyleBackground.class, "lifestyle_background", LifestyleBackground.TYPE_TAG);
                    }

                    public ImageQualityMetadata(int i) {
                        super(i);
                    }

                    public ImageQualityMetadata() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class MainImage extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1340235326;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return MainImage.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class ImageVersions2 extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage.ImageVersions2 {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1124116630;

                        /* loaded from: classes11.dex */
                        public final class Candidates extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage.ImageVersions2.Candidates {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -2111316906;

                            /* loaded from: classes11.dex */
                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return Candidates.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage.ImageVersions2.Candidates
                            public int getHeight() {
                                return getCoercedIntField(0, IgReactMediaPickerNativeModule.HEIGHT);
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage.ImageVersions2.Candidates
                            public String getUrl() {
                                return A08("url");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage.ImageVersions2.Candidates
                            public int getWidth() {
                                return A00(IgReactMediaPickerNativeModule.WIDTH);
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage.ImageVersions2.Candidates
                            public boolean hasHeight() {
                                return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage.ImageVersions2.Candidates
                            public boolean hasWidth() {
                                return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
                            }

                            public Candidates(int i) {
                                super(i);
                            }

                            @Override // X.C2JS
                            public C4OU modelSelectionSet() {
                                return AbstractC58323PtF.A0T();
                            }

                            public Candidates() {
                                super(TYPE_TAG);
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ImageVersions2.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage.ImageVersions2
                        public ImmutableList getCandidates() {
                            return getOptionalCompactedTreeListField(0, "candidates", Candidates.class, Candidates.TYPE_TAG);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0W(C4OO.A00(), Candidates.class, "candidates", Candidates.TYPE_TAG);
                        }

                        public ImageVersions2(int i) {
                            super(i);
                        }

                        public ImageVersions2() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage
                    public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage.ImageVersions2 getImageVersions2() {
                        C2JS A05 = A05(ImageVersions2.class, "image_versions2", ImageVersions2.TYPE_TAG);
                        C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ProductTags.In.Product.MainImage.ImageVersions2");
                        return (ImageVersions2) A05;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage
                    public String getPreview() {
                        return A08("preview");
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC58323PtF.A0W(C4OO.A01(), ImageVersions2.class, ImageVersions2.TYPE_TAG);
                    }

                    public MainImage(int i) {
                        super(i);
                    }

                    public MainImage() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class Merchant extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.Merchant {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 772960972;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return Merchant.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.Merchant
                    public boolean getDisabledSharingProductsToGuides() {
                        return getCoercedBooleanField(0, "disabled_sharing_products_to_guides");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.Merchant
                    public String getUsername() {
                        return getOptionalStringField(6, AbstractC70143W6w.A00());
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.Merchant
                    public boolean isVerified() {
                        return getCoercedBooleanField(2, "is_verified");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.Merchant
                    public String getId() {
                        return A08("strong_id__");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.Merchant
                    public String getPk() {
                        return A0A("pk");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.Merchant
                    public String getProfilePicUrl() {
                        return A0B("profile_pic_url");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.Merchant
                    public String getStorefrontAttributionUsername() {
                        return A0C("storefront_attribution_username");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.Merchant
                    public boolean hasDisabledSharingProductsToGuides() {
                        return hasFieldValue("disabled_sharing_products_to_guides");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.Merchant
                    public boolean hasIsVerified() {
                        return hasFieldValue("is_verified");
                    }

                    public Merchant(int i) {
                        super(i);
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC65703TsZ.A0p();
                    }

                    public Merchant() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class RichTextDescription extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 1948255702;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return RichTextDescription.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class TextWithEntities extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription.TextWithEntities {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -322251666;

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return TextWithEntities.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class InlineStyleRanges extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription.TextWithEntities.InlineStyleRanges {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = 245676503;

                            /* loaded from: classes11.dex */
                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return InlineStyleRanges.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription.TextWithEntities.InlineStyleRanges
                            public int getInlineStyle() {
                                return getCoercedIntField(0, "inline_style");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription.TextWithEntities.InlineStyleRanges
                            public int getLength() {
                                return getCoercedIntField(1, "length");
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription.TextWithEntities.InlineStyleRanges
                            public int getOffset() {
                                return A00("offset");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription.TextWithEntities.InlineStyleRanges
                            public boolean hasInlineStyle() {
                                return hasFieldValue("inline_style");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription.TextWithEntities.InlineStyleRanges
                            public boolean hasLength() {
                                return hasFieldValue("length");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription.TextWithEntities.InlineStyleRanges
                            public boolean hasOffset() {
                                return hasFieldValue("offset");
                            }

                            public InlineStyleRanges(int i) {
                                super(i);
                            }

                            @Override // X.C2JS
                            public C4OU modelSelectionSet() {
                                return AbstractC58323PtF.A0U();
                            }

                            public InlineStyleRanges() {
                                super(TYPE_TAG);
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription.TextWithEntities
                        public ImmutableList getInlineStyleRanges() {
                            return getOptionalCompactedTreeListField(0, "inline_style_ranges", InlineStyleRanges.class, InlineStyleRanges.TYPE_TAG);
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription.TextWithEntities
                        public String getText() {
                            return A08("text");
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0Y(C94754Oe.A00, new C4OK(C4OO.A00(), InlineStyleRanges.class, "inline_style_ranges", InlineStyleRanges.TYPE_TAG), "text");
                        }

                        public TextWithEntities(int i) {
                            super(i);
                        }

                        public TextWithEntities() {
                            super(TYPE_TAG);
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription
                    public int getDepth() {
                        return getCoercedIntField(1, "depth");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription
                    public String getBlockType() {
                        return A07("block_type");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription
                    public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription.TextWithEntities getTextWithEntities() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription.TextWithEntities) A04(TextWithEntities.class, "text_with_entities", TextWithEntities.TYPE_TAG);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription
                    public boolean hasDepth() {
                        return hasFieldValue("depth");
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC58320PtC.A0V(new C4OW(C94754Oe.A00, "block_type"), new C4OW(C94894Ou.A00, "depth"), TextWithEntities.class, "text_with_entities", TextWithEntities.TYPE_TAG);
                    }

                    public RichTextDescription(int i) {
                        super(i);
                    }

                    public RichTextDescription() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class SellerBadge extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.SellerBadge {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 1525513323;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return SellerBadge.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.SellerBadge
                    public String getDescription() {
                        return A07(DevServerEntity.COLUMN_DESCRIPTION);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.SellerBadge
                    public String getName() {
                        return A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.SellerBadge
                    public EnumC39610HeK getType() {
                        return (EnumC39610HeK) getOptionalEnumField(2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, EnumC39610HeK.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        C94754Oe c94754Oe = C94754Oe.A00;
                        return AbstractC167017dG.A0X(c94754Oe, AbstractC58322PtE.A0Y(c94754Oe), AbstractC58321PtD.A0U(c94754Oe), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    }

                    public SellerBadge(int i) {
                        super(i);
                    }

                    public SellerBadge() {
                        super(TYPE_TAG);
                    }
                }

                /* loaded from: classes11.dex */
                public final class ThumbnailImage extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 168849196;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return ThumbnailImage.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class ImageVersions2 extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage.ImageVersions2 {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -331877511;

                        /* loaded from: classes11.dex */
                        public final class Candidates extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage.ImageVersions2.Candidates {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -1670524483;

                            /* loaded from: classes11.dex */
                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return Candidates.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage.ImageVersions2.Candidates
                            public int getHeight() {
                                return getCoercedIntField(0, IgReactMediaPickerNativeModule.HEIGHT);
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage.ImageVersions2.Candidates
                            public String getUrl() {
                                return A08("url");
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage.ImageVersions2.Candidates
                            public int getWidth() {
                                return A00(IgReactMediaPickerNativeModule.WIDTH);
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage.ImageVersions2.Candidates
                            public boolean hasHeight() {
                                return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
                            }

                            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage.ImageVersions2.Candidates
                            public boolean hasWidth() {
                                return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
                            }

                            public Candidates(int i) {
                                super(i);
                            }

                            @Override // X.C2JS
                            public C4OU modelSelectionSet() {
                                return AbstractC58323PtF.A0T();
                            }

                            public Candidates() {
                                super(TYPE_TAG);
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ImageVersions2.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage.ImageVersions2
                        public ImmutableList getCandidates() {
                            return getOptionalCompactedTreeListField(0, "candidates", Candidates.class, Candidates.TYPE_TAG);
                        }

                        @Override // X.C2JS
                        public C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0W(C4OO.A00(), Candidates.class, "candidates", Candidates.TYPE_TAG);
                        }

                        public ImageVersions2(int i) {
                            super(i);
                        }

                        public ImageVersions2() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage
                    public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage.ImageVersions2 getImageVersions2() {
                        C2JS A05 = A05(ImageVersions2.class, "image_versions2", ImageVersions2.TYPE_TAG);
                        C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ProductTags.In.Product.ThumbnailImage.ImageVersions2");
                        return (ImageVersions2) A05;
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0W(C4OO.A01(), ImageVersions2.class, "image_versions2", ImageVersions2.TYPE_TAG);
                    }

                    public ThumbnailImage(int i) {
                        super(i);
                    }

                    public ThumbnailImage() {
                        super(TYPE_TAG);
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public boolean getCanShareToStory() {
                    return getCoercedBooleanField(2, "can_share_to_story");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public boolean getCanViewerSeeRnr() {
                    return getCoercedBooleanField(3, "can_viewer_see_rnr");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public String getCompoundProductId() {
                    return getOptionalStringField(7, "compound_product_id");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.AggregatedRating getAggregatedRating() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.AggregatedRating) A03(AggregatedRating.class, "aggregated_rating", AggregatedRating.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ArtsLabels getArtsLabels() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ArtsLabels) A02(ArtsLabels.class, "arts_labels", ArtsLabels.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties getCheckoutProperties() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties) getOptionalTreeField(4, "checkout_properties", CheckoutProperties.class, CheckoutProperties.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public EnumC33429Eq0 getCheckoutStyle() {
                    return (EnumC33429Eq0) getOptionalEnumField(5, "checkout_style", EnumC33429Eq0.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CommerceReviewStatistics getCommerceReviewStatistics() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CommerceReviewStatistics) getOptionalTreeField(6, "commerce_review_statistics", CommerceReviewStatistics.class, CommerceReviewStatistics.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public String getCurrentPrice() {
                    return A0D("current_price");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public String getCurrentPriceAmount() {
                    return getOptionalStringField(9, "current_price_amount");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public String getCurrentPriceStripped() {
                    return getOptionalStringField(10, "current_price_stripped");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public String getDescription() {
                    return getOptionalStringField(11, DevServerEntity.COLUMN_DESCRIPTION);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.DiscountInformation getDiscountInformation() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.DiscountInformation) getOptionalTreeField(12, "discount_information", DiscountInformation.class, DiscountInformation.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public String getExternalUrl() {
                    return getOptionalStringField(13, "external_url");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public String getFullPrice() {
                    return getOptionalStringField(14, "full_price");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public String getFullPriceAmount() {
                    return getOptionalStringField(15, "full_price_amount");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public String getFullPriceStripped() {
                    return getOptionalStringField(16, "full_price_stripped");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public boolean getHasVariants() {
                    return getCoercedBooleanField(17, "has_variants");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public boolean getHasViewerSaved() {
                    return getCoercedBooleanField(18, "has_viewer_saved");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public boolean getIgIsProductEditableOnMobile() {
                    return getCoercedBooleanField(19, "ig_is_product_editable_on_mobile");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata getImageQualityMetadata() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata) getOptionalTreeField(20, "image_quality_metadata", ImageQualityMetadata.class, ImageQualityMetadata.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage getMainImage() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage) getOptionalTreeField(23, "main_image", MainImage.class, MainImage.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public String getMainImageId() {
                    return getOptionalStringField(24, "main_image_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.Merchant getMerchant() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.Merchant) getOptionalTreeField(25, "merchant", Merchant.class, Merchant.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public String getName() {
                    return getOptionalStringField(26, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public String getPrice() {
                    return getOptionalStringField(27, "price");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public String getProductId() {
                    return getOptionalStringField(28, "product_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public String getRetailerId() {
                    return getOptionalStringField(29, "retailer_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public String getReviewStatus() {
                    return getOptionalStringField(30, "review_status");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public ImmutableList getRichTextDescription() {
                    return getOptionalCompactedTreeListField(31, "rich_text_description", RichTextDescription.class, RichTextDescription.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.SellerBadge getSellerBadge() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.SellerBadge) getOptionalTreeField(32, "seller_badge", SellerBadge.class, SellerBadge.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public VFM getSizeCalibrationScore() {
                    return (VFM) getOptionalEnumField(33, "size_calibration_score", VFM.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage getThumbnailImage() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage) getOptionalTreeField(34, "thumbnail_image", ThumbnailImage.class, ThumbnailImage.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public boolean hasCanShareToStory() {
                    return hasFieldValue("can_share_to_story");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public boolean hasCanViewerSeeRnr() {
                    return hasFieldValue("can_viewer_see_rnr");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public boolean hasHasVariants() {
                    return hasFieldValue("has_variants");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public boolean hasHasViewerSaved() {
                    return hasFieldValue("has_viewer_saved");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public boolean hasIgIsProductEditableOnMobile() {
                    return hasFieldValue("ig_is_product_editable_on_mobile");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public boolean hasIsEnteredInDrawing() {
                    return hasFieldValue("is_entered_in_drawing");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public boolean hasIsInStock() {
                    return hasFieldValue("is_in_stock");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public boolean isEnteredInDrawing() {
                    return getCoercedBooleanField(21, "is_entered_in_drawing");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product
                public boolean isInStock() {
                    return getCoercedBooleanField(22, "is_in_stock");
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    C4OM[] c4omArr = new C4OM[35];
                    C4OK c4ok = new C4OK(AggregatedRating.class, "aggregated_rating", AggregatedRating.TYPE_TAG);
                    C4OK c4ok2 = new C4OK(ArtsLabels.class, "arts_labels", ArtsLabels.TYPE_TAG);
                    C95124Py c95124Py = C95124Py.A00;
                    C4OW c4ow = new C4OW(c95124Py, "can_share_to_story");
                    C4OW c4ow2 = new C4OW(c95124Py, "can_viewer_see_rnr");
                    C4OK c4ok3 = new C4OK(CheckoutProperties.class, "checkout_properties", CheckoutProperties.TYPE_TAG);
                    C94754Oe c94754Oe = C94754Oe.A00;
                    boolean A1b = AbstractC31175DnJ.A1b(new C4OM[]{c4ok, c4ok2, c4ow, c4ow2, c4ok3, new C4OW(c94754Oe, "checkout_style"), new C4OK(CommerceReviewStatistics.class, "commerce_review_statistics", CommerceReviewStatistics.TYPE_TAG), new C4OW(c94754Oe, "compound_product_id"), new C4OW(c94754Oe, "current_price"), new C4OW(c94754Oe, "current_price_amount"), new C4OW(c94754Oe, "current_price_stripped"), AbstractC58322PtE.A0Y(c94754Oe), new C4OK(DiscountInformation.class, "discount_information", DiscountInformation.TYPE_TAG), new C4OW(c94754Oe, "external_url"), new C4OW(c94754Oe, "full_price"), new C4OW(c94754Oe, "full_price_amount"), new C4OW(c94754Oe, "full_price_stripped"), new C4OW(c95124Py, "has_variants"), new C4OW(c95124Py, "has_viewer_saved"), new C4OW(c95124Py, "ig_is_product_editable_on_mobile"), new C4OK(ImageQualityMetadata.class, "image_quality_metadata", ImageQualityMetadata.TYPE_TAG), new C4OW(c95124Py, "is_entered_in_drawing"), new C4OW(c95124Py, "is_in_stock"), new C4OK(MainImage.class, "main_image", MainImage.TYPE_TAG), new C4OW(c94754Oe, "main_image_id"), new C4OK(Merchant.class, "merchant", Merchant.TYPE_TAG), AbstractC58321PtD.A0U(c94754Oe)}, c4omArr);
                    return AbstractC58321PtD.A0Z(new C4OM[]{new C4OW(c94754Oe, "price"), new C4OW(c94754Oe, "product_id"), new C4OW(c94754Oe, "retailer_id"), new C4OW(c94754Oe, "review_status"), new C4OK(C4OO.A00(), RichTextDescription.class, "rich_text_description", RichTextDescription.TYPE_TAG), new C4OK(SellerBadge.class, "seller_badge", SellerBadge.TYPE_TAG), new C4OW(c94754Oe, "size_calibration_score"), new C4OK(ThumbnailImage.class, "thumbnail_image", ThumbnailImage.TYPE_TAG)}, c4omArr, A1b ? 1 : 0, 27, 8);
                }

                public Product(int i) {
                    super(i);
                }

                public Product() {
                    super(TYPE_TAG);
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In
            public int getDestination() {
                return getCoercedIntField(0, "destination");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In
            public boolean isRemovable() {
                return getCoercedBooleanField(1, "is_removable");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In
            public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product getProduct() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product) A04(Product.class, "product", Product.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In
            public boolean hasDestination() {
                return hasFieldValue("destination");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In
            public boolean hasIsRemovable() {
                return hasFieldValue("is_removable");
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0V(new C4OW(C94894Ou.A00, "destination"), new C4OW(C95124Py.A00, "is_removable"), Product.class, "product", Product.TYPE_TAG);
            }

            public In(int i) {
                super(i);
            }

            public In() {
                super(TYPE_TAG);
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags
        public ImmutableList getIn() {
            return getOptionalCompactedTreeListField(0, "in", In.class, In.TYPE_TAG);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0W(C4OO.A00(), In.class, "in", In.TYPE_TAG);
        }

        public ProductTags(int i) {
            super(i);
        }

        public ProductTags() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class Senders extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.Senders {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 71278224;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return Senders.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Senders
        public String getId() {
            return A07("strong_id__");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Senders
        public String getProfilePicUrl() {
            return A08("profile_pic_url");
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC167017dG.A0Y(c94754Oe, AbstractC166997dE.A0V(c94754Oe), "profile_pic_url");
        }

        public Senders(int i) {
            super(i);
        }

        public Senders() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class SharingFrictionInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.SharingFrictionInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1112720082;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return SharingFrictionInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SharingFrictionInfo
        public boolean getShouldHaveSharingFriction() {
            return getRequiredBooleanField(0, "should_have_sharing_friction");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SharingFrictionInfo
        public boolean hasShouldHaveSharingFriction() {
            return true;
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public SharingFrictionInfo(int i) {
            super(i);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(AbstractC58319PtB.A0S(), "should_have_sharing_friction");
        }

        public SharingFrictionInfo() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class SocialContext extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1497203581;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return SocialContext.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class SocialContextFacepileUsers extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext.SocialContextFacepileUsers {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 1776589540;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return SocialContextFacepileUsers.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext.SocialContextFacepileUsers
            public String getProfilePicId() {
                return getOptionalStringField(6, "profile_pic_id");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext.SocialContextFacepileUsers
            public String getProfilePicUrl() {
                return getOptionalStringField(7, "profile_pic_url");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext.SocialContextFacepileUsers
            public boolean isPrivate() {
                return getCoercedBooleanField(2, "is_private");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext.SocialContextFacepileUsers
            public boolean isVerified() {
                return getCoercedBooleanField(3, "is_verified");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext.SocialContextFacepileUsers
            public String getFullName() {
                return A07("full_name");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext.SocialContextFacepileUsers
            public String getId() {
                return A08("strong_id__");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext.SocialContextFacepileUsers
            public String getPk() {
                return A0B("pk");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext.SocialContextFacepileUsers
            public String getPkId() {
                return A0C("pk_id");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext.SocialContextFacepileUsers
            public boolean hasIsPrivate() {
                return hasFieldValue("is_private");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext.SocialContextFacepileUsers
            public boolean hasIsVerified() {
                return hasFieldValue("is_verified");
            }

            public SocialContextFacepileUsers(int i) {
                super(i);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext.SocialContextFacepileUsers
            public String getUsername() {
                return A0D(AbstractC70143W6w.A00());
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC65703TsZ.A0n();
            }

            public SocialContextFacepileUsers() {
                super(TYPE_TAG);
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext
        public int getSocialContextUsersCount() {
            return getRequiredIntField(2, AbstractC58317Pt9.A00(368));
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext
        public boolean hasSocialContextUsersCount() {
            return true;
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext
        public ImmutableList getSocialContextFacepileUsers() {
            return A06(SocialContextFacepileUsers.class, MSV.A00(578), SocialContextFacepileUsers.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext
        public EnumC39611HeL getSocialContextType() {
            Enum requiredEnumField = getRequiredEnumField(1, AbstractC111324zv.A00(75), EnumC39611HeL.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            C14360o3.A07(requiredEnumField);
            return (EnumC39611HeL) requiredEnumField;
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0X(AbstractC58319PtB.A0R(), new C4OK(C4OO.A02(), SocialContextFacepileUsers.class, MSV.A00(578), SocialContextFacepileUsers.TYPE_TAG), new C4OW(AbstractC58318PtA.A0Q(), AbstractC111324zv.A00(75)), AbstractC58317Pt9.A00(368));
        }

        public SocialContext(int i) {
            super(i);
        }

        public SocialContext() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class SponsorTags extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -488033090;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return SponsorTags.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class Sponsor extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -537744653;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Sponsor.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor
            public boolean getHasOnboardedToTextPostApp() {
                return getCoercedBooleanField(1, "has_onboarded_to_text_post_app");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor
            public String getPk() {
                return getOptionalStringField(6, "pk");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor
            public String getPkId() {
                return getOptionalStringField(7, "pk_id");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor
            public boolean isPrivate() {
                return getCoercedBooleanField(3, "is_private");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor
            public boolean isUnpublished() {
                return getCoercedBooleanField(4, "is_unpublished");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor
            public boolean isVerified() {
                return getCoercedBooleanField(5, "is_verified");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor
            public String getFullName() {
                return A07("full_name");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor
            public String getId() {
                return A09("strong_id__");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor
            public String getProfilePicId() {
                return A0D("profile_pic_id");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor
            public String getProfilePicUrl() {
                return getOptionalStringField(9, "profile_pic_url");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor
            public String getUsername() {
                return getOptionalStringField(10, AbstractC70143W6w.A00());
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor
            public boolean hasHasOnboardedToTextPostApp() {
                return hasFieldValue("has_onboarded_to_text_post_app");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor
            public boolean hasIsPrivate() {
                return hasFieldValue("is_private");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor
            public boolean hasIsUnpublished() {
                return hasFieldValue("is_unpublished");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor
            public boolean hasIsVerified() {
                return hasFieldValue("is_verified");
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW c4ow = new C4OW(c94754Oe, "full_name");
                C95124Py c95124Py = C95124Py.A00;
                return new C4OU(new C4OM[]{c4ow, new C4OW(c95124Py, "has_onboarded_to_text_post_app"), AbstractC166997dE.A0V(c94754Oe), new C4OW(c95124Py, "is_private"), new C4OW(c95124Py, "is_unpublished"), new C4OW(c95124Py, "is_verified"), new C4OW(c94754Oe, "pk"), new C4OW(c94754Oe, "pk_id"), new C4OW(c94754Oe, "profile_pic_id"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, AbstractC70143W6w.A00())});
            }

            public Sponsor(int i) {
                super(i);
            }

            public Sponsor() {
                super(TYPE_TAG);
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags
        public boolean getPermission() {
            return getCoercedBooleanField(1, "permission");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags
        public boolean isPending() {
            return getCoercedBooleanField(0, "is_pending");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags
        public CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor getSponsor() {
            C2JS requiredTreeField = getRequiredTreeField(2, "sponsor", Sponsor.class, Sponsor.TYPE_TAG);
            C14360o3.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.SponsorTags.Sponsor");
            return (Sponsor) requiredTreeField;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags
        public boolean hasIsPending() {
            return hasFieldValue("is_pending");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags
        public boolean hasPermission() {
            return hasFieldValue("permission");
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C95124Py c95124Py = C95124Py.A00;
            return AbstractC58319PtB.A0T(new C4OW(c95124Py, "is_pending"), new C4OW(c95124Py, "permission"), new C4OK(C4OO.A01(), Sponsor.class, "sponsor", Sponsor.TYPE_TAG));
        }

        public SponsorTags(int i) {
            super(i);
        }

        public SponsorTags() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class StoryPolls extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1045589405;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return StoryPolls.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class PollSticker extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -52606389;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return PollSticker.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class Tallies extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker.Tallies {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 954228534;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return Tallies.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker.Tallies
                public int getCount() {
                    return getCoercedIntField(0, "count");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker.Tallies
                public double getFontSize() {
                    return getCoercedDoubleField(1, "font_size");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker.Tallies
                public String getText() {
                    return A09("text");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker.Tallies
                public boolean hasCount() {
                    return hasFieldValue("count");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker.Tallies
                public boolean hasFontSize() {
                    return hasFieldValue("font_size");
                }

                public Tallies(int i) {
                    super(i);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0X(C94754Oe.A00, AbstractC58322PtE.A0N(), new C4OW(C173847oc.A00, "font_size"), "text");
                }

                public Tallies() {
                    super(TYPE_TAG);
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker
            public boolean getFinished() {
                return getCoercedBooleanField(1, "finished");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker
            public String getPollType() {
                return getOptionalStringField(6, "poll_type");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker
            public String getQuestion() {
                return getOptionalStringField(7, "question");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker
            public boolean isMultiOptionPoll() {
                return getCoercedBooleanField(3, "is_multi_option_poll");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker
            public boolean isSharedResult() {
                return getCoercedBooleanField(4, "is_shared_result");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker
            public String getColor() {
                return A07("color");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker
            public String getId() {
                return A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker
            public String getPollId() {
                return A0C("poll_id");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker
            public ImmutableList getTallies() {
                return getOptionalCompactedTreeListField(8, "tallies", Tallies.class, Tallies.TYPE_TAG);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker
            public boolean getViewerCanVote() {
                return getCoercedBooleanField(9, "viewer_can_vote");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker
            public int getViewerVote() {
                return getCoercedIntField(10, "viewer_vote");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker
            public boolean hasFinished() {
                return hasFieldValue("finished");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker
            public boolean hasIsMultiOptionPoll() {
                return hasFieldValue("is_multi_option_poll");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker
            public boolean hasIsSharedResult() {
                return hasFieldValue("is_shared_result");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker
            public boolean hasViewerCanVote() {
                return hasFieldValue("viewer_can_vote");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker
            public boolean hasViewerVote() {
                return hasFieldValue("viewer_vote");
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW c4ow = new C4OW(c94754Oe, "color");
                C95124Py c95124Py = C95124Py.A00;
                return new C4OU(new C4OM[]{c4ow, new C4OW(c95124Py, "finished"), AbstractC166997dE.A0V(c94754Oe), new C4OW(c95124Py, "is_multi_option_poll"), new C4OW(c95124Py, "is_shared_result"), new C4OW(c94754Oe, "poll_id"), new C4OW(c94754Oe, "poll_type"), new C4OW(c94754Oe, "question"), new C4OK(C4OO.A00(), Tallies.class, "tallies", Tallies.TYPE_TAG), new C4OW(c95124Py, "viewer_can_vote"), new C4OW(C94894Ou.A00, "viewer_vote")});
            }

            public PollSticker(int i) {
                super(i);
            }

            public PollSticker() {
                super(TYPE_TAG);
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public double getEndTimeMs() {
            return getCoercedDoubleField(0, "end_time_ms");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public double getHeight() {
            return getCoercedDoubleField(1, IgReactMediaPickerNativeModule.HEIGHT);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public double getRotation() {
            return getCoercedDoubleField(7, "rotation");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public int isHidden() {
            return getCoercedIntField(3, "is_hidden");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public int isPinned() {
            return getCoercedIntField(4, "is_pinned");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public int isSticker() {
            return getCoercedIntField(5, "is_sticker");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker getPollSticker() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker) getOptionalTreeField(6, "poll_sticker", PollSticker.class, PollSticker.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public double getStartTimeMs() {
            return getCoercedDoubleField(8, "start_time_ms");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public double getWidth() {
            return getCoercedDoubleField(9, IgReactMediaPickerNativeModule.WIDTH);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public double getX() {
            return getCoercedDoubleField(10, "x");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public double getY() {
            return getCoercedDoubleField(11, "y");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public double getZ() {
            return getCoercedDoubleField(12, "z");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public boolean hasEndTimeMs() {
            return hasFieldValue("end_time_ms");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public boolean hasHeight() {
            return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public boolean hasIsFbSticker() {
            return hasFieldValue("is_fb_sticker");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public boolean hasIsHidden() {
            return hasFieldValue("is_hidden");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public boolean hasIsPinned() {
            return hasFieldValue("is_pinned");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public boolean hasIsSticker() {
            return hasFieldValue("is_sticker");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public boolean hasRotation() {
            return hasFieldValue("rotation");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public boolean hasStartTimeMs() {
            return hasFieldValue("start_time_ms");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public boolean hasWidth() {
            return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public boolean hasX() {
            return hasFieldValue("x");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public boolean hasY() {
            return hasFieldValue("y");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public boolean hasZ() {
            return hasFieldValue("z");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls
        public int isFbSticker() {
            return A00("is_fb_sticker");
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C173847oc c173847oc = C173847oc.A00;
            C4OW c4ow = new C4OW(c173847oc, "end_time_ms");
            C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
            C94894Ou c94894Ou = C94894Ou.A00;
            return new C4OU(new C4OM[]{c4ow, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OK(PollSticker.class, "poll_sticker", PollSticker.TYPE_TAG), new C4OW(c173847oc, "rotation"), new C4OW(c173847oc, "start_time_ms"), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
        }

        public StoryPolls(int i) {
            super(i);
        }

        public StoryPolls() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class StorySliders extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1521320246;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return StorySliders.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class SliderSticker extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -1020754219;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return SliderSticker.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker
            public double getSliderVoteAverage() {
                return getCoercedDoubleField(5, "slider_vote_average");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker
            public int getSliderVoteCount() {
                return getCoercedIntField(6, "slider_vote_count");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker
            public String getTextColor() {
                return getOptionalStringField(7, "text_color");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker
            public boolean isInteractiveMusicSticker() {
                return getCoercedBooleanField(2, "is_interactive_music_sticker");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker
            public String getBackgroundColor() {
                return A07("background_color");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker
            public String getEmoji() {
                return A08("emoji");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker
            public String getQuestion() {
                return A0A("question");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker
            public String getSliderId() {
                return A0B("slider_id");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker
            public boolean getViewerCanVote() {
                return getCoercedBooleanField(8, "viewer_can_vote");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker
            public boolean hasIsInteractiveMusicSticker() {
                return hasFieldValue("is_interactive_music_sticker");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker
            public boolean hasSliderVoteAverage() {
                return hasFieldValue("slider_vote_average");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker
            public boolean hasSliderVoteCount() {
                return hasFieldValue("slider_vote_count");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker
            public boolean hasViewerCanVote() {
                return hasFieldValue("viewer_can_vote");
            }

            public SliderSticker(int i) {
                super(i);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC65704Tsa.A02();
            }

            public SliderSticker() {
                super(TYPE_TAG);
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public double getEndTimeMs() {
            return getCoercedDoubleField(0, "end_time_ms");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public double getHeight() {
            return getCoercedDoubleField(1, IgReactMediaPickerNativeModule.HEIGHT);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public double getRotation() {
            return getCoercedDoubleField(6, "rotation");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public int isHidden() {
            return getCoercedIntField(3, "is_hidden");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public int isPinned() {
            return getCoercedIntField(4, "is_pinned");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public int isSticker() {
            return getCoercedIntField(5, "is_sticker");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker getSliderSticker() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker) getOptionalTreeField(7, "slider_sticker", SliderSticker.class, SliderSticker.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public double getStartTimeMs() {
            return getCoercedDoubleField(8, "start_time_ms");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public double getWidth() {
            return getCoercedDoubleField(9, IgReactMediaPickerNativeModule.WIDTH);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public double getX() {
            return getCoercedDoubleField(10, "x");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public double getY() {
            return getCoercedDoubleField(11, "y");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public double getZ() {
            return getCoercedDoubleField(12, "z");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public boolean hasEndTimeMs() {
            return hasFieldValue("end_time_ms");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public boolean hasHeight() {
            return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public boolean hasIsFbSticker() {
            return hasFieldValue("is_fb_sticker");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public boolean hasIsHidden() {
            return hasFieldValue("is_hidden");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public boolean hasIsPinned() {
            return hasFieldValue("is_pinned");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public boolean hasIsSticker() {
            return hasFieldValue("is_sticker");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public boolean hasRotation() {
            return hasFieldValue("rotation");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public boolean hasStartTimeMs() {
            return hasFieldValue("start_time_ms");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public boolean hasWidth() {
            return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public boolean hasX() {
            return hasFieldValue("x");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public boolean hasY() {
            return hasFieldValue("y");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public boolean hasZ() {
            return hasFieldValue("z");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders
        public int isFbSticker() {
            return A00("is_fb_sticker");
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C173847oc c173847oc = C173847oc.A00;
            C4OW c4ow = new C4OW(c173847oc, "end_time_ms");
            C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
            C94894Ou c94894Ou = C94894Ou.A00;
            return new C4OU(new C4OM[]{c4ow, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OW(c173847oc, "rotation"), new C4OK(SliderSticker.class, "slider_sticker", SliderSticker.TYPE_TAG), new C4OW(c173847oc, "start_time_ms"), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
        }

        public StorySliders(int i) {
            super(i);
        }

        public StorySliders() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class UpcomingEvent extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1189174786;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return UpcomingEvent.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class Owner extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent.Owner {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 695869281;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Owner.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent.Owner
            public String getId() {
                return A07("strong_id__");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent.Owner
            public String getPk() {
                return A08("pk");
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC167017dG.A0Y(c94754Oe, AbstractC166997dE.A0V(c94754Oe), "pk");
            }

            public Owner(int i) {
                super(i);
            }

            public Owner() {
                super(TYPE_TAG);
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent
        public long getEndTime() {
            return getCoercedTimeField(0, "end_time");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent
        public String getId() {
            return AbstractC65702TsY.A0a(this, "strong_id__", 1);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent
        public boolean getReminderEnabled() {
            return getRequiredBooleanField(3, "reminder_enabled");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent
        public long getStartTime() {
            return getRequiredTimeField(4, TraceFieldType.StartTime);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent
        public String getTitle() {
            return AbstractC65702TsY.A0a(this, DialogModule.KEY_TITLE, 6);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent
        public boolean hasReminderEnabled() {
            return true;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent
        public boolean hasStartTime() {
            return true;
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent
        public CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent.Owner getOwner() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent.Owner) A04(Owner.class, "owner", Owner.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent
        public String getStrongId() {
            return A0C("strong_id__");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent
        public EnumC39613HeN getUpcomingEventIdType() {
            Enum requiredEnumField = getRequiredEnumField(7, AbstractC58317Pt9.A00(382), EnumC39613HeN.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            C14360o3.A07(requiredEnumField);
            return (EnumC39613HeN) requiredEnumField;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent
        public boolean hasEndTime() {
            return hasFieldValue("end_time");
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C67A c67a = C67A.A00;
            C4OW c4ow = new C4OW(c67a, "end_time");
            C94754Oe c94754Oe = C94754Oe.A00;
            return new C4OU(new C4OM[]{c4ow, AbstractC58320PtC.A0P(c94754Oe), new C4OK(Owner.class, "owner", Owner.TYPE_TAG), new C4OW(AbstractC58319PtB.A0S(), "reminder_enabled"), new C4OW(new C94774Oi(c67a), TraceFieldType.StartTime), new C4OW(c94754Oe, "strong_id__"), AbstractC58319PtB.A0L(new C94774Oi(c94754Oe)), new C4OW(new C94774Oi(c94754Oe), AbstractC58317Pt9.A00(382))});
        }

        public UpcomingEvent(int i) {
            super(i);
        }

        public UpcomingEvent() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class User extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.User {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1222124418;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return User.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.User
        public CreatorInspirationSignalsPlaygroundTestUser asCreatorInspirationSignalsPlaygroundTestUser() {
            return (CreatorInspirationSignalsPlaygroundTestUser) A01(CreatorInspirationSignalsPlaygroundTestUserImpl.class, CreatorInspirationSignalsPlaygroundTestUserImpl.TYPE_TAG);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0a(CreatorInspirationSignalsPlaygroundTestUserImpl.class, "CreatorInspirationSignalsPlaygroundTestUser", CreatorInspirationSignalsPlaygroundTestUserImpl.TYPE_TAG);
        }

        public User(int i) {
            super(i);
        }

        public User() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes10.dex */
    public final class Usertags extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.Usertags {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -1340760331;

        /* loaded from: classes10.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return Usertags.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes10.dex */
        public final class In extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -2067737728;

            /* loaded from: classes10.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return In.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes10.dex */
            public final class User extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 970400371;

                /* loaded from: classes10.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return User.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                /* loaded from: classes10.dex */
                public final class FriendshipStatus extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 537553227;

                    /* loaded from: classes10.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return FriendshipStatus.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean getBlocking() {
                        return getCoercedBooleanField(0, "blocking");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean getFollowedBy() {
                        return getCoercedBooleanField(1, "followed_by");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean getFollowing() {
                        return getCoercedBooleanField(2, "following");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean getIncomingRequest() {
                        return getCoercedBooleanField(3, "incoming_request");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean isBestie() {
                        return getCoercedBooleanField(4, "is_bestie");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean isFeedFavorite() {
                        return getCoercedBooleanField(5, "is_feed_favorite");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean isPrivate() {
                        return getCoercedBooleanField(6, "is_private");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean isRestricted() {
                        return getCoercedBooleanField(7, "is_restricted");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean getMuting() {
                        return getCoercedBooleanField(8, "muting");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean getOutgoingRequest() {
                        return getCoercedBooleanField(9, "outgoing_request");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean hasBlocking() {
                        return hasFieldValue("blocking");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean hasFollowedBy() {
                        return hasFieldValue("followed_by");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean hasFollowing() {
                        return hasFieldValue("following");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean hasIncomingRequest() {
                        return hasFieldValue("incoming_request");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean hasIsBestie() {
                        return hasFieldValue("is_bestie");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean hasIsFeedFavorite() {
                        return hasFieldValue("is_feed_favorite");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean hasIsPrivate() {
                        return hasFieldValue("is_private");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean hasIsRestricted() {
                        return hasFieldValue("is_restricted");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean hasMuting() {
                        return hasFieldValue("muting");
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus
                    public boolean hasOutgoingRequest() {
                        return hasFieldValue("outgoing_request");
                    }

                    public FriendshipStatus(int i) {
                        super(i);
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC58324PtG.A0B();
                    }

                    public FriendshipStatus() {
                        super(TYPE_TAG);
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User
                public boolean getHasOnboardedToTextPostApp() {
                    return getCoercedBooleanField(2, "has_onboarded_to_text_post_app");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User
                public String getPk() {
                    return getOptionalStringField(6, "pk");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User
                public String getPkId() {
                    return getOptionalStringField(7, "pk_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User
                public boolean isPrivate() {
                    return getCoercedBooleanField(4, "is_private");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User
                public boolean isVerified() {
                    return getCoercedBooleanField(5, "is_verified");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User
                public CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus getFriendshipStatus() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus) A03(FriendshipStatus.class, "friendship_status", FriendshipStatus.TYPE_TAG);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User
                public String getFullName() {
                    return A08("full_name");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User
                public String getProfilePicId() {
                    return A0D("profile_pic_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User
                public String getProfilePicUrl() {
                    return getOptionalStringField(9, "profile_pic_url");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User
                public String getUsername() {
                    return getOptionalStringField(10, AbstractC70143W6w.A00());
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User
                public boolean hasHasOnboardedToTextPostApp() {
                    return hasFieldValue("has_onboarded_to_text_post_app");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User
                public boolean hasIsPrivate() {
                    return hasFieldValue("is_private");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User
                public boolean hasIsVerified() {
                    return hasFieldValue("is_verified");
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    C4OK A0M = AbstractC58322PtE.A0M(FriendshipStatus.class, FriendshipStatus.TYPE_TAG);
                    C94754Oe c94754Oe = C94754Oe.A00;
                    C4OW A0E = AbstractC58319PtB.A0E(c94754Oe);
                    C95124Py c95124Py = C95124Py.A00;
                    return AbstractC166987dD.A0k(new C4OM[]{A0M, A0E, AbstractC58322PtE.A0T(c95124Py), AbstractC166997dE.A0V(c94754Oe), AbstractC58319PtB.A0O(c95124Py), AbstractC58319PtB.A0P(c95124Py), AbstractC58319PtB.A0H(c94754Oe), AbstractC58319PtB.A0K(c94754Oe), AbstractC58319PtB.A0Q(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC166987dD.A0i(c94754Oe, AbstractC70143W6w.A00())});
                }

                public User(int i) {
                    super(i);
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User
                public String getId() {
                    return A0A("strong_id__");
                }

                public User() {
                    super(TYPE_TAG);
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In
            public boolean getShowCategoryOfUser() {
                return getCoercedBooleanField(0, "show_category_of_user");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In
            public CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User getUser() {
                C2JS requiredTreeField = getRequiredTreeField(1, PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.class, User.TYPE_TAG);
                C14360o3.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.Usertags.In.User");
                return (User) requiredTreeField;
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0T(C4OO.A01(), AbstractC166987dD.A0i(C95124Py.A00, "show_category_of_user"), User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.TYPE_TAG);
            }

            public In(int i) {
                super(i);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In
            public boolean hasShowCategoryOfUser() {
                return hasFieldValue("show_category_of_user");
            }

            public In() {
                super(TYPE_TAG);
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.Usertags
        public ImmutableList getIn() {
            return A06(In.class, "in", In.TYPE_TAG);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0W(C4OO.A02(), In.class, "in", In.TYPE_TAG);
        }

        public Usertags(int i) {
            super(i);
        }

        public Usertags() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class VideoVersions extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.VideoVersions {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1875779970;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return VideoVersions.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VideoVersions
        public int getHeight() {
            return getCoercedIntField(0, IgReactMediaPickerNativeModule.HEIGHT);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VideoVersions
        public int getWidth() {
            return getCoercedIntField(4, IgReactMediaPickerNativeModule.WIDTH);
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VideoVersions
        public String getId() {
            return A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VideoVersions
        public int getType() {
            return A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VideoVersions
        public String getUrl() {
            return A0A("url");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VideoVersions
        public boolean hasHeight() {
            return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VideoVersions
        public boolean hasType() {
            return hasFieldValue(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VideoVersions
        public boolean hasWidth() {
            return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
        }

        public VideoVersions(int i) {
            super(i);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC58321PtD.A0X();
        }

        public VideoVersions() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class VisualCommentReplyStickerInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 963301183;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return VisualCommentReplyStickerInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class VcrSticker extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 97836346;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return VcrSticker.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class OriginalCommentAuthor extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 1163556531;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return OriginalCommentAuthor.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor
                public boolean getHasOnboardedToTextPostApp() {
                    return getCoercedBooleanField(1, "has_onboarded_to_text_post_app");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor
                public String getPkId() {
                    return getOptionalStringField(6, "pk_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor
                public String getProfilePicId() {
                    return getOptionalStringField(7, "profile_pic_id");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor
                public boolean isPrivate() {
                    return getCoercedBooleanField(3, "is_private");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor
                public boolean isVerified() {
                    return getCoercedBooleanField(4, "is_verified");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor
                public String getFullName() {
                    return A07("full_name");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor
                public String getId() {
                    return A09("strong_id__");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor
                public String getPk() {
                    return A0C("pk");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor
                public String getProfilePicUrl() {
                    return A0D("profile_pic_url");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor
                public String getUsername() {
                    return getOptionalStringField(9, AbstractC70143W6w.A00());
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor
                public boolean hasHasOnboardedToTextPostApp() {
                    return hasFieldValue("has_onboarded_to_text_post_app");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor
                public boolean hasIsPrivate() {
                    return hasFieldValue("is_private");
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor
                public boolean hasIsVerified() {
                    return hasFieldValue("is_verified");
                }

                public OriginalCommentAuthor(int i) {
                    super(i);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC65704Tsa.A04();
                }

                public OriginalCommentAuthor() {
                    super(TYPE_TAG);
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker
            public boolean getCanViewerLinkBackToOriginalMediaFromVcr() {
                return getRequiredBooleanField(0, "can_viewer_link_back_to_original_media_from_vcr");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker
            public double getEndTimeMs() {
                return getCoercedDoubleField(2, "end_time_ms");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker
            public String getOriginalCommentId() {
                return AbstractC65702TsY.A0a(this, "original_comment_id", 4);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker
            public String getOriginalCommentText() {
                return AbstractC65702TsY.A0a(this, "original_comment_text", 5);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker
            public String getOriginalMediaId() {
                return AbstractC65702TsY.A0a(this, "original_media_id", 6);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker
            public String getStartBackgroundColor() {
                return getOptionalStringField(7, "start_background_color");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker
            public boolean hasCanViewerLinkBackToOriginalMediaFromVcr() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker
            public String getEndBackgroundColor() {
                return A08("end_background_color");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker
            public CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor getOriginalCommentAuthor() {
                C2JS requiredTreeField = getRequiredTreeField(3, "original_comment_author", OriginalCommentAuthor.class, OriginalCommentAuthor.TYPE_TAG);
                C14360o3.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor");
                return (OriginalCommentAuthor) requiredTreeField;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker
            public double getStartTimeMs() {
                return getCoercedDoubleField(8, "start_time_ms");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker
            public String getTextColor() {
                return getOptionalStringField(9, "text_color");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker
            public boolean hasEndTimeMs() {
                return hasFieldValue("end_time_ms");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker
            public boolean hasStartTimeMs() {
                return hasFieldValue("start_time_ms");
            }

            public VcrSticker(int i) {
                super(i);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                C4OW A0C = AbstractC65703TsZ.A0C();
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW c4ow = new C4OW(c94754Oe, "end_background_color");
                C173847oc c173847oc = C173847oc.A00;
                return new C4OU(new C4OM[]{A0C, c4ow, new C4OW(c173847oc, "end_time_ms"), new C4OK(C4OO.A01(), OriginalCommentAuthor.class, "original_comment_author", OriginalCommentAuthor.TYPE_TAG), new C4OW(new C94774Oi(c94754Oe), "original_comment_id"), new C4OW(new C94774Oi(c94754Oe), "original_comment_text"), AbstractC65703TsZ.A0F(c94754Oe), new C4OW(c94754Oe, "start_background_color"), new C4OW(c173847oc, "start_time_ms"), new C4OW(c94754Oe, "text_color")});
            }

            public VcrSticker() {
                super(TYPE_TAG);
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public double getEndTimeMs() {
            return getCoercedDoubleField(0, "end_time_ms");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public double getHeight() {
            return getCoercedDoubleField(1, IgReactMediaPickerNativeModule.HEIGHT);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public double getRotation() {
            return getCoercedDoubleField(6, "rotation");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public double getStartTimeMs() {
            return getCoercedDoubleField(7, "start_time_ms");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public int isHidden() {
            return getCoercedIntField(3, "is_hidden");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public int isPinned() {
            return getCoercedIntField(4, "is_pinned");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public int isSticker() {
            return getCoercedIntField(5, "is_sticker");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker getVcrSticker() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker) getOptionalTreeField(8, "vcr_sticker", VcrSticker.class, VcrSticker.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public double getWidth() {
            return getCoercedDoubleField(9, IgReactMediaPickerNativeModule.WIDTH);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public double getX() {
            return getCoercedDoubleField(10, "x");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public double getY() {
            return getCoercedDoubleField(11, "y");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public double getZ() {
            return getCoercedDoubleField(12, "z");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public boolean hasEndTimeMs() {
            return hasFieldValue("end_time_ms");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public boolean hasHeight() {
            return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public boolean hasIsFbSticker() {
            return hasFieldValue("is_fb_sticker");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public boolean hasIsHidden() {
            return hasFieldValue("is_hidden");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public boolean hasIsPinned() {
            return hasFieldValue("is_pinned");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public boolean hasIsSticker() {
            return hasFieldValue("is_sticker");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public boolean hasRotation() {
            return hasFieldValue("rotation");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public boolean hasStartTimeMs() {
            return hasFieldValue("start_time_ms");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public boolean hasWidth() {
            return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public boolean hasX() {
            return hasFieldValue("x");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public boolean hasY() {
            return hasFieldValue("y");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public boolean hasZ() {
            return hasFieldValue("z");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo
        public int isFbSticker() {
            return A00("is_fb_sticker");
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C173847oc c173847oc = C173847oc.A00;
            C4OW c4ow = new C4OW(c173847oc, "end_time_ms");
            C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
            C94894Ou c94894Ou = C94894Ou.A00;
            return new C4OU(new C4OM[]{c4ow, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OW(c173847oc, "rotation"), new C4OW(c173847oc, "start_time_ms"), new C4OK(VcrSticker.class, "vcr_sticker", VcrSticker.TYPE_TAG), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
        }

        public VisualCommentReplyStickerInfo(int i) {
            super(i);
        }

        public VisualCommentReplyStickerInfo() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class VisualRepliesInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 725946755;

        /* loaded from: classes11.dex */
        public final class CommentInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo.CommentInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 668313176;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return CommentInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo.CommentInfo
            public String getCommentId() {
                return AbstractC65702TsY.A0a(this, "comment_id", 0);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo.CommentInfo
            public String getCommenterUsername() {
                return AbstractC65702TsY.A0a(this, "commenter_username", 1);
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC167017dG.A0Y(new C94774Oi(c94754Oe), new C4OW(new C94774Oi(c94754Oe), "comment_id"), "commenter_username");
            }

            public CommentInfo(int i) {
                super(i);
            }

            public CommentInfo() {
                super(TYPE_TAG);
            }
        }

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return VisualRepliesInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class OriginalMedia extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo.OriginalMedia {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -636376882;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return OriginalMedia.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo.OriginalMedia
            public String getPk() {
                return AbstractC65702TsY.A0a(this, "pk", 0);
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public OriginalMedia(int i) {
                super(i);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Z(AbstractC58318PtA.A0Q(), "pk");
            }

            public OriginalMedia() {
                super(TYPE_TAG);
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo
        public boolean getCanViewerLinkBackToOriginalMediaFromVcr() {
            return getRequiredBooleanField(0, "can_viewer_link_back_to_original_media_from_vcr");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo
        public boolean hasCanViewerLinkBackToOriginalMediaFromVcr() {
            return true;
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo
        public CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo.CommentInfo getCommentInfo() {
            C2JS requiredTreeField = getRequiredTreeField(1, "comment_info", CommentInfo.class, CommentInfo.TYPE_TAG);
            C14360o3.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.VisualRepliesInfo.CommentInfo");
            return (CommentInfo) requiredTreeField;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo
        public CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo.OriginalMedia getOriginalMedia() {
            C2JS requiredTreeField = getRequiredTreeField(2, "original_media", OriginalMedia.class, OriginalMedia.TYPE_TAG);
            C14360o3.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.VisualRepliesInfo.OriginalMedia");
            return (OriginalMedia) requiredTreeField;
        }

        public VisualRepliesInfo(int i) {
            super(i);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC58319PtB.A0T(AbstractC65703TsZ.A0C(), new C4OK(C4OO.A01(), CommentInfo.class, "comment_info", CommentInfo.TYPE_TAG), new C4OK(C4OO.A01(), OriginalMedia.class, "original_media", OriginalMedia.TYPE_TAG));
        }

        public VisualRepliesInfo() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class WearableAttributionInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 211516579;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return WearableAttributionInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class WorldLocationPagesInfo extends C2JS implements CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo.WorldLocationPagesInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -1560223820;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return WorldLocationPagesInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo.WorldLocationPagesInfo
            public int getPostCount() {
                return getCoercedIntField(1, "post_count");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo.WorldLocationPagesInfo
            public String getCoverPhoto() {
                return A07("cover_photo");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo.WorldLocationPagesInfo
            public String getWorldId() {
                return A09("world_id");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo.WorldLocationPagesInfo
            public boolean hasPostCount() {
                return hasFieldValue("post_count");
            }

            public WorldLocationPagesInfo(int i) {
                super(i);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC65703TsZ.A0t();
            }

            public WorldLocationPagesInfo() {
                super(TYPE_TAG);
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo
        public String getAttributionCtaActionUrl() {
            return AbstractC65702TsY.A0a(this, "attribution_cta_action_url", 0);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo
        public String getAttributionCtaText() {
            return AbstractC65702TsY.A0a(this, "attribution_cta_text", 1);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo
        public String getAttributionIconUrl() {
            return AbstractC65702TsY.A0a(this, "attribution_icon_url", 2);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo
        public String getAttributionSubtitle() {
            return AbstractC65702TsY.A0a(this, "attribution_subtitle", 3);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo
        public String getAttributionTitle() {
            return AbstractC65702TsY.A0a(this, "attribution_title", 4);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo
        public String getAttributionTopIconUrl() {
            return AbstractC65702TsY.A0a(this, "attribution_top_icon_url", 5);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo
        public int getIconicCurrentPresence() {
            return getCoercedIntField(7, "iconic_current_presence");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo
        public boolean hasIsWearableMediaProducer() {
            return true;
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo
        public EnumC27412C7p getAttributionType() {
            return (EnumC27412C7p) getOptionalEnumField(6, "attribution_type", EnumC27412C7p.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo
        public String getIconicHorizonWorldDeeplink() {
            return A0D("iconic_horizon_world_deeplink");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo
        public String getIconicHorizonWorldId() {
            return getOptionalStringField(9, "iconic_horizon_world_id");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo
        public String getIconicHorizonWorldName() {
            return getOptionalStringField(10, "iconic_horizon_world_name");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo
        public CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo.WorldLocationPagesInfo getWorldLocationPagesInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo.WorldLocationPagesInfo) getOptionalTreeField(12, "world_location_pages_info", WorldLocationPagesInfo.class, WorldLocationPagesInfo.TYPE_TAG);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo
        public boolean hasIconicCurrentPresence() {
            return hasFieldValue("iconic_current_presence");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo
        public boolean isWearableMediaProducer() {
            return getRequiredBooleanField(11, "is_wearable_media_producer");
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return new C4OU(new C4OM[]{AbstractC65703TsZ.A0O(c94754Oe), AbstractC65703TsZ.A0Q(c94754Oe), AbstractC65703TsZ.A0R(c94754Oe), AbstractC65703TsZ.A0S(c94754Oe), AbstractC65703TsZ.A0T(c94754Oe), AbstractC65703TsZ.A0I(c94754Oe), new C4OW(c94754Oe, "attribution_type"), new C4OW(C94894Ou.A00, "iconic_current_presence"), new C4OW(c94754Oe, "iconic_horizon_world_deeplink"), new C4OW(c94754Oe, "iconic_horizon_world_id"), new C4OW(c94754Oe, "iconic_horizon_world_name"), AbstractC65703TsZ.A0D(), new C4OK(WorldLocationPagesInfo.class, "world_location_pages_info", WorldLocationPagesInfo.TYPE_TAG)});
        }

        public WearableAttributionInfo(int i) {
            super(i);
        }

        public WearableAttributionInfo() {
            super(TYPE_TAG);
        }
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public C38321qM asApiTypeModel(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        C38801rC c38801rC = C38321qM.A0h;
        TreeJNI reinterpret = reinterpret(ImmutablePandoMediaDict.class);
        C14360o3.A07(reinterpret);
        return C38801rC.A00(new C1DY(c1dv, 6, false), (ImmutablePandoMediaDict) reinterpret);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public C38321qM asRestModel__DO_NOT_USE(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        C38801rC c38801rC = C38321qM.A0h;
        TreeJNI reinterpret = reinterpret(ImmutablePandoMediaDict.class);
        C14360o3.A07(reinterpret);
        return C38801rC.A01(new C1DY(c1dv, 6, false), (ImmutablePandoMediaDict) reinterpret);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getAreRemixesCrosspostable() {
        return getCoercedBooleanField(1, "are_remixes_crosspostable");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getBoostedBySponsor() {
        return getOptionalStringField(6, "boosted_by_sponsor");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getBoostedStatus() {
        return getOptionalStringField(7, "boosted_status");
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.Attribution getAttribution() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.Attribution) A04(Attribution.class, "attribution", Attribution.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getAudience() {
        return A0A("audience");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getBoostUnavailableIdentifier() {
        return A0B("boost_unavailable_identifier");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getBoostUnavailableReason() {
        return A0C("boost_unavailable_reason");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public ImmutableList getBrandedContentAdsBoostPostTokens() {
        return getOptionalCompactedTreeListField(8, "branded_content_ads_boost_post_tokens", BrandedContentAdsBoostPostTokens.class, BrandedContentAdsBoostPostTokens.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getCanSeeInsightsAsBrand() {
        return getCoercedBooleanField(9, "can_see_insights_as_brand");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getCanViewerReshare() {
        return getCoercedBooleanField(10, "can_viewer_reshare");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getCanViewerSave() {
        return getCoercedBooleanField(11, "can_viewer_save");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.Caption getCaption() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.Caption) getOptionalTreeField(12, "caption", Caption.class, Caption.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getCaptionIsEdited() {
        return getCoercedBooleanField(13, "caption_is_edited");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo getClipsAttributionInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo) getOptionalTreeField(14, "clips_attribution_info", ClipsAttributionInfo.class, ClipsAttributionInfo.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata getClipsMetadata() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata) getOptionalTreeField(16, "clips_metadata", ClipsMetadata.class, ClipsMetadata.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public ImmutableList getClipsTabPinnedUserIds() {
        return getOptionalCompactedStringListField(15, "clips_tab_pinned_user_ids");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getCoauthorProducerCanSeeOrganicInsights() {
        return getCoercedBooleanField(17, "coauthor_producer_can_see_organic_insights");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public ImmutableList getCoauthorProducers() {
        return getOptionalCompactedTreeListField(18, "coauthor_producers", CoauthorProducers.class, CoauthorProducers.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getCode() {
        return getOptionalStringField(19, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public int getCommentCount() {
        return getCoercedIntField(20, "comment_count");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.CommentInformTreatment getCommentInformTreatment() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.CommentInformTreatment) getOptionalTreeField(21, "comment_inform_treatment", CommentInformTreatment.class, CommentInformTreatment.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getCommentingDisabledForViewer() {
        return getCoercedBooleanField(22, "commenting_disabled_for_viewer");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getCommentsDisabled() {
        return getCoercedBooleanField(23, "comments_disabled");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig getCreativeConfig() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig) getOptionalTreeField(24, "creative_config", CreativeConfig.class, CreativeConfig.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public int getDeletedReason() {
        return getCoercedIntField(25, "deleted_reason");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public long getDeviceTimestamp() {
        return getCoercedTimeField(26, "device_timestamp");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getDominantColor() {
        return getOptionalStringField(27, "dominant_color");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getEnableWaist() {
        return getCoercedBooleanField(28, "enable_waist");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public ImmutableList getFacepileTopLikers() {
        return getOptionalCompactedTreeListField(29, "facepile_top_likers", FacepileTopLikers.class, FacepileTopLikers.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public int getFbLikeCount() {
        return getCoercedIntField(30, "fb_like_count");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public int getFbPlayCount() {
        return getCoercedIntField(31, "fb_play_count");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public int getFilterType() {
        return getCoercedIntField(32, "filter_type");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag getFundraiserTag() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag) getOptionalTreeField(33, "fundraiser_tag", FundraiserTag.class, FundraiserTag.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getHasAudio() {
        return getCoercedBooleanField(34, "has_audio");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getHasDelayedMetadata() {
        return getCoercedBooleanField(35, "has_delayed_metadata");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getHasHiddenComments() {
        return getCoercedBooleanField(36, "has_hidden_comments");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getHasLiked() {
        return getCoercedBooleanField(37, "has_liked");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getHasMoreComments() {
        return getCoercedBooleanField(38, "has_more_comments");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getHasReshares() {
        return getCoercedBooleanField(39, "has_reshares");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public int getHasSharedToFb() {
        return getCoercedIntField(40, "has_shared_to_fb");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getHasViewerSaved() {
        return getCoercedBooleanField(41, "has_viewer_saved");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getHideViewAllCommentEntrypoint() {
        return getCoercedBooleanField(42, "hide_view_all_comment_entrypoint");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getId() {
        return AbstractC65702TsY.A0a(this, "strong_id__", 43);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getIgMediaSharingDisabled() {
        return getCoercedBooleanField(44, "ig_media_sharing_disabled");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvSeriesInfo getIgtvSeriesInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvSeriesInfo) getOptionalTreeField(45, "igtv_series_info", IgtvSeriesInfo.class, IgtvSeriesInfo.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo getIgtvShoppingInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo) getOptionalTreeField(46, "igtv_shopping_info", IgtvShoppingInfo.class, IgtvShoppingInfo.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2 getImageVersions2() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2) getOptionalTreeField(47, "image_versions2", ImageVersions2.class, ImageVersions2.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public ImmutableList getInvitedCoauthorProducers() {
        return getOptionalCompactedTreeListField(48, "invited_coauthor_producers", InvitedCoauthorProducers.class, InvitedCoauthorProducers.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public double getLat() {
        return getCoercedDoubleField(62, "lat");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getLikeAndViewCountsDisabled() {
        return getCoercedBooleanField(63, "like_and_view_counts_disabled");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public int getLikeCount() {
        return getCoercedIntField(64, "like_count");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public double getLng() {
        return getCoercedDoubleField(65, "lng");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.Location getLocation() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.Location) getOptionalTreeField(66, "location", Location.class, Location.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getLoggingInfoToken() {
        return getOptionalStringField(67, "logging_info_token");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo getMashupInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo) getOptionalTreeField(68, "mashup_info", MashupInfo.class, MashupInfo.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.MediaAppreciationSettings getMediaAppreciationSettings() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaAppreciationSettings) getOptionalTreeField(69, "media_appreciation_settings", MediaAppreciationSettings.class, MediaAppreciationSettings.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo getMediaCroppingInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo) getOptionalTreeField(70, "media_cropping_info", MediaCroppingInfo.class, MediaCroppingInfo.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.MediaNotice getMediaNotice() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaNotice) getOptionalTreeField(71, "media_notice", MediaNotice.class, MediaNotice.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo getMediaOverlayInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo) getOptionalTreeField(72, "media_overlay_info", MediaOverlayInfo.class, MediaOverlayInfo.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public int getMediaType() {
        return getCoercedIntField(73, "media_type");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata getMusicMetadata() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata) getOptionalTreeField(74, "music_metadata", MusicMetadata.class, MusicMetadata.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getNextMaxId() {
        return getOptionalStringField(75, "next_max_id");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public int getNumberOfQualities() {
        return getCoercedIntField(76, "number_of_qualities");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.OrganicCtaInfo getOrganicCtaInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.OrganicCtaInfo) getOptionalTreeField(77, "organic_cta_info", OrganicCtaInfo.class, OrganicCtaInfo.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public EnumC39608HeI getOrganicCtaType() {
        return (EnumC39608HeI) getOptionalEnumField(78, "organic_cta_type", EnumC39608HeI.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getOrganicTrackingToken() {
        return getOptionalStringField(79, "organic_tracking_token");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public int getOriginalHeight() {
        return getCoercedIntField(80, "original_height");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getOriginalMediaHasVisualReplyMedia() {
        return getCoercedBooleanField(81, "original_media_has_visual_reply_media");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public int getOriginalWidth() {
        return getCoercedIntField(82, "original_width");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getPhotoOfYou() {
        return getCoercedBooleanField(83, "photo_of_you");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public int getPlayCount() {
        return getCoercedIntField(84, "play_count");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getPreview() {
        return getOptionalStringField(85, "preview");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags getProductTags() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags) getOptionalTreeField(86, "product_tags", ProductTags.class, ProductTags.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getProductType() {
        return getOptionalStringField(87, "product_type");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getProfileGridControlEnabled() {
        return getCoercedBooleanField(88, "profile_grid_control_enabled");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public int getReshareCount() {
        return getCoercedIntField(89, "reshare_count");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public ImmutableList getSenders() {
        return getOptionalCompactedTreeListField(90, "senders", Senders.class, Senders.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.SharingFrictionInfo getSharingFrictionInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.SharingFrictionInfo) getOptionalTreeField(91, "sharing_friction_info", SharingFrictionInfo.class, SharingFrictionInfo.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getShopRoutingUserId() {
        return getOptionalStringField(92, "shop_routing_user_id");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public ImmutableList getSocialContext() {
        return getOptionalCompactedTreeListField(93, "social_context", SocialContext.class, SocialContext.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public ImmutableList getSponsorTags() {
        return getOptionalCompactedTreeListField(94, "sponsor_tags", SponsorTags.class, SponsorTags.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public ImmutableList getStoryPolls() {
        return getOptionalCompactedTreeListField(95, "story_polls", StoryPolls.class, StoryPolls.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public ImmutableList getStorySliders() {
        return getOptionalCompactedTreeListField(96, "story_sliders", StorySliders.class, StorySliders.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean getSubscribeCtaVisible() {
        return getCoercedBooleanField(97, "subscribe_cta_visible");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getSubscriptionMediaVisibility() {
        return getOptionalStringField(98, "subscription_media_visibility");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public long getTakenAt() {
        return getCoercedTimeField(99, "taken_at");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getTitle() {
        return getOptionalStringField(100, DialogModule.KEY_TITLE);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public ImmutableList getTopLikers() {
        return getOptionalCompactedStringListField(115, "top_likers");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent getUpcomingEvent() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent) getOptionalTreeField(101, "upcoming_event", UpcomingEvent.class, UpcomingEvent.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.User getUser() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.User) getOptionalTreeField(102, PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.class, User.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.Usertags getUsertags() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.Usertags) getOptionalTreeField(103, "usertags", Usertags.class, Usertags.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getVideoCodec() {
        return getOptionalStringField(104, "video_codec");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getVideoDashManifest() {
        return getOptionalStringField(105, "video_dash_manifest");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public double getVideoDuration() {
        return getCoercedDoubleField(106, "video_duration");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public double getVideoSubtitlesConfidence() {
        return getCoercedDoubleField(107, "video_subtitles_confidence");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getVideoSubtitlesUri() {
        return getOptionalStringField(108, "video_subtitles_uri");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public ImmutableList getVideoVersions() {
        return getOptionalCompactedTreeListField(109, "video_versions", VideoVersions.class, VideoVersions.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public int getViewCount() {
        return getCoercedIntField(110, "view_count");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public int getViewStateItemType() {
        return getCoercedIntField(111, "view_state_item_type");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public ImmutableList getVisualCommentReplyStickerInfo() {
        return getOptionalCompactedTreeListField(112, "visual_comment_reply_sticker_info", VisualCommentReplyStickerInfo.class, VisualCommentReplyStickerInfo.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo getVisualRepliesInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo) getOptionalTreeField(113, "visual_replies_info", VisualRepliesInfo.class, VisualRepliesInfo.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo getWearableAttributionInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo) A03(WearableAttributionInfo.class, "wearable_attribution_info", WearableAttributionInfo.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public String getXpostDenyReason() {
        return getOptionalStringField(114, "xpost_deny_reason");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasAreRemixesCrosspostable() {
        return hasFieldValue("are_remixes_crosspostable");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasCanSeeInsightsAsBrand() {
        return hasFieldValue("can_see_insights_as_brand");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasCanViewerReshare() {
        return hasFieldValue("can_viewer_reshare");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasCanViewerSave() {
        return hasFieldValue("can_viewer_save");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasCaptionIsEdited() {
        return hasFieldValue("caption_is_edited");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasCoauthorProducerCanSeeOrganicInsights() {
        return hasFieldValue("coauthor_producer_can_see_organic_insights");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasCommentCount() {
        return hasFieldValue("comment_count");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasCommentingDisabledForViewer() {
        return hasFieldValue("commenting_disabled_for_viewer");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasCommentsDisabled() {
        return hasFieldValue("comments_disabled");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasDeletedReason() {
        return hasFieldValue("deleted_reason");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasDeviceTimestamp() {
        return hasFieldValue("device_timestamp");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasEnableWaist() {
        return hasFieldValue("enable_waist");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasFbLikeCount() {
        return hasFieldValue("fb_like_count");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasFbPlayCount() {
        return hasFieldValue("fb_play_count");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasFilterType() {
        return hasFieldValue("filter_type");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasHasAudio() {
        return hasFieldValue("has_audio");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasHasDelayedMetadata() {
        return hasFieldValue("has_delayed_metadata");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasHasHiddenComments() {
        return hasFieldValue("has_hidden_comments");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasHasLiked() {
        return hasFieldValue("has_liked");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasHasMoreComments() {
        return hasFieldValue("has_more_comments");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasHasReshares() {
        return hasFieldValue("has_reshares");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasHasSharedToFb() {
        return hasFieldValue("has_shared_to_fb");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasHasViewerSaved() {
        return hasFieldValue("has_viewer_saved");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasHideViewAllCommentEntrypoint() {
        return hasFieldValue("hide_view_all_comment_entrypoint");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasIgMediaSharingDisabled() {
        return hasFieldValue("ig_media_sharing_disabled");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasIsArtistPick() {
        return hasFieldValue("is_artist_pick");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasIsCommentsGifComposerEnabled() {
        return hasFieldValue("is_comments_gif_composer_enabled");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasIsCurrentlyPromotingBySponsor() {
        return hasFieldValue("is_currently_promoting_by_sponsor");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasIsDashEligible() {
        return hasFieldValue("is_dash_eligible");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasIsFbOnly() {
        return hasFieldValue("is_fb_only");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasIsInProfileGrid() {
        return hasFieldValue("is_in_profile_grid");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasIsInternalOnly() {
        return hasFieldValue("is_internal_only");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasIsOrganicProductTaggingEligible() {
        return hasFieldValue("is_organic_product_tagging_eligible");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasIsPaidPartnership() {
        return hasFieldValue("is_paid_partnership");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasIsPostLive() {
        return hasFieldValue("is_post_live");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasIsThirdPartyDownloadsEligible() {
        return hasFieldValue("is_third_party_downloads_eligible");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasIsUnifiedVideo() {
        return hasFieldValue("is_unified_video");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasIsVisualReplyCommenterNoticeEnabled() {
        return hasFieldValue("is_visual_reply_commenter_notice_enabled");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasLat() {
        return hasFieldValue("lat");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasLikeAndViewCountsDisabled() {
        return hasFieldValue("like_and_view_counts_disabled");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasLikeCount() {
        return hasFieldValue("like_count");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasLng() {
        return hasFieldValue("lng");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasMediaType() {
        return hasFieldValue("media_type");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasNumberOfQualities() {
        return hasFieldValue("number_of_qualities");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasOriginalHeight() {
        return hasFieldValue("original_height");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasOriginalMediaHasVisualReplyMedia() {
        return hasFieldValue("original_media_has_visual_reply_media");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasOriginalWidth() {
        return hasFieldValue("original_width");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasPhotoOfYou() {
        return hasFieldValue("photo_of_you");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasPlayCount() {
        return hasFieldValue("play_count");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasProfileGridControlEnabled() {
        return hasFieldValue("profile_grid_control_enabled");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasReshareCount() {
        return hasFieldValue("reshare_count");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasSubscribeCtaVisible() {
        return hasFieldValue("subscribe_cta_visible");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasTakenAt() {
        return hasFieldValue("taken_at");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasVideoDuration() {
        return hasFieldValue("video_duration");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasVideoSubtitlesConfidence() {
        return hasFieldValue("video_subtitles_confidence");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasViewCount() {
        return hasFieldValue("view_count");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean hasViewStateItemType() {
        return hasFieldValue("view_state_item_type");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean isArtistPick() {
        return getCoercedBooleanField(49, "is_artist_pick");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean isCommentsGifComposerEnabled() {
        return getCoercedBooleanField(50, "is_comments_gif_composer_enabled");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean isCurrentlyPromotingBySponsor() {
        return getCoercedBooleanField(51, "is_currently_promoting_by_sponsor");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public int isDashEligible() {
        return getCoercedIntField(52, "is_dash_eligible");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean isFbOnly() {
        return getCoercedBooleanField(53, "is_fb_only");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean isInProfileGrid() {
        return getCoercedBooleanField(54, "is_in_profile_grid");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean isInternalOnly() {
        return getCoercedBooleanField(55, "is_internal_only");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean isOrganicProductTaggingEligible() {
        return getCoercedBooleanField(56, "is_organic_product_tagging_eligible");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean isPaidPartnership() {
        return getCoercedBooleanField(57, "is_paid_partnership");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean isPostLive() {
        return getCoercedBooleanField(58, "is_post_live");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean isThirdPartyDownloadsEligible() {
        return getCoercedBooleanField(59, "is_third_party_downloads_eligible");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean isUnifiedVideo() {
        return getCoercedBooleanField(60, "is_unified_video");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia
    public boolean isVisualReplyCommenterNoticeEnabled() {
        return getCoercedBooleanField(61, "is_visual_reply_commenter_notice_enabled");
    }

    @Override // X.C2JS
    public C4OU modelSelectionSet() {
        C4OM[] c4omArr = new C4OM[116];
        C4OK c4ok = new C4OK(WearableAttributionInfo.class, "wearable_attribution_info", WearableAttributionInfo.TYPE_TAG);
        C95124Py c95124Py = C95124Py.A00;
        C4OW c4ow = new C4OW(c95124Py, "are_remixes_crosspostable");
        C4OK c4ok2 = new C4OK(Attribution.class, "attribution", Attribution.TYPE_TAG);
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW c4ow2 = new C4OW(c94754Oe, "audience");
        C4OW c4ow3 = new C4OW(c94754Oe, "boost_unavailable_identifier");
        C4OW c4ow4 = new C4OW(c94754Oe, "boost_unavailable_reason");
        C4OW c4ow5 = new C4OW(c94754Oe, "boosted_by_sponsor");
        C4OW c4ow6 = new C4OW(c94754Oe, "boosted_status");
        C4OK c4ok3 = new C4OK(C4OO.A00(), BrandedContentAdsBoostPostTokens.class, "branded_content_ads_boost_post_tokens", BrandedContentAdsBoostPostTokens.TYPE_TAG);
        C4OW c4ow7 = new C4OW(c95124Py, "can_see_insights_as_brand");
        C4OW c4ow8 = new C4OW(c95124Py, "can_viewer_reshare");
        C4OW c4ow9 = new C4OW(c95124Py, "can_viewer_save");
        C4OK c4ok4 = new C4OK(Caption.class, "caption", Caption.TYPE_TAG);
        C4OW c4ow10 = new C4OW(c95124Py, "caption_is_edited");
        C4OK c4ok5 = new C4OK(ClipsAttributionInfo.class, "clips_attribution_info", ClipsAttributionInfo.TYPE_TAG);
        C4OW c4ow11 = new C4OW(C94754Oe.A00(), "clips_tab_pinned_user_ids");
        C4OK c4ok6 = new C4OK(ClipsMetadata.class, "clips_metadata", ClipsMetadata.TYPE_TAG);
        C4OW c4ow12 = new C4OW(c95124Py, "coauthor_producer_can_see_organic_insights");
        C4OK c4ok7 = new C4OK(C4OO.A00(), CoauthorProducers.class, "coauthor_producers", CoauthorProducers.TYPE_TAG);
        C4OW c4ow13 = new C4OW(c94754Oe, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        C94894Ou c94894Ou = C94894Ou.A00;
        C4OW c4ow14 = new C4OW(c94894Ou, "comment_count");
        C4OK c4ok8 = new C4OK(CommentInformTreatment.class, "comment_inform_treatment", CommentInformTreatment.TYPE_TAG);
        C4OW c4ow15 = new C4OW(c95124Py, "commenting_disabled_for_viewer");
        C4OW c4ow16 = new C4OW(c95124Py, "comments_disabled");
        C4OK c4ok9 = new C4OK(CreativeConfig.class, "creative_config", CreativeConfig.TYPE_TAG);
        C4OW c4ow17 = new C4OW(c94894Ou, "deleted_reason");
        C67A c67a = C67A.A00;
        System.arraycopy(new C4OM[]{c4ok, c4ow, c4ok2, c4ow2, c4ow3, c4ow4, c4ow5, c4ow6, c4ok3, c4ow7, c4ow8, c4ow9, c4ok4, c4ow10, c4ok5, c4ow11, c4ok6, c4ow12, c4ok7, c4ow13, c4ow14, c4ok8, c4ow15, c4ow16, c4ok9, c4ow17, new C4OW(c67a, "device_timestamp")}, 0, c4omArr, 0, 27);
        System.arraycopy(new C4OM[]{new C4OW(c94754Oe, "dominant_color"), new C4OW(c95124Py, "enable_waist"), new C4OK(C4OO.A00(), FacepileTopLikers.class, "facepile_top_likers", FacepileTopLikers.TYPE_TAG), new C4OW(c94894Ou, "fb_like_count"), new C4OW(c94894Ou, "fb_play_count"), new C4OW(c94894Ou, "filter_type"), new C4OK(FundraiserTag.class, "fundraiser_tag", FundraiserTag.TYPE_TAG), new C4OW(c95124Py, "has_audio"), new C4OW(c95124Py, "has_delayed_metadata"), new C4OW(c95124Py, "has_hidden_comments"), new C4OW(c95124Py, "has_liked"), new C4OW(c95124Py, "has_more_comments"), new C4OW(c95124Py, "has_reshares"), new C4OW(c94894Ou, "has_shared_to_fb"), new C4OW(c95124Py, "has_viewer_saved"), new C4OW(c95124Py, "hide_view_all_comment_entrypoint"), AbstractC58320PtC.A0P(c94754Oe), new C4OW(c95124Py, "ig_media_sharing_disabled"), new C4OK(IgtvSeriesInfo.class, "igtv_series_info", IgtvSeriesInfo.TYPE_TAG), new C4OK(IgtvShoppingInfo.class, "igtv_shopping_info", IgtvShoppingInfo.TYPE_TAG), new C4OK(ImageVersions2.class, "image_versions2", ImageVersions2.TYPE_TAG), new C4OK(C4OO.A00(), InvitedCoauthorProducers.class, "invited_coauthor_producers", InvitedCoauthorProducers.TYPE_TAG), new C4OW(c95124Py, "is_artist_pick"), new C4OW(c95124Py, "is_comments_gif_composer_enabled"), new C4OW(c95124Py, "is_currently_promoting_by_sponsor"), new C4OW(c94894Ou, "is_dash_eligible"), new C4OW(c95124Py, "is_fb_only")}, 0, c4omArr, 27, 27);
        C4OW c4ow18 = new C4OW(c95124Py, "is_in_profile_grid");
        C4OW c4ow19 = new C4OW(c95124Py, "is_internal_only");
        C4OW c4ow20 = new C4OW(c95124Py, "is_organic_product_tagging_eligible");
        C4OW c4ow21 = new C4OW(c95124Py, "is_paid_partnership");
        C4OW c4ow22 = new C4OW(c95124Py, "is_post_live");
        C4OW c4ow23 = new C4OW(c95124Py, "is_third_party_downloads_eligible");
        C4OW c4ow24 = new C4OW(c95124Py, "is_unified_video");
        C4OW c4ow25 = new C4OW(c95124Py, "is_visual_reply_commenter_notice_enabled");
        C173847oc c173847oc = C173847oc.A00;
        System.arraycopy(new C4OM[]{c4ow18, c4ow19, c4ow20, c4ow21, c4ow22, c4ow23, c4ow24, c4ow25, new C4OW(c173847oc, "lat"), new C4OW(c95124Py, "like_and_view_counts_disabled"), new C4OW(c94894Ou, "like_count"), new C4OW(c173847oc, "lng"), new C4OK(Location.class, "location", Location.TYPE_TAG), new C4OW(c94754Oe, "logging_info_token"), new C4OK(MashupInfo.class, "mashup_info", MashupInfo.TYPE_TAG), new C4OK(MediaAppreciationSettings.class, "media_appreciation_settings", MediaAppreciationSettings.TYPE_TAG), new C4OK(MediaCroppingInfo.class, "media_cropping_info", MediaCroppingInfo.TYPE_TAG), new C4OK(MediaNotice.class, "media_notice", MediaNotice.TYPE_TAG), new C4OK(MediaOverlayInfo.class, "media_overlay_info", MediaOverlayInfo.TYPE_TAG), new C4OW(c94894Ou, "media_type"), new C4OK(MusicMetadata.class, "music_metadata", MusicMetadata.TYPE_TAG), new C4OW(c94754Oe, "next_max_id"), new C4OW(c94894Ou, "number_of_qualities"), new C4OK(OrganicCtaInfo.class, "organic_cta_info", OrganicCtaInfo.TYPE_TAG), new C4OW(c94754Oe, "organic_cta_type"), new C4OW(c94754Oe, "organic_tracking_token"), new C4OW(c94894Ou, "original_height")}, 0, c4omArr, 54, 27);
        System.arraycopy(new C4OM[]{new C4OW(c95124Py, "original_media_has_visual_reply_media"), new C4OW(c94894Ou, "original_width"), new C4OW(c95124Py, "photo_of_you"), new C4OW(c94894Ou, "play_count"), new C4OW(c94754Oe, "preview"), new C4OK(ProductTags.class, "product_tags", ProductTags.TYPE_TAG), new C4OW(c94754Oe, "product_type"), new C4OW(c95124Py, "profile_grid_control_enabled"), new C4OW(c94894Ou, "reshare_count"), new C4OK(C4OO.A00(), Senders.class, "senders", Senders.TYPE_TAG), new C4OK(SharingFrictionInfo.class, "sharing_friction_info", SharingFrictionInfo.TYPE_TAG), new C4OW(c94754Oe, "shop_routing_user_id"), new C4OK(C4OO.A00(), SocialContext.class, "social_context", SocialContext.TYPE_TAG), new C4OK(C4OO.A00(), SponsorTags.class, "sponsor_tags", SponsorTags.TYPE_TAG), new C4OK(C4OO.A00(), StoryPolls.class, "story_polls", StoryPolls.TYPE_TAG), new C4OK(C4OO.A00(), StorySliders.class, "story_sliders", StorySliders.TYPE_TAG), new C4OW(c95124Py, "subscribe_cta_visible"), new C4OW(c94754Oe, "subscription_media_visibility"), new C4OW(c67a, "taken_at"), AbstractC58319PtB.A0L(c94754Oe), new C4OK(UpcomingEvent.class, "upcoming_event", UpcomingEvent.TYPE_TAG), new C4OK(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.TYPE_TAG), new C4OK(Usertags.class, "usertags", Usertags.TYPE_TAG), new C4OW(c94754Oe, "video_codec"), new C4OW(c94754Oe, "video_dash_manifest"), new C4OW(c173847oc, "video_duration"), new C4OW(c173847oc, "video_subtitles_confidence")}, 0, c4omArr, 81, 27);
        return AbstractC58321PtD.A0Z(new C4OM[]{new C4OW(c94754Oe, "video_subtitles_uri"), new C4OK(C4OO.A00(), VideoVersions.class, "video_versions", VideoVersions.TYPE_TAG), new C4OW(c94894Ou, "view_count"), new C4OW(c94894Ou, "view_state_item_type"), new C4OK(C4OO.A00(), VisualCommentReplyStickerInfo.class, "visual_comment_reply_sticker_info", VisualCommentReplyStickerInfo.TYPE_TAG), new C4OK(VisualRepliesInfo.class, "visual_replies_info", VisualRepliesInfo.TYPE_TAG), new C4OW(c94754Oe, "xpost_deny_reason"), new C4OW(C94754Oe.A00(), "top_likers")}, c4omArr, 0, 108, 8);
    }

    public CreatorInspirationSignalsPlaygroundClipsMediaImpl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundClipsMediaImpl() {
        super(TYPE_TAG);
    }
}
