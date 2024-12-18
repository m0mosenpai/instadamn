package X;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.SfT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63222SfT {
    public final InterfaceC65615To6 A00;

    public final void A04(SYG syg, Map map) {
        String str;
        C14360o3.A0B(map, 1);
        if (map.isEmpty()) {
            map = AbstractC166987dD.A1I();
            AbstractC63051SbX.A00(syg, map);
        }
        int i = syg.A00;
        InterfaceC65615To6 interfaceC65615To6 = this.A00;
        if (i == 1) {
            str = "user_create_dcppayment_cancel";
        } else {
            str = "client_create_dcppayment_fail";
        }
        interfaceC65615To6.Ci3(map, null, str);
    }

    public final void A07(String str, String str2, List list) {
        C14360o3.A0B(str, 1);
        this.A00.Ci3(AbstractC25232BEp.A1F(RhW.A0S.A00, str2, AbstractC166987dD.A1L(RhW.A0n.A00, str), AbstractC166987dD.A1L(RhW.A0U.A00, AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", list, null))), null, "client_fetch_dcpcatalog_fail");
    }

    public final void A08(String str, Map map) {
        C14360o3.A0B(str, 0);
        InterfaceC65615To6 interfaceC65615To6 = this.A00;
        C64102SzJ c64102SzJ = (C64102SzJ) interfaceC65615To6;
        c64102SzJ.A00 = AbstractC58442PvL.A02();
        c64102SzJ.A01 = str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        AbstractC58318PtA.A1M(RhW.A0n, str, A1I);
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            A1I.put(((RhW) A1K.getKey()).A00, A1K.getValue());
        }
        interfaceC65615To6.Ci3(A1I, null, "client_load_dcpiap_init");
    }

    public final void A09(List list, String str) {
        C14360o3.A0B(str, 1);
        this.A00.Ci3(AbstractC25233BEq.A0p(RhW.A0U.A00, AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", list, null), AbstractC166987dD.A1L(RhW.A0n.A00, str)), null, "client_fetch_dcpcatalog_init");
    }

    public final void A0A(List list, String str) {
        C14360o3.A0B(str, 1);
        this.A00.Ci3(AbstractC25233BEq.A0p(RhW.A0U.A00, AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", list, null), AbstractC166987dD.A1L(RhW.A0n.A00, str)), null, "client_fetch_dcpcatalog_success");
    }

    public final void A0B(List list, List list2) {
        if (list2 != null && !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                QIg qIg = (QIg) it.next();
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                A1I.put(RhW.A0V.A00, qIg.A02);
                A1I.put(RhW.A0R.A00, String.valueOf(qIg.A01));
                A1I.put(RhW.A0S.A00, qIg.A03);
                this.A00.Ci3(A1I, null, "client_verify_dcppayment_fail");
            }
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Purchase purchase = (Purchase) it2.next();
            LinkedHashMap A1I2 = AbstractC166987dD.A1I();
            A1I2.put(RhW.A0V.A00, purchase.A01());
            this.A00.Ci3(A1I2, null, "client_verify_dcppayment_fail");
        }
    }

    public final void A03(SYG syg, String str, String str2, Map map) {
        if (map == null) {
            map = AbstractC06930Yk.A0E();
        }
        LinkedHashMap A03 = AbstractC06930Yk.A03(map);
        AbstractC58318PtA.A1M(RhW.A0Q, str, A03);
        if (syg != null) {
            AbstractC63051SbX.A00(syg, A03);
        } else {
            AbstractC63051SbX.A02("Server verification failed", A03);
        }
        if (str2 != null) {
            AbstractC58318PtA.A1M(RhW.A0V, str2, A03);
        }
        this.A00.Ci3(A03, null, "client_create_dcp_external_confirm_fail");
    }

    public final void A05(SYG syg, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("extra_error_message", AnonymousClass001.A0R("Unable to fetch SKU: ", AbstractC166987dD.A1A(RhW.A0U.A00, map)));
        AbstractC63051SbX.A00(syg, linkedHashMap);
        this.A00.Ci3(linkedHashMap, null, "client_create_dcppayment_fail");
    }

    public final void A06(EnumC61185Rgl enumC61185Rgl, String str, Map map) {
        if (map == null) {
            map = AbstractC06930Yk.A0E();
        }
        LinkedHashMap A03 = AbstractC06930Yk.A03(map);
        AbstractC63051SbX.A02(enumC61185Rgl.A00, A03);
        A03.put("DcpResultCode", enumC61185Rgl.name());
        AbstractC58318PtA.A1M(RhW.A0V, str, A03);
        this.A00.Ci3(A03, null, "client_create_iap_external_confirm_warning");
    }

    public C63222SfT(InterfaceC65615To6 interfaceC65615To6) {
        this.A00 = interfaceC65615To6;
    }

    public static final LinkedHashMap A00(SYG syg, Collection collection) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        A1I.put("item_count", String.valueOf(collection.size()));
        int i = 0;
        for (Object obj : collection) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            Purchase purchase = (Purchase) obj;
            A1I.put(AnonymousClass001.A0c("item_", "_external_transaction_id", i), purchase.A01());
            A1I.put(AnonymousClass001.A0c("item_", "_external_product_id", i), AbstractC61812Ru6.A00(purchase));
            String A0c = AnonymousClass001.A0c("item_", "_external_purchase_time", i);
            JSONObject jSONObject = purchase.A02;
            A1I.put(A0c, AnonymousClass001.A0Q("", jSONObject.optLong("purchaseTime")));
            A1I.put(AnonymousClass001.A0c("item_", "_external_purchase_signature", i), purchase.A01);
            A1I.put(AnonymousClass001.A0c("item_", "_developer_payload", i), jSONObject.optString("developerPayload"));
            A1I.put(AnonymousClass001.A0c("item_", "_external_purchase_token", i), purchase.A02());
            A1I.put(AnonymousClass001.A0c("item_", "_request_id", i), purchase.A01());
            i = i2;
        }
        AbstractC63051SbX.A00(syg, A1I);
        return A1I;
    }

    public static final LinkedHashMap A01(List list) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (list != null) {
            String str = RhW.A0W.A00;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(((Purchase) it.next()).A02());
            }
            A1I.put(str, A0q);
        }
        return A1I;
    }

    public final LinkedHashMap A02(C54756OHl c54756OHl, String str, List list, boolean z) {
        LinkedHashMap A0i = AbstractC37302Gc3.A0i(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            LinkedHashMap A03 = AbstractC06930Yk.A03(this.A00.BjC(null, purchase, z));
            A03.put("product_type", str);
            SkuDetails A00 = c54756OHl.A00(AbstractC61812Ru6.A00(purchase));
            if (A00 != null) {
                A03.put(AbstractC61812Ru6.A00(purchase), A00.toString());
            }
            A0i.put(purchase.A02(), A03);
        }
        return A0i;
    }
}
