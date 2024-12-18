package X;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollElement;
import androidx.compose.ui.layout.OnGloballyPositionedElement;
import androidx.compose.ui.platform.TestTagElement;
import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BEm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25229BEm {
    public static int A06(int i, int i2, int i3) {
        return i | i2 | (3670016 & i3);
    }

    public static int A09(List list) {
        C14360o3.A0B(list, 0);
        return list.size() - 1;
    }

    public static long A0K(int i) {
        return i | 9221401712017801216L;
    }

    public static C1333560c A0P(float f) {
        return new C1333560c(0.0f, 0.0f, 0.0f, f);
    }

    public static C113775Bp A0Q(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ) {
        C113775Bp c113775Bp = new C113775Bp(null, interfaceC16820sZ);
        c5Tl.FBy(c113775Bp);
        return c113775Bp;
    }

    public static Modifier A0T(C117505Tk c117505Tk, Modifier modifier, Object obj) {
        C117505Tk.A0L(c117505Tk, false);
        return C5XR.A06(modifier, (InterfaceC16820sZ) obj);
    }

    public static Object A0o(Object obj, AbstractC06830Ya abstractC06830Ya) {
        C14360o3.A0B(obj, 0);
        return abstractC06830Ya.receiver;
    }

    public static void A13(Paint paint) {
        C14360o3.A0B(paint, 0);
        paint.setUnderlineText(false);
    }

    public static void A16(C5Tl c5Tl, Modifier modifier, long j) {
        C5XX.A02(c5Tl, C6L3.A01(modifier, C5AF.A00, j), 0);
    }

    public static void A17(C5Tl c5Tl, Modifier modifier, C2DC c2dc, String str) {
        C5YS.A09(c5Tl, modifier, c2dc, str, C5XL.A00(c5Tl).A0s);
    }

    public static void A1E(C77723dw c77723dw) {
        c77723dw.A0c(false);
        c77723dw.A0Z(false);
        c77723dw.A0a(true);
    }

    public static void A1F(C77723dw c77723dw) {
        c77723dw.A0c(true);
        c77723dw.A0Z(false);
        c77723dw.A0a(true);
    }

    public static boolean A1S(C5Tl c5Tl, int i, int i2, int i3) {
        c5Tl.Eno(i);
        return i2 == i3;
    }

    public static boolean A1T(C5Tl c5Tl, C117505Tk c117505Tk, Object obj, InterfaceC16620sF interfaceC16620sF) {
        C117505Tk.A0L(c117505Tk, false);
        C5UX.A04(c5Tl, obj, interfaceC16620sF);
        return false;
    }

    public static boolean A1Y(Object obj) {
        C14360o3.A0B(obj, 1);
        return false;
    }

    public static boolean A1Z(Object obj) {
        return obj == null;
    }

    public static boolean A1a(Object obj, Object obj2) {
        return obj != obj2;
    }

    public static int A01(int i) {
        return i != 0 ? 536870912 : 268435456;
    }

    public static int A02(int i) {
        return i != 0 ? Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP : Constants.LOAD_RESULT_PGO_ATTEMPTED;
    }

    public static int A03(int i) {
        return i != 0 ? 67108864 : 33554432;
    }

    public static int A04(int i) {
        if (i != 0) {
            return Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        }
        return 8192;
    }

    public static int A05(int i, int i2) {
        return i2 | (i & 896) | (i & 7168);
    }

    public static int A0A(C09530e4 c09530e4) {
        return ((Number) c09530e4.A01).intValue();
    }

    public static long A0B() {
        return Double.doubleToRawLongBits(6.0d);
    }

    public static long A0C() {
        return Double.doubleToRawLongBits(42.0d);
    }

    public static long A0D() {
        return Double.doubleToRawLongBits(0.0d);
    }

    public static long A0E() {
        return Double.doubleToRawLongBits(10.0d);
    }

    public static long A0F() {
        return Double.doubleToRawLongBits(16.0d);
    }

    public static long A0G() {
        return Double.doubleToRawLongBits(3.0d);
    }

    public static long A0H() {
        return Double.doubleToRawLongBits(28.0d);
    }

    public static long A0I() {
        return Double.doubleToRawLongBits(48.0d);
    }

    public static long A0J() {
        return Double.doubleToRawLongBits(8.0d);
    }

    public static Context A0N(Object obj) {
        Context context = ((C76223bS) obj).A05.A0C;
        C14360o3.A07(context);
        return context;
    }

    public static C117685Ud A0S(C5UP c5up, long j) {
        return c5up.A02(new C1132359l(j));
    }

    public static Modifier A0U(C117505Tk c117505Tk, Modifier modifier, Object obj, Object obj2, boolean z) {
        C117505Tk.A0L(c117505Tk, z);
        return C6KX.A00(modifier, obj2, (InterfaceC16620sF) obj);
    }

    public static Modifier A0V(Modifier modifier, C5E5 c5e5, NestedScrollDispatcher nestedScrollDispatcher) {
        return modifier.Eq3(new NestedScrollElement(c5e5, nestedScrollDispatcher));
    }

    public static Modifier A0W(Modifier modifier, String str) {
        return modifier.Eq3(new TestTagElement(str));
    }

    public static Modifier A0X(Modifier modifier, InterfaceC16660sJ interfaceC16660sJ) {
        return modifier.Eq3(new OnGloballyPositionedElement(interfaceC16660sJ));
    }

    public static InterfaceC1127857k A0Y(C5Tl c5Tl, int i) {
        return AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, i);
    }

    public static AbstractC12990ll A0d(C5Tl c5Tl) {
        return (AbstractC12990ll) c5Tl.AJX(AbstractC117935Vd.A00);
    }

    public static UserSession A0e(C5Tl c5Tl) {
        return (UserSession) c5Tl.AJX(AbstractC117935Vd.A00);
    }

    public static C25869BcQ A0g(C26749BrW c26749BrW) {
        return (C25869BcQ) c26749BrW.A06.getValue();
    }

    public static C75113Zb A0i(Object obj) {
        C75113Zb c75113Zb = (C75113Zb) obj;
        C14360o3.A0B(c75113Zb, 0);
        return c75113Zb;
    }

    public static C146106i8 A0j() {
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A05();
        return c146106i8;
    }

    public static InterfaceC09390do A0p(Object obj, int i) {
        return C1XM.A00(new C57240PbO(obj, i));
    }

    public static C25344BJn A0s(C5Tl c5Tl, Object obj, int i) {
        C25344BJn c25344BJn = new C25344BJn(obj, i);
        c5Tl.FBy(c25344BJn);
        return c25344BJn;
    }

    public static BIE A0t(C5Tl c5Tl, Object obj, int i) {
        BIE bie = new BIE(obj, i);
        c5Tl.FBy(bie);
        return bie;
    }

    public static D5Y A0u(C5Tl c5Tl, Object obj, int i) {
        D5Y d5y = new D5Y(obj, i);
        c5Tl.FBy(d5y);
        return d5y;
    }

    public static C57752Pjf A0v(C5Tl c5Tl, Object obj, int i) {
        C57752Pjf c57752Pjf = new C57752Pjf(obj, i);
        c5Tl.FBy(c57752Pjf);
        return c57752Pjf;
    }

    public static C50262MHr A0w(C5Tl c5Tl, Object obj, int i) {
        C50262MHr c50262MHr = new C50262MHr(obj, i);
        c5Tl.FBy(c50262MHr);
        return c50262MHr;
    }

    public static C50168MDv A0x(C5Tl c5Tl, Object obj, int i, boolean z) {
        C50168MDv c50168MDv = new C50168MDv(i, obj, z);
        c5Tl.FBy(c50168MDv);
        return c50168MDv;
    }

    public static C50369MLw A0y(C5Tl c5Tl, Object obj, Object obj2, int i) {
        C50369MLw c50369MLw = new C50369MLw(i, obj, obj2);
        c5Tl.FBy(c50369MLw);
        return c50369MLw;
    }

    public static C57257Pbf A0z(C5Tl c5Tl, Object obj, Object obj2, int i) {
        C57257Pbf c57257Pbf = new C57257Pbf(i, obj, obj2);
        c5Tl.FBy(c57257Pbf);
        return c57257Pbf;
    }

    public static C57261Pbj A10(C5Tl c5Tl, Object obj, Object obj2, Object obj3, int i) {
        C57261Pbj c57261Pbj = new C57261Pbj(i, obj, obj2, obj3);
        c5Tl.FBy(c57261Pbj);
        return c57261Pbj;
    }

    public static MI7 A11(C5Tl c5Tl, Object obj, Object obj2, String str, int i) {
        MI7 mi7 = new MI7(obj, obj2, str, i);
        c5Tl.FBy(mi7);
        return mi7;
    }

    public static void A1B(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("ranking_info_token", str);
        interfaceC02590Ai.Cht();
    }

    public static void A1H(MWD mwd, Long l, String str, String str2) {
        MWD.A00(mwd, l, str, str2, "click").Cht();
    }

    public static void A1R(AnonymousClass195 anonymousClass195) {
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
    }

    public static boolean A1W(C51762Yz c51762Yz) {
        return ((Boolean) c51762Yz.A03).booleanValue();
    }

    public static boolean A1X(Object obj) {
        ((Number) obj).intValue();
        return C0fH.A02();
    }

    public static C09530e4[] A1b(Object obj, Object obj2, C09530e4 c09530e4) {
        return new C09530e4[]{c09530e4, new C09530e4(obj, obj2)};
    }

    public static float A00(InterfaceC1128857w interfaceC1128857w) {
        return C5YC.A00(interfaceC1128857w.Bxc());
    }

    public static int A07(Context context, C2YS c2ys) {
        return AbstractC77623dm.A03(c2ys, AbstractC53242c7.A09(context));
    }

    public static int A08(C58Z c58z) {
        return c58z.A0G().ordinal();
    }

    public static long A0L(Number number) {
        return Double.doubleToRawLongBits(number.intValue());
    }

    public static Context A0M(C2Z1 c2z1) {
        Context context = c2z1.ArD().A0C;
        C14360o3.A07(context);
        return context;
    }

    public static Resources A0O(C2Z1 c2z1) {
        return AbstractC77363dM.A00(c2z1).getResources();
    }

    public static ParcelableSnapshotMutableState A0R(Object obj) {
        return new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), obj);
    }

    public static InterfaceC119205ac A0Z(C59Z c59z, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        return c59z.Cgx(AbstractC06930Yk.A0E(), interfaceC16660sJ, i, i2);
    }

    public static C57312k6 A0a(C07X c07x) {
        return AbstractC57302k5.A00(c07x.getLifecycle());
    }

    public static C2XH A0b(C2Z1 c2z1) {
        C2XH c2xh = c2z1.ArD().A0D;
        C14360o3.A07(c2xh);
        return c2xh;
    }

    public static C2YP A0c(C77993eR c77993eR, InterfaceC50822Vd interfaceC50822Vd, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        return new C2YP(interfaceC50822Vd, interfaceC16820sZ, interfaceC16660sJ, c77993eR.A01());
    }

    public static ContentNoteMetadata A0f(InterfaceC09390do interfaceC09390do) {
        return ((ContentNotesImmersiveReplyContent) interfaceC09390do.getValue()).A02;
    }

    public static C38321qM A0h(UserSession userSession, String str) {
        return C1DW.A00(userSession).A02(str);
    }

    public static Float A0k(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, long j) {
        return Float.valueOf((float) C18U.A00(c06090Tz, abstractC12990ll, j));
    }

    public static IndexOutOfBoundsException A0l(String str, String str2, int i, int i2) {
        return new IndexOutOfBoundsException(AnonymousClass001.A02(i, i2, str, str2));
    }

    public static Integer A0m(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, long j) {
        return Integer.valueOf((int) C18U.A01(c06090Tz, abstractC12990ll, j));
    }

    public static Long A0n(Number number) {
        return Long.valueOf(number.intValue());
    }

    public static InterfaceC16620sF A0q(C5Tl c5Tl, Object obj, Object obj2, InterfaceC16620sF interfaceC16620sF) {
        C5XJ.A00(c5Tl, obj, interfaceC16620sF);
        InterfaceC16620sF interfaceC16620sF2 = C5X8.A05;
        C5XJ.A00(c5Tl, obj2, interfaceC16620sF2);
        return interfaceC16620sF2;
    }

    public static C0YZ A0r(Object obj) {
        return new C0YZ(obj.getClass());
    }

    public static C24721Ip A12() {
        return new C24721Ip(Integer.MAX_VALUE);
    }

    public static void A14(Typeface typeface, C77723dw c77723dw, int i, int i2) {
        c77723dw.A0S(i);
        c77723dw.A0T(typeface);
        c77723dw.A0P(i2);
    }

    public static void A15(Parcel parcel, Iterator it, int i) {
        parcel.writeParcelable((Parcelable) it.next(), i);
    }

    public static void A18(Fragment fragment, C140966Yy c140966Yy) {
        c140966Yy.A0D(fragment);
        c140966Yy.A08();
        c140966Yy.A04();
    }

    public static void A19(InterfaceC02590Ai interfaceC02590Ai, int i) {
        interfaceC02590Ai.A8p("media_index", Integer.valueOf(i));
    }

    public static void A1A(InterfaceC02590Ai interfaceC02590Ai, InterfaceC11380iw interfaceC11380iw) {
        interfaceC02590Ai.AAP("containermodule", interfaceC11380iw.getModuleName());
    }

    public static void A1C(C25531Mh c25531Mh, Long l, String str) {
        c25531Mh.A0i(l);
        c25531Mh.A0u(str);
        c25531Mh.Cht();
    }

    public static void A1D(C89813zN c89813zN, InterfaceC79483gv interfaceC79483gv, float f) {
        c89813zN.A03(interfaceC79483gv);
        c89813zN.A01(f);
        c89813zN.A02(f);
    }

    public static void A1G(InterfaceC56362iU interfaceC56362iU, int i) {
        interfaceC56362iU.Efu(i);
        interfaceC56362iU.EkS(true);
    }

    public static void A1I(Object obj, int i, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 6);
    }

    public static void A1J(Object obj, int i, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 10);
    }

    public static void A1K(Object obj, int i, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 11);
    }

    public static void A1L(Object obj, int i, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 12);
    }

    public static void A1M(Object obj, int i, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 13);
    }

    public static void A1N(Object obj, int i, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 14);
    }

    public static void A1O(Object obj, int i, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 15);
    }

    public static void A1P(Object obj, int i, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 16);
    }

    public static void A1Q(InterfaceC09390do interfaceC09390do) {
        C0fJ.A00((Dialog) interfaceC09390do.getValue());
    }

    public static boolean A1U(InterfaceC74953Yl interfaceC74953Yl, Object obj) {
        return C14360o3.A0K(interfaceC74953Yl.getValue(), obj);
    }

    public static boolean A1V(InterfaceC74953Yl interfaceC74953Yl, Object obj) {
        return C14360o3.A0K(obj, interfaceC74953Yl.getValue());
    }
}
