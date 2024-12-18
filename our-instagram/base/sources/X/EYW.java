package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.business.ProfileAddressData;

/* loaded from: classes6.dex */
public final class EYW extends AbstractC66422zJ {
    public final EK0 A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E33(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.profile_multiple_addresses_edit_list_address_item_view_holder, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        IgTextView igTextView;
        E8X e8x = (E8X) interfaceC66482zP;
        E33 e33 = (E33) c3oo;
        int i = 0;
        AbstractC167007dF.A1K(e8x, e33);
        ProfileAddressData profileAddressData = e8x.A00;
        String str = profileAddressData.A03;
        String A05 = AbstractC1567472a.A05(e33.A00, null, profileAddressData.A08, profileAddressData.A05);
        C14360o3.A07(A05);
        int i2 = 0;
        if (str != null && str.length() > 0) {
            e33.A03.setText(str);
            igTextView = e33.A02;
            igTextView.setText(A05);
        } else {
            i = 8;
            e33.A03.setText(A05);
            igTextView = e33.A02;
        }
        igTextView.setVisibility(i);
        IgTextView igTextView2 = e33.A01;
        if (!C14360o3.A0K(profileAddressData.A06, "primary")) {
            i2 = 8;
        }
        igTextView2.setVisibility(i2);
        ViewOnClickListenerC35687FpM.A00(e33.itemView, 24, e8x, this);
    }

    public EYW(EK0 ek0) {
        this.A00 = ek0;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return E8X.class;
    }
}
