package com.instagram.debug.devoptions.zero;

import X.AbstractC001800i;
import X.AbstractC09440dt;
import X.AbstractC31175DnJ;
import X.AbstractC31180DnO;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.AbstractC65703TsZ;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C1AT;
import X.C1AV;
import X.C3OO;
import X.C8SB;
import X.InterfaceC09390do;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.UGO;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.debug.devoptions.zero.ZeroFeatureOverrideFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes11.dex */
public final class ZeroFeatureOverrideFragment extends AbstractC59962oe implements InterfaceC60122ou {
    public IgEditText featureText;
    public RecyclerView featuresList;
    public final InterfaceC09390do enabledFeaturesStore$delegate = AbstractC09440dt.A01(new ZeroFeatureOverrideFragment$enabledFeaturesStore$2(this));
    public final InterfaceC09390do featuresAdapter$delegate = AbstractC09440dt.A01(new ZeroFeatureOverrideFragment$featuresAdapter$2(this));
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);

    /* loaded from: classes11.dex */
    public final class EnabledFeaturesStore {
        public final List features;
        public final InterfaceC19630xq sharedPreferences;

        public EnabledFeaturesStore(UserSession userSession) {
            C14360o3.A0B(userSession, 1);
            ArrayList arrayList = new ArrayList();
            this.features = arrayList;
            InterfaceC19630xq A03 = C1AT.A01(userSession).A03(C1AV.A3f);
            this.sharedPreferences = A03;
            Set stringSet = A03.getStringSet("zero_overridden_features", null);
            arrayList.addAll(AbstractC001800i.A0X(stringSet == null ? new HashSet() : stringSet));
        }

        public final void add(String str) {
            C14360o3.A0B(str, 0);
            if (!this.features.contains(str)) {
                this.features.add(str);
                InterfaceC19610xo ARD = this.sharedPreferences.ARD();
                ARD.E7L("zero_overridden_features", new HashSet(this.features));
                ARD.apply();
            }
        }

        public final int count() {
            return this.features.size();
        }

        public final String get(int i) {
            return (String) this.features.get(i);
        }

        public final void remove(int i) {
            this.features.remove(i);
            InterfaceC19610xo ARD = this.sharedPreferences.ARD();
            ARD.E7L("zero_overridden_features", new HashSet(this.features));
            ARD.apply();
        }
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, "Override Enabled Features");
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "ZeroFeatureOverrideFragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        final InputMethodManager A0A = AbstractC65703TsZ.A0A(requireContext());
        RecyclerView A08 = AbstractC31180DnO.A08(view);
        this.featuresList = A08;
        if (A08 == null) {
            str = "featuresList";
        } else {
            A08.setAdapter(getFeaturesAdapter());
            IgEditText igEditText = (IgEditText) view.findViewById(R.id.new_feature_text);
            this.featureText = igEditText;
            if (igEditText == null) {
                str = "featureText";
            } else {
                igEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.instagram.debug.devoptions.zero.ZeroFeatureOverrideFragment$onViewCreated$1
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        ZeroFeatureOverrideFragment.EnabledFeaturesStore enabledFeaturesStore;
                        ZeroFeatureOverrideAdapter featuresAdapter;
                        ZeroFeatureOverrideFragment.EnabledFeaturesStore enabledFeaturesStore2;
                        if (i == 6) {
                            CharSequence text = textView.getText();
                            if (text != null && text.length() != 0) {
                                enabledFeaturesStore = ZeroFeatureOverrideFragment.this.getEnabledFeaturesStore();
                                enabledFeaturesStore.add(textView.getText().toString());
                                featuresAdapter = ZeroFeatureOverrideFragment.this.getFeaturesAdapter();
                                enabledFeaturesStore2 = ZeroFeatureOverrideFragment.this.getEnabledFeaturesStore();
                                featuresAdapter.notifyItemInserted(enabledFeaturesStore2.features.size());
                            }
                            InputMethodManager inputMethodManager = A0A;
                            IgEditText igEditText2 = ZeroFeatureOverrideFragment.this.featureText;
                            if (igEditText2 != null) {
                                inputMethodManager.hideSoftInputFromWindow(igEditText2.getWindowToken(), 0);
                                IgEditText igEditText3 = ZeroFeatureOverrideFragment.this.featureText;
                                if (igEditText3 != null) {
                                    igEditText3.clearFocus();
                                    IgEditText igEditText4 = ZeroFeatureOverrideFragment.this.featureText;
                                    if (igEditText4 != null) {
                                        igEditText4.getText().clear();
                                    }
                                }
                            }
                            C14360o3.A0F("featureText");
                            throw C00O.createAndThrow();
                        }
                        return true;
                    }
                });
                setupSwipeToDelete();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnabledFeaturesStore getEnabledFeaturesStore() {
        return (EnabledFeaturesStore) this.enabledFeaturesStore$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ZeroFeatureOverrideAdapter getFeaturesAdapter() {
        return (ZeroFeatureOverrideAdapter) this.featuresAdapter$delegate.getValue();
    }

    private final void setupSwipeToDelete() {
        UGO ugo = new UGO() { // from class: com.instagram.debug.devoptions.zero.ZeroFeatureOverrideFragment$setupSwipeToDelete$callback$1
            @Override // X.C8S8
            public boolean onMove(RecyclerView recyclerView, C3OO c3oo, C3OO c3oo2) {
                return false;
            }

            @Override // X.C8S8
            public void onSwiped(C3OO c3oo, int i) {
                ZeroFeatureOverrideFragment.EnabledFeaturesStore enabledFeaturesStore;
                ZeroFeatureOverrideAdapter featuresAdapter;
                C14360o3.A0B(c3oo, 0);
                int absoluteAdapterPosition = c3oo.getAbsoluteAdapterPosition();
                enabledFeaturesStore = ZeroFeatureOverrideFragment.this.getEnabledFeaturesStore();
                enabledFeaturesStore.remove(absoluteAdapterPosition);
                featuresAdapter = ZeroFeatureOverrideFragment.this.getFeaturesAdapter();
                featuresAdapter.notifyItemRemoved(absoluteAdapterPosition);
            }

            {
                super(0, 48);
            }
        };
        ugo.mDefaultDragDirs = 12;
        ugo.mDefaultSwipeDirs = 12;
        C8SB c8sb = new C8SB(ugo);
        RecyclerView recyclerView = this.featuresList;
        if (recyclerView == null) {
            C14360o3.A0F("featuresList");
            throw C00O.createAndThrow();
        }
        c8sb.A0A(recyclerView);
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return (UserSession) this.session$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(603496869);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_zero_feature_override, viewGroup, false);
        C0f9.A09(-1692699624, A02);
        return inflate;
    }
}
