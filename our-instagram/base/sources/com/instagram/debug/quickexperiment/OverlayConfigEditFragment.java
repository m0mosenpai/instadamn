package com.instagram.debug.quickexperiment;

import X.AbstractC18680vv;
import X.AbstractC20080yf;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC33235ElU;
import X.AbstractC50522MSa;
import X.AbstractRunnableC14200nk;
import X.C0f9;
import X.C106904rr;
import X.C11T;
import X.C14120nc;
import X.C1I7;
import X.C3FQ;
import X.GYX;
import X.GZS;
import X.InterfaceC28041Xi;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes11.dex */
public class OverlayConfigEditFragment extends AbstractC33235ElU implements InterfaceC60072op, GZS, InterfaceC60122ou, GYX {
    public static final String TITLE = "Edit Overlay Configs";
    public OverlayConfigEditAdapter mAdapter;
    public UserSession mSession;
    public TypeaheadHeader mTypeaheadHeader;
    public final InterfaceC28041Xi mSearchOverlayConfigPredicate = new InterfaceC28041Xi() { // from class: com.instagram.debug.quickexperiment.OverlayConfigEditFragment.1
        @Override // X.InterfaceC28041Xi
        public boolean apply(AbstractC20080yf abstractC20080yf) {
            if (!OverlayConfigHelper.isOverlayConfig(abstractC20080yf)) {
                return false;
            }
            if (!QuickExperimentHelper.getNiceUniverseName(abstractC20080yf.universeName).toLowerCase().contains(OverlayConfigEditFragment.this.mSearchQuery.toLowerCase()) && !abstractC20080yf.name.replace("_", " ").toLowerCase().contains(OverlayConfigEditFragment.this.mSearchQuery.toLowerCase())) {
                return false;
            }
            return true;
        }
    };
    public List mOverlayConfigsList = new ArrayList();
    public String mSearchQuery = "";

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "overlay_config_edit";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void filterOverlayConfigList(String str) {
        final ArrayList arrayList = new ArrayList();
        for (Object obj : QuickExperimentHelper.getAllExperiments()) {
            if (str.equals(this.mSearchQuery)) {
                if (this.mSearchOverlayConfigPredicate.apply(obj)) {
                    arrayList.add(obj);
                }
            } else {
                return;
            }
        }
        sortOverlayConfigList(arrayList);
        C11T.A03(new Runnable() { // from class: com.instagram.debug.quickexperiment.OverlayConfigEditFragment.5
            @Override // java.lang.Runnable
            public void run() {
                OverlayConfigEditFragment.this.setItems(arrayList, true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(List list, boolean z) {
        OverlayConfigEditAdapter overlayConfigEditAdapter = this.mAdapter;
        overlayConfigEditAdapter.setMenuItemList(QuickExperimentHelper.setupMenuItems(this, this.mSession, list, overlayConfigEditAdapter, false));
    }

    private void sortOverlayConfigList(List list) {
        Collections.sort(list, new Comparator() { // from class: com.instagram.debug.quickexperiment.OverlayConfigEditFragment.4
            @Override // java.util.Comparator
            public int compare(AbstractC20080yf abstractC20080yf, AbstractC20080yf abstractC20080yf2) {
                String str = abstractC20080yf.universeName;
                String str2 = abstractC20080yf2.universeName;
                if (str.equalsIgnoreCase(str2)) {
                    String str3 = abstractC20080yf.name;
                    if ("is_enabled".equals(str3)) {
                        return -1;
                    }
                    String str4 = abstractC20080yf2.name;
                    if ("is_enabled".equals(str4)) {
                        return 1;
                    }
                    return str3.compareTo(str4);
                }
                return str.compareTo(str2);
            }
        });
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1I(interfaceC56362iU, TITLE);
    }

    @Override // X.GYX
    public View getRowView() {
        return this.mTypeaheadHeader;
    }

    @Override // X.AbstractC59962oe
    public AbstractC18680vv getSession() {
        return this.mSession;
    }

    @Override // X.InterfaceC60072op
    public boolean onBackPressed() {
        TypeaheadHeader typeaheadHeader = this.mTypeaheadHeader;
        if (typeaheadHeader != null) {
            typeaheadHeader.A01();
            return false;
        }
        return false;
    }

    @Override // X.GZS
    public void registerTextViewLogging(TextView textView) {
        textView.addTextChangedListener(C106904rr.A00(this.mSession));
    }

    @Override // X.GZS
    public void searchTextChanged(String str) {
        this.mSearchQuery = str;
        if (!TextUtils.isEmpty(str)) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk(1386848661) { // from class: com.instagram.debug.quickexperiment.OverlayConfigEditFragment.3
                @Override // java.lang.Runnable
                public void run() {
                    OverlayConfigEditFragment overlayConfigEditFragment = OverlayConfigEditFragment.this;
                    overlayConfigEditFragment.filterOverlayConfigList(overlayConfigEditFragment.mSearchQuery);
                }
            });
        } else {
            setItems(this.mOverlayConfigsList, false);
        }
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-873723397);
        super.onCreate(bundle);
        this.mSession = AbstractC31176DnK.A0S(this);
        this.mAdapter = new OverlayConfigEditAdapter(requireContext(), this);
        ArrayList arrayList = new ArrayList();
        for (AbstractC20080yf abstractC20080yf : QuickExperimentHelper.getAllExperiments()) {
            if (OverlayConfigHelper.isOverlayConfig(abstractC20080yf)) {
                arrayList.add(abstractC20080yf);
            }
        }
        this.mOverlayConfigsList = arrayList;
        sortOverlayConfigList(arrayList);
        C0f9.A09(2129308742, A02);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TypeaheadHeader typeaheadHeader = new TypeaheadHeader(requireContext());
        this.mTypeaheadHeader = typeaheadHeader;
        typeaheadHeader.A01 = this;
        AbstractC50522MSa.A0z(typeaheadHeader);
        if (!TextUtils.isEmpty(this.mSearchQuery)) {
            this.mTypeaheadHeader.A04(this.mSearchQuery);
        }
        this.mTypeaheadHeader.A03("Search Quick Experiments");
        getScrollingViewProxy().AAJ(new C1I7() { // from class: com.instagram.debug.quickexperiment.OverlayConfigEditFragment.2
            @Override // X.C1I2
            public void onScrollStateChanged(C3FQ c3fq, int i) {
                int A03 = C0f9.A03(-1769412514);
                if (i == 1) {
                    OverlayConfigEditFragment.this.mTypeaheadHeader.A01();
                }
                C0f9.A0A(444555902, A03);
            }
        });
        getScrollingViewProxy().CFj().setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        getScrollingViewProxy().EPJ(this.mAdapter);
        setItems(this.mOverlayConfigsList, false);
    }
}
