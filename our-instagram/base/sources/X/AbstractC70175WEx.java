package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.facebook.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.List;

/* renamed from: X.WEx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70175WEx {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Rect A05;
    public final Context A06;
    public final ViewGroup A07;
    public final AccessibilityManager A08;
    public final UBZ A09;
    public final X86 A0A;
    public static final int[] A0E = {R.attr.snackbarStyle};
    public static final Handler A0D = new Handler(Looper.getMainLooper(), new WIX(1));
    public final ViewTreeObserver.OnGlobalLayoutListener A0B = new WOE(this, 11);
    public final Runnable A0C = new RunnableC71297WrR(this);
    public X87 A04 = new WcV(this);

    public abstract int A03();

    public static void A01(AbstractC70175WEx abstractC70175WEx) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = abstractC70175WEx.A08;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            abstractC70175WEx.A09.post(new RunnableC71296WrQ(abstractC70175WEx));
            return;
        }
        UBZ ubz = abstractC70175WEx.A09;
        if (ubz.getParent() != null) {
            ubz.setVisibility(0);
        }
        abstractC70175WEx.A06();
    }

    public static void A02(AbstractC70175WEx abstractC70175WEx) {
        Rect rect;
        UBZ ubz = abstractC70175WEx.A09;
        ViewGroup.LayoutParams layoutParams = ubz.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (rect = abstractC70175WEx.A05) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = rect.bottom + abstractC70175WEx.A01;
            marginLayoutParams.leftMargin = rect.left + abstractC70175WEx.A02;
            marginLayoutParams.rightMargin = rect.right + abstractC70175WEx.A03;
            ubz.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && abstractC70175WEx.A00 > 0) {
                ViewGroup.LayoutParams layoutParams2 = ubz.getLayoutParams();
                if ((layoutParams2 instanceof C56292iI) && (((C56292iI) layoutParams2).A0A instanceof SwipeDismissBehavior)) {
                    Runnable runnable = abstractC70175WEx.A0C;
                    ubz.removeCallbacks(runnable);
                    ubz.post(runnable);
                    return;
                }
                return;
            }
            return;
        }
        android.util.Log.w("BaseTransientBottomBar", "Unable to update margins because layout params are not MarginLayoutParams");
    }

    public AbstractC70175WEx(Context context, View view, ViewGroup viewGroup, X86 x86) {
        if (view != null) {
            if (x86 != null) {
                this.A07 = viewGroup;
                this.A0A = x86;
                this.A06 = context;
                C65M.A03(context, "Theme.AppCompat", C65M.A00);
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = this.A06.obtainStyledAttributes(A0E);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                UBZ ubz = (UBZ) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
                this.A09 = ubz;
                if (view instanceof SnackbarContentLayout) {
                    SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                    float f = ubz.A05;
                    if (f != 1.0f) {
                        snackbarContentLayout.A00.setTextColor(AbstractC69853Vwe.A00(f, AbstractC1343565e.A01(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.A00.getCurrentTextColor()));
                    }
                }
                ubz.addView(view);
                ViewGroup.LayoutParams layoutParams = ubz.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    this.A05 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                }
                ubz.setAccessibilityLiveRegion(1);
                ubz.setImportantForAccessibility(1);
                ubz.setFitsSystemWindows(true);
                AbstractC008903d.A00(ubz, new C65799TuH(this, 2));
                AbstractC010103p.A0B(ubz, new UEP(this, 9));
                this.A08 = (AccessibilityManager) context.getSystemService("accessibility");
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null content");
    }

    public final void A04() {
        C70194WFy A00 = C70194WFy.A00();
        int A03 = A03();
        X87 x87 = this.A04;
        synchronized (A00.A03) {
            if (C70194WFy.A03(x87, A00)) {
                C69083VhZ c69083VhZ = A00.A00;
                c69083VhZ.A00 = A03;
                A00.A02.removeCallbacksAndMessages(c69083VhZ);
                C70194WFy.A01(A00.A00, A00);
            } else {
                C69083VhZ c69083VhZ2 = A00.A01;
                if (c69083VhZ2 != null && x87 != null && c69083VhZ2.A02.get() == x87) {
                    c69083VhZ2.A00 = A03;
                } else {
                    A00.A01 = new C69083VhZ(x87, A03);
                }
                C69083VhZ c69083VhZ3 = A00.A00;
                if (c69083VhZ3 == null || !C70194WFy.A04(c69083VhZ3, A00, 4)) {
                    A00.A00 = null;
                    C70194WFy.A02(A00);
                }
            }
        }
    }

    public final void A05() {
        C70194WFy A00 = C70194WFy.A00();
        X87 x87 = this.A04;
        synchronized (A00.A03) {
            if (C70194WFy.A03(x87, A00)) {
                A00.A00 = null;
                if (A00.A01 != null) {
                    C70194WFy.A02(A00);
                }
            }
        }
        UBZ ubz = this.A09;
        ViewParent parent = ubz.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(ubz);
        }
    }

    public final void A06() {
        C70194WFy A00 = C70194WFy.A00();
        X87 x87 = this.A04;
        synchronized (A00.A03) {
            if (C70194WFy.A03(x87, A00)) {
                C70194WFy.A01(A00.A00, A00);
            }
        }
    }

    public final void A07(int i) {
        C69083VhZ c69083VhZ;
        C70194WFy A00 = C70194WFy.A00();
        X87 x87 = this.A04;
        synchronized (A00.A03) {
            if (C70194WFy.A03(x87, A00)) {
                c69083VhZ = A00.A00;
            } else {
                c69083VhZ = A00.A01;
                if (c69083VhZ != null && x87 != null && c69083VhZ.A02.get() == x87) {
                }
            }
            C70194WFy.A04(c69083VhZ, A00, i);
        }
    }
}
