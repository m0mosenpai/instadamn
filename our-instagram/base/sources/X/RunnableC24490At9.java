package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.At9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24490At9 implements Runnable {
    public final /* synthetic */ View A00;

    public RunnableC24490At9(View view) {
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.A00;
        if (view.getLayoutParams() == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, C57992lC.A01());
        } else {
            layoutParams = view.getLayoutParams();
            view.getLayoutParams().width = -1;
            view.getLayoutParams().height = C57992lC.A01();
        }
        view.setLayoutParams(layoutParams);
        AbstractC13880nE.A0f(view, -C57992lC.A01());
    }
}
