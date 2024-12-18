package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class N6t extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, InterfaceC60112ot {
    public static final String __redex_internal_original_name = "LeadAdsCreativesFragment";
    public RecyclerView A00;
    public C57112jm A01;
    public boolean A02;
    public C56352iT A03;
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(C57554PgS.A01(this, 44));
    public final InterfaceC09390do A05;
    public final C51198Mji A06;

    public N6t() {
        C57554PgS A01 = C57554PgS.A01(this, 0);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50164MDr(new C50164MDr(this, 47), 48));
        this.A05 = AbstractC25225BEi.A0a(new C50164MDr(A00, 49), A01, C57534Pg8.A00(A00, null, 4), AbstractC25225BEi.A1D(C51000Mg7.class));
        this.A06 = new C51198Mji(this, 6);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lead_ad_question_page";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A05;
        C51000Mg7 c51000Mg7 = (C51000Mg7) interfaceC09390do.getValue();
        OAS oas = c51000Mg7.A03;
        InterfaceC58268PsC interfaceC58268PsC = oas.A00;
        if (interfaceC58268PsC != null) {
            String str = oas.A01;
            Bundle A0b = AbstractC166987dD.A0b();
            String str2 = oas.A02;
            if (str2 != null) {
                A0b.putString("form_id", str2);
            }
            InterfaceC58268PsC.A01(A0b, interfaceC58268PsC, str, "lead_gen_creatives_context_card", "creatives_context_card_impression");
        }
        Iterator it = AbstractC31172DnG.A0w(c51000Mg7.A05).iterator();
        while (it.hasNext()) {
            EnumC53172NfT CBf = ((InterfaceC57956Pn2) it.next()).CBf();
            if (CBf != EnumC53172NfT.A02) {
                String name = CBf.name();
                C14360o3.A0B(name, 0);
                if (interfaceC58268PsC != null) {
                    String str3 = oas.A01;
                    Bundle A0b2 = AbstractC166987dD.A0b();
                    String str4 = oas.A02;
                    if (str4 != null) {
                        A0b2.putString("form_id", str4);
                    }
                    A0b2.putString("question_type", name);
                    InterfaceC58268PsC.A01(A0b2, interfaceC58268PsC, str3, "lead_gen_creatives_context_card", "creatives_context_card_section_impression");
                }
            }
        }
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.creatives_recycler_view);
        this.A00 = A0G;
        if (A0G != null) {
            AbstractC31178DnM.A0z(this, A0G);
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(new C51115MiK(this, new OH6(this)));
        }
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), ((C51000Mg7) interfaceC09390do.getValue()).A01, new C57743PjW(this, 11), 40);
        ViewOnClickListenerC55461OkG.A00(view.requireViewById(R.id.bottom_button_layout), 11, this);
        C57112jm A0N = AbstractC31180DnO.A0N();
        this.A01 = A0N;
        AbstractC37301Gc2.A0v(view, A0N, this);
        if (((C51000Mg7) interfaceC09390do.getValue()).A00) {
            this.A03 = C56352iT.A0t.A03(requireActivity());
            RecyclerView recyclerView3 = this.A00;
            if (recyclerView3 != null) {
                recyclerView3.A14(this.A06);
            }
        }
        UserSession userSession = ((C51000Mg7) interfaceC09390do.getValue()).A02;
        C57112jm c57112jm = this.A01;
        if (c57112jm == null) {
            C14360o3.A0F("viewpointManager");
            throw C00O.createAndThrow();
        }
        new ILM(userSession, c57112jm, this).A00(view, OUA.A05.A00(this.mArguments, EnumC53273NhB.A06, ((C51000Mg7) interfaceC09390do.getValue()).A02.token, AbstractC50523MSb.A01(this)));
        AbstractC77703du.A05(AbstractC166997dE.A0S(view, R.id.bottom_button_layout), EnumC77673dr.A09);
        C55137Oc5.A00(this);
    }

    public static final void A00(N6t n6t, int i) {
        boolean z;
        if (((C51000Mg7) n6t.A05.getValue()).A00) {
            n6t.A03 = C56352iT.A0t.A03(n6t.requireActivity());
            RecyclerView recyclerView = n6t.A00;
            if (recyclerView != null) {
                recyclerView.A14(n6t.A06);
            }
            C56352iT c56352iT = n6t.A03;
            if (c56352iT != null) {
                if (i == 0) {
                    c56352iT.A0U(R.attr.igds_color_primary_text_on_media);
                    c56352iT.EPD(n6t.requireContext().getDrawable(R.color.fds_transparent));
                    z = true;
                } else {
                    c56352iT.A0U(R.attr.igds_color_primary_icon);
                    c56352iT.EPD(n6t.requireContext().getDrawable(AbstractC53242c7.A0H(n6t.requireContext(), R.attr.actionBarBackgroundColor)));
                    z = false;
                }
                n6t.A02 = z;
            }
        }
    }

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return ((C51000Mg7) this.A05.getValue()).A00;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return ((C51000Mg7) this.A05.getValue()).A02;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC09390do interfaceC09390do = this.A05;
        if (((C51000Mg7) interfaceC09390do.getValue()).A09) {
            return false;
        }
        C55137Oc5.A00.A03(this, ((C51000Mg7) interfaceC09390do.getValue()).A02, ((C51000Mg7) interfaceC09390do.getValue()).A08, false);
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31180DnO.A1Q(interfaceC56362iU);
        AbstractC31179DnN.A1G(interfaceC56362iU);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            A00(this, recyclerView.computeVerticalScrollOffset());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-403363995);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_creatives, viewGroup, false);
        C0f9.A09(1819189002, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-523379370);
        super.onDestroyView();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        this.A00 = null;
        C0f9.A09(-23063712, A02);
    }
}
