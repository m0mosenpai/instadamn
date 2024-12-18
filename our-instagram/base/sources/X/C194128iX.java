package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.8iX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194128iX extends AbstractC66422zJ {
    public final UserSession A00;
    public final C194038iO A01;

    public C194128iX(UserSession userSession, C194038iO c194038iO) {
        C14360o3.A0B(c194038iO, 1);
        this.A01 = c194038iO;
        this.A00 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.redesigned_create_mode_destination_item, viewGroup, false);
        C14360o3.A07(inflate);
        AbstractC226559zD.A00(inflate);
        return new C210849Uh(inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C210849Uh c210849Uh = (C210849Uh) c3oo;
        C14360o3.A0B(c210849Uh, 1);
        C3P9 c3p9 = new C3P9(c210849Uh.A00);
        c3p9.A04 = new C3PD() { // from class: X.9hm
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view) {
                C194128iX.this.A01.A00.A0A.A0G(C81W.A0C);
                return true;
            }
        };
        c3p9.A07 = true;
        c3p9.A05 = C05F.A01;
        c3p9.A00();
        if (C18U.A06(C06090Tz.A05, this.A00, 36330823414268963L)) {
            IgTextView igTextView = c210849Uh.A01;
            igTextView.setText(igTextView.getContext().getString(2131971636));
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C194058iQ.class;
    }
}
