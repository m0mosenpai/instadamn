package X;

import android.view.View;

/* renamed from: X.Iig, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41949Iig implements View.OnClickListener {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ InterfaceC144586fe A01;
    public final /* synthetic */ C6e7 A02;

    public ViewOnClickListenerC41949Iig(C41181vS c41181vS, InterfaceC144586fe interfaceC144586fe, C6e7 c6e7) {
        this.A01 = interfaceC144586fe;
        this.A00 = c41181vS;
        this.A02 = c6e7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1461164044);
        InterfaceC144586fe interfaceC144586fe = this.A01;
        C41181vS c41181vS = this.A00;
        View view2 = this.A02.A07;
        if (view2 != null) {
            interfaceC144586fe.D88(view2, c41181vS);
            C0f9.A0C(-581653643, A05);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A0C(-683650618, A05);
            throw A0g;
        }
    }
}
