package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Parcel;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.File;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7dE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC166997dE {
    public static int A0I(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static Bitmap A0O(C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        return c73033Pe.A01;
    }

    public static Paint A0P() {
        return new Paint(1);
    }

    public static Paint A0Q() {
        return new Paint(3);
    }

    public static C06090Tz A0U(Object obj) {
        C14360o3.A0B(obj, 0);
        return C06090Tz.A05;
    }

    public static Boolean A0a() {
        return false;
    }

    public static Boolean A0b() {
        return true;
    }

    public static Object A0k(AbstractList abstractList) {
        return abstractList.get(0);
    }

    public static AtomicBoolean A17() {
        return new AtomicBoolean(false);
    }

    public static void A1E(Drawable drawable, float f, float f2, float f3, float f4) {
        drawable.setBounds((int) f, (int) f2, (int) f3, (int) f4);
    }

    public static void A1M(C56302iJ c56302iJ) {
        c56302iJ.A0u = 0;
        c56302iJ.A0F = 0;
        c56302iJ.A0s = 0;
        c56302iJ.A0M = 0;
    }

    public static float[] A1a(float[] fArr) {
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        C14360o3.A07(copyOf);
        return copyOf;
    }

    public static int A05(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
    }

    public static C4OW A0V(C4Og c4Og) {
        return new C4OW(c4Og, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public static UserSession A0W(C214959fX c214959fX) {
        return (UserSession) c214959fX.A0J.getValue();
    }

    public static File A0Z(Object obj) {
        File file = (File) obj;
        C14360o3.A0B(file, 0);
        return file;
    }

    public static IllegalStateException A0g() {
        return new IllegalStateException("Required value was null.");
    }

    public static Long A0j(String str) {
        return AbstractC003100w.A0k(10, str);
    }

    public static StringBuilder A11(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static void A1D(Paint paint, PorterDuff.Mode mode) {
        paint.setXfermode(new PorterDuffXfermode(mode));
    }

    public static void A1G(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setBounds(new Rect(i, i2, i3, i4));
    }

    public static void A1O(C41451vu c41451vu, C31349DqE c31349DqE) {
        c41451vu.E4s(new C3KD(c31349DqE));
    }

    public static void A1Q(C6RB c6rb, CharSequence charSequence) {
        c6rb.A0L(new SpannableString(charSequence));
    }

    public static void A1R(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(new C09530e4(obj, obj2));
    }

    public static void A1V(String str, Object obj, String str2) {
        ((C07950bF) obj).A03.A00(str, str2);
        throw null;
    }

    public static int A00(int i, float f) {
        return (i + Float.floatToIntBits(f)) * 31;
    }

    public static int A01(Context context) {
        return context.getColor(R.color.audio_bar_action_color_enabled);
    }

    public static int A02(Context context) {
        return context.getColor(R.color.black_50_transparent);
    }

    public static int A03(Context context) {
        return context.getColor(R.color.design_dark_default_color_on_background);
    }

    public static int A04(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }

    public static int A06(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
    }

    public static int A07(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
    }

    public static int A08(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
    }

    public static int A09(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
    }

    public static int A0A(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public static int A0B(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
    }

    public static int A0C(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
    }

    public static int A0D(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
    }

    public static int A0E(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.before_and_after_caption_font_size);
    }

    public static int A0F(Drawable drawable) {
        return drawable.getBounds().centerX();
    }

    public static int A0G(Drawable drawable) {
        return drawable.getBounds().height();
    }

    public static int A0H(Drawable drawable) {
        return drawable.getBounds().width();
    }

    public static int A0J(Object obj, int i) {
        return (i + obj.hashCode()) * 31;
    }

    public static int A0K(String str, int i) {
        return (i + str.hashCode()) * 31;
    }

    public static Context A0L(View view) {
        Context context = view.getContext();
        C14360o3.A07(context);
        return context;
    }

    public static Resources A0M(Context context) {
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        return resources;
    }

    public static Resources A0N(Fragment fragment) {
        return fragment.requireContext().getResources();
    }

    public static View A0R(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C14360o3.A07(requireViewById);
        return requireViewById;
    }

    public static View A0S(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C14360o3.A07(requireViewById);
        return requireViewById;
    }

    public static TextView A0T(View view, int i) {
        return (TextView) view.requireViewById(i);
    }

    public static InterfaceC56392iX A0X(View view, int i) {
        return AbstractC56372iV.A00(view.requireViewById(i));
    }

    public static User A0Y(UserSession userSession) {
        return C08730cb.A00(userSession).A00();
    }

    public static Boolean A0c(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, long j) {
        return Boolean.valueOf(C18U.A06(c06090Tz, abstractC12990ll, j));
    }

    public static Boolean A0d(C16L c16l) {
        return Boolean.valueOf(c16l.A0d());
    }

    public static Double A0e(float f) {
        return AnonymousClass010.A0m(String.valueOf(f));
    }

    public static Double A0f(Object obj) {
        return AnonymousClass010.A0m(String.valueOf(obj));
    }

    public static Integer A0h(C16L c16l) {
        return Integer.valueOf(c16l.A1D());
    }

    public static Long A0i(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, long j) {
        return Long.valueOf(C18U.A01(c06090Tz, abstractC12990ll, j));
    }

    public static Object A0l(Iterator it) {
        Object next = it.next();
        C14360o3.A07(next);
        return next;
    }

    public static Object A0m(Map map, int i) {
        return map.get(Integer.valueOf(i));
    }

    public static String A0n() {
        return UUID.randomUUID().toString();
    }

    public static String A0o() {
        return C0HM.A00().toString();
    }

    public static String A0p(Context context, int i) {
        String string = context.getString(i);
        C14360o3.A07(string);
        return string;
    }

    public static String A0q(Resources resources, int i) {
        String string = resources.getString(i);
        C14360o3.A07(string);
        return string;
    }

    public static String A0r(Resources resources, Object obj, int i) {
        return resources.getString(i, obj);
    }

    public static String A0s(C16L c16l) {
        String A0q = c16l.A0q();
        c16l.A1J();
        return A0q;
    }

    public static String A0t(UserSession userSession) {
        return ((C22F) AnonymousClass229.A01(userSession)).A04.A0L;
    }

    public static String A0u(Object obj) {
        return String.valueOf(obj.hashCode());
    }

    public static String A0v(Object obj, StringBuilder sb) {
        sb.append(obj);
        return sb.toString();
    }

    public static String A0w(String str) {
        return str.toUpperCase(Locale.getDefault());
    }

    public static String A0x(String str, StringBuilder sb) {
        sb.append(str);
        return sb.toString();
    }

    public static String A0y(String str, Throwable th) {
        return AnonymousClass001.A0R(str, th.getMessage());
    }

    public static String A0z(String str, Object[] objArr) {
        String format = String.format(str, objArr);
        C14360o3.A07(format);
        return format;
    }

    public static String A10(Locale locale, String str) {
        String upperCase = str.toUpperCase(locale);
        C14360o3.A07(upperCase);
        return upperCase;
    }

    public static ArrayList A12(Object obj, int i) {
        C14360o3.A0B(obj, i);
        return new ArrayList();
    }

    public static Iterator A13(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        C14360o3.A07(it);
        return it;
    }

    public static Iterator A14(AbstractMap abstractMap) {
        return abstractMap.entrySet().iterator();
    }

    public static Iterator A15(Map map) {
        return map.entrySet().iterator();
    }

    public static Iterator A16(Map map) {
        return map.values().iterator();
    }

    public static void A18(Context context, View view, int i) {
        view.setContentDescription(context.getString(i));
    }

    public static void A19(Context context, ImageView imageView, int i) {
        imageView.setImageDrawable(context.getDrawable(i));
    }

    public static void A1A(Context context, C6RB c6rb, int i) {
        c6rb.A0F(context.getColor(i));
    }

    public static void A1B(Resources resources, C6RB c6rb, int i) {
        c6rb.A0A(resources.getDimensionPixelSize(i));
    }

    public static void A1C(Resources resources, C6RB c6rb, int i) {
        c6rb.A0M(resources.getString(i));
    }

    public static void A1F(Drawable drawable, int i) {
        drawable.setColorFilter(C3DY.A00(i));
    }

    public static void A1H(Handler handler, Object obj, int i) {
        handler.sendMessage(handler.obtainMessage(i, obj));
    }

    public static void A1I(Parcel parcel, Enum r2) {
        parcel.writeString(r2.name());
    }

    public static void A1J(View view, View view2, boolean z) {
        AbstractC125325le.A05(new View[]{view, view2}, z);
    }

    public static void A1K(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void A1L(View view, boolean z) {
        AbstractC125325le.A05(new View[]{view}, z);
    }

    public static void A1N(InterfaceC02590Ai interfaceC02590Ai, String str, int i) {
        interfaceC02590Ai.A8p(str, Integer.valueOf(i));
    }

    public static void A1P(C5SU c5su) {
        c5su.A00().A06();
    }

    public static void A1S(Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(obj.toString());
    }

    public static void A1T(Object obj, AbstractMap abstractMap, double d) {
        abstractMap.put(obj, Double.valueOf(d));
    }

    public static void A1U(Object obj, AbstractMap abstractMap, int i) {
        abstractMap.put(obj, Integer.valueOf(i));
    }

    public static void A1W(AbstractCollection abstractCollection, int i) {
        abstractCollection.add(Integer.valueOf(i));
    }

    public static void A1X(AbstractCollection abstractCollection, long j) {
        abstractCollection.add(Long.valueOf(j));
    }

    public static void A1Y(C05A c05a, boolean z) {
        c05a.Egh(Boolean.valueOf(z));
    }

    public static boolean A1Z(Object obj, boolean z) {
        return C14360o3.A0K(obj, Boolean.valueOf(z));
    }

    public static Object[] A1b(Object obj, int i) {
        return Arrays.copyOf(new Object[]{obj}, i);
    }
}
