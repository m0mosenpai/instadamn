package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class PO2 implements Runnable {
    public final /* synthetic */ View A00;

    public PO2(View view) {
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.setVisibility(4);
    }
}
