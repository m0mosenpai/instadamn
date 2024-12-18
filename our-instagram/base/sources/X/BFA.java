package X;

import android.view.View;

/* loaded from: classes5.dex */
public final class BFA implements View.OnClickListener {
    public final /* synthetic */ C143556du A00;

    public BFA(C143556du c143556du) {
        this.A00 = c143556du;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IllegalArgumentException A12;
        int i;
        int A05 = C0f9.A05(160049510);
        C143556du c143556du = this.A00;
        InterfaceC144586fe interfaceC144586fe = c143556du.A0E;
        if (interfaceC144586fe != null) {
            C41551w4 c41551w4 = c143556du.A09;
            if (c41551w4 != null) {
                C41181vS c41181vS = c143556du.A08;
                if (c41181vS != null) {
                    interfaceC144586fe.DGL(c41181vS, c41551w4);
                    C0f9.A0C(-368745707, A05);
                    return;
                } else {
                    A12 = AbstractC166987dD.A12("Required value was null.");
                    i = -298920400;
                }
            } else {
                A12 = AbstractC166987dD.A12("Required value was null.");
                i = 1340609368;
            }
        } else {
            A12 = AbstractC166987dD.A12("Required value was null.");
            i = -429677130;
        }
        C0f9.A0C(i, A05);
        throw A12;
    }
}
