package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iii, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41951Iii implements View.OnClickListener {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC144936gD A02;

    public ViewOnClickListenerC41951Iii(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC144936gD interfaceC144936gD) {
        this.A02 = interfaceC144936gD;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-464601589);
        this.A02.Dqu();
        UserSession userSession = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        new C63702ur(interfaceC11380iw, userSession).A0A(new C6PH(new C6PG("su_stories", "", interfaceC11380iw.getModuleName())));
        C0f9.A0C(-1093618772, A05);
    }
}
