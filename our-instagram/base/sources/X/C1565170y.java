package X;

import com.instagram.ui.widget.refresh.RefreshableListView;

/* renamed from: X.70y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1565170y implements InterfaceC70513Em {
    public RefreshableListView A00;

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
}
