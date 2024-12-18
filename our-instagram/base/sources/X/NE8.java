package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NE8 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51319Mlg(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_kit_section_type_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56109OvT c56109OvT = (C56109OvT) interfaceC66482zP;
        C51319Mlg c51319Mlg = (C51319Mlg) c3oo;
        AbstractC167017dG.A1N(c56109OvT, c51319Mlg);
        MSW.A0D(c51319Mlg.A03).setText(c56109OvT.A03);
        MSW.A0D(c51319Mlg.A01).setText(c56109OvT.A02);
        ViewOnClickListenerC55461OkG.A00(AbstractC166987dD.A0d(c51319Mlg.A02), 69, c56109OvT);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56109OvT.class;
    }
}
