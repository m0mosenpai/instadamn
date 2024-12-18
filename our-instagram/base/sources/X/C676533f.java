package X;

import android.app.Activity;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Adapter;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.33f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C676533f extends AbstractC60592pi {
    public int A00;
    public int A01;
    public long A02;
    public C18920wW A03;
    public C38321qM A04;
    public ViewOnTouchListenerC676833i A05;
    public final UserSession A06;
    public final InterfaceC60442pS A07;
    public final DataSetObserver A08;
    public final C676633g A09;

    public C676533f(Activity activity, Adapter adapter, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(activity, 2);
        C14360o3.A0B(interfaceC60442pS, 4);
        this.A06 = userSession;
        this.A07 = interfaceC60442pS;
        C676633g c676633g = new C676633g(this);
        this.A09 = c676633g;
        DataSetObserver dataSetObserver = new DataSetObserver() { // from class: X.33h
            @Override // android.database.DataSetObserver
            public final void onChanged() {
                super.onChanged();
                ViewOnTouchListenerC676833i viewOnTouchListenerC676833i = C676533f.this.A05;
                if (viewOnTouchListenerC676833i == null) {
                    C14360o3.A0F("simpleZoomableViewController");
                    throw C00O.createAndThrow();
                }
                if (!viewOnTouchListenerC676833i.isIdle()) {
                    viewOnTouchListenerC676833i.A0K = true;
                }
            }

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                super.onInvalidated();
                ViewOnTouchListenerC676833i viewOnTouchListenerC676833i = C676533f.this.A05;
                if (viewOnTouchListenerC676833i == null) {
                    C14360o3.A0F("simpleZoomableViewController");
                    throw C00O.createAndThrow();
                }
                if (!viewOnTouchListenerC676833i.isIdle()) {
                    viewOnTouchListenerC676833i.A0K = true;
                }
            }
        };
        this.A08 = dataSetObserver;
        Activity parent = activity.getParent();
        parent = parent == null ? activity : parent;
        View decorView = parent.getWindow().getDecorView();
        C14360o3.A0C(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) decorView;
        ViewOnTouchListenerC676833i viewOnTouchListenerC676833i = new ViewOnTouchListenerC676833i(viewGroup, true);
        this.A05 = viewOnTouchListenerC676833i;
        viewOnTouchListenerC676833i.A0I = c676633g;
        if (parent.getWindow() != null) {
            Window window = activity.getWindow();
            C14360o3.A07(window);
            AbstractC13440mV.A05(window);
            viewGroup.requestApplyInsets();
        }
        if (adapter != null) {
            adapter.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void A01(View view, InterfaceC73933Tf interfaceC73933Tf, C38321qM c38321qM, ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk, int i, int i2) {
        C14360o3.A0B(interfaceC73933Tf, 0);
        this.A00 = i;
        this.A01 = i2;
        this.A04 = c38321qM;
        this.A02 = System.currentTimeMillis();
        ViewOnTouchListenerC676833i viewOnTouchListenerC676833i = this.A05;
        if (viewOnTouchListenerC676833i == null) {
            C14360o3.A0F("simpleZoomableViewController");
            throw C00O.createAndThrow();
        }
        viewOnTouchListenerC676833i.EoL(view, interfaceC73933Tf, scaleGestureDetectorOnScaleGestureListenerC81153jk);
    }

    public static final void A00(C676533f c676533f, boolean z) {
        int i;
        ViewOnTouchListenerC676833i viewOnTouchListenerC676833i = c676533f.A05;
        if (viewOnTouchListenerC676833i == null) {
            C14360o3.A0F("simpleZoomableViewController");
            throw C00O.createAndThrow();
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = viewOnTouchListenerC676833i.A0E;
        if (touchInterceptorFrameLayout != null) {
            int systemUiVisibility = touchInterceptorFrameLayout.getSystemUiVisibility();
            int i2 = systemUiVisibility & (-5);
            if (!z) {
                i2 = systemUiVisibility | 256 | 4;
            }
            touchInterceptorFrameLayout.setSystemUiVisibility(i2);
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = viewOnTouchListenerC676833i.A0E;
        if (touchInterceptorFrameLayout2 != null) {
            int systemUiVisibility2 = touchInterceptorFrameLayout2.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility2 & (-513) & (-3);
            } else {
                i = systemUiVisibility2 | 256 | 512 | 2;
            }
            touchInterceptorFrameLayout2.setSystemUiVisibility(i);
        }
    }

    public final boolean A02() {
        ViewOnTouchListenerC676833i viewOnTouchListenerC676833i = this.A05;
        if (viewOnTouchListenerC676833i == null) {
            C14360o3.A0F("simpleZoomableViewController");
            throw C00O.createAndThrow();
        }
        if (viewOnTouchListenerC676833i.A0J != C05F.A01) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        ViewOnTouchListenerC676833i viewOnTouchListenerC676833i = this.A05;
        if (viewOnTouchListenerC676833i == null) {
            C14360o3.A0F("simpleZoomableViewController");
            throw C00O.createAndThrow();
        }
        viewOnTouchListenerC676833i.start();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        ViewOnTouchListenerC676833i viewOnTouchListenerC676833i = this.A05;
        if (viewOnTouchListenerC676833i == null) {
            C14360o3.A0F("simpleZoomableViewController");
            throw C00O.createAndThrow();
        }
        viewOnTouchListenerC676833i.stop();
    }
}
