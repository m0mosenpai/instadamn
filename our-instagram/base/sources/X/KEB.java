package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KEB extends C7E1 {
    public final Context A00;
    public final KEW A01;
    public final KER A02;
    public final List A03;
    public final Map A04;

    public KEB(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, InterfaceC150196pR interfaceC150196pR) {
        this.A00 = context;
        KEW kew = new KEW(context, interfaceC11380iw, userSession, c1810981l, interfaceC150196pR, null, false, false);
        this.A01 = kew;
        KER ker = new KER(context, null);
        this.A02 = ker;
        this.A03 = AbstractC166987dD.A1E();
        this.A04 = AbstractC166987dD.A1G();
        A0B(ker, kew);
    }
}
