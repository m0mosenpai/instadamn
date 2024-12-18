package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.GNg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36885GNg implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;

    public RunnableC36885GNg(Activity activity, View view) {
        this.A01 = view;
        this.A00 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A01;
        C03O.A00(view, new GPD(this.A00, view, view));
    }
}
