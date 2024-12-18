package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.Gl4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37850Gl4 extends C40781ul implements InterfaceC55612h1 {
    public HashMap A00;
    public HashMap A01;
    public List A02;
    public List A03;
    public List A04;
    public boolean A05;
    public long A07 = -1;
    public long A06 = -1;

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A06;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A07;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        return AbstractC167007dF.A1M((this.A07 > (-1L) ? 1 : (this.A07 == (-1L) ? 0 : -1)));
    }

    public C37850Gl4() {
        C16930sl c16930sl = C16930sl.A00;
        this.A02 = c16930sl;
        this.A01 = AbstractC166987dD.A1G();
        this.A00 = AbstractC166987dD.A1G();
        this.A03 = AbstractC166987dD.A1E();
        this.A04 = c16930sl;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A06 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A07 = j;
    }
}
