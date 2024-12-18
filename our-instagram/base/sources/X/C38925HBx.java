package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.HBx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38925HBx extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "CreatorInspirationHubAccountsFragment";
    public RecyclerView A00;
    public C38976HEe A01;
    public SpinnerImageView A02;
    public C31543DtT A03;
    public String A04;
    public boolean A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0B;
    public final C36772GIv A0C;
    public final C41186IKz A0D;
    public final InterfaceC09390do A07 = C1XM.A00(new C29887DGb(this, 41));
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(860);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = AbstractC31180DnO.A0V(view);
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.list);
        this.A00 = A0G;
        if (A0G != null) {
            AbstractC31177DnL.A0s(getContext(), A0G);
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            C38976HEe c38976HEe = this.A01;
            if (c38976HEe == null) {
                str = "adapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            recyclerView.setAdapter(c38976HEe);
        }
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            C31543DtT c31543DtT = this.A03;
            if (c31543DtT == null) {
                str = "paginationHelper";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            recyclerView2.A14(c31543DtT);
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCM(view, viewLifecycleOwner, c07s, this, null, 12), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    public C38925HBx() {
        C29887DGb c29887DGb = new C29887DGb(this, 48);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C29887DGb(new C29887DGb(this, 45), 46));
        this.A0B = AbstractC25225BEi.A0a(new C29887DGb(A00, 47), c29887DGb, new C50169MDw(13, A00, null), AbstractC25225BEi.A1D(C25846Bc1.class));
        this.A06 = C1XM.A00(new C29887DGb(this, 40));
        this.A08 = C1XM.A00(J7X.A00);
        this.A09 = C1XM.A00(new C29887DGb(this, 44));
        this.A0D = new C41186IKz(this);
        this.A0C = new C36772GIv(this, 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1322739066);
        super.onCreate(bundle);
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C36772GIv c36772GIv = this.A0C;
        InterfaceC09390do interfaceC09390do = this.A0A;
        this.A03 = new C31543DtT(this, AbstractC166987dD.A0r(interfaceC09390do), c36772GIv);
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A07.getValue();
        C31543DtT c31543DtT = this.A03;
        if (c31543DtT != null) {
            this.A01 = new C38976HEe(requireContext, interfaceC11380iw, A0r, this.A0D, c31543DtT);
            C31543DtT c31543DtT2 = this.A03;
            if (c31543DtT2 != null) {
                c31543DtT2.A02 = true;
                if (!AbstractC167007dF.A1Z(this.A06)) {
                    ((C25846Bc1) this.A0B.getValue()).A00(null);
                }
                C0f9.A09(-466218629, A02);
                return;
            }
        }
        C14360o3.A0F("paginationHelper");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1696716217);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.creator_inspiration_hub_accounts_fragment, false);
        C0f9.A09(-1318005622, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1391542017);
        super.onDestroyView();
        this.A02 = null;
        this.A00 = null;
        C0f9.A09(-361812830, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1247147135);
        super.onResume();
        if (AbstractC167007dF.A1Z(this.A06) && !this.A05) {
            this.A05 = true;
            ((C25846Bc1) this.A0B.getValue()).A00(null);
        }
        C0f9.A09(-355083281, A02);
    }
}
