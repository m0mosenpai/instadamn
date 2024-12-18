package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KJU extends AbstractC66422zJ {
    public final InterfaceC159877Ez A00;
    public final UserSession A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C44622JpS c44622JpS = (C44622JpS) c3oo;
        C14360o3.A0B(c44622JpS, 1);
        InterfaceC159877Ez interfaceC159877Ez = this.A00;
        C14360o3.A0B(interfaceC159877Ez, 2);
        KKp.A01(AbstractC166987dD.A0s(c44622JpS.A00), interfaceC159877Ez, 25);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZ8.class;
    }

    public KJU(UserSession userSession, InterfaceC159877Ez interfaceC159877Ez) {
        this.A01 = userSession;
        this.A00 = interfaceC159877Ez;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C44622JpS(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.see_more_direct_star_tab_item, false));
    }
}
