package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import com.facebook.R;
import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormHeaderView;
import com.instagram.leadgen.core.ui.LeadGenFormHeaderViewWithoutWelcomeMessage;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class N6B extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenFormBaseFragment";
    public NestedScrollView A00;
    public IgLinearLayout A01;
    public IgLinearLayout A02;
    public IgTextView A03;
    public IgdsBottomButtonLayout A04;
    public LeadGenFormHeaderView A05;
    public LeadGenFormHeaderViewWithoutWelcomeMessage A06;
    public SpinnerImageView A07;
    public boolean A08;
    public IgdsStepperHeader A09;
    public AnonymousClass195 A0A;
    public AnonymousClass195 A0B;
    public boolean A0C;
    public final InterfaceC09390do A0G = AbstractC60492pY.A02(this);
    public final Map A0F = AbstractC166987dD.A1I();
    public final Rect A0D = AbstractC166987dD.A0U();
    public final ViewTreeObserver.OnPreDrawListener A0E = new ViewTreeObserverOnPreDrawListenerC55503Okw(this, 5);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle("");
        boolean A00 = AbstractC51031Mge.A00(this);
        int i = R.drawable.instagram_x_pano_outline_24;
        if (A00) {
            i = R.drawable.instagram_arrow_back_24;
        }
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A01(i);
        interfaceC56362iU.Ehd(new C3LY(A0B));
        C55089Oav A002 = C55089Oav.A00(this, interfaceC56362iU);
        if (AbstractC51031Mge.A00(this)) {
            String A0v = AbstractC25227BEk.A0v(this, 2131956237);
            ViewOnClickListenerC55461OkG viewOnClickListenerC55461OkG = new ViewOnClickListenerC55461OkG(this, 19);
            InterfaceC56362iU interfaceC56362iU2 = A002.A01;
            interfaceC56362iU2.Ect(A0v, viewOnClickListenerC55461OkG);
            interfaceC56362iU2.ARk(0, false);
            interfaceC56362iU2.ARk(0, true);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        UserSession userSession;
        LeadGenEntryPoint leadGenEntryPoint;
        String str3;
        String str4;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC51031Mge A04 = A04();
        if (A04 instanceof NP1) {
            NP1 np1 = (NP1) A04;
            boolean z = np1.A06;
            P4X p4x = np1.A02;
            Long l = np1.A03;
            String str5 = np1.A04;
            if (z) {
                C14360o3.A0B(str5, 1);
                str3 = "lead_gen_review_form";
                str4 = "review_lead_gen_form_impression";
            } else {
                C14360o3.A0B(str5, 1);
                str3 = "lead_gen_preview_form";
                str4 = "preview_lead_gen_form_impression";
            }
            P4X.A03(p4x, l, str3, str4, str5);
        } else if (!(A04 instanceof NP0)) {
            C52604NOz c52604NOz = (C52604NOz) A04;
            boolean z2 = c52604NOz.A05;
            P4U p4u = c52604NOz.A01;
            Long l2 = c52604NOz.A03;
            if (z2) {
                str = "lead_gen_review_form";
                str2 = "review_lead_gen_form_impression";
            } else {
                str = "lead_gen_preview_form";
                str2 = "preview_lead_gen_form_impression";
            }
            AbstractC43592JPx.A1Q(p4u, l2, str, str2, "impression");
        }
        this.A07 = AbstractC31180DnO.A0V(view);
        this.A00 = (NestedScrollView) view.requireViewById(R.id.form_scrolling_area);
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), A04().A08, new C57743PjW(this, 17), 42);
        C57743PjW.A00(getViewLifecycleOwner(), A04().A07, this, 18, 42);
        this.A04 = AbstractC31172DnG.A0j(view, R.id.bottom_button_layout);
        C57743PjW.A00(getViewLifecycleOwner(), A04().A05, this, 19, 42);
        C57743PjW.A00(getViewLifecycleOwner(), A04().A04, this, 20, 42);
        C57743PjW.A00(getViewLifecycleOwner(), A04().A03, this, 21, 42);
        LeadGenFormHeaderView leadGenFormHeaderView = (LeadGenFormHeaderView) view.findViewById(R.id.lead_form_header_view);
        this.A05 = leadGenFormHeaderView;
        int i = 0;
        if (leadGenFormHeaderView != null) {
            leadGenFormHeaderView.setVisibility(AbstractC167007dF.A05(!AbstractC51031Mge.A00(this) ? 1 : 0));
        }
        this.A06 = (LeadGenFormHeaderViewWithoutWelcomeMessage) view.findViewById(R.id.lead_form_header_view_without_welcome_message);
        this.A01 = (IgLinearLayout) view.findViewById(R.id.custom_questions_container);
        this.A02 = (IgLinearLayout) view.findViewById(R.id.customer_info_questions_container);
        IgTextView A0Y = AbstractC31172DnG.A0Y(view, R.id.inline_legal_text);
        this.A03 = A0Y;
        if (A0Y != null) {
            AbstractC25227BEk.A11(A0Y);
        }
        if (A04().A04()) {
            AbstractC51031Mge A042 = A04();
            boolean z3 = A042 instanceof NP1;
            if (z3) {
                userSession = ((NP1) A042).A01;
            } else if (A042 instanceof NP0) {
                userSession = ((NP0) A042).A03;
            } else {
                userSession = ((C52604NOz) A042).A02;
            }
            OMD omd = new OMD(userSession);
            String A01 = A042.A01();
            if (A01 == null) {
                A01 = "";
            }
            if (z3) {
                leadGenEntryPoint = ((NP1) A042).A00;
            } else if (A042 instanceof NP0) {
                leadGenEntryPoint = ((NP0) A042).A02;
            } else {
                leadGenEntryPoint = ((C52604NOz) A042).A00;
            }
            AbstractC25232BEp.A1J(A042, new PZM(A042, null, 9), omd.A02(A01, leadGenEntryPoint.A00));
        }
        C57743PjW.A00(getViewLifecycleOwner(), A04().A09, this, 22, 42);
        C57743PjW.A00(getViewLifecycleOwner(), A04().A06, this, 23, 42);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new PZP(viewLifecycleOwner, c07s, this, null, 18), C07Y.A00(viewLifecycleOwner));
        IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) view.requireViewById(R.id.stepper_header);
        this.A09 = igdsStepperHeader;
        if (igdsStepperHeader != null) {
            igdsStepperHeader.setVisibility(AbstractC167007dF.A05(AbstractC51031Mge.A00(this) ? 1 : 0));
        }
        if (AbstractC51031Mge.A00(this)) {
            IgdsStepperHeader igdsStepperHeader2 = this.A09;
            if (igdsStepperHeader2 != null) {
                igdsStepperHeader2.A03(1, 2, true, false);
            }
            IgdsStepperHeader igdsStepperHeader3 = this.A09;
            if (igdsStepperHeader3 != null) {
                igdsStepperHeader3.A01();
            }
        }
        View A0S = AbstractC166997dE.A0S(view, R.id.preview_warning_banner);
        if (!A04().A04()) {
            i = 8;
        }
        A0S.setVisibility(i);
    }

    public final AbstractC50967Mfa A03() {
        if (!(this instanceof C52571NNr) && (this instanceof C52572NNs)) {
            return (AbstractC50967Mfa) ((C52572NNs) this).A02.getValue();
        }
        return null;
    }

    public final AbstractC51031Mge A04() {
        InterfaceC09390do interfaceC09390do;
        if (this instanceof C52572NNs) {
            interfaceC09390do = ((C52572NNs) this).A04;
        } else if (this instanceof C52571NNr) {
            interfaceC09390do = ((C52571NNr) this).A00;
        } else {
            interfaceC09390do = ((C52570NNq) this).A00;
        }
        return (AbstractC51031Mge) interfaceC09390do.getValue();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0G);
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [X.NO5, X.NNy] */
    public static final void A00(IgLinearLayout igLinearLayout, N6B n6b, List list) {
        AbstractC50822Mcy abstractC50822Mcy;
        boolean z;
        AbstractC50822Mcy abstractC50822Mcy2;
        igLinearLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) it.next();
            int ordinal = leadGenFormBaseQuestion.A03.ordinal();
            if (ordinal != 33) {
                if (ordinal != 0) {
                    Context requireContext = n6b.requireContext();
                    if (ordinal != 10) {
                        abstractC50822Mcy2 = new NO5(requireContext, null, 0);
                    } else {
                        C57743PjW c57743PjW = new C57743PjW(n6b, 16);
                        ?? no5 = new NO5(requireContext, null, 0);
                        no5.A00 = c57743PjW;
                        abstractC50822Mcy2 = no5;
                    }
                } else {
                    abstractC50822Mcy2 = AbstractC50822Mcy.A00(n6b, leadGenFormBaseQuestion);
                }
                abstractC50822Mcy = abstractC50822Mcy2;
            } else {
                abstractC50822Mcy = null;
            }
            C55205OeH c55205OeH = C55205OeH.A00;
            String A07 = c55205OeH.A07(leadGenFormBaseQuestion);
            c55205OeH.A06(leadGenFormBaseQuestion);
            if (abstractC50822Mcy != null) {
                n6b.A0F.put(leadGenFormBaseQuestion, abstractC50822Mcy);
                abstractC50822Mcy.setEnabled(!n6b.A04().A04());
                AbstractC51031Mge A04 = n6b.A04();
                if (!(A04 instanceof NP1) && (A04 instanceof NP0)) {
                    z = true;
                } else {
                    z = false;
                }
                abstractC50822Mcy.A0G(leadGenFormBaseQuestion, z, false, false);
                if (AbstractC31174DnI.A1a(EnumC53203Nfz.A03, A07)) {
                    abstractC50822Mcy.A01 = new C56440P4b(n6b, 0);
                } else {
                    abstractC50822Mcy.A02 = new C56444P4f(n6b);
                }
                igLinearLayout.addView(abstractC50822Mcy);
            }
            if (!AbstractC166997dE.A1Z(n6b.A04().A06.A02(), true)) {
                AbstractC51031Mge A042 = n6b.A04();
                if (!(A042 instanceof NP1) && (A042 instanceof NP0)) {
                    NP0 np0 = (NP0) A042;
                    C14360o3.A0B(A07, 0);
                    P4W.A02(np0.A04, "question_impression", ((AbstractC51031Mge) np0).A00, A07, np0.A00);
                }
                if (leadGenFormBaseQuestion.A01) {
                    AbstractC51031Mge A043 = n6b.A04();
                    if (!(A043 instanceof NP1) && (A043 instanceof NP0)) {
                        NP0 np02 = (NP0) A043;
                        C14360o3.A0B(A07, 0);
                        P4W.A02(np02.A04, "answer_prefilled", ((AbstractC51031Mge) np02).A00, A07, np02.A00);
                    }
                    if (!n6b.A0C) {
                        n6b.A04();
                    }
                }
            }
        }
        n6b.A0C = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (X.AbstractC51031Mge.A00(r5) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.N6B r5, boolean r6) {
        /*
            boolean r0 = X.AbstractC51031Mge.A00(r5)
            if (r0 == 0) goto L66
            if (r6 == 0) goto L66
        L8:
            android.content.Context r1 = r5.requireContext()
            X.0do r0 = r5.A0G
            X.MYs r4 = X.AbstractC31177DnL.A0W(r1, r0)
            X.0ps r3 = X.AbstractC25225BEi.A1F()
            android.content.Context r1 = r5.requireContext()
            r0 = 2131964890(0x7f1333da, float:1.9566574E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A07(r0)
            r2 = 2131964892(0x7f1333dc, float:1.9566578E38)
            r1 = 7
            X.Ok5 r0 = new X.Ok5
            r0.<init>(r1, r5, r6)
            r4.A03(r0, r2)
            r1 = 2131964893(0x7f1333dd, float:1.956658E38)
            r0 = 47
            X.OkK r0 = X.ViewOnClickListenerC55465OkK.A00(r3, r5, r0)
            r4.A03(r0, r1)
            X.DwY r1 = new X.DwY
            r1.<init>(r4)
            r3.A00 = r1
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            r1.A05(r0)
            X.Mge r1 = r5.A04()
            boolean r0 = r1 instanceof X.NP1
            if (r0 != 0) goto L65
            boolean r0 = r1 instanceof X.NP0
            if (r0 == 0) goto L65
            X.NP0 r1 = (X.NP0) r1
            X.P4W r4 = r1.A04
            java.lang.String r3 = r1.A00
            boolean r2 = r1.A00
            java.lang.String r1 = "discard_confirmation_dialog_impression"
            java.lang.String r0 = "impression"
            X.P4W.A01(r4, r1, r0, r3, r2)
        L65:
            return
        L66:
            java.util.Map r0 = r5.A0F
            java.util.Iterator r1 = X.AbstractC166997dE.A16(r0)
        L6c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r1.next()
            X.Mcy r0 = (X.AbstractC50822Mcy) r0
            boolean r0 = r0.A05
            if (r0 == 0) goto L6c
            goto L8
        L7d:
            if (r6 != 0) goto L86
            boolean r0 = X.AbstractC51031Mge.A00(r5)
            r1 = 1
            if (r0 != 0) goto L87
        L86:
            r1 = 0
        L87:
            boolean r0 = r5 instanceof X.C52572NNs
            if (r0 == 0) goto L65
            X.NNs r5 = (X.C52572NNs) r5
            r0 = r1 ^ 1
            X.C52572NNs.A02(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6B.A01(X.N6B, boolean):void");
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        String str2;
        AbstractC51031Mge A04 = A04();
        if (A04 instanceof NP1) {
            NP1 np1 = (NP1) A04;
            boolean z = np1.A06;
            P4X p4x = np1.A02;
            Long l = np1.A03;
            String str3 = np1.A04;
            if (z) {
                C14360o3.A0B(str3, 1);
                str2 = "lead_gen_review_form";
            } else {
                C14360o3.A0B(str3, 1);
                str2 = "lead_gen_preview_form";
            }
            P4X.A02(p4x, l, str2, "cancel", str3);
        } else if (A04 instanceof NP0) {
            NP0 np0 = (NP0) A04;
            P4W.A01(np0.A04, "cancel", "click", ((AbstractC51031Mge) np0).A00, np0.A00);
        } else {
            C52604NOz c52604NOz = (C52604NOz) A04;
            boolean z2 = c52604NOz.A05;
            P4U p4u = c52604NOz.A01;
            Long l2 = c52604NOz.A03;
            if (z2) {
                str = "lead_gen_review_form";
            } else {
                str = "lead_gen_preview_form";
            }
            AbstractC43592JPx.A1Q(p4u, l2, str, "cancel", "click");
        }
        if (A04().A04()) {
            return false;
        }
        A01(this, false);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(489420730);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_form_preview, viewGroup, false);
        C0f9.A09(1684266023, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        int A02 = C0f9.A02(-1747269433);
        super.onDestroyView();
        IgTextView igTextView = this.A03;
        if (igTextView != null && (viewTreeObserver = igTextView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this.A0E);
        }
        this.A05 = null;
        this.A09 = null;
        this.A06 = null;
        this.A01 = null;
        this.A02 = null;
        this.A04 = null;
        this.A03 = null;
        this.A00 = null;
        C0f9.A09(-149264938, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        int A02 = C0f9.A02(752428104);
        super.onStart();
        AbstractC50967Mfa A03 = A03();
        AnonymousClass195 anonymousClass195 = null;
        if (A03 != null) {
            anonymousClass195 = PZH.A01(this, A03.A01, 27);
        }
        this.A0A = anonymousClass195;
        this.A0B = PZH.A01(this, A04().A0B, 28);
        C0f9.A09(1913196398, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        int A02 = C0f9.A02(2033316814);
        super.onStop();
        AnonymousClass195 anonymousClass195 = this.A0A;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A0A = null;
        AnonymousClass195 anonymousClass1952 = this.A0B;
        if (anonymousClass1952 != null) {
            anonymousClass1952.AGH(null);
        }
        this.A0B = null;
        C0f9.A09(1732944927, A02);
    }
}
