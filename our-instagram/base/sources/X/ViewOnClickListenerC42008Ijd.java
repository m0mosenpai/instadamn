package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ijd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42008Ijd implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C105814ps A01;
    public final /* synthetic */ C41181vS A02;
    public final /* synthetic */ C41551w4 A03;
    public final /* synthetic */ C3G2 A04;
    public final /* synthetic */ InterfaceC144586fe A05;
    public final /* synthetic */ C6e7 A06;

    public ViewOnClickListenerC42008Ijd(UserSession userSession, C105814ps c105814ps, C41181vS c41181vS, C41551w4 c41551w4, C3G2 c3g2, InterfaceC144586fe interfaceC144586fe, C6e7 c6e7) {
        this.A05 = interfaceC144586fe;
        this.A01 = c105814ps;
        this.A06 = c6e7;
        this.A02 = c41181vS;
        this.A00 = userSession;
        this.A03 = c41551w4;
        this.A04 = c3g2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1100756126);
        InterfaceC144586fe interfaceC144586fe = this.A05;
        interfaceC144586fe.DhG(this.A01);
        C6e7 c6e7 = this.A06;
        C141466aP.A02(this.A00, this.A02, this.A03, this.A04, interfaceC144586fe, c6e7);
        C0f9.A0C(158802453, A05);
    }
}
