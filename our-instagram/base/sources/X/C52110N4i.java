package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.N4i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52110N4i extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PromoteFbPreviewFragment";
    public View A00;
    public View A01;
    public AnonymousClass195 A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_fb_preview";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = view.requireViewById(R.id.main_container);
        this.A00 = view.requireViewById(R.id.loading_spinner);
        InterfaceC09390do interfaceC09390do = this.A04;
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), ((C50955MfO) interfaceC09390do.getValue()).A00, new C50259MHo(this, 48), 47);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.ad_preview_options_container);
        A0C.removeAllViews();
        for (EnumC53276NhE enumC53276NhE : ((C50955MfO) interfaceC09390do.getValue()).A05) {
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.promote_fb_preview_option, A0C, false);
            ViewOnClickListenerC55464OkJ.A01(inflate, 21, this, enumC53276NhE);
            AbstractC166997dE.A0T(inflate, R.id.preview_option_title).setText(enumC53276NhE.A01);
            AbstractC31173DnH.A0I(inflate, R.id.preview_option_icon).setImageDrawable(requireActivity().getDrawable(enumC53276NhE.A00));
            A0C.addView(inflate);
        }
        TextView A0N = AbstractC167007dF.A0N(view, R.id.promote_preview_disclaimer);
        String A0v = AbstractC25227BEk.A0v(this, 2131970864);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(MSZ.A0q(this, A0v, 2131970862));
        AnonymousClass773.A03(A0H, new NY0(this, AbstractC25233BEq.A04(this)), A0v);
        AbstractC31176DnK.A1G(A0N, A0H);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C52110N4i() {
        X31 x31 = new X31(this, 42);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X31(new X31(this, 39), 40));
        this.A04 = AbstractC25225BEi.A0a(new X31(A00, 41), x31, new C57253Pbb(23, null, A00), AbstractC25225BEi.A1D(C50955MfO.class));
        this.A03 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1575284821);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_fragment_fb_preview, viewGroup, false);
        C0f9.A09(-250325321, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(123931913);
        super.onDestroyView();
        this.A01 = null;
        this.A00 = null;
        C0f9.A09(959920878, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1824468022);
        super.onStart();
        this.A02 = AbstractC18560vj.A03(AbstractC25229BEm.A0a(this), MSW.A1I(new MC5(this, null, 33), ((C50955MfO) this.A04.getValue()).A07));
        C0f9.A09(881049089, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1270816532);
        super.onStop();
        this.A02 = MSY.A0r(this.A02);
        C0f9.A09(-1998898775, A02);
    }
}
