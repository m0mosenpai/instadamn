package com.instagram.creator.inspiration.repository.graphql;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31175DnJ;
import X.AbstractC50635MWw;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.AbstractC58324PtG;
import X.AbstractC65703TsZ;
import X.AbstractC65704Tsa;
import X.C14360o3;
import X.C173847oc;
import X.C1DV;
import X.C1DY;
import X.C2JS;
import X.C2JT;
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
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* loaded from: classes11.dex */
public final class IGCreatorInspirationHubMediaFragmentImpl extends C2JS implements C2JT {

    /* loaded from: classes11.dex */
    public final class Caption extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class User extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class FanClubInfo extends C2JS implements C2JT {

                /* loaded from: classes11.dex */
                public final class FanConsiderationPageRevampEligiblity extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C95124Py c95124Py = C95124Py.A00;
                        return AbstractC167017dG.A0Y(new C94774Oi(c95124Py), new C4OW(new C94774Oi(c95124Py), "should_show_content_preview"), "should_show_social_context");
                    }

                    public FanConsiderationPageRevampEligiblity() {
                        super(751031677);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C95124Py c95124Py = C95124Py.A00;
                    C4OW c4ow = new C4OW(c95124Py, "autosave_to_exclusive_highlight");
                    C94894Ou c94894Ou = C94894Ou.A00;
                    C4OW c4ow2 = new C4OW(c94894Ou, "connected_member_count");
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return new C4OU(new C4OM[]{c4ow, c4ow2, new C4OW(c94754Oe, "fan_club_id"), new C4OW(c94754Oe, "fan_club_name"), new C4OK(FanConsiderationPageRevampEligiblity.class, "fan_consideration_page_revamp_eligiblity", 751031677), new C4OW(c95124Py, "has_enough_subscribers_for_ssc"), new C4OW(c95124Py, "is_fan_club_gifting_eligible"), new C4OW(c95124Py, "is_fan_club_referral_eligible"), new C4OW(c94894Ou, "subscriber_count")});
                }

