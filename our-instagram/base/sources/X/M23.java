package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class M23 implements Runnable {
    public final /* synthetic */ N42 A00;

    public M23(N42 n42) {
        this.A00 = n42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.A00.A00;
        if (recyclerView != null) {
            recyclerView.A0n(0);
        }
    }
}
