package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes11.dex */
public final class WL8 implements View.OnAttachStateChangeListener {
    public final int A00;
    public final Object A01;

    public WL8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (3 - this.A00 == 0) {
            C66305U8d.A04(view, (C66305U8d) this.A01);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        switch (this.A00) {
            case 0:
                UDJ udj = (UDJ) this.A01;
                ViewTreeObserver viewTreeObserver2 = udj.A07;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        udj.A07 = view.getViewTreeObserver();
                    }
                    viewTreeObserver = udj.A07;
                    onGlobalLayoutListener = udj.A0J;
                    viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                UDK udk = (UDK) this.A01;
                ViewTreeObserver viewTreeObserver3 = udk.A04;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        udk.A04 = view.getViewTreeObserver();
                    }
                    viewTreeObserver = udk.A04;
                    onGlobalLayoutListener = udk.A0D;
                    viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                if (((AbstractC62752SPj) this.A01).A07) {
                    return;
                }
                AbstractC62752SPj.A00(view);
                return;
            case 3:
                C66305U8d.A03(view, (C66305U8d) this.A01);
                return;
            default:
                HMW hmw = (HMW) this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                hmw.A03.removeCallbacksAndMessages(null);
                return;
        }
    }
}
