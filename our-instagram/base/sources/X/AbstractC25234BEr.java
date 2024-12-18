package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import com.facebook.R;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.showreel.composition.ui.reels.IgReelsShowreelCompositionView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.BEr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25234BEr {
    public static int A01(int i, int i2, int i3) {
        return i | i2 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3);
    }

    public static C51722Yv A0B(C51722Yv c51722Yv, InterfaceC51732Yw interfaceC51732Yw, float f) {
        return new C51722Yv(new C51722Yv(c51722Yv, interfaceC51732Yw), new C9CT(C05F.A0C, f, 1));
    }

    public static C51722Yv A0J(C51722Yv c51722Yv, C2YS c2ys, Integer num, Integer num2) {
        return new C51722Yv(new C51722Yv(c51722Yv, new C9CU(num, 0, AbstractC77623dm.A07(c2ys))), new C9CU(num2, 0, AbstractC77623dm.A07(c2ys)));
    }

    public static C2YU A0R(View view, long j) {
        view.measure(AbstractC78603fS.A01(j), AbstractC78603fS.A00(j));
        return new C2YU(AbstractC78673fZ.A00(C78613fT.A01(j), Math.min(view.getMeasuredHeight(), C78613fT.A00(j))), null);
    }

    public static C84793qT A0S(C2YS c2ys) {
        C167847ee c167847ee = new C167847ee();
        int A02 = c2ys.BoZ().A02(R.color.fds_white_alpha60);
        C84793qT c84793qT = c167847ee.A00;
        c84793qT.A09 = A02;
        c167847ee.A02(0.0f);
        c84793qT.A06 = 2;
        c167847ee.A04(1000L);
        c84793qT.A03 = -20.0f;
        C84793qT A01 = c167847ee.A01();
        C14360o3.A07(A01);
        return A01;
    }

    public static C26633BpU A0V(C51722Yv c51722Yv, int i) {
        return new C26633BpU(c51722Yv, AbstractC16960so.A1Q(Integer.valueOf(R.color.fds_transparent), Integer.valueOf(R.color.black_15_transparent), Integer.valueOf(R.color.black_40_transparent), Integer.valueOf(R.color.black_60_transparent)), i, false);
    }

    public static String A0g(C2Z0 c2z0, Integer num) {
        String A00 = AbstractC43744JWe.A00(c2z0.ArD().A0C.getResources(), num, null, false);
        C14360o3.A07(A00);
        return A00;
    }

    public static void A0s(View view, int i, int i2) {
        AbstractC010103p.A0H(view, AbstractC16960so.A1Q(new Rect(0, 0, i, i2), new Rect(view.getWidth() - i, 0, view.getWidth(), view.getHeight())));
    }

    public static void A0t(View view, ImageView imageView, RoundedCornerFrameLayout roundedCornerFrameLayout) {
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        view.setLayoutParams(layoutParams);
        roundedCornerFrameLayout.addView(imageView);
        roundedCornerFrameLayout.addView(view);
        roundedCornerFrameLayout.setCornerBackgroundColor(0);
    }

    public static void A13(C76223bS c76223bS, C77723dw c77723dw, int i, long j) {
        c77723dw.A0K(i);
        c77723dw.A0I(C2Z3.A00(c76223bS.BoZ(), j));
        c77723dw.A0J(C2Z3.A00(c76223bS.BoZ(), j));
    }

    public static void A14(C2Z0 c2z0, C77723dw c77723dw, int i, long j) {
        c77723dw.A0K(i);
        c77723dw.A0I(C2Z3.A00(c2z0.BoZ(), j));
        c77723dw.A0J(C2Z3.A00(c2z0.BoZ(), j));
        c77723dw.A0H(C2Z3.A00(c2z0.BoZ(), j));
    }

    public static void A15(C2Z0 c2z0, C77723dw c77723dw, boolean z) {
        c77723dw.A0c(true);
        c77723dw.A0Z(z);
        c77723dw.A0a(true);
        c77723dw.A06(null);
        c2z0.A00(c77723dw.A0A());
    }

    public static void A17(C51722Yv c51722Yv, C77723dw c77723dw, boolean z) {
        c77723dw.A0c(true);
        c77723dw.A0Z(z);
        c77723dw.A0a(true);
        c77723dw.A0D();
        c77723dw.A06(null);
        AbstractC77743dy.A00(c77723dw, c51722Yv);
    }

    public static void A18(C77723dw c77723dw, C2YS c2ys, int i, long j) {
        c77723dw.A0K(i);
        c77723dw.A0I(C2Z3.A00(c2ys.BoZ(), j));
        c77723dw.A0J(C2Z3.A00(c2ys.BoZ(), j));
    }

    public static void A1B(C77723dw c77723dw, Integer num) {
        c77723dw.A0C();
        c77723dw.A0Y(num);
        c77723dw.A0L(1.28f);
        c77723dw.A0b(false);
        c77723dw.A0N(0);
    }

    public static void A1C(C77723dw c77723dw, Integer num, float f) {
        c77723dw.A0C();
        c77723dw.A0Y(num);
        c77723dw.A0L(f);
        c77723dw.A0b(false);
        c77723dw.A0N(0);
        c77723dw.A0M(1);
        c77723dw.A0c(true);
        c77723dw.A0Z(false);
        c77723dw.A0a(true);
    }

    public static void A1F(C77723dw c77723dw, Integer num, Integer num2) {
        c77723dw.A0X(num);
        c77723dw.A0C();
        c77723dw.A0Y(num2);
        c77723dw.A0G();
        c77723dw.A0b(false);
        c77723dw.A0N(0);
    }

    public static void A1J(C77723dw c77723dw, Integer num, boolean z, boolean z2) {
        c77723dw.A0C();
        c77723dw.A0Y(num);
        c77723dw.A0G();
        c77723dw.A0b(z);
        c77723dw.A0N(z ? 1 : 0);
        c77723dw.A0E();
        c77723dw.A0c(z2);
        c77723dw.A0Z(z);
        c77723dw.A0a(z2);
        c77723dw.A06(null);
    }

    public static void A1K(C77723dw c77723dw, AbstractCollection abstractCollection) {
        c77723dw.A0b(false);
        c77723dw.A0N(0);
        c77723dw.A0E();
        c77723dw.A0c(true);
        c77723dw.A0Z(false);
        c77723dw.A0a(true);
        c77723dw.A06(null);
        abstractCollection.add(c77723dw.A0A());
    }

    public static void A1P(Object obj, Object obj2, Object obj3) {
        C14360o3.A0B(obj, 1);
        C14360o3.A0B(obj2, 2);
        C14360o3.A0B(obj3, 4);
    }

    public static void A1R(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C14360o3.A0B(obj, 2);
        C14360o3.A0B(obj2, 3);
        C14360o3.A0B(obj3, 4);
        C14360o3.A0B(obj4, 5);
        C14360o3.A0B(obj5, 6);
    }

    public static C5Y4 A05() {
        return new C5Y4(new C119055aN(1 | (1 << 32)), 1.0f, 400.0f);
    }

    public static Modifier A06(C5Tl c5Tl, Modifier modifier) {
        return C6L3.A01(C6L7.A01(C6G9.A00(1.0f, C5XL.A00(c5Tl).A0d), modifier, C5WF.A01(16.0f)), C5WF.A01(16.0f), C5XL.A00(c5Tl).A0k);
    }

    public static InterfaceC02590Ai A07(AbstractC12990ll abstractC12990ll) {
        C12210kP c12210kP = new C12210kP(abstractC12990ll);
        c12210kP.A01 = "ig_achievements";
        C18920wW A00 = c12210kP.A00();
        return A00.A00(A00.A00, "ig_achievements");
    }

    public static C51722Yv A0A(C2XI c2xi, C51722Yv c51722Yv, InterfaceC51732Yw interfaceC51732Yw) {
        return new C51722Yv(new C51722Yv(c51722Yv, interfaceC51732Yw), new C9CV(c2xi, C05F.A1I));
    }

    public static C51722Yv A0C(C51722Yv c51722Yv, InterfaceC51732Yw interfaceC51732Yw, int i) {
        return new C51722Yv(new C51722Yv(c51722Yv, interfaceC51732Yw), new C9CT(C05F.A01, 100.0f, i));
    }

    public static C51722Yv A0D(C51722Yv c51722Yv, InterfaceC51732Yw interfaceC51732Yw, int i, long j) {
        return new C51722Yv(new C51722Yv(c51722Yv, interfaceC51732Yw), new C9CU(C05F.A1I, i, j));
    }

    public static C51722Yv A0E(C51722Yv c51722Yv, InterfaceC51732Yw interfaceC51732Yw, int i, long j) {
        return new C51722Yv(new C51722Yv(c51722Yv, interfaceC51732Yw), new C9CU(C05F.A0A, i, j));
    }

    public static C51722Yv A0F(C51722Yv c51722Yv, InterfaceC51732Yw interfaceC51732Yw, int i, long j) {
        return new C51722Yv(new C51722Yv(c51722Yv, interfaceC51732Yw), new C9CU(C05F.A15, i, j));
    }

    public static C51722Yv A0G(C51722Yv c51722Yv, InterfaceC51732Yw interfaceC51732Yw, int i, long j) {
        return new C51722Yv(new C51722Yv(c51722Yv, interfaceC51732Yw), new C9CU(C05F.A08, i, j));
    }

    public static C51722Yv A0H(C51722Yv c51722Yv, InterfaceC51732Yw interfaceC51732Yw, Integer num) {
        return new C51722Yv(new C51722Yv(c51722Yv, interfaceC51732Yw), new C9CV(num, EnumC77683ds.CENTER, 3));
    }

    public static C51722Yv A0I(C51722Yv c51722Yv, InterfaceC51732Yw interfaceC51732Yw, Integer num, int i) {
        return new C51722Yv(new C51722Yv(c51722Yv, interfaceC51732Yw), new C9CV(num, EnumC77683ds.CENTER, i));
    }

    public static C51722Yv A0K(C51722Yv c51722Yv, Integer num, int i) {
        return new C51722Yv(new C51722Yv(c51722Yv, new C9CT(num, 100.0f, i)), new C9CV(C05F.A0Y, EnumC77933eL.ABSOLUTE, 3));
    }

    public static C51722Yv A0L(C51722Yv c51722Yv, Integer num, int i, long j) {
        return new C51722Yv(new C51722Yv(c51722Yv, new C9CU(num, i, j)), new C9CU(C05F.A01, i, j));
    }

    public static C51722Yv A0M(C51722Yv c51722Yv, Integer num, int i, long j) {
        return new C51722Yv(new C51722Yv(c51722Yv, new C9CU(num, i, j)), new C9CU(C05F.A0j, i, j));
    }

    public static C51722Yv A0N(C51722Yv c51722Yv, Integer num, Integer num2, float f, int i) {
        return new C51722Yv(new C51722Yv(c51722Yv, new C9CT(num, f, i)), new C9CT(num2, f, i));
    }

    public static TreeUpdaterJNI A0P(TreeJNI treeJNI, Map map) {
        return new TreeUpdaterJNI(map, treeJNI);
    }

    public static ImageUrl A0U(C5Tl c5Tl) {
        return C17060sy.A01.A01((UserSession) c5Tl.AJX(AbstractC117935Vd.A00)).Bhu();
    }

    public static C37604Ggz A0W(InterfaceC02590Ai interfaceC02590Ai, C37522Gfe c37522Gfe, String str) {
        interfaceC02590Ai.AAP("organic_tap_action", str);
        interfaceC02590Ai.AAP("organic_tap_action_source", "clips_immersive_midcard");
        interfaceC02590Ai.AAP("containermodule", c37522Gfe.getModuleName());
        interfaceC02590Ai.A8p("media_index", 0);
        C37604Ggz c37604Ggz = c37522Gfe.A03;
        interfaceC02590Ai.AAP("viewer_session_id", c37604Ggz.A01);
        return c37604Ggz;
    }

    public static Object A0b(C5Tl c5Tl, Object obj, Object obj2) {
        if (obj == obj2) {
            C137536Kz c137536Kz = new C137536Kz(C5UX.A00(c5Tl, AnonymousClass191.A00));
            c5Tl.FBy(c137536Kz);
            return c137536Kz;
        }
        return obj;
    }

    public static Object A0c(C5Tl c5Tl, Object obj, Object obj2, boolean z) {
        if (obj == obj2) {
            Boolean valueOf = Boolean.valueOf(z);
            C74883Yd A00 = AbstractC74873Yc.A00();
            InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(A00, valueOf);
            c5Tl.FBy(parcelableSnapshotMutableState);
            return parcelableSnapshotMutableState;
        }
        return obj;
    }

    public static Object A0d(Class cls) {
        return cls.getMethod("create", new Class[0]).invoke(null, new Object[0]);
    }

    public static void A0m(Rect rect, RectF rectF, float f, float f2) {
        rectF.set(f2, rect.top + f, rect.right - f, rect.bottom - f);
    }

    public static void A0v(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02530Ab interfaceC02530Ab2, C18920wW c18920wW, String str, String str2) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        if (A00.isSampled()) {
            A00.A8R(interfaceC02530Ab, "entrypoint");
            A00.A8R(interfaceC02530Ab2, "surface");
            A00.AAP("waterfall_id", str2);
            A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
            A00.Cht();
        }
    }

    public static void A0w(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "surface");
        interfaceC02590Ai.AAP("waterfall_id", "");
        interfaceC02590Ai.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
        interfaceC02590Ai.Cht();
    }

    public static void A0y(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, String str, String str2, String str3) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "wearable_device");
        interfaceC02590Ai.AAP("source_media_id", str);
        interfaceC02590Ai.AAP("source_media_surface", str2);
        interfaceC02590Ai.AAP("target_media_id", str3);
        interfaceC02590Ai.Cht();
    }

    public static void A10(InterfaceC02590Ai interfaceC02590Ai, C38321qM c38321qM) {
        interfaceC02590Ai.AAP("mezql_token", c38321qM.A0C.getMezqlToken());
        interfaceC02590Ai.AAP("ranking_info_token", c38321qM.A0C.getLoggingInfoToken());
    }

    public static void A12(AbstractC50812Vc abstractC50812Vc, C2XE c2xe, C2Z0 c2z0, C51722Yv c51722Yv) {
        C2Z0 c2z02 = new C2Z0(c2xe, new ArrayList());
        c2z02.A00(abstractC50812Vc);
        c2z0.A00(AbstractC76963ci.A0I(c2z02, c2z0, c51722Yv));
    }

    public static void A16(C2YF c2yf, C75113Zb c75113Zb, Object obj) {
        C2XE ArD = ((C2Z1) obj).ArD();
        float rawX = c2yf.A00.getRawX();
        float rawY = c2yf.A00.getRawY();
        HashMap hashMap = new HashMap();
        hashMap.put("tap_x_position", Float.valueOf(rawX));
        hashMap.put("tap_y_position", Float.valueOf(rawY));
        C14360o3.A07(ArD.A0C);
        hashMap.put("screen_width", Float.valueOf(AbstractC13890nF.A01(r2)));
        hashMap.put("screen_height", Float.valueOf(AbstractC13890nF.A00(r2)));
        c75113Zb.A1d = hashMap;
    }

    public static void A1M(InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, String str, String str2, int i) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        A00.AAP("target_id", str2);
        A00.A8p("position", Integer.valueOf(i));
        A00.AAP("module", interfaceC11380iw.getModuleName());
        A00.Cht();
    }

    public static void A1Q(Object obj, Object obj2, Object obj3) {
        C14360o3.A0B(obj, 12);
        C14360o3.A0B(obj2, 13);
        C14360o3.A0B(obj3, 14);
    }

    public static boolean A1T(int i) {
        if ((458752 & i) != 131072) {
            return false;
        }
        return true;
    }

    public static boolean A1U(int i) {
        if ((i & 458752) != 131072) {
            return false;
        }
        return true;
    }

    public static boolean A1V(int i) {
        if ((29360128 & i) != 8388608) {
            return false;
        }
        return true;
    }

    public static int A00(int i, int i2) {
        return i2 | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i);
    }

    public static int A02(Context context) {
        Resources resources = context.getResources();
        C14360o3.A0A(resources);
        return BOB.A00(resources, resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
    }

    public static int A03(C37556GgC c37556GgC, int i) {
        int A03 = c37556GgC.A03();
        int A06 = c37556GgC.A06();
        int A032 = c37556GgC.A03();
        int i2 = A032 + 1;
        if (A03 == A06) {
            return A032 - i;
        }
        return i2;
    }

    public static long A04(long j) {
        return C5AU.A04(Constraints.A03(j), Constraints.A01(j), Constraints.A02(j), Constraints.A00(j));
    }

    public static C78053eX A08(C77993eR c77993eR, InterfaceC50822Vd interfaceC50822Vd, C2YT c2yt, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        return new C78053eX(null, c2yt, new C2YP(interfaceC50822Vd, interfaceC16820sZ, interfaceC16660sJ, c77993eR.A01()));
    }

    public static C51472Xu A09(Context context, InterfaceC89793zL interfaceC89793zL, C89813zN c89813zN, C89813zN c89813zN2, int i) {
        c89813zN.A04(C89893zV.A00(context, i));
        c89813zN.A02 = interfaceC89793zL;
        return new C51472Xu(c89813zN2, c89813zN);
    }

    public static C80393iU A0O(Drawable drawable, C2XE c2xe, C51722Yv c51722Yv) {
        C80403iV A03 = C80393iU.A03(c2xe);
        A03.A0D(drawable);
        A03.A0B();
        A03.A0C();
        AbstractC77743dy.A00(A03, c51722Yv);
        return A03.A0A();
    }

    public static C2YU A0Q(View view, long j) {
        view.measure(AbstractC78603fS.A01(j), AbstractC78603fS.A00(j));
        return new C2YU(AbstractC78673fZ.A00(Math.max(C78613fT.A03(j), view.getMeasuredWidth()), Math.max(C78613fT.A02(j), view.getMeasuredHeight())), null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.1oD] */
    public static AbstractC12990ll A0T(C6FQ c6fq) {
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C14360o3.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        if (C37161oE.A00 == null) {
            C37161oE.A00 = new Object();
        }
        return A0B;
    }

    public static Long A0X(InterfaceC02590Ai interfaceC02590Ai, Number number, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        if (number != null) {
            return Long.valueOf(number.intValue());
        }
        return null;
    }

    public static Object A0Y(C5Tl c5Tl, int i) {
        c5Tl.Eno(i);
        Object EEc = c5Tl.EEc();
        if (EEc == C5UI.A00) {
            C5XN c5xn = new C5XN();
            c5Tl.FBy(c5xn);
            return c5xn;
        }
        return EEc;
    }

    public static Object A0Z(C5Tl c5Tl, Object obj, int i) {
        c5Tl.Eno(i);
        Object EEc = c5Tl.EEc();
        if (EEc == obj) {
            C5XN c5xn = new C5XN();
            c5Tl.FBy(c5xn);
            return c5xn;
        }
        return EEc;
    }

    public static Object A0a(C5Tl c5Tl, Object obj, int i, boolean z) {
        c5Tl.Eno(i);
        Object EEc = c5Tl.EEc();
        if (EEc == obj) {
            Boolean valueOf = Boolean.valueOf(z);
            C74883Yd A00 = AbstractC74873Yc.A00();
            InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(A00, valueOf);
            c5Tl.FBy(parcelableSnapshotMutableState);
            return parcelableSnapshotMutableState;
        }
        return EEc;
    }

    public static String A0e(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.A9K("media_id", Long.valueOf(j));
        interfaceC02590Ai.A8R(interfaceC02530Ab, "product_type");
        String str = C1QM.A00.A02.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String A0f(InterfaceC02590Ai interfaceC02590Ai, int i, int i2) {
        interfaceC02590Ai.A8p("total_num_candidates", Integer.valueOf(i));
        interfaceC02590Ai.A8p("media_index", Integer.valueOf(i2));
        String str = C1QM.A00.A02.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String A0h(C26646Bph c26646Bph, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(c26646Bph.A04);
        sb.append(", midcardType: ");
        sb.append(c26646Bph.A05);
        sb.append(", videoIndex: ");
        sb.append(c26646Bph.A01);
        return sb.toString();
    }

    public static String A0i(List list, int i) {
        return ((InterfaceC132245y2) AbstractC001800i.A0I((List) ((MUG) list.get(i)).A03)).Bet().A03;
    }

    public static void A0j(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 3);
        C14360o3.A0B(obj3, 4);
        C14360o3.A0B(obj4, 5);
    }

    public static void A0k(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 5);
        C14360o3.A0B(obj3, 6);
        C14360o3.A0B(obj4, 7);
    }

    public static void A0l(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 9);
        C14360o3.A0B(obj3, 10);
        C14360o3.A0B(obj4, 11);
    }

    public static void A0n(Typeface typeface, C76223bS c76223bS, C77723dw c77723dw, long j) {
        c77723dw.A0T(typeface);
        c77723dw.A0F();
        c77723dw.A0K(C2Z3.A00(c76223bS.BoZ(), j));
        c77723dw.A0I(C2Z3.A00(c76223bS.BoZ(), j));
        c77723dw.A0J(C2Z3.A00(c76223bS.BoZ(), j));
        c77723dw.A0H(C2Z3.A00(c76223bS.BoZ(), j));
    }

    public static void A0o(Typeface typeface, C2Z0 c2z0, C77723dw c77723dw, long j) {
        c77723dw.A0T(typeface);
        c77723dw.A0F();
        c77723dw.A0K(C2Z3.A00(c2z0.BoZ(), j));
        c77723dw.A0I(C2Z3.A00(c2z0.BoZ(), j));
        c77723dw.A0J(C2Z3.A00(c2z0.BoZ(), j));
        c77723dw.A0H(C2Z3.A00(c2z0.BoZ(), j));
    }

    public static void A0p(Typeface typeface, C77723dw c77723dw, C2XH c2xh, long j) {
        c77723dw.A0T(typeface);
        c77723dw.A0F();
        c77723dw.A0K(C2Z3.A00(c2xh, j));
        c77723dw.A0I(C2Z3.A00(c2xh, j));
        c77723dw.A0J(C2Z3.A00(c2xh, j));
        c77723dw.A0H(C2Z3.A00(c2xh, j));
        c77723dw.A0B();
    }

    public static void A0q(Drawable drawable, ImageView.ScaleType scaleType, C2XE c2xe, C2Z0 c2z0, C51722Yv c51722Yv) {
        C80403iV A03 = C80393iU.A03(c2xe);
        A03.A0D(drawable);
        A03.A0E(scaleType);
        A03.A0C();
        AbstractC77743dy.A00(A03, c51722Yv);
        c2z0.A00(A03.A0A());
    }

    public static void A0r(Drawable drawable, C2XE c2xe, C2Z0 c2z0, C51722Yv c51722Yv) {
        C80403iV A03 = C80393iU.A03(c2xe);
        A03.A0D(drawable);
        A03.A0B();
        A03.A0C();
        AbstractC77743dy.A00(A03, c51722Yv);
        c2z0.A00(A03.A0A());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0u(C5Tl c5Tl, C6C7 c6c7, int i, int i2) {
        long j = C5XL.A00(c5Tl).A0Y;
        long j2 = 0;
        c6c7.A06(new C5W3(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, C5W5.A03, 0 == true ? 1 : 0, 65530, j, j2, j2), i, i2);
    }

    public static void A0x(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, String str, double d) {
        interfaceC02590Ai.A8I(TraceFieldType.StartTime, Double.valueOf(d));
        interfaceC02590Ai.AAP("event_session_id", str);
        interfaceC02590Ai.A8R(interfaceC02530Ab, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
    }

    public static void A0z(InterfaceC02590Ai interfaceC02590Ai, UserSession userSession, C38321qM c38321qM, C65886Tvq c65886Tvq, String str) {
        interfaceC02590Ai.AAP("client_token", C65886Tvq.A00(userSession, c38321qM));
        interfaceC02590Ai.AAP(AbstractC31192Dnb.A00(42, 10, 38), c65886Tvq.A02);
        interfaceC02590Ai.A8R(c65886Tvq.A00, "on_feed_messaging_surface");
        interfaceC02590Ai.AAP("message_destination", str);
        interfaceC02590Ai.Cht();
    }

    public static void A11(InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAP("device_fold_orientation", AbstractC82673mV.A00);
        interfaceC02590Ai.AAP("device_fold_state", AbstractC82683mW.A00);
        interfaceC02590Ai.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
    }

    public static void A19(C77723dw c77723dw, C2XH c2xh, Integer num, long j) {
        c77723dw.A0F();
        c77723dw.A0K(C2Z3.A00(c2xh, j));
        c77723dw.A0I(C2Z3.A00(c2xh, j));
        c77723dw.A0J(C2Z3.A00(c2xh, j));
        c77723dw.A0H(C2Z3.A00(c2xh, j));
        c77723dw.A0X(num);
        c77723dw.A0C();
        c77723dw.A0Y(num);
        c77723dw.A0G();
    }

    public static void A1A(C77723dw c77723dw, C2XH c2xh, Number number, long j) {
        c77723dw.A0H(C2Z3.A00(c2xh, j));
        if (number != null) {
            c77723dw.A0O(number.intValue());
        }
    }

    public static void A1D(C77723dw c77723dw, Integer num, float f, boolean z, boolean z2) {
        c77723dw.A0C();
        c77723dw.A0Y(num);
        c77723dw.A0L(f);
        c77723dw.A0b(z);
        c77723dw.A0N(z ? 1 : 0);
        c77723dw.A0E();
        c77723dw.A0c(z2);
        c77723dw.A0Z(z);
        c77723dw.A0a(z2);
    }

    public static void A1E(C77723dw c77723dw, Integer num, int i, boolean z) {
        c77723dw.A0C();
        c77723dw.A0Y(num);
        c77723dw.A0G();
        c77723dw.A0b(z);
        c77723dw.A0N(i);
        c77723dw.A0E();
    }

    public static void A1G(C77723dw c77723dw, Integer num, boolean z) {
        c77723dw.A0B();
        c77723dw.A0C();
        c77723dw.A0Y(num);
        c77723dw.A0G();
        c77723dw.A0b(z);
        c77723dw.A0N(z ? 1 : 0);
    }

    public static void A1H(C77723dw c77723dw, Integer num, boolean z) {
        c77723dw.A0C();
        c77723dw.A0Y(num);
        c77723dw.A0L(1.33f);
        c77723dw.A0b(z);
        c77723dw.A0N(z ? 1 : 0);
    }

    public static void A1I(C77723dw c77723dw, Integer num, boolean z) {
        c77723dw.A0X(num);
        c77723dw.A0C();
        c77723dw.A0Y(num);
        c77723dw.A0G();
        c77723dw.A0b(z);
        c77723dw.A0N(z ? 1 : 0);
    }

    public static void A1L(C120985dq c120985dq, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user) {
        String id = user.getId();
        C1571673v.A08(interfaceC11380iw, userSession, AbstractC50626MWn.A00(userSession, user.B7L(), user.A0M(), id), "tap_clips_tab", user.getId(), c120985dq.getId(), c120985dq.A0P, "clips_tab");
    }

    public static void A1N(AbstractC12990ll abstractC12990ll, C38321qM c38321qM) {
        int A05 = C0f9.A05(528212011);
        AbstractC25651Mw.A00(abstractC12990ll).E4s(new C72243Lx(c38321qM, AnonymousClass341.A07, null));
        C0f9.A0C(1989792748, A05);
    }

    public static void A1O(IgReelsShowreelCompositionView igReelsShowreelCompositionView) {
        igReelsShowreelCompositionView.getController();
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC65748TtN.A02, igReelsShowreelCompositionView.A00);
        hashMap.put(EnumC65748TtN.A05, igReelsShowreelCompositionView.A01);
    }

    public static void A1S(AbstractCollection abstractCollection, Iterator it) {
        InterfaceC127975qQ interfaceC127975qQ;
        C38321qM BQN;
        String id;
        InterfaceC127955qO interfaceC127955qO = (AbstractC127945qN) it.next();
        if ((interfaceC127955qO instanceof InterfaceC127975qQ) && (interfaceC127975qQ = (InterfaceC127975qQ) interfaceC127955qO) != null && (BQN = interfaceC127975qQ.BQN()) != null && (id = BQN.getId()) != null) {
            abstractCollection.add(id);
        }
    }

    public static boolean A1W(int i) {
        if ((57344 & i) != 16384) {
            return false;
        }
        return true;
    }

    public static boolean A1X(C5Tl c5Tl, int i, int i2) {
        c5Tl.Eno(i);
        if ((i2 & 14) != 4) {
            return false;
        }
        return true;
    }

    public static boolean A1Y(C5Tl c5Tl, int i, int i2) {
        c5Tl.Eno(i);
        if ((i2 & 112) != 32) {
            return false;
        }
        return true;
    }

    public static boolean A1Z(C5Tl c5Tl, int i, int i2) {
        c5Tl.Eno(i);
        if ((i2 & 896) != 256) {
            return false;
        }
        return true;
    }

    public static boolean A1a(C5Tl c5Tl, int i, int i2) {
        c5Tl.Eno(i);
        if ((i2 & 7168) != 2048) {
            return false;
        }
        return true;
    }

    public static boolean A1b(C5Tl c5Tl, Object obj, Object obj2, Object obj3, int i) {
        c5Tl.Eno(i);
        return c5Tl.AH4(obj) | c5Tl.AH4(obj2) | c5Tl.AH4(obj3);
    }
}
