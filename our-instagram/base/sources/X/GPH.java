package X;

import android.app.Activity;
import android.view.View;

/* loaded from: classes6.dex */
public final class GPH implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C23031Ai A02;

    public GPH(Activity activity, View view, C23031Ai c23031Ai) {
        this.A01 = view;
        this.A00 = activity;
        this.A02 = c23031Ai;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A01;
        C03O.A00(view, new GQ8(this.A00, view, view, this.A02));
    }
}
