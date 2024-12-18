package X;

import com.instagram.ui.widget.refresh.RefreshableListView;

/* renamed from: X.J3h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43092J3h implements Runnable {
    public final /* synthetic */ RefreshableListView A00;

    public RunnableC43092J3h(RefreshableListView refreshableListView) {
        this.A00 = refreshableListView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RefreshableListView refreshableListView = this.A00;
        if (refreshableListView.A05 == EnumC1564970w.REFRESHING) {
            RefreshableListView.A04(refreshableListView);
        }
        refreshableListView.A06 = null;
    }
}
