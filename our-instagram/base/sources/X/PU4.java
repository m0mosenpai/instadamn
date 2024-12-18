package X;

import android.os.Handler;
import android.view.View;

/* loaded from: classes9.dex */
public final class PU4 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ boolean A01;

    public PU4(View view, boolean z) {
        this.A01 = z;
        this.A00 = view;
    }

    public static void A00(Handler handler, View view, long j, boolean z) {
        handler.postDelayed(new PU4(view, z), j);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A01;
        View view = this.A00;
        if (z) {
            AbstractC125325le A0n = AbstractC43592JPx.A0n(view);
            A0n.A0P(0.6f, -1.0f);
            A0n.A0Q(0.6f, -1.0f);
            A0n.A0I(0.0f);
            A0n.A0H();
            return;
        }
        view.setScaleX(0.6f);
        view.setScaleY(0.6f);
        view.setAlpha(0.0f);
    }
}