                public FanClubInfo() {
                    super(1472574098);
                }
            }

            /* loaded from: classes10.dex */
            public final class FriendshipStatus extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C95124Py c95124Py = C95124Py.A00;
                    return AbstractC58319PtB.A0U(AbstractC58321PtD.A0W(c95124Py), AbstractC58322PtE.A0W(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_feed_favorite"), AbstractC166987dD.A0i(c95124Py, "is_restricted"), AbstractC166987dD.A0i(c95124Py, "outgoing_request"));
                }

                public FriendshipStatus() {
                    super(2079458760);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OM[] c4omArr = new C4OM[30];
                C94894Ou c94894Ou = C94894Ou.A00;
                C4OW A0i = AbstractC166987dD.A0i(c94894Ou, "all_media_count");
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW A0i2 = AbstractC166987dD.A0i(c94754Oe, "allowed_commenter_type");
                C95124Py c95124Py = C95124Py.A00;
                return AbstractC58321PtD.A0Z(new C4OM[]{AbstractC58321PtD.A0S(c94894Ou), AbstractC166987dD.A0i(c95124Py, "transparency_product_enabled"), AbstractC58322PtE.A0S(c94754Oe)}, c4omArr, AbstractC31175DnJ.A1b(new C4OM[]{A0i, A0i2, AbstractC166987dD.A0i(c95124Py, "can_boost_post"), AbstractC166987dD.A0i(c95124Py, "can_see_organic_insights"), AbstractC58318PtA.A0O(FanClubInfo.class, "fan_club_info", 1472574098), AbstractC58321PtD.A0V(c94754Oe), AbstractC166987dD.A0i(c95124Py, "feed_post_reshare_disabled"), AbstractC58322PtE.A0M(FriendshipStatus.class, 2079458760), AbstractC58319PtB.A0E(c94754Oe), AbstractC58321PtD.A0T(c95124Py), AbstractC58322PtE.A0T(c95124Py), AbstractC166997dE.A0V(c94754Oe), AbstractC58321PtD.A0R(c94754Oe), AbstractC166987dD.A0i(c95124Py, "is_favorite"), AbstractC58319PtB.A0O(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_unpublished"), AbstractC58319PtB.A0P(c95124Py), AbstractC58322PtE.A0Q(), AbstractC166987dD.A0i(c94894Ou, "liked_clips_count"), AbstractC58319PtB.A0H(c94754Oe), AbstractC58319PtB.A0K(c94754Oe), AbstractC58319PtB.A0Q(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC166987dD.A0i(c94754Oe, "reel_auto_archive"), AbstractC166987dD.A0i(c95124Py, "show_account_transparency_details"), AbstractC166987dD.A0i(c95124Py, "show_insights_terms"), AbstractC166987dD.A0i(c94894Ou, "text_post_app_joiner_number")}, c4omArr) ? 1 : 0, 27, 3);
            }

            public User() {
                super(338412514);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94894Ou c94894Ou = C94894Ou.A00;
            C4OW c4ow = new C4OW(c94894Ou, "bit_flags");
            C94754Oe c94754Oe = C94754Oe.A00;
            C4OW c4ow2 = new C4OW(c94754Oe, TraceFieldType.ContentType);
            C67A c67a = C67A.A00;
            C4OW c4ow3 = new C4OW(c67a, "created_at");
            C4OW c4ow4 = new C4OW(c67a, "created_at_utc");
            C95124Py c95124Py = C95124Py.A00;
            return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, c4ow4, new C4OW(c95124Py, "did_report_as_spam"), new C4OW(c95124Py, "has_translation"), new C4OW(c95124Py, "is_covered"), new C4OW(c95124Py, "is_ranked_comment"), new C4OW(c94754Oe, "media_id"), AbstractC58320PtC.A0Q(c94754Oe), new C4OW(c94894Ou, "private_reply_status"), new C4OW(c95124Py, "share_enabled"), new C4OW(c94754Oe, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS), AbstractC58319PtB.A0C(c94754Oe), AbstractC58319PtB.A0J(c94894Ou), new C4OK(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 338412514), new C4OW(c94754Oe, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID)});
        }

        public Caption() {
            super(-1124539568);
        }
    }

    /* loaded from: classes11.dex */
    public final class ClipsAttributionInfo extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class PivotPageHeader extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class Profile extends C2JS implements C2JT {
                public Profile() {
                    super(1051381315);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC58324PtG.A0D();
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC167007dF.A0Q(AbstractC166987dD.A0i(c94754Oe, "content_url"), AbstractC166987dD.A0i(c94754Oe, "developer_app_logo_url"), AbstractC166987dD.A0i(c94754Oe, "media_count"), AbstractC58318PtA.A0O(Profile.class, "profile", 1051381315));
            }

            public PivotPageHeader() {
                super(-967452884);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC58319PtB.A0T(new C4OW(new C94774Oi(c94754Oe), "attribution_app_id"), new C4OW(new C94774Oi(c94754Oe), "attribution_app_name"), new C4OK(C4OO.A01(), PivotPageHeader.class, "pivot_page_header", -967452884));
        }

        public ClipsAttributionInfo() {
            super(-1386663628);
        }
    }

    /* loaded from: classes11.dex */
    public final class ClipsMetadata extends C2JS implements C2JT {

        /* loaded from: classes11.dex */
        public final class AchievementsInfo extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Y(C95124Py.A00, new C4OW(C94894Ou.A00, "num_earned_achievements"), "show_achievements");
            }

            public AchievementsInfo() {
                super(-1505901106);
            }
        }

        /* loaded from: classes11.dex */
        public final class AdditionalAudioInfo extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class AudioReattributionInfo extends C2JS implements C2JT {
                public AudioReattributionInfo() {
                    super(988271537);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0Z(AbstractC58319PtB.A0S(), "should_allow_restore");
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0W(new C4OW(C94754Oe.A00, "additional_audio_username"), AudioReattributionInfo.class, "audio_reattribution_info", 988271537);
            }

            public AdditionalAudioInfo() {
                super(-834512998);
            }
        }

        /* loaded from: classes11.dex */
        public final class AssetRecommendationInfo extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class AssetRecommendations extends C2JS implements C2JT {
                public AssetRecommendations() {
                    super(730856145);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC65703TsZ.A0l();
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0W(C4OO.A02(), AssetRecommendations.class, "asset_recommendations", 730856145);
            }

            public AssetRecommendationInfo() {
                super(-2127221804);
            }
        }

        /* loaded from: classes11.dex */
        public final class AudioRankingInfo extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Z(C94754Oe.A00, "best_audio_cluster_id");
            }

            public AudioRankingInfo() {
                super(-315841822);
            }
        }

        /* loaded from: classes11.dex */
        public final class MashupInfo extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class OriginalMedia extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class User extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C94894Ou c94894Ou = C94894Ou.A00;
                        C4OW A0i = AbstractC166987dD.A0i(c94894Ou, "all_media_count");
                        C94754Oe c94754Oe = C94754Oe.A00;
                        C4OW A0i2 = AbstractC166987dD.A0i(c94754Oe, "allowed_commenter_type");
                        C4OW A0V = AbstractC58321PtD.A0V(c94754Oe);
                        C4OW A0E = AbstractC58319PtB.A0E(c94754Oe);
                        C95124Py c95124Py = C95124Py.A00;
                        return AbstractC166987dD.A0k(new C4OM[]{A0i, A0i2, A0V, A0E, AbstractC58321PtD.A0T(c95124Py), AbstractC58322PtE.A0T(c95124Py), AbstractC166997dE.A0V(c94754Oe), AbstractC58321PtD.A0R(c94754Oe), AbstractC58319PtB.A0O(c95124Py), AbstractC58319PtB.A0P(c95124Py), AbstractC166987dD.A0i(c94894Ou, "liked_clips_count"), AbstractC58319PtB.A0H(c94754Oe), AbstractC58319PtB.A0K(c94754Oe), AbstractC58319PtB.A0Q(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC166987dD.A0i(c94754Oe, "reel_auto_archive"), AbstractC166987dD.A0i(c94894Ou, "text_post_app_joiner_number"), AbstractC58321PtD.A0S(c94894Ou), AbstractC58322PtE.A0S(c94754Oe)});
                    }

                    public User() {
                        super(1631574768);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C95124Py c95124Py = C95124Py.A00;
                    C4OW c4ow = new C4OW(c95124Py, "is_light_weight_check");
                    C4OW A0U = AbstractC65703TsZ.A0U(c95124Py);
                    C4OW c4ow2 = new C4OW(c95124Py, "mashups_allowed");
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return new C4OU(new C4OM[]{c4ow, A0U, c4ow2, new C4OW(c94754Oe, "media_type"), new C4OW(C94894Ou.A00, "non_privacy_filtered_mashups_media_count"), AbstractC58320PtC.A0Q(c94754Oe), new C4OW(c94754Oe, "product_type"), new C4OW(new C94784Oj(new C94774Oi(C67A.A00)), "sidecar_child_media_ids"), new C4OK(C4OO.A01(), User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 1631574768)});
                }

                public OriginalMedia() {
                    super(-1116631869);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C95124Py c95124Py = C95124Py.A00;
                return new C4OU(new C4OM[]{new C4OW(new C94774Oi(c95124Py), "can_toggle_mashups_allowed"), new C4OW(new C94774Oi(c95124Py), "has_been_mashed_up"), new C4OW(c95124Py, "has_nonmimicable_additional_audio"), new C4OW(new C94774Oi(c95124Py), "is_creator_requesting_mashup"), new C4OW(c95124Py, "is_light_weight_check"), AbstractC65703TsZ.A0U(c95124Py), new C4OW(C94754Oe.A00, "mashup_type"), new C4OW(new C94774Oi(c95124Py), "mashups_allowed"), new C4OW(C94894Ou.A00, "non_privacy_filtered_mashups_media_count"), new C4OK(OriginalMedia.class, "original_media", -1116631869)});
            }

            public MashupInfo() {
                super(-437099657);
            }
        }

        /* loaded from: classes11.dex */
        public final class MusicInfo extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class MusicAssetInfo extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C95124Py c95124Py = C95124Py.A00;
                    C4OW A0V = AbstractC65703TsZ.A0V(c95124Py);
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return new C4OU(new C4OM[]{A0V, new C4OW(c94754Oe, "artist_id"), new C4OW(c94754Oe, "audio_asset_id"), new C4OW(c94754Oe, "audio_cluster_id"), new C4OW(c94754Oe, "cover_artwork_thumbnail_uri"), AbstractC65703TsZ.A0W(c94754Oe), new C4OW(c94754Oe, "dash_manifest"), new C4OW(c94754Oe, "display_artist"), new C4OW(C94894Ou.A00, "duration_in_ms"), new C4OW(c94754Oe, "fast_start_progressive_download_url"), new C4OW(c95124Py, "has_lyrics"), AbstractC58320PtC.A0P(c94754Oe), new C4OW(c94754Oe, "ig_username"), AbstractC65703TsZ.A0G(c95124Py), new C4OW(c94754Oe, "progressive_download_url"), new C4OW(c94754Oe, "subtitle"), AbstractC58319PtB.A0L(c94754Oe), new C4OW(c94754Oe, "web_30s_preview_download_url")});
                }

                public MusicAssetInfo() {
                    super(282201490);
                }
            }

            /* loaded from: classes11.dex */
            public final class MusicConsumptionInfo extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class IgArtist extends C2JS implements C2JT {
                    public IgArtist() {
                        super(735319379);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC58324PtG.A0A();
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C95124Py c95124Py = C95124Py.A00;
                    C4OW c4ow = new C4OW(c95124Py, "allow_media_creation_with_music");
                    C94894Ou c94894Ou = C94894Ou.A00;
                    C4OW c4ow2 = new C4OW(c94894Ou, "audio_asset_start_time_in_ms");
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return new C4OU(new C4OM[]{c4ow, c4ow2, new C4OW(c94754Oe, "derived_content_id"), new C4OK(IgArtist.class, "ig_artist", 735319379), new C4OW(c95124Py, "is_bookmarked"), new C4OW(c95124Py, "is_trending_in_clips"), new C4OW(c94894Ou, "overlap_duration_in_ms"), AbstractC65703TsZ.A0J(c94754Oe), new C4OW(c95124Py, "should_allow_music_editing"), AbstractC65703TsZ.A0c(c95124Py), AbstractC65703TsZ.A0b(c94754Oe), new C4OW(c94754Oe, "should_mute_audio_reason_type"), new C4OW(c94894Ou, "trend_rank")});
                }

                public MusicConsumptionInfo() {
                    super(671346287);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0T(C4OO.A01(), new C4OK(C4OO.A01(), MusicAssetInfo.class, "music_asset_info", 282201490), MusicConsumptionInfo.class, "music_consumption_info", 671346287);
            }

            public MusicInfo() {
                super(507945270);
            }
        }

        /* loaded from: classes11.dex */
        public final class OriginalSoundInfo extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class AudioParts extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0a(IGCreatorInspirationAudioPartMetaData2Impl.class, "IGCreatorInspirationAudioPartMetaData2", 787776735);
                }

                public AudioParts() {
                    super(-1899833205);
                }
            }

            /* loaded from: classes11.dex */
            public final class AudioPartsByFilter extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0a(IGCreatorInspirationAudioPartMetaData2Impl.class, "IGCreatorInspirationAudioPartMetaData2", 787776735);
                }

                public AudioPartsByFilter() {
                    super(68663422);
                }
            }

            /* loaded from: classes11.dex */
            public final class ConsumptionInfo extends C2JS implements C2JT {
                public ConsumptionInfo() {
                    super(-1073567508);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC65703TsZ.A0v();
                }
            }

            /* loaded from: classes10.dex */
            public final class IgArtist extends C2JS implements C2JT {
                public IgArtist() {
                    super(-2105112141);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC58324PtG.A0A();
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C95124Py c95124Py = C95124Py.A00;
                C4OW A0j = AbstractC65703TsZ.A0j(c95124Py);
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW A0X = AbstractC65703TsZ.A0X(c94754Oe);
                C4OK c4ok = new C4OK(C4OO.A02(), AudioParts.class, "audio_parts", -1899833205);
                C4OK c4ok2 = new C4OK(C4OO.A02(), AudioPartsByFilter.class, "audio_parts_by_filter", 68663422);
                C4OW c4ow = new C4OW(c95124Py, "can_remix_be_shared_to_fb");
                C4OK c4ok3 = new C4OK(C4OO.A01(), ConsumptionInfo.class, "consumption_info", -1073567508);
                C4OW A0g = AbstractC65703TsZ.A0g(c94754Oe);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{A0j, A0X, c4ok, c4ok2, c4ow, c4ok3, A0g, new C4OW(c94894Ou, "duration_in_ms"), AbstractC65703TsZ.A0h(c95124Py), new C4OK(C4OO.A01(), IgArtist.class, "ig_artist", -2105112141), AbstractC65703TsZ.A0H(c95124Py), AbstractC65703TsZ.A0G(c95124Py), new C4OW(c95124Py, "is_original_audio_download_eligible"), new C4OW(c95124Py, "is_reuse_disabled"), new C4OW(c95124Py, "is_xpost_from_fb"), AbstractC65703TsZ.A0f(c94754Oe), AbstractC65703TsZ.A0P(c94754Oe), AbstractC65703TsZ.A0F(c94754Oe), AbstractC65703TsZ.A0M(c94754Oe), AbstractC65703TsZ.A0c(c95124Py), new C4OW(c94894Ou, "time_created"), new C4OW(c94894Ou, "trend_rank")});
            }

            public OriginalSoundInfo() {
                super(-747633578);
            }
        }

        /* loaded from: classes11.dex */
        public final class ShoppingInfo extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class Products extends C2JS implements C2JT {

                /* loaded from: classes11.dex */
                public final class ProductDetails extends C2JS implements C2JT {

                    /* loaded from: classes11.dex */
                    public final class ArtsLabels extends C2JS implements C2JT {

                        /* loaded from: classes11.dex */
                        public final class Labels extends C2JS implements C2JT {
                            public Labels() {
                                super(2071948517);
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC65703TsZ.A0u();
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0W(C4OO.A00(), Labels.class, "labels", 2071948517);
                        }

                        public ArtsLabels() {
                            super(-468304245);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class CheckoutProperties extends C2JS implements C2JT {

                        /* loaded from: classes11.dex */
                        public final class ShippingAndReturn extends C2JS implements C2JT {

                            /* loaded from: classes11.dex */
                            public final class ReturnCost extends C2JS implements C2JT {
                                public ReturnCost() {
                                    super(-529821838);
                                }

                                @Override // X.C2JS
                                public final C4OU modelSelectionSet() {
                                    return AbstractC65703TsZ.A0o();
                                }
                            }

                            /* loaded from: classes11.dex */
                            public final class ShippingCost extends C2JS implements C2JT {
                                public ShippingCost() {
                                    super(1721806929);
                                }

                                @Override // X.C2JS
                                public final C4OU modelSelectionSet() {
                                    return AbstractC65703TsZ.A0o();
                                }
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC167017dG.A0X(C94754Oe.A00, new C4OK(ReturnCost.class, "return_cost", -529821838), new C4OK(ShippingCost.class, "shipping_cost", 1721806929), "shipping_cost_stripped");
                            }

                            public ShippingAndReturn() {
                                super(1923890966);
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class CurrencyAmount extends C2JS implements C2JT {
                            public CurrencyAmount() {
                                super(1315071659);
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC65703TsZ.A0o();
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            C95124Py c95124Py = C95124Py.A00;
                            C4OW c4ow = new C4OW(c95124Py, "can_add_to_bag");
                            C4OW c4ow2 = new C4OW(c95124Py, "can_enable_restock_reminder");
                            C4OW c4ow3 = new C4OW(c95124Py, "can_show_inventory_quantity");
                            C4OK c4ok = new C4OK(CurrencyAmount.class, "currency_amount", 1315071659);
                            C94894Ou c94894Ou = C94894Ou.A00;
                            C4OW c4ow4 = new C4OW(c94894Ou, "full_inventory_quantity");
                            C4OW c4ow5 = new C4OW(c95124Py, "has_free_shipping");
                            C94754Oe c94754Oe = C94754Oe.A00;
                            return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, c4ok, c4ow4, c4ow5, new C4OW(c94754Oe, "ig_referrer_fbid"), new C4OW(c94894Ou, "inventory_quantity"), new C4OW(c95124Py, "is_shopify_merchant"), new C4OW(c95124Py, "product_group_has_inventory"), new C4OW(c94754Oe, "receiver_id"), new C4OK(ShippingAndReturn.class, "shipping_and_return", 1923890966), new C4OW(c94894Ou, "viewer_purchase_limit")});
                        }

                        public CheckoutProperties() {
                            super(265533295);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class DiscountInformation extends C2JS implements C2JT {

                        /* loaded from: classes11.dex */
                        public final class Discounts extends C2JS implements C2JT {
                            public Discounts() {
                                super(264810640);
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC65703TsZ.A0y();
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0W(C4OO.A00(), Discounts.class, "discounts", 264810640);
                        }

                        public DiscountInformation() {
                            super(1633349070);
                        }
                    }

                    /* loaded from: classes10.dex */
                    public final class ImageQualityMetadata extends C2JS implements C2JT {

                        /* loaded from: classes10.dex */
                        public final class Goodness extends C2JS implements C2JT {
                            public Goodness() {
                                super(396635980);
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC58323PtF.A0S();
                            }
                        }

                        /* loaded from: classes10.dex */
                        public final class LifestyleBackground extends C2JS implements C2JT {
                            public LifestyleBackground() {
                                super(-442933711);
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC58323PtF.A0S();
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC58320PtC.A0T(C4OO.A00(), AbstractC166987dD.A0h(C4OO.A00(), Goodness.class, "goodness", 396635980), LifestyleBackground.class, "lifestyle_background", -442933711);
                        }

                        public ImageQualityMetadata() {
                            super(670623938);
                        }
                    }

                    /* loaded from: classes10.dex */
                    public final class MainImage extends C2JS implements C2JT {

                        /* loaded from: classes10.dex */
                        public final class ImageVersions2 extends C2JS implements C2JT {

                            /* loaded from: classes10.dex */
                            public final class Candidates extends C2JS implements C2JT {
                                public Candidates() {
                                    super(-1980360399);
                                }

                                @Override // X.C2JS
                                public final C4OU modelSelectionSet() {
                                    return AbstractC58323PtF.A0T();
                                }
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC167017dG.A0W(C4OO.A00(), Candidates.class, "candidates", -1980360399);
                            }

                            public ImageVersions2() {
                                super(-1034338397);
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC58323PtF.A0W(C4OO.A01(), ImageVersions2.class, -1034338397);
                        }

                        public MainImage() {
                            super(2002283420);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class RichTextDescription extends C2JS implements C2JT {

                        /* loaded from: classes10.dex */
                        public final class TextWithEntities extends C2JS implements C2JT {

                            /* loaded from: classes10.dex */
                            public final class InlineStyleRanges extends C2JS implements C2JT {
                                public InlineStyleRanges() {
                                    super(1783811154);
                                }

                                @Override // X.C2JS
                                public final C4OU modelSelectionSet() {
                                    return AbstractC58323PtF.A0U();
                                }
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC167017dG.A0W(C4OO.A00(), InlineStyleRanges.class, "inline_style_ranges", 1783811154);
                            }

                            public TextWithEntities() {
                                super(-602356593);
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC58320PtC.A0V(new C4OW(C94754Oe.A00, "block_type"), new C4OW(C94894Ou.A00, "depth"), TextWithEntities.class, "text_with_entities", -602356593);
                        }

                        public RichTextDescription() {
                            super(-2078199768);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class SellerBadge extends C2JS implements C2JT {
                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            C94754Oe c94754Oe = C94754Oe.A00;
                            return AbstractC167017dG.A0X(c94754Oe, AbstractC58322PtE.A0Y(c94754Oe), AbstractC58321PtD.A0U(c94754Oe), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        }

                        public SellerBadge() {
                            super(2076909370);
                        }
                    }

                    /* loaded from: classes10.dex */
                    public final class ThumbnailImage extends C2JS implements C2JT {

                        /* loaded from: classes10.dex */
                        public final class ImageVersions2 extends C2JS implements C2JT {

                            /* loaded from: classes10.dex */
                            public final class Candidates extends C2JS implements C2JT {
                                public Candidates() {
                                    super(847116207);
                                }

                                @Override // X.C2JS
                                public final C4OU modelSelectionSet() {
                                    return AbstractC58323PtF.A0T();
                                }
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC167017dG.A0W(C4OO.A00(), Candidates.class, "candidates", 847116207);
                            }

                            public ImageVersions2() {
                                super(1113823927);
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC58323PtF.A0W(C4OO.A01(), ImageVersions2.class, 1113823927);
                        }

                        public ThumbnailImage() {
                            super(1514521186);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class VariantValues extends C2JS implements C2JT {
                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            C94754Oe c94754Oe = C94754Oe.A00;
                            return AbstractC65703TsZ.A11(c94754Oe, new C94774Oi(c94754Oe));
                        }

                        public VariantValues() {
                            super(-779067202);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class AggregatedRating extends C2JS implements C2JT {
                        public AggregatedRating() {
                            super(1026222342);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC65703TsZ.A0s();
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class CommerceReviewStatistics extends C2JS implements C2JT {
                        public CommerceReviewStatistics() {
                            super(-1779381681);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC65703TsZ.A0r();
                        }
                    }

                    /* loaded from: classes10.dex */
                    public final class Merchant extends C2JS implements C2JT {
                        public Merchant() {
                            super(134389647);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC58324PtG.A0F();
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C4OM[] c4omArr = new C4OM[36];
                        C4OK c4ok = new C4OK(AggregatedRating.class, "aggregated_rating", 1026222342);
                        C4OK c4ok2 = new C4OK(ArtsLabels.class, "arts_labels", -468304245);
                        C95124Py c95124Py = C95124Py.A00;
                        C4OW c4ow = new C4OW(c95124Py, "can_share_to_story");
                        C4OW c4ow2 = new C4OW(c95124Py, "can_viewer_see_rnr");
                        C4OK c4ok3 = new C4OK(CheckoutProperties.class, "checkout_properties", 265533295);
                        C94754Oe c94754Oe = C94754Oe.A00;
                        return AbstractC58321PtD.A0Z(new C4OM[]{new C4OW(c94754Oe, "price"), new C4OW(c94754Oe, "product_id"), new C4OW(c94754Oe, "retailer_id"), new C4OW(c94754Oe, "review_status"), new C4OK(C4OO.A00(), RichTextDescription.class, "rich_text_description", -2078199768), new C4OK(SellerBadge.class, "seller_badge", 2076909370), new C4OW(c94754Oe, "size_calibration_score"), new C4OK(ThumbnailImage.class, "thumbnail_image", 1514521186), new C4OK(C4OO.A00(), VariantValues.class, "variant_values", -779067202)}, c4omArr, AbstractC31175DnJ.A1b(new C4OM[]{c4ok, c4ok2, c4ow, c4ow2, c4ok3, new C4OW(c94754Oe, "checkout_style"), new C4OK(CommerceReviewStatistics.class, "commerce_review_statistics", -1779381681), new C4OW(c94754Oe, "compound_product_id"), new C4OW(c94754Oe, "current_price"), new C4OW(c94754Oe, "current_price_amount"), new C4OW(c94754Oe, "current_price_stripped"), AbstractC58322PtE.A0Y(c94754Oe), new C4OK(DiscountInformation.class, "discount_information", 1633349070), new C4OW(c94754Oe, "external_url"), new C4OW(c94754Oe, "full_price"), new C4OW(c94754Oe, "full_price_amount"), new C4OW(c94754Oe, "full_price_stripped"), new C4OW(c95124Py, "has_variants"), new C4OW(c95124Py, "has_viewer_saved"), new C4OW(c95124Py, "ig_is_product_editable_on_mobile"), new C4OK(ImageQualityMetadata.class, "image_quality_metadata", 670623938), new C4OW(c95124Py, "is_entered_in_drawing"), new C4OW(c95124Py, "is_in_stock"), new C4OK(MainImage.class, "main_image", 2002283420), new C4OW(c94754Oe, "main_image_id"), new C4OK(Merchant.class, "merchant", 134389647), AbstractC58321PtD.A0U(c94754Oe)}, c4omArr) ? 1 : 0, 27, 9);
                    }

                    public ProductDetails() {
                        super(153540260);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0b(ProductDetails.class, "product_details", 153540260);
                }

                public Products() {
                    super(-1669046954);
                }
            }

            /* loaded from: classes11.dex */
            public final class ClipsShoppingCtaBar extends C2JS implements C2JT {
                public ClipsShoppingCtaBar() {
                    super(-1947806971);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC65703TsZ.A0m();
                }
            }

            /* loaded from: classes10.dex */
            public final class Merchant extends C2JS implements C2JT {
                public Merchant() {
                    super(-303384016);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC58324PtG.A0F();
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58319PtB.A0T(new C4OK(ClipsShoppingCtaBar.class, "clips_shopping_cta_bar", -1947806971), new C4OK(Merchant.class, "merchant", -303384016), new C4OK(C4OO.A00(), Products.class, "products", -1669046954));
            }

            public ShoppingInfo() {
                super(1010508766);
            }
        }

        /* loaded from: classes11.dex */
        public final class TemplateInfo extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class AttributionInfo extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC167017dG.A0Y(new C94774Oi(c94754Oe), new C4OW(new C94774Oi(c94754Oe), "owner_username"), "template_media_id");
                }

                public AttributionInfo() {
                    super(597683070);
                }
            }

            /* loaded from: classes11.dex */
            public final class EffectsInfo extends C2JS implements C2JT {

                /* loaded from: classes11.dex */
                public final class SegmentEffectsInfo extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0Y(AbstractC58319PtB.A0R(), new C4OW(new C94774Oi(C67A.A00), "effect_id"), "segment_index");
                    }

                    public SegmentEffectsInfo() {
                        super(346735400);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0W(C4OO.A00(), SegmentEffectsInfo.class, "segment_effects_info", 346735400);
                }

                public EffectsInfo() {
                    super(361046775);
                }
            }

            /* loaded from: classes11.dex */
            public final class SegmentsInfo extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C4OW A0d = AbstractC65703TsZ.A0d(C67A.A00);
                    C94894Ou c94894Ou = C94894Ou.A00;
                    return AbstractC167017dG.A0X(c94894Ou, A0d, new C4OW(c94894Ou, "reusable_template_media_asset_end_time_ms"), "reusable_template_media_asset_start_time_ms");
                }

                public SegmentsInfo() {
                    super(634424224);
                }
            }

            /* loaded from: classes11.dex */
            public final class TimedTextsInfo extends C2JS implements C2JT {

                /* loaded from: classes11.dex */
                public final class TextInfoList extends C2JS implements C2JT {

                    /* loaded from: classes11.dex */
                    public final class Colors extends C2JS implements C2JT {
                        public Colors() {
                            super(991841531);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0Y(AbstractC58318PtA.A0Q(), new C4OW(AbstractC58319PtB.A0R(), "count"), "hex_rgba_color");
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C94754Oe c94754Oe = C94754Oe.A00;
                        C4OW c4ow = new C4OW(new C94774Oi(c94754Oe), "alignment");
                        C4OK c4ok = new C4OK(C4OO.A02(), Colors.class, "colors", 991841531);
                        C173847oc c173847oc = C173847oc.A00;
                        C4OW A0E = AbstractC65703TsZ.A0E(c173847oc);
                        C4OW c4ow2 = new C4OW(new C94774Oi(c173847oc), "font_size");
                        C4OW A0L = AbstractC65703TsZ.A0L(c173847oc);
                        C4OW A0P = AbstractC58320PtC.A0P(c94754Oe);
                        C94894Ou c94894Ou = C94894Ou.A00;
                        return new C4OU(new C4OM[]{c4ow, c4ok, A0E, c4ow2, A0L, A0P, new C4OW(new C94774Oi(c94894Ou), "is_animated"), AbstractC65703TsZ.A0N(c173847oc), new C4OW(new C94774Oi(c173847oc), "offset_y"), new C4OW(new C94774Oi(c173847oc), "rotation_degree"), new C4OW(new C94774Oi(c173847oc), "scale"), new C4OW(new C94774Oi(c173847oc), "start_time_ms"), AbstractC58319PtB.A0C(new C94774Oi(c94754Oe)), new C4OW(new C94774Oi(c94754Oe), "text_emphasis_mode"), new C4OW(new C94774Oi(c94754Oe), "text_format_type"), AbstractC58319PtB.A0M(new C94774Oi(c173847oc)), new C4OW(new C94774Oi(c94894Ou), "z_index")});
                    }

                    public TextInfoList() {
                        super(1078649871);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0W(C4OO.A02(), TextInfoList.class, "text_info_list", 1078649871);
                }

                public TimedTextsInfo() {
                    super(-1892800233);
                }
            }

            /* loaded from: classes11.dex */
            public final class TransitionEffectsInfo extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C67A c67a = C67A.A00;
                    return AbstractC58320PtC.A0U(new C94774Oi(c67a), AbstractC65703TsZ.A0d(c67a), new C4OW(C94894Ou.A00, "index"), AbstractC65703TsZ.A0K(C94754Oe.A00), "start_time_in_ms");
                }

                public TransitionEffectsInfo() {
                    super(152748491);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return new C4OU(new C4OM[]{new C4OK(AttributionInfo.class, "attribution_info", 597683070), new C4OK(EffectsInfo.class, "effects_info", 361046775), new C4OW(C94894Ou.A00, "min_num_segments"), new C4OK(C4OO.A02(), SegmentsInfo.class, "segments_info", 634424224), new C4OW(new C94774Oi(C67A.A00), "template_clips_media_id"), new C4OK(TimedTextsInfo.class, "timed_texts_info", -1892800233), new C4OK(C4OO.A00(), TransitionEffectsInfo.class, "transition_effects_info", 152748491)});
            }

            public TemplateInfo() {
                super(2027560565);
            }
        }

        /* loaded from: classes11.dex */
        public final class BrandedContentTagInfo extends C2JS implements C2JT {
            public BrandedContentTagInfo() {
                super(-54798333);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Z(AbstractC58319PtB.A0S(), "can_add_tag");
            }
        }

        /* loaded from: classes10.dex */
        public final class ContentAppreciationInfo extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class EntryPointContainer extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class Comment extends C2JS implements C2JT {
                    public Comment() {
                        super(892502199);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0Z(AbstractC58318PtA.A0Q(), "action_type");
                    }
                }

                /* loaded from: classes10.dex */
                public final class Pill extends C2JS implements C2JT {
                    public Pill() {
                        super(-550748069);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0Y(AbstractC58319PtB.A0R(), AbstractC166987dD.A0i(AbstractC58318PtA.A0Q(), "action_type"), "priority");
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC58320PtC.A0W(AbstractC58318PtA.A0O(Comment.class, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, 892502199), Pill.class, "pill", -550748069);
                }

                public EntryPointContainer() {
                    super(1950604942);
                }
            }

            public ContentAppreciationInfo() {
                super(1845344782);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0W(AbstractC166987dD.A0i(AbstractC58319PtB.A0S(), "enabled"), EntryPointContainer.class, "entry_point_container", 1950604942);
            }
        }

        /* loaded from: classes11.dex */
        public final class ContextualHighlightInfo extends C2JS implements C2JT {
            public ContextualHighlightInfo() {
                super(-578466862);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC65703TsZ.A0k();
            }
        }

        /* loaded from: classes11.dex */
        public final class MerchandisingPillInfo extends C2JS implements C2JT {
            public MerchandisingPillInfo() {
                super(141750581);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Z(AbstractC58319PtB.A0R(), "loop_time");
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C4OK c4ok = new C4OK(AchievementsInfo.class, "achievements_info", -1505901106);
            C4OK c4ok2 = new C4OK(AdditionalAudioInfo.class, "additional_audio_info", -834512998);
            C4OK c4ok3 = new C4OK(AssetRecommendationInfo.class, "asset_recommendation_info", -2127221804);
            C4OK c4ok4 = new C4OK(AudioRankingInfo.class, "audio_ranking_info", -315841822);
            C94754Oe c94754Oe = C94754Oe.A00;
            C4OW c4ow = new C4OW(c94754Oe, "audio_type");
            C4OK c4ok5 = new C4OK(BrandedContentTagInfo.class, "branded_content_tag_info", -54798333);
            C4OW c4ow2 = new C4OW(c94754Oe, "clips_creation_entry_point");
            C4OK c4ok6 = new C4OK(ContentAppreciationInfo.class, "content_appreciation_info", 1845344782);
            C4OK c4ok7 = new C4OK(ContextualHighlightInfo.class, "contextual_highlight_info", -578466862);
            C95124Py c95124Py = C95124Py.A00;
            return new C4OU(new C4OM[]{c4ok, c4ok2, c4ok3, c4ok4, c4ow, c4ok5, c4ow2, c4ok6, c4ok7, new C4OW(c95124Py, "disable_use_in_clips_client_cache"), new C4OW(c95124Py, "is_fan_club_promo_video"), new C4OW(c95124Py, "is_public_chat_welcome_video"), new C4OW(c95124Py, "is_shared_to_fb"), new C4OK(MashupInfo.class, "mashup_info", -437099657), new C4OK(MerchandisingPillInfo.class, "merchandising_pill_info", 141750581), new C4OW(c94754Oe, "music_canonical_id"), new C4OK(MusicInfo.class, "music_info", 507945270), new C4OK(OriginalSoundInfo.class, "original_sound_info", -747633578), new C4OW(C94894Ou.A00, "professional_clips_upsell_type"), new C4OW(c94754Oe, "reusable_text_attribute_string"), new C4OK(ShoppingInfo.class, "shopping_info", 1010508766), new C4OW(c95124Py, "show_achievements"), new C4OW(c95124Py, "show_tips"), new C4OK(TemplateInfo.class, "template_info", 2027560565)});
        }

        public ClipsMetadata() {
            super(1286400893);
        }
    }

    /* loaded from: classes11.dex */
    public final class CreativeConfig extends C2JS implements C2JT {

        /* loaded from: classes11.dex */
        public final class EffectConfigs extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class AttributionUser extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class ProfilePicture extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0Z(C94754Oe.A00, "uri");
                    }

                    public ProfilePicture() {
                        super(-1589362664);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC167017dG.A0X(c94754Oe, AbstractC166987dD.A0i(c94754Oe, "instagram_user_id"), AbstractC58318PtA.A0O(ProfilePicture.class, "profile_picture", -1589362664), AbstractC50635MWw.A00());
                }

                public AttributionUser() {
                    super(-639986063);
                }
            }

            /* loaded from: classes11.dex */
            public final class ThumbnailImage extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0Z(C94754Oe.A00, "uri");
                }

                public ThumbnailImage() {
                    super(1202402159);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OK c4ok = new C4OK(C4OO.A01(), AttributionUser.class, "attribution_user", -639986063);
                C94754Oe c94754Oe = C94754Oe.A00;
                return new C4OU(new C4OM[]{c4ok, new C4OW(c94754Oe, "effect_id"), new C4OW(c94754Oe, "failure_code"), new C4OW(c94754Oe, TraceFieldType.FailureReason), AbstractC58320PtC.A0P(c94754Oe), new C4OW(C95124Py.A00, "is_age_restricted"), AbstractC65703TsZ.A0K(c94754Oe), new C4OW(new C94774Oi(c94754Oe), "save_status"), new C4OK(ThumbnailImage.class, "thumbnail_image", 1202402159), AbstractC58319PtB.A0L(c94754Oe)});
            }

            public EffectConfigs() {
                super(-1264863273);
            }
        }

        /* loaded from: classes11.dex */
        public final class CreationToolInfo extends C2JS implements C2JT {
            public CreationToolInfo() {
                super(1697907996);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC65703TsZ.A0z();
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58319PtB.A0T(new C4OW(C94754Oe.A00, "capture_type"), new C4OK(C4OO.A00(), CreationToolInfo.class, "creation_tool_info", 1697907996), new C4OK(C4OO.A00(), EffectConfigs.class, "effect_configs", -1264863273));
        }

        public CreativeConfig() {
            super(-1418630075);
        }
    }

    /* loaded from: classes11.dex */
    public final class FundraiserTag extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            C4OW c4ow = new C4OW(c94754Oe, "beneficiary_name");
            C4OW c4ow2 = new C4OW(c94754Oe, "beneficiary_username");
            C95124Py c95124Py = C95124Py.A00;
            return new C4OU(new C4OM[]{c4ow, c4ow2, new C4OW(c95124Py, "can_viewer_donate"), new C4OW(c95124Py, "can_viewer_remove_fundraiser_tag"), new C4OW(c94754Oe, "contextual_title_str"), new C4OW(c94754Oe, "formatted_amount_raised"), new C4OW(c94754Oe, "formatted_fundraiser_progress_info_text"), new C4OW(c94754Oe, "formatted_goal_amount"), new C4OW(c94754Oe, "fundraiser_id"), new C4OW(c94754Oe, "fundraiser_owner_username"), new C4OW(c94754Oe, "fundraiser_title"), new C4OW(c94754Oe, "fundraiser_type"), new C4OW(c95124Py, "is_media_owner_fundraiser_owner"), new C4OW(c94754Oe, "progress_str"), new C4OW(c95124Py, "show_fundraiser_owner_attribution"), new C4OW(c94754Oe, "thumbnail_display_url")});
        }

        public FundraiserTag() {
            super(-932643220);
        }
    }

    /* loaded from: classes11.dex */
    public final class IgtvShoppingInfo extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class Merchant extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C95124Py c95124Py = C95124Py.A00;
                C4OW A0i = AbstractC166987dD.A0i(c95124Py, "disabled_sharing_products_to_guides");
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC166987dD.A0k(new C4OM[]{A0i, AbstractC166997dE.A0V(c94754Oe), AbstractC58319PtB.A0P(c95124Py), AbstractC58319PtB.A0H(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC58322PtE.A0S(c94754Oe)});
            }

            public Merchant() {
                super(1130877779);
            }
        }

        /* loaded from: classes11.dex */
        public final class Products extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class ProductDetails extends C2JS implements C2JT {

                /* loaded from: classes11.dex */
                public final class ArtsLabels extends C2JS implements C2JT {

                    /* loaded from: classes11.dex */
                    public final class Labels extends C2JS implements C2JT {
                        public Labels() {
                            super(-679319413);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC65703TsZ.A0u();
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0W(C4OO.A00(), Labels.class, "labels", -679319413);
                    }

                    public ArtsLabels() {
                        super(2117433730);
                    }
                }

                /* loaded from: classes11.dex */
                public final class CheckoutProperties extends C2JS implements C2JT {

                    /* loaded from: classes11.dex */
                    public final class ShippingAndReturn extends C2JS implements C2JT {

                        /* loaded from: classes11.dex */
                        public final class ShippingCost extends C2JS implements C2JT {
                            public ShippingCost() {
                                super(-1177773906);
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC65703TsZ.A0o();
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0Y(C94754Oe.A00, new C4OK(ShippingCost.class, "shipping_cost", -1177773906), "shipping_cost_stripped");
                        }

                        public ShippingAndReturn() {
                            super(422028036);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class CurrencyAmount extends C2JS implements C2JT {
                        public CurrencyAmount() {
                            super(926628604);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC65703TsZ.A0o();
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C95124Py c95124Py = C95124Py.A00;
                        C4OW c4ow = new C4OW(c95124Py, "can_add_to_bag");
                        C4OW c4ow2 = new C4OW(c95124Py, "can_enable_restock_reminder");
                        C4OW c4ow3 = new C4OW(c95124Py, "can_show_inventory_quantity");
                        C4OK c4ok = new C4OK(CurrencyAmount.class, "currency_amount", 926628604);
                        C94894Ou c94894Ou = C94894Ou.A00;
                        C4OW c4ow4 = new C4OW(c94894Ou, "full_inventory_quantity");
                        C4OW c4ow5 = new C4OW(c95124Py, "has_free_shipping");
                        C94754Oe c94754Oe = C94754Oe.A00;
                        return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, c4ok, c4ow4, c4ow5, new C4OW(c94754Oe, "ig_referrer_fbid"), new C4OW(c94894Ou, "inventory_quantity"), new C4OW(c95124Py, "is_shopify_merchant"), new C4OW(c95124Py, "product_group_has_inventory"), new C4OW(c94754Oe, "receiver_id"), new C4OK(ShippingAndReturn.class, "shipping_and_return", 422028036), new C4OW(c94894Ou, "viewer_purchase_limit")});
                    }

                    public CheckoutProperties() {
                        super(-36177335);
                    }
                }

                /* loaded from: classes11.dex */
                public final class DiscountInformation extends C2JS implements C2JT {

                    /* loaded from: classes11.dex */
                    public final class Discounts extends C2JS implements C2JT {
                        public Discounts() {
                            super(1868475267);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC65703TsZ.A0y();
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0W(C4OO.A00(), Discounts.class, "discounts", 1868475267);
                    }

                    public DiscountInformation() {
                        super(-1945008516);
                    }
                }

                /* loaded from: classes10.dex */
                public final class ImageQualityMetadata extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class Goodness extends C2JS implements C2JT {
                        public Goodness() {
                            super(201808100);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC58323PtF.A0S();
                        }
                    }

                    /* loaded from: classes10.dex */
                    public final class LifestyleBackground extends C2JS implements C2JT {
                        public LifestyleBackground() {
                            super(447702031);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC58323PtF.A0S();
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC58320PtC.A0T(C4OO.A00(), AbstractC166987dD.A0h(C4OO.A00(), Goodness.class, "goodness", 201808100), LifestyleBackground.class, "lifestyle_background", 447702031);
                    }

                    public ImageQualityMetadata() {
                        super(2013971276);
                    }
                }

                /* loaded from: classes10.dex */
                public final class MainImage extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class ImageVersions2 extends C2JS implements C2JT {

                        /* loaded from: classes10.dex */
                        public final class Candidates extends C2JS implements C2JT {
                            public Candidates() {
                                super(957741652);
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC58323PtF.A0T();
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0W(C4OO.A00(), Candidates.class, "candidates", 957741652);
                        }

                        public ImageVersions2() {
                            super(887136400);
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC58323PtF.A0W(C4OO.A01(), ImageVersions2.class, 887136400);
                    }

                    public MainImage() {
                        super(-1133909976);
                    }
                }

                /* loaded from: classes10.dex */
                public final class Merchant extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C95124Py c95124Py = C95124Py.A00;
                        C4OW A0i = AbstractC166987dD.A0i(c95124Py, "disabled_sharing_products_to_guides");
                        C94754Oe c94754Oe = C94754Oe.A00;
                        return AbstractC166987dD.A0k(new C4OM[]{A0i, AbstractC166997dE.A0V(c94754Oe), AbstractC58319PtB.A0P(c95124Py), AbstractC58319PtB.A0H(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC58322PtE.A0S(c94754Oe)});
                    }

                    public Merchant() {
                        super(1750234820);
                    }
                }

                /* loaded from: classes10.dex */
                public final class ThumbnailImage extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class ImageVersions2 extends C2JS implements C2JT {

                        /* loaded from: classes10.dex */
                        public final class Candidates extends C2JS implements C2JT {
                            public Candidates() {
                                super(1515073760);
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC58323PtF.A0T();
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0W(C4OO.A00(), Candidates.class, "candidates", 1515073760);
                        }

                        public ImageVersions2() {
                            super(-183635373);
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC58323PtF.A0W(C4OO.A01(), ImageVersions2.class, -183635373);
                    }

                    public ThumbnailImage() {
                        super(-907194521);
                    }
                }

                /* loaded from: classes11.dex */
                public final class VariantValues extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C94754Oe c94754Oe = C94754Oe.A00;
                        return AbstractC65703TsZ.A11(c94754Oe, new C94774Oi(c94754Oe));
                    }

                    public VariantValues() {
                        super(657761586);
                    }
                }

                /* loaded from: classes11.dex */
                public final class AggregatedRating extends C2JS implements C2JT {
                    public AggregatedRating() {
                        super(1565531026);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC65703TsZ.A0s();
                    }
                }

                /* loaded from: classes11.dex */
                public final class CommerceReviewStatistics extends C2JS implements C2JT {
                    public CommerceReviewStatistics() {
                        super(-412182047);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC65703TsZ.A0r();
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C4OM[] c4omArr = new C4OM[34];
                    C4OK c4ok = new C4OK(AggregatedRating.class, "aggregated_rating", 1565531026);
                    C4OK c4ok2 = new C4OK(ArtsLabels.class, "arts_labels", 2117433730);
                    C95124Py c95124Py = C95124Py.A00;
                    C4OW c4ow = new C4OW(c95124Py, "can_share_to_story");
                    C4OW c4ow2 = new C4OW(c95124Py, "can_viewer_see_rnr");
                    C4OK c4ok3 = new C4OK(CheckoutProperties.class, "checkout_properties", -36177335);
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC58321PtD.A0Z(new C4OM[]{new C4OW(c94754Oe, "price"), new C4OW(c94754Oe, "product_id"), new C4OW(c94754Oe, "retailer_id"), new C4OW(c94754Oe, "review_status"), new C4OW(c94754Oe, "size_calibration_score"), new C4OK(ThumbnailImage.class, "thumbnail_image", -907194521), new C4OK(C4OO.A00(), VariantValues.class, "variant_values", 657761586)}, c4omArr, AbstractC31175DnJ.A1b(new C4OM[]{c4ok, c4ok2, c4ow, c4ow2, c4ok3, new C4OW(c94754Oe, "checkout_style"), new C4OK(CommerceReviewStatistics.class, "commerce_review_statistics", -412182047), new C4OW(c94754Oe, "compound_product_id"), new C4OW(c94754Oe, "current_price"), new C4OW(c94754Oe, "current_price_amount"), new C4OW(c94754Oe, "current_price_stripped"), AbstractC58322PtE.A0Y(c94754Oe), new C4OK(DiscountInformation.class, "discount_information", -1945008516), new C4OW(c94754Oe, "external_url"), new C4OW(c94754Oe, "full_price"), new C4OW(c94754Oe, "full_price_amount"), new C4OW(c94754Oe, "full_price_stripped"), new C4OW(c95124Py, "has_variants"), new C4OW(c95124Py, "has_viewer_saved"), new C4OW(c95124Py, "ig_is_product_editable_on_mobile"), new C4OK(ImageQualityMetadata.class, "image_quality_metadata", 2013971276), new C4OW(c95124Py, "is_entered_in_drawing"), new C4OW(c95124Py, "is_in_stock"), new C4OK(MainImage.class, "main_image", -1133909976), new C4OW(c94754Oe, "main_image_id"), new C4OK(Merchant.class, "merchant", 1750234820), AbstractC58321PtD.A0U(c94754Oe)}, c4omArr) ? 1 : 0, 27, 7);
                }

                public ProductDetails() {
                    super(888176544);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0b(ProductDetails.class, "product_details", 888176544);
            }

            public Products() {
                super(858162943);
            }
        }

        /* loaded from: classes11.dex */
        public final class ClipsShoppingCtaBar extends C2JS implements C2JT {
            public ClipsShoppingCtaBar() {
                super(1223230687);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC65703TsZ.A0m();
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58319PtB.A0T(new C4OK(ClipsShoppingCtaBar.class, "clips_shopping_cta_bar", 1223230687), new C4OK(Merchant.class, "merchant", 1130877779), new C4OK(C4OO.A00(), Products.class, "products", 858162943));
        }

        public IgtvShoppingInfo() {
            super(373545021);
        }
    }

    /* loaded from: classes10.dex */
    public final class ImageVersions2 extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class AdditionalCandidates extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class FirstFrame extends C2JS implements C2JT {
                public FirstFrame() {
                    super(-37256028);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC58323PtF.A0R();
                }
            }

            /* loaded from: classes10.dex */
            public final class IgtvFirstFrame extends C2JS implements C2JT {
                public IgtvFirstFrame() {
                    super(1575924043);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC58323PtF.A0R();
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0W(AbstractC58318PtA.A0O(FirstFrame.class, "first_frame", -37256028), IgtvFirstFrame.class, "igtv_first_frame", 1575924043);
            }

            public AdditionalCandidates() {
                super(1580196258);
            }
        }

        /* loaded from: classes10.dex */
        public final class ScrubberSpritesheetInfoCandidates extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class Default extends C2JS implements C2JT {
                public Default() {
                    super(-1553998852);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC65704Tsa.A03();
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0b(Default.class, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, -1553998852);
            }

            public ScrubberSpritesheetInfoCandidates() {
                super(-897228425);
            }
        }

        /* loaded from: classes10.dex */
        public final class Candidates extends C2JS implements C2JT {
            public Candidates() {
                super(1422214717);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58323PtF.A0R();
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58320PtC.A0U(C95124Py.A00, AbstractC58318PtA.A0O(AdditionalCandidates.class, "additional_candidates", 1580196258), AbstractC166987dD.A0h(C4OO.A00(), Candidates.class, "candidates", 1422214717), AbstractC58318PtA.A0O(ScrubberSpritesheetInfoCandidates.class, "scrubber_spritesheet_info_candidates", -897228425), "smart_thumbnail_enabled");
        }

        public ImageVersions2() {
            super(761365765);
        }
    }

    /* loaded from: classes11.dex */
    public final class Location extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC65704Tsa.A07(c94754Oe, c94754Oe);
        }

        public Location() {
            super(-179372203);
        }
    }

    /* loaded from: classes11.dex */
    public final class MediaAppreciationSettings extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC167017dG.A0Y(new C94774Oi(c94754Oe), new C4OW(new C94774Oi(c94754Oe), "gift_count_visibility"), "media_gifting_state");
        }

        public MediaAppreciationSettings() {
            super(-752317743);
        }
    }

    /* loaded from: classes11.dex */
    public final class MediaCroppingInfo extends C2JS implements C2JT {

        /* loaded from: classes11.dex */
        public final class FeedPreviewCrop extends C2JS implements C2JT {
            public FeedPreviewCrop() {
                super(-1005032501);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC65703TsZ.A10();
            }
        }

        /* loaded from: classes11.dex */
        public final class SquareCrop extends C2JS implements C2JT {
            public SquareCrop() {
                super(-1815381215);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC65703TsZ.A10();
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0X(C94754Oe.A00, new C4OK(FeedPreviewCrop.class, "feed_preview_crop", -1005032501), new C4OK(SquareCrop.class, "square_crop", -1815381215), "strong_id__");
        }

        public MediaCroppingInfo() {
            super(1799661485);
        }
    }

    /* loaded from: classes11.dex */
    public final class MediaNotice extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC58320PtC.A0U(c94754Oe, new C4OW(c94754Oe, "notice_icon"), new C4OW(c94754Oe, "notice_sub_text"), new C4OW(c94754Oe, "notice_text"), "notice_url");
        }

        public MediaNotice() {
            super(1440148420);
        }
    }

    /* loaded from: classes11.dex */
    public final class MediaOverlayInfo extends C2JS implements C2JT {

        /* loaded from: classes11.dex */
        public final class Buttons extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class TextColor extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC167017dG.A0Y(new C94774Oi(c94754Oe), new C4OW(new C94774Oi(c94754Oe), "dark"), "light");
                }

                public TextColor() {
                    super(1032136720);
                }
            }

            /* loaded from: classes11.dex */
            public final class Icon extends C2JS implements C2JT {
                public Icon() {
                    super(-800735994);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC65703TsZ.A0x();
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94894Ou c94894Ou = C94894Ou.A00;
                C4OW c4ow = new C4OW(c94894Ou, "action");
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW c4ow2 = new C4OW(c94754Oe, "action_url");
                C4OW c4ow3 = new C4OW(c94894Ou, "button_type");
                C95124Py c95124Py = C95124Py.A00;
                return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, new C4OW(c95124Py, "has_chevron"), new C4OK(Icon.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, -800735994), new C4OW(c95124Py, "is_text_centered"), new C4OW(c94754Oe, "secondary_text"), AbstractC58319PtB.A0C(c94754Oe), new C4OK(TextColor.class, "text_color", 1032136720)});
            }

            public Buttons() {
                super(1822921403);
            }
        }

        /* loaded from: classes11.dex */
        public final class Icon extends C2JS implements C2JT {
            public Icon() {
                super(-25144965);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC65703TsZ.A0x();
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C4OK c4ok = new C4OK(C4OO.A00(), Buttons.class, "buttons", 1822921403);
            C94754Oe c94754Oe = C94754Oe.A00;
            C4OW A0Y = AbstractC58322PtE.A0Y(c94754Oe);
            C4OK c4ok2 = new C4OK(Icon.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, -25144965);
            C94894Ou c94894Ou = C94894Ou.A00;
            return new C4OU(new C4OM[]{c4ok, A0Y, c4ok2, new C4OW(c94894Ou, "misinformation_type"), new C4OW(c94894Ou, "overlay_applied_timestamp"), new C4OW(c94894Ou, "overlay_layout"), new C4OW(c94754Oe, "overlay_type"), new C4OW(c94754Oe, AbstractC50635MWw.A01()), new C4OW(c94754Oe, "sub_category"), AbstractC58319PtB.A0L(c94754Oe)});
        }

        public MediaOverlayInfo() {
            super(1622059795);
        }
    }

    /* loaded from: classes11.dex */
    public final class MusicMetadata extends C2JS implements C2JT {

        /* loaded from: classes11.dex */
        public final class OriginalSoundInfo extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class AudioParts extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0a(IGCreatorInspirationAudioPartMetaDataImpl.class, "IGCreatorInspirationAudioPartMetaData", -930788774);
                }

                public AudioParts() {
                    super(1707031608);
                }
            }

            /* loaded from: classes11.dex */
            public final class AudioPartsByFilter extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0a(IGCreatorInspirationAudioPartMetaDataImpl.class, "IGCreatorInspirationAudioPartMetaData", -930788774);
                }

                public AudioPartsByFilter() {
                    super(1813278850);
                }
            }

            /* loaded from: classes11.dex */
            public final class ConsumptionInfo extends C2JS implements C2JT {
                public ConsumptionInfo() {
                    super(-1245112650);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC65703TsZ.A0v();
                }
            }

            /* loaded from: classes10.dex */
            public final class IgArtist extends C2JS implements C2JT {
                public IgArtist() {
                    super(1426649261);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC58324PtG.A0D();
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C95124Py c95124Py = C95124Py.A00;
                C4OW A0j = AbstractC65703TsZ.A0j(c95124Py);
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW A0X = AbstractC65703TsZ.A0X(c94754Oe);
                C4OK c4ok = new C4OK(C4OO.A02(), AudioParts.class, "audio_parts", 1707031608);
                C4OK c4ok2 = new C4OK(C4OO.A02(), AudioPartsByFilter.class, "audio_parts_by_filter", 1813278850);
                C4OW c4ow = new C4OW(c95124Py, "can_remix_be_shared_to_fb");
                C4OK c4ok3 = new C4OK(C4OO.A01(), ConsumptionInfo.class, "consumption_info", -1245112650);
                C4OW A0g = AbstractC65703TsZ.A0g(c94754Oe);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{A0j, A0X, c4ok, c4ok2, c4ow, c4ok3, A0g, new C4OW(c94894Ou, "duration_in_ms"), AbstractC65703TsZ.A0h(c95124Py), new C4OK(C4OO.A01(), IgArtist.class, "ig_artist", 1426649261), AbstractC65703TsZ.A0H(c95124Py), AbstractC65703TsZ.A0G(c95124Py), new C4OW(c95124Py, "is_original_audio_download_eligible"), new C4OW(c95124Py, "is_reuse_disabled"), new C4OW(c95124Py, "is_xpost_from_fb"), AbstractC65703TsZ.A0f(c94754Oe), AbstractC65703TsZ.A0P(c94754Oe), AbstractC65703TsZ.A0F(c94754Oe), AbstractC65703TsZ.A0M(c94754Oe), AbstractC65703TsZ.A0c(c95124Py), new C4OW(c94894Ou, "time_created"), new C4OW(c94894Ou, "trend_rank")});
            }

            public OriginalSoundInfo() {
                super(-1112590746);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC58320PtC.A0V(new C4OW(c94754Oe, "audio_type"), AbstractC65703TsZ.A0a(c94754Oe), OriginalSoundInfo.class, "original_sound_info", -1112590746);
        }

        public MusicMetadata() {
            super(834659846);
        }
    }

    /* loaded from: classes11.dex */
    public final class OrganicCtaInfo extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC167017dG.A0X(new C94774Oi(c94754Oe), new C4OW(c94754Oe, "cta_subtitle"), new C4OW(new C94774Oi(c94754Oe), "cta_title"), "cta_type");
        }

        public OrganicCtaInfo() {
            super(1072429620);
        }
    }

    /* loaded from: classes11.dex */
    public final class ProductTags extends C2JS implements C2JT {

        /* loaded from: classes11.dex */
        public final class In extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class Product extends C2JS implements C2JT {

                /* loaded from: classes11.dex */
                public final class ArtsLabels extends C2JS implements C2JT {

                    /* loaded from: classes11.dex */
                    public final class Labels extends C2JS implements C2JT {
                        public Labels() {
                            super(-1542455229);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC65703TsZ.A0u();
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0W(C4OO.A00(), Labels.class, "labels", -1542455229);
                    }

                    public ArtsLabels() {
                        super(-1582250498);
                    }
                }

                /* loaded from: classes11.dex */
                public final class CheckoutProperties extends C2JS implements C2JT {

                    /* loaded from: classes11.dex */
                    public final class ShippingAndReturn extends C2JS implements C2JT {

                        /* loaded from: classes11.dex */
                        public final class ReturnCost extends C2JS implements C2JT {
                            public ReturnCost() {
                                super(329086421);
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC65703TsZ.A0o();
                            }
                        }

                        /* loaded from: classes11.dex */
                        public final class ShippingCost extends C2JS implements C2JT {
                            public ShippingCost() {
                                super(838033820);
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC65703TsZ.A0o();
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0X(C94754Oe.A00, new C4OK(ReturnCost.class, "return_cost", 329086421), new C4OK(ShippingCost.class, "shipping_cost", 838033820), "shipping_cost_stripped");
                        }

                        public ShippingAndReturn() {
                            super(1344393291);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class CurrencyAmount extends C2JS implements C2JT {
                        public CurrencyAmount() {
                            super(1093892995);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC65703TsZ.A0o();
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C95124Py c95124Py = C95124Py.A00;
                        C4OW c4ow = new C4OW(c95124Py, "can_add_to_bag");
                        C4OW c4ow2 = new C4OW(c95124Py, "can_enable_restock_reminder");
                        C4OK c4ok = new C4OK(CurrencyAmount.class, "currency_amount", 1093892995);
                        C94894Ou c94894Ou = C94894Ou.A00;
                        C4OW c4ow3 = new C4OW(c94894Ou, "full_inventory_quantity");
                        C4OW c4ow4 = new C4OW(c95124Py, "has_free_shipping");
                        C94754Oe c94754Oe = C94754Oe.A00;
                        return new C4OU(new C4OM[]{c4ow, c4ow2, c4ok, c4ow3, c4ow4, new C4OW(c94754Oe, "ig_referrer_fbid"), new C4OW(c94894Ou, "inventory_quantity"), new C4OW(c95124Py, "is_shopify_merchant"), new C4OW(c95124Py, "product_group_has_inventory"), new C4OW(c94754Oe, "receiver_id"), new C4OK(ShippingAndReturn.class, "shipping_and_return", 1344393291), new C4OW(c94894Ou, "viewer_purchase_limit")});
                    }

                    public CheckoutProperties() {
                        super(275762095);
                    }
                }

                /* loaded from: classes11.dex */
                public final class DiscountInformation extends C2JS implements C2JT {

                    /* loaded from: classes11.dex */
                    public final class Discounts extends C2JS implements C2JT {
                        public Discounts() {
                            super(1428220110);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC65703TsZ.A0y();
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0W(C4OO.A00(), Discounts.class, "discounts", 1428220110);
                    }

                    public DiscountInformation() {
                        super(-690407014);
                    }
                }

                /* loaded from: classes10.dex */
                public final class ImageQualityMetadata extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class Goodness extends C2JS implements C2JT {
                        public Goodness() {
                            super(887454022);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC58323PtF.A0S();
                        }
                    }

                    /* loaded from: classes10.dex */
                    public final class LifestyleBackground extends C2JS implements C2JT {
                        public LifestyleBackground() {
                            super(1325716489);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC58323PtF.A0S();
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC58320PtC.A0T(C4OO.A00(), AbstractC166987dD.A0h(C4OO.A00(), Goodness.class, "goodness", 887454022), LifestyleBackground.class, "lifestyle_background", 1325716489);
                    }

                    public ImageQualityMetadata() {
                        super(-1978587525);
                    }
                }

                /* loaded from: classes10.dex */
                public final class MainImage extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class ImageVersions2 extends C2JS implements C2JT {

                        /* loaded from: classes10.dex */
                        public final class Candidates extends C2JS implements C2JT {
                            public Candidates() {
                                super(785627215);
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC58323PtF.A0T();
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0W(C4OO.A00(), Candidates.class, "candidates", 785627215);
                        }

                        public ImageVersions2() {
                            super(-2077122898);
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC58323PtF.A0W(C4OO.A01(), ImageVersions2.class, -2077122898);
                    }

                    public MainImage() {
                        super(-2094311366);
                    }
                }

                /* loaded from: classes11.dex */
                public final class RichTextDescription extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class TextWithEntities extends C2JS implements C2JT {

                        /* loaded from: classes10.dex */
                        public final class InlineStyleRanges extends C2JS implements C2JT {
                            public InlineStyleRanges() {
                                super(66929577);
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC58323PtF.A0U();
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0Y(C94754Oe.A00, AbstractC166987dD.A0h(C4OO.A00(), InlineStyleRanges.class, "inline_style_ranges", 66929577), "text");
                        }

                        public TextWithEntities() {
                            super(-349891082);
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC58320PtC.A0V(new C4OW(C94754Oe.A00, "block_type"), new C4OW(C94894Ou.A00, "depth"), TextWithEntities.class, "text_with_entities", -349891082);
                    }

                    public RichTextDescription() {
                        super(1247883843);
                    }
                }

                /* loaded from: classes11.dex */
                public final class SellerBadge extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C94754Oe c94754Oe = C94754Oe.A00;
                        return AbstractC167017dG.A0X(c94754Oe, AbstractC58322PtE.A0Y(c94754Oe), AbstractC58321PtD.A0U(c94754Oe), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    }

                    public SellerBadge() {
                        super(692148500);
                    }
                }

                /* loaded from: classes10.dex */
                public final class ThumbnailImage extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class ImageVersions2 extends C2JS implements C2JT {

                        /* loaded from: classes10.dex */
                        public final class Candidates extends C2JS implements C2JT {
                            public Candidates() {
                                super(1877240561);
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC58323PtF.A0T();
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0W(C4OO.A00(), Candidates.class, "candidates", 1877240561);
                        }

                        public ImageVersions2() {
                            super(-105661540);
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0W(C4OO.A01(), ImageVersions2.class, "image_versions2", -105661540);
                    }

                    public ThumbnailImage() {
                        super(-1251109576);
                    }
                }

                /* loaded from: classes11.dex */
                public final class AggregatedRating extends C2JS implements C2JT {
                    public AggregatedRating() {
                        super(-257790802);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC65703TsZ.A0s();
                    }
                }

                /* loaded from: classes11.dex */
                public final class CommerceReviewStatistics extends C2JS implements C2JT {
                    public CommerceReviewStatistics() {
                        super(1370918289);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC65703TsZ.A0r();
                    }
                }

                /* loaded from: classes10.dex */
                public final class Merchant extends C2JS implements C2JT {
                    public Merchant() {
                        super(1665563444);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC58324PtG.A0F();
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C4OM[] c4omArr = new C4OM[35];
                    C4OK c4ok = new C4OK(AggregatedRating.class, "aggregated_rating", -257790802);
                    C4OK c4ok2 = new C4OK(ArtsLabels.class, "arts_labels", -1582250498);
                    C95124Py c95124Py = C95124Py.A00;
                    C4OW c4ow = new C4OW(c95124Py, "can_share_to_story");
                    C4OW c4ow2 = new C4OW(c95124Py, "can_viewer_see_rnr");
                    C4OK c4ok3 = new C4OK(CheckoutProperties.class, "checkout_properties", 275762095);
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC58321PtD.A0Z(new C4OM[]{new C4OW(c94754Oe, "price"), new C4OW(c94754Oe, "product_id"), new C4OW(c94754Oe, "retailer_id"), new C4OW(c94754Oe, "review_status"), new C4OK(C4OO.A00(), RichTextDescription.class, "rich_text_description", 1247883843), new C4OK(SellerBadge.class, "seller_badge", 692148500), new C4OW(c94754Oe, "size_calibration_score"), new C4OK(ThumbnailImage.class, "thumbnail_image", -1251109576)}, c4omArr, AbstractC31175DnJ.A1b(new C4OM[]{c4ok, c4ok2, c4ow, c4ow2, c4ok3, new C4OW(c94754Oe, "checkout_style"), new C4OK(CommerceReviewStatistics.class, "commerce_review_statistics", 1370918289), new C4OW(c94754Oe, "compound_product_id"), new C4OW(c94754Oe, "current_price"), new C4OW(c94754Oe, "current_price_amount"), new C4OW(c94754Oe, "current_price_stripped"), AbstractC58322PtE.A0Y(c94754Oe), new C4OK(DiscountInformation.class, "discount_information", -690407014), new C4OW(c94754Oe, "external_url"), new C4OW(c94754Oe, "full_price"), new C4OW(c94754Oe, "full_price_amount"), new C4OW(c94754Oe, "full_price_stripped"), new C4OW(c95124Py, "has_variants"), new C4OW(c95124Py, "has_viewer_saved"), new C4OW(c95124Py, "ig_is_product_editable_on_mobile"), new C4OK(ImageQualityMetadata.class, "image_quality_metadata", -1978587525), new C4OW(c95124Py, "is_entered_in_drawing"), new C4OW(c95124Py, "is_in_stock"), new C4OK(MainImage.class, "main_image", -2094311366), new C4OW(c94754Oe, "main_image_id"), new C4OK(Merchant.class, "merchant", 1665563444), AbstractC58321PtD.A0U(c94754Oe)}, c4omArr) ? 1 : 0, 27, 8);
                }

                public Product() {
                    super(362729596);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0V(new C4OW(C94894Ou.A00, "destination"), new C4OW(C95124Py.A00, "is_removable"), Product.class, "product", 362729596);
            }

            public In() {
                super(352334585);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0W(C4OO.A00(), In.class, "in", 352334585);
        }

        public ProductTags() {
            super(528440028);
        }
    }

    /* loaded from: classes11.dex */
    public final class Senders extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC167017dG.A0Y(c94754Oe, AbstractC166997dE.A0V(c94754Oe), "profile_pic_url");
        }

        public Senders() {
            super(1823249918);
        }
    }

    /* loaded from: classes10.dex */
    public final class SocialContext extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class SocialContextFacepileUsers extends C2JS implements C2JT {
            public SocialContextFacepileUsers() {
                super(-1787290593);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58324PtG.A0D();
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0X(AbstractC58319PtB.A0R(), AbstractC166987dD.A0h(C4OO.A02(), SocialContextFacepileUsers.class, "social_context_facepile_users", -1787290593), AbstractC166987dD.A0i(AbstractC58318PtA.A0Q(), AbstractC111324zv.A00(75)), "social_context_users_count");
        }

        public SocialContext() {
            super(1950405335);
        }
    }

    /* loaded from: classes10.dex */
    public final class SponsorTags extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class Sponsor extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW A0E = AbstractC58319PtB.A0E(c94754Oe);
                C95124Py c95124Py = C95124Py.A00;
                return AbstractC166987dD.A0k(new C4OM[]{A0E, AbstractC58322PtE.A0T(c95124Py), AbstractC166997dE.A0V(c94754Oe), AbstractC58319PtB.A0O(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_unpublished"), AbstractC58319PtB.A0P(c95124Py), AbstractC58319PtB.A0H(c94754Oe), AbstractC58319PtB.A0K(c94754Oe), AbstractC58319PtB.A0Q(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC58322PtE.A0S(c94754Oe)});
            }

            public Sponsor() {
                super(-385232615);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C95124Py c95124Py = C95124Py.A00;
            return AbstractC58319PtB.A0T(AbstractC166987dD.A0i(c95124Py, "is_pending"), AbstractC166987dD.A0i(c95124Py, "permission"), AbstractC166987dD.A0h(C4OO.A01(), Sponsor.class, "sponsor", -385232615));
        }

        public SponsorTags() {
            super(-685622952);
        }
    }

    /* loaded from: classes11.dex */
    public final class StoryPolls extends C2JS implements C2JT {

        /* loaded from: classes11.dex */
        public final class PollSticker extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class Tallies extends C2JS implements C2JT {
                public Tallies() {
                    super(-166415889);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0X(C94754Oe.A00, AbstractC58322PtE.A0N(), new C4OW(C173847oc.A00, "font_size"), "text");
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW c4ow = new C4OW(c94754Oe, "color");
                C95124Py c95124Py = C95124Py.A00;
                return new C4OU(new C4OM[]{c4ow, new C4OW(c95124Py, "finished"), AbstractC166997dE.A0V(c94754Oe), new C4OW(c95124Py, "is_multi_option_poll"), new C4OW(c95124Py, "is_shared_result"), new C4OW(c94754Oe, "poll_id"), new C4OW(c94754Oe, "poll_type"), new C4OW(c94754Oe, "question"), new C4OK(C4OO.A00(), Tallies.class, "tallies", -166415889), new C4OW(c95124Py, "viewer_can_vote"), new C4OW(C94894Ou.A00, "viewer_vote")});
            }

            public PollSticker() {
                super(1827418953);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C173847oc c173847oc = C173847oc.A00;
            C4OW c4ow = new C4OW(c173847oc, "end_time_ms");
            C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
            C94894Ou c94894Ou = C94894Ou.A00;
            return new C4OU(new C4OM[]{c4ow, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OK(PollSticker.class, "poll_sticker", 1827418953), new C4OW(c173847oc, "rotation"), new C4OW(c173847oc, "start_time_ms"), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
        }

        public StoryPolls() {
            super(-527904654);
        }
    }

    /* loaded from: classes11.dex */
    public final class StorySliders extends C2JS implements C2JT {

        /* loaded from: classes11.dex */
        public final class SliderSticker extends C2JS implements C2JT {
            public SliderSticker() {
                super(1345389362);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC65704Tsa.A02();
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C173847oc c173847oc = C173847oc.A00;
            C4OW c4ow = new C4OW(c173847oc, "end_time_ms");
            C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
            C94894Ou c94894Ou = C94894Ou.A00;
            return new C4OU(new C4OM[]{c4ow, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OW(c173847oc, "rotation"), new C4OK(SliderSticker.class, "slider_sticker", 1345389362), new C4OW(c173847oc, "start_time_ms"), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
        }

        public StorySliders() {
            super(-777735069);
        }
    }

    /* loaded from: classes10.dex */
    public final class UpcomingEvent extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class Owner extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC167017dG.A0Y(c94754Oe, AbstractC166997dE.A0V(c94754Oe), "pk");
            }

            public Owner() {
                super(-17358591);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C67A c67a = C67A.A00;
            C4OW A0i = AbstractC166987dD.A0i(c67a, "end_time");
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC58324PtG.A0J(c67a, c94754Oe, A0i, AbstractC58320PtC.A0P(c94754Oe), AbstractC58318PtA.A0O(Owner.class, "owner", -17358591));
        }

        public UpcomingEvent() {
            super(383191972);
        }
    }

    /* loaded from: classes10.dex */
    public final class User extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0a(UserInfoFragmentImpl.class, "UserInfoFragment", 1766112135);
        }

        public User() {
            super(-892337361);
        }
    }

    /* loaded from: classes10.dex */
    public final class Usertags extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class In extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class User extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class FriendshipStatus extends C2JS implements C2JT {
                    public FriendshipStatus() {
                        super(1688825071);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC58324PtG.A0B();
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C4OK A0M = AbstractC58322PtE.A0M(FriendshipStatus.class, 1688825071);
                    C94754Oe c94754Oe = C94754Oe.A00;
                    C4OW A0E = AbstractC58319PtB.A0E(c94754Oe);
                    C95124Py c95124Py = C95124Py.A00;
                    return AbstractC166987dD.A0k(new C4OM[]{A0M, A0E, AbstractC58322PtE.A0T(c95124Py), AbstractC166997dE.A0V(c94754Oe), AbstractC58319PtB.A0O(c95124Py), AbstractC58319PtB.A0P(c95124Py), AbstractC58319PtB.A0H(c94754Oe), AbstractC58319PtB.A0K(c94754Oe), AbstractC58319PtB.A0Q(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC58322PtE.A0S(c94754Oe)});
                }

                public User() {
                    super(-775977040);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0T(C4OO.A01(), AbstractC166987dD.A0i(C95124Py.A00, "show_category_of_user"), User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -775977040);
            }

            public In() {
                super(1572066514);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0W(C4OO.A02(), In.class, "in", 1572066514);
        }

        public Usertags() {
            super(-617248319);
        }
    }

    /* loaded from: classes11.dex */
    public final class VisualCommentReplyStickerInfo extends C2JS implements C2JT {

        /* loaded from: classes11.dex */
        public final class VcrSticker extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class OriginalCommentAuthor extends C2JS implements C2JT {
                public OriginalCommentAuthor() {
                    super(370745647);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC58324PtG.A0A();
                }
            }

            public VcrSticker() {
                super(-1305770986);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OW A0C = AbstractC65703TsZ.A0C();
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW c4ow = new C4OW(c94754Oe, "end_background_color");
                C173847oc c173847oc = C173847oc.A00;
                return new C4OU(new C4OM[]{A0C, c4ow, new C4OW(c173847oc, "end_time_ms"), new C4OK(C4OO.A01(), OriginalCommentAuthor.class, "original_comment_author", 370745647), new C4OW(new C94774Oi(c94754Oe), "original_comment_id"), new C4OW(new C94774Oi(c94754Oe), "original_comment_text"), AbstractC65703TsZ.A0F(c94754Oe), new C4OW(c94754Oe, "start_background_color"), new C4OW(c173847oc, "start_time_ms"), new C4OW(c94754Oe, "text_color")});
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C173847oc c173847oc = C173847oc.A00;
            C4OW c4ow = new C4OW(c173847oc, "end_time_ms");
            C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
            C94894Ou c94894Ou = C94894Ou.A00;
            return new C4OU(new C4OM[]{c4ow, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OW(c173847oc, "rotation"), new C4OW(c173847oc, "start_time_ms"), new C4OK(VcrSticker.class, "vcr_sticker", -1305770986), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
        }

        public VisualCommentReplyStickerInfo() {
            super(827870414);
        }
    }

    /* loaded from: classes11.dex */
    public final class VisualRepliesInfo extends C2JS implements C2JT {

        /* loaded from: classes11.dex */
        public final class CommentInfo extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC167017dG.A0Y(new C94774Oi(c94754Oe), new C4OW(new C94774Oi(c94754Oe), "comment_id"), "commenter_username");
            }

            public CommentInfo() {
                super(-30759456);
            }
        }

        /* loaded from: classes11.dex */
        public final class OriginalMedia extends C2JS implements C2JT {
            public OriginalMedia() {
                super(1738064409);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Z(AbstractC58318PtA.A0Q(), "pk");
            }
        }

        public VisualRepliesInfo() {
            super(-1718272272);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58319PtB.A0T(AbstractC65703TsZ.A0C(), new C4OK(C4OO.A01(), CommentInfo.class, "comment_info", -30759456), new C4OK(C4OO.A01(), OriginalMedia.class, "original_media", 1738064409));
        }
    }

    /* loaded from: classes11.dex */
    public final class WearableAttributionInfo extends C2JS implements C2JT {

        /* loaded from: classes11.dex */
        public final class WorldLocationPagesInfo extends C2JS implements C2JT {
            public WorldLocationPagesInfo() {
                super(-44862278);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC65703TsZ.A0t();
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return new C4OU(new C4OM[]{AbstractC65703TsZ.A0O(c94754Oe), AbstractC65703TsZ.A0Q(c94754Oe), AbstractC65703TsZ.A0R(c94754Oe), AbstractC65703TsZ.A0S(c94754Oe), AbstractC65703TsZ.A0T(c94754Oe), AbstractC65703TsZ.A0I(c94754Oe), new C4OW(c94754Oe, "attribution_type"), new C4OW(C94894Ou.A00, "iconic_current_presence"), new C4OW(c94754Oe, "iconic_horizon_world_deeplink"), new C4OW(c94754Oe, "iconic_horizon_world_id"), new C4OW(c94754Oe, "iconic_horizon_world_name"), AbstractC65703TsZ.A0D(), new C4OK(WorldLocationPagesInfo.class, "world_location_pages_info", -44862278)});
        }

        public WearableAttributionInfo() {
            super(902323482);
        }
    }

    public final C38321qM A0E(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        C38801rC c38801rC = C38321qM.A0h;
        TreeJNI reinterpret = reinterpret(ImmutablePandoMediaDict.class);
        C14360o3.A07(reinterpret);
        return C38801rC.A00(new C1DY(c1dv, 6, false), (ImmutablePandoMediaDict) reinterpret);
    }

    /* loaded from: classes11.dex */
    public final class Attribution extends C2JS implements C2JT {
        public Attribution() {
            super(-453222363);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(AbstractC58318PtA.A0Q(), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        }
    }

    /* loaded from: classes11.dex */
    public final class BrandedContentAdsBoostPostTokens extends C2JS implements C2JT {
        public BrandedContentAdsBoostPostTokens() {
            super(-1779248114);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(AbstractC58318PtA.A0Q(), "access_token");
        }
    }

    /* loaded from: classes10.dex */
    public final class CoauthorProducers extends C2JS implements C2JT {
        public CoauthorProducers() {
            super(-2078556405);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58324PtG.A0A();
        }
    }

    /* loaded from: classes11.dex */
    public final class CommentInformTreatment extends C2JS implements C2JT {
        public CommentInformTreatment() {
            super(1191698692);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Y(AbstractC58318PtA.A0Q(), new C4OW(AbstractC58319PtB.A0S(), "should_have_inform_treatment"), "text");
        }
    }

    /* loaded from: classes10.dex */
    public final class FacepileTopLikers extends C2JS implements C2JT {
        public FacepileTopLikers() {
            super(1191545262);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58324PtG.A0D();
        }
    }

    /* loaded from: classes11.dex */
    public final class IgtvSeriesInfo extends C2JS implements C2JT {
        public IgtvSeriesInfo() {
            super(-1425622768);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C4OW c4ow = new C4OW(AbstractC58319PtB.A0S(), "has_cover_photo");
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC58320PtC.A0U(new C94774Oi(c94754Oe), c4ow, AbstractC58320PtC.A0P(c94754Oe), new C4OW(AbstractC58319PtB.A0R(), "num_episodes"), DialogModule.KEY_TITLE);
        }
    }

    /* loaded from: classes10.dex */
    public final class InvitedCoauthorProducers extends C2JS implements C2JT {
        public InvitedCoauthorProducers() {
            super(1522785089);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58324PtG.A0A();
        }
    }

    /* loaded from: classes11.dex */
    public final class MashupInfo extends C2JS implements C2JT {
        public MashupInfo() {
            super(-881217032);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC65704Tsa.A00();
        }
    }

    /* loaded from: classes11.dex */
    public final class SharingFrictionInfo extends C2JS implements C2JT {
        public SharingFrictionInfo() {
            super(-971875588);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(AbstractC58319PtB.A0S(), "should_have_sharing_friction");
        }
    }

    /* loaded from: classes11.dex */
    public final class VideoVersions extends C2JS implements C2JT {
        public VideoVersions() {
            super(-1292252653);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58321PtD.A0X();
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C4OM[] c4omArr = new C4OM[116];
        C4OK c4ok = new C4OK(WearableAttributionInfo.class, "wearable_attribution_info", 902323482);
        C95124Py c95124Py = C95124Py.A00;
        C4OW c4ow = new C4OW(c95124Py, "are_remixes_crosspostable");
        C4OK c4ok2 = new C4OK(Attribution.class, "attribution", -453222363);
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW c4ow2 = new C4OW(c94754Oe, "audience");
        C4OW c4ow3 = new C4OW(c94754Oe, "boost_unavailable_identifier");
        C4OW c4ow4 = new C4OW(c94754Oe, "boost_unavailable_reason");
        C4OW c4ow5 = new C4OW(c94754Oe, "boosted_by_sponsor");
        C4OW c4ow6 = new C4OW(c94754Oe, "boosted_status");
        C4OK c4ok3 = new C4OK(C4OO.A00(), BrandedContentAdsBoostPostTokens.class, "branded_content_ads_boost_post_tokens", -1779248114);
        C4OW c4ow7 = new C4OW(c95124Py, "can_see_insights_as_brand");
        C4OW c4ow8 = new C4OW(c95124Py, "can_viewer_reshare");
        C4OW c4ow9 = new C4OW(c95124Py, "can_viewer_save");
        C4OK c4ok4 = new C4OK(Caption.class, "caption", -1124539568);
        C4OW c4ow10 = new C4OW(c95124Py, "caption_is_edited");
        C4OK c4ok5 = new C4OK(ClipsAttributionInfo.class, "clips_attribution_info", -1386663628);
        C4OW c4ow11 = new C4OW(C94754Oe.A00(), "clips_tab_pinned_user_ids");
        C4OK c4ok6 = new C4OK(ClipsMetadata.class, "clips_metadata", 1286400893);
        C4OW c4ow12 = new C4OW(c95124Py, "coauthor_producer_can_see_organic_insights");
        C4OK c4ok7 = new C4OK(C4OO.A00(), CoauthorProducers.class, "coauthor_producers", -2078556405);
        C4OW c4ow13 = new C4OW(c94754Oe, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        C94894Ou c94894Ou = C94894Ou.A00;
        C4OW c4ow14 = new C4OW(c94894Ou, "comment_count");
        C4OK c4ok8 = new C4OK(CommentInformTreatment.class, "comment_inform_treatment", 1191698692);
        C4OW c4ow15 = new C4OW(c95124Py, "commenting_disabled_for_viewer");
        C4OW c4ow16 = new C4OW(c95124Py, "comments_disabled");
        C4OK c4ok9 = new C4OK(CreativeConfig.class, "creative_config", -1418630075);
        C4OW c4ow17 = new C4OW(c94894Ou, "deleted_reason");
        C67A c67a = C67A.A00;
        System.arraycopy(new C4OM[]{c4ok, c4ow, c4ok2, c4ow2, c4ow3, c4ow4, c4ow5, c4ow6, c4ok3, c4ow7, c4ow8, c4ow9, c4ok4, c4ow10, c4ok5, c4ow11, c4ok6, c4ow12, c4ok7, c4ow13, c4ow14, c4ok8, c4ow15, c4ow16, c4ok9, c4ow17, new C4OW(c67a, "device_timestamp")}, 0, c4omArr, 0, 27);
        System.arraycopy(new C4OM[]{new C4OW(c94754Oe, "dominant_color"), new C4OW(c95124Py, "enable_waist"), new C4OK(C4OO.A00(), FacepileTopLikers.class, "facepile_top_likers", 1191545262), new C4OW(c94894Ou, "fb_like_count"), new C4OW(c94894Ou, "fb_play_count"), new C4OW(c94894Ou, "filter_type"), new C4OK(FundraiserTag.class, "fundraiser_tag", -932643220), new C4OW(c95124Py, "has_audio"), new C4OW(c95124Py, "has_delayed_metadata"), new C4OW(c95124Py, "has_hidden_comments"), new C4OW(c95124Py, "has_liked"), new C4OW(c95124Py, "has_more_comments"), new C4OW(c95124Py, "has_reshares"), new C4OW(c94894Ou, "has_shared_to_fb"), new C4OW(c95124Py, "has_viewer_saved"), new C4OW(c95124Py, "hide_view_all_comment_entrypoint"), AbstractC58320PtC.A0P(c94754Oe), new C4OW(c95124Py, "ig_media_sharing_disabled"), new C4OK(IgtvSeriesInfo.class, "igtv_series_info", -1425622768), new C4OK(IgtvShoppingInfo.class, "igtv_shopping_info", 373545021), new C4OK(ImageVersions2.class, "image_versions2", 761365765), new C4OK(C4OO.A00(), InvitedCoauthorProducers.class, "invited_coauthor_producers", 1522785089), new C4OW(c95124Py, "is_artist_pick"), new C4OW(c95124Py, "is_comments_gif_composer_enabled"), new C4OW(c95124Py, "is_currently_promoting_by_sponsor"), new C4OW(c94894Ou, "is_dash_eligible"), new C4OW(c95124Py, "is_fb_only")}, 0, c4omArr, 27, 27);
        C4OW c4ow18 = new C4OW(c95124Py, "is_in_profile_grid");
        C4OW c4ow19 = new C4OW(c95124Py, "is_internal_only");
        C4OW c4ow20 = new C4OW(c95124Py, "is_organic_product_tagging_eligible");
        C4OW c4ow21 = new C4OW(c95124Py, "is_paid_partnership");
        C4OW c4ow22 = new C4OW(c95124Py, "is_post_live");
        C4OW c4ow23 = new C4OW(c95124Py, "is_third_party_downloads_eligible");
        C4OW c4ow24 = new C4OW(c95124Py, "is_unified_video");
        C4OW c4ow25 = new C4OW(c95124Py, "is_visual_reply_commenter_notice_enabled");
        C173847oc c173847oc = C173847oc.A00;
        System.arraycopy(new C4OM[]{c4ow18, c4ow19, c4ow20, c4ow21, c4ow22, c4ow23, c4ow24, c4ow25, new C4OW(c173847oc, "lat"), new C4OW(c95124Py, "like_and_view_counts_disabled"), new C4OW(c94894Ou, "like_count"), new C4OW(c173847oc, "lng"), new C4OK(Location.class, "location", -179372203), new C4OW(c94754Oe, "logging_info_token"), new C4OK(MashupInfo.class, "mashup_info", -881217032), new C4OK(MediaAppreciationSettings.class, "media_appreciation_settings", -752317743), new C4OK(MediaCroppingInfo.class, "media_cropping_info", 1799661485), new C4OK(MediaNotice.class, "media_notice", 1440148420), new C4OK(MediaOverlayInfo.class, "media_overlay_info", 1622059795), new C4OW(c94894Ou, "media_type"), new C4OK(MusicMetadata.class, "music_metadata", 834659846), new C4OW(c94754Oe, "next_max_id"), new C4OW(c94894Ou, "number_of_qualities"), new C4OK(OrganicCtaInfo.class, "organic_cta_info", 1072429620), new C4OW(c94754Oe, "organic_cta_type"), new C4OW(c94754Oe, "organic_tracking_token"), new C4OW(c94894Ou, "original_height")}, 0, c4omArr, 54, 27);
        System.arraycopy(new C4OM[]{new C4OW(c95124Py, "original_media_has_visual_reply_media"), new C4OW(c94894Ou, "original_width"), new C4OW(c95124Py, "photo_of_you"), new C4OW(c94894Ou, "play_count"), new C4OW(c94754Oe, "preview"), new C4OK(ProductTags.class, "product_tags", 528440028), new C4OW(c94754Oe, "product_type"), new C4OW(c95124Py, "profile_grid_control_enabled"), new C4OW(c94894Ou, "reshare_count"), new C4OK(C4OO.A00(), Senders.class, "senders", 1823249918), new C4OK(SharingFrictionInfo.class, "sharing_friction_info", -971875588), new C4OW(c94754Oe, "shop_routing_user_id"), new C4OK(C4OO.A00(), SocialContext.class, "social_context", 1950405335), new C4OK(C4OO.A00(), SponsorTags.class, "sponsor_tags", -685622952), new C4OK(C4OO.A00(), StoryPolls.class, "story_polls", -527904654), new C4OK(C4OO.A00(), StorySliders.class, "story_sliders", -777735069), new C4OW(c95124Py, "subscribe_cta_visible"), new C4OW(c94754Oe, "subscription_media_visibility"), new C4OW(c67a, "taken_at"), AbstractC58319PtB.A0L(c94754Oe), new C4OK(UpcomingEvent.class, "upcoming_event", 383191972), new C4OK(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -892337361), new C4OK(Usertags.class, "usertags", -617248319), new C4OW(c94754Oe, "video_codec"), new C4OW(c94754Oe, "video_dash_manifest"), new C4OW(c173847oc, "video_duration"), new C4OW(c173847oc, "video_subtitles_confidence")}, 0, c4omArr, 81, 27);
        return AbstractC58321PtD.A0Z(new C4OM[]{new C4OW(c94754Oe, "video_subtitles_uri"), new C4OK(C4OO.A00(), VideoVersions.class, "video_versions", -1292252653), new C4OW(c94894Ou, "view_count"), new C4OW(c94894Ou, "view_state_item_type"), new C4OK(C4OO.A00(), VisualCommentReplyStickerInfo.class, "visual_comment_reply_sticker_info", 827870414), new C4OK(VisualRepliesInfo.class, "visual_replies_info", -1718272272), new C4OW(c94754Oe, "xpost_deny_reason"), new C4OW(C94754Oe.A00(), "top_likers")}, c4omArr, 0, 108, 8);
    }

    public IGCreatorInspirationHubMediaFragmentImpl() {
        super(-1290013599);
    }
}
