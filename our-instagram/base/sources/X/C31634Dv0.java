package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dv0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31634Dv0 extends AbstractC66422zJ {
    public final C31621Dun A00;
    public final UserSession A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C31975E3d(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_contact_sync_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C31975E3d c31975E3d = (C31975E3d) c3oo;
        C14360o3.A0B(c31975E3d, 1);
        Context context = c31975E3d.A00.getContext();
        AbstractC166987dD.A1P(context, c31975E3d.A04, 2131956613);
        AbstractC166987dD.A1P(context, c31975E3d.A03, 2131956594);
        AbstractC166997dE.A19(context, c31975E3d.A02, R.drawable.instagram_contacts_pano_outline_24);
        ViewOnClickListenerC35680FpF.A00(c31975E3d.A05, 45, this);
        FpQ.A01(c31975E3d.A01, 24, this, c31975E3d);
    }

    public C31634Dv0(UserSession userSession, C31621Dun c31621Dun) {
        this.A01 = userSession;
        this.A00 = c31621Dun;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36172Fxm.class;
    }
}
