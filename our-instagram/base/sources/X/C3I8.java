package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.3I8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3I8 implements C3I9 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public View A05;
    public View A06;
    public WindowManager A07;
    public WeakReference A08;
    public boolean A09;
    public boolean A0A;
    public int A0B;
    public View.OnAttachStateChangeListener A0C;
    public ViewTreeObserver.OnGlobalLayoutListener A0D;
    public Integer A0E;
    public boolean A0F;
    public final java.util.Set A0G;
    public final InterfaceC09390do A0H;
    public final C03L A0I;
    public final String A0J;

    public C3I8(String str, boolean z) {
        C14360o3.A0B(str, 1);
        this.A0J = str;
        this.A0F = z;
        this.A0E = C05F.A00;
        this.A0G = new CopyOnWriteArraySet();
        this.A03 = -1;
        this.A01 = -1;
        this.A02 = -1;
        this.A04 = -1;
        this.A0I = new C03L() { // from class: X.3IA
            @Override // X.C03L
            public final C011504d Cx7(View view, C011504d c011504d) {
                C14360o3.A0B(view, 0);
                C14360o3.A0B(c011504d, 1);
                C3I8 c3i8 = C3I8.this;
                c3i8.A00 = c011504d.A00.A01().A00;
                View view2 = c3i8.A05;
                if (view2 != null && view2.isAttachedToWindow()) {
                    return AbstractC010103p.A05(view2, c011504d);
                }
                try {
                    return AbstractC010103p.A05(view, c011504d);
                } catch (Throwable th) {
                    String obj = C3I8.class.toString();
                    C14360o3.A07(obj);
                    C0w9.A07(obj, th);
                    return c011504d;
                }
            }
        };
        this.A0H = AbstractC09440dt.A00(EnumC09460dv.A03, new C9E0(this, 14));
    }

    @Override // X.C3I9
    public final void DiY() {
        this.A03 = -1;
        this.A0A = true;
    }

    @Override // X.C3I9
    public final void Edy(boolean z) {
        this.A09 = true;
    }

    private final void A00() {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        View view = this.A06;
        if (view != null && (onAttachStateChangeListener = this.A0C) != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.A0C = null;
        View view2 = this.A05;
        if (view2 != null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.A0D;
            if (onGlobalLayoutListener != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                AbstractC008903d.A00(view2, null);
                if (view2.getParent() != null) {
                    WindowManager windowManager = this.A07;
                    if (AbstractC15930qn.A02.A0V) {
                        C14120nc.A00().ATO(new V6O(this.A05, this));
                    } else if (AbstractC15930qn.A02.A0W) {
                        this.A07 = null;
                        this.A05 = null;
                    } else if (windowManager != null) {
                        windowManager.removeView(view2);
                        this.A07 = null;
                        this.A05 = null;
                    }
                }
                this.A0B = 0;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private final void A01(final Activity activity) {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        if (this.A0F) {
            onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.7h5
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    View view;
                    C3I8 c3i8 = this;
                    if ((!c3i8.A0G.isEmpty()) && (view = c3i8.A05) != null) {
                        boolean isInMultiWindowMode = activity.isInMultiWindowMode();
                        int height = view.getHeight();
                        if (c3i8.A04 != height) {
                            C3I8.A05(c3i8, height, isInMultiWindowMode);
                            c3i8.A04 = height;
                        }
                    }
                }
            };
        } else {
            onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.3Nk
                /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
                
                    if ((r0.getAttributes().flags & 1024) != 0) goto L19;
                 */
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onGlobalLayout() {
                    /*
                        Method dump skipped, instructions count: 277
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnGlobalLayoutListenerC72633Nk.onGlobalLayout():void");
                }
            };
        }
        this.A0D = onGlobalLayoutListener;
        View view = this.A05;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.A0D);
            AbstractC008903d.A00(view, this.A0I);
        }
    }

    public static final void A02(final Activity activity, final View view, final WindowManager.LayoutParams layoutParams, final WindowManager windowManager) {
        if (((Boolean) AbstractC15930qn.A02.A00.invoke()).booleanValue()) {
            final Runnable runnable = new Runnable() { // from class: X.4z1
                @Override // java.lang.Runnable
                public final void run() {
                    View view2;
                    WindowManager windowManager2;
                    if (!activity.isFinishing() && (view2 = view) != null && (windowManager2 = windowManager) != null) {
                        windowManager2.addView(view2, layoutParams);
                    }
                }
            };
            C11T.A07(false, new Runnable() { // from class: X.4z2
                @Override // java.lang.Runnable
                public final void run() {
                    Looper.myQueue().addIdleHandler(new C43610JQr(runnable));
                }
            });
        } else {
            if (windowManager == null) {
                return;
            }
            windowManager.addView(view, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc A[Catch: all -> 0x010e, TryCatch #4 {all -> 0x010e, blocks: (B:47:0x00ec, B:49:0x00f2, B:50:0x00f8, B:52:0x00fc, B:53:0x00ff, B:55:0x010b), top: B:46:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b A[Catch: all -> 0x010e, TRY_LEAVE, TryCatch #4 {all -> 0x010e, blocks: (B:47:0x00ec, B:49:0x00f2, B:50:0x00f8, B:52:0x00fc, B:53:0x00ff, B:55:0x010b), top: B:46:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0161 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #2 {all -> 0x0189, blocks: (B:79:0x0157, B:81:0x0161), top: B:78:0x0157 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(android.app.Activity r17, X.C3I8 r18) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3I8.A03(android.app.Activity, X.3I8):void");
    }

    public static final void A04(C3I8 c3i8, int i) {
        for (InterfaceC60152ox interfaceC60152ox : c3i8.A0G) {
            boolean z = false;
            if (c3i8.A0B == 48) {
                z = true;
            }
            interfaceC60152ox.DOK(i, z);
        }
    }

    public static final void A05(C3I8 c3i8, int i, boolean z) {
        int A06;
        int i2;
        C011504d A00;
        int i3;
        int i4;
        View view = c3i8.A06;
        int i5 = Build.VERSION.SDK_INT;
        WindowMetrics windowMetrics = null;
        int i6 = 0;
        if (i5 >= 30) {
            WindowManager windowManager = c3i8.A07;
            if (windowManager != null) {
                windowMetrics = windowManager.getCurrentWindowMetrics();
                A06 = windowMetrics.getBounds().height();
            }
            A06 = 0;
        } else {
            if (view != null) {
                Context context = view.getContext();
                C14360o3.A07(context);
                A06 = AbstractC13880nE.A06(context);
            }
            A06 = 0;
        }
        if (z) {
            if (!C1AD.A06(C06090Tz.A05, 18303565772691172L) && view != null) {
                Context context2 = view.getContext();
                C14360o3.A07(context2);
                i4 = AbstractC13880nE.A08(context2);
            } else {
                i4 = 0;
            }
            i3 = (A06 - i) - i4;
            if (i3 < 0) {
                i3 = 0;
            }
        } else {
            if (i5 >= 30 && windowMetrics != null) {
                WindowInsets windowInsets = windowMetrics.getWindowInsets();
                C14360o3.A07(windowInsets);
                i2 = windowInsets.getInsets(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout()).bottom;
                i6 = windowInsets.getInsets(WindowInsets.Type.statusBars()).top;
            } else if (view != null && (A00 = AbstractC009003e.A00(view)) != null) {
                C011304b c011304b = A00.A00;
                i6 = c011304b.A05(1).A03;
                i2 = c011304b.A05(2).A00;
            } else {
                i2 = 0;
            }
            View view2 = c3i8.A06;
            C14360o3.A0A(view2);
            Context context3 = view2.getContext();
            C14360o3.A07(context3);
            int A02 = AbstractC13440mV.A02(context3);
            if (i6 == 0 && A02 > 0) {
                i6 = A02;
            }
            i3 = ((A06 - i2) - i) - i6;
        }
        A04(c3i8, i3);
    }

    @Override // X.C3I9
    public final void A9e(InterfaceC60152ox interfaceC60152ox) {
        if (interfaceC60152ox != null) {
            this.A0G.add(interfaceC60152ox);
        }
    }

    @Override // X.C3I9
    public final void Dnr(final Activity activity) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            View decorView = window.getDecorView();
            this.A06 = decorView;
            if (decorView != null && decorView.getWindowToken() != null) {
                A03(activity, this);
                return;
            }
            if (this.A0C != null) {
                return;
            }
            View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: X.3IB
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                    C3I8.A03(activity, this);
                }
            };
            this.A0C = onAttachStateChangeListener;
            View view = this.A06;
            if (view == null) {
                return;
            }
            view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    @Override // X.C3I9
    public final void EFx(InterfaceC60152ox interfaceC60152ox) {
        if (interfaceC60152ox != null) {
            this.A0G.remove(interfaceC60152ox);
        }
    }

    @Override // X.C3I9
    public final void Eph(Activity activity) {
        if (!this.A0F) {
            this.A0F = true;
            View view = this.A05;
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.A0D;
            if (view != null && onGlobalLayoutListener != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            A01(activity);
        }
    }

    @Override // X.C3I9
    public final boolean isStarted() {
        if (this.A06 == null) {
            return false;
        }
        return true;
    }

    @Override // X.C3I9
    public final void onDestroy() {
        this.A0G.clear();
        if (((Boolean) AbstractC15930qn.A02.A0K.invoke()).booleanValue()) {
            this.A08 = null;
            AbstractC12860lY.A08((AbstractC18730w0) this.A0H.getValue());
        }
        this.A0E = C05F.A0N;
    }

    @Override // X.C3I9
    public final void onStop() {
        if (this.A0E.intValue() == 1) {
            A00();
            this.A06 = null;
            this.A0E = C05F.A0C;
        }
    }
}
