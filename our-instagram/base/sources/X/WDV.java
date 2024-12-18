package X;

import com.facebookpay.logging.LoggingContext;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WDV {
    public C69478Vo1 A00;
    public C69478Vo1 A01;
    public C69478Vo1 A02;
    public UFP A03;
    public LoggingContext A04;
    public UFS A05;
    public C63406Sjd A06;
    public java.util.Set A07;
    public final C58252li A08 = new C58252li();
    public final C58252li A09;
    public final C2GS A0A;
    public final InterfaceC58362lv A0B;
    public final InterfaceC58362lv A0C;

    public static final void A00(WDV wdv) {
        C69478Vo1 c69478Vo1 = wdv.A01;
        if (c69478Vo1 == null) {
            C69478Vo1 c69478Vo12 = wdv.A02;
            if (c69478Vo12 == null) {
                C14360o3.A0F("uiState");
                throw C00O.createAndThrow();
            }
            ShippingAddress shippingAddress = c69478Vo12.A01;
            ShippingAddress shippingAddress2 = c69478Vo12.A00;
            String str = c69478Vo12.A0A;
            List list = c69478Vo12.A0C;
            String str2 = c69478Vo12.A07;
            Map map = c69478Vo12.A0D;
            List list2 = c69478Vo12.A0B;
            String str3 = c69478Vo12.A06;
            String str4 = c69478Vo12.A09;
            String str5 = c69478Vo12.A04;
            c69478Vo1 = new C69478Vo1(c69478Vo12.A0E, shippingAddress, shippingAddress2, c69478Vo12.A02, str, str2, c69478Vo12.A0F, c69478Vo12.A0G, str3, str4, str5, c69478Vo12.A08, c69478Vo12.A05, c69478Vo12.A03, list, list2, map);
        }
        wdv.A01 = c69478Vo1;
        if (C14360o3.A0K(c69478Vo1.A02, true)) {
            wdv.A0A.A0B(true);
        }
        A01(wdv, false);
    }

    public static final void A01(WDV wdv, boolean z) {
        C69478Vo1 c69478Vo1;
        Long l;
        Long l2;
        String str;
        String str2;
        if ((z || !C63406Sjd.A0H(wdv.A06)) && (c69478Vo1 = wdv.A01) != null) {
            Wap wap = C2FP.A01().A04;
            LoggingContext loggingContext = wdv.A04;
            if (loggingContext == null) {
                str2 = "loggingContext";
            } else {
                UFP ufp = wdv.A03;
                if (ufp == null) {
                    str2 = "incentiveViewModel";
                } else {
                    List A06 = ufp.A06();
                    String str3 = c69478Vo1.A0F;
                    if (str3 != null) {
                        l = AbstractC003100w.A0k(10, str3);
                    } else {
                        l = null;
                    }
                    UFS ufs = wdv.A05;
                    if (ufs == null) {
                        str2 = "otcViewModel";
                    } else {
                        C70073W1q A05 = ufs.A05();
                        ShippingAddress shippingAddress = c69478Vo1.A01;
                        if (shippingAddress != null && (str = shippingAddress.A04) != null) {
                            l2 = AbstractC003100w.A0k(10, str);
                        } else {
                            l2 = null;
                        }
                        String str4 = c69478Vo1.A0A;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C70199WGm.A08(A05, linkedHashMap);
                        if (l2 != null) {
                            linkedHashMap.put(AbstractC58317Pt9.A00(12), String.valueOf(l2.longValue()));
                        }
                        if (str4 != null) {
                            linkedHashMap.put(PaymentDetailChangeTypes$Companion.SHIPPING_OPTION_ID, str4);
                        }
                        Wap.A03(new C25531Mh(MSY.A0H(wap.A00, AbstractC58317Pt9.A00(724)), 119), loggingContext, new MIO(A06, l, loggingContext, linkedHashMap, MSV.A00(598), 5));
                        C63406Sjd.A0C(wdv.A08, c69478Vo1);
                        wdv.A00 = c69478Vo1;
                        wdv.A01 = null;
                        return;
                    }
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    public final void A02(C2GT c2gt) {
        InterfaceC58362lv interfaceC58362lv = this.A0C;
        if (interfaceC58362lv != null) {
            this.A08.A0E(c2gt, interfaceC58362lv);
        }
    }

    public final void A03(UFP ufp, LoggingContext loggingContext, UFS ufs, String str, String str2, List list, java.util.Set set) {
        List list2 = list;
        this.A07 = set;
        this.A04 = loggingContext;
        this.A05 = ufs;
        this.A03 = ufp;
        if (list == null) {
            list2 = C16930sl.A00;
        }
        List A03 = WF5.A03(ufp.A0C);
        if (A03 == null) {
            A03 = C16930sl.A00;
        }
        this.A02 = new C69478Vo1(loggingContext, null, null, null, null, null, str, str2, null, null, null, null, null, null, list2, A03, AbstractC06930Yk.A0E());
    }

    public final void A04(String str) {
        C69478Vo1 c69478Vo1 = this.A02;
        if (c69478Vo1 != null) {
            String str2 = c69478Vo1.A0F;
            String str3 = c69478Vo1.A0G;
            LoggingContext loggingContext = this.A04;
            if (loggingContext == null) {
                C14360o3.A0F("loggingContext");
                throw C00O.createAndThrow();
            }
            List list = c69478Vo1.A0C;
            List list2 = c69478Vo1.A0B;
            this.A02 = new C69478Vo1(loggingContext, c69478Vo1.A01, null, c69478Vo1.A02, c69478Vo1.A0A, null, str, str3, null, null, null, c69478Vo1.A08, c69478Vo1.A05, null, list, list2, AbstractC06930Yk.A0E());
            if (str2 == null) {
                A00(this);
            }
        }
    }

    public WDV() {
        C58252li c58252li = new C58252li();
        C63406Sjd.A0D(c58252li, null);
        this.A09 = c58252li;
        this.A0A = new C2GS();
        this.A06 = C63406Sjd.A03(null);
        this.A0B = new C70302WQh(this, 34);
        this.A0C = new C70302WQh(this, 33);
    }
}
