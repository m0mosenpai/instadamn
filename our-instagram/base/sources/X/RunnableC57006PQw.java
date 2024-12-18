package X;

import android.view.View;
import android.widget.ScrollView;

/* renamed from: X.PQw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57006PQw implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ N68 A01;

    public RunnableC57006PQw(View view, N68 n68) {
        this.A01 = n68;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScrollView scrollView = this.A01.A02;
        if (scrollView != null) {
            scrollView.smoothScrollTo(0, this.A00.getBottom());
        }
    }
}
