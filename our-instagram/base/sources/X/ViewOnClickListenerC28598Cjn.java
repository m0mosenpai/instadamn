package X;

import android.view.View;

/* renamed from: X.Cjn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28598Cjn implements View.OnClickListener {
    public final /* synthetic */ C143556du A00;

    public ViewOnClickListenerC28598Cjn(C143556du c143556du) {
        this.A00 = c143556du;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IllegalArgumentException A12;
        int i;
        int A05 = C0f9.A05(-383807114);
        C143556du c143556du = this.A00;
        InterfaceC144586fe interfaceC144586fe = c143556du.A0E;
        if (interfaceC144586fe != null) {
            C41551w4 c41551w4 = c143556du.A09;
            if (c41551w4 != null) {
                C41181vS c41181vS = c143556du.A08;
                if (c41181vS != null) {
                    interfaceC144586fe.Cxi(c41181vS, c41551w4);
                    C0f9.A0C(-502416837, A05);
                    return;
                } else {
                    A12 = AbstractC166987dD.A12("Required value was null.");
                    i = 1550692705;
                }
            } else {
                A12 = AbstractC166987dD.A12("Required value was null.");
                i = 958865313;
            }
        } else {
            A12 = AbstractC166987dD.A12("Required value was null.");
            i = -1047314216;
        }
        C0f9.A0C(i, A05);
        throw A12;
    }
}
