package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cl1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28653Cl1 implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC28653Cl1(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = c38321qM;
        this.A00 = context;
        this.A04 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1151860944);
        C47993LKk.A00.A03(this.A01, this.A02, this.A03, C05F.A0C);
        Context context = this.A00;
        C14360o3.A0A(context);
        AbstractC41776Ies.A03(context, this.A04);
        C0f9.A0C(-1796297244, A05);
    }
}
