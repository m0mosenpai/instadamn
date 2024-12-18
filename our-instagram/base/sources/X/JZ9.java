package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class JZ9 implements C3PE {
    public final /* synthetic */ C152286tE A00;
    public final /* synthetic */ C152276tD A01;

    public JZ9(C152286tE c152286tE, C152276tD c152276tD) {
        this.A00 = c152286tE;
        this.A01 = c152276tD;
    }

    @Override // X.C3PE
    public final void DQY(View view) {
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        C152286tE c152286tE = this.A00;
        C152276tD c152276tD = this.A01;
        C152266tC c152266tC = c152286tE.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        c152266tC.A02.D8A(c152276tD.A00);
        return true;
    }
}
