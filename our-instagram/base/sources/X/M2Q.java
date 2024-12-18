package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class M2Q implements Runnable {
    public final /* synthetic */ View A00;

    public M2Q(View view) {
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.setVisibility(8);
    }
}
