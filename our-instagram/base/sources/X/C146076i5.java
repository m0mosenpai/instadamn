package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.ProductWrapperIntf;
import com.instagram.user.model.ScheduledLiveProductsMetadataIntf;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventLiveMetadata;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6i5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146076i5 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final String A02;

    public C146076i5(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = interfaceC11380iw;
    }

    public final void A04(UpcomingEvent upcomingEvent, String str, String str2, String str3) {
        long j;
        String str4;
        List BhR;
        Long l;
        String productId;
        User BSW;
        ProductCollection Ap9;
        Long A0k;
        C14360o3.A0B(upcomingEvent, 0);
        UserSession userSession = this.A01;
        C18920wW A01 = AbstractC12220kQ.A01(this.A00, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_upcoming_event_action");
        if (A00.isSampled()) {
            A00.AAP("action", str2);
            String id = upcomingEvent.getId();
            if (id != null && (A0k = AbstractC003100w.A0k(10, id)) != null) {
                j = A0k.longValue();
            } else {
                j = 0;
            }
            A00.A9K("upcoming_event_id", Long.valueOf(j));
            A00.AAP("m_pk", str);
            A00.AAP("source_of_action", str3);
            A00.AAP("tracking_token", A02(userSession, str));
            A00.A9K("ad_campaign_id", A01(userSession, str));
            A00.A9K("ad_id", A00(userSession, str));
            A00.AAP("prior_module", this.A02);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP(MSV.A00(597), AbstractC54243NyO.A00(upcomingEvent));
            UpcomingEventLiveMetadata BNx = upcomingEvent.BNx();
            if (BNx != null) {
                ScheduledLiveProductsMetadataIntf Bui = BNx.Bui();
                ArrayList arrayList = null;
                if (Bui != null && (Ap9 = Bui.Ap9()) != null) {
                    str4 = Ap9.Ap3();
                } else {
                    str4 = null;
                }
                A00.AAP("collection_id", str4);
                ScheduledLiveProductsMetadataIntf Bui2 = BNx.Bui();
                if (Bui2 != null && (BSW = Bui2.BSW()) != null) {
                    A00.A9K("merchant_id", C4SX.A00(AbstractC76433bn.A00(BSW)).A00);
                }
                ScheduledLiveProductsMetadataIntf Bui3 = BNx.Bui();
                if (Bui3 != null && (BhR = Bui3.BhR()) != null) {
                    ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(BhR, 10));
                    Iterator it = BhR.iterator();
                    while (it.hasNext()) {
                        ProductDetailsProductItemDictIntf Bgw = ((ProductWrapperIntf) it.next()).Bgw();
                        if (Bgw != null && (productId = Bgw.getProductId()) != null) {
                            l = AbstractC003100w.A0k(10, productId);
                        } else {
                            l = null;
                        }
                        arrayList2.add(l);
                    }
                    arrayList = arrayList2;
                }
                A00.AAk("product_ids", arrayList);
                A00.A7v("has_event_started", Boolean.valueOf(AbstractC41774Ieq.A06(upcomingEvent)));
            }
            A00.Cht();
        }
    }

    public final void A05(String str, String str2) {
        Long l;
        Long l2 = null;
        if (str != null && AbstractC001900j.A0a(str, "upcoming_event_reminder_type", false)) {
            android.net.Uri A03 = AbstractC08820cl.A03(str);
            C14360o3.A07(A03);
            String queryParameter = A03.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String queryParameter2 = A03.getQueryParameter("upcoming_event_id");
            if (queryParameter2 != null) {
                l = AbstractC003100w.A0k(10, queryParameter2);
            } else {
                l = null;
            }
            String queryParameter3 = A03.getQueryParameter("upcoming_event_reminder_type");
            if (queryParameter3 != null) {
                l2 = AbstractC003100w.A0k(10, queryParameter3);
            }
            A03(this, l, l2, queryParameter, str2, "push_notification", null, null);
        }
    }

    public static final void A03(C146076i5 c146076i5, Long l, Long l2, String str, String str2, String str3, String str4, String str5) {
        long j;
        Long A00;
        UserSession userSession = c146076i5.A01;
        C18920wW A01 = AbstractC12220kQ.A01(c146076i5.A00, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "instagram_upcoming_event_action");
        if (A002.isSampled()) {
            A002.AAP("action", str2);
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            A002.A9K("upcoming_event_id", Long.valueOf(j));
            A002.AAP("m_pk", str);
            A002.A9K("notification_type", l2);
            A002.AAP("source_of_action", str3);
            if (str5 == null) {
                str5 = A02(userSession, str);
            }
            A002.AAP("tracking_token", str5);
            A002.A9K("ad_campaign_id", A01(userSession, str));
            if (str4 == null || (A00 = AbstractC003100w.A0k(10, str4)) == null) {
                A00 = A00(userSession, str);
            }
            A002.A9K("ad_id", A00);
            A002.AAP("prior_module", null);
            A002.AAP("nav_chain", C1QM.A00.A02.A00);
            A002.Cht();
        }
    }

    public static final Long A00(UserSession userSession, String str) {
        String A07;
        C38321qM A02 = C1DW.A00(userSession).A02(str);
        if (A02 == null || (A07 = AbstractC41071vF.A07(userSession, A02)) == null) {
            return null;
        }
        return AbstractC003100w.A0k(10, A07);
    }

    public static final Long A01(UserSession userSession, String str) {
        String A2b;
        C38321qM A02 = C1DW.A00(userSession).A02(str);
        if (A02 == null) {
            return null;
        }
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(A02);
        if (A00 != null) {
            A2b = A00.A0W;
        } else {
            A2b = A02.A2b();
        }
        if (A2b == null) {
            return null;
        }
        return AbstractC003100w.A0k(10, A2b);
    }

    public static final String A02(UserSession userSession, String str) {
        C38321qM A02 = C1DW.A00(userSession).A02(str);
        if (A02 != null) {
            String A06 = AbstractC41071vF.A06(userSession, A02);
            if (A06 == null) {
                return A02.A0C.getOrganicTrackingToken();
            }
            return A06;
        }
        return null;
    }
}
