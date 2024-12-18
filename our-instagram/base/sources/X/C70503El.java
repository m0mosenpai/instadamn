package X;

import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.3El, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70503El implements InterfaceC70513Em {
    public RefreshableNestedScrollingParent A00;

    @Override // X.InterfaceC70513Em
    public final void Eg0(int i) {
    }

    @Override // X.InterfaceC70513Em
    public final void setIsLoading(boolean z) {
        EWY(z, false);
    }

    @Override // X.InterfaceC70513Em
    public final void APU() {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A00;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setEnabled(false);
        }
    }

    @Override // X.InterfaceC70513Em
    public final void ARj() {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A00;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setEnabled(true);
        }
    }

    @Override // X.InterfaceC70513Em
    public final void EWY(boolean z, boolean z2) {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A00;
        if (refreshableNestedScrollingParent != null) {
            if (z && z2) {
                RefreshableNestedScrollingParent.A00(refreshableNestedScrollingParent, true, true);
            }
            refreshableNestedScrollingParent.setRefreshing(z);
        }
    }

    @Override // X.InterfaceC70513Em
    public final boolean isLoading() {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A00;
        if (refreshableNestedScrollingParent == null) {
            return false;
        }
        return refreshableNestedScrollingParent.A0B;
    }
}
