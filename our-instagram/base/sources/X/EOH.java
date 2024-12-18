package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel;
import com.instagram.igds.components.emptystate.IgdsEmptyState;
import com.instagram.user.model.User;
import java.util.Collection;

/* loaded from: classes6.dex */
public final class EOH extends AbstractC43842Ja5 implements InterfaceC60122ou, InterfaceC37145GYg, InterfaceC37123GXi {
    public static final String __redex_internal_original_name = "FanClubMemberListFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC37145GYg
    public final /* synthetic */ void Cs2(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        F0C.A00(fragmentActivity, userSession, user, str);
    }

    @Override // X.InterfaceC37145GYg
    public final void DY5(User user) {
        Context A05 = AbstractC31176DnK.A05(this, user);
        String username = user.getUsername();
        C50674MYs A0W = AbstractC31177DnL.A0W(A05, this.A01);
        A0W.A07(username);
        A0W.A09(AbstractC166997dE.A0p(requireContext(), 2131976526), new ViewOnClickListenerC35673Fp8(user, this, A05, username, 7));
        new C31727DwY(A0W).A07(requireContext());
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131976534);
        if (AbstractC166987dD.A17(this.A00).equals("SETTINGS")) {
            interfaceC56362iU.EkS(true);
        } else {
            interfaceC56362iU.ETp(true);
            AbstractC31179DnN.A1G(interfaceC56362iU);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FanClubMemberListViewModel fanClubMemberListViewModel = (FanClubMemberListViewModel) this.A02.getValue();
        AbstractC166997dE.A1Y(fanClubMemberListViewModel.A0D, true);
        C141796aw A00 = AbstractC141776au.A00(fanClubMemberListViewModel);
        MBp mBp = new MBp(fanClubMemberListViewModel, null, 14);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mBp, A00);
        AbstractC23641Du.A05(anonymousClass191, new MC2(fanClubMemberListViewModel, null, 19), AbstractC141776au.A00(fanClubMemberListViewModel));
        View requireViewById = view.requireViewById(R.id.empty_state_headline);
        IgdsEmptyState igdsEmptyState = (IgdsEmptyState) requireViewById;
        igdsEmptyState.EW2(R.drawable.instagram_users_outline_96, true);
        C14360o3.A07(requireViewById);
        View A0S = AbstractC166997dE.A0S(view, R.id.create_group_chat_button);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, new JTH(A0S, this, viewLifecycleOwner, igdsEmptyState, c07s, (InterfaceC23621Ds) null, 36), C07Y.A00(viewLifecycleOwner));
        AbstractC23641Du.A05(anonymousClass191, new MCL(A0K, c07s, this, null, 26), C07Y.A00(A0K));
        G7M.A00(getRecyclerView(), this, 7);
        E0L.A00(getRecyclerView(), this, 17);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new EXW(this, this, this, AbstractC166987dD.A0r(this.A01)), new Object(), new EYS(this), new EYR(this), new Object(), new EYQ(this));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C37072GVh.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public EOH() {
        C37049GUf c37049GUf = new C37049GUf(this, 39);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37049GUf(new C37049GUf(this, 36), 37));
        this.A02 = AbstractC25225BEi.A0a(new C37049GUf(A00, 38), c37049GUf, new C50171MDy(36, null, A00), AbstractC25225BEi.A1D(FanClubMemberListViewModel.class));
        this.A00 = C37049GUf.A00(this, 35);
        this.A01 = AbstractC60492pY.A02(this);
    }

    public static final void A00(EOH eoh) {
        InputMethodManager inputMethodManager;
        View currentFocus = eoh.requireActivity().getCurrentFocus();
        if (currentFocus != null) {
            Object systemService = eoh.requireContext().getSystemService("input_method");
            if ((systemService instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) systemService) != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    @Override // X.InterfaceC37123GXi
    public final void D2e(FanClubCategoryType fanClubCategoryType, String str) {
        EnumC33397EpU enumC33397EpU;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("fan_club_category_type", fanClubCategoryType);
        A0b.putString("fan_club_category_name", str);
        String str2 = ((FanClubMemberListViewModel) this.A02.getValue()).A08;
        if (C14360o3.A0K(str2, "PROFILE")) {
            enumC33397EpU = EnumC33397EpU.A05;
        } else {
            if (C14360o3.A0K(str2, "SETTINGS")) {
                enumC33397EpU = EnumC33397EpU.A04;
            }
            C140966Yy A0c = AbstractC25231BEo.A0c(requireActivity(), this.A01);
            A0c.A0B(A0b, new EOG());
            A0c.A04();
        }
        A0b.putString("entrypoint", enumC33397EpU.A00);
        C140966Yy A0c2 = AbstractC25231BEo.A0c(requireActivity(), this.A01);
        A0c2.A0B(A0b, new EOG());
        A0c2.A04();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(2014403045);
        super.onPause();
        A00(this);
        C0f9.A09(-1682506897, A02);
    }
}
