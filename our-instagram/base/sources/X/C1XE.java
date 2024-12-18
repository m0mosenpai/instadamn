package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.payments.CurrencyAmountInfoImpl;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.model.payments.common.ProductItem;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1XE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XE extends C1XF {
    public static String A01;
    public static final AtomicInteger A02 = new AtomicInteger();
    public C41579IaS A00;

    /* JADX WARN: Type inference failed for: r0v46, types: [X.Xn5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.Xn4, java.lang.Object] */
    public static HashMap A00(Context context, UserSession userSession, CheckoutLaunchParams checkoutLaunchParams, String str) {
        String str2;
        String str3 = null;
        Integer num = null;
        boolean z = false;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = checkoutLaunchParams.A09;
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ProductItem productItem = (ProductItem) it.next();
                CurrencyAmountInfoImpl currencyAmountInfoImpl = productItem.A01;
                Integer num2 = currencyAmountInfoImpl.A00;
                String str4 = currencyAmountInfoImpl.A01;
                String str5 = currencyAmountInfoImpl.A03;
                String str6 = currencyAmountInfoImpl.A02;
                if (num2 != null && str4 != null && str5 != null && str6 != null) {
                    String str7 = productItem.A03;
                    int i = productItem.A00;
                    int intValue = num2.intValue();
                    ?? obj = new Object();
                    obj.A03 = str5;
                    obj.A01 = str4;
                    obj.A02 = str6;
                    obj.A00 = intValue;
                    String str8 = productItem.A02;
                    ?? obj2 = new Object();
                    obj2.A03 = str7;
                    obj2.A00 = i;
                    obj2.A01 = obj;
                    obj2.A02 = str8;
                    arrayList2.add(obj2);
                }
            }
            String str9 = checkoutLaunchParams.A03;
            String str10 = null;
            if (str9 != null) {
                str3 = str9;
                num = C05F.A00;
                z = true;
            }
            boolean z2 = checkoutLaunchParams.A0B;
            String str11 = checkoutLaunchParams.A00;
            String BdA = AbstractC11060iN.A00(userSession).BdA();
            java.util.Set set = checkoutLaunchParams.A0A;
            if (set != null) {
                str10 = set.toString();
            }
            StringWriter stringWriter = new StringWriter();
            C222015v c222015v = AbstractC221915u.A00;
            C17z A0A = c222015v.A0A(stringWriter);
            A0A.A0d();
            A0A.A0T("is_from_drops_onboarding", z2);
            C16V.A03(A0A, "products");
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C72785Xn5 c72785Xn5 = (C72785Xn5) it2.next();
                if (c72785Xn5 != null) {
                    A0A.A0d();
                    String str12 = c72785Xn5.A03;
                    if (str12 != null) {
                        A0A.A0S("product_id", str12);
                    }
                    A0A.A0Q("quantity", c72785Xn5.A00);
                    C72784Xn4 c72784Xn4 = c72785Xn5.A01;
                    if (c72784Xn4 != null) {
                        A0A.A0r("price");
                        A0A.A0d();
                        String str13 = c72784Xn4.A03;
                        if (str13 != null) {
                            A0A.A0S("currency", str13);
                        }
                        String str14 = c72784Xn4.A01;
                        if (str14 != null) {
                            A0A.A0S("amount", str14);
                        }
                        String str15 = c72784Xn4.A02;
                        if (str15 != null) {
                            A0A.A0S("amount_with_offset", str15);
                        }
                        A0A.A0Q("offset", c72784Xn4.A00);
                        A0A.A0a();
                    }
                    String str16 = c72785Xn5.A02;
                    if (str16 != null) {
                        A0A.A0S("launch_date_unix_timestamp", str16);
                    }
                    A0A.A0a();
                }
            }
            A0A.A0Z();
            A0A.A0S(CacheBehaviorLogger.SOURCE, str);
            if (str11 != null) {
                A0A.A0S(TraceFieldType.BroadcastId, str11);
            }
            if (BdA != null) {
                A0A.A0S("pigeon_session_id", BdA);
            }
            if (str10 != null) {
                A0A.A0S("incentive_ids", str10);
            }
            if (z) {
                A0A.A0r("attribution_data");
                A0A.A0d();
                if (num != null) {
                    switch (num.intValue()) {
                        case 1:
                            str2 = "b2c_marketplace";
                            break;
                        case 2:
                            str2 = "marketplace_tab";
                            break;
                        default:
                            str2 = "ig_shopping";
                            break;
                    }
                    A0A.A0S("channel", str2);
                }
                A0A.A0r("ig_extra_data");
                A0A.A0d();
                if (str3 != null) {
                    A0A.A0S("merchant_igid", str3);
                }
                A0A.A0a();
                A0A.A0a();
            }
            A0A.A0a();
            A0A.close();
            String obj3 = stringWriter.toString();
            StringWriter stringWriter2 = new StringWriter();
            C17z A0A2 = c222015v.A0A(stringWriter2);
            A0A2.A0d();
            C16V.A03(A0A2, "products");
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ProductItem productItem2 = (ProductItem) it3.next();
                if (productItem2 != null) {
                    A0A2.A0d();
                    String str17 = productItem2.A03;
                    if (str17 != null) {
                        A0A2.A0S("product_id", str17);
                    }
                    CurrencyAmountInfoImpl currencyAmountInfoImpl2 = productItem2.A01;
                    if (currencyAmountInfoImpl2 != null) {
                        A0A2.A0r("per_unit_price");
                        AbstractC41329IQz.A00(A0A2, currencyAmountInfoImpl2);
                    }
                    A0A2.A0Q("quantity", productItem2.A00);
                    String str18 = productItem2.A02;
                    if (str18 != null) {
                        A0A2.A0S("launch_date_unix_timestamp", str18);
                    }
                    A0A2.A0a();
                }
            }
            A0A2.A0Z();
            A0A2.A0a();
            A0A2.close();
            String obj4 = stringWriter2.toString();
            hashMap.put("products", obj4);
            hashMap.put("receiver_id", checkoutLaunchParams.A06);
            hashMap.put("logging_id", checkoutLaunchParams.A02);
            String str19 = checkoutLaunchParams.A04;
            Locale locale = Locale.US;
            hashMap.put("payment_type", str19.toLowerCase(locale));
            hashMap.put("actor_id", userSession.userId);
            hashMap.put("risk_features", new SMA(context).A00());
            hashMap.put("extra_data", obj3);
            hashMap.put("checkout_config", checkoutLaunchParams.A05);
            hashMap.put("shopping_session_id", checkoutLaunchParams.A08);
            hashMap.put("timezone_offset", Long.toString(C23831Eq.A00()));
            hashMap.put("gift_recipient_id", checkoutLaunchParams.A01);
            hashMap.put("_PRELOAD_ID_KEY_", AnonymousClass001.A16("products: ", obj4, ", receiver_id", checkoutLaunchParams.A06, ", payment_type", checkoutLaunchParams.A04.toLowerCase(locale), ", extra_data", obj3));
            return hashMap;
        } catch (IOException e) {
            C0K8.A0G("checkout_information_params", "Error serializing to JSON", e);
            return hashMap;
        }
    }

    public static void A03(UserSession userSession, CheckoutLaunchParams checkoutLaunchParams, C41579IaS c41579IaS, String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("merchant_id", checkoutLaunchParams.A07);
        hashMap.put("receiver_id", checkoutLaunchParams.A06);
        boolean equals = str2.equals("cart");
        String str5 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        String str6 = "";
        Object obj = "";
        if (equals) {
            obj = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        hashMap.put("is_from_shopping_bag", obj);
        if (!checkoutLaunchParams.A0B) {
            str5 = "";
        }
        hashMap.put("is_from_drops_onboarding", str5);
        hashMap.put("products", str);
        hashMap.put("is_bloks", Boolean.toString(true));
        hashMap.put(CacheBehaviorLogger.SOURCE, str2);
        String BdA = AbstractC11060iN.A00(userSession).BdA();
        if (BdA == null) {
            BdA = "";
        }
        hashMap.put("pigeon_session_id", BdA);
        String str7 = checkoutLaunchParams.A08;
        if (str7 == null) {
            str7 = "";
        }
        hashMap.put("shopping_session_id", str7);
        java.util.Set set = checkoutLaunchParams.A0A;
        if (set != null) {
            str6 = set.toString();
        }
        hashMap.put("incentive_ids", str6);
        C19280xC A00 = C41579IaS.A00(c41579IaS, str4);
        A00.A0C("flow_step", str3);
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str8 = (String) entry.getKey();
                String str9 = (String) entry.getValue();
                A0A.A0r(str8);
                if (str9 == null) {
                    A0A.A0b();
                } else {
                    A0A.A0u(str9);
                }
            }
            A0A.A0a();
            A0A.close();
            String obj2 = stringWriter.toString();
            C14360o3.A07(obj2);
            A00.A0C("paymod_extra_data", obj2);
            A00.A0C("nav_chain", C1QM.A00.A02.A00);
        } catch (IOException unused) {
        }
        AbstractC11060iN.A00(c41579IaS.A00).EHW(A00);
    }

    @Override // X.C1XF
    public final void A04(FragmentActivity fragmentActivity, UserSession userSession, CheckoutLaunchParams checkoutLaunchParams, String str) {
        A02(fragmentActivity, userSession, checkoutLaunchParams, this, str, false);
    }

    public static void A01(Context context, UserSession userSession, CheckoutLaunchParams checkoutLaunchParams, String str) {
        String str2;
        boolean z;
        HashMap A00 = A00(context, userSession, checkoutLaunchParams, str);
        if (A00.containsKey("products")) {
            str2 = (String) A00.get("products");
        } else {
            str2 = null;
        }
        String str3 = A01;
        if (str3 != null && str2 != null) {
            z = str3.equals(str2);
        } else {
            z = false;
        }
        AtomicInteger atomicInteger = A02;
        if (z) {
            atomicInteger.incrementAndGet();
        } else {
            atomicInteger.set(0);
        }
        A01 = str2;
        AbstractC191798eb.A04(context, new C191778eZ(userSession), "com.bloks.www.bloks.commerce.checkout", A00, 120L);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.HjT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [X.Ils, X.JPv, java.lang.Object] */
    public static void A02(FragmentActivity fragmentActivity, UserSession userSession, CheckoutLaunchParams checkoutLaunchParams, C1XE c1xe, String str, boolean z) {
        String str2;
        RiT riT;
        RiT riT2;
        String str3 = checkoutLaunchParams.A02;
        String str4 = checkoutLaunchParams.A04;
        String str5 = checkoutLaunchParams.A06;
        ?? obj = new Object();
        obj.A03 = str5;
        obj.A00 = str3;
        obj.A01 = str4;
        obj.A02 = "checkout_init";
        InterfaceC11380iw interfaceC11380iw = C1XF.A01;
        c1xe.A00 = new C41579IaS(interfaceC11380iw, userSession, obj);
        try {
            ArrayList arrayList = checkoutLaunchParams.A09;
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            if (arrayList != null) {
                A0A.A0c();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ProductItem productItem = (ProductItem) it.next();
                    if (productItem != null) {
                        A0A.A0d();
                        String str6 = productItem.A03;
                        if (str6 != null) {
                            A0A.A0S("product_id", str6);
                        }
                        CurrencyAmountInfoImpl currencyAmountInfoImpl = productItem.A01;
                        if (currencyAmountInfoImpl != null) {
                            A0A.A0r("price");
                            AbstractC41329IQz.A00(A0A, currencyAmountInfoImpl);
                        }
                        A0A.A0Q("quantity", productItem.A00);
                        String str7 = productItem.A02;
                        if (str7 != null) {
                            A0A.A0S("launch_date_unix_timestamp", str7);
                        }
                        A0A.A0a();
                    }
                }
                A0A.A0Z();
            }
            A0A.close();
            str2 = stringWriter.toString();
        } catch (IOException e) {
            C0K8.A0G("checkout_information_params", "Error serializing to JSON", e);
            str2 = "";
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36311066564886955L);
        C18U.A06(c06090Tz, userSession, 36311066564821418L);
        String str8 = str2;
        A03(userSession, checkoutLaunchParams, c1xe.A00, str8, str, "start", "click");
        C14360o3.A0B(fragmentActivity, 0);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A00 = A012.A00(A012.A00, "user_click_fbpaycheckout_atomic");
        if (A00.isSampled()) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            try {
                Iterator it2 = checkoutLaunchParams.A09.iterator();
                C14360o3.A07(it2);
                while (it2.hasNext()) {
                    String str9 = ((ProductItem) it2.next()).A03;
                    C14360o3.A07(str9);
                    arrayList2.add(Long.valueOf(Long.parseLong(str9)));
                }
                String str10 = checkoutLaunchParams.A06;
                C14360o3.A07(str10);
                arrayList3.add(Long.valueOf(Long.parseLong(str10)));
            } catch (NumberFormatException e2) {
                C0w9.A07("CheckoutUPLLoggingHelper", e2);
            }
            A00.AAP(AbstractC31188DnX.A00(), checkoutLaunchParams.A02);
            A00.A8R(C2O5.A0F, "product_type");
            A00.A8R(EnumC31203Dnm.ANDROID, "platform");
            A00.A9K("actual_event_time", Long.valueOf(System.currentTimeMillis()));
            QCR qcr = new QCR();
            qcr.A06("target_name", "checkout");
            qcr.A06("view_name", "checkout");
            A00.AAQ(qcr, "event_payload");
            C0Zx c0Zx = new C0Zx() { // from class: X.9Wf
            };
            c0Zx.A06("checkout_flow", "checkout_init");
            c0Zx.A07("product_ids", arrayList2);
            c0Zx.A07("seller_ids", arrayList3);
            if (AbstractC72723Nt.A00(fragmentActivity)) {
                riT2 = RiT.DARK;
            } else {
                riT2 = RiT.LIGHT;
            }
            c0Zx.A01(riT2, "ui_mode");
            c0Zx.A06("navigation_chain", C1QM.A00.A02.A00);
            c0Zx.A06("external_session_id", checkoutLaunchParams.A08);
            A00.AAQ(c0Zx, "custom_fields");
            A00.Cht();
        }
        HashMap A002 = A00(fragmentActivity, userSession, checkoutLaunchParams, str);
        int i = 719983200;
        if (!A06) {
            i = 37355529;
        }
        new Random().nextInt();
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A0N = Integer.valueOf(R.layout.checkout_shimmer_loading_view);
        C66277U6x A013 = C66277U6x.A01("com.bloks.www.bloks.commerce.checkout", A002);
        A013.A00 = i;
        if (!str.equals("bottom_sheet") && !str.equals("bottom_sheet_index_cart") && !z) {
            C41579IaS c41579IaS = c1xe.A00;
            ?? obj2 = new Object();
            obj2.A01 = c41579IaS;
            obj2.A00 = checkoutLaunchParams;
            igBloksScreenConfig.A04 = obj2;
            igBloksScreenConfig.A05 = new HDV(checkoutLaunchParams, c1xe, str, str2);
            A013.A09.add(new C69027Vg3(c1xe, str));
            C72743Nv A03 = A013.A03(fragmentActivity, igBloksScreenConfig);
            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
            c140966Yy.A0E(A03);
            c140966Yy.A04();
        } else {
            new C6XJ(fragmentActivity, W6d.A00(igBloksScreenConfig, A013), userSession, ModalActivity.class, "bloks").A0C(fragmentActivity);
        }
        A03(userSession, checkoutLaunchParams, c1xe.A00, str8, str, "shimmer_loading", "init");
        C18920wW A014 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        C25531Mh c25531Mh = new C25531Mh(A014.A00(A014.A00, "client_load_loading_init"), 79);
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            try {
                Iterator it3 = checkoutLaunchParams.A09.iterator();
                C14360o3.A07(it3);
                while (it3.hasNext()) {
                    String str11 = ((ProductItem) it3.next()).A03;
                    C14360o3.A07(str11);
                    arrayList4.add(Long.valueOf(Long.parseLong(str11)));
                }
                String str12 = checkoutLaunchParams.A06;
                C14360o3.A07(str12);
                arrayList5.add(Long.valueOf(Long.parseLong(str12)));
            } catch (NumberFormatException e3) {
                C0w9.A07("CheckoutUPLLoggingHelper", e3);
            }
            c25531Mh.A0u(checkoutLaunchParams.A02);
            c25531Mh.A0M(C2O5.A0F, "product_type");
            c25531Mh.A0M(EnumC31203Dnm.ANDROID, "platform");
            c25531Mh.A0Q("actual_event_time", Long.valueOf(System.currentTimeMillis()));
            QCW qcw = new QCW();
            qcw.A06("target_name", "checkout");
            qcw.A06("view_name", "checkout");
            c25531Mh.A0N(qcw, "event_payload");
            QBm qBm = new QBm();
            qBm.A06("checkout_flow", "checkout_init");
            qBm.A07("product_ids", arrayList4);
            qBm.A07("seller_ids", arrayList5);
            if (AbstractC72723Nt.A00(fragmentActivity)) {
                riT = RiT.DARK;
            } else {
                riT = RiT.LIGHT;
            }
            qBm.A01(riT, "ui_mode");
            qBm.A06("navigation_chain", C1QM.A00.A02.A00);
            qBm.A06("external_session_id", checkoutLaunchParams.A08);
            c25531Mh.A0N(qBm, "custom_fields");
            c25531Mh.Cht();
        }
        AbstractC191798eb.A01(fragmentActivity, new C191778eZ(userSession), "com.bloks.www.bloks.commerce.checkout", null, A002);
    }
}
