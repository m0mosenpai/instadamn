package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.EJa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32265EJa extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectDeleteThreadsEducationFragment";
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A02 = AbstractC09440dt.A00(EnumC09460dv.A02, GUN.A00);
    public final int A00 = 834871144;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131957654);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_delete_messages_education_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C64P c64p = (C64P) AbstractC166987dD.A0c(view, R.id.continue_button);
        c64p.setPrimaryActionOnClickListener(ViewOnClickListenerC35689FpO.A00(this, 68));
        c64p.setSecondaryActionOnClickListener(ViewOnClickListenerC35689FpO.A00(this, 69));
    }

    public static final C006802i A00(C32265EJa c32265EJa) {
        return (C006802i) AbstractC166987dD.A17(c32265EJa.A02);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2136631667);
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().A06(new C44439Jl3(this, 4), this);
        C0f9.A09(-284035899, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1632224175);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.delete_threads_education_fragment, viewGroup, false);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166987dD.A0c(inflate, R.id.delete_threads_education_title_textview);
        igdsHeadline.requestFocus();
        C006802i A00 = A00(this);
        int i = this.A00;
        A00.markerStart(i);
        C35228FgL A01 = C35228FgL.A01(requireContext(), true);
        A01.A04(AbstractC166997dE.A0N(this).getString(2131955115), AbstractC166997dE.A0N(this).getString(2131955114), R.drawable.instagram_media_pano_outline_24);
        A01.A04(AbstractC166997dE.A0N(this).getString(2131954751), AbstractC166997dE.A0N(this).getString(2131954750), R.drawable.instagram_delete_pano_outline_24);
        C35228FgL.A02(A01, igdsHeadline, AbstractC166997dE.A0N(this).getString(2131957673), AbstractC166997dE.A0N(this).getString(2131957672), R.drawable.instagram_channels_pano_outline_24);
        A00(this).markerPoint(i, "nux_thread_impression");
        C0f9.A09(-1296867572, A02);
        return inflate;
    }
}
