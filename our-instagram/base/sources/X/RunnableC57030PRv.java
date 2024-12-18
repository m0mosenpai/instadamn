package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.PRv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57030PRv implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ HC4 A01;

    public RunnableC57030PRv(RecyclerView recyclerView, HC4 hc4) {
        this.A00 = recyclerView;
        this.A01 = hc4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0o(this.A01.A00 + 1);
    }
}
