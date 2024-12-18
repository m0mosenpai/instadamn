package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.WtL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71397WtL implements Runnable {
    public final int A00;
    public final RecyclerView A01;

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A0o(this.A00);
    }

    public RunnableC71397WtL(RecyclerView recyclerView, int i) {
        this.A00 = i;
        this.A01 = recyclerView;
    }
}
