package com.instagram.reels.api;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31175DnJ;
import X.AbstractC31198Dnh;
import X.AbstractC58317Pt9;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.AbstractC58324PtG;
import X.AbstractC65703TsZ;
import X.C173847oc;
import X.C2JS;
import X.C2JT;
import X.C4OK;
import X.C4OM;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C67A;
import X.C94754Oe;
import X.C94774Oi;
import X.C94894Ou;
import X.C95124Py;
import X.MSV;
import com.facebook.location.platform.api.Location;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* loaded from: classes11.dex */
public final class BroadcastFragmentImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class BroadcastOwner extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class FriendshipStatus extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58324PtG.A0K(C95124Py.A00);
            }

            public FriendshipStatus() {
                super(43595680);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C4OK A0M = AbstractC58322PtE.A0M(FriendshipStatus.class, 43595680);
            C94754Oe c94754Oe = C94754Oe.A00;
            C4OW A0E = AbstractC58319PtB.A0E(c94754Oe);
            C95124Py c95124Py = C95124Py.A00;
            return AbstractC166987dD.A0k(new C4OM[]{A0M, A0E, AbstractC58322PtE.A0T(c95124Py), AbstractC58321PtD.A0R(c94754Oe), AbstractC58319PtB.A0O(c95124Py), AbstractC58319PtB.A0P(c95124Py), AbstractC166987dD.A0i(c94754Oe, "live_broadcast_id"), AbstractC166987dD.A0i(C94894Ou.A00, "live_broadcast_visibility"), AbstractC166987dD.A0i(c94754Oe, "live_subscription_status"), AbstractC58319PtB.A0H(c94754Oe), AbstractC58319PtB.A0K(c94754Oe), AbstractC58319PtB.A0Q(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC58319PtB.A0G(c94754Oe)});
        }

        public BroadcastOwner() {
            super(316186354);
        }
    }

    /* loaded from: classes11.dex */
    public final class CharityInfo extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class CharityUser extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class ProfileContextFacepileUsers extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC58324PtG.A0M(C95124Py.A00, c94754Oe, AbstractC58319PtB.A0E(c94754Oe), AbstractC166997dE.A0V(c94754Oe), "is_private");
                }

                public ProfileContextFacepileUsers() {
                    super(1889822976);
                }
            }

            /* loaded from: classes10.dex */
            public final class ProfileContextLinksWithUserIds extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94894Ou c94894Ou = C94894Ou.A00;
                    return AbstractC167017dG.A0X(C94754Oe.A00, AbstractC166987dD.A0i(AbstractC166987dD.A0j(c94894Ou), "end"), AbstractC166987dD.A0i(AbstractC166987dD.A0j(c94894Ou), "start"), AbstractC31198Dnh.A01());
                }

                public ProfileContextLinksWithUserIds() {
                    super(-1387524206);
                }
            }

            /* loaded from: classes10.dex */
            public final class BiographyWithEntities extends C2JS implements C2JT {
                public BiographyWithEntities() {
                    super(-1427899679);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0Z(AbstractC58318PtA.A0Q(), "raw_text");
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OM[] c4omArr = new C4OM[58];
                C94894Ou c94894Ou = C94894Ou.A00;
                C4OW A0i = AbstractC166987dD.A0i(c94894Ou, "account_type");
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW A0i2 = AbstractC166987dD.A0i(c94754Oe, "address_street");
                C4OW A0i3 = AbstractC166987dD.A0i(c94754Oe, "ads_page_id");
                C4OW A0i4 = AbstractC166987dD.A0i(c94754Oe, "ads_page_name");
                C4OW A0i5 = AbstractC166987dD.A0i(c94754Oe, "biography");
                C4OK A0O = AbstractC58318PtA.A0O(BiographyWithEntities.class, "biography_with_entities", -1427899679);
                C4OW A0i6 = AbstractC166987dD.A0i(c94754Oe, "business_contact_method");
                C95124Py c95124Py = C95124Py.A00;
                System.arraycopy(new C4OM[]{A0i, A0i2, A0i3, A0i4, A0i5, A0O, A0i6, AbstractC166987dD.A0i(c95124Py, "can_hide_category"), AbstractC166987dD.A0i(c95124Py, "can_hide_public_contacts"), AbstractC166987dD.A0i(c94754Oe, "category"), AbstractC166987dD.A0i(c94754Oe, "category_id"), AbstractC166987dD.A0i(c94754Oe, "city_id"), AbstractC166987dD.A0i(c94754Oe, "city_name"), AbstractC166987dD.A0i(c94754Oe, "contact_phone_number"), AbstractC166987dD.A0i(c94754Oe, "direct_messaging"), AbstractC166987dD.A0i(c94754Oe, "displayed_action_button_type"), AbstractC166987dD.A0i(c94754Oe, "external_lynx_url"), AbstractC166987dD.A0i(c94754Oe, "external_url"), AbstractC166987dD.A0i(c94754Oe, "fb_page_call_to_action_id"), AbstractC58321PtD.A0V(c94754Oe), AbstractC166987dD.A0i(c94894Ou, "follower_count"), AbstractC166987dD.A0i(c94894Ou, "following_count"), AbstractC58319PtB.A0E(c94754Oe), AbstractC58321PtD.A0T(c95124Py), AbstractC166987dD.A0i(c94754Oe, "instagram_location_id"), AbstractC166987dD.A0i(c95124Py, "is_business"), AbstractC166987dD.A0i(c95124Py, "is_call_to_action_enabled")}, 0, c4omArr, 0, 27);
                C4OW A0i7 = AbstractC166987dD.A0i(c95124Py, "is_category_tappable");
                C4OW A0i8 = AbstractC166987dD.A0i(c95124Py, "is_eligible_for_lead_center");
                C4OW A0i9 = AbstractC166987dD.A0i(c95124Py, "is_eligible_for_smb_support_flow");
                C4OW A0O2 = AbstractC58319PtB.A0O(c95124Py);
                C4OW A0i10 = AbstractC166987dD.A0i(c95124Py, "is_profile_audio_call_enabled");
                C4OW A0P = AbstractC58319PtB.A0P(c95124Py);
                C173847oc c173847oc = C173847oc.A00;
                System.arraycopy(new C4OM[]{A0i7, A0i8, A0i9, A0O2, A0i10, A0P, AbstractC166987dD.A0i(c173847oc, Location.LATITUDE), AbstractC166987dD.A0i(c94754Oe, "lead_details_app_id"), AbstractC166987dD.A0i(c173847oc, "longitude"), AbstractC166987dD.A0i(c94894Ou, "media_count"), AbstractC166987dD.A0i(c94894Ou, "mutual_followers_count"), AbstractC166987dD.A0i(c94754Oe, "page_id"), AbstractC166987dD.A0i(c94754Oe, "page_name"), AbstractC58319PtB.A0H(c94754Oe), AbstractC58319PtB.A0K(c94754Oe), AbstractC166987dD.A0i(c94894Ou, "primary_profile_link_type"), AbstractC166987dD.A0i(c94894Ou, "professional_conversion_suggested_account_type"), AbstractC166987dD.A0i(c94754Oe, "profile_context"), AbstractC166987dD.A0h(C4OO.A00(), ProfileContextFacepileUsers.class, "profile_context_facepile_users", 1889822976), AbstractC166987dD.A0h(C4OO.A00(), ProfileContextLinksWithUserIds.class, "profile_context_links_with_user_ids", -1387524206), AbstractC58318PtA.A0P(c94754Oe), AbstractC166987dD.A0i(c94754Oe, "public_email"), AbstractC166987dD.A0i(c94754Oe, "public_phone_country_code"), AbstractC166987dD.A0i(c94754Oe, "public_phone_number"), AbstractC166987dD.A0i(c95124Py, "should_show_category"), AbstractC166987dD.A0i(c95124Py, "should_show_public_contacts"), AbstractC166987dD.A0i(c95124Py, "show_fb_link_on_profile")}, 0, c4omArr, 27, 27);
                return AbstractC58321PtD.A0Z(new C4OM[]{AbstractC166987dD.A0i(c95124Py, "show_fb_page_link_on_profile"), AbstractC58321PtD.A0S(c94894Ou), AbstractC58319PtB.A0G(c94754Oe), AbstractC166987dD.A0i(c94754Oe, ServerW3CShippingAddressConstants.POSTAL_CODE)}, c4omArr, 0, 54, 4);
            }

            public CharityUser() {
                super(-952963238);
            }
        }

        /* loaded from: classes11.dex */
        public final class ConsumptionSheetConfig extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class DonationAmountConfig extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94894Ou c94894Ou = C94894Ou.A00;
                    return AbstractC58319PtB.A0U(new C4OW(c94894Ou, "default_selected_donation_value"), new C4OW(c94894Ou, "maximum_donation_amount"), new C4OW(c94894Ou, "minimum_donation_amount"), new C4OW(c94894Ou, "prefill_amount"), new C4OW(C94754Oe.A00, "user_currency"));
                }

                public DonationAmountConfig() {
                    super(111170091);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OW c4ow = new C4OW(C95124Py.A00, "can_viewer_donate");
                C4OK c4ok = new C4OK(DonationAmountConfig.class, "donation_amount_config", 111170091);
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC58320PtC.A0U(c94754Oe, c4ow, c4ok, new C4OW(c94754Oe, "donation_url"), "privacy_disclaimer");
            }

            public ConsumptionSheetConfig() {
                super(833636886);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C4OK c4ok = new C4OK(CharityUser.class, "charity_user", -952963238);
            C4OK c4ok2 = new C4OK(ConsumptionSheetConfig.class, "consumption_sheet_config", 833636886);
            C4OW c4ow = new C4OW(C94894Ou.A00, "donations_count");
            C94754Oe c94754Oe = C94754Oe.A00;
            return new C4OU(new C4OM[]{c4ok, c4ok2, c4ow, new C4OW(c94754Oe, "formatted_amount_raised"), new C4OW(c94754Oe, "formatted_amount_raised_of_goal_amount_str"), new C4OW(c94754Oe, "formatted_donations_count"), new C4OW(c94754Oe, "formatted_goal_amount"), new C4OW(c94754Oe, "fundraiser_title"), new C4OW(C67A.A00, "standalone_fundraiser_id")});
        }

        public CharityInfo() {
            super(567359105);
        }
    }

    /* loaded from: classes10.dex */
    public final class Cobroadcasters extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class FriendshipStatus extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C95124Py c95124Py = C95124Py.A00;
                return AbstractC166987dD.A0k(new C4OM[]{AbstractC166987dD.A0i(c95124Py, "followed_by"), AbstractC58321PtD.A0W(c95124Py), AbstractC166987dD.A0i(c95124Py, "incoming_request"), AbstractC58322PtE.A0W(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_feed_favorite"), AbstractC58319PtB.A0O(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_restricted"), AbstractC166987dD.A0i(c95124Py, "is_viewer_unconnected"), AbstractC166987dD.A0i(c95124Py, "outgoing_request")});
            }

            public FriendshipStatus() {
                super(-946539567);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C4OK A0M = AbstractC58322PtE.A0M(FriendshipStatus.class, -946539567);
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC58324PtG.A0L(C95124Py.A00, c94754Oe, A0M, AbstractC58319PtB.A0E(c94754Oe), AbstractC58321PtD.A0R(c94754Oe));
        }

        public Cobroadcasters() {
            super(1138268914);
        }
    }

    /* loaded from: classes11.dex */
    public final class DimensionsTyped extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94894Ou c94894Ou = C94894Ou.A00;
            return AbstractC167017dG.A0Y(new C94774Oi(c94894Ou), AbstractC65703TsZ.A0L(c94894Ou), IgReactMediaPickerNativeModule.WIDTH);
        }

        public DimensionsTyped() {
            super(765990647);
        }
    }

    /* loaded from: classes10.dex */
    public final class SponsorTags extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class Sponsor extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class FriendshipStatus extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0Z(C95124Py.A00, "following");
                }

                public FriendshipStatus() {
                    super(1137972859);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OK A0M = AbstractC58322PtE.A0M(FriendshipStatus.class, 1137972859);
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC58324PtG.A0M(C95124Py.A00, c94754Oe, A0M, AbstractC58319PtB.A0E(c94754Oe), "is_private");
            }

            public Sponsor() {
                super(-715917202);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C4OW A0i = AbstractC166987dD.A0i(C95124Py.A00, "permission");
            C4OK A0h = AbstractC166987dD.A0h(C4OO.A01(), Sponsor.class, "sponsor", -715917202);
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC58320PtC.A0U(c94754Oe, A0i, A0h, AbstractC166987dD.A0i(c94754Oe, "sponsor_id"), AbstractC31198Dnh.A01());
        }

        public SponsorTags() {
            super(-1069294587);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C4OM[] c4omArr = new C4OM[32];
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW c4ow = new C4OW(c94754Oe, "broadcast_message");
        C4OK c4ok = new C4OK(BroadcastOwner.class, "broadcast_owner", 316186354);
        C4OW c4ow2 = new C4OW(c94754Oe, AbstractC111324zv.A00(769));
        C4OW c4ow3 = new C4OW(c94754Oe, "broadcast_status");
        C4OK c4ok2 = new C4OK(CharityInfo.class, "charity_info", 567359105);
        C4OK c4ok3 = new C4OK(C4OO.A00(), Cobroadcasters.class, "cobroadcasters", 1138268914);
        C4OW c4ow4 = new C4OW(c94754Oe, "cover_frame_url");
        C4OW c4ow5 = new C4OW(c94754Oe, AbstractC111324zv.A00(202));
        C4OW c4ow6 = new C4OW(c94754Oe, "dash_playback_url");
        C4OK c4ok4 = new C4OK(DimensionsTyped.class, AbstractC111324zv.A00(873), 765990647);
        C95124Py c95124Py = C95124Py.A00;
        C4OW c4ow7 = new C4OW(c95124Py, MSV.A00(47));
        C4OW c4ow8 = new C4OW(c95124Py, "hide_from_feed_unit");
        C67A c67a = C67A.A00;
        C4OW A0V = AbstractC166997dE.A0V(c67a);
        C4OW c4ow9 = new C4OW(c95124Py, AbstractC111324zv.A00(225));
        C4OW c4ow10 = new C4OW(c95124Py, AbstractC111324zv.A00(1048));
        C4OW c4ow11 = new C4OW(c95124Py, AbstractC111324zv.A00(1049));
        C94894Ou c94894Ou = C94894Ou.A00;
        boolean A1b = AbstractC31175DnJ.A1b(new C4OM[]{c4ow, c4ok, c4ow2, c4ow3, c4ok2, c4ok3, c4ow4, c4ow5, c4ow6, c4ok4, c4ow7, c4ow8, A0V, c4ow9, c4ow10, c4ow11, new C4OW(c94894Ou, AbstractC111324zv.A00(227)), new C4OW(c95124Py, MSV.A00(55)), new C4OW(c67a, AbstractC111324zv.A00(1081)), new C4OW(c94754Oe, "media_id"), new C4OW(c95124Py, "muted"), new C4OW(c94754Oe, "organic_tracking_token"), new C4OW(c94894Ou, "published_time"), new C4OW(c94894Ou, "question_pk"), new C4OW(c94894Ou, AbstractC111324zv.A00(510)), new C4OW(c67a, AbstractC58317Pt9.A00(130)), new C4OW(c94894Ou, AbstractC58317Pt9.A00(366))}, c4omArr);
        C4OK c4ok5 = new C4OK(C4OO.A00(), SponsorTags.class, "sponsor_tags", -1069294587);
        C4OW c4ow12 = new C4OW(c95124Py, "sup_active");
        C173847oc c173847oc = C173847oc.A00;
        return AbstractC58321PtD.A0Z(new C4OM[]{c4ok5, c4ow12, new C4OW(c173847oc, "video_duration"), new C4OW(c173847oc, "viewer_count"), new C4OW(c94894Ou, "visibility")}, c4omArr, A1b ? 1 : 0, 27, 5);
    }

    public BroadcastFragmentImpl() {
        super(1811615736);
    }
}
