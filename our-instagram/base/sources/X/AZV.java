package X;

import android.view.TextureView;
import android.view.View;

/* loaded from: classes4.dex */
public final class AZV implements InterfaceC178677wf {
    public final /* synthetic */ C180027ys A00;

    public AZV(C180027ys c180027ys) {
        this.A00 = c180027ys;
    }

    @Override // X.InterfaceC178677wf
    public final void Dah(C176507t8 c176507t8) {
        C180027ys c180027ys = this.A00;
        boolean z = c180027ys.A0j;
        c180027ys.A0j = true;
        if (!c180027ys.A0Q && c180027ys.A0P && z) {
            C178087vh c178087vh = InterfaceC178737wl.A00;
            InterfaceC178207vu interfaceC178207vu = ((AbstractC178807ws) c180027ys).A00;
            interfaceC178207vu.getClass();
            if (((InterfaceC178737wl) interfaceC178207vu.Aq0(c178087vh)).ECL()) {
                C180027ys.A02(c180027ys);
            }
        }
    }

    @Override // X.InterfaceC178677wf
    public final void Dai(C176507t8 c176507t8) {
        this.A00.A0j = false;
    }

    @Override // X.InterfaceC178677wf
    public final void Daj(C176507t8 c176507t8, int i, int i2) {
        C180027ys c180027ys = this.A00;
        c180027ys.A04 = i;
        c180027ys.A03 = i2;
        C180027ys.A06(c180027ys, c180027ys.A0L);
    }

    @Override // X.InterfaceC178677wf
    public final void Dan(View view) {
        C180027ys c180027ys;
        if (view instanceof TextureView) {
            c180027ys = this.A00;
            c180027ys.A06 = (TextureView) view;
        } else {
            c180027ys = this.A00;
            c180027ys.A06 = null;
        }
        c180027ys.A05 = null;
    }
}
