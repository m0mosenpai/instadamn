package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fni, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35591Fni implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC148366m6 A02;
    public final /* synthetic */ C2EE A03;

    public ViewOnClickListenerC35591Fni(View view, UserSession userSession, InterfaceC148366m6 interfaceC148366m6, C2EE c2ee) {
        this.A01 = userSession;
        this.A00 = view;
        this.A03 = c2ee;
        this.A02 = interfaceC148366m6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1679288384);
        UserSession userSession = this.A01;
        View view2 = this.A00;
        C14360o3.A0A(view2);
        AbstractC34893FZf.A00(view2, userSession, this.A02, this.A03);
        C0f9.A0C(1166265319, A05);
    }
}
