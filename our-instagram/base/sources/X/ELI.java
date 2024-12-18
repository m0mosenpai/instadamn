package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes6.dex */
public final class ELI extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, GXA {
    public static final String __redex_internal_original_name = "AccountLinkingMainGroupManagementFragment";
    public C32402EPd A00;
    public C2049995m A01;
    public InterfaceC41501vz A02;
    public UserSession A03;
    public List A04;
    public boolean A05;
    public FQ8 A06;
    public InterfaceC56362iU A07;
    public String A08;
    public java.util.Set A09 = AbstractC166987dD.A1H();
    public boolean A0A;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "account_linking_main_group_management";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0Jk, java.lang.Object] */
    public static void A00(FID fid, ELI eli) {
        ArrayList A1F = AbstractC166987dD.A1F(eli.A00.A04);
        A04(eli, true);
        C34573FLi c34573FLi = new C34573FLi(eli.requireContext(), AbstractC018607g.A00(eli), new C31456Ds0(1, eli, fid), A1F);
        String str = eli.A03.userId;
        if (!C023409i.A0A.A0A(new Object(), null, c34573FLi, str)) {
            AbstractC34728FRr.A00(eli.requireContext(), null);
            A04(eli, false);
        }
        C19280xC A00 = C19280xC.A00(eli, "ig_manage_main_account_attempt");
        A03(eli, A00);
        A02(eli, A00);
        AbstractC33643Ett.A00(A00, eli.A03);
    }

    public static void A02(ELI eli, C19280xC c19280xC) {
        List list = eli.A04;
        list.getClass();
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC167017dG.A1V(A0q, it);
        }
        HashSet A0k = AbstractC31171DnF.A0k(A0q);
        java.util.Set set = eli.A09;
        C18C.A07(set, "set2");
        RSJ rsj = new RSJ(A0k, set);
        java.util.Set set2 = eli.A00.A04;
        java.util.Set set3 = eli.A09;
        C18C.A07(set2, "set1");
        C18C.A07(set3, "set2");
        RSJ rsj2 = new RSJ(set2, set3);
        c19280xC.A0D("array_currently_connected_account_ids", new LinkedList(eli.A09));
        c19280xC.A0D("array_currently_unconnected_account_ids", new LinkedList(rsj));
        c19280xC.A0D("array_new_connected_account_ids", new LinkedList(rsj2));
    }

    public static void A03(ELI eli, C19280xC c19280xC) {
        c19280xC.A09("is_removing", AbstractC31172DnG.A0s(eli.A00.A04.containsAll(eli.A09)));
    }

    public static void A04(ELI eli, boolean z) {
        eli.A05 = z;
        AbstractC31175DnJ.A0j(eli.getActivity(), z);
        InterfaceC56362iU interfaceC56362iU = eli.A07;
        if (interfaceC56362iU != null) {
            interfaceC56362iU.ETp(!z);
        }
    }

    public static void A05(ELI eli, boolean z) {
        AccountFamily A0H = AbstractC31176DnK.A0H(eli.A01, eli.A03);
        A0H.getClass();
        Iterator it = A0H.A03.iterator();
        while (it.hasNext()) {
            eli.A00.A0C(AbstractC25226BEj.A15(it).getId(), true);
        }
        if (z) {
            eli.A09 = AbstractC31171DnF.A0k(eli.A00.A04);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!this.A05) {
            boolean z = this.A0A;
            AbstractC10360h2 parentFragmentManager = getParentFragmentManager();
            if (z) {
                parentFragmentManager.A0b();
                return true;
            }
            parentFragmentManager.A0x(AbstractC111324zv.A00(1858), 0);
            return true;
        }
        return true;
    }

    public static void A01(ELI eli) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        AccountFamily A0H = AbstractC31176DnK.A0H(eli.A01, eli.A03);
        if (A0H != null) {
            Iterator it = A0H.A03.iterator();
            while (it.hasNext()) {
                User A15 = AbstractC25226BEj.A15(it);
                A1I.put(A15.getId(), A15);
            }
            eli.A04 = new LinkedList(A1I.values());
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.setTitle(requireActivity().getString(2131952070));
        interfaceC56362iU.Eha(null, R.drawable.zero_size_shape).setEnabled(false);
        AbstractC31176DnK.A1C(new Fp1(this, 4), AbstractC31174DnI.A0K(), interfaceC56362iU);
        interfaceC56362iU.ETp(!this.A05);
        interfaceC56362iU.setIsLoading(this.A05);
        this.A07 = interfaceC56362iU;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1748545269);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A03 = A0S;
        this.A01 = C2049995m.A01(A0S);
        this.A06 = new FQ8(this.A03);
        this.A0A = AbstractC31172DnG.A1X(requireArguments, "should_pop_back_stack_without_name");
        this.A00 = new C32402EPd(requireActivity(), this, this, this);
        A01(this);
        this.A00.A0D(this.A04);
        A05(this, true);
        this.A02 = C31650DvG.A00(this, 1);
        C0f9.A09(582711279, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-740378673);
        View inflate = layoutInflater.inflate(R.layout.account_linking_main_group_management_fragment, viewGroup, false);
        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.main_account_explanation_textview);
        Resources resources = requireActivity().getResources();
        UserSession userSession = this.A03;
        C08730cb c08730cb = C17060sy.A01;
        A0T.setText(AbstractC07900bA.A01(resources, new String[]{AbstractC31173DnH.A0n(userSession, c08730cb), AbstractC31173DnH.A0n(this.A03, c08730cb)}, 2131952083));
        View requireViewById = inflate.requireViewById(R.id.main_account_row);
        Context requireContext = requireContext();
        User A01 = c08730cb.A01(this.A03);
        AbstractC34728FRr.A01(requireContext, this, AbstractC31173DnH.A0T(requireViewById, R.id.avatar_imageview), A01);
        requireViewById.setBackgroundResource(AbstractC53242c7.A0H(requireContext, R.attr.accountLinkingMainAccountBackground));
        AbstractC31173DnH.A1F(AbstractC166997dE.A0T(requireViewById, R.id.username_textview), A01);
        C57012jc A0V = AbstractC31177DnL.A0V(requireViewById, R.id.checkbox_viewstub);
        A0V.A01().setBackgroundDrawable(C3LQ.A07(requireContext, R.color.blue_5_30_transparent));
        ((CompoundButton) A0V.A01()).setChecked(true);
        A0V.A01().setClickable(false);
        ((AbsListView) inflate.requireViewById(R.id.list_view)).setAdapter((ListAdapter) this.A00);
        C0f9.A09(-86861325, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1801854969);
        super.onResume();
        if (!TextUtils.isEmpty(this.A08)) {
            String str = this.A08;
            this.A08 = null;
            C32402EPd c32402EPd = this.A00;
            C14360o3.A0B(str, 0);
            FID fid = (FID) c32402EPd.A03.get(str);
            fid.getClass();
            C9GR.A03(getContext(), getString(2131952065, fid.A01.getUsername(), AbstractC31176DnK.A0q(this.A03)), null, 1);
            this.A00.A0C(str, false);
            C41451vu.A01.A02(this.A02, C128675ra.class);
            A00(fid, this);
        }
        C0f9.A09(-55098823, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1273376474);
        super.onStart();
        this.A06.A00(requireActivity(), true);
        C0f9.A09(772709542, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-557261066);
        super.onStop();
        C41451vu.A01.A03(this.A02, C128675ra.class);
        this.A07 = null;
        C0f9.A09(-133428674, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.A00.isEmpty()) {
            AbstractC34728FRr.A00(requireContext(), DialogInterfaceOnClickListenerC35452Fk9.A00(this, 4));
        }
        C19280xC A00 = C19280xC.A00(this, "ig_manage_main_account_impression");
        A02(this, A00);
        AbstractC33643Ett.A00(A00, this.A03);
    }

    @Override // X.GXA
    public final void DXn(String str, String str2) {
        this.A08 = str;
    }
}
