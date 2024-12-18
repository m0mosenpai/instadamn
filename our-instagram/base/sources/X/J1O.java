package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.ui.widget.expanding.ExpandingListView;

/* loaded from: classes7.dex */
public final class J1O implements InterfaceC70513Em {
    public ExpandingListView A00;

    @Override // X.InterfaceC70513Em
    public final void Eg0(int i) {
    }

    @Override // X.InterfaceC70513Em
    public final void APU() {
        this.A00.APU();
    }

    @Override // X.InterfaceC70513Em
    public final void ARj() {
        this.A00.ARj();
    }

    @Override // X.InterfaceC70513Em
    public final void EWY(boolean z, boolean z2) {
        if (z && z2) {
            this.A00.AWT();
        }
        this.A00.setIsLoading(z);
    }

    @Override // X.InterfaceC70513Em
    public final boolean isLoading() {
        return this.A00.Cbj();
    }

    @Override // X.InterfaceC70513Em
    public final void setIsLoading(boolean z) {
        this.A00.setIsLoading(z);
    }

    public J1O(View view, InterfaceC70493Ek interfaceC70493Ek) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.expandinglistview_stub);
        if (viewStub != null) {
            viewStub.inflate();
        }
        ExpandingListView expandingListView = (ExpandingListView) view.requireViewById(android.R.id.list);
        this.A00 = expandingListView;
        expandingListView.setupAndEnableRefresh(ViewOnClickListenerC38053Gog.A02(this, interfaceC70493Ek, 50));
    }
}
