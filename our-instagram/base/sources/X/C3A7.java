package X;

import android.view.ViewGroup;
import android.widget.ListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3A7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3A7 implements C3A8 {
    public final InterfaceC60682pr A00;

    @Override // X.C3A8
    public final void FDq(C3AB c3ab, C3A9 c3a9) {
        C3FQ scrollingViewProxy = this.A00.getScrollingViewProxy();
        ViewGroup CFj = scrollingViewProxy.CFj();
        if (scrollingViewProxy.CXX()) {
            ListView listView = (ListView) CFj;
            boolean z = false;
            if (listView.getHeaderViewsCount() == 0) {
                z = true;
            }
            C18C.A0G(z, "VisibleItemTracker's ListPositionTracked isn't implemented to support list with headerView. If we decided to use headerView, please adjust the framework for it.");
            for (int firstVisiblePosition = listView.getFirstVisiblePosition(); firstVisiblePosition <= listView.getLastVisiblePosition(); firstVisiblePosition++) {
                c3a9.A02(c3ab, firstVisiblePosition);
            }
            return;
        }
        AbstractC70663Fe abstractC70663Fe = ((RecyclerView) CFj).A0D;
        abstractC70663Fe.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC70663Fe;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        if (A1a == -1 || A1b == -1) {
            return;
        }
        while (A1a <= A1b) {
            c3a9.A02(c3ab, A1a);
            A1a++;
        }
    }

    public C3A7(InterfaceC60682pr interfaceC60682pr) {
        this.A00 = interfaceC60682pr;
    }
}
