package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.Sog, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC63513Sog implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ QEV A01;
    public final /* synthetic */ String A02;

    public ViewTreeObserverOnGlobalLayoutListenerC63513Sog(View view, QEV qev, String str) {
        this.A00 = view;
        this.A01 = qev;
        this.A02 = str;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        long j;
        View view = this.A00;
        if (view.getViewTreeObserver().isAlive()) {
            QEV qev = this.A01;
            QER qer = qev.A01;
            Integer num = C05F.A00;
            String str = ((AbstractC58879QEp) qev).A02;
            String str2 = this.A02;
            String str3 = qev.A02.A0A;
            if (str3 != null) {
                j = Long.parseLong(str3);
            } else {
                j = 0;
            }
            qer.A0G(num, str, str2, j);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
