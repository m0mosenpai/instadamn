package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebookpay.offsite.models.message.GsonUtils;
import com.fbpay.w3c.CardDetails;
import com.google.gson.Gson;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.FileNotFoundException;
import java.lang.reflect.Executable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import org.json.JSONObject;

/* renamed from: X.PtF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58323PtF {
    public static int A05(Parcel parcel, int i, int i2, int i3) {
        if (i != 4) {
            AbstractC125725mK.A0C(parcel, i2);
            return i3;
        }
        AbstractC125725mK.A0F(parcel, i2, 4);
        return parcel.readInt();
    }

    public static int A07(SLQ slq) {
        int A00 = slq.A00(4);
        if (A00 != 0) {
            return slq.A01.getInt(A00 + slq.A00);
        }
        return 0;
    }

    public static Gson A0b(GsonUtils gsonUtils, Object obj) {
        C14360o3.A0B(obj, 0);
        return gsonUtils.deserializerGson(null);
    }

    public static Float A0g(String str, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return Float.valueOf((float) jSONObject.optDouble(str));
    }

    public static Object A0l(Object obj, Class cls, String str) {
        return cls.getMethod(str, new Class[0]).invoke(obj, new Object[0]);
    }

    public static Object A0n(Object obj, Object[] objArr, int i) {
        if (obj == null || i != 1) {
            return null;
        }
        Object obj2 = objArr[0];
        obj2.getClass();
        if (!obj2.equals(obj)) {
            return null;
        }
        Object obj3 = objArr[1];
        obj3.getClass();
        return obj3;
    }

    public static String A0o(Parcel parcel, String str, int i, int i2) {
        if (i != 2) {
            AbstractC125725mK.A0C(parcel, i2);
            return str;
        }
        return AbstractC125725mK.A08(parcel, i2);
    }

    public static String A0p(Parcel parcel, String str, int i, int i2) {
        if (i != 3) {
            AbstractC125725mK.A0C(parcel, i2);
            return str;
        }
        return AbstractC125725mK.A08(parcel, i2);
    }

    public static String A0s(String str) {
        return AnonymousClass001.A0R(str.substring(0, 1).toLowerCase(), str.substring(1, str.length() - 4));
    }

    public static StringBuilder A0t(int i) {
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        return sb;
    }

    public static void A10(int i, int i2, char[] cArr, int i3) {
        int i4 = i | i2;
        cArr[i3] = (char) ((i4 >>> 10) + 55232);
        cArr[i3 + 1] = (char) ((i4 & 1023) + 56320);
    }

    public static void A13(Paint.FontMetricsInt fontMetricsInt) {
        C14360o3.A0B(fontMetricsInt, 5);
        int i = fontMetricsInt.descent;
        int i2 = fontMetricsInt.ascent;
        int i3 = i - i2;
        int i4 = (int) (i3 * 1.1f);
        int i5 = (i4 - i3) / 2;
        int i6 = i2 - i5;
        fontMetricsInt.ascent = i6;
        fontMetricsInt.top -= i5;
        int i7 = i6 + i4;
        fontMetricsInt.descent = i7;
        fontMetricsInt.bottom = i7;
    }

    public static void A16(RectF rectF, float f, float f2) {
        rectF.set(f - f2, rectF.top - f2, rectF.right + f2, rectF.bottom + f2);
    }

    public static void A18(Bundle bundle, IBinder iBinder, Parcel parcel) {
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
        parcel.writeStrongBinder(iBinder);
    }

    public static void A1A(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(parcelable, i);
        }
    }

    public static void A1C(Parcel parcel, Enum r3) {
        if (r3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(r3.ordinal());
        }
    }

    public static void A1D(WebSettings webSettings) {
        webSettings.setAllowFileAccess(false);
        webSettings.setDomStorageEnabled(false);
        webSettings.setDatabaseEnabled(false);
        webSettings.setSaveFormData(false);
        webSettings.setSupportZoom(false);
        webSettings.setUseWideViewPort(true);
    }

    public static void A1I(C44455JlN c44455JlN, Integer num, Integer num2, Integer num3, C09530e4[] c09530e4Arr) {
        c44455JlN.A0E(new L2D(num, num2, num3, (C09530e4[]) Arrays.copyOf(c09530e4Arr, c09530e4Arr.length)));
    }

    public static boolean A1X(Parcel parcel) {
        if (parcel.readByte() != 1) {
            return false;
        }
        return true;
    }

    public static boolean A1Z(String str, AbstractMap abstractMap) {
        return abstractMap.containsKey(AnonymousClass001.A0R("get", str.substring(0, str.length() - 5)));
    }

    public static byte A00(int i, long j) {
        return (byte) ((i >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int A03(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            int i4 = highestOneBit + highestOneBit;
            if (i4 < 0) {
                return Integer.MAX_VALUE;
            }
            return i4;
        }
        return i3;
    }

    public static int A04(int i, int i2, int i3) {
        return ((i & 7) << 18) | ((i2 & 63) << 12) | ((i3 & 63) << 6);
    }

    public static int A06(Parcel parcel, int i, int i2, int i3, int i4) {
        if (i != i2) {
            AbstractC125725mK.A0C(parcel, i3);
            return i4;
        }
        AbstractC125725mK.A0D(parcel, i3);
        return parcel.readInt();
    }

    public static int A08(SLQ slq, int i) {
        int A00 = slq.A00(16);
        if (A00 != 0) {
            ByteBuffer byteBuffer = slq.A01;
            int i2 = A00 + slq.A00;
            return byteBuffer.getInt(i2 + byteBuffer.getInt(i2) + 4 + (i * 4));
        }
        return 0;
    }

    public static int A09(SLQ slq, int i) {
        int i2 = i + slq.A00;
        return slq.A01.getInt(i2 + slq.A01.getInt(i2));
    }

    public static int A0B(byte[] bArr, char c, char c2, int i) {
        int codePoint = Character.toCodePoint(c, c2);
        int i2 = i + 1;
        bArr[i] = (byte) ((codePoint >>> 18) | 240);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (((codePoint >>> 12) & 63) | 128);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (((codePoint >>> 6) & 63) | 128);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((codePoint & 63) | 128);
        return i5;
    }

    public static int A0C(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) ((i2 >>> 12) | 480);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (((i2 >>> 6) & 63) | 128);
        return i4;
    }

    public static int A0D(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) (i2 & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >> 16) & 255);
        return i5;
    }

    public static int A0E(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) ((i2 >>> 6) | 960);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 & 63) | 128);
        return i4;
    }

    public static int A0F(byte[] bArr, int i, int i2, int i3, int i4) {
        if ((bArr[i] & 255) == 255 && bArr[i2] == 0) {
            System.arraycopy(bArr, i + 2, bArr, i2, (i4 - (i - i3)) - 2);
            return i4 - 1;
        }
        return i4;
    }

    public static int A0G(byte[] bArr, int i, long j) {
        int i2 = i + 1;
        bArr[i] = (byte) (((int) (j >> 32)) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (((int) (j >> 40)) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (((int) (j >> 48)) & 255);
        return i4;
    }

    public static int A0H(byte[] bArr, int i, long j) {
        int i2 = i + 1;
        bArr[i] = (byte) (((int) j) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (((int) (j >> 8)) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (((int) (j >> 16)) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (((int) (j >> 24)) & 255);
        return i5;
    }

    public static Rect A0J(DocumentType documentType, float f, int i, int i2) {
        int i3 = (int) (16.0f * f);
        int widthToHeightRatio = (int) ((i2 / 2.0f) - (((i - (i3 * 2)) * (1.0f / documentType.getWidthToHeightRatio())) / 2.0f));
        return new Rect(i3, widthToHeightRatio, i - i3, i2 - widthToHeightRatio);
    }

    public static RiI A0L(C0Zx c0Zx, String str, String str2) {
        c0Zx.A06("mutation_data", str);
        Locale locale = Locale.US;
        C14360o3.A08(locale);
        String upperCase = str2.toUpperCase(locale);
        C14360o3.A07(upperCase);
        return RiI.valueOf(upperCase);
    }

    public static Be9 A0M(String str, String str2, String str3) {
        Be9 be9 = new Be9();
        be9.A07(str, AbstractC63083Sc6.A00());
        be9.A07(str2, "product_id");
        be9.A07(str3, "client_receiver_id");
        return be9;
    }

    public static C126315nS A0N() {
        return new C126315nS(C59836Qoy.class, "AiStudioAiPersona", -1227888073);
    }

    public static C126315nS A0O() {
        return new C126315nS(C59958Qrg.class, "PersonaAdditionalInfo", 1777778047);
    }

    public static C126845oO A0P(Class cls, int i) {
        return new C126845oO(new C126315nS(cls, "InlineXFBVestaError", i), "XFBVestaError");
    }

    public static C4OW A0Q() {
        return new C4OW(new C94774Oi(C95124Py.A00), "success");
    }

    public static C4OU A0R() {
        C94894Ou c94894Ou = C94894Ou.A00;
        C4OW c4ow = new C4OW(c94894Ou, IgReactMediaPickerNativeModule.HEIGHT);
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{c4ow, new C4OW(c94754Oe, "scans_profile"), new C4OW(c94754Oe, "url"), new C4OW(c94894Ou, IgReactMediaPickerNativeModule.WIDTH)});
    }

    public static C4OU A0S() {
        return new C4OU(new C4OM[]{new C4OW(C94754Oe.A00, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new C4OW(C173847oc.A00, "score")});
    }

    public static C4OU A0T() {
        C94894Ou c94894Ou = C94894Ou.A00;
        return new C4OU(new C4OM[]{new C4OW(c94894Ou, IgReactMediaPickerNativeModule.HEIGHT), new C4OW(C94754Oe.A00, "url"), new C4OW(c94894Ou, IgReactMediaPickerNativeModule.WIDTH)});
    }

    public static C4OU A0U() {
        C94894Ou c94894Ou = C94894Ou.A00;
        return new C4OU(new C4OM[]{new C4OW(c94894Ou, "inline_style"), new C4OW(c94894Ou, "length"), new C4OW(c94894Ou, "offset")});
    }

    public static C4OU A0V() {
        C94894Ou c94894Ou = C94894Ou.A00;
        C4OW c4ow = new C4OW(c94894Ou, IgReactMediaPickerNativeModule.WIDTH);
        C4OW c4ow2 = new C4OW(c94894Ou, IgReactMediaPickerNativeModule.HEIGHT);
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{c4ow, c4ow2, new C4OW(c94754Oe, "url"), new C4OW(c94754Oe, "scans_profile")});
    }

    public static C4OU A0W(C4OS c4os, Class cls, int i) {
        return new C4OU(new C4OM[]{new C4OK(c4os, cls, "image_versions2", i), new C4OW(C94754Oe.A00, "preview")});
    }

    public static C4OU A0X(C4Og c4Og, C4OM c4om) {
        C4OW c4ow = new C4OW(c4Og, "is_verified");
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{c4om, c4ow, new C4OW(c94754Oe, "pk"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, AbstractC31190DnZ.A00())});
    }

    public static C4OU A0Y(C4OM c4om, InterfaceC126325nT interfaceC126325nT, String str) {
        return new C4OU(new C4OM[]{c4om, new C126845oO(interfaceC126325nT, str)});
    }

    public static C4OU A0Z(InterfaceC126325nT interfaceC126325nT, String str) {
        return new C4OU(new C4OM[]{new C126845oO(interfaceC126325nT, str)});
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.react.bridge.UnexpectedNativeTypeException, java.lang.RuntimeException] */
    public static UnexpectedNativeTypeException A0a(Class cls, String str, String str2) {
        String A13 = AnonymousClass001.A13("Value for ", str, " cannot be cast from ", str2, " to ", cls.getSimpleName());
        C14360o3.A0B(A13, 1);
        return new RuntimeException(A13);
    }

    public static ArrayIndexOutOfBoundsException A0d(int i, int i2) {
        return new ArrayIndexOutOfBoundsException(AnonymousClass001.A02(i, i2, "Index > length: ", ", "));
    }

    public static IllegalStateException A0i(Object obj, int[] iArr, int i) {
        return new IllegalStateException(AnonymousClass001.A05(iArr[i], "Source subfield ", " is present but null: ", obj.toString()));
    }

    public static StringBuilder A0u(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        return sb;
    }

    public static UnsupportedOperationException A0v(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Wrong view binded in: ");
        sb.append(obj.getClass());
        return new UnsupportedOperationException(sb.toString());
    }

    public static GeneralSecurityException A0w(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid DEM parameters ");
        sb.append(obj);
        sb.append("; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported.");
        return new GeneralSecurityException(sb.toString());
    }

    public static void A0z(int i, int i2, Object obj) {
        if (i2 < i - 1) {
            System.arraycopy(obj, i2 + 1, obj, i2, (i - i2) - 1);
        }
    }

    public static void A12(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static void A14(Paint paint, Drawable drawable, float f, int i) {
        paint.setAlpha(C1H4.A01(f * (Color.alpha(i) / 255.0f) * 255.0f));
        drawable.invalidateSelf();
    }

    public static void A15(Paint paint, AbstractC63308ShE abstractC63308ShE) {
        if (abstractC63308ShE != null) {
            paint.setColorFilter((ColorFilter) abstractC63308ShE.A06());
        }
    }

    public static void A1E(InterfaceC02530Ab interfaceC02530Ab, AbstractC02600Aj abstractC02600Aj) {
        abstractC02600Aj.A0M(interfaceC02530Ab, "product_type");
        abstractC02600Aj.A0M(EnumC31203Dnm.ANDROID, "platform");
        abstractC02600Aj.A0Q("actual_event_time", Long.valueOf(System.currentTimeMillis()));
    }

    public static void A1F(InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx, int i) {
        C25531Mh c25531Mh = new C25531Mh(interfaceC02590Ai, i);
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            c25531Mh.A0N(c0Zx, "event_payload");
            c25531Mh.Cht();
        }
    }

    public static void A1G(InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx, String str) {
        c0Zx.A05("ad_id", AbstractC003100w.A0k(10, str));
        interfaceC02590Ai.AAQ(c0Zx, "custom_fields");
        interfaceC02590Ai.Cht();
    }

    public static void A1J(Q8b q8b, String str) {
        if (str != null) {
            q8b.A09.Chz(str, Q8b.A00(q8b, null, null));
        }
    }

    public static void A1L(C60890Ray c60890Ray) {
        if (c60890Ray.A0A) {
            c60890Ray.getSession();
            AbstractC25651Mw.A00(c60890Ray.getSession()).E4s(new C36106Fwg(AbstractC62241S3m.A00(c60890Ray.A09), "idv", false));
        }
    }

    public static void A1M(Object obj, Map map, int i) {
        map.put("on_log_interaction_event_callback", new C66237U5h(new C57560PgY(obj, i)));
    }

    public static void A1N(Object obj, Map map, int i) {
        map.put("on_log_interaction_event_callback_v2", new C66237U5h(new C57560PgY(obj, i)));
    }

    public static void A1P(String str, StringBuilder sb, int i, boolean z) {
        sb.append("MLKitLoggingOptions{libraryName=");
        sb.append(str);
        sb.append(", enableFirelog=");
        sb.append(z);
        sb.append(", firelogEventType=");
        sb.append(i);
    }

    public static void A1Q(StringBuilder sb, int i) {
        sb.append('\\');
        sb.append((char) (((i >>> 6) & 3) + 48));
        sb.append((char) (((i >>> 3) & 7) + 48));
    }

    public static void A1S(Executable executable, AbstractCollection abstractCollection, AbstractMap abstractMap, AbstractMap abstractMap2) {
        abstractMap.put(executable.getName(), executable);
        if (executable.getParameterTypes().length == 0) {
            abstractMap2.put(executable.getName(), executable);
            if (executable.getName().startsWith("get")) {
                abstractCollection.add(executable.getName());
            }
        }
    }

    public static void A1T(Executable executable, AbstractMap abstractMap, AbstractMap abstractMap2) {
        if (executable.getName().startsWith("has")) {
            abstractMap.put(executable.getName(), executable);
        } else {
            if (!executable.getName().startsWith("get")) {
                return;
            }
            abstractMap2.put(executable.getName(), executable);
        }
    }

    public static void A1V(Map map) {
        map.put("opacity", "number");
        map.put("stroke", "Array");
        map.put("strokeCap", "number");
        map.put("strokeDash", "Array");
        map.put("strokeJoin", "number");
        map.put("strokeWidth", "number");
        map.put("transform", "Array");
    }

    public static Object[] A1b(Object obj, int i, int i2) {
        Object[] objArr = new Object[((i * 3) / 2) + 1];
        System.arraycopy(obj, 0, objArr, 0, i2);
        return objArr;
    }

    public static char A01(String str, StringBuilder sb, int i) {
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            sb.append("_");
        }
        return charAt;
    }

    public static double A02(ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str)) {
            return readableMap.getDouble(str);
        }
        return 0.0d;
    }

    public static int A0A(AbstractC12990ll abstractC12990ll) {
        return C83743oJ.A01(abstractC12990ll).A05().size();
    }

    public static Intent A0I(Intent intent, String str, String str2, Throwable th) {
        return intent.putExtra(str, str2).putExtra("error", th.getMessage());
    }

    public static C14240no A0K(Fragment fragment) {
        AbstractC10360h2 childFragmentManager = fragment.getChildFragmentManager();
        C14360o3.A07(childFragmentManager);
        return new C14240no(childFragmentManager);
    }

    public static FileNotFoundException A0c(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return new FileNotFoundException(sb.toString());
    }

    public static ArrayIndexOutOfBoundsException A0e(int i, int i2, int i3) {
        return new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static CharSequence A0f(Object obj, Object obj2) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj2;
        }
        return obj.toString();
    }

    public static IllegalStateException A0h(Object obj, Object obj2, StringBuilder sb, int i) {
        sb.append(obj);
        sb.append(" for key: ");
        sb.append(i);
        sb.append(", found ");
        sb.append(obj2.getClass());
        sb.append(" instead.");
        return new IllegalStateException(sb.toString());
    }

    public static Object A0j(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static Object A0k(Fragment fragment) {
        return C0B1.A01(CardDetails.CREATOR, fragment.requireArguments().getParcelable("payment_info"), CardDetails.class);
    }

    public static Object A0m(Object obj, InterfaceC09390do interfaceC09390do) {
        Object value = interfaceC09390do.getValue();
        C14360o3.A07(value);
        return ((Map) value).get(obj);
    }

    public static String A0q(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public static String A0r(Object obj, Map map) {
        String str = (String) map.get(obj);
        if (str == null) {
            return "";
        }
        return str;
    }

    public static AbstractMap.SimpleImmutableEntry A0x(Object obj, Object[] objArr, int i) {
        obj.getClass();
        Object obj2 = objArr[i + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public static NavigableMap A0y(Object obj, Map map) {
        NavigableMap navigableMap = (NavigableMap) map.get(obj);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            map.put(obj, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public static void A11(Context context, String str, StringBuilder sb) {
        sb.append(str);
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            sb.append('.');
            sb.append(packageName);
        }
    }

    public static void A17(BaseBundle baseBundle, ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str) && !readableMap.isNull(str)) {
            baseBundle.putLong(str, (long) readableMap.getDouble(str));
        }
    }

    public static void A19(Bundle bundle, InterfaceC02550Ad interfaceC02550Ad, C63295Sgw c63295Sgw, Integer num, Throwable th) {
        String message = th.getMessage();
        Class<?> cls = th.getClass();
        Map map = C0YZ.A03;
        C14360o3.A0B(cls, 1);
        c63295Sgw.A03(bundle, interfaceC02550Ad, num, message, AbstractC13230m9.A01(cls), C2Ql.A00(th));
    }

    public static void A1B(Parcel parcel, ViewGroup.MarginLayoutParams marginLayoutParams, byte b) {
        parcel.writeByte(b);
        parcel.writeInt(marginLayoutParams.bottomMargin);
        parcel.writeInt(marginLayoutParams.leftMargin);
        parcel.writeInt(marginLayoutParams.rightMargin);
        parcel.writeInt(marginLayoutParams.topMargin);
        parcel.writeInt(((ViewGroup.LayoutParams) marginLayoutParams).height);
        parcel.writeInt(((ViewGroup.LayoutParams) marginLayoutParams).width);
    }

    public static void A1H(C0CA c0ca, Object obj, String str) {
        C0CA.A00(c0ca, obj, str);
        C0CA.A00(c0ca, C0HM.A00().toString(), "client_mutation_id");
    }

    public static void A1K(AbstractRunnableC14200nk abstractRunnableC14200nk) {
        C14270nr A00 = C14270nr.A00();
        C14360o3.A07(A00);
        A00.A01(abstractRunnableC14200nk, 0L);
    }

    public static void A1O(String str, String str2, String str3, String str4, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static void A1R(StringBuilder sb, Map.Entry entry) {
        sb.append(entry.getKey());
        sb.append('=');
        sb.append(entry.getValue());
    }

    public static void A1U(AbstractCollection abstractCollection, Collection collection, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        if (collection.contains(entry.getValue())) {
            abstractCollection.add(entry.getKey());
        }
    }

    public static boolean A1W(Activity activity) {
        return C08310bt.A02().A00(activity, activity.getIntent(), activity);
    }

    public static boolean A1Y(Object obj, AbstractList abstractList) {
        int indexOf = abstractList.indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        abstractList.remove(indexOf);
        return true;
    }

    public static byte[] A1a(String str, JSONObject jSONObject) {
        String string = jSONObject.getString(str);
        if (string == null) {
            return null;
        }
        return Base64.decode(string, 11);
    }
}
