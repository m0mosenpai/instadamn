package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Drw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31452Drw extends AbstractC66412zI {
    public final AbstractC59962oe A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C57112jm A03 = C57112jm.A00();
    public final InterfaceC92864Ec A04;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        return new C4FA(layoutInflater, AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_cf_hub, false), this.A00, interfaceC11380iw, userSession, this.A03, new C31458Ds2(), this.A04);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        JWN jwn = (JWN) interfaceC66482zP;
        C4FA c4fa = (C4FA) c3oo;
        AbstractC167017dG.A1N(jwn, c4fa);
        c4fa.A00(jwn);
    }

    public C31452Drw(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC92864Ec interfaceC92864Ec) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = abstractC59962oe;
        this.A04 = interfaceC92864Ec;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return JWN.class;
    }
}
