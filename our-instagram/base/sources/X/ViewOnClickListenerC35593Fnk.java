package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fnk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35593Fnk implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC148366m6 A02;
    public final /* synthetic */ C2EE A03;

    public ViewOnClickListenerC35593Fnk(View view, UserSession userSession, InterfaceC148366m6 interfaceC148366m6, C2EE c2ee) {
        this.A00 = view;
        this.A01 = userSession;
        this.A03 = c2ee;
        this.A02 = interfaceC148366m6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(722696219);
        View view2 = this.A00;
        C14360o3.A0A(view2);
        AbstractC34086F2o.A00(view2, this.A01, this.A02, this.A03, false);
        C0f9.A0C(2013124694, A05);
    }
}
