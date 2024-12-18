package X;

import android.view.View;
import com.instagram.common.ui.base.IgFrameLayout;

/* loaded from: classes6.dex */
public final class GQU implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ IgFrameLayout A02;
    public final /* synthetic */ C3B1 A03;

    public GQU(View view, View view2, IgFrameLayout igFrameLayout, C3B1 c3b1) {
        this.A03 = c3b1;
        this.A02 = igFrameLayout;
        this.A00 = view;
        this.A01 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3B1 c3b1 = this.A03;
        if (c3b1.A02) {
            c3b1.A02 = false;
            IgFrameLayout igFrameLayout = this.A02;
            View view = this.A00;
            view.setOnClickListener(null);
            igFrameLayout.removeView(view);
            AbstractC125325le A01 = AbstractC125325le.A01(this.A01, 0);
            A01.A0G();
            AbstractC125325le A0E = A01.A0A().A0E(C55942hf.A03(4.0d, 15.0d));
            A0E.A0J(0.0f);
            A0E.A0H();
        }
    }
}
