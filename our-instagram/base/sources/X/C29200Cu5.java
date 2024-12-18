package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;

/* renamed from: X.Cu5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29200Cu5 implements MRC {
    public final /* synthetic */ LazyGridState A00;

    public C29200Cu5(LazyGridState lazyGridState) {
        this.A00 = lazyGridState;
    }

    @Override // X.MRC
    public final int B6n() {
        return this.A00.A09.A03.BIi();
    }

    @Override // X.MRC
    public final long B6p() {
        return (B6n() & 4294967295L) | (this.A00.A09.A04.BIi() << 32);
    }

    @Override // X.MRC
    public final int BM2() {
        InterfaceC58206PrC interfaceC58206PrC = (InterfaceC58206PrC) AbstractC001800i.A0L(((C28836Co6) this.A00.A00()).A0C);
        if (interfaceC58206PrC != null) {
            return ((C28760Cms) interfaceC58206PrC).A08;
        }
        return -1;
    }

    @Override // X.MRC
    public final C6M3 BZd() {
        return ((C28836Co6) this.A00.A00()).A09;
    }

    @Override // X.MRC
    public final boolean CcT() {
        return this.A00.A04.CcT();
    }

    @Override // X.MRC
    public final int getItemCount() {
        return ((C28836Co6) this.A00.A00()).A06;
    }
}
