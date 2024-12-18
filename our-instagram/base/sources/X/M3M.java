package X;

import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes8.dex */
public final class M3M implements Runnable {
    public final /* synthetic */ ConstraintLayout A00;
    public final /* synthetic */ C208769Lk A01;

    public M3M(ConstraintLayout constraintLayout, C208769Lk c208769Lk) {
        this.A01 = c208769Lk;
        this.A00 = constraintLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A0C.removeView(this.A00);
    }
}
