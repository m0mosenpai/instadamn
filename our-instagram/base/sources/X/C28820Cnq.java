package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Cnq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28820Cnq implements InterfaceC1131559d {
    public final InterfaceC1131659e A00;
    public final Integer A01;
    public final Integer A02;

    @Override // X.InterfaceC1131659e
    public final Object BbJ() {
        return this.A00.BbJ();
    }

    @Override // X.InterfaceC1131659e
    public final int Cnj(int i) {
        return this.A00.Cnj(i);
    }

    @Override // X.InterfaceC1131659e
    public final int Cnm(int i) {
        return this.A00.Cnm(i);
    }

    @Override // X.InterfaceC1131559d
    public final C59W CpF(long j) {
        int Cpe;
        C59W c59w;
        long A00;
        int Cph;
        Integer num = this.A02;
        Integer num2 = C05F.A00;
        int i = 32767;
        Integer num3 = this.A01;
        Integer num4 = C05F.A01;
        if (num == num2) {
            InterfaceC1131659e interfaceC1131659e = this.A00;
            int A002 = Constraints.A00(j);
            if (num3 == num4) {
                Cph = interfaceC1131659e.Cnm(A002);
            } else {
                Cph = interfaceC1131659e.Cph(A002);
            }
            if (Constraints.A06(j)) {
                i = A002;
            }
            c59w = new C59W();
            A00 = AbstractC119215ad.A00(Cph, i);
        } else {
            InterfaceC1131659e interfaceC1131659e2 = this.A00;
            int A01 = Constraints.A01(j);
            if (num3 == num4) {
                Cpe = interfaceC1131659e2.Cnj(A01);
            } else {
                Cpe = interfaceC1131659e2.Cpe(A01);
            }
            if (Constraints.A07(j)) {
                i = A01;
            }
            c59w = new C59W();
            A00 = AbstractC119215ad.A00(i, Cpe);
        }
        c59w.A0H(A00);
        return c59w;
    }

    @Override // X.InterfaceC1131659e
    public final int Cpe(int i) {
        return this.A00.Cpe(i);
    }

    @Override // X.InterfaceC1131659e
    public final int Cph(int i) {
        return this.A00.Cph(i);
    }

    public C28820Cnq(InterfaceC1131659e interfaceC1131659e, Integer num, Integer num2) {
        this.A00 = interfaceC1131659e;
        this.A01 = num;
        this.A02 = num2;
    }
}
