package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.facebook.R;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class ENR extends C38K implements GZX, InterfaceC37143GYe {
    public static final String __redex_internal_original_name = "RestrictListFragment";
    public C18920wW A00;
    public EmptyStateView A01;
    public EnumC33324EoJ A02;
    public C166217bp A03;
    public C32412EPn A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final InterfaceC41501vz A06 = new C36155FxU(this, 29);

    @Override // X.GZX
    public final void Dxd(User user, int i) {
        if (i != 0) {
            if (i == 1) {
                InterfaceC09390do interfaceC09390do = this.A05;
                if (AbstractC1565371b.A00(AbstractC166987dD.A0r(interfaceC09390do))) {
                    AbstractC35176FfT.A02(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), "unrestrict_account");
                    return;
                }
                C18920wW c18920wW = this.A00;
                if (c18920wW != null) {
                    C75R.A09(c18920wW, user, "click", "remove_restricted_account");
                    C28151Xt c28151Xt = C28151Xt.A02;
                    if (c28151Xt == null) {
                        return;
                    }
                    c28151Xt.A02(requireContext(), AbstractC018607g.A00(this), AbstractC166987dD.A0r(interfaceC09390do), new GJ6(requireActivity(), false), user.getId(), "restrict_list");
                    return;
                }
            } else {
                return;
            }
        } else {
            C18920wW c18920wW2 = this.A00;
            if (c18920wW2 != null) {
                C75R.A09(c18920wW2, user, "click", "add_account");
                C28151Xt c28151Xt2 = C28151Xt.A02;
                if (c28151Xt2 == null) {
                    return;
                }
                c28151Xt2.A03(requireContext(), AbstractC018607g.A00(this), AbstractC166987dD.A0r(this.A05), new GJ6(requireActivity(), true), user.getId(), "restrict_list", null, null);
                return;
            }
        }
        AbstractC31171DnF.A0s();
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "restrict_list";
    }

    public static final void A01(ENR enr) {
        C1ON c1on;
        if (C28151Xt.A02 != null) {
            c1on = AbstractC166547cQ.A00(AbstractC31180DnO.A0M(enr.A05));
            C31714DwJ.A00(c1on, enr, 22);
        } else {
            c1on = null;
        }
        enr.schedule(c1on);
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return AbstractC166987dD.A0o(this.A05);
    }

    @Override // X.GZX
    public final void DyA(String str) {
        InterfaceC09390do interfaceC09390do = this.A05;
        C31368DqX A01 = AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), str, "restrict_list_user_row", "restrict_list");
        C31368DqX.A02(AbstractC25233BEq.A0j(this, interfaceC09390do), AbstractC166987dD.A0r(interfaceC09390do), AbstractC31364DqT.A02(), A01);
    }

    @Override // X.InterfaceC37143GYe
    public final void DyN(List list) {
        int ordinal;
        EnumC153216up enumC153216up;
        EnumC33324EoJ enumC33324EoJ = this.A02;
        if (enumC33324EoJ != null && (ordinal = enumC33324EoJ.ordinal()) != -1) {
            if (ordinal != 0) {
                if (ordinal != 1) {
                    throw B4Z.A00();
                }
                return;
            }
            C32412EPn c32412EPn = this.A04;
            if (c32412EPn != null) {
                c32412EPn.A06();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c32412EPn.A09(c32412EPn.A00, it.next(), true);
                }
                c32412EPn.A07();
            }
            if (list.isEmpty()) {
                enumC153216up = EnumC153216up.A02;
            } else {
                enumC153216up = EnumC153216up.A05;
            }
            EmptyStateView emptyStateView = this.A01;
            if (emptyStateView != null) {
                emptyStateView.A0P(enumC153216up);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC33324EoJ enumC33324EoJ;
        int A02 = C0f9.A02(1391276577);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        InterfaceC09390do interfaceC09390do = this.A05;
        this.A00 = AbstractC31176DnK.A0M(this, interfaceC09390do);
        this.A04 = new C32412EPn(getRootActivity(), AbstractC166987dD.A0r(interfaceC09390do), this, AbstractC1565371b.A00(AbstractC166987dD.A0r(interfaceC09390do)));
        Serializable serializable = requireArguments.getSerializable("list_tab");
        if (serializable instanceof EnumC33324EoJ) {
            enumC33324EoJ = (EnumC33324EoJ) serializable;
        } else {
            enumC33324EoJ = null;
        }
        this.A02 = enumC33324EoJ;
        if (enumC33324EoJ != null && enumC33324EoJ.ordinal() == 0) {
            A01(this);
        }
        C0f9.A09(-248478393, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-254584183);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_restrict_list, viewGroup, false);
        ((AbsListView) AbstractC166997dE.A0R(inflate, android.R.id.list)).setAdapter((ListAdapter) this.A04);
        EmptyStateView emptyStateView = (EmptyStateView) inflate.requireViewById(android.R.id.empty);
        emptyStateView.A0V(EnumC153216up.A02, getString(2131968592));
        emptyStateView.A0P(EnumC153216up.A07);
        emptyStateView.A0N(ViewOnClickListenerC35682FpH.A00(this, 58), EnumC153216up.A04);
        this.A01 = emptyStateView;
        C0f9.A09(1021452588, A02);
        return inflate;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(993463998);
        super.onDestroyView();
        this.A01 = null;
        this.A04 = null;
        C0f9.A09(-933464259, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1880860755);
        super.onPause();
        C166217bp c166217bp = this.A03;
        if (c166217bp != null) {
            c166217bp.A02(this);
        }
        AbstractC31176DnK.A0Q(this.A05).A02(this.A06, C121285eR.class);
        C0f9.A09(1705696020, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-2004441339);
        super.onResume();
        C166217bp c166217bp = this.A03;
        if (c166217bp != null) {
            c166217bp.A03.add(AbstractC25225BEi.A16(this));
            DyN(AbstractC166987dD.A1F(c166217bp.A01));
        }
        AbstractC31176DnK.A0Q(this.A05).A01(this.A06, C121285eR.class);
        C0f9.A09(1735582649, A02);
    }
}
