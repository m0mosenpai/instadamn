package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.search.SearchController;

/* loaded from: classes6.dex */
public final class EJY extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "GlobalBlocksSearchFragment";
    public C66362zD A00;
    public FNG A01;
    public UserSession A02;
    public InterfaceC169517hR A03;
    public SearchController A04;
    public boolean A05;
    public final InterfaceC71990XEd A06 = new GHv(this);
    public final InterfaceC37219GaU A07 = new C36765GIo(this, 4);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "global_blocks_search";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A05 = true;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        FNG fng = this.A01;
        C14360o3.A0A(fng);
        fng.A00.EYJ(fng.A02);
        FragmentActivity requireActivity = requireActivity();
        ViewGroup A0F = AbstractC31173DnH.A0F(view, R.id.global_blocks_search_container);
        UserSession userSession = this.A02;
        if (userSession != null) {
            int A00 = C3HB.A00(AbstractC31172DnG.A04(this));
            C66362zD c66362zD = this.A00;
            C14360o3.A0A(c66362zD);
            SearchController searchController = new SearchController(requireActivity, A0F, c66362zD, linearLayoutManager, userSession, null, null, null, this.A06, A00, 0L, false, false, false, false, false, false, false);
            this.A04 = searchController;
            searchController.A07 = true;
            registerLifecycleListener(searchController);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnResume() {
        super.afterOnResume();
        if (this.A05) {
            SearchController searchController = this.A04;
            C14360o3.A0A(searchController);
            searchController.A02(true, 0.0f);
            this.A05 = false;
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.2zJ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2053081303);
        super.onCreate(bundle);
        this.A02 = AbstractC31177DnL.A0R(this);
        Context requireContext = requireContext();
        UserSession userSession = this.A02;
        C14360o3.A0A(userSession);
        FOI foi = new FOI(requireContext, this, EnumC33486ErL.BLOCKED_ACCOUNTS, this, userSession, this.A07, "blocked_list_user_row", "inbox_search", "search");
        C66392zG A0R = AbstractC31174DnI.A0R(this);
        A0R.A01(new EXV(requireContext(), this, foi));
        A0R.A01(new Object());
        A0R.A01(new EXO(requireContext(), null));
        this.A00 = AbstractC31173DnH.A0R(A0R, new Object());
        Context requireContext2 = requireContext();
        UserSession userSession2 = this.A02;
        C14360o3.A0A(userSession2);
        this.A03 = AbstractC31674Dvf.A02(requireContext2, userSession2, new C61972ry(requireContext(), AbstractC018607g.A00(this), null), new C32059E6l(null, null, 0, 0, 0, 0, false, false, false, false, false, false, false));
        UserSession userSession3 = this.A02;
        C14360o3.A0A(userSession3);
        InterfaceC169517hR interfaceC169517hR = this.A03;
        C14360o3.A0A(interfaceC169517hR);
        this.A01 = new FNG(userSession3, interfaceC169517hR, new FPU(requireContext()), this);
        C0f9.A09(270863474, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1536715687);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.global_blocks_search_fragment, viewGroup, false);
        C0f9.A09(-1064009667, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-606611261);
        super.onDestroy();
        this.A00 = null;
        InterfaceC169517hR interfaceC169517hR = this.A03;
        C14360o3.A0A(interfaceC169517hR);
        interfaceC169517hR.DEw();
        C0f9.A09(-1520369749, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1295373414);
        super.onDestroyView();
        unregisterLifecycleListener(this.A04);
        this.A04 = null;
        C0f9.A09(1357903107, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1314990215);
        super.onPause();
        SearchController searchController = this.A04;
        C14360o3.A0A(searchController);
        searchController.A00();
        C0f9.A09(1686773302, A02);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1H(interfaceC56362iU);
    }
}
