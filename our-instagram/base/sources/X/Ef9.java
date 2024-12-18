package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* loaded from: classes6.dex */
public final class Ef9 extends AbstractC32317ELg {
    public static final String __redex_internal_original_name = "ManageDataSettingsFragment";
    public FRA A00;
    public EVF A01;
    public boolean A02;
    public final View.OnClickListener A03 = ViewOnClickListenerC35685FpK.A00(this, 29);
    public final InterfaceC41501vz A04 = C31650DvG.A00(this, 48);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "manage_data_settings";
    }

    @Override // X.AbstractC32317ELg, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1030563880);
        super.onCreate(bundle);
        this.A00 = C35154Few.A00().A00.A07;
        this.A02 = true;
        C0f9.A09(1790002474, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2119326409);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.manage_data_settings_review_layout);
        TextView A0T = AbstractC166997dE.A0T(A0A, R.id.content_title);
        ViewGroup A0F = AbstractC31173DnH.A0F(A0A, R.id.paragraphs_container);
        View requireViewById = A0A.requireViewById(R.id.manage_data_settings_button);
        View findViewById = A0A.findViewById(R.id.accept_button);
        FRA fra = this.A00;
        if (fra != null) {
            A0T.setText(fra.A01);
            F80.A00(requireContext(), A0F, fra.A03);
            C0fQ.A00(this.A03, requireViewById);
            findViewById.getClass();
            EVF evf = new EVF(this, (ProgressButton) findViewById, C35154Few.A00().A08);
            this.A01 = evf;
            registerLifecycleListener(evf);
            C41451vu.A01.A02(this.A04, C36040Fvc.class);
        }
        C0f9.A09(1836752628, A02);
        return A0A;
    }

    @Override // X.AbstractC32317ELg, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1326448076);
        super.onDestroy();
        if (this.A00 != null) {
            unregisterLifecycleListener(this.A01);
            C41451vu.A01.A03(this.A04, C36040Fvc.class);
        }
        C0f9.A09(1442027818, A02);
    }
}
