package X;

import android.view.View;

/* renamed from: X.AwU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24688AwU implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C158707Ag A01;

    public RunnableC24688AwU(View view, C158707Ag c158707Ag) {
        this.A01 = c158707Ag;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        C158707Ag c158707Ag = this.A01;
        c158707Ag.A05 = true;
        C22842A5l c22842A5l = c158707Ag.A02;
        if (c22842A5l != null && (num = c158707Ag.A03) != null) {
            c22842A5l.A00.add(num);
        }
        C158707Ag.A00(this.A00);
        C158707Ag.A01(c158707Ag.A01);
    }
}
