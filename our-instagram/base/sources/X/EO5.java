package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EO5 extends C53Z implements InterfaceC71990XEd, InterfaceC60122ou, GZX {
    public static final String __redex_internal_original_name = "RestrictSearchFragment";
    public InterfaceC169517hR A00;
    public SearchController A01;
    public boolean A02;

    @Override // X.InterfaceC71990XEd
    public final float Aby(SearchController searchController, Integer num) {
        return 0.0f;
    }

    @Override // X.InterfaceC71990XEd
    public final void Cwf(SearchController searchController, Integer num, float f, float f2) {
    }

    @Override // X.InterfaceC71990XEd
    public final void DTR() {
    }

    @Override // X.InterfaceC71990XEd
    public final void DTT() {
    }

    @Override // X.InterfaceC71990XEd
    public final void DjB(SearchController searchController, boolean z) {
    }

    @Override // X.InterfaceC71990XEd
    public final void DjP(String str, boolean z) {
    }

    @Override // X.InterfaceC71990XEd
    public final void DjS(String str, String str2) {
        C14360o3.A0B(str, 0);
        InterfaceC169517hR interfaceC169517hR = this.A00;
        if (interfaceC169517hR == null) {
            C14360o3.A0F("searchProvider");
            throw C00O.createAndThrow();
        }
        interfaceC169517hR.Eby(str);
    }

    @Override // X.InterfaceC71990XEd
    public final void DoO(SearchController searchController, Integer num, Integer num2) {
    }

    @Override // X.GZX
    public final void Dxd(User user, int i) {
        C32367ENr c32367ENr;
        AbstractC10360h2 abstractC10360h2;
        if (getTargetFragment() instanceof C32367ENr) {
            Fragment targetFragment = getTargetFragment();
            if ((targetFragment instanceof C32367ENr) && (c32367ENr = (C32367ENr) targetFragment) != null && (abstractC10360h2 = c32367ENr.mFragmentManager) != null) {
                abstractC10360h2.A12();
                if (i != 0) {
                    if (i == 1) {
                        if (AbstractC1565371b.A00(c32367ENr.getSession())) {
                            AbstractC35176FfT.A02(c32367ENr.requireContext(), c32367ENr.getSession(), "unrestrict_account");
                            return;
                        }
                        C18920wW c18920wW = c32367ENr.A00;
                        if (c18920wW != null) {
                            C75R.A09(c18920wW, user, "click", "remove_restricted_account");
                            C28151Xt c28151Xt = c32367ENr.A02;
                            if (c28151Xt == null) {
                                return;
                            }
                            c28151Xt.A02(c32367ENr.requireContext(), AbstractC018607g.A00(c32367ENr), c32367ENr.getSession(), new GJ6(c32367ENr.requireActivity(), false), user.getId(), "restrict_home");
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    C18920wW c18920wW2 = c32367ENr.A00;
                    if (c18920wW2 != null) {
                        C75R.A09(c18920wW2, user, "click", "add_account");
                        C28151Xt c28151Xt2 = c32367ENr.A02;
                        if (c28151Xt2 == null) {
                            return;
                        }
                        c28151Xt2.A03(c32367ENr.requireContext(), AbstractC018607g.A00(c32367ENr), c32367ENr.getSession(), new GJ6(c32367ENr.requireActivity(), true), user.getId(), "restrict_home", null, null);
                        return;
                    }
                }
                AbstractC31171DnF.A0s();
                throw C00O.createAndThrow();
            }
            return;
        }
        C0w9.A03(__redex_internal_original_name, "Target fragment does not implement search delegate.");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        boolean A00 = AbstractC1565371b.A00(getSession());
        Context rootActivity = getRootActivity();
        if (rootActivity == null) {
            rootActivity = view.getContext();
        }
        C14360o3.A0A(rootActivity);
        C32412EPn c32412EPn = new C32412EPn(rootActivity, getSession(), this, A00);
        C169127gl A002 = AbstractC169097gi.A00(null, getSession(), new C61972ry(requireContext(), AbstractC018607g.A00(this), null), new C36695GFq(this, 9), AbstractC111324zv.A00(3976), null, false);
        this.A00 = A002;
        A002.EYJ(c32412EPn);
        FragmentActivity requireActivity = requireActivity();
        ViewGroup A0F = AbstractC31173DnH.A0F(view, R.id.restrict_search_container);
        UserSession session = getSession();
        Context rootActivity2 = getRootActivity();
        if (rootActivity2 == null) {
            rootActivity2 = view.getContext();
        }
        C14360o3.A0A(rootActivity2);
        SearchController searchController = new SearchController(requireActivity, A0F, c32412EPn, session, null, this, -1, C3HB.A00(rootActivity2), false);
        this.A01 = searchController;
        registerLifecycleListener(searchController);
    }

    @Override // X.InterfaceC71990XEd
    public final void DEw() {
        if (C06P.A01(this.mFragmentManager)) {
            AbstractC31177DnL.A12(this);
        }
    }

    @Override // X.GZX
    public final void DyA(String str) {
        C53Z c53z;
        AbstractC10360h2 abstractC10360h2;
        if (getTargetFragment() instanceof C32367ENr) {
            Fragment targetFragment = getTargetFragment();
            if ((targetFragment instanceof C32367ENr) && (c53z = (C53Z) targetFragment) != null && (abstractC10360h2 = c53z.mFragmentManager) != null) {
                abstractC10360h2.A12();
                C31368DqX.A02(AbstractC31178DnM.A0F(c53z), c53z.getSession(), AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(c53z.getSession(), str, "restrict_search_user_row", "restrict_home"));
                return;
            }
            return;
        }
        C0w9.A03(__redex_internal_original_name, "Target fragment does not implement search delegate.");
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnResume() {
        super.afterOnResume();
        if (this.A02) {
            SearchController searchController = this.A01;
            if (searchController != null) {
                searchController.A02(true, 0.0f);
            }
            this.A02 = false;
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "restrict_search";
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-199464524);
        C14360o3.A0B(layoutInflater, 0);
        this.A02 = true;
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_restrict_search, false);
        C0f9.A09(2027121207, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(983066777);
        super.onDestroyView();
        this.A01 = null;
        C0f9.A09(583616148, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(2092069830);
        super.onPause();
        SearchController searchController = this.A01;
        if (searchController != null) {
            searchController.A00();
        }
        C0f9.A09(1178945226, A02);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1H(interfaceC56362iU);
    }
}
