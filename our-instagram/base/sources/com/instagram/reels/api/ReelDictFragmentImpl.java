package com.instagram.reels.api;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31175DnJ;
import X.AbstractC31198Dnh;
import X.AbstractC43591JPw;
import X.AbstractC58317Pt9;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.AbstractC58324PtG;
import X.AbstractC65703TsZ;
import X.AbstractC65704Tsa;
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
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes10.dex */
public final class ReelDictFragmentImpl extends C2JS implements C2JT {

    /* loaded from: classes11.dex */
    public final class Broadcast extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class BroadcastOwner extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class FriendshipStatus extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC58324PtG.A0K(C95124Py.A00);
                }

                public FriendshipStatus() {
                    super(-104084263);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OK A0M = AbstractC58322PtE.A0M(FriendshipStatus.class, -104084263);
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW A0E = AbstractC58319PtB.A0E(c94754Oe);
                C4OW A0R = AbstractC58321PtD.A0R(c94754Oe);
                C95124Py c95124Py = C95124Py.A00;
                return AbstractC166987dD.A0k(new C4OM[]{A0M, A0E, A0R, AbstractC58319PtB.A0O(c95124Py), AbstractC58319PtB.A0P(c95124Py), AbstractC166987dD.A0i(c94754Oe, "live_broadcast_id"), AbstractC166987dD.A0i(C94894Ou.A00, "live_broadcast_visibility"), AbstractC166987dD.A0i(c94754Oe, "live_subscription_status"), AbstractC58319PtB.A0H(c94754Oe), AbstractC58319PtB.A0K(c94754Oe), AbstractC58319PtB.A0Q(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC58319PtB.A0G(c94754Oe)});
            }

            public BroadcastOwner() {
                super(352478546);
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
                        super(-1383456762);
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
                        super(519578026);
                    }
                }

                /* loaded from: classes10.dex */
                public final class BiographyWithEntities extends C2JS implements C2JT {
                    public BiographyWithEntities() {
                        super(-1723951537);
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
                    C4OK A0O = AbstractC58318PtA.A0O(BiographyWithEntities.class, "biography_with_entities", -1723951537);
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
                    System.arraycopy(new C4OM[]{A0i7, A0i8, A0i9, A0O2, A0i10, A0P, AbstractC166987dD.A0i(c173847oc, Location.LATITUDE), AbstractC166987dD.A0i(c94754Oe, "lead_details_app_id"), AbstractC166987dD.A0i(c173847oc, "longitude"), AbstractC166987dD.A0i(c94894Ou, "media_count"), AbstractC166987dD.A0i(c94894Ou, "mutual_followers_count"), AbstractC166987dD.A0i(c94754Oe, "page_id"), AbstractC166987dD.A0i(c94754Oe, "page_name"), AbstractC58319PtB.A0H(c94754Oe), AbstractC58319PtB.A0K(c94754Oe), AbstractC166987dD.A0i(c94894Ou, "primary_profile_link_type"), AbstractC166987dD.A0i(c94894Ou, "professional_conversion_suggested_account_type"), AbstractC166987dD.A0i(c94754Oe, "profile_context"), AbstractC166987dD.A0h(C4OO.A00(), ProfileContextFacepileUsers.class, "profile_context_facepile_users", -1383456762), AbstractC166987dD.A0h(C4OO.A00(), ProfileContextLinksWithUserIds.class, "profile_context_links_with_user_ids", 519578026), AbstractC58318PtA.A0P(c94754Oe), AbstractC166987dD.A0i(c94754Oe, "public_email"), AbstractC166987dD.A0i(c94754Oe, "public_phone_country_code"), AbstractC166987dD.A0i(c94754Oe, "public_phone_number"), AbstractC166987dD.A0i(c95124Py, "should_show_category"), AbstractC166987dD.A0i(c95124Py, "should_show_public_contacts"), AbstractC166987dD.A0i(c95124Py, "show_fb_link_on_profile")}, 0, c4omArr, 27, 27);
                    return AbstractC58321PtD.A0Z(new C4OM[]{AbstractC166987dD.A0i(c95124Py, "show_fb_page_link_on_profile"), AbstractC58321PtD.A0S(c94894Ou), AbstractC58319PtB.A0G(c94754Oe), AbstractC166987dD.A0i(c94754Oe, ServerW3CShippingAddressConstants.POSTAL_CODE)}, c4omArr, 0, 54, 4);
                }

                public CharityUser() {
                    super(-1476001275);
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
                        super(480398586);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C4OW c4ow = new C4OW(C95124Py.A00, "can_viewer_donate");
                    C4OK c4ok = new C4OK(DonationAmountConfig.class, "donation_amount_config", 480398586);
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC58320PtC.A0U(c94754Oe, c4ow, c4ok, new C4OW(c94754Oe, "donation_url"), "privacy_disclaimer");
                }

                public ConsumptionSheetConfig() {
                    super(-1250465070);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OK c4ok = new C4OK(CharityUser.class, "charity_user", -1476001275);
                C4OK c4ok2 = new C4OK(ConsumptionSheetConfig.class, "consumption_sheet_config", -1250465070);
                C4OW c4ow = new C4OW(C94894Ou.A00, "donations_count");
                C94754Oe c94754Oe = C94754Oe.A00;
                return new C4OU(new C4OM[]{c4ok, c4ok2, c4ow, new C4OW(c94754Oe, "formatted_amount_raised"), new C4OW(c94754Oe, "formatted_amount_raised_of_goal_amount_str"), new C4OW(c94754Oe, "formatted_donations_count"), new C4OW(c94754Oe, "formatted_goal_amount"), new C4OW(c94754Oe, "fundraiser_title"), new C4OW(C67A.A00, "standalone_fundraiser_id")});
            }

            public CharityInfo() {
                super(-1436190821);
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
                    super(-2063363395);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OK A0M = AbstractC58322PtE.A0M(FriendshipStatus.class, -2063363395);
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC58324PtG.A0L(C95124Py.A00, c94754Oe, A0M, AbstractC58319PtB.A0E(c94754Oe), AbstractC58321PtD.A0R(c94754Oe));
            }

            public Cobroadcasters() {
                super(792071924);
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
                super(-1689621017);
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
                        super(1511530499);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C4OK A0M = AbstractC58322PtE.A0M(FriendshipStatus.class, 1511530499);
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC58324PtG.A0M(C95124Py.A00, c94754Oe, A0M, AbstractC58319PtB.A0E(c94754Oe), "is_private");
                }

                public Sponsor() {
                    super(1191525572);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OW A0i = AbstractC166987dD.A0i(C95124Py.A00, "permission");
                C4OK A0h = AbstractC166987dD.A0h(C4OO.A01(), Sponsor.class, "sponsor", 1191525572);
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC58320PtC.A0U(c94754Oe, A0i, A0h, AbstractC166987dD.A0i(c94754Oe, "sponsor_id"), AbstractC31198Dnh.A01());
            }

            public SponsorTags() {
                super(-752856442);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C4OM[] c4omArr = new C4OM[32];
            C94754Oe c94754Oe = C94754Oe.A00;
            C4OW c4ow = new C4OW(c94754Oe, "broadcast_message");
            C4OK c4ok = new C4OK(BroadcastOwner.class, "broadcast_owner", 352478546);
            C4OW c4ow2 = new C4OW(c94754Oe, AbstractC111324zv.A00(769));
            C4OW c4ow3 = new C4OW(c94754Oe, "broadcast_status");
            C4OK c4ok2 = new C4OK(CharityInfo.class, "charity_info", -1436190821);
            C4OK c4ok3 = new C4OK(C4OO.A00(), Cobroadcasters.class, "cobroadcasters", 792071924);
            C4OW c4ow4 = new C4OW(c94754Oe, "cover_frame_url");
            C4OW c4ow5 = new C4OW(c94754Oe, AbstractC111324zv.A00(202));
            C4OW c4ow6 = new C4OW(c94754Oe, "dash_playback_url");
            C4OK c4ok4 = new C4OK(DimensionsTyped.class, AbstractC111324zv.A00(873), -1689621017);
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
            C4OK c4ok5 = new C4OK(C4OO.A00(), SponsorTags.class, "sponsor_tags", -752856442);
            C4OW c4ow12 = new C4OW(c95124Py, "sup_active");
            C173847oc c173847oc = C173847oc.A00;
            return AbstractC58321PtD.A0Z(new C4OM[]{c4ok5, c4ow12, new C4OW(c173847oc, "video_duration"), new C4OW(c173847oc, "viewer_count"), new C4OW(c94894Ou, "visibility")}, c4omArr, A1b ? 1 : 0, 27, 5);
        }

        public Broadcast() {
            super(-1287870522);
        }
    }

    /* loaded from: classes10.dex */
    public final class HypeCommenterList extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC167017dG.A0Y(c94754Oe, AbstractC58319PtB.A0H(c94754Oe), "profile_pic_url");
        }

        public HypeCommenterList() {
            super(-431464446);
        }
    }

    /* loaded from: classes11.dex */
    public final class Items extends C2JS implements C2JT {

        /* loaded from: classes11.dex */
        public final class AvatarStickers extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class AuthorAvatarSticker extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC58319PtB.A0U(new C4OW(c94754Oe, "accessibility_label"), new C4OW(c94754Oe, AbstractC111324zv.A00(98)), new C4OW(c94754Oe, AbstractC111324zv.A00(864)), new C4OW(C95124Py.A00, "has_avatar"), new C4OW(c94754Oe, "media_type"));
                }

                public AuthorAvatarSticker() {
                    super(34471897);
                }
            }

            /* loaded from: classes11.dex */
            public final class ViewerAvatarSticker extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC58319PtB.A0U(new C4OW(c94754Oe, "accessibility_label"), new C4OW(c94754Oe, AbstractC111324zv.A00(98)), new C4OW(c94754Oe, AbstractC111324zv.A00(864)), new C4OW(C95124Py.A00, "has_avatar"), new C4OW(c94754Oe, "media_type"));
                }

                public ViewerAvatarSticker() {
                    super(-461730718);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OK c4ok = new C4OK(AuthorAvatarSticker.class, AbstractC111324zv.A00(1959), 34471897);
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW c4ow = new C4OW(c94754Oe, AbstractC111324zv.A00(175));
                C173847oc c173847oc = C173847oc.A00;
                C4OW c4ow2 = new C4OW(c173847oc, "end_time_ms");
                C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{c4ok, c4ow, c4ow2, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OW(c173847oc, "rotation"), new C4OW(c173847oc, "start_time_ms"), new C4OW(c94754Oe, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID), new C4OK(ViewerAvatarSticker.class, AbstractC111324zv.A00(3304), -461730718), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
            }

            public AvatarStickers() {
                super(1430707362);
            }
        }

        /* loaded from: classes11.dex */
        public final class Caption extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class User extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    C4OW A0V = AbstractC58321PtD.A0V(c94754Oe);
                    C4OW A0E = AbstractC58319PtB.A0E(c94754Oe);
                    C95124Py c95124Py = C95124Py.A00;
                    return AbstractC166987dD.A0k(new C4OM[]{A0V, A0E, AbstractC58322PtE.A0T(c95124Py), AbstractC166997dE.A0V(c94754Oe), AbstractC58319PtB.A0O(c95124Py), AbstractC58319PtB.A0P(c95124Py), AbstractC58319PtB.A0H(c94754Oe), AbstractC58319PtB.A0K(c94754Oe), AbstractC58319PtB.A0Q(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC58319PtB.A0G(c94754Oe)});
                }

                public User() {
                    super(1594490624);
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
                return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, c4ow4, new C4OW(c95124Py, "did_report_as_spam"), new C4OW(c95124Py, "has_translation"), new C4OW(c95124Py, "is_covered"), new C4OW(c95124Py, "is_ranked_comment"), new C4OW(c94754Oe, "media_id"), AbstractC58320PtC.A0Q(c94754Oe), new C4OW(c94894Ou, "private_reply_status"), new C4OW(c95124Py, "share_enabled"), new C4OW(c94754Oe, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS), AbstractC58319PtB.A0C(c94754Oe), AbstractC58319PtB.A0J(c94894Ou), new C4OK(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 1594490624), new C4OW(c94754Oe, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID)});
            }

            public Caption() {
                super(1738176537);
            }
        }

        /* loaded from: classes11.dex */
        public final class CreateModeAttribution extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC167017dG.A0Y(c94754Oe, AbstractC58321PtD.A0U(c94754Oe), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            }

            public CreateModeAttribution() {
                super(553993658);
            }
        }

        /* loaded from: classes11.dex */
        public final class CreativeConfig extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class AttributionUser extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class ProfilePicture extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0Z(C94754Oe.A00, "uri");
                    }

                    public ProfilePicture() {
                        super(1086316257);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC58320PtC.A0U(c94754Oe, AbstractC166997dE.A0V(c94754Oe), AbstractC166987dD.A0i(c94754Oe, "instagram_user_id"), AbstractC58318PtA.A0O(ProfilePicture.class, "profile_picture", 1086316257), AbstractC31198Dnh.A01());
                }

                public AttributionUser() {
                    super(-869327792);
                }
            }

            /* loaded from: classes11.dex */
            public final class EffectPreview extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class AttributionUser extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class ProfilePicture extends C2JS implements C2JT {
                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0Z(C94754Oe.A00, "uri");
                        }

                        public ProfilePicture() {
                            super(2021721948);
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C94754Oe c94754Oe = C94754Oe.A00;
                        return AbstractC167017dG.A0X(c94754Oe, AbstractC166987dD.A0i(c94754Oe, "instagram_user_id"), AbstractC58318PtA.A0O(ProfilePicture.class, "profile_picture", 2021721948), AbstractC31198Dnh.A01());
                    }

                    public AttributionUser() {
                        super(-1732906056);
                    }
                }

                /* loaded from: classes11.dex */
                public final class ThumbnailImage extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0Z(C94754Oe.A00, "uri");
                    }

                    public ThumbnailImage() {
                        super(380471457);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C4OK c4ok = new C4OK(C4OO.A01(), AttributionUser.class, "attribution_user", -1732906056);
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return new C4OU(new C4OM[]{c4ok, new C4OW(new C94774Oi(c94754Oe), "attribution_user_id"), AbstractC58320PtC.A0P(c94754Oe), new C4OW(C95124Py.A00, "is_age_restricted"), AbstractC65703TsZ.A0K(c94754Oe), new C4OW(new C94774Oi(c94754Oe), "save_status"), new C4OK(ThumbnailImage.class, "thumbnail_image", 380471457)});
                }

                public EffectPreview() {
                    super(-661650572);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OK c4ok = new C4OK(AttributionUser.class, "attribution_user", -869327792);
                C94754Oe c94754Oe = C94754Oe.A00;
                return new C4OU(new C4OM[]{c4ok, new C4OW(c94754Oe, "attribution_user_id"), new C4OW(c94754Oe, "camera_facing"), new C4OW(c94754Oe, "capture_type"), new C4OK(EffectPreview.class, AbstractC111324zv.A00(4356), -661650572), new C4OW(c94754Oe, MSV.A00(1158)), new C4OW(c94754Oe, AbstractC111324zv.A00(405)), new C4OW(c94754Oe, TraceFieldType.FailureReason), new C4OW(c94754Oe, MSV.A00(1192)), new C4OW(c94754Oe, "persisted_effect_metadata_json"), new C4OW(C95124Py.A00, "should_render_try_it_on")});
            }

            public CreativeConfig() {
                super(-1412038795);
            }
        }

        /* loaded from: classes11.dex */
        public final class CutoutStickers extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class StickerCreator extends C2JS implements C2JT {
                public StickerCreator() {
                    super(640653028);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C4OW A0P = AbstractC58319PtB.A0P(AbstractC58319PtB.A0S());
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC167017dG.A0X(AbstractC166987dD.A0j(c94754Oe), A0P, AbstractC58318PtA.A0P(c94754Oe), AbstractC31198Dnh.A01());
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW A0P = AbstractC58320PtC.A0P(c94754Oe);
                C94894Ou c94894Ou = C94894Ou.A00;
                C4OW c4ow = new C4OW(c94894Ou, "image_height");
                C4OW c4ow2 = new C4OW(c94894Ou, "image_width");
                C95124Py c95124Py = C95124Py.A00;
                return new C4OU(new C4OM[]{A0P, c4ow, c4ow2, new C4OW(new C94774Oi(c95124Py), AbstractC111324zv.A00(1062)), new C4OW(c95124Py, AbstractC111324zv.A00(457)), new C4OW(new C94774Oi(c94754Oe), "media_url"), new C4OK(StickerCreator.class, AbstractC111324zv.A00(1276), 640653028), new C4OW(c94754Oe, AbstractC111324zv.A00(1277)), new C4OW(new C94774Oi(c94754Oe), "sticker_type")});
            }

            public CutoutStickers() {
                super(541101271);
            }
        }

        /* loaded from: classes11.dex */
        public final class FundraiserTag extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Z(C95124Py.A00, "has_standalone_fundraiser");
            }

            public FundraiserTag() {
                super(-1168266768);
            }
        }

        /* loaded from: classes11.dex */
        public final class HighlightsInfo extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class AddedTo extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC167017dG.A0Y(c94754Oe, new C4OW(c94754Oe, "reel_id"), DialogModule.KEY_TITLE);
                }

                public AddedTo() {
                    super(798626745);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0W(C4OO.A00(), AddedTo.class, "added_to", 798626745);
            }

            public HighlightsInfo() {
                super(2008070795);
            }
        }

        /* loaded from: classes10.dex */
        public final class ImageVersions2 extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class Candidates extends C2JS implements C2JT {
                public Candidates() {
                    super(-1792090534);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC58323PtF.A0R();
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0W(C4OO.A00(), Candidates.class, "candidates", -1792090534);
            }

            public ImageVersions2() {
                super(1160869604);
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
                super(66513659);
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
                super(-1028618178);
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
                        super(-549312618);
                    }
                }

                /* loaded from: classes11.dex */
                public final class Icon extends C2JS implements C2JT {
                    public Icon() {
                        super(-1085172641);
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
                    return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, new C4OW(c95124Py, "has_chevron"), new C4OK(Icon.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, -1085172641), new C4OW(c95124Py, "is_text_centered"), AbstractC58319PtB.A0C(c94754Oe), new C4OK(TextColor.class, "text_color", -549312618)});
                }

                public Buttons() {
                    super(-413400341);
                }
            }

            /* loaded from: classes11.dex */
            public final class Icon extends C2JS implements C2JT {
                public Icon() {
                    super(2035147208);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC65703TsZ.A0x();
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OK c4ok = new C4OK(C4OO.A00(), Buttons.class, "buttons", -413400341);
                C94754Oe c94754Oe = C94754Oe.A00;
                return new C4OU(new C4OM[]{c4ok, AbstractC58322PtE.A0Y(c94754Oe), new C4OK(Icon.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, 2035147208), new C4OW(C94894Ou.A00, "overlay_layout"), new C4OW(c94754Oe, "overlay_type"), new C4OW(c94754Oe, AbstractC31198Dnh.A00()), new C4OW(c94754Oe, "sub_category"), AbstractC58319PtB.A0L(c94754Oe)});
            }

            public MediaOverlayInfo() {
                super(1074865333);
            }
        }

        /* loaded from: classes11.dex */
        public final class MessageShare extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class JoinChatSticker extends C2JS implements C2JT {

                /* loaded from: classes11.dex */
                public final class PartialRenderInfo extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C94754Oe c94754Oe = C94754Oe.A00;
                        C4OW c4ow = new C4OW(c94754Oe, "background_color_hex");
                        C173847oc c173847oc = C173847oc.A00;
                        return new C4OU(new C4OM[]{c4ow, new C4OW(c173847oc, "button_height_pct"), new C4OW(c173847oc, "button_x"), new C4OW(c173847oc, "button_y"), new C4OW(C95124Py.A00, "is_dark_mode"), new C4OW(c173847oc, "label_height_pct"), new C4OW(c173847oc, "label_width_pct"), new C4OW(c173847oc, "padding_pct"), new C4OW(c94754Oe, "text_color_hex")});
                    }

                    public PartialRenderInfo() {
                        super(964974663);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94894Ou c94894Ou = C94894Ou.A00;
                    C4OW c4ow = new C4OW(c94894Ou, "active_member_count");
                    C4OW c4ow2 = new C4OW(c94894Ou, "audience_type");
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return new C4OU(new C4OM[]{c4ow, c4ow2, new C4OW(c94754Oe, "chat_type"), new C4OW(c94894Ou, "connected_member_count"), new C4OW(c94754Oe, "group_image_uri"), new C4OW(c94894Ou, "member_count"), new C4OW(c94754Oe, "member_status"), new C4OK(PartialRenderInfo.class, "partial_render_info", 964974663), new C4OW(c94754Oe, "sticker_type"), new C4OW(c94754Oe, "story_chat_id"), new C4OW(c94754Oe, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID), AbstractC58319PtB.A0L(c94754Oe)});
                }

                public JoinChatSticker() {
                    super(-169915905);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                C4OW c4ow = new C4OW(c173847oc, "end_time_ms");
                C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{c4ow, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OK(JoinChatSticker.class, "join_chat_sticker", -169915905), new C4OW(c173847oc, "rotation"), new C4OW(c173847oc, "start_time_ms"), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
            }

            public MessageShare() {
                super(-723637346);
            }
        }

        /* loaded from: classes11.dex */
        public final class Owner extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Y(C94754Oe.A00, new C4OW(C95124Py.A00, "is_private"), "pk");
            }

            public Owner() {
                super(-479067746);
            }
        }

        /* loaded from: classes11.dex */
        public final class PreviewComments extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class User extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC58324PtG.A0L(C95124Py.A00, c94754Oe, AbstractC58321PtD.A0V(c94754Oe), AbstractC58319PtB.A0E(c94754Oe), AbstractC166997dE.A0V(c94754Oe));
                }

                public User() {
                    super(1928631243);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94894Ou c94894Ou = C94894Ou.A00;
                C4OW c4ow = new C4OW(c94894Ou, "bit_flags");
                C4OW c4ow2 = new C4OW(c94894Ou, "comment_like_count");
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW c4ow3 = new C4OW(c94754Oe, TraceFieldType.ContentType);
                C67A c67a = C67A.A00;
                C4OW c4ow4 = new C4OW(c67a, "created_at");
                C4OW c4ow5 = new C4OW(c67a, "created_at_utc");
                C95124Py c95124Py = C95124Py.A00;
                return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, c4ow4, c4ow5, new C4OW(c95124Py, "did_report_as_spam"), new C4OW(c95124Py, AbstractC111324zv.A00(428)), new C4OW(c95124Py, "is_covered"), new C4OW(c95124Py, "is_ranked_comment"), new C4OW(c94754Oe, "media_id"), AbstractC58320PtC.A0Q(c94754Oe), new C4OW(c94894Ou, "restricted_status"), new C4OW(c95124Py, "share_enabled"), new C4OW(c94754Oe, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS), AbstractC58319PtB.A0C(c94754Oe), AbstractC58319PtB.A0J(c94894Ou), new C4OK(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 1928631243), new C4OW(c94754Oe, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID)});
            }

            public PreviewComments() {
                super(746537752);
            }
        }

        /* loaded from: classes11.dex */
        public final class ReelMentions extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class User extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    C4OW c4ow = new C4OW(c94754Oe, "full_name");
                    C95124Py c95124Py = C95124Py.A00;
                    return AbstractC58324PtG.A0M(c95124Py, c94754Oe, c4ow, new C4OW(c95124Py, "has_onboarded_to_text_post_app"), "is_private");
                }

                public User() {
                    super(-855916344);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OW c4ow = new C4OW(C94754Oe.A00, "display_type");
                C173847oc c173847oc = C173847oc.A00;
                C4OW c4ow2 = new C4OW(c173847oc, "end_time_ms");
                C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{c4ow, c4ow2, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OW(c173847oc, "rotation"), new C4OW(c173847oc, "start_time_ms"), new C4OK(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -855916344), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
            }

            public ReelMentions() {
                super(951731133);
            }
        }

        /* loaded from: classes11.dex */
        public final class ResharedStoryMediaAuthor extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW c4ow = new C4OW(c94754Oe, "full_name");
                C95124Py c95124Py = C95124Py.A00;
                return AbstractC58324PtG.A0M(c95124Py, c94754Oe, c4ow, new C4OW(c95124Py, "has_onboarded_to_text_post_app"), "is_private");
            }

            public ResharedStoryMediaAuthor() {
                super(-414886132);
            }
        }

        /* loaded from: classes11.dex */
        public final class SharingFrictionInfo extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC167017dG.A0X(AbstractC58319PtB.A0S(), new C4OW(c94754Oe, "bloks_app_url"), new C4OW(c94754Oe, AbstractC111324zv.A00(3083)), "should_have_sharing_friction");
            }

            public SharingFrictionInfo() {
                super(-1440033722);
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
                    return AbstractC58324PtG.A0M(c95124Py, c94754Oe, A0E, AbstractC58319PtB.A0O(c95124Py), "is_unpublished");
                }

                public Sponsor() {
                    super(817138476);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C95124Py c95124Py = C95124Py.A00;
                return AbstractC58319PtB.A0T(AbstractC166987dD.A0i(c95124Py, "is_pending"), AbstractC166987dD.A0i(c95124Py, "permission"), AbstractC166987dD.A0h(C4OO.A01(), Sponsor.class, "sponsor", 817138476));
            }

            public SponsorTags() {
                super(-891254607);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryAppAttribution extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return new C4OU(new C4OM[]{new C4OW(c94754Oe, AbstractC43591JPw.A00(66)), new C4OW(c94754Oe, AbstractC43591JPw.A00(67)), new C4OW(c94754Oe, "content_url"), AbstractC166997dE.A0V(c94754Oe), new C4OW(c94754Oe, "link"), AbstractC58321PtD.A0U(c94754Oe), new C4OW(c94754Oe, AbstractC111324zv.A00(255))});
            }

            public StoryAppAttribution() {
                super(-2033629245);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryBloksTappables extends C2JS implements C2JT {

            /* loaded from: classes4.dex */
            public final class BloksTappableSticker extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC166987dD.A0k(new C4OM[]{AbstractC166987dD.A0i(c94754Oe, AbstractC111324zv.A00(3826)), AbstractC166987dD.A0i(c94754Oe, AbstractC111324zv.A00(3836)), AbstractC166987dD.A0i(c94754Oe, "bloks_app"), AbstractC166997dE.A0V(c94754Oe), AbstractC166987dD.A0i(c94754Oe, AbstractC111324zv.A00(5011)), AbstractC166987dD.A0i(C95124Py.A00, AbstractC111324zv.A00(5358)), AbstractC166987dD.A0i(C94894Ou.A00, AbstractC111324zv.A00(5369))});
                }

                public BloksTappableSticker() {
                    super(-130919761);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OK c4ok = new C4OK(BloksTappableSticker.class, AbstractC111324zv.A00(353), -130919761);
                C173847oc c173847oc = C173847oc.A00;
                return AbstractC65704Tsa.A08(c173847oc, c173847oc, c4ok, new C4OW(c173847oc, "end_time_ms"), IgReactMediaPickerNativeModule.HEIGHT);
            }

            public StoryBloksTappables() {
                super(1325027243);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryChats extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class JoinChatSticker extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94894Ou c94894Ou = C94894Ou.A00;
                    C4OW c4ow = new C4OW(c94894Ou, "active_member_count");
                    C4OW c4ow2 = new C4OW(c94894Ou, "audience_type");
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return new C4OU(new C4OM[]{c4ow, c4ow2, new C4OW(c94754Oe, "chat_type"), new C4OW(c94894Ou, "connected_member_count"), new C4OW(c94754Oe, "group_image_uri"), new C4OW(c94894Ou, "member_count"), new C4OW(c94754Oe, "member_status"), new C4OW(c94754Oe, "sticker_type"), new C4OW(c94754Oe, "story_chat_id"), new C4OW(c94754Oe, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID), AbstractC58319PtB.A0L(c94754Oe)});
                }

                public JoinChatSticker() {
                    super(190256903);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                C4OW c4ow = new C4OW(c173847oc, "end_time_ms");
                C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{c4ow, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OK(JoinChatSticker.class, "join_chat_sticker", 190256903), new C4OW(c173847oc, "rotation"), new C4OW(c173847oc, "start_time_ms"), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
            }

            public StoryChats() {
                super(-183260748);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryComments extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class User extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    C4OW A0V = AbstractC58321PtD.A0V(c94754Oe);
                    C4OW A0E = AbstractC58319PtB.A0E(c94754Oe);
                    C4OW A0V2 = AbstractC166997dE.A0V(c94754Oe);
                    C95124Py c95124Py = C95124Py.A00;
                    C4OW A0i = AbstractC166987dD.A0i(c95124Py, "is_mentionable");
                    C4OW A0O = AbstractC58319PtB.A0O(c95124Py);
                    C4OW A0P = AbstractC58319PtB.A0P(c95124Py);
                    C67A c67a = C67A.A00;
                    return AbstractC166987dD.A0k(new C4OM[]{A0V, A0E, A0V2, A0i, A0O, A0P, AbstractC166987dD.A0i(c67a, "latest_besties_reel_media"), AbstractC166987dD.A0i(c67a, "latest_reel_media"), AbstractC58319PtB.A0H(c94754Oe), AbstractC58319PtB.A0K(c94754Oe), AbstractC58319PtB.A0Q(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC58319PtB.A0G(c94754Oe)});
                }

                public User() {
                    super(1941640338);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94894Ou c94894Ou = C94894Ou.A00;
                C4OW c4ow = new C4OW(c94894Ou, "bit_flags");
                C4OW c4ow2 = new C4OW(c94894Ou, "comment_like_count");
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW c4ow3 = new C4OW(c94754Oe, TraceFieldType.ContentType);
                C67A c67a = C67A.A00;
                C4OW c4ow4 = new C4OW(c67a, "created_at");
                C4OW c4ow5 = new C4OW(c67a, "created_at_utc");
                C95124Py c95124Py = C95124Py.A00;
                return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, c4ow4, c4ow5, new C4OW(c95124Py, "did_report_as_spam"), new C4OW(c95124Py, AbstractC111324zv.A00(428)), new C4OW(c95124Py, "has_translation"), new C4OW(c94754Oe, "inline_composer_display_condition"), new C4OW(c95124Py, "is_covered"), new C4OW(c95124Py, "is_ranked_comment"), new C4OW(c94754Oe, "media_id"), AbstractC58320PtC.A0Q(c94754Oe), new C4OW(c94894Ou, "private_reply_status"), new C4OW(c94894Ou, "restricted_status"), new C4OW(c95124Py, "share_enabled"), new C4OW(c94754Oe, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS), AbstractC58319PtB.A0C(c94754Oe), AbstractC58319PtB.A0J(c94894Ou), new C4OK(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 1941640338), new C4OW(c94754Oe, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID)});
            }

            public StoryComments() {
                super(274044089);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryCountdowns extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class CountdownSticker extends C2JS implements C2JT {

                /* loaded from: classes11.dex */
                public final class Attribution extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C94754Oe c94754Oe = C94754Oe.A00;
                        C4OW c4ow = new C4OW(c94754Oe, "full_name");
                        C95124Py c95124Py = C95124Py.A00;
                        return new C4OU(new C4OM[]{c4ow, new C4OW(c95124Py, "is_private"), new C4OW(c95124Py, "is_verified"), new C4OW(c94754Oe, "pk"), new C4OW(c94754Oe, "pk_id"), new C4OW(c94754Oe, "profile_pic_id"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, AbstractC31198Dnh.A01())});
                    }

                    public Attribution() {
                        super(711582787);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C4OK c4ok = new C4OK(Attribution.class, "attribution", 711582787);
                    C94754Oe c94754Oe = C94754Oe.A00;
                    C4OW c4ow = new C4OW(c94754Oe, "countdown_id");
                    C4OW c4ow2 = new C4OW(c94754Oe, "digit_card_color");
                    C4OW c4ow3 = new C4OW(c94754Oe, "digit_color");
                    C4OW c4ow4 = new C4OW(c94754Oe, "end_background_color");
                    C4OW c4ow5 = new C4OW(C67A.A00, "end_ts");
                    C95124Py c95124Py = C95124Py.A00;
                    return new C4OU(new C4OM[]{c4ok, c4ow, c4ow2, c4ow3, c4ow4, c4ow5, new C4OW(c95124Py, "following_enabled"), new C4OW(c95124Py, "is_owner"), new C4OW(c94754Oe, "start_background_color"), AbstractC58319PtB.A0C(c94754Oe), new C4OW(c94754Oe, "text_color"), new C4OW(c95124Py, "viewer_is_following")});
                }

                public CountdownSticker() {
                    super(536610003);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OK c4ok = new C4OK(CountdownSticker.class, "countdown_sticker", 536610003);
                C173847oc c173847oc = C173847oc.A00;
                return AbstractC65704Tsa.A08(c173847oc, c173847oc, c4ok, new C4OW(c173847oc, "end_time_ms"), IgReactMediaPickerNativeModule.HEIGHT);
            }

            public StoryCountdowns() {
                super(1812374435);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryCta extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class Links extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return new C4OU(new C4OM[]{new C4OW(c94754Oe, AbstractC111324zv.A00(3903)), new C4OW(c94754Oe, AbstractC111324zv.A00(4051)), new C4OW(c94754Oe, "deeplinkUri"), new C4OW(C94894Ou.A00, "linkType"), new C4OW(c94754Oe, "package"), new C4OW(c94754Oe, AbstractC111324zv.A00(5457)), new C4OW(c94754Oe, "webUri")});
                }

                public Links() {
                    super(-1056912735);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0W(C4OO.A00(), Links.class, "links", -1056912735);
            }

            public StoryCta() {
                super(-879968258);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryFbCommunities extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class FbCommunitySticker extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return new C4OU(new C4OM[]{new C4OW(c94754Oe, AbstractC111324zv.A00(408)), new C4OW(c94754Oe, AbstractC111324zv.A00(4433)), new C4OW(c94754Oe, AbstractC111324zv.A00(4434)), new C4OW(c94754Oe, AbstractC111324zv.A00(2348)), new C4OW(c94754Oe, AbstractC111324zv.A00(4435)), new C4OW(c94754Oe, AbstractC111324zv.A00(409)), new C4OW(c94754Oe, "mib_extid")});
                }

                public FbCommunitySticker() {
                    super(1131460743);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                return AbstractC65704Tsa.A08(c173847oc, c173847oc, new C4OW(c173847oc, "end_time_ms"), new C4OK(FbCommunitySticker.class, AbstractC111324zv.A00(926), 1131460743), IgReactMediaPickerNativeModule.HEIGHT);
            }

            public StoryFbCommunities() {
                super(1849673978);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryFbTags extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class FbTagSticker extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC58320PtC.A0U(c94754Oe, new C4OW(c94754Oe, "fb_tag_id"), new C4OW(c94754Oe, "fb_tag_name"), new C4OW(c94754Oe, "fb_tag_type"), "fb_tag_url");
                }

                public FbTagSticker() {
                    super(-1204535087);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                return AbstractC65704Tsa.A08(c173847oc, c173847oc, new C4OW(c173847oc, "end_time_ms"), new C4OK(FbTagSticker.class, AbstractC111324zv.A00(929), -1204535087), IgReactMediaPickerNativeModule.HEIGHT);
            }

            public StoryFbTags() {
                super(1624663772);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryFeedMedia extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW c4ow = new C4OW(c94754Oe, "clips_creation_entry_point");
                C173847oc c173847oc = C173847oc.A00;
                C4OW c4ow2 = new C4OW(c173847oc, "end_time_ms");
                C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{c4ow, c4ow2, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OW(c94754Oe, AbstractC43591JPw.A00(411)), new C4OW(c94754Oe, AbstractC111324zv.A00(4879)), new C4OW(c94754Oe, "media_id"), new C4OW(c94754Oe, "product_type"), new C4OW(c173847oc, "rotation"), new C4OW(c173847oc, "start_time_ms"), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
            }

            public StoryFeedMedia() {
                super(-494019661);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryHashtags extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class Hashtag extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC167017dG.A0Y(c94754Oe, AbstractC166997dE.A0V(c94754Oe), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                }

                public Hashtag() {
                    super(-620068380);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                return AbstractC65704Tsa.A08(c173847oc, c173847oc, new C4OW(c173847oc, "end_time_ms"), new C4OK(Hashtag.class, "hashtag", -620068380), IgReactMediaPickerNativeModule.HEIGHT);
            }

            public StoryHashtags() {
                super(-806900063);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryLinkStickers extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class StoryLink extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return new C4OU(new C4OM[]{new C4OW(c94754Oe, "click_id"), new C4OW(c94754Oe, "display_url"), new C4OW(C95124Py.A00, "is_universal_link"), new C4OW(c94754Oe, "link_title"), new C4OW(c94754Oe, "link_type"), new C4OW(c94754Oe, "url")});
                }

                public StoryLink() {
                    super(2071480910);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                C4OW c4ow = new C4OW(c173847oc, "end_time_ms");
                C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{c4ow, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OW(c173847oc, "rotation"), new C4OW(c173847oc, "start_time_ms"), new C4OK(StoryLink.class, "story_link", 2071480910), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
            }

            public StoryLinkStickers() {
                super(1735711371);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryLocations extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class Location extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    C4OW c4ow = new C4OW(c94754Oe, "address");
                    C4OW c4ow2 = new C4OW(c94754Oe, ServerW3CShippingAddressConstants.CITY);
                    C4OW c4ow3 = new C4OW(c94754Oe, "external_source");
                    C67A c67a = C67A.A00;
                    C4OW c4ow4 = new C4OW(c67a, "facebook_places_id");
                    C4OW c4ow5 = new C4OW(C95124Py.A00, "has_viewer_saved");
                    C173847oc c173847oc = C173847oc.A00;
                    return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, c4ow4, c4ow5, new C4OW(c173847oc, "lat"), new C4OW(c173847oc, "lng"), AbstractC58321PtD.A0U(c94754Oe), new C4OW(c67a, "pk"), new C4OW(c94754Oe, "short_name")});
                }

                public Location() {
                    super(172057865);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                C4OW c4ow = new C4OW(c173847oc, "end_time_ms");
                C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{c4ow, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OK(Location.class, "location", 172057865), new C4OW(c173847oc, "rotation"), new C4OW(c173847oc, "start_time_ms"), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
            }

            public StoryLocations() {
                super(-1445930825);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryMusicLyricStickers extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                return AbstractC65704Tsa.A06(c173847oc, c173847oc);
            }

            public StoryMusicLyricStickers() {
                super(-1128324902);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryMusicPickStickers extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                return AbstractC65704Tsa.A06(c173847oc, c173847oc);
            }

            public StoryMusicPickStickers() {
                super(-345036116);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryMusicStickers extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class MusicAssetInfo extends C2JS implements C2JT {

                /* loaded from: classes11.dex */
                public final class IgArtist extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C94754Oe c94754Oe = C94754Oe.A00;
                        C4OW c4ow = new C4OW(c94754Oe, "full_name");
                        C95124Py c95124Py = C95124Py.A00;
                        return AbstractC58324PtG.A0M(c95124Py, c94754Oe, c4ow, new C4OW(c95124Py, "has_onboarded_to_text_post_app"), "is_private");
                    }

                    public IgArtist() {
                        super(1638750556);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C4OM[] c4omArr = new C4OM[29];
                    C95124Py c95124Py = C95124Py.A00;
                    C4OW c4ow = new C4OW(c95124Py, "allow_media_creation_with_music");
                    C4OW A0V = AbstractC65703TsZ.A0V(c95124Py);
                    C94754Oe c94754Oe = C94754Oe.A00;
                    C4OW c4ow2 = new C4OW(c94754Oe, "audio_asset_id");
                    C94894Ou c94894Ou = C94894Ou.A00;
                    return AbstractC58321PtD.A0Z(new C4OM[]{new C4OW(c94754Oe, "subtitle"), AbstractC58319PtB.A0L(c94754Oe)}, c4omArr, AbstractC31175DnJ.A1b(new C4OM[]{c4ow, A0V, c4ow2, new C4OW(c94894Ou, "audio_asset_start_time_in_ms"), new C4OW(c94754Oe, "audio_cluster_id"), new C4OW(c94754Oe, "cover_artwork_thumbnail_uri"), AbstractC65703TsZ.A0W(c94754Oe), new C4OW(c94754Oe, "dash_manifest"), new C4OW(c94754Oe, "display_artist"), new C4OW(c94894Ou, "duration_in_ms"), new C4OW(c94754Oe, "fast_start_progressive_download_url"), new C4OW(c95124Py, "has_lyrics"), AbstractC58320PtC.A0P(c94754Oe), new C4OK(IgArtist.class, "ig_artist", 1638750556), new C4OW(c94754Oe, "ig_username"), new C4OW(c95124Py, "is_bookmarked"), new C4OW(c95124Py, "is_eligible_for_audio_effects"), AbstractC65703TsZ.A0G(c95124Py), new C4OW(c95124Py, "is_trending_in_clips"), new C4OW(c94894Ou, "overlap_duration_in_ms"), AbstractC65703TsZ.A0J(c94754Oe), new C4OW(c94754Oe, "progressive_download_url"), new C4OW(c95124Py, "should_allow_music_editing"), AbstractC65703TsZ.A0c(c95124Py), AbstractC65703TsZ.A0b(c94754Oe), new C4OW(c94754Oe, "should_mute_audio_reason_type"), new C4OW(c95124Py, "should_render_soundwave")}, c4omArr) ? 1 : 0, 27, 2);
                }

                public MusicAssetInfo() {
                    super(1689659352);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW c4ow = new C4OW(c94754Oe, "attribution");
                C4OW c4ow2 = new C4OW(c94754Oe, "display_type");
                C173847oc c173847oc = C173847oc.A00;
                C4OW c4ow3 = new C4OW(c173847oc, "end_time_ms");
                C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OK(MusicAssetInfo.class, "music_asset_info", 1689659352), new C4OW(c173847oc, "rotation"), new C4OW(c173847oc, "start_time_ms"), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
            }

            public StoryMusicStickers() {
                super(1781247519);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryNotifyMeStickers extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                return AbstractC65704Tsa.A06(c173847oc, c173847oc);
            }

            public StoryNotifyMeStickers() {
                super(-1342338805);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryPolaroidStickers extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OW c4ow = new C4OW(C94754Oe.A00, "attribution");
                C173847oc c173847oc = C173847oc.A00;
                C4OW c4ow2 = new C4OW(c173847oc, "end_time_ms");
                C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{c4ow, c4ow2, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OW(C95124Py.A00, AbstractC111324zv.A00(1238)), new C4OW(c173847oc, "rotation"), new C4OW(c173847oc, "start_time_ms"), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
            }

            public StoryPolaroidStickers() {
                super(-960165815);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryPollVoterInfos extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class Voters extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class User extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class FriendshipStatus extends C2JS implements C2JT {
                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            C95124Py c95124Py = C95124Py.A00;
                            return AbstractC166987dD.A0k(new C4OM[]{AbstractC58321PtD.A0W(c95124Py), AbstractC166987dD.A0i(c95124Py, "incoming_request"), AbstractC58322PtE.A0W(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_feed_favorite"), AbstractC58319PtB.A0O(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_restricted"), AbstractC166987dD.A0i(c95124Py, "is_viewer_unconnected"), AbstractC166987dD.A0i(c95124Py, "outgoing_request")});
                        }

                        public FriendshipStatus() {
                            super(1057932182);
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C4OK A0M = AbstractC58322PtE.A0M(FriendshipStatus.class, 1057932182);
                        C94754Oe c94754Oe = C94754Oe.A00;
                        C4OW A0E = AbstractC58319PtB.A0E(c94754Oe);
                        C95124Py c95124Py = C95124Py.A00;
                        return AbstractC58324PtG.A0L(c95124Py, c94754Oe, A0M, A0E, AbstractC58322PtE.A0T(c95124Py));
                    }

                    public User() {
                        super(-620244925);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C4OW A0i = AbstractC166987dD.A0i(C95124Py.A00, "seen");
                    C94894Ou c94894Ou = C94894Ou.A00;
                    return AbstractC58320PtC.A0U(c94894Ou, A0i, AbstractC166987dD.A0i(c94894Ou, "ts"), AbstractC58318PtA.A0O(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -620244925), "vote");
                }

                public Voters() {
                    super(-870327857);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OW c4ow = new C4OW(C67A.A00, "latest_poll_vote_time");
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC58319PtB.A0U(c4ow, new C4OW(c94754Oe, "max_id"), new C4OW(AbstractC58319PtB.A0S(), "more_available"), new C4OW(new C94774Oi(c94754Oe), "poll_id"), new C4OK(C4OO.A02(), Voters.class, "voters", -870327857));
            }

            public StoryPollVoterInfos() {
                super(1919487332);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryPolls extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class PollSticker extends C2JS implements C2JT {

                /* loaded from: classes11.dex */
                public final class Tallies extends C2JS implements C2JT {
                    public Tallies() {
                        super(-1259412606);
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
                    C4OW c4ow2 = new C4OW(c95124Py, "finished");
                    C4OW A0V = AbstractC166997dE.A0V(c94754Oe);
                    C4OW c4ow3 = new C4OW(c95124Py, "is_multi_option_poll");
                    C4OW c4ow4 = new C4OW(c95124Py, "is_shared_result");
                    C4OW c4ow5 = new C4OW(c94754Oe, "poll_id");
                    C4OW c4ow6 = new C4OW(c94754Oe, "poll_type");
                    C4OW c4ow7 = new C4OW(c94754Oe, "question");
                    C4OK c4ok = new C4OK(C4OO.A00(), Tallies.class, "tallies", -1259412606);
                    C94894Ou c94894Ou = C94894Ou.A00;
                    return new C4OU(new C4OM[]{c4ow, c4ow2, A0V, c4ow3, c4ow4, c4ow5, c4ow6, c4ow7, c4ok, new C4OW(c94894Ou, AbstractC111324zv.A00(3250)), new C4OW(c95124Py, "viewer_can_vote"), new C4OW(c94894Ou, "viewer_vote")});
                }

                public PollSticker() {
                    super(-1350854074);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                C4OW c4ow = new C4OW(c173847oc, "end_time_ms");
                C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{c4ow, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OK(PollSticker.class, "poll_sticker", -1350854074), new C4OW(c173847oc, "rotation"), new C4OW(c173847oc, "start_time_ms"), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
            }

            public StoryPolls() {
                super(944635915);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryPrompts extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                return AbstractC65704Tsa.A06(c173847oc, c173847oc);
            }

            public StoryPrompts() {
                super(-742243212);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryQuestionResponderInfos extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class QuestionAuthor extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    C4OW c4ow = new C4OW(c94754Oe, "full_name");
                    C95124Py c95124Py = C95124Py.A00;
                    return AbstractC58324PtG.A0M(c95124Py, c94754Oe, c4ow, new C4OW(c95124Py, "has_onboarded_to_text_post_app"), "is_private");
                }

                public QuestionAuthor() {
                    super(-778580446);
                }
            }

            /* loaded from: classes10.dex */
            public final class Responders extends C2JS implements C2JT {

                /* loaded from: classes11.dex */
                public final class MediaResponse extends C2JS implements C2JT {

                    /* loaded from: classes11.dex */
                    public final class FundraiserTag extends C2JS implements C2JT {
                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0Z(C95124Py.A00, "has_standalone_fundraiser");
                        }

                        public FundraiserTag() {
                            super(27761879);
                        }
                    }

                    /* loaded from: classes10.dex */
                    public final class ImageVersions2 extends C2JS implements C2JT {

                        /* loaded from: classes10.dex */
                        public final class Candidates extends C2JS implements C2JT {
                            public Candidates() {
                                super(1602039694);
                            }

                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                return AbstractC58323PtF.A0R();
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0W(C4OO.A00(), Candidates.class, "candidates", 1602039694);
                        }

                        public ImageVersions2() {
                            super(-2080823011);
                        }
                    }

                    /* loaded from: classes10.dex */
                    public final class Owner extends C2JS implements C2JT {

                        /* loaded from: classes10.dex */
                        public final class FriendshipStatus extends C2JS implements C2JT {
                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                C95124Py c95124Py = C95124Py.A00;
                                return AbstractC58320PtC.A0U(c95124Py, AbstractC58321PtD.A0W(c95124Py), AbstractC58322PtE.A0W(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_feed_favorite"), "is_restricted");
                            }

                            public FriendshipStatus() {
                                super(119156860);
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            C94754Oe c94754Oe = C94754Oe.A00;
                            C4OW A0V = AbstractC58321PtD.A0V(c94754Oe);
                            C95124Py c95124Py = C95124Py.A00;
                            return AbstractC166987dD.A0k(new C4OM[]{A0V, AbstractC166987dD.A0i(c95124Py, "feed_post_reshare_disabled"), AbstractC58322PtE.A0M(FriendshipStatus.class, 119156860), AbstractC58319PtB.A0E(c94754Oe), AbstractC58321PtD.A0T(c95124Py), AbstractC166997dE.A0V(c94754Oe), AbstractC166987dD.A0i(c95124Py, "is_favorite"), AbstractC58319PtB.A0O(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_unpublished"), AbstractC58319PtB.A0P(c95124Py), AbstractC58319PtB.A0H(c94754Oe), AbstractC58319PtB.A0K(c94754Oe), AbstractC58319PtB.A0Q(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC166987dD.A0i(c95124Py, "show_account_transparency_details"), AbstractC58321PtD.A0S(C94894Ou.A00), AbstractC166987dD.A0i(c95124Py, "transparency_product_enabled"), AbstractC58319PtB.A0G(c94754Oe)});
                        }

                        public Owner() {
                            super(1964457550);
                        }
                    }

                    /* loaded from: classes10.dex */
                    public final class User extends C2JS implements C2JT {

                        /* loaded from: classes10.dex */
                        public final class FriendshipStatus extends C2JS implements C2JT {
                            @Override // X.C2JS
                            public final C4OU modelSelectionSet() {
                                C95124Py c95124Py = C95124Py.A00;
                                return AbstractC58320PtC.A0U(c95124Py, AbstractC58321PtD.A0W(c95124Py), AbstractC58322PtE.A0W(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_feed_favorite"), "is_restricted");
                            }

                            public FriendshipStatus() {
                                super(654964020);
                            }
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            C94754Oe c94754Oe = C94754Oe.A00;
                            C4OW A0V = AbstractC58321PtD.A0V(c94754Oe);
                            C95124Py c95124Py = C95124Py.A00;
                            return AbstractC166987dD.A0k(new C4OM[]{A0V, AbstractC166987dD.A0i(c95124Py, "feed_post_reshare_disabled"), AbstractC58322PtE.A0M(FriendshipStatus.class, 654964020), AbstractC58319PtB.A0E(c94754Oe), AbstractC58321PtD.A0T(c95124Py), AbstractC166997dE.A0V(c94754Oe), AbstractC166987dD.A0i(c95124Py, "is_favorite"), AbstractC58319PtB.A0O(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_unpublished"), AbstractC58319PtB.A0P(c95124Py), AbstractC58319PtB.A0H(c94754Oe), AbstractC58319PtB.A0K(c94754Oe), AbstractC58319PtB.A0Q(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC166987dD.A0i(c95124Py, "show_account_transparency_details"), AbstractC58321PtD.A0S(C94894Ou.A00), AbstractC166987dD.A0i(c95124Py, "transparency_product_enabled"), AbstractC58319PtB.A0G(c94754Oe)});
                        }

                        public User() {
                            super(1031892506);
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class CommentInformTreatment extends C2JS implements C2JT {
                        public CommentInformTreatment() {
                            super(1815097531);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0Y(AbstractC58318PtA.A0Q(), new C4OW(AbstractC58319PtB.A0S(), "should_have_inform_treatment"), "text");
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class GenAiDetectionMethod extends C2JS implements C2JT {
                        public GenAiDetectionMethod() {
                            super(-1771599217);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0Z(AbstractC58318PtA.A0Q(), "detection_method");
                        }
                    }

                    /* loaded from: classes11.dex */
                    public final class SharingFrictionInfo extends C2JS implements C2JT {
                        public SharingFrictionInfo() {
                            super(-721977371);
                        }

                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            return AbstractC167017dG.A0Z(AbstractC58319PtB.A0S(), "should_have_sharing_friction");
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C4OM[] c4omArr = new C4OM[63];
                        C95124Py c95124Py = C95124Py.A00;
                        C4OW c4ow = new C4OW(c95124Py, "can_see_insights_as_brand");
                        C4OW c4ow2 = new C4OW(c95124Py, "can_view_more_preview_comments");
                        C4OW c4ow3 = new C4OW(c95124Py, "can_viewer_save");
                        C4OW c4ow4 = new C4OW(c95124Py, "caption_is_edited");
                        C94754Oe c94754Oe = C94754Oe.A00;
                        C4OW c4ow5 = new C4OW(c94754Oe, "client_cache_key");
                        C4OW c4ow6 = new C4OW(c94754Oe, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                        C94894Ou c94894Ou = C94894Ou.A00;
                        C4OW c4ow7 = new C4OW(c94894Ou, "comment_count");
                        C4OK c4ok = new C4OK(CommentInformTreatment.class, "comment_inform_treatment", 1815097531);
                        C4OW c4ow8 = new C4OW(c95124Py, "comment_threading_enabled");
                        C4OW c4ow9 = new C4OW(c94754Oe, "commerciality_status");
                        C4OW c4ow10 = new C4OW(c94894Ou, "deleted_reason");
                        C67A c67a = C67A.A00;
                        System.arraycopy(new C4OM[]{c4ow, c4ow2, c4ow3, c4ow4, c4ow5, c4ow6, c4ow7, c4ok, c4ow8, c4ow9, c4ow10, new C4OW(c67a, "device_timestamp"), new C4OW(c95124Py, "enable_media_notes_production"), new C4OW(c95124Py, "explore_hide_comments"), new C4OW(c94894Ou, "fb_aggregated_comment_count"), new C4OW(c94894Ou, "fb_aggregated_like_count"), new C4OW(c94754Oe, "fbid"), new C4OW(c94894Ou, "filter_type"), new C4OK(FundraiserTag.class, "fundraiser_tag", 27761879), new C4OK(GenAiDetectionMethod.class, "gen_ai_detection_method", -1771599217), new C4OW(c95124Py, "has_delayed_metadata"), new C4OW(c95124Py, AbstractC111324zv.A00(427)), new C4OW(c95124Py, "has_liked"), new C4OW(c95124Py, "has_more_comments"), new C4OW(c95124Py, "has_privately_liked"), new C4OW(c94894Ou, "has_shared_to_fb"), new C4OW(c95124Py, "hide_view_all_comment_entrypoint")}, 0, c4omArr, 0, 27);
                        System.arraycopy(new C4OM[]{AbstractC166997dE.A0V(c94754Oe), new C4OW(c95124Py, "ig_media_sharing_disabled"), new C4OK(ImageVersions2.class, "image_versions2", -2080823011), new C4OW(c94754Oe, "integrity_review_decision"), new C4OW(c95124Py, "is_auto_created"), new C4OW(c95124Py, "is_comments_gif_composer_enabled"), new C4OW(c95124Py, "is_cutout_sticker_allowed"), new C4OW(c95124Py, "is_in_profile_grid"), new C4OW(c95124Py, MSV.A00(494)), new C4OW(c95124Py, "is_organic_product_tagging_eligible"), new C4OW(c95124Py, "is_paid_partnership"), new C4OW(c95124Py, "is_post_live_clips_media"), new C4OW(c95124Py, "is_reshare_of_text_post_app_media_in_ig"), new C4OW(c95124Py, "is_tagged_media_shared_to_viewer_profile_grid"), new C4OW(c95124Py, "is_unified_video"), new C4OW(c95124Py, "is_visual_reply_commenter_notice_enabled"), new C4OW(c95124Py, "like_and_view_counts_disabled"), new C4OW(c94894Ou, "like_count"), new C4OW(c94894Ou, "max_num_visible_preview_comments"), new C4OW(c94894Ou, "media_type"), new C4OW(c94754Oe, AbstractC111324zv.A00(125)), new C4OW(c94754Oe, "organic_tracking_token"), new C4OW(c94894Ou, "original_height"), new C4OW(c95124Py, "original_media_has_visual_reply_media"), new C4OW(c94894Ou, "original_width"), new C4OK(Owner.class, "owner", 1964457550), new C4OW(c94754Oe, "pk")}, 0, c4omArr, 27, 27);
                        return AbstractC58321PtD.A0Z(new C4OM[]{new C4OW(c94754Oe, "product_type"), new C4OW(c95124Py, "profile_grid_control_enabled"), new C4OK(SharingFrictionInfo.class, "sharing_friction_info", -721977371), new C4OW(c95124Py, "should_request_ads"), new C4OW(c95124Py, "should_show_author_pog_for_tagged_media_shared_to_profile_grid"), new C4OW(c95124Py, "subscribe_cta_visible"), new C4OW(c67a, "taken_at"), new C4OK(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 1031892506), new C4OW(c95124Py, AbstractC111324zv.A00(276))}, c4omArr, 0, 54, 9);
                    }

                    public MediaResponse() {
                        super(1458145975);
                    }
                }

                /* loaded from: classes10.dex */
                public final class User extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C94754Oe c94754Oe = C94754Oe.A00;
                        C4OW A0E = AbstractC58319PtB.A0E(c94754Oe);
                        C95124Py c95124Py = C95124Py.A00;
                        return AbstractC58324PtG.A0M(c95124Py, c94754Oe, A0E, AbstractC58322PtE.A0T(c95124Py), "is_private");
                    }

                    public User() {
                        super(601516879);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C95124Py c95124Py = C95124Py.A00;
                    C4OW A0i = AbstractC166987dD.A0i(AbstractC166987dD.A0j(c95124Py), "has_shared_response");
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC166987dD.A0k(new C4OM[]{A0i, AbstractC58320PtC.A0P(c94754Oe), AbstractC58318PtA.A0O(MediaResponse.class, "media_response", 1458145975), AbstractC166987dD.A0i(c94754Oe, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE), AbstractC166987dD.A0i(AbstractC166987dD.A0j(c94754Oe), "response_type"), AbstractC166987dD.A0i(c95124Py, "seen"), AbstractC166987dD.A0i(c95124Py, "should_enable_reply_creation"), AbstractC166987dD.A0i(AbstractC58319PtB.A0R(), "ts"), AbstractC166987dD.A0h(C4OO.A01(), User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 601516879)});
                }

                public Responders() {
                    super(1539067568);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW c4ow = new C4OW(new C94774Oi(c94754Oe), "background_color");
                C4OW c4ow2 = new C4OW(C67A.A00, AbstractC111324zv.A00(1075));
                C4OW c4ow3 = new C4OW(c94754Oe, "max_id");
                C4OW c4ow4 = new C4OW(AbstractC58319PtB.A0S(), "more_available");
                C4OW c4ow5 = new C4OW(new C94774Oi(c94754Oe), "question");
                C4OK c4ok = new C4OK(QuestionAuthor.class, AbstractC111324zv.A00(1201), -778580446);
                C4OW c4ow6 = new C4OW(new C94774Oi(c94754Oe), "question_id");
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, c4ow4, c4ow5, c4ok, c4ow6, new C4OW(new C94774Oi(c94894Ou), "question_response_count"), new C4OW(new C94774Oi(c94754Oe), "question_type"), new C4OK(C4OO.A02(), Responders.class, "responders", 1539067568), new C4OW(new C94774Oi(c94754Oe), "text_color"), new C4OW(new C94774Oi(c94894Ou), AbstractC111324zv.A00(1354))});
            }

            public StoryQuestionResponderInfos() {
                super(-1333062854);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryQuestions extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class QuestionSticker extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return new C4OU(new C4OM[]{new C4OW(c94754Oe, "background_color"), new C4OW(c94754Oe, "media_id"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, "question"), new C4OW(c94754Oe, "question_id"), new C4OW(c94754Oe, "question_type"), new C4OW(c94754Oe, "text_color"), new C4OW(C95124Py.A00, "viewer_can_interact")});
                }

                public QuestionSticker() {
                    super(-2016706875);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                C4OW c4ow = new C4OW(c173847oc, "end_time_ms");
                C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{c4ow, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OK(QuestionSticker.class, "question_sticker", -2016706875), new C4OW(c173847oc, "rotation"), new C4OW(c173847oc, "start_time_ms"), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
            }

            public StoryQuestions() {
                super(1928418458);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryQuizParticipantInfos extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class Participants extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class User extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C94754Oe c94754Oe = C94754Oe.A00;
                        C4OW A0E = AbstractC58319PtB.A0E(c94754Oe);
                        C95124Py c95124Py = C95124Py.A00;
                        return AbstractC58324PtG.A0M(c95124Py, c94754Oe, A0E, AbstractC58322PtE.A0T(c95124Py), "is_private");
                    }

                    public User() {
                        super(-260195190);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94894Ou c94894Ou = C94894Ou.A00;
                    return AbstractC58320PtC.A0V(AbstractC166987dD.A0i(c94894Ou, "answer"), AbstractC166987dD.A0i(c94894Ou, "ts"), User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -260195190);
                }

                public Participants() {
                    super(1804556723);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC58320PtC.A0U(c94754Oe, new C4OW(c94754Oe, "max_id"), new C4OW(C95124Py.A00, "more_available"), new C4OK(C4OO.A00(), Participants.class, "participants", 1804556723), "quiz_id");
            }

            public StoryQuizParticipantInfos() {
                super(796566849);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryQuizs extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class QuizSticker extends C2JS implements C2JT {

                /* loaded from: classes11.dex */
                public final class Tallies extends C2JS implements C2JT {
                    public Tallies() {
                        super(-301622276);
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0Y(C94754Oe.A00, AbstractC58322PtE.A0N(), "text");
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94894Ou c94894Ou = C94894Ou.A00;
                    C4OW c4ow = new C4OW(c94894Ou, "correct_answer");
                    C94754Oe c94754Oe = C94754Oe.A00;
                    C4OW c4ow2 = new C4OW(c94754Oe, "end_background_color");
                    C95124Py c95124Py = C95124Py.A00;
                    return new C4OU(new C4OM[]{c4ow, c4ow2, new C4OW(c95124Py, "finished"), AbstractC166997dE.A0V(c94754Oe), new C4OW(c94754Oe, "question"), new C4OW(c94754Oe, "quiz_id"), new C4OW(c94754Oe, "start_background_color"), new C4OK(C4OO.A00(), Tallies.class, "tallies", -301622276), new C4OW(c94754Oe, "text_color"), new C4OW(c94894Ou, "viewer_answer"), new C4OW(c95124Py, "viewer_can_answer")});
                }

                public QuizSticker() {
                    super(-1046731501);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                C4OW c4ow = new C4OW(c173847oc, "end_time_ms");
                C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{c4ow, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OK(QuizSticker.class, "quiz_sticker", -1046731501), new C4OW(c173847oc, "rotation"), new C4OW(c173847oc, "start_time_ms"), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
            }

            public StoryQuizs() {
                super(-459007500);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryReactionStickers extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                return AbstractC65704Tsa.A06(c173847oc, c173847oc);
            }

            public StoryReactionStickers() {
                super(-598481575);
            }
        }

        /* loaded from: classes11.dex */
        public final class StorySecretStickers extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OW c4ow = new C4OW(C94754Oe.A00, "caption");
                C173847oc c173847oc = C173847oc.A00;
                return AbstractC65704Tsa.A08(c173847oc, c173847oc, c4ow, new C4OW(c173847oc, "end_time_ms"), IgReactMediaPickerNativeModule.HEIGHT);
            }

            public StorySecretStickers() {
                super(-1245515935);
            }
        }

        /* loaded from: classes11.dex */
        public final class StorySliderVoterInfos extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class Voters extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class User extends C2JS implements C2JT {

                    /* loaded from: classes10.dex */
                    public final class FriendshipStatus extends C2JS implements C2JT {
                        @Override // X.C2JS
                        public final C4OU modelSelectionSet() {
                            C95124Py c95124Py = C95124Py.A00;
                            return AbstractC166987dD.A0k(new C4OM[]{AbstractC58321PtD.A0W(c95124Py), AbstractC166987dD.A0i(c95124Py, "incoming_request"), AbstractC58322PtE.A0W(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_feed_favorite"), AbstractC58319PtB.A0O(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_restricted"), AbstractC166987dD.A0i(c95124Py, "outgoing_request")});
                        }

                        public FriendshipStatus() {
                            super(1329613952);
                        }
                    }

                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C4OK A0M = AbstractC58322PtE.A0M(FriendshipStatus.class, 1329613952);
                        C94754Oe c94754Oe = C94754Oe.A00;
                        C4OW A0E = AbstractC58319PtB.A0E(c94754Oe);
                        C95124Py c95124Py = C95124Py.A00;
                        return AbstractC58324PtG.A0L(c95124Py, c94754Oe, A0M, A0E, AbstractC58322PtE.A0T(c95124Py));
                    }

                    public User() {
                        super(-955720906);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0X(C173847oc.A00, AbstractC166987dD.A0i(C94894Ou.A00, "ts"), AbstractC58318PtA.A0O(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -955720906), "vote");
                }

                public Voters() {
                    super(1962518823);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OW c4ow = new C4OW(C94894Ou.A00, AbstractC111324zv.A00(1076));
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC58319PtB.A0U(c4ow, new C4OW(c94754Oe, "max_id"), new C4OW(C95124Py.A00, "more_available"), new C4OW(c94754Oe, "slider_id"), new C4OK(C4OO.A00(), Voters.class, "voters", 1962518823));
            }

            public StorySliderVoterInfos() {
                super(10225162);
            }
        }

        /* loaded from: classes11.dex */
        public final class StorySliders extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class SliderSticker extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    C4OW c4ow = new C4OW(c94754Oe, "background_color");
                    C4OW c4ow2 = new C4OW(c94754Oe, "emoji");
                    C95124Py c95124Py = C95124Py.A00;
                    C4OW c4ow3 = new C4OW(c95124Py, "is_interactive_music_sticker");
                    C4OW c4ow4 = new C4OW(c94754Oe, "question");
                    C4OW c4ow5 = new C4OW(c94754Oe, "slider_id");
                    C173847oc c173847oc = C173847oc.A00;
                    return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, c4ow4, c4ow5, new C4OW(c173847oc, "slider_vote_average"), new C4OW(C94894Ou.A00, "slider_vote_count"), new C4OW(c94754Oe, "text_color"), new C4OW(c95124Py, "viewer_can_vote"), new C4OW(c173847oc, "viewer_vote")});
                }

                public SliderSticker() {
                    super(1607602238);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                C4OW c4ow = new C4OW(c173847oc, "end_time_ms");
                C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{c4ow, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OW(c173847oc, "rotation"), new C4OK(SliderSticker.class, "slider_sticker", 1607602238), new C4OW(c173847oc, "start_time_ms"), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
            }

            public StorySliders() {
                super(275921863);
            }
        }

        /* loaded from: classes11.dex */
        public final class StorySoundOn extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                return AbstractC65704Tsa.A08(C94754Oe.A00, c173847oc, new C4OW(c173847oc, "end_time_ms"), AbstractC58319PtB.A0N(c173847oc), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            }

            public StorySoundOn() {
                super(1043285335);
            }
        }

        /* loaded from: classes4.dex */
        public final class StorySubscriptionsStickers extends C2JS implements C2JT {

            /* loaded from: classes4.dex */
            public final class SubscriptionSticker extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC167017dG.A0X(c94754Oe, AbstractC166987dD.A0i(c94754Oe, "creator_id"), AbstractC166987dD.A0i(c94754Oe, "creator_profile_pic_url"), "creator_username");
                }

                public SubscriptionSticker() {
                    super(-1917783624);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                C4OW A0i = AbstractC166987dD.A0i(c173847oc, "end_time_ms");
                C4OW A0i2 = AbstractC166987dD.A0i(c173847oc, IgReactMediaPickerNativeModule.HEIGHT);
                C94894Ou c94894Ou = C94894Ou.A00;
                return AbstractC166987dD.A0k(new C4OM[]{A0i, A0i2, AbstractC166987dD.A0i(c94894Ou, "is_fb_sticker"), AbstractC166987dD.A0i(c94894Ou, "is_hidden"), AbstractC166987dD.A0i(c94894Ou, "is_pinned"), AbstractC166987dD.A0i(c94894Ou, "is_sticker"), AbstractC166987dD.A0i(c173847oc, "rotation"), AbstractC166987dD.A0i(c173847oc, "start_time_ms"), new C4OK(SubscriptionSticker.class, "subscription_sticker", -1917783624), AbstractC166987dD.A0i(c173847oc, IgReactMediaPickerNativeModule.WIDTH), AbstractC166987dD.A0i(c173847oc, "x"), AbstractC166987dD.A0i(c173847oc, "y"), AbstractC166987dD.A0i(c173847oc, "z")});
            }

            public StorySubscriptionsStickers() {
                super(-1358197362);
            }
        }

        /* loaded from: classes11.dex */
        public final class StoryUpcomingEvents extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW c4ow = new C4OW(c94754Oe, "display_type");
                C173847oc c173847oc = C173847oc.A00;
                C4OW c4ow2 = new C4OW(c173847oc, "end_time_ms");
                C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{c4ow, c4ow2, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OW(c94754Oe, "media_id"), new C4OW(c173847oc, "rotation"), new C4OW(c94754Oe, CacheBehaviorLogger.SOURCE), new C4OW(c173847oc, "start_time_ms"), new C4OW(c94754Oe, "thumbnail_url"), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
            }

            public StoryUpcomingEvents() {
                super(93990493);
            }
        }

        /* loaded from: classes11.dex */
        public final class TextPostShareToIgStoryStickers extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class TextPostShareToIgStorySticker extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC167017dG.A0X(c94754Oe, new C4OW(c94754Oe, "attribution_app_id"), new C4OW(c94754Oe, "attribution_app_name"), "attribution_url");
                }

                public TextPostShareToIgStorySticker() {
                    super(1398276011);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                C4OW c4ow = new C4OW(c173847oc, "end_time_ms");
                C4OW A0N = AbstractC58319PtB.A0N(c173847oc);
                C94894Ou c94894Ou = C94894Ou.A00;
                return new C4OU(new C4OM[]{c4ow, A0N, new C4OW(c94894Ou, "is_fb_sticker"), new C4OW(c94894Ou, "is_hidden"), new C4OW(c94894Ou, "is_pinned"), new C4OW(c94894Ou, "is_sticker"), new C4OW(c173847oc, "rotation"), new C4OW(c173847oc, "start_time_ms"), new C4OK(TextPostShareToIgStorySticker.class, AbstractC111324zv.A00(541), 1398276011), AbstractC58319PtB.A0M(c173847oc), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(c173847oc, "z")});
            }

            public TextPostShareToIgStoryStickers() {
                super(-1877923736);
            }
        }

        /* loaded from: classes11.dex */
        public final class User extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Y(C94754Oe.A00, new C4OW(C95124Py.A00, "is_private"), "pk");
            }

            public User() {
                super(-1710828246);
            }
        }

        /* loaded from: classes11.dex */
        public final class Viewers extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW c4ow = new C4OW(c94754Oe, "full_name");
                C95124Py c95124Py = C95124Py.A00;
                return AbstractC58324PtG.A0M(c95124Py, c94754Oe, c4ow, new C4OW(c95124Py, "has_onboarded_to_text_post_app"), "is_private");
            }

            public Viewers() {
                super(1143495483);
            }
        }

        /* loaded from: classes11.dex */
        public final class VisualCommentReplyStickerInfo extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C173847oc c173847oc = C173847oc.A00;
                return AbstractC65704Tsa.A06(c173847oc, c173847oc);
            }

            public VisualCommentReplyStickerInfo() {
                super(-904733244);
            }
        }

        /* loaded from: classes11.dex */
        public final class WearableAttributionInfo extends C2JS implements C2JT {

            /* loaded from: classes11.dex */
            public final class WorldLocationPagesInfo extends C2JS implements C2JT {
                public WorldLocationPagesInfo() {
                    super(-1921586090);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC65703TsZ.A0t();
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return new C4OU(new C4OM[]{AbstractC65703TsZ.A0O(c94754Oe), AbstractC65703TsZ.A0Q(c94754Oe), AbstractC65703TsZ.A0R(c94754Oe), AbstractC65703TsZ.A0S(c94754Oe), AbstractC65703TsZ.A0T(c94754Oe), AbstractC65703TsZ.A0I(c94754Oe), new C4OW(c94754Oe, "attribution_type"), new C4OW(C94894Ou.A00, "iconic_current_presence"), new C4OW(c94754Oe, "iconic_horizon_world_deeplink"), new C4OW(c94754Oe, "iconic_horizon_world_id"), new C4OW(c94754Oe, "iconic_horizon_world_name"), AbstractC65703TsZ.A0D(), new C4OK(WorldLocationPagesInfo.class, "world_location_pages_info", -1921586090)});
            }

            public WearableAttributionInfo() {
                super(-835453027);
            }
        }

        /* loaded from: classes11.dex */
        public final class Attribution extends C2JS implements C2JT {
            public Attribution() {
                super(570016792);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Z(AbstractC58318PtA.A0Q(), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            }
        }

        /* loaded from: classes11.dex */
        public final class GenAiDetectionMethod extends C2JS implements C2JT {
            public GenAiDetectionMethod() {
                super(-1293419483);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Z(AbstractC58318PtA.A0Q(), "detection_method");
            }
        }

        /* loaded from: classes11.dex */
        public final class VideoVersions extends C2JS implements C2JT {
            public VideoVersions() {
                super(-357370442);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58321PtD.A0X();
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C4OM[] c4omArr = new C4OM[169];
            C94754Oe c94754Oe = C94754Oe.A00;
            C4OW c4ow = new C4OW(c94754Oe, "ad_action");
            C67A c67a = C67A.A00;
            C4OW c4ow2 = new C4OW(c67a, AbstractC111324zv.A00(731));
            C4OW c4ow3 = new C4OW(c67a, AbstractC111324zv.A00(3921));
            C4OK c4ok = new C4OK(Attribution.class, "attribution", 570016792);
            C4OW c4ow4 = new C4OW(c94754Oe, "attribution_content_url");
            C4OW c4ow5 = new C4OW(c94754Oe, "audience");
            C4OK c4ok2 = new C4OK(C4OO.A00(), AvatarStickers.class, AbstractC43591JPw.A00(34), 1430707362);
            C95124Py c95124Py = C95124Py.A00;
            C4OW c4ow6 = new C4OW(c95124Py, AbstractC111324zv.A00(762));
            C4OW c4ow7 = new C4OW(c95124Py, AbstractC111324zv.A00(4021));
            C4OW c4ow8 = new C4OW(c94754Oe, "boost_unavailable_identifier");
            C4OW c4ow9 = new C4OW(c94754Oe, "boost_unavailable_reason");
            C4OW c4ow10 = new C4OW(c94754Oe, "boosted_status");
            C4OW c4ow11 = new C4OW(c95124Py, "can_hype");
            C4OW c4ow12 = new C4OW(c95124Py, "can_mention_back");
            C4OW c4ow13 = new C4OW(c95124Py, AbstractC111324zv.A00(780));
            C4OW c4ow14 = new C4OW(c95124Py, "can_play_spotify_audio");
            C4OW c4ow15 = new C4OW(c95124Py, "can_reply");
            C4OW c4ow16 = new C4OW(c95124Py, AbstractC58317Pt9.A00(88));
            C4OW c4ow17 = new C4OW(c95124Py, "can_see_insights_as_brand");
            C4OW c4ow18 = new C4OW(c95124Py, "can_send_prompt");
            C4OW c4ow19 = new C4OW(c95124Py, "can_view_more_preview_comments");
            C4OW c4ow20 = new C4OW(c95124Py, "can_viewer_save");
            C4OK c4ok3 = new C4OK(WearableAttributionInfo.class, "wearable_attribution_info", -835453027);
            C4OK c4ok4 = new C4OK(Caption.class, "caption", 1738176537);
            C4OW c4ow21 = new C4OW(c95124Py, "caption_is_edited");
            C173847oc c173847oc = C173847oc.A00;
            System.arraycopy(new C4OM[]{c4ow, c4ow2, c4ow3, c4ok, c4ow4, c4ow5, c4ok2, c4ow6, c4ow7, c4ow8, c4ow9, c4ow10, c4ow11, c4ow12, c4ow13, c4ow14, c4ow15, c4ow16, c4ow17, c4ow18, c4ow19, c4ow20, c4ok3, c4ok4, c4ow21, new C4OW(c173847oc, "caption_position"), new C4OW(c94754Oe, "client_cache_key")}, 0, c4omArr, 0, 27);
            C4OW c4ow22 = new C4OW(c94754Oe, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
            C4OW c4ow23 = new C4OW(c95124Py, "collapse_comments");
            C94894Ou c94894Ou = C94894Ou.A00;
            System.arraycopy(new C4OM[]{c4ow22, c4ow23, new C4OW(c94894Ou, "comment_count"), new C4OW(c95124Py, "comment_threading_enabled"), new C4OW(c95124Py, "commenting_disabled_for_viewer"), new C4OW(c94754Oe, "commerciality_status"), new C4OK(CreateModeAttribution.class, AbstractC111324zv.A00(856), 553993658), new C4OK(CreativeConfig.class, "creative_config", -1412038795), new C4OK(C4OO.A00(), CutoutStickers.class, AbstractC43591JPw.A00(900), 541101271), new C4OW(c94894Ou, "deleted_reason"), new C4OW(c67a, "device_timestamp"), new C4OW(c95124Py, "enable_media_notes_production"), new C4OW(c67a, AbstractC58317Pt9.A00(26)), new C4OW(c95124Py, "explore_hide_comments"), new C4OW(c94894Ou, "fb_aggregated_comment_count"), new C4OW(c94894Ou, "fb_aggregated_like_count"), new C4OW(c94894Ou, "fb_viewer_count"), new C4OW(c94754Oe, "fbid"), new C4OW(c94894Ou, "filter_type"), new C4OK(FundraiserTag.class, "fundraiser_tag", -1168266768), new C4OK(GenAiDetectionMethod.class, "gen_ai_detection_method", -1293419483), new C4OW(c95124Py, "has_audio"), new C4OW(c95124Py, "has_delayed_metadata"), new C4OW(c95124Py, AbstractC111324zv.A00(427)), new C4OW(c95124Py, "has_liked"), new C4OW(c95124Py, "has_more_comments"), new C4OW(c95124Py, "has_privately_liked")}, 0, c4omArr, 27, 27);
            System.arraycopy(new C4OM[]{new C4OW(c94894Ou, "has_shared_to_fb"), new C4OW(c94894Ou, AbstractC111324zv.A00(974)), new C4OW(c95124Py, "has_translation"), new C4OW(c95124Py, "hide_view_all_comment_entrypoint"), new C4OK(HighlightsInfo.class, AbstractC111324zv.A00(4574), 2008070795), AbstractC58320PtC.A0P(c94754Oe), new C4OW(c95124Py, "ig_media_sharing_disabled"), new C4OK(ImageVersions2.class, "image_versions2", 1160869604), new C4OW(c94894Ou, MSV.A00(1295)), new C4OW(c94754Oe, "integrity_review_decision"), new C4OW(c95124Py, "is_auto_created"), new C4OW(c95124Py, "is_comments_gif_composer_enabled"), new C4OW(c95124Py, "is_currently_promoting_by_sponsor"), new C4OW(c95124Py, "is_cutout_sticker_allowed"), new C4OW(c94894Ou, "is_dash_eligible"), new C4OW(c95124Py, AbstractC111324zv.A00(2610)), new C4OW(c95124Py, MSV.A00(216)), new C4OW(c95124Py, AbstractC111324zv.A00(4743)), new C4OW(c95124Py, "is_in_profile_grid"), new C4OW(c95124Py, MSV.A00(494)), new C4OW(c95124Py, "is_organic_product_tagging_eligible"), new C4OW(c95124Py, "is_paid_partnership"), new C4OW(c95124Py, "is_post_live_clips_media"), new C4OW(c95124Py, AbstractC111324zv.A00(123)), new C4OW(c95124Py, "is_reshare_of_text_post_app_media_in_ig"), new C4OW(c95124Py, MSV.A00(1358)), new C4OW(c95124Py, AbstractC111324zv.A00(460))}, 0, c4omArr, 54, 27);
            System.arraycopy(new C4OM[]{new C4OW(c95124Py, "is_tagged_media_shared_to_viewer_profile_grid"), new C4OW(c95124Py, "is_terminal_video_segment"), new C4OW(c95124Py, "is_unified_video"), new C4OW(c95124Py, "is_visual_reply_commenter_notice_enabled"), new C4OW(c173847oc, "lat"), new C4OW(c95124Py, "like_and_view_counts_disabled"), new C4OW(c94754Oe, "link_text"), new C4OW(c173847oc, "lng"), new C4OK(Location.class, "location", 66513659), new C4OW(c94894Ou, "max_num_visible_preview_comments"), new C4OK(MediaNotice.class, "media_notice", -1028618178), new C4OK(MediaOverlayInfo.class, "media_overlay_info", 1074865333), new C4OW(c94894Ou, "media_type"), new C4OW(c95124Py, MSV.A00(229)), new C4OK(C4OO.A00(), MessageShare.class, "message_share", -723637346), new C4OW(c94754Oe, AbstractC111324zv.A00(125)), new C4OW(c94754Oe, "next_max_id"), new C4OW(c94894Ou, "number_of_qualities"), new C4OW(c94754Oe, "organic_tracking_token"), new C4OW(c94894Ou, "original_height"), new C4OW(c95124Py, "original_media_has_visual_reply_media"), new C4OW(c94894Ou, "original_width"), new C4OK(Owner.class, "owner", -479067746), AbstractC58320PtC.A0Q(c94754Oe), new C4OW(c94754Oe, "preview"), new C4OK(C4OO.A00(), PreviewComments.class, AbstractC111324zv.A00(2903), 746537752), new C4OW(c94754Oe, "product_type")}, 0, c4omArr, 81, 27);
            System.arraycopy(new C4OM[]{new C4OW(c95124Py, "profile_grid_control_enabled"), new C4OK(C4OO.A00(), ReelMentions.class, MSV.A00(254), 951731133), new C4OK(ResharedStoryMediaAuthor.class, AbstractC111324zv.A00(1236), -414886132), new C4OW(c94754Oe, AbstractC111324zv.A00(1254)), new C4OK(SharingFrictionInfo.class, "sharing_friction_info", -1440033722), new C4OW(c95124Py, "should_request_ads"), new C4OW(c95124Py, "should_show_author_pog_for_tagged_media_shared_to_profile_grid"), new C4OW(c95124Py, AbstractC111324zv.A00(1270)), new C4OW(c94894Ou, "source_type"), new C4OK(C4OO.A00(), SponsorTags.class, "sponsor_tags", -891254607), new C4OW(c95124Py, "sticker_translations_enabled"), new C4OK(StoryAppAttribution.class, AbstractC111324zv.A00(5415), -2033629245), new C4OK(C4OO.A00(), StoryBloksTappables.class, MSV.A00(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS), 1325027243), new C4OK(C4OO.A00(), StoryChats.class, AbstractC111324zv.A00(1286), -183260748), new C4OK(C4OO.A00(), StoryComments.class, AbstractC111324zv.A00(5417), 274044089), new C4OK(C4OO.A00(), StoryCountdowns.class, AbstractC111324zv.A00(1287), 1812374435), new C4OK(C4OO.A00(), StoryCta.class, "story_cta", -879968258), new C4OK(C4OO.A00(), StoryFbCommunities.class, MSV.A00(267), 1849673978), new C4OK(C4OO.A00(), StoryFbTags.class, AbstractC111324zv.A00(1288), 1624663772), new C4OK(C4OO.A00(), StoryFeedMedia.class, AbstractC111324zv.A00(1289), -494019661), new C4OW(c95124Py, AbstractC111324zv.A00(1290)), new C4OK(C4OO.A00(), StoryHashtags.class, AbstractC111324zv.A00(1291), -806900063), new C4OW(c95124Py, AbstractC111324zv.A00(1292)), new C4OK(C4OO.A00(), StoryLinkStickers.class, AbstractC111324zv.A00(1293), 1735711371), new C4OK(C4OO.A00(), StoryLocations.class, AbstractC111324zv.A00(1294), -1445930825), new C4OK(C4OO.A00(), StoryMusicLyricStickers.class, AbstractC111324zv.A00(1296), -1128324902), new C4OK(C4OO.A00(), StoryMusicPickStickers.class, MSV.A00(268), -345036116)}, 0, c4omArr, 108, 27);
            System.arraycopy(new C4OM[]{new C4OK(C4OO.A00(), StoryMusicStickers.class, AbstractC111324zv.A00(1297), 1781247519), new C4OK(C4OO.A00(), StoryNotifyMeStickers.class, "story_notify_me_stickers", -1342338805), new C4OK(C4OO.A00(), StoryPolaroidStickers.class, AbstractC111324zv.A00(1298), -960165815), new C4OK(C4OO.A00(), StoryPollVoterInfos.class, AbstractC111324zv.A00(1299), 1919487332), new C4OK(C4OO.A00(), StoryPolls.class, "story_polls", 944635915), new C4OK(C4OO.A00(), StoryPrompts.class, "story_prompts", -742243212), new C4OK(C4OO.A00(), StoryQuestionResponderInfos.class, AbstractC111324zv.A00(1300), -1333062854), new C4OK(C4OO.A00(), StoryQuestions.class, AbstractC111324zv.A00(1301), 1928418458), new C4OK(C4OO.A00(), StoryQuizParticipantInfos.class, AbstractC111324zv.A00(1303), 796566849), new C4OK(C4OO.A00(), StoryQuizs.class, AbstractC111324zv.A00(1304), -459007500), new C4OK(C4OO.A00(), StoryReactionStickers.class, MSV.A00(269), -598481575), new C4OK(C4OO.A00(), StorySecretStickers.class, AbstractC111324zv.A00(1306), -1245515935), new C4OK(C4OO.A00(), StorySliderVoterInfos.class, AbstractC111324zv.A00(1308), 10225162), new C4OK(C4OO.A00(), StorySliders.class, "story_sliders", 275921863), new C4OK(C4OO.A00(), StorySoundOn.class, AbstractC111324zv.A00(1309), 1043285335), new C4OK(C4OO.A00(), StorySubscriptionsStickers.class, AbstractC111324zv.A00(1312), -1358197362), new C4OK(C4OO.A00(), StoryUpcomingEvents.class, AbstractC111324zv.A00(1313), 93990493), new C4OW(c95124Py, "subscribe_cta_visible"), new C4OW(c95124Py, AbstractC111324zv.A00(536)), new C4OW(c67a, "taken_at"), new C4OK(C4OO.A00(), TextPostShareToIgStoryStickers.class, AbstractC111324zv.A00(1333), -1877923736), new C4OW(c94894Ou, "timezone_offset"), new C4OW(c94894Ou, "total_viewer_count"), new C4OK(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -1710828246), new C4OW(c94754Oe, "video_codec"), new C4OW(c94754Oe, "video_dash_manifest"), new C4OW(c173847oc, "video_duration")}, 0, c4omArr, 135, 27);
            return AbstractC58321PtD.A0Z(new C4OM[]{new C4OK(C4OO.A00(), VideoVersions.class, "video_versions", -357370442), new C4OW(c95124Py, AbstractC111324zv.A00(276)), new C4OW(c94894Ou, "viewer_count"), new C4OW(c94754Oe, AbstractC111324zv.A00(5573)), new C4OK(C4OO.A00(), Viewers.class, "viewers", 1143495483), new C4OK(C4OO.A00(), VisualCommentReplyStickerInfo.class, "visual_comment_reply_sticker_info", -904733244), new C4OW(c94754Oe, "xpost_deny_reason")}, c4omArr, 0, 162, 7);
        }

        public Items() {
            super(1879368680);
        }
    }

    /* loaded from: classes10.dex */
    public final class Owner extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC58319PtB.A0U(AbstractC58319PtB.A0J(c94754Oe), AbstractC58320PtC.A0Q(c94754Oe), AbstractC58321PtD.A0U(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC166987dD.A0i(c94754Oe, "profile_pic_username"));
        }

        public Owner() {
            super(1734381089);
        }
    }

    /* loaded from: classes10.dex */
    public final class RankerScores extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C173847oc c173847oc = C173847oc.A00;
            return AbstractC167017dG.A0X(c173847oc, AbstractC166987dD.A0i(c173847oc, "fp"), AbstractC166987dD.A0i(c173847oc, "ptap"), "vm");
        }

        public RankerScores() {
            super(2078155233);
        }
    }

    /* loaded from: classes10.dex */
    public final class User extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class FriendshipStatus extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C95124Py c95124Py = C95124Py.A00;
                return AbstractC166987dD.A0k(new C4OM[]{AbstractC166987dD.A0i(c95124Py, "blocking"), AbstractC166987dD.A0i(c95124Py, "followed_by"), AbstractC58321PtD.A0W(c95124Py), AbstractC166987dD.A0i(c95124Py, "incoming_request"), AbstractC58322PtE.A0W(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_eligible_to_subscribe"), AbstractC166987dD.A0i(c95124Py, "is_feed_favorite"), AbstractC166987dD.A0i(c95124Py, "is_muting_reel"), AbstractC58319PtB.A0O(c95124Py), AbstractC166987dD.A0i(c95124Py, "is_restricted"), AbstractC166987dD.A0i(c95124Py, "is_viewer_unconnected"), AbstractC166987dD.A0i(c95124Py, "muting"), AbstractC166987dD.A0i(c95124Py, "outgoing_request"), AbstractC166987dD.A0i(c95124Py, "subscribed")});
            }

            public FriendshipStatus() {
                super(-1273067572);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            C4OW A0i = AbstractC166987dD.A0i(c94754Oe, AbstractC111324zv.A00(750));
            C4OK A0M = AbstractC58322PtE.A0M(FriendshipStatus.class, -1273067572);
            C4OW A0E = AbstractC58319PtB.A0E(c94754Oe);
            C4OW A0R = AbstractC58321PtD.A0R(c94754Oe);
            C95124Py c95124Py = C95124Py.A00;
            return AbstractC166987dD.A0k(new C4OM[]{A0i, A0M, A0E, A0R, AbstractC166987dD.A0i(c95124Py, "is_favorite_for_stories"), AbstractC58319PtB.A0O(c95124Py), AbstractC58319PtB.A0P(c95124Py), AbstractC166987dD.A0i(c94754Oe, "live_broadcast_id"), AbstractC166987dD.A0i(C94894Ou.A00, "live_broadcast_visibility"), AbstractC166987dD.A0i(c94754Oe, "live_subscription_status"), AbstractC58319PtB.A0H(c94754Oe), AbstractC58319PtB.A0K(c94754Oe), AbstractC58319PtB.A0Q(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC58319PtB.A0G(c94754Oe)});
        }

        public User() {
            super(1225606407);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C4OM[] c4omArr = new C4OM[30];
        C95124Py c95124Py = C95124Py.A00;
        C4OW A0i = AbstractC166987dD.A0i(c95124Py, "birthday_badge_enabled");
        C4OK A0O = AbstractC58318PtA.A0O(Broadcast.class, "broadcast", -1287870522);
        C4OW A0i2 = AbstractC166987dD.A0i(c95124Py, "can_react_with_avatar");
        C4OW A0i3 = AbstractC166987dD.A0i(c95124Py, "can_reply");
        C4OW A0i4 = AbstractC166987dD.A0i(c95124Py, "can_reshare");
        C67A c67a = C67A.A00;
        C4OW A0i5 = AbstractC166987dD.A0i(c67a, "expiring_at");
        C4OW A0i6 = AbstractC166987dD.A0i(c95124Py, "has_besties_media");
        C4OW A0i7 = AbstractC166987dD.A0i(c95124Py, "has_fan_club_media");
        C4OW A0i8 = AbstractC166987dD.A0i(c95124Py, "has_video");
        C4OW A0i9 = AbstractC166987dD.A0i(c95124Py, "hide_from_feed_unit");
        C4OK A0h = AbstractC166987dD.A0h(C4OO.A00(), HypeCommenterList.class, "hype_commenter_list", -431464446);
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW A0P = AbstractC58320PtC.A0P(c94754Oe);
        C4OW A0i10 = AbstractC166987dD.A0i(c95124Py, "is_cacheable");
        C4OW A0i11 = AbstractC166987dD.A0i(c95124Py, "is_nux");
        C4OK A0h2 = AbstractC166987dD.A0h(C4OO.A00(), Items.class, DialogModule.KEY_ITEMS, 1879368680);
        C4OW A0i12 = AbstractC166987dD.A0i(C173847oc.A00, "latest_besties_reel_media");
        C4OW A0i13 = AbstractC166987dD.A0i(c67a, "latest_reel_media");
        C94894Ou c94894Ou = C94894Ou.A00;
        return AbstractC58321PtD.A0Z(new C4OM[]{AbstractC166987dD.A0i(c94894Ou, "story_duration_secs"), AbstractC58318PtA.A0O(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 1225606407), AbstractC58318PtA.A0O(Owner.class, "owner", 1734381089)}, c4omArr, AbstractC31175DnJ.A1b(new C4OM[]{A0i, A0O, A0i2, A0i3, A0i4, A0i5, A0i6, A0i7, A0i8, A0i9, A0h, A0P, A0i10, A0i11, A0h2, A0i12, A0i13, AbstractC166987dD.A0i(c94894Ou, "media_count"), AbstractC166987dD.A0i(c95124Py, "muted"), AbstractC166987dD.A0i(c94894Ou, "prefetch_count"), AbstractC166987dD.A0i(c94894Ou, AbstractC111324zv.A00(510)), AbstractC58318PtA.A0O(RankerScores.class, "ranker_scores", 2078155233), AbstractC166987dD.A0i(c94754Oe, "reel_type"), AbstractC166987dD.A0i(c94894Ou, "seen"), AbstractC166987dD.A0i(c94894Ou, "seen_ranked_position"), AbstractC166987dD.A0i(c95124Py, "should_prefetch"), AbstractC166987dD.A0i(c95124Py, "show_fan_club_stories_teaser")}, c4omArr) ? 1 : 0, 27, 3);
    }

    public ReelDictFragmentImpl() {
        super(1884166355);
    }
}
