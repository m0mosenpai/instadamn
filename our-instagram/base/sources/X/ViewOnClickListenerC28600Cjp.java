package X;

import android.view.View;

/* renamed from: X.Cjp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28600Cjp implements View.OnClickListener {
    public final /* synthetic */ C143556du A00;

    public ViewOnClickListenerC28600Cjp(C143556du c143556du) {
        this.A00 = c143556du;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IllegalArgumentException A12;
        int i;
        int A05 = C0f9.A05(45428378);
        C143556du c143556du = this.A00;
        InterfaceC144586fe interfaceC144586fe = c143556du.A0E;
        if (interfaceC144586fe != null) {
            C41181vS c41181vS = c143556du.A08;
            if (c41181vS != null) {
                interfaceC144586fe.DWY(c41181vS);
                C0f9.A0C(593183415, A05);
                return;
            } else {
                A12 = AbstractC166987dD.A12("Required value was null.");
                i = 1134079408;
            }
        } else {
            A12 = AbstractC166987dD.A12("Required value was null.");
            i = 1208037781;
        }
        C0f9.A0C(i, A05);
        throw A12;
    }
}
