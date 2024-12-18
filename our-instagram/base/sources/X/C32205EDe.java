package X;

import java.util.List;

/* renamed from: X.EDe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32205EDe extends C40781ul implements InterfaceC55612h1, InterfaceC74303Vl {
    public String A00;
    public boolean A02;
    public boolean A03;
    public List A01 = AbstractC166987dD.A1E();
    public long A05 = -1;
    public long A04 = -1;

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        return false;
    }

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        return AbstractC167007dF.A1M((this.A05 > (-1L) ? 1 : (this.A05 == (-1L) ? 0 : -1)));
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A04;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A05;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQG() {
        return this.A02;
    }

    @Override // X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A00;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A04 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A05 = j;
    }
}
