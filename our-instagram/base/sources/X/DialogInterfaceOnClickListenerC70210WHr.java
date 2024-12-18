package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.WHr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogInterfaceOnClickListenerC70210WHr implements DialogInterface.OnClickListener {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ XDl A02;
    public final /* synthetic */ C145036gO A03;
    public final /* synthetic */ C69294Vl2 A04;
    public final /* synthetic */ AnonymousClass309 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public DialogInterfaceOnClickListenerC70210WHr(InterfaceC11380iw interfaceC11380iw, UserSession userSession, XDl xDl, C145036gO c145036gO, C69294Vl2 c69294Vl2, AnonymousClass309 anonymousClass309, String str, String str2) {
        this.A03 = c145036gO;
        this.A07 = str;
        this.A01 = userSession;
        this.A02 = xDl;
        this.A00 = interfaceC11380iw;
        this.A05 = anonymousClass309;
        this.A06 = str2;
        this.A04 = c69294Vl2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C145036gO c145036gO = this.A03;
        c145036gO.A03 = true;
        String str = this.A07;
        if (str != null) {
            UserSession userSession = this.A01;
            C14360o3.A0B(userSession, 0);
            ((C68833Vco) userSession.A01(C68833Vco.class, C71778X4f.A00)).A00.add(str);
        }
        this.A02.D6w();
        UserSession userSession2 = this.A01;
        C145036gO.A01(this.A00, userSession2, c145036gO, this.A04, this.A05, this.A06, "show_posts");
    }
}
