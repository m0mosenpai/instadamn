package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.GQg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36963GQg implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ C23031Ai A04;

    public RunnableC36963GQg(Activity activity, View view, C23031Ai c23031Ai, int i, int i2) {
        this.A03 = view;
        this.A02 = activity;
        this.A01 = i;
        this.A04 = c23031Ai;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A03;
        C03O.A00(view, new RunnableC36976GQt(this.A02, view, view, this.A04, this.A01, this.A00));
    }
}
