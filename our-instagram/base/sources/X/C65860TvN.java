package X;

import android.view.View;

/* renamed from: X.TvN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65860TvN implements InterfaceC59892oW {
    public final int A00;
    public final Object A01;

    public C65860TvN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC59892oW
    public final void Dnp(int i, int i2) {
        switch (this.A00) {
            case 0:
                AbstractC13880nE.A0d((View) this.A01, i);
                return;
            case 1:
            case 2:
            case 3:
            default:
                ((InterfaceC56362iU) this.A01).EgR(i);
                return;
            case 4:
                ((C65867TvU) this.A01).A02 = i;
                return;
            case 5:
                C65835Tus c65835Tus = (C65835Tus) this.A01;
                c65835Tus.A03 = i;
                c65835Tus.A02 = i2;
                c65835Tus.A00 = c65835Tus.A07.A00 - (((c65835Tus.A05 + c65835Tus.A04) + i) + i2);
                return;
            case 6:
                C37617GhC c37617GhC = (C37617GhC) this.A01;
                c37617GhC.A03.A05(c37617GhC.A05, C16930sl.A00, c37617GhC.A06, c37617GhC.A01 + i, true);
                return;
        }
    }
}
