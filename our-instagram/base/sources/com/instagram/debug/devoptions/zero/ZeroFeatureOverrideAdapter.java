package com.instagram.debug.devoptions.zero;

import X.AbstractC25226BEj;
import X.AbstractC25230BEn;
import X.AbstractC31177DnL;
import X.C0f9;
import X.C14360o3;
import X.C2UU;
import X.C3OO;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.debug.devoptions.zero.ZeroFeatureOverrideFragment;

/* loaded from: classes11.dex */
public final class ZeroFeatureOverrideAdapter extends C2UU {
    public final ZeroFeatureOverrideFragment.EnabledFeaturesStore featuresStore;

    /* loaded from: classes11.dex */
    public final class FeatureItemViewHolder extends C3OO {
        public final TextView featureText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeatureItemViewHolder(View view) {
            super(view);
            C14360o3.A0B(view, 1);
            this.featureText = AbstractC25230BEn.A0Q(view, R.id.feature_text);
        }

        public final TextView getFeatureText() {
            return this.featureText;
        }
    }

    public ZeroFeatureOverrideAdapter(ZeroFeatureOverrideFragment.EnabledFeaturesStore enabledFeaturesStore) {
        C14360o3.A0B(enabledFeaturesStore, 1);
        this.featuresStore = enabledFeaturesStore;
    }

    @Override // X.C2UU
    public void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        ((FeatureItemViewHolder) c3oo).featureText.setText(this.featuresStore.get(i));
    }

    @Override // X.C2UU
    public C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0E = AbstractC31177DnL.A0E(viewGroup, 0);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new FeatureItemViewHolder(AbstractC25226BEj.A0R(A0E, viewGroup, R.layout.zero_feature_list_row, false));
    }

    @Override // X.C2UU
    public int getItemCount() {
        int A03 = C0f9.A03(1713880661);
        int size = this.featuresStore.features.size();
        C0f9.A0A(-94803003, A03);
        return size;
    }
}
