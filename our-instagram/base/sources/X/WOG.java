package X;

import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WOG implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C143866eU A00;
    public final /* synthetic */ C6ZR A01;

    public WOG(C143866eU c143866eU, C6ZR c6zr) {
        this.A01 = c6zr;
        this.A00 = c143866eU;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        C28350CfA c28350CfA = C28350CfA.A01;
        C6ZR c6zr = this.A01;
        UserSession userSession = ((C6ZL) c6zr).A01;
        C5SW c5sw = c6zr.A00;
        C143866eU c143866eU = this.A00;
        TextView textView = c143866eU.A01;
        synchronized (c28350CfA) {
            if (textView != null) {
                textView.postDelayed(new RunnableC71526WvV(userSession, c5sw), 500L);
            }
        }
        TextView textView2 = c143866eU.A01;
        if (textView2 != null && (viewTreeObserver = textView2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
