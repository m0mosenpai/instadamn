package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class Wap implements C2GC {
    public final InterfaceC02550Ad A00;
    public final QuickPerformanceLogger A01;

    public Wap(InterfaceC02550Ad interfaceC02550Ad, QuickPerformanceLogger quickPerformanceLogger) {
        C14360o3.A0B(quickPerformanceLogger, 2);
        this.A00 = interfaceC02550Ad;
        this.A01 = quickPerformanceLogger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(InterfaceC02570Af interfaceC02570Af, LoggingContext loggingContext, InterfaceC16660sJ interfaceC16660sJ) {
        if (((AbstractC02600Aj) interfaceC02570Af).A00.isSampled() && !loggingContext.A05) {
            C2O0.A00 = loggingContext.A02;
            C2OZ.A00(C2O5.A02);
            ((C0Ah) interfaceC16660sJ.invoke(interfaceC02570Af)).Cht();
        }
    }

    public final void A0C(EnumC72407Xcu enumC72407Xcu, LoggingContext loggingContext, Long l, String str, Map map) {
        C14360o3.A0B(str, 1);
        A03(new C25531Mh(MSY.A0H(this.A00, "client_load_credential_success"), 47), loggingContext, new MIO(l, loggingContext, map, enumC72407Xcu, str, 2));
    }

    public final void A0D(EnumC72407Xcu enumC72407Xcu, LoggingContext loggingContext, String str, List list, List list2, Map map, long j) {
        AbstractC43594JPz.A1P(enumC72407Xcu, list);
        A03(new C25531Mh(MSY.A0H(this.A00, "client_submit_ecppaymentcontainer_init"), 122), loggingContext, new MIW(enumC72407Xcu, loggingContext, str, list2, list, map, j));
        this.A01.markerPoint(223884226, "CONTAINER_SUBMISSION_INIT");
    }

    public final void A0E(EnumC72407Xcu enumC72407Xcu, LoggingContext loggingContext, String str, List list, List list2, Map map, long j) {
        AbstractC25233BEq.A0w(2, enumC72407Xcu, str, list);
        A03(new C25531Mh(MSY.A0H(this.A00, "client_submit_ecppaymentcontainer_success"), 123), loggingContext, new MIW(enumC72407Xcu, loggingContext, str, list2, list, map, j));
        this.A01.markerPoint(223884226, "CONTAINER_SUBMISSION_SUCCESS");
    }

    public final void A0F(EnumC72407Xcu enumC72407Xcu, LoggingContext loggingContext, Map map, long j) {
        C14360o3.A0B(enumC72407Xcu, 2);
        A03(new C25531Mh(MSY.A0H(this.A00, "client_add_ecppaymentcontainer_fail"), 18), loggingContext, new MI8(enumC72407Xcu, loggingContext, map, j));
    }

    public final void A0J(LoggingContext loggingContext, Long l, String str, Map map) {
        C14360o3.A0B(str, 1);
        A03(new C25531Mh(MSY.A0H(this.A00, "client_load_contact_success"), 44), loggingContext, new C50365MLr(loggingContext, l, str, map, 11));
    }

    public final void A0K(LoggingContext loggingContext, Long l, String str, Map map) {
        C14360o3.A0B(str, 1);
        A03(new C25531Mh(MSY.A0H(this.A00, AbstractC58317Pt9.A00(722)), 96), loggingContext, new C50365MLr(loggingContext, l, str, map, 14));
    }

    public final void A0O(LoggingContext loggingContext, String str) {
        C14360o3.A0B(str, 1);
        InterfaceC02590Ai A0H = MSY.A0H(this.A00, AbstractC58317Pt9.A00(718));
        if (A0H.isSampled()) {
            A0H.AAP(AbstractC63083Sc6.A00(), loggingContext.A02);
            AbstractC58321PtD.A1E(C2O5.A02, A0H);
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("debug_step", str);
            A0H.AAQ(c0Zx, "event_payload");
            A0H.A9M("extra_data", AbstractC06930Yk.A0E());
            A0H.Cht();
        }
    }

    public final void A0P(LoggingContext loggingContext, String str, int i, int i2) {
        A03(new C25531Mh(MSY.A0H(this.A00, "user_click_ecpaddresstypeahead_atomic"), 393), loggingContext, new MIM(loggingContext, null, str, i2, i, 0));
    }

    public final void A0R(LoggingContext loggingContext, String str, String str2, Map map) {
        C14360o3.A0B(str, 1);
        A03(new C25531Mh(MSY.A0H(this.A00, "client_load_shippingoption_fail"), 98), loggingContext, new C50371MLy(loggingContext, map, str, str2, 9));
    }

    public final void A0S(LoggingContext loggingContext, String str, String str2, Map map) {
        C14360o3.A0B(str, 1);
        A03(new C25531Mh(MSY.A0H(this.A00, "client_load_shippingoption_success"), 100), loggingContext, new C50371MLy(loggingContext, map, str, str2, 11));
    }

    public final void A0T(LoggingContext loggingContext, String str, List list, List list2) {
        C14360o3.A0B(list, 1);
        A03(new C25531Mh(MSY.A0H(this.A00, "client_add_incentives_fail"), 24), loggingContext, new MIO(list2, loggingContext, list, null, str, 1));
    }

    public final void A0X(LoggingContext loggingContext, String str, Map map) {
        C14360o3.A0B(str, 1);
        A02(new C25531Mh(MSY.A0H(this.A00, "client_load_contact_fail"), 42), loggingContext, map, str, 15);
    }

    public final void A0Y(LoggingContext loggingContext, String str, Map map) {
        C14360o3.A0B(str, 1);
        A02(new C25531Mh(MSY.A0H(this.A00, "client_load_credential_fail"), 45), loggingContext, map, str, 17);
    }

    public final void A0b(LoggingContext loggingContext, String str, Map map) {
        C14360o3.A0B(str, 1);
        A02(new C25531Mh(MSY.A0H(this.A00, "client_load_ecpotc_fail"), 69), loggingContext, map, str, 30);
    }

    public final void A0c(LoggingContext loggingContext, String str, Map map) {
        C14360o3.A0B(str, 1);
        A02(new C25531Mh(MSY.A0H(this.A00, "client_load_ecpotc_init"), 70), loggingContext, map, str, 31);
    }

    public final void A0e(LoggingContext loggingContext, String str, Map map) {
        C14360o3.A0B(str, 1);
        A02(new C25531Mh(MSY.A0H(this.A00, "client_load_shippingaddress_fail"), 94), loggingContext, map, str, 46);
    }

    public final void A0g(LoggingContext loggingContext, String str, Map map, boolean z) {
        C14360o3.A0B(str, 1);
        A03(new C25531Mh(MSY.A0H(this.A00, "client_load_ecpotc_success"), 71), loggingContext, new MIG(loggingContext, map, str, 6, z));
    }

    public final void A0h(LoggingContext loggingContext, List list, List list2) {
        A03(new C25531Mh(MSY.A0H(this.A00, "client_add_incentives_success"), 26), loggingContext, new C50372MLz(15, null, loggingContext, list, list2));
    }

    public final void A0i(LoggingContext loggingContext, List list, List list2) {
        A03(new C25531Mh(MSY.A0H(this.A00, "client_remove_incentives_success"), 114), loggingContext, new C50372MLz(18, null, loggingContext, list, list2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0980, code lost:
    
        if (X.C14360o3.A0K(r4, r0) == false) goto L379;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x005e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0996  */
    @Override // X.C2GC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Chz(java.lang.String r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 3022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Wap.Chz(java.lang.String, java.util.Map):void");
    }

    public static InterfaceC02590Ai A00(Wap wap, String str) {
        C18920wW c18920wW = (C18920wW) wap.A00;
        return c18920wW.A00(c18920wW.A00, str);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.QC7, X.0Zx] */
    public static QC7 A01(Map map) {
        EnumC72407Xcu enumC72407Xcu;
        ?? c0Zx = new C0Zx();
        Object obj = map.get("CREDENTIAL_TYPE");
        if (!(obj instanceof EnumC72407Xcu) || (enumC72407Xcu = (EnumC72407Xcu) obj) == null) {
            enumC72407Xcu = EnumC72407Xcu.A03;
        }
        c0Zx.A01(C70199WGm.A01(enumC72407Xcu), "credential_type");
        return c0Zx;
    }

    public static void A02(InterfaceC02570Af interfaceC02570Af, LoggingContext loggingContext, Object obj, String str, int i) {
        A03(interfaceC02570Af, loggingContext, new C65022Tc8(obj, loggingContext, str, i));
    }

    public static void A04(InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx, Map map) {
        interfaceC02590Ai.AAQ(c0Zx, "event_payload");
        if (C70199WGm.A0C(map)) {
            interfaceC02590Ai.A9M("extra_data", C70199WGm.A07(map));
        }
    }

    public static void A05(C0Zx c0Zx, LoggingContext loggingContext) {
        c0Zx.A05("product_id", Long.valueOf(loggingContext.A00));
        c0Zx.A02(AbstractC63059Sbg.A00(loggingContext), "logging_policy");
    }

    public static void A06(C0Zx c0Zx, String str) {
        c0Zx.A06("target_name", str);
        c0Zx.A06("contact_type", C70199WGm.A03(str));
    }

    public final void A0A(VHc vHc, LoggingContext loggingContext, Map map) {
        A03(new C25531Mh(MSY.A0H(this.A00, "user_click_ecpautofill_atomic"), 394), loggingContext, new C50365MLr(vHc, loggingContext, map, "shipping_address_suggestion", 5));
    }

    public final void A0B(VHc vHc, LoggingContext loggingContext, Map map) {
        A03(new C25531Mh(MSY.A0H(this.A00, "client_load_ecpautofill_success"), 52), loggingContext, new C50365MLr(vHc, loggingContext, map, "nux_checkout", 13));
    }

    public final void A0G(LoggingContext loggingContext, Long l, String str, List list, Map map) {
        A03(new C25531Mh(MSY.A0H(this.A00, "client_submit_ecpeventhandling_fail"), 118), loggingContext, new MIO(list, l, loggingContext, map, str, 4));
    }

    public final void A0H(LoggingContext loggingContext, Long l, String str, List list, Map map) {
        A03(new C25531Mh(MSY.A0H(this.A00, "client_submit_ecpeventhandling_success"), HucClient.BODY_UPLOAD_TIMEOUT_SECONDS), loggingContext, new MIO(list, l, loggingContext, map, str, 6));
    }

    public final void A0I(LoggingContext loggingContext, Long l, String str, Map map) {
        A03(new C25531Mh(MSY.A0H(this.A00, AbstractC58317Pt9.A00(1027)), 406), loggingContext, new C50365MLr(loggingContext, l, str, map, 6));
    }

    public final void A0L(LoggingContext loggingContext, Long l, Map map) {
        String A00 = AbstractC58317Pt9.A00(943);
        C14360o3.A0B(loggingContext, 0);
        A03(new C25531Mh(MSY.A0H(this.A00, AbstractC58317Pt9.A00(1032)), 411), loggingContext, new C50365MLr(loggingContext, l, A00, map, 15));
    }

    public final void A0M(LoggingContext loggingContext, Long l, Map map) {
        String A00 = AbstractC58317Pt9.A00(942);
        C14360o3.A0B(loggingContext, 0);
        A03(new C25531Mh(MSY.A0H(this.A00, AbstractC58317Pt9.A00(1033)), 412), loggingContext, new C50365MLr(loggingContext, l, A00, map, 16));
    }

    public final void A0N(LoggingContext loggingContext, Long l, Map map) {
        String A00 = AbstractC58317Pt9.A00(944);
        C14360o3.A0B(loggingContext, 0);
        A03(new C25531Mh(MSY.A0H(this.A00, AbstractC58317Pt9.A00(1034)), 413), loggingContext, new C50365MLr(loggingContext, l, A00, map, 18));
    }

    public final void A0Q(LoggingContext loggingContext, String str, long j) {
        A03(new C25531Mh(MSY.A0H(this.A00, "user_click_ecppaypalconversion_atomic"), 402), loggingContext, new C65023Tc9(loggingContext, str, 0, j));
    }

    public final void A0U(LoggingContext loggingContext, String str, List list, Map map, boolean z) {
        A03(new C25531Mh(MSY.A0H(this.A00, "client_load_ecpcheckoutcomponent_init"), 59), loggingContext, new X5B(list, loggingContext, map, str, "checkout", 2, z));
    }

    public final void A0V(LoggingContext loggingContext, String str, Map map) {
        A02(new C25531Mh(MSY.A0H(this.A00, "user_click_ecpcheckout_exit"), 396), loggingContext, map, str, 9);
    }

    public final void A0W(LoggingContext loggingContext, String str, Map map) {
        A02(new C25531Mh(MSY.A0H(this.A00, "user_click_ordersummary_atomic"), 405), loggingContext, map, str, 13);
    }

    public final void A0Z(LoggingContext loggingContext, String str, Map map) {
        A02(new C25531Mh(MSY.A0H(this.A00, "client_load_ecpcheckout_fail"), 55), loggingContext, map, str, 23);
    }

    public final void A0a(LoggingContext loggingContext, String str, Map map) {
        A02(new C25531Mh(MSY.A0H(this.A00, "client_load_ecpcheckout_init"), 56), loggingContext, map, str, 24);
    }

    public final void A0d(LoggingContext loggingContext, String str, Map map) {
        A02(new C25531Mh(MSY.A0H(this.A00, "client_load_entityitems_fail"), 73), loggingContext, map, str, 32);
    }

    public final void A0f(LoggingContext loggingContext, String str, Map map) {
        A03(new C25531Mh(MSY.A0H(this.A00, "client_process_ecppaymentperceived_success"), 107), loggingContext, new MI7(loggingContext, map, str, 1));
    }

    public static void A07(C0Zx c0Zx, String str, String str2, Map map) {
        c0Zx.A06(str, str2);
        if (C70199WGm.A0B(map)) {
            c0Zx.A05("credential_id", Long.valueOf(C70199WGm.A00(map)));
        }
    }

    public static void A08(C0Zx c0Zx, Map map) {
        if (C70199WGm.A0B(map)) {
            c0Zx.A05("contact_id", Long.valueOf(C70199WGm.A00(map)));
        }
    }

    public static void A09(Wap wap, Object obj, Object obj2, String str, Map map) {
        map.put(obj, obj2);
        ImmutableMap copyOf = ImmutableMap.copyOf(map);
        C14360o3.A07(copyOf);
        wap.Chz(str, copyOf);
    }
}
