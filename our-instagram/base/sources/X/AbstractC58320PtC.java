package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.webkit.WebSettings;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.logging.FBPayLoggerData;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.webrtc.VideoCodecInfo;

/* renamed from: X.PtC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58320PtC {
    public static int A00(Object obj, Iterator it, int i) {
        byte[] bArr = (byte[]) it.next();
        int length = bArr.length;
        System.arraycopy(bArr, 0, obj, i, length);
        return i + length;
    }

    public static long A06(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static long A07(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static long A08(OutputStream outputStream, long j) {
        outputStream.write((((int) j) & StringTreeSet.MAX_SYMBOL_COUNT) | 128);
        return j >>> 7;
    }

    public static C6FW A0g(Object obj) {
        C6FX c6fx = new C6FX();
        c6fx.A03(obj, 0);
        return c6fx.A00();
    }

    public static IllegalStateException A0p(String str, Object[] objArr) {
        return new IllegalStateException(String.format(null, str, objArr));
    }

    public static Object A0s(Class cls) {
        return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
    }

    public static Object A0t(Class cls) {
        return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }

    public static Object A0v(Field[] fieldArr, int i) {
        Field field = fieldArr[i];
        field.setAccessible(true);
        return field.get(null);
    }

    public static String A0z(C2JS c2js, Class cls, int i) {
        return c2js.reinterpretRequired(0, cls, i).getOptionalStringField(0, "text");
    }

    public static String A10(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        return AbstractC11060iN.A00(abstractC12990ll).BdA();
    }

    public static void A1F(Parcel parcel, int i, boolean z) {
        AbstractC128825rw.A09(parcel, 1, z);
        AbstractC128825rw.A06(parcel, i);
    }

    public static void A1G(Parcel parcel, Parcelable parcelable, int i, int i2) {
        AbstractC128825rw.A0A(parcel, parcelable, 1, i, false);
        AbstractC128825rw.A06(parcel, i2);
    }

    public static void A1H(Animation animation) {
        animation.setFillAfter(true);
        animation.setInterpolator(new AccelerateInterpolator());
    }

    public static void A1L(String str, Object obj) {
        if (android.util.Log.isLoggable(str, 3)) {
            String.valueOf(String.valueOf(obj));
        }
    }

    public static void A1M(String str, String str2) {
        if (android.util.Log.isLoggable(str, 5)) {
            android.util.Log.w(str, str2);
        }
    }

    public static boolean A1U(Parcel parcel) {
        if (parcel.readInt() != 1) {
            return false;
        }
        return true;
    }

    public static boolean A1V(Parcel parcel) {
        if (parcel.readInt() != 1) {
            return false;
        }
        return true;
    }

    public static boolean A1X(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    public static int A03(int[] iArr, int i, int i2, int i3) {
        if (i >= 18 && i <= 49) {
            int i4 = i2 + 1;
            iArr[i2] = i3;
            return i4;
        }
        return i2;
    }

    public static int A04(Object[] objArr, Object[] objArr2, int i, int i2) {
        int i3 = i2 + 1;
        objArr2[((i / 3) * 2) + 1] = objArr[i2];
        return i3;
    }

    public static long A05(int i, long j) {
        return j - C36J.A03(C36H.A03(C36G.A03, i));
    }

    public static Intent A0B(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        return intent;
    }

    public static Uri.Builder A0D() {
        return new Uri.Builder().scheme("content");
    }

    public static BadParcelableException A0E(int i) {
        return new BadParcelableException(AnonymousClass001.A0O("Parcel data not fully consumed, unread size: ", i));
    }

    public static C58772Q8e A0H(InterfaceC018407e interfaceC018407e) {
        return (C58772Q8e) new C52942bb(interfaceC018407e).A00(C58772Q8e.class);
    }

    public static Q67 A0I(Object obj, Object obj2) {
        C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (Q67) AbstractC75013Yr.A08((Q67) obj2);
    }

    public static C4OW A0M() {
        return new C4OW(C94754Oe.A00, "client_mutation_id");
    }

    public static C4OW A0N() {
        return new C4OW(C94754Oe.A00, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public static C4OW A0O(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), TraceFieldType.BroadcastId);
    }

    public static C4OW A0P(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public static C4OW A0Q(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "pk");
    }

    public static C4OW A0R(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "__typename");
    }

    public static C4OU A0T(C4OS c4os, C4OM c4om, Class cls, String str, int i) {
        return new C4OU(new C4OM[]{c4om, new C4OK(c4os, cls, str, i)});
    }

    public static C4OU A0U(C4Og c4Og, C4OM c4om, C4OM c4om2, C4OM c4om3, String str) {
        return new C4OU(new C4OM[]{c4om, c4om2, c4om3, new C4OW(c4Og, str)});
    }

    public static C4OU A0V(C4OM c4om, C4OM c4om2, Class cls, String str, int i) {
        return new C4OU(new C4OM[]{c4om, c4om2, new C4OK(cls, str, i)});
    }

    public static C4OU A0W(C4OM c4om, Class cls, String str, int i) {
        return new C4OU(new C4OM[]{c4om, new C4OK(cls, str, i)});
    }

    public static C126895oT A0X(C4Og c4Og, String str, String str2) {
        return new C126895oT(new C4OW(c4Og, str), str2);
    }

    public static C2U6 A0Y() {
        if (C2U4.A00 != null) {
            C2U6 c2u6 = C2U4.A00;
            C14360o3.A0C(c2u6, "null cannot be cast to non-null type com.facebook.privacy.zone.api.ZoneInterface");
            return c2u6;
        }
        return C2U5.A00;
    }

    public static C45U A0a(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469, Class cls) {
        if (interfaceC65620ToB != null) {
            return interfaceC65620ToB.AVZ(anonymousClass469.A02, cls);
        }
        return C45U.A07;
    }

    public static InterfaceC65595Tne A0d(Object obj) {
        return C58540Px8.A02.A00(obj.getClass());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.IOException, X.4L5] */
    public static C4L5 A0e(String str) {
        ?? iOException = new IOException(str);
        iOException.A00 = null;
        return iOException;
    }

    public static InterfaceC65596Tnf A0f(Object obj) {
        return SYX.A02.A00(obj.getClass());
    }

    public static BufferedReader A0h(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    public static IndexOutOfBoundsException A0q(int i) {
        return new IndexOutOfBoundsException(AnonymousClass001.A0c("Beginning index: ", " < 0", i));
    }

    public static String A0w(int i, String str, String str2) {
        if (i != 0) {
            return str.concat(str2);
        }
        return new String(str);
    }

    public static String A14(StringBuilder sb) {
        sb.append(']');
        return sb.toString();
    }

    public static URLConnection A16(String str) {
        return new java.net.URL(str).openConnection();
    }

    public static GeneralSecurityException A18(PxH pxH) {
        return new GeneralSecurityException(AnonymousClass001.A0O("Unable to parse OutputPrefixType: ", pxH.A01()));
    }

    public static LinkedHashMap A1B(C70073W1q c70073W1q) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c70073W1q != null) {
            C70199WGm.A08(c70073W1q, linkedHashMap);
        }
        return linkedHashMap;
    }

    public static java.util.Set A1C(Object obj) {
        return Collections.unmodifiableMap(((AutofillData) obj).A00).keySet();
    }

    public static byte[] A1Z(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        return mac.doFinal(bArr2);
    }

    public static int A01(List list) {
        int size = list.size();
        int i = size * 2;
        if (size == 0) {
            return 10;
        }
        return i;
    }

    public static int A02(List list, int i) {
        int intValue = ((Number) list.get(i)).intValue();
        return (intValue >> 31) ^ (intValue << 1);
    }

    public static long A09(List list, int i) {
        return Double.doubleToRawLongBits(((Number) list.get(i)).doubleValue());
    }

    public static long A0A(List list, int i) {
        return ((Number) list.get(i)).longValue();
    }

    public static ApplicationInfo A0C(Context context, PackageManager packageManager) {
        return packageManager.getApplicationInfo(context.getPackageName(), 128);
    }

    public static Parcelable A0F(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static RemoteException A0G(Object obj) {
        return new RemoteException(String.valueOf(obj).concat(" : Binder has died."));
    }

    public static C25531Mh A0J(AbstractC12990ll abstractC12990ll, String str) {
        C18920wW A02 = AbstractC12220kQ.A02(abstractC12990ll);
        C25531Mh c25531Mh = new C25531Mh(A02.A00(A02.A00, "instagram_android_install_with_referrer"), 288);
        if (str != null) {
            c25531Mh.A0R("error", str);
        }
        return c25531Mh;
    }

    public static EnumC31203Dnm A0K(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.A8R(interfaceC02530Ab, "product_type");
        return EnumC31203Dnm.ANDROID;
    }

    public static C4OW A0L() {
        return new C4OW(C94894Ou.A00(), "account_badges");
    }

    public static C4OW A0S(C4Og c4Og) {
        return new C4OW(c4Og, AbstractC58357Ptx.A00());
    }

    public static FBPayLoggerData A0Z(Bundle bundle) {
        bundle.getClass();
        Parcelable parcelable = bundle.getParcelable("logger_data");
        parcelable.getClass();
        return (FBPayLoggerData) parcelable;
    }

    public static JsonDeserializer A0b(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469, AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer) {
        AbstractC910944l A03 = abstractC910944l.A03();
        if (jsonDeserializer == null) {
            return anonymousClass469.A0B(interfaceC65620ToB, A03);
        }
        return anonymousClass469.A0D(interfaceC65620ToB, A03, jsonDeserializer);
    }

    public static InterfaceC65591TnW A0c(Object obj) {
        return C63168SeS.A00().A01(obj.getClass());
    }

    public static IOException A0i(String str, int i) {
        return new IOException(AnonymousClass001.A0O(str, i));
    }

    public static InputStreamReader A0j(Resources resources, int i) {
        InputStream openRawResource = resources.openRawResource(i);
        C14360o3.A07(openRawResource);
        return new InputStreamReader(openRawResource, C15W.A05);
    }

    public static Class A0k() {
        return Collections.unmodifiableList(Collections.emptyList()).getClass();
    }

    public static IllegalArgumentException A0l(String str, String str2, String str3) {
        return new IllegalArgumentException(AnonymousClass001.A0g(str, str2, str3));
    }

    public static IllegalArgumentException A0m(String str, StringBuilder sb) {
        sb.append(str);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalStateException A0n(Object obj, StringBuilder sb) {
        sb.append(obj);
        return new IllegalStateException(sb.toString());
    }

    public static IllegalStateException A0o(String str, StringBuilder sb) {
        sb.append(str);
        return new IllegalStateException(sb.toString());
    }

    public static Object A0r(BaseBundle baseBundle, String str) {
        if (!baseBundle.containsKey(str)) {
            return null;
        }
        return baseBundle.get(str);
    }

    public static Object A0u(List list) {
        return list.get(list.size() - 1);
    }

    public static String A0x(WebSettings webSettings) {
        String userAgentString = webSettings.getUserAgentString();
        C14360o3.A07(userAgentString);
        return C1FO.A01(userAgentString);
    }

    public static String A11(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    public static String A12(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String A13(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    public static StringBuilder A15(Object obj, int i) {
        return new StringBuilder(i + String.valueOf(obj).length());
    }

    public static ByteBuffer A17(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static GeneralSecurityException A19(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return new GeneralSecurityException(sb.toString());
    }

    public static GeneralSecurityException A1A(String str, int i) {
        return new GeneralSecurityException(AnonymousClass001.A0O(str, i));
    }

    public static void A1D(int i) {
        C218914p.A00().markerEnd(694559790, i, (short) 2);
    }

    public static void A1E(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().clear().apply();
    }

    public static void A1I(R6v r6v, ExecutorServiceC64921TZw executorServiceC64921TZw, TimeUnit timeUnit, long j) {
        ExecutorServiceC64921TZw.A00(r6v, executorServiceC64921TZw, SystemClock.elapsedRealtime() + timeUnit.toMillis(j));
    }

    public static void A1J(SXp sXp, Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        sXp.A00(Collections.unmodifiableMap(abstractMap));
    }

    public static void A1K(Class cls) {
        Class.forName(cls.getName(), true, cls.getClassLoader());
    }

    public static void A1N(String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void A1O(String str, String str2, StringBuilder sb) {
        sb.append(str);
        android.util.Log.w(str2, sb.toString());
    }

    public static void A1P(String str, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(Integer.valueOf(Integer.parseInt(str.substring(i, i2))));
    }

    public static void A1Q(String str, Map map) {
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(Long.parseLong(str)));
    }

    public static void A1R(ByteBuffer byteBuffer, List list, int i) {
        byteBuffer.putInt(i);
        byteBuffer.putInt(list.size());
    }

    public static void A1S(java.security.Key key, AlgorithmParameterSpec algorithmParameterSpec, Cipher cipher, byte[] bArr, int i) {
        cipher.init(i, key, algorithmParameterSpec);
        if (bArr != null && bArr.length != 0) {
            cipher.updateAAD(bArr);
        }
    }

    public static boolean A1T(Parcel parcel) {
        if (parcel.readInt() == 1) {
            return true;
        }
        return false;
    }

    public static boolean A1W(Iterable iterable, Iterable iterable2) {
        return !AbstractC001800i.A0l(iterable, iterable2).isEmpty();
    }

    public static byte[] A1Y(Number number, ByteBuffer byteBuffer) {
        byteBuffer.putInt(number.intValue());
        return byteBuffer.array();
    }

    public static Object[] A1a(Object obj, int i, int i2) {
        return new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)};
    }

    public static VideoCodecInfo[] A1b(AbstractCollection abstractCollection) {
        return (VideoCodecInfo[]) abstractCollection.toArray(new VideoCodecInfo[abstractCollection.size()]);
    }

    public static String A0y(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll) {
        String A04 = C18U.A04(c06090Tz, abstractC12990ll, 36885750369092264L);
        C14360o3.A0A(A04);
        return A04;
    }
}
