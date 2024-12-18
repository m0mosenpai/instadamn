package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.business.ProfileAddressData;

/* loaded from: classes6.dex */
public final class EYU extends AbstractC66422zJ {
    public final C32339EMl A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E2X(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.profile_multiple_addresses_bottomsheet_item_view_holder, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        E8X e8x = (E8X) interfaceC66482zP;
        E2X e2x = (E2X) c3oo;
        AbstractC167007dF.A1K(e8x, e2x);
        ProfileAddressData profileAddressData = e8x.A00;
        String str = profileAddressData.A03;
        String A05 = AbstractC1567472a.A05(e2x.A00, null, profileAddressData.A08, profileAddressData.A05);
        C14360o3.A07(A05);
        if (str != null && str.length() != 0) {
            e2x.A02.setText(str);
            IgTextView igTextView = e2x.A01;
            igTextView.setText(A05);
            igTextView.setVisibility(0);
        } else {
            e2x.A02.setText(A05);
            e2x.A01.setVisibility(8);
        }
        ViewOnClickListenerC35687FpM.A00(e2x.itemView, 22, e8x, this);
    }

    public EYU(C32339EMl c32339EMl) {
        this.A00 = c32339EMl;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return E8X.class;
    }
}
