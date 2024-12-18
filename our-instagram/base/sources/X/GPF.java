package X;

import android.app.Activity;
import android.view.View;

/* loaded from: classes6.dex */
public final class GPF implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C15100pQ A02;

    public GPF(Activity activity, View view, C15100pQ c15100pQ) {
        this.A01 = view;
        this.A00 = activity;
        this.A02 = c15100pQ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A01;
        C03O.A00(view, new GQ6(this.A00, view, view, this.A02));
    }
}
