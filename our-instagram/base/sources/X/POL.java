package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class POL implements Runnable {
    public final /* synthetic */ ENX A00;

    public POL(ENX enx) {
        this.A00 = enx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ENX enx = this.A00;
        View view = enx.mView;
        if (view != null && view.getHeight() > enx.getRecyclerView().computeVerticalScrollRange()) {
            enx.AD4();
        }
    }
}
