package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.facebook.R;

/* renamed from: X.KBf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45470KBf extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "GalleryCoverPhotoPickerFragment";
    public C50889MeK A00;
    public String A01;
    public KFG A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        KFG kfg = this.A02;
        if (kfg == null) {
            C14360o3.A0F("galleryCoverPhotoPickerController");
            throw C00O.createAndThrow();
        }
        Context context = kfg.A02;
        View ESm = ((C56352iT) interfaceC56362iU).ESm(R.layout.layout_folder_picker, AbstractC53242c7.A0G(context, R.attr.actionBarStartSpacing), 0, true);
        C14360o3.A0C(ESm, "null cannot be cast to non-null type com.instagram.ui.widget.trianglespinner.TriangleSpinner");
        Spinner spinner = (Spinner) ESm;
        spinner.setDropDownVerticalOffset(-C3HB.A00(context));
        spinner.setAdapter((SpinnerAdapter) kfg.A03);
        spinner.setOnItemSelectedListener(kfg);
        C3LO c3lo = new C3LO();
        c3lo.A06 = R.drawable.instagram_x_pano_outline_24;
        c3lo.A05 = 2131956237;
        c3lo.A0G = new ViewOnClickListenerC48063LPo(kfg, 56);
        c3lo.A0P = true;
        interfaceC56362iU.A8u(new C3LY(c3lo));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "gallery_cover_photo_picker_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1802306694);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A01 = bundle2.getString(MSV.A00(708));
            this.A00 = (C50889MeK) new C52942bb(requireActivity()).A00(C50889MeK.class);
            KFG kfg = new KFG(this, AbstractC166987dD.A0r(this.A03), this);
            this.A02 = kfg;
            registerLifecycleListener(kfg);
            C0f9.A09(-716897470, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(1371665786, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1436287238);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_gallery_cover_photo_picker_fragment, false);
        C0f9.A09(367974193, A02);
        return A0R;
    }
}
