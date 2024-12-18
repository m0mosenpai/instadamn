package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* loaded from: classes8.dex */
public final class KCN extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, XAF {
    public static final String __redex_internal_original_name = "PromoteLeadGenFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public XIGIGBoostCallToAction A05;
    public P4U A06;
    public C70399WUb A07;
    public FRW A08;
    public PromoteData A09;
    public LeadForm A0A;
    public Long A0B = AbstractC167007dF.A0d();
    public boolean A0C;
    public boolean A0D;
    public PromoteState A0E;
    public UserSession A0F;
    public IgRadioGroup A0G;
    public boolean A0H;
    public final InterfaceC09390do A0I;

    @Override // X.XAF
    public final void Dc7(PromoteState promoteState, Integer num) {
        C14360o3.A0B(num, 1);
        if (num == C05F.A07) {
            A01(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        if (r4.A05 == null) goto L8;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r5) {
        /*
            r4 = this;
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            r0 = 2131970757(0x7f134ac5, float:1.9578474E38)
            r5.Efu(r0)
            X.3LO r2 = X.AbstractC31174DnI.A0K()
            r1 = 40
            X.LPp r0 = new X.LPp
            r0.<init>(r4, r1)
            X.AbstractC31176DnK.A1C(r0, r2, r5)
            android.content.Context r0 = r4.requireContext()
            X.FRW r3 = new X.FRW
            r3.<init>(r0, r5)
            r4.A08 = r3
            java.lang.Integer r2 = X.C05F.A1F
            r1 = 41
            X.LPp r0 = new X.LPp
            r0.<init>(r4, r1)
            r3.A00(r0, r2)
            X.FRW r2 = r4.A08
            if (r2 == 0) goto L41
            com.instagram.leadgen.core.api.LeadForm r0 = r4.A0A
            if (r0 == 0) goto L3c
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r4.A05
            r0 = 1
            if (r1 != 0) goto L3d
        L3c:
            r0 = 0
        L3d:
            r2.A01(r0)
            return
        L41:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCN.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "manage_lead_ads";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = view.requireViewById(R.id.lead_form_list_loading_spinner);
        this.A00 = view.requireViewById(R.id.lead_gen_fragment_content);
        this.A0G = (IgRadioGroup) view.requireViewById(R.id.lead_form_radio_group);
        this.A03 = view.requireViewById(R.id.see_all_row);
        PromoteData promoteData = this.A09;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        this.A0A = promoteData.A16;
        this.A05 = promoteData.A0d;
        Bundle bundle2 = this.mArguments;
        boolean z2 = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean("is_from_one_tap_onboarding");
        } else {
            z = false;
        }
        this.A0D = z;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z2 = bundle3.getBoolean("is_profile_visit_secondary_cta");
        }
        this.A0H = z2;
        AbstractC43593JPy.A1E(getViewLifecycleOwner(), ((C44487Jlt) this.A0I.getValue()).A01, new C50369MLw(21, this, view), 13);
    }

    public static final void A00(KCN kcn) {
        XIGIGBoostCallToAction xIGIGBoostCallToAction;
        LeadForm leadForm = kcn.A0A;
        if (leadForm != null && (xIGIGBoostCallToAction = kcn.A05) != null) {
            PromoteData promoteData = kcn.A09;
            String str = "promoteData";
            if (promoteData != null) {
                promoteData.A16 = leadForm;
                promoteData.A0d = xIGIGBoostCallToAction;
                if (!kcn.A0H) {
                    PromoteState promoteState = kcn.A0E;
                    if (promoteState == null) {
                        str = "promoteState";
                    } else {
                        promoteState.A04(XIGIGBoostDestination.A07, promoteData);
                        return;
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r10.A05 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.KCN r10) {
        /*
            com.instagram.business.promote.model.PromoteData r0 = r10.A09
            java.lang.String r3 = "promoteData"
            if (r0 == 0) goto L46
            java.util.List r0 = r0.A1u
            if (r0 == 0) goto L40
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r0 == 0) goto L40
            com.instagram.business.promote.model.PromoteData r2 = r10.A09
            if (r2 == 0) goto L46
            com.instagram.leadgen.core.api.LeadForm r0 = r2.A16
            if (r0 != 0) goto L40
            java.util.List r0 = r2.A1u
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.instagram.leadgen.core.api.LeadForm r0 = (com.instagram.leadgen.core.api.LeadForm) r0
            r2.A16 = r0
            com.instagram.business.promote.model.PromoteData r0 = r10.A09
            if (r0 == 0) goto L46
            java.util.List r0 = r0.A1u
            java.lang.Object r0 = r0.get(r1)
            com.instagram.leadgen.core.api.LeadForm r0 = (com.instagram.leadgen.core.api.LeadForm) r0
            r10.A0A = r0
            X.FRW r2 = r10.A08
            if (r2 == 0) goto L40
            if (r0 == 0) goto L3c
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r10.A05
            r0 = 1
            if (r1 != 0) goto L3d
        L3c:
            r0 = 0
        L3d:
            r2.A01(r0)
        L40:
            com.instagram.ui.widget.radiogroup.IgRadioGroup r8 = r10.A0G
            if (r8 != 0) goto L4e
            java.lang.String r3 = "formRadioGroup"
        L46:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L4e:
            com.instagram.business.promote.model.PromoteData r6 = r10.A09
            if (r6 == 0) goto L46
            com.instagram.business.promote.model.PromoteState r7 = r10.A0E
            if (r7 != 0) goto L59
            java.lang.String r3 = "promoteState"
            goto L46
        L59:
            androidx.fragment.app.FragmentActivity r4 = r10.requireActivity()
            X.P4U r5 = r10.A06
            if (r5 != 0) goto L64
            java.lang.String r3 = "leadAdsLogger"
            goto L46
        L64:
            java.lang.Long r9 = r10.A0B
            X.L3w r3 = new X.L3w
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.instagram.common.session.UserSession r8 = r10.getSession()
            com.instagram.ui.widget.radiogroup.IgRadioGroup r2 = r3.A03
            r2.removeAllViews()
            com.instagram.business.promote.model.PromoteData r0 = r3.A02
            com.instagram.leadgen.core.api.LeadForm r9 = r0.A16
            if (r9 == 0) goto Lb2
            androidx.fragment.app.FragmentActivity r1 = r3.A00
            X.UCf r7 = new X.UCf
            r7.<init>(r1)
            java.lang.String r0 = r9.A02
            r7.setPrimaryText(r0)
            java.lang.String r0 = X.OSH.A00(r1, r9)
            r7.setSecondaryText(r0)
            java.lang.String r0 = r9.A03
            r7.setTag(r0)
            r0 = 2131970590(0x7f134a1e, float:1.9578135E38)
            java.lang.String r0 = X.AbstractC166997dE.A0p(r1, r0)
            r5 = 1
            X.LPM r4 = new X.LPM
            r6 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r7.setActionLabel(r0, r8, r4)
            r1 = 0
            X.Lws r0 = new X.Lws
            r0.<init>(r7, r1)
            r7.A9c(r0)
            r7.setChecked(r5)
            r2.addView(r7)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCN.A01(X.KCN):void");
    }

    @Override // X.AbstractC59962oe
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        UserSession userSession = this.A0F;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    public KCN() {
        X32 x32 = new X32(this, 4);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X32(new X32(this, 1), 2));
        this.A0I = AbstractC25225BEi.A0a(new X32(A00, 3), x32, new C57253Pbb(42, null, A00), AbstractC25225BEi.A1D(C44487Jlt.class));
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        A00(this);
        C70399WUb c70399WUb = this.A07;
        if (c70399WUb == null) {
            str = "promoteLogger";
        } else {
            c70399WUb.A0G(VG4.A10, "back_button");
            P4U p4u = this.A06;
            if (p4u == null) {
                str = "leadAdsLogger";
            } else {
                AbstractC43592JPx.A1Q(p4u, this.A0B, "lead_gen_manage_lead_forms", "cancel", "click");
                PromoteData promoteData = this.A09;
                if (promoteData != null) {
                    if (promoteData.A16 != null && getParentFragmentManager().A0Q("promote_lead_gen_one_tap_onboarding") != null) {
                        FragmentActivity requireActivity = requireActivity();
                        PromoteData promoteData2 = this.A09;
                        if (promoteData2 != null) {
                            AbstractC25225BEi.A0r(requireActivity, promoteData2.A0y).A0G("promote_lead_gen_one_tap_onboarding", 1);
                            return true;
                        }
                    } else {
                        AbstractC25226BEj.A1P(this);
                        return true;
                    }
                }
                C14360o3.A0F("promoteData");
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-322266433);
        super.onCreate(bundle);
        C1UC requireActivity = requireActivity();
        C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.business.promote.model.PromoteData.Delegate");
        this.A09 = ((InterfaceC72021XFj) requireActivity).BiY();
        C1UC requireActivity2 = requireActivity();
        C14360o3.A0C(requireActivity2, "null cannot be cast to non-null type com.instagram.business.promote.model.PromoteState.Delegate");
        this.A0E = ((XFZ) requireActivity2).Bia();
        PromoteData promoteData = this.A09;
        if (promoteData != null) {
            this.A0F = promoteData.A0y;
            this.A07 = C70399WUb.A00(getSession());
            PromoteData promoteData2 = this.A09;
            if (promoteData2 != null) {
                this.A06 = new P4U(promoteData2, this);
                this.A0B = AbstractC37302Gc3.A0V(AbstractC166997dE.A0Y(getSession()).A03.getFbidV2());
                C0f9.A09(-742891648, A02);
                return;
            }
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2084471165);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_leadgen_view, viewGroup, false);
        C0f9.A09(-768550363, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(-1398382421);
        super.onDestroyView();
        C70399WUb c70399WUb = this.A07;
        if (c70399WUb == null) {
            str = "promoteLogger";
        } else {
            PromoteData promoteData = this.A09;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                c70399WUb.A0C(VG4.A10, promoteData);
                C0f9.A09(-1236172875, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
