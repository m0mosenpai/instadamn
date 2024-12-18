package X;

import java.util.List;

/* renamed from: X.HAy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38901HAy extends C40781ul implements InterfaceC55612h1 {
    public String A00;
    public List A01;
    public long A03 = -1;
    public long A02 = -1;

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A02;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A03;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        return AbstractC167007dF.A1M((this.A03 > (-1L) ? 1 : (this.A03 == (-1L) ? 0 : -1)));
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A02 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A03 = j;
    }
}
