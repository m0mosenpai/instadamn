package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class KCI extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteLeadGenFormListFragment";
    public RecyclerView A00;
    public P4U A01;
    public C70399WUb A02;
    public PromoteData A03;
    public UserSession A04;
    public Boolean A05;
    public boolean A07;
    public boolean A09;
    public FRW A0A;
    public PromoteState A0B;
    public final InterfaceC09390do A0C;
    public boolean A08 = true;
    public Long A06 = AbstractC167007dF.A0d();

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970583);
        interfaceC56362iU.Ehd(new C3LY(AbstractC31174DnI.A0K()));
        FRW frw = new FRW(requireContext(), interfaceC56362iU);
        this.A0A = frw;
        frw.A00(new ViewOnClickListenerC48064LPp(this, 39), C05F.A1F);
        FRW frw2 = this.A0A;
        if (frw2 != null) {
            frw2.A01(true);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_lead_gen_form_list";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C3F0 c3f0;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FragmentActivity requireActivity = requireActivity();
        C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        ((BaseFragmentActivity) requireActivity).A0a();
        this.A08 = true;
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.A00 = A0F;
        C3F1 c3f1 = null;
        if (A0F != null) {
            c3f1 = A0F.A0C;
        }
        if ((c3f1 instanceof C3F0) && (c3f0 = (C3F0) c3f1) != null) {
            c3f0.A00 = false;
        }
        C70399WUb c70399WUb = this.A02;
        if (c70399WUb == null) {
            str = "promoteLogger";
        } else {
            c70399WUb.A0R(VG4.A0w.toString());
            P4U p4u = this.A01;
            if (p4u == null) {
                str = "leadAdsLogger";
            } else {
                AbstractC43592JPx.A1Q(p4u, this.A06, "lead_gen_form_list", MSV.A00(1191), "impression");
                AbstractC43593JPy.A1E(getViewLifecycleOwner(), ((C44487Jlt) this.A0C.getValue()).A01, new C50368MLv(this, 2), 12);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A04;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!this.A07) {
            P4U p4u = this.A01;
            if (p4u == null) {
                C14360o3.A0F("leadAdsLogger");
                throw C00O.createAndThrow();
            }
            AbstractC43592JPx.A1Q(p4u, this.A06, "lead_gen_form_list", "cancel", "click");
            return false;
        }
        return false;
    }

    public KCI() {
        X2v x2v = new X2v(this, 46);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2v(new X2v(this, 43), 44));
        this.A0C = AbstractC25225BEi.A0a(new X2v(A00, 45), x2v, new C57253Pbb(40, null, A00), AbstractC25225BEi.A1D(C44487Jlt.class));
    }

    public static final void A00(KCI kci, List list) {
        C2UU c2uu;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LeadForm leadForm = (LeadForm) it.next();
            PromoteData promoteData = kci.A03;
            String str = null;
            if (promoteData != null) {
                List list2 = promoteData.A1u;
                C14360o3.A06(list2);
                C14360o3.A0B(leadForm, 1);
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (C14360o3.A0K(((LeadForm) it2.next()).A03, leadForm.A03)) {
                            break;
                        }
                    } else {
                        String str2 = leadForm.A03;
                        PromoteData promoteData2 = kci.A03;
                        if (promoteData2 != null) {
                            LeadForm leadForm2 = promoteData2.A16;
                            if (leadForm2 != null) {
                                str = leadForm2.A03;
                            }
                            boolean A0K = C14360o3.A0K(str2, str);
                            PromoteData promoteData3 = kci.A03;
                            if (A0K) {
                                if (promoteData3 != null) {
                                    promoteData3.A1u.add(0, leadForm);
                                    RecyclerView recyclerView = kci.A00;
                                    if (recyclerView != null && (c2uu = recyclerView.A0A) != null) {
                                        ((C51140Mij) c2uu).A00 = 0;
                                    }
                                }
                            } else if (promoteData3 != null) {
                                promoteData3.A1u.add(leadForm);
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-686552328);
        super.onCreate(bundle);
        C1UC requireActivity = requireActivity();
        C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.business.promote.model.PromoteData.Delegate");
        this.A03 = ((InterfaceC72021XFj) requireActivity).BiY();
        C1UC requireActivity2 = requireActivity();
        C14360o3.A0C(requireActivity2, "null cannot be cast to non-null type com.instagram.business.promote.model.PromoteState.Delegate");
        this.A0B = ((XFZ) requireActivity2).Bia();
        PromoteData promoteData = this.A03;
        String str = "promoteData";
        if (promoteData != null) {
            UserSession userSession = promoteData.A0y;
            this.A04 = userSession;
            if (userSession != null) {
                this.A02 = C70399WUb.A00(userSession);
                PromoteData promoteData2 = this.A03;
                if (promoteData2 != null) {
                    this.A01 = new P4U(promoteData2, this);
                    UserSession userSession2 = this.A04;
                    if (userSession2 != null) {
                        this.A06 = AbstractC37302Gc3.A0V(AbstractC166997dE.A0Y(userSession2).A03.getFbidV2());
                        C0f9.A09(-1698889632, A02);
                        return;
                    }
                }
            }
            str = "session";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(489094401);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_leadgen_form_list, viewGroup, false);
        C0f9.A09(2098659530, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(1232160263);
        super.onDestroyView();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        this.A00 = null;
        C70399WUb c70399WUb = this.A02;
        if (c70399WUb == null) {
            str = "promoteLogger";
        } else {
            PromoteData promoteData = this.A03;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                c70399WUb.A0C(VG4.A0w, promoteData);
                C0f9.A09(-16786096, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
