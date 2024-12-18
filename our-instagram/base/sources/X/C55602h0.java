package X;

import java.util.List;

/* renamed from: X.2h0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55602h0 extends C40781ul implements InterfaceC55612h1 {
    public long A00;
    public long A01;
    public Long A02;
    public List A03;
    public List A04;
    public long A06 = -1;
    public long A05 = -1;

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A05;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A06;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        if (this.A06 == -1) {
            return false;
        }
        return true;
    }

    public C55602h0() {
        C16930sl c16930sl = C16930sl.A00;
        this.A04 = c16930sl;
        this.A03 = c16930sl;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A05 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A06 = j;
    }
}
