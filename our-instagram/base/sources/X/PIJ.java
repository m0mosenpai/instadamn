package X;

import android.content.Context;

/* loaded from: classes9.dex */
public final class PIJ implements InterfaceC147206jw {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C148646mZ A01;

    public PIJ(Context context, C148646mZ c148646mZ) {
        this.A01 = c148646mZ;
        this.A00 = context;
    }

    @Override // X.InterfaceC147206jw
    public final void DZe() {
        C148646mZ c148646mZ = this.A01;
        if (!c148646mZ.A01) {
            c148646mZ.A05.EJJ();
        } else {
            c148646mZ.A01 = false;
        }
    }

    @Override // X.InterfaceC147206jw
    public final void DZf() {
        C148646mZ c148646mZ = this.A01;
        C41181vS AuU = c148646mZ.A05.AuU();
        if (AuU != null && AuU.A1S()) {
            return;
        }
        C51622Yk c51622Yk = c148646mZ.A00;
        if (c51622Yk != null) {
            c51622Yk.A03(true);
        }
        c148646mZ.A00 = null;
    }

    @Override // X.InterfaceC147206jw
    public final void onClick() {
        C41181vS AuU;
        C148646mZ c148646mZ = this.A01;
        InterfaceC1118853a interfaceC1118853a = c148646mZ.A05;
        C41181vS AuU2 = interfaceC1118853a.AuU();
        if (AuU2 != null && AuU2.A1S() && (AuU = interfaceC1118853a.AuU()) != null) {
            Context context = this.A00;
            c148646mZ.A01 = true;
            c148646mZ.A01(AuU);
            c148646mZ.A00(context, AuU);
        }
    }
}
