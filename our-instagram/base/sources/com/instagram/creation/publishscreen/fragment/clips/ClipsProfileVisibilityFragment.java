package com.instagram.creation.publishscreen.fragment.clips;

import X.AbstractC09440dt;
import X.AbstractC151756sL;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC31172DnG;
import X.AbstractC50522MSa;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C50883MeE;
import X.C55519OlD;
import X.C57522Pfw;
import X.EnumC09460dv;
import X.EnumC53237Nga;
import X.EnumC76383bi;
import X.InterfaceC09390do;
import X.MSW;
import X.MSX;
import X.PYb;
import X.ViewOnClickListenerC55462OkH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes9.dex */
public final class ClipsProfileVisibilityFragment extends AbstractC59962oe {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public IgdsBottomButtonLayout bottomButton;
    public IgdsListCell clipsOnlyToggle;
    public IgTextView footerText;
    public IgdsListCell includeInProfileToggle;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ClipsProfileVisibilityFragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        boolean z = false;
        if (EnumC76383bi.A01.get(requireArguments().getString("AUDIENCE")) == EnumC76383bi.A0C) {
            z = true;
            if (AbstractC151756sL.A01()) {
                TextView A0N = AbstractC167007dF.A0N(view, R.id.clips_profile_visibility_subtitle);
                MSX.A0t();
                A0N.setText(2131969022);
            }
        }
        IgdsListCell igdsListCell = (IgdsListCell) view.requireViewById(R.id.include_in_profile_toggle);
        C14360o3.A0B(igdsListCell, 0);
        this.includeInProfileToggle = igdsListCell;
        IgdsListCell igdsListCell2 = (IgdsListCell) view.requireViewById(R.id.clips_only_toggle);
        C14360o3.A0B(igdsListCell2, 0);
        this.clipsOnlyToggle = igdsListCell2;
        IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.footer_text);
        C14360o3.A0B(A0X, 0);
        this.footerText = A0X;
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(view, R.id.bottom_action_button);
        C14360o3.A0B(A0j, 0);
        this.bottomButton = A0j;
        IgdsListCell igdsListCell3 = this.includeInProfileToggle;
        if (igdsListCell3 != null) {
            EnumC53237Nga enumC53237Nga = EnumC53237Nga.A07;
            igdsListCell3.setTextCellType(enumC53237Nga);
            IgdsListCell igdsListCell4 = this.clipsOnlyToggle;
            if (igdsListCell4 != null) {
                igdsListCell4.setTextCellType(enumC53237Nga);
                IgdsBottomButtonLayout igdsBottomButtonLayout = this.bottomButton;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setPrimaryAction(getString(2131961124), new ViewOnClickListenerC55462OkH(this, 50));
                    AbstractC50522MSa.A14(this, new PYb(this, null, 4, z), ((C50883MeE) this.A00.getValue()).A00);
                    IgdsListCell igdsListCell5 = this.includeInProfileToggle;
                    if (igdsListCell5 != null) {
                        C55519OlD.A02(igdsListCell5, this, 1);
                        IgdsListCell igdsListCell6 = this.clipsOnlyToggle;
                        if (igdsListCell6 != null) {
                            C55519OlD.A02(igdsListCell6, this, 2);
                            return;
                        }
                    }
                } else {
                    str = "bottomButton";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            str = "clipsOnlyToggle";
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

    public ClipsProfileVisibilityFragment() {
        C57522Pfw A00 = C57522Pfw.A00(this, 9);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, C57522Pfw.A00(C57522Pfw.A00(this, 10), 11));
        this.A00 = AbstractC25225BEi.A0a(C57522Pfw.A00(A002, 12), A00, MSW.A1G(A002, null, 9), AbstractC25225BEi.A1D(C50883MeE.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1012886251);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_clips_profile_visibility_fragment, false);
        C0f9.A09(-1768111340, A02);
        return A0R;
    }
}
