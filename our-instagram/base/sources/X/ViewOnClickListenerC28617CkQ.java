package X;

import android.view.View;

/* renamed from: X.CkQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28617CkQ implements View.OnClickListener {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ InterfaceC144586fe A01;

    public ViewOnClickListenerC28617CkQ(C38321qM c38321qM, InterfaceC144586fe interfaceC144586fe) {
        this.A01 = interfaceC144586fe;
        this.A00 = c38321qM;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1544215729);
        InterfaceC144586fe interfaceC144586fe = this.A01;
        C38321qM c38321qM = this.A00;
        if (c38321qM != null) {
            interfaceC144586fe.DSi(c38321qM);
            C0f9.A0C(-998117997, A05);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A0C(1811711351, A05);
            throw A0g;
        }
    }
}
