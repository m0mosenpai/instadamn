package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.EventPageNavigationMetadata;
import com.instagram.api.schemas.EventPageNavigationMetadataImpl;
import com.instagram.api.schemas.EventVisibilityType;
import com.instagram.api.schemas.IGLocalEventDict;
import com.instagram.api.schemas.IGLocalEventDictImpl;
import com.instagram.api.schemas.ScheduledLiveAffiliateInfo;
import com.instagram.api.schemas.ScheduledLiveAffiliateInfoImpl;
import com.instagram.api.schemas.ScheduledLiveDiscountInfo;
import com.instagram.api.schemas.ScheduledLiveDiscountInfoImpl;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductWrapper;
import com.instagram.user.model.ScheduledLiveProductsMetadata;
import com.instagram.user.model.UpcomingDropCampaignEventMetadata;
import com.instagram.user.model.UpcomingDropCampaignEventMetadataImpl;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.UpcomingEventLiveMetadata;
import com.instagram.user.model.UpcomingEventLiveMetadataImpl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IT3 {
    public static UpcomingEventImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            UpcomingDropCampaignEventMetadataImpl upcomingDropCampaignEventMetadataImpl = null;
            Long l2 = null;
            EventPageNavigationMetadataImpl eventPageNavigationMetadataImpl = null;
            String str = null;
            IGLocalEventDictImpl iGLocalEventDictImpl = null;
            Boolean bool2 = null;
            Long l3 = null;
            UpcomingEventLiveMetadataImpl upcomingEventLiveMetadataImpl = null;
            UpcomingEventMediaImpl upcomingEventMediaImpl = null;
            User user = null;
            String str2 = null;
            String str3 = null;
            UpcomingEventIDType upcomingEventIDType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("drops_campaign_metadata".equals(A0s)) {
                    upcomingDropCampaignEventMetadataImpl = IAF.parseFromJson(c16l);
                } else if ("end_time".equals(A0s)) {
                    l2 = AbstractC31173DnH.A0h(c16l);
                } else if ("event_page_metadata".equals(A0s)) {
                    eventPageNavigationMetadataImpl = Hn0.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("ig_local_event_dict".equals(A0s)) {
                    iGLocalEventDictImpl = AbstractC39993Hoa.parseFromJson(c16l);
                } else if ("is_ig_local_event".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("last_notification_time".equals(A0s)) {
                    l3 = AbstractC31173DnH.A0h(c16l);
                } else if ("live_metadata".equals(A0s)) {
                    upcomingEventLiveMetadataImpl = IAI.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1F(A0s)) {
                    upcomingEventMediaImpl = IRM.parseFromJson(c16l);
                } else if ("owner".equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("reminder_enabled".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (TraceFieldType.StartTime.equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("strong_id__".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("upcoming_event_id_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    upcomingEventIDType = (UpcomingEventIDType) UpcomingEventIDType.A01.get(A1P);
                    if (upcomingEventIDType == null) {
                        upcomingEventIDType = UpcomingEventIDType.A05;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "UpcomingEventImpl");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (l == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(TraceFieldType.StartTime, c16l, "UpcomingEventImpl");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "UpcomingEventImpl");
                } else if (upcomingEventIDType == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("upcoming_event_id_type", c16l, "UpcomingEventImpl");
                } else {
                    return new UpcomingEventImpl(eventPageNavigationMetadataImpl, iGLocalEventDictImpl, upcomingEventIDType, upcomingEventMediaImpl, upcomingDropCampaignEventMetadataImpl, upcomingEventLiveMetadataImpl, user, bool2, l2, l3, str, str2, str3, l.longValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("reminder_enabled", c16l, "UpcomingEventImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, UpcomingEventImpl upcomingEventImpl) {
        anonymousClass182.A0d();
        UpcomingDropCampaignEventMetadata upcomingDropCampaignEventMetadata = upcomingEventImpl.A05;
        if (upcomingDropCampaignEventMetadata != null) {
            anonymousClass182.A0r("drops_campaign_metadata");
            UpcomingDropCampaignEventMetadataImpl F7Z = upcomingDropCampaignEventMetadata.F7Z(new C37761pD(null));
            anonymousClass182.A0d();
            ProductCollection productCollection = F7Z.A01;
            if (productCollection != null) {
                anonymousClass182.A0r("collection_metadata");
                IT1.A00(anonymousClass182, productCollection.F7R(new C37761pD(null)));
            }
            UpcomingEventMedia upcomingEventMedia = F7Z.A00;
            if (upcomingEventMedia != null) {
                anonymousClass182.A0r("cover_media");
                IRM.A00(anonymousClass182, upcomingEventMedia.F6f());
            }
            String str = F7Z.A03;
            if (str != null) {
                anonymousClass182.A0S("drop_campaign_id", str);
            }
            String str2 = F7Z.A04;
            if (str2 != null) {
                anonymousClass182.A0S("launch_type_subtitle", str2);
            }
            User user = F7Z.A02;
            if (user != null) {
                AbstractC37300Gc1.A0x(anonymousClass182, user, "merchant");
            }
            List list = F7Z.A05;
            if (list != null) {
                Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "products", list);
                while (A0q.hasNext()) {
                    ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) A0q.next();
                    if (productDetailsProductItemDict != null) {
                        AbstractC111134zU.A00(anonymousClass182, productDetailsProductItemDict);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        Long l = upcomingEventImpl.A09;
        if (l != null) {
            anonymousClass182.A0R("end_time", l.longValue());
        }
        EventPageNavigationMetadata eventPageNavigationMetadata = upcomingEventImpl.A01;
        if (eventPageNavigationMetadata != null) {
            anonymousClass182.A0r("event_page_metadata");
            EventPageNavigationMetadataImpl EtE = eventPageNavigationMetadata.EtE();
            anonymousClass182.A0d();
            String str3 = EtE.A01;
            if (str3 != null) {
                anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str3);
            }
            Integer num = EtE.A00;
            if (num != null) {
                anonymousClass182.A0Q("reminder_count", num.intValue());
            }
            String str4 = EtE.A02;
            if (str4 != null) {
                anonymousClass182.A0S("subtitle", str4);
            }
            anonymousClass182.A0a();
        }
        AbstractC37301Gc2.A1D(anonymousClass182, upcomingEventImpl.A0B);
        IGLocalEventDict iGLocalEventDict = upcomingEventImpl.A02;
        if (iGLocalEventDict != null) {
            anonymousClass182.A0r("ig_local_event_dict");
            IGLocalEventDictImpl Ev7 = iGLocalEventDict.Ev7();
            anonymousClass182.A0d();
            String str5 = Ev7.A01;
            if (str5 != null) {
                anonymousClass182.A0S("ig_event_time_string", str5);
            }
            EventVisibilityType eventVisibilityType = Ev7.A00;
            if (eventVisibilityType != null) {
                anonymousClass182.A0S("ig_event_visibility", eventVisibilityType.A00);
            }
            anonymousClass182.A0a();
        }
        Boolean bool = upcomingEventImpl.A08;
        if (bool != null) {
            anonymousClass182.A0T("is_ig_local_event", bool.booleanValue());
        }
        Long l2 = upcomingEventImpl.A0A;
        if (l2 != null) {
            anonymousClass182.A0R("last_notification_time", l2.longValue());
        }
        UpcomingEventLiveMetadata upcomingEventLiveMetadata = upcomingEventImpl.A06;
        if (upcomingEventLiveMetadata != null) {
            anonymousClass182.A0r("live_metadata");
            UpcomingEventLiveMetadataImpl F7d = upcomingEventLiveMetadata.F7d(new C37761pD(null));
            anonymousClass182.A0d();
            String str6 = F7d.A03;
            if (str6 != null) {
                anonymousClass182.A0S(TraceFieldType.BroadcastId, str6);
            }
            Boolean bool2 = F7d.A01;
            if (bool2 != null) {
                anonymousClass182.A0T("is_broadcast_ended", bool2.booleanValue());
            }
            anonymousClass182.A0T("is_scheduled_live", F7d.A05);
            anonymousClass182.A0T("live_notifs_enabled", F7d.A06);
            String str7 = F7d.A04;
            if (str7 != null) {
                anonymousClass182.A0S("post_live_media_id", str7);
            }
            ScheduledLiveProductsMetadata scheduledLiveProductsMetadata = F7d.A00;
            if (scheduledLiveProductsMetadata != null) {
                anonymousClass182.A0r("shopping_info");
                anonymousClass182.A0d();
                ScheduledLiveAffiliateInfo scheduledLiveAffiliateInfo = scheduledLiveProductsMetadata.A00;
                if (scheduledLiveAffiliateInfo != null) {
                    anonymousClass182.A0r("affiliate_info");
                    ScheduledLiveAffiliateInfoImpl EzJ = scheduledLiveAffiliateInfo.EzJ();
                    anonymousClass182.A0d();
                    String str8 = EzJ.A00;
                    if (str8 != null) {
                        anonymousClass182.A0S("disclosure_tag", str8);
                    }
                    anonymousClass182.A0a();
                }
                ProductCollection productCollection2 = scheduledLiveProductsMetadata.A02;
                if (productCollection2 != null) {
                    anonymousClass182.A0r("collection_metadata");
                    IT1.A00(anonymousClass182, productCollection2.F7R(new C37761pD(null)));
                }
                ScheduledLiveDiscountInfo scheduledLiveDiscountInfo = scheduledLiveProductsMetadata.A01;
                if (scheduledLiveDiscountInfo != null) {
                    anonymousClass182.A0r("discount_info");
                    ScheduledLiveDiscountInfoImpl EzK = scheduledLiveDiscountInfo.EzK();
                    anonymousClass182.A0d();
                    String str9 = EzK.A01;
                    if (str9 != null) {
                        anonymousClass182.A0S("discount_id", str9);
                    }
                    Boolean bool3 = EzK.A00;
                    if (bool3 != null) {
                        anonymousClass182.A0T("is_auto_tagged", bool3.booleanValue());
                    }
                    anonymousClass182.A0a();
                }
                User user2 = scheduledLiveProductsMetadata.A03;
                if (user2 != null) {
                    AbstractC37300Gc1.A0x(anonymousClass182, user2, "merchant");
                }
                List list2 = scheduledLiveProductsMetadata.A04;
                if (list2 != null) {
                    Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "products", list2);
                    while (A0q2.hasNext()) {
                        ProductWrapper productWrapper = (ProductWrapper) A0q2.next();
                        if (productWrapper != null) {
                            IT2.A00(anonymousClass182, productWrapper);
                        }
                    }
                    anonymousClass182.A0Z();
                }
                anonymousClass182.A0a();
            }
            Integer num2 = F7d.A02;
            if (num2 != null) {
                anonymousClass182.A0Q("visibility", num2.intValue());
            }
            anonymousClass182.A0a();
        }
        UpcomingEventMedia upcomingEventMedia2 = upcomingEventImpl.A04;
        if (upcomingEventMedia2 != null) {
            anonymousClass182.A0r("media");
            IRM.A00(anonymousClass182, upcomingEventMedia2.F6f());
        }
        User user3 = upcomingEventImpl.A07;
        if (user3 != null) {
            AbstractC37300Gc1.A0x(anonymousClass182, user3, "owner");
        }
        anonymousClass182.A0T("reminder_enabled", upcomingEventImpl.A0E);
        anonymousClass182.A0R(TraceFieldType.StartTime, upcomingEventImpl.A00);
        String str10 = upcomingEventImpl.A0C;
        if (str10 != null) {
            anonymousClass182.A0S("strong_id__", str10);
        }
        AbstractC37301Gc2.A1F(anonymousClass182, upcomingEventImpl.A0D);
        UpcomingEventIDType upcomingEventIDType = upcomingEventImpl.A03;
        if (upcomingEventIDType != null) {
            anonymousClass182.A0S("upcoming_event_id_type", upcomingEventIDType.A00);
        }
        anonymousClass182.A0a();
    }
}
