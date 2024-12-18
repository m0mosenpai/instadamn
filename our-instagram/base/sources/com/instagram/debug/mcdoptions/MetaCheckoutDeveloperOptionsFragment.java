package com.instagram.debug.mcdoptions;

import X.AbstractC111324zv;
import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25229BEm;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC33235ElU;
import X.AbstractC53242c7;
import X.C0f9;
import X.C106904rr;
import X.C1AT;
import X.C1AV;
import X.C1I7;
import X.C31335Dq0;
import X.C36731GHa;
import X.C3FQ;
import X.FMU;
import X.GYW;
import X.GZS;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.api.DevOptionsPreferenceAdapter;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class MetaCheckoutDeveloperOptionsFragment extends AbstractC33235ElU implements InterfaceC60122ou {
    public DevOptionsPreferenceAdapter mAdapter;
    public final GZS mTypeaheadDelegate = new GZS() { // from class: com.instagram.debug.mcdoptions.MetaCheckoutDeveloperOptionsFragment.4
        @Override // X.GZS
        public void registerTextViewLogging(TextView textView) {
            textView.addTextChangedListener(C106904rr.A00(MetaCheckoutDeveloperOptionsFragment.this.mUserSession));
        }

        @Override // X.GZS
        public void searchTextChanged(String str) {
            boolean isEmpty = str.isEmpty();
            MetaCheckoutDeveloperOptionsFragment metaCheckoutDeveloperOptionsFragment = MetaCheckoutDeveloperOptionsFragment.this;
            if (isEmpty) {
                metaCheckoutDeveloperOptionsFragment.refreshItems();
            } else {
                FMU fmu = metaCheckoutDeveloperOptionsFragment.mTypeaheadHeaderModel;
                if (fmu != null) {
                    fmu.A03 = true;
                }
                DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = metaCheckoutDeveloperOptionsFragment.mAdapter;
                if (devOptionsPreferenceAdapter != null) {
                    devOptionsPreferenceAdapter.setTypeaheadHeaderModel(fmu);
                }
            }
            MetaCheckoutDeveloperOptionsFragment.this.filterOptions(str);
        }
    };
    public FMU mTypeaheadHeaderModel;
    public InterfaceC19630xq mUserPreferences;
    public UserSession mUserSession;

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "meta_checkout_developer_options";
    }

    private void addNetworkItems(List list) {
        list.add(new C31335Dq0("Script Injection"));
        list.add(new C36731GHa(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.mcdoptions.MetaCheckoutDeveloperOptionsFragment.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                InterfaceC19610xo ARD = MetaCheckoutDeveloperOptionsFragment.this.mUserPreferences.ARD();
                ARD.E77(AbstractC111324zv.A00(1251), z);
                ARD.apply();
            }
        }, "Enable Meta Checkout script injection", AbstractC31172DnG.A1a(this.mUserPreferences, AbstractC111324zv.A00(1251))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void filterOptions(CharSequence charSequence) {
        DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = this.mAdapter;
        if (devOptionsPreferenceAdapter != null) {
            devOptionsPreferenceAdapter.getFilter().filter(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshItems() {
        ArrayList A1E = AbstractC166987dD.A1E();
        SearchEditText searchEditText = this.mTypeaheadHeaderModel.A00;
        if (searchEditText != null) {
            searchEditText.setText("");
        }
        A1E.add(this.mTypeaheadHeaderModel);
        addNetworkItems(A1E);
        DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = this.mAdapter;
        if (devOptionsPreferenceAdapter != null) {
            devOptionsPreferenceAdapter.setUnfilteredItems(A1E);
        }
        filterOptions("");
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131966609);
    }

    @Override // X.AbstractC59962oe
    public AbstractC18680vv getSession() {
        return this.mUserSession;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        int A02 = C0f9.A02(1582180815);
        super.onPause();
        if (this.mView != null) {
            AbstractC13880nE.A0O(AbstractC31174DnI.A0G(this));
        }
        C0f9.A09(-217480789, A02);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.FMU, java.lang.Object] */
    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mUserSession = AbstractC31176DnK.A0S(this);
        this.mAdapter = new DevOptionsPreferenceAdapter(requireActivity(), this.mUserSession, this);
        this.mUserPreferences = C1AT.A01(this.mUserSession).A03(C1AV.A2E);
        getScrollingViewProxy().EPJ(this.mAdapter);
        AbstractC31174DnI.A0G(this).setBackgroundColor(AbstractC53242c7.A00(requireContext()));
        SearchEditText searchEditText = new SearchEditText(requireContext());
        searchEditText.setHint("Search preferences");
        ?? obj = new Object();
        this.mTypeaheadHeaderModel = obj;
        obj.A01 = this.mTypeaheadDelegate;
        obj.A00 = searchEditText;
        obj.A02 = new GYW() { // from class: com.instagram.debug.mcdoptions.MetaCheckoutDeveloperOptionsFragment.1
            @Override // X.GYW
            public void onSearchCleared(String str) {
                MetaCheckoutDeveloperOptionsFragment.this.refreshItems();
            }
        };
        getScrollingViewProxy().AAJ(new C1I7() { // from class: com.instagram.debug.mcdoptions.MetaCheckoutDeveloperOptionsFragment.2
            @Override // X.C1I2
            public void onScrollStateChanged(C3FQ c3fq, int i) {
                int A03 = C0f9.A03(-205512161);
                if (i == 1) {
                    AbstractC13880nE.A0O(AbstractC31174DnI.A0G(MetaCheckoutDeveloperOptionsFragment.this));
                }
                C0f9.A0A(-1483740041, A03);
            }
        });
        refreshItems();
    }
}
