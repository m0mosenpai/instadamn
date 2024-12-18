package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.WHq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogInterfaceOnClickListenerC70209WHq implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ android.net.Uri A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C145036gO A04;
    public final /* synthetic */ C69294Vl2 A05;
    public final /* synthetic */ AnonymousClass309 A06;
    public final /* synthetic */ String A07;

    public DialogInterfaceOnClickListenerC70209WHq(Activity activity, android.net.Uri uri, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C145036gO c145036gO, C69294Vl2 c69294Vl2, AnonymousClass309 anonymousClass309, String str) {
        this.A04 = c145036gO;
        this.A01 = uri;
        this.A00 = activity;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A06 = anonymousClass309;
        this.A07 = str;
        this.A05 = c69294Vl2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C145036gO c145036gO = this.A04;
        c145036gO.A03 = true;
        C12260kU.A0G(this.A00, this.A01);
        UserSession userSession = this.A03;
        C145036gO.A01(this.A02, userSession, c145036gO, this.A05, this.A06, this.A07, "open_url");
    }
}
