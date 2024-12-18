package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.fanclub.gifting.FanClubGiftingViewModel;
import com.instagram.fanclub.gifting.FanClubGiftingViewModel$fetchGiftOptions$1;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EIU extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "FanClubGiftingPriceSelectionFragment";
    public View A00;
    public C66362zD A01;
    public SpinnerImageView A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        SpinnerImageView A0V = AbstractC31180DnO.A0V(view);
        AbstractC31171DnF.A1M(A0V);
        this.A02 = A0V;
        this.A00 = view.requireViewById(R.id.price_selection_view);
        IgdsHeadline A0Q = AbstractC31179DnN.A0Q(view, R.id.price_selection_headline);
        Context A0L = AbstractC166997dE.A0L(A0Q);
        InterfaceC09390do interfaceC09390do = this.A03;
        A0Q.setImageDrawable(AbstractC35069Fcg.A00(A0L, (User) interfaceC09390do.getValue()));
        A0Q.setHeadline(2131963238);
        A0Q.setBody(2131963236);
        this.A01 = AbstractC31173DnH.A0R(AbstractC31174DnI.A0R(this), new Object());
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        C66362zD c66362zD = this.A01;
        if (c66362zD == null) {
            C14360o3.A0F("recyclerViewAdapter");
            throw C00O.createAndThrow();
        }
        A0F.setAdapter(c66362zD);
        AbstractC31177DnL.A0s(requireContext(), A0F);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.price_selection_footer);
        Context context = A0T.getContext();
        String A0p = AbstractC166997dE.A0p(context, 2131963239);
        SpannableStringBuilder A08 = AbstractC31178DnM.A08(this, A0p, 2131963237);
        AnonymousClass773.A03(A08, new Em1(this, AbstractC31174DnI.A02(context)), A0p);
        AbstractC31176DnK.A1G(A0T, A08);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        MCL mcl = new MCL(viewLifecycleOwner, c07s, this, null, 21);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mcl, A00);
        FanClubGiftingViewModel fanClubGiftingViewModel = (FanClubGiftingViewModel) this.A08.getValue();
        FragmentActivity requireActivity = requireActivity();
        Context requireContext = requireContext();
        User user = (User) interfaceC09390do.getValue();
        String A15 = AbstractC25225BEi.A15(this.A06);
        AbstractC167017dG.A1R(user, A15);
        C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, new FanClubGiftingViewModel$fetchGiftOptions$1(requireContext, requireActivity, fanClubGiftingViewModel, user, A15, null), AbstractC141776au.A00(fanClubGiftingViewModel));
        AbstractC23641Du.A05(anonymousClass191, new MCL(A0K, c07s, this, null, 22), C07Y.A00(A0K));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public EIU() {
        C37049GUf c37049GUf = new C37049GUf(this, 6);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37049GUf(new C37049GUf(this, 3), 4));
        this.A08 = AbstractC25225BEi.A0a(new C37049GUf(A00, 5), c37049GUf, new C50171MDy(28, null, A00), AbstractC25225BEi.A1D(FanClubGiftingViewModel.class));
        this.A04 = C37049GUf.A00(this, 0);
        this.A06 = C37049GUf.A00(this, 2);
        this.A05 = C37049GUf.A00(this, 1);
        this.A03 = C37053GUj.A00(this, 49);
        this.A07 = AbstractC60492pY.A02(this);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 6) {
            AbstractC25231BEo.A16(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1915506983);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fan_club_gifting_price_selection, viewGroup, false);
        C0f9.A09(571108326, A02);
        return inflate;
    }
}
