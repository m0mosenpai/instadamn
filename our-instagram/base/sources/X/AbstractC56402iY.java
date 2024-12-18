package X;

import android.app.Activity;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* renamed from: X.2iY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC56402iY {
    public static int A00 = -1;
    public static boolean A01;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A04(Activity activity, Fragment fragment, int i, boolean z) {
        String moduleName;
        C14360o3.A0B(activity, 0);
        if (C1AD.A06(C06090Tz.A05, 18302839923151829L) && (fragment instanceof InterfaceC11380iw) && (moduleName = ((InterfaceC11380iw) fragment).getModuleName()) != null) {
            C0f5 AEp = C18950wb.A01.AEp("Unexpected call of StatusBarUtil.setDarkStatusBar().", 26617229);
            AEp.ABW("module_name", moduleName);
            AEp.report();
        } else {
            A03(activity, i);
            A06(activity, !z);
        }
    }

    public static final void A05(Activity activity, EnumC60772q1 enumC60772q1) {
        int A0H;
        C14360o3.A0B(enumC60772q1, 1);
        if (C1AD.A06(C06090Tz.A05, 18302839923151829L)) {
            int ordinal = enumC60772q1.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2 && ordinal != 1) {
                    return;
                } else {
                    A0H = R.color.fds_transparent;
                }
            } else {
                A0H = AbstractC53242c7.A0H(activity, R.attr.statusBarBackgroundColor);
            }
            A02(activity, activity.getColor(A0H));
            boolean z = true;
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal != 2 && ordinal != 4) {
                    if (ordinal == 3) {
                        z = A0A((Activity) AbstractC13320mI.A00(activity, Activity.class));
                    }
                } else {
                    z = false;
                }
            } else {
                z = !AbstractC72723Nt.A00(activity);
            }
            A06(activity, z);
        }
    }

    public static final void A08(Window window, boolean z) {
        C14360o3.A0B(window, 0);
        View decorView = window.getDecorView();
        C14360o3.A07(decorView);
        AbstractC008903d.A00(decorView, new WQP(z));
        decorView.requestApplyInsets();
    }

    public static final boolean A0B(View view, Window window) {
        C14360o3.A0B(view, 1);
        int i = window.getAttributes().flags & 1024;
        boolean z = false;
        if (i != 0) {
            z = true;
        }
        boolean z2 = false;
        if ((view.getSystemUiVisibility() & 4) == 4) {
            z2 = true;
        }
        if (!z && !z2) {
            return true;
        }
        return false;
    }

    public static final int A00(Activity activity) {
        int statusBarColor;
        if (activity != null) {
            if (activity.getWindow() == null || (statusBarColor = activity.getWindow().getStatusBarColor()) == -1) {
                TypedValue typedValue = new TypedValue();
                activity.getTheme().resolveAttribute(android.R.attr.statusBarColor, typedValue, true);
                return typedValue.data;
            }
            return statusBarColor;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 > 0) goto L9;
     */
    @kotlin.Deprecated(message = "For APIs >= 20, you should instead rely on [View.OnApplyWindowInsetsListener].")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A01(android.app.Activity r4) {
        /*
            int r0 = X.AbstractC56402iY.A00
            if (r0 >= 0) goto L21
            if (r4 == 0) goto L4a
            android.content.res.Resources r3 = r4.getResources()
            X.C14360o3.A07(r3)
            java.lang.String r2 = "status_bar_height"
            java.lang.String r1 = "dimen"
            java.lang.String r0 = "android"
            int r0 = r3.getIdentifier(r2, r1, r0)
            if (r0 <= 0) goto L22
            int r0 = r3.getDimensionPixelSize(r0)
            if (r0 <= 0) goto L22
        L1f:
            X.AbstractC56402iY.A00 = r0
        L21:
            return r0
        L22:
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L39
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.view.View r0 = r0.getDecorView()
            r0.getWindowVisibleDisplayFrame(r1)
            int r0 = r1.top
            if (r0 <= 0) goto L39
            goto L1f
        L39:
            r2 = 1
            r1 = 1103101952(0x41c00000, float:24.0)
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r2, r1, r0)
            int r0 = (int) r0
            return r0
        L4a:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC56402iY.A01(android.app.Activity):int");
    }

    public static final void A02(Activity activity, int i) {
        if (activity != null) {
            A03(activity, i);
            TypedValue typedValue = new TypedValue();
            boolean z = true;
            activity.getTheme().resolveAttribute(android.R.attr.windowLightStatusBar, typedValue, true);
            if (typedValue.type == 18 && typedValue.data == 0) {
                z = false;
            }
            A06(activity, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (X.AbstractC56402iY.A01 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if ((!X.AbstractC72723Nt.A00(r2)) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(android.app.Activity r2, boolean r3) {
        /*
            if (r2 == 0) goto L3e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L3e
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L3e
            if (r3 == 0) goto L19
            boolean r0 = X.AbstractC72723Nt.A00(r2)
            r0 = r0 ^ 1
            r3 = 1
            if (r0 != 0) goto L1a
        L19:
            r3 = 0
        L1a:
            android.view.Window r1 = r2.getWindow()
            X.C14360o3.A07(r1)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            X.C14360o3.A07(r0)
            X.04h r2 = new X.04h
            r2.<init>(r0, r1)
            if (r3 == 0) goto L38
            boolean r0 = X.AbstractC56402iY.A01
            r1 = 1
            if (r0 == 0) goto L39
        L38:
            r1 = 0
        L39:
            X.04f r0 = r2.A00
            r0.A05(r1)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC56402iY.A06(android.app.Activity, boolean):void");
    }

    public static final void A07(View view, Window window, boolean z) {
        if (view != null) {
            int systemUiVisibility = view.getSystemUiVisibility();
            if (z) {
                view.setSystemUiVisibility((systemUiVisibility & (-5)) | 256);
                window.clearFlags(1024);
            } else {
                view.setSystemUiVisibility((systemUiVisibility | 4) & (-257));
                window.setFlags(1024, 1024);
            }
        }
    }

    public static final boolean A09() {
        return C1AD.A06(C06090Tz.A05, 18302839923151829L);
    }

    public static final boolean A0A(Activity activity) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null && window.getDecorView() != null) {
            return new C011904h(activity.getWindow().getDecorView(), activity.getWindow()).A00.A07();
        }
        return false;
    }

    public static final void A03(Activity activity, int i) {
        while (activity.getParent() != null) {
            activity = activity.getParent();
        }
        Window window = activity.getWindow();
        if (window != null && window.getStatusBarColor() != i) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
        }
    }
}
