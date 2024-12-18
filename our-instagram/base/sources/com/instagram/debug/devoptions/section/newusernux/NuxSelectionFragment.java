package com.instagram.debug.devoptions.section.newusernux;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC34714FQz;
import X.AbstractC36003Fv1;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C05F;
import X.C0f9;
import X.C14360o3;
import X.C16910sj;
import X.C1AT;
import X.C1AV;
import X.C33002Egp;
import X.C34954Fae;
import X.C35120FeN;
import X.C35781FrJ;
import X.EnumC33445EqI;
import X.EnumC33522Erv;
import X.InterfaceC09390do;
import X.InterfaceC19610xo;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public final class NuxSelectionFragment extends AbstractC59962oe implements InterfaceC60122ou {
    public AbstractC34714FQz currentState;
    public C35120FeN factory;
    public C33002Egp logic;
    public final LinkedHashMap onboardingStepMap = AbstractC166987dD.A1I();
    public final C35781FrJ delegate = new Object();
    public final InterfaceC09390do userSession$delegate = AbstractC60492pY.A02(this);
    public final String preferenceKey = "selected_steps";
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, "Custom NUX Flow");
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "nux_selection_fragment";
    }

    private final Set getSelectedSteps() {
        List A0m;
        String string = AbstractC31174DnI.A0g(C1AT.A01(AbstractC166987dD.A0r(this.userSession$delegate)), C1AV.A11, this).getString(this.preferenceKey, "");
        if (string != null && (A0m = AbstractC167007dF.A0m(string, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0)) != null) {
            return AbstractC001800i.A0k(A0m);
        }
        return C16910sj.A00;
    }

    private final UserSession getUserSession() {
        return AbstractC166987dD.A0r(this.userSession$delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetAllCheckBoxes(boolean z) {
        Iterator it = this.onboardingStepMap.keySet().iterator();
        while (it.hasNext()) {
            CompoundButton compoundButton = (CompoundButton) this.onboardingStepMap.get(it.next());
            if (compoundButton != null) {
                compoundButton.setChecked(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveSelectedSteps(List list) {
        InterfaceC19610xo ARD = AbstractC31174DnI.A0g(C1AT.A01(AbstractC166987dD.A0r(this.userSession$delegate)), C1AV.A11, this).ARD();
        StringBuilder A1C = AbstractC166987dD.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1C.append(String.valueOf(((C34954Fae) it.next()).A00));
            A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        }
        ARD.E7K(this.preferenceKey, A1C.toString());
        ARD.apply();
    }

    @Override // X.AbstractC59962oe
    public /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List getSerializableSteps() {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = this.onboardingStepMap.keySet().iterator();
        while (it.hasNext()) {
            EnumC33522Erv enumC33522Erv = (EnumC33522Erv) AbstractC166997dE.A0l(it);
            CompoundButton compoundButton = (CompoundButton) this.onboardingStepMap.get(enumC33522Erv);
            if (compoundButton != null && compoundButton.isChecked()) {
                A1E.add(new C34954Fae(enumC33522Erv, null));
            }
        }
        return A1E;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1411279639);
        super.onCreate(bundle);
        Context context = getContext();
        if (context != null) {
            C35781FrJ c35781FrJ = this.delegate;
            c35781FrJ.A01 = EnumC33445EqI.A03;
            c35781FrJ.A02 = C05F.A00;
            c35781FrJ.A00 = AbstractC166987dD.A0r(this.session$delegate);
            this.factory = new C35120FeN(this.delegate);
            C33002Egp A01 = C33002Egp.A03.A01(context, AbstractC166987dD.A0r(this.session$delegate), this.delegate, null);
            this.logic = A01;
            this.currentState = ((AbstractC36003Fv1) A01).A01;
        }
        C0f9.A09(500663551, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008f, code lost:
    
        if (X.C35120FeN.A00(r1, r14, null).A00() != true) goto L15;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onCreateView(android.view.LayoutInflater r19, android.view.ViewGroup r20, android.os.Bundle r21) {
        /*
            r18 = this;
            r0 = -1766146150(0xffffffff96babf9a, float:-3.0170838E-25)
            int r17 = X.C0f9.A02(r0)
            r12 = 0
            r2 = r19
            X.C14360o3.A0B(r2, r12)
            r0 = 2131628081(0x7f0e1031, float:1.8883445E38)
            r1 = r20
            android.view.View r2 = r2.inflate(r0, r1, r12)
            r0 = 2131437318(0x7f0b2706, float:1.8496531E38)
            android.view.ViewGroup r11 = X.AbstractC31176DnK.A0C(r2, r0)
            r3 = r18
            android.content.Context r0 = r3.getContext()
            r10 = -1
            r9 = -2
            if (r0 == 0) goto L49
            com.instagram.common.ui.base.IgTextView r5 = new com.instagram.common.ui.base.IgTextView
            r5.<init>(r0)
            r0 = 2131957944(0x7f1318b8, float:1.9552486E38)
            X.AbstractC25227BEk.A12(r5, r3, r0)
            r0 = 17
            r5.setGravity(r0)
            android.view.ViewGroup$MarginLayoutParams r4 = new android.view.ViewGroup$MarginLayoutParams
            r4.<init>(r9, r10)
            r1 = 10
            r0 = 15
            r4.setMargins(r12, r1, r12, r0)
            r5.setLayoutParams(r4)
            r11.addView(r5)
        L49:
            X.Erv[] r8 = X.EnumC33522Erv.values()
            java.util.Set r16 = r3.getSelectedSteps()
            int r7 = r8.length
            r6 = 0
        L53:
            if (r6 >= r7) goto Lbc
            r14 = r8[r6]
            X.Erv r0 = X.EnumC33522Erv.A0V
            if (r14 == r0) goto Lb9
            android.content.Context r0 = r3.getContext()
            android.widget.CheckBox r5 = new android.widget.CheckBox
            r5.<init>(r0)
            java.lang.String r13 = r14.toString()
            r5.setText(r13)
            java.util.LinkedHashMap r0 = r3.onboardingStepMap
            r0.put(r14, r5)
            r11.addView(r5)
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto La8
            com.instagram.common.ui.base.IgTextView r15 = new com.instagram.common.ui.base.IgTextView
            r15.<init>(r0)
            X.FeN r1 = r3.factory
            r4 = 1
            if (r1 == 0) goto L91
            r0 = 0
            X.FRf r0 = X.C35120FeN.A00(r1, r14, r0)
            boolean r1 = r0.A00()
            r0 = 2131957943(0x7f1318b7, float:1.9552484E38)
            if (r1 == r4) goto L94
        L91:
            r0 = 2131957945(0x7f1318b9, float:1.9552488E38)
        L94:
            X.AbstractC25227BEk.A12(r15, r3, r0)
            android.view.ViewGroup$MarginLayoutParams r4 = new android.view.ViewGroup$MarginLayoutParams
            r4.<init>(r9, r10)
            r1 = 100
            r0 = 5
            r4.setMargins(r1, r12, r12, r0)
            r15.setLayoutParams(r4)
            r11.addView(r15)
        La8:
            com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$3 r0 = new com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$3
            r0.<init>()
            r5.setOnCheckedChangeListener(r0)
            r0 = r16
            boolean r0 = r0.contains(r13)
            r5.setChecked(r0)
        Lb9:
            int r6 = r6 + 1
            goto L53
        Lbc:
            r0 = 2131429956(0x7f0b0a44, float:1.84816E38)
            android.view.View r1 = X.AbstractC166997dE.A0S(r2, r0)
            com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$4 r0 = new com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$4
            r0.<init>()
            X.C0fQ.A00(r0, r1)
            r0 = 2131441059(0x7f0b35a3, float:1.8504119E38)
            android.view.View r1 = X.AbstractC166997dE.A0S(r2, r0)
            com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$5 r0 = new com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$5
            r0.<init>()
            X.C0fQ.A00(r0, r1)
            r0 = 2131435205(0x7f0b1ec5, float:1.8492246E38)
            android.view.View r1 = X.AbstractC166997dE.A0S(r2, r0)
            com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$6 r0 = new com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment$onCreateView$6
            r0.<init>()
            X.C0fQ.A00(r0, r1)
            r1 = -1202952627(0xffffffffb84c664d, float:-4.8732665E-5)
            r0 = r17
            X.C0f9.A09(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.section.newusernux.NuxSelectionFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroy() {
        C33002Egp c33002Egp;
        int A02 = C0f9.A02(253182256);
        super.onDestroy();
        saveSelectedSteps(getSerializableSteps());
        AbstractC34714FQz abstractC34714FQz = this.currentState;
        if (abstractC34714FQz != null && (c33002Egp = this.logic) != null) {
            c33002Egp.A02(abstractC34714FQz, true);
        }
        C35120FeN.A02.clear();
        C0f9.A09(-1956248122, A02);
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }
}
