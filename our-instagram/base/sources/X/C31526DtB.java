package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.DtB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31526DtB extends C40781ul implements InterfaceC55612h1 {
    public C47K A01;
    public C47K A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public long A00 = -1;
    public long A08 = -1;

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    public final List A00() {
        List A03;
        C47K c47k = this.A02;
        if (c47k != null) {
            boolean A07 = c47k.A07();
            C47K c47k2 = this.A02;
            if (!A07) {
                A03 = c47k2.A0M;
            } else {
                A03 = c47k2.A03();
            }
            if (A03 != null) {
                return A03;
            }
        }
        return Collections.emptyList();
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        return AbstractC167007dF.A1M((this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1)));
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A08;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A00;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A08 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A00 = j;
    }
}
