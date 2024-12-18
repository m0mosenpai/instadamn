package X;

import com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout;

/* renamed from: X.Wrx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71329Wrx implements Runnable {
    public final /* synthetic */ RefreshableRecyclerViewLayout A00;

    public RunnableC71329Wrx(RefreshableRecyclerViewLayout refreshableRecyclerViewLayout) {
        this.A00 = refreshableRecyclerViewLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RefreshableRecyclerViewLayout.A05(this.A00);
    }
}
