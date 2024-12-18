package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.webkit.WebResourceRequest;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebookpay.logging.FBPayLoggerData;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.google.common.collect.ImmutableMap;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.math.BigInteger;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import org.webrtc.VideoCodecInfo;

/* renamed from: X.PtB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58319PtB {
    public static long A07(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.01p, X.0yX] */
    public static C20030yX A0A() {
        return new C005001p(0);
    }

    public static ImmutableMap.Builder A0Z() {
        return new ImmutableMap.Builder(4);
    }

    public static C26371Ps A0e() {
        return new C26371Ps((C1JP) null);
    }

    public static CountDownLatch A15() {
        return new CountDownLatch(1);
    }

    public static AtomicInteger A16() {
        return new AtomicInteger(0);
    }

    public static void A1B(IBinder iBinder, Parcel parcel, int i) {
        iBinder.transact(i, parcel, null, 1);
    }

    public static void A1D(Parcel parcel, String str, int i, boolean z) {
        AbstractC128825rw.A0C(parcel, str, 3, z);
        AbstractC128825rw.A06(parcel, i);
    }

    public static boolean A1P(int i, int i2) {
        return i <= i2;
    }

    public static boolean A1Q(Parcel parcel, String str) {
        AbstractC128825rw.A0C(parcel, str, 1, false);
        return false;
    }

    public static boolean A1R(Parcel parcel, byte[] bArr) {
        AbstractC128825rw.A0F(parcel, bArr, 2, false);
        return false;
    }

    public static int A01(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static int A02(int i, int i2) {
        if (i > 32) {
            return i - ((i - 1) & (-32));
        }
        return i2;
    }

    public static int A03(int i, int[] iArr) {
        return iArr[i + 2] & 1048575;
    }

    public static int A04(Parcel parcel) {
        return AbstractC128825rw.A01(parcel, 20293);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0bW, java.lang.Object] */
    public static android.net.Uri A09(String str) {
        return AbstractC08820cl.A01(new Object(), str);
    }

    public static C4OW A0B(C4Og c4Og) {
        return new C4OW(c4Og, "has_next_page");
    }

    public static C4OW A0E(C4Og c4Og) {
        return new C4OW(c4Og, "full_name");
    }

    public static C4OW A0H(C4Og c4Og) {
        return new C4OW(c4Og, "pk");
    }

    public static C4OW A0K(C4Og c4Og) {
        return new C4OW(c4Og, "pk_id");
    }

    public static C4OW A0N(C4Og c4Og) {
        return new C4OW(c4Og, IgReactMediaPickerNativeModule.HEIGHT);
    }

    public static C4OW A0O(C4Og c4Og) {
        return new C4OW(c4Og, "is_private");
    }

    public static C4OW A0P(C4Og c4Og) {
        return new C4OW(c4Og, "is_verified");
    }

    public static C4OW A0Q(C4Og c4Og) {
        return new C4OW(c4Og, "profile_pic_id");
    }

    public static C94774Oi A0R() {
        return new C94774Oi(C94894Ou.A00);
    }

    public static C94774Oi A0S() {
        return new C94774Oi(C95124Py.A00);
    }

    public static C4N8 A0V(Context context, C74103Uo c74103Uo, String str) {
        return c74103Uo.A00(context, AnonymousClass001.A0R("rti.mqtt.", str));
    }

    public static FBPayLoggerData A0W(Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("logger_data");
        parcelable.getClass();
        return (FBPayLoggerData) parcelable;
    }

    public static C63406Sjd A0X(Object obj) {
        C63406Sjd c63406Sjd = (C63406Sjd) obj;
        C14360o3.A0B(c63406Sjd, 0);
        return c63406Sjd;
    }

    public static C5KS A0Y(Object obj) {
        C5KS c5ks = new C5KS();
        c5ks.A0D(obj);
        return c5ks;
    }

    public static String A0s(CharSequence charSequence, String str, String str2) {
        return new C11L(str).A00(charSequence, str2);
    }

    public static String A0w(StringBuilder sb) {
        sb.append("]");
        return sb.toString();
    }

    public static String A0x(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static void A19(Intent intent, String str, String str2) {
        intent.setComponent(new ComponentName(str, str2));
    }

    public static void A1C(Parcel parcel, int i, int i2) {
        AbstractC128825rw.A07(parcel, 1000, i);
        AbstractC128825rw.A06(parcel, i2);
    }

    public static void A1I(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new C23781El(str, str2));
    }

    public static void A1J(String str, AbstractCollection abstractCollection, Map map) {
        abstractCollection.add(new VideoCodecInfo(str, map));
    }

    public static void A1M(ArrayList arrayList, InterfaceC16660sJ interfaceC16660sJ, int i) {
        arrayList.removeIf(new C31424DrU(i, interfaceC16660sJ));
    }

    public static byte[] A1X(Object obj, int i, int i2) {
        byte[] bArr = new byte[i];
        System.arraycopy(obj, i2, bArr, 0, i);
        return bArr;
    }

    public static String[] A1b(AbstractCollection abstractCollection, int i) {
        return (String[]) abstractCollection.toArray(new String[i]);
    }

    public static char A00(String str, StringBuilder sb) {
        sb.append(str);
        sb.append('\'');
        return '\'';
    }

    public static int A05(Object obj) {
        return String.valueOf(obj).length();
    }

    public static int A06(Object obj, Object obj2, Object obj3) {
        return Arrays.hashCode(new Object[]{obj, obj2, obj3});
    }

    public static Configuration A08(Context context) {
        return context.getResources().getConfiguration();
    }

    public static C4OW A0C(C4Og c4Og) {
        return new C4OW(c4Og, "text");
    }

    public static C4OW A0D(C4Og c4Og) {
        return new C4OW(c4Og, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
    }

    public static C4OW A0F(C4Og c4Og) {
        return new C4OW(c4Og, "strong_id__");
    }

    public static C4OW A0G(C4Og c4Og) {
        return new C4OW(c4Og, AbstractC31198Dnh.A01());
    }

    public static C4OW A0I(C4Og c4Og) {
        return new C4OW(c4Og, "url");
    }

    public static C4OW A0J(C4Og c4Og) {
        return new C4OW(c4Og, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public static C4OW A0L(C4Og c4Og) {
        return new C4OW(c4Og, DialogModule.KEY_TITLE);
    }

    public static C4OW A0M(C4Og c4Og) {
        return new C4OW(c4Og, IgReactMediaPickerNativeModule.WIDTH);
    }

    public static C4OU A0T(C4OM c4om, C4OM c4om2, C4OM c4om3) {
        return new C4OU(new C4OM[]{c4om, c4om2, c4om3});
    }

    public static C4OU A0U(C4OM c4om, C4OM c4om2, C4OM c4om3, C4OM c4om4, C4OM c4om5) {
        return new C4OU(new C4OM[]{c4om, c4om2, c4om3, c4om4, c4om5});
    }

    public static C1LC A0a(C2JS c2js, Class cls, String str, int i, int i2) {
        return c2js.getRequiredCompactedTreeListField(i, str, cls, i2).iterator();
    }

    public static C58526Pwu A0b(Number number) {
        int intValue = number.intValue();
        ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.put((byte) 0);
        allocate.putInt(intValue);
        return C58526Pwu.A00(allocate.array());
    }

    public static C58526Pwu A0c(Number number) {
        int intValue = number.intValue();
        ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.put((byte) 1);
        allocate.putInt(intValue);
        return C58526Pwu.A00(allocate.array());
    }

    public static C26461Qb A0d(C1QW c1qw, C1QX c1qx) {
        return new C26461Qb(c1qw, c1qx.A00());
    }

    public static ArrayIndexOutOfBoundsException A0f(String str, Object[] objArr) {
        return new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    public static ClassLoader A0g(Object obj) {
        return obj.getClass().getClassLoader();
    }

    public static IllegalArgumentException A0h(String str, long j) {
        return new IllegalArgumentException(AnonymousClass001.A0Q(str, j));
    }

    public static IllegalArgumentException A0i(String str, String str2, String str3, String str4) {
        return new IllegalArgumentException(AnonymousClass001.A0u(str, str2, str3, str4));
    }

    public static IllegalArgumentException A0j(String str, Object[] objArr) {
        return new IllegalArgumentException(String.format(str, objArr));
    }

    public static IllegalStateException A0k(String str, String str2, String str3) {
        return new IllegalStateException(AnonymousClass001.A0g(str, str2, str3));
    }

    public static IllegalStateException A0l(String str, Object[] objArr) {
        return new IllegalStateException(String.format(str, objArr));
    }

    public static Integer A0m(String str) {
        return Integer.valueOf(Integer.parseInt(str));
    }

    public static Object A0n(AbstractMap abstractMap, int i) {
        return abstractMap.get(Integer.valueOf(i));
    }

    public static SecurityException A0o(String str, String str2) {
        return new SecurityException(AnonymousClass001.A0R(str, str2));
    }

    public static String A0p(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    public static String A0q(Uri.Builder builder) {
        return builder.build().toString();
    }

    public static String A0r(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getUrl().toString();
    }

    public static String A0t(Class cls, String str) {
        return AnonymousClass001.A0R(str, cls.getName());
    }

    public static String A0u(Object obj) {
        return obj.getClass().getCanonicalName();
    }

    public static String A0v(Object obj, AbstractMap abstractMap) {
        return (String) abstractMap.get(obj);
    }

    public static BigInteger A0y(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.multiply(bigInteger).mod(bigInteger2);
    }

    public static GeneralSecurityException A0z(String str, Object[] objArr) {
        return new GeneralSecurityException(String.format(str, objArr));
    }

    public static InvalidAlgorithmParameterException A10(String str, Object[] objArr) {
        return new InvalidAlgorithmParameterException(String.format(str, objArr));
    }

    public static ArrayList A11(AbstractCollection abstractCollection) {
        return new ArrayList(abstractCollection.size());
    }

    public static ArrayList A12(Object[] objArr) {
        return new ArrayList(Arrays.asList(objArr));
    }

    public static HashSet A13(Object[] objArr) {
        return new HashSet(Arrays.asList(objArr));
    }

    public static Iterator A14(BaseBundle baseBundle) {
        return baseBundle.keySet().iterator();
    }

    public static Logger A17(Class cls) {
        return Logger.getLogger(cls.getName());
    }

    public static void A18(long j, StringBuilder sb) {
        sb.append(j);
        sb.append(", createdAtTs=");
    }

    public static void A1A(BaseBundle baseBundle, String str) {
        baseBundle.putStringArray("PTT_UTIL_CAP_NAMES", new String[]{str});
    }

    public static void A1E(SYG syg, InterfaceC65616To7 interfaceC65616To7, int i, int i2) {
        interfaceC65616To7.FFj(AbstractC63227Sfe.A00(syg, i, i2));
    }

    public static void A1F(AbstractC02600Aj abstractC02600Aj, double d) {
        abstractC02600Aj.A0P("event_ts", Double.valueOf(d));
    }

    public static void A1G(C16L c16l, AnonymousClass469 anonymousClass469, StdDeserializer stdDeserializer) {
        anonymousClass469.A0R(c16l, stdDeserializer.A0U(anonymousClass469));
        throw C00O.createAndThrow();
    }

    public static void A1H(Object obj, AbstractMap abstractMap, int i) {
        abstractMap.put(Integer.valueOf(i), obj);
    }

    public static void A1K(StringBuilder sb, String str) {
        sb.append(str);
        sb.append('\'');
    }

    public static void A1L(Buffer buffer, int i) {
        buffer.position(buffer.position() + i);
    }

    public static void A1N(Iterator it) {
        ((Runnable) it.next()).run();
    }

    public static boolean A1O() {
        return C18U.A06(C06090Tz.A05, C2FP.A0D().A00, 36315503265844580L);
    }

    public static boolean A1T(CharSequence charSequence, int i) {
        return Character.isWhitespace(charSequence.charAt(i));
    }

    public static boolean A1U(Object obj, List list, int i) {
        return obj.equals(list.get(i));
    }

    public static boolean A1V(Map.Entry entry, Map map) {
        return map.containsKey(entry.getKey());
    }

    public static boolean A1W(java.util.Set set, int i) {
        return set.contains(Integer.valueOf(i));
    }

    public static Object[] A1Y(long j) {
        return new Object[]{Long.valueOf(j)};
    }

    public static Object[] A1Z(Throwable th) {
        return new Object[]{th.getMessage()};
    }

    public static Object[] A1a(Object[] objArr, int i) {
        Object[] copyOf = Arrays.copyOf(objArr, i);
        C14360o3.A07(copyOf);
        return copyOf;
    }

    public static boolean A1S(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll) {
        return C18U.A06(c06090Tz, abstractC12990ll, 36322800422824603L);
    }
}
