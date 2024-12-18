package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcel;
import android.text.Layout;
import android.util.Range;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.view.ReactViewManager;
import com.instagram.business.boost.model.AdCreativeAuthorizationCategory;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.promote.model.PendingLocation;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteAudiencePotentialReachStore;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteReachEstimationStore;
import com.instagram.business.promote.model.PromoteWhatsAppAccountType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: X.TsY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65702TsY {
    public static int A04(Resources.Theme theme, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i});
        int color = obtainStyledAttributes.getColor(0, i2);
        obtainStyledAttributes.recycle();
        return color;
    }

    public static Context A0F(View view) {
        C14360o3.A0B(view, 0);
        Context context = view.getContext();
        C14360o3.A07(context);
        return context;
    }

    public static C0CA A0J(C04060Jx c04060Jx, GraphQlCallInput graphQlCallInput, Object obj, Object obj2) {
        C0CA A02 = c04060Jx.A02();
        C0CA.A00(A02, "1L1D", "key");
        A02.A0E(graphQlCallInput.A02(), "caller_context");
        if (obj instanceof C211799a6) {
            C2JO c2jo = new C2JO();
            C2JO c2jo2 = new C2JO();
            c2jo2.A09(((C211799a6) obj2).A00, "sensitive_string_value");
            c2jo.A06(c2jo2, "facebook_token_auth_from_cal");
            c2jo.A08("fallback_to_business_person", false);
            A02.A0E(c2jo.A02(), "fb_token_auth");
        }
        return A02;
    }

    public static C4BB A0M(C92124As c92124As) {
        return (C4BB) ((C4BF) c92124As.A02(0).A03.get(0)).A07.get(0);
    }

    public static String A0V(int i, String str) {
        String substring = str.substring(0, i);
        C14360o3.A07(substring);
        return AnonymousClass001.A0R("/api/v1/", substring);
    }

    public static String A0Y(SparseArray sparseArray, int i) {
        Object obj = sparseArray.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static String A0b(C16L c16l) {
        if (c16l.A11() != C16R.A0G) {
            return c16l.A1P();
        }
        return null;
    }

    public static String A0i(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        return decoder.AOJ();
    }

    public static List A0p(C6FW c6fw) {
        Object obj = c6fw.A00.get(1);
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.common.bloks.BloksParseResult>");
        return (List) obj;
    }

    public static void A16(TextView textView, Fragment fragment) {
        textView.setTextSize(0, fragment.requireContext().getResources().getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
    }

    public static void A1I(C0Zx c0Zx, C70399WUb c70399WUb) {
        c0Zx.A03("is_business_user_access_token_enabled", true);
        c0Zx.A03("is_business_user_access_token_enabled_and_cached", Boolean.valueOf(c70399WUb.A04));
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.instagram.business.promote.model.PromoteIntegrityCheckDataModel, java.lang.Object] */
    public static void A1N(PromoteData promoteData) {
        promoteData.A2V = false;
        promoteData.A1v = new ArrayList();
        promoteData.A0H = -1;
        promoteData.A1w = new ArrayList();
        promoteData.A0l = BoostFlowType.A07;
        promoteData.A26 = new HashSet();
        promoteData.A20 = new ArrayList();
        promoteData.A21 = new ArrayList();
        promoteData.A22 = new HashMap();
        promoteData.A1n = new ArrayList();
        promoteData.A1y = new ArrayList();
        promoteData.A1z = new ArrayList();
        promoteData.A1o = new ArrayList();
        promoteData.A0u = new Object();
        promoteData.A1r = new ArrayList();
        promoteData.A1x = new ArrayList();
        promoteData.A1p = new ArrayList();
        promoteData.A0w = new PromoteReachEstimationStore();
        promoteData.A1q = new ArrayList();
        promoteData.A24 = new HashSet();
        promoteData.A0x = PromoteWhatsAppAccountType.A02;
    }

    public static void A1O(PromoteData promoteData) {
        promoteData.A0k = AdCreativeAuthorizationCategory.A04;
        PromoteAudienceInfo promoteAudienceInfo = PromoteAudienceInfo.A09;
        promoteData.A0q = promoteAudienceInfo;
        promoteData.A0p = promoteAudienceInfo;
        promoteData.A0o = new PendingLocation();
        promoteData.A0r = new PromoteAudiencePotentialReachStore();
        promoteData.A1u = new ArrayList();
        promoteData.A1s = new ArrayList();
        promoteData.A1t = new ArrayList();
        promoteData.A27 = new HashSet();
        promoteData.A2B = false;
        promoteData.A29 = false;
        promoteData.A2c = false;
        promoteData.A2N = false;
        promoteData.A2q = false;
        promoteData.A2E = false;
        promoteData.A2A = false;
        promoteData.A2O = false;
    }

    public static boolean A1Z(AbstractC65919TwQ abstractC65919TwQ) {
        UserSession A0E = abstractC65919TwQ.A0E();
        C14360o3.A0B(A0E, 0);
        return C3o3.A00(A0E).booleanValue();
    }

    public static float A02(Object obj, Object obj2, float f) {
        if (obj instanceof Double) {
            return ((Number) obj2).floatValue();
        }
        return f;
    }

    public static int A0B(WFa wFa) {
        wFa.A0O(8);
        return (wFa.A01() >> 24) & 255;
    }

    public static Looper A0G(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        return handlerThread.getLooper();
    }

    public static InterfaceC02590Ai A0I(C70399WUb c70399WUb, C18920wW c18920wW, String str) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c70399WUb.A01);
        A00.AAP("waterfall_id", c70399WUb.A03);
        return A00;
    }

    public static C2JO A0K(C9CN c9cn) {
        String str = ((CallerContext) c9cn.A01).A02;
        C14360o3.A07(str);
        C2JO c2jo = new C2JO();
        c2jo.A09(str, "caller");
        c2jo.A09("function_credential", "function_credential");
        return c2jo;
    }

    public static RuntimeException A0U(String str, int i) {
        return new RuntimeException(AnonymousClass001.A0g(str, ": EGL error: 0x", Integer.toHexString(i)));
    }

    public static String A0c(PromoteData promoteData, int i) {
        int i2 = promoteData.A06;
        Currency currency = promoteData.A1j;
        C14360o3.A06(currency);
        return WG3.A02(currency, i, i2);
    }

    public static String A0e(Object obj, SerialDescriptor serialDescriptor, C3T8 c3t8, int i) {
        return (String) c3t8.AOE(obj, C3RD.A01, serialDescriptor, i);
    }

    public static String A0f(String str) {
        Locale locale = Locale.ROOT;
        C14360o3.A08(locale);
        String upperCase = str.toUpperCase(locale);
        C14360o3.A07(upperCase);
        return upperCase;
    }

    public static String A0g(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        C14360o3.A07(upperCase);
        return upperCase;
    }

    public static Calendar A0l() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        return calendar;
    }

    public static HashMap A0m(Object obj, Object obj2, Object obj3, Object obj4) {
        HashMap hashMap = new HashMap();
        hashMap.put(obj, obj2);
        hashMap.put(obj3, obj4);
        return hashMap;
    }

    public static Iterator A0n(Collection collection) {
        return new ArrayList(collection).iterator();
    }

    public static LinkedHashMap A0o(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("logging_context", obj);
        return linkedHashMap;
    }

    public static void A0s(int i, byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) ((i >> 8) & 255);
        bArr[i3] = (byte) (i & 255);
    }

    public static void A0u(Context context, TextView textView, CSN csn, float f) {
        textView.setLetterSpacing(csn.A01 / (((int) f) / context.getResources().getDisplayMetrics().scaledDensity));
    }

    public static void A14(View view, BaseViewManager baseViewManager, Object obj) {
        baseViewManager.setAccessibilityLabelledBy(view, new T02(obj));
    }

    public static void A19(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.AAP(AbstractC63083Sc6.A00(), C2O0.A00);
        interfaceC02590Ai.AAP("product_type", AbstractC49212Oa.A00);
        interfaceC02590Ai.AAP("platform", "android");
        interfaceC02590Ai.A9K("actual_event_time", Long.valueOf(System.currentTimeMillis()));
        interfaceC02590Ai.Cht();
    }

    public static void A1A(InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx) {
        interfaceC02590Ai.AAQ(c0Zx, "configurations");
        interfaceC02590Ai.AAP("bfa_platform", "native_android");
        interfaceC02590Ai.Cht();
    }

    public static void A1B(InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx) {
        interfaceC02590Ai.AAQ(c0Zx, "configurations");
        interfaceC02590Ai.Cht();
    }

    public static void A1D(InterfaceC02590Ai interfaceC02590Ai, C70399WUb c70399WUb, Object obj) {
        interfaceC02590Ai.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c70399WUb.A01);
        interfaceC02590Ai.AAP("waterfall_id", c70399WUb.A03);
        interfaceC02590Ai.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, obj.toString());
        interfaceC02590Ai.AAP("m_pk", c70399WUb.A02);
    }

    public static void A1H(AbstractC02600Aj abstractC02600Aj, MediaMapQuery mediaMapQuery) {
        String A0R;
        abstractC02600Aj.A0R("query_token", mediaMapQuery.A02);
        abstractC02600Aj.A0R("search_id", mediaMapQuery.A07);
        VEZ vez = mediaMapQuery.A06;
        abstractC02600Aj.A0R("search_type", vez.toString());
        int ordinal = vez.ordinal();
        if (ordinal != 1) {
            A0R = mediaMapQuery.A01;
            if (ordinal == 0) {
                A0R = A0R.toLowerCase();
            }
        } else {
            A0R = AnonymousClass001.A0R("#", mediaMapQuery.A01.toLowerCase());
        }
        abstractC02600Aj.A0R("search_query", A0R);
    }

    public static void A1J(Q4W q4w, ReactViewManager reactViewManager, Object obj, int i) {
        reactViewManager.setBorderRadius(q4w, i, new T02(obj));
    }

    public static void A1P(C18920wW c18920wW, String str, String str2, String str3, String str4) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        if (A00.isSampled()) {
            A00.AAP("search_session_id", str2);
            A00.AAP("query_text", str3);
            A00.AAP("nav_chain", str4);
            A00.Cht();
        }
    }

    public static boolean A1a(Object obj, Object obj2, boolean z) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj2).booleanValue();
        }
        return z;
    }

    public static float A00(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static float A01(Canvas canvas, Drawable drawable) {
        canvas.save();
        canvas.translate(drawable.getBounds().left + (drawable.getBounds().width() / 2.0f), drawable.getBounds().top + (drawable.getBounds().height() / 2.0f));
        return 2.0f;
    }

    public static int A03(int i, String str) {
        GLES20.glShaderSource(i, str);
        GLES20.glCompileShader(i);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(i, 35713, iArr, 0);
        return iArr[0];
    }

    public static int A05(Range range) {
        return ((Number) range.getUpper()).intValue();
    }

    public static int A06(View view) {
        return view.getPaddingLeft() + view.getPaddingRight();
    }

    public static int A07(View view) {
        return view.getHeight() - view.getPaddingBottom();
    }

    public static int A08(View view) {
        return view.getWidth() - view.getPaddingRight();
    }

    public static int A09(View view) {
        return view.getPaddingTop() + view.getPaddingBottom();
    }

    public static int A0A(View view, int i) {
        return (i - view.getPaddingTop()) - view.getPaddingBottom();
    }

    public static int A0C(C6FG c6fg, C102884kP c102884kP, int i) {
        C102884kP A08 = c102884kP.A08(i);
        if (A08 == null) {
            return -1;
        }
        return C6BK.A00(c6fg, A08, 0);
    }

    public static int A0D(C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) A01).intValue();
    }

    public static int A0E(Object obj, Map map) {
        return ((Number) map.get(obj)).intValue();
    }

    public static TextView A0H(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C14360o3.A07(requireViewById);
        return (TextView) requireViewById;
    }

    public static C66036TyY A0L(Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        ((Number) entry.getKey()).intValue();
        return (C66036TyY) entry.getValue();
    }

    public static C70399WUb A0N(InterfaceC09390do interfaceC09390do) {
        Object value = interfaceC09390do.getValue();
        C14360o3.A07(value);
        return (C70399WUb) value;
    }

    public static C102884kP A0O(C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        return (C102884kP) A01;
    }

    public static C102884kP A0P(C6FW c6fw, int i) {
        Object A03 = c6fw.A03(i);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        return (C102884kP) A03;
    }

    public static InterfaceC19610xo A0Q(UserSession userSession) {
        return AbstractC23021Ah.A00(userSession).A01.ARD();
    }

    public static C69436VnL A0R(C71603Jf c71603Jf, V0T v0t) {
        return c71603Jf.A03(C455127l.A03(v0t.getSession()).A0O());
    }

    public static IllegalArgumentException A0S(Object obj) {
        return new IllegalArgumentException(String.format("No implementation bound to key: %s", obj));
    }

    public static RuntimeException A0T(String str, int i) {
        return new RuntimeException(AnonymousClass001.A0R(str, Integer.toHexString(i)));
    }

    public static String A0W(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        if (string == null) {
            return typedArray.getString(i2);
        }
        return string;
    }

    public static String A0X(Layout layout, int i) {
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        CharSequence text = layout.getText();
        C14360o3.A07(text);
        return text.subSequence(lineStart, lineEnd).toString();
    }

    public static String A0Z(EditText editText) {
        return AbstractC001900j.A0B(editText.getText().toString()).toString();
    }

    public static String A0a(C2JS c2js, String str, int i) {
        String requiredStringField = c2js.getRequiredStringField(i, str);
        C14360o3.A0C(requiredStringField, "null cannot be cast to non-null type kotlin.String");
        return requiredStringField;
    }

    public static String A0d(AbstractC67878V0j abstractC67878V0j) {
        String str = abstractC67878V0j.A06().A0J;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("query");
        throw C00O.createAndThrow();
    }

    public static String A0h(String str, Locale locale, Object[] objArr, int i) {
        String format = String.format(locale, str, Arrays.copyOf(objArr, i));
        C14360o3.A07(format);
        return format;
    }

    public static ByteBuffer A0j(int i) {
        return ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
    }

    public static FloatBuffer A0k(float[] fArr, int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        return asFloatBuffer;
    }

    public static void A0q() {
        AbstractC155756z4.A00().A02();
    }

    public static void A0r() {
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
    }

    public static void A0t(Context context, Drawable drawable, View view, int i) {
        drawable.setTint(context.getColor(i));
        view.setBackground(drawable);
    }

    public static void A0v(Context context, C63198Sf0 c63198Sf0, SNQ snq) {
        C0fJ.A00(snq.A00(context, c63198Sf0));
    }

    public static void A0w(Resources resources, ViewGroup.MarginLayoutParams marginLayoutParams) {
        marginLayoutParams.setMarginStart(resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
        marginLayoutParams.setMarginEnd(resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
    }

    public static void A0x(RectF rectF, Drawable drawable) {
        rectF.set(drawable.getBounds());
    }

    public static void A0y(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, SurfaceTexture surfaceTexture, HandlerThread handlerThread) {
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, new Handler(looper));
    }

    public static void A0z(Parcel parcel, Class cls, List list) {
        parcel.readList(list, cls.getClassLoader());
    }

    public static void A10(SparseArray sparseArray, SparseArray sparseArray2, int i) {
        sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
    }

    public static void A11(View view, float f, float f2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C14360o3.A07(layoutParams);
        layoutParams.height = (int) Math.ceil(f);
        layoutParams.width = (int) Math.ceil(f2);
        view.setLayoutParams(layoutParams);
    }

    public static void A12(View view, int i, int i2, int i3) {
        view.measure(i3, View.MeasureSpec.makeMeasureSpec(i, i2));
    }

    public static void A13(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
        }
    }

    public static void A15(ImageView imageView, C66353UBr c66353UBr, List list, int i) {
        C66353UBr.A00(imageView, c66353UBr, (String) list.get(i));
    }

    public static void A17(Fragment fragment) {
        C9GR.A07(fragment.requireContext(), 2131970352);
    }

    public static void A18(Fragment fragment) {
        Fragment requireParentFragment = fragment.requireParentFragment();
        C14360o3.A0C(requireParentFragment, "null cannot be cast to non-null type com.instagram.igds.components.bottomsheet.BottomSheetFragment");
        C189478aR c189478aR = ((BottomSheetFragment) requireParentFragment).A02;
        if (c189478aR != null) {
            c189478aR.A07();
        }
    }

    public static void A1C(InterfaceC02590Ai interfaceC02590Ai, W6I w6i, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAP("waterfall_id", w6i.A00());
    }

    public static void A1E(InterfaceC02590Ai interfaceC02590Ai, C70399WUb c70399WUb, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAP("m_pk", c70399WUb.A02);
    }

    public static void A1F(InterfaceC02590Ai interfaceC02590Ai, String str) {
        String A05 = C1QE.A01(str).A05();
        C14360o3.A07(A05);
        interfaceC02590Ai.AAP("waterfall_id", A05);
    }

    public static void A1G(AbstractC02600Aj abstractC02600Aj, C38657Gyy c38657Gyy, Object obj) {
        abstractC02600Aj.A0R("category_id", String.valueOf(obj));
        abstractC02600Aj.A0R("category_name", c38657Gyy.A06);
    }

    public static void A1K(C16L c16l, AbstractCollection abstractCollection) {
        String A1P;
        if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
            abstractCollection.add(A1P);
        }
    }

    public static void A1L(C16L c16l, AbstractCollection abstractCollection) {
        Integer valueOf = Integer.valueOf(c16l.A1D());
        if (valueOf != null) {
            abstractCollection.add(valueOf);
        }
    }

    public static void A1M(C70399WUb c70399WUb, Object obj) {
        c70399WUb.A0R(obj.toString());
    }

    public static void A1Q(C6FG c6fg, C102884kP c102884kP, C6FX c6fx, InterfaceC103384lE interfaceC103384lE) {
        C6FP.A03(c6fg, c102884kP, c6fx.A00(), interfaceC103384lE);
    }

    public static void A1R(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        map.put("filter", "Filter");
    }

    public static void A1S(Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(C63406Sjd.A04(obj));
    }

    public static void A1T(Object obj, AbstractCollection abstractCollection, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 != null) {
            abstractCollection.add(obj2);
        }
    }

    public static void A1U(String str, String str2) {
        C0I2.A04("ReactNative", AnonymousClass001.A0R(str, str2));
    }

    public static void A1V(ByteBuffer byteBuffer, float f) {
        byteBuffer.putShort((short) ((f * 50000.0f) + 0.5f));
    }

    public static void A1W(ReentrantReadWriteLock reentrantReadWriteLock) {
        reentrantReadWriteLock.writeLock().unlock();
    }

    public static boolean A1X(C2GT c2gt) {
        return C63406Sjd.A0G((C63406Sjd) c2gt.A02());
    }

    public static boolean A1Y(AbstractC12990ll abstractC12990ll) {
        return C3o3.A00(abstractC12990ll).booleanValue();
    }

    public static boolean A1b(ReentrantReadWriteLock reentrantReadWriteLock) {
        return reentrantReadWriteLock.writeLock().tryLock(1L, TimeUnit.SECONDS);
    }
}
