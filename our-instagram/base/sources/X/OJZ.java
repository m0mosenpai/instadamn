package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OJZ {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass841 A02;
    public final C50699MZu A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16660sJ A06;

    public final void A00(View view) {
        C14360o3.A0B(view, 0);
        C6WI.A01().A0W = true;
        this.A03.A0B(EnumC39584Hdu.A06, "media_broadcast_share", AbstractC55229Oez.A0I(this.A01, this.A02, false));
        if (!C6WI.A01().A0X) {
            this.A06.invoke(view);
        }
    }

    public OJZ(Context context, UserSession userSession, AnonymousClass841 anonymousClass841, C50699MZu c50699MZu, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167017dG.A1R(c50699MZu, userSession);
        this.A00 = context;
        this.A03 = c50699MZu;
        this.A01 = userSession;
        this.A02 = anonymousClass841;
        this.A06 = interfaceC16660sJ;
        this.A05 = interfaceC16820sZ;
        this.A04 = interfaceC16820sZ2;
    }
}
