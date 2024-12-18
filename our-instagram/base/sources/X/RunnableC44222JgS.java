package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.JgS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44222JgS implements Runnable {
    public final /* synthetic */ JXJ A00;

    public RunnableC44222JgS(JXJ jxj) {
        this.A00 = jxj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.A00.A01;
        if (recyclerView != null) {
            recyclerView.A0n(0);
        }
    }
}
