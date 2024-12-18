package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class AZX implements InterfaceC178677wf {
    public final /* synthetic */ C179977yn A00;

    @Override // X.InterfaceC178677wf
    public final void Dan(View view) {
    }

    public AZX(C179977yn c179977yn) {
        this.A00 = c179977yn;
    }

    @Override // X.InterfaceC178677wf
    public final void Dah(C176507t8 c176507t8) {
        C179977yn c179977yn = this.A00;
        c179977yn.A02 = c176507t8;
        c176507t8.A08 = 1;
        c176507t8.A07 = 1;
        c179977yn.A9p(c176507t8);
        c179977yn.A07.post(new RunnableC24252ApJ(this));
    }

    @Override // X.InterfaceC178677wf
    public final void Dai(C176507t8 c176507t8) {
        C179977yn c179977yn = this.A00;
        c179977yn.A02 = null;
        c179977yn.EG3(c176507t8);
    }

    @Override // X.InterfaceC178677wf
    public final void Daj(C176507t8 c176507t8, int i, int i2) {
        this.A00.A07.post(new RunnableC24726AxA(this, i, i2));
    }
}
