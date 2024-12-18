package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class U1P extends AbstractC66422zJ {
    public final Context A00;
    public final UserSession A01;
    public final C65921TwS A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C66456UIg c66456UIg = (C66456UIg) c3oo;
        AbstractC167017dG.A1N(interfaceC66482zP, c66456UIg);
        UserSession userSession = this.A01;
        Context context = this.A00;
        C65921TwS c65921TwS = this.A02;
        AbstractC25233BEq.A0w(2, userSession, context, c65921TwS);
        c65921TwS.A04.ClX(c65921TwS.A05.E6U());
        WNX.A00(c66456UIg.A00, context, userSession, c65921TwS, 55);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return VA2.class;
    }

    public U1P(Context context, UserSession userSession, C65921TwS c65921TwS) {
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = c65921TwS;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C66456UIg(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.search_boost_disclosure, false));
    }
}
