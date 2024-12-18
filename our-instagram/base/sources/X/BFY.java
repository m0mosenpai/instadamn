package X;

import androidx.compose.foundation.lazy.LazyListState;

/* loaded from: classes5.dex */
public final class BFY implements MRC {
    public final /* synthetic */ LazyListState A00;

    public BFY(LazyListState lazyListState) {
        this.A00 = lazyListState;
    }

    @Override // X.MRC
    public final int B6n() {
        return this.A00.A00();
    }

    @Override // X.MRC
    public final long B6p() {
        return (r1.A00() & 4294967295L) | (this.A00.A01() << 32);
    }

    @Override // X.MRC
    public final int BM2() {
        InterfaceC137046Ii interfaceC137046Ii = (InterfaceC137046Ii) AbstractC001800i.A0L(((C6IF) this.A00.A02()).A0D);
        if (interfaceC137046Ii != null) {
            return ((C137036Ig) interfaceC137046Ii).A07;
        }
        return -1;
    }

    @Override // X.MRC
    public final C6M3 BZd() {
        return ((C6IF) this.A00.A02()).A0A;
    }

    @Override // X.MRC
    public final boolean CcT() {
        return this.A00.CcT();
    }

    @Override // X.MRC
    public final int getItemCount() {
        return ((C6IF) this.A00.A02()).A06;
    }
}
