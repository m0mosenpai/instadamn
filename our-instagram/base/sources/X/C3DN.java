package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* renamed from: X.3DN, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3DN {
    public static final C3DO A00 = new Object();

    public final int A08() {
        return ((InterfaceC56392iX) ((C3DP) this).A12.getValue()).getView().getHeight();
    }

    public final Fragment A09() {
        C3DP c3dp = (C3DP) this;
        AbstractC10360h2 abstractC10360h2 = (AbstractC10360h2) c3dp.A0y.get();
        if (abstractC10360h2 == null) {
            C0w9.A03(AbstractC111324zv.A00(291), "FragmentManager is null getBottomSheetFragment");
            return null;
        }
        return abstractC10360h2.A0O(c3dp.A0r);
    }

    public final void A0A() {
        Float f;
        ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = ((C3DP) this).A0D;
        if (viewOnTouchListenerC65896Tw0 != null) {
            C38620GyN c38620GyN = new C38620GyN(viewOnTouchListenerC65896Tw0.A0B, viewOnTouchListenerC65896Tw0.A0A, viewOnTouchListenerC65896Tw0.A03, viewOnTouchListenerC65896Tw0.A04);
            C55982hj c55982hj = viewOnTouchListenerC65896Tw0.A0V;
            if (((float) c55982hj.A09.A00) * 2.0f < ViewOnTouchListenerC65896Tw0.A01(viewOnTouchListenerC65896Tw0)) {
                c55982hj.A08(0.0d, true);
                c55982hj.A06(0.0d);
                ViewOnTouchListenerC65896Tw0.A09(viewOnTouchListenerC65896Tw0, 1);
                C65897Tw1 c65897Tw1 = viewOnTouchListenerC65896Tw0.A0Y;
                c65897Tw1.A02(new C51752Mtb(c38620GyN, 1, 1, 14));
                c65897Tw1.A00();
                return;
            }
            c55982hj.A08(ViewOnTouchListenerC65896Tw0.A01(viewOnTouchListenerC65896Tw0), true);
            c55982hj.A06(ViewOnTouchListenerC65896Tw0.A01(viewOnTouchListenerC65896Tw0));
            C65897Tw1 c65897Tw12 = viewOnTouchListenerC65896Tw0.A0Y;
            c65897Tw12.A02(new C51752Mtb(c38620GyN, 4, 0, 14));
            MotionEvent motionEvent = c38620GyN.A02;
            if (motionEvent != null) {
                f = Float.valueOf(motionEvent.getY());
            } else {
                f = null;
            }
            c65897Tw12.A03(ViewOnTouchListenerC65896Tw0.A07(viewOnTouchListenerC65896Tw0, f));
        }
    }

    public final void A0C() {
        InterfaceC189488aT interfaceC189488aT;
        View C5a;
        ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = ((C3DP) this).A0D;
        if (viewOnTouchListenerC65896Tw0 != null && (C5a = (interfaceC189488aT = viewOnTouchListenerC65896Tw0.A0X).C5a()) != null) {
            int A05 = ViewOnTouchListenerC65896Tw0.A05(viewOnTouchListenerC65896Tw0) - ((int) viewOnTouchListenerC65896Tw0.A0V.A01);
            C5a.setTranslationY(A05);
            interfaceC189488aT.onBottomSheetPositionChanged(A05, viewOnTouchListenerC65896Tw0.A07);
            viewOnTouchListenerC65896Tw0.A0Y.A01(A05, viewOnTouchListenerC65896Tw0.A07);
        }
    }

    public final void A0D() {
        long j;
        C3DP c3dp = (C3DP) this;
        if (!c3dp.A0Y && c3dp.A07 != 0) {
            c3dp.A0E();
            if (c3dp.A0B != null) {
                j = 7000;
            } else {
                j = 2000;
            }
            Handler handler = c3dp.A0t;
            Runnable runnable = c3dp.A0x;
            handler.postDelayed(runnable, c3dp.A07);
            handler.postDelayed(runnable, c3dp.A07 + j);
            c3dp.A11.add(runnable);
        }
    }

    public final void A0E() {
        C3DP c3dp = (C3DP) this;
        java.util.Set set = c3dp.A11;
        if (!set.isEmpty()) {
            c3dp.A0t.removeCallbacks((Runnable) AbstractC001800i.A09(set));
            set.clear();
        }
    }

    public final void A0F(double d) {
        ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = ((C3DP) this).A0D;
        if (viewOnTouchListenerC65896Tw0 != null) {
            C55982hj c55982hj = viewOnTouchListenerC65896Tw0.A0V;
            double A01 = ((float) c55982hj.A09.A00) + (ViewOnTouchListenerC65896Tw0.A01(viewOnTouchListenerC65896Tw0) * d);
            c55982hj.A08(A01, true);
            c55982hj.A06(A01);
        }
    }

    public final void A0G(float f) {
        ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = ((C3DP) this).A0D;
        if (viewOnTouchListenerC65896Tw0 != null) {
            viewOnTouchListenerC65896Tw0.A0V.A06(ViewOnTouchListenerC65896Tw0.A05(viewOnTouchListenerC65896Tw0) * f);
        }
    }

    public final void A0H(int i) {
        boolean z;
        C3DP c3dp = (C3DP) this;
        if (i != 255) {
            if (c3dp.A04 == 255) {
                Activity activity = c3dp.A0s;
                c3dp.A04 = C30D.A00(activity);
                if (activity.getWindow() != null && activity.getWindow().getDecorView() != null) {
                    z = new C011904h(activity.getWindow().getDecorView(), activity.getWindow()).A00.A06();
                } else {
                    z = false;
                }
                c3dp.A0d = z;
            }
            Activity activity2 = c3dp.A0s;
            C30D.A04(activity2, i);
            C30D.A06(activity2, true);
        }
    }

    public final void A0I(Context context, Fragment fragment, Integer num, boolean z) {
        int color = context.getColor(R.color.fds_transparent);
        ((C3DP) this).A0L = true;
        A0M(fragment, null, num, color, context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_background)), z);
    }

    public final void A0J(Fragment fragment) {
        A0O(fragment, C05F.A00, 255, 255, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0L(Fragment fragment, AbstractC10360h2 abstractC10360h2, Integer num) {
        C3DP c3dp = (C3DP) this;
        if (fragment instanceof InterfaceC11380iw) {
            InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) fragment;
            AbstractC12990ll abstractC12990ll = c3dp.A0w;
            boolean z = c3dp.A0k;
            C14360o3.A0B(interfaceC11380iw, 0);
            C14360o3.A0B(abstractC12990ll, 2);
            if (!z) {
                num.intValue();
            }
            C55772hI.A00(abstractC12990ll).A0A(C35899FtJ.A00, interfaceC11380iw, null, abstractC10360h2.A0L());
        }
    }

    public final void A0N(Fragment fragment, XBL xbl) {
        C3DP c3dp = (C3DP) this;
        c3dp.A0I = xbl;
        c3dp.A0O(fragment, C05F.A00, 255, 255, true);
    }

    public final void A0O(Fragment fragment, Integer num, int i, int i2, boolean z) {
        C14360o3.A0B(fragment, 0);
        C14360o3.A0B(num, 2);
        A0M(fragment, null, num, i, i2, z);
    }

    public final void A0P(C37910Gm7 c37910Gm7) {
        C3DP c3dp = (C3DP) this;
        c3dp.A0E = c37910Gm7;
        if (c37910Gm7.A00) {
            C3DP.A06(c3dp.A0u, c3dp);
        } else {
            C3DP.A01(c3dp).setAlpha(0.0f);
        }
    }

    public final void A0Q(C7XU c7xu) {
        C3DP c3dp = (C3DP) this;
        if (c7xu == null && !c3dp.A0h && !c3dp.A0b) {
            android.util.Log.w("BottomSheetNavigator", "You don't have to null out the Listener manually");
        }
        c3dp.A0H = c7xu;
    }

    public final void A0R(InterfaceC86363t8 interfaceC86363t8) {
        C14360o3.A0B(interfaceC86363t8, 0);
        ((C3DP) this).A10.add(interfaceC86363t8);
    }

    public final void A0S(InterfaceC86363t8 interfaceC86363t8) {
        C14360o3.A0B(interfaceC86363t8, 0);
        java.util.Set set = ((C3DP) this).A10;
        if (set.contains(interfaceC86363t8)) {
            set.remove(interfaceC86363t8);
        }
    }

    public final void A0T(Integer num) {
        C3DP c3dp = (C3DP) this;
        Fragment A09 = c3dp.A09();
        if (A09 != null) {
            C3DP.A05(A09, c3dp, num);
        }
    }

    public final void A0U(Integer num) {
        C14360o3.A0B(num, 0);
        ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = ((C3DP) this).A0D;
        if (viewOnTouchListenerC65896Tw0 != null) {
            ViewOnTouchListenerC65896Tw0.A09(viewOnTouchListenerC65896Tw0, 2);
            viewOnTouchListenerC65896Tw0.A0F = num;
            viewOnTouchListenerC65896Tw0.A0V.A06(ViewOnTouchListenerC65896Tw0.A02(viewOnTouchListenerC65896Tw0));
        }
    }

    public final void A0V(Integer num, boolean z) {
        ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = ((C3DP) this).A0D;
        if (viewOnTouchListenerC65896Tw0 != null && ViewOnTouchListenerC65896Tw0.A0B(viewOnTouchListenerC65896Tw0)) {
            viewOnTouchListenerC65896Tw0.A0F = num;
            ViewOnTouchListenerC65896Tw0.A09(viewOnTouchListenerC65896Tw0, 4);
            if (!z) {
                viewOnTouchListenerC65896Tw0.A0V.A08(ViewOnTouchListenerC65896Tw0.A01(viewOnTouchListenerC65896Tw0), true);
            }
            viewOnTouchListenerC65896Tw0.A0V.A06(ViewOnTouchListenerC65896Tw0.A01(viewOnTouchListenerC65896Tw0));
        }
    }

    public final void A0W(boolean z) {
        ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = ((C3DP) this).A0D;
        if (viewOnTouchListenerC65896Tw0 != null) {
            double d = ViewOnTouchListenerC65896Tw0.A0e;
            viewOnTouchListenerC65896Tw0.A0H(C05F.A04, z);
        }
    }

    public final void A0X(boolean z) {
        C3DP c3dp = (C3DP) this;
        if (z) {
            C3DP.A06(c3dp.A0u, c3dp);
            return;
        }
        C3DP.A01(c3dp).setAlpha(0.0f);
        Activity activity = (Activity) AbstractC13320mI.A00(C3DP.A02(c3dp).getContext(), Activity.class);
        int i = c3dp.A05;
        if (i == 255) {
            return;
        }
        AbstractC56402iY.A02(activity, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A0Y() {
        Fragment A09;
        C3DP c3dp = (C3DP) this;
        if (!c3dp.A0L || (A09 = c3dp.A09()) == 0) {
            return false;
        }
        if (!(A09 instanceof InterfaceC60072op) || !((InterfaceC60072op) A09).onBackPressed()) {
            C3DP.A05(A09, c3dp, C05F.A15);
        }
        return true;
    }

    public final boolean A0Z() {
        ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = ((C3DP) this).A0D;
        if (viewOnTouchListenerC65896Tw0 != null) {
            C55982hj c55982hj = viewOnTouchListenerC65896Tw0.A0V;
            if (!C14360o3.A0J(Float.valueOf((float) c55982hj.A01), Float.valueOf((float) c55982hj.A09.A00))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (X.ViewOnTouchListenerC65896Tw0.A0B(r3) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0a(X.EnumC27385C6o r5, java.lang.Integer r6) {
        /*
            r4 = this;
            r0 = r4
            X.3DP r0 = (X.C3DP) r0
            r2 = 1
            X.C14360o3.A0B(r6, r2)
            X.Tw0 r3 = r0.A0D
            if (r3 == 0) goto L4b
            int r1 = r3.A09
            r0 = 2
            if (r1 != r0) goto L4b
            X.C6o r0 = X.EnumC27385C6o.A04
            if (r5 != r0) goto L34
            r3.A0F = r6
            boolean r0 = X.ViewOnTouchListenerC65896Tw0.A0B(r3)
            if (r0 == 0) goto L42
        L1c:
            boolean r0 = X.ViewOnTouchListenerC65896Tw0.A0B(r3)
            if (r0 == 0) goto L32
            r3.A0F = r6
            r0 = 4
            X.ViewOnTouchListenerC65896Tw0.A09(r3, r0)
            X.2hj r2 = r3.A0V
            float r0 = X.ViewOnTouchListenerC65896Tw0.A01(r3)
            double r0 = (double) r0
            r2.A06(r0)
        L32:
            r0 = 1
            return r0
        L34:
            X.C6o r0 = X.EnumC27385C6o.A05
            if (r5 != r0) goto L46
            r3.A0F = r6
            int r1 = r3.A08
            r0 = 4
            if (r1 == r0) goto L1c
            r0 = 3
            if (r1 != r0) goto L32
        L42:
            r3.A0H(r6, r2)
            goto L32
        L46:
            X.C6o r0 = X.EnumC27385C6o.A03
            if (r5 != r0) goto L4b
            goto L42
        L4b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3DN.A0a(X.C6o, java.lang.Integer):boolean");
    }

    public final void A0B() {
        A0T(C05F.A1F);
    }

    public final void A0K(Fragment fragment) {
        A0O(fragment, C05F.A00, 255, 255, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, X.1vN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0M(androidx.fragment.app.Fragment r27, X.C19260xA r28, java.lang.Integer r29, int r30, int r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3DN.A0M(androidx.fragment.app.Fragment, X.0xA, java.lang.Integer, int, int, boolean):void");
    }
}
