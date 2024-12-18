package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class HB4 extends C40781ul implements InterfaceC55612h1, InterfaceC74303Vl {
    public List A03 = null;
    public C111074zO A02 = null;
    public long A01 = -1;
    public long A00 = -1;
    public final ArrayList A04 = AbstractC166987dD.A1E();

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A00;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A01;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQG() {
        C111074zO c111074zO = this.A02;
        if (c111074zO != null) {
            return c111074zO.A01;
        }
        return false;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        return false;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        return AbstractC167007dF.A1M((this.A01 > (-1L) ? 1 : (this.A01 == (-1L) ? 0 : -1)));
    }

    @Override // X.InterfaceC74303Vl
    public final String getNextMaxId() {
        C111074zO c111074zO = this.A02;
        if (c111074zO != null) {
            return c111074zO.A00;
        }
        return null;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A00 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A01 = j;
    }
}
