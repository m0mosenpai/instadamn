package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Oos, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55726Oos implements InterfaceC65345TiS {
    public final /* synthetic */ List A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ InterfaceC24901Jp A02;

    public C55726Oos(List list, Map map, InterfaceC24901Jp interfaceC24901Jp) {
        this.A01 = map;
        this.A00 = list;
        this.A02 = interfaceC24901Jp;
    }

    @Override // X.InterfaceC65345TiS
    public final void Dgd(SYG syg, EnumC61185Rgl enumC61185Rgl, Map map) {
        String str;
        ArrayList arrayList;
        O77 o77 = (O77) AbstractC166997dE.A0m(AbstractC62346S7r.A00, syg.A00);
        Map map2 = this.A01;
        String str2 = "";
        if (o77 == null) {
            str = "";
        } else {
            str = o77.A00;
        }
        map2.put("fetch_status_error_code", str);
        if (o77 != null) {
            str2 = o77.A01;
        }
        map2.put("fetch_status_error_description", str2);
        Object obj = map2.get("product_price");
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
        Map A04 = C15500q5.A04(obj);
        Object obj2 = map2.get("price_info");
        C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>>");
        Map A042 = C15500q5.A04(obj2);
        if (syg.A00 == 0) {
            map2.put("product_status", MessageAvailabilityResponseId$Companion.AVAILABLE);
            for (Object obj3 : this.A00) {
                if (map.containsKey(obj3)) {
                    AbstractC61609RqY abstractC61609RqY = (AbstractC61609RqY) map.get(obj3);
                    if (abstractC61609RqY != null) {
                        A04.put(obj3, abstractC61609RqY.A03());
                        List<C51668Mrz> A07 = abstractC61609RqY.A07();
                        if (A07 != null) {
                            arrayList = AbstractC167017dG.A0q(A07);
                            for (C51668Mrz c51668Mrz : A07) {
                                C09530e4 A1L = AbstractC166987dD.A1L("formattedPrice", c51668Mrz.A03);
                                C09530e4 A1L2 = AbstractC166987dD.A1L("periodCount", Integer.valueOf(c51668Mrz.A00));
                                C09530e4 A1L3 = AbstractC166987dD.A1L("billingPeriod", c51668Mrz.A05);
                                C09530e4 A1L4 = AbstractC166987dD.A1L("billingPeriodValue", Integer.valueOf(c51668Mrz.A01));
                                String plainString = new BigDecimal(String.valueOf(c51668Mrz.A02 / 1000000.0d)).toPlainString();
                                C14360o3.A07(plainString);
                                arrayList.add(AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, AbstractC166987dD.A1L("price", plainString), AbstractC166987dD.A1L("offerId", c51668Mrz.A04)));
                            }
                        } else {
                            arrayList = null;
                        }
                        C09530e4 A1L5 = AbstractC166987dD.A1L(AbstractC58317Pt9.A00(344), obj3);
                        C09530e4 A1L6 = AbstractC166987dD.A1L("externalProductID", abstractC61609RqY.A05());
                        C09530e4 A1L7 = AbstractC166987dD.A1L("formattedPrice", abstractC61609RqY.A03());
                        String plainString2 = new BigDecimal(String.valueOf(abstractC61609RqY.A01() / 1000000.0d)).toPlainString();
                        C14360o3.A07(plainString2);
                        A042.put(obj3, AbstractC06930Yk.A07(A1L5, A1L6, A1L7, AbstractC166987dD.A1L("amount", plainString2), AbstractC166987dD.A1L("currencyCode", abstractC61609RqY.A04()), AbstractC166987dD.A1L("offers", arrayList)));
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
        } else {
            map2.put("product_status", "UNAVAILABLE");
        }
        InterfaceC24901Jp interfaceC24901Jp = this.A02;
        if (interfaceC24901Jp.isActive()) {
            interfaceC24901Jp.resumeWith(null);
        }
    }
}
