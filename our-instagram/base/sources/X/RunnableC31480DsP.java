package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;

/* renamed from: X.DsP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC31480DsP implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ boolean A01;

    public RunnableC31480DsP(RecyclerView recyclerView, boolean z) {
        this.A01 = z;
        this.A00 = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.A01) {
            RecyclerView recyclerView = this.A00;
            C14360o3.A0C(recyclerView, "null cannot be cast to non-null type com.instagram.ui.recyclerpager.HorizontalRecyclerPager");
            ((HorizontalRecyclerPager) recyclerView).A1H();
        }
    }
}
