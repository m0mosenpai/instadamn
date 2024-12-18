package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.N4m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52114N4m extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "BrandedContentSearchFragmentBase";
    public TextView A00;
    public RecyclerView A01;
    public IgdsInlineSearchBox A02;
    public C52198N8n A03;
    public C54701OEd A04;
    public C65960TxC A05;
    public SpinnerImageView A06;
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);
    public final XB6 A08 = new MZQ(this, 0);
    public final int A07 = R.layout.branded_content_search_screen_general;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.description);
        C14360o3.A0B(A0T, 0);
        this.A00 = A0T;
        SpinnerImageView A0V = AbstractC31180DnO.A0V(view);
        C14360o3.A0B(A0V, 0);
        this.A06 = A0V;
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        C14360o3.A0B(A0F, 0);
        this.A01 = A0F;
        A0F.setAdapter(A06());
        JQ1.A0i(this);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.requireViewById(R.id.search_box);
        C14360o3.A0B(igdsInlineSearchBox, 0);
        this.A02 = igdsInlineSearchBox;
        igdsInlineSearchBox.A02 = new P39(this, 0);
    }

    public final TextView A04() {
        TextView textView = this.A00;
        if (textView != null) {
            return textView;
        }
        C14360o3.A0F(DevServerEntity.COLUMN_DESCRIPTION);
        throw C00O.createAndThrow();
    }

    public final UserSession A05() {
        return AbstractC166987dD.A0r(this.A09);
    }

    public final C52198N8n A06() {
        C52198N8n c52198N8n = this.A03;
        if (c52198N8n != null) {
            return c52198N8n;
        }
        AbstractC31171DnF.A0t();
        throw C00O.createAndThrow();
    }

    public final C65960TxC A07() {
        C65960TxC c65960TxC = this.A05;
        if (c65960TxC != null) {
            return c65960TxC;
        }
        C14360o3.A0F("dataSource");
        throw C00O.createAndThrow();
    }

    public final SpinnerImageView A08() {
        SpinnerImageView spinnerImageView = this.A06;
        if (spinnerImageView != null) {
            return spinnerImageView;
        }
        C14360o3.A0F("spinner");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A09);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i;
        Context requireContext;
        UserSession A0r;
        C54619OAu c54619OAu;
        NUa nUa;
        InterfaceC71958XCk c56713PFf;
        int A02 = C0f9.A02(177371314);
        super.onCreate(bundle);
        C54381O1n c54381O1n = new C54381O1n(this);
        C54382O1o c54382O1o = new C54382O1o(this);
        C169487hO c169487hO = new C169487hO();
        C56709PFb c56709PFb = new C56709PFb(this, 0);
        InterfaceC09390do interfaceC09390do = this.A09;
        this.A04 = new C54701OEd(c54381O1n, c54382O1o, AbstractC166987dD.A0r(interfaceC09390do), this, c169487hO);
        XB6 xb6 = this.A08;
        boolean z = this instanceof N8H;
        if (z) {
            i = 3;
        } else if (this instanceof N8I) {
            i = 2;
        } else if (this instanceof N8F) {
            i = 1;
        } else {
            i = 0;
        }
        this.A05 = new C65960TxC(W14.A00, xb6, c56709PFb, new C56710PFc(this, i), c169487hO, 0, false);
        Context requireContext2 = requireContext();
        C65960TxC A07 = A07();
        A05();
        if (z) {
            requireContext = requireContext();
            A0r = AbstractC166987dD.A0r(interfaceC09390do);
            nUa = new NUa(this, 3);
            c56713PFf = new C49581Lva(this, 1);
        } else {
            if (this instanceof N8I) {
                Context requireContext3 = requireContext();
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                NUa nUa2 = new NUa(this, 2);
                c54619OAu = new C54619OAu(requireContext3, requireActivity(), this, A0r2, new C49581Lva(this, 0), nUa2, null, null, false, false, false);
            } else {
                boolean z2 = this instanceof N8F;
                requireContext = requireContext();
                A0r = AbstractC166987dD.A0r(interfaceC09390do);
                if (z2) {
                    nUa = new NUa(this, 1);
                    c56713PFf = new C56713PFf(this, 1);
                } else {
                    c54619OAu = new C54619OAu(requireContext, null, this, A0r, new C56713PFf(this, 0), new NUa(this, 0), null, null, false, false, false);
                }
            }
            this.A03 = new C52198N8n(requireContext2, A07, xb6, c56709PFb, c54619OAu, PI3.A00);
            C0f9.A09(-1579833457, A02);
        }
        c54619OAu = new C54619OAu(requireContext, null, this, A0r, c56713PFf, nUa, null, null, false, false, false);
        this.A03 = new C52198N8n(requireContext2, A07, xb6, c56709PFb, c54619OAu, PI3.A00);
        C0f9.A09(-1579833457, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int A02 = C0f9.A02(-2011174856);
        C14360o3.A0B(layoutInflater, 0);
        if (this instanceof N8F) {
            i = R.layout.branded_content_consildated_search_base;
        } else {
            i = this.A07;
        }
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, i, false);
        C0f9.A09(-1101631152, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(28730702);
        super.onDestroy();
        C54701OEd c54701OEd = this.A04;
        if (c54701OEd == null) {
            C14360o3.A0F("searchRequestController");
            throw C00O.createAndThrow();
        }
        c54701OEd.A02.onDestroy();
        C0f9.A09(-453522602, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1049095130);
        super.onDestroyView();
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(null);
            recyclerView.setAdapter(null);
        }
        C0f9.A09(-1761251386, A02);
    }
}
