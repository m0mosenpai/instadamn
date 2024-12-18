package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KI9 extends AbstractC66412zI {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02;
    public final InterfaceC16820sZ A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44708Jqr(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.row_appreciation_insights_header, false));
    }

    public KI9(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = C45523KDo.__redex_internal_original_name;
        this.A03 = interfaceC16820sZ;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45193JzZ c45193JzZ = (C45193JzZ) interfaceC66482zP;
        C44708Jqr c44708Jqr = (C44708Jqr) c3oo;
        AbstractC167017dG.A1N(c45193JzZ, c44708Jqr);
        c44708Jqr.A01.setText(c45193JzZ.A01);
        c44708Jqr.A02.setText(c45193JzZ.A00);
        Context context = c44708Jqr.A00.getContext();
        String A0p = AbstractC166997dE.A0p(context, 2131953096);
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        String str = this.A02;
        FW0.A00(c44708Jqr.A03, fragmentActivity, userSession, C2Fb.A1L, str, AbstractC31177DnL.A0b(context, A0p, 2131953027), A0p, "https://help.instagram.com/3219033311670546", C50250MHf.A01(this, 5));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45193JzZ.class;
    }
}
