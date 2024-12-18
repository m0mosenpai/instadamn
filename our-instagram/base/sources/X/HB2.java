package X;

/* loaded from: classes7.dex */
public abstract class HB2 extends C40781ul implements InterfaceC55612h1, InterfaceC74303Vl {
    public String A01 = "";
    public long A00 = -1;
    public long A02 = -1;

    public boolean CQG() {
        return true;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        return false;
    }

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A02;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A00;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        return AbstractC167007dF.A1M((this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1)));
    }

    @Override // X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A01;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A02 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A00 = j;
    }
}
