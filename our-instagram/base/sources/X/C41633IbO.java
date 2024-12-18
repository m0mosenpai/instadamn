package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IbO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41633IbO {
    public final C57112jm A00;
    public final C39118HJq A01;
    public final C63622uj A02;
    public final IMI A03;
    public final C41223IMo A04;
    public final C39112HJk A05;
    public final HK6 A06;
    public final C39125HJx A07;
    public final List A08;

    public C41633IbO(UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, C64952wt c64952wt, String str, String str2, String str3, String str4, List list) {
        C41223IMo c41223IMo;
        C14360o3.A0B(c64952wt, 10);
        this.A00 = c57112jm;
        this.A08 = list;
        this.A02 = new C63622uj();
        IMI imi = new IMI(userSession, interfaceC60442pS, str, str2, str3, str4);
        this.A03 = imi;
        this.A05 = new C39112HJk(AbstractC37302Gc3.A0J(userSession), new C42367IpU(0), imi);
        this.A06 = new HK6(AbstractC37302Gc3.A0J(userSession), new C42367IpU(1), imi);
        this.A01 = new C39118HJq(userSession, interfaceC60442pS, c64952wt, str2);
        if (I6P.A00(interfaceC60442pS.getModuleName())) {
            c41223IMo = new C41223IMo(userSession, interfaceC60442pS);
        } else {
            c41223IMo = null;
        }
        this.A04 = c41223IMo;
        this.A07 = new C39125HJx(userSession, interfaceC60442pS, c64952wt, c41223IMo, str2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.HjU, java.lang.Object] */
    public static final C59062n7 A00(C41024IEt c41024IEt, H7J h7j, C41633IbO c41633IbO, String str) {
        C59072n8 c59072n8;
        ProductFeedItem productFeedItem = h7j.A02;
        int intValue = productFeedItem.A06.intValue();
        if (intValue != 0) {
            if (intValue == 3 || intValue == 2) {
                c59072n8 = C59062n7.A00(h7j, c41024IEt, h7j.A04);
                c59072n8.A00(c41633IbO.A07);
                List list = c41633IbO.A08;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        c59072n8.A00((InterfaceC43071ya) it.next());
                    }
                }
                return c59072n8.A01();
            }
        } else {
            MultiProductComponent multiProductComponent = productFeedItem.A01;
            if (multiProductComponent != null) {
                String str2 = h7j.A05;
                FiltersLoggingInfo filtersLoggingInfo = h7j.A01;
                Long l = h7j.A00;
                ?? obj = new Object();
                obj.A01 = multiProductComponent;
                obj.A03 = str2;
                obj.A00 = filtersLoggingInfo;
                obj.A04 = str;
                obj.A02 = l;
                C59072n8 A00 = C59062n7.A00(obj, c41024IEt, h7j.A04);
                A00.A00(c41633IbO.A05);
                A00.A00(c41633IbO.A06);
                return A00.A01();
            }
        }
        c59072n8 = C59062n7.A00(h7j, c41024IEt, h7j.A04);
        return c59072n8.A01();
    }

    public final void A01(View view, H7J h7j) {
        this.A00.A05(view, this.A02.A00(h7j.A04));
    }

    public final void A02(C41024IEt c41024IEt, H7J h7j, String str) {
        this.A02.A01(A00(c41024IEt, h7j, this, str), h7j.A04);
    }
}
