package X;

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

/* loaded from: classes7.dex */
public final class HK5 extends AbstractC64412w0 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final UpcomingEvent A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public HK5(InterfaceC11380iw interfaceC11380iw, UserSession userSession, UpcomingEvent upcomingEvent, String str, String str2, String str3) {
        C14360o3.A0B(userSession, 2);
        this.A03 = str;
        this.A01 = userSession;
        this.A02 = upcomingEvent;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.AbstractC64412w0
    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        long j2;
        String str;
        List BhR;
        Long l;
        String productId;
        User BSW;
        ProductCollection Ap9;
        Long A0j;
        UserSession userSession = this.A01;
        String str2 = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        UpcomingEvent upcomingEvent = this.A02;
        String str3 = this.A03;
        String str4 = this.A05;
        Double A0S = AbstractC37302Gc3.A0S(j);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), AbstractC111324zv.A00(4703));
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, "upcoming_event_sheet_time_spent");
            String id = upcomingEvent.getId();
            if (id != null && (A0j = AbstractC166997dE.A0j(id)) != null) {
                j2 = A0j.longValue();
            } else {
                j2 = 0;
            }
            A0f.A9K("upcoming_event_id", Long.valueOf(j2));
            AbstractC37300Gc1.A0l(A0f, str3);
            A0f.AAP("source_of_action", str4);
            A0f.A8I("event_sheet_time_spent", A0S);
            AbstractC37300Gc1.A0o(A0f, C146076i5.A02(userSession, str3));
            A0f.A9K("ad_campaign_id", C146076i5.A01(userSession, str3));
            AbstractC37300Gc1.A0g(A0f, C146076i5.A00(userSession, str3));
            AbstractC25233BEq.A17(A0f, "prior_module", str2);
            A0f.AAP(MSV.A00(597), AbstractC54243NyO.A00(upcomingEvent));
            UpcomingEventLiveMetadata BNx = upcomingEvent.BNx();
            if (BNx != null) {
                ScheduledLiveProductsMetadataIntf Bui = BNx.Bui();
                ArrayList arrayList = null;
                if (Bui != null && (Ap9 = Bui.Ap9()) != null) {
                    str = Ap9.Ap3();
                } else {
                    str = null;
                }
                A0f.AAP("collection_id", str);
                ScheduledLiveProductsMetadataIntf Bui2 = BNx.Bui();
                if (Bui2 != null && (BSW = Bui2.BSW()) != null) {
                    A0f.A9K("merchant_id", C4SX.A00(AbstractC76433bn.A00(BSW)).A00);
                }
                ScheduledLiveProductsMetadataIntf Bui3 = BNx.Bui();
                if (Bui3 != null && (BhR = Bui3.BhR()) != null) {
                    ArrayList A0i = AbstractC167007dF.A0i(BhR);
                    Iterator it = BhR.iterator();
                    while (it.hasNext()) {
                        ProductDetailsProductItemDictIntf Bgw = ((ProductWrapperIntf) it.next()).Bgw();
                        if (Bgw != null && (productId = Bgw.getProductId()) != null) {
                            l = AbstractC003100w.A0k(10, productId);
                        } else {
                            l = null;
                        }
                        A0i.add(l);
                    }
                    arrayList = A0i;
                }
                A0f.AAk("product_ids", arrayList);
                A0f.A7v(AbstractC111324zv.A00(4534), Boolean.valueOf(AbstractC41774Ieq.A06(upcomingEvent)));
            }
            A0f.Cht();
        }
    }
}
