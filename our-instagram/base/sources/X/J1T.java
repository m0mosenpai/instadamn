package X;

import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* loaded from: classes7.dex */
public final class J1T implements InterfaceC59892oW {
    public final /* synthetic */ RefreshableNestedScrollingParent A00;

    public J1T(RefreshableNestedScrollingParent refreshableNestedScrollingParent) {
        this.A00 = refreshableNestedScrollingParent;
    }

    @Override // X.InterfaceC59892oW
    public final void Dnp(int i, int i2) {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A00;
        refreshableNestedScrollingParent.setRefreshingDistance(refreshableNestedScrollingParent.A03 + i);
    }
}
