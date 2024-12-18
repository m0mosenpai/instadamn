package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.secure.securewebview.SecureWebView;

/* renamed from: X.TLa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64589TLa implements Runnable {
    public final /* synthetic */ C63279Sge A00;

    public RunnableC64589TLa(C63279Sge c63279Sge) {
        this.A00 = c63279Sge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C63279Sge c63279Sge = this.A00;
        ViewGroup viewGroup = c63279Sge.A01;
        if (viewGroup == null) {
            return;
        }
        while (viewGroup.getChildCount() > 0) {
            View childAt = viewGroup.getChildAt(0);
            if (childAt instanceof SecureWebView) {
                AbstractC62806SSa.A00((SecureWebView) childAt);
            }
            viewGroup.removeView(childAt);
        }
        if (!c63279Sge.A02) {
            c63279Sge.A02 = true;
        }
        c63279Sge.A01 = null;
    }
}
