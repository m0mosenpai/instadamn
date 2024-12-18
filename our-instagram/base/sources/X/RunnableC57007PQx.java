package X;

import android.view.View;
import android.widget.ScrollView;

/* renamed from: X.PQx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57007PQx implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C52567NNn A01;

    public RunnableC57007PQx(View view, C52567NNn c52567NNn) {
        this.A01 = c52567NNn;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScrollView scrollView = this.A01.A01;
        if (scrollView != null) {
            scrollView.smoothScrollTo(0, this.A00.getBottom());
        }
    }
}
