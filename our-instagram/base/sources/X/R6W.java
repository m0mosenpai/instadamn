package X;

import android.content.Context;
import android.os.SystemClock;

/* loaded from: classes10.dex */
public final class R6W extends Q4W {
    public final AbstractC12990ll A00;
    public final S5D A01;

    public R6W(Context context, AbstractC12990ll abstractC12990ll, S5D s5d) {
        super(context);
        this.A00 = abstractC12990ll;
        this.A01 = s5d;
    }

    @Override // X.Q4W, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(2015222884);
        super.onAttachedToWindow();
        if (this.A01 != null) {
            C64500TGm c64500TGm = (C64500TGm) AbstractC27401Ut.getInstance().getPerformanceLogger(this.A00);
            c64500TGm.A0K.set(SystemClock.uptimeMillis());
            c64500TGm.Cks();
        }
        C0f9.A0D(1411489335, A06);
    }
}
