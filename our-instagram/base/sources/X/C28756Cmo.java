package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;

/* renamed from: X.Cmo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28756Cmo implements InterfaceC137836Mi {
    public final LazyGridState A00;

    @Override // X.InterfaceC137836Mi
    public final int B6e() {
        return this.A00.A09.A03.BIi();
    }

    @Override // X.InterfaceC137836Mi
    public final boolean BD1() {
        return AbstractC166987dD.A1b(((C28836Co6) this.A00.A00()).A0C);
    }

    @Override // X.InterfaceC137836Mi
    public final int BLq() {
        return ((C28760Cms) ((InterfaceC58206PrC) AbstractC001800i.A0K(((C28836Co6) this.A00.A00()).A0C))).A08;
    }

    @Override // X.InterfaceC137836Mi
    public final void EEb() {
        C59A c59a = this.A00.A01;
        if (c59a != null) {
            c59a.AWW();
        }
    }

    @Override // X.InterfaceC137836Mi
    public final int getItemCount() {
        return ((C28836Co6) this.A00.A00()).A06;
    }

    public C28756Cmo(LazyGridState lazyGridState) {
        this.A00 = lazyGridState;
    }
}
