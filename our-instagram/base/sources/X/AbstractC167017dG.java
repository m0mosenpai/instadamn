package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.cameracore.mediapipeline.arengineservices.modules.DynamicServiceModule;
import com.instagram.ar.core.voltron.IgArVoltronModuleLoader;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.7dG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC167017dG {
    public static Rect A0Q(Drawable drawable, Object obj) {
        C14360o3.A0B(obj, 0);
        Rect bounds = drawable.getBounds();
        C14360o3.A07(bounds);
        return bounds;
    }

    public static C25621Ms A0c(AbstractC12990ll abstractC12990ll) {
        C25621Ms c25621Ms = new C25621Ms(abstractC12990ll, -2);
        c25621Ms.A05();
        return c25621Ms;
    }

    public static InterfaceC19610xo A0g(InterfaceC19630xq interfaceC19630xq, String str) {
        int i = interfaceC19630xq.getInt(str, 0);
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D(str, i + 1);
        return ARD;
    }

    public static String A0m(C16L c16l) {
        if (c16l.A11() != C16R.A0G) {
            return c16l.A1P();
        }
        return null;
    }

    public static C19K A0w(C12N c12n, int i) {
        return AnonymousClass194.A02(c12n.AOT(i, 3));
    }

    public static void A0x() {
        new C1DY((C1DV) new C37761pD(null), 6, false);
    }

    public static void A14(Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public static void A15(Spannable spannable, Object obj) {
        spannable.setSpan(obj, 0, spannable.length(), 18);
    }

    public static void A1H(C16L c16l, AbstractCollection abstractCollection) {
        Parcelable.Creator creator = User.CREATOR;
        User A00 = AbstractC38851rI.A00(c16l, false);
        if (A00 != null) {
            abstractCollection.add(A00);
        }
    }

    public static void A1M(C6RB c6rb, float f, float f2, float f3) {
        float f4 = c6rb.A06 / 2;
        c6rb.setBounds((int) f, (int) (f2 - f4), (int) f3, (int) (f2 + f4));
    }

    public static void A1N(Object obj, Object obj2) {
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(obj2, 1);
    }

    public static void A1O(Object obj, Object obj2) {
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(obj2, 2);
    }

    public static void A1P(Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        C14360o3.A0B(obj2, 2);
    }

    public static void A1Q(Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        C14360o3.A0B(obj2, 3);
    }

    public static void A1R(Object obj, Object obj2) {
        C14360o3.A0B(obj, 2);
        C14360o3.A0B(obj2, 3);
    }

    public static void A1S(Object obj, Object obj2) {
        C14360o3.A0B(obj, 4);
        C14360o3.A0B(obj2, 5);
    }

    public static void A1T(Object obj, Object obj2) {
        C14360o3.A0B(obj, 5);
        C14360o3.A0B(obj2, 6);
    }

    public static void A1U(Object obj, Object obj2) {
        C14360o3.A0B(obj, 6);
        C14360o3.A0B(obj2, 7);
    }

    public static void A1X(float[] fArr, float f) {
        fArr[4] = f;
        fArr[5] = f;
        fArr[6] = f;
        fArr[7] = f;
    }

    public static boolean A1a(Object obj, Object obj2) {
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(obj2, 1);
        return true;
    }

    public static int A0I(C22M c22m) {
        if (c22m.A01 == 2) {
            return 2;
        }
        return 1;
    }

    public static int A0K(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public static int A0M(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static int A0O(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public static Bundle A0T(Object obj, Object obj2, C09530e4 c09530e4) {
        return AbstractC61636Rr0.A00(c09530e4, new C09530e4(obj, obj2));
    }

    public static C4OU A0W(C4OS c4os, Class cls, String str, int i) {
        return new C4OU(new C4OM[]{new C4OK(c4os, cls, str, i)});
    }

    public static C4OU A0X(C4Og c4Og, C4OM c4om, C4OM c4om2, String str) {
        return new C4OU(new C4OM[]{c4om, c4om2, new C4OW(c4Og, str)});
    }

    public static C4OU A0Y(C4Og c4Og, C4OM c4om, String str) {
        return new C4OU(new C4OM[]{c4om, new C4OW(c4Og, str)});
    }

    public static C4OU A0Z(C4Og c4Og, String str) {
        return new C4OU(new C4OM[]{new C4OW(c4Og, str)});
    }

    public static C4OU A0a(Class cls, String str, int i) {
        return new C4OU(new C4OM[]{new C126315nS(cls, str, i)});
    }

    public static C4OU A0b(Class cls, String str, int i) {
        return new C4OU(new C4OM[]{new C4OK(cls, str, i)});
    }

    public static GalleryItem.LocalGalleryMedium A0d(Medium medium) {
        return new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05));
    }

    public static C38321qM A0e(AbstractC67881V0m abstractC67881V0m, String str) {
        UserSession userSession = abstractC67881V0m.A00;
        C14360o3.A07(userSession);
        return C1DW.A00(userSession).A02(str);
    }

    public static Integer A0h(Object obj) {
        ((Number) obj).intValue();
        return 1;
    }

    public static String A0p(StringBuilder sb) {
        sb.append(')');
        return sb.toString();
    }

    public static ArrayList A0q(Iterable iterable) {
        return new ArrayList(AbstractC06950Ym.A1E(iterable, 10));
    }

    public static HashMap A0r(Object obj, Object obj2) {
        return AbstractC06930Yk.A02(new C09530e4(obj, obj2));
    }

    public static LinkedHashMap A0u(Object obj, Object obj2, C09530e4 c09530e4, C09530e4 c09530e42, C09530e4 c09530e43) {
        return AbstractC06930Yk.A06(c09530e4, c09530e42, c09530e43, new C09530e4(obj, obj2));
    }

    public static void A13(ColorFilter colorFilter, Drawable drawable) {
        Drawable mutate;
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setColorFilter(colorFilter);
        }
    }

    public static void A19(Fragment fragment, int i, int i2) {
        if (i == i2) {
            fragment.requireActivity().setResult(i2);
            fragment.requireActivity().finish();
        }
    }

    public static void A1A(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        interfaceC02590Ai.A8p("event_type", 2);
    }

    public static void A1B(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.AAP("module", C22F.A08.getModuleName());
    }

    public static void A1C(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.AAP("nav_chain", C1QM.A00.A02.A00);
        interfaceC02590Ai.Cht();
    }

    public static void A1D(C25531Mh c25531Mh) {
        c25531Mh.A0t(C1QM.A00.A02.A00);
        c25531Mh.Cht();
    }

    public static void A1I(ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, C3FQ c3fq) {
        if (viewOnTouchListenerC60632pm != null) {
            viewOnTouchListenerC60632pm.A0C = true;
            viewOnTouchListenerC60632pm.onScrollStateChanged(c3fq, 0);
        }
    }

    public static boolean A1b(Object obj, InterfaceC16530ry interfaceC16530ry, C0YR[] c0yrArr, int i) {
        return ((Boolean) interfaceC16530ry.CES(obj, c0yrArr[i])).booleanValue();
    }

    public static float A00(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Number) animatedValue).floatValue();
    }

    public static int A01(int i) {
        int A0L = AbstractC16850sd.A0L(i);
        if (A0L < 16) {
            return 16;
        }
        return A0L;
    }

    public static int A02(int i, int i2) {
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    public static int A03(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
    }

    public static int A04(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
    }

    public static int A05(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
    }

    public static int A06(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
    }

    public static int A07(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
    }

    public static int A08(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
    }

    public static int A09(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
    }

    public static int A0A(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
    }

    public static int A0B(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
    }

    public static int A0C(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_star_medium);
    }

    public static int A0D(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness);
    }

    public static int A0E(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public static int A0F(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
    }

    public static int A0G(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
    }

    public static int A0H(C176807tc c176807tc, AbstractC176797tb abstractC176797tb) {
        Object A02 = abstractC176797tb.A02(c176807tc);
        A02.getClass();
        return ((Number) A02).intValue();
    }

    public static int A0J(C38321qM c38321qM) {
        if (!c38321qM.Cff()) {
            return 1;
        }
        return 3;
    }

    public static int A0L(Number number, String str, int i) {
        return (i + str.hashCode() + number.intValue()) * 31;
    }

    public static int A0N(Object obj, int i) {
        int A03 = C0f9.A03(i);
        C14360o3.A0B(obj, 0);
        return A03;
    }

    public static int A0P(AbstractList abstractList, int i) {
        Object obj = abstractList.get(i);
        C14360o3.A07(obj);
        return ((Number) obj).intValue();
    }

    public static Typeface A0R(Context context) {
        return AbstractC15960qq.A00(context).A02(EnumC15950qp.A13);
    }

    public static Typeface A0S(Context context) {
        return AbstractC15960qq.A00(context).A02(EnumC15950qp.A0V);
    }

    public static View A0U(View view, int i) {
        return ((ViewStub) view.requireViewById(i)).inflate();
    }

    public static View A0V(InterfaceC09390do interfaceC09390do) {
        return ((InterfaceC56392iX) interfaceC09390do.getValue()).getView();
    }

    public static C5SU A0f(Activity activity, CharSequence charSequence) {
        C14360o3.A07(charSequence);
        return new C5SU(activity, new C149686oL(charSequence));
    }

    public static Object A0i(InterfaceC23621Ds interfaceC23621Ds, InterfaceC19390xP interfaceC19390xP, InterfaceC19960yQ interfaceC19960yQ) {
        Object collect = interfaceC19390xP.collect(interfaceC19960yQ, interfaceC23621Ds);
        if (collect != C1JX.A02) {
            return C0eB.A00;
        }
        return collect;
    }

    public static String A0j() {
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static String A0k(Resources resources, int i, int i2) {
        return resources.getQuantityString(i2, i, Integer.valueOf(i));
    }

    public static String A0l(AnonymousClass182 anonymousClass182, Object obj) {
        anonymousClass182.A0a();
        anonymousClass182.close();
        return obj.toString();
    }

    public static String A0n(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    public static String A0o(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public static Iterator A0s(Parcel parcel, Map map) {
        parcel.writeInt(map.size());
        return map.entrySet().iterator();
    }

    public static Iterator A0t(AbstractMap abstractMap) {
        Collection values = abstractMap.values();
        C14360o3.A07(values);
        return values.iterator();
    }

    public static Map A0v(Map map, int i) {
        map.put("z_index", Integer.valueOf(i));
        return AbstractC06930Yk.A0B(map);
    }

    public static void A0y(Activity activity, C3DO c3do) {
        C3DN A00 = c3do.A00(activity);
        if (A00 != null) {
            A00.A0B();
        }
    }

    public static void A0z(Context context, C6RB c6rb) {
        c6rb.A0I(AbstractC15960qq.A00(context).A02(EnumC15950qp.A0V));
    }

    public static void A10(Context context, C6RB c6rb, int i) {
        c6rb.A0F(context.getColor(AbstractC53242c7.A0H(context, i)));
    }

    public static void A11(Canvas canvas, Rect rect) {
        canvas.save();
        canvas.translate(rect.left, rect.top);
    }

    public static void A12(Canvas canvas, Drawable drawable) {
        canvas.translate(drawable.getBounds().left, drawable.getBounds().top);
    }

    public static void A16(View view, C86Q c86q) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(c86q.A00);
        }
    }

    public static void A17(View view, C41181vS c41181vS, C84823qW c84823qW, int i, int i2) {
        C138436Oz.A04(view, c84823qW, c41181vS.A00(), i, i2, true);
    }

    public static void A18(EditText editText) {
        editText.setSelection(editText.getText().length());
    }

    public static void A1E(BDA bda, C0Gd c0Gd, IgArVoltronModuleLoader igArVoltronModuleLoader, EnumC27091Ti enumC27091Ti, AbstractCollection abstractCollection) {
        abstractCollection.add(new DynamicServiceModule(bda, igArVoltronModuleLoader.getModuleLoader(enumC27091Ti), c0Gd));
    }

    public static void A1F(AnonymousClass182 anonymousClass182, Iterator it) {
        String str = (String) it.next();
        if (str != null) {
            anonymousClass182.A0u(str);
        }
    }

    public static void A1G(AnonymousClass182 anonymousClass182, Iterator it) {
        User user = (User) it.next();
        if (user != null) {
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
    }

    public static void A1J(C18950wb c18950wb, String str, Throwable th, int i) {
        C0f5 AEp = c18950wb.AEp(str, i);
        AEp.ERI(th);
        AEp.report();
    }

    public static void A1K(C1NJ c1nj, C25821No c25821No, ImageUrl imageUrl, String str) {
        C1OG A0J = c25821No.A0J(imageUrl, str);
        A0J.A02(c1nj);
        A0J.A01();
    }

    public static void A1L(InterfaceC19610xo interfaceC19610xo, InterfaceC19630xq interfaceC19630xq, String str, int i) {
        interfaceC19610xo.E7D(str, interfaceC19630xq.getInt(str, i) + 1);
        interfaceC19610xo.apply();
    }

    public static void A1V(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((User) it.next()).getId());
    }

    public static void A1W(InterfaceC09390do interfaceC09390do, int i) {
        Object value = interfaceC09390do.getValue();
        C14360o3.A07(value);
        ((View) value).setVisibility(i);
    }

    public static boolean A1Y(C176807tc c176807tc, AbstractC176797tb abstractC176797tb) {
        Object A02 = abstractC176797tb.A02(c176807tc);
        A02.getClass();
        return ((Boolean) A02).booleanValue();
    }

    public static boolean A1Z(Object obj, Object obj2) {
        return C14360o3.A0K(obj.getClass(), obj2.getClass());
    }
}
