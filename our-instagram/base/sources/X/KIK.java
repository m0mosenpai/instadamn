package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KIK extends AbstractC66412zI {
    public final UserSession A00;
    public final C47335Kvk A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1R = AbstractC167007dF.A1R(0, viewGroup, layoutInflater);
        View A0D = AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_like_sticker_tray_item, false);
        C14360o3.A0B(A0D, A1R ? 1 : 0);
        return new C3OO(A0D);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        new C3P9(AbstractC31171DnF.A06(c3oo));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45641KIe c45641KIe = (C45641KIe) interfaceC66482zP;
        boolean A1a = AbstractC167017dG.A1a(c45641KIe, c3oo);
        UserSession userSession = this.A00;
        C47335Kvk c47335Kvk = this.A01;
        C51751Mta c51751Mta = c45641KIe.A00;
        C14360o3.A0B(userSession, 0);
        AbstractC167007dF.A1D(c47335Kvk, A1a ? 1 : 0, c51751Mta);
        C3P9 A0s = AbstractC166987dD.A0s(AbstractC31171DnF.A06(c3oo));
        A0s.A04 = new C43890Jax(4, c47335Kvk, c51751Mta, c3oo);
        AbstractC47848LBr.A01(userSession, A0s);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45641KIe.class;
    }

    public KIK(UserSession userSession, C47335Kvk c47335Kvk) {
        this.A00 = userSession;
        this.A01 = c47335Kvk;
    }
}
