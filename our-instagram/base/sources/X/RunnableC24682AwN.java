package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.AwN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24682AwN implements Runnable {
    public final /* synthetic */ C2UU A00;
    public final /* synthetic */ RecyclerView A01;

    public RunnableC24682AwN(C2UU c2uu, RecyclerView recyclerView) {
        this.A01 = recyclerView;
        this.A00 = c2uu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.setAdapter(this.A00);
    }
}
