package com.instagram.archive.fragment;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18560vj;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C15340po;
import X.C29897DGl;
import X.C50879MeA;
import X.C57508Pfi;
import X.EnumC09460dv;
import X.EnumC53237Nga;
import X.InterfaceC09390do;
import X.LQ0;
import X.LRE;
import X.PYw;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes8.dex */
public final class HighlightsProfileVisibilityFragment extends AbstractC59962oe {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public IgdsBottomButtonLayout bottomButton;
    public IgTextView footerText;
    public IgdsListCell highlightsOnlyToggle;
    public IgdsListCell includeInProfileToggle;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "HighlightsProfileVisibilityFragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsListCell igdsListCell = (IgdsListCell) AbstractC166997dE.A0R(view, R.id.include_in_profile_toggle);
        C14360o3.A0B(igdsListCell, 0);
        this.includeInProfileToggle = igdsListCell;
        IgdsListCell igdsListCell2 = (IgdsListCell) AbstractC166997dE.A0R(view, R.id.highlights_only_toggle);
        C14360o3.A0B(igdsListCell2, 0);
        this.highlightsOnlyToggle = igdsListCell2;
        IgTextView A0d = AbstractC25231BEo.A0d(view, R.id.footer_text);
        C14360o3.A0B(A0d, 0);
        this.footerText = A0d;
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AbstractC166997dE.A0R(view, R.id.bottom_action_button);
        C14360o3.A0B(igdsBottomButtonLayout, 0);
        this.bottomButton = igdsBottomButtonLayout;
        IgdsListCell igdsListCell3 = this.includeInProfileToggle;
        if (igdsListCell3 != null) {
            EnumC53237Nga enumC53237Nga = EnumC53237Nga.A07;
            igdsListCell3.setTextCellType(enumC53237Nga);
            IgdsListCell igdsListCell4 = this.highlightsOnlyToggle;
            if (igdsListCell4 != null) {
                igdsListCell4.setTextCellType(enumC53237Nga);
                IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.bottomButton;
                if (igdsBottomButtonLayout2 != null) {
                    igdsBottomButtonLayout2.setPrimaryAction(getString(2131961124), LQ0.A01(this, 46));
                    AbstractC18560vj.A03(AbstractC25229BEm.A0a(this), new C15340po(new PYw(this, null, 8), ((C50879MeA) this.A00.getValue()).A00));
                    IgdsListCell igdsListCell5 = this.includeInProfileToggle;
                    if (igdsListCell5 != null) {
                        igdsListCell5.A0D(new LRE(this, 0));
                        IgdsListCell igdsListCell6 = this.highlightsOnlyToggle;
                        if (igdsListCell6 != null) {
                            igdsListCell6.A0D(new LRE(this, 1));
                            return;
                        }
                    }
                } else {
                    str = "bottomButton";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            str = "highlightsOnlyToggle";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "includeInProfileToggle";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public HighlightsProfileVisibilityFragment() {
        C57508Pfi c57508Pfi = new C57508Pfi(this, 22);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57508Pfi(new C57508Pfi(this, 23), 24));
        this.A00 = AbstractC25225BEi.A0a(new C57508Pfi(A00, 25), c57508Pfi, new C29897DGl(49, null, A00), AbstractC25225BEi.A1D(C50879MeA.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1862316909);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_highlights_profile_visibility_fragment, false);
        C0f9.A09(-2050297458, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(760033387);
        super.onDestroyView();
        HighlightsProfileVisibilityFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(-2134287197, A02);
    }
}
