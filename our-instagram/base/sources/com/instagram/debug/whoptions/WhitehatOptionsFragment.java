package com.instagram.debug.whoptions;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC25229BEm;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC33235ElU;
import X.AbstractC53242c7;
import X.C0f9;
import X.C106904rr;
import X.C17280tP;
import X.C1C0;
import X.C1I7;
import X.C1UC;
import X.C2d6;
import X.C31335Dq0;
import X.C36731GHa;
import X.C3FQ;
import X.FMU;
import X.GYW;
import X.GZS;
import X.InterfaceC19610xo;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.api.DevOptionsPreferenceAdapter;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class WhitehatOptionsFragment extends AbstractC33235ElU implements InterfaceC60122ou {
    public DevOptionsPreferenceAdapter mAdapter;
    public final GZS mTypeaheadDelegate = new GZS() { // from class: com.instagram.debug.whoptions.WhitehatOptionsFragment.5
        @Override // X.GZS
        public void registerTextViewLogging(TextView textView) {
            textView.addTextChangedListener(C106904rr.A00(WhitehatOptionsFragment.this.mUserSession));
        }

        @Override // X.GZS
        public void searchTextChanged(String str) {
            boolean isEmpty = str.isEmpty();
            WhitehatOptionsFragment whitehatOptionsFragment = WhitehatOptionsFragment.this;
            if (isEmpty) {
                whitehatOptionsFragment.refreshItems();
            } else {
                FMU fmu = whitehatOptionsFragment.mTypeaheadHeaderModel;
                if (fmu != null) {
                    fmu.A03 = true;
                }
                DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = whitehatOptionsFragment.mAdapter;
                if (devOptionsPreferenceAdapter != null) {
                    devOptionsPreferenceAdapter.setTypeaheadHeaderModel(fmu);
                }
            }
            WhitehatOptionsFragment.this.filterOptions(str);
        }
    };
    public FMU mTypeaheadHeaderModel;
    public UserSession mUserSession;

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "whitehat_options";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void filterOptions(CharSequence charSequence) {
        DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = this.mAdapter;
        if (devOptionsPreferenceAdapter != null) {
            devOptionsPreferenceAdapter.getFilter().filter(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldAddPrefTTL() {
        return AbstractC167007dF.A1N(C1C0.A00(this.mUserSession) ? 1 : 0);
    }

    private void addNetworkItems(List list) {
        final C17280tP A00 = C17280tP.A00();
        list.add(C31335Dq0.A00(2131977096));
        list.add(C36731GHa.A02(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.whoptions.WhitehatOptionsFragment.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                String str;
                C17280tP A002 = C17280tP.A00();
                if (WhitehatOptionsFragment.this.shouldAddPrefTTL() && z) {
                    str = StringFormatUtil.formatStrLocaleSafe("%d:%d", AbstractC31173DnH.A0g(), Integer.valueOf(DexStore.DAYS_TO_MS_FACTOR));
                } else {
                    str = "";
                }
                InterfaceC19610xo ARD = A002.A00.ARD();
                ARD.E77("debug_allow_user_certs", z);
                ARD.E7K("debug_allow_user_certs_ttl", str);
                ARD.apply();
                if (z) {
                    C17280tP.A4F.add("debug_allow_user_certs");
                }
                C1UC activity = WhitehatOptionsFragment.this.getActivity();
                if (activity instanceof C2d6) {
                    ((C2d6) activity).E20(A00);
                }
            }
        }, 2131977093, A00.A0K()));
        boolean A1a = AbstractC31172DnG.A1a(A00.A00, "debug_disable_liger_fizz");
        if (!A1a && C17280tP.A4F.contains("debug_disable_liger_fizz")) {
            A1a = true;
        }
        list.add(C36731GHa.A02(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.whoptions.WhitehatOptionsFragment.4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                InterfaceC19610xo ARD = A00.A00.ARD();
                ARD.E77("debug_disable_liger_fizz", z);
                ARD.apply();
                if (z) {
                    C17280tP.A4F.add("debug_disable_liger_fizz");
                }
            }
        }, 2131977095, A1a));
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
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131977092);
    }

    @Override // X.AbstractC59962oe
    public AbstractC18680vv getSession() {
        return this.mUserSession;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        int A02 = C0f9.A02(2026245052);
        super.onPause();
        if (this.mView != null) {
            AbstractC13880nE.A0O(AbstractC31174DnI.A0G(this));
        }
        C0f9.A09(1948291223, A02);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.FMU, java.lang.Object] */
    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mUserSession = AbstractC31176DnK.A0S(this);
        this.mAdapter = new DevOptionsPreferenceAdapter(requireActivity(), this.mUserSession, this);
        getScrollingViewProxy().EPJ(this.mAdapter);
        AbstractC31174DnI.A0G(this).setBackgroundColor(AbstractC53242c7.A00(requireContext()));
        SearchEditText searchEditText = new SearchEditText(requireContext());
        searchEditText.setHint("Search Whitehat Settings");
        ?? obj = new Object();
        this.mTypeaheadHeaderModel = obj;
        obj.A01 = this.mTypeaheadDelegate;
        obj.A00 = searchEditText;
        obj.A02 = new GYW() { // from class: com.instagram.debug.whoptions.WhitehatOptionsFragment.1
            @Override // X.GYW
            public void onSearchCleared(String str) {
                WhitehatOptionsFragment.this.refreshItems();
            }
        };
        getScrollingViewProxy().AAJ(new C1I7() { // from class: com.instagram.debug.whoptions.WhitehatOptionsFragment.2
            @Override // X.C1I2
            public void onScrollStateChanged(C3FQ c3fq, int i) {
                int A03 = C0f9.A03(-1974471149);
                if (i == 1) {
                    AbstractC13880nE.A0O(AbstractC31174DnI.A0G(WhitehatOptionsFragment.this));
                }
                C0f9.A0A(-606453774, A03);
            }
        });
        refreshItems();
    }
}
