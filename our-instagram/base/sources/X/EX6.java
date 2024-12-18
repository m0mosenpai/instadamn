package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class EX6 extends AbstractC66412zI {
    public final FGA A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        E3K e3k = (E3K) c3oo;
        C14360o3.A0B(e3k, 1);
        FGA fga = this.A00;
        C14360o3.A0B(fga, 1);
        IgTextView igTextView = e3k.A03;
        igTextView.setVisibility(0);
        e3k.A04.setVisibility(8);
        IgTextView igTextView2 = e3k.A02;
        igTextView2.setVisibility(0);
        e3k.A01.setVisibility(8);
        Context context = igTextView2.getContext();
        C14360o3.A0A(context);
        AbstractC166987dD.A1O(context, igTextView2, C1QI.A01(context));
        ViewOnClickListenerC35666Fp0.A00(igTextView2, 12, fga);
        int dimensionPixelSize = e3k.A00.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        AbstractC13880nE.A0j(igTextView, dimensionPixelSize, dimensionPixelSize);
        AbstractC13880nE.A0j(igTextView2, dimensionPixelSize, dimensionPixelSize);
    }

    public EX6(FGA fga) {
        this.A00 = fga;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new E3K(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.save_to_collection_fragment_title_bar, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36174Fxo.class;
    }
}
