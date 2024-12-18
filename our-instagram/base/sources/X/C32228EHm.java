package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;

/* renamed from: X.EHm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32228EHm extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ConnectToGlassesEducationFragment";
    public final InterfaceC09390do A01 = AbstractC25225BEi.A0a(new MHI(this, 32), new MHI(this, 33), new C50171MDy(10, null, this), AbstractC25225BEi.A1D(C31788Dy7.class));
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "smart_glasses_sharing";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String A0p = AbstractC166997dE.A0p(requireContext(), 2131963477);
        SpannableStringBuilder A05 = AbstractC31175DnJ.A05(requireContext(), 2131963476);
        AnonymousClass773.A05(A05, new Em1(this, AbstractC31179DnN.A01(this)), A0p);
        ((IgdsBulletCell) view.requireViewById(R.id.share_from_your_glasses)).setIcon(R.drawable.instagram_glasses_pano_outline_24);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.help_center_text);
        A0T.setEnabled(true);
        AbstractC25227BEk.A11(A0T);
        A0T.setText(A05);
        View requireViewById = view.requireViewById(R.id.cancel_provider_linking);
        requireViewById.setEnabled(true);
        ViewOnClickListenerC35666Fp0.A00(requireViewById, 46, this);
        View requireViewById2 = view.requireViewById(R.id.connect_button);
        requireViewById2.setEnabled(true);
        ViewOnClickListenerC35666Fp0.A00(requireViewById2, 47, this);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2021012203);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.share_from_glasses_education_fragment, false);
        C0f9.A09(465712480, A02);
        return A0R;
    }
}
