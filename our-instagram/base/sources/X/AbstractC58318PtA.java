package X;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.SparseArray;
import android.widget.ImageView;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.proxygen.HTTPRequestError;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayOutputStream;
import java.lang.ref.Reference;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReadWriteLock;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* renamed from: X.PtA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58318PtA {
    public static char A00(String str) {
        return str.charAt(0);
    }

    public static SharedPreferences A0F(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }

    public static String A0h(C2JS c2js) {
        return c2js.getOptionalStringField(0, "text");
    }

    public static String A0j(String str, int i) {
        return str.substring(0, i);
    }

    public static String A0k(String str, Object[] objArr) {
        return String.format(null, str, objArr);
    }

    public static StringBuilder A0r(int i, int i2) {
        return new StringBuilder(i + i2);
    }

    public static Method A0t(Class cls, String str) {
        return cls.getMethod(str, new Class[0]);
    }

    public static void A1D(Resources resources, ImageView imageView, int i) {
        imageView.setImageDrawable(resources.getDrawable(i, null));
    }

    public static Object[] A1b() {
        return new Object[0];
    }

    public static int A01(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int A02(int i) {
        return (i & 267386880) >>> 20;
    }

    public static int A03(int i, int i2, int i3) {
        return i3 | ((i & 8191) << i2);
    }

    public static int A07(Object obj) {
        return ((Integer) obj).intValue();
    }

    public static Intent A0C() {
        return new Intent("android.intent.action.VIEW");
    }

    public static Intent A0D(android.net.Uri uri) {
        return new Intent("android.intent.action.VIEW", uri);
    }

    public static Intent A0E(String str) {
        return new Intent(str);
    }

    public static SparseArray A0G() {
        return new SparseArray();
    }

    public static C53092Ne5 A0H(String str) {
        return new C53092Ne5(str);
    }

    public static C58252li A0I() {
        return new C58252li();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2GT, X.2GS] */
    public static C2GS A0J() {
        return new C2GT();
    }

    public static C126315nS A0M(Class cls, String str, int i) {
        return new C126315nS(cls, str, i);
    }

    public static C126845oO A0N(InterfaceC126325nT interfaceC126325nT, String str) {
        return new C126845oO(interfaceC126325nT, str);
    }

    public static C4OK A0O(Class cls, String str, int i) {
        return new C4OK(cls, str, i);
    }

    public static C4OW A0P(C4Og c4Og) {
        return new C4OW(c4Og, "profile_pic_url");
    }

    public static C94774Oi A0Q() {
        return new C94774Oi(C94754Oe.A00);
    }

    public static HTTPRequestError.ProxygenError A0R(String str, int i) {
        return new HTTPRequestError.ProxygenError(str, i);
    }

    public static ByteArrayOutputStream A0U() {
        return new ByteArrayOutputStream();
    }

    public static AssertionError A0V() {
        return new AssertionError();
    }

    public static AssertionError A0W(Object obj) {
        return new AssertionError(obj);
    }

    public static IllegalArgumentException A0Y() {
        return new IllegalArgumentException();
    }

    public static IllegalStateException A0Z() {
        return new IllegalStateException();
    }

    public static IndexOutOfBoundsException A0a(String str) {
        return new IndexOutOfBoundsException(str);
    }

    public static Object A0b() {
        return new Object();
    }

    public static Object A0d(AnonymousClass469 anonymousClass469, ContainerDeserializerBase containerDeserializerBase) {
        return containerDeserializerBase.A01.BXX(anonymousClass469);
    }

    public static RuntimeException A0e(String str, Throwable th) {
        return new RuntimeException(str, th);
    }

    public static RuntimeException A0f(Throwable th) {
        return new RuntimeException(th);
    }

    public static String A0g(int i, String str) {
        return str.substring(i + 1);
    }

    public static String A0m(Charset charset, byte[] bArr) {
        return new String(bArr, charset);
    }

    public static String A0n(Charset charset, byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, charset);
    }

    public static StringBuilder A0q(int i) {
        return new StringBuilder(i);
    }

    public static StringBuilder A0s(String str) {
        return new StringBuilder(str);
    }

    public static Charset A0u() {
        return Charset.forName(ReactWebViewManager.HTML_ENCODING);
    }

    public static GeneralSecurityException A0v() {
        return new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
    }

    public static GeneralSecurityException A0w() {
        return new GeneralSecurityException("Key size mismatch");
    }

    public static GeneralSecurityException A0x(String str) {
        return new GeneralSecurityException(str);
    }

    public static ConcurrentModificationException A0z() {
        return new ConcurrentModificationException();
    }

    public static HashMap A10(Map map) {
        return new HashMap(map);
    }

    public static LinkedList A11() {
        return new LinkedList();
    }

    public static NoSuchElementException A13() {
        return new NoSuchElementException();
    }

    public static ConcurrentHashMap A14() {
        return new ConcurrentHashMap();
    }

    public static AtomicLong A15(long j) {
        return new AtomicLong(j);
    }

    public static SecretKeySpec A16(String str, byte[] bArr) {
        return new SecretKeySpec(bArr, str);
    }

    public static JSONObject A17(String str) {
        return new JSONObject(str);
    }

    public static void A19(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i & 255);
    }

    public static void A1I(InterfaceC58362lv interfaceC58362lv, Object obj) {
        ((C2GT) obj).A08(interfaceC58362lv);
    }

    public static void A1J(AbstractC02600Aj abstractC02600Aj, String str) {
        abstractC02600Aj.A0R("iab_session_id", str);
    }

    public static void A1K(GraphQlCallInput graphQlCallInput, C2JM c2jm) {
        c2jm.A00(graphQlCallInput, "input");
    }

    public static void A1L(IABEvent iABEvent, StringBuilder sb) {
        sb.append(iABEvent.A00);
    }

    public static void A1M(RhW rhW, Object obj, Map map) {
        map.put(rhW.A00, obj);
    }

    public static void A1S(StringBuilder sb) {
        sb.append(", ");
    }

    public static void A1X(Map map) {
        map.put("credential_type", "shop_pay");
    }

    public static void A1Z(char[] cArr, char[] cArr2, int i, int i2) {
        cArr2[i2] = cArr[i & 15];
    }

    public static int A04(BroadcastReceiver broadcastReceiver, Context context, Intent intent, int i) {
        int A01 = C0f9.A01(i);
        C0fM.A01(broadcastReceiver, context, intent);
        return A01;
    }

    public static int A05(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        return googleApiAvailabilityLight.A03(context, 12451000);
    }

    public static int A06(Enum r0, int[] iArr) {
        return iArr[r0.ordinal()];
    }

    public static int A08(AbstractCollection abstractCollection) {
        return abstractCollection.size() - 1;
    }

    public static int A09(Collection collection, int i) {
        return i + collection.size();
    }

    public static long A0A(int i) {
        return i & 1048575;
    }

    public static long A0B(long j) {
        return SystemClock.elapsedRealtime() - j;
    }

    public static C58883QEt A0K(Reference reference) {
        return (C58883QEt) reference.get();
    }

    public static C44455JlN A0L(InterfaceC09390do interfaceC09390do) {
        return (C44455JlN) interfaceC09390do.getValue();
    }

    public static C63406Sjd A0S(C2GT c2gt) {
        return (C63406Sjd) c2gt.A02();
    }

    public static UserSession A0T() {
        return C2FP.A0D().A00;
    }

    public static Class A0X(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        return obj.getClass();
    }

    public static Object A0c(SparseArray sparseArray, int i) {
        Object obj = sparseArray.get(i);
        obj.getClass();
        return obj;
    }

    public static String A0i(Object obj, Map map) {
        return (String) map.get(obj);
    }

    public static String A0l(StringBuilder sb, int i) {
        sb.append(i);
        return sb.toString();
    }

    public static String A0o(Locale locale, String str, Object[] objArr) {
        String format = String.format(locale, str, objArr);
        C14360o3.A07(format);
        return format;
    }

    public static String A0p(Map.Entry entry) {
        return (String) entry.getValue();
    }

    public static Collection A0y(Map.Entry entry) {
        return (Collection) entry.getValue();
    }

    public static Map A12(Map map) {
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        C14360o3.A07(unmodifiableMap);
        return unmodifiableMap;
    }

    public static void A18() {
        Thread.currentThread().interrupt();
    }

    public static void A1A(long j, List list) {
        list.add(Long.valueOf(j));
    }

    public static void A1B(ContentValues contentValues, String str, int i) {
        contentValues.put(str, Integer.valueOf(i));
    }

    public static void A1C(SharedPreferences.Editor editor, String str, String str2) {
        editor.putString(str, str2).apply();
    }

    public static void A1E(Binder binder, Parcel parcel) {
        parcel.enforceInterface(binder.getInterfaceDescriptor());
    }

    public static void A1F(Handler handler, Object obj, int i) {
        handler.obtainMessage(i, obj).sendToTarget();
    }

    public static void A1G(Parcel parcel, Number number) {
        parcel.writeLong(number.longValue());
    }

    public static void A1H(Parcel parcel, Number number) {
        parcel.writeInt(number.intValue());
    }

    public static void A1N(AbstractC913445n abstractC913445n, AbstractC910944l abstractC910944l, String str, Object[] objArr) {
        abstractC913445n.A08(abstractC910944l, String.format(str, objArr));
        throw C00O.createAndThrow();
    }

    public static void A1O(C19280xC c19280xC, String str, int i) {
        c19280xC.A08(Integer.valueOf(i), str);
    }

    public static void A1P(Class cls, Object obj, AbstractMap abstractMap) {
        abstractMap.put(cls.getName(), obj);
    }

    public static void A1Q(Class cls, StringBuilder sb) {
        sb.append(cls.getName());
    }

    public static void A1R(Object obj, AbstractMap abstractMap, long j) {
        abstractMap.put(obj, String.valueOf(j));
    }

    public static void A1T(StringBuilder sb, int i) {
        sb.append(Integer.toHexString(i));
    }

    public static void A1U(StringBuilder sb, Object obj) {
        sb.append(obj.getClass());
    }

    public static void A1V(StringBuilder sb, Object obj) {
        sb.append(obj.toString());
    }

    public static void A1W(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(it.next());
    }

    public static void A1Y(ReadWriteLock readWriteLock) {
        readWriteLock.writeLock().unlock();
    }

    public static byte[] A1a(String str, Charset charset) {
        byte[] bytes = str.getBytes(charset);
        C14360o3.A07(bytes);
        return bytes;
    }
}
