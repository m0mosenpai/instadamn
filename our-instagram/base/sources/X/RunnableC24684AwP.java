package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.AwP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24684AwP implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ AnonymousClass983 A01;

    public RunnableC24684AwP(Drawable drawable, AnonymousClass983 anonymousClass983) {
        this.A01 = anonymousClass983;
        this.A00 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A01.A07;
        if (touchInterceptorFrameLayout != null) {
            View findViewById = touchInterceptorFrameLayout.getRootView().findViewById(R.id.thread_background_view);
            if (findViewById != null) {
                findViewById.setBackground(this.A00);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
