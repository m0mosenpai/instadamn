package X;

import android.view.View;

/* loaded from: classes10.dex */
public final class TLZ implements Runnable {
    public final /* synthetic */ View A00;

    public TLZ(View view) {
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }
}
