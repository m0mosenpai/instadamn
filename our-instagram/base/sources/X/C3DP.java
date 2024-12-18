package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.systrace.Systrace;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.3DP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3DP extends C3DN implements InterfaceC55932he {
    public static final C55942hf A19 = C55942hf.A04(40.0d, 7.0d);
    public float A00;
    public int A06;
    public long A07;
    public View.OnClickListener A08;
    public Fragment A09;
    public C55942hf A0A;
    public C62447SCa A0B;
    public C68815VcW A0C;
    public ViewOnTouchListenerC65896Tw0 A0D;
    public C37910Gm7 A0E;
    public BCD A0F;
    public InterfaceC65577TnB A0G;
    public C7XU A0H;
    public XBL A0I;
    public W4O A0J;
    public boolean A0M;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public int[] A0p;
    public boolean A0q;
    public final int A0r;
    public final Activity A0s;
    public final C55982hj A0u;
    public final C3DU A0v;
    public final AbstractC12990ll A0w;
    public final WeakReference A0y;
    public final InterfaceC09390do A12;
    public final InterfaceC09390do A13;
    public final boolean A14;
    public final Map A0z = new WeakHashMap();
    public final int[] A18 = {0, 0};
    public final Rect A15 = new Rect();
    public final InterfaceC09390do A16 = AbstractC09440dt.A01(new C206839Do(this, 35));
    public final InterfaceC09390do A17 = AbstractC09440dt.A01(new C206839Do(this, 36));
    public Integer A0K = C05F.A02;
    public boolean A0N = true;
    public boolean A0L = true;
    public final java.util.Set A10 = new LinkedHashSet();
    public int A05 = 255;
    public int A04 = 255;
    public int A03 = 255;
    public boolean A0l = true;
    public float A01 = 0.5f;
    public int A02 = 2;
    public final Handler A0t = new Handler(Looper.getMainLooper());
    public final java.util.Set A11 = new LinkedHashSet();
    public final Runnable A0x = new Runnable() { // from class: X.3DQ
        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC65577TnB interfaceC65577TnB;
            C3DP c3dp = C3DP.this;
            if (!c3dp.A0Y && (interfaceC65577TnB = c3dp.A0G) != null) {
                interfaceC65577TnB.D08();
            }
            C62447SCa c62447SCa = c3dp.A0B;
            boolean z = false;
            if (c62447SCa != null) {
                InterfaceC65594Tnc interfaceC65594Tnc = c62447SCa.A00.A0V;
                if (interfaceC65594Tnc == null) {
                    z = false;
                } else {
                    z = interfaceC65594Tnc.Ell();
                }
            } else {
                ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = c3dp.A0D;
                if (viewOnTouchListenerC65896Tw0 != null) {
                    C55942hf A04 = C55942hf.A04(20.0d, 12.0d);
                    C55982hj c55982hj = viewOnTouchListenerC65896Tw0.A0V;
                    c55982hj.A09(A04);
                    c55982hj.A06(viewOnTouchListenerC65896Tw0.A0E(viewOnTouchListenerC65896Tw0.A09) + (ViewOnTouchListenerC65896Tw0.A02(viewOnTouchListenerC65896Tw0) * 0.06d));
                    z = new Handler(Looper.getMainLooper()).postDelayed(new RunnableC71381Wsq(viewOnTouchListenerC65896Tw0), 750L);
                }
            }
            c3dp.A0Y = z;
        }
    };

    public C3DP(Activity activity, View view, AbstractC10360h2 abstractC10360h2, AbstractC12990ll abstractC12990ll, int i, boolean z) {
        this.A0r = i;
        this.A14 = z;
        this.A0s = activity;
        this.A0w = abstractC12990ll;
        this.A0y = new WeakReference(abstractC10360h2);
        this.A12 = AbstractC09440dt.A01(new C206839Do(view, 37));
        this.A13 = AbstractC09440dt.A01(new C206839Do(activity, 38));
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, abstractC12990ll, 36327103972718896L)) {
            ((InterfaceC56392iX) this.A12.getValue()).setVisibility(8);
            if (!C18U.A06(c06090Tz, abstractC12990ll, 36324630071882032L)) {
                ((InterfaceC56392iX) this.A12.getValue()).getView().setVisibility(8);
            }
        }
        this.A0A = A19;
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A08(0.0d, true);
        A02.A09(this.A0A);
        A02.A06 = true;
        this.A0u = A02;
        C3DU c3du = new C3DU();
        this.A0v = c3du;
        c3du.A00.add(new C3DV(this));
        java.util.Set set = C55772hI.A00(abstractC12990ll).A0O;
        set.add("bottom_sheet_component");
        set.add("action_sheet_fragment");
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        float translationY;
        C14360o3.A0B(c55982hj, 0);
        if (c55982hj.A01 == 1.0d) {
            A01(this).setClickable(this.A0N);
            translationY = 0.0f;
        } else {
            translationY = A02(this).getTranslationY();
        }
        this.A00 = translationY;
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (c55982hj.A01 == 0.0d) {
            A03();
            return;
        }
        ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = this.A0D;
        if (viewOnTouchListenerC65896Tw0 == null) {
            return;
        }
        viewOnTouchListenerC65896Tw0.A0I(false);
        viewOnTouchListenerC65896Tw0.Dnk(c55982hj);
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r0.A02 == false) goto L6;
     */
    @Override // X.InterfaceC55932he
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dnm(X.C55982hj r7) {
        /*
            r6 = this;
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.2hk r0 = r7.A09
            double r0 = r0.A00
            float r5 = (float) r0
            A06(r7, r6)
            double r3 = r7.A01
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L1d
            X.Gm7 r0 = r6.A0E
            r0.getClass()
            boolean r0 = r0.A02
            if (r0 != 0) goto L2e
        L1d:
            double r3 = r7.A01
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L46
            X.Gm7 r0 = r6.A0E
            r0.getClass()
            boolean r0 = r0.A01
            if (r0 == 0) goto L46
        L2e:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = A02(r6)
            int r0 = r0.getHeight()
            float r1 = (float) r0
            float r0 = r6.A00
            float r1 = r1 - r0
            float r2 = r2 * r1
            float r2 = r2 + r0
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = A02(r6)
            r0.setTranslationY(r2)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3DP.Dnm(X.2hj):void");
    }

    public static final TouchInterceptorFrameLayout A01(C3DP c3dp) {
        Object value = c3dp.A16.getValue();
        C14360o3.A07(value);
        return (TouchInterceptorFrameLayout) value;
    }

    public static final TouchInterceptorFrameLayout A02(C3DP c3dp) {
        Object value = c3dp.A17.getValue();
        C14360o3.A07(value);
        return (TouchInterceptorFrameLayout) value;
    }

    private final void A03() {
        ((TouchInterceptorFrameLayout) ((InterfaceC56392iX) this.A12.getValue()).getView()).COs(null);
        A02(this).COs(null);
        if (Systrace.A0E(1L)) {
            C0fO.A01("IgBottomSheetNavigator::restoreOtherViewsImportantForAccessibilityValues", -2120970585);
        }
        try {
            Map map = this.A0z;
            for (View view : map.keySet()) {
                Object obj = map.get(view);
                if (obj != null) {
                    view.setImportantForAccessibility(((Number) obj).intValue());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            map.clear();
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1145576444);
            }
            Context context = A02(this).getContext();
            C14360o3.A0C(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            int i = this.A05;
            if (i != 255) {
                AbstractC56402iY.A02(activity, i);
                this.A05 = 255;
            }
            ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = this.A0D;
            if (viewOnTouchListenerC65896Tw0 != null) {
                viewOnTouchListenerC65896Tw0.A0G();
            }
            this.A0D = null;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: X.9Qq
                @Override // java.lang.Runnable
                public final void run() {
                    C3DP c3dp = C3DP.this;
                    AbstractC10360h2 abstractC10360h2 = (AbstractC10360h2) c3dp.A0y.get();
                    if (abstractC10360h2 == null) {
                        C0w9.A03(AbstractC111324zv.A00(291), "FragmentManager is null onFinish");
                        return;
                    }
                    if (!abstractC10360h2.A11()) {
                        try {
                            if (c3dp.A14) {
                                abstractC10360h2.A18("BottomSheetConstants.FRAGMENT_TAG", 1);
                            } else {
                                abstractC10360h2.A12();
                            }
                        } catch (ClassCastException e) {
                            String message = e.getMessage();
                            AbstractC12120kG.A04("BottomSheetNavigator:popBackStackImmediate", message != null ? message : "failed to pop backstack", 817905253, e);
                        } catch (IllegalArgumentException | IllegalStateException e2) {
                            String message2 = e2.getMessage();
                            C0w9.A03("BottomSheetNavigator:popBackStackImmediate", message2 != null ? message2 : "failed to pop backstack");
                        }
                    }
                    synchronized (c3dp) {
                        c3dp.A0u.A0D.clear();
                        c3dp.A0E = null;
                        C3DP.A02(c3dp).setTranslationY(0.0f);
                        c3dp.A0S = false;
                        C3DP.A01(c3dp).setClickable(false);
                        c3dp.A08 = null;
                        c3dp.A0F = null;
                        c3dp.A0G = null;
                        c3dp.A0R = false;
                        if (c3dp.A0p == null) {
                            ((InterfaceC56392iX) c3dp.A12.getValue()).setVisibility(8);
                        }
                        c3dp.A00 = 0.0f;
                        c3dp.A0h = false;
                        c3dp.A0g = false;
                        c3dp.A0n = false;
                        c3dp.A0o = false;
                        c3dp.A0b = false;
                        c3dp.A0i = false;
                        c3dp.A0Y = false;
                        c3dp.A07 = 0L;
                        c3dp.A0E();
                        c3dp.A0B = null;
                        c3dp.A0p = null;
                        c3dp.A0a = false;
                        java.util.Set set = c3dp.A10;
                        Iterator it = new LinkedHashSet(set).iterator();
                        while (it.hasNext()) {
                            ((InterfaceC86363t8) it.next()).DB6();
                        }
                        set.clear();
                        C7XU c7xu = c3dp.A0H;
                        c3dp.A0H = null;
                        if (c7xu != null) {
                            c7xu.DAy();
                        }
                        c3dp.A0K = C05F.A02;
                        c3dp.A0I = null;
                    }
                    Activity activity2 = c3dp.A0s;
                    AbstractC12990ll abstractC12990ll = c3dp.A0w;
                    AbstractC167007dF.A1K(activity2, abstractC12990ll);
                    C55782hJ A00 = C55772hI.A00(abstractC12990ll);
                    InterfaceC11380iw A01 = C150856qj.A01(activity2);
                    if (A01 != null) {
                        C55782hJ.A01(A00, A01, null);
                    }
                    c3dp.A0k = false;
                }
            });
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(2037960822);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (com.instagram.igds.components.bottomsheet.BottomSheetFragment.A00(r1).A1S != false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.1vN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(androidx.fragment.app.Fragment r7, X.C3DP r8, java.lang.Integer r9) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3DP.A05(androidx.fragment.app.Fragment, X.3DP, java.lang.Integer):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.7hA, java.lang.Object] */
    public static final void A06(C55982hj c55982hj, C3DP c3dp) {
        int i;
        float f = (float) c55982hj.A09.A00;
        C37910Gm7 c37910Gm7 = c3dp.A0E;
        if (c37910Gm7 != null && c37910Gm7.A00) {
            double d = c55982hj.A01;
            if ((d == 0.0d || d == 1.0d) && !c3dp.A0Z) {
                A01(c3dp).setAlpha(f);
                Activity activity = c3dp.A0s;
                if (AbstractC13180m4.A02(activity)) {
                    View view = (View) c3dp.A13.getValue();
                    if (view != null) {
                        view.setAlpha(f);
                        return;
                    }
                    return;
                }
                int i2 = c3dp.A05;
                if (i2 == 255 || (i = c3dp.A03) == 255) {
                    return;
                }
                Object evaluate = new Object().evaluate(f, Integer.valueOf(i2), Integer.valueOf(i));
                C14360o3.A0C(evaluate, "null cannot be cast to non-null type kotlin.Int");
                AbstractC56402iY.A02(activity, ((Number) evaluate).intValue());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A07(android.view.MotionEvent r8, androidx.fragment.app.Fragment r9, X.C3DP r10) {
        /*
            boolean r0 = r10.A0q
            r6 = 1
            if (r0 == 0) goto Lc
            int r0 = r8.getActionMasked()
            if (r0 == 0) goto Lc
        Lb:
            return r6
        Lc:
            boolean r0 = r10.A0e
            if (r0 != 0) goto Lb
            boolean r0 = r9 instanceof X.InterfaceC189488aT
            if (r0 == 0) goto L5a
            X.8aT r9 = (X.InterfaceC189488aT) r9
            android.view.View r0 = r9.C5a()
        L1a:
            boolean r1 = r10.A0R
            if (r1 == 0) goto L56
            if (r0 == 0) goto L56
            int[] r7 = r10.A18
            r0.getLocationOnScreen(r7)
            android.graphics.Rect r5 = r10.A15
            r1 = 0
            r4 = r7[r1]
            r3 = r7[r6]
            int r2 = r0.getWidth()
            int r2 = r2 + r4
            r1 = r7[r6]
            int r0 = r0.getHeight()
            int r1 = r1 + r0
            r5.set(r4, r3, r2, r1)
            float r0 = r8.getRawX()
            int r1 = java.lang.Math.round(r0)
            float r0 = r8.getRawY()
            int r0 = java.lang.Math.round(r0)
            boolean r0 = r5.contains(r1, r0)
            r10.A0q = r0
            if (r0 == 0) goto L55
        L53:
            r10.A0i = r6
        L55:
            return r0
        L56:
            r10.A0q = r6
            r0 = 1
            goto L53
        L5a:
            android.view.View r0 = r9.mView
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3DP.A07(android.view.MotionEvent, androidx.fragment.app.Fragment, X.3DP):boolean");
    }

    public final Integer A0b(Float f) {
        if (f == null) {
            return C05F.A1F;
        }
        float floatValue = f.floatValue();
        ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = this.A0D;
        if (viewOnTouchListenerC65896Tw0 != null && viewOnTouchListenerC65896Tw0.A0J(floatValue)) {
            return C05F.A0u;
        }
        return C05F.A0j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final View A00(C3DP c3dp) {
        Fragment A09 = c3dp.A09();
        if (A09 instanceof InterfaceC189488aT) {
            return ((InterfaceC189488aT) A09).C5a();
        }
        if (A09 != 0) {
            return A09.mView;
        }
        return null;
    }

    public static final void A04(View view, C3DP c3dp) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != view) {
                    c3dp.A0z.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                }
            }
        }
        if (parent instanceof View) {
            A04((View) parent, c3dp);
        }
    }
}
