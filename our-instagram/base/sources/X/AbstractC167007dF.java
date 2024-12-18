package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.io.File;
import java.io.Writer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.7dF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC167007dF {
    public static RectF A0G(float f, float f2) {
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        rectF.offsetTo(0.0f, f2);
        return rectF;
    }

    public static void A0r(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.save();
    }

    public static void A17(InterfaceC19610xo interfaceC19610xo, String str) {
        interfaceC19610xo.E77(str, true);
        interfaceC19610xo.apply();
    }

    public static void A1K(Object obj, Object obj2) {
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(obj2, 1);
    }

    public static boolean A1M(int i) {
        return i != 0;
    }

    public static boolean A1N(int i) {
        return i == 0;
    }

    public static boolean A1O(int i) {
        return i > 0;
    }

    public static boolean A1P(int i, int i2) {
        return i == i2;
    }

    public static boolean A1Q(int i, int i2) {
        return i < i2;
    }

    public static boolean A1U(Object obj) {
        C14360o3.A0B(obj, 2);
        return false;
    }

    public static boolean A1V(Object obj) {
        C14360o3.A0B(obj, 2);
        return true;
    }

    public static boolean A1W(Object obj) {
        return obj != null;
    }

    public static boolean A1X(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static float A01(Drawable drawable, float f) {
        return f - (drawable.getIntrinsicHeight() / 2.0f);
    }

    public static float A02(Drawable drawable, float f) {
        return f + (drawable.getIntrinsicWidth() / 2.0f);
    }

    public static float A03(Drawable drawable, float f) {
        return f - (drawable.getIntrinsicWidth() / 2.0f);
    }

    public static int A05(int i) {
        return i != 0 ? 0 : 8;
    }

    public static int A07(long j, int i) {
        return (i + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public static int A0A(String str) {
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    public static int A0D(boolean z, int i) {
        return (i + (z ? 1231 : 1237)) * 31;
    }

    public static Bitmap A0F(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        return createBitmap;
    }

    public static android.net.Uri A0I(String str) {
        return android.net.Uri.fromFile(new File(str));
    }

    public static C56302iJ A0O(int i, int i2, int i3, int i4) {
        C56302iJ c56302iJ = new C56302iJ(i, i2);
        c56302iJ.A0u = i3;
        c56302iJ.A0F = i4;
        return c56302iJ;
    }

    public static C2Z0 A0P(C2XE c2xe) {
        return new C2Z0(c2xe, new ArrayList());
    }

    public static C17z A0S(Writer writer) {
        C17z A0A = AbstractC221915u.A00.A0A(writer);
        A0A.A0d();
        return A0A;
    }

    public static C5SU A0U(Activity activity, int i) {
        return new C5SU(activity, new C149686oL(i));
    }

    public static C5NG A0V() {
        C5NG c5ng = new C5NG();
        c5ng.A01 = C5NH.A06;
        return c5ng;
    }

    public static C5NL A0W(C5QI c5qi) {
        C5NM c5nm = c5qi.A02;
        C14360o3.A0A(c5nm);
        return c5nm.A00();
    }

    public static C6RB A0X(Context context, int i, int i2) {
        return new C6RB(context, i2 - (i * 2));
    }

    public static Long A0d() {
        return 0L;
    }

    public static String A0h(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C14360o3.A07(lowerCase);
        return lowerCase;
    }

    public static ArrayList A0i(Iterable iterable) {
        return new ArrayList(AbstractC06950Ym.A1E(iterable, 10));
    }

    public static Map A0n(Object obj, Object obj2) {
        return AbstractC16850sd.A0M(new C09530e4(obj, obj2));
    }

    public static C17050sx A0q(Object obj, Object obj2, int i, int i2) {
        return AbstractC09440dt.A01(new BFI(i, i2, obj, obj2));
    }

    public static void A0s(Canvas canvas, Rect rect) {
        canvas.translate(rect.left, rect.top);
    }

    public static void A0w(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public static void A0x(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static void A0z(Fragment fragment, Runnable runnable) {
        C57982lB.A0B.A05(fragment.requireActivity(), runnable);
    }

    public static void A13(C25531Mh c25531Mh) {
        c25531Mh.A0m(C22F.A08.getModuleName());
    }

    public static void A14(C25531Mh c25531Mh, C22M c22m) {
        c25531Mh.A0b(c22m.A09);
        c25531Mh.A0T();
    }

    public static void A16(C189478aR c189478aR) {
        if (c189478aR != null) {
            c189478aR.A0L(null);
        }
    }

    public static void A1B(Object obj) {
        C5KY c5ky = (C5KY) obj;
        C14360o3.A0B(c5ky, 0);
        c5ky.A0B = false;
    }

    public static void A1L(Object obj, InterfaceC16530ry interfaceC16530ry, C0YR[] c0yrArr, int i, boolean z) {
        interfaceC16530ry.Egi(obj, Boolean.valueOf(z), c0yrArr[i]);
    }

    public static boolean A1T(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean A1Y(Object obj, Object obj2) {
        return C14360o3.A0K(obj2, ((InterfaceC14180ni) obj).getFunctionDelegate());
    }

    public static C09530e4[] A1b(Object obj, Object obj2, C09530e4 c09530e4, C09530e4 c09530e42) {
        return new C09530e4[]{c09530e4, c09530e42, new C09530e4(obj, obj2)};
    }

    public static float A00(Drawable drawable) {
        return drawable.getBounds().centerY();
    }

    public static float A04(List list, int i) {
        return ((Number) list.get(i)).floatValue();
    }

    public static int A06(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 2);
        return 2;
    }

    public static int A08(Context context) {
        return context.getColor(AbstractC53242c7.A0A(context));
    }

    public static int A09(Context context, int i) {
        return context.getColor(AbstractC53242c7.A0H(context, i));
    }

    public static int A0B(Iterator it) {
        return ((Number) it.next()).intValue();
    }

    public static int A0C(List list, int i) {
        return Integer.parseInt((String) list.get(i));
    }

    public static long A0E(Object obj, long j) {
        C14360o3.A07(obj);
        return j / 1000;
    }

    public static RectF A0H(Drawable drawable) {
        return new RectF(drawable.getBounds());
    }

    public static Handler A0J() {
        return new Handler(Looper.getMainLooper());
    }

    public static DisplayMetrics A0K(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static View A0L(InterfaceC09390do interfaceC09390do) {
        Object value = interfaceC09390do.getValue();
        C14360o3.A07(value);
        return (View) value;
    }

    public static ViewStub A0M(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C14360o3.A07(requireViewById);
        return (ViewStub) requireViewById;
    }

    public static TextView A0N(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C14360o3.A07(requireViewById);
        return (TextView) requireViewById;
    }

    public static C4OU A0Q(C4OM c4om, C4OM c4om2, C4OM c4om3, C4OM c4om4) {
        return new C4OU(new C4OM[]{c4om, c4om2, c4om3, c4om4});
    }

    public static C55982hj A0R() {
        return AbstractC13560mi.A00().A02();
    }

    public static IgImageView A0T(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C14360o3.A07(requireViewById);
        return (IgImageView) requireViewById;
    }

    public static C6RB A0Y(Context context, Resources resources, int i) {
        return new C6RB(context, resources.getDimensionPixelSize(i));
    }

    public static Float A0Z(C16L c16l) {
        return new Float(c16l.A0U());
    }

    public static Float A0a(C16L c16l) {
        return new Float(c16l.A0U());
    }

    public static Float A0b(C16L c16l) {
        return Float.valueOf((float) c16l.A0U());
    }

    public static IllegalArgumentException A0c(String str, String str2) {
        return new IllegalArgumentException(AnonymousClass001.A0R(str, str2));
    }

    public static Object A0e(List list, int i) {
        return list.get(i % list.size());
    }

    public static String A0f(Context context, Object obj, int i) {
        return context.getString(i, obj);
    }

    public static String A0g(EditText editText) {
        return editText.getText().toString();
    }

    public static HashSet A0j(String str, String str2) {
        return AbstractC16830sb.A05(str, str2);
    }

    public static Iterator A0k(AbstractMap abstractMap) {
        return abstractMap.values().iterator();
    }

    public static Iterator A0l(AbstractMap abstractMap) {
        return abstractMap.keySet().iterator();
    }

    public static List A0m(CharSequence charSequence, String str, int i) {
        return AbstractC001900j.A0R(charSequence, new String[]{str}, i);
    }

    public static C09530e4 A0o(Object obj, int i) {
        return new C09530e4(obj, Integer.valueOf(i));
    }

    public static C09530e4 A0p(Object obj, long j) {
        return new C09530e4(obj, Long.valueOf(j));
    }

    public static void A0t(Canvas canvas, Drawable drawable) {
        drawable.draw(canvas);
        canvas.restore();
        canvas.save();
    }

    public static void A0u(Canvas canvas, Drawable drawable, float f, float f2) {
        canvas.translate(f, f2);
        drawable.draw(canvas);
        canvas.restore();
    }

    public static void A0v(Canvas canvas, InterfaceC09390do interfaceC09390do) {
        ((Drawable) interfaceC09390do.getValue()).draw(canvas);
    }

    public static void A0y(View view, boolean z) {
        AbstractC125325le.A04(null, new View[]{view}, z);
    }

    public static void A10(InterfaceC02590Ai interfaceC02590Ai, C22F c22f) {
        interfaceC02590Ai.A8R(c22f.A0J(), "camera_destination");
    }

    public static void A11(InterfaceC02590Ai interfaceC02590Ai, C22F c22f) {
        interfaceC02590Ai.A8R(c22f.A0I(), "capture_type");
    }

    public static void A12(InterfaceC02590Ai interfaceC02590Ai, boolean z) {
        interfaceC02590Ai.A7v("is_support_partner_enabled", Boolean.valueOf(z));
    }

    public static void A15(C0f5 c0f5, String str, String str2, Throwable th) {
        c0f5.ABW(str, str2);
        c0f5.ERI(th);
        c0f5.report();
    }

    public static void A18(InterfaceC19630xq interfaceC19630xq, String str, int i) {
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D(str, i);
        ARD.apply();
    }

    public static void A19(C6RB c6rb, float f, float f2) {
        c6rb.A09();
        c6rb.A0A(f);
        c6rb.A0C(f2, f2);
    }

    public static void A1A(C6RB c6rb, float f, float f2, float f3) {
        c6rb.A09();
        c6rb.A0A(f);
        c6rb.A0C(f2, f3);
    }

    public static void A1C(Object obj) {
        C14360o3.A0A(obj);
        C14360o3.A0B(obj, 0);
    }

    public static void A1D(Object obj, int i, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 2);
    }

    public static void A1E(Object obj, int i, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 3);
    }

    public static void A1F(Object obj, int i, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 4);
    }

    public static void A1G(Object obj, int i, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 5);
    }

    public static void A1H(Object obj, int i, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 7);
    }

    public static void A1I(Object obj, int i, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 8);
    }

    public static void A1J(Object obj, int i, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 9);
    }

    public static boolean A1R(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 1);
        return true;
    }

    public static boolean A1S(C176777tZ c176777tZ, AbstractC176767tY abstractC176767tY) {
        return ((Boolean) abstractC176767tY.A01(c176777tZ)).booleanValue();
    }

    public static boolean A1Z(InterfaceC09390do interfaceC09390do) {
        return ((Boolean) interfaceC09390do.getValue()).booleanValue();
    }

    public static boolean A1a(InterfaceC09390do interfaceC09390do) {
        return ((InterfaceC56392iX) interfaceC09390do.getValue()).CWW();
    }
}
