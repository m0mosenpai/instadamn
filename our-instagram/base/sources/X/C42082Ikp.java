package X;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.Ikp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42082Ikp implements InterfaceC43398JFn {
    public final int A00;
    public final Object A01;

    public C42082Ikp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C3FR c3fr, C71094Wnq c71094Wnq, Object obj, int i) {
        c3fr.EgS(new C42082Ikp(obj, i), c71094Wnq);
    }

    @Override // X.InterfaceC43398JFn
    public final boolean AFV(View view, SwipeRefreshLayout swipeRefreshLayout) {
        boolean CQ6;
        C3FQ scrollingViewProxy;
        switch (this.A00) {
            case 0:
                CQ6 = ((InterfaceC60682pr) ((EVZ) this.A01).A06).getScrollingViewProxy().CQ6();
                return !CQ6;
            case 1:
                CQ6 = true;
                if (!((AbstractC60672pq) this.A01).getScrollingViewProxy().CQ6()) {
                    CQ6 = false;
                }
                return !CQ6;
            case 2:
                scrollingViewProxy = ((HCR) this.A01).getScrollingViewProxy();
                break;
            case 3:
                scrollingViewProxy = ((HCU) this.A01).getScrollingViewProxy();
                break;
            case 4:
                scrollingViewProxy = ((HCX) this.A01).getScrollingViewProxy();
                break;
            case 5:
                scrollingViewProxy = ((HCV) this.A01).getScrollingViewProxy();
                break;
            case 6:
                scrollingViewProxy = ((HCW) this.A01).getScrollingViewProxy();
                break;
            case 7:
                scrollingViewProxy = ((HCS) this.A01).getScrollingViewProxy();
                break;
            default:
                scrollingViewProxy = ((HCT) this.A01).getScrollingViewProxy();
                break;
        }
        if (scrollingViewProxy.B6q() > 1) {
            return true;
        }
        return false;
    }
}
