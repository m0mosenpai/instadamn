package X;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.shopify.checkout.models.CheckoutCompletedPayload;
import com.shopify.checkout.models.CheckoutStatePayload;
import com.shopify.checkout.models.InitPayload;
import com.shopify.checkout.models.LocalePayload;
import com.shopify.checkout.models.NetworkRequestPayload;
import com.shopify.checkout.models.ProgressButton;
import com.shopify.checkout.models.ProgressButtonStage;
import com.shopify.checkout.models.ProgressButtonState;
import com.shopify.checkout.models.errors.ErrorGroup;
import com.shopify.checkout.models.errors.violations.ViolationErrorType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes10.dex */
public final class Q4k extends WebView {
    public final C62456SCj A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q4k(Context context, SLO slo) {
        super(context);
        C14360o3.A0B(slo, 2);
        this.A00 = new C62456SCj(slo);
        addJavascriptInterface(this, "CheckoutSheetProtocolConsumer");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x016b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x00b0. Please report as an issue. */
    @JavascriptInterface
    public final void postMessage(String str) {
        Integer num;
        Runnable tpw;
        QuickPerformanceLogger quickPerformanceLogger;
        InterfaceC02590Ai A00;
        QuickPerformanceLogger quickPerformanceLogger2;
        QuickPerformanceLogger quickPerformanceLogger3;
        QuickPerformanceLogger quickPerformanceLogger4;
        ArrayList A0q;
        Object c71177WpG;
        Throwable A12;
        C5KZ A002;
        C3RB c3rb;
        C14360o3.A0B(str, 0);
        C30158DQo c30158DQo = C30158DQo.A00;
        C73773Sh c73773Sh = AbstractC73763Sg.A03;
        W5R w5r = (W5R) C5KX.A00(c30158DQo, c73773Sh).A00(str, C71746X0l.A00);
        String str2 = w5r.A01;
        if (str2.equals("init")) {
            num = C05F.A00;
        } else if (str2.equals("completed")) {
            num = C05F.A01;
        } else if (str2.equals("stateChange")) {
            num = C05F.A0C;
        } else if (str2.equals("checkoutStarted")) {
            num = C05F.A0N;
        } else if (str2.equals("error")) {
            num = C05F.A0Y;
        } else if (str2.equals("checkoutBlockingEvent")) {
            num = C05F.A0j;
        } else if (str2.equals("updatePayButtonState")) {
            num = C05F.A0u;
        } else if (str2.equals("updateProgressButton")) {
            num = C05F.A15;
        } else if (str2.equals("locale")) {
            num = C05F.A1F;
        } else if (str2.equals("interceptXHR")) {
            num = C05F.A1I;
        } else if (str2.equals("interceptFetch")) {
            num = C05F.A02;
        } else if (str2.equals("monitoredNetworkRequests")) {
            num = C05F.A03;
        } else {
            throw AbstractC166987dD.A12(str2);
        }
        C62456SCj c62456SCj = this.A00;
        String str3 = w5r.A00;
        boolean A1R = AbstractC167007dF.A1R(0, num, str3);
        try {
            S5U s5u = S5U.$redex_init_class;
            switch (num.intValue()) {
                case 0:
                    C5KZ A003 = C5KX.A00(C30159DQp.A00, c73773Sh);
                    C71760X0z c71760X0z = C71760X0z.A00;
                    Object obj = (InitPayload) A003.A00(str3, c71760X0z);
                    SLO slo = c62456SCj.A00;
                    C14360o3.A0B(obj, 0);
                    QJl qJl = slo.A00;
                    QuickPerformanceLogger quickPerformanceLogger5 = AbstractC63320ShT.A00;
                    Integer num2 = qJl.A08;
                    C14360o3.A0B(num2, 0);
                    Integer A004 = AbstractC63320ShT.A00(num2);
                    if (A004 != null && (quickPerformanceLogger4 = AbstractC63320ShT.A00) != null) {
                        quickPerformanceLogger4.markerPoint(A004.intValue(), "sdk_on_init");
                    }
                    Integer A005 = AbstractC63320ShT.A00(num2);
                    if (A005 != null && (quickPerformanceLogger3 = AbstractC63320ShT.A00) != null) {
                        quickPerformanceLogger3.markerEnd(A005.intValue(), (short) 2);
                    }
                    String A02 = c73773Sh.A02(obj, c71760X0z);
                    AbstractC63399SjU abstractC63399SjU = qJl.A01;
                    if (abstractC63399SjU != null) {
                        String str4 = qJl.A0B;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = qJl.A0A;
                        long j = qJl.A06;
                        String str6 = qJl.A03;
                        String str7 = qJl.A09;
                        String str8 = qJl.A02;
                        AbstractC25233BEq.A0w(A1R ? 1 : 0, str5, str6, str7);
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(abstractC63399SjU.A0C(), "client_load_metacheckoutsdk_init");
                        if (A0f.isSampled()) {
                            A0f.A8R(A00(A0f, abstractC63399SjU, str5), "product_type");
                            A0f.A8R(EnumC31203Dnm.ANDROID, "platform");
                            A0f.A9K("actual_event_time", Long.valueOf(AbstractC31177DnL.A06()));
                            C0Zx c0Zx = new C0Zx();
                            AbstractC63399SjU.A09(c0Zx, abstractC63399SjU, "on_init");
                            AbstractC58322PtE.A1H(A0f, c0Zx, AbstractC06930Yk.A06(AbstractC167007dF.A1b("shopify_sdk_payload", A02, AbstractC63399SjU.A06(str6), AbstractC166987dD.A1L("csp_version", "2024-10"))));
                            C0Zx c0Zx2 = new C0Zx();
                            AbstractC63399SjU.A0B(c0Zx2, str8, str4, j);
                            c0Zx2.A06("external_session_id", AbstractC63399SjU.A03(abstractC63399SjU, str4));
                            AbstractC58323PtF.A1G(A0f, c0Zx2, str7);
                        }
                    }
                    SDC sdc = qJl.A00;
                    if (sdc != null) {
                        tpw = new TPV(sdc.A00, sdc.A01, A02);
                        STC.A00(tpw);
                        return;
                    }
                    return;
                case 1:
                    C5KZ A006 = C5KX.A00(C30159DQp.A00, c73773Sh);
                    C71753X0s c71753X0s = C71753X0s.A00;
                    CheckoutCompletedPayload checkoutCompletedPayload = (CheckoutCompletedPayload) A006.A00(str3, c71753X0s);
                    SLO slo2 = c62456SCj.A00;
                    C14360o3.A0B(checkoutCompletedPayload, 0);
                    QJl qJl2 = slo2.A00;
                    QuickPerformanceLogger quickPerformanceLogger6 = AbstractC63320ShT.A00;
                    Integer num3 = qJl2.A08;
                    C14360o3.A0B(num3, 0);
                    Integer A01 = AbstractC63320ShT.A01(num3);
                    if (A01 != null && (quickPerformanceLogger2 = AbstractC63320ShT.A00) != null) {
                        quickPerformanceLogger2.markerEnd(A01.intValue(), (short) 2);
                    }
                    String A022 = c73773Sh.A02(checkoutCompletedPayload, c71753X0s);
                    AbstractC63399SjU abstractC63399SjU2 = qJl2.A01;
                    if (abstractC63399SjU2 != null) {
                        String str9 = qJl2.A0B;
                        if (str9 == null) {
                            str9 = "";
                        }
                        String str10 = qJl2.A0A;
                        long j2 = qJl2.A06;
                        String str11 = qJl2.A03;
                        String str12 = qJl2.A09;
                        String str13 = qJl2.A02;
                        C14360o3.A0B(str10, A1R ? 1 : 0);
                        AbstractC167007dF.A1G(str11, 3, str12);
                        InterfaceC02590Ai A007 = AbstractC63399SjU.A00(abstractC63399SjU2);
                        if (A007.isSampled()) {
                            AbstractC58321PtD.A1E(A00(A007, abstractC63399SjU2, str10), A007);
                            C0Zx c0Zx3 = new C0Zx();
                            AbstractC63399SjU.A09(c0Zx3, abstractC63399SjU2, "complete_checkout");
                            AbstractC58322PtE.A1H(A007, c0Zx3, AbstractC06930Yk.A06(AbstractC167007dF.A1b("shopify_sdk_payload", A022, AbstractC63399SjU.A06(str11), AbstractC166987dD.A1L("csp_version", "2024-10"))));
                            C0Zx c0Zx4 = new C0Zx();
                            AbstractC63399SjU.A0B(c0Zx4, str13, str9, j2);
                            AbstractC63399SjU.A07(A007, c0Zx4, abstractC63399SjU2, str9, str12);
                            A007.Cht();
                        }
                    }
                    ((AbstractC61593RqH) qJl2).A00 = checkoutCompletedPayload.A05;
                    SDC sdc2 = qJl2.A00;
                    if (sdc2 != null) {
                        tpw = new TPT(sdc2.A00, sdc2.A01, A022);
                        STC.A00(tpw);
                        return;
                    }
                    return;
                case 2:
                    C5KZ A008 = C5KX.A00(C30159DQp.A00, c73773Sh);
                    C3R9[] c3r9Arr = CheckoutStatePayload.A04;
                    C71755X0u c71755X0u = C71755X0u.A00;
                    Object obj2 = (CheckoutStatePayload) A008.A00(str3, c71755X0u);
                    SLO slo3 = c62456SCj.A00;
                    C14360o3.A0B(obj2, 0);
                    QJl qJl3 = slo3.A00;
                    QuickPerformanceLogger quickPerformanceLogger7 = AbstractC63320ShT.A00;
                    Integer num4 = qJl3.A08;
                    C14360o3.A0B(num4, 0);
                    Integer A023 = AbstractC63320ShT.A02(num4);
                    if (A023 != null && (quickPerformanceLogger = AbstractC63320ShT.A00) != null) {
                        int intValue = A023.intValue();
                        if (quickPerformanceLogger.isMarkerOn(intValue) == A1R) {
                            quickPerformanceLogger.markerEnd(intValue, (short) 2);
                        }
                    }
                    String A024 = c73773Sh.A02(obj2, c71755X0u);
                    AbstractC63399SjU abstractC63399SjU3 = qJl3.A01;
                    if (abstractC63399SjU3 != null) {
                        String str14 = qJl3.A0B;
                        if (str14 == null) {
                            str14 = "";
                        }
                        String str15 = qJl3.A0A;
                        long j3 = qJl3.A06;
                        String str16 = qJl3.A03;
                        String str17 = qJl3.A09;
                        String str18 = qJl3.A02;
                        C14360o3.A0B(str15, A1R ? 1 : 0);
                        AbstractC167007dF.A1G(str16, 3, str17);
                        InterfaceC02590Ai A009 = AbstractC63399SjU.A00(abstractC63399SjU3);
                        if (A009.isSampled()) {
                            AbstractC58321PtD.A1E(A00(A009, abstractC63399SjU3, str15), A009);
                            C0Zx c0Zx5 = new C0Zx();
                            AbstractC63399SjU.A09(c0Zx5, abstractC63399SjU3, "on_state_change");
                            AbstractC58322PtE.A1H(A009, c0Zx5, AbstractC06930Yk.A06(AbstractC167007dF.A1b("csp_version", "2024-10", AbstractC166987dD.A1L("shopify_sdk_payload", A024), AbstractC63399SjU.A06(str16))));
                            C0Zx c0Zx6 = new C0Zx();
                            c0Zx6.A06("commerce_checkout_session_id", str18);
                            c0Zx6.A06("iaw_session_id", str14);
                            c0Zx6.A07("seller_ids", AbstractC63399SjU.A05(j3));
                            AbstractC63399SjU.A07(A009, c0Zx6, abstractC63399SjU3, str14, str17);
                            A009.Cht();
                        }
                    }
                    SDC sdc3 = qJl3.A00;
                    if (sdc3 != null) {
                        tpw = new TPW(sdc3.A00, sdc3.A01, A024);
                        STC.A00(tpw);
                        return;
                    }
                    return;
                case 3:
                    C5KZ A0010 = C5KX.A00(C30159DQp.A00, c73773Sh);
                    C3R9[] c3r9Arr2 = CheckoutStatePayload.A04;
                    C71755X0u c71755X0u2 = C71755X0u.A00;
                    Object obj3 = (CheckoutStatePayload) A0010.A00(str3, c71755X0u2);
                    SLO slo4 = c62456SCj.A00;
                    C14360o3.A0B(obj3, 0);
                    QJl qJl4 = slo4.A00;
                    C30181DRm c30181DRm = new C30181DRm(slo4, 35);
                    String A025 = c73773Sh.A02(obj3, c71755X0u2);
                    SDC sdc4 = qJl4.A00;
                    if (sdc4 != null) {
                        STC.A00(new TPR(sdc4.A00, sdc4.A01, A025));
                    }
                    qJl4.A04 = c30181DRm;
                    AbstractC63399SjU abstractC63399SjU4 = qJl4.A01;
                    if (abstractC63399SjU4 != null) {
                        String str19 = qJl4.A0B;
                        if (str19 == null) {
                            str19 = "";
                        }
                        String str20 = qJl4.A0A;
                        long j4 = qJl4.A06;
                        String str21 = qJl4.A03;
                        String str22 = qJl4.A09;
                        String str23 = qJl4.A02;
                        AbstractC25233BEq.A0w(A1R ? 1 : 0, str20, str21, str22);
                        A00 = AbstractC63399SjU.A00(abstractC63399SjU4);
                        if (A00.isSampled()) {
                            AbstractC58321PtD.A1E(A00(A00, abstractC63399SjU4, str20), A00);
                            C0Zx c0Zx7 = new C0Zx();
                            AbstractC63399SjU.A09(c0Zx7, abstractC63399SjU4, "on_checkout_started");
                            AbstractC58322PtE.A1H(A00, c0Zx7, AbstractC06930Yk.A06(AbstractC167007dF.A1b("csp_version", "2024-10", AbstractC166987dD.A1L("shopify_sdk_payload", A025), AbstractC63399SjU.A06(str21))));
                            C0Zx c0Zx8 = new C0Zx();
                            AbstractC63399SjU.A0B(c0Zx8, str23, str19, j4);
                            AbstractC63399SjU.A07(A00, c0Zx8, abstractC63399SjU4, str19, str22);
                            A00.Cht();
                            return;
                        }
                        return;
                    }
                    return;
                case 4:
                    JsonArray jsonArray = (JsonArray) C5KX.A00(C30159DQp.A00, c73773Sh).A00(str3, JsonArraySerializer.A01);
                    A0q = AbstractC167017dG.A0q(jsonArray);
                    Iterator it = jsonArray.iterator();
                    while (it.hasNext()) {
                        JsonElement jsonElement = (JsonElement) it.next();
                        try {
                            String A0011 = AbstractC100754fe.A06((JsonElement) AbstractC06930Yk.A01("group", AbstractC100754fe.A03(jsonElement))).A00();
                            ErrorGroup[] values = ErrorGroup.values();
                            int i = 0;
                            int length = values.length;
                            while (true) {
                                if (i < length) {
                                    ErrorGroup errorGroup = values[i];
                                    if (!C14360o3.A0K(errorGroup.A00, A0011)) {
                                        i++;
                                    } else {
                                        switch (errorGroup.ordinal()) {
                                            case 0:
                                                String A0012 = AbstractC100754fe.A06((JsonElement) AbstractC06930Yk.A01(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC100754fe.A03(jsonElement))).A00();
                                                ViolationErrorType[] values2 = ViolationErrorType.values();
                                                int length2 = values2.length;
                                                int i2 = 0;
                                                while (true) {
                                                    if (i2 < length2) {
                                                        ViolationErrorType violationErrorType = values2[i2];
                                                        if (C14360o3.A0K(violationErrorType.A00, A0012)) {
                                                            int ordinal = violationErrorType.ordinal();
                                                            if (ordinal != A1R) {
                                                                if (ordinal == 0) {
                                                                    A002 = C5KX.A00(C30160DQq.A00, c73773Sh);
                                                                    c3rb = X1D.A00;
                                                                } else {
                                                                    A12 = B4Z.A00();
                                                                    break;
                                                                }
                                                            } else {
                                                                A002 = C5KX.A00(C30160DQq.A00, c73773Sh);
                                                                c3rb = X1E.A00;
                                                            }
                                                            c71177WpG = (InterfaceC71868X8b) A002.A01(c3rb, jsonElement);
                                                            break;
                                                        } else {
                                                            i2++;
                                                        }
                                                    } else {
                                                        A12 = AbstractC167007dF.A0c("Unknown type value: ", A0012);
                                                        break;
                                                    }
                                                }
                                            case 1:
                                                c71177WpG = (InterfaceC71868X8b) C5KX.A00(C30160DQq.A00, c73773Sh).A01(X18.A00, jsonElement);
                                                break;
                                            case 2:
                                                A12 = AbstractC166987dD.A12("Internal errors should not be decoded");
                                                break;
                                            case 3:
                                                c71177WpG = (InterfaceC71868X8b) C5KX.A00(C30160DQq.A00, c73773Sh).A01(X1C.A00, jsonElement);
                                                break;
                                            case 4:
                                                c71177WpG = (InterfaceC71868X8b) C5KX.A00(C30160DQq.A00, c73773Sh).A01(X19.A00, jsonElement);
                                                break;
                                            case 5:
                                                c71177WpG = (InterfaceC71868X8b) C5KX.A00(C30160DQq.A00, c73773Sh).A01(X1B.A00, jsonElement);
                                                break;
                                            default:
                                                A12 = B4Z.A00();
                                                break;
                                        }
                                    }
                                } else {
                                    A12 = AbstractC166987dD.A12(AnonymousClass001.A0T("InvalidErrorType", A0011, ' '));
                                }
                            }
                            throw A12;
                            break;
                        } catch (Exception e) {
                            c71177WpG = new C71177WpG(e, C05F.A01, "fail_to_parse_error_json");
                            break;
                        }
                    }
                    c62456SCj.A00.A00.A02(A0q);
                    return;
                case 5:
                    boolean A1a = AbstractC166987dD.A1a(C5KX.A00(C30159DQp.A00, c73773Sh).A00(str3, C3SL.A00));
                    QJl qJl5 = c62456SCj.A00.A00;
                    AbstractC63399SjU abstractC63399SjU5 = qJl5.A01;
                    if (abstractC63399SjU5 != null) {
                        String str24 = qJl5.A0B;
                        if (str24 == null) {
                            str24 = "";
                        }
                        String str25 = qJl5.A0A;
                        long j5 = qJl5.A06;
                        String str26 = qJl5.A03;
                        String str27 = qJl5.A09;
                        String A1B = AnonymousClass001.A1B("{\"should_expand_view\":\"", "\"}", A1a);
                        String str28 = qJl5.A02;
                        AbstractC25233BEq.A0w(A1R ? 1 : 0, str25, str26, str27);
                        C14360o3.A0B(A1B, 6);
                        InterfaceC02590Ai A0013 = AbstractC63399SjU.A00(abstractC63399SjU5);
                        if (A0013.isSampled()) {
                            AbstractC58321PtD.A1E(A00(A0013, abstractC63399SjU5, str25), A0013);
                            C0Zx c0Zx9 = new C0Zx();
                            AbstractC63399SjU.A09(c0Zx9, abstractC63399SjU5, "on_expand_checkout_view");
                            AbstractC58322PtE.A1H(A0013, c0Zx9, AbstractC06930Yk.A06(AbstractC167007dF.A1b("shopify_sdk_payload", A1B, AbstractC63399SjU.A06(str26), AbstractC166987dD.A1L("csp_version", "2024-10"))));
                            C0Zx c0Zx10 = new C0Zx();
                            c0Zx10.A07("seller_ids", AbstractC63399SjU.A05(j5));
                            c0Zx10.A06("commerce_checkout_session_id", str28);
                            QER qer = (QER) abstractC63399SjU5;
                            AbstractC63399SjU.A08(c0Zx10, qer);
                            c0Zx10.A06("iaw_session_id", str24);
                            AbstractC63399SjU.A0A(c0Zx10, abstractC63399SjU5, qer.A01, str24);
                            AbstractC58323PtF.A1G(A0013, c0Zx10, str27);
                        }
                    }
                    SDC sdc5 = qJl5.A00;
                    if (sdc5 != null) {
                        tpw = new TPS(sdc5.A00, sdc5.A01, A1a);
                        STC.A00(tpw);
                        return;
                    }
                    return;
                case 6:
                    System.out.print((Object) "This message was deprecated, use updateProgressButton instead");
                    return;
                case 7:
                    ProgressButton progressButton = (ProgressButton) C5KX.A00(C30159DQp.A00, c73773Sh).A00(str3, X17.A00);
                    SLO slo5 = c62456SCj.A00;
                    ProgressButtonState progressButtonState = progressButton.A01;
                    ProgressButtonStage progressButtonStage = progressButton.A00;
                    C14360o3.A0B(progressButtonState, 0);
                    C14360o3.A0B(progressButtonStage, A1R ? 1 : 0);
                    QJl qJl6 = slo5.A00;
                    String str29 = progressButtonState.A00;
                    String str30 = progressButtonStage.A00;
                    SDC sdc6 = qJl6.A00;
                    if (sdc6 != null) {
                        C14360o3.A0B(str29, 0);
                        C14360o3.A0B(str30, A1R ? 1 : 0);
                        STC.A00(new TQU(sdc6.A00, sdc6.A01, str30, str29));
                    }
                    AbstractC63399SjU abstractC63399SjU6 = qJl6.A01;
                    if (abstractC63399SjU6 != null) {
                        String str31 = qJl6.A0B;
                        if (str31 == null) {
                            str31 = "";
                        }
                        String str32 = qJl6.A0A;
                        long j6 = qJl6.A06;
                        String str33 = qJl6.A03;
                        String str34 = qJl6.A09;
                        String str35 = qJl6.A02;
                        AbstractC25233BEq.A0w(A1R ? 1 : 0, str32, str33, str34);
                        AbstractC167017dG.A1U(str29, str30);
                        A00 = AbstractC63399SjU.A00(abstractC63399SjU6);
                        if (A00.isSampled()) {
                            String A0B = AnonymousClass001.A0B(AnonymousClass001.A0v("{\"progressButtonState\":", str29, ",\"progressButtonStage\":", str30, '}'));
                            C14360o3.A07(A0B);
                            String A1A = AbstractC25228BEl.A1A(AbstractC16490ru.A0p(A0B));
                            AbstractC58321PtD.A1E(A00(A00, abstractC63399SjU6, str32), A00);
                            C0Zx c0Zx11 = new C0Zx();
                            AbstractC63399SjU.A09(c0Zx11, abstractC63399SjU6, "handle_progress_button");
                            AbstractC58322PtE.A1H(A00, c0Zx11, AbstractC06930Yk.A06(AbstractC167007dF.A1b("csp_version", "2024-10", AbstractC166987dD.A1L("shopify_sdk_payload", A1A), AbstractC63399SjU.A06(str33))));
                            C0Zx c0Zx12 = new C0Zx();
                            c0Zx12.A06("commerce_checkout_session_id", str35);
                            c0Zx12.A07("seller_ids", AbstractC63399SjU.A05(j6));
                            c0Zx12.A06("iaw_session_id", str31);
                            AbstractC63399SjU.A07(A00, c0Zx12, abstractC63399SjU6, str31, str34);
                            A00.Cht();
                            return;
                        }
                        return;
                    }
                    return;
                case 8:
                    C5KZ A0014 = C5KX.A00(C30159DQp.A00, c73773Sh);
                    X10 x10 = X10.A00;
                    Object obj4 = (LocalePayload) A0014.A00(str3, x10);
                    SLO slo6 = c62456SCj.A00;
                    C14360o3.A0B(obj4, 0);
                    QJl qJl7 = slo6.A00;
                    String A026 = c73773Sh.A02(obj4, x10);
                    SDC sdc7 = qJl7.A00;
                    if (sdc7 != null) {
                        STC.A00(new TPQ(sdc7.A00, sdc7.A01, A026));
                    }
                    AbstractC63399SjU abstractC63399SjU7 = qJl7.A01;
                    if (abstractC63399SjU7 != null) {
                        String str36 = qJl7.A0B;
                        if (str36 == null) {
                            str36 = "";
                        }
                        String str37 = qJl7.A0A;
                        long j7 = qJl7.A06;
                        String str38 = qJl7.A03;
                        String str39 = qJl7.A09;
                        String str40 = qJl7.A02;
                        AbstractC25233BEq.A0w(A1R ? 1 : 0, str37, str38, str39);
                        A00 = AbstractC63399SjU.A00(abstractC63399SjU7);
                        if (A00.isSampled()) {
                            AbstractC58321PtD.A1E(A00(A00, abstractC63399SjU7, str37), A00);
                            C0Zx c0Zx13 = new C0Zx();
                            AbstractC63399SjU.A09(c0Zx13, abstractC63399SjU7, "handle_locale");
                            AbstractC58322PtE.A1H(A00, c0Zx13, AbstractC06930Yk.A06(AbstractC167007dF.A1b("csp_version", "2024-10", AbstractC166987dD.A1L("shopify_sdk_payload", A026), AbstractC63399SjU.A06(str38))));
                            C0Zx c0Zx14 = new C0Zx();
                            AbstractC63399SjU.A0B(c0Zx14, str40, str36, j7);
                            AbstractC63399SjU.A07(A00, c0Zx14, abstractC63399SjU7, str36, str39);
                            A00.Cht();
                            return;
                        }
                        return;
                    }
                    return;
                case 9:
                    c62456SCj.A00.A00(str3);
                    return;
                case 10:
                    c62456SCj.A00.A00(str3);
                    return;
                default:
                    JsonArray jsonArray2 = (JsonArray) C5KX.A00(C30159DQp.A00, c73773Sh).A00(str3, JsonArraySerializer.A01);
                    ArrayList A0q2 = AbstractC167017dG.A0q(jsonArray2);
                    Iterator it2 = jsonArray2.iterator();
                    while (it2.hasNext()) {
                        JsonElement jsonElement2 = (JsonElement) it2.next();
                        C5KZ A0015 = C5KX.A00(C30160DQq.A00, c73773Sh);
                        C3R9[] c3r9Arr3 = NetworkRequestPayload.A06;
                        A0q2.add(A0015.A01(X12.A00, jsonElement2));
                    }
                    List<NetworkRequestPayload> A0a = AbstractC001800i.A0a(A0q2);
                    QJl qJl8 = c62456SCj.A00.A00;
                    for (NetworkRequestPayload networkRequestPayload : A0a) {
                        AbstractC63399SjU abstractC63399SjU8 = qJl8.A01;
                        if (abstractC63399SjU8 != null) {
                            String str41 = qJl8.A02;
                            String str42 = networkRequestPayload.A04;
                            if (str42 == null) {
                                str42 = "";
                            }
                            Map map = networkRequestPayload.A05;
                            if (map == null) {
                                map = AbstractC06930Yk.A0E();
                            }
                            abstractC63399SjU8.A0F(str41, str42, networkRequestPayload.A02, "SHOPIFY_DATA_MIRRORING", networkRequestPayload.A00, networkRequestPayload.A03, map);
                        }
                    }
                    return;
            }
            A0q.add(c71177WpG);
        } catch (Exception e2) {
            c62456SCj.A00.A00.A02(AbstractC166987dD.A1J(new C71177WpG(e2, C05F.A01, "fail_to_parse_message")));
        }
    }

    public static C2O5 A00(InterfaceC02590Ai interfaceC02590Ai, AbstractC63399SjU abstractC63399SjU, String str) {
        interfaceC02590Ai.AAP(AbstractC58346Ptm.A00(), str);
        return AbstractC63399SjU.A01(abstractC63399SjU);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(81447498);
        requestDisallowInterceptTouchEvent(true);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        C0f9.A0C(-481901738, A05);
        return onTouchEvent;
    }
}
