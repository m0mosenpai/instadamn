package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.3qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84913qf extends AbstractC51572Yf {
    public final UserSession A00;
    public final InterfaceC75403a7 A01;
    public final InterfaceC60442pS A02;
    public final boolean A03;
    public final C51722Yv A04;
    public final C39H A05;
    public final InterfaceC16820sZ A06;

    public C84913qf(C51722Yv c51722Yv, UserSession userSession, C39H c39h, InterfaceC75403a7 interfaceC75403a7, InterfaceC60442pS interfaceC60442pS, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        C14360o3.A0B(interfaceC60442pS, 2);
        C14360o3.A0B(interfaceC75403a7, 3);
        C14360o3.A0B(userSession, 5);
        C14360o3.A0B(c39h, 6);
        this.A06 = interfaceC16820sZ;
        this.A02 = interfaceC60442pS;
        this.A01 = interfaceC75403a7;
        this.A03 = z;
        this.A00 = userSession;
        this.A05 = c39h;
        this.A04 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        EnumC85263rH enumC85263rH;
        long A0D;
        long A0D2;
        C51722Yv A00;
        C85473rc c85473rc;
        String str;
        long doubleToRawLongBits;
        C85473rc c85473rc2;
        C51722Yv c51722Yv;
        C85463rb c85463rb;
        long doubleToRawLongBits2;
        C85463rb c85463rb2;
        C14360o3.A0B(c76223bS, 0);
        C85233rE c85233rE = (C85233rE) this.A06.invoke();
        C77123cy A002 = AbstractC77063cs.A00(c76223bS, C85243rF.A00);
        boolean z = c85233rE.A0N;
        boolean z2 = c85233rE.A0J;
        if (!z && !z2) {
            enumC85263rH = EnumC85263rH.A03;
        } else {
            enumC85263rH = EnumC85263rH.A02;
        }
        final C51762Yz A003 = AbstractC77073ct.A00(c76223bS, C85273rI.A00);
        final C51762Yz A004 = AbstractC77073ct.A00(c76223bS, C85283rJ.A00);
        final C2XI A005 = AbstractC80383iT.A00(c76223bS, Float.valueOf(0.0f));
        Float valueOf = Float.valueOf(1.0f);
        final C2XI A006 = AbstractC80383iT.A00(c76223bS, valueOf);
        C2XI A007 = AbstractC80383iT.A00(c76223bS, valueOf);
        C2XI A008 = AbstractC80383iT.A00(c76223bS, valueOf);
        C51762Yz A009 = AbstractC77073ct.A00(c76223bS, C85293rK.A00);
        InterfaceC16660sJ A01 = AbstractC85303rL.A01(c76223bS, new C9FO(18, this, A009, c85233rE));
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: X.3rO
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && animatedValue != null) {
                    C2XI.this.A00(animatedValue);
                    A006.A00(animatedValue);
                }
            }
        };
        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: X.3rP
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C51762Yz.this.A01(false);
                A004.A01(true);
            }
        };
        UserSession userSession = this.A00;
        Object obj = AbstractC85353rQ.A00(animatorListenerAdapter, animatorUpdateListener, userSession).A00;
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A1F;
        C51722Yv c51722Yv2 = new C51722Yv(null, new C9CV(A005, num));
        Integer num2 = C05F.A1I;
        C51722Yv c51722Yv3 = new C51722Yv(c51722Yv2, new C9CV(A005, num2));
        Integer num3 = C05F.A00;
        C51722Yv c51722Yv4 = new C51722Yv(c51722Yv3, new C9CV(A006, num3));
        EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
        Integer num4 = C05F.A0Y;
        C51722Yv c51722Yv5 = new C51722Yv(c51722Yv4, new C9CV(num4, enumC77933eL, 3));
        EnumC85043qs enumC85043qs = (EnumC85043qs) AbstractC77183d4.A00(c76223bS, new C9FA(43, this, A009), new Object[]{A009});
        InterfaceC85193rA interfaceC85193rA = c85233rE.A03;
        EnumC85263rH enumC85263rH2 = EnumC85263rH.A02;
        if (enumC85263rH == enumC85263rH2 && c85233rE.A04.A07) {
            A0D = Double.doubleToRawLongBits(66.0d);
        } else {
            A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.audience_selector_pill_layout_height);
        }
        Integer num5 = C05F.A0C;
        C51722Yv c51722Yv6 = null;
        C51722Yv c51722Yv7 = new C51722Yv(null, new C9CV(num5, false, 4));
        if (z) {
            A0D2 = AbstractC77623dm.A0D(c76223bS, R.dimen.account_discovery_bottom_gap);
        } else {
            A0D2 = AbstractC77623dm.A0D(c76223bS, R.dimen.abc_button_inset_vertical_material);
        }
        C51722Yv c51722Yv8 = new C51722Yv(new C51722Yv(new C51722Yv(c51722Yv7, new C9CU(C05F.A0u, 0, A0D2)), new C9CU(num, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.abc_button_inset_vertical_material))), new C9CT(num3, 100.0f, 0));
        C76623c7 c76623c7 = c85233rE.A07;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        C51722Yv A0010 = AbstractC77853eD.A00(A002, AbstractC77823e9.A00(null, c51722Yv8, userSession, c76623c7, interfaceC60442pS, null, false, false), "onUfiVisible", new C206849Dp(c85233rE, 3));
        boolean A0011 = AbstractC80003hp.A00(c76623c7);
        InterfaceC75403a7 interfaceC75403a7 = this.A01;
        C75113Zb c75113Zb = c85233rE.A09;
        EnumC65592xv enumC65592xv = EnumC65592xv.A0p;
        if (A0011) {
            A00 = AbstractC77873eF.A00(c75933ay, userSession, interfaceC75403a7, enumC65592xv, c76623c7, c75113Zb, true);
        } else {
            A00 = AbstractC77873eF.A00(c75933ay, userSession, interfaceC75403a7, enumC65592xv, c76623c7, c75113Zb, false);
        }
        C51722Yv A0012 = A0010.A00(A00);
        if (this.A03) {
            c51722Yv6 = new C51722Yv(null, new C9CV(C05F.A0j, 4, 0));
        }
        C51722Yv A0013 = A0012.A00(c51722Yv6);
        Integer valueOf2 = Integer.valueOf(R.id.row_feed_view_group_buttons);
        Integer num6 = C05F.A0D;
        C9CV c9cv = new C9CV(num6, valueOf2, 4);
        if (A0013 == c75933ay) {
            A0013 = null;
        }
        C51722Yv c51722Yv9 = new C51722Yv(A0013, c9cv);
        Integer num7 = C05F.A0B;
        C51722Yv c51722Yv10 = new C51722Yv(c51722Yv9, new C9CV(num7, valueOf2, 4));
        Integer num8 = C05F.A01;
        C51722Yv A0014 = new C51722Yv(c51722Yv10, new C9CU(num8, 0, A0D)).A00(this.A04);
        C2XE c2xe = c76223bS.A05;
        C2Z0 c2z0 = new C2Z0(c2xe, new ArrayList());
        if (enumC85263rH == enumC85263rH2 && c85233rE.A04.A07) {
            C51722Yv c51722Yv11 = new C51722Yv(new C51722Yv(null, new C9CT(num8, 1.0f, 1)), new C9CV(num4, enumC77933eL, 3));
            long doubleToRawLongBits3 = Double.doubleToRawLongBits(0.0d);
            C51722Yv c51722Yv12 = new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(c51722Yv11, new C9CU(num2, 1, doubleToRawLongBits3)), new C9CU(num5, 1, Double.doubleToRawLongBits(5.0d))), new C9CU(num4, 1, doubleToRawLongBits3)), new C9CU(C05F.A0j, 0, Double.doubleToRawLongBits(30.0d)));
            C3e8 c3e8 = C3e8.CENTER;
            C2Z0 c2z02 = new C2Z0(c2z0.A00, new ArrayList());
            c2z02.A00(A03(c2z02, c85233rE));
            c2z0.A00(AbstractC76963ci.A0J(c2z02, c2z0, c51722Yv12, null, null, null, c3e8, null, false));
        }
        C51722Yv c51722Yv13 = new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CT(num8, 1.0f, 1)), new C9CV(num3, EnumC77683ds.FLEX_END, 3)), new C9CU(num8, 0, AbstractC77623dm.A0D(c2z0, R.dimen.audience_selector_pill_layout_height)));
        C2Z0 c2z03 = new C2Z0(c2z0.A00, new ArrayList());
        C51722Yv c51722Yv14 = new C51722Yv(null, new C9CT(num8, 2.0f, 1));
        C2XE c2xe2 = c2z03.A00;
        C2Z0 c2z04 = new C2Z0(c2xe2, new ArrayList());
        c2z04.A00(new C85453ra(userSession, c85233rE, interfaceC60442pS, A01, z));
        C2XE c2xe3 = c2z04.A00;
        C2Z0 c2z05 = new C2Z0(c2xe3, new ArrayList());
        String str2 = null;
        if (!c85233rE.A0F) {
            c85473rc = null;
        } else {
            int A012 = c76223bS.BoZ().A01(R.attr.glyphColorPrimary);
            C51722Yv c51722Yv15 = new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CV(C05F.A0N, AbstractC77623dm.A0F(c76223bS, 2131956426), 0)), new C9CV(num3, EnumC77683ds.STRETCH, 3)), new C9CV(A007, num)), new C9CV(A007, num2)), new C9CV(A008, num3));
            Integer valueOf3 = Integer.valueOf(R.id.row_feed_button_comment);
            C51722Yv c51722Yv16 = new C51722Yv(new C51722Yv(c51722Yv15, new C9CV(num6, valueOf3, 4)), new C9CV(num7, valueOf3, 4));
            InterfaceC16620sF interfaceC16620sF = c85233rE.A05.A0D;
            Context context = c2xe.A0C;
            C14360o3.A07(context);
            C85463rb c85463rb3 = new C85463rb(ImageView.ScaleType.CENTER, AbstractC77853eD.A00(A002, new C51722Yv(c51722Yv16, new C9CV(num3, interfaceC16620sF.invoke(context, c85233rE.A06), 4)), "getCommentComponent", new C207189Ex(35, c85233rE, c76223bS)), null, R.drawable.instagram_comment_pano_outline_24, A012);
            if (c85233rE.A0Q) {
                str2 = c85233rE.A0B;
            }
            c85473rc = new C85473rc(c85463rb3, c75933ay, null, str2, new C207189Ex(33, this, c85233rE), null, null, new C207189Ex(34, this, c85233rE), R.dimen.account_discovery_bottom_gap, z);
        }
        c2z05.A00(c85473rc);
        c2z04.A00(new C2WF(null, null, null, c2z05.A01, false));
        C2Z0 c2z06 = new C2Z0(c2xe3, new ArrayList());
        Object A0015 = AbstractC77183d4.A00(c76223bS, C85483rd.A00, new Object[0]);
        final C2XI A0016 = AbstractC80383iT.A00(c76223bS, valueOf);
        final C2XI A0017 = AbstractC80383iT.A00(c76223bS, valueOf);
        C51762Yz A0018 = AbstractC77073ct.A00(c76223bS, C85493re.A00);
        Object obj2 = AbstractC85353rQ.A01(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3rf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && animatedValue != null) {
                    C2XI.this.A00(animatedValue);
                    A0017.A00(animatedValue);
                }
            }
        }, userSession).A00;
        if (!c85233rE.A0M) {
            c85473rc2 = null;
        } else {
            int A013 = c76223bS.BoZ().A01(R.attr.glyphColorPrimary);
            C51722Yv c51722Yv17 = new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CV(num3, EnumC77683ds.STRETCH, 3)), new C9CV(C05F.A0N, AbstractC77623dm.A0F(c76223bS, 2131973290), 0)), new C9CV(num8, "android.widget.Button", 0)), new C9CV(A0016, num)), new C9CV(A0016, num2)), new C9CV(A0017, num3));
            Integer valueOf4 = Integer.valueOf(R.id.row_feed_button_share);
            C51722Yv c51722Yv18 = new C51722Yv(new C51722Yv(c51722Yv17, new C9CV(num6, valueOf4, 4)), new C9CV(num7, valueOf4, 4));
            InterfaceC16620sF interfaceC16620sF2 = c85233rE.A05.A0D;
            Context context2 = c2xe.A0C;
            C14360o3.A07(context2);
            C85463rb c85463rb4 = new C85463rb(ImageView.ScaleType.CENTER, new C51722Yv(AbstractC77853eD.A00(A002, new C51722Yv(c51722Yv18, new C9CV(num3, interfaceC16620sF2.invoke(context2, c85233rE.A06), 4)), "getShareComponent", new C207189Ex(40, c85233rE, c76223bS)), new C77863eE(num5, new C207329Fl(1, c85233rE, this, obj, A0015, A0018, obj2, A003), null)), null, R.drawable.instagram_direct_pano_outline_24, A013);
            AbstractC77313dH.A00(c76223bS, new C207339Fm(3, obj, obj2, this, A009, A003, A0018, A0015), new Object[]{A009});
            if (c85233rE.A0S) {
                str = c85233rE.A0D;
            } else {
                str = null;
            }
            C207189Ex c207189Ex = new C207189Ex(36, this, c85233rE);
            C207189Ex c207189Ex2 = new C207189Ex(37, this, c85233rE);
            C207189Ex c207189Ex3 = new C207189Ex(38, this, c85233rE);
            C207189Ex c207189Ex4 = new C207189Ex(39, this, c85233rE);
            if (z) {
                doubleToRawLongBits = AbstractC77623dm.A0D(c76223bS, R.dimen.abc_button_inset_vertical_material);
            } else {
                doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
            }
            c85473rc2 = new C85473rc(c85463rb4, new C51722Yv(null, new C9CU(C05F.A07, 0, doubleToRawLongBits)), null, str, c207189Ex, c207189Ex2, c207189Ex3, c207189Ex4, R.dimen.abc_button_inset_vertical_material, z);
        }
        c2z06.A00(c85473rc2);
        if (((Boolean) A003.A03).booleanValue()) {
            C14360o3.A0B(interfaceC85193rA, 0);
            if (interfaceC85193rA instanceof C85183r9) {
                C85183r9 c85183r9 = (C85183r9) interfaceC85193rA;
                c2z06.A00(new C26515Bna(c51722Yv5, userSession, enumC85043qs, this.A05, c85183r9, c85233rE, interfaceC60442pS, new WeakReference(AbstractC13330mJ.A00(AbstractC77363dM.A00(c2z06))), new B5u(this), new B5v(this), AbstractC77623dm.A0D(c2z06, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size)));
            }
        }
        c2z04.A00(new C2WF(null, null, null, c2z06.A01, false));
        c2z03.A00(AbstractC76963ci.A0J(c2z04, c2z03, c51722Yv14, null, null, null, null, null, false));
        if (enumC85263rH == EnumC85263rH.A03) {
            C51722Yv c51722Yv19 = new C51722Yv(new C51722Yv(null, new C9CV(num4, enumC77933eL, 3)), new C9CU(num8, 1, 9221401712017801216L));
            C3e8 c3e82 = C3e8.CENTER;
            C2Z0 c2z07 = new C2Z0(c2xe2, new ArrayList());
            c2z07.A00(A03(c2z07, c85233rE));
            c2z03.A00(AbstractC76963ci.A0J(c2z07, c2z03, c51722Yv19, null, null, null, c3e82, null, false));
        }
        C3e8 c3e83 = C3e8.FLEX_END;
        C51722Yv c51722Yv20 = new C51722Yv(new C51722Yv(null, new C9CT(num8, 1.0f, 1)), new C9CU(num8, 0, AbstractC77623dm.A0D(c2z03, R.dimen.audience_selector_pill_layout_height)));
        C2Z0 c2z08 = new C2Z0(c2xe2, new ArrayList());
        if (c85233rE.A0P) {
            if (!c85233rE.A0K) {
                c85463rb2 = null;
            } else {
                C51722Yv c51722Yv21 = new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CU(num3, 0, Double.doubleToRawLongBits(24.0d))), new C9CT(num5, 0.0f, 1)), new C9CV(num3, EnumC77683ds.STRETCH, 3)), new C9CV(num8, "android.widget.Button", 0));
                InterfaceC16620sF interfaceC16620sF3 = c85233rE.A05.A0D;
                Context context3 = c2z08.ArD().A0C;
                C14360o3.A07(context3);
                C51722Yv c51722Yv22 = new C51722Yv(c51722Yv21, new C9CV(num3, interfaceC16620sF3.invoke(context3, c85233rE.A06), 4));
                if (z) {
                    doubleToRawLongBits2 = AbstractC77623dm.A0A(c2z08);
                } else {
                    doubleToRawLongBits2 = Double.doubleToRawLongBits(0.0d);
                }
                c85463rb2 = new C85463rb(ImageView.ScaleType.CENTER, new C51722Yv(new C51722Yv(c51722Yv22, new C9CU(C05F.A07, 0, doubleToRawLongBits2)), new C9CV(num, new DRQ(c85233rE, 47), 4)), Integer.valueOf(AbstractC77623dm.A02(c2z08, R.attr.feedSaveActiveColor)), R.drawable.instagram_visual_search_pano_outline_24, AbstractC77623dm.A02(c2z08, R.attr.glyphColorPrimary));
            }
            c2z08.A00(c85463rb2);
        }
        if (!c85233rE.A0K) {
            c85463rb = null;
        } else {
            C51722Yv c51722Yv23 = new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CU(num3, 0, AbstractC77623dm.A0D(c2z08, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size))), new C9CU(num8, 0, AbstractC77623dm.A0D(c2z08, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size))), new C9CV(num3, EnumC77683ds.STRETCH, 3));
            boolean z3 = c85233rE.A0L;
            int i = 2131952396;
            if (z3) {
                i = 2131972240;
            }
            C51722Yv c51722Yv24 = new C51722Yv(new C51722Yv(new C51722Yv(c51722Yv23, new C9CV(C05F.A0N, AbstractC77623dm.A0F(c2z08, i), 0)), new C9CV(num8, "android.widget.Button", 0)), new C9CV(C05F.A06, Boolean.valueOf(z3), 4));
            InterfaceC16620sF interfaceC16620sF4 = c85233rE.A05.A0D;
            Context context4 = c2z08.ArD().A0C;
            C14360o3.A07(context4);
            C51722Yv c51722Yv25 = new C51722Yv(AbstractC77823e9.A00(EnumC71343Hv.A0X, new C51722Yv(new C51722Yv(c51722Yv24, new C9CV(num3, interfaceC16620sF4.invoke(context4, c85233rE.A06), 4)), new C9CV(num7, Integer.valueOf(R.id.row_feed_button_save), 4)), userSession, c76623c7, interfaceC60442pS, null, false, false), new C9CV(num, new C206849Dp(c85233rE, 5), 4));
            if (!c85233rE.A0H) {
                c51722Yv = new C51722Yv(c51722Yv25, new C9CV(C05F.A03, new C206849Dp(c85233rE, 4), 4));
            } else {
                c51722Yv = c51722Yv25;
            }
            c85463rb = new C85463rb(ImageView.ScaleType.CENTER, c51722Yv, Integer.valueOf(AbstractC77623dm.A02(c2z08, R.attr.feedSaveActiveColor)), R.drawable.ufi_save_icon, AbstractC77623dm.A02(c2z08, R.attr.glyphColorPrimary));
        }
        c2z08.A00(c85463rb);
        c2z03.A00(AbstractC76963ci.A0J(c2z08, c2z03, c51722Yv20, null, null, null, c3e83, null, false));
        c2z0.A00(AbstractC76963ci.A0J(c2z03, c2z0, c51722Yv13, null, null, null, null, null, false));
        C2WH A0J = AbstractC76963ci.A0J(c2z0, c76223bS, A0014, null, null, null, null, null, false);
        C3r3 c3r3 = c85233rE.A08;
        if (c3r3.A04 && c85233rE.A0O) {
            return new C26316BkN(A0J, c3r3);
        }
        return A0J;
    }

    public static final C100874fz A03(C2Z1 c2z1, C85233rE c85233rE) {
        Integer num;
        C85083qw c85083qw = c85233rE.A04;
        Integer num2 = null;
        if (!c85083qw.A07) {
            return null;
        }
        C76623c7 c76623c7 = c85233rE.A07;
        C75113Zb c75113Zb = c85233rE.A09;
        int i = c85083qw.A00;
        boolean z = c85083qw.A06;
        Integer num3 = c85083qw.A02.A00;
        if (num3 != null) {
            num = Integer.valueOf(AbstractC77623dm.A03(c2z1, num3.intValue()));
        } else {
            num = null;
        }
        Integer num4 = c85083qw.A03.A00;
        if (num4 != null) {
            num2 = Integer.valueOf(AbstractC77623dm.A03(c2z1, num4.intValue()));
        }
        return new C100874fz(c85083qw, c76623c7, c75113Zb, num, num2, i, z);
    }
}
