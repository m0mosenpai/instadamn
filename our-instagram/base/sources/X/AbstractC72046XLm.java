package X;

import android.os.Handler;
import com.facebook.dsp.core.ColorData;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.settings2.core.model.BloksNavigationRowDestinationValue;
import com.instagram.settings2.core.model.DictionaryValue;
import com.instagram.settings2.core.model.EqualsValue;
import com.instagram.settings2.core.model.IfValue;
import com.instagram.settings2.core.model.OrValue;
import com.instagram.settings2.core.model.ServerValue;
import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.XLm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72046XLm {
    public static int A00(Enum r1) {
        C14360o3.A0B(r1, 0);
        return r1.ordinal();
    }

    public static int A01(Number number) {
        C14360o3.A0B(number, 0);
        return number.intValue();
    }

    public static XPD A03(Object obj) {
        C14360o3.A0B(obj, 0);
        return XPD.A00;
    }

    public static TreeUpdaterJNI A05(SubscriptionStickerDictIntf subscriptionStickerDictIntf) {
        if (subscriptionStickerDictIntf != null) {
            return subscriptionStickerDictIntf.F7o();
        }
        return null;
    }

    public static IOException A0R(String str, Object[] objArr) {
        return new IOException(String.format(null, str, objArr));
    }

    public static Double A0T(C19260xA c19260xA, String str) {
        String A05 = c19260xA.A05(str);
        if (A05 != null) {
            return AnonymousClass010.A0m(A05);
        }
        return null;
    }

    public static Double A0V(Number number) {
        if (number != null) {
            return Double.valueOf(number.floatValue());
        }
        return null;
    }

    public static String A0a(C11500j9 c11500j9, C11520jB c11520jB) {
        Serializable A01 = c11520jB.A01(c11500j9);
        if (A01 != null) {
            return A01.toString();
        }
        return null;
    }

    public static ColorData A02(int i, int i2) {
        return new ColorData(i, i2);
    }

    public static C51757Mtg A04(AbstractC72483Xel abstractC72483Xel, InterfaceC57866PlW interfaceC57866PlW, String str) {
        return new C51757Mtg(abstractC72483Xel, interfaceC57866PlW, str);
    }

    public static InstagramMidcardType A06(String str, String str2, int i) {
        return new InstagramMidcardType(str, i, str2);
    }

    public static C11520jB A07(C11520jB c11520jB) {
        return (C11520jB) c11520jB.A01(C5I8.A5P);
    }

    public static C32110E9i A0A(String str, Locale locale, int i, int i2) {
        return new C32110E9i(str, locale, i, i2);
    }

    public static BloksNavigationRowDestinationValue A0B(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42, DictionaryValue dictionaryValue, String str) {
        return new BloksNavigationRowDestinationValue(abstractC55145Od4, abstractC55145Od42, dictionaryValue, str);
    }

    public static EqualsValue A0C(AbstractC55145Od4 abstractC55145Od4, Object obj) {
        return new EqualsValue(abstractC55145Od4, new NVA(obj));
    }

    public static IfValue A0D(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42, AbstractC55145Od4 abstractC55145Od43) {
        return new IfValue(abstractC55145Od4, abstractC55145Od42, abstractC55145Od43);
    }

    public static IfValue A0E(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42, Object obj) {
        return new IfValue(abstractC55145Od4, abstractC55145Od42, new NVA(obj));
    }

    public static NVE A0G(Class cls, Integer num) {
        return new NVE(num, new C0YZ(cls));
    }

    public static ServerValue A0J(Class cls, String str) {
        return new ServerValue(str, new C0YZ(cls));
    }

    public static ServerValue A0K(String str, InterfaceC16510rw interfaceC16510rw) {
        return new ServerValue(str, interfaceC16510rw);
    }

    public static NVA A0M(EnumC72365Xc1 enumC72365Xc1) {
        return new NVA(new C32105E9d(enumC72365Xc1));
    }

    public static NVA A0N(Integer num) {
        return new NVA(new C32105E9d(num));
    }

    public static NVA A0O(Object obj) {
        return new NVA(obj);
    }

    public static IllegalArgumentException A0X(String str, Object[] objArr) {
        return new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    public static AbstractCollection A0d(C11520jB c11520jB) {
        return (AbstractCollection) c11520jB.A01(C5I8.A6l);
    }

    public static AbstractCollection A0e(C11520jB c11520jB) {
        return (AbstractCollection) c11520jB.A01(C5I8.A8p);
    }

    public static AbstractMap A0f(C11520jB c11520jB) {
        return (AbstractMap) c11520jB.A01(C5I8.A6n);
    }

    public static HashMap A0g(int i) {
        return new HashMap(i);
    }

    public static List A0i(Object obj) {
        List singletonList = Collections.singletonList(new NVA(obj));
        C14360o3.A07(singletonList);
        return singletonList;
    }

    public static Locale A0k(String str, String str2) {
        return new Locale(str, str2);
    }

    public static void A0m(InterfaceC37541or interfaceC37541or, String str, int i) {
        if (str == null) {
            interfaceC37541or.ADj(i);
        } else {
            interfaceC37541or.ADp(i, str);
        }
    }

    public static void A0x(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A7v("is_unified_video", (Boolean) c11520jB.A01(C5I8.A4y));
    }

    public static void A0y(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("carousel_media_id", (String) c11520jB.A01(C5I8.A10));
    }

    public static void A0z(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("ad_position_from_server", (Long) c11520jB.A01(C5I8.A0I));
    }

    public static void A10(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("entity_page_name", (String) c11520jB.A01(C5I8.A2d));
    }

    public static void A11(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("carousel_cover_media_id", (String) c11520jB.A01(C5I8.A0x));
    }

    public static void A12(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("media_owner_id", (Long) c11520jB.A01(C5I8.A5U));
    }

    public static void A13(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A7v("is_influencer", (Boolean) c11520jB.A01(C5I8.A4P));
    }

    public static void A14(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("viewer_session_id", (String) c11520jB.A01(C5I8.A9o));
    }

    public static void A15(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("next_max_id", (Long) c11520jB.A01(C5I8.A67));
    }

    public static void A16(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A7v("is_acp_delivered", (Boolean) c11520jB.A01(C5I8.A3u));
    }

    public static void A17(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("hashtag_id", (Long) c11520jB.A01(C5I8.A3P));
    }

    public static void A18(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A8I("time_remaining", (Double) c11520jB.A01(C5I8.A9A));
    }

    public static void A19(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("connection_id", (String) c11520jB.A01(C5I8.A1X));
    }

    public static void A1A(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("m_pk", (String) c11520jB.A01(C5I8.A5K));
    }

    public static void A1B(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("merchant_id", (String) c11520jB.A01(C5I8.A5g));
    }

    public static void A1C(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("carousel_index", (Long) c11520jB.A01(C5I8.A0z));
    }

    public static void A1D(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A7v("is_eof", (Boolean) c11520jB.A01(C5I8.A4H));
    }

    public static void A1E(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A7v("production_build", (Boolean) c11520jB.A01(C5I8.A2i));
    }

    public static void A1F(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("inventory_source", (String) c11520jB.A01(C5I8.A3r));
    }

    public static void A1G(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("multi_ads_type_name", (String) c11520jB.A01(C5I8.A5z));
    }

    public static void A1H(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("seq_session", (Long) c11520jB.A01(C5I8.A80));
    }

    public static void A1I(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("carousel_type", (Long) c11520jB.A01(C5I8.A19));
    }

    public static void A1J(InterfaceC02590Ai interfaceC02590Ai, Double d) {
        interfaceC02590Ai.A8I("normalized_feed_position", d);
    }

    public static void A1K(InterfaceC02590Ai interfaceC02590Ai, Map map) {
        interfaceC02590Ai.A9M("product_merchant_ids", map);
    }

    public static void A1N(C0Zx c0Zx, C11520jB c11520jB) {
        c0Zx.A06("cta_color", (String) c11520jB.A01(C5I8.A1i));
    }

    public static void A1R(Object obj, Map map) {
        map.put("surface", obj);
    }

    public static void A1S(Object obj, Map map) {
        map.put("is_hidden", obj);
    }

    public static void A1T(Object obj, Map map) {
        map.put("is_pinned", obj);
    }

    public static void A1U(Object obj, Map map) {
        map.put("is_sticker", obj);
    }

    public static void A1V(Object obj, Map map) {
        map.put("attribution", obj);
    }

    public static void A1W(Object obj, Map map) {
        map.put("display_type", obj);
    }

    public static void A1X(Object obj, Map map) {
        map.put("is_fb_sticker", obj);
    }

    public static void A1Y(Object obj, Map map) {
        map.put("attribution_url", obj);
    }

    public static void A1Z(Object obj, Map map) {
        map.put("custom_text_color", obj);
    }

    public static void A1a(Object obj, Map map) {
        map.put("sticker_style_enum", obj);
    }

    public static void A1b(Object obj, Map map) {
        map.put("subscription_sticker", obj);
    }

    public static XOM A08(Object obj, Map map) {
        return (XOM) ((AbstractC72243XZy) map.get(obj));
    }

    public static AbstractC72243XZy A09(Object obj, Map map) {
        return (AbstractC72243XZy) map.get(obj);
    }

    public static C33160Ek5 A0F(long j, boolean z) {
        return new C33160Ek5(AbstractC20100yh.A00(j), z);
    }

    public static OrValue A0H(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42) {
        return new OrValue(AbstractC16960so.A1Q(abstractC55145Od4, abstractC55145Od42));
    }

    public static OrValue A0I(Object[] objArr) {
        return new OrValue(AbstractC16960so.A1Q(objArr));
    }

    public static NVA A0L(int i) {
        return new NVA(Integer.valueOf(i));
    }

    public static NVA A0P(Object obj) {
        List singletonList = Collections.singletonList(obj);
        C14360o3.A07(singletonList);
        return new NVA(singletonList);
    }

    public static NVA A0Q(Object[] objArr) {
        return new NVA(AbstractC16960so.A1Q(objArr));
    }

    public static Boolean A0S(C11500j9 c11500j9, C11520jB c11520jB) {
        return (Boolean) c11520jB.A01(c11500j9);
    }

    public static Double A0U(C11500j9 c11500j9, C11520jB c11520jB) {
        return (Double) c11520jB.A01(c11500j9);
    }

    public static Double A0W(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    public static Long A0Y(C11500j9 c11500j9, C11520jB c11520jB) {
        return (Long) c11520jB.A01(c11500j9);
    }

    public static Number A0Z(C11500j9 c11500j9, C11520jB c11520jB) {
        return (Number) c11520jB.A01(c11500j9);
    }

    public static Thread A0b(Handler handler) {
        return handler.getLooper().getThread();
    }

    public static AbstractCollection A0c(C11500j9 c11500j9, C11520jB c11520jB) {
        return (AbstractCollection) c11520jB.A01(c11500j9);
    }

    public static LinkedHashMap A0h(Iterable iterable) {
        return new LinkedHashMap(AbstractC06930Yk.A08(iterable));
    }

    public static List A0j(String str) {
        return Arrays.asList(str);
    }

    public static void A0l(InterfaceC37481ol interfaceC37481ol, String str) {
        interfaceC37481ol.ATG(str);
        interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    public static void A0n(InterfaceC02590Ai interfaceC02590Ai, InterfaceC11380iw interfaceC11380iw) {
        interfaceC02590Ai.AAP("module_name", interfaceC11380iw.getModuleName());
    }

    public static void A0o(InterfaceC02590Ai interfaceC02590Ai, C19260xA c19260xA, String str) {
        interfaceC02590Ai.AAP(str, c19260xA.A05(str));
    }

    public static void A0p(InterfaceC02590Ai interfaceC02590Ai, C11500j9 c11500j9, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("hashtag_name", (String) c11520jB.A01(c11500j9));
    }

    public static void A0q(InterfaceC02590Ai interfaceC02590Ai, C11500j9 c11500j9, C11520jB c11520jB) {
        interfaceC02590Ai.AAP("hashtag_follow_status", (String) c11520jB.A01(c11500j9));
    }

    public static void A0r(InterfaceC02590Ai interfaceC02590Ai, C11500j9 c11500j9, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("m_t", (Long) c11520jB.A01(c11500j9));
    }

    public static void A0s(InterfaceC02590Ai interfaceC02590Ai, C11500j9 c11500j9, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("a_pk", (Long) c11520jB.A01(c11500j9));
    }

    public static void A0t(InterfaceC02590Ai interfaceC02590Ai, C11500j9 c11500j9, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("ad_id", (Long) c11520jB.A01(c11500j9));
    }

    public static void A0u(InterfaceC02590Ai interfaceC02590Ai, C11500j9 c11500j9, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("media_type", (Long) c11520jB.A01(c11500j9));
    }

    public static void A0v(InterfaceC02590Ai interfaceC02590Ai, C11500j9 c11500j9, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("carousel_m_t", (Long) c11520jB.A01(c11500j9));
    }

    public static void A0w(InterfaceC02590Ai interfaceC02590Ai, C11500j9 c11500j9, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("carousel_media_type", (Long) c11520jB.A01(c11500j9));
    }

    public static void A1L(C0Zx c0Zx, C19260xA c19260xA, String str) {
        c0Zx.A06(str, c19260xA.A05(str));
    }

    public static void A1M(C0Zx c0Zx, C19260xA c19260xA, String str) {
        c0Zx.A03(str, c19260xA.A01(str));
    }

    public static void A1O(C0Zx c0Zx, String str, double d) {
        c0Zx.A04(str, Double.valueOf(d));
    }

    public static void A1P(C0Zx c0Zx, String str, long j) {
        c0Zx.A05(str, Long.valueOf(j));
    }

    public static void A1Q(Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, Collections.emptyList());
    }
}
