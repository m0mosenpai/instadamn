package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.KHx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45634KHx extends AbstractC66412zI {
    public final C57312k6 A00;
    public final UserSession A01;

    public C45634KHx(C57312k6 c57312k6, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = c57312k6;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 0);
        boolean A01 = LC3.A01(userSession);
        int i = R.layout.card_gallery_card_base_legacy_layout;
        if (A01) {
            i = R.layout.card_gallery_card_base_layout;
        }
        return new C44759Jrg(AbstractC25226BEj.A0R(layoutInflater, viewGroup, i, false), this.A00, userSession, AbstractC47114Ks9.A00(viewGroup));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45201Jzh c45201Jzh = (C45201Jzh) interfaceC66482zP;
        C44759Jrg c44759Jrg = (C44759Jrg) c3oo;
        AbstractC167017dG.A1N(c45201Jzh, c44759Jrg);
        c44759Jrg.A00(c45201Jzh);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45201Jzh.class;
    }
}
