package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.Collection;

/* loaded from: classes6.dex */
public final class EOF extends AbstractC43842Ja5 implements InterfaceC60122ou, InterfaceC37145GYg {
    public static final String __redex_internal_original_name = "FanClubRemovedMemberListFragment";
    public SpinnerImageView A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC37145GYg
    public final /* synthetic */ void Cs2(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        F0C.A00(fragmentActivity, userSession, user, str);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131976529);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC31180DnO.A0V(view);
        int A01 = AbstractC31177DnL.A01(view, R.id.search_box);
        getRecyclerView().A14(new C153156uj(getRecyclerView().A0D, new G7M(this, A01), C153146ui.A0A, false, false));
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A02);
        C141796aw A00 = AbstractC141776au.A00(A0Z);
        MBp mBp = new MBp(A0Z, null, 15);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mBp, A00);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC23641Du.A05(anonymousClass191, new MCL(viewLifecycleOwner, c07s, this, null, 27), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC166987dD.A1J(new EXW(this, this, this, AbstractC166987dD.A0r(this.A01)));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C37074GVj.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public EOF() {
        C37049GUf c37049GUf = new C37049GUf(this, 43);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37049GUf(new C37049GUf(this, 40), 41));
        this.A02 = AbstractC25225BEi.A0a(new C37049GUf(A00, 42), c37049GUf, new C50171MDy(37, null, A00), AbstractC25225BEi.A1D(C44507JmD.class));
        this.A01 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC37145GYg
    public final void DY5(User user) {
        Context A05 = AbstractC31176DnK.A05(this, user);
        C50674MYs A0W = AbstractC31177DnL.A0W(A05, this.A01);
        A0W.A07(user.getUsername());
        A0W.A03(new ViewOnClickListenerC35684FpJ(31, A05, this, user), 2131976500);
        C31727DwY.A02(this, A0W);
    }
}
