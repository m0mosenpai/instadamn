package X;

import com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout;

/* renamed from: X.Wrw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71328Wrw implements Runnable {
    public final /* synthetic */ RefreshableRecyclerViewLayout A00;

    public RunnableC71328Wrw(RefreshableRecyclerViewLayout refreshableRecyclerViewLayout) {
        this.A00 = refreshableRecyclerViewLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RefreshableRecyclerViewLayout.A04(this.A00);
    }
}
