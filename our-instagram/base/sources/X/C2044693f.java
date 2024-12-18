package X;

import java.util.List;

/* renamed from: X.93f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2044693f extends C40781ul implements InterfaceC55612h1, InterfaceC74303Vl {
    public String A01;
    public String A02;
    public List A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public long A00 = -1;
    public long A07 = -1;

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A07;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A00;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQG() {
        return this.A06;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        return false;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        if (this.A00 == -1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A01;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A07 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A00 = j;
    }
}
