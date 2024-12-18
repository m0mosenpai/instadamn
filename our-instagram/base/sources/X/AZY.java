package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class AZY implements InterfaceC178677wf {
    public final /* synthetic */ C178727wk A00;

    @Override // X.InterfaceC178677wf
    public final void Dan(View view) {
    }

    public AZY(C178727wk c178727wk) {
        this.A00 = c178727wk;
    }

    @Override // X.InterfaceC178677wf
    public final void Dah(C176507t8 c176507t8) {
        C178727wk.A04(this.A00, c176507t8);
    }

    @Override // X.InterfaceC178677wf
    public final void Dai(C176507t8 c176507t8) {
        C178727wk.A04(this.A00, null);
    }

    @Override // X.InterfaceC178677wf
    public final void Daj(C176507t8 c176507t8, int i, int i2) {
        C178727wk c178727wk = this.A00;
        c178727wk.A05 = i;
        c178727wk.A04 = i2;
        c178727wk.A0L.post(new Runnable() { // from class: X.Ape
            @Override // java.lang.Runnable
            public final void run() {
                C178727wk.A03(AZY.this.A00);
            }
        });
    }
}
