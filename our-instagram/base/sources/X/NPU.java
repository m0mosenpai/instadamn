package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NPU extends N72 {
    public static final String __redex_internal_original_name = "MediaKitTextIntroFragment";
    public final InterfaceC09390do A00 = AbstractC25225BEi.A0a(new C57247PbV(this, 7), new C57247PbV(this, 8), C57535Pg9.A00(null, this, 39), AbstractC25225BEi.A1D(C51053Mh7.class));
    public final InterfaceC60122ou A01 = new C70568Wd2(this, 2);

    @Override // X.N72, X.InterfaceC11380iw
    public final String getModuleName() {
        return "MediaKitTextInfoFragment";
    }

    @Override // X.N72, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((C64P) view.requireViewById(R.id.mk_text_into_bottom_layout)).setPrimaryAction(getString(2131966769), new ViewOnClickListenerC55456OkA(this, 15));
        C56342iS.A01(new ViewOnClickListenerC55456OkA(this, 16), AbstractC31176DnK.A0C(view, R.id.mk_action_bar)).A0X(this.A01);
    }

    @Override // X.N72, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1109803240);
        super.onCreate(bundle);
        Window A0H = AbstractC31174DnI.A0H(this);
        C14360o3.A07(A0H);
        AbstractC56402iY.A08(A0H, false);
        AbstractC56402iY.A02(requireActivity(), 0);
        AbstractC55033OXz.A01(this, C05F.A0Y);
        C0f9.A09(1007286427, A02);
    }

    @Override // X.N72, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-392838220);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.media_kit_intro_text_fragment, viewGroup, false);
        C0f9.A09(663438338, A02);
        return inflate;
    }
}
