package com.instagram.debug.quickexperiment;

import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC20080yf;
import X.AbstractC31176DnK;
import X.AbstractC33235ElU;
import X.AnonymousClass001;
import X.C0f9;
import X.EnumC72396Xcj;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes11.dex */
public class QuickExperimentEditFragment extends AbstractC33235ElU implements InterfaceC60122ou {
    public final ExperimentParameterListGenerator mExperimentParameterListGenerator;
    public UserSession mSession;
    public final boolean mShowSeeAllInUniverse;
    public final String mTitle;

    /* loaded from: classes11.dex */
    public interface ExperimentParameterListGenerator {
        List createList();
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "quick_experiment_edit";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        List createList = this.mExperimentParameterListGenerator.createList();
        Collections.sort(createList, new Comparator() { // from class: com.instagram.debug.quickexperiment.QuickExperimentEditFragment$$ExternalSyntheticLambda2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return QuickExperimentEditFragment.lambda$onViewCreated$3((AbstractC20080yf) obj, (AbstractC20080yf) obj2);
            }
        });
        FragmentActivity activity = getActivity();
        if (activity != null) {
            QuickExperimentEditAdapter quickExperimentEditAdapter = new QuickExperimentEditAdapter(activity);
            getScrollingViewProxy().EPJ(quickExperimentEditAdapter);
            quickExperimentEditAdapter.setMenuItemList(QuickExperimentHelper.setupMenuItems(this, this.mSession, null, null, createList, quickExperimentEditAdapter, false, this.mShowSeeAllInUniverse));
        }
    }

    public static QuickExperimentEditFragment createForAllOverrides(final UserSession userSession) {
        return new QuickExperimentEditFragment("MetaConfig: Overrides", true, new ExperimentParameterListGenerator() { // from class: com.instagram.debug.quickexperiment.QuickExperimentEditFragment$$ExternalSyntheticLambda0
            @Override // com.instagram.debug.quickexperiment.QuickExperimentEditFragment.ExperimentParameterListGenerator
            public final List createList() {
                return QuickExperimentHelper.getOverriddenExperimentParameters(QuickExperimentDebugStoreManager.getOverrideStore(UserSession.this));
            }
        });
    }

    public static QuickExperimentEditFragment createWithExperimentCategory(final EnumC72396Xcj enumC72396Xcj) {
        return new QuickExperimentEditFragment(AnonymousClass001.A0R("MetaConfig: ", enumC72396Xcj.A01), true, new ExperimentParameterListGenerator() { // from class: com.instagram.debug.quickexperiment.QuickExperimentEditFragment$$ExternalSyntheticLambda1
            @Override // com.instagram.debug.quickexperiment.QuickExperimentEditFragment.ExperimentParameterListGenerator
            public final List createList() {
                return QuickExperimentEditFragment.lambda$createWithExperimentCategory$1(EnumC72396Xcj.this);
            }
        });
    }

    public static QuickExperimentEditFragment createWithUniverse(final String str) {
        return new QuickExperimentEditFragment("MetaConfig: Launcher", false, new ExperimentParameterListGenerator() { // from class: com.instagram.debug.quickexperiment.QuickExperimentEditFragment$$ExternalSyntheticLambda3
            @Override // com.instagram.debug.quickexperiment.QuickExperimentEditFragment.ExperimentParameterListGenerator
            public final List createList() {
                return QuickExperimentEditFragment.lambda$createWithUniverse$2(str);
            }
        });
    }

    public static /* synthetic */ List lambda$createWithExperimentCategory$1(EnumC72396Xcj enumC72396Xcj) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC20080yf abstractC20080yf : QuickExperimentHelper.getAllExperiments()) {
            if (QuickExperimentHelper.getCategory(abstractC20080yf) == enumC72396Xcj && !OverlayConfigHelper.isOverlayConfig(abstractC20080yf)) {
                arrayList.add(abstractC20080yf);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List lambda$createWithUniverse$2(String str) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC20080yf abstractC20080yf : QuickExperimentHelper.getAllExperiments()) {
            if (str.equals(abstractC20080yf.universeName) && !OverlayConfigHelper.isOverlayConfig(abstractC20080yf)) {
                arrayList.add(abstractC20080yf);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ int lambda$onViewCreated$3(AbstractC20080yf abstractC20080yf, AbstractC20080yf abstractC20080yf2) {
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

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.setTitle(this.mTitle);
        interfaceC56362iU.EkS(AbstractC167007dF.A1O(getParentFragmentManager().A0L()));
    }

    @Override // X.AbstractC59962oe
    public AbstractC18680vv getSession() {
        return this.mSession;
    }

    public QuickExperimentEditFragment(String str, boolean z, ExperimentParameterListGenerator experimentParameterListGenerator) {
        this.mTitle = str;
        this.mShowSeeAllInUniverse = z;
        this.mExperimentParameterListGenerator = experimentParameterListGenerator;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1234508333);
        super.onCreate(bundle);
        this.mSession = AbstractC31176DnK.A0S(this);
        C0f9.A09(1802868018, A02);
    }
}
