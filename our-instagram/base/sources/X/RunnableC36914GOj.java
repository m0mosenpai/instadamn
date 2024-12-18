package X;

import android.view.View;

/* renamed from: X.GOj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36914GOj implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C32330EMc A01;

    public RunnableC36914GOj(View view, C32330EMc c32330EMc) {
        this.A01 = c32330EMc;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C32330EMc c32330EMc = this.A01;
        c32330EMc.A03 = this.A00.getHeight();
        C32330EMc.A00(c32330EMc);
    }
}
