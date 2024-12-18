package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.widget.recyclerview.MainFeedRecyclerView;

/* renamed from: X.Awz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24718Awz implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ C3H1 A01;

    public RunnableC24718Awz(C3H1 c3h1, double d) {
        this.A01 = c3h1;
        this.A00 = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC60672pq abstractC60672pq = this.A01.A00;
        if (abstractC60672pq.mView != null) {
            RecyclerView recyclerView = abstractC60672pq.getRecyclerView();
            C14360o3.A0C(recyclerView, "null cannot be cast to non-null type com.instagram.common.ui.widget.recyclerview.MainFeedRecyclerView");
            ((MainFeedRecyclerView) recyclerView).A00 = this.A00;
        }
    }
}
