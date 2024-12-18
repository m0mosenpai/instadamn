package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.config.ReactFeatureFlags;

/* loaded from: classes10.dex */
public final class R6X extends Q4W implements XC4 {
    public int A00;
    public int A01;
    public InterfaceC65225TgH A02;
    public X9J A03;
    public C63362SiL A04;
    public final SZ4 A05;

    @Override // X.XC4
    public final void D35(MotionEvent motionEvent, View view) {
        X9J x9j = this.A03;
        if (x9j != null) {
            SZ4 sz4 = this.A05;
            if (!sz4.A01) {
                SZ4.A00(motionEvent, sz4, x9j);
                sz4.A01 = true;
                sz4.A00 = -1;
            }
            C63362SiL c63362SiL = this.A04;
            if (c63362SiL != null) {
                c63362SiL.A04(motionEvent, view, x9j);
            }
        }
    }

    @Override // X.Q4W, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C63362SiL c63362SiL;
        C14360o3.A0B(motionEvent, 0);
        X9J x9j = this.A03;
        if (x9j != null && (c63362SiL = this.A04) != null) {
            c63362SiL.A05(motionEvent, x9j, false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        C63362SiL c63362SiL;
        C14360o3.A0B(motionEvent, 0);
        X9J x9j = this.A03;
        if (x9j != null && (c63362SiL = this.A04) != null) {
            c63362SiL.A05(motionEvent, x9j, true);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // X.Q4W, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        X9J x9j = this.A03;
        if (x9j != null) {
            this.A05.A01(motionEvent, getReactContext(), x9j);
            C63362SiL c63362SiL = this.A04;
            if (c63362SiL != null) {
                c63362SiL.A05(motionEvent, x9j, true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // X.XC4
    public final void D30(MotionEvent motionEvent, View view) {
        if (this.A03 != null) {
            this.A05.A01 = false;
        }
        C63362SiL c63362SiL = this.A04;
        if (c63362SiL != null) {
            c63362SiL.A00 = -1;
        }
    }

    public final X9J getEventDispatcher$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_modal_modalAndroid() {
        return this.A03;
    }

    public final InterfaceC65225TgH getStateWrapper$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_modal_modalAndroid() {
        return null;
    }

    public R6X(Context context) {
        super(context);
        this.A05 = new SZ4(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.A04 = new C63362SiL(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final R3N getReactContext() {
        Context context = getContext();
        C14360o3.A0C(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return (R3N) context;
    }

    @Override // X.Q4W, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-584971480);
        super.onSizeChanged(i, i2, i3, i4);
        this.A01 = i;
        this.A00 = i2;
        WF1.A00(i);
        WF1.A00(i2);
        Q21.A00(getReactContext(), new R35(getReactContext(), this));
        C0f9.A0D(1009071715, A06);
    }

    @Override // X.Q4W, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(1526727920);
        C14360o3.A0B(motionEvent, 0);
        X9J x9j = this.A03;
        if (x9j != null) {
            this.A05.A01(motionEvent, getReactContext(), x9j);
            C63362SiL c63362SiL = this.A04;
            if (c63362SiL != null) {
                c63362SiL.A05(motionEvent, x9j, false);
            }
        }
        super.onTouchEvent(motionEvent);
        C0f9.A0C(1427069623, A05);
        return true;
    }

    public final void setEventDispatcher$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_modal_modalAndroid(X9J x9j) {
        this.A03 = x9j;
    }

    public final void setStateWrapper$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_modal_modalAndroid(InterfaceC65225TgH interfaceC65225TgH) {
        this.A02 = interfaceC65225TgH;
    }
}
