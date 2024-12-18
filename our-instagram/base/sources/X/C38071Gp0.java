package X;

import java.util.List;

/* renamed from: X.Gp0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38071Gp0 extends C40781ul implements InterfaceC55612h1, InterfaceC74303Vl, InterfaceC57963Pn9 {
    public C38602Gy5 A02;
    public String A03;
    public String A04;
    public List A05 = AbstractC166987dD.A1E();
    public long A01 = -1;
    public long A00 = -1;

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    @Override // X.InterfaceC57963Pn9
    public final C38071Gp0 EqR() {
        return this;
    }

    public final boolean A00() {
        C38602Gy5 c38602Gy5 = this.A02;
        if (c38602Gy5 != null && c38602Gy5.A01 && getNextMaxId() != null) {
            return true;
        }
        return false;
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
        return true;
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
        C38602Gy5 c38602Gy5 = this.A02;
        if (c38602Gy5 != null) {
            return c38602Gy5.A00;
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
