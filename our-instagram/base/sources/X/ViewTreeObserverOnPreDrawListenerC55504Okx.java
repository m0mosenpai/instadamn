package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.facebook.browser.lite.webview.SystemWebView;

/* renamed from: X.Okx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewTreeObserverOnPreDrawListenerC55504Okx implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewTreeObserverOnPreDrawListenerC55504Okx(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        R7V r7v;
        InterfaceC65575Tn9 interfaceC65575Tn9;
        View B7m;
        TextView textView;
        CharSequence A01;
        CharSequence charSequence;
        switch (this.A00) {
            case 0:
                View view = (View) this.A01;
                MSX.A13(view, this);
                C50649MXo c50649MXo = (C50649MXo) this.A02;
                if (c50649MXo.A01) {
                    view.setVisibility(0);
                    ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f).start();
                    c50649MXo.A01 = false;
                    return false;
                }
                return false;
            case 1:
                textView = (TextView) this.A02;
                MSX.A13(textView, this);
                C38522Gwi c38522Gwi = (C38522Gwi) this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                JPd jPd = c38522Gwi.A01;
                jPd.getClass();
                A01 = C85963sQ.A01(textView, jPd.getUsername());
                textView.setText(A01);
                return true;
            case 2:
                MSX.A13((View) this.A02, this);
                AbstractC166987dD.A1Y(this.A01);
                return true;
            case 3:
                MSX.A13((View) this.A01, this);
                C63946SwL c63946SwL = ((TGJ) this.A02).A06.A00;
                QF6 qf6 = c63946SwL.A00;
                if (qf6 == null || (r7v = ((SystemWebView) qf6).A04) == null || (interfaceC65575Tn9 = c63946SwL.A01) == null || (B7m = interfaceC65575Tn9.B7m()) == null) {
                    return true;
                }
                C63946SwL.A01(r7v, B7m, c63946SwL, 250L);
                return true;
            case 4:
                View view2 = (View) this.A01;
                view2.setVisibility(8);
                MSX.A13(view2, this);
                C9SV c9sv = (C9SV) this.A02;
                OA0 oa0 = c9sv.A05;
                ((C8NW) oa0.A01.A1h.get()).A1G(c9sv, oa0.A00, oa0.A02);
                return true;
            default:
                textView = ((C51335Mlw) this.A01).A01;
                C51820MvO c51820MvO = (C51820MvO) this.A02;
                MSX.A13(textView, this);
                if (c51820MvO.A08) {
                    charSequence = C85963sQ.A01(textView, c51820MvO.A06);
                } else {
                    charSequence = c51820MvO.A06;
                }
                A01 = charSequence;
                textView.setText(A01);
                return true;
        }
    }
}
