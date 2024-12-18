package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Calendar;

/* renamed from: X.Iab, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41588Iab {
    public Long A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final C38321qM A03;
    public final C75113Zb A04;

    public static final void A00(C41588Iab c41588Iab, Integer num, String str, String str2) {
        String str3;
        Long l;
        long j;
        Long A0j;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41588Iab.A01, "instagram_ad_carousel_on_demand_load");
        int hashCode = str.hashCode();
        Long l2 = null;
        if (hashCode != -1867169789) {
            if (hashCode != -1086574198) {
                if (hashCode == 109757538 && str.equals("start")) {
                    c41588Iab.A00 = Long.valueOf(Calendar.getInstance().getTimeInMillis());
                }
                C38321qM c38321qM = c41588Iab.A03;
                String id = c38321qM.getId();
                EnumC40111tc BRp = c38321qM.BRp();
                if (!A0f.isSampled() && id != null) {
                    AbstractC37300Gc1.A0l(A0f, id);
                    AbstractC37301Gc2.A0y(A0f, BRp.A00);
                    String CAR = c38321qM.CAR();
                    if (CAR == null) {
                        CAR = "";
                    }
                    AbstractC37300Gc1.A0o(A0f, CAR);
                    A0f.AAP(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str);
                    String A07 = AbstractC41071vF.A07(c41588Iab.A02, c38321qM);
                    if (A07 != null && (A0j = AbstractC166997dE.A0j(A07)) != null) {
                        j = A0j.longValue();
                    } else {
                        j = 0;
                    }
                    AbstractC37301Gc2.A0z(A0f, j);
                    A0f.A9K("index", AbstractC31171DnF.A0V(c41588Iab.A04.A02));
                    A0f.A9K("current_size", AbstractC31171DnF.A0V(c38321qM.A0p()));
                    A0f.A9K("total_size", AbstractC31171DnF.A0V(c38321qM.A14()));
                    A0f.A9K(AbstractC58317Pt9.A00(13), AbstractC25234BEr.A0X(A0f, num, "error_message", str2));
                    A0f.A9K("latency", l2);
                    A0f.Cht();
                    return;
                }
            }
            str3 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
        } else {
            str3 = "success";
        }
        if (str.equals(str3) && (l = c41588Iab.A00) != null) {
            l2 = Long.valueOf(Calendar.getInstance().getTimeInMillis() - l.longValue());
        }
        C38321qM c38321qM2 = c41588Iab.A03;
        String id2 = c38321qM2.getId();
        EnumC40111tc BRp2 = c38321qM2.BRp();
        if (!A0f.isSampled()) {
        }
    }

    public C41588Iab(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A03 = c38321qM;
        this.A04 = c75113Zb;
        this.A02 = userSession;
        this.A01 = AbstractC12220kQ.A01(null, userSession);
    }
}
