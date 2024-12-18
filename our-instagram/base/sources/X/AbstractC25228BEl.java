package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallText;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.BEl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25228BEl {
    public static C5YU A0a(long j) {
        return new C5YU(j, 5);
    }

    public static C06090Tz A0l(Object obj) {
        C14360o3.A0B(obj, 0);
        return C06090Tz.A06;
    }

    public static C9CV A0n(Integer num, Object obj) {
        return new C9CV(num, obj, 3);
    }

    public static C9CV A0o(Integer num, Object obj) {
        return new C9CV(num, obj, 4);
    }

    public static C25621Ms A0q(AbstractC12990ll abstractC12990ll) {
        return new C25621Ms(abstractC12990ll, -2);
    }

    public static C63397SjR A0y(Context context, UserSession userSession, C2Fb c2Fb, String str) {
        return new C63397SjR(context, userSession, c2Fb, str, false);
    }

    public static WallText.Res A10(int i) {
        return new WallText.Res(i, new String[0]);
    }

    public static Serializable A11(Bundle bundle, String str) {
        Serializable serializable = bundle.getSerializable(str);
        if (serializable == null) {
            return null;
        }
        return serializable;
    }

    public static String A18(User user) {
        if (user != null) {
            return user.getId();
        }
        return null;
    }

    public static void A1I(Drawable drawable, ImageView.ScaleType scaleType, C2Z0 c2z0, C51722Yv c51722Yv) {
        c2z0.A00(new BNU(drawable, scaleType, c51722Yv, false));
    }

    public static void A1M(C113565At c113565At, InterfaceC113515Ao interfaceC113515Ao, InterfaceC09250da interfaceC09250da) {
        interfaceC113515Ao.EOx(c113565At, new C120895dg(null, interfaceC09250da));
    }

    public static boolean A1R(int i) {
        if ((i & 14) == 4) {
            return true;
        }
        return false;
    }

    public static boolean A1S(int i) {
        if ((i & 14) != 4) {
            return false;
        }
        return true;
    }

    public static boolean A1U(C5Tl c5Tl, Object obj, boolean z, boolean z2) {
        return z | z2 | c5Tl.AH6(obj);
    }

    public static boolean A1V(C5Tl c5Tl, Object obj, boolean z, boolean z2) {
        return z | z2 | c5Tl.AH4(obj);
    }

    public static int A01(int i) {
        int i2 = i >> 3;
        return (i2 & 112) | (i2 & 14);
    }

    public static int A03(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int A0B(Object obj) {
        return ((Number) obj).intValue() & 3;
    }

    public static int A0C(Object obj) {
        return ((Number) obj).intValue() & 11;
    }

    public static int A0D(Object obj) {
        return ((Number) obj).intValue() & 17;
    }

    public static int A0E(Object obj) {
        return ((Number) obj).intValue() & 81;
    }

    public static long A0H(InterfaceC1128857w interfaceC1128857w) {
        return C62U.A00(interfaceC1128857w.Bxc(), 0L);
    }

    public static Context A0K(C5Tl c5Tl) {
        return (Context) c5Tl.AJX(AndroidCompositionLocals_androidKt.A01);
    }

    public static Context A0L(Object obj) {
        Context context = (Context) obj;
        C14360o3.A0B(context, 0);
        return context;
    }

    public static GradientDrawable A0O(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i);
        return gradientDrawable;
    }

    public static View A0Q(C2YR c2yr, C51532Yb c51532Yb) {
        return c51532Yb.ALq(c2yr.A00.A04);
    }

    public static View A0R(Object obj) {
        View view = (View) obj;
        C14360o3.A0B(view, 0);
        return view;
    }

    public static View A0S(Object obj) {
        View view = (View) obj;
        C14360o3.A0B(view, 1);
        return view;
    }

    public static C6Nu A0T(Object obj) {
        C6Nu c6Nu = (C6Nu) obj;
        C14360o3.A0B(c6Nu, 0);
        return c6Nu;
    }

    public static Modifier A0V() {
        return Modifier.A00.Eq3(AbstractC118185Wd.A01);
    }

    public static Modifier A0W() {
        return Modifier.A00.Eq3(AbstractC118185Wd.A02);
    }

    public static InterfaceC1132159j A0b(Object obj) {
        InterfaceC1132159j interfaceC1132159j = (InterfaceC1132159j) obj;
        C14360o3.A0B(interfaceC1132159j, 0);
        return interfaceC1132159j;
    }

    public static InterfaceC1128857w A0c(Object obj) {
        InterfaceC1128857w interfaceC1128857w = (InterfaceC1128857w) obj;
        C14360o3.A0B(interfaceC1128857w, 0);
        return interfaceC1128857w;
    }

    public static InterfaceC1127857k A0d(C5Tl c5Tl) {
        return AbstractC118375Wz.A01(AbstractC118255Wn.A01, c5Tl, C118195Wf.A04);
    }

    public static InterfaceC1127857k A0e(C5Tl c5Tl) {
        return AbstractC119595bH.A00(AbstractC118255Wn.A07, c5Tl, C118195Wf.A00);
    }

    public static InterfaceC1127857k A0f(C5Tl c5Tl, int i) {
        return AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, C118195Wf.A05, i);
    }

    public static C6C7 A0g() {
        return new C6C7(16);
    }

    public static InterfaceC1128957x A0h(C5Tl c5Tl) {
        return (InterfaceC1128957x) c5Tl.AJX(C5V2.A01);
    }

    public static InterfaceC018407e A0i(Object obj) {
        return (InterfaceC018407e) ((InterfaceC09390do) obj).getValue();
    }

    public static C2XB A0k(Object obj) {
        C2XB c2xb = (C2XB) obj;
        C14360o3.A0B(c2xb, 0);
        return c2xb;
    }

    public static C9CT A0m(Integer num, int i) {
        return new C9CT(num, 100.0f, i);
    }

    public static C2YN A0p(Object obj) {
        C2YN c2yn = (C2YN) obj;
        C14360o3.A0B(c2yn, 0);
        return c2yn;
    }

    public static C37644Ghd A0r(Object obj) {
        C37644Ghd c37644Ghd = (C37644Ghd) obj;
        C14360o3.A0B(c37644Ghd, 0);
        return c37644Ghd;
    }

    public static C166137bh A0s(MediaCommentListRepository mediaCommentListRepository) {
        return (C166137bh) mediaCommentListRepository.A0L.getValue();
    }

    public static UserSession A0u(C5Tl c5Tl) {
        return (UserSession) c5Tl.AJX(AbstractC117935Vd.A00);
    }

    public static C44505JmB A0w(C26780Bs3 c26780Bs3) {
        return (C44505JmB) c26780Bs3.A01.getValue();
    }

    public static C29138Ct5 A0z(AbstractC26821Bsj abstractC26821Bsj) {
        return (C29138Ct5) abstractC26821Bsj.A01.getValue();
    }

    public static List A1C(Object obj) {
        List list = (List) obj;
        C14360o3.A0B(list, 0);
        return list;
    }

    public static InterfaceC16820sZ A1D(C117505Tk c117505Tk, Object obj, boolean z) {
        C117505Tk.A0L(c117505Tk, z);
        return (InterfaceC16820sZ) ((C0YS) obj);
    }

    public static InterfaceC16660sJ A1E(C117505Tk c117505Tk, Object obj, boolean z) {
        C117505Tk.A0L(c117505Tk, z);
        return (InterfaceC16660sJ) ((C0YS) obj);
    }

    public static C50154MDh A1F(C5Tl c5Tl, Object obj, int i) {
        C50154MDh c50154MDh = new C50154MDh(obj, i);
        c5Tl.FBy(c50154MDh);
        return c50154MDh;
    }

    public static void A1G(Activity activity, Bundle bundle, AbstractC12990ll abstractC12990ll, Class cls, String str) {
        new C6XJ(activity, bundle, abstractC12990ll, cls, str).A0C(activity);
    }

    public static void A1H(PorterDuff.Mode mode, Drawable drawable, int i) {
        drawable.setColorFilter(new PorterDuffColorFilter(i, mode));
    }

    public static void A1J(C5Tl c5Tl, C117505Tk c117505Tk, Object obj, Object obj2, boolean z) {
        C117505Tk.A0L(c117505Tk, z);
        C5UX.A03(c5Tl, obj2, (InterfaceC16660sJ) obj);
    }

    public static void A1K(C5Tl c5Tl, C117505Tk c117505Tk, Object obj, Object obj2, boolean z) {
        C117505Tk.A0L(c117505Tk, z);
        C5UX.A04(c5Tl, obj2, (InterfaceC16620sF) obj);
    }

    public static void A1L(AnonymousClass586 anonymousClass586, AnonymousClass588 anonymousClass588, long j) {
        anonymousClass586.A01.EKS();
        anonymousClass588.EeS(j);
    }

    public static void A1O(Object obj) {
        C117505Tk.A0L((C117505Tk) obj, false);
    }

    public static void A1P(Object obj) {
        InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) obj;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }

    public static void A1Q(Object obj, AbstractCollection abstractCollection, int i) {
        if ((i ^ 1) != 0) {
            abstractCollection.add(obj);
        }
    }

    public static boolean A1T(int i) {
        if ((i & 112) != 32) {
            return false;
        }
        return true;
    }

    public static boolean A1W(Object obj) {
        C117505Tk.A0L((C117505Tk) obj, false);
        return false;
    }

    public static boolean A1X(Object obj) {
        return !((List) obj).isEmpty();
    }

    public static float A00(InterfaceC74963Ym interfaceC74963Ym) {
        return ((C119145aW) interfaceC74963Ym.getValue()).A00;
    }

    public static int A04(Context context, C2YS c2ys) {
        return AbstractC77623dm.A03(c2ys, AbstractC53242c7.A0A(context));
    }

    public static int A05(Context context, C2YS c2ys) {
        return c2ys.BoZ().A02(AbstractC53242c7.A07(context));
    }

    public static int A06(Context context, C2YS c2ys, int i) {
        return AbstractC77623dm.A03(c2ys, AbstractC53242c7.A0H(context, i));
    }

    public static int A07(C76223bS c76223bS, long j) {
        return C2Z3.A00(c76223bS.BoZ(), j);
    }

    public static int A08(C2Z0 c2z0, long j) {
        return C2Z3.A00(c2z0.BoZ(), j);
    }

    public static int A09(C2YS c2ys, int i) {
        return c2ys.BoZ().A02(i);
    }

    public static int A0A(C2YS c2ys, long j) {
        return C2Z3.A00(c2ys.BoZ(), j);
    }

    public static int A0F(String str, int i) {
        return (str.hashCode() + i) * 31;
    }

    public static long A0G(InterfaceC74953Yl interfaceC74953Yl) {
        return ((C5C3) interfaceC74953Yl.getValue()).A00;
    }

    public static long A0I(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, long j) {
        return Double.doubleToRawLongBits(C18U.A00(c06090Tz, abstractC12990ll, j));
    }

    public static Activity A0J(C2Z1 c2z1) {
        return AbstractC13330mJ.A00(AbstractC77363dM.A00(c2z1));
    }

    public static Resources A0M(View view) {
        return view.getContext().getResources();
    }

    public static Drawable A0N(C2YS c2ys, int i) {
        return AbstractC77623dm.A0E(c2ys, i).mutate();
    }

    public static LayoutInflater A0P(View view) {
        return LayoutInflater.from(view.getContext());
    }

    public static InterfaceC74953Yl A0U(C5Tl c5Tl, C5UQ c5uq) {
        return C5WZ.A00(c5Tl, c5Tl.AJX(c5uq));
    }

    public static Modifier A0X(Modifier modifier, float f) {
        return C6L2.A01(modifier, C5WF.A01(f));
    }

    public static Modifier A0Y(Modifier modifier, float f, float f2, long j) {
        return C6L7.A03(modifier, C5WF.A01(f), f2, j);
    }

    public static Modifier A0Z(Modifier modifier, float f, long j) {
        return C6L3.A01(modifier, C5WF.A01(f), j);
    }

    public static C2XI A0j(C76223bS c76223bS, float f) {
        return AbstractC80383iT.A00(c76223bS, Float.valueOf(f));
    }

    public static InterfaceC103384lE A0t(List list, int i) {
        return C1344465q.A00(list.get(i));
    }

    public static NotesPogThoughtBubbleUiState A0v(InterfaceC09390do interfaceC09390do) {
        return ((ContentNotesImmersiveSelfNoteContent) interfaceC09390do.getValue()).A01;
    }

    public static C189478aR A0x(Activity activity, C3DO c3do) {
        return F86.A00(c3do.A00(activity));
    }

    public static Integer A12(Object obj) {
        return Integer.valueOf(obj.hashCode());
    }

    public static Long A13(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    public static Object A14(C5Y1 c5y1, C5Y6 c5y6, Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return c5y1.A03(c5y6, obj, c5y1.A02(), interfaceC23621Ds);
    }

    public static Object A15(BVY bvy, List list) {
        return list.get(bvy.A03());
    }

    public static String A16(C5Tl c5Tl, Number number) {
        return C5YD.A00(c5Tl, number.intValue());
    }

    public static String A17(C5Tl c5Tl, Object obj, int i) {
        return C5YD.A01(c5Tl, new Object[]{obj}, i);
    }

    public static String A19(User user) {
        return user.Bhu().getUrl();
    }

    public static String A1A(CharSequence charSequence) {
        return AbstractC001900j.A0B(charSequence).toString();
    }

    public static String A1B(Object obj) {
        return AbstractC75733ae.A00(obj.getClass());
    }

    public static void A1N(InterfaceC89793zL interfaceC89793zL, C89813zN c89813zN, InterfaceC79483gv interfaceC79483gv, float f) {
        c89813zN.A03(interfaceC79483gv);
        c89813zN.A01(f);
        c89813zN.A02 = interfaceC89793zL;
    }

    public static Object[] A1Y(int i) {
        return new Object[]{Integer.valueOf(i)};
    }

    public static Object[] A1Z(Object obj, int i) {
        return new Object[]{obj, Integer.valueOf(i)};
    }

    public static Object[] A1a(Object obj, boolean z) {
        return new Object[]{obj, Boolean.valueOf(z)};
    }

    public static Object[] A1b(boolean z) {
        return new Object[]{Boolean.valueOf(z)};
    }

    public static int A02(long j) {
        return (int) (j & 4294967295L);
    }
}
