package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EfK extends C33H {
    public final /* synthetic */ View A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public EfK(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A00 = view;
        this.A02 = userSession;
        this.A03 = str;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.C33H, X.C33I
    public final void Dtt(C5SW c5sw) {
        this.A00.postDelayed(new GPL(this.A01, this.A02, this.A03), 2000L);
    }
}
