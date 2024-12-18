package X;

import android.view.View;

/* loaded from: classes10.dex */
public final class TLY implements Runnable {
    public final /* synthetic */ View A00;

    public TLY(View view) {
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        if (view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }
}
