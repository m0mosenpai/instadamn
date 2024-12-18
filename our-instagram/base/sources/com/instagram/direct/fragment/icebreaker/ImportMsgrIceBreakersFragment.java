package com.instagram.direct.fragment.icebreaker;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC60672pq;
import X.C0f9;
import X.C168737g7;
import X.C16930sl;
import X.C1P1;
import X.C25621Ms;
import X.C2US;
import X.C31651DvH;
import X.C32456ERi;
import X.C33627Etd;
import X.C34923Fa9;
import X.C36292Fzm;
import X.EBL;
import X.EQB;
import X.ESH;
import X.EV0;
import X.EnumC153216up;
import X.F28;
import X.FP8;
import X.FR9;
import X.FU6;
import X.InterfaceC1571373s;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.ViewOnClickListenerC35681FpG;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public class ImportMsgrIceBreakersFragment extends AbstractC60672pq implements InterfaceC60122ou, InterfaceC1571373s {
    public Context A00;
    public FragmentActivity A01;
    public EQB A02;
    public C34923Fa9 A03;
    public C36292Fzm A04;
    public View A06;
    public UserSession A07;
    public IgdsBottomButtonLayout mBottomButton;
    public EmptyStateView mEmptyStateView;
    public final FP8 A09 = new FP8(this);
    public final C1P1 A08 = EV0.A00(this, 2);
    public final C1P1 A0B = EV0.A00(this, 3);
    public final Set A0A = AbstractC166987dD.A1H();
    public List A05 = C16930sl.A00;

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
    }

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
    }

    public static void A00(ImportMsgrIceBreakersFragment importMsgrIceBreakersFragment) {
        int i = 0;
        for (C33627Etd c33627Etd : importMsgrIceBreakersFragment.A05) {
            Set set = importMsgrIceBreakersFragment.A0A;
            FR9 fr9 = c33627Etd.A00;
            if (set.contains(fr9.A01) && !TextUtils.isEmpty(fr9.A03)) {
                i++;
            }
        }
        C34923Fa9 c34923Fa9 = importMsgrIceBreakersFragment.A03;
        int size = importMsgrIceBreakersFragment.A0A.size();
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("selected_icebreaker_num", String.valueOf(size));
        A1G.put("selected_icebreaker_response_num", String.valueOf(i));
        C34923Fa9.A00(c34923Fa9, "icebreaker_settings_import_button_click", null, A1G);
    }

    public static void A01(ImportMsgrIceBreakersFragment importMsgrIceBreakersFragment, EnumC153216up enumC153216up) {
        EmptyStateView emptyStateView = importMsgrIceBreakersFragment.mEmptyStateView;
        if (emptyStateView != null) {
            emptyStateView.A0P(enumC153216up);
            int ordinal = enumC153216up.ordinal();
            EmptyStateView emptyStateView2 = importMsgrIceBreakersFragment.mEmptyStateView;
            int i = 8;
            if (ordinal != 4) {
                i = 0;
            }
            emptyStateView2.setVisibility(i);
        }
    }

    public final void A02() {
        C36292Fzm c36292Fzm = this.A04;
        ArrayList A1F = AbstractC166987dD.A1F(this.A0A);
        C1P1 c1p1 = this.A0B;
        C25621Ms A0M = AbstractC31173DnH.A0M(c36292Fzm.A0B);
        A0M.A0B("direct_v2/icebreakers/import/");
        A0M.A9s("icebreakers", AbstractC31175DnJ.A0b(A1F));
        A0M.A0S(EBL.class, FU6.class);
        AbstractC31175DnJ.A1K(A0M, c1p1);
    }

    public final void A03() {
        String A0a;
        String str;
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.mBottomButton;
        Set set = this.A0A;
        igdsBottomButtonLayout.setPrimaryButtonEnabled(AbstractC31171DnF.A1b(set));
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.mBottomButton;
        boolean isEmpty = set.isEmpty();
        Context context = this.A00;
        if (isEmpty) {
            A0a = context.getString(2131959375);
        } else {
            A0a = AbstractC31177DnL.A0a(context, set.size(), 2131959376);
        }
        igdsBottomButtonLayout2.setPrimaryActionText(A0a);
        IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.mBottomButton;
        if (this.A05.size() > 4) {
            str = AbstractC167017dG.A0k(this.A00.getResources(), 4, R.plurals.direct_faq_import_bottom_button_footer);
        } else {
            str = null;
        }
        igdsBottomButtonLayout3.setFooterText(str);
    }

    @Override // X.InterfaceC1571373s
    public final void DDR() {
        C36292Fzm c36292Fzm = this.A04;
        C1P1 c1p1 = this.A08;
        C25621Ms A0N = AbstractC31173DnH.A0N(c36292Fzm.A0B);
        A0N.A0B("direct_v2/icebreakers/get_msgr_ibs/");
        A0N.A0S(EBL.class, FU6.class);
        AbstractC31175DnJ.A1K(A0N, c1p1);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.setTitle("");
        AbstractC31176DnK.A1C(ViewOnClickListenerC35681FpG.A00(this, 55), AbstractC31174DnI.A0K(), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31173DnH.A0q(this);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A07;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.2US, X.EQB] */
    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1310044864);
        super.onCreate(bundle);
        this.A07 = AbstractC31176DnK.A0S(this);
        this.A00 = requireContext();
        this.A01 = requireActivity();
        Context requireContext = requireContext();
        UserSession userSession = this.A07;
        FP8 fp8 = this.A09;
        ?? c2us = new C2US(false);
        String string = requireContext.getString(2131959384);
        int i = 2131959377;
        if (!F28.A00(userSession)) {
            i = 2131959378;
        }
        ESH esh = new ESH(requireContext, string, requireContext.getString(i));
        c2us.A00 = esh;
        C168737g7 c168737g7 = new C168737g7(requireContext);
        c2us.A02 = c168737g7;
        C32456ERi c32456ERi = new C32456ERi(requireContext, userSession, fp8);
        c2us.A01 = c32456ERi;
        c2us.init(esh, c168737g7, c32456ERi);
        this.A02 = c2us;
        this.A04 = (C36292Fzm) C31651DvH.A00(this.A07, C36292Fzm.class, 4);
        this.A03 = new C34923Fa9(this, this.A07);
        C0f9.A09(-129308937, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1679400944);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fragment_import_messenger_icebreakers);
        this.A06 = A0A;
        C0f9.A09(726342154, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(882534712);
        super.onDestroy();
        C0f9.A09(-2051746071, A02);
    }

    @Override // X.AbstractC60672pq
    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManagerCompat(requireContext()));
        setAdapter(this.A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(this.A06, R.id.import_bottom_button);
        this.mBottomButton = A0j;
        A0j.setPrimaryActionOnClickListener(ViewOnClickListenerC35681FpG.A00(this, 56));
        A03();
        EmptyStateView emptyStateView = (EmptyStateView) view.requireViewById(android.R.id.empty);
        this.mEmptyStateView = emptyStateView;
        EnumC153216up enumC153216up = EnumC153216up.A04;
        emptyStateView.A0T(enumC153216up, 2131959497);
        this.mEmptyStateView.A0Q(enumC153216up, 2131959504);
        this.mEmptyStateView.A0O(this, enumC153216up);
        C36292Fzm c36292Fzm = this.A04;
        C1P1 c1p1 = this.A08;
        C25621Ms A0N = AbstractC31173DnH.A0N(c36292Fzm.A0B);
        A0N.A0B("direct_v2/icebreakers/get_msgr_ibs/");
        A0N.A0S(EBL.class, FU6.class);
        AbstractC31175DnJ.A1K(A0N, c1p1);
    }
}
