package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NFF extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC144586fe A02;
    public final InterfaceC57981PnR A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56086Ov3 c56086Ov3 = (C56086Ov3) interfaceC66482zP;
        C51333Mlu c51333Mlu = (C51333Mlu) c3oo;
        AbstractC167017dG.A1N(c56086Ov3, c51333Mlu);
        InterfaceC144586fe interfaceC144586fe = this.A02;
        AbstractC54141Nwd.A00(this.A00, this.A01, c56086Ov3.A00, null, interfaceC144586fe, this.A03, c51333Mlu, c51333Mlu.getAbsoluteAdapterPosition());
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        LayoutInflater A0E = AbstractC31177DnL.A0E(viewGroup, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C51333Mlu(viewGroup, AbstractC25226BEj.A0R(A0E, viewGroup, R.layout.layout_roll_call_interstitial_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56086Ov3.class;
    }

    public NFF(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC144586fe interfaceC144586fe, InterfaceC57981PnR interfaceC57981PnR) {
        this.A02 = interfaceC144586fe;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = interfaceC57981PnR;
    }
}
