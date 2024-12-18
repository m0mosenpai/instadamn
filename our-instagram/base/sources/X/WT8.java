package X;

import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;

/* loaded from: classes11.dex */
public final class WT8 implements InterfaceC60212p4 {
    public final /* synthetic */ R3N A00;
    public final /* synthetic */ C66494UJz A01;
    public final /* synthetic */ SwipeRefreshLayoutManager A02;

    public WT8(R3N r3n, C66494UJz c66494UJz, SwipeRefreshLayoutManager swipeRefreshLayoutManager) {
        this.A02 = swipeRefreshLayoutManager;
        this.A00 = r3n;
        this.A01 = c66494UJz;
    }

    @Override // X.InterfaceC60212p4
    public final void DeM() {
        R3N r3n = this.A00;
        C66494UJz c66494UJz = this.A01;
        X9J A05 = UIManagerHelper.A05(r3n, c66494UJz.getId());
        if (A05 != null) {
            A05.APn(new Sb5(UIManagerHelper.A01(c66494UJz), c66494UJz.getId()));
        }
    }
}
