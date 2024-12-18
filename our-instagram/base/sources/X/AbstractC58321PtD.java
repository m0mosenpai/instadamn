package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.google.android.gms.common.Feature;
import com.google.common.collect.CompactHashSet;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.PtD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58321PtD {
    public static double A00(int i) {
        return WF1.A00(i);
    }

    public static int A05(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int A0B(Parcel parcel, int i) {
        AbstractC125725mK.A0F(parcel, i, 4);
        return parcel.readInt();
    }

    public static int A0D(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static Bitmap A0K(Bitmap bitmap, Matrix matrix) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        C0fK.A03(bitmap);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static Object A0q(String str) {
        return Class.forName(str).getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
    }

    public static String A0u(C51756Mtf c51756Mtf) {
        List list = (List) c51756Mtf.A00;
        C14360o3.A0B(list, 0);
        if (AbstractC63355SiC.A02(list).isEmpty()) {
            return "credit_card_nux";
        }
        return "credit_card_pux";
    }

    public static String A0y(Charset charset, byte[] bArr, int i, int i2) {
        return new String(bArr, i2, i - i2, charset);
    }

    public static KeyPair A12(String str, String str2) {
        byte[] decode = Base64.decode(str, 0);
        KeyFactory keyFactory = KeyFactory.getInstance("EC");
        return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(decode)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2, 0))));
    }

    public static ArrayList A13(Cursor cursor, AbstractMap abstractMap) {
        ArrayList arrayList = (ArrayList) abstractMap.get(cursor.getString(0));
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public static void A18(Cursor cursor, AbstractMap abstractMap) {
        String string = cursor.getString(0);
        if (((ArrayList) abstractMap.get(string)) == null) {
            abstractMap.put(string, new ArrayList());
        }
    }

    public static void A1B(WebView webView) {
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
    }

    public static void A1C(WebView webView) {
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
    }

    public static void A1H(QEC qec) {
        EditText editText = qec.A05;
        if (editText != null && editText.requestFocus()) {
            EditText editText2 = qec.A05;
            Context context = qec.getContext();
            Dialog dialog = ((C0SG) qec).A01;
            if (editText2 != null) {
                editText2.postDelayed(new RunnableC64674TPf(dialog, context, editText2), 200L);
            }
        }
    }

    public static void A1S(Throwable th) {
        C0f5 AEr = C18950wb.A00.AEr(false, null, 694559790, 0);
        AEr.ERI(th);
        AEr.report();
    }

    public static float A01(float f, float f2, float f3) {
        PointF pointF = AbstractC63251Sg7.A00;
        return f2 + (f3 * (f - f2));
    }

    public static float A04(int[] iArr, int i) {
        return WF1.A00(iArr[i]);
    }

    public static int A06(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        if ((i & (-268435456)) != 0) {
            return 5;
        }
        return 4;
    }

    public static int A07(int i, int i2, int i3) {
        int i4 = (i & 3) << 3;
        return ((255 & i3) << i4) | (i2 & ((255 << i4) ^ (-1)));
    }

    public static int A08(long j, int i) {
        return i + ((int) (j ^ (j >>> 32)));
    }

    public static int A0F(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long A0I(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static long A0J(byte[] bArr, int i, long j) {
        return (j ^ (bArr[i] << 56)) ^ 71499008037633920L;
    }

    public static android.net.Uri A0L(String str) {
        return AbstractC62310S6f.A00.buildUpon().appendPath("package").appendPath(str).build();
    }

    public static Bundle A0M(Bundle bundle, Object obj) {
        if (obj == null) {
            return new Bundle();
        }
        return bundle;
    }

    public static Bundle A0N(String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("can_use_alley_oop", z);
        bundle.putString("url", str);
        bundle.putString("package_name", str2);
        return bundle;
    }

    public static C53092Ne5 A0P() {
        return new C53092Ne5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static ACQ A0Q(BrowserLiteFragment browserLiteFragment, String str, StringBuilder sb) {
        sb.append("BLF.plugins.");
        sb.append(str);
        ACQ acq = browserLiteFragment.A1L;
        sb.append(".Start");
        acq.A00(AnonymousClass001.A0g("BLF.plugins.", str, ".Start"));
        return acq;
    }

    public static C4OW A0R(C4Og c4Og) {
        return new C4OW(c4Og, "interop_messaging_user_fbid");
    }

    public static C4OW A0T(C4Og c4Og) {
        return new C4OW(c4Og, "has_anonymous_profile_picture");
    }

    public static C4OW A0U(C4Og c4Og) {
        return new C4OW(c4Og, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
    }

    public static C4OW A0V(C4Og c4Og) {
        return new C4OW(c4Og, "fbid_v2");
    }

    public static C4OW A0W(C4Og c4Og) {
        return new C4OW(c4Og, "following");
    }

    public static C4OU A0X() {
        C94894Ou c94894Ou = C94894Ou.A00;
        C4OW c4ow = new C4OW(c94894Ou, IgReactMediaPickerNativeModule.HEIGHT);
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{c4ow, new C4OW(c94754Oe, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new C4OW(c94894Ou, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), new C4OW(c94754Oe, "url"), new C4OW(c94894Ou, IgReactMediaPickerNativeModule.WIDTH)});
    }

    public static C4OU A0Y() {
        return new C4OU(new C4OM[]{new C4OW(C94754Oe.A00, "text")});
    }

    public static R3M A0b(BaseJavaModule baseJavaModule) {
        R3M r3m = baseJavaModule.mReactApplicationContext;
        AbstractC05810Sj.A01(r3m, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
        return r3m;
    }

    public static WritableNativeMap A0c() {
        return new WritableNativeMap();
    }

    public static C53086Ndz A0d(Context context, android.net.Uri uri) {
        String fileExtensionFromUrl;
        C54846OMr c54846OMr = new C54846OMr();
        File cacheDir = context.getCacheDir();
        long currentTimeMillis = System.currentTimeMillis();
        if (uri == null) {
            fileExtensionFromUrl = "jpg";
        } else {
            fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        }
        c54846OMr.A03(EnumC46121KbL.A00.A00(context), cacheDir, AnonymousClass001.A0r("temp__", ".", fileExtensionFromUrl, currentTimeMillis));
        return c54846OMr.A00();
    }

    public static Feature A0e(String str, long j) {
        return new Feature(str, j);
    }

    public static IOException A0g() {
        return new IOException("closed");
    }

    public static ArrayIndexOutOfBoundsException A0h(char c, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Failed writing ");
        sb.append(c);
        sb.append(" at index ");
        sb.append(i);
        return new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public static IllegalArgumentException A0j(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Length too large: ");
        sb.append(i);
        sb.append(i);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalStateException A0k() {
        return new IllegalStateException("closed");
    }

    public static IllegalStateException A0l() {
        return new IllegalStateException("This dynamic value has been recycled");
    }

    public static RuntimeException A0r(Class cls, String str, Object[] objArr) {
        return new RuntimeException(AnonymousClass001.A13("Field ", str, " for ", cls.getName(), " not found. Known fields are ", Arrays.toString(objArr)));
    }

    public static String A0x(String str, Object[] objArr) {
        byte[] bArr = AbstractC63404SjZ.A07;
        return String.format(Locale.US, str, objArr);
    }

    public static String A0z(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, AbstractC50482Ts.A00);
    }

    public static UnsupportedOperationException A10() {
        return new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static C11L A15(String str, java.util.Set set) {
        return new C11L(str, set);
    }

    public static C63205Sf9 A16(String str, String str2) {
        C64531TIl c64531TIl = C63205Sf9.A03;
        return new C63205Sf9(C64531TIl.A02(str), C64531TIl.A02(str2));
    }

    public static void A1D(C2GT c2gt, C58252li c58252li, InterfaceC16660sJ interfaceC16660sJ, int i) {
        c58252li.A0E(c2gt, new C9LO(i, interfaceC16660sJ));
    }

    public static void A1E(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "product_type");
        interfaceC02590Ai.A8R(EnumC31203Dnm.ANDROID, "platform");
        interfaceC02590Ai.A9K("actual_event_time", Long.valueOf(System.currentTimeMillis()));
    }

    public static void A1F(InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.AAP("event_name", str);
        interfaceC02590Ai.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "DIRECT_LINK");
        interfaceC02590Ai.AAP("clicked_url", str2);
        interfaceC02590Ai.Cht();
    }

    public static void A1G(AbstractC02600Aj abstractC02600Aj, String str, String str2) {
        abstractC02600Aj.A0R("family_device_id", str);
        abstractC02600Aj.A0R("waterfall_id", C1Q9.A01());
        abstractC02600Aj.A0R("containermodule", "install_referrer");
        abstractC02600Aj.A0R("referrer", str2);
        abstractC02600Aj.Cht();
    }

    public static void A1J(IABEvent iABEvent, StringBuilder sb, char c) {
        sb.append(", type=");
        sb.append(iABEvent.A02);
        sb.append(", iabSessionId='");
        sb.append(iABEvent.A03);
        sb.append(c);
        sb.append(", eventTs=");
        sb.append(iABEvent.A01);
        sb.append(", createdAtTs=");
    }

    public static void A1L(AnonymousClass469 anonymousClass469, BeanDeserializerBase beanDeserializerBase) {
        C60581R8w[] c60581R8wArr = beanDeserializerBase.A0G;
        if (c60581R8wArr != null && 0 < c60581R8wArr.length) {
            anonymousClass469.A0g(c60581R8wArr[0].A00);
            throw C00O.createAndThrow();
        }
    }

    public static void A1N(AbstractC12990ll abstractC12990ll, InterfaceC19630xq interfaceC19630xq) {
        int A01 = (int) C18U.A01(C06090Tz.A06, abstractC12990ll, 36598992587591036L);
        if (A01 > interfaceC19630xq.getInt("KEY_SWIPE_HISTORY_VERSION", 0)) {
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.EEj("KEY_SWIPE_HISTORY_V2");
            ARD.EEj("KEY_PROFILE_SWIPE_HISTORY");
            ARD.E7D("KEY_SWIPE_HISTORY_VERSION", A01);
            ARD.apply();
        }
    }

    public static void A1T(boolean z) {
        C18C.A0H(z, "no calls to next() since the last call to remove()");
    }

    public static void A1U(Object[] objArr) {
        objArr[34] = "\\\"";
        objArr[92] = "\\\\";
        objArr[9] = "\\t";
        objArr[8] = "\\b";
        objArr[10] = "\\n";
        objArr[13] = "\\r";
        objArr[12] = "\\f";
    }

    public static boolean A1V(AbstractC913345m abstractC913345m) {
        return abstractC913345m.A05.A0C(EnumC912645f.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
    }

    public static boolean A1Z(Object obj, C11L c11l) {
        return c11l.A07((CharSequence) obj);
    }

    public static float A02(Parcel parcel, int i) {
        AbstractC125725mK.A0D(parcel, i);
        return parcel.readFloat();
    }

    public static float A03(THX thx) {
        return (float) thx.A0B();
    }

    public static int A09(Activity activity, int i) {
        int A00 = C0f9.A00(i);
        C0fM.A00(activity);
        return A00;
    }

    public static int A0A(Parcel parcel, int i) {
        AbstractC125725mK.A0D(parcel, i);
        return parcel.readInt();
    }

    public static int A0C(Object obj, Object obj2, Object obj3, Object obj4) {
        return Arrays.hashCode(new Object[]{obj, obj2, obj3, obj4});
    }

    public static int A0E(byte[] bArr, int i) {
        return i + Arrays.hashCode(bArr);
    }

    public static long A0G(T49 t49) {
        SQLiteStatement compileStatement = t49.A03().compileStatement("PRAGMA page_count");
        C0fW.A00(1087689373);
        long simpleQueryForLong = compileStatement.simpleQueryForLong();
        C0fW.A00(-1175832770);
        SQLiteStatement compileStatement2 = t49.A03().compileStatement("PRAGMA page_size");
        C0fW.A00(-1218113153);
        long simpleQueryForLong2 = compileStatement2.simpleQueryForLong();
        C0fW.A00(-1738440242);
        return simpleQueryForLong * simpleQueryForLong2;
    }

    public static long A0H(List list, int i) {
        long longValue = ((Number) list.get(i)).longValue();
        return (longValue >> 63) ^ (longValue << 1);
    }

    public static Parcel A0O(IBinder iBinder) {
        int A03 = C0f9.A03(1276056990);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        C0f9.A0A(932077576, A03);
        obtain.writeStrongBinder(iBinder);
        return obtain;
    }

    public static C4OW A0S(C4Og c4Og) {
        return new C4OW(c4Og, "third_party_downloads_enabled");
    }

    public static C4OU A0Z(Object obj, C4OM[] c4omArr, int i, int i2, int i3) {
        System.arraycopy(obj, i, c4omArr, i2, i3);
        return new C4OU(c4omArr);
    }

    public static QuickPerformanceLogger A0a(String str, int i) {
        C218914p.A00().markerStart(694559790, i, false);
        C218914p.A00().markerAnnotate(694559790, i, "operation", str);
        return C218914p.A00();
    }

    public static RMJ A0f(byte[] bArr) {
        C3U5.A02(bArr);
        return AbstractC64537TIt.A01(bArr, bArr.length);
    }

    public static CharSequence A0i(List list, int i) {
        return (CharSequence) list.get(i);
    }

    public static NullPointerException A0m() {
        return new NullPointerException("zze");
    }

    public static Object A0n(Parcel parcel, Class cls) {
        return parcel.readValue(cls.getClassLoader());
    }

    public static Object A0o(Object obj, String str, Map map) {
        Object obj2 = map.get(obj);
        C14360o3.A0C(obj2, str);
        return obj2;
    }

    public static Object A0p(String str) {
        return Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }

    public static String A0s(int i, Object obj) {
        return AnonymousClass001.A0R("CodedOutputStream was writing to a flat byte array and ran out of space.: ", String.format("Pos: %d, limit: %d, len: %d", obj, Integer.valueOf(i), 1));
    }

    public static String A0t(BaseBundle baseBundle, String str) {
        return String.valueOf(baseBundle.get(str));
    }

    public static String A0v(String str, Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf.length() != 0) {
            return str.concat(valueOf);
        }
        return new String(str);
    }

    public static String A0w(String str, Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf.length() != 0) {
            return str.concat(valueOf);
        }
        return new String(str);
    }

    public static GeneralSecurityException A11(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        sb.append(" available");
        return new GeneralSecurityException(sb.toString());
    }

    public static Collection A14(Object obj, Object obj2, AbstractMap abstractMap) {
        AbstractC24841Jd.A01(obj, obj2);
        Collection collection = (Collection) abstractMap.get(obj);
        if (collection == null) {
            CompactHashSet compactHashSet = new CompactHashSet();
            abstractMap.put(obj, compactHashSet);
            return compactHashSet;
        }
        return collection;
    }

    public static void A17(Resources resources, WebView webView) {
        webView.loadUrl(AbstractC13670mt.A06("javascript:document.getElementById(\"main\").innerHTML=\"<h3>%s</h3>\"", resources.getString(2131972429)));
    }

    public static void A19(IInterface iInterface, Parcel parcel) {
        parcel.writeStrongBinder(iInterface.asBinder());
    }

    public static void A1A(Parcel parcel, Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, parcel.readString());
    }

    public static void A1I(IABEvent iABEvent, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(iABEvent.A02);
        sb.append(", iabSessionId='");
        sb.append(iABEvent.A03);
        sb.append('\'');
        sb.append(", eventTs=");
    }

    public static void A1K(Callback callback, Object obj) {
        callback.invoke(obj);
    }

    public static void A1M(C19280xC c19280xC, String str, boolean z) {
        c19280xC.A09(str, Boolean.valueOf(z));
    }

    public static void A1O(Object obj) {
        obj.getClass().getClassLoader();
    }

    public static void A1P(String str, String str2, String str3) {
        android.util.Log.w(str3, AnonymousClass001.A0R(str, str2));
    }

    public static void A1Q(String str, String str2, String str3) {
        android.util.Log.e(str3, str.concat(str2));
    }

    public static void A1R(StringBuilder sb, char c) {
        sb.append(Character.toLowerCase(c));
    }

    public static boolean A1W(Class cls, Object obj) {
        return cls.isAssignableFrom(obj.getClass());
    }

    public static boolean A1X(Object obj, int i) {
        C218914p.A00().markerAnnotate(694559790, i, "asl_session_id", C0L6.A01());
        return ((List) AbstractC15930qn.A02.A06.invoke()).contains(obj);
    }

    public static boolean A1Y(Object obj, int i, int i2) {
        C218914p.A00().markerAnnotate(694564060, i, "number_of_listeners", i2);
        C218914p.A00().markerAnnotate(694564060, i, "thread_priority", Thread.currentThread().getPriority());
        return ((List) AbstractC15930qn.A02.A06.invoke()).contains(obj);
    }

    public static int[] A1a(int i) {
        return new int[]{i};
    }

    public static Object[] A1b() {
        return new Object[]{"value_"};
    }
}
