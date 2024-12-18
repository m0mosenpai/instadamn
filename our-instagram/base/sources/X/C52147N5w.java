package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.N5w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52147N5w extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PublisherControlBlockedAccountsFragment";
    public RecyclerView A00;
    public IgdsInlineSearchBox A01;
    public C52198N8n A02;
    public C65960TxC A03;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final XB6 A06 = new MZQ(this, 1);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131963833);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "publisher_control_blocked_accounts";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        Object[] objArr;
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) AbstractC166997dE.A0S(view, R.id.description);
        C50962MfV c50962MfV = (C50962MfV) this.A05.getValue();
        if (c50962MfV.A08 == null && c50962MfV.A01 == IGRevShareProductType.A04) {
            i = 2131963847;
            if (AbstractC167007dF.A1Z(c50962MfV.A09)) {
                i = 2131963829;
            }
            objArr = AbstractC25228BEl.A1Y(AbstractC25225BEi.A07(C06090Tz.A05, c50962MfV.A02, 36597283187329817L));
        } else {
            if (c50962MfV.A01 == IGRevShareProductType.A04) {
                i = 2131963848;
                if (AbstractC167007dF.A1Z(c50962MfV.A09)) {
                    i = 2131963830;
                }
            } else {
                i = 2131963784;
            }
            objArr = new Object[0];
        }
        textView.setText(BHX.A02(this, BHS.A00(objArr, i)));
        View A0S = AbstractC166997dE.A0S(view, R.id.loading_indicator);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.requireViewById(R.id.search_box);
        this.A01 = igdsInlineSearchBox;
        if (igdsInlineSearchBox == null) {
            str = "inlineSearchBox";
        } else {
            igdsInlineSearchBox.A02 = new P39(this, 2);
            RecyclerView A0F = AbstractC31176DnK.A0F(view);
            this.A00 = A0F;
            str = "recyclerView";
            if (A0F != null) {
                A0F.setLayoutManager(new FastScrollingLinearLayoutManager(requireContext()));
                RecyclerView recyclerView = this.A00;
                if (recyclerView != null) {
                    C52198N8n c52198N8n = this.A02;
                    if (c52198N8n == null) {
                        str = "adapter";
                    } else {
                        recyclerView.setAdapter(c52198N8n);
                        C07S c07s = C07S.STARTED;
                        C07X viewLifecycleOwner = getViewLifecycleOwner();
                        AbstractC166987dD.A1Z(new JTH(textView, this, viewLifecycleOwner, A0S, c07s, (InterfaceC23621Ds) null, 46), C07Y.A00(viewLifecycleOwner));
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (AbstractC31176DnK.A1b(((C50962MfV) this.A05.getValue()).A0C)) {
            getParentFragmentManager().A0y("BLOCKLIST_FRAGMENT_REQUEST_KEY", AbstractC31178DnM.A06("ARGUMENT_BLOCKLIST_CHANGED_KEY", true));
        }
        AbstractC25226BEj.A1P(this);
        return true;
    }

    public C52147N5w() {
        C57509Pfj c57509Pfj = new C57509Pfj(this, 28);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57509Pfj(new C57509Pfj(this, 25), 26));
        this.A05 = AbstractC25225BEi.A0a(new C57509Pfj(A00, 27), c57509Pfj, new C57255Pbd(26, null, A00), AbstractC25225BEi.A1D(C50962MfV.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1282598557);
        super.onCreate(bundle);
        C56709PFb c56709PFb = new C56709PFb(this, 1);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A04;
        C54619OAu c54619OAu = new C54619OAu(requireContext, null, this, AbstractC166987dD.A0r(interfaceC09390do), new U3P(0), new NUa(this, 4), null, null, false, false, false);
        InterfaceC09390do interfaceC09390do2 = this.A05;
        InterfaceC169497hP interfaceC169497hP = ((C50962MfV) interfaceC09390do2.getValue()).A07;
        XB6 xb6 = this.A06;
        this.A03 = new C65960TxC(W14.A00, xb6, c56709PFb, ((C50962MfV) interfaceC09390do2.getValue()).A04, interfaceC169497hP, 0, false);
        Context requireContext2 = requireContext();
        C65960TxC c65960TxC = this.A03;
        if (c65960TxC == null) {
            C14360o3.A0F("dataSource");
            throw C00O.createAndThrow();
        }
        interfaceC09390do.getValue();
        this.A02 = new C52198N8n(requireContext2, c65960TxC, xb6, c56709PFb, c54619OAu, PI4.A00);
        C0f9.A09(-497393419, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1324429052);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.creator_blocked_accounts, false);
        C0f9.A09(1268094305, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(2089884193);
        super.onDestroyView();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(null);
            recyclerView.setAdapter(null);
        }
        C0f9.A09(-135794073, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        IBinder windowToken;
        int A02 = C0f9.A02(1385727410);
        super.onPause();
        View view = this.mView;
        if (view != null && (windowToken = view.getWindowToken()) != null) {
            Object systemService = requireContext().getSystemService("input_method");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 0);
        }
        C0f9.A09(909044905, A02);
    }
}
