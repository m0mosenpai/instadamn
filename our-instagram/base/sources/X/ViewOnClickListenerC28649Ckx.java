package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ckx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28649Ckx implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ InterfaceC145536hC A02;
    public final /* synthetic */ C139576Tm A03;

    public ViewOnClickListenerC28649Ckx(UserSession userSession, C41181vS c41181vS, InterfaceC145536hC interfaceC145536hC, C139576Tm c139576Tm) {
        this.A00 = userSession;
        this.A03 = c139576Tm;
        this.A02 = interfaceC145536hC;
        this.A01 = c41181vS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1751233352);
        C71313Hs.A00(this.A00).A0B(this.A03.A00, new String[0]);
        this.A02.Dne(this.A01);
        C0f9.A0C(1883125166, A05);
    }
}
