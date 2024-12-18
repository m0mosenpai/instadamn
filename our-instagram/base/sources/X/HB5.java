package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class HB5 extends C40781ul implements InterfaceC55612h1, InterfaceC74303Vl {
    public C84543q2 A00;
    public String A01;
    public String A02;
    public String A03;
    public List A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public long A09 = -1;
    public long A08 = -1;

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        return false;
    }

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A08;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A09;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQG() {
        return this.A06;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        return AbstractC167007dF.A1M((this.A09 > (-1L) ? 1 : (this.A09 == (-1L) ? 0 : -1)));
    }

    @Override // X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A03;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A08 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A09 = j;
    }
}
