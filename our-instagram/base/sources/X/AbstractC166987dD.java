package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import com.instagram.user.model.User;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7dD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC166987dD {
    public static float A01(float f, float f2) {
        return Math.abs(f - f2);
    }

    public static float A02(int i) {
        return i / 2.0f;
    }

    public static float A03(int i, int i2, float f) {
        return (i + i2) / f;
    }

    public static int A0A(float f, float f2) {
        return Math.round(f * f2);
    }

    public static int A0B(float f, float f2) {
        return C1H4.A01(f * f2);
    }

    public static RectF A0Y(float f, float f2) {
        return new RectF(0.0f, 0.0f, f, f2);
    }

    public static Object A16(List list) {
        return list.get(0);
    }

    public static float A05(Drawable drawable) {
        return drawable.getIntrinsicHeight() / 2.0f;
    }

    public static float A09(Object obj) {
        return ((Number) obj).floatValue();
    }

    public static int A0H(Object obj) {
        return ((Number) obj).intValue();
    }

    public static int A0K(boolean z, int i) {
        return i + (z ? 1231 : 1237);
    }

    public static long A0L(long j) {
        return j / 1000;
    }

    public static long A0N(Object obj) {
        return ((Number) obj).longValue();
    }

    public static Context A0P(C183688Ct c183688Ct) {
        return c183688Ct.A0p.getContext();
    }

    public static Matrix A0Q() {
        return new Matrix();
    }

    public static Paint A0R() {
        return new Paint();
    }

    public static Paint A0S(int i) {
        return new Paint(i);
    }

    public static Path A0T() {
        return new Path();
    }

    public static Rect A0U() {
        return new Rect();
    }

    public static Rect A0V(int i, int i2, int i3, int i4) {
        return new Rect(i, i2, i3, i4);
    }

    public static RectF A0X() {
        return new RectF();
    }

    public static Bundle A0b() {
        return new Bundle();
    }

    public static InterfaceC02590Ai A0f(C18920wW c18920wW, String str) {
        return c18920wW.A00(c18920wW.A00, str);
    }

    public static C4OK A0h(C4OS c4os, Class cls, String str, int i) {
        return new C4OK(c4os, cls, str, i);
    }

    public static C4OW A0i(C4Og c4Og, String str) {
        return new C4OW(c4Og, str);
    }

    public static C94774Oi A0j(InterfaceC94764Of interfaceC94764Of) {
        return new C94774Oi(interfaceC94764Of);
    }

    public static C4OU A0k(C4OM[] c4omArr) {
        return new C4OU(c4omArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3zu, java.io.IOException] */
    public static C90133zu A0m(Throwable th) {
        return new IOException(th);
    }

    public static UserSession A0p(AbstractC67881V0m abstractC67881V0m) {
        UserSession userSession = abstractC67881V0m.A00;
        C14360o3.A06(userSession);
        return userSession;
    }

    public static UserSession A0q(AbstractC67881V0m abstractC67881V0m) {
        UserSession userSession = abstractC67881V0m.A00;
        C14360o3.A07(userSession);
        return userSession;
    }

    public static C3P9 A0s(View view) {
        return new C3P9(view);
    }

    public static VoiceOption A0v(String str, String str2, String str3) {
        return new VoiceOption(str, str2, str3);
    }

    public static InterfaceC19610xo A0w(C23031Ai c23031Ai) {
        return c23031Ai.A01.ARD();
    }

    public static C17280tP A0y() {
        return C17280tP.A4E.A00();
    }

    public static C6RB A0z(Context context, int i) {
        return new C6RB(context, i);
    }

    public static User A10(UserSession userSession) {
        return C17060sy.A01.A01(userSession);
    }

    public static File A11(String str) {
        return new File(str);
    }

    public static IllegalArgumentException A12(String str) {
        return new IllegalArgumentException(str);
    }

    public static IllegalStateException A13() {
        return new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static IllegalStateException A14(String str) {
        return new IllegalStateException(str);
    }

    public static NullPointerException A15(String str) {
        return new NullPointerException(str);
    }

    public static RuntimeException A18(String str) {
        return new RuntimeException(str);
    }

    public static StringBuilder A1C() {
        return new StringBuilder();
    }

    public static UnsupportedOperationException A1D(String str) {
        return new UnsupportedOperationException(str);
    }

    public static ArrayList A1E() {
        return new ArrayList();
    }

    public static ArrayList A1F(Collection collection) {
        return new ArrayList(collection);
    }

    public static HashMap A1G() {
        return new HashMap();
    }

    public static HashSet A1H() {
        return new HashSet();
    }

    public static LinkedHashMap A1I() {
        return new LinkedHashMap();
    }

    public static C09530e4 A1L(Object obj, Object obj2) {
        return new C09530e4(obj, obj2);
    }

    public static InterfaceC23621Ds A1M(Object obj, Object obj2, C1Dr c1Dr) {
        return c1Dr.create(obj2, (InterfaceC23621Ds) obj);
    }

    public static void A1R(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    public static void A1S(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("camera_session_id", str);
    }

    public static void A1X(C145176gc c145176gc) {
        c145176gc.A18.EJJ();
    }

    public static void A1Y(Object obj) {
        ((InterfaceC16820sZ) obj).invoke();
    }

    public static void A1Z(InterfaceC16620sF interfaceC16620sF, C19L c19l) {
        AbstractC23641Du.A05(AnonymousClass191.A00, interfaceC16620sF, c19l);
    }

    public static boolean A1a(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public static double A00(Rect rect) {
        return rect.width();
    }

    public static float A04(Resources resources, int i) {
        return resources.getDimensionPixelSize(i);
    }

    public static float A06(Drawable drawable) {
        return drawable.getIntrinsicHeight();
    }

    public static float A07(View view) {
        return view.getWidth();
    }

    public static float A08(View view) {
        return view.getHeight();
    }

    public static int A0C(Context context, int i) {
        return (int) AbstractC13880nE.A04(context, i);
    }

    public static int A0D(Drawable drawable) {
        return drawable.getBounds().bottom;
    }

    public static int A0E(Drawable drawable) {
        return drawable.getBounds().left;
    }

    public static int A0F(Drawable drawable, int i) {
        return i + drawable.getIntrinsicHeight();
    }

    public static int A0G(Object obj) {
        return obj.hashCode() * 31;
    }

    public static int A0I(Object obj, int i) {
        return i + obj.hashCode();
    }

    public static int A0J(String str) {
        return str.hashCode() * 31;
    }

    public static long A0M(Object obj) {
        return obj.hashCode();
    }

    public static Context A0O(Context context) {
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        return applicationContext;
    }

    public static Rect A0W(Drawable drawable) {
        Rect bounds = drawable.getBounds();
        C14360o3.A07(bounds);
        return bounds;
    }

    public static Drawable A0Z(Iterator it) {
        return (Drawable) it.next();
    }

    public static Drawable A0a(InterfaceC09390do interfaceC09390do) {
        return (Drawable) interfaceC09390do.getValue();
    }

    public static View A0c(View view, int i) {
        View findViewById = view.findViewById(i);
        C14360o3.A07(findViewById);
        return findViewById;
    }

    public static View A0d(InterfaceC09390do interfaceC09390do) {
        return (View) interfaceC09390do.getValue();
    }

    public static TextView A0e(View view, int i) {
        return (TextView) view.findViewById(i);
    }

    public static FilterModel A0g(SparseArray sparseArray, int i) {
        return (FilterModel) sparseArray.get(i);
    }

    public static Medium A0l(Iterator it) {
        return (Medium) it.next();
    }

    public static AbstractC18680vv A0n(InterfaceC09390do interfaceC09390do) {
        return (AbstractC18680vv) interfaceC09390do.getValue();
    }

    public static AbstractC12990ll A0o(InterfaceC09390do interfaceC09390do) {
        return (AbstractC12990ll) interfaceC09390do.getValue();
    }

    public static UserSession A0r(InterfaceC09390do interfaceC09390do) {
        return (UserSession) interfaceC09390do.getValue();
    }

    public static C447624g A0t(UserSession userSession) {
        return AnonymousClass229.A01(userSession).A04;
    }

    public static C447724h A0u(UserSession userSession) {
        return AnonymousClass229.A01(userSession).A0J;
    }

    public static InterfaceC19630xq A0x(UserSession userSession) {
        return AbstractC23021Ah.A00(userSession).A01;
    }

    public static Object A17(InterfaceC09390do interfaceC09390do) {
        Object value = interfaceC09390do.getValue();
        C14360o3.A07(value);
        return value;
    }

    public static String A19(Object obj) {
        String obj2 = obj.toString();
        C14360o3.A07(obj2);
        return obj2;
    }

    public static String A1A(Object obj, Map map) {
        return (String) map.get(obj);
    }

    public static String A1B(Iterator it) {
        return (String) it.next();
    }

    public static List A1J(Object obj) {
        List singletonList = Collections.singletonList(obj);
        C14360o3.A07(singletonList);
        return singletonList;
    }

    public static Map.Entry A1K(Iterator it) {
        return (Map.Entry) it.next();
    }

    public static void A1N(Context context, Paint paint, int i) {
        paint.setColor(context.getColor(i));
    }

    public static void A1O(Context context, TextView textView, int i) {
        textView.setTextColor(context.getColor(i));
    }

    public static void A1P(Context context, TextView textView, int i) {
        textView.setText(context.getString(i));
    }

    public static void A1Q(Context context, C6RB c6rb, int i) {
        c6rb.A0M(context.getString(i));
    }

    public static void A1T(C18950wb c18950wb, String str, int i) {
        c18950wb.AEp(str, i).report();
    }

    public static void A1U(EnumC15950qp enumC15950qp, C15980qs c15980qs, C6RB c6rb) {
        c6rb.A0I(c15980qs.A02(enumC15950qp));
    }

    public static void A1V(C148276lx c148276lx, C5NG c5ng) {
        c5ng.A06 = c148276lx.A01();
    }

    public static void A1W(C193328hC c193328hC) {
        C0fJ.A00(c193328hC.A02());
    }

    public static boolean A1b(List list) {
        return !list.isEmpty();
    }
}
