package X;

import java.util.Map;

/* renamed from: X.SzP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64108SzP implements InterfaceC65573Tn7 {
    public int A00;
    public final int A01;

    @Override // X.InterfaceC65573Tn7
    public final long B2t() {
        return 0L;
    }

    @Override // X.InterfaceC65573Tn7
    public final boolean AJu() {
        return AbstractC167007dF.A1O(this.A00);
    }

    @Override // X.InterfaceC65573Tn7
    public final InterfaceC65573Tn7 AKs() {
        return new C64108SzP(this.A01);
    }

    @Override // X.InterfaceC65573Tn7
    public final Map BOo() {
        return AbstractC25233BEq.A0p(RhW.A0J.A00, String.valueOf((this.A01 - this.A00) + 1), AbstractC166987dD.A1L(RhW.A0M.A00, "simple"));
    }

    @Override // X.InterfaceC65573Tn7
    public final void ECP() {
        this.A00--;
    }

    public C64108SzP(int i) {
        this.A01 = i;
        this.A00 = i;
    }

    public C64108SzP() {
        this(3);
    }
}
