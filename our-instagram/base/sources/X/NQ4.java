package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NQ4 extends N6G {
    public static final String __redex_internal_original_name = "CreatorRevshareSettingsFragment";
    public final InterfaceC09390do A00;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        C14360o3.A0B(interfaceC56362iU, 0);
        C50977Mfk A0T = MSY.A0T(this);
        if (A0T.A00.ordinal() == 2) {
            i = 2131963788;
        } else {
            i = 2131963825;
            if (AbstractC54069NvT.A00(A0T.A02)) {
                i = 2131963866;
            }
        }
        interfaceC56362iU.Efu(i);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A06 = R.drawable.instagram_settings_pano_outline_24;
        A0B.A05 = 2131963824;
        AbstractC31176DnK.A1B(new ViewOnClickListenerC55456OkA(this, 41), A0B, interfaceC56362iU);
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "creator_revshare_setting";
    }

    @Override // X.N6G, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57165PZj(c07s, this, viewLifecycleOwner, null, 8), C07Y.A00(viewLifecycleOwner));
    }

    public NQ4() {
        C57509Pfj c57509Pfj = new C57509Pfj(this, 19);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57509Pfj(new C57509Pfj(this, 20), 21));
        this.A00 = AbstractC25225BEi.A0a(new C57509Pfj(A00, 22), c57509Pfj, new C57255Pbd(25, null, A00), AbstractC25225BEi.A1D(C50977Mfk.class));
    }
}
