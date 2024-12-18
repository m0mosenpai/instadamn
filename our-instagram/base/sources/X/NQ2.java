package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.IGRevShareProductType;

/* loaded from: classes9.dex */
public final class NQ2 extends N6E {
    public static final String __redex_internal_original_name = "CreatorRevshareAdsAboutFragment";
    public final InterfaceC09390do A00 = C57509Pfj.A00(this, 16);

    @Override // X.N6E, X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        C14360o3.A0B(interfaceC56362iU, 0);
        super.configureActionBar(interfaceC56362iU);
        if (AbstractC50523MSb.A04(this.A00) == 2) {
            i = 2131963753;
        } else {
            i = 2131963798;
            if (AbstractC54069NvT.A00(AbstractC166987dD.A0r(this.A02))) {
                i = 2131963858;
            }
        }
        interfaceC56362iU.Efu(i);
        AbstractC31176DnK.A1C(new ViewOnClickListenerC55456OkA(this, 37), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // X.N6E, X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.N6E, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A00;
        if (AbstractC50523MSb.A04(interfaceC09390do) == 2) {
            F9B.A00(null, null, view, this, AbstractC25227BEk.A0v(this, 2131963752), getString(2131963751), null, C16930sl.A00);
        } else {
            InterfaceC09390do interfaceC09390do2 = this.A02;
            int i = 2131963797;
            if (AbstractC54069NvT.A00(AbstractC166987dD.A0r(interfaceC09390do2))) {
                i = 2131963857;
            }
            int i2 = 2131963796;
            if (AbstractC54069NvT.A00(AbstractC166987dD.A0r(interfaceC09390do2))) {
                i2 = 2131963856;
            }
            F9B.A00(null, new ViewOnClickListenerC55456OkA(this, 38), view, this, AbstractC25227BEk.A0v(this, i), getString(i2), getString(2131963749), C16930sl.A00);
        }
        C51571MqP c51571MqP = (C51571MqP) A03().A02.A02();
        if (c51571MqP != null && (str = c51571MqP.A03) != null) {
            N6E.A00(view, str);
        }
        if (interfaceC09390do.getValue() == IGRevShareProductType.A05) {
            ((C64P) view.requireViewById(R.id.bottom_button_layout)).setPrimaryAction(AbstractC25227BEk.A0v(this, 2131963749), new ViewOnClickListenerC55456OkA(this, 39));
            C64P c64p = (C64P) view.findViewById(R.id.bottom_button_layout);
            if (c64p != null) {
                c64p.setSecondaryAction(getString(2131963750), new ViewOnClickListenerC55456OkA(this, 40));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(419035067);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.creator_revshare_ads_about_ads, false);
        C0f9.A09(1686694211, A02);
        return A0R;
    }
}
