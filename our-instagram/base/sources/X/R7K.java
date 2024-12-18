package X;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.secure.securewebview.SecureWebView;

/* loaded from: classes10.dex */
public final class R7K extends SecureWebView {
    public boolean A00;
    public final R7P A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.R7P, X.SPs] */
    public R7K(Context context) {
        super(context);
        ?? abstractC62760SPs = new AbstractC62760SPs();
        this.A01 = abstractC62760SPs;
        this.A00 = false;
        C62990SaE c62990SaE = new C62990SaE();
        c62990SaE.A02();
        C62732SNx A01 = c62990SaE.A01();
        AbstractC58321PtD.A1C(this);
        AbstractC58321PtD.A1B(this);
        A02(abstractC62760SPs);
        getSettings().setJavaScriptEnabled(true);
        super.A01 = A01;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(1058660271);
        if (this.A00) {
            requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        C0f9.A0C(-580636826, A05);
        return onTouchEvent;
    }
}
