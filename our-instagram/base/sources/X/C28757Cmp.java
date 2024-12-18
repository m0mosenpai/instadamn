package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;

/* renamed from: X.Cmp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28757Cmp implements InterfaceC137836Mi {
    public final LazyStaggeredGridState A00;

    @Override // X.InterfaceC137836Mi
    public final int B6e() {
        return this.A00.A0D.A05.BIi();
    }

    @Override // X.InterfaceC137836Mi
    public final boolean BD1() {
        return AbstractC166987dD.A1b(AbstractC25235BEs.A0D(this.A00.A0G).A0D);
    }

    @Override // X.InterfaceC137836Mi
    public final int BLq() {
        return ((C28761Cmt) ((InterfaceC30773DgA) AbstractC001800i.A0K(AbstractC25235BEs.A0D(this.A00.A0G).A0D))).A07;
    }

    @Override // X.InterfaceC137836Mi
    public final void EEb() {
        C59A c59a = this.A00.A02;
        if (c59a != null) {
            c59a.AWW();
        }
    }

    @Override // X.InterfaceC137836Mi
    public final int getItemCount() {
        return AbstractC25235BEs.A0D(this.A00.A0G).A06;
    }

    public C28757Cmp(LazyStaggeredGridState lazyStaggeredGridState) {
        this.A00 = lazyStaggeredGridState;
    }
}
