package X;

import com.facebook.R;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* loaded from: classes4.dex */
public final class B24 implements InterfaceC08830cm {
    public final /* synthetic */ AnonymousClass983 A00;

    public B24(AnonymousClass983 anonymousClass983) {
        this.A00 = anonymousClass983;
    }

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A00.A07;
        if (touchInterceptorFrameLayout != null) {
            return touchInterceptorFrameLayout.getRootView().findViewById(R.id.thread_background_view_overlay);
        }
        throw AbstractC166997dE.A0g();
    }
}
