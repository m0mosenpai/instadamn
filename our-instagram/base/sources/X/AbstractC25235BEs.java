package X;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Parcel;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.CoroutineLiveData;
import com.facebook.R;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeParcelable;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creator.achievements.modules.models.Badge;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BEs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25235BEs {
    public static float A00(C102884kP c102884kP, float f, int i) {
        return AbstractC68291VLd.A00(c102884kP.A0L(i), 0.0f, f);
    }

    public static int A05(C5Tl c5Tl, C117505Tk c117505Tk, Object obj, Object obj2) {
        C117505Tk.A0L(c117505Tk, false);
        C5UX.A04(c5Tl, obj2, (InterfaceC16620sF) obj);
        return 6;
    }

    public static int A07(String str) {
        C14360o3.A0B(str, 0);
        return str.hashCode();
    }

    public static C117505Tk A0E(C5Tl c5Tl, Object obj, Object obj2) {
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C117505Tk.A0L(c117505Tk, false);
        C5UX.A04(c5Tl, obj2, (InterfaceC16620sF) obj);
        return c117505Tk;
    }

    public static Modifier A0H(C5Tl c5Tl, C117505Tk c117505Tk, Modifier modifier, Object obj) {
        C117505Tk.A0L(c117505Tk, false);
        return AbstractC118635Yc.A04(c5Tl, modifier, (InterfaceC16820sZ) obj);
    }

    public static Modifier A0I(C5Tl c5Tl, C117505Tk c117505Tk, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ) {
        C117505Tk.A0L(c117505Tk, false);
        return AbstractC118635Yc.A04(c5Tl, modifier, interfaceC16820sZ);
    }

    public static AbstractC52922bZ A0T(AbstractC52922bZ abstractC52922bZ, Object obj) {
        C117505Tk c117505Tk = (C117505Tk) obj;
        C117505Tk.A0L(c117505Tk, false);
        C117505Tk.A0L(c117505Tk, false);
        return abstractC52922bZ;
    }

    public static C141796aw A0X(AbstractC52922bZ abstractC52922bZ, C12W c12w, C19L c19l, int i) {
        AbstractC23641Du.A05(c12w, new MCD(abstractC52922bZ, null, i), c19l);
        return AbstractC141776au.A00(abstractC52922bZ);
    }

    public static C1DY A0b(C1DV c1dv) {
        return new C1DY(c1dv, 6, false);
    }

    public static BKA A0h(Object obj, AbstractC06830Ya abstractC06830Ya) {
        C14360o3.A0B(obj, 0);
        return (BKA) abstractC06830Ya.receiver;
    }

    public static Object A0m(C1Dk c1Dk, C40701ud c40701ud, Object obj, MAF maf) {
        maf.A01 = obj;
        maf.A00 = 1;
        return c40701ud.A04(c1Dk, maf);
    }

    public static String A0o(int i) {
        return F1C.A00(i * 1000);
    }

    public static MBo A0u(C5Tl c5Tl, Object obj, int i) {
        MBo mBo = new MBo(obj, null, i);
        c5Tl.FBy(mBo);
        return mBo;
    }

    public static MBr A0v(C5Tl c5Tl, Object obj, Object obj2, int i) {
        MBr mBr = new MBr(obj, obj2, (InterfaceC23621Ds) null, i);
        c5Tl.FBy(mBr);
        return mBr;
    }

    public static void A1E(Parcel parcel, TreeJNI treeJNI) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, treeJNI);
    }

    public static void A1H(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
    }

    public static boolean A1S(int i) {
        return (i & 14) == 4;
    }

    public static boolean A1T(int i) {
        return (i & 7168) == 2048;
    }

    public static boolean A1U(int i, int i2) {
        return i == i2;
    }

    public static boolean A1b(Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return AbstractC78713fd.A03(obj2, obj);
    }

    public static float A01(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        return floatValue;
    }

    public static int A03(long j) {
        return ((int) (j ^ (j >>> 32))) * 31;
    }

    public static int A06(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static Resources A0B(C5Tl c5Tl) {
        return ((Context) c5Tl.AJX(AndroidCompositionLocals_androidKt.A01)).getResources();
    }

    public static TextView A0C(Object obj) {
        TextView textView = (TextView) obj;
        C14360o3.A0B(textView, 1);
        return textView;
    }

    public static Modifier A0F(C5XO c5xo, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ) {
        return C5XR.A03(new C5XM(400.0f, 400.0f), c5xo, modifier, interfaceC16820sZ);
    }

    public static Modifier A0G(C6GM c6gm, Modifier modifier) {
        return c6gm.AB6(C118195Wf.A00, modifier);
    }

    public static InterfaceC1127857k A0L(InterfaceC118275Wp interfaceC118275Wp, C5Tl c5Tl) {
        return AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, C118195Wf.A05, 6);
    }

    public static InterfaceC1127857k A0M(C5Tl c5Tl) {
        return AbstractC119595bH.A01(AbstractC118255Wn.A02, c5Tl, C118195Wf.A00);
    }

    public static InterfaceC1127857k A0N(C5Tl c5Tl) {
        return AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
    }

    public static InterfaceC1127857k A0O(C5Tl c5Tl) {
        return AbstractC119595bH.A01(AbstractC118255Wn.A02, c5Tl, C118195Wf.A00);
    }

    public static InterfaceC1127857k A0P(C5Tl c5Tl) {
        return AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A00, 48);
    }

    public static C018307d A0U(Object obj) {
        return ((Fragment) obj).requireActivity().getViewModelStore();
    }

    public static C2YJ A0Z(Object obj) {
        C2YJ c2yj = (C2YJ) obj;
        C14360o3.A0B(c2yj, 0);
        return c2yj;
    }

    public static C25267BGf A0c(C5Tl c5Tl, boolean z) {
        return C6GA.A00.A03(c5Tl, 3, z, z);
    }

    public static C2DB A0d(C5Tl c5Tl, String str) {
        return AbstractC43541zP.A00(c5Tl, new SimpleImageUrl(str));
    }

    public static IllegalStateException A0i() {
        return new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
    }

    public static String A0q(String str, int i) {
        return AnonymousClass001.A0I(str, ')', i);
    }

    public static String A0r(String str, String str2) {
        return AnonymousClass001.A0S(str, str2, ')');
    }

    public static InterfaceC09390do A0s(Object obj, Object obj2, String str, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C50253MHi(obj, obj2, str, i));
    }

    public static C17050sx A0t(Object obj, int i) {
        return AbstractC09440dt.A01(new C57518Pfs(obj, i));
    }

    public static InterfaceC16620sF A0w(C117505Tk c117505Tk, Object obj, boolean z) {
        C117505Tk.A0L(c117505Tk, z);
        return (InterfaceC16620sF) ((C0YS) obj);
    }

    public static C0YZ A0x() {
        return new C0YZ(C25878Bcd.class);
    }

    public static C0YZ A0y() {
        return new C0YZ(C25879Bce.class);
    }

    public static D5Z A0z(C5Tl c5Tl, Object obj, int i) {
        D5Z d5z = new D5Z(obj, i);
        c5Tl.FBy(d5z);
        return d5z;
    }

    public static D5Z A10(C5Tl c5Tl, Object obj, int i) {
        D5Z d5z = new D5Z(obj, i);
        c5Tl.FBy(d5z);
        return d5z;
    }

    public static C50355MLh A11(C5Tl c5Tl, Object obj, int i) {
        C50355MLh c50355MLh = new C50355MLh(obj, i);
        c5Tl.FBy(c50355MLh);
        return c50355MLh;
    }

    public static C50154MDh A12(C5Tl c5Tl, Object obj, int i) {
        C50154MDh c50154MDh = new C50154MDh(obj, i);
        c5Tl.FBy(c50154MDh);
        return c50154MDh;
    }

    public static C50356MLi A13(C5Tl c5Tl, Object obj, int i) {
        C50356MLi c50356MLi = new C50356MLi(obj, i);
        c5Tl.FBy(c50356MLi);
        return c50356MLi;
    }

    public static C50262MHr A14(C5Tl c5Tl, Object obj, int i) {
        C50262MHr c50262MHr = new C50262MHr(obj, i);
        c5Tl.FBy(c50262MHr);
        return c50262MHr;
    }

    public static B8S A15(C5Tl c5Tl, Object obj, int i) {
        B8S b8s = new B8S(obj, i);
        c5Tl.FBy(b8s);
        return b8s;
    }

    public static C50166MDt A16(C5Tl c5Tl, Object obj, int i) {
        C50166MDt c50166MDt = new C50166MDt(obj, i);
        c5Tl.FBy(c50166MDt);
        return c50166MDt;
    }

    public static C57749Pjc A17(C5Tl c5Tl, Object obj, int i) {
        C57749Pjc c57749Pjc = new C57749Pjc(obj, i);
        c5Tl.FBy(c57749Pjc);
        return c57749Pjc;
    }

    public static C57255Pbd A18(C5Tl c5Tl, Object obj, Object obj2, int i) {
        C57255Pbd c57255Pbd = new C57255Pbd(i, obj, obj2);
        c5Tl.FBy(c57255Pbd);
        return c57255Pbd;
    }

    public static C57536PgA A19(C5Tl c5Tl, Object obj, Object obj2, int i) {
        C57536PgA c57536PgA = new C57536PgA(i, obj, obj2);
        c5Tl.FBy(c57536PgA);
        return c57536PgA;
    }

    public static void A1C(Context context, View.OnClickListener onClickListener, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new GHY(context, onClickListener, i));
    }

    public static void A1G(InterfaceC74953Yl interfaceC74953Yl, long j) {
        interfaceC74953Yl.Egh(new C5C2(j));
    }

    public static void A1I(InterfaceC11380iw interfaceC11380iw, IgImageView igImageView, String str) {
        igImageView.setUrl(new SimpleImageUrl(str), interfaceC11380iw);
    }

    public static void A1J(Object obj, Object obj2, Object obj3, MAL mal, int i) {
        mal.A01 = obj;
        mal.A02 = obj2;
        mal.A03 = obj3;
        mal.A00 = i;
    }

    public static boolean A1X(C5Tl c5Tl, int i, int i2) {
        c5Tl.Eno(i);
        if ((i2 & 112) == 32) {
            return true;
        }
        return false;
    }

    public static int A02(float f) {
        return Float.floatToIntBits(f) * 31;
    }

    public static int A04(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height);
    }

    public static long A08(InterfaceC74953Yl interfaceC74953Yl) {
        C119365at c119365at = (C119365at) interfaceC74953Yl.getValue();
        C14360o3.A0A(c119365at);
        return c119365at.A00;
    }

    public static long A09(InterfaceC74953Yl interfaceC74953Yl) {
        return ((C119055aN) interfaceC74953Yl.getValue()).A00;
    }

    public static long A0A(InterfaceC31128DmB interfaceC31128DmB, Integer num) {
        return Double.doubleToRawLongBits(interfaceC31128DmB.EKF(num));
    }

    public static C28837Co7 A0D(InterfaceC74953Yl interfaceC74953Yl) {
        return (C28837Co7) ((InterfaceC30774DgB) interfaceC74953Yl.getValue());
    }

    public static Modifier A0J(Modifier modifier) {
        return C6L2.A01(modifier, C5WF.A00());
    }

    public static InterfaceC1131659e A0K(List list, int i) {
        return (InterfaceC1131659e) list.get(i);
    }

    public static C127015of A0Q(C5C8 c5c8, String str, int i) {
        return (C127015of) AbstractC001800i.A0J(c5c8.A06(str, i, i));
    }

    public static CoroutineLiveData A0R(AbstractC52922bZ abstractC52922bZ, InterfaceC19390xP interfaceC19390xP) {
        return AbstractC58232lf.A00(AbstractC141776au.A00(abstractC52922bZ).A00, interfaceC19390xP);
    }

    public static C57312k6 A0S(Fragment fragment) {
        return C07Y.A00(fragment.getViewLifecycleOwner());
    }

    public static InterfaceC018407e A0V(C5Tl c5Tl) {
        c5Tl.Enp(1729797275);
        return CZV.A00(c5Tl);
    }

    public static C141796aw A0W(AbstractC52922bZ abstractC52922bZ, C12W c12w, InterfaceC16620sF interfaceC16620sF, C19L c19l) {
        AbstractC23641Du.A05(c12w, interfaceC16620sF, c19l);
        return AbstractC141776au.A00(abstractC52922bZ);
    }

    public static C51759Mti A0Y(InterfaceC74963Ym interfaceC74963Ym) {
        return (C51759Mti) ((C51755Mte) interfaceC74963Ym.getValue()).A00;
    }

    public static C26083BgC A0a(C0UO c0uo) {
        return (C26083BgC) c0uo.getValue();
    }

    public static C26075Bg4 A0e(InterfaceC74963Ym interfaceC74963Ym) {
        return (C26075Bg4) ((C51759Mti) interfaceC74963Ym.getValue()).A00;
    }

    public static C3NX A0f(boolean z) {
        return new C3NX(Boolean.valueOf(z));
    }

    public static CWJ A0g(C05A c05a) {
        return (CWJ) c05a.getValue();
    }

    public static Integer A0j(Integer num, int i) {
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.compareTo(num) > 0) {
            return valueOf;
        }
        return num;
    }

    public static Object A0k(C5Tl c5Tl, int i) {
        c5Tl.Enp(i);
        return c5Tl.EEc();
    }

    public static Object A0l(C5Tl c5Tl, C0UO c0uo, int i) {
        return C6IB.A02(c5Tl, c0uo, i).getValue();
    }

    public static Object A0n(EnumC09460dv enumC09460dv, InterfaceC16820sZ interfaceC16820sZ) {
        return AbstractC09440dt.A00(enumC09460dv, interfaceC16820sZ).getValue();
    }

    public static String A0p(C5Tl c5Tl, Object obj, int i) {
        return AbstractC136736Hc.A01(c5Tl, new Object[]{obj}, i);
    }

    public static C008002u A1A(boolean z) {
        return new C008002u(Boolean.valueOf(z));
    }

    public static void A1B(long j, StringBuilder sb) {
        sb.append((Object) C119365at.A08(j));
    }

    public static void A1D(Canvas canvas, InterfaceC16820sZ interfaceC16820sZ) {
        canvas.save();
        interfaceC16820sZ.invoke();
        canvas.restore();
    }

    public static void A1F(C5Tl c5Tl, C118125Vw c118125Vw, String str) {
        C5WR.A0x(c5Tl, c118125Vw, str, C5XL.A00(c5Tl).A0t);
    }

    public static void A1K(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", imageUrl=");
    }

    public static void A1L(StringBuilder sb, String str) {
        sb.append(str);
        sb.append((Object) null);
    }

    public static void A1M(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(false);
    }

    public static void A1N(StringBuilder sb, String str) {
        sb.append(str);
        sb.append((String) null);
    }

    public static void A1O(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (next instanceof Badge.ChallengeBadge) {
            abstractCollection.add(next);
        }
    }

    public static void A1P(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (next instanceof Badge.AchievementBadge) {
            abstractCollection.add(next);
        }
    }

    public static void A1Q(InterfaceC09390do interfaceC09390do) {
        ((Dialog) interfaceC09390do.getValue()).dismiss();
    }

    public static void A1R(Object[] objArr, int i, int i2) {
        objArr[i2] = Integer.valueOf(i);
    }

    public static boolean A1V(C5Tl c5Tl, float f, float f2, boolean z) {
        return z | c5Tl.AH1(f) | c5Tl.AH1(f2);
    }

    public static boolean A1W(C5Tl c5Tl, int i) {
        c5Tl.Enr(i);
        return C0fH.A02();
    }

    public static boolean A1Y(C5Tl c5Tl, Modifier modifier, Object obj, int i) {
        C6L8.A03(c5Tl, modifier, C5UA.A01(c5Tl, obj, i));
        return C0fH.A02();
    }

    public static boolean A1Z(C5Tl c5Tl, Object obj, int i) {
        C6L8.A04(c5Tl, C5UA.A01(c5Tl, obj, i));
        return C0fH.A02();
    }

    public static boolean A1a(C5Tl c5Tl, Object obj, int i, long j) {
        C6L8.A05(c5Tl, C5UA.A01(c5Tl, obj, i), j);
        return C0fH.A02();
    }
}
