package X;

import android.view.View;

/* renamed from: X.Iih, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41950Iih implements View.OnClickListener {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C3G2 A01;
    public final /* synthetic */ InterfaceC144586fe A02;

    public ViewOnClickListenerC41950Iih(C41181vS c41181vS, C3G2 c3g2, InterfaceC144586fe interfaceC144586fe) {
        this.A00 = c41181vS;
        this.A02 = interfaceC144586fe;
        this.A01 = c3g2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1791380259);
        C41181vS c41181vS = this.A00;
        String A0R = c41181vS.A0R();
        if (A0R != null) {
            this.A02.Cvc(c41181vS, this.A01, A0R);
            C0f9.A0C(-736838705, A05);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A0C(984395059, A05);
            throw A0g;
        }
    }
}
