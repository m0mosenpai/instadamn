package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.facebook.R;

/* renamed from: X.V1t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67904V1t extends AbstractC72753Nw implements InterfaceC60072op, InterfaceC60122ou, InterfaceC60132ov, InterfaceC72039XGh, InterfaceC72523Mz, InterfaceC71943XBs, C0j7 {
    public static final String __redex_internal_original_name = "IgBloksScreenQueryFragment";
    public WTY A00;
    public U6L A01;
    public C6FC A02;
    public Ut3 A03;
    public C3I9 A04;
    public C57112jm A05;
    public Integer A06;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public final ViewTreeObserverOnPreDrawListenerC35720Fpu A0A = new ViewTreeObserverOnPreDrawListenerC35720Fpu(this, 0);
    public final InterfaceC09390do A0C = AbstractC60492pY.A01(this);
    public final InterfaceC60152ox A0B = new U31(this, 0);

    @Override // X.InterfaceC72039XGh
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void D6r(WTY wty) {
        WTY wty2;
        Window window;
        Integer num;
        C14360o3.A0B(wty, 0);
        WTY wty3 = this.A00;
        if (wty3 != null) {
            C69421Vn6 c69421Vn6 = wty3.A00;
            if (c69421Vn6 != null) {
                C69421Vn6 c69421Vn62 = wty.A00;
                if (c69421Vn62 != null) {
                    String str = c69421Vn62.A05;
                    if (str == null) {
                        str = c69421Vn6.A05;
                    }
                    String str2 = c69421Vn62.A04;
                    if (str2 == null) {
                        str2 = c69421Vn6.A04;
                    }
                    Integer num2 = c69421Vn62.A03;
                    if (num2 == null) {
                        num2 = c69421Vn6.A03;
                    }
                    Integer num3 = c69421Vn62.A02;
                    if (num3 == null) {
                        num3 = c69421Vn6.A02;
                    }
                    c69421Vn6 = new C69421Vn6(c69421Vn62.A00, c69421Vn62.A01, num2, num3, str, str2, c69421Vn62.A06, c69421Vn62.A08, c69421Vn62.A07);
                }
            } else {
                c69421Vn6 = wty.A00;
            }
            Boolean bool = wty.A02;
            if (bool == null) {
                bool = wty3.A02;
            }
            InterfaceC103384lE interfaceC103384lE = wty.A01;
            if (interfaceC103384lE == null) {
                interfaceC103384lE = wty3.A01;
            }
            Integer num4 = wty.A03;
            if (num4 == null) {
                num4 = wty3.A03;
            }
            wty2 = new WTY(c69421Vn6, interfaceC103384lE, bool, num4);
        } else {
            wty2 = wty;
        }
        this.A00 = wty2;
        if (getContext() != null && isAdded()) {
            WTY wty4 = this.A00;
            if (wty4 != null) {
                Activity rootActivity = getRootActivity();
                if (rootActivity != null && (window = rootActivity.getWindow()) != null && (num = wty4.A03) != null) {
                    Integer num5 = this.A06;
                    if (num5 == null) {
                        num5 = Integer.valueOf(window.getAttributes().softInputMode);
                    }
                    this.A06 = num5;
                    window.setSoftInputMode(num.intValue());
                }
                Boolean bool2 = wty4.A02;
                if (bool2 != null) {
                    boolean booleanValue = bool2.booleanValue();
                    int i = 0;
                    if (booleanValue) {
                        i = 8;
                    }
                    AbstractC31179DnN.A1J(this, i);
                }
            }
            View view = this.mView;
            if (wty.A00 != null && view != null && view.getViewTreeObserver().isAlive()) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC35720Fpu viewTreeObserverOnPreDrawListenerC35720Fpu = this.A0A;
                viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC35720Fpu);
                view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC35720Fpu);
            }
        }
    }

    @Override // X.InterfaceC71943XBs
    public final void DEl(Integer num) {
        Integer num2;
        C14360o3.A0B(num, 0);
        int intValue = num.intValue();
        U6L u6l = this.A01;
        if (intValue != 1) {
            if (u6l != null) {
                num2 = C05F.A0C;
            } else {
                return;
            }
        } else if (u6l == null) {
            return;
        } else {
            num2 = C05F.A01;
        }
        u6l.A02(num2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x005b  */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r14) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67904V1t.configureActionBar(X.2iU):void");
    }

    @Override // X.AbstractC72753Nw, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        U6L u6l = this.A01;
        if (u6l != null) {
            u6l.A01(bundle);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View findViewById;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Activity rootActivity = getRootActivity();
        if (rootActivity != null && (findViewById = rootActivity.findViewById(R.id.layout_container_center_right_coordinator_layout)) != null) {
            view = findViewById;
        }
        C57112jm c57112jm = this.A05;
        if (c57112jm != null) {
            AbstractC37301Gc2.A0v(view, c57112jm, this);
        }
    }

    private final C3LY A00(UQC uqc, boolean z) {
        String str;
        C6FG c6fg;
        C3LO c3lo;
        int i;
        WNV wnv = new WNV(44, uqc, this);
        String str2 = uqc.A05;
        if (str2 != null) {
            boolean A0K = C14360o3.A0K(uqc.A04, "regular");
            c3lo = new C3LO();
            c3lo.A0K = str2;
            c3lo.A0G = wnv;
            c3lo.A0M = uqc.A03;
            if (A0K) {
                i = R.style.ActionBarTextButton;
            } else {
                Context requireContext = requireContext();
                i = 0;
                if (C1QI.A0E().A00) {
                    i = requireContext.getColor(C1QI.A00(R.color.igds_primary_button));
                }
            }
            c3lo.A0D = i;
        } else {
            Integer num = uqc.A02;
            if (num != null) {
                c3lo = new C3LO();
                c3lo.A0M = uqc.A03;
                c3lo.A0G = wnv;
                if (z) {
                    int A01 = AbstractC65916TwN.A01(num);
                    c3lo.A06 = A01;
                    c3lo.A05 = AbstractC65916TwN.A00(num);
                    if (uqc.A00 > 0) {
                        C3LP c3lp = new C3LP(requireContext(), A01);
                        c3lp.A01();
                        c3lo.A0F = c3lp;
                    }
                } else {
                    c3lo.A01(AbstractC65916TwN.A01(num));
                }
            } else {
                if (z) {
                    str = "right";
                } else {
                    str = "left";
                }
                String A0g = AnonymousClass001.A0g("Custom ", str, " navbar button must have an icon or title specified");
                U6L u6l = this.A01;
                if (u6l != null) {
                    c6fg = u6l.A04.A02();
                    C14360o3.A07(c6fg);
                } else {
                    c6fg = null;
                }
                AbstractC25241Le.A00(c6fg, __redex_internal_original_name, A0g, null);
                return null;
            }
        }
        return new C3LY(c3lo);
    }

    public static final boolean A01(C67904V1t c67904V1t, InterfaceC103384lE interfaceC103384lE, boolean z) {
        U6L u6l = c67904V1t.A01;
        if (u6l != null) {
            C6FG A02 = u6l.A04.A02();
            C14360o3.A07(A02);
            C102884kP c102884kP = AnonymousClass634.A02(A02).A06;
            if (c102884kP != null) {
                if (z) {
                    c67904V1t.A09 = true;
                }
                C6FP.A03(A02, c102884kP, AbstractC58320PtC.A0g(A02), interfaceC103384lE);
                if (z) {
                    c67904V1t.A09 = false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC60132ov
    public final ViewOnTouchListenerC60632pm BDY() {
        C6FC c6fc = this.A02;
        if (c6fc != null) {
            return c6fc.A02;
        }
        return null;
    }

    @Override // X.InterfaceC72523Mz
    public final String BUi() {
        String str;
        U6L u6l = this.A01;
        if (u6l != null) {
            str = u6l.A03.A05;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "bloks_unknown_class";
        }
        C14360o3.A07(str);
        return str;
    }

    @Override // X.InterfaceC60132ov
    public final boolean CcV() {
        C6FC c6fc = this.A02;
        if (c6fc != null) {
            return c6fc.A01;
        }
        return false;
    }

    @Override // X.InterfaceC71943XBs
    public final void DDk() {
        U6L u6l = this.A01;
        if (u6l != null) {
            u6l.A00();
        }
    }

    @Override // X.InterfaceC72039XGh
    public final void EZZ(U7A u7a) {
        U6L u6l = this.A01;
        if (u6l != null) {
            u6l.A00 = u7a;
            if (u7a != null) {
                u6l.A00();
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        Bundle bundle;
        String string;
        String str;
        U6L u6l = this.A01;
        Bundle bundle2 = this.mArguments;
        if (u6l == null || (str = u6l.A03.A04) == null) {
            if (bundle2 == null || (bundle = bundle2.getBundle("key_screen_container_props_bundle")) == null || (string = bundle.getString("key_analytics_module")) == null) {
                return "bloks_unknown";
            }
            return string;
        }
        return str;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0C.getValue();
    }

    @Override // X.C0j7
    public final String getUrl() {
        String str;
        U6L u6l = this.A01;
        if (u6l != null) {
            str = u6l.A03.A05;
        } else {
            str = null;
        }
        return AbstractC13670mt.A06("instagram://bloks_screen_query/?app_id=%s", str);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC103384lE interfaceC103384lE;
        WTY wty = this.A00;
        if (wty != null && (interfaceC103384lE = wty.A01) != null && !this.A09) {
            return A01(this, interfaceC103384lE, true);
        }
        return false;
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnResume() {
        super.afterOnResume();
        WTY wty = this.A00;
        if (wty != null) {
            D6r(wty);
        }
    }

    @Override // X.AbstractC72753Nw, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1445417828);
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = requireArguments();
        }
        try {
            WTT A01 = WTT.A0A.A01(bundle);
            C6FC c6fc = null;
            this.A05 = AbstractC57052jg.A01(null, W1a.A01.A00);
            C62862tP A022 = C62862tP.A02(this, this, getSession(), this.A05);
            InterfaceC65469Tkm interfaceC65469Tkm = A01.A01;
            C14360o3.A0C(interfaceC65469Tkm, "null cannot be cast to non-null type com.instagram.bloks.screenquery.IgBloksFullScreenContainerConfig");
            this.A00 = (WTY) interfaceC65469Tkm;
            this.A01 = U6L.A05.A01(requireContext(), bundle, this, A022);
            new W30(this, this);
            U6L u6l = this.A01;
            if (u6l != null) {
                C6FG A023 = u6l.A04.A02();
                C14360o3.A07(A023);
                c6fc = (C6FC) A023.A01.get(R.id.bloks_ig_scrollable_navigation_helper);
            }
            this.A02 = c6fc;
            if (getRootActivity() instanceof InterfaceC53712dA) {
                ComponentCallbacks2 rootActivity = getRootActivity();
                C14360o3.A0C(rootActivity, AbstractC111324zv.A00(36));
                this.A07 = Integer.valueOf(((InterfaceC53712dA) rootActivity).C4u());
            }
            this.A04 = C3I7.A01(this, false, true);
            C0f9.A09(-429075308, A02);
        } catch (VHp e) {
            AbstractC25241Le.A03(__redex_internal_original_name, e);
            this.A08 = true;
            C0f9.A09(1935611107, A02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.view.View] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        U3u u3u;
        int A02 = C0f9.A02(-806930329);
        if (this.A08) {
            if (isAdded() && getParentFragmentManager().A0L() > 0 && !getParentFragmentManager().A0G) {
                AbstractC25226BEj.A1P(this);
            } else if (getActivity() != null) {
                AbstractC25227BEk.A1B(this);
            } else {
                throw new IllegalStateException("Tried to exit screen but could not find an activity or fragment manager");
            }
            u3u = new View(requireContext());
        } else {
            U6L u6l = this.A01;
            if (u6l != null) {
                Context context = u6l.A02;
                C6T7 c6t7 = u6l.A04;
                C14360o3.A0B(c6t7, 1);
                U3u u3u2 = new U3u(context);
                MSZ.A13(u3u2);
                c6t7.A07(u3u2);
                u3u = u3u2;
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A09(977703376, A02);
                throw A0g;
            }
        }
        C0f9.A09(-1486793311, A02);
        return u3u;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1804083104);
        super.onDestroyView();
        View view = this.mView;
        if (view != null && view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.A0A);
        }
        this.A03 = null;
        U6L u6l = this.A01;
        if (u6l != null) {
            u6l.A04.A04();
        }
        C0f9.A09(-894469576, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        int A02 = C0f9.A02(-945267295);
        super.onPause();
        Integer num = this.A06;
        if (num != null) {
            int intValue = num.intValue();
            Activity rootActivity = getRootActivity();
            if (rootActivity != null && (window = rootActivity.getWindow()) != null) {
                window.setSoftInputMode(intValue);
            }
        }
        Integer num2 = this.A07;
        if (num2 != null) {
            AbstractC31179DnN.A1J(this, num2.intValue());
        }
        C0f9.A09(-1772745643, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1870192875);
        super.onStart();
        C3I9 c3i9 = this.A04;
        if (c3i9 != null) {
            c3i9.Dnr(getRootActivity());
        }
        C3I9 c3i92 = this.A04;
        if (c3i92 != null) {
            c3i92.A9e(this.A0B);
        }
        C0f9.A09(-928872832, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(547742261);
        super.onStop();
        C3I9 c3i9 = this.A04;
        if (c3i9 != null) {
            c3i9.EFx(this.A0B);
        }
        C3I9 c3i92 = this.A04;
        if (c3i92 != null) {
            c3i92.onStop();
        }
        C0f9.A09(1083828243, A02);
    }
}
