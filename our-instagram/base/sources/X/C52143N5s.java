package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.N5s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52143N5s extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "FundedContentSelectorFragment";
    public TextView A00;
    public TextView A01;
    public AbstractC51004MgB A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = AbstractC166987dD.A0e(view, R.id.title);
        this.A00 = AbstractC166987dD.A0e(view, R.id.subtitle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        FragmentActivity requireActivity = requireActivity();
        AbstractC51004MgB abstractC51004MgB = this.A02;
        if (abstractC51004MgB != null) {
            C51152Miv c51152Miv = new C51152Miv(requireActivity, AbstractC166987dD.A0r(this.A03), MSW.A1E(abstractC51004MgB, 23), MSW.A1E(abstractC51004MgB, 24));
            recyclerView.setAdapter(c51152Miv);
            AbstractC51004MgB abstractC51004MgB2 = this.A02;
            if (abstractC51004MgB2 != null) {
                if (abstractC51004MgB2 instanceof NJJ) {
                    NJJ njj = (NJJ) abstractC51004MgB2;
                    C56135Ovv c56135Ovv = njj.A02;
                    Integer num = C05F.A01;
                    String str2 = njj.A06;
                    C0UO c0uo = njj.A07;
                    Object value = c0uo.getValue();
                    ((Number) value).longValue();
                    if (!AbstractC167007dF.A1N((AbstractC50523MSb.A06(c0uo) > 0L ? 1 : (AbstractC50523MSb.A06(c0uo) == 0L ? 0 : -1))) && value != null) {
                        str = value.toString();
                    } else {
                        str = null;
                    }
                    c56135Ovv.A00(num, null, str2, str);
                }
                View findViewById = view.findViewById(R.id.loading_indicator);
                View findViewById2 = view.findViewById(R.id.loading_shimmer);
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = getViewLifecycleOwner();
                AbstractC166987dD.A1Z(new JWL(viewLifecycleOwner, recyclerView, this, c51152Miv, view, c07s, findViewById2, findViewById, null, 7), C07Y.A00(viewLifecycleOwner));
                return;
            }
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        long j;
        String str;
        AbstractC51004MgB abstractC51004MgB = this.A02;
        boolean A1W = AbstractC167007dF.A1W(abstractC51004MgB);
        String str2 = null;
        if (A1W) {
            if (abstractC51004MgB != null) {
                j = AbstractC50523MSb.A06(abstractC51004MgB.A07);
                AbstractC51004MgB abstractC51004MgB2 = this.A02;
                if (abstractC51004MgB2 != null) {
                    C5QE c5qe = (C5QE) abstractC51004MgB2.A08.getValue();
                    if (j != 0 && c5qe != null) {
                        str2 = JQ0.A0i(this, c5qe);
                    }
                }
            }
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        j = 0;
        if (j != 0) {
            str = String.valueOf(j);
        } else {
            str = "not_funded";
        }
        Intent putExtra = AbstractC31171DnF.A04().putExtra("ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_ID", str).putExtra("ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_NAME", str2);
        C14360o3.A07(putExtra);
        AbstractC31176DnK.A18(putExtra, this);
        if (A1W) {
            AbstractC51004MgB abstractC51004MgB3 = this.A02;
            if (abstractC51004MgB3 != null) {
                if (abstractC51004MgB3 instanceof NJJ) {
                    NJJ njj = (NJJ) abstractC51004MgB3;
                    njj.A02.A00(C05F.A0C, str2, njj.A06, str);
                }
            }
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        Context A05 = AbstractC31176DnK.A05(this, interfaceC56362iU);
        AbstractC51004MgB abstractC51004MgB = this.A02;
        if (abstractC51004MgB == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        if (abstractC51004MgB instanceof NJI) {
            i = 2131955378;
        } else {
            i = 2131953962;
        }
        AbstractC31175DnJ.A1I(interfaceC56362iU, A05.getString(i));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        long j;
        N2D n2d;
        int A02 = C0f9.A02(2108953798);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_ID");
        if (string != null && string.length() != 0 && !"not_funded".equals(string)) {
            j = Long.parseLong(string);
        } else {
            j = 0;
        }
        boolean z = requireArguments.getBoolean("ClipsConstants.ARG_CLIPS_SHOULD_SHOW_BONUSES_DEAL");
        int i = requireArguments.getInt("ClipsConstants.ARG_CLIPS_CONTENT_SCHEDULED_PUBLISH_TIME");
        if (z) {
            InterfaceC09390do interfaceC09390do = this.A03;
            n2d = new N2D(AbstractC166987dD.A0r(interfaceC09390do));
            AbstractC31178DnM.A0m(requireContext(), n2d, this, interfaceC09390do);
        } else {
            n2d = null;
        }
        this.A02 = (AbstractC51004MgB) MSW.A0F(new C52311NDa(AbstractC166987dD.A0r(this.A03), n2d, Integer.valueOf(i), requireArguments.getString("ClipsConstants.ARG_CLIPS_MEDIA_ID"), j, z), requireActivity()).A00(AbstractC51004MgB.class);
        C0f9.A09(-830217133, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1514488048);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_share_content_funding, false);
        C0f9.A09(-988307083, A02);
        return A0R;
    }
}
