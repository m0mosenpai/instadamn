package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WI8 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ XDl A02;
    public final /* synthetic */ C145036gO A03;
    public final /* synthetic */ C69294Vl2 A04;
    public final /* synthetic */ AnonymousClass309 A05;
    public final /* synthetic */ String A06;

    public WI8(InterfaceC11380iw interfaceC11380iw, UserSession userSession, XDl xDl, C145036gO c145036gO, C69294Vl2 c69294Vl2, AnonymousClass309 anonymousClass309, String str) {
        this.A03 = c145036gO;
        this.A02 = xDl;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A05 = anonymousClass309;
        this.A06 = str;
        this.A04 = c69294Vl2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C145036gO c145036gO = this.A03;
        c145036gO.A00 = null;
        this.A02.DAj();
        if (!c145036gO.A03) {
            UserSession userSession = this.A01;
            C145036gO.A01(this.A00, userSession, c145036gO, this.A04, this.A05, this.A06, "cancel");
        }
    }
}
